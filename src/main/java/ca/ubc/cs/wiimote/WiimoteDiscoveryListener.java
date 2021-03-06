/*
	Copyright 2008 Garth Shoemaker
	
 	This file is part of Wiimote Simple.

    Wiimote Simple is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Wiimote Simple is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with Wiimote Simple.  If not, see <http://www.gnu.org/licenses/>.
 */

package ca.ubc.cs.wiimote;

/**
 * Implement this interface to be notified of Wiimotes that are connected to. Register your
 * listener with an instance of WiimoteDiscoverer.
 */
public interface WiimoteDiscoveryListener {
	/**
	 * Is called by a WiimoteDiscoverer when a Wiimote has been found and successfully connected to.
	 */
	public void wiimoteDiscovered(Wiimote wiimote);
}
