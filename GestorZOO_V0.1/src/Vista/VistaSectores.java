package Vista;

import Controlador.IControlador;
import Modelo.Sector;
import Modelo.TipoAlimentacion;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class VistaSectores extends VistaBase implements IVistaSectores {

    public VistaSectores() {
        initComponents();
    }
    
    @Override
    public void asignarControlador(IControlador control){
        btnAgregarAnimal.addActionListener(control);
        btnAgregarAnimal.setActionCommand(AGREGAR_ANIMAL);
        btnCalcularComida.addActionListener(control);
        btnCalcularComida.setActionCommand(CALCULAR_ALIMENTO);
    }
    
    public void representarSectores(ArrayList<Sector> sectores, IControlador control){
        panelSectores.removeAll();
        panelSectores.setLayout(new BoxLayout(panelSectores,BoxLayout.PAGE_AXIS));
        //panelSectores.setLayout(new GridLayout(sectores.size()/2, sectores.size()/2));
        
        for(Sector sector : sectores){
            JPanel dibujoSector = new JPanel(new GridLayout(5,1));
            
            Font fuenteEtiquetas = lblTotalGeneral.getFont();
            
            JLabel sectorId = new JLabel(Integer.toString(sector.getNumeroId()));
            JLabel especies = new JLabel(sector.nombrarAnimales());
            JLabel cantPoblacion = new JLabel(Integer.toString(sector.getPoblacion().size()));
            JLabel coordenadas = new JLabel(sector.nombrarCoordenadas());
            JLabel nombreEncargado = new JLabel(sector.nombrarEncargado());
            
            sectorId.setHorizontalAlignment(SwingConstants.CENTER);
            especies.setHorizontalAlignment(SwingConstants.CENTER);
            cantPoblacion.setHorizontalAlignment(SwingConstants.CENTER);
            coordenadas.setHorizontalAlignment(SwingConstants.CENTER);
            nombreEncargado.setHorizontalAlignment(SwingConstants.CENTER);
            
            sectorId.setFont(fuenteEtiquetas);
            especies.setFont(fuenteEtiquetas);
            cantPoblacion.setFont(fuenteEtiquetas);
            coordenadas.setFont(fuenteEtiquetas);
            nombreEncargado.setFont(fuenteEtiquetas);
            
            dibujoSector.add(sectorId);
            dibujoSector.add(especies);
            dibujoSector.add(cantPoblacion);
            dibujoSector.add(coordenadas);
            dibujoSector.add(nombreEncargado);
            
            Border line = BorderFactory.createLineBorder(Color.BLACK);
            Border margin = BorderFactory.createEmptyBorder(10, 10, 10, 10);
            Border compound = BorderFactory.createCompoundBorder(line, margin);
            dibujoSector.setBorder(compound);
            
            Color colorPanel = new Color (0,0,0);
            TipoAlimentacion tipo = sector.getTipoAlimentacion();
            switch(tipo){
                case CARNIVORO:
                    colorPanel = new Color(250,225,155);
                    
                    //#DCDCDC
                    break;
                case HERBIVORO:
                    colorPanel = new Color(180,215,165);
                    //#FFE196
                    break;
                default:
                    colorPanel = new Color(220,220,220);
                    //#B4D7A5
                    break;
            }
            dibujoSector.setBackground(colorPanel);
            
            dibujoSector.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    ActionEvent evento = new ActionEvent(this,
                                                         ActionEvent.ACTION_PERFORMED,
                                                         DETALLAR_SECTOR.concat(
                                                                Integer.toString(sector.getNumeroId())
                                                         ));
                    control.actionPerformed(evento);
                }
            });
            
            panelSectores.add(dibujoSector);
        }
            panelSectores.revalidate();
            panelSectores.repaint();
            this.pack();
    }
    
    public void representarAlimento(ArrayList<Sector> sectores){
        double totalCarnivoros = 0;
        double totalHerbivoros = 0;
        
        for(Sector sector : sectores){
            switch(sector.getTipoAlimentacion()){
                case CARNIVORO:
                    totalCarnivoros += sector.calcularAlimentoSector();
                    break;
                case HERBIVORO:
                    totalHerbivoros += sector.calcularAlimentoSector();
                    break;
            }
        }
        double totalGeneral = totalCarnivoros + totalHerbivoros;
        
        lblTotalCarnivoros.setText(Double.toString(totalCarnivoros));
        lblTotalHerviboros.setText(Double.toString(totalHerbivoros));
        lblTotalGeneral.setText(Double.toString(totalGeneral));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelControl = new javax.swing.JPanel();
        btnAgregarAnimal = new javax.swing.JButton();
        btnCalcularComida = new javax.swing.JButton();
        lblCarnivoros = new javax.swing.JLabel();
        lblTotalCarnivoros = new javax.swing.JLabel();
        lblHerviboros = new javax.swing.JLabel();
        lblTotalHerviboros = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTotalGeneral = new javax.swing.JLabel();
        panelSectores = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("El Zoológico");

        panelControl.setBackground(new java.awt.Color(255, 255, 255));
        panelControl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelControl.setToolTipText("");

        btnAgregarAnimal.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnAgregarAnimal.setText("Agregar animal");
        btnAgregarAnimal.setToolTipText("Agregar un nuevo espécimen");
        btnAgregarAnimal.setPreferredSize(new java.awt.Dimension(180, 35));

        btnCalcularComida.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnCalcularComida.setText("Calcular Comida");
        btnCalcularComida.setToolTipText("Calcular alimento diario en Kg por animal y sector");
        btnCalcularComida.setPreferredSize(new java.awt.Dimension(180, 35));

        lblCarnivoros.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblCarnivoros.setForeground(new java.awt.Color(255, 34, 34));
        lblCarnivoros.setText("Kgs Carnívoros");
        lblCarnivoros.setToolTipText("Kgs diarios totales para la población carnívora.");
        lblCarnivoros.setPreferredSize(new java.awt.Dimension(130, 35));

        lblTotalCarnivoros.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTotalCarnivoros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalCarnivoros.setText("0");
        lblTotalCarnivoros.setToolTipText("");
        lblTotalCarnivoros.setPreferredSize(new java.awt.Dimension(100, 35));

        lblHerviboros.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblHerviboros.setForeground(new java.awt.Color(0, 178, 0));
        lblHerviboros.setText("Kgs Hervíboros");
        lblHerviboros.setToolTipText("Kgs diarios totales para la población hervíbora.");
        lblHerviboros.setPreferredSize(new java.awt.Dimension(130, 35));

        lblTotalHerviboros.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTotalHerviboros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalHerviboros.setText("0");
        lblTotalHerviboros.setPreferredSize(new java.awt.Dimension(100, 35));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kgs Totales");
        jLabel1.setToolTipText("Kgs diarios totales para alimentar la población.");
        jLabel1.setPreferredSize(new java.awt.Dimension(130, 35));

        lblTotalGeneral.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTotalGeneral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalGeneral.setText("0");
        lblTotalGeneral.setPreferredSize(new java.awt.Dimension(100, 35));

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelControlLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCalcularComida, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(btnAgregarAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelControlLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHerviboros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCarnivoros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelControlLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTotalCarnivoros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTotalHerviboros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelControlLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblTotalGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnAgregarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCalcularComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblCarnivoros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalCarnivoros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHerviboros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalHerviboros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelSectoresLayout = new javax.swing.GroupLayout(panelSectores);
        panelSectores.setLayout(panelSectoresLayout);
        panelSectoresLayout.setHorizontalGroup(
            panelSectoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );
        panelSectoresLayout.setVerticalGroup(
            panelSectoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSectores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSectores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 195, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAnimal;
    private javax.swing.JButton btnCalcularComida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCarnivoros;
    private javax.swing.JLabel lblHerviboros;
    private javax.swing.JLabel lblTotalCarnivoros;
    private javax.swing.JLabel lblTotalGeneral;
    private javax.swing.JLabel lblTotalHerviboros;
    private javax.swing.JPanel panelControl;
    private javax.swing.JPanel panelSectores;
    // End of variables declaration//GEN-END:variables
}
