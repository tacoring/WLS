/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package waitinglist;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Casper
 */
public class WLSWaitingTableModel extends DefaultTableModel {

        public WLSWaitingTableModel() {
          super(new String[]{"CWID", "FName", "LName", "Units completed", "Visa Status", "Current units"}, 0);
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
          Class clazz = String.class;
          switch (columnIndex) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
              clazz = Integer.class;
              break;
          }
          return clazz;
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }

//        @Override
//        public void setValueAt(Object aValue, int row, int column) {
//          if (aValue instanceof Boolean && column == 0) {
//            System.out.println("column: " + row + ", value: " + aValue);
//            Vector rowData = (Vector)getDataVector().get(row);
//            rowData.set(0, (boolean)aValue);
//            fireTableCellUpdated(row, column);
//            
//            Students aStudent = (Students)eligibleListModel.getElementAt(row);
//            aStudent.setSelected((boolean)aValue);
//            System.out.println("Students = " + aStudent.toString() + ", isSelected : " + aStudent.getSelected());
//          }
//        }
    }
