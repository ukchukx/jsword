
package org.crosswire.jsword.book.raw;

import java.io.IOException;

import org.crosswire.common.util.LogicError;
import org.crosswire.jsword.passage.BibleInfo;
import org.crosswire.jsword.passage.Verse;

/**
 * InstsDisk is a Base implementation of the Insts interface using the in
 * on disk model (Disk).
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
public abstract class InstsDisk extends Disk implements Insts
{
    /**
     * Basic constructor
     * @param raw Reference to the RawBible that is using us
     * @param create Should we start all over again
     */
    public InstsDisk(RawBible raw, String leafname, boolean create) throws IOException
    {
        ctor(raw, leafname, create);
    }

    /**
     * Create a WordResource from a File that contains the dictionary.
     * @param raw Reference to the RawBible that is using us
     * @param create Should we start all over again
     * @param messages We append stuff here if something went wrong
     */
    public InstsDisk(RawBible raw, String leafname, boolean create, StringBuffer messages)
    {
        try
        {
            ctor(raw, leafname, create);
        }
        catch (Exception ex)
        {
            messages.append(""+ex);
        }
    }

    /**
     * This really should be a constructor, however the StringBuffer ctor
     * wants to trap and muffle exceptions.
     * |I can't do this:
     * <code>try { this(...) } ...</code>
     * @param raw Reference to the RawBible that is using us
     * @param leafname The leaf name to read/write
     * @param create Should we start all over again
     */
    private void ctor(RawBible newraw, String newleafname, boolean newcreate) throws IOException
    {
        this.raw = newraw;
        this.leafname = newleafname;
        this.create = newcreate;

        index = new long[BibleInfo.versesInBible()];

        if (newcreate)
        {
            save();
        }
        else
        {
            load();
        }
    }

    /**
     * Load the Resource from a named file
     */
    public abstract void load() throws IOException;

    /**
     * Lzay resources can not be used for creation
     * @param out The stream to write to
     */
    public void save()
    {
        // You must use a WordInstsMem to write data
        throw new LogicError();
    }

    /**
     * Retrieve an ordered list of the words in a Verse
     * @param verse The Verse to retrieve words for
     * @return An array of word indexes
     */
    public int[] getIndexes(Verse verse)
    {
        return getIndexes(verse.getOrdinal());
    }

    /**
     * Set a list of word indexes as the test to a Verse
     * @param verse The Verse to set the words for
     * @param indexes The array of word indexes
     */
    public void setIndexes(int[] indexes, Verse verse)
    {
        throw new Error("You must use a PuncInstsMem to write data");
    }

    /** The file offsets */
    protected long[] index;

    /** Are we allowed to create new indexes */
    protected boolean create;

    /** The leafname of the file read */
    protected String leafname;

    /** The RawBible co-ordinated the various classes that cache the files */
    protected RawBible raw;
}
