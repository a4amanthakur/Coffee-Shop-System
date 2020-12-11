package coffeeshopsystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

import java.io.FileWriter;  
public class CoffeeShopHome extends javax.swing.JFrame implements ActionListener{

    CoffeeShopHome()
    {

    }
    public CoffeeShopHome(int i) {
        initComponents();
        finalBill=new StringBuilder("No any order...");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        pnlParent = new javax.swing.JPanel();
        pnlSide = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnOrderCoffee = new javax.swing.JButton();
        btnOrderDetails = new javax.swing.JButton();
        btnOwner = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        pnlHeadBar = new javax.swing.JPanel();
        pnlLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblLogoText = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnOrderNow = new javax.swing.JButton();
        lblLogoText1 = new javax.swing.JLabel();
        btnCalculatePrice = new javax.swing.JButton();
        txtGrandTotal = new javax.swing.JTextField();
        pnlDetails = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlParent.setBackground(new java.awt.Color(254, 254, 254));

        pnlSide.setBackground(new java.awt.Color(1, 39, 40));


        setVisible(true);

        setResizable(false);
        btnHome.setBackground(new java.awt.Color(1, 39, 40));
        btnHome.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(254, 254, 254));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/home.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.setBorderPainted(false);
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHome.setIconTextGap(25);
        btnHome.addActionListener(this);


        

