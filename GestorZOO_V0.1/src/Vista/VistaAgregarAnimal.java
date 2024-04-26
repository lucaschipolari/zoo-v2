package Vista;

import Controlador.IControlador;
import Modelo.Sector;
import Modelo.TipoAlimentacion;
import java.util.ArrayList;
import Utilidades.VerificadorDouble;

public class VistaAgregarAnimal extends VistaBase implements IVistaAgregarAnimal {

    public VistaAgregarAnimal() {
        initComponents();
    }
    
    @Override
    public void asignarControlador(IControlador control) {
        btnAceptar.addActionListener(control);
        btnAceptar.setActionCommand(ACEPTAR);
        btnVolver.addActionListener(control);
        btnVolver.setActionCommand(VOLVER);
        radioCarnivoro.addActionListener(control);
        radioCarnivoro.setActionCommand(RADIO_CARNIVORO);
        radioHerbivoro.addActionListener(control);
        radioHerbivoro.setActionCommand(RADIO_HERBIVORO);
    }
    
    public void carnivoroSeleccionado(){
        this.txtBaseKg.setText("0.00");
        this.txtBaseKg.setEnabled(false);
        this.lblBaseKg.setEnabled(false);
        this.lblKgBase.setEnabled(false);
        this.lblPorPeso.setEnabled(true);
        this.lblPorcentaje.setEnabled(true);
        this.txtPorPeso.setEnabled(true);
    }
    
    public void herbivoroSeleccionado(){
        this.txtPorPeso.setText("100");
        this.txtPorPeso.setEnabled(false);
        this.lblPorPeso.setEnabled(false);
        this.lblPorcentaje.setEnabled(false);
        this.lblBaseKg.setEnabled(true);
        this.lblKgBase.setEnabled(true);
        this.txtBaseKg.setEnabled(true);
    }
    
    public void volverSeleccionado(){
        this.dispose();
    }
    
    public void cargarSectores(ArrayList<Sector> sectores){
        
        cmbSector.removeAllItems();
        
      //  boolean poblacionValida = false;
        
       for(Sector sector : sectores){/*
            if(sector.getPoblacion()>0){
                poblacionValida = true;
            } else if (sector.getTipoAlimentacion().CARNIVORO && radioCarnivoro.isSelected()){
                poblacionValida = true;
            } else if (sector.validarPoblacion().equals("Herbivoros") && radioHerbivoro.isSelected()){
                poblacionValida = true;
            }*/
             if(sector.hayEspacio()) {
                 cmbSector.addItem(sector.nombrarSector());
             }
             
          //   poblacionValida = false;
        }
    }
    
