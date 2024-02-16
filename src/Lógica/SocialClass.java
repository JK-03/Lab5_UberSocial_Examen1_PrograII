/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;

import Lab5_UberSocial.Main_UberSocial;
import java.util.ArrayList;

/**
 *
 * @author jenniferbueso
 */
public abstract class SocialClass {
    protected ArrayList<String> friends, posts;
    protected String username;
    
    public SocialClass(String username) {
        this.username = username;
        friends = new ArrayList<>();
        posts = new ArrayList<>();
        posts.add("");
    }
    
    public boolean addFriend(String user) {
        if (!friends.contains(user) && !user.equals(this.username)) {
            friends.add(user);
            return true;
        }
        return false;
    }
    
    public void addPost(String msg) {
        posts.add( msg);
    }
    
    public abstract String timeline();
    
    public String myProfile() {
        StringBuilder profileInfo = new StringBuilder();
        profileInfo.append("          - - - - - - - - - - - - - - - - - - ♡ BIENVENIDO(A) ♡ - - - - - - - - - - - - - - - - - -\n ¡A tu perfil, @" + username + "!\n\nTIMELINE \n                                             ∘⋆⋅✯⋅⋆∘⋆⋅✯⋅⋆∘⋆⋅✯⋅⋆∘\n" + timeline() + "\nLista de Amigos: " + "\n");
        int numeroAmigos = Math.min(10, friends.size());
        for (int indice = 0; indice < numeroAmigos; indice++) {
            profileInfo.append((indice + 1) + ".- " + friends.get(indice) + "\n");
        }
        
        return profileInfo.toString();
    }

    public String getUsername() {
        return username;
    }
}
