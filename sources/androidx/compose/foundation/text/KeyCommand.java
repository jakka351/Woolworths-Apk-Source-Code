package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/KeyCommand;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KeyCommand {
    public static final KeyCommand A;
    public static final KeyCommand B;
    public static final KeyCommand C;
    public static final KeyCommand D;
    public static final KeyCommand E;
    public static final KeyCommand F;
    public static final KeyCommand G;
    public static final KeyCommand H;
    public static final KeyCommand I;
    public static final KeyCommand J;
    public static final KeyCommand K;
    public static final KeyCommand L;
    public static final KeyCommand M;
    public static final KeyCommand N;
    public static final KeyCommand O;
    public static final KeyCommand P;
    public static final KeyCommand Q;
    public static final KeyCommand R;
    public static final KeyCommand S;
    public static final KeyCommand T;
    public static final KeyCommand U;
    public static final KeyCommand V;
    public static final KeyCommand W;
    public static final KeyCommand X;
    public static final KeyCommand Y;
    public static final /* synthetic */ KeyCommand[] Z;
    public static final /* synthetic */ EnumEntries a0;
    public static final KeyCommand e;
    public static final KeyCommand f;
    public static final KeyCommand g;
    public static final KeyCommand h;
    public static final KeyCommand i;
    public static final KeyCommand j;
    public static final KeyCommand k;
    public static final KeyCommand l;
    public static final KeyCommand m;
    public static final KeyCommand n;
    public static final KeyCommand o;
    public static final KeyCommand p;
    public static final KeyCommand q;
    public static final KeyCommand r;
    public static final KeyCommand s;
    public static final KeyCommand t;
    public static final KeyCommand u;
    public static final KeyCommand v;
    public static final KeyCommand w;
    public static final KeyCommand x;
    public static final KeyCommand y;
    public static final KeyCommand z;
    public final boolean d;

    static {
        KeyCommand keyCommand = new KeyCommand("LEFT_CHAR", 0, false);
        e = keyCommand;
        KeyCommand keyCommand2 = new KeyCommand("RIGHT_CHAR", 1, false);
        f = keyCommand2;
        KeyCommand keyCommand3 = new KeyCommand("RIGHT_WORD", 2, false);
        g = keyCommand3;
        KeyCommand keyCommand4 = new KeyCommand("LEFT_WORD", 3, false);
        h = keyCommand4;
        KeyCommand keyCommand5 = new KeyCommand("NEXT_PARAGRAPH", 4, false);
        i = keyCommand5;
        KeyCommand keyCommand6 = new KeyCommand("PREV_PARAGRAPH", 5, false);
        j = keyCommand6;
        KeyCommand keyCommand7 = new KeyCommand("LINE_START", 6, false);
        k = keyCommand7;
        KeyCommand keyCommand8 = new KeyCommand("LINE_END", 7, false);
        l = keyCommand8;
        KeyCommand keyCommand9 = new KeyCommand("LINE_LEFT", 8, false);
        m = keyCommand9;
        KeyCommand keyCommand10 = new KeyCommand("LINE_RIGHT", 9, false);
        n = keyCommand10;
        KeyCommand keyCommand11 = new KeyCommand("UP", 10, false);
        o = keyCommand11;
        KeyCommand keyCommand12 = new KeyCommand("DOWN", 11, false);
        p = keyCommand12;
        KeyCommand keyCommand13 = new KeyCommand("PAGE_UP", 12, false);
        q = keyCommand13;
        KeyCommand keyCommand14 = new KeyCommand("PAGE_DOWN", 13, false);
        r = keyCommand14;
        KeyCommand keyCommand15 = new KeyCommand("HOME", 14, false);
        s = keyCommand15;
        KeyCommand keyCommand16 = new KeyCommand("END", 15, false);
        t = keyCommand16;
        KeyCommand keyCommand17 = new KeyCommand("COPY", 16, false);
        u = keyCommand17;
        KeyCommand keyCommand18 = new KeyCommand("PASTE", 17, true);
        v = keyCommand18;
        KeyCommand keyCommand19 = new KeyCommand("CUT", 18, true);
        w = keyCommand19;
        KeyCommand keyCommand20 = new KeyCommand("DELETE_PREV_CHAR", 19, true);
        x = keyCommand20;
        KeyCommand keyCommand21 = new KeyCommand("DELETE_NEXT_CHAR", 20, true);
        y = keyCommand21;
        KeyCommand keyCommand22 = new KeyCommand("DELETE_PREV_WORD", 21, true);
        z = keyCommand22;
        KeyCommand keyCommand23 = new KeyCommand("DELETE_NEXT_WORD", 22, true);
        A = keyCommand23;
        KeyCommand keyCommand24 = new KeyCommand("DELETE_FROM_LINE_START", 23, true);
        B = keyCommand24;
        KeyCommand keyCommand25 = new KeyCommand("DELETE_TO_LINE_END", 24, true);
        C = keyCommand25;
        KeyCommand keyCommand26 = new KeyCommand("SELECT_ALL", 25, false);
        D = keyCommand26;
        KeyCommand keyCommand27 = new KeyCommand("SELECT_LEFT_CHAR", 26, false);
        E = keyCommand27;
        KeyCommand keyCommand28 = new KeyCommand("SELECT_RIGHT_CHAR", 27, false);
        F = keyCommand28;
        KeyCommand keyCommand29 = new KeyCommand("SELECT_UP", 28, false);
        G = keyCommand29;
        KeyCommand keyCommand30 = new KeyCommand("SELECT_DOWN", 29, false);
        H = keyCommand30;
        KeyCommand keyCommand31 = new KeyCommand("SELECT_PAGE_UP", 30, false);
        I = keyCommand31;
        KeyCommand keyCommand32 = new KeyCommand("SELECT_PAGE_DOWN", 31, false);
        J = keyCommand32;
        KeyCommand keyCommand33 = new KeyCommand("SELECT_HOME", 32, false);
        K = keyCommand33;
        KeyCommand keyCommand34 = new KeyCommand("SELECT_END", 33, false);
        L = keyCommand34;
        KeyCommand keyCommand35 = new KeyCommand("SELECT_LEFT_WORD", 34, false);
        M = keyCommand35;
        KeyCommand keyCommand36 = new KeyCommand("SELECT_RIGHT_WORD", 35, false);
        N = keyCommand36;
        KeyCommand keyCommand37 = new KeyCommand("SELECT_NEXT_PARAGRAPH", 36, false);
        O = keyCommand37;
        KeyCommand keyCommand38 = new KeyCommand("SELECT_PREV_PARAGRAPH", 37, false);
        P = keyCommand38;
        KeyCommand keyCommand39 = new KeyCommand("SELECT_LINE_START", 38, false);
        Q = keyCommand39;
        KeyCommand keyCommand40 = new KeyCommand("SELECT_LINE_END", 39, false);
        R = keyCommand40;
        KeyCommand keyCommand41 = new KeyCommand("SELECT_LINE_LEFT", 40, false);
        S = keyCommand41;
        KeyCommand keyCommand42 = new KeyCommand("SELECT_LINE_RIGHT", 41, false);
        T = keyCommand42;
        KeyCommand keyCommand43 = new KeyCommand("DESELECT", 42, false);
        U = keyCommand43;
        KeyCommand keyCommand44 = new KeyCommand("NEW_LINE", 43, true);
        V = keyCommand44;
        KeyCommand keyCommand45 = new KeyCommand("TAB", 44, true);
        W = keyCommand45;
        KeyCommand keyCommand46 = new KeyCommand("UNDO", 45, true);
        X = keyCommand46;
        KeyCommand keyCommand47 = new KeyCommand("REDO", 46, true);
        Y = keyCommand47;
        KeyCommand[] keyCommandArr = {keyCommand, keyCommand2, keyCommand3, keyCommand4, keyCommand5, keyCommand6, keyCommand7, keyCommand8, keyCommand9, keyCommand10, keyCommand11, keyCommand12, keyCommand13, keyCommand14, keyCommand15, keyCommand16, keyCommand17, keyCommand18, keyCommand19, keyCommand20, keyCommand21, keyCommand22, keyCommand23, keyCommand24, keyCommand25, keyCommand26, keyCommand27, keyCommand28, keyCommand29, keyCommand30, keyCommand31, keyCommand32, keyCommand33, keyCommand34, keyCommand35, keyCommand36, keyCommand37, keyCommand38, keyCommand39, keyCommand40, keyCommand41, keyCommand42, keyCommand43, keyCommand44, keyCommand45, keyCommand46, keyCommand47, new KeyCommand("CHARACTER_PALETTE", 47, true)};
        Z = keyCommandArr;
        a0 = EnumEntriesKt.a(keyCommandArr);
    }

    public KeyCommand(String str, int i2, boolean z2) {
        this.d = z2;
    }

    public static KeyCommand valueOf(String str) {
        return (KeyCommand) Enum.valueOf(KeyCommand.class, str);
    }

    public static KeyCommand[] values() {
        return (KeyCommand[]) Z.clone();
    }
}
