/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import model.PracticeObject;
import model.PracticeTypeObject;
import view.utils.Utils;

/**
 *
 * @author Julian Markowskyj <julian.markowskyj at gmail.com>
 */
public class frmPrincipal extends javax.swing.JFrame {
    private DefaultComboBoxModel modelTypesObject;
    private List <PracticeObject> listObjects;
    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        listObjects = new ArrayList<>();
        fillListPracticeObjects ();
        fillCboTypesObject();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstObjects = new javax.swing.JList<>();
        txtIdObject = new javax.swing.JTextField();
        txtDescriptionObject = new javax.swing.JTextField();
        cboTypesObject = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstObjects.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstObjects.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstObjectsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstObjects);

        cboTypesObject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Id del objecto seleccionado en la lista");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("descripción del objecto seleccionado en la lista");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("tipo del objeto seleccionado en la lista");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescriptionObject)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIdObject, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cboTypesObject, javax.swing.GroupLayout.Alignment.TRAILING, 0, 102, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdObject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescriptionObject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(cboTypesObject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstObjectsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstObjectsValueChanged
        if (lstObjects.getSelectedIndex() >= 0) {
            fillFieldFromJListPracticeObjects(lstObjects.getSelectedIndex());
        }
        
    }//GEN-LAST:event_lstObjectsValueChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }
    
    //metodo para llenar Jlist de object llamado desde el constructor
    private void fillListPracticeObjects () {
        listObjects = createListObjectPractice(); // metodo que remplaza a un dao.select()
        Utils.fillJList(listObjects, lstObjects); 
    }
    
    //metodo para llenar JComboBox de tipos de objectos llamado desde el constructor
    private void fillCboTypesObject () {
        modelTypesObject = new DefaultComboBoxModel();
        List <PracticeTypeObject> listTypesObject = createListObjectTypePractice();
        Utils.fillComboBox(modelTypesObject, listTypesObject, cboTypesObject);
        cboTypesObject.setSelectedIndex(-1); // seteo que sirve para que el comboBox no muestre ningun elemento cuando inicia la ventana
    }
    
    //metodo para cambiar valor de txtIdObject, txtDescriptionObject, valor de cboTypesObject en tiempo de ejecucion
    // sera llamado del metodo lstObjectValueChanged cada vez que señalemos un elemento diferente en lstObjects
    // por parametro cada vez que sea llamado recibira el indice de la posicion en el array del objeto señalado
    // este indice sera utilizado para setear valores en diferentes campos de la vista mencionados antes
    private void fillFieldFromJListPracticeObjects (int i) {
        //primero voy a declarar una variable de tipo int y le voy a dar el valor del id que tiene el objeto señalado en la lista 
        //en este momento. para eso voy a llamar al array de objectos, y voy a utilizar el metodo get y por parametro le voy a indicar
        //el parametro que recibe el metodo tomado de lstObjectValueChanged cuando este lo llamo
        int idObject = listObjects.get(i).getId();
        //hare lo mismo con una variable String para tomar su descripcion
        String descriptionObject = listObjects.get(i).getDescription();
        //tomare tambien el idType en una variable de tipo int
        int idType = listObjects.get(i).getIdType();
        
        //Ahora procedo a setear los campos mencionados, para ello llamare al objeto y su metodo set
        //cabe aclarar que los textBox (txtIdObject y txtDescriptionObject SOLO reciben variables de tipo String)
        // por lo tanto hare una convercion de datos de int (idObject) a String utilizando el casteo de String valueOf
        txtIdObject.setText(String.valueOf(idObject));
        //para la descripcion no es necesario castear ya que es string
        txtDescriptionObject.setText(descriptionObject);
        // para setear el combo llamare al metodo setTypeObjectInCboTypesFromJListPracticeObjects declarado mas abajo
        setTypeObjectInCboTypesFromJListPracticeObjects(idType);
        
    }
    
    //metodo que recibe por parametro un int idType para posicionar el comboBox cboTypesObject en el tipo de objeto que corresponda a lo
    //señalado en Jlist listObjects es llamado en el metodo fillFieldFromJListPracticeObjects
    private void setTypeObjectInCboTypesFromJListPracticeObjects (int idType){
        // primero declaro un for para recorrer todos los elementos que se encuentren cargados en el cboTypesObject, por eso la cantidad de 
        //ciclos a recorrer depende de la cantiadad de item que tenga el comboBox
        for (int i = 0; i < cboTypesObject.getItemCount(); i++) {
            // dentro de cada ciclo declaro una variable del objeto type y lo instancio con el valor que este señando el indice del ciclo
            PracticeTypeObject typeObject = (PracticeTypeObject) modelTypesObject.getElementAt(i);
            // si el id del objeto instanciado en este ciclo es igual al id que recibe por parametro el metodo desde el llenado de campos 
            if (typeObject.getId() == idType){
                // posiciono el comboBox en ese elemento
                cboTypesObject.setSelectedIndex(i);
                // y retorno de forma tal que el bucle se finalice cuando encuentre el elemento igual, y no cuando terminen todos los ciclos
                return;
            }
        }
    }
    
    /**
     * Metodos creados para simplificar el modelo de datos.
     * Equivalente a un dao.select()
     * Seran tomados como tal funcionalidad
     * @return 
     */
    //metodo creado para devolver una lista de objetos de practica llamado desde fillListPracticeObjects
    private List<PracticeObject> createListObjectPractice (){
        
        List <PracticeObject> listObject;
        listObject = new ArrayList<>();
        
        PracticeObject object1 = new PracticeObject(1234, "objecto 1", 1);
        PracticeObject object2 = new PracticeObject(5678, "objecto 2", 2);
        PracticeObject object3 = new PracticeObject(9101, "objecto 3", 3);
        
        listObject.add(object1);
        listObject.add(object2);
        listObject.add(object3);
        
        return listObject;
    }
    
    //Metodo creado para devolver una lista de tipos de objeto llamado desde fillCboTypesObject
    private List<PracticeTypeObject> createListObjectTypePractice (){
        
        List <PracticeTypeObject> listObject;
        listObject = new ArrayList<>();
        
        PracticeTypeObject object1 = new PracticeTypeObject(1, "tipo 1");
        PracticeTypeObject object2 = new PracticeTypeObject(2, "tipo 2");
        PracticeTypeObject object3 = new PracticeTypeObject(3, "tipo 3");
        
        listObject.add(object1);
        listObject.add(object2);
        listObject.add(object3);
        
        return listObject;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboTypesObject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstObjects;
    private javax.swing.JTextField txtDescriptionObject;
    private javax.swing.JTextField txtIdObject;
    // End of variables declaration//GEN-END:variables
}
