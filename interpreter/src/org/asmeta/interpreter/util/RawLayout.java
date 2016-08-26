/*******************************************************************************
 * Copyright (c) 2005, 2006 ASMETA group (http://asmeta.sourceforge.net)
 * License Information: http://asmeta.sourceforge.net/licensing/
 * 
 *   This program is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License version 2 as
 *   published by the Free Software Foundation.
 * 
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 * 
 *   You should have received a copy of the GNU General Public License
 *   along with this program; if not, write to the Free Software
 *   Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301
 *   USA
 * 
 *   http://www.gnu.org/licenses/gpl.txt
 * 
 *   
 *******************************************************************************/

/*
 * RawLayout.java
 *
 * Created on 10 luglio 2006, 14.52
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.asmeta.interpreter.util;

import org.apache.log4j.Layout;
import org.apache.log4j.spi.LoggingEvent;

/**
 * A raw layout for log messages.
 *
 */
public class RawLayout extends Layout {
        
    public RawLayout() {
    }
    
    @Override
	public void activateOptions() {
    }
    
    @Override
	public String format(LoggingEvent event) {
        String message = event.getRenderedMessage();
        return message + LINE_SEP;
    }
        
    @Override
	public boolean ignoresThrowable() {
        return true;
    }
    
}