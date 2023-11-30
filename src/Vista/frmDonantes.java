/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import javax.swing.text.AbstractDocument;

public class frmDonantes extends javax.swing.JFrame {

    public frmDonantes() {
        initComponents();
        this.setLocationRelativeTo(null); 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        casilla_logo = new javax.swing.JPanel();
        ico_logo_40x40 = new javax.swing.JLabel();
        txt_proyecto = new javax.swing.JLabel();
        txt_empresa = new javax.swing.JLabel();
        casilla_modulo = new javax.swing.JPanel();
        btn_atras_ico = new javax.swing.JButton();
        btn_atras_txt = new javax.swing.JButton();
        txt_modulo = new javax.swing.JLabel();
        casilla_formulario = new javax.swing.JPanel();
        txt_nombre = new javax.swing.JLabel();
        txt_correo = new javax.swing.JLabel();
        txt_dni = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JLabel();
        txt_fecha_nacimiento = new javax.swing.JLabel();
        fld_nombre = new javax.swing.JTextField();
        fld_correo = new javax.swing.JTextField();
        fld_dni = new javax.swing.JTextField();
        fld_telefono = new javax.swing.JTextField();
        fld_fecha_nacimiento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_donantes = new javax.swing.JTable();
        casilla_botones = new javax.swing.JPanel();
        btn_eliminar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SABS");
        setBackground(new java.awt.Color(243, 95, 95));
        setSize(new java.awt.Dimension(920, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        casilla_logo.setBackground(new java.awt.Color(243, 95, 95));

        ico_logo_40x40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SABS_Logo_50x50.png"))); // NOI18N
        ico_logo_40x40.setText("jLabel7");

        txt_proyecto.setBackground(new java.awt.Color(255, 255, 255));
        txt_proyecto.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txt_proyecto.setForeground(new java.awt.Color(255, 255, 255));
        txt_proyecto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_proyecto.setText("SISTEMA DE ADMINISTRACIÓN DEL BANCO DE SANGRE");

        txt_empresa.setBackground(new java.awt.Color(255, 255, 255));
        txt_empresa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_empresa.setForeground(new java.awt.Color(255, 204, 204));
        txt_empresa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_empresa.setText("Blood Care Bank");

        javax.swing.GroupLayout casilla_logoLayout = new javax.swing.GroupLayout(casilla_logo);
        casilla_logo.setLayout(casilla_logoLayout);
        casilla_logoLayout.setHorizontalGroup(
            casilla_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(casilla_logoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ico_logo_40x40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(casilla_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(casilla_logoLayout.createSequentialGroup()
                        .addComponent(txt_proyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(417, 417, 417))
                    .addGroup(casilla_logoLayout.createSequentialGroup()
                        .addComponent(txt_empresa)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        casilla_logoLayout.setVerticalGroup(
            casilla_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(casilla_logoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(casilla_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(casilla_logoLayout.createSequentialGroup()
                        .addComponent(txt_proyecto)
                        .addGap(10, 10, 10)
                        .addComponent(txt_empresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ico_logo_40x40))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(casilla_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 70));

        casilla_modulo.setBackground(new java.awt.Color(255, 255, 255));

        btn_atras_ico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_atras_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SABS_Regresar_32x32.png"))); // NOI18N
        btn_atras_ico.setBorder(null);
        btn_atras_ico.setBorderPainted(false);
        btn_atras_ico.setContentAreaFilled(false);
        btn_atras_ico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_atras_ico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atras_icoActionPerformed(evt);
            }
        });

        btn_atras_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_atras_txt.setText("  ATRAS");
        btn_atras_txt.setBorder(null);
        btn_atras_txt.setBorderPainted(false);
        btn_atras_txt.setContentAreaFilled(false);
        btn_atras_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_atras_txt.setFocusPainted(false);
        btn_atras_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atras_txtActionPerformed(evt);
            }
        });

        txt_modulo.setBackground(new java.awt.Color(255, 255, 255));
        txt_modulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt_modulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_modulo.setText("MÓDULO DE REGISTRO DE DONANTES");

        javax.swing.GroupLayout casilla_moduloLayout = new javax.swing.GroupLayout(casilla_modulo);
        casilla_modulo.setLayout(casilla_moduloLayout);
        casilla_moduloLayout.setHorizontalGroup(
            casilla_moduloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(casilla_moduloLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_atras_ico)
                .addGap(0, 0, 0)
                .addComponent(btn_atras_txt)
                .addGap(58, 58, 58)
                .addComponent(txt_modulo)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        casilla_moduloLayout.setVerticalGroup(
            casilla_moduloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(casilla_moduloLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(casilla_moduloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_atras_ico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_modulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_atras_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(casilla_modulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 780, 50));

        casilla_formulario.setBackground(new java.awt.Color(255, 204, 204));

        txt_nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_nombre.setText("NOMBRE :");

        txt_correo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_correo.setText("CORREO  :");

        txt_dni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_dni.setText("DNI          :");

        txt_telefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_telefono.setText("TELÉFONO (CELULAR) :");

        txt_fecha_nacimiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_fecha_nacimiento.setText("FECHA NACIMIENTO  :");

        Document document_nombre = fld_nombre.getDocument();

        DocumentFilter filter_nombre = new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
                // Limitar el número de caracteres permitidos (en este caso, 20)
                if ((fb.getDocument().getLength() + text.length()) <= 20) {
                    super.insertString(fb, offset, text, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                // Limitar el número de caracteres permitidos (en este caso, 20)
                if ((fb.getDocument().getLength() - length + text.length()) <= 20) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        };
        ((AbstractDocument) document_nombre).setDocumentFilter(filter_nombre);
        fld_nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fld_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_nombreActionPerformed(evt);
            }
        });
        fld_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fld_nombreKeyTyped(evt);
            }
        });

        Document document_correo = fld_correo.getDocument();

        DocumentFilter filter_correo = new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
                // Limitar el número de caracteres permitidos (en este caso, 30)
                if ((fb.getDocument().getLength() + text.length()) <= 30) {
                    super.insertString(fb, offset, text, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                // Limitar el número de caracteres permitidos (en este caso, 30)
                if ((fb.getDocument().getLength() - length + text.length()) <= 30) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        };
        ((AbstractDocument) document_correo).setDocumentFilter(filter_correo);
        fld_correo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fld_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_correoActionPerformed(evt);
            }
        });

