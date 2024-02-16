/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jenniferbueso
 */
public class UberSocial {
    private ArrayList<SocialClass> redesSociales;
    private boolean menuPrincipal = true;
    
    public UberSocial() {
        redesSociales = new ArrayList<>();
    }

    public boolean isMenuPrincipal() {
        return menuPrincipal;
    }
    
    private SocialClass buscar(String username) {
        return buscar(username, 0);
    }
    
    private SocialClass buscar(String username, int index) {
        if (index < redesSociales.size()) {
            SocialClass cuenta = redesSociales.get(index);
            if (cuenta.getUsername().equals(username)) {
                return cuenta;
            }
            return buscar(username, index + 1);
        }
        return null;
    }
    
    public void agregarCuenta(String username, String tipo) {
        SocialClass cuenta = buscar(username);
        if (cuenta == null) {
            switch (tipo) {
                case "FACEBOOK":
                    redesSociales.add(new Facebook(username));
                    JOptionPane.showMessageDialog(null, "¡Bienvenido(a) a Facebook, " + username + "!", "Cuenta Creada", JOptionPane.INFORMATION_MESSAGE);
                    menuPrincipal = true;
                    break;
                case "TWITTER":
                    redesSociales.add(new Twitter(username));
                    JOptionPane.showMessageDialog(null, "¡Bienvenido(a) a Twitter, " + username + "!", "Cuenta Creada", JOptionPane.INFORMATION_MESSAGE);
                    menuPrincipal = true;
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "La cuenta " + username + " ya existe.", "Cuenta Existente", JOptionPane.ERROR_MESSAGE);
            menuPrincipal = false;
        }
    }
    
    public void agregarPost(String user, String post) {
        SocialClass cuenta = buscar(user);
        if (cuenta != null) {
            cuenta.addPost(post);
            menuPrincipal = true;
            JOptionPane.showMessageDialog(null, "El post se ha publicado correctamente en la cuenta de " + user + ".", "Post Publicado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "La cuenta " + user + " no existe.", "Cuenta Inexistente", JOptionPane.ERROR_MESSAGE);
            menuPrincipal = false;
        }
    }
    
    public void agregarAmigo(String user1, String user2) {
        SocialClass cuenta1 = buscar(user1);
        SocialClass cuenta2 = buscar(user2);

        if (cuenta1 instanceof Facebook && cuenta2 instanceof Facebook) {
            ((Facebook) cuenta1).addFriend(user2);
            ((Facebook) cuenta2).addFriend(user1);
            JOptionPane.showMessageDialog(null, "Se ha agregado a " + user2 + " como amigo de " + user1 + ".", "Amigo Agregado", JOptionPane.INFORMATION_MESSAGE);
            menuPrincipal = true;
        } else if (cuenta1 instanceof Twitter && cuenta2 instanceof Twitter) {
            ((Twitter) cuenta1).addFriend(user2);
            ((Twitter) cuenta2).addFriend(user1);
            JOptionPane.showMessageDialog(null, "Se ha agregado a " + user2 + " como amigo de " + user1 + ".", "Amigo Agregado", JOptionPane.INFORMATION_MESSAGE);
            menuPrincipal = true;
        } else {
            JOptionPane.showMessageDialog(null, "No se puede agregar amigos. Ambas cuentas deben ser de la red social Facebook.", "Error al Agregar Amigo", JOptionPane.ERROR_MESSAGE);
            menuPrincipal = false;
        }
    }
    
    public void agregarComment(String user, int postID, String autor, String comment) {
        SocialClass cuenta = buscar(user);
        if (cuenta instanceof Facebook && (cuenta != null)) {
            
            if (postID < 0 || postID >= cuenta.posts.size()) {
                JOptionPane.showMessageDialog(null, "No existe un post con el ID. " + postID, "PostID No Encontrado", JOptionPane.ERROR_MESSAGE);
                menuPrincipal = false;
                return;
            }
            
            Comment comentarioObjeto = new Comment(postID, autor, comment);
            ((Facebook) cuenta).addComment(comentarioObjeto);
            JOptionPane.showMessageDialog(null, "Comentario agregado con éxito.", "Comentario Agregado", JOptionPane.INFORMATION_MESSAGE);
            menuPrincipal = true;
        } else {
            JOptionPane.showMessageDialog(null, "¡No se puede agregar comentario! La cuenta de usuario no existe o no es de la red social Facebook.", "Error al Agregar Comentario", JOptionPane.ERROR_MESSAGE);
            menuPrincipal = false;
        }
    }
    
    public String profileFrom(String user) {
        SocialClass cuenta = buscar(user);
        if (cuenta != null) {
            if (cuenta instanceof Facebook) {
                return ((Facebook) cuenta).myProfile();
            } else if (cuenta instanceof Twitter) {
                return ((Twitter) cuenta).myProfile();
            }
        } else {
            JOptionPane.showMessageDialog(null, "La cuenta " + user + " no existe.", "Cuenta Inexistente", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
