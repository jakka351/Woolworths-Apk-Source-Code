package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

/* loaded from: classes6.dex */
public abstract class jjjjjxx {
    public static final jjjjjxx l006C006C006C006Cl006C;
    public static final jjjjjxx l006Cl006C006Cl006C = new uhhuhuu();
    public static final jjjjjxx ll006C006C006Cl006C;
    public static int s0073007300730073ss0073 = 0;
    public static int s0073s00730073ss0073 = 2;
    public static int ss007300730073ss0073 = 19;
    public static int sss00730073ss0073 = 1;

    static {
        uuuhhuu uuuhhuuVar = new uuuhhuu();
        int i = ss007300730073ss0073;
        int i2 = sss00730073ss0073;
        if (((i + i2) * i) % s0073s00730073ss0073 != 0) {
            ss007300730073ss0073 = s00730073s0073ss0073();
            s0073007300730073ss0073 = s00730073s0073ss0073();
        }
        if (((i2 + i) * i) % s0073s00730073ss0073 != 0) {
            ss007300730073ss0073 = 38;
            s0073007300730073ss0073 = 54;
        }
        ll006C006C006Cl006C = uuuhhuuVar;
        l006C006C006C006Cl006C = new jxjjjxx();
    }

    public static int s00730073s0073ss0073() {
        return 39;
    }

    public static jjjjjxx ss0073s00730073ss(int i) {
        if (i == 0) {
            return ll006C006C006Cl006C;
        }
        if ((63488 & i) != 0) {
            return l006C006C006C006Cl006C;
        }
        int i2 = ss007300730073ss0073;
        if (((sss00730073ss0073 + i2) * i2) % s0073s00730073ss0073 != s0073007300730073ss0073) {
            ss007300730073ss0073 = s00730073s0073ss0073();
            s0073007300730073ss0073 = s00730073s0073ss0073();
        }
        if ((i & 1920) != 0) {
            return ll006C006C006Cl006C;
        }
        jjjjjxx jjjjjxxVar = l006Cl006C006Cl006C;
        int iS00730073s0073ss0073 = s00730073s0073ss0073();
        if (((sss00730073ss0073 + iS00730073s0073ss0073) * iS00730073s0073ss0073) % s0073s00730073ss0073 != 0) {
            sss00730073ss0073 = s00730073s0073ss0073();
        }
        return jjjjjxxVar;
    }

    public abstract int s007300730073s0073ss();

    public abstract boolean s0073ss00730073ss(int i);

    public abstract int ss00730073s0073ss(int i);

    public abstract int ssss00730073ss(int i);
}
