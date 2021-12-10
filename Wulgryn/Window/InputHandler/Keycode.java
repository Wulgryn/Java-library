package Wulgryn.Window.InputHandler;

public class Keycode {
    public static Key ANY = new Key();

    public static Key A = new Key();
    public static Key Á = new Key();
    public static Key B = new Key();
    public static Key C = new Key();
    public static Key D = new Key();
    public static Key E = new Key();
    public static Key É = new Key();
    public static Key F = new Key();
    public static Key G = new Key();
    public static Key H = new Key();
    public static Key I = new Key();
    public static Key Í = new Key();
    public static Key J = new Key();
    public static Key K = new Key();
    public static Key L = new Key();
    public static Key M = new Key();
    public static Key N = new Key();
    public static Key O = new Key();
    public static Key Ó = new Key();
    public static Key Ö = new Key();
    public static Key Ő = new Key();
    public static Key P = new Key();
    public static Key Q = new Key();
    public static Key R = new Key();
    public static Key S = new Key();
    public static Key T = new Key();
    public static Key U = new Key();
    public static Key Ú = new Key();
    public static Key Ü = new Key();
    public static Key Ű = new Key();
    public static Key V = new Key();
    public static Key W = new Key();
    public static Key X = new Key();
    public static Key Y = new Key();
    public static Key Z = new Key();

    public static Key ZERO = new Key();
    public static Key ONE = new Key();
    public static Key TWO = new Key();
    public static Key THREE = new Key();
    public static Key FOUR = new Key();
    public static Key FIVE = new Key();
    public static Key SIX = new Key();
    public static Key SEVEN = new Key();
    public static Key EIGHT = new Key();
    public static Key NINE = new Key();
    
    public static Key F1 = new Key();
    public static Key F2 = new Key();
    public static Key F3 = new Key();
    public static Key F4 = new Key();
    public static Key F5 = new Key();
    public static Key F6 = new Key();
    public static Key F7 = new Key();
    public static Key F8 = new Key();
    public static Key F9 = new Key();
    public static Key F10 = new Key();
    public static Key F11 = new Key();
    public static Key F12 = new Key();

    public static Key ESCAPE = new Key();
    public static Key TAB = new Key();
    public static Key CAPS_LOCK = new Key();
    public static Key LEFT_SHIFT = new Key();
    public static Key LEFT_CTRL = new Key();
    public static Key RIGHT_SHIFT = new Key();
    public static Key RIGHT_CTRL = new Key();
    public static Key ALT = new Key();
    public static Key ALT_GRAPH = new Key();
    public static Key SPACE = new Key();
    public static Key ENTER = new Key();
    public static Key BACKSPACE = new Key();

    public static Key SCROLL_LOCK = new Key();
    public static Key INSERT = new Key();
    public static Key HOME = new Key();
    public static Key PAGE_UP = new Key();
    public static Key PAGE_DOWN = new Key();
    public static Key DELETE = new Key();
    public static Key END = new Key();
    
    public static Key ARROW_UP = new Key();
    public static Key ARROW_DOWN = new Key();
    public static Key ARROW_LEFT = new Key();
    public static Key ARROW_RIGHT = new Key();

    public static Key NUM_LOCK = new Key();
    public static Key NUM_DEVISION = new Key();
    public static Key NUM_MULTIPLICATION = new Key();
    public static Key NUM_MINUS = new Key();
    public static Key NUM_PLUS = new Key();
    public static Key NUM_ZERO = new Key();
    public static Key NUM_ONE = new Key();
    public static Key NUM_TWO = new Key();
    public static Key NUM_THREE = new Key();
    public static Key NUM_FOUR = new Key();
    public static Key NUM_FIVE = new Key();
    public static Key NUM_SIX = new Key();
    public static Key NUM_SEVEN = new Key();
    public static Key NUM_EIGHT = new Key();
    public static Key NUM_NINE = new Key();
    public static Key NUM_ENTER = new Key();
    public static Key NUM_COMMA = new Key();


