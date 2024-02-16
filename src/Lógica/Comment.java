/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author jenniferbueso
 */
public final class Comment {
    protected int postId;
    private String autor, contenidoComentario;
    private Calendar fecha;
    
    public Comment(int postId, String autor, String contenidoComentario) {
        this.postId = postId;
        this.autor = autor;
        this.contenidoComentario = contenidoComentario;
        fecha = Calendar.getInstance();
    }
    
    public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YY");
        return autor + " - " + formato.format(fecha.getTime()) + "\n       " + contenidoComentario;
    }
}
