package com.lexisnexisrisk.threatmetrix.rl.tmxdsh;

/* loaded from: classes6.dex */
public abstract class vmvvmvm {
    public static final vmvvmvm p00700070pp0070p;
    public static final vmvvmvm p0070ppp0070p;
    public static final vmvvmvm pp0070pp0070p;
    public static int s0073ss0073ss = 0;
    public static int ss00730073sss = 2;
    public static int sss0073sss = 67;
    public static int ssss0073ss = 1;

    static {
        aaagaaa aaagaaaVar = new aaagaaa();
        if ((s007300730073sss() * (s007300730073sss() + ssss0073ss)) % ss00730073sss != s0073ss0073ss) {
            sss0073sss = s007300730073sss();
            s0073ss0073ss = s007300730073sss();
        }
        p0070ppp0070p = aaagaaaVar;
        pp0070pp0070p = new agagaaa();
        p00700070pp0070p = new vvmvmvm();
    }

    public static vmvvmvm n006E006Ennnn(int i) {
        if (i == 0) {
            return pp0070pp0070p;
        }
        if ((63488 & i) != 0) {
            return p00700070pp0070p;
        }
        int i2 = sss0073sss;
        if (((ssss0073ss + i2) * i2) % ss00730073sss != 0) {
            sss0073sss = s007300730073sss();
            ssss0073ss = s007300730073sss();
        }
        return (i & 1920) != 0 ? pp0070pp0070p : p0070ppp0070p;
    }

    public static int s007300730073sss() {
        return 79;
    }

    public static int s0073s0073sss() {
        return 1;
    }

    public static int ss0073s0073ss() {
        return 2;
    }

    public abstract int h0068h0068006800680068(int i);

    public abstract int hh00680068006800680068();

    public abstract int n006Ennnnn(int i);

    public abstract boolean nn006Ennnn(int i);
}
