/**
 * Distribution License:
 * JSword is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License, version 2.1 or later
 * as published by the Free Software Foundation. This program is distributed
 * in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * The License is available on the internet at:
 *       http://www.gnu.org/copyleft/lgpl.html
 * or by writing to:
 *      Free Software Foundation, Inc.
 *      59 Temple Place - Suite 330
 *      Boston, MA 02111-1307, USA
 *
 * Copyright: 2005
 *     The copyright to this program is held by it's authors.
 *
 */
package org.crosswire.common.util;

import java.util.logging.Level;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * Tests the Logger class
 */
public class LoggerTest  extends TestCase {
    /**
     * Test should log.
     */
    @Test
    public void testShouldLog() {
        Logger l = Logger.getLogger(LoggerTest.class);
        l.setLevel(Level.INFO);
        
        assertTrue(l.shouldLog(Level.WARNING));
        assertTrue(l.shouldLog(Level.INFO));
        assertFalse(l.shouldLog(Level.FINE));
    }
}