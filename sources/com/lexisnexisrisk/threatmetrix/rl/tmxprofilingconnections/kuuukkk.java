package com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections;

import com.dynatrace.android.callback.Callback;
import com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kuukkkk;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.cert.CRLException;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes6.dex */
public class kuuukkk {
    public static int g0067006700670067g0067 = 2;
    public static int g00670067g0067g0067 = 1;
    public static int g0067gg0067g0067 = 59;
    public static int gg006700670067g0067 = 0;
    private static final boolean h00680068hh00680068;
    public static final int h0068hhh00680068 = 64;
    private static final String hh0068hh00680068;
    private final int h0068h0068h00680068;

    @Nullable
    private byte[][] h0068hh006800680068;
    private final kkkkukk hh00680068h00680068;

    @Nullable
    private byte[][] hhhh006800680068;

    @Nonnull
    private final Map<String, String> h006800680068h00680068 = new HashMap();
    private final TMXProfilingConnectionsInterface.TMXHttpResponseCode hhh0068h00680068 = new TMXProfilingConnectionsInterface.TMXHttpResponseCode(-2);
    private URL hh0068h006800680068 = null;
    private HttpsURLConnection h00680068h006800680068 = null;

    static {
        int i = g0067gg0067g0067;
        if (((g00670067g0067g0067 + i) * i) % g0067006700670067g0067 != gg006700670067g0067) {
            g0067gg0067g0067 = 55;
            gg006700670067g0067 = g0067g00670067g0067();
        }
        hh0068hh00680068 = kuukkkk.cc0063ccc0063(kuuukkk.class);
        h00680068hh00680068 = false;
    }

    public kuuukkk(@Nullable byte[][] bArr, @Nullable byte[][] bArr2, int i) {
        this.hhhh006800680068 = bArr;
        this.h0068hh006800680068 = bArr2;
        this.h0068h0068h00680068 = i;
        this.hh00680068h00680068 = h00680068hh00680068 ? new kkkkukk() : null;
    }

    private int c00630063c006300630063(@Nonnull Certificate certificate) {
        byte[] bArrC0063c0063c00630063 = kkuukkk.c0063c0063c00630063(certificate.getPublicKey().getEncoded());
        if (bArrC0063c0063c00630063 == null || !c0063c0063006300630063(this.h0068hh006800680068, bArrC0063c0063c00630063)) {
            String str = hh0068hh00680068;
            StringBuilder sb = new StringBuilder();
            sb.append(kukuukk.kk006Bk006B006Bk("k\u0012\u001b\u0007\u0013\u0011\rI\u001b!\u000f\u001a\u0018\u0013P\u001d\u0018-T\u001e\u0018+!eZ$,13_*5b98/5/h", (char) (kuuukku.k006Bk006Bkk006B() ^ (-910233322)), (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121613)));
            sb.append(bArrC0063c0063c00630063 == null ? kukuukk.kk006Bk006B006Bk("ltlm", (char) (kuuukku.k006Bk006Bkk006B() ^ (-910233223)), (char) (kkuukku.kk006Bkkk006B() ^ (-1182535350))) : kkuukkk.c0063ccc00630063(bArrC0063c0063c00630063));
            kuukkkk.c00630063006300630063c(str, sb.toString());
            return -6;
        }
        int i = 0;
        while (true) {
            try {
                i /= 0;
            } catch (Exception unused) {
                g0067gg0067g0067 = 96;
                return 200;
            }
        }
    }

