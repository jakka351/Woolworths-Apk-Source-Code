package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.annotation.TargetApi;
import android.security.keystore.KeyInfo;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import java.security.PrivateKey;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class lqlqlqq {
    private static final String ggg0067g0067g;
    public static int s0073s0073sss0073 = 0;
    public static int s0073ss0073ss0073 = 2;
    public static int ss00730073sss0073 = 1;
    public static int sss0073sss0073 = 30;

    static {
        int i = sss0073sss0073;
        if (((ss00730073sss0073 + i) * i) % s0073ss0073ss0073 != 0) {
            sss0073sss0073 = ssss0073ss0073();
            s0073s0073sss0073 = 18;
        }
        String strU00750075u00750075u = lqlqqll.u00750075u00750075u(lqlqlqq.class);
        int i2 = sss0073sss0073;
        if (((ss00730073sss0073 + i2) * i2) % s0073ss0073ss0073 != 0) {
            sss0073sss0073 = ssss0073ss0073();
            s0073s0073sss0073 = ssss0073ss0073();
        }
        ggg0067g0067g = strU00750075u00750075u;
    }

    private lqlqlqq() {
    }

    @TargetApi
    public static boolean g00670067006700670067g0067(@Nullable PrivateKey privateKey, String str) {
        KeyInfo keyInfoGg0067006700670067g0067 = gg0067006700670067g0067(privateKey, str);
        if (keyInfoGg0067006700670067g0067 != null) {
            return keyInfoGg0067006700670067g0067.getOrigin() == 1;
        }
        String str2 = ggg0067g0067g;
        char cS0073sss0073ss = (char) (jxjxxjx.s0073sss0073ss() ^ 513829227);
        int iS0073sss0073ss = jxjxxjx.s0073sss0073ss() ^ 513829268;
        int i = sss0073sss0073;
        if (((ss00730073sss0073 + i) * i) % s0073ss0073ss0073 != 0) {
            sss0073sss0073 = ssss0073ss0073();
            s0073s0073sss0073 = 6;
        }
        lqlqqll.llqqqll.yy00790079007900790079(str2, jxxjjxx.ss0073sss0073s("Qnz2~)kokho#mfy\u001fmoebcg$\u0017hZeh[cUS\u000ePXL]\\MZ\u0006FVH\u0002OOS}>R<CE99B:\u0002", cS0073sss0073ss, (char) iS0073sss0073ss));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x016b  */
    @android.annotation.TargetApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.security.KeyPair g0067g006700670067g0067(@javax.annotation.Nonnull java.lang.String r6, java.lang.String r7, @javax.annotation.Nonnull java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqlqq.g0067g006700670067g0067(java.lang.String, java.lang.String, java.lang.String):java.security.KeyPair");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    @android.annotation.TargetApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.security.keystore.KeyInfo gg0067006700670067g0067(@javax.annotation.Nullable java.security.PrivateKey r5, java.lang.String r6) {
        /*
            boolean r0 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn.nlnlnln.o006F006Fo006F006F006F()
            r1 = 0
            if (r0 == 0) goto Ld6
            int r0 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn.nnnnnln.nlnnnln.ss00730073ss0073
            r2 = 23
            if (r0 < r2) goto Ld6
            if (r5 != 0) goto L11
            goto Ld6
        L11:
            java.lang.String r0 = r5.getAlgorithm()     // Catch: java.lang.Throwable -> L22 java.security.spec.InvalidKeySpecException -> L24 java.security.NoSuchProviderException -> L26 java.security.NoSuchAlgorithmException -> L28
            java.security.KeyFactory r6 = java.security.KeyFactory.getInstance(r0, r6)     // Catch: java.lang.Throwable -> L22 java.security.spec.InvalidKeySpecException -> L24 java.security.NoSuchProviderException -> L26 java.security.NoSuchAlgorithmException -> L28
            java.lang.Class<android.security.keystore.KeyInfo> r0 = android.security.keystore.KeyInfo.class
            java.security.spec.KeySpec r5 = r6.getKeySpec(r5, r0)     // Catch: java.lang.Throwable -> L22 java.security.spec.InvalidKeySpecException -> L24 java.security.NoSuchProviderException -> L26 java.security.NoSuchAlgorithmException -> L28
            android.security.keystore.KeyInfo r5 = (android.security.keystore.KeyInfo) r5     // Catch: java.lang.Throwable -> L22 java.security.spec.InvalidKeySpecException -> L24 java.security.NoSuchProviderException -> L26 java.security.NoSuchAlgorithmException -> L28
            return r5
        L22:
            r5 = move-exception
            goto L2a
        L24:
            r5 = move-exception
            goto L5a
        L26:
            r5 = move-exception
            goto L5a
        L28:
            r5 = move-exception
            goto La0
        L2a:
            java.lang.String r6 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqlqq.ggg0067g0067g
            int r0 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjx.s0073s00730073sss()
            r2 = -1787701535(0xffffffff9571d6e1, float:-4.8839072E-26)
            r0 = r0 ^ r2
            char r0 = (char) r0
            int r2 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjx.s0073s00730073sss()
            r3 = -1787701652(0xffffffff9571d66c, float:-4.883871E-26)
            r2 = r2 ^ r3
            char r2 = (char) r2
            int r3 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjxxxjx.s00730073ss0073ss()
            r4 = 783950881(0x2eba2421, float:8.4647185E-11)
            r3 = r3 ^ r4
            char r3 = (char) r3
            java.lang.String r4 = "P?^3!\u0017:\u0012]Yj}\r28r\f\u000bkXn#WV8\u001eu$\u0002\u000f4,nO\u0001K\u0011vx%\u001cP\u001f"
            java.lang.String r0 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.sss0073ss0073s(r4, r0, r2, r3)
            java.lang.String r5 = r5.toString()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll.uu0075u00750075u(r6, r0, r5)
            goto Ld6
        L5a:
            java.lang.String r6 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqlqq.ggg0067g0067g
            int r0 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxjxxjx.s0073sss0073ss()
            r2 = 513829171(0x1ea06933, float:1.6984168E-20)
            r0 = r0 ^ r2
            char r0 = (char) r0
            int r2 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxxxjx.sss0073s0073ss()
            r3 = 1457354514(0x56dd7712, float:1.21751736E14)
            r2 = r2 ^ r3
            char r2 = (char) r2
            int r3 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxxxjx.sss0073s0073ss()
            r4 = 1457354571(0x56dd774b, float:1.21752215E14)
            r3 = r3 ^ r4
            char r3 = (char) r3
            java.lang.String r4 = "bv\u0004=r5A\u0001|}\u001fQ\u0006\u0013\"\u007fV\u000eu.b\u001eu"
            java.lang.String r0 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.sss0073ss0073s(r4, r0, r2, r3)
            int r2 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqlqq.sss0073sss0073
            int r3 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqlqq.ss00730073sss0073
            int r3 = r3 + r2
            int r3 = r3 * r2
            int r2 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqlqq.s0073ss0073ss0073
            int r3 = r3 % r2
            if (r3 == 0) goto L94
            int r2 = ssss0073ss0073()
            com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqlqq.sss0073sss0073 = r2
            int r2 = ssss0073ss0073()
            com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqlqq.s0073s0073sss0073 = r2
        L94:
            java.lang.String r5 = r5.toString()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll.uu0075007500750075u(r6, r0, r5)
            goto Ld6
        La0:
            java.lang.String r6 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqlqq.ggg0067g0067g
            int r0 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqlqq.sss0073sss0073
            int r2 = ss0073s0073ss0073()
            int r2 = r2 + r0
            int r2 = r2 * r0
            int r0 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqlqq.s0073ss0073ss0073
            int r2 = r2 % r0
            if (r2 == 0) goto Lb7
            r0 = 34
            com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqlqq.sss0073sss0073 = r0
            r0 = 35
            com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqlqq.s0073s0073sss0073 = r0
        Lb7:
            int r0 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxjxxjx.s0073sss0073ss()
            r2 = 513829136(0x1ea06910, float:1.6984112E-20)
            r0 = r0 ^ r2
            char r0 = (char) r0
            int r2 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjx.s0073s00730073sss()
            r3 = -1787701660(0xffffffff9571d664, float:-4.8838687E-26)
            r2 = r2 ^ r3
            char r2 = (char) r2
            java.lang.String r3 = "6S_\u0017c\u000eY[LN\t\\OK\u0005/H[4TNPB{VW"
            java.lang.String r0 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.ss0073sss0073s(r3, r0, r2)
            java.lang.String r5 = r5.toString()
            com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll.llqqqll.uu0075u0075uu(r6, r0, r5)
        Ld6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqlqq.gg0067006700670067g0067(java.security.PrivateKey, java.lang.String):android.security.keystore.KeyInfo");
    }

    @TargetApi
    public static boolean gggggg00670067(@Nullable PrivateKey privateKey, String str) {
        KeyInfo keyInfoGg0067006700670067g0067 = gg0067006700670067g0067(privateKey, str);
        if (keyInfoGg0067006700670067g0067 == null) {
            String str2 = ggg0067g0067g;
            char cS00730073ss0073ss = (char) (jjxxxjx.s00730073ss0073ss() ^ 783950939);
            int iSss0073s0073ss = jxxxxjx.sss0073s0073ss();
            int iSsss0073ss0073 = ssss0073ss0073();
            if (((ss00730073sss0073 + iSsss0073ss0073) * iSsss0073ss0073) % s0073ss0073ss0073 != 0) {
                sss0073sss0073 = 51;
                s0073s0073sss0073 = ssss0073ss0073();
            }
            lqlqqll.llqqqll.yy00790079007900790079(str2, jxxjjxx.sss0073ss0073s("\u0005$2k:f+1/.7l94IpFLD:\u0002vJ>KPEOCC\u007fDNDWXKZ\bJ\\P\f[]c\u0010RhT]aWYd^(", cS00730073ss0073ss, (char) (iSss0073s0073ss ^ 1457354510), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950883)));
            return false;
        }
        boolean zIsInsideSecureHardware = keyInfoGg0067006700670067g0067.isInsideSecureHardware();
        String str3 = ggg0067g0067g;
        StringBuilder sb = new StringBuilder();
        char cS00730073ss0073ss2 = (char) (jjxxxjx.s00730073ss0073ss() ^ 783951072);
        int iS0073s00730073sss = jjjxxjx.s0073s00730073sss() ^ (-1787701649);
        int i = sss0073sss0073;
        if (((ss00730073sss0073 + i) * i) % s0073ss0073ss0073 != 0) {
            sss0073sss0073 = 80;
            s0073s0073sss0073 = ssss0073ss0073();
        }
        sb.append(jxxjjxx.ss0073sss0073s("\"<NAU@RF\u0002EEHQLL\t", cS00730073ss0073ss2, (char) iS0073s00730073sss));
        sb.append(zIsInsideSecureHardware);
        lqlqqll.llqqqll.yy00790079007900790079(str3, sb.toString());
        return zIsInsideSecureHardware;
    }

    public static int s007300730073sss0073() {
        return 2;
    }

    public static int ss0073s0073ss0073() {
        return 1;
    }

    public static int ssss0073ss0073() {
        return 66;
    }
}
