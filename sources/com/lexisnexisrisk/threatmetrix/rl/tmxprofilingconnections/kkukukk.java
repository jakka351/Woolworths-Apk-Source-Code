package com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections;

/* loaded from: classes6.dex */
public final class kkukukk extends kkkukku {
    public static int m006Dm006D006Dmm = 2;
    public static int m006Dmm006Dmm = 41;
    public static int mm006D006D006Dmm = 0;
    public static int mm006Dm006Dmm = 1;
    private static final int r00720072r0072rr = 1921;
    private static final int r0072rr0072rr = 127;
    private static final int rr0072r0072rr = 2048;

    public static int m006D006D006D006Dmm() {
        return 1;
    }

    public static int m006D006Dm006Dmm() {
        return 2;
    }

    public static int mmm006D006Dmm() {
        return 49;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkkukku
    public int k006B006B006B006Bkk() {
        int i = m006Dmm006Dmm;
        if (((mm006Dm006Dmm + i) * i) % m006D006Dm006Dmm() != 0) {
            m006Dmm006Dmm = mmm006D006Dmm();
            mm006Dm006Dmm = 20;
        }
        int i2 = m006Dmm006Dmm;
        if (((mm006Dm006Dmm + i2) * i2) % m006Dm006D006Dmm != 0) {
            m006Dmm006Dmm = 1;
            mm006Dm006Dmm = mmm006D006Dmm();
        }
        return r00720072r0072rr;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkkukku
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean k006Bkkk006Bk(int r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 < 0) goto L39
            if (r6 <= 0) goto L33
            int r1 = com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkukukk.m006Dmm006Dmm
            int r2 = m006D006D006D006Dmm()
            int r2 = r2 + r1
            int r1 = com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkukukk.m006Dmm006Dmm
            int r2 = r2 * r1
            int r3 = com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkukukk.m006Dm006D006Dmm
            int r2 = r2 % r3
            int r4 = com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkukukk.mm006D006D006Dmm
            if (r2 == r4) goto L2e
            int r2 = com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkukukk.mm006Dm006Dmm
            int r1 = YU.a.z(r1, r2, r1, r3)
            if (r1 == r4) goto L26
            r1 = 72
            com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkukukk.m006Dmm006Dmm = r1
            r1 = 68
            com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkukukk.mm006D006D006Dmm = r1
        L26:
            r1 = 99
            com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkukukk.m006Dmm006Dmm = r1
            r1 = 9
            com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkukukk.mm006D006D006Dmm = r1
        L2e:
            r1 = 128(0x80, float:1.794E-43)
            if (r6 >= r1) goto L33
            goto L39
        L33:
            r1 = 2048(0x800, float:2.87E-42)
            if (r6 >= r1) goto L39
            r6 = 1
            return r6
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkukukk.k006Bkkk006Bk(int):boolean");
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkkukku
    public int kk006B006B006Bkk(int i) {
        int i2 = i % r00720072r0072rr;
        if (i2 == 0) {
            return 0;
        }
        if (i2 < 0) {
            i2 += r00720072r0072rr;
            int i3 = m006Dmm006Dmm;
            if (((mm006Dm006Dmm + i3) * i3) % m006Dm006D006Dmm != 0) {
                m006Dmm006Dmm = 68;
                mm006Dm006Dmm = 10;
            }
        }
        return i2 + 127;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkkukku
    public int kkkkk006Bk(int i) {
        if (i != 0) {
            return i - 127;
        }
        int i2 = m006Dmm006Dmm;
        if (((mm006Dm006Dmm + i2) * i2) % m006Dm006D006Dmm != 0) {
            int iMmm006D006Dmm = mmm006D006Dmm();
            int i3 = m006Dmm006Dmm;
            if (((mm006Dm006Dmm + i3) * i3) % m006Dm006D006Dmm != 0) {
                m006Dmm006Dmm = mmm006D006Dmm();
                mm006Dm006Dmm = mmm006D006Dmm();
            }
            m006Dmm006Dmm = iMmm006D006Dmm;
            mm006Dm006Dmm = mmm006D006Dmm();
        }
        return 0;
    }
}
