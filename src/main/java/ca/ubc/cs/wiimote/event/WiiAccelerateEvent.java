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

package ca.ubc.cs.wiimote.event;

import ca.ubc.cs.wiimote.Wiimote;

/**
 * Represents an occurrence of a wiimote acceleration event.
 */
public class WiiAccelerateEvent extends WiiEvent
{
    /**
     * Store the magnitudes of the acceleration values in the three axes.
     */
    public double x, y, z;
    public EventSource source;
    public WiiAccelerateEvent(Wiimote s, double x, double y, double z)
    {
        super(s);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public enum EventSource
    {
        WII_REMOTE, NUNCHUK
    }
}