        Document document_dni = fld_dni.getDocument();

        DocumentFilter filter_dni = new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
                // Limitar el número de caracteres permitidos (en este caso, 8)
                if ((fb.getDocument().getLength() + text.length()) <= 8) {
                    super.insertString(fb, offset, text, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                // Limitar el número de caracteres permitidos (en este caso, 8)
                if ((fb.getDocument().getLength() - length + text.length()) <= 8) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        };
        ((AbstractDocument) document_dni).setDocumentFilter(filter_dni);
        fld_dni.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fld_dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fld_dniKeyTyped(evt);
            }
        });

        Document document_telefono = fld_telefono.getDocument();

        DocumentFilter filter_telefono = new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
                // Limitar el número de caracteres permitidos (en este caso, 9)
                if ((fb.getDocument().getLength() + text.length()) <= 9) {
                    super.insertString(fb, offset, text, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                // Limitar el número de caracteres permitidos (en este caso, 9)
                if ((fb.getDocument().getLength() - length + text.length()) <= 9) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        };
        ((AbstractDocument) document_telefono).setDocumentFilter(filter_telefono);
        fld_telefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fld_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_telefonoActionPerformed(evt);
            }
        });
        fld_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fld_telefonoKeyTyped(evt);
            }
        });

        Document document_fecha = fld_fecha_nacimiento.getDocument();

        DocumentFilter filter_fecha = new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
                // Limitar el número de caracteres permitidos (en este caso, 10)
                if ((fb.getDocument().getLength() + text.length()) <= 10) {
                    super.insertString(fb, offset, text, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                // Limitar el número de caracteres permitidos (en este caso, 10)
                if ((fb.getDocument().getLength() - length + text.length()) <= 10) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        };
        ((AbstractDocument) document_fecha).setDocumentFilter(filter_fecha);
        fld_fecha_nacimiento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fld_fecha_nacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_fecha_nacimientoActionPerformed(evt);
            }
        });
        fld_fecha_nacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fld_fecha_nacimientoKeyTyped(evt);
            }
        });

        tbl_donantes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_donantes);

        javax.swing.GroupLayout casilla_formularioLayout = new javax.swing.GroupLayout(casilla_formulario);
        casilla_formulario.setLayout(casilla_formularioLayout);
        casilla_formularioLayout.setHorizontalGroup(
            casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(casilla_formularioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(casilla_formularioLayout.createSequentialGroup()
                        .addGroup(casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_fecha_nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fld_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(fld_fecha_nacimiento)))
                    .addGroup(casilla_formularioLayout.createSequentialGroup()
                        .addGroup(casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_dni)
                            .addGroup(casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_correo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(10, 10, 10)
                        .addGroup(casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fld_correo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fld_dni, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fld_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        casilla_formularioLayout.setVerticalGroup(
            casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(casilla_formularioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(casilla_formularioLayout.createSequentialGroup()
                        .addGroup(casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fld_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(casilla_formularioLayout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fld_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_telefono)))
                            .addGroup(casilla_formularioLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_correo)
                                    .addComponent(fld_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_dni)
                                    .addComponent(fld_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fld_fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(casilla_formulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 780, 220));

        casilla_botones.setBackground(new java.awt.Color(255, 255, 255));
        casilla_botones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_eliminar.setBackground(new java.awt.Color(243, 95, 95));
        btn_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 204, 204));
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        casilla_botones.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 110, 40));

        btn_editar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(243, 95, 95));
        btn_editar.setText("EDITAR");
        btn_editar.setContentAreaFilled(false);
        btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        casilla_botones.add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 110, 40));

        btn_registrar.setBackground(new java.awt.Color(255, 204, 204));
        btn_registrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(243, 95, 95));
        btn_registrar.setText("REGISTRAR"); // NOI18N
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        casilla_botones.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 110, 40));

        btn_aceptar.setBackground(new java.awt.Color(255, 204, 204));
        btn_aceptar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_aceptar.setForeground(new java.awt.Color(243, 95, 95));
        btn_aceptar.setText("ACEPTAR");
        btn_aceptar.setToolTipText("");
        btn_aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });
        casilla_botones.add(btn_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 110, 40));

        btn_cancelar.setBackground(new java.awt.Color(243, 95, 95));
        btn_cancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 204, 204));
        btn_cancelar.setText("CANCELAR");
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        casilla_botones.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 40));

        getContentPane().add(casilla_botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 780, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fld_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_nombreActionPerformed

    private void fld_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_correoActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_atras_icoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atras_icoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_atras_icoActionPerformed

    private void fld_fecha_nacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_fecha_nacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_fecha_nacimientoActionPerformed

    private void fld_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fld_nombreKeyTyped
        char c=evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')&&(c<'0'||c>'9')) evt.consume();
    }//GEN-LAST:event_fld_nombreKeyTyped

    private void fld_fecha_nacimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fld_fecha_nacimientoKeyTyped
        char c=evt.getKeyChar();
        if((c<'0'||c>'9')&&(c!='-')) evt.consume();
    }//GEN-LAST:event_fld_fecha_nacimientoKeyTyped

    private void fld_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fld_telefonoKeyTyped
        char c=evt.getKeyChar();
        if((c<'0'||c>'9')) evt.consume();
    }//GEN-LAST:event_fld_telefonoKeyTyped

    private void fld_dniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fld_dniKeyTyped
        char c=evt.getKeyChar();
        if((c<'0'||c>'9')) evt.consume();
    }//GEN-LAST:event_fld_dniKeyTyped

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void fld_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_telefonoActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_atras_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atras_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_atras_txtActionPerformed

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
            java.util.logging.Logger.getLogger(frmDonantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDonantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDonantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDonantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDonantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_aceptar;
    public javax.swing.JButton btn_atras_ico;
    public javax.swing.JButton btn_atras_txt;
    public javax.swing.JButton btn_cancelar;
    public javax.swing.JButton btn_editar;
    public javax.swing.JButton btn_eliminar;
    public javax.swing.JButton btn_registrar;
    private javax.swing.JPanel casilla_botones;
    private javax.swing.JPanel casilla_formulario;
    private javax.swing.JPanel casilla_logo;
    private javax.swing.JPanel casilla_modulo;
    public javax.swing.JTextField fld_correo;
    public javax.swing.JTextField fld_dni;
    public javax.swing.JTextField fld_fecha_nacimiento;
    public javax.swing.JTextField fld_nombre;
    public javax.swing.JTextField fld_telefono;
    private javax.swing.JLabel ico_logo_40x40;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbl_donantes;
    private javax.swing.JLabel txt_correo;
    private javax.swing.JLabel txt_dni;
    private javax.swing.JLabel txt_empresa;
    private javax.swing.JLabel txt_fecha_nacimiento;
    private javax.swing.JLabel txt_modulo;
    private javax.swing.JLabel txt_nombre;
    private javax.swing.JLabel txt_proyecto;
    private javax.swing.JLabel txt_telefono;
    // End of variables declaration//GEN-END:variables
}