    public static void ResetKeys()
    {
        if(ANY.GetUp()) ANY.states[2] = false;
        if(A.GetUp()) A.states[2] = false;
        if(Á.GetUp()) Á.states[2] = false;
        if(B.GetUp()) B.states[2] = false;
        if(C.GetUp()) C.states[2] = false;
        if(D.GetUp()) D.states[2] = false;
        if(E.GetUp()) E.states[2] = false;
        if(É.GetUp()) É.states[2] = false;
        if(F.GetUp()) F.states[2] = false;
        if(G.GetUp()) G.states[2] = false;
        if(H.GetUp()) H.states[2] = false;
        if(I.GetUp()) I.states[2] = false;
        if(Í.GetUp()) Í.states[2] = false;
        if(J.GetUp()) J.states[2] = false;
        if(K.GetUp()) K.states[2] = false;
        if(L.GetUp()) L.states[2] = false;
        if(M.GetUp()) M.states[2] = false;
        if(N.GetUp()) N.states[2] = false;
        if(O.GetUp()) O.states[2] = false;
        if(Ó.GetUp()) Ó.states[2] = false;
        if(Ö.GetUp()) Ö.states[2] = false;
        if(Ő.GetUp()) Ő.states[2] = false;
        if(P.GetUp()) P.states[2] = false;
        if(Q.GetUp()) Q.states[2] = false;
        if(R.GetUp()) R.states[2] = false;
        if(S.GetUp()) S.states[2] = false;
        if(T.GetUp()) T.states[2] = false;
        if(U.GetUp()) U.states[2] = false;
        if(Ú.GetUp()) Ú.states[2] = false;
        if(Ü.GetUp()) Ü.states[2] = false;
        if(Ű.GetUp()) Ű.states[2] = false;
        if(V.GetUp()) V.states[2] = false;
        if(W.GetUp()) W.states[2] = false;
        if(X.GetUp()) X.states[2] = false;
        if(Y.GetUp()) Y.states[2] = false;
        if(Z.GetUp()) Z.states[2] = false;
        if(ZERO.GetUp()) ZERO.states[2] = false;
        if(ONE.GetUp()) ONE.states[2] = false;
        if(TWO.GetUp()) TWO.states[2] = false;
        if(THREE.GetUp()) THREE.states[2] = false;
        if(FOUR.GetUp()) FOUR.states[2] = false;
        if(FIVE.GetUp()) FIVE.states[2] = false;
        if(SIX.GetUp()) SIX.states[2] = false;
        if(SEVEN.GetUp()) SEVEN.states[2] = false;
        if(EIGHT.GetUp()) EIGHT.states[2] = false;
        if(NINE.GetUp()) NINE.states[2] = false;
        if(F1.GetUp()) F1.states[2] = false;
        if(F2.GetUp()) F2.states[2] = false;
        if(F3.GetUp()) F3.states[2] = false;
        if(F4.GetUp()) F4.states[2] = false;
        if(F5.GetUp()) F5.states[2] = false;
        if(F6.GetUp()) F6.states[2] = false;
        if(F7.GetUp()) F7.states[2] = false;
        if(F8.GetUp()) F8.states[2] = false;
        if(F9.GetUp()) F9.states[2] = false;
        if(F10.GetUp()) F10.states[2] = false;
        if(F11.GetUp()) F11.states[2] = false;
        if(F12.GetUp()) F12.states[2] = false;
        if(ESCAPE.GetUp()) ESCAPE.states[2] = false;
        if(TAB.GetUp()) TAB.states[2] = false;
        if(CAPS_LOCK.GetUp()) CAPS_LOCK.states[2] = false;
        if(LEFT_SHIFT.GetUp()) LEFT_SHIFT.states[2] = false;
        if(LEFT_CTRL.GetUp()) LEFT_CTRL.states[2] = false;
        if(RIGHT_SHIFT.GetUp()) RIGHT_SHIFT.states[2] = false;
        if(RIGHT_CTRL.GetUp()) RIGHT_CTRL.states[2] = false;
        if(ALT.GetUp()) ALT.states[2] = false;
        if(ALT_GRAPH.GetUp()) ALT_GRAPH.states[2] = false;
        if(SPACE.GetUp()) SPACE.states[2] = false;
        if(ENTER.GetUp()) ENTER.states[2] = false;
        if(BACKSPACE.GetUp()) BACKSPACE.states[2] = false;
        if(SCROLL_LOCK.GetUp()) SCROLL_LOCK.states[2] = false;
        if(INSERT.GetUp()) INSERT.states[2] = false;
        if(HOME.GetUp()) HOME.states[2] = false;
        if(PAGE_UP.GetUp()) PAGE_UP.states[2] = false;
        if(PAGE_DOWN.GetUp()) PAGE_DOWN.states[2] = false;
        if(DELETE.GetUp()) DELETE.states[2] = false;
        if(END.GetUp()) END.states[2] = false;
        if(ARROW_UP.GetUp()) ARROW_UP.states[2] = false;
        if(ARROW_DOWN.GetUp()) ARROW_DOWN.states[2] = false;
        if(ARROW_LEFT.GetUp()) ARROW_LEFT.states[2] = false;
        if(ARROW_RIGHT.GetUp()) ARROW_RIGHT.states[2] = false;
        if(NUM_LOCK.GetUp()) NUM_LOCK.states[2] = false;
        if(NUM_DEVISION.GetUp()) NUM_DEVISION.states[2] = false;
        if(NUM_MULTIPLICATION.GetUp()) NUM_MULTIPLICATION.states[2] = false;
        if(NUM_MINUS.GetUp()) NUM_MINUS.states[2] = false;
        if(NUM_PLUS.GetUp()) NUM_PLUS.states[2] = false;
        if(NUM_ZERO.GetUp()) NUM_ZERO.states[2] = false;
        if(NUM_ONE.GetUp()) NUM_ONE.states[2] = false;
        if(NUM_TWO.GetUp()) NUM_TWO.states[2] = false;
        if(NUM_THREE.GetUp()) NUM_THREE.states[2] = false;
        if(NUM_FOUR.GetUp()) NUM_FOUR.states[2] = false;
        if(NUM_FIVE.GetUp()) NUM_FIVE.states[2] = false;
        if(NUM_SIX.GetUp()) NUM_SIX.states[2] = false;
        if(NUM_SEVEN.GetUp()) NUM_SEVEN.states[2] = false;
        if(NUM_EIGHT.GetUp()) NUM_EIGHT.states[2] = false;
        if(NUM_NINE.GetUp()) NUM_NINE.states[2] = false;
        if(NUM_ENTER.GetUp()) NUM_ENTER.states[2] = false;
        if(NUM_COMMA.GetUp()) NUM_COMMA.states[2] = false;
    }
}