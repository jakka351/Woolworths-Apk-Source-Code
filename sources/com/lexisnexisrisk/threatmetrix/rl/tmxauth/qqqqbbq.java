package com.lexisnexisrisk.threatmetrix.rl.tmxauth;

import android.content.ContentResolver;
import android.content.Context;
import com.lexisnexisrisk.threatmetrix.rl.AuthNativeGathererHelper;
import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class qqqqbbq {
    public static int a006100610061a0061a = 2;
    public static int a0061a0061a0061a = 0;
    public static int aa00610061a0061a = 1;
    public static int aaa0061a0061a = 15;
    private static final String w00770077ww0077w;
    private static final String www0077w0077w;
    private final Lock w0077w0077w0077w = new ReentrantLock();
    public boolean ww00770077w0077w = false;
    public boolean w007700770077w0077w = false;
    private final AuthNativeGathererHelper wwww00770077w = new AuthNativeGathererHelper();

    public static class qqbqbbq {
        public static int a00610061aaa0061 = 2;
        public static int a0061aaaa0061 = 0;
        public static int aa0061aaa0061 = 1;
        public static int aaaaaa0061 = 16;
        private static final qqqqbbq w00770077w00770077w;

        static {
            qqqqbbq qqqqbbqVar = new qqqqbbq();
            int i = aaaaaa0061;
            if (((aa0061aaa0061 + i) * i) % a00610061aaa0061 != 0) {
                aaaaaa0061 = aaa0061aa0061();
                a0061aaaa0061 = aaa0061aa0061();
            }
            w00770077w00770077w = qqqqbbqVar;
        }

        private qqbqbbq() {
        }

        public static int aaa0061aa0061() {
            return 53;
        }

        public static /* synthetic */ qqqqbbq bbbbbb0062() {
            qqqqbbq qqqqbbqVar = w00770077w00770077w;
            int i = aaaaaa0061;
            if (((aa0061aaa0061 + i) * i) % a00610061aaa0061 != a0061aaaa0061) {
                aaaaaa0061 = aaa0061aa0061();
                a0061aaaa0061 = aaa0061aa0061();
            }
            return qqqqbbqVar;
        }
    }

    static {
        try {
            throw null;
        } catch (Exception unused) {
            aaa0061a0061a = aaaa00610061a();
            www0077w0077w = qqqqbbb.q0071007100710071q0071("m\u0002\u0016\f\u001a\nEi\u0017\r\u000fd", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014687), (char) (qbbqqbb.qqq007100710071q() ^ (-321957237)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014673));
            w00770077ww0077w = qqbbqbq.b0062b006200620062b(qqqqbbq.class);
        }
    }

    public static int a0061aa00610061a() {
        return 2;
    }

    public static int aaaa00610061a() {
        return 6;
    }

    public static qqqqbbq b00620062bbb0062() {
        qqqqbbq qqqqbbqVarBbbbbb0062 = qqbqbbq.bbbbbb0062();
        int i = aaa0061a0061a;
        if (((aa00610061a0061a + i) * i) % a006100610061a0061a != a0061a0061a0061a) {
            aaa0061a0061a = 78;
            a0061a0061a0061a = 74;
        }
        return qqqqbbqVarBbbbbb0062;
    }

    public boolean b006200620062bb0062() {
        int i = aaa0061a0061a;
        if (((aa00610061a0061a + i) * i) % a0061aa00610061a() != 0) {
            aaa0061a0061a = 97;
            a0061a0061a0061a = 43;
        }
        return this.ww00770077w0077w;
    }

    public boolean b0062b0062bb0062(@Nonnull Context context, @Nonnull final String str) {
        String absolutePath = context.getFilesDir().getAbsolutePath();
        String str2 = context.getApplicationInfo().nativeLibraryDir;
        if (!bb00620062bb0062(str, absolutePath)) {
            FilenameFilter filenameFilter = new FilenameFilter() { // from class: com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbq.1
                public static int a0061a006100610061a = 1;
                public static int aa0061006100610061a = 2;
                public static int aaa006100610061a = 69;

                public static int a00610061006100610061a() {
                    return 39;
                }

                @Override // java.io.FilenameFilter
                public boolean accept(File file, @Nonnull String str3) {
                    int i = aaa006100610061a;
                    if (((a0061a006100610061a + i) * i) % aa0061006100610061a != 0) {
                        aaa006100610061a = 64;
                        a0061a006100610061a = a00610061006100610061a();
                    }
                    return str3.contains(str);
                }
            };
            File file = new File(str2);
            int i = aaa0061a0061a;
            if (((aa00610061a0061a + i) * i) % a006100610061a0061a != a0061a0061a0061a) {
                aaa0061a0061a = aaaa00610061a();
                a0061a0061a0061a = aaaa00610061a();
            }
            String[] list = file.list(filenameFilter);
            if (list != null && list.length != 0) {
                this.w007700770077w0077w = true;
            }
        }
        return this.ww00770077w0077w;
    }

    @Nullable
    public String b0062bb0062b0062(@Nullable byte[] bArr) {
        try {
            if (!this.ww00770077w0077w || bArr == null) {
                return null;
            }
            return this.wwww00770077w.sha256HexEncode(bArr);
        } catch (Throwable th) {
            int i = aaa0061a0061a;
            if (((aa00610061a0061a + i) * i) % a006100610061a0061a != a0061a0061a0061a) {
                aaa0061a0061a = 97;
                a0061a0061a0061a = 48;
            }
            qqbbqbq.e(w00770077ww0077w, qqqqbbb.q0071q00710071q0071("m\u007f\u0012\u0006\u0012\u007f9{\u0007zzN", (char) (qbbqqbb.qqq007100710071q() ^ (-321957128)), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694669)), th);
            return null;
        }
    }

    @Nullable
    public Map<String, String> b0062bbbb0062(String str, String str2, Context context) {
        qqqqbbb.q0071007100710071q0071("\u0016\u001bo\u0006PrJV!", (char) (qbbqqbb.qqq007100710071q() ^ (-321957307)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014528), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014677));
        qqqqbbb.q0071007100710071q0071("\u0002q\u007fv\u0003\u0002", (char) (qbbqqbb.qqq007100710071q() ^ (-321957356)), (char) (qbbqqbb.qqq007100710071q() ^ (-321957244)), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710747)));
        qqqqbbb.q0071q00710071q0071(">B8,", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710852)), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710751)));
        qqqqbbb.q0071q00710071q0071("\u0012cB\"", (char) (qbbqqbb.qqq007100710071q() ^ (-321957302)), (char) (qbbqqbb.qqq007100710071q() ^ (-321957266)));
        qqqqbbb.q0071q00710071q0071("G@S", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014553), (char) (qbbqqbb.qqq007100710071q() ^ (-321957274)));
        char cQ00710071007100710071q = (char) (qqqbqbb.q00710071007100710071q() ^ 1589694649);
        int iQq00710071q0071q = qbqqqbb.qq00710071q0071q();
        if ((aaaa00610061a() * (aaaa00610061a() + aa00610061a0061a)) % a0061aa00610061a() != a0061a0061a0061a) {
            aaa0061a0061a = aaaa00610061a();
            a0061a0061a0061a = 39;
        }
        qqqqbbb.q0071q00710071q0071("svxvxyig", cQ00710071007100710071q, (char) (iQq00710071q0071q ^ (-1208710746)));
        qqqqbbb.q0071007100710071q0071("uYN$\u001c", (char) (qqqbqbb.q00710071007100710071q() ^ 1589694531), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694630), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694667));
        try {
            if (this.ww00770077w0077w) {
                HashMap map = new HashMap();
                String[] strArrAttestStrongID = this.wwww00770077w.attestStrongID(str, str2, context, qqqbbbq.w00770077007700770077w);
                if (strArrAttestStrongID.length == 1) {
                    map.put(qqqqbbb.q0071007100710071q0071("HTSOQ", (char) (qqqbqbb.q00710071007100710071q() ^ 1589694626), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694492), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710749))), strArrAttestStrongID[0]);
                    return map;
                }
                if (strArrAttestStrongID.length == 6) {
                    map.put(qqqqbbb.q0071007100710071q0071("\r\u0002~\u0005v\t\t\u0005v", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710868)), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694615), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014675)), strArrAttestStrongID[4]);
                    map.put(qqqqbbb.q0071q00710071q0071("*\u001a(\u001f+*", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014472), (char) (qbbqqbb.qqq007100710071q() ^ (-321957279))), strArrAttestStrongID[0]);
                    map.put(qqqqbbb.q0071007100710071q0071("DH>2", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710747)), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710668)), (char) (qbbqqbb.qqq007100710071q() ^ (-321957278))), strArrAttestStrongID[2]);
                    map.put(qqqqbbb.q0071q00710071q0071("0,>.", (char) (qbbqqbb.qqq007100710071q() ^ (-321957246)), (char) ((-321957274) ^ qbbqqbb.qqq007100710071q())), strArrAttestStrongID[1]);
                    map.put(qqqqbbb.q0071007100710071q0071("/E\u0005", (char) (qbbqqbb.qqq007100710071q() ^ (-321957156)), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710782)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014674)), strArrAttestStrongID[3]);
                    map.put(qqqqbbb.q0071q00710071q0071("rOd\u007f+_(\u0018", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710866)), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710737))), strArrAttestStrongID[5]);
                    map.put(qqqqbbb.q0071007100710071q0071("y\u0006\u0005\u0001\u0003", (char) (qbbqqbb.qqq007100710071q() ^ (-321957250)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014592), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710745))), null);
                }
                return map;
            }
        } catch (Throwable th) {
            qqbbqbq.e(w00770077ww0077w, qqqqbbb.q0071007100710071q0071("&8J>J8q4?33\u0007", (char) (qbbqqbb.qqq007100710071q() ^ (-321957160)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014666), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014679)), th);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean bb00620062bb0062(java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbq.bb00620062bb0062(java.lang.String, java.lang.String):boolean");
    }

    @Nullable
    public byte[] bb0062b0062b0062(byte[] bArr, ContentResolver contentResolver) {
        try {
            if (this.ww00770077w0077w) {
                return this.wwww00770077w.sign(bArr, contentResolver);
            }
            return null;
        } catch (Throwable th) {
            qqbbqbq.e(w00770077ww0077w, qqqqbbb.q0071007100710071q0071("@RdXdR\fNYMM!", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014606), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694717), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710745))), th);
            return null;
        }
    }

    public int bb0062bbb0062() {
        try {
            if (this.ww00770077w0077w) {
                return this.wwww00770077w.cancel();
            }
            return -1;
        } catch (Throwable th) {
            qqbbqbq.e(w00770077ww0077w, qqqqbbb.q0071007100710071q0071("t\t\u001d\u0013!\u0011Lp\u001e\u0014\u0016k", (char) (qqqbqbb.q00710071007100710071q() ^ 1589694682), (char) (qbbqqbb.qqq007100710071q() ^ (-321957144)), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710752))), th);
            return -1;
        }
    }

    public long bbb0062bb0062(int i) {
        int i2 = aaa0061a0061a;
        if (((aa00610061a0061a + i2) * i2) % a006100610061a0061a != 0) {
            aaa0061a0061a = aaaa00610061a();
            a0061a0061a0061a = 0;
        }
        try {
            if (this.ww00770077w0077w) {
                return this.wwww00770077w.getTamperCode(i);
            }
            return 0L;
        } catch (Throwable th) {
            qqbbqbq.e(w00770077ww0077w, qqqqbbb.q0071q00710071q0071("\u0015)=3A1l\u0011>46\f", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710813)), (char) (qbbqqbb.qqq007100710071q() ^ (-321957276))), th);
            return 0L;
        }
    }

    public boolean bbbb0062b0062() {
        if (!this.ww00770077w0077w && this.w007700770077w0077w) {
            return true;
        }
        int i = aaa0061a0061a;
        if (((aa00610061a0061a + i) * i) % a006100610061a0061a != a0061a0061a0061a) {
            aaa0061a0061a = aaaa00610061a();
            a0061a0061a0061a = 3;
        }
        return false;
    }
}
