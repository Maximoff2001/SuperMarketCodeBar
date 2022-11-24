const { Router } = require('express');
const router = Router();

const {getProducts, getProductByCode, createProduct} = require('../controllers/product.controller')

router.get('/products', getProducts )
router.get('/products/:code', getProductByCode)
router.post('/products', createProduct)

module.exports = router;