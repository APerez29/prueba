/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.pizzeria.pedido;

import core.person.Cliente;
import core.pizzeria.item.Item;
import java.util.ArrayList;

/**
 *
 * @author ALVARO PEREZ
 */
public abstract class Pedido {
    protected Cliente cliente;
    protected ArrayList<Item> items;

    public Pedido(Cliente cliente, ArrayList<Item> items) {
        this.cliente = cliente;
        this.items = items;
        
        this.cliente.addPedido(this);
    }

    public ArrayList<Item> getItems() {
        return items;
    }
    
    
}
