/*
 * This program is free software; you can redistribute it and/or modify it under the 
 * terms of the GNU General Public License, version 2 as published by the Free Software 
 * Foundation.
 *
 * You should have received a copy of the GNU General Public License along with this 
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/gpl-2.0.html 
 * or from the Free Software Foundation, Inc., 
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 *
 * Copyright 2005 - 2008 Pentaho Corporation.  All rights reserved. 
 * 
 * @created June 27, 2008 
 * @author Angelo Rodriguez
 * 
 */

package org.pentaho.platform.engine.core.system;

import org.pentaho.platform.api.engine.ISessionStartupAction;

public class SessionStartupAction implements ISessionStartupAction {
  String sessionType;
  String actionOutputScope;
  String actionPath;
  
  public String getActionOutputScope() {
    return actionOutputScope;
  }
  
  public void setActionOutputScope(String actionOutputScope) {
    this.actionOutputScope = actionOutputScope;
  }
  
  public String getActionPath() {
    return actionPath;
  }
  
  public void setActionPath(String actionPath) {
    this.actionPath = actionPath;
  }

  public String getSessionType() {
    return sessionType;
  }

  public void setSessionType(String sessionType) {
    this.sessionType = sessionType;
  }
}
