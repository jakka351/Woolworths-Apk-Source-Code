package com.lexisnexisrisk.threatmetrix.rl.tmxauth;

import android.content.Context;
import com.lexisnexisrisk.threatmetrix.rl.TMXStrongAuth;
import com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqbbqbq;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.UnrecoverableEntryException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class qqqqqqb {
    public static int a00610061a006100610061 = 93;
    public static int a0061a0061006100610061 = 2;
    public static int aaa0061006100610061 = 1;
    public static int s0073s0073sss;
    private static final String w007700770077ww0077;
    private static final String w0077w0077ww0077;
    private static final String ww00770077ww0077;

    /* renamed from: com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqqqb$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static int s0073s0073s0073s = 0;
        public static int ss00730073s0073s = 1;
        public static int sss0073s0073s = 66;
        public static final /* synthetic */ int[] ww0077w0077w0077;

        static {
            int[] iArr = new int[TMXStrongAuth.AuthenticationStatus.values().length];
            ww0077w0077w0077 = iArr;
            try {
                iArr[TMXStrongAuth.AuthenticationStatus.TMX_STRONG_AUTH_OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ww0077w0077w0077[TMXStrongAuth.AuthenticationStatus.TMX_STRONG_AUTH_NOT_POSSIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ww0077w0077w0077[TMXStrongAuth.AuthenticationStatus.TMX_STRONG_AUTH_CANCELLED.ordinal()] = 3;
                int i = sss0073s0073s;
                if (((ss00730073s0073s + i) * i) % s007300730073s0073s() != s0073s0073s0073s) {
                    sss0073s0073s = ssss00730073s();
                    s0073s0073s0073s = ssss00730073s();
                }
            } catch (NoSuchFieldError unused3) {
            }
        }

        public static int s007300730073s0073s() {
            return 2;
        }

        public static int ssss00730073s() {
            return 82;
        }
    }

    public static class qbbqqqb implements qqqbqqb {
        public static int s00730073s00730073s = 2;
        public static int s0073ss00730073s = 49;
        public static int ss0073s00730073s = 1;

        @Nonnull
        public final PrivateKey w00770077w0077w0077;
        public final byte[] w0077w00770077w0077;
        public final BigInteger www00770077w0077;

        public qbbqqqb(@Nonnull PrivateKey privateKey, BigInteger bigInteger, byte[] bArr) {
            this.w00770077w0077w0077 = privateKey;
            this.www00770077w0077 = bigInteger;
            this.w0077w00770077w0077 = bArr;
        }

        public static int s0073s007300730073s() {
            return 1;
        }

        public static int sss007300730073s() {
            return 93;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqqqb.qqqbqqb
        public byte[] getOid() {
            byte[] bArrBb00620062b00620062 = qqqqqqb.bb00620062b00620062(this.w00770077w0077w0077);
            int i = s0073ss00730073s;
            if (((s0073s007300730073s() + i) * i) % s00730073s00730073s != 0) {
                s0073ss00730073s = 38;
                ss0073s00730073s = sss007300730073s();
            }
            return bArrBb00620062b00620062;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqqqb.qqqbqqb
        public BigInteger getSerialNumber() {
            while (true) {
                try {
                    int[] iArr = new int[-1];
                } catch (Exception unused) {
                    s0073ss00730073s = 20;
                    return this.www00770077w0077;
                }
            }
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqqqb.qqqbqqb
        public byte[] getSubject() {
            byte[] bArr = this.w0077w00770077w0077;
            int i = s0073ss00730073s;
            if (((ss0073s00730073s + i) * i) % s00730073s00730073s != 0) {
                s0073ss00730073s = 96;
                ss0073s00730073s = 62;
            }
            return bArr;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqqqb.qqqbqqb
        public byte[] signData(byte[] bArr) {
            PrivateKey privateKey = this.w00770077w0077w0077;
            int i = s0073ss00730073s;
            if (((ss0073s00730073s + i) * i) % s00730073s00730073s != 0) {
                s0073ss00730073s = 24;
                ss0073s00730073s = sss007300730073s();
            }
            return qqqqqqb.b0062b0062b00620062(privateKey, bArr);
        }
    }

    public interface qqqbqqb {
        byte[] getOid();

        BigInteger getSerialNumber();

        byte[] getSubject();

        byte[] signData(byte[] bArr);
    }

    static {
        int iQ00710071007100710071q = qqqbqbb.q00710071007100710071q();
        if ((aa00610061006100610061() * (aa00610061006100610061() + aaa0061006100610061)) % a0061a0061006100610061 != s0073s0073sss) {
            a00610061a006100610061 = aa00610061006100610061();
            s0073s0073sss = 17;
        }
        ww00770077ww0077 = qqqqbbb.q0071007100710071q0071("S\u007ft\u0002}vpVo\u0003[{uwi", (char) (iQ00710071007100710071q ^ 1589694662), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694672), (char) (qbbqqbb.qqq007100710071q() ^ (-321957278)));
        w007700770077ww0077 = qqqqbbb.q0071q00710071q0071("\u00198<;=\u000e022<35C%\u0017\u001f(JIGGA\u001cQQF", (char) (qqqbqbb.q00710071007100710071q() ^ 1589694476), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710748)));
        w0077w0077ww0077 = qqbbqbq.b0062b006200620062b(qqqqqqb.class);
    }

    public static int aa00610061006100610061() {
        return 89;
    }

    public static /* synthetic */ byte[] b006200620062b00620062(String str) {
        try {
            throw null;
        } catch (Exception unused) {
            a00610061a006100610061 = 40;
            while (true) {
                try {
                    int[] iArr = new int[-1];
                } catch (Exception unused2) {
                    a00610061a006100610061 = 84;
                    int i = 2;
                    while (true) {
                        try {
                            i /= 0;
                        } catch (Exception unused3) {
                            a00610061a006100610061 = 51;
                            return q00710071qqqq(str);
                        }
                    }
                }
            }
        }
    }

    private static TMXStrongAuth.AuthParamResult b00620062b006200620062(@Nonnull Context context, @Nonnull String str, @Nonnull String str2, @Nonnull String str3, @Nonnull byte[] bArr, @Nonnull TMXStrongAuth.AuthMethod authMethod, @Nonnull TMXStrongAuth.StrongAuthCallback strongAuthCallback, boolean z, PrivateKey privateKey, long j) {
        TMXStrongAuth.AuthenticationStatus authenticationStatusB0062bb006200620062 = b0062bb006200620062(context, str2, str3, strongAuthCallback);
        int i = AnonymousClass2.ww0077w0077w0077[authenticationStatusB0062bb006200620062.ordinal()];
        if (i == 1) {
            return qqq0071qqq(context, str, str3, bArr, authMethod, z, privateKey, j);
        }
        if (i != 2) {
            if (i == 3) {
                qqbbqbq.i(w0077w0077ww0077, qqqqbbb.q0071q00710071q0071("HhXbF`\u000f4NUW_[M!\u0006:WHT\u0001C@L@AGF><v7JH;7?D81.@497", (char) (qqqbqbb.q00710071007100710071q() ^ 1589694472), (char) ((-321957280) ^ qbbqqbb.qqq007100710071q())));
                return TMXStrongAuth.generateAuthParamResult(TMXStrongAuth.AuthResult.STEPUP_CANCELLED, null);
            }
            qqbbqbq.qbbbqbq.e(w0077w0077ww0077, qqqqbbb.q0071007100710071q0071("\u0006&\u0016 \u0004\u001eLq\f\u0013\u0015\u001d\u0019\u000b^C\u0004\u0017\u0015\b\u0004\f\u0011\u0005}z\r\u0001\u0006\u00044\u0007\u0007r\u0005\u0005\u0002-u~*", (char) (qbbqqbb.qqq007100710071q() ^ (-321957158)), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710839)), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694665)) + authenticationStatusB0062bb006200620062);
            return TMXStrongAuth.generateAuthParamResult(TMXStrongAuth.AuthResult.STEPUP_FAILED, null);
        }
        String str4 = w0077w0077ww0077;
        char cQq00710071q0071q = (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710880));
        char cQqq007100710071q = (char) ((-321957280) ^ qbbqqbb.qqq007100710071q());
        int i2 = a00610061a006100610061;
        if (((aaa0061006100610061 + i2) * i2) % a0061a0061006100610061 != s0073s0073sss) {
            a00610061a006100610061 = 45;
            s0073s0073sss = aa00610061006100610061();
        }
        qqbbqbq.i(str4, qqqqbbb.q0071q00710071q0071("EeU_C]\f1KRT\\XJ\u001e\u0003#VTGCKPD=:L@ECsAAEo?=@?4,5-", cQq00710071q0071q, cQqq007100710071q));
        return TMXStrongAuth.generateAuthParamResult(TMXStrongAuth.AuthResult.NOT_SUPPORTED, null);
    }

    private static KeyStore.Entry b0062b0062006200620062(@Nonnull String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        String strConcat = qqqqbbb.q0071007100710071q0071("8Q\u00039|\u0005\u0015N\u0010Quq?Vw9\u0002\u001aH\u007f?n;(e\u0012", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710851)), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694582), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710746))).concat(str);
        try {
            KeyStore keyStore = KeyStore.getInstance(qqqqbbb.q0071q00710071q0071(">j_lha[AZmFf`bT", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710681)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014677)));
            int i = a00610061a006100610061;
            if (((aaa0061006100610061 + i) * i) % a0061a0061006100610061 != s0073s0073sss) {
                a00610061a006100610061 = aa00610061006100610061();
                s0073s0073sss = 53;
            }
            keyStore.load(null);
            return keyStore.getEntry(strConcat, null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | CertificateException unused) {
            return null;
        }
    }

    public static /* synthetic */ byte[] b0062b0062b00620062(PrivateKey privateKey, byte[] bArr) {
        int i = a00610061a006100610061;
        if (((aaa0061006100610061 + i) * i) % a0061a0061006100610061 != 0) {
            a00610061a006100610061 = aa00610061006100610061();
            s0073s0073sss = 16;
        }
        return qq00710071qqq(privateKey, bArr);
    }

    public static TMXStrongAuth.AuthenticationStatus b0062bb006200620062(Context context, String str, String str2, @Nullable TMXStrongAuth.StrongAuthCallback strongAuthCallback) {
        if (strongAuthCallback == null || qqqbbbq.w00770077007700770077w < 21) {
            return TMXStrongAuth.AuthenticationStatus.TMX_STRONG_AUTH_NOT_POSSIBLE;
        }
        int i = 3;
        while (true) {
            try {
                i /= 0;
            } catch (Exception unused) {
                a00610061a006100610061 = 19;
                while (true) {
                    try {
                        i /= 0;
                    } catch (Exception unused2) {
                        a00610061a006100610061 = 44;
                        return qbqbbbq.b0062bbb00620062(context, str, str2, strongAuthCallback);
                    }
                }
            }
        }
    }

    private static byte[] bb00620062006200620062(PrivateKey privateKey) {
        return qqqqbbb.q0071q00710071q0071("zy", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710785)), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694666)).equalsIgnoreCase(privateKey.getAlgorithm()) ? qqbqqbq.w0077wwwww : qqbqqbq.ww0077wwww;
    }

    public static /* synthetic */ byte[] bb00620062b00620062(PrivateKey privateKey) {
        int i = a00610061a006100610061;
        if (((aaa0061006100610061 + i) * i) % a0061a0061006100610061 != 0) {
            a00610061a006100610061 = 3;
            s0073s0073sss = aa00610061006100610061();
        }
        return bb00620062006200620062(privateKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v7, types: [com.lexisnexisrisk.threatmetrix.rl.TMXStrongAuth$AuthParamResult] */
    @Nonnull
    public static TMXStrongAuth.AuthParamResult bb0062b006200620062(@Nullable String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        TMXStrongAuth.AuthResult authResult;
        TMXStrongAuth.AuthResult authResult2;
        if (qbbqbbq.b0062006200620062b0062(str)) {
            authResult2 = TMXStrongAuth.AuthResult.MISSING_PARAMETER;
        } else {
            String strBbbbb00620062 = qbbqbbq.bbbbb00620062(str.toLowerCase().getBytes());
            if (!qbbqbbq.b0062006200620062b0062(strBbbbb00620062)) {
                String strConcat = qqqqbbb.q0071q00710071q0071("ULa{5'0\u0012Azv\u0012S&+P\u001b*pQ\u0011VR\u0003\u0012\u001e", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710874)), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694661)).concat(strBbbbb00620062);
                try {
                    KeyStore keyStore = KeyStore.getInstance(qqqqbbb.q0071007100710071q0071("M\u0005O90\u00130A\u000b*C\u0004\bO\u0003", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014506), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014608), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694664)));
                    keyStore.load(null);
                    if (keyStore.containsAlias(strConcat)) {
                        keyStore.deleteEntry(strConcat);
                        authResult = TMXStrongAuth.AuthResult.DEREGISTERED;
                    } else {
                        qqbbqbq.i(w0077w0077ww0077, qqqqbbb.q0071007100710071q0071("(JXLOR]_Q_\u000e5QZ^hfZ0\u0017Ml_m\u001ckms sgjmxzlznn", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710694)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014667), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710747))));
                        authResult = TMXStrongAuth.AuthResult.CONTEXT_NOT_FOUND;
                    }
                    strConcat = TMXStrongAuth.generateAuthParamResult(authResult, null);
                    return strConcat;
                } catch (IOException | RuntimeException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
                    String str2 = w0077w0077ww0077;
                    StringBuilder sb = new StringBuilder();
                    String strQ0071007100710071q0071 = qqqqbbb.q0071007100710071q0071(")No&<B %iz<(Wc:G\u0018\u000fw!XzY\u00167fM\u0004 &\u0001s\u0004Sa9s>\u001b\"='", (char) (qqqbqbb.q00710071007100710071q() ^ 1589694550), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710742)), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694668));
                    int i = a00610061a006100610061;
                    if (((aaa0061006100610061 + i) * i) % a0061a0061006100610061 != s0073s0073sss) {
                        a00610061a006100610061 = aa00610061006100610061();
                        s0073s0073sss = aa00610061006100610061();
                    }
                    sb.append(strQ0071007100710071q0071);
                    sb.append(strConcat);
                    qqbbqbq.qbbbqbq.d(str2, sb.toString());
                }
            }
            authResult2 = TMXStrongAuth.AuthResult.DEREGISTRATION_FAILED;
        }
        return TMXStrongAuth.generateAuthParamResult(authResult2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0127  */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.security.KeyPair bbb0062006200620062(@javax.annotation.Nonnull java.lang.String r11, @javax.annotation.Nonnull android.content.Context r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, @javax.annotation.Nonnull java.math.BigInteger r16, @javax.annotation.Nonnull java.util.Calendar r17, @javax.annotation.Nonnull java.util.Calendar r18, boolean r19, boolean r20, byte[] r21) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidAlgorithmParameterException {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqqqb.bbb0062006200620062(java.lang.String, android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.math.BigInteger, java.util.Calendar, java.util.Calendar, boolean, boolean, byte[]):java.security.KeyPair");
    }

    private static TMXStrongAuth.AuthParamResult bbbb006200620062(@Nonnull Context context, @Nonnull String str, @Nonnull String str2, @Nonnull String str3, @Nonnull byte[] bArr, @Nonnull TMXStrongAuth.AuthMethod authMethod, @Nullable TMXStrongAuth.StrongAuthCallback strongAuthCallback) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        TMXStrongAuth.AuthResult authResult;
        qbbqqqb qbbqqqbVarQ0071qqqqq = q0071qqqqq(str);
        if (qbbqqqbVarQ0071qqqqq == null) {
            qqbbqbq.i(w0077w0077ww0077, qqqqbbb.q0071q00710071q0071("\u001e>.8\u001c6d\n$+-51#v[\u0010-\u001e*V\u001f(S!!%O!\u0013\u0014\u0015\u001e\u001e\u000e\u001a\f\n", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014566), (char) (qbbqqbb.qqq007100710071q() ^ (-321957273))));
            authResult = TMXStrongAuth.AuthResult.CONTEXT_NOT_FOUND;
        } else {
            TMXStrongAuth.AuthenticationStatus authenticationStatusB0062bb006200620062 = b0062bb006200620062(context, str2, str3, strongAuthCallback);
            int[] iArr = AnonymousClass2.ww0077w0077w0077;
            int i = a00610061a006100610061;
            if (((aaa0061006100610061 + i) * i) % a0061a0061006100610061 != s0073s0073sss) {
                a00610061a006100610061 = 21;
                s0073s0073sss = aa00610061006100610061();
            }
            int i2 = iArr[authenticationStatusB0062bb006200620062.ordinal()];
            if (i2 == 1) {
                return q007100710071qqq(str3, bArr, authMethod, qbbqqqbVarQ0071qqqqq);
            }
            if (i2 == 2) {
                qqbbqbq.i(w0077w0077ww0077, qqqqbbb.q0071q00710071q0071("[}o{a}.Uqz~\t\u0007zP7Y\u000f\u000f\u0004\u0002\f\u0013\t\u0004\u0003\u0017\r\u0014\u0014F\u0011\u001cI\u001a\u001a\u0019'N\u0016 $Rt\u0005~Viid", (char) (qbbqqbb.qqq007100710071q() ^ (-321957152)), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694671)));
                authResult = TMXStrongAuth.AuthResult.NOT_SUPPORTED;
            } else if (i2 != 3) {
                qqbbqbq.i(w0077w0077ww0077, qqqqbbb.q0071007100710071q0071("\t+\u001d)\u000f+[\u0003\u001f(,64(}d\u001b:-;i/51<uDpBEC8;<<xQDPE}@UUJHRYOJI]SZZ", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014656), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694703), (char) (qbbqqbb.qqq007100710071q() ^ (-321957279))));
                authResult = TMXStrongAuth.AuthResult.STEPUP_FAILED;
            } else {
                qqbbqbq.i(w0077w0077ww0077, qqqqbbb.q0071q00710071q0071("BdVbHd\u0015<Xaeoma7\u001eTsft#gftjmuvpp-o\u0005\u0005yw\u0002\t~yx\r\u0003\n\n", (char) (qqqbqbb.q00710071007100710071q() ^ 1589694497), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710747))));
                authResult = TMXStrongAuth.AuthResult.STEPUP_CANCELLED;
            }
        }
        return TMXStrongAuth.generateAuthParamResult(authResult, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static TMXStrongAuth.AuthParamResult q007100710071qqq(@Nonnull String str, @Nonnull byte[] bArr, @Nonnull TMXStrongAuth.AuthMethod authMethod, @Nonnull qqqbqqb qqqbqqbVar) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(qqqqbbb.q0071q00710071q0071("^RJ59;;", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710756)), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694667)));
            try {
                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                messageDigest.update(bytes);
                byte[] bArrDigest = messageDigest.digest();
                messageDigest.reset();
                HashSet hashSet = new HashSet(3);
                hashSet.add(Arrays.asList(qqbqqbq.www0077www, new HashSet(Collections.singletonList(qqbqqbq.b00620062bb0062b(bArrDigest)))));
                hashSet.add(Arrays.asList(qqbqqbq.w0077w0077www, new HashSet(Collections.singletonList(qqbqqbq.b00620062bb0062b(bArr)))));
                byte[] bArr2 = qqbqqbq.ww00770077www;
                byte[] bArr3 = qqbqqbq.wwww0077ww;
                hashSet.add(Arrays.asList(bArr2, new HashSet(Collections.singletonList(bArr3))));
                hashSet.add(Arrays.asList(qqbqqbq.w007700770077www, new HashSet(Collections.singletonList(qqbqqbq.b00620062bb0062b(authMethod.methodName.getBytes())))));
                byte[] bArrB00620062b0062bb = qqbqqbq.b00620062b0062bb(hashSet);
                String str2 = w0077w0077ww0077;
                qqbbqbq.qbbbqbq.d(str2, qqqqbbb.q0071q00710071q0071("6kk`\u0019[opogauugv>%", (char) (qqqbqbb.q00710071007100710071q() ^ 1589694581), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014676)) + qbbqbbq.bbb00620062b0062(bArrB00620062b0062bb));
                byte[] bArrSignData = qqqbqqbVar.signData(bArrB00620062b0062bb);
                if (bArrSignData == null) {
                    qqbbqbq.qbbbqbq.e(str2, qqqqbbb.q0071q00710071q0071("\u00117g\u000b};\\\u0002-H\u0010{\\%8\u00168y\u0005{3\u0001g_#\bcf_S$\u0014pJ_\r\u0019A'21", (char) (qbbqqbb.qqq007100710071q() ^ (-321957125)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014683)));
                    return TMXStrongAuth.generateAuthParamResult(TMXStrongAuth.AuthResult.STEPUP_FAILED, null);
                }
                byte[] bArr4 = qqbqqbq.ww0077w0077ww;
                List listAsList = Arrays.asList(1, new HashSet(Collections.singletonList(Arrays.asList(bArr4, null))), Arrays.asList(bArr3, qqbqqbq.b0062bb0062bb(Collections.singletonList(qqbqqbq.b00620062bb0062b(bytes)), (byte) 2, (byte) 0)), new HashSet(Collections.singletonList(Arrays.asList(1, Arrays.asList(qqqbqqbVar.getSubject(), qqqbqqbVar.getSerialNumber()), Arrays.asList(bArr4, null), qqbqqbq.b0062bb0062bb(bArrB00620062b0062bb, (byte) 2, (byte) 0), Arrays.asList(qqqbqqbVar.getOid()), qqbqqbq.b00620062bb0062b(bArrSignData)))));
                int i = a00610061a006100610061;
                if (((aaa0061006100610061 + i) * i) % a0061a0061006100610061 != 0) {
                    a00610061a006100610061 = 51;
                    s0073s0073sss = aa00610061006100610061();
                }
                return TMXStrongAuth.generateAuthParamResult(TMXStrongAuth.AuthResult.STEPUP_COMPLETE, qbbqbbq.bbb00620062b0062(qqbqqbq.b00620062b0062bb(Arrays.asList(qqbqqbq.w0077ww0077ww, qqbqqbq.b0062bb0062bb(Collections.singletonList(listAsList), (byte) 2, (byte) 0)))));
            } catch (IllegalArgumentException unused) {
                return TMXStrongAuth.generateAuthParamResult(TMXStrongAuth.AuthResult.MISSING_PARAMETER, null);
            }
        } catch (NoSuchAlgorithmException unused2) {
            return TMXStrongAuth.generateAuthParamResult(TMXStrongAuth.AuthResult.NOT_SUPPORTED, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static byte[] q00710071qqqq(String str) {
        byte[] bArrB00620062b0062bb = qqbqqbq.b00620062b0062bb(Arrays.asList(new HashSet(Arrays.asList(Arrays.asList(qqbqqbq.w00770077wwww, str)))));
        int i = a00610061a006100610061;
        if (((aaa0061006100610061 + i) * i) % a0061a0061006100610061 != 0) {
            a00610061a006100610061 = 25;
            s0073s0073sss = 91;
        }
        return bArrB00620062b0062bb;
    }

    @Nonnull
    public static TMXStrongAuth.AuthParamResult q0071q0071qqq(@Nonnull Context context, @Nonnull String str, @Nonnull String str2, @Nullable String str3, @Nonnull byte[] bArr, @Nullable TMXStrongAuth.StrongAuthCallback strongAuthCallback) throws Exception {
        X509Certificate x509Certificate;
        byte[] signature;
        TMXStrongAuth.AuthResult authResult;
        if (qbbqbbq.b0062006200620062b0062(str3)) {
            authResult = TMXStrongAuth.AuthResult.MISSING_PARAMETER;
        } else {
            String strBbbbb00620062 = qbbqbbq.bbbbb00620062(str3.toLowerCase().getBytes());
            if (strBbbbb00620062 == null) {
                authResult = TMXStrongAuth.AuthResult.REGISTRATION_FAILED;
            } else if (b0062b0062006200620062(strBbbbb00620062) instanceof KeyStore.PrivateKeyEntry) {
                qqbbqbq.i(w0077w0077ww0077, qqqqbbb.q0071q00710071q0071("EW\\]jj^j\u001b@^eksse\u001d\u0002:WLX\tIW\\RMSg\u0011b89>GK;K=?", (char) (qbbqqbb.qqq007100710071q() ^ (-321957226)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014678)));
                authResult = TMXStrongAuth.AuthResult.ALREADY_REGISTERED;
            } else {
                TMXStrongAuth.AuthenticationStatus authenticationStatusB0062bb006200620062 = b0062bb006200620062(context, str, str2, strongAuthCallback);
                if (authenticationStatusB0062bb006200620062 == TMXStrongAuth.AuthenticationStatus.TMX_STRONG_AUTH_NOT_POSSIBLE) {
                    qqbbqbq.i(w0077w0077ww0077, qqqqbbb.q0071q00710071q0071("\u0007\u0019\u001a\u001b$$\u0014 Lq\f\u0013\u0015\u001d\u0019\u000b^Cp\u0011\u0015?\u0012\u0013\r\f\n\f\r|zA4t\b\u0006xt|\u0002unk}qvt%sqnz ompod\\e]\u0017ec\u0014cSdcf]_P\u000bZ[W[KHXHF\u0001DDTF?@Mx\u007f\u0018&\u001es\u0005\u0003{x", (char) (qqqbqbb.q00710071007100710071q() ^ 1589694599), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014674)));
                    authResult = TMXStrongAuth.AuthResult.NOT_SUPPORTED;
                } else if (authenticationStatusB0062bb006200620062 == TMXStrongAuth.AuthenticationStatus.TMX_STRONG_AUTH_CANCELLED) {
                    qqbbqbq.i(w0077w0077ww0077, qqqqbbb.q0071007100710071q0071("+=>?HH8Dp\u0016079A=/\u0003g\u001c9*6b%\".\"#)( \u001eX\u0019,*\u001d\u0019!&\u001a\u0013\u0010\"\u0016\u001b\u0019", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014472), (char) (qbbqqbb.qqq007100710071q() ^ (-321957293)), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710749))));
                    authResult = TMXStrongAuth.AuthResult.REGISTRATION_CANCELLED;
                } else {
                    if (authenticationStatusB0062bb006200620062 != TMXStrongAuth.AuthenticationStatus.TMX_STRONG_AUTH_OK) {
                        qqbbqbq.i(w0077w0077ww0077, qqqqbbb.q0071q00710071q0071("/CFITVHV\u0005,HQU_]Q'\u000eDcVd\u0013X^Ze\u001fm\u001aknladee\"zmyn'i~~sq{\u0003xsr\u0007|\u0004\u0004", (char) (qqqbqbb.q00710071007100710071q() ^ 1589694487), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710747))));
                    } else {
                        try {
                            try {
                                KeyStore keyStore = KeyStore.getInstance(qqqqbbb.q0071007100710071q0071("V\u0003w\u0005\u0001ysYr\u0006^~xzl", (char) (qqqbqbb.q00710071007100710071q() ^ 1589694672), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014620), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710745))));
                                keyStore.load(null);
                                BigInteger bigInteger = new BigInteger(32, new SecureRandom());
                                Calendar calendar = Calendar.getInstance();
                                Calendar calendar2 = Calendar.getInstance();
                                calendar2.add(1, 5);
                                String strConcat = qqqqbbb.q0071q00710071q0071("UtxwyJlnnxoq\u007faS[d\u0007\u0006\u0004\u0004}X\u000e\u000e\u0003", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710798)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014672)).concat(strBbbbb00620062);
                                try {
                                    throw null;
                                } catch (Exception unused) {
                                    a00610061a006100610061 = aa00610061006100610061();
                                    String strQ0071q00710071q0071 = qqqqbbb.q0071q00710071q0071("|+", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014564), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710737)));
                                    String strQ0071q00710071q00712 = qqqqbbb.q0071q00710071q0071("h\u0017\u000e\u001d\u001b\u0016\u0012y\u0015*\u0005'#'\u001b", (char) (qqqbqbb.q00710071007100710071q() ^ 1589694657), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710748)));
                                    int i = a00610061a006100610061;
                                    if (((aaa0061006100610061 + i) * i) % a0061a0061006100610061 != s0073s0073sss) {
                                        a00610061a006100610061 = 69;
                                        s0073s0073sss = 29;
                                    }
                                    KeyPair keyPairBbb0062006200620062 = bbb0062006200620062(strQ0071q00710071q0071, context, strQ0071q00710071q00712, strConcat, strBbbbb00620062, bigInteger, calendar, calendar2, true, true, bArr);
                                    if (keyPairBbb0062006200620062 == null) {
                                        keyPairBbb0062006200620062 = bbb0062006200620062(qqqqbbb.q0071q00710071q0071("\u0012\u0014~", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710888)), (char) (qbbqqbb.qqq007100710071q() ^ (-321957277))), context, qqqqbbb.q0071q00710071q0071("k`(\u001f\u0004:Q`5>\u0016\u0015>Kf", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710833)), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694660)), strConcat, strBbbbb00620062, bigInteger, calendar, calendar2, true, true, bArr);
                                    }
                                    if (keyPairBbb0062006200620062 == null) {
                                        keyPairBbb0062006200620062 = bbb0062006200620062(qqqqbbb.q0071q00710071q0071("|(", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014577), (char) (qbbqqbb.qqq007100710071q() ^ (-321957265))), context, qqqqbbb.q0071q00710071q0071("DpervoiOp\u0004\\|~\u0001r", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014638), (char) (qbbqqbb.qqq007100710071q() ^ (-321957278))), strConcat, strBbbbb00620062, bigInteger, calendar, calendar2, true, false, bArr);
                                    }
                                    if (keyPairBbb0062006200620062 != null && keyPairBbb0062006200620062.getPrivate() != null && keyPairBbb0062006200620062.getPublic() != null) {
                                        try {
                                            Certificate[] certificateChain = keyStore.getCertificateChain(strConcat);
                                            try {
                                                if (certificateChain.length == 0) {
                                                    return TMXStrongAuth.generateAuthParamResult(TMXStrongAuth.AuthResult.REGISTRATION_FAILED, null);
                                                }
                                                if (certificateChain.length == 1) {
                                                    Certificate certificate = certificateChain[0];
                                                    if ((certificate instanceof X509Certificate) && ((signature = (x509Certificate = (X509Certificate) certificate).getSignature()) == null || signature.length <= 2)) {
                                                        byte[] tBSCertificate = x509Certificate.getTBSCertificate();
                                                        byte[] bArrQq00710071qqq = qq00710071qqq(keyPairBbb0062006200620062.getPrivate(), tBSCertificate);
                                                        if (bArrQq00710071qqq != null) {
                                                            return TMXStrongAuth.generateAuthParamResult(TMXStrongAuth.AuthResult.REGISTERED, qbbqbbq.bbb00620062b0062(qqbqqbq.b00620062b0062bb(Arrays.asList(tBSCertificate, Collections.singletonList(bb00620062006200620062(keyPairBbb0062006200620062.getPrivate())), qqbqqbq.bbbbb0062b(bArrQq00710071qqq)))));
                                                        }
                                                        qqbbqbq.qbbbqbq.e(w0077w0077ww0077, qqqqbbb.q0071007100710071q0071("&\u001b\u0018\u001e\u0010\"\"\u001e\u0010I\u0012\u001bF\u0014\u001a\u0010\u000fA\u0013\u0005\u0013\u0013\u000f\n\u0004\b\u007f7W\u000b\t{dv\u0004\u0005z\u0002:]OPQZZWEWKPN^D>EG?=", (char) (qbbqqbb.qqq007100710071q() ^ (-321957145)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014560), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014679)));
                                                        return TMXStrongAuth.generateAuthParamResult(TMXStrongAuth.AuthResult.REGISTRATION_FAILED, null);
                                                    }
                                                }
                                                byte[] encoded = certificateChain[0].getEncoded();
                                                StringBuilder sb = new StringBuilder(((encoded.length * 2) + 1) * certificateChain.length);
                                                sb.append(qbbqbbq.bbb00620062b0062(encoded));
                                                for (int i2 = 1; i2 < certificateChain.length; i2++) {
                                                    sb.append(qqqqbbb.q0071q00710071q0071("\u0003", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710795)), (char) (qbbqqbb.qqq007100710071q() ^ (-321957280))));
                                                    sb.append(qbbqbbq.bbb00620062b0062(certificateChain[i2].getEncoded()));
                                                }
                                                return TMXStrongAuth.generateAuthParamResult(TMXStrongAuth.AuthResult.REGISTERED, sb.toString());
                                            } catch (Exception e) {
                                                throw e;
                                            }
                                        } catch (KeyStoreException | CertificateException unused2) {
                                        }
                                    }
                                }
                            } catch (Exception e2) {
                                throw e2;
                            }
                        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused3) {
                            qqbbqbq.qbbbqbq.d(w0077w0077ww0077, qqqqbbb.q0071q00710071q0071("n\u0001\u0002\u0003\f\f{\b4Ysz|\u0005\u0001rF+Mjv.z%khv!kdwppjl^", (char) (qqqbqbb.q00710071007100710071q() ^ 1589694639), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710746))));
                        }
                    }
                    authResult = TMXStrongAuth.AuthResult.REGISTRATION_FAILED;
                }
            }
        }
        return TMXStrongAuth.generateAuthParamResult(authResult, null);
    }

    private static qbbqqqb q0071qqqqq(@Nonnull String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        byte[] bArrQ00710071qqqq;
        BigInteger serialNumber;
        KeyStore.Entry entryB0062b0062006200620062 = b0062b0062006200620062(str);
        if (!(entryB0062b0062006200620062 instanceof KeyStore.PrivateKeyEntry)) {
            return null;
        }
        KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) entryB0062b0062006200620062;
        int i = a00610061a006100610061;
        if (((aaa0061006100610061 + i) * i) % a0061a0061006100610061 != 0) {
            a00610061a006100610061 = 58;
            s0073s0073sss = 65;
        }
        PrivateKey privateKey = privateKeyEntry.getPrivateKey();
        Certificate certificate = privateKeyEntry.getCertificate();
        if (certificate instanceof X509Certificate) {
            serialNumber = ((X509Certificate) certificate).getSerialNumber();
            bArrQ00710071qqqq = ((X509Certificate) certificate).getSubjectX500Principal().getEncoded();
        } else {
            BigInteger bigInteger = BigInteger.ZERO;
            bArrQ00710071qqqq = q00710071qqqq(str);
            serialNumber = bigInteger;
        }
        return new qbbqqqb(privateKey, serialNumber, bArrQ00710071qqqq);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] qq00710071qqq(@javax.annotation.Nonnull java.security.PrivateKey r7, @javax.annotation.Nonnull byte[] r8) throws java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        /*
            r0 = 0
            r1 = -1208710745(0xffffffffb7f489a7, float:-2.9151166E-5)
            boolean r2 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqbbbq.wwwwww0077     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            if (r2 != 0) goto L2a
            java.lang.String r7 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqqqb.w0077w0077ww0077     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            java.lang.String r8 = "g\u0005\u0011H\u0015?\u0012\u0007\u0004\nF9\u000b|\b\u000b}\u0006wu0rzn\u007f~o|(hxj$qqu `t^eg[[d\\$"
            int r2 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqbqbb.q00710071007100710071q()     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            r3 = 1589694655(0x5ec0d0bf, float:6.9469074E18)
            r2 = r2 ^ r3
            char r2 = (char) r2     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            int r3 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qbqqqbb.qq00710071q0071q()     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            r3 = r3 ^ r1
            char r3 = (char) r3     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            java.lang.String r8 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.q0071q00710071q0071(r8, r2, r3)     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqbbqbq.qbbbqbq.d(r7, r8)     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            return r0
        L23:
            r7 = move-exception
            goto L9e
        L26:
            r7 = move-exception
            goto L9e
        L28:
            r7 = move-exception
            goto L9e
        L2a:
            java.lang.String r2 = "li"
            int r3 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqbqqbb.q0071qq00710071q()     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            r4 = 2118014493(0x7e3e561d, float:6.325011E37)
            r3 = r3 ^ r4
            char r3 = (char) r3     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            int r4 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qbqqqbb.qq00710071q0071q()     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            r5 = -1208710832(0xffffffffb7f48950, float:-2.9151008E-5)
            r4 = r4 ^ r5
            char r4 = (char) r4     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            int r5 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqbqqbb.q0071qq00710071q()     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            r6 = 2118014679(0x7e3e56d7, float:6.3251054E37)
            r5 = r5 ^ r6
            char r5 = (char) r5     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            java.lang.String r2 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.q0071007100710071q0071(r2, r3, r4, r5)     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            java.lang.String r3 = r7.getAlgorithm()     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            if (r2 == 0) goto L6e
            java.lang.String r2 = "SIC59;}p|qONP`O"
            int r3 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqbqbb.q00710071007100710071q()     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            r4 = 1589694514(0x5ec0d032, float:6.9468299E18)
            r3 = r3 ^ r4
            char r3 = (char) r3     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            int r4 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qbqqqbb.qq00710071q0071q()     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            r5 = -1208710748(0xffffffffb7f489a4, float:-2.915116E-5)
            r4 = r4 ^ r5
            char r4 = (char) r4     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            java.lang.String r2 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.q0071q00710071q0071(r2, r3, r4)     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            goto L8f
        L6e:
            java.lang.String r2 = "\u0011\u0005|lnn/ *\u001d\u0006\u0006r"
            int r3 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqbqqbb.q0071qq00710071q()     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            r4 = 2118014612(0x7e3e5694, float:6.3250715E37)
            r3 = r3 ^ r4
            char r3 = (char) r3     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            int r4 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqbqbb.q00710071007100710071q()     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            r5 = 1589694518(0x5ec0d036, float:6.9468321E18)
            r4 = r4 ^ r5
            char r4 = (char) r4     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            int r5 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqbqqbb.q0071qq00710071q()     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            r6 = 2118014675(0x7e3e56d3, float:6.3251034E37)
            r5 = r5 ^ r6
            char r5 = (char) r5     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            java.lang.String r2 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.q0071007100710071q0071(r2, r3, r4, r5)     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
        L8f:
            java.security.Signature r2 = java.security.Signature.getInstance(r2)     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            r2.initSign(r7)     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            r2.update(r8)     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            byte[] r7 = r2.sign()     // Catch: java.security.InvalidKeyException -> L23 java.security.SignatureException -> L26 java.security.NoSuchAlgorithmException -> L28
            return r7
        L9e:
            java.lang.String r8 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqqqb.w0077w0077ww0077
            int r2 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qbqqqbb.qq00710071q0071q()
            r1 = r1 ^ r2
            char r1 = (char) r1
            int r2 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqbqqbb.q0071qq00710071q()
            r3 = 2118014678(0x7e3e56d6, float:6.325105E37)
            r2 = r2 ^ r3
            char r2 = (char) r2
            java.lang.String r3 = "Daq)y$zopv+~uq/w\u007f\u0001\t\u00075\u0010\u0015"
            java.lang.String r1 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.q0071q00710071q0071(r3, r1, r2)
            java.lang.String r7 = r7.toString()
            int r2 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqqqb.a00610061a006100610061
            int r3 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqqqb.aaa0061006100610061
            int r3 = r3 + r2
            int r3 = r3 * r2
            int r2 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqqqb.a0061a0061006100610061
            int r3 = r3 % r2
            int r2 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqqqb.s0073s0073sss
            if (r3 == r2) goto Ld2
            int r2 = aa00610061006100610061()
            com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqqqb.a00610061a006100610061 = r2
            int r2 = aa00610061006100610061()
            com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqqqb.s0073s0073sss = r2
        Ld2:
            java.lang.String[] r7 = new java.lang.String[]{r7}
            com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqbbqbq.i(r8, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqqqb.qq00710071qqq(java.security.PrivateKey, byte[]):byte[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v7, types: [com.lexisnexisrisk.threatmetrix.rl.TMXStrongAuth$AuthParamResult] */
    @Nullable
    public static TMXStrongAuth.AuthParamResult qq0071qqqq(@Nullable String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        if (!qbbqbbq.b0062006200620062b0062(str)) {
            String strBbbbb00620062 = qbbqbbq.bbbbb00620062(str.toLowerCase().getBytes());
            if (!qbbqbbq.b0062006200620062b0062(strBbbbb00620062)) {
                String strConcat = qqqqbbb.q0071q00710071q0071("p\u000e\u0010\r\u0015c\u0004\u0004y\u0002vv\u000bjZ`_\u007f|x~vO\u0003xk", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014537), (char) (qbbqqbb.qqq007100710071q() ^ (-321957277))).concat(strBbbbb00620062);
                try {
                    char cQq00710071q0071q = (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710750));
                    char cQqq007100710071q = (char) (qbbqqbb.qqq007100710071q() ^ (-321957250));
                    int iQqq007100710071q = qbbqqbb.qqq007100710071q() ^ (-321957275);
                    int i = a00610061a006100610061;
                    if (((aaa0061006100610061 + i) * i) % a0061a0061006100610061 != 0) {
                        a00610061a006100610061 = 30;
                        s0073s0073sss = 32;
                    }
                    KeyStore keyStore = KeyStore.getInstance(qqqqbbb.q0071007100710071q0071("E=;?BP3J\u0006a1\u00107\u000bc", cQq00710071q0071q, cQqq007100710071q, (char) iQqq007100710071q));
                    keyStore.load(null);
                    strConcat = TMXStrongAuth.generateAuthParamResult(!keyStore.containsAlias(strConcat) ? TMXStrongAuth.AuthResult.CONTEXT_NOT_FOUND : TMXStrongAuth.AuthResult.ALREADY_REGISTERED, null);
                    return strConcat;
                } catch (IOException | RuntimeException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
                    qqbbqbq.qbbbqbq.d(w0077w0077ww0077, qqqqbbb.q0071q00710071q0071("l\nz\u00073U\u0001~\u0014\u0004\u0016\u0011;l~\u007fpyyvdvjo}.\u0001\u0001l~~{W\u001a\u001e\u001a\u0017\u001eQ\u0017!(*\" tY", (char) (qbbqqbb.qqq007100710071q() ^ (-321957361)), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694665)) + strConcat);
                }
            }
        }
        return TMXStrongAuth.generateAuthParamResult(TMXStrongAuth.AuthResult.MISSING_PARAMETER, null);
    }

    private static TMXStrongAuth.AuthParamResult qqq0071qqq(@Nonnull final Context context, @Nonnull final String str, @Nonnull String str2, @Nonnull byte[] bArr, @Nonnull TMXStrongAuth.AuthMethod authMethod, boolean z, PrivateKey privateKey, long j) {
        return z ? privateKey == null ? TMXStrongAuth.generateAuthParamResult(TMXStrongAuth.AuthResult.CONTEXT_NOT_FOUND, null) : q007100710071qqq(str2, bArr, authMethod, new qbbqqqb(privateKey, BigInteger.valueOf(j), q00710071qqqq(str))) : qqqqbbq.b00620062bbb0062().b006200620062bb0062() ? q007100710071qqq(str2, bArr, authMethod, new qqqbqqb() { // from class: com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqqqb.1
            public static int s0073007300730073ss = 1;
            public static int s0073sss0073s = 0;
            public static int ss007300730073ss = 64;
            public static int sssss0073s = 2;

            public static int s00730073ss0073s() {
                return 91;
            }

            public static int ss0073ss0073s() {
                return 2;
            }

            @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqqqb.qqqbqqb
            public byte[] getOid() {
                int i = ss007300730073ss;
                if (((s0073007300730073ss + i) * i) % sssss0073s != 0) {
                    ss007300730073ss = 80;
                    s0073007300730073ss = 19;
                }
                return qqbqqbq.w0077wwwww;
            }

            @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqqqb.qqqbqqb
            public BigInteger getSerialNumber() {
                BigInteger bigInteger = BigInteger.ZERO;
                int i = ss007300730073ss;
                if (((s0073007300730073ss + i) * i) % ss0073ss0073s() != s0073sss0073s) {
                    ss007300730073ss = 69;
                    s0073sss0073s = s00730073ss0073s();
                }
                return bigInteger;
            }

            @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqqqb.qqqbqqb
            public byte[] getSubject() {
                byte[] bArrB006200620062b00620062 = qqqqqqb.b006200620062b00620062(str);
                int i = ss007300730073ss;
                if (((s0073007300730073ss + i) * i) % sssss0073s != s0073sss0073s) {
                    ss007300730073ss = 22;
                    s0073sss0073s = s00730073ss0073s();
                }
                return bArrB006200620062b00620062;
            }

            @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqqqb.qqqbqqb
            public byte[] signData(byte[] bArr2) {
                while (true) {
                    try {
                        int[] iArr = new int[-1];
                    } catch (Exception unused) {
                        return qqqqbbq.b00620062bbb0062().bb0062b0062b0062(bArr2, context.getContentResolver());
                    }
                }
            }
        }) : TMXStrongAuth.generateAuthParamResult(TMXStrongAuth.AuthResult.NOT_SUPPORTED, null);
    }

    @Nonnull
    public static TMXStrongAuth.AuthParamResult qqqq0071qq(@Nonnull Context context, @Nonnull TMXStrongAuth.AuthMethod authMethod, @Nonnull String str, @Nonnull String str2, @Nonnull String str3, @Nonnull byte[] bArr, @Nonnull TMXStrongAuth.StrongAuthCallback strongAuthCallback, boolean z, PrivateKey privateKey, long j) {
        if (authMethod == TMXStrongAuth.AuthMethod.TMX_USER_PRESENCE) {
            return bbbb006200620062(context, str3, str, str2, bArr, authMethod, strongAuthCallback);
        }
        if (authMethod == TMXStrongAuth.AuthMethod.TMX_DEVICE_PRESENCE) {
            return b00620062b006200620062(context, str3, str, str2, bArr, authMethod, strongAuthCallback, z, privateKey, j);
        }
        TMXStrongAuth.AuthResult authResult = TMXStrongAuth.AuthResult.MISSING_FUNCTION;
        int i = a00610061a006100610061;
        if (((aaa0061006100610061 + i) * i) % a0061a0061006100610061 != s0073s0073sss) {
            a00610061a006100610061 = aa00610061006100610061();
            s0073s0073sss = 28;
        }
        return TMXStrongAuth.generateAuthParamResult(authResult, null);
    }
}
