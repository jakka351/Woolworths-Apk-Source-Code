package com.lexisnexisrisk.threatmetrix.rl.tmxauth;

/* loaded from: classes6.dex */
public abstract class qbqbqbb {
    public static int l006C006Cl006Cll = 40;
    public static int l006Cl006C006Cll = 2;
    public static int lll006C006Cll = 1;
    public static int lllll006Cl;
    public static final qbqbqbb k006B006B006Bk006Bk = new lllllnl();
    public static final qbqbqbb kkkk006B006Bk = new lnlllnl();
    public static final qbqbqbb k006Bkk006B006Bk = new qqbbqbb();

    static {
        int i = l006C006Cl006Cll;
        if (((lll006C006Cll + i) * i) % l006Cl006C006Cll != lllll006Cl) {
            l006C006Cl006Cll = ll006C006C006Cll();
            lllll006Cl = 44;
        }
    }

    public static int l006C006C006C006Cll() {
        return 0;
    }

    public static int ll006C006C006Cll() {
        return 71;
    }

    public static qbqbqbb q0071q0071qq0071(int i) {
        if (i == 0) {
            return kkkk006B006Bk;
        }
        if ((63488 & i) != 0) {
            return k006Bkk006B006Bk;
        }
        if ((i & 1920) == 0) {
            return k006B006B006Bk006Bk;
        }
        int i2 = l006C006Cl006Cll;
        if (((lll006C006Cll + i2) * i2) % l006Cl006C006Cll != l006C006C006C006Cll()) {
            l006C006Cl006Cll = 7;
            lll006C006Cll = 26;
        }
        int i3 = l006C006Cl006Cll;
        if (((lll006C006Cll + i3) * i3) % l006Cl006C006Cll != 0) {
            l006C006Cl006Cll = 59;
            lll006C006Cll = ll006C006C006Cll();
        }
        return kkkk006B006Bk;
    }

    public abstract int q00710071qqq0071(int i);

    public abstract int q0071qqqq0071(int i);

    public abstract int qq0071qqq0071();

    public abstract boolean qqq0071qq0071(int i);
}
