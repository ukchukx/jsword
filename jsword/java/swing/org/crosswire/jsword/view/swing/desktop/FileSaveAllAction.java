
package org.crosswire.jsword.view.swing.desktop;

import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 * save all the passage windows.
 * 
 * <p><table border='1' cellPadding='3' cellSpacing='0'>
 * <tr><td bgColor='white' class='TableRowColor'><font size='-7'>
 *
 * Distribution Licence:<br />
 * JSword is free software; you can redistribute it
 * and/or modify it under the terms of the GNU General Public License,
 * version 2 as published by the Free Software Foundation.<br />
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.<br />
 * The License is available on the internet
 * <a href='http://www.gnu.org/copyleft/gpl.html'>here</a>, or by writing to:
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330, Boston,
 * MA 02111-1307, USA<br />
 * The copyright to this program is held by it's authors.
 * </font></td></tr></table>
 * @see docs.Licence
 * @author Joe Walker [joe at eireneh dot com]
 * @version $Id$
 */
public class FileSaveAllAction extends DesktopAbstractAction
{
    public FileSaveAllAction(Desktop tools)
    {
        super(tools,
              "Save All",
              "toolbarButtonGraphics/general/SaveAll16.gif",
              "toolbarButtonGraphics/general/SaveAll24.gif",
              "Save All Passages", "Save all the passages.",
              'A', KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK, false));
    }

    public void actionPerformed(ActionEvent ev)
    {
        JOptionPane.showMessageDialog(getDesktop(), "Not implemented");
    }
}
