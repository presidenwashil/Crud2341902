/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud2341902;

/**
 *
 * @author IT1010
 */
public class Main {
    public static void main(String[] args) {
        try {
            FormSiswa form = new FormSiswa();
            form.setVisible(true);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
