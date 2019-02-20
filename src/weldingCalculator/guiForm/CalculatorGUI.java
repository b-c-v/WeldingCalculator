package weldingCalculator.guiForm;


import weldingCalculator.calculation.FlatArea;
import weldingCalculator.calculation.Mass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CalculatorGUI extends JFrame {
    private JPanel parameters;
    private JPanel lengthPipe;
    private JPanel lengthPlate;
    private JPanel lengthRectangularPipe;
    private JPanel mainPanel;
    private JButton calculate;
    private JButton goTosite;
    private JButton exit;
    private JComboBox<String> materialType;
    private JComboBox<String> weldingPosition;
    private JComboBox<String> weldProcedure;
    private JTextField result;
    private JTextField standardWeldingJoint;
    private JTabbedPane teeJoints;
    private JTabbedPane typesWeldingJoint;
    private JTabbedPane buttJoints;
    private JTabbedPane cornerJoints;
    private JTabbedPane lapJoints;
    private JTabbedPane length;
    private JSpinner lengthDiameter;
    private JSpinner lengthRectangularA;
    private JSpinner lengthRectangularB;
    private JSpinner sizeAlpha;
    private JSpinner sizeB;
    private JSpinner sizeBeta;
    private JSpinner sizeC;
    private JSpinner sizeE;
    private JSpinner sizeE1;
    private JSpinner sizeG;
    private JSpinner sizeG1;
    private JSpinner sizeH;
    private JSpinner sizeK;
    private JSpinner sizeK1;
    private JSpinner sizeLengthPlate;
    private JSpinner sizeR;
    private JSpinner sizeS;
    private JLabel GOST5264_C1;
    private JLabel GOST5264_C10;
    private JLabel GOST5264_C11;
    private JLabel GOST5264_C12;
    private JLabel GOST5264_C13;
    private JLabel GOST5264_C14;
    private JLabel GOST5264_C15;
    private JLabel GOST5264_C16;
    private JLabel GOST5264_C17;
    private JLabel GOST5264_C18;
    private JLabel GOST5264_C19;
    private JLabel GOST5264_C2;
    private JLabel GOST5264_C20;
    private JLabel GOST5264_C21;
    private JLabel GOST5264_C23;
    private JLabel GOST5264_C24;
    private JLabel GOST5264_C25;
    private JLabel GOST5264_C26;
    private JLabel GOST5264_C27;
    private JLabel GOST5264_C28;
    private JLabel GOST5264_C3;
    private JLabel GOST5264_C39;
    private JLabel GOST5264_C4;
    private JLabel GOST5264_C40;
    private JLabel GOST5264_C42;
    private JLabel GOST5264_C43;
    private JLabel GOST5264_C45;
    private JLabel GOST5264_C5;
    private JLabel GOST5264_C6;
    private JLabel GOST5264_C7;
    private JLabel GOST5264_C8;
    private JLabel GOST5264_C9;
    private JLabel GOST5264_H1;
    private JLabel GOST5264_H2;
    private JLabel GOST5264_T1;
    private JLabel GOST5264_T2;
    private JLabel GOST5264_T3;
    private JLabel GOST5264_T5;
    private JLabel GOST5264_T6;
    private JLabel GOST5264_T7;
    private JLabel GOST5264_T8;
    private JLabel GOST5264_T9;
    private JLabel GOST5264_Y1;
    private JLabel GOST5264_Y10;
    private JLabel GOST5264_Y2;
    private JLabel GOST5264_Y4;
    private JLabel GOST5264_Y4_1;
    private JLabel GOST5264_Y5;
    private JLabel GOST5264_Y5_1;
    private JLabel GOST5264_Y6;
    private JLabel GOST5264_Y7;
    private JLabel GOST5264_Y8;
    private JLabel GOST5264_Y9;
    private JLabel alpha;
    private JLabel b;
    private JLabel beta;
    private JLabel c;
    private JLabel e;
    private JLabel e1;
    private JLabel g;
    private JLabel g1;
    private JLabel h;
    private JLabel imagePipe;
    private JLabel imageRectangularPipe;
    private JLabel dimensionX;
    private JLabel dimensionMM;
    private JLabel dimensionB;
    private JLabel dimensionA;
    private JLabel r;
    private JLabel k;
    private JLabel k1;
    private JLabel labelLengthPlate;
    private JLabel labelMaterial;
    private JLabel labelPipeDiametr;
    private JLabel labelResult;
    private JLabel labelStandardWeldingJoint;
    private JLabel labelWeldProcedure;
    private JLabel labelWeldingPosition;
    private JLabel s;


    public CalculatorGUI() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CalculatorGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(CalculatorGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(CalculatorGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(CalculatorGUI.class.getName()).log(Level.SEVERE, null, ex);
        }


        initComponents();
        setIcon();
    }


    private void initComponents() {

        mainPanel = new JPanel();
        parameters = new JPanel();
        lengthPlate = new JPanel();
        lengthPipe = new JPanel();
        lengthRectangularPipe = new JPanel();

        length = new JTabbedPane();
        teeJoints = new JTabbedPane();
        lapJoints = new JTabbedPane();
        cornerJoints = new JTabbedPane();
        typesWeldingJoint = new JTabbedPane();
        buttJoints = new JTabbedPane();

        weldProcedure = new JComboBox<>();
        weldingPosition = new JComboBox<>();
        materialType = new JComboBox<>();

        standardWeldingJoint = new JTextField();
        result = new JTextField();

        calculate = new JButton();
        goTosite = new JButton();
        exit = new JButton();

        sizeR = new JSpinner();
        sizeAlpha = new JSpinner();
        sizeBeta = new JSpinner();
        sizeH = new JSpinner();
        sizeE = new JSpinner();
        lengthRectangularA = new JSpinner();
        sizeLengthPlate = new JSpinner();
        lengthDiameter = new JSpinner();
        lengthRectangularB = new JSpinner();
        sizeS = new JSpinner();
        sizeB = new JSpinner();
        sizeG = new JSpinner();
        sizeK1 = new JSpinner();
        sizeE1 = new JSpinner();
        sizeG1 = new JSpinner();
        sizeK = new JSpinner();
        sizeC = new JSpinner();
        b = new JLabel();
        s = new JLabel();
        c = new JLabel();
        imageRectangularPipe = new JLabel();
        labelWeldProcedure = new JLabel();
        labelStandardWeldingJoint = new JLabel();
        labelWeldingPosition = new JLabel();
        labelResult = new JLabel();
        labelMaterial = new JLabel();
        labelLengthPlate = new JLabel();
        labelPipeDiametr = new JLabel();
        imagePipe = new JLabel();
        r = new JLabel();
        alpha = new JLabel();
        beta = new JLabel();
        h = new JLabel();
        e = new JLabel();
        g = new JLabel();
        e1 = new JLabel();
        g1 = new JLabel();
        k = new JLabel();
        k1 = new JLabel();
        GOST5264_C1 = new JLabel();
        GOST5264_C2 = new JLabel();
        GOST5264_C3 = new JLabel();
        GOST5264_C4 = new JLabel();
        GOST5264_C5 = new JLabel();
        GOST5264_C6 = new JLabel();
        GOST5264_C7 = new JLabel();
        GOST5264_C8 = new JLabel();
        GOST5264_C9 = new JLabel();
        GOST5264_C10 = new JLabel();
        GOST5264_C11 = new JLabel();
        GOST5264_C12 = new JLabel();
        GOST5264_C13 = new JLabel();
        GOST5264_C14 = new JLabel();
        GOST5264_C15 = new JLabel();
        GOST5264_C16 = new JLabel();
        GOST5264_C17 = new JLabel();
        GOST5264_C18 = new JLabel();
        GOST5264_C19 = new JLabel();
        GOST5264_C20 = new JLabel();
        GOST5264_C21 = new JLabel();
        GOST5264_C23 = new JLabel();
        GOST5264_C24 = new JLabel();
        GOST5264_C25 = new JLabel();
        GOST5264_C26 = new JLabel();
        GOST5264_C27 = new JLabel();
        GOST5264_C28 = new JLabel();
        GOST5264_C39 = new JLabel();
        GOST5264_C40 = new JLabel();
        GOST5264_C42 = new JLabel();
        GOST5264_C43 = new JLabel();
        GOST5264_C45 = new JLabel();
        GOST5264_Y1 = new JLabel();
        GOST5264_Y2 = new JLabel();
        GOST5264_Y4 = new JLabel();
        GOST5264_Y4_1 = new JLabel();
        GOST5264_Y5 = new JLabel();
        GOST5264_Y5_1 = new JLabel();
        GOST5264_Y6 = new JLabel();
        GOST5264_Y7 = new JLabel();
        GOST5264_Y8 = new JLabel();
        GOST5264_Y9 = new JLabel();
        GOST5264_Y10 = new JLabel();
        GOST5264_T1 = new JLabel();
        GOST5264_T2 = new JLabel();
        GOST5264_T3 = new JLabel();
        GOST5264_T5 = new JLabel();
        GOST5264_T6 = new JLabel();
        GOST5264_T7 = new JLabel();
        GOST5264_T8 = new JLabel();
        GOST5264_T9 = new JLabel();
        GOST5264_H1 = new JLabel();
        GOST5264_H2 = new JLabel();
        dimensionX = new JLabel();
        dimensionMM = new JLabel();
        dimensionB = new JLabel();
        dimensionA = new JLabel();


        setTitle("weldering.com");
        setName("mainFrame");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                startFormComponentShown(evt);
            }
        });


        mainPanel.setBorder(BorderFactory.createTitledBorder(null, "Калькулятор расчета сварочных материалов", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new Font("Tahoma", 0, 12)));
        mainPanel.setCursor(new Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelWeldProcedure.setFont(new Font("Tahoma", 1, 12));
        labelWeldProcedure.setHorizontalAlignment(SwingConstants.RIGHT);
        labelWeldProcedure.setText("Способ сварки");

        weldProcedure.setFont(new Font("Tahoma", 0, 12));
        weldProcedure.setModel(new DefaultComboBoxModel<>(new String[]{"TIG", "MIG", "MAG", "MMA", "SAW"}));
        weldProcedure.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                changeStandard(evt);
            }
        });

        labelStandardWeldingJoint.setFont(new Font("Tahoma", 1, 12));
        labelStandardWeldingJoint.setHorizontalAlignment(SwingConstants.RIGHT);
        labelStandardWeldingJoint.setText("Стандарт на тип сварного соединения");

        standardWeldingJoint.setEditable(false);
        standardWeldingJoint.setFont(new Font("Tahoma", 0, 12));
        standardWeldingJoint.setText("ГОСТ 14771-76");

        labelWeldingPosition.setFont(new Font("Tahoma", 1, 12));
        labelWeldingPosition.setHorizontalAlignment(SwingConstants.RIGHT);
        labelWeldingPosition.setText("Положение при сварке");

        weldingPosition.setFont(new Font("Tahoma", 0, 12));
        weldingPosition.setModel(new DefaultComboBoxModel<>(new String[]{"нижнее", "вертикальное", "потолочное"}));

        labelResult.setFont(new Font("Tahoma", 1, 12));
        labelResult.setText("Количество сварочных материалов, кг");

        result.setEditable(false);
        result.setFont(new Font("Tahoma", 1, 12));
        result.setHorizontalAlignment(JTextField.CENTER);
        result.setText("0");

        calculate.setFont(new Font("Tahoma", 1, 12));
        calculate.setText("Рассчитать количество сварочных материалов");
        calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calculateButtonPress(evt);
            }
        });

        exit.setFont(new Font("Tahoma", 1, 12));
        exit.setText("Выход");
        exit.setToolTipText("");
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                buttonExit(evt);
            }
        });

        labelMaterial.setFont(new Font("Tahoma", 1, 12));
        labelMaterial.setText("Материал");

        materialType.setFont(new Font("Tahoma", 0, 12));
        materialType.setModel(new DefaultComboBoxModel<>(new String[]{"сталь", "нержавеющая сталь", "алюминий", "титан"}));


        length.setBorder(BorderFactory.createTitledBorder(null, "Тип свариваемых деталей", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new Font("Tahoma", 1, 12)));

        sizeLengthPlate.setFont(new Font("Tahoma", 0, 12));
        sizeLengthPlate.setModel(new SpinnerNumberModel(100.0d, 1.0d, null, 1.0d));

        labelLengthPlate.setFont(new Font("Tahoma", 1, 12));
        labelLengthPlate.setHorizontalAlignment(SwingConstants.RIGHT);
        labelLengthPlate.setText("Длина, мм");

        GroupLayout lengthPlateLayout = new GroupLayout(lengthPlate);
        lengthPlate.setLayout(lengthPlateLayout);
        lengthPlateLayout.setHorizontalGroup(
                lengthPlateLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(lengthPlateLayout.createSequentialGroup()
                                .addContainerGap(113, Short.MAX_VALUE)
                                .addComponent(labelLengthPlate)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sizeLengthPlate, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111))
        );
        lengthPlateLayout.setVerticalGroup(
                lengthPlateLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(lengthPlateLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(lengthPlateLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(labelLengthPlate)
                                        .addComponent(sizeLengthPlate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(47, Short.MAX_VALUE))
        );

        length.addTab("Пластина", lengthPlate);

        lengthDiameter.setFont(new Font("Tahoma", 0, 12));
        lengthDiameter.setModel(new SpinnerNumberModel(1.0d, 1.0d, null, 1.0d));

        labelPipeDiametr.setFont(new Font("Tahoma", 1, 12));
        labelPipeDiametr.setHorizontalAlignment(SwingConstants.RIGHT);
        labelPipeDiametr.setText("D, мм");

        imagePipe.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/Pipe.gif")));

        GroupLayout lengthPipeLayout = new GroupLayout(lengthPipe);
        lengthPipe.setLayout(lengthPipeLayout);
        lengthPipeLayout.setHorizontalGroup(
                lengthPipeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, lengthPipeLayout.createSequentialGroup()
                                .addContainerGap(73, Short.MAX_VALUE)
                                .addComponent(imagePipe)
                                .addGap(18, 18, 18)
                                .addComponent(labelPipeDiametr)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lengthDiameter, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))
        );
        lengthPipeLayout.setVerticalGroup(
                lengthPipeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, lengthPipeLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(lengthPipeLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelPipeDiametr)
                                        .addComponent(lengthDiameter, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44))
                        .addComponent(imagePipe, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );

        length.addTab("Труба", lengthPipe);

        lengthRectangularA.setFont(new Font("Tahoma", 0, 12));
        lengthRectangularA.setModel(new SpinnerNumberModel(1.0d, 1.0d, null, 1.0d));

        lengthRectangularB.setFont(new Font("Tahoma", 0, 12));
        lengthRectangularB.setModel(new SpinnerNumberModel(1.0d, 1.0d, null, 1.0d));

        imageRectangularPipe.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/RectangularPipe.gif")));

        dimensionX.setFont(new Font("Tahoma", 1, 14));
        dimensionX.setText("×");

        dimensionMM.setFont(new Font("Tahoma", 1, 12));
        dimensionMM.setText(", мм");

        dimensionB.setFont(new Font("Tahoma", 1, 12));
        dimensionB.setHorizontalAlignment(SwingConstants.CENTER);
        dimensionB.setText("B");

        dimensionA.setFont(new Font("Tahoma", 1, 12));
        dimensionA.setHorizontalAlignment(SwingConstants.CENTER);
        dimensionA.setText("A");

        GroupLayout lengthRectangularPipeLayout = new GroupLayout(lengthRectangularPipe);
        lengthRectangularPipe.setLayout(lengthRectangularPipeLayout);
        lengthRectangularPipeLayout.setHorizontalGroup(
                lengthRectangularPipeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, lengthRectangularPipeLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(imageRectangularPipe)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addGroup(lengthRectangularPipeLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(dimensionA, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lengthRectangularA, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dimensionX)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(lengthRectangularPipeLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(dimensionB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lengthRectangularB, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dimensionMM)
                                .addContainerGap())
        );
        lengthRectangularPipeLayout.setVerticalGroup(
                lengthRectangularPipeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(lengthRectangularPipeLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(lengthRectangularPipeLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(dimensionA)
                                        .addComponent(dimensionB))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(lengthRectangularPipeLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lengthRectangularB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lengthRectangularA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dimensionX)
                                        .addComponent(dimensionMM))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(imageRectangularPipe, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        length.addTab("Профильная труба", lengthRectangularPipe);

        GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(calculate, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(exit)
                                                                        .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addGroup(mainPanelLayout.createSequentialGroup()
                                                                                        .addComponent(labelResult)
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                        .addComponent(result, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(mainPanelLayout.createSequentialGroup()
                                                                                        .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(labelWeldingPosition, GroupLayout.Alignment.TRAILING)
                                                                                                .addComponent(labelStandardWeldingJoint, GroupLayout.Alignment.TRAILING)
                                                                                                .addComponent(labelWeldProcedure, GroupLayout.Alignment.TRAILING))
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                        .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(weldingPosition, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addComponent(standardWeldingJoint)
                                                                                                .addComponent(weldProcedure, 0, 84, Short.MAX_VALUE)))
                                                                                .addGroup(GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                                                                        .addComponent(labelMaterial)
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                        .addComponent(materialType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))))
                                                .addGap(52, 52, 52))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(length, GroupLayout.PREFERRED_SIZE, 361, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        mainPanelLayout.linkSize(SwingConstants.HORIZONTAL, new java.awt.Component[]{labelResult, labelStandardWeldingJoint, labelWeldProcedure, labelWeldingPosition});

        mainPanelLayout.linkSize(SwingConstants.HORIZONTAL, new java.awt.Component[]{result, standardWeldingJoint, weldProcedure, weldingPosition});

        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelWeldProcedure)
                                        .addComponent(weldProcedure, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelStandardWeldingJoint)
                                        .addComponent(standardWeldingJoint, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(weldingPosition, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelWeldingPosition))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(materialType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelMaterial))
                                .addGap(18, 18, 18)
                                .addComponent(length, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(calculate, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelResult)
                                        .addComponent(result, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(exit)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        parameters.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        s.setFont(new Font("Tahoma", 1, 12));
        s.setHorizontalAlignment(SwingConstants.RIGHT);
        s.setText("S, мм");

        sizeS.setFont(new Font("Tahoma", 0, 12));
        sizeS.setModel(new SpinnerNumberModel(1.0d, 1.0d, 100.0d, 1.0d));
        sizeS.setToolTipText("толщина");
        sizeS.setMinimumSize(new Dimension(58, 22));
        sizeS.setPreferredSize(new Dimension(58, 22));

        b.setFont(new Font("Tahoma", 1, 12));
        b.setHorizontalAlignment(SwingConstants.RIGHT);
        b.setText("b, мм");

        sizeB.setFont(new Font("Tahoma", 0, 12));
        sizeB.setModel(new SpinnerNumberModel(0.0d, 0.0d, 20.0d, 0.1d));
        sizeB.setToolTipText("зазор");
        sizeB.setMinimumSize(new Dimension(58, 22));
        sizeB.setPreferredSize(new Dimension(58, 22));

        c.setFont(new Font("Tahoma", 1, 12));
        c.setHorizontalAlignment(SwingConstants.RIGHT);
        c.setText("c, мм");

        sizeC.setFont(new Font("Tahoma", 0, 12));
        sizeC.setModel(new SpinnerNumberModel(0.5d, 0.5d, 100.0d, 0.1d));
        sizeC.setMinimumSize(new Dimension(58, 22));
        sizeC.setPreferredSize(new Dimension(58, 22));

        r.setFont(new Font("Tahoma", 1, 12));
        r.setHorizontalAlignment(SwingConstants.RIGHT);
        r.setText("R, мм");

        sizeR.setFont(new Font("Tahoma", 0, 12));
        sizeR.setModel(new SpinnerNumberModel(1.0d, 1.0d, 100.0d, 1.0d));
        sizeR.setMinimumSize(new Dimension(58, 22));
        sizeR.setPreferredSize(new Dimension(58, 22));

        alpha.setFont(new Font("Tahoma", 1, 12));
        alpha.setHorizontalAlignment(SwingConstants.RIGHT);
        alpha.setText("α°");

        sizeAlpha.setFont(new Font("Tahoma", 0, 12));
        sizeAlpha.setModel(new SpinnerNumberModel(5, 1, 60, 1));
        sizeAlpha.setMinimumSize(new Dimension(58, 22));
        sizeAlpha.setPreferredSize(new Dimension(58, 22));

        beta.setFont(new Font("Tahoma", 1, 12));
        beta.setHorizontalAlignment(SwingConstants.RIGHT);
        beta.setText("β°");

        sizeBeta.setFont(new Font("Tahoma", 0, 12));
        sizeBeta.setModel(new SpinnerNumberModel(5, 1, 60, 1));
        sizeBeta.setMinimumSize(new Dimension(58, 22));
        sizeBeta.setPreferredSize(new Dimension(58, 22));

        h.setFont(new Font("Tahoma", 1, 12));
        h.setHorizontalAlignment(SwingConstants.RIGHT);
        h.setText("h, мм");

        sizeH.setFont(new Font("Tahoma", 0, 12));
        sizeH.setModel(new SpinnerNumberModel(1.0d, 1.0d, 100.0d, 1.0d));
        sizeH.setMinimumSize(new Dimension(58, 22));
        sizeH.setPreferredSize(new Dimension(58, 22));

        e.setFont(new Font("Tahoma", 1, 12));
        e.setHorizontalAlignment(SwingConstants.RIGHT);
        e.setText("e, мм");

        sizeE.setFont(new Font("Tahoma", 0, 12));
        sizeE.setModel(new SpinnerNumberModel(1.0d, 1.0d, 100.0d, 1.0d));
        sizeE.setToolTipText("ширина шва");
        sizeE.setMinimumSize(new Dimension(58, 22));
        sizeE.setPreferredSize(new Dimension(58, 22));

        g.setFont(new Font("Tahoma", 1, 12));
        g.setHorizontalAlignment(SwingConstants.RIGHT);
        g.setText("g, мм");

        sizeG.setFont(new Font("Tahoma", 0, 12));
        sizeG.setModel(new SpinnerNumberModel(1.0d, 1.0d, 10.0d, 0.5d));
        sizeG.setToolTipText("высота шва");
        sizeG.setMinimumSize(new Dimension(58, 22));
        sizeG.setPreferredSize(new Dimension(58, 22));

        e1.setFont(new Font("Tahoma", 1, 12));
        e1.setHorizontalAlignment(SwingConstants.RIGHT);
        e1.setText("e1, мм");

        sizeE1.setFont(new Font("Tahoma", 0, 12));
        sizeE1.setModel(new SpinnerNumberModel(1.0d, 1.0d, 100.0d, 1.0d));
        sizeE1.setToolTipText("");
        sizeE1.setMinimumSize(new Dimension(58, 22));
        sizeE1.setPreferredSize(new Dimension(58, 22));

        g1.setFont(new Font("Tahoma", 1, 12));
        g1.setHorizontalAlignment(SwingConstants.RIGHT);
        g1.setText("g1, мм");

        sizeG1.setFont(new Font("Tahoma", 0, 12));
        sizeG1.setModel(new SpinnerNumberModel(1.0d, 1.0d, 10.0d, 0.5d));
        sizeG1.setMinimumSize(new Dimension(58, 22));
        sizeG1.setPreferredSize(new Dimension(58, 22));

        k.setFont(new Font("Tahoma", 1, 12));
        k.setHorizontalAlignment(SwingConstants.RIGHT);
        k.setText("K, мм");

        sizeK.setFont(new Font("Tahoma", 0, 12));
        sizeK.setModel(new SpinnerNumberModel(1.0d, 1.0d, 100.0d, 1.0d));
        sizeK.setMinimumSize(new Dimension(58, 22));
        sizeK.setPreferredSize(new Dimension(58, 22));

        k1.setFont(new Font("Tahoma", 1, 12));
        k1.setHorizontalAlignment(SwingConstants.RIGHT);
        k1.setText("K1, мм");

        sizeK1.setFont(new Font("Tahoma", 0, 12));
        sizeK1.setModel(new SpinnerNumberModel(1.0d, 1.0d, 100.0d, 0.0d));
        sizeK1.setMinimumSize(new Dimension(58, 22));
        sizeK1.setPreferredSize(new Dimension(58, 22));

        goTosite.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/logo.gif")));
        goTosite.setToolTipText("Перейти на сайт weldering.com");
        goTosite.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    goToSiteButton(evt);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        });

        GroupLayout parametersLayout = new GroupLayout(parameters);
        parameters.setLayout(parametersLayout);
        parametersLayout.setHorizontalGroup(
                parametersLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(parametersLayout.createSequentialGroup()
                                .addGroup(parametersLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(s, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(b, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(c, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(r, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(alpha, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(beta, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(h, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(e, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(g, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(e1, GroupLayout.Alignment.TRAILING)
                                        .addComponent(g1, GroupLayout.Alignment.TRAILING)
                                        .addComponent(k, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(k1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(parametersLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(sizeS, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sizeB, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sizeC, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sizeR, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sizeAlpha, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sizeBeta, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sizeH, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sizeE, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sizeG, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sizeE1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sizeG1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sizeK, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sizeK1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)))
                        .addComponent(goTosite, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        );

        parametersLayout.linkSize(SwingConstants.HORIZONTAL, new Component[]{sizeAlpha, sizeB, sizeBeta, sizeC, sizeE, sizeE1, sizeG, sizeG1, sizeH, sizeK, sizeK1, sizeR, sizeS});

        parametersLayout.linkSize(SwingConstants.HORIZONTAL, new Component[]{alpha, b, beta, c, e, e1, g, g1, h, k, k1, r, s});

        parametersLayout.setVerticalGroup(
                parametersLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(parametersLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(parametersLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(s)
                                        .addComponent(sizeS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(parametersLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(b)
                                        .addComponent(sizeB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(parametersLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(c)
                                        .addComponent(sizeC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(parametersLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(r)
                                        .addComponent(sizeR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(parametersLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(h)
                                        .addComponent(sizeH, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(parametersLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(alpha)
                                        .addComponent(sizeAlpha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(parametersLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(beta)
                                        .addComponent(sizeBeta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(parametersLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(e)
                                        .addComponent(sizeE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(parametersLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(g)
                                        .addComponent(sizeG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(parametersLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(e1)
                                        .addComponent(sizeE1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(parametersLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(g1)
                                        .addComponent(sizeG1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(parametersLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(k)
                                        .addComponent(sizeK, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(parametersLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(k1)
                                        .addComponent(sizeK1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(goTosite, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        typesWeldingJoint.setBorder(BorderFactory.createTitledBorder(null, "Тип сварного соединения по ГОСТ 5264-80", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new Font("Tahoma", 0, 12)));
        typesWeldingJoint.setMinimumSize(new Dimension(520, 450));
        typesWeldingJoint.setPreferredSize(new Dimension(520, 450));

        buttJoints.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                buttJointsComponentShown(evt);
            }
        });

        GOST5264_C1.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C1.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С1.gif")));
        GOST5264_C1.setToolTipText("");
        GOST5264_C1.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C1_C2_C3_C5_C6_C7_Y1ComponentShown(evt);
            }
        });
        buttJoints.addTab("С1", GOST5264_C1);

        GOST5264_C2.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C2.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С2.gif")));
        GOST5264_C2.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C1_C2_C3_C5_C6_C7_Y1ComponentShown(evt);
            }
        });
        buttJoints.addTab("C2", GOST5264_C2);

        GOST5264_C3.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C3.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С3.gif")));
        GOST5264_C3.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C1_C2_C3_C5_C6_C7_Y1ComponentShown(evt);
            }
        });
        buttJoints.addTab("C3", GOST5264_C3);

        GOST5264_C4.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C4.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С4.gif")));
        GOST5264_C4.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C2_C4ComponentShown(evt);
            }
        });
        buttJoints.addTab("C4", GOST5264_C4);

        GOST5264_C5.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C5.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С5.gif")));
        GOST5264_C5.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C1_C2_C3_C5_C6_C7_Y1ComponentShown(evt);
            }
        });
        buttJoints.addTab("C5", GOST5264_C5);

        GOST5264_C6.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C6.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С6.gif")));
        GOST5264_C6.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C1_C2_C3_C5_C6_C7_Y1ComponentShown(evt);
            }
        });
        buttJoints.addTab("C6", GOST5264_C6);

        GOST5264_C7.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C7.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С7.gif")));
        GOST5264_C7.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C1_C2_C3_C5_C6_C7_Y1ComponentShown(evt);
            }
        });
        buttJoints.addTab("C7", GOST5264_C7);

        GOST5264_C8.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C8.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С8.gif")));
        GOST5264_C8.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C10_C15_C17_C19_C25_C8_T6_T8_T9_Y6_Y9ComponentShown(evt);
            }
        });
        buttJoints.addTab("C8", GOST5264_C8);

        GOST5264_C9.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C9.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С9.gif")));
        GOST5264_C9.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C12_C18_C21_C9_Y8ComponentShown(evt);
            }
        });
        buttJoints.addTab("C9", GOST5264_C9);

        GOST5264_C10.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C10.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С10.gif")));
        GOST5264_C10.setToolTipText("");
        GOST5264_C10.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C10_C15_C17_C19_C25_C8_T6_T8_T9_Y6_Y9ComponentShown(evt);
            }
        });
        buttJoints.addTab("С10", GOST5264_C10);

        GOST5264_C11.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C11.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С11.gif")));
        GOST5264_C11.setToolTipText("");
        GOST5264_C11.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C11ComponentShown(evt);
            }
        });
        buttJoints.addTab("С11", GOST5264_C11);

        GOST5264_C12.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C12.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С12.gif")));
        GOST5264_C12.setToolTipText("");
        GOST5264_C12.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C12_C18_C21_C9_Y8ComponentShown(evt);
            }
        });
        buttJoints.addTab("С12", GOST5264_C12);

        GOST5264_C13.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C13.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С13.gif")));
        GOST5264_C13.setToolTipText("");
        GOST5264_C13.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C13_C23ComponentShown(evt);
            }
        });
        buttJoints.addTab("С13", GOST5264_C13);

        GOST5264_C14.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C14.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С14.gif")));
        GOST5264_C14.setToolTipText("");
        GOST5264_C14.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C14_C24_C39_C43ComponentShown(evt);
            }
        });
        buttJoints.addTab("С14", GOST5264_C14);

        GOST5264_C15.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C15.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С15.gif")));
        GOST5264_C15.setToolTipText("");
        GOST5264_C15.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C10_C15_C17_C19_C25_C8_T6_T8_T9_Y6_Y9ComponentShown(evt);
            }
        });
        buttJoints.addTab("С15", GOST5264_C15);

        GOST5264_C16.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C16.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С16.gif")));
        GOST5264_C16.setToolTipText("");
        GOST5264_C16.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C16_C26_T5ComponentShown(evt);
            }
        });
        buttJoints.addTab("С16", GOST5264_C16);

        GOST5264_C17.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C17.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С17.gif")));
        GOST5264_C17.setToolTipText("");
        GOST5264_C17.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C10_C15_C17_C19_C25_C8_T6_T8_T9_Y6_Y9ComponentShown(evt);
            }
        });
        buttJoints.addTab("С17", GOST5264_C17);

        GOST5264_C18.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C18.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С18.gif")));
        GOST5264_C18.setToolTipText("");
        GOST5264_C18.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C12_C18_C21_C9_Y8ComponentShown(evt);
            }
        });
        buttJoints.addTab("С18", GOST5264_C18);

        GOST5264_C19.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C19.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С19.gif")));
        GOST5264_C19.setToolTipText("");
        GOST5264_C19.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C10_C15_C17_C19_C25_C8_T6_T8_T9_Y6_Y9ComponentShown(evt);
            }
        });
        buttJoints.addTab("С19", GOST5264_C19);

        GOST5264_C20.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C20.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С20.gif")));
        GOST5264_C20.setToolTipText("");
        GOST5264_C20.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C20_Y7_Y10_T7ComponentShown(evt);
            }
        });
        buttJoints.addTab("С20", GOST5264_C20);

        GOST5264_C21.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C21.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С21.gif")));
        GOST5264_C21.setToolTipText("");
        GOST5264_C21.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C12_C18_C21_C9_Y8ComponentShown(evt);
            }
        });
        buttJoints.addTab("С21", GOST5264_C21);

        GOST5264_C23.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C23.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С23.gif")));
        GOST5264_C23.setToolTipText("");
        GOST5264_C23.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C13_C23ComponentShown(evt);
            }
        });
        buttJoints.addTab("С23", GOST5264_C23);

        GOST5264_C24.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C24.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С24.gif")));
        GOST5264_C24.setToolTipText("");
        GOST5264_C24.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C14_C24_C39_C43ComponentShown(evt);
            }
        });
        buttJoints.addTab("С24", GOST5264_C24);

        GOST5264_C25.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C25.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С25.gif")));
        GOST5264_C25.setToolTipText("");
        GOST5264_C25.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C10_C15_C17_C19_C25_C8_T6_T8_T9_Y6_Y9ComponentShown(evt);
            }
        });
        buttJoints.addTab("С25", GOST5264_C25);

        GOST5264_C26.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C26.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С26.gif")));
        GOST5264_C26.setToolTipText("");
        GOST5264_C26.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C16_C26_T5ComponentShown(evt);
            }
        });
        buttJoints.addTab("С26", GOST5264_C26);

        GOST5264_C27.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C27.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С27.gif")));
        GOST5264_C27.setToolTipText("");
        GOST5264_C27.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C27ComponentShown(evt);
            }
        });
        buttJoints.addTab("С27", GOST5264_C27);

        GOST5264_C28.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C28.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С28.gif")));
        GOST5264_C28.setToolTipText("");
        GOST5264_C28.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C28_Y2ComponentShown(evt);
            }
        });
        buttJoints.addTab("С28", GOST5264_C28);

        GOST5264_C39.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C39.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С39.gif")));
        GOST5264_C39.setToolTipText("");
        GOST5264_C39.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C14_C24_C39_C43ComponentShown(evt);
            }
        });
        buttJoints.addTab("С39", GOST5264_C39);

        GOST5264_C40.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C40.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С40.gif")));
        GOST5264_C40.setToolTipText("");
        GOST5264_C40.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C40ComponentShown(evt);
            }
        });
        buttJoints.addTab("С40", GOST5264_C40);

        GOST5264_C42.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C42.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С42.gif")));
        GOST5264_C42.setToolTipText("");
        GOST5264_C42.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C42ComponentShown(evt);
            }
        });
        buttJoints.addTab("С42", GOST5264_C42);

        GOST5264_C43.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C43.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С43.gif")));
        GOST5264_C43.setToolTipText("");
        GOST5264_C43.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C14_C24_C39_C43ComponentShown(evt);
            }
        });
        buttJoints.addTab("С43", GOST5264_C43);

        GOST5264_C45.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_C45.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_С45.gif")));
        GOST5264_C45.setToolTipText("");
        GOST5264_C45.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C45ComponentShown(evt);
            }
        });
        buttJoints.addTab("С45", GOST5264_C45);

        typesWeldingJoint.addTab("Стыковое", buttJoints);

        cornerJoints.setFocusCycleRoot(true);
        cornerJoints.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                cornerJointsComponentShown(evt);
            }
        });

        GOST5264_Y1.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_Y1.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_Y1.gif")));
        GOST5264_Y1.setToolTipText("");
        GOST5264_Y1.setFocusCycleRoot(true);
        GOST5264_Y1.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C1_C2_C3_C5_C6_C7_Y1ComponentShown(evt);
            }
        });
        cornerJoints.addTab("У1", GOST5264_Y1);

        GOST5264_Y2.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_Y2.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_Y2.gif")));
        GOST5264_Y2.setToolTipText("");
        GOST5264_Y2.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C28_Y2ComponentShown(evt);
            }
        });
        cornerJoints.addTab("У2", GOST5264_Y2);

        GOST5264_Y4.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_Y4.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_Y4_1.gif")));
        GOST5264_Y4.setToolTipText("");
        GOST5264_Y4.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_Y4ComponentShown(evt);
            }
        });
        cornerJoints.addTab("У4", GOST5264_Y4);

        GOST5264_Y4_1.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_Y4_1.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_Y4_2.gif")));
        GOST5264_Y4_1.setToolTipText("");
        GOST5264_Y4_1.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_Y4_1ComponentShown(evt);
            }
        });
        cornerJoints.addTab("У4", GOST5264_Y4_1);

        GOST5264_Y5.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_Y5.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_Y5_1.gif")));
        GOST5264_Y5.setToolTipText("");
        GOST5264_Y5.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_Y5ComponentShown(evt);
            }
        });
        cornerJoints.addTab("У5", GOST5264_Y5);

        GOST5264_Y5_1.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_Y5_1.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_Y5_2.gif")));
        GOST5264_Y5_1.setToolTipText("");
        GOST5264_Y5_1.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_Y5_1ComponentShown(evt);
            }
        });
        cornerJoints.addTab("У5", GOST5264_Y5_1);

        GOST5264_Y6.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_Y6.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_Y6.gif")));
        GOST5264_Y6.setToolTipText("");
        GOST5264_Y6.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C10_C15_C17_C19_C25_C8_T6_T8_T9_Y6_Y9ComponentShown(evt);
            }
        });
        cornerJoints.addTab("У6", GOST5264_Y6);

        GOST5264_Y7.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_Y7.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_Y7.gif")));
        GOST5264_Y7.setToolTipText("");
        GOST5264_Y7.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C20_Y7_Y10_T7ComponentShown(evt);
            }
        });
        cornerJoints.addTab("У7", GOST5264_Y7);

        GOST5264_Y8.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_Y8.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_Y8.gif")));
        GOST5264_Y8.setToolTipText("");
        GOST5264_Y8.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C12_C18_C21_C9_Y8ComponentShown(evt);
            }
        });
        cornerJoints.addTab("У8", GOST5264_Y8);

        GOST5264_Y9.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_Y9.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_Y9.gif")));
        GOST5264_Y9.setToolTipText("");
        GOST5264_Y9.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C10_C15_C17_C19_C25_C8_T6_T8_T9_Y6_Y9ComponentShown(evt);
            }
        });
        cornerJoints.addTab("У9", GOST5264_Y9);

        GOST5264_Y10.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_Y10.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_Y10.gif")));
        GOST5264_Y10.setToolTipText("");
        GOST5264_Y10.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C20_Y7_Y10_T7ComponentShown(evt);
            }
        });
        cornerJoints.addTab("У10", GOST5264_Y10);

        typesWeldingJoint.addTab("Угловое", cornerJoints);
        cornerJoints.getAccessibleContext().setAccessibleDescription("");

        teeJoints.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                teeJointsComponentShown(evt);
            }
        });

        GOST5264_T1.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_T1.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_T1.gif")));
        GOST5264_T1.setToolTipText("");
        GOST5264_T1.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_T1_T3ComponentShown(evt);
            }
        });
        teeJoints.addTab("Т1", GOST5264_T1);

        GOST5264_T2.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_T2.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_T2.gif")));
        GOST5264_T2.setToolTipText("");
        GOST5264_T2.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_T2ComponentShown(evt);
            }
        });
        teeJoints.addTab("Т2", GOST5264_T2);

        GOST5264_T3.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_T3.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_T3.gif")));
        GOST5264_T3.setToolTipText("");
        GOST5264_T3.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_T1_T3ComponentShown(evt);
            }
        });
        teeJoints.addTab("Т3", GOST5264_T3);

        GOST5264_T5.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_T5.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_T5.gif")));
        GOST5264_T5.setToolTipText("");
        GOST5264_T5.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C16_C26_T5ComponentShown(evt);
            }
        });
        teeJoints.addTab("Т5", GOST5264_T5);

        GOST5264_T6.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_T6.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_T6.gif")));
        GOST5264_T6.setToolTipText("");
        GOST5264_T6.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C10_C15_C17_C19_C25_C8_T6_T8_T9_Y6_Y9ComponentShown(evt);
            }
        });
        teeJoints.addTab("Т6", GOST5264_T6);

        GOST5264_T7.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_T7.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_T7.gif")));
        GOST5264_T7.setToolTipText("");
        GOST5264_T7.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C20_Y7_Y10_T7ComponentShown(evt);
            }
        });
        teeJoints.addTab("Т7", GOST5264_T7);

        GOST5264_T8.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_T8.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_T8.gif")));
        GOST5264_T8.setToolTipText("");
        GOST5264_T8.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C10_C15_C17_C19_C25_C8_T6_T8_T9_Y6_Y9ComponentShown(evt);
            }
        });
        teeJoints.addTab("Т8", GOST5264_T8);

        GOST5264_T9.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_T9.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_T9.gif")));
        GOST5264_T9.setToolTipText("");
        GOST5264_T9.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_C10_C15_C17_C19_C25_C8_T6_T8_T9_Y6_Y9ComponentShown(evt);
            }
        });
        teeJoints.addTab("Т9", GOST5264_T9);

        typesWeldingJoint.addTab("Тавровое", teeJoints);

        lapJoints.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                lapJointsComponentShown(evt);
            }
        });

        GOST5264_H1.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_H1.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_H1.gif")));
        GOST5264_H1.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_H1_H2ComponentShown(evt);
            }
        });
        lapJoints.addTab("Н1", GOST5264_H1);

        GOST5264_H2.setHorizontalAlignment(SwingConstants.CENTER);
        GOST5264_H2.setIcon(new ImageIcon(getClass().getResource("/weldingCalculator/guiForm/Images/GOST5264/GOST5264_H2.gif")));
        GOST5264_H2.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                GOST5264_H1_H2ComponentShown(evt);
            }
        });
        lapJoints.addTab("Н2", GOST5264_H2);

        typesWeldingJoint.addTab("Нахлесточное", lapJoints);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(mainPanel, GroupLayout.PREFERRED_SIZE, 390, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(parameters, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(typesWeldingJoint, GroupLayout.PREFERRED_SIZE, 520, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(parameters, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(typesWeldingJoint, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );


    }

    private void goToSiteButton(ActionEvent evt) throws IOException {
        String s = "http://weldering.com";
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(URI.create(s));
    }

    //метод ставит изображене Иконки программы
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/weldingCalculator/guiForm/Images/favicon.gif")));
    }

    // изменение ГОСТа в зависимости от выбранного типа сварки
    private void changeStandard(ItemEvent evt) {
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            switch (weldProcedure.getSelectedIndex()) {
                case 0:
                case 1:
                case 2:
                    standardWeldingJoint.setText("ГОСТ 14771-76");
                    break;

                case 3:
                    standardWeldingJoint.setText("ГОСТ 5264-80");
                    break;

                case 4:
                    standardWeldingJoint.setText("ГОСТ 8713-79");
                    break;

                default:
                    break;
            }
        }
    }

    //действие при нажатии кнопки "Рассчитать количество сварочных материалов"
    private void calculateButtonPress(ActionEvent evt) {

        double S = (double) sizeS.getValue();
        double b = sizeB((double) this.sizeB.getValue());
        double e = (double) sizeE.getValue();
        double g = (double) sizeG.getValue();
        double e1 = (double) sizeE1.getValue();
        double g1 = (double) sizeG1.getValue();
        int alpha = (int) sizeAlpha.getValue();
        int beta = (int) sizeBeta.getValue();
        double c = (double) sizeC.getValue();
        double h = (double) sizeH.getValue();
        double R = (double) sizeR.getValue();
        double K = (double) sizeK.getValue();
        double K1 = (double) sizeK1.getValue();
        double F = 0;

        if (typesWeldingJoint.getSelectedIndex() == 0) {

            switch (buttJoints.getSelectedIndex()) {
                case 0:
                case 1:
                case 2:
                case 4:
                case 5:
                    F = FlatArea.c1_c2_c3_c5_c6_y1(S, b, e, g);
                    break;

                case 3:
                    F = FlatArea.c4(S, b, e, g, e1, g1);
                    break;

                case 6:
                    F = FlatArea.c7(S, b, e, g);
                    break;

                case 7:
                case 9:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else {
                        F = FlatArea.c8_c10_y6_t6(S, b, e, g, c, alpha);
                    }
                    break;

                case 8:
                case 11:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else {
                        F = FlatArea.c9_c12(S, b, e, g, e1, g1, c, alpha);
                    }
                    break;

                case 10:
                    F = FlatArea.c11(S, b, e, g, alpha);
                    break;

                case 12:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else if (R >= S - c) {
                        errorMessage("R", "S-c");
                    } else {
                        F = FlatArea.c13(S, b, e, g, e1, g1, c, R, alpha);
                    }
                    break;

                case 13:
                    if (c >= h) {
                        errorMessage("C", "H");
                    } else if (h >= S) {
                        errorMessage("h", "S");
                    } else if (c + h >= S) {
                        errorMessage("c+h", "S");
                    } else {
                        F = FlatArea.c14(S, b, e, g, g1, e1, c, h, beta, alpha);
                    }
                    break;

                case 14:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else {
                        F = FlatArea.c15_t8_t9(S, b, e, g, c, alpha);
                    }
                    break;

                case 15:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else if (R >= (S - c) / 2) {
                        errorMessage("R", "(S-c)/2");
                    } else {
                        F = FlatArea.c16_t5(S, b, e, g, c, R, alpha);
                    }
                    break;

                case 16:
                case 18:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else {
                        F = FlatArea.c17_c19_y9(S, b, e, g, c, alpha);
                    }
                    break;

                case 17:
                case 20:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else {
                        F = FlatArea.c18_c21(S, b, e, g, e1, g1, c, alpha);
                    }
                    break;

                case 19:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else {
                        F = FlatArea.c20(S, b, e, g, e1, g1, c, K, alpha);
                    }
                    break;

                case 21:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else if (R >= S - c) {
                        errorMessage("R", "S-c");
                    } else {
                        F = FlatArea.c23(S, b, e, g, e1, g1, c, R, alpha);
                    }
                    break;

                case 22:
                    if (c >= h) {
                        errorMessage("C", "H");
                    } else if (h >= S) {
                        errorMessage("h", "S");
                    } else if (c + h >= S) {
                        errorMessage("c+h", "S");
                    } else {
                        F = FlatArea.c24(S, b, e, g, e1, g1, c, h, beta, alpha);
                    }
                    break;

                case 23:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else {
                        F = FlatArea.c25(S, b, e, g, e1, g1, c, h, R, beta, alpha);
                    }
                    break;

                case 24:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else if (R >= (S - c) / 2) {
                        errorMessage("R", "(S-c)/2");
                    } else {
                        F = FlatArea.c26(S, b, e, g, c, R, alpha);
                    }
                    break;

                case 25:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else if (h >= S) {
                        errorMessage("h", "S");
                    } else if (c / 2 + h >= S / 2) {
                        errorMessage("c/2+h", "S/2");
                    } else {
                        F = FlatArea.c27(S, b, e, g, c, h, beta, alpha);
                    }
                    break;

                case 26:
                    F = FlatArea.c28(S, b, e, g, R);
                    break;

                case 27:
                    if (c >= S) {
                        errorMessage("C", "H");
                    } else if (h >= S) {
                        errorMessage("h", "S");
                    } else if (c + h >= S) {
                        errorMessage("c+h", "S");
                    } else {
                        F = FlatArea.c39(S, b, e, g, e1, g1, c, h, beta, alpha);
                    }
                    break;

                case 28:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else if (h >= S) {
                        errorMessage("h", "S");
                    } else if ((c + h) >= S) {
                        errorMessage("c+h", "S");
                    } else if (R >= h) {
                        errorMessage("R", "h");
                    } else {
                        F = FlatArea.c40(S, b, e, g, e1, g1, c, h, R, beta, alpha);
                    }
                    break;

                case 29:
                    if (h >= S) {
                        errorMessage("h", "S");
                    } else {
                        F = FlatArea.c42(S, b, e, g, e1, g1, h, K);
                    }
                    break;

                case 30:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else if (h >= S) {
                        errorMessage("h", "S");
                    } else if (c + h >= S) {
                        errorMessage("c+h", "S");
                    } else {
                        F = FlatArea.c43(S, b, e, g, e1, g1, c, h, beta, alpha);
                    }
                    break;

                case 31:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else if (h >= S) {
                        errorMessage("h", "S");
                    } else {
                        F = FlatArea.c45(S, b, e, g, e1, g1, c, h, K, alpha);
                    }
                    break;

                default:
                    break;
            }

        } else if (typesWeldingJoint.getSelectedIndex() == 1) {

            switch (cornerJoints.getSelectedIndex()) {
                case 0:
                    F = FlatArea.c1_c2_c3_c5_c6_y1(S, b, e, g);
                    break;

                case 1:
                    F = FlatArea.y2(S, b, e, g, R);
                    break;

                case 2:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else {
                        F = FlatArea.y4(S, b, e, g, c);
                    }
                    break;

                case 3:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else {
                        F = FlatArea.y4(S, b, c, K);
                    }
                    break;

                case 4:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else {
                        F = FlatArea.y5(S, b, e, g, c, K1);
                    }
                    break;

                case 5:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else {
                        F = FlatArea.y5(S, b, c, K);
                    }
                    break;

                case 6:
                    F = FlatArea.c8_c10_y6_t6(S, b, e, g, c, alpha);
                    break;

                case 7:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else {
                        F = FlatArea.y7_t7(S, b, e, g, K, c, alpha);
                    }
                    break;

                case 8:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else {
                        F = FlatArea.y8(S, b, e, g, e1, g1, c, alpha);
                    }
                    break;
                case 9:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else {
                        F = FlatArea.c17_c19_y9(S, b, e, g, c, alpha);
                    }
                    break;

                case 10:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else {
                        F = FlatArea.y10(S, b, e, g, K, c, alpha);
                    }
                    break;

                default:
                    break;
            }
        } else if (typesWeldingJoint.getSelectedIndex() == 2) {
            switch (teeJoints.getSelectedIndex()) {
                case 0:
                    F = FlatArea.t1_h1(K);
                    break;

                case 1:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else if (R >= S - c) {
                        errorMessage("R", "S-c");
                    } else {
                        F = FlatArea.t2(S, b, e, g, c, K, R, alpha);
                    }
                    break;

                case 2:
                    F = FlatArea.t3_h2(K);
                    break;

                case 3:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else if (R >= (S - c) / 2) {
                        errorMessage("R", "(S-c)/2");
                    } else {
                        F = FlatArea.c16_t5(S, b, e, g, c, R, alpha);
                    }
                    break;

                case 4:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else {
                        F = FlatArea.c8_c10_y6_t6(S, b, e, g, c, alpha);
                    }
                    break;

                case 5:
                    if (c >= S) {
                        errorMessage("c", "S");
                    } else {
                        F = FlatArea.y7_t7(S, b, e, g, K, c, alpha);
                    }
                    break;

                case 6:
                case 7:
                    F = FlatArea.c15_t8_t9(S, b, e, g, c, alpha);
                    break;

                default:
                    break;
            }
        } else if (typesWeldingJoint.getSelectedIndex() == 3) {
            int i = lapJoints.getSelectedIndex();
            if (i == 0) {
                F = FlatArea.t1_h1(K);

            } else {
                F = FlatArea.t3_h2(K);
            }

        }
        result.setText(Mass.massCalculate(F, y(), l(), kWeldProcedure(), kpol()));
    }


    //метод возвращает коэффициент в зависимости от положения сварки kpol
    private double kpol() {
        double kpol;
        if (weldingPosition.getSelectedIndex() == 0) {
            kpol = 1.0; //нижнее положение
        } else if (weldingPosition.getSelectedIndex() == 1) {
            kpol = 1.1; //вертикальное положение
        } else {
            kpol = 1.2; //потолочное положение
        }
        return kpol;
    }

    //метод возвращает коэффициент в зависмости от выбранного способа сварки kWeldProcedure
    private double kWeldProcedure() {
        double kWeldProcedure;
        if (weldProcedure.getSelectedIndex() == 0) {
            kWeldProcedure = 1.1; //TIG
        } else if (weldProcedure.getSelectedIndex() == 1) {
            kWeldProcedure = 1.05; //MIG
        } else if (weldProcedure.getSelectedIndex() == 2) {
            kWeldProcedure = 1.2; //MAG
        } else if (weldProcedure.getSelectedIndex() == 3) {
            kWeldProcedure = 1.6; //MMA
        } else {
            kWeldProcedure = 1.02; //SAW
        }
        return kWeldProcedure;
    }

    //метод возвращает плотность материала г/мм3 в зависимости от выбора в поле materialType
    private double y() {
        double y;
        if (materialType.getSelectedIndex() == 0) {
            y = 0.00785;//сталь
        } else if (materialType.getSelectedIndex() == 1) {
            y = 0.0079;//нержавеющая сталь
        } else if (materialType.getSelectedIndex() == 2) {
            y = 0.00273;//алюминий
        } else {
            y = 0.0045;//титан
        }
        return y;
    }

    //length of weld joint
    private double l() {
        double l;
        if (length.getSelectedIndex() == 0) {
            l = (double) sizeLengthPlate.getValue();
        } else if (length.getSelectedIndex() == 1) {
            double D = (double) lengthDiameter.getValue() - (double) sizeS.getValue() / 2;
            l = Math.PI * D;
        } else {
            l = (double) lengthRectangularA.getValue() * 2 + (double) lengthRectangularB.getValue() * 2;
        }
        return l;
    }

    //if gap is 0 then in formulas b=0.1. При сварке зазор между деталями может составлять 0 мм, но тогда будет ошибка в расчете
    private double sizeB(double sizeB) {
        if (sizeB == 0) {
            sizeB = 0.1;
        }
        return sizeB;
    }


    //button exit from program
    private void buttonExit(ActionEvent evt) {
        System.exit(0);
    }

    //вывод сообщения о введенных некорректных данных
    //04.01.18 добавил исключение, чтобы потом сделать логирование
    private void errorMessage(String bigger, String than) throws IllegalArgumentException {
        JOptionPane.showMessageDialog(null, "Введены некорректные данные:\n" + bigger + " не может быть больше " + than, "ОШИБКА", JOptionPane.ERROR_MESSAGE);
        throw new IllegalArgumentException();
    }

    //Изменение отображение полей в зависимости от выбранной вкладки
    private void setVisibility(JLabel label, JSpinner spinner, boolean b) {
        label.setVisible(b);
        spinner.setVisible(b);
    }


    private void visibility_S_b_e_g() {
        setVisibility(s, sizeS, true);
        setVisibility(b, sizeB, true);
        setVisibility(e, sizeE, true);
        setVisibility(g, sizeG, true);

        setVisibility(g1, sizeG1, false);
        setVisibility(e1, sizeE1, false);
        setVisibility(c, sizeC, false);
        setVisibility(h, sizeH, false);
        setVisibility(r, sizeR, false);
        setVisibility(alpha, sizeAlpha, false);
        setVisibility(beta, sizeBeta, false);
        setVisibility(k, sizeK, false);
        setVisibility(k1, sizeK1, false);

    }

    private void visibility_S_b_e_g_R() {
        setVisibility(s, sizeS, true);
        setVisibility(b, sizeB, true);
        setVisibility(e, sizeE, true);
        setVisibility(g, sizeG, true);
        setVisibility(r, sizeR, true);

        setVisibility(g1, sizeG1, false);
        setVisibility(e1, sizeE1, false);
        setVisibility(c, sizeC, false);
        setVisibility(h, sizeH, false);
        setVisibility(alpha, sizeAlpha, false);
        setVisibility(beta, sizeBeta, false);
        setVisibility(k, sizeK, false);
        setVisibility(k1, sizeK1, false);
    }

    private void visibility_S_b_e_g_alpha() {
        setVisibility(s, sizeS, true);
        setVisibility(b, sizeB, true);
        setVisibility(e, sizeE, true);
        setVisibility(g, sizeG, true);
        setVisibility(alpha, sizeAlpha, true);

        setVisibility(c, sizeC, false);
        setVisibility(e1, sizeE1, false);
        setVisibility(g1, sizeG1, false);
        setVisibility(h, sizeH, false);
        setVisibility(r, sizeR, false);
        setVisibility(beta, sizeBeta, false);
        setVisibility(k, sizeK, false);
        setVisibility(k1, sizeK1, false);
    }

    private void visibility_S_b_e_g_c() {
        setVisibility(s, sizeS, true);
        setVisibility(b, sizeB, true);
        setVisibility(e, sizeE, true);
        setVisibility(g, sizeG, true);
        setVisibility(c, sizeC, true);

        setVisibility(e1, sizeE1, false);
        setVisibility(g1, sizeG1, false);
        setVisibility(h, sizeH, false);
        setVisibility(r, sizeR, false);
        setVisibility(alpha, sizeAlpha, false);
        setVisibility(beta, sizeBeta, false);
        setVisibility(k, sizeK, false);
        setVisibility(k1, sizeK1, false);
    }

    private void visibility_S_b_e_g_c_K() {
        setVisibility(s, sizeS, true);
        setVisibility(b, sizeB, true);
        setVisibility(e, sizeE, true);
        setVisibility(g, sizeG, true);
        setVisibility(c, sizeC, true);
        setVisibility(k, sizeK, true);

        setVisibility(e1, sizeE1, false);
        setVisibility(g1, sizeG1, false);
        setVisibility(h, sizeH, false);
        setVisibility(r, sizeR, false);
        setVisibility(alpha, sizeAlpha, false);
        setVisibility(beta, sizeBeta, false);
        setVisibility(k1, sizeK1, false);
    }

    private void visibility_S_b_e_g_c_alpha() {
        setVisibility(s, sizeS, true);
        setVisibility(b, sizeB, true);
        setVisibility(e, sizeE, true);
        setVisibility(g, sizeG, true);
        setVisibility(c, sizeC, true);
        setVisibility(alpha, sizeAlpha, true);

        setVisibility(e1, sizeE1, false);
        setVisibility(g1, sizeG1, false);
        setVisibility(h, sizeH, false);
        setVisibility(r, sizeR, false);
        setVisibility(beta, sizeBeta, false);
        setVisibility(k, sizeK, false);
        setVisibility(k1, sizeK1, false);
    }

    private void visibility_S_b_e_g_c_K_alpha() {
        setVisibility(s, sizeS, true);
        setVisibility(b, sizeB, true);
        setVisibility(e, sizeE, true);
        setVisibility(g, sizeG, true);
        setVisibility(c, sizeC, true);
        setVisibility(k, sizeK, true);
        setVisibility(alpha, sizeAlpha, true);

        setVisibility(e1, sizeE1, false);
        setVisibility(g1, sizeG1, false);
        setVisibility(h, sizeH, false);
        setVisibility(r, sizeR, false);
        setVisibility(beta, sizeBeta, false);
        setVisibility(k1, sizeK1, false);
    }

    private void visibility_S_b_e_g_c_K_R_alpha() {
        setVisibility(s, sizeS, true);
        setVisibility(b, sizeB, true);
        setVisibility(e, sizeE, true);
        setVisibility(g, sizeG, true);
        setVisibility(c, sizeC, true);
        setVisibility(k, sizeK, true);
        setVisibility(r, sizeR, true);
        setVisibility(alpha, sizeAlpha, true);

        setVisibility(e1, sizeE1, false);
        setVisibility(g1, sizeG1, false);
        setVisibility(h, sizeH, false);
        setVisibility(beta, sizeBeta, false);
        setVisibility(k1, sizeK1, false);
    }

    private void visibility_S_b_e_g_c_h_alpha_beta() {
        setVisibility(s, sizeS, true);
        setVisibility(b, sizeB, true);
        setVisibility(e, sizeE, true);
        setVisibility(g, sizeG, true);
        setVisibility(c, sizeC, true);
        setVisibility(h, sizeH, true);
        setVisibility(alpha, sizeAlpha, true);
        setVisibility(beta, sizeBeta, true);

        setVisibility(e1, sizeE1, false);
        setVisibility(g1, sizeG1, false);
        setVisibility(r, sizeR, false);
        setVisibility(k, sizeK1, false);
        setVisibility(k1, sizeK1, false);
    }

    private void visibility_S_b_e_g_c_R_alpha() {
        setVisibility(s, sizeS, true);
        setVisibility(b, sizeB, true);
        setVisibility(e, sizeE, true);
        setVisibility(g, sizeG, true);
        setVisibility(c, sizeC, true);
        setVisibility(r, sizeR, true);
        setVisibility(alpha, sizeAlpha, true);

        setVisibility(e1, sizeE1, false);
        setVisibility(g1, sizeG1, false);
        setVisibility(h, sizeH, false);
        setVisibility(beta, sizeBeta, false);
        setVisibility(k, sizeK, false);
        setVisibility(k1, sizeK1, false);
    }

    private void visibility_S_b_e_g_e1_g1() {
        setVisibility(s, sizeS, true);
        setVisibility(b, sizeB, true);
        setVisibility(e, sizeE, true);
        setVisibility(g, sizeG, true);
        setVisibility(e1, sizeE1, true);
        setVisibility(g1, sizeG1, true);

        setVisibility(c, sizeC, false);
        setVisibility(h, sizeH, false);
        setVisibility(r, sizeR, false);
        setVisibility(alpha, sizeAlpha, false);
        setVisibility(beta, sizeBeta, false);
        setVisibility(k, sizeK, false);
        setVisibility(k1, sizeK1, false);
    }

    private void visibility_S_b_e_g_e1_g1_h_k() {
        setVisibility(s, sizeS, true);
        setVisibility(b, sizeB, true);
        setVisibility(e, sizeE, true);
        setVisibility(g, sizeG, true);
        setVisibility(e1, sizeE1, true);
        setVisibility(g1, sizeG1, true);
        setVisibility(h, sizeH, true);
        setVisibility(k, sizeK, true);

        setVisibility(r, sizeR, false);
        setVisibility(c, sizeC, false);
        setVisibility(alpha, sizeAlpha, false);
        setVisibility(beta, sizeBeta, false);
        setVisibility(k1, sizeK1, false);
    }

    private void visibility_S_b_e_g_e1_g1_c_alpha() {
        setVisibility(s, sizeS, true);
        setVisibility(b, sizeB, true);
        setVisibility(e, sizeE, true);
        setVisibility(g, sizeG, true);
        setVisibility(e1, sizeE1, true);
        setVisibility(g1, sizeG1, true);
        setVisibility(c, sizeC, true);
        setVisibility(alpha, sizeAlpha, true);

        setVisibility(h, sizeH, false);
        setVisibility(r, sizeR, false);
        setVisibility(beta, sizeBeta, false);
        setVisibility(k, sizeK, false);
        setVisibility(k1, sizeK1, false);
    }

    private void visibility_S_b_e_g_e1_g1_c_r_alpha() {
        setVisibility(s, sizeS, true);
        setVisibility(b, sizeB, true);
        setVisibility(e, sizeE, true);
        setVisibility(g, sizeG, true);
        setVisibility(e1, sizeE1, true);
        setVisibility(g1, sizeG1, true);
        setVisibility(c, sizeC, true);
        setVisibility(r, sizeR, true);
        setVisibility(alpha, sizeAlpha, true);

        setVisibility(h, sizeH, false);
        setVisibility(beta, sizeBeta, false);
        setVisibility(k, sizeK, false);
        setVisibility(k1, sizeK1, false);
    }

    private void visibility_S_b_e_g_e1_g1_c_h_k_alpha() {
        setVisibility(s, sizeS, true);
        setVisibility(b, sizeB, true);
        setVisibility(e, sizeE, true);
        setVisibility(g, sizeG, true);
        setVisibility(e1, sizeE1, true);
        setVisibility(g1, sizeG1, true);
        setVisibility(c, sizeC, true);
        setVisibility(h, sizeH, true);
        setVisibility(k, sizeK, true);
        setVisibility(alpha, sizeAlpha, true);

        setVisibility(r, sizeR, false);
        setVisibility(k1, sizeK1, false);
        setVisibility(beta, sizeBeta, false);
    }

    private void visibility_S_b_e_g_e1_g1_c_h_alpha_beta() {
        setVisibility(s, sizeS, true);
        setVisibility(b, sizeB, true);
        setVisibility(e, sizeE, true);
        setVisibility(g, sizeG, true);
        setVisibility(e1, sizeE1, true);
        setVisibility(g1, sizeG1, true);
        setVisibility(c, sizeC, true);
        setVisibility(h, sizeH, true);
        setVisibility(alpha, sizeAlpha, true);
        setVisibility(beta, sizeBeta, true);

        setVisibility(r, sizeR, false);
        setVisibility(k, sizeK, false);
        setVisibility(k1, sizeK1, false);
    }

    private void visibility_S_b_e_g_e1_g1_c_h_R_alpha_beta() {
        setVisibility(s, sizeS, true);
        setVisibility(b, sizeB, true);
        setVisibility(e, sizeE, true);
        setVisibility(g, sizeG, true);
        setVisibility(e1, sizeE1, true);
        setVisibility(g1, sizeG1, true);
        setVisibility(c, sizeC, true);
        setVisibility(h, sizeH, true);
        setVisibility(r, sizeR, true);
        setVisibility(alpha, sizeAlpha, true);
        setVisibility(beta, sizeBeta, true);

        setVisibility(k, sizeK, false);
        setVisibility(k1, sizeK1, false);
    }

    private void visibility_S_b_k() {
        setVisibility(s, sizeS, true);
        setVisibility(b, sizeB, true);
        setVisibility(k, sizeK, true);

        setVisibility(e, sizeE, false);
        setVisibility(g, sizeG, false);
        setVisibility(e1, sizeE1, false);
        setVisibility(g1, sizeG1, false);
        setVisibility(c, sizeC, false);
        setVisibility(h, sizeH, false);
        setVisibility(r, sizeR, false);
        setVisibility(alpha, sizeAlpha, false);
        setVisibility(beta, sizeBeta, false);
        setVisibility(k1, sizeK1, false);
    }

    private void visibility_S_b_c_k() {
        setVisibility(s, sizeS, true);
        setVisibility(b, sizeB, true);
        setVisibility(c, sizeC, true);
        setVisibility(k, sizeK, true);

        setVisibility(e, sizeE, false);
        setVisibility(g, sizeG, false);
        setVisibility(e1, sizeE1, false);
        setVisibility(g1, sizeG1, false);
        setVisibility(h, sizeH, false);
        setVisibility(r, sizeR, false);
        setVisibility(alpha, sizeAlpha, false);
        setVisibility(beta, sizeBeta, false);
        setVisibility(k1, sizeK1, false);
    }

    private void visibility_S_b_c_k_k1() {
        setVisibility(s, sizeS, true);
        setVisibility(b, sizeB, true);
        setVisibility(c, sizeC, true);
        setVisibility(k, sizeK, true);
        setVisibility(k1, sizeK1, true);

        setVisibility(e, sizeE, false);
        setVisibility(g, sizeG, false);
        setVisibility(e1, sizeE1, false);
        setVisibility(g1, sizeG1, false);
        setVisibility(h, sizeH, false);
        setVisibility(r, sizeR, false);
        setVisibility(alpha, sizeAlpha, false);
        setVisibility(beta, sizeBeta, false);
    }

    private void visibility_k() {
        setVisibility(k, sizeK, true);

        setVisibility(s, sizeS, false);
        setVisibility(b, sizeB, false);
        setVisibility(e, sizeE, false);
        setVisibility(g, sizeG, false);
        setVisibility(e1, sizeE1, false);
        setVisibility(g1, sizeG1, false);
        setVisibility(c, sizeC, false);
        setVisibility(h, sizeH, false);
        setVisibility(r, sizeR, false);
        setVisibility(k1, sizeK1, false);
        setVisibility(alpha, sizeAlpha, false);
        setVisibility(beta, sizeBeta, false);
    }

    //методы показывают только те кнопки, которые необходимы для расчета
    private void GOST5264_C1_C2_C3_C5_C6_C7_Y1ComponentShown(ComponentEvent evt) {
        visibility_S_b_e_g();
    }

    private void GOST5264_C2_C4ComponentShown(ComponentEvent evt) {
        visibility_S_b_e_g_e1_g1();
    }

    private void GOST5264_C11ComponentShown(ComponentEvent evt) {
        visibility_S_b_e_g_alpha();
    }

    private void GOST5264_C10_C15_C17_C19_C25_C8_T6_T8_T9_Y6_Y9ComponentShown(ComponentEvent evt) {
        visibility_S_b_e_g_c_alpha();
    }

    private void GOST5264_C12_C18_C21_C9_Y8ComponentShown(ComponentEvent evt) {
        visibility_S_b_e_g_e1_g1_c_alpha();
    }

    private void GOST5264_C14_C24_C39_C43ComponentShown(ComponentEvent evt) {
        visibility_S_b_e_g_e1_g1_c_h_alpha_beta();
    }

    private void GOST5264_C27ComponentShown(ComponentEvent evt) {
        visibility_S_b_e_g_c_h_alpha_beta();
    }

    private void GOST5264_C20_Y7_Y10_T7ComponentShown(ComponentEvent evt) {
        visibility_S_b_e_g_c_K_alpha();
    }

    private void GOST5264_C13_C23ComponentShown(ComponentEvent evt) {
        visibility_S_b_e_g_e1_g1_c_r_alpha();
    }

    private void GOST5264_C40ComponentShown(ComponentEvent evt) {
        visibility_S_b_e_g_e1_g1_c_h_R_alpha_beta();
    }

    private void GOST5264_C28_Y2ComponentShown(ComponentEvent evt) {
        visibility_S_b_e_g_R();
    }

    private void GOST5264_C16_C26_T5ComponentShown(ComponentEvent evt) {
        visibility_S_b_e_g_c_R_alpha();
    }

    private void GOST5264_T2ComponentShown(ComponentEvent evt) {
        visibility_S_b_e_g_c_K_R_alpha();
    }

    private void GOST5264_C42ComponentShown(ComponentEvent evt) {
        visibility_S_b_e_g_e1_g1_h_k();
    }

    private void GOST5264_C45ComponentShown(ComponentEvent evt) {
        visibility_S_b_e_g_e1_g1_c_h_k_alpha();
    }

    private void GOST5264_Y4ComponentShown(ComponentEvent evt) {
        visibility_S_b_e_g_c();
    }

    private void GOST5264_Y4_1ComponentShown(ComponentEvent evt) {
        visibility_S_b_c_k();
    }

    private void GOST5264_Y5_1ComponentShown(ComponentEvent evt) {
        visibility_S_b_c_k_k1();
    }

    private void GOST5264_Y5ComponentShown(ComponentEvent evt) {
        visibility_S_b_e_g_c_K();
    }

    private void GOST5264_T1_T3ComponentShown(ComponentEvent evt) {
        visibility_S_b_k();
    }

    private void GOST5264_H1_H2ComponentShown(ComponentEvent evt) {
        visibility_k();
    }

    //когда пользователь выбирает вкладку с типом сварного соединения, его все перекидывает на первую вкладку
    private void buttJointsComponentShown(ComponentEvent evt) {
        buttJoints.setSelectedIndex(0);
        visibility_S_b_e_g();
    }

    private void cornerJointsComponentShown(ComponentEvent evt) {
        cornerJoints.setSelectedIndex(0);
        visibility_S_b_e_g();
    }

    private void teeJointsComponentShown(ComponentEvent evt) {
        teeJoints.setSelectedIndex(0);
        visibility_S_b_k();
    }

    private void lapJointsComponentShown(ComponentEvent evt) {
        teeJoints.setSelectedIndex(0);
        visibility_k();

    }

    //при загрузке показывать в панеле parameters компоненты S, b, e, g. Без этого метода показывает К
    private void startFormComponentShown(java.awt.event.ComponentEvent evt) {
        visibility_S_b_e_g();
    }
}
