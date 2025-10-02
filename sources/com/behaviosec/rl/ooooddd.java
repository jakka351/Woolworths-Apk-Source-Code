package com.behaviosec.rl;

/* loaded from: classes4.dex */
public enum ooooddd {
    up,
    down,
    left,
    right;

    static {
        int iVvv0076007600760076v = (vvv0076007600760076v() * (vv00760076007600760076v() + vvv0076007600760076v())) % v007600760076007600760076v();
        v0076v0076007600760076v();
    }

    public static ooooddd s00730073s00730073s(double d) {
        if (sss007300730073s(d, -2.356194490192345d, -0.7853981633974483d)) {
            return down;
        }
        if (!sss007300730073s(d, -0.7853981633974483d, 0.7853981633974483d)) {
            return sss007300730073s(d, 0.7853981633974483d, 2.356194490192345d) ? up : left;
        }
        int iVvv0076007600760076v = vvv0076007600760076v();
        int iVv00760076007600760076v = ((vv00760076007600760076v() + iVvv0076007600760076v) * iVvv0076007600760076v) % v007600760076007600760076v();
        return right;
    }

    private static boolean sss007300730073s(double d, double d2, double d3) {
        return d >= d2 && d < d3;
    }

    public static int v007600760076007600760076v() {
        return 2;
    }

    public static int v0076v0076007600760076v() {
        return 0;
    }

    public static ooooddd valueOf(String str) throws Exception {
        Enum enumJ006Ajjj006A006A = odooooo.j006Ajjj006A006A(ooooddd.class, str);
        int iVvv0076007600760076v = (vvv0076007600760076v() * (vv00760076007600760076v() + vvv0076007600760076v())) % v007600760076007600760076v();
        v0076v0076007600760076v();
        return (ooooddd) enumJ006Ajjj006A006A;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static ooooddd[] valuesCustom() {
        ooooddd[] oooodddVarArrValuesCustom = values();
        int iVvv0076007600760076v = (vvv0076007600760076v() * (vv00760076007600760076v() + vvv0076007600760076v())) % v007600760076007600760076v();
        v0076v0076007600760076v();
        return (ooooddd[]) oooodddVarArrValuesCustom.clone();
    }

    public static int vv00760076007600760076v() {
        return 1;
    }

    public static int vvv0076007600760076v() {
        return 49;
    }
}
