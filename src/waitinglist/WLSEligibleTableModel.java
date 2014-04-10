/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package waitinglist;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Casper
 */
public class WLSEligibleTableModel extends DefaultTableModel {
    
    public WLSEligibleTableModel() {
        super(new String[]{"Check", "CWID", "FName", "LName", "Units completed", "Visa Status", "Current units"}, 0);
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        Class clazz = String.class;
            switch (columnIndex) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    clazz = Integer.class;
                    break;
                case 0:
                    clazz = Boolean.class;
                    break;
            }
            return clazz;
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            return column == 0;
        }

        @Override
        public void setValueAt(Object aValue, int row, int column) {
            if (aValue instanceof Boolean && column == 0) {
            //get seat available
            //get how many people selected.
                int availSeats = Find.getAvailSeats();
                int studentsSelected = Find.getStudentsSelected();
                if ( ( (Boolean)aValue == true ) && ( availSeats == studentsSelected)){
                    System.out.println("no more selecttion!!!!!!!!!!!!!!!!!!");
                }
                System.out.println("column: " + row + ", value: " + aValue);
                Vector rowData = (Vector)getDataVector().get(row);
                rowData.set(0, (boolean)aValue);
                fireTableCellUpdated(row, column);

                Students aStudent = (Students)Find.eligibleListModel.getElementAt(row);
                aStudent.setSelected((boolean)aValue);
                System.out.println("Students = " + aStudent.toString() + ", isSelected : " + aStudent.getSelected()
                            + ", seats : " + Find.getAvailSeats() + ", stuSelected : " + Find.getStudentsSelected());
            }
        }
        
    }
