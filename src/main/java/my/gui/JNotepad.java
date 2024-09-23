/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;


public class JNotepad extends JFrame {
    private JMenuBar menuBar;
    private JMenu mFile,mEdit,mFormat,mView,mHelp,mZoom;
    private JMenuItem itemNew, itemNewWindow,itemOpen,itemSave,itemSaveAs,itemPageSetup,itemPrint,itemExit,itemUndo, itemCut, itemCopy, itemPaste, itemDelete, itemSearchwithBing, itemFind, itemFindnext, itemFindPrevious, itemReplace, itemGoto, itemSelectAll, itemTimeDate;
    private JMenuItem itemWordWrap, itemFont, itemZoomIn, itemZoomOut, itemRestoreDefaultZoom, itemStatusBar, itemViewHelp, itemSendFeedback, itemAboutNotepad;
    private JCheckBoxMenuItem itemWrap;

    public JNotepad(String title)
   {
       super(title);
       setTitle("JNotepad");
       createMenu();
       createGui();
       setSize(800,600);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
   }
   private void createMenu(){
       //Đối tượng thanh thực đơn
       menuBar = new JMenuBar();
       //Tạo các thực đơn vào thanh thực đơn
       menuBar.add(mFile=new JMenu("File"));
       menuBar.add(mEdit=new JMenu("Edit"));
       menuBar.add(mFormat=new JMenu("Format"));
       menuBar.add(mView=new JMenu("View"));
       menuBar.add(mHelp=new JMenu("Help"));
       
       
       mFile.add(itemNew=new JMenuItem("New"));
       mFile.add(itemNewWindow = new JMenuItem("New Window"));
       mFile.add(itemOpen=new JMenuItem("Open..."));
       mFile.add(itemSave=new JMenuItem("Save"));
       mFile.add(itemSaveAs=new JMenuItem("Save As..."));
       mFile.add(new JSeparator());
       mFile.add(itemPageSetup=new JMenuItem("Page Setup..."));
       mFile.add(itemPrint=new JMenuItem("Print"));
       mFile.addSeparator();
       mFile.add(itemExit=new JMenuItem("Exit"));
       
       mEdit.add(itemUndo=new JMenuItem("Undo"));
       mEdit.add(new JSeparator());
       mEdit.add(itemCut=new JMenuItem("Cut"));
       mEdit.add(itemCopy=new JMenuItem("Copy"));
       mEdit.add(itemPaste=new JMenuItem("Paste"));
       mEdit.add(itemDelete=new JMenuItem("Delete"));
       mEdit.addSeparator();
       mEdit.add(itemSearchwithBing=new JMenuItem("Search with Bing..."));
       mEdit.add(itemFind=new JMenuItem("Find..."));
       mEdit.add(itemFindnext=new JMenuItem("Find Next"));
       mEdit.add(itemFindPrevious=new JMenuItem("Find Previous"));
       mEdit.add(itemReplace=new JMenuItem("Replace..."));
       mEdit.add(itemGoto=new JMenuItem("Go to..."));
       mEdit.addSeparator();
       mEdit.add(itemSelectAll=new JMenuItem("Select All"));
       mEdit.add(itemTimeDate=new JMenuItem("Time/Date"));
       
       mFormat.add(itemWordWrap=new JCheckBoxMenuItem("Word Wrap"));
       mFormat.add(itemFont=new JMenuItem("Font..."));
       
       mView.add(mZoom=new JMenu("Zoom"));
       mZoom.add(itemZoomIn=new JMenuItem("Zoom In"));
       mZoom.add(itemZoomOut=new JMenuItem("Zoom Out"));
       mZoom.add(itemRestoreDefaultZoom=new JMenuItem("Restore Default Zoom"));
       mView.add(itemStatusBar=new JCheckBoxMenuItem("Status Bar"));
       
       mHelp.add(itemViewHelp=new JMenuItem("View Help"));
       mHelp.add(itemSendFeedback=new JMenuItem("Send Feedback"));
       mHelp.add(new JSeparator());
       mHelp.add(itemAboutNotepad=new JMenuItem("About Notepad"));
       
       //Tạo phím nóng cho các item
       itemNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_DOWN_MASK));
       itemNewWindow.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK | KeyEvent.SHIFT_DOWN_MASK));
       itemOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,KeyEvent.CTRL_DOWN_MASK));
       itemSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_DOWN_MASK));
       itemSaveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_DOWN_MASK));
       itemPrint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,KeyEvent.CTRL_DOWN_MASK));
       
       itemUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,KeyEvent.CTRL_DOWN_MASK));
       itemCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,KeyEvent.CTRL_DOWN_MASK));
       itemCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,KeyEvent.CTRL_DOWN_MASK));
       itemPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,KeyEvent.CTRL_DOWN_MASK));
       itemDelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE,0));
       itemSearchwithBing.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,KeyEvent.CTRL_DOWN_MASK));
       itemFind.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,KeyEvent.CTRL_DOWN_MASK));
       itemFindnext.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3,0));
       itemFindPrevious.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3,KeyEvent.SHIFT_DOWN_MASK));
       itemReplace.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,KeyEvent.CTRL_DOWN_MASK));
       itemGoto.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,KeyEvent.CTRL_DOWN_MASK));
       itemSelectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,KeyEvent.CTRL_DOWN_MASK));
       itemTimeDate.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5,0));
       
       itemZoomIn.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, KeyEvent.CTRL_DOWN_MASK));
       itemZoomOut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, KeyEvent.CTRL_DOWN_MASK));
       itemRestoreDefaultZoom.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, KeyEvent.CTRL_DOWN_MASK));
       setJMenuBar(menuBar);
   }  

    private void createGui() {}
    private void processEvent(){
        //Tiếp nhận sự kiện (event) cho itemExit
        itemExit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(JOptionPane.showConfirmDialog(null,"Are you to exit?")==JOptionPane.YES_OPTION)
                {
                    System.exit(0);
                }
            }
        });
    }

}
