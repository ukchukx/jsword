package org.crosswire.jsword.book.search.lucene;

import org.crosswire.common.util.MsgBase;

/**
 * Compile safe Msg resource settings.
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
 * @see gnu.gpl.Licence
 * @author Joe Walker [joe at eireneh dot com]
 * @version $Id$
 */
class Msg extends MsgBase
{
    static final Msg TYPE_INDEXGEN = new Msg("LuceneIndexManager.TypeIndexGen"); //$NON-NLS-1$
    static final Msg INDEX_START = new Msg("LuceneIndexManager.Indexing"); //$NON-NLS-1$

    static final Msg LUCENE_INIT = new Msg("LuceneIndex.LuceneInit"); //$NON-NLS-1$
    static final Msg SEARCH_FAILED = new Msg("LuceneIndex.SearchFailed"); //$NON-NLS-1$
    static final Msg INDEXING = new Msg("LuceneIndex.Indexing"); //$NON-NLS-1$
    static final Msg OPTIMIZING = new Msg("LuceneIndex.Optimizing"); //$NON-NLS-1$
    static final Msg DELETE_FAILED = new Msg("LuceneIndex.DeleteFailed"); //$NON-NLS-1$
    static final Msg INSTALL_FAIL = new Msg("LuceneIndex.InstallFailed"); //$NON-NLS-1$

    /**
     * Passthrough ctor
     */
    private Msg(String name)
    {
        super(name);
    }
}