    public ArrayList<Object> aceptarSeleccionado() {
        String especie = txtEspecie.getText();
        String pais = txtPais.getText();
        String edad = spinnerEdad.getValue().toString();
        String peso = txtPeso.getText();
        
        String extra = "";
        TipoAlimentacion tipo = null;
        if(radioCarnivoro.isSelected()) {
            extra = txtPorPeso.getText();
            tipo = TipoAlimentacion.CARNIVORO;
        }
        if(radioHerbivoro.isSelected()){
            extra = txtBaseKg.getText();
            tipo = TipoAlimentacion.HERBIVORO;
        }
        System.out.println("aceptarSeleccionado()"+tipo);
        
        String sector = cmbSector.getSelectedItem().toString();
        ArrayList<Object> datos = new ArrayList<>();
        datos.add(especie);
        datos.add(pais);
        datos.add(edad);
        datos.add(peso);
        datos.add(extra);
        datos.add(tipo);
        datos.add(sector);
        
        return datos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGrupo = new javax.swing.ButtonGroup();
        radioHerbivoro = new javax.swing.JRadioButton();
        radioCarnivoro = new javax.swing.JRadioButton();
        lblEspecie = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        lblPais = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        spinnerEdad = new javax.swing.JSpinner();
        lblYears = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        lblBaseKg = new javax.swing.JLabel();
        txtBaseKg = new javax.swing.JTextField();
        lblKgBase = new javax.swing.JLabel();
        lblPorcentaje = new javax.swing.JLabel();
        txtPorPeso = new javax.swing.JTextField();
        lblPorPeso = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblPesoKg = new javax.swing.JLabel();
        cmbSector = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Animal");

        radioGrupo.add(radioHerbivoro);
        radioHerbivoro.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        radioHerbivoro.setSelected(true);
        radioHerbivoro.setText("Herbívoro");
        radioHerbivoro.setToolTipText("Nuevo animal herbívoro");
        radioHerbivoro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        radioHerbivoro.setPreferredSize(new java.awt.Dimension(150, 35));

        radioGrupo.add(radioCarnivoro);
        radioCarnivoro.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        radioCarnivoro.setText("Carnívoro");
        radioCarnivoro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        radioCarnivoro.setPreferredSize(new java.awt.Dimension(150, 35));

        lblEspecie.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblEspecie.setText("Especie");
        lblEspecie.setPreferredSize(new java.awt.Dimension(80, 35));

        txtEspecie.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        txtEspecie.setPreferredSize(new java.awt.Dimension(60, 35));

        lblPais.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblPais.setText("País");
        lblPais.setPreferredSize(new java.awt.Dimension(80, 35));

        txtPais.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        txtPais.setPreferredSize(new java.awt.Dimension(220, 35));

        spinnerEdad.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        spinnerEdad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spinnerEdad.setPreferredSize(new java.awt.Dimension(100, 35));

        lblYears.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblYears.setText("Años");
        lblYears.setPreferredSize(new java.awt.Dimension(50, 35));

        lblEdad.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblEdad.setText("Edad");
        lblEdad.setPreferredSize(new java.awt.Dimension(80, 35));

        lblPeso.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblPeso.setText("Peso");
        lblPeso.setPreferredSize(new java.awt.Dimension(80, 35));

        txtPeso.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        txtPeso.setText("0.00");
        txtPeso.setInputVerifier(new Utilidades.VerificadorDouble());
        txtPeso.setPreferredSize(new java.awt.Dimension(220, 35));

        lblBaseKg.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblBaseKg.setText("Base Alimentaria");
        lblBaseKg.setPreferredSize(new java.awt.Dimension(170, 35));

        txtBaseKg.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        txtBaseKg.setText("0.00");
        txtBaseKg.setToolTipText("");
        txtBaseKg.setInputVerifier(new VerificadorDouble());
        txtBaseKg.setPreferredSize(new java.awt.Dimension(100, 35));

        lblKgBase.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblKgBase.setText("Kg");
        lblKgBase.setPreferredSize(new java.awt.Dimension(35, 35));

        lblPorcentaje.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblPorcentaje.setText("%");
        lblPorcentaje.setEnabled(false);
        lblPorcentaje.setPreferredSize(new java.awt.Dimension(35, 35));

        txtPorPeso.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        txtPorPeso.setText("100");
        txtPorPeso.setEnabled(false);
        txtPorPeso.setInputVerifier(new VerificadorDouble());
        txtPorPeso.setPreferredSize(new java.awt.Dimension(100, 35));

        lblPorPeso.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblPorPeso.setText("Por Peso en Kg");
        lblPorPeso.setEnabled(false);
        lblPorPeso.setPreferredSize(new java.awt.Dimension(170, 35));

        btnAceptar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setPreferredSize(new java.awt.Dimension(100, 35));

        btnVolver.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnVolver.setText("Volver");

        lblPesoKg.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblPesoKg.setText("Kg");
        lblPesoKg.setPreferredSize(new java.awt.Dimension(35, 35));

        cmbSector.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        cmbSector.setPreferredSize(new java.awt.Dimension(220, 35));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Sector");
        jLabel1.setPreferredSize(new java.awt.Dimension(80, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtEspecie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(radioHerbivoro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(radioCarnivoro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtPeso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(spinnerEdad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblYears, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPesoKg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmbSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblBaseKg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPorPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtPorPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtBaseKg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblKgBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioHerbivoro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioCarnivoro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYears, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPesoKg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBaseKg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBaseKg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKgBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPorPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPorPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbSector;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBaseKg;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblKgBase;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPesoKg;
    private javax.swing.JLabel lblPorPeso;
    private javax.swing.JLabel lblPorcentaje;
    private javax.swing.JLabel lblYears;
    private javax.swing.JRadioButton radioCarnivoro;
    private javax.swing.ButtonGroup radioGrupo;
    private javax.swing.JRadioButton radioHerbivoro;
    private javax.swing.JSpinner spinnerEdad;
    private javax.swing.JTextField txtBaseKg;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPorPeso;
    // End of variables declaration//GEN-END:variables

}
