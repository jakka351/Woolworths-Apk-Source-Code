package com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections;

/* loaded from: classes6.dex */
public abstract class kkkukku {
    public static int i006900690069i0069i = 61;
    public static int ii0069i00690069i = 2;
    public static int iii006900690069i = 1;
    public static int iiii00690069i;
    public static final kkkukku r00720072rrr0072;
    public static final kkkukku r0072rrrr0072 = new kuukukk();
    public static final kkkukku rr0072rrr0072;

    static {
        int i = i006900690069i0069i;
        if (((iii006900690069i + i) * i) % ii0069i00690069i != iiii00690069i) {
            i006900690069i0069i = i00690069i00690069i();
            iiii00690069i = 8;
        }
        rr0072rrr0072 = new kkukukk();
        kuukkku kuukkkuVar = new kuukkku();
        int i2 = i006900690069i0069i;
        if (((iii006900690069i + i2) * i2) % ii0069i00690069i != iiii00690069i) {
            i006900690069i0069i = i00690069i00690069i();
            iiii00690069i = i00690069i00690069i();
        }
        r00720072rrr0072 = kuukkkuVar;
    }

    public static int i00690069i00690069i() {
        return 26;
    }

    public static int i0069ii00690069i() {
        return 1;
    }

    public static kkkukku kk006B006B006B006Bk(int i) {
        if (i != 0) {
            return (63488 & i) != 0 ? r00720072rrr0072 : (i & 1920) != 0 ? rr0072rrr0072 : r0072rrrr0072;
        }
        kkkukku kkkukkuVar = rr0072rrr0072;
        if (((i0069ii00690069i() + i006900690069i0069i) * i006900690069i0069i) % ii0069i00690069i != iiii00690069i) {
            i006900690069i0069i = i00690069i00690069i();
            iiii00690069i = 86;
        }
        return kkkukkuVar;
    }

    public abstract int k006B006B006B006Bkk();

    public abstract boolean k006Bkkk006Bk(int i);

    public abstract int kk006B006B006Bkk(int i);

    public abstract int kkkkk006Bk(int i);
}
