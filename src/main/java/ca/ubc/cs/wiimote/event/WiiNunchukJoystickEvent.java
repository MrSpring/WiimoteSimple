package ca.ubc.cs.wiimote.event;

import ca.ubc.cs.wiimote.Wiimote;

/**
 * Created on 20-12-2015 for WiimoteSimple.
 */
public class WiiNunchukJoystickEvent extends WiiEvent
{
    final int x, y;

    public WiiNunchukJoystickEvent(Wiimote wiimote, int x, int y)
    {
        super(wiimote);
        this.x = x;
        this.y = y;
    }
}
