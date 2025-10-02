package YU;

import YU.Un;
import android.app.Application;
import com.cyberfend.cyfsecurity.CircleProgressBar;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Um extends U {
    public static int H = 6639;
    public static int I = 4966;
    public static final Um J;
    public String B;
    public String C;
    public Un.Al D;
    public long E;
    public String F;
    public String G;

    class An implements Runnable {
        public An() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x0283, code lost:
        
            YU.Um.H = ((r1 >> 10) % 36) * 126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x028b, code lost:
        
            r0 = YU.a.b(YU.Um.H, r1, r1, r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x0292, code lost:
        
            YU.Um.H = (YU.Um.H % 71) + r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x0299, code lost:
        
            r0 = (YU.Um.H ^ 4355) * 12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x029f, code lost:
        
            YU.Um.H = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:123:0x029f, code lost:
        
            r0 = (YU.Um.H ^ 4355) * 12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x01e7, code lost:
        
            if (YU.Um.H <= 6638) goto L134;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0209, code lost:
        
            if (YU.Um.I <= 4965) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x020b, code lost:
        
            r7 = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x022a, code lost:
        
            if ((YU.Um.I ^ 4966) != 0) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0248, code lost:
        
            if (YU.Um.I <= 4965) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x026c, code lost:
        
            if ((YU.Um.H ^ 6639) != 0) goto L134;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x026e, code lost:
        
            r1 = YU.Um.H;
            r0 = r1 + 143;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0274, code lost:
        
            if (r0 == 43) goto L133;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0278, code lost:
        
            if (r0 == 241) goto L103;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x027c, code lost:
        
            if (r0 == 286) goto L131;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x0280, code lost:
        
            if (r0 == 476) goto L132;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:108:0x02b0  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x02b9  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x02bf  */
        /* JADX WARN: Type inference failed for: r8v0 */
        /* JADX WARN: Type inference failed for: r8v1, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r8v2 */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 707
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: YU.Um.An.run():void");
        }
    }

    public interface Fn {
    }

    static {
        int i;
        Um um = new Um();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (H > 6638) {
            um.E = jCurrentTimeMillis;
            um.G = "";
            J = um;
        } else {
            do {
                i = H + 13;
                if (i == 79) {
                    while (true) {
                        H = ((H % 109) >> 85) * 88;
                    }
                }
            } while (i != 121);
            while (true) {
                H = (H ^ 3771) * 434;
            }
        }
    }

    public static Um p() {
        return J;
    }

    @Override // YU.U
    public final String b() {
        StringBuilder sb = new StringBuilder(this.f17a + CircleProgressBar.a("6Z}b\u0002NI_}QAmgIQ\u001c^@HR\u0013NXP\u001fRSN"));
        try {
            String str = this.F;
            if (str != null && !str.equals("")) {
                sb.append(CircleProgressBar.a("?fpaYLT_\u001f"));
                sb.append(URLEncoder.encode(this.F, CircleProgressBar.a("LQY\"\u0015")));
            }
            String str2 = this.G;
            if (str2 != null && !str2.equals("")) {
                sb.append(CircleProgressBar.a("?u~vAFMO\u001f"));
                sb.append(URLEncoder.encode(this.G, CircleProgressBar.a("LQY\"\u0015")));
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.G = "";
        return sb.toString();
    }

    @Override // YU.U
    public final void h(Application application, String str, JSONObject jSONObject) {
        throw null;
    }

    @Override // YU.U
    public final void j(String str) {
        O.a("Um", CircleProgressBar.a("\\wm`_\u0013\f").concat(str), new Throwable[0]);
        this.D.getClass();
        this.D.getClass();
        throw null;
    }

    @Override // YU.U
    public final void k() {
        this.D.getClass();
        Un un = Un.this;
        throw null;
    }

    @Override // YU.U
    public final void l() {
        new Thread(new An()).start();
    }

    @Override // YU.U
    public final void m(int i) {
        this.D.a(i / 10.0f);
    }

    public final synchronized String q() {
        if (this.B != null && System.currentTimeMillis() <= this.E) {
            return this.B;
        }
        return "";
    }
}
