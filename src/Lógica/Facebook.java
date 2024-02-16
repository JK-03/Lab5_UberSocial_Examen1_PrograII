/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;

import java.util.ArrayList;

/**
 *
 * @author jenniferbueso
 */
public class Facebook extends SocialClass implements Commentable{
    private ArrayList<Comment> comentarios;
    
    public Facebook(String username) {
        super(username);
        comentarios = new ArrayList<>();
    }
    
    @Override
    public boolean addComment(Comment comment) {
        int postId = comment.postId;
        if (postId >= 0 && postId < posts.size()) {
            comentarios.add(comment);
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String timeline() {
        StringBuilder timelineInfo = new StringBuilder();
        for (int indice = 1; indice < posts.size(); indice++) {
        timelineInfo.append("\nPOST " + indice + "\n").append(posts.get(indice) + "\n");
            for (int indice2 = 0; indice2 < comentarios.size(); indice2++) {
                Comment comment = comentarios.get(indice2);
                if (comment.postId == indice) {
                    timelineInfo.append("  " + (indice2 + 1) + ". " + comment.toString() + "\n");
                }
            }
        }
        return timelineInfo.toString();
    }
}