        jPanel1.setBackground(new java.awt.Color(212, 47, 34));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );
        btnOrderCoffee.setBackground(new java.awt.Color(1, 39, 40));
        btnOrderCoffee.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnOrderCoffee.setForeground(new java.awt.Color(254, 254, 254));
        btnOrderCoffee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/coffee.png"))); // NOI18N
        btnOrderCoffee.setText("Coffee Menu");
        btnOrderCoffee.setBorderPainted(false);
        btnOrderCoffee.setIconTextGap(25);
        btnOrderCoffee.addActionListener(this);


        btnOrderDetails.setBackground(new java.awt.Color(1, 39, 40));
        btnOrderDetails.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnOrderDetails.setForeground(new java.awt.Color(254, 254, 254));
        btnOrderDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/order.png"))); // NOI18N
        btnOrderDetails.setText("My Order");
        btnOrderDetails.setBorderPainted(false);
        btnOrderDetails.setIconTextGap(25);
        btnOrderDetails.addActionListener(this);


        btnOwner.setBackground(new java.awt.Color(1, 39, 40));
        btnOwner.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnOwner.setForeground(new java.awt.Color(254, 254, 254));
        btnOwner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/owner.png"))); // NOI18N
        btnOwner.setText("Owner");
        btnOwner.setBorderPainted(false);
        btnOwner.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnOwner.setIconTextGap(25);
        btnOwner.addActionListener(this);


        btnReset.setBackground(new java.awt.Color(1, 39, 40));
        btnReset.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnReset.setForeground(new java.awt.Color(254, 254, 254));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/reset.png"))); // NOI18N
        btnReset.setText("Reset all");
        btnReset.setBorderPainted(false);
        btnReset.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReset.setIconTextGap(25);
        btnReset.addActionListener(this);
       
        btnHelp.setVisible(false); 
        btnHelp.setBackground(new java.awt.Color(1, 39, 40));
        btnHelp.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnHelp.setForeground(new java.awt.Color(254, 254, 254));
        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/help.png"))); // NOI18N
        btnHelp.setText("Help");
        btnHelp.setBorderPainted(false);
        btnHelp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHelp.setIconTextGap(25);
        btnHelp.addActionListener(this);

        javax.swing.GroupLayout pnlSideLayout = new javax.swing.GroupLayout(pnlSide);
        pnlSide.setLayout(pnlSideLayout);
        pnlSideLayout.setHorizontalGroup(
            pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addGroup(pnlSideLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnOrderCoffee)
                        .addComponent(btnOrderDetails)
                        .addComponent(btnHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlSideLayout.createSequentialGroup()
                        .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnReset, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOwner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0))))
        );
        pnlSideLayout.setVerticalGroup(
            pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSideLayout.createSequentialGroup()
                        .addComponent(btnHome)
                        .addGap(0, 0, 0)
                        .addComponent(btnOrderCoffee)
                        .addGap(0, 0, 0)
                        .addComponent(btnOrderDetails)
                        .addGap(0, 0, 0)
                        .addComponent(btnOwner)
                        .addGap(0, 0, 0)
                        .addComponent(btnReset))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(btnHelp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlHeadBar.setBackground(new java.awt.Color(212, 47, 34));

        javax.swing.GroupLayout pnlHeadBarLayout = new javax.swing.GroupLayout(pnlHeadBar);
        pnlHeadBar.setLayout(pnlHeadBarLayout);
        pnlHeadBarLayout.setHorizontalGroup(
            pnlHeadBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlHeadBarLayout.setVerticalGroup(
            pnlHeadBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        pnlLogo.setBackground(new java.awt.Color(212, 47, 34));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/chef.png"))); // NOI18N

        lblLogoText.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        lblLogoText.setForeground(new java.awt.Color(254, 254, 254));
        lblLogoText.setText("Coffee Shop");

        javax.swing.GroupLayout pnlLogoLayout = new javax.swing.GroupLayout(pnlLogo);
        pnlLogo.setLayout(pnlLogoLayout);
        pnlLogoLayout.setHorizontalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLogoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogo)
                .addGap(54, 54, 54))
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogoText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLogoLayout.setVerticalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogoText)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(212, 47, 34));

        btnOrderNow.setBackground(new java.awt.Color(1, 39, 40));
        btnOrderNow.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnOrderNow.setForeground(new java.awt.Color(254, 254, 254));
        btnOrderNow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/coffee.png"))); // NOI18N
        btnOrderNow.setText("Order Now");
        btnOrderNow.setBorderPainted(false);
        btnOrderNow.setOpaque(true);
        btnOrderNow.addActionListener(this);
        lblLogoText1.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        lblLogoText1.setForeground(new java.awt.Color(254, 254, 254));
        lblLogoText1.setText("Grand Total : ");

        btnCalculatePrice.setBackground(new java.awt.Color(1, 39, 40));
        btnCalculatePrice.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnCalculatePrice.setForeground(new java.awt.Color(254, 254, 254));
        btnCalculatePrice.setText("Click Order Now");
        btnCalculatePrice.setBorderPainted(false);
        btnCalculatePrice.setOpaque(true);

        btnCalculatePrice.setEnabled(false);

        txtGrandTotal.setEditable(false);
        txtGrandTotal.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        txtGrandTotal.setText("0$");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnCalculatePrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(lblLogoText1)
                .addGap(1, 1, 1)
                .addComponent(txtGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOrderNow)
                .addGap(66, 66, 66))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrderNow)
                    .addComponent(lblLogoText1)
                    .addComponent(btnCalculatePrice)
                    .addComponent(txtGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );









     javax.swing.GroupLayout pnlDetailsLayout = new javax.swing.GroupLayout(pnlDetails);
        pnlDetails.setLayout(pnlDetailsLayout);
        pnlDetailsLayout.setHorizontalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        pnlDetailsLayout.setVerticalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlParentLayout = new javax.swing.GroupLayout(pnlParent);
        pnlParent.setLayout(pnlParentLayout);
        pnlParentLayout.setHorizontalGroup(
            pnlParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParentLayout.createSequentialGroup()
                .addComponent(pnlSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlHeadBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlParentLayout.createSequentialGroup()
                        .addGroup(pnlParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlParentLayout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(pnlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlParentLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(pnlDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlParentLayout.setVerticalGroup(
            pnlParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlParentLayout.createSequentialGroup()
                .addComponent(pnlHeadBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlParent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlParent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();    }// </editor-fold>                        

 /* public static void main(String args[]) {
      
                new CoffeeShopHome(1);
           
    }
    */
    public void actionPerformed(ActionEvent evt)
    {
        Object clicked=evt.getSource();
        connectdb=new ConnectDB();
        
        if(clicked==btnHome)
        {
            //System.out.println("btn home clicked");
        }


        if(clicked==btnOwner)
        {
            finalBill.append(" ");
            new AdminLogin(finalBill);
            dispose();
        }

        if(clicked==btnOrderDetails)
        {
            JOptionPane.showMessageDialog(this,"::::::::::::::::::::Your Order Details::::::::::::::::\n"+finalBill.toString());   
        }

        if(clicked==btnReset)
        {
            if(totalRows==0)
            {
                JOptionPane.showMessageDialog(this,"No any coffee selected");
            }
            else
            {
                for(i=0;i<totalRows-1;i++)
                {
                    chkCoffee[i].setSelected(false);
                }
                txtGrandTotal.setText("0$");
            }
        }


        //fetching coffee menu-------------------------------------------------
        if(clicked==btnOrderCoffee)
        {   

            //heading::::::::
            JLabel lblName=new JLabel("Name");
            lblName.setFont(new java.awt.Font("Ubuntu", 1, 18));
            lblName.setForeground(new java.awt.Color(26, 12, 12));

            JLabel lblPrice=new JLabel("Price ($) ");
            lblPrice.setFont(new java.awt.Font("Ubuntu", 1, 18));
            lblPrice.setForeground(new java.awt.Color(26, 12, 12));


            JLabel lblQua=new JLabel("Quantity");
            lblQua.setFont(new java.awt.Font("Ubuntu", 1, 18));
            lblQua.setForeground(new java.awt.Color(26, 12, 12));

            //pnlDetails.setBounds(290,200, 600, 300);//(x(right),y(down),width,height)
            JScrollPane scrollPane = new JScrollPane();
            scrollPane.setBounds(0, 0, 560, 350);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            pnlDetails.add(scrollPane);

            JPanel borderlaoutpanel = new JPanel();

            scrollPane.setViewportView(borderlaoutpanel);
            borderlaoutpanel.setLayout(new BorderLayout(0, 0));

            JPanel columnpanel = new JPanel();
            borderlaoutpanel.add(columnpanel, BorderLayout.NORTH);
             columnpanel.setLayout(new GridLayout(0, 1, 0, 1));
             columnpanel.setBackground(Color.gray);



              try
              {
                   //connect to db:
                con=connectdb.connect();
                //create statement:
                ps=con.prepareStatement("SELECT * FROM inventry order by item",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                //execute statement/query
                rs=ps.executeQuery();
                rs.last();
                    


                    totalRows=rs.getRow();
                     chkCoffee = new javax.swing.JCheckBox[totalRows];
                     lblItemPrice = new javax.swing.JLabel[totalRows];
                     spnQuantity = new javax.swing.JSpinner[totalRows];

                 
                
                    rs.first();
                    JPanel rowPanel1 = new JPanel();
                    rowPanel1.setPreferredSize(new Dimension(300,30));
                    columnpanel.add(rowPanel1);
                    rowPanel1.setLayout(new GridLayout(1,3));

                        rowPanel1.add(lblName);
                        rowPanel1.add(lblPrice);
                        rowPanel1.add(lblQua);
                i=0;
                while(rs.next())
                {
                    JPanel rowPanel = new JPanel();
                    rowPanel.setPreferredSize(new Dimension(300,30));
                    columnpanel.add(rowPanel);
                    rowPanel.setLayout(new GridLayout(1,3));

                     chkCoffee[i] = new javax.swing.JCheckBox(rs.getString(2));
                     chkCoffee[i].setFont(new java.awt.Font("Ubuntu", 0, 17));

                     lblItemPrice[i] = new javax.swing.JLabel(rs.getString(3));
                     lblItemPrice[i].setFont(new java.awt.Font("Ubuntu", 0, 17));

                     spnQuantity[i] = new javax.swing.JSpinner();
                     spnQuantity[i].setFont(new java.awt.Font("Ubuntu", 0, 17));
              
                    rowPanel.add(chkCoffee[i]);
                    rowPanel.add(lblItemPrice[i]);
                    rowPanel.add(spnQuantity[i]);
                    i++;

                }//end of while
              }
              catch(Exception e)
              {
                System.out.println("Exception:"+e);
              }

     }//end of btnOrderCoffee;
     //END OF FETCHING COFFEE MENU---------------------------------------

     // fetching details from checkboxs-----------------------------------
      if(clicked==btnOrderNow)
      {
        int itemPrice=0,quantityPrice=0,itemQuantity=0;
        grandTotal=0;
        count=1;
        StringBuilder itemsPurchased=new StringBuilder("");
        
        finalBill.delete(0,finalBill.length());
        //formating bill:::
        finalBill.append("***********Transaction Number: "+transactionNum+"************\n");
        finalBill.append("===========================================\n");
        finalBill.append("              Coffee Shop Bill             \n");
        finalBill.append("===========================================\n");
        for(i=0;i<totalRows-1;i++)
        {
            if(chkCoffee[i].isSelected())
            {
                try
                {   

                    itemQuantity=Integer.parseInt(spnQuantity[i].getValue().toString());
                    if(itemQuantity!=0)
                    {
                        itemPrice=Integer.parseInt(lblItemPrice[i].getText().toString());
                        quantityPrice=itemQuantity*itemPrice;
                        grandTotal=grandTotal+quantityPrice;
                        System.out.println("grandTotal:"+grandTotal);
                        finalBill.append(count+". "+chkCoffee[i].getText().toString()+" :  Quantity: "+itemQuantity +" :  Price: "+quantityPrice+"\n");
                        itemsPurchased.append(chkCoffee[i].getText().toString()+", ");
                        count++;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,chkCoffee[i].getText().toString()+" Quantity 0. \n Please Select Quantity to Proceed");
                    }
                    
                     
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this,"Please enter a valid Quantity");

                }
            }
            
        }
        
        finalBill.append("-------------------------------------------\n");
        finalBill.append("Grand Total : "+grandTotal+"$\n");
       
        txtGrandTotal.setText(grandTotal+"$");
        int o=JOptionPane.showConfirmDialog(this,finalBill.toString()+"*DO YOU WANT TO PROCEED ( YES / NO ) ?\n");
        
        if(o==JOptionPane.YES_OPTION)
        {

            transactionNum++;  
            JOptionPane.showMessageDialog(this,"Please wait for the owner...\n Thank you.");  
            try
            {
                connectdb=new ConnectDB();
               //connect to db:
                con=connectdb.connect();
               //create statement:
                 StringBuilder id=new StringBuilder("");
                 int ran= (int)(5 + (Math.random() * 394898));
                id.append(itemsPurchased.toString().substring(0,2)+":"+ran);

                ps=con.prepareStatement("insert into pendingtransaction values(?,?,?)");
                ps.setString(1,id.toString());
                ps.setString(2,itemsPurchased.toString());
                ps.setString(3,String.valueOf(grandTotal));
                ran=ps.executeUpdate();
                if(ran==1)
                {
                   new AdminLogin(finalBill);
                   dispose(); 
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Please Select Items again.");
                }

                
            } 
            catch(Exception e)
            {
                System.out.println("Exception is: "+e);
            }
           

        }    

        } 
       

      

     //end of fetching details from checkboxes-----------------------------

    }//end of action listener


    // Variables declaration - do not modify    
    int totalRows=0,i=0,count=0,grandTotal=0,transactionNum=1;
    StringBuilder finalBill;
                ConnectDB connectdb;
                Connection con;
                ResultSet rs;
                PreparedStatement ps;                 
    private javax.swing.JButton btnCalculatePrice;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnOrderCoffee;
    private javax.swing.JButton btnOrderDetails;
    private javax.swing.JButton btnOrderNow;
    private javax.swing.JButton btnOwner;
    private javax.swing.JButton btnReset;
    private javax.swing.JCheckBox chkCoffee[];
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPaneDetails;
    private javax.swing.JTextField txtGrandTotal;
    private javax.swing.JLabel lblItemPrice[];
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogoText;
    private javax.swing.JLabel lblLogoText1;
    private javax.swing.JPanel pnlHeadBar;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlParent;
    private javax.swing.JPanel pnlDetails;
    private javax.swing.JPanel pnlRowContent;
    private javax.swing.JPanel pnlSide;
    private javax.swing.JSpinner spnQuantity[];
    // End of variables declaration                   
}
