const res = require('express/lib/response');
const { pool } = require('../controllers/index.controller');

const getProducts = async(req, res) =>{
    const response = await pool.query('SELECT * from products')
    res.json(response.rows);
}
const getProductByCode = async (req, res) =>{
    const response = await pool.query('SELECT * FROM "products" WHERE codigo = $1', [req.params.code]);
    console.log(response.rows)
    if (response.rowCount === 0) {
        res.json({message: "no se encontraron usuarios con ese código"})
    }else {
        res.json(response.rows[0]);
    }
}
const createProduct = async (req, res) =>{
    const {nombre, codigo, cantidad, precio} = req.body;

    const response = await pool.query('INSERT INTO products (nombre, codigo, cantidad, precio) VALUES ($1,$2,$3,$4)',
     [nombre, codigo, cantidad, precio])
    console.log(response);
    res.send('Producto Creado')
}
module.exports = {
    getProducts,
    getProductByCode,
    createProduct
}