package com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections;

/* loaded from: classes6.dex */
public final class kuukukk extends kkkukku {
    public static int m006D006Dmm006Dm = 2;
    public static int m006Dmmm006Dm = 0;
    public static int mm006Dmm006Dm = 1;
    public static int mmm006Dm006Dm = 61;
    private static final int r0072r00720072rr = 128;
    private static final int rr007200720072rr = 127;
    private static final int rrr00720072rr = 1;

    public static int m006Dm006Dm006Dm() {
        return 2;
    }

    public static int mmmmm006Dm() {
        return 39;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkkukku
    public int k006B006B006B006Bkk() {
        int i = mmm006Dm006Dm;
        if (((mm006Dmm006Dm + i) * i) % m006D006Dmm006Dm != 0) {
            mmm006Dm006Dm = 83;
            m006Dmmm006Dm = 34;
        }
        if (((mmmmm006Dm() + mm006Dmm006Dm) * mmmmm006Dm()) % m006D006Dmm006Dm != m006Dmmm006Dm) {
            m006Dmmm006Dm = mmmmm006Dm();
        }
        return 127;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkkukku
    public boolean k006Bkkk006Bk(int i) {
        if (i < 1) {
            return false;
        }
        int i2 = mmm006Dm006Dm;
        if (((mm006Dmm006Dm + i2) * i2) % m006D006Dmm006Dm != m006Dmmm006Dm) {
            mmm006Dm006Dm = 22;
            m006Dmmm006Dm = 66;
        }
        return i < 128;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkkukku
    public int kk006B006B006Bkk(int i) {
        int i2 = i % 127;
        if (i2 < 0) {
            i2 += 127;
            int i3 = mmm006Dm006Dm;
            if (((mm006Dmm006Dm + i3) * i3) % m006Dm006Dm006Dm() != m006Dmmm006Dm) {
                if ((mmmmm006Dm() * (mmmmm006Dm() + mm006Dmm006Dm)) % m006D006Dmm006Dm != m006Dmmm006Dm) {
                    mmm006Dm006Dm = 4;
                    m006Dmmm006Dm = 84;
                }
                mmm006Dm006Dm = mmmmm006Dm();
                m006Dmmm006Dm = 87;
            }
        }
        return i2 + 1;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkkukku
    public int kkkkk006Bk(int i) {
        return i - 1;
    }
}
