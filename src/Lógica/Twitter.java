/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;

/**
 *
 * @author jenniferbueso
 */
public class Twitter extends SocialClass {
    
    public Twitter(String username) {
        super(username);
    }

    @Override
    public String timeline() {
        StringBuilder timelineInfo = new StringBuilder();
        for (int indice = 1; indice < posts.size(); indice++) {
            timelineInfo.append("POST " + indice + "\n" + posts.get(indice) + "\n\n");
        }
        return timelineInfo.toString();
    }
}
