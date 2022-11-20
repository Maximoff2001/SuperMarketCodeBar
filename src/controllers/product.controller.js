const { pool } = require('../controllers/index.controller');

const getProducts = async(req, res) =>{
    const response = await pool.query('SELECT * from products')
    res.json(response.rows);
}
getProductByCode = async (req, res) =>{
    const response = await pool.query('SELECT * FROM "products" WHERE codigo = $1', [req.params.code]);
    console.log(response.rows)
    if (response.rowCount === 0) {
        res.json({message: "no se encontraron usuarios con ese código"})
    }else {
        res.json(response.rows[0]);
    }
}

module.exports = {
    getProducts,
    getProductByCode
}