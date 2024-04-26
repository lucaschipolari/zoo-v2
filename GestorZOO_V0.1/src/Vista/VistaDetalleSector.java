package Vista;

import Controlador.IControlador;
import Modelo.Animal;
import Modelo.Carnivoro;
import Modelo.Herbivoro;
import Modelo.Sector;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VistaDetalleSector extends VistaBase implements IVistaDetalleSector {

    public VistaDetalleSector() {
        initComponents();
    }

    @Override
    public void asignarControlador(IControlador control) {
        btnVolver.addActionListener(control);
        btnVolver.setActionCommand(VOLVER);
    }
/*
    public void cargarSector(Sector detallaSector) {
        lblidSector.setText(Integer.toString(detallaSector.getNumeroId()));
        lblLatitud.setText(Double.toString(detallaSector.getLatitud()));
        lblLongitud.setText(Double.toString(detallaSector.getLongitud()));
        lblEncargadoNombre.setText(detallaSector.nombrarEncargado());
        if(detallaSector.getEncargado() != null){
                lblNroDni.setText(Integer.toString(detallaSector.getEncargado().getDni()));
                lblDomicilioCalle.setText(detallaSector.getEncargado().getDomicilio());
        }
        lblTipoPoblacion.setText(detallaSector.validarPoblacion());
        
        switch(lblTipoPoblacion.getText()){
            case "Vacio":
                    this.getContentPane().setBackground(new Color(220,220,220));
                break;
            case "Carnivoros":
                    this.getContentPane().setBackground(new Color(250,225,155));
                break;
            case "Herbivoros":
                    this.getContentPane().setBackground(new Color(180,215,165));
                break;
        }
        
        String actualYMaximo = Integer.toString(detallaSector.getPoblacion().size())
                               + " de "
                               + Integer.toString(detallaSector.getCantMax());
        lblEspMax.setText(actualYMaximo);
        cargarTablaAnimales(detallaSector.getPoblacion());
    }
*/
    /*public void cargarTablaAnimales(ArrayList<Animal> animales) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("País Origen");
        modelo.addColumn("Especie");
        modelo.addColumn("Edad (Años)");
        modelo.addColumn("Peso (Kg)");
        
        switch(lblTipoPoblacion.getText()){
            case "Vacio":
                break;
            case "Carnivoros":
                    modelo.addColumn("% por Peso");
                break;
            case "Herbivoros":
                    modelo.addColumn("Base Alim. (Kg)");
                break;
        }

        for (Animal animal : animales) {
            double extra = 0;
            if(animal instanceof Herbivoro) extra = ((Herbivoro) animal).getBaseAlimento();
            else if(animal instanceof Carnivoro) extra = ((Carnivoro) animal).getPorcentualAlimento() * 100;
                    
            Object[] rowData = {
                animal.getIdAnimal(),
                animal.getPaisOrigen().getNombrePais(),
                animal.getEspecieEjemplar().getDenominacion(),
                animal.getEdad(),
                animal.getPeso(),
                extra
            };
            modelo.addRow(rowData);
        }

        tablaAnimales.setModel(modelo);

        // Set table font
        Font font = new Font("Segoe UI", Font.BOLD | Font.ITALIC, 18);
        tablaAnimales.getTableHeader().setFont(font);
        tablaAnimales.setFont(font);
        tablaAnimales.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        this.pack();
    }
*/
    
    public void volverSeleccionado() {
        this.dispose();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSector = new javax.swing.JLabel();
        lblidSector = new javax.swing.JLabel();
        lblLat = new javax.swing.JLabel();
        lblLatitud = new javax.swing.JLabel();
        lblLong = new javax.swing.JLabel();
        lblLongitud = new javax.swing.JLabel();
        lblPoblacion = new javax.swing.JLabel();
        lblTipoPoblacion = new javax.swing.JLabel();
        lblEspecimenes = new javax.swing.JLabel();
        lblEspMax = new javax.swing.JLabel();
        lblEncargado = new javax.swing.JLabel();
        lblEncargadoNombre = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblNroDni = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAnimales = new javax.swing.JTable();
        lblDomicilio = new javax.swing.JLabel();
        lblDomicilioCalle = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detalle de Sector");
        setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N

        lblSector.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblSector.setText("Sector n°");
        lblSector.setPreferredSize(new java.awt.Dimension(80, 35));

        lblidSector.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblidSector.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblidSector.setText("XXXXX");
        lblidSector.setPreferredSize(new java.awt.Dimension(100, 35));

        lblLat.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblLat.setText("Latitud");
        lblLat.setPreferredSize(new java.awt.Dimension(120, 35));

        lblLatitud.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblLatitud.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLatitud.setText("XXXXXXXX");
        lblLatitud.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblLatitud.setPreferredSize(new java.awt.Dimension(200, 35));
        lblLatitud.setRequestFocusEnabled(false);

        lblLong.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblLong.setText("Longitud");
        lblLong.setPreferredSize(new java.awt.Dimension(120, 35));

        lblLongitud.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblLongitud.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLongitud.setText("XXXXXXXX");
        lblLongitud.setPreferredSize(new java.awt.Dimension(200, 35));

        lblPoblacion.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblPoblacion.setText("Población");
        lblPoblacion.setPreferredSize(new java.awt.Dimension(120, 35));

        lblTipoPoblacion.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTipoPoblacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoPoblacion.setText("XXXXXXXX");
        lblTipoPoblacion.setPreferredSize(new java.awt.Dimension(200, 35));

        lblEspecimenes.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblEspecimenes.setText("Espécimenes");
        lblEspecimenes.setMinimumSize(new java.awt.Dimension(120, 35));

        lblEspMax.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblEspMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEspMax.setText("XXXXX/XXXXX");
        lblEspMax.setPreferredSize(new java.awt.Dimension(200, 35));
        lblEspMax.setRequestFocusEnabled(false);

        lblEncargado.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblEncargado.setText("Encargado");
        lblEncargado.setPreferredSize(new java.awt.Dimension(120, 35));

        lblEncargadoNombre.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblEncargadoNombre.setText("Lohezic del Arollo, Esteban Ignacio Manuel");
        lblEncargadoNombre.setMinimumSize(new java.awt.Dimension(200, 25));
        lblEncargadoNombre.setPreferredSize(new java.awt.Dimension(600, 35));

        lblDni.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblDni.setText("DNI");
        lblDni.setPreferredSize(new java.awt.Dimension(120, 35));

        lblNroDni.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblNroDni.setText("41376419");
        lblNroDni.setPreferredSize(new java.awt.Dimension(200, 35));

        tablaAnimales.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tablaAnimales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaAnimales);

        lblDomicilio.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblDomicilio.setText("Domicilio");
        lblDomicilio.setPreferredSize(new java.awt.Dimension(120, 35));

        lblDomicilioCalle.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblDomicilioCalle.setText("Pedro de Villalba 360, Piso 4, Ap. 6");
        lblDomicilioCalle.setPreferredSize(new java.awt.Dimension(600, 35));

        btnVolver.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setPreferredSize(new java.awt.Dimension(100, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblNroDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblidSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblLatitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblLong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblTipoPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblEspecimenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblEspMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblEncargadoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblDomicilioCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblidSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLatitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblLong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblLat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEncargadoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNroDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDomicilioCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEspecimenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEspMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblDomicilioCalle;
    private javax.swing.JLabel lblEncargado;
    private javax.swing.JLabel lblEncargadoNombre;
    private javax.swing.JLabel lblEspMax;
    private javax.swing.JLabel lblEspecimenes;
    private javax.swing.JLabel lblLat;
    private javax.swing.JLabel lblLatitud;
    private javax.swing.JLabel lblLong;
    private javax.swing.JLabel lblLongitud;
    private javax.swing.JLabel lblNroDni;
    private javax.swing.JLabel lblPoblacion;
    private javax.swing.JLabel lblSector;
    private javax.swing.JLabel lblTipoPoblacion;
    private javax.swing.JLabel lblidSector;
    private javax.swing.JTable tablaAnimales;
    // End of variables declaration//GEN-END:variables
}
