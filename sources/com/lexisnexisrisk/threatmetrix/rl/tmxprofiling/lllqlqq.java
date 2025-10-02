package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.content.Context;
import android.security.KeyChain;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class lllqlqq {
    private static boolean g00670067gg0067g = false;
    private static final long g0067g00670067gg = 1656633600000L;

    @Nullable
    public static PrivateKey g0067ggg0067g = null;
    private static boolean gg0067gg0067g = false;
    public static int s0073s0073007300730073s = 0;
    public static int s0073ss007300730073s = 1;
    public static int ss0073s007300730073s = 2;
    public static int ssss007300730073s = 35;
    private static final String gg0067g0067gg = jxxjjxx.ss0073sss0073s("Bncple_E^qJjdfX", (char) (jjxxxjx.s00730073ss0073ss() ^ 783951066), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701660)));
    private static final String g00670067g0067gg = jxxjjxx.ss0073sss0073s("b\u007f\u0002~~MmmkshhtTDJ", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354555), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354563));
    private static final String ggg00670067gg = jxxjjxx.sss0073ss0073s("PJ\\OcN`TOd[WS", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701707)), (char) (jxjxxjx.s0073sss0073ss() ^ 513829267), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354574));
    private static final String g0067gg0067gg = lqlqqll.u00750075u00750075u(lllqlqq.class);
    public static long gg006700670067gg = 0;

    @Nullable
    private static String g0067006700670067gg = null;

    @Nullable
    private static PublicKey ggggg0067g = null;

    static {
        int i = ssss007300730073s;
        if (((s0073ss007300730073s + i) * i) % ss0073s007300730073s != 0) {
            ssss007300730073s = s00730073s007300730073s();
            s0073s0073007300730073s = 60;
        }
        g0067ggg0067g = null;
        gg0067gg0067g = false;
        int i2 = ssss007300730073s;
        if (((s0073ss007300730073s + i2) * i2) % ss0073s007300730073s != s0073s0073007300730073s) {
            ssss007300730073s = 47;
            s0073s0073007300730073s = s00730073s007300730073s();
        }
        g00670067gg0067g = false;
    }

    private lllqlqq() {
    }

    private static void g006700670067g0067g0067(KeyStore keyStore) throws Exception {
        if (keyStore == null) {
            return;
        }
        try {
            keyStore.deleteEntry(jxxjjxx.sss0073ss0073s("\f1d/S+TEJ\u0010/}!l4\u0004", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701541)), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950989), (char) (jxjxxjx.s0073sss0073ss() ^ 513829274)));
            int i = ssss007300730073s;
            if (((s0073ss007300730073s + i) * i) % ss0073s007300730073s != 0) {
                ssss007300730073s = s00730073s007300730073s();
                s0073s0073007300730073s = s00730073s007300730073s();
            }
        } catch (KeyStoreException e) {
            lqlqqll.llqqqll.u0075u0075uuu(g0067gg0067gg, jxxjjxx.ss0073sss0073s(":\u000b\u0006*7>\u0013+{HQ\f;\u0003Qe\u0019_Ul\u001d~jZ+_F\u0019\"P\u0019d)Yy[j\u0014\u00060\u0012:", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701608)), (char) (jxjxxjx.s0073sss0073ss() ^ 513829273)), e.toString());
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x013e A[Catch: all -> 0x0119, UnrecoverableEntryException -> 0x011c, KeyStoreException -> 0x011f, NoSuchAlgorithmException -> 0x0122, CertificateException -> 0x0125, IOException -> 0x0128, TryCatch #7 {IOException -> 0x0128, CertificateException -> 0x0125, blocks: (B:24:0x00ec, B:26:0x00f6, B:45:0x0137, B:47:0x013e, B:49:0x0181, B:51:0x019c, B:66:0x0310, B:69:0x0315, B:71:0x0389, B:73:0x03a5, B:72:0x039f, B:52:0x01c2, B:54:0x023d, B:65:0x0304, B:56:0x025d, B:60:0x0289, B:62:0x02e0, B:75:0x03b2), top: B:87:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c2 A[Catch: all -> 0x0119, UnrecoverableEntryException -> 0x011c, KeyStoreException -> 0x011f, NoSuchAlgorithmException -> 0x0122, CertificateException -> 0x0125, IOException -> 0x0128, TryCatch #7 {IOException -> 0x0128, CertificateException -> 0x0125, blocks: (B:24:0x00ec, B:26:0x00f6, B:45:0x0137, B:47:0x013e, B:49:0x0181, B:51:0x019c, B:66:0x0310, B:69:0x0315, B:71:0x0389, B:73:0x03a5, B:72:0x039f, B:52:0x01c2, B:54:0x023d, B:65:0x0304, B:56:0x025d, B:60:0x0289, B:62:0x02e0, B:75:0x03b2), top: B:87:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0314 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0315 A[Catch: all -> 0x0119, UnrecoverableEntryException -> 0x011c, KeyStoreException -> 0x011f, NoSuchAlgorithmException -> 0x0122, CertificateException -> 0x0125, IOException -> 0x0128, TryCatch #7 {IOException -> 0x0128, CertificateException -> 0x0125, blocks: (B:24:0x00ec, B:26:0x00f6, B:45:0x0137, B:47:0x013e, B:49:0x0181, B:51:0x019c, B:66:0x0310, B:69:0x0315, B:71:0x0389, B:73:0x03a5, B:72:0x039f, B:52:0x01c2, B:54:0x023d, B:65:0x0304, B:56:0x025d, B:60:0x0289, B:62:0x02e0, B:75:0x03b2), top: B:87:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x044f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean g00670067g00670067g0067(@javax.annotation.Nonnull android.content.Context r19) {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqlqq.g00670067g00670067g0067(android.content.Context):boolean");
    }

    public static boolean g0067gg00670067g0067(@Nullable PrivateKey privateKey, String str) {
        if (nnlllnn.nlnlnln.o006F006Fo006F006F006F()) {
            return lqlqlqq.g00670067006700670067g0067(privateKey, str);
        }
        int i = ssss007300730073s;
        if (((s0073ss007300730073s + i) * i) % ss0073s007300730073s != 0) {
            ssss007300730073s = 18;
            s0073s0073007300730073s = 19;
        }
        return true;
    }

    public static lqqllqq gg00670067g0067g0067(@Nonnull String str, @Nullable nlllnnl nlllnnlVar, @Nonnull String str2) {
        char cS00730073ss0073ss;
        char cS0073sss0073ss;
        String str3;
        String strSs0073sss0073s;
        lqqllqq lqqllqqVar = new lqqllqq();
        if (nlllnnlVar == null || llqllqq.ggggggg0067(str)) {
            cS00730073ss0073ss = (char) (jjxxxjx.s00730073ss0073ss() ^ 783950862);
            cS0073sss0073ss = (char) (jxjxxjx.s0073sss0073ss() ^ 513829275);
            str3 = "\u0016T9\u000e\u000b1`}25+\u0006/Ep\u0019HG\u001f\u0014I5F]V\t";
        } else if (gg0067gg0067g || !g00670067g00670067g0067(nlllnnlVar.ww0077w007700770077)) {
            lqlqqll.llqqqll.yy00790079007900790079(g0067gg0067gg, jxxjjxx.ss0073sss0073s("1NZ\u0012^\tKYKFXH\u0002\u0010\u007fQCQND?O=v!:M#3:Bn4?;8i\u0014-@\u0019935'", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354584), (char) (jxjxxjx.s0073sss0073ss() ^ 513829269)));
            cS00730073ss0073ss = (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701587));
            cS0073sss0073ss = (char) (jxxxxjx.sss0073s0073ss() ^ 1457354575);
            str3 = "*{\u001f,w\u0005}P{?;P\u0001y\t.t[\"\u0001W\u001e04Cd|MJ\u000f(?;\u0013N\u0003]=1";
        } else {
            if (g0067ggg0067g != null && ggggg0067g != null && g0067006700670067gg != null) {
                String strG0067g0067g00670067g = llqllqq.g0067g0067g00670067g(10);
                String strConcat = strG0067g0067g00670067g.concat(str).concat(String.valueOf(gg006700670067gg)).concat(g0067006700670067gg).concat(str2);
                byte[] bArrGgg006700670067g0067 = ggg006700670067g0067(strConcat);
                if (bArrGgg006700670067g0067 != null) {
                    String strGg006700670067g0067g = llqllqq.gg006700670067g0067g(bArrGgg006700670067g0067);
                    lqlqqll.llqqqll.yy00790079007900790079(g0067gg0067gg, jxxjjxx.sss0073ss0073s("\u0003N\">\u000b?\u0011", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950856), (char) (jjxxxjx.s00730073ss0073ss() ^ 783951083), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354573)) + strConcat + jxxjjxx.ss0073sss0073s("d\u0018,;>6?k6An", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354600), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950884)) + strGg006700670067g0067g);
                    lqqllqqVar.gg0067gggg = strGg006700670067g0067g;
                    lqqllqqVar.g00670067gggg = llqllqq.g0067ggg0067g0067(strG0067g0067g00670067g);
                    lqqllqqVar.gg00670067ggg = llqllqq.g0067ggg0067g0067(String.valueOf(gg006700670067gg));
                    lqqllqqVar.g0067g0067ggg = llqllqq.g0067ggg0067g0067(g0067006700670067gg);
                    lqqllqqVar.g006700670067ggg = llqllqq.gg006700670067g0067g(ggggg0067g.getEncoded());
                    lqqllqqVar.gggg0067gg = g00670067gg0067g ? jxxjjxx.ss0073sss0073s("xw{l", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701576)), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701649))) : "";
                    strSs0073sss0073s = null;
                } else {
                    char cS0073sss0073ss2 = (char) (jxjxxjx.s0073sss0073ss() ^ 513829150);
                    int iS00730073ss0073ss = jjxxxjx.s00730073ss0073ss() ^ 783951070;
                    int i = ssss007300730073s;
                    if (((s0073ss007300730073s + i) * i) % ss0073s007300730073s != sss0073007300730073s()) {
                        ssss007300730073s = 8;
                        s0073ss007300730073s = 94;
                    }
                    strSs0073sss0073s = jxxjjxx.sss0073ss0073s("k\u0019\bUL\u0010xCl(|Q\u0017$?p\u0015y:M\u000b[&?\u007f\u001f5", cS0073sss0073ss2, (char) iS00730073ss0073ss, (char) (jxxxxjx.sss0073s0073ss() ^ 1457354572));
                }
                lqqllqqVar.ggg0067ggg = strSs0073sss0073s;
                return lqqllqqVar;
            }
            lqlqqll.llqqqll.yy00790079007900790079(g0067gg0067gg, jxxjjxx.ss0073sss0073s("\u0018>,750m}o!D<J6J<w$?T{FQ~NVNO\u0012", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354537), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701650))));
            int iS00730073ss0073ss2 = jjxxxjx.s00730073ss0073ss();
            int i2 = ssss007300730073s;
            if (((s0073ss007300730073s + i2) * i2) % ss0073s007300730073s != 0) {
                ssss007300730073s = s00730073s007300730073s();
                s0073ss007300730073s = 37;
            }
            cS00730073ss0073ss = (char) (iS00730073ss0073ss2 ^ 783951017);
            cS0073sss0073ss = (char) (jxjxxjx.s0073sss0073ss() ^ 513829276);
            str3 = "YQeVlUi[Xkd^\\emtBLLFDOL_";
        }
        strSs0073sss0073s = jxxjjxx.ss0073sss0073s(str3, cS00730073ss0073ss, cS0073sss0073ss);
        lqqllqqVar.ggg0067ggg = strSs0073sss0073s;
        return lqqllqqVar;
    }

    public static boolean gg0067g00670067g0067(@Nullable PrivateKey privateKey, String str) {
        try {
            throw null;
        } catch (Exception unused) {
            ssss007300730073s = 76;
            int i = 5;
            while (true) {
                try {
                    i /= 0;
                } catch (Exception unused2) {
                    ssss007300730073s = s00730073s007300730073s();
                    if (privateKey == null) {
                        return false;
                    }
                    try {
                    } catch (Throwable th) {
                        String str2 = g0067gg0067gg;
                        char cSss0073s0073ss = (char) (jxxxxjx.sss0073s0073ss() ^ 1457354503);
                        char cS0073sss0073ss = (char) (jxjxxjx.s0073sss0073ss() ^ 513829205);
                        char cS0073sss0073ss2 = (char) (jxjxxjx.s0073sss0073ss() ^ 513829273);
                        int i2 = ssss007300730073s;
                        if (((s0073ss007300730073s + i2) * i2) % s007300730073007300730073s() != s0073s0073007300730073s) {
                            ssss007300730073s = 98;
                            s0073s0073007300730073s = 46;
                        }
                        lqlqqll.uu0075u00750075u(str2, jxxjjxx.sss0073ss0073s("Fes-{(lrpox.zu\u000b2\u0004\u0007\u0005\u0007|\u000b\u000e\u0004\u0001\u0010=F\u0012\u0016\u0010\u0017\r\u0012\u000bF\r!\r\u0010\u001c!\u0017\u001e\u001eYQ.1", cSss0073s0073ss, cS0073sss0073ss, cS0073sss0073ss2), th.toString());
                    }
                    if (nnlllnn.nlnlnln.o006F006Fo006F006F006F()) {
                        return lqlqlqq.gggggg00670067(privateKey, str);
                    }
                    if (nnlllnn.nnnnnln.nlnnnln.ss00730073ss0073 < nnlllnn.nnnnnln.nnlnnln.ssss007300730073 && nnlllnn.nlnlnln.oo006Fo006F006F006F()) {
                        return KeyChain.isBoundKeyAlgorithm(privateKey.getAlgorithm());
                    }
                    return false;
                }
            }
        }
    }

    @Nullable
    private static byte[] ggg006700670067g0067(@Nonnull String str) {
        try {
            if (!nnlllnn.nlnlnln.o006Foo006F006F006F()) {
                lqlqqll.llqqqll.yy00790079007900790079(g0067gg0067gg, jxxjjxx.sss0073ss0073s("\u00110>wFrG>=E\u0004xL@MRGQEE\u0002FPFYZM\\\nL^R\u000e]_e\u0012TjV_cY[f`*", (char) (jxjxxjx.s0073sss0073ss() ^ 513829145), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950879), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354575)));
                return null;
            }
            if (g0067ggg0067g == null) {
                KeyStore keyStore = KeyStore.getInstance(jxxjjxx.ss0073sss0073s("\u000f;0=92,\u0012+>\u0017713%", (char) (jxjxxjx.s0073sss0073ss() ^ 513829158), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701655))));
                keyStore.load(null);
                KeyStore.Entry entry = keyStore.getEntry(jxxjjxx.ss0073sss0073s("e\u0003\t\u0006\nX||~\u0007\u007f\u007f\u0010oci", (char) (jxjxxjx.s0073sss0073ss() ^ 513829362), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701651))), null);
                if (!(entry instanceof KeyStore.PrivateKeyEntry)) {
                    return null;
                }
                g0067ggg0067g = ((KeyStore.PrivateKeyEntry) entry).getPrivateKey();
            }
            String strSss0073ss0073s = jxxjjxx.sss0073ss0073s("qd", (char) (jxjxxjx.s0073sss0073ss() ^ 513829236), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354738), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950886));
            int i = ssss007300730073s;
            if (((s0073ss007300730073s + i) * i) % ss0073s007300730073s != s0073s0073007300730073s) {
                ssss007300730073s = s00730073s007300730073s();
                s0073s0073007300730073s = s00730073s007300730073s();
            }
            Signature signature = Signature.getInstance(strSss0073ss0073s.equalsIgnoreCase(g0067ggg0067g.getAlgorithm()) ? jxxjjxx.ss0073sss0073s("\u0018\u000e\by}\u007fB5A6\u0014\u0013\u0015%\u0014", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354507), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950885)) : jxxjjxx.sss0073ss0073s("\u0016jJ\u001f\tm\u0016k]1\u0002e;", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701588)), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354665), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950880)));
            signature.initSign(g0067ggg0067g);
            signature.update(str.getBytes());
            return signature.sign();
        } catch (IOException e) {
            e = e;
            lqlqqll.uu0075007500750075u(g0067gg0067gg, jxxjjxx.ss0073sss0073s("Ts}7\n6\u0007}\u0001\t7\r\u0006\u0004;\u0006ortt%\u0002\u0001", (char) (jxjxxjx.s0073sss0073ss() ^ 513829233), (char) (jxjxxjx.s0073sss0073ss() ^ 513829276)), e.toString());
            return null;
        } catch (InvalidKeyException e2) {
            e = e2;
            lqlqqll.uu0075007500750075u(g0067gg0067gg, jxxjjxx.ss0073sss0073s("Ts}7\n6\u0007}\u0001\t7\r\u0006\u0004;\u0006ortt%\u0002\u0001", (char) (jxjxxjx.s0073sss0073ss() ^ 513829233), (char) (jxjxxjx.s0073sss0073ss() ^ 513829276)), e.toString());
            return null;
        } catch (KeyStoreException e3) {
            e = e3;
            lqlqqll.uu0075007500750075u(g0067gg0067gg, jxxjjxx.ss0073sss0073s("Ts}7\n6\u0007}\u0001\t7\r\u0006\u0004;\u0006ortt%\u0002\u0001", (char) (jxjxxjx.s0073sss0073ss() ^ 513829233), (char) (jxjxxjx.s0073sss0073ss() ^ 513829276)), e.toString());
            return null;
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            lqlqqll.uu0075007500750075u(g0067gg0067gg, jxxjjxx.ss0073sss0073s("Ts}7\n6\u0007}\u0001\t7\r\u0006\u0004;\u0006ortt%\u0002\u0001", (char) (jxjxxjx.s0073sss0073ss() ^ 513829233), (char) (jxjxxjx.s0073sss0073ss() ^ 513829276)), e.toString());
            return null;
        } catch (SignatureException e5) {
            e = e5;
            lqlqqll.uu0075007500750075u(g0067gg0067gg, jxxjjxx.ss0073sss0073s("Ts}7\n6\u0007}\u0001\t7\r\u0006\u0004;\u0006ortt%\u0002\u0001", (char) (jxjxxjx.s0073sss0073ss() ^ 513829233), (char) (jxjxxjx.s0073sss0073ss() ^ 513829276)), e.toString());
            return null;
        } catch (UnrecoverableEntryException e6) {
            e = e6;
            lqlqqll.uu0075007500750075u(g0067gg0067gg, jxxjjxx.ss0073sss0073s("Ts}7\n6\u0007}\u0001\t7\r\u0006\u0004;\u0006ortt%\u0002\u0001", (char) (jxjxxjx.s0073sss0073ss() ^ 513829233), (char) (jxjxxjx.s0073sss0073ss() ^ 513829276)), e.toString());
            return null;
        } catch (CertificateException e7) {
            e = e7;
            lqlqqll.uu0075007500750075u(g0067gg0067gg, jxxjjxx.ss0073sss0073s("Ts}7\n6\u0007}\u0001\t7\r\u0006\u0004;\u0006ortt%\u0002\u0001", (char) (jxjxxjx.s0073sss0073ss() ^ 513829233), (char) (jxjxxjx.s0073sss0073ss() ^ 513829276)), e.toString());
            return null;
        } catch (Throwable th) {
            String str2 = g0067gg0067gg;
            String strSss0073ss0073s2 = jxxjjxx.sss0073ss0073s("o\b\u001a=TuBP^uV6#4?[N\u00055\f_`f5=d,Iea\u000b\u0012\u0015H55:N[Z\u0006z\u0004", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354658), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950869), (char) (783950886 ^ jjxxxjx.s00730073ss0073ss()));
            int i2 = ssss007300730073s;
            if (((s0073ss007300730073s + i2) * i2) % ss0073s007300730073s != s0073s0073007300730073s) {
                ssss007300730073s = s00730073s007300730073s();
                s0073s0073007300730073s = 82;
            }
            lqlqqll.uu0075u00750075u(str2, strSss0073ss0073s2, th.toString());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.security.KeyPair gggg00670067g0067(@javax.annotation.Nonnull java.lang.String r7, @javax.annotation.Nonnull android.content.Context r8, java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqlqq.gggg00670067g0067(java.lang.String, android.content.Context, java.lang.String, java.lang.String):java.security.KeyPair");
    }

    public static boolean isAvailable(@Nonnull Context context) {
        if (gg0067gg0067g) {
            return false;
        }
        return g00670067g00670067g0067(context);
    }

    public static int s007300730073007300730073s() {
        return 2;
    }

    public static int s00730073s007300730073s() {
        return 15;
    }

    public static int ss00730073007300730073s() {
        return 1;
    }

    public static int sss0073007300730073s() {
        return 0;
    }
}
