package PACKAGE_NAME;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class CarritoComprasTest {
    CarritoCompras carrito = new CarritoCompras();
    Producto p1 = new Producto("Celular Huawei p10",31000,"Android 10.0, 3gb RAM, 64gb Memoria");
    Producto p2 = new Producto("Mouse HyperX PulseFire Surge", "Mouse gamer con luces RGB", 2300, 5,3);

    @Test
    public void test_minimo_un_producto_asociado(){

        boolean res_obtenido = CarritoCompras.obtenercantidadProductos(carrito);
        boolean res_esperado = true;
        Assert.assertEquals(res_esperado,res_obtenido);
    }

    @Test
    public void test_obtener_descripcion_producto(){
        String res_obtenido = p1.obtenerdetalle(p1);
        String res_esperado = "Celular Huawei p10 31000.0 Android 10.0, 3gb RAM, 64gb Memoria";
        Assert.assertEquals(res_esperado,res_obtenido);
    }

    @Test
    public void testCantidadStock(){
        boolean resultado = CarritoCompras.cantidad_no_mayor_stock(p1);
        boolean esperado = true;
        assertEquals(esperado,resultado);
    }

    @Test
    public void testNombreDescripcion(){
        boolean resultado = CarritoCompras.nombre_y_descripcion(p1);
        boolean esperado = true;
        assertEquals(esperado,resultado);
    }

}