    private static boolean c0063c0063006300630063(byte[][] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr != null && bArr.length != 0) {
            for (byte[] bArr3 : bArr) {
                int i = g0067gg0067g0067;
                if (((g00670067g0067g0067 + i) * i) % g0067006700670067g0067 != 0) {
                    g0067gg0067g0067 = g0067g00670067g0067();
                    gg006700670067g0067 = 60;
                }
                if (Arrays.equals(bArr2, bArr3)) {
                    return true;
                }
            }
        }
        return false;
    }

    private int c0063cc006300630063(@Nonnull Certificate certificate) {
        String strC0063ccc00630063;
        try {
            byte[] bArrC0063c0063c00630063 = kkuukkk.c0063c0063c00630063(certificate.getEncoded());
            if (bArrC0063c0063c00630063 != null && c0063c0063006300630063(this.hhhh006800680068, bArrC0063c0063c00630063)) {
                return 200;
            }
            String str = hh0068hh00680068;
            StringBuilder sb = new StringBuilder();
            sb.append(kukuukk.kk006Bk006B006Bk("\u00139B.:84p58FI?=A<;OA\t}GOTV\u0003MX\u0006\\[RXR\f", (char) (kkuukku.kk006Bkkk006B() ^ (-1182535421)), (char) (kkuukku.kk006Bkkk006B() ^ (-1182535347))));
            if (bArrC0063c0063c00630063 == null) {
                strC0063ccc00630063 = kukuukk.kkk006B006B006Bk("r\u0014)C", (char) (kkkkuku.kkkk006Bk006B() ^ 797363692), (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121744), (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121610));
                int i = g0067gg0067g0067;
                if (((g00670067g0067g0067 + i) * i) % g0067006700670067g0067 != 0) {
                    g0067gg0067g0067 = g0067g00670067g0067();
                    gg006700670067g0067 = 23;
                }
            } else {
                strC0063ccc00630063 = kkuukkk.c0063ccc00630063(bArrC0063c0063c00630063);
            }
            sb.append(strC0063ccc00630063);
            kuukkkk.c00630063006300630063c(str, sb.toString());
            return -6;
        } catch (CertificateEncodingException e) {
            kuukkkk.c0063cccc0063(hh0068hh00680068, kukuukk.kk006Bk006B006Bk("\u00163?vCmC1=3/Af)*67+')\"\u001f1!Z56", (char) (kkkkuku.kkkk006Bk006B() ^ 797363522), (char) (kuuukku.k006Bk006Bkk006B() ^ (-910233340))), e.toString());
            return -8;
        }
    }

    private int cc0063c006300630063(boolean z, @Nullable List<Certificate> list, @Nonnull URL url) {
        String str;
        String strKkk006B006B006Bk;
        if (this.hhhh006800680068 == null && this.h0068hh006800680068 == null) {
            return 200;
        }
        if (!z) {
            str = hh0068hh00680068;
            strKkk006B006B006Bk = kukuukk.kk006Bk006B006Bk("&@NEUKEPK\u0007NJSWQQ", (char) (kkkkuku.kkkk006Bk006B() ^ 797363697), (char) (kkuukku.kk006Bkkk006B() ^ (-1182535345)));
        } else {
            if (list != null && !list.isEmpty()) {
                String host = url.getHost();
                if (!kkuukkk.c00630063cc00630063(TMXProfilingConnections.r0072rrrrr) || !kkuukkk.c00630063cc00630063(host) || host.equalsIgnoreCase(TMXProfilingConnections.r0072rrrrr)) {
                    Certificate certificate = list.get(0);
                    int iC00630063c006300630063 = this.h0068hh006800680068 != null ? c00630063c006300630063(certificate) : -6;
                    return (iC00630063c006300630063 == 200 || this.hhhh006800680068 == null) ? iC00630063c006300630063 : c0063cc006300630063(certificate);
                }
                String str2 = hh0068hh00680068;
                StringBuilder sb = new StringBuilder();
                sb.append(kukuukk.kk006Bk006B006Bk("\r\u0015\u001a\u001cHQ", (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121601), (char) (kuuukku.k006Bk006Bkk006B() ^ (-910233342))));
                sb.append(host);
                int i = g0067gg0067g0067;
                if (((g00670067g0067g0067 + i) * i) % g0067006700670067g0067 != gg006700670067g0067) {
                    g0067gg0067g0067 = 84;
                    gg006700670067g0067 = 79;
                }
                sb.append(kukuukk.kkk006B006B006Bk("z\u0017(~\"pl\u001e5\u001e16\b+K(yN*,'e5[\u0003d", (char) (kuuukku.k006Bk006Bkk006B() ^ (-910233258)), (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121703), (char) (kkuukku.kk006Bkkk006B() ^ (-1182535348))));
                kuukkkk.kkkukkk.c0063cc0063cc(str2, sb.toString());
                return 200;
            }
            str = hh0068hh00680068;
            strKkk006B006B006Bk = kukuukk.kkk006B006B006Bk("Olx0|'xjxukfvd\u001e`amnb^`YVhX", (char) (kkkkuku.kkkk006Bk006B() ^ 797363584), (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121614), (char) (kkkkuku.kkkk006Bk006B() ^ 797363567));
        }
        kuukkkk.c00630063006300630063c(str, strKkk006B006B006Bk);
        return -6;
    }

    public static int g0067g00670067g0067() {
        return 83;
    }

    public static int gg0067g0067g0067() {
        return 0;
    }

    public static int ggg00670067g0067() {
        return 2;
    }

    public static int ggggg00670067() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025c A[Catch: all -> 0x022c, TryCatch #8 {all -> 0x022c, blocks: (B:84:0x023b, B:86:0x025c, B:88:0x02a1, B:87:0x0289, B:93:0x02b5, B:104:0x030c, B:64:0x01f8, B:67:0x0205, B:71:0x021e), top: B:118:0x023b }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0289 A[Catch: all -> 0x022c, TryCatch #8 {all -> 0x022c, blocks: (B:84:0x023b, B:86:0x025c, B:88:0x02a1, B:87:0x0289, B:93:0x02b5, B:104:0x030c, B:64:0x01f8, B:67:0x0205, B:71:0x021e), top: B:118:0x023b }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private javax.net.ssl.HttpsURLConnection k006Bkkkkk(java.lang.String r20, byte[] r21, boolean r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kuuukkk.k006Bkkkkk(java.lang.String, byte[], boolean):javax.net.ssl.HttpsURLConnection");
    }

    private static boolean kk006B006Bkkk(Throwable th, Class<?> cls) {
        boolean zIsInstance;
        do {
            th = th.getCause();
            if (th == null) {
                return false;
            }
            zIsInstance = cls.isInstance(th);
            int iG0067g00670067g0067 = g0067g00670067g0067();
            if (((g00670067g0067g0067 + iG0067g00670067g0067) * iG0067g00670067g0067) % g0067006700670067g0067 != 0) {
                g0067gg0067g0067 = 19;
                gg006700670067g0067 = 33;
            }
        } while (!zIsInstance);
        return true;
    }

    private void kkkk006Bkk(Exception exc) {
        if (exc.getCause() instanceof CertificateException) {
            if (kk006B006Bkkk(exc.getCause(), CertificateNotYetValidException.class)) {
                this.hhh0068h00680068.setHttpResponseCode(-10);
                return;
            }
            if (!kk006B006Bkkk(exc.getCause(), CertificateExpiredException.class)) {
                if (kk006B006Bkkk(exc.getCause(), CertificateEncodingException.class)) {
                    this.hhh0068h00680068.setHttpResponseCode(-8);
                    return;
                } else {
                    this.hhh0068h00680068.setHttpResponseCode(-7);
                    return;
                }
            }
            this.hhh0068h00680068.setHttpResponseCode(-9);
            int i = g0067gg0067g0067;
            if (((g00670067g0067g0067 + i) * i) % ggg00670067g0067() != gg006700670067g0067) {
                g0067gg0067g0067 = g0067g00670067g0067();
                gg006700670067g0067 = 72;
                return;
            }
            return;
        }
        if (exc.getCause() instanceof CertPathBuilderException) {
            this.hhh0068h00680068.setHttpResponseCode(-12);
            return;
        }
        if (exc.getCause() instanceof CertPathValidatorException) {
            this.hhh0068h00680068.setHttpResponseCode(-13);
            return;
        }
        if (exc.getCause() instanceof CertStoreException) {
            this.hhh0068h00680068.setHttpResponseCode(-14);
            return;
        }
        if (exc.getCause() instanceof CRLException) {
            this.hhh0068h00680068.setHttpResponseCode(-15);
            return;
        }
        if (exc instanceof SSLPeerUnverifiedException) {
            this.hhh0068h00680068.setHttpResponseCode(-5);
            return;
        }
        if (exc instanceof UnknownHostException) {
            this.hhh0068h00680068.setHttpResponseCode(-3);
        } else if (exc instanceof SocketTimeoutException) {
            this.hhh0068h00680068.setHttpResponseCode(-4);
        } else if (this.hhh0068h00680068.getHttpResponseCode() == -2) {
            this.hhh0068h00680068.setHttpResponseCode(-1);
        }
    }

    public int cc00630063006300630063(String str) throws Throwable {
        HttpsURLConnection httpsURLConnectionK006Bkkkkk = k006Bkkkkk(str, null, false);
        int i = g0067gg0067g0067;
        if (((g00670067g0067g0067 + i) * i) % g0067006700670067g0067 != gg006700670067g0067) {
            g0067gg0067g0067 = g0067g00670067g0067();
            gg006700670067g0067 = 91;
        }
        if (httpsURLConnectionK006Bkkkkk == null) {
            kuukkkk.c00630063006300630063c(hh0068hh00680068, kukuukk.kkk006B006B006Bk("w(\u001b~ikqJDGl\u0018\u0007\u0013\nvh_(q)+)>\u0001\u0006~\u000fFY@ (\u001dKrrujE7L5\u001c\u000fD\rk\u0011", (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121671), (char) (kkuukku.kk006Bkkk006B() ^ (-1182535354)), (char) (kkkkuku.kkkk006Bk006B() ^ 797363562)) + str);
        } else {
            this.hh0068h006800680068 = httpsURLConnectionK006Bkkkkk.getURL();
            this.h00680068h006800680068 = httpsURLConnectionK006Bkkkkk;
            try {
                int iF = Callback.f(httpsURLConnectionK006Bkkkkk);
                this.hhh0068h00680068.setHttpResponseCode(iF);
                return iF;
            } catch (IOException e) {
                kuukkkk.cccccc0063(hh0068hh00680068, kukuukk.kk006Bk006B006Bk("y''( \u001f1'..`($-1;9-hq", (char) (kkkkuku.kkkk006Bk006B() ^ 797363572), (char) (kkuukku.kk006Bkkk006B() ^ (-1182535350))) + str + kukuukk.kk006Bk006B006Bk("5G.", (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121609), (char) (kuuukku.k006Bk006Bkk006B() ^ (-910233342))), e);
                kkkk006Bkk(e);
            }
        }
        return this.hhh0068h00680068.getHttpResponseCode();
    }

    public void ccc0063006300630063() {
        HttpsURLConnection httpsURLConnection = this.h00680068h006800680068;
        if (httpsURLConnection != null) {
            httpsURLConnection.disconnect();
            int i = g0067gg0067g0067;
            if (((g00670067g0067g0067 + i) * i) % g0067006700670067g0067 != gg006700670067g0067) {
                g0067gg0067g0067 = 53;
                gg006700670067g0067 = g0067g00670067g0067();
            }
            this.h00680068h006800680068 = null;
        }
    }

    public void cccc006300630063(@Nonnull Map<String, String> map) {
        Map<String, String> map2 = this.h006800680068h00680068;
        int i = g0067gg0067g0067;
        if (((g00670067g0067g0067 + i) * i) % g0067006700670067g0067 != gg006700670067g0067) {
            g0067gg0067g0067 = 63;
            gg006700670067g0067 = 32;
        }
        map2.putAll(map);
    }

    public int k006B006B006Bkkk(String str, byte[] bArr) throws Exception {
        int i = g0067gg0067g0067;
        if (((g00670067g0067g0067 + i) * i) % g0067006700670067g0067 != gg006700670067g0067) {
            g0067gg0067g0067 = 35;
            gg006700670067g0067 = g0067g00670067g0067();
        }
        HttpsURLConnection httpsURLConnectionK006Bkkkkk = k006Bkkkkk(str, bArr, true);
        if (httpsURLConnectionK006Bkkkkk != null) {
            this.hh0068h006800680068 = httpsURLConnectionK006Bkkkkk.getURL();
            this.h00680068h006800680068 = httpsURLConnectionK006Bkkkkk;
            try {
                int iF = Callback.f(httpsURLConnectionK006Bkkkkk);
                this.hhh0068h00680068.setHttpResponseCode(iF);
                return iF;
            } catch (IOException e) {
                kuukkkk.cccccc0063(hh0068hh00680068, kukuukk.kk006Bk006B006Bk("^}\f\r\u000f\u0015A\u0013\u0013\u0018\u001aG", (char) (kuuukku.k006Bk006Bkk006B() ^ (-910233316)), (char) (kkkkuku.kkkk006Bk006B() ^ 797363560)), e);
                kkkk006Bkk(e);
            } catch (Exception e2) {
                throw e2;
            }
        }
        return this.hhh0068h00680068.getHttpResponseCode();
    }

    @Nullable
    public InputStream k006B006Bkkkk() throws IOException {
        HttpsURLConnection httpsURLConnection = this.h00680068h006800680068;
        if (httpsURLConnection != null) {
            return Callback.a(httpsURLConnection);
        }
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                g0067gg0067g0067 = g0067g00670067g0067();
                return null;
            }
        }
    }

    @Nullable
    public String k006Bk006Bkkk() {
        URL url = this.hh0068h006800680068;
        int i = g0067gg0067g0067;
        if (((ggggg00670067() + i) * i) % g0067006700670067g0067 != 0) {
            g0067gg0067g0067 = g0067g00670067g0067();
            gg006700670067g0067 = g0067g00670067g0067();
        }
        if (url == null) {
            return null;
        }
        return url.toString();
    }

    @Nullable
    public String kk006Bkkkk() {
        int i = g0067gg0067g0067;
        if (((g00670067g0067g0067 + i) * i) % ggg00670067g0067() != gg006700670067g0067) {
            g0067gg0067g0067 = g0067g00670067g0067();
            gg006700670067g0067 = g0067g00670067g0067();
        }
        URL url = this.hh0068h006800680068;
        if (url == null) {
            return null;
        }
        return url.getHost();
    }

    public TMXProfilingConnectionsInterface.TMXHttpResponseCode kkk006Bkkk() {
        TMXProfilingConnectionsInterface.TMXHttpResponseCode tMXHttpResponseCode = this.hhh0068h00680068;
        int i = g0067gg0067g0067;
        if (((g00670067g0067g0067 + i) * i) % ggg00670067g0067() != gg0067g0067g0067()) {
            g0067gg0067g0067 = 56;
            g00670067g0067g0067 = g0067g00670067g0067();
        }
        return tMXHttpResponseCode;
    }
}
