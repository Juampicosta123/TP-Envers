package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example-unit");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            entityManager.getTransaction().begin();
            /* Categoria categoriaElectronica = Categoria.builder().denominacion("Electrodomésticos").build();
            Categoria categoriaMuebles = Categoria.builder().denominacion("Muebles").build();
            Categoria categoriaHogar = Categoria.builder().denominacion("Hogar").build();
            Categoria categoriaJuguetes = Categoria.builder().denominacion("Juguetes").build();

            Articulo articulo1 = Articulo.builder().denominacion("Lavarropas").cantidad(5).precio(120000).build();
            Articulo articulo2 = Articulo.builder().denominacion("Sillón").cantidad(10).precio(50000).build();
            Articulo articulo3 = Articulo.builder().denominacion("Lámpara de pie").cantidad(15).precio(15000).build();
            Articulo articulo4 = Articulo.builder().denominacion("Mesa de comedor").cantidad(8).precio(60000).build();
            Articulo articulo5 = Articulo.builder().denominacion("Auto de juguete").cantidad(25).precio(2000).build();

            articulo1.getCategorias().add(categoriaElectronica);
            articulo2.getCategorias().add(categoriaMuebles);
            articulo3.getCategorias().add(categoriaHogar);
            articulo4.getCategorias().add(categoriaMuebles);
            articulo5.getCategorias().add(categoriaJuguetes);
            articulo5.getCategorias().add(categoriaHogar);

            categoriaElectronica.getArticulos().add(articulo1);
            categoriaMuebles.getArticulos().add(articulo2);
            categoriaMuebles.getArticulos().add(articulo4);
            categoriaHogar.getArticulos().add(articulo3);
            categoriaHogar.getArticulos().add(articulo5);
            categoriaJuguetes.getArticulos().add(articulo5);

            DetalleFactura detalle1 = DetalleFactura.builder().cantidad(1).subtotal(120000).articulo(articulo1).build();
            DetalleFactura detalle2 = DetalleFactura.builder().cantidad(2).subtotal(100000).articulo(articulo2).build();
            DetalleFactura detalle3 = DetalleFactura.builder().cantidad(3).subtotal(45000).articulo(articulo3).build();
            DetalleFactura detalle4 = DetalleFactura.builder().cantidad(1).subtotal(60000).articulo(articulo4).build();

            Domicilio domicilio1 = Domicilio.builder().nombreCalle("San Martín").numero(1234).build();
            Cliente cliente1 = Cliente.builder().nombre("Carlos").apellido("Pérez").dni(40231547).domicilio(domicilio1).build();

            Factura factura1 = Factura.builder().numero(45).fecha("04/09/2024").cliente(cliente1).build();
            factura1.getDetallesFacturas().add(detalle1);
            factura1.getDetallesFacturas().add(detalle2);
            factura1.getDetallesFacturas().add(detalle3);
            factura1.getDetallesFacturas().add(detalle4);

            factura1.setTotal(detalle1.getSubtotal() + detalle2.getSubtotal() + detalle3.getSubtotal() + detalle4.getSubtotal());

            entityManager.persist(factura1); */
            Factura factura1 = entityManager.find(Factura.class, 1L);
            // factura1.setNumero(19);

            entityManager.remove(factura1);
            entityManager.flush();
            entityManager.getTransaction().commit();
        }catch (Exception e){
            entityManager.getTransaction().rollback();
            System.out.println("Error: "+ e.getMessage());
            System.out.println("Hubo un error guardando las clases");}
            entityManager.close();
            entityManagerFactory.close();
    }
}
