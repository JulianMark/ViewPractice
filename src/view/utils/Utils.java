/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.utils;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;

/**
 *
 * @author Nana
 */
public class Utils {
    
    public Utils() {
    }
    
    public static void fillComboBox(DefaultComboBoxModel model,List list, JComboBox jCombo) {
        list.forEach((object) -> { model.addElement(object); });
        jCombo.setModel(model);
    }
    
    public static void fillJList (List list, JList jList) {
        DefaultListModel model = new DefaultListModel();        
        list.stream().filter((object) -> (object != null)).forEachOrdered((object) -> { model.addElement(object); });
        jList.setModel(model);   
    }
    
}
