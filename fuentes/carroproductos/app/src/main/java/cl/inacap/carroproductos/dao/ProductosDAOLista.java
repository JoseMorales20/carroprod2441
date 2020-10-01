package cl.inacap.carroproductos.dao;

import java.util.ArrayList;
import java.util.List;

import cl.inacap.carroproductos.dto.Producto;

public class ProductosDAOLista implements ProductosDAO{
    private List<Producto> productos = new ArrayList<>();
    //2.como atributro de la misma la calse debe existir una instacia
    private static ProductosDAOLista instancia;
    //implementar patro singleton
    //1.el constructor sea privado
    private ProductosDAOLista(){
        Producto p = new Producto();
        p.setNombre("Coca Cola Zero");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce a metus varius quam bibendum vehicula. Mauris luctus velit et sollicitudin faucibus. Sed elementum libero nec odio auctor gravida. Curabitur mattis arcu at odio venenatis tincidunt. Vestibulum felis purus, egestas vel sapien et, dignissim mattis ipsum");
        p.setPrecio(1000);
        p.setFoto("https://www.jumbo.cl/bebida-cocacola-zero-591-cc-botella-desechable/p");
        productos.add(p);
        p = new Producto();
        p.setNombre("Centella");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce a metus varius quam bibendum vehicula. Mauris luctus velit et sollicitudin faucibus. Sed elementum libero nec odio auctor gravida. Curabitur mattis arcu at odio venenatis tincidunt. Vestibulum felis purus, egestas vel sapien et, dignissim mattis ipsum. Mauris malesuada nisi mauris. Phasellus placerat, arcu a pharetra sollicitudin, velit enim scelerisque nulla, a ornare eros felis in lectus");
        p.setPrecio(600);
        p.setFoto("data:image/jpeg;base64,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");
        productos.add(p);
        p = new Producto();
        p.setNombre("Dulces sueños");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce a metus varius quam bibendum vehicula. Mauris luctus velit et sollicitudin faucibus. Sed elementum libero nec odio auctor gravida. Curabitur mattis arcu at odio venenatis tincidunt. Vestibulum felis purus, egestas vel sapien et, dignissim mattis ipsum. Mauris malesuada nisi mauris. Phasellus placerat, arcu a pharetra sollicitudin, velit enim scelerisque nulla, a ornare eros felis in lectus");
        p.setPrecio(1300);
        p.setFoto("https://www.google.com/url?sa=i&url=https%3A%2F%2Fsupermercadovirtual.cl%2Fproducto%2Fchocolate-trencito-nestle-150-gms%2F&psig=AOvVaw0dhwKnN4GdlUstqAUm35O8&ust=1601651822425000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLjk-_nXk-wCFQAAAAAdAAAAABAI");
        productos.add(p);

    }
    //3.metodo estatico que permita el acceso a la unica instancia

    public static ProductosDAOLista getInstance(){
        if(instancia == null){
            instancia = new ProductosDAOLista();
        }
        return instancia;
    }


    @Override
    public List<Producto> getAll() {
        return null;
    }

    @Override
    public Producto save(Producto p) {
        productos.add(p);
        return p;
    }
}
