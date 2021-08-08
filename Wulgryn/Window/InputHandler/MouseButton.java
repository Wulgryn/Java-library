package Wulgryn.Window.InputHandler;

public class MouseButton {
    private final boolean[] states = new boolean[]{false,false,false};
    private static int direction_ = 0;

    public boolean GetDown()
    {
        boolean b = states[0];
        states[0] = false;
        return b;
    }
    protected void SetDown(boolean b)
    {
        if(b)
        {
            states[1] = false;
            states[2] = false;
        }
        states[0] = b;
    }

    public boolean GetPressed() {
        return states[1];
    }
    protected void SetPressed(boolean b)
    {
        if(b)
        {
            states[0] = false;
            states[2] = false;
        }
        states[1] = b;
    }

    public boolean GetUp() {
        boolean b = states[2];
        states[2] = false;
        return b;
    }
    protected void SetUp(boolean b)
    {
        if(b)
        {
            states[0] = false;
            states[1] = false;
        }
        states[2] = b;
    }

    protected static int GetDirection()
    {
        int d = direction_;
        direction_ = 0;
        return d;
    }
    protected static void SetDirection(int direction)
    {
        direction_ = direction;
    }
}
