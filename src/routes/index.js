const { Router } = require('express');
const router = Router();

const {getProducts, getProductByCode} = require('../controllers/product.controller')

router.get('/products', getProducts )
router.get('/products/:code', getProductByCode)

module.exports = router;