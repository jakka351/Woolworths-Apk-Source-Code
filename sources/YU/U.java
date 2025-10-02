package YU;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.provider.Settings;
import au.com.woolworths.android.onesite.app.BaseShopApplication;
import com.cyberfend.cyfsecurity.CircleProgressBar;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class U {
    public static int x = 6031;
    public static int y = 1958;

    /* renamed from: a, reason: collision with root package name */
    public String f17a;
    public String e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public String k;
    public String l;
    public long m;
    public String n;
    public int o;
    public int p;
    public long q;
    public static final Locale z = Locale.US;
    public static final U A = new U();
    public int d = -1;
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public ArrayList t = new ArrayList();
    public String u = "";
    public String v = "";
    public int w = 0;
    public int b = 0;
    public int c = 0;

    class F extends TimerTask {
        public final /* synthetic */ int d;

        class A implements Runnable {
            public A() {
            }

            /* JADX WARN: Code restructure failed: missing block: B:36:0x0161, code lost:
            
                if (r15 != false) goto L38;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x0165, code lost:
            
                r2.o++;
                r2.q = android.os.SystemClock.uptimeMillis();
                r2.m(r2.o);
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x017b, code lost:
            
                if (r2.o >= 10) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x017d, code lost:
            
                r2.p = 0;
                r2.n(r0, r2.h + r16);
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x0186, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x0187, code lost:
            
                r2.p = 0;
                r2.g();
                r2.r = new java.util.ArrayList();
                r2.s = new java.util.ArrayList();
                r2.t = new java.util.ArrayList();
                r2.o(0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x01b2, code lost:
            
                if ((android.os.SystemClock.uptimeMillis() - r2.m) <= (r2.f * 1000)) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x01b4, code lost:
            
                if (r0 != 0) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x01b6, code lost:
            
                r2.d(r0, 100);
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x01bb, code lost:
            
                r2.l();
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x01be, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
            
                return;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() throws java.security.NoSuchAlgorithmException {
                /*
                    Method dump skipped, instructions count: 515
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: YU.U.F.A.run():void");
            }
        }

        public F(int i) {
            this.d = i;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            new Thread(new A()).start();
        }
    }

    class UG extends TimerTask {
        public final /* synthetic */ int d;

        class Fe implements Runnable {
            public Fe() {
            }

            /* JADX WARN: Not initialized variable reg: 7, insn: 0x009a: MOVE (r6 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:22:0x009a */
            /* JADX WARN: Removed duplicated region for block: B:105:0x020e A[ORIG_RETURN, RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:107:0x0211  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x01e8  */
            /* JADX WARN: Removed duplicated region for block: B:99:0x01f2  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 535
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: YU.U.UG.Fe.run():void");
            }
        }

        public UG(int i) {
            this.d = i;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            new Thread(new Fe()).start();
        }
    }

    public static long a(long j, byte[] bArr) {
        int i;
        long j2 = 0;
        int i2 = 0;
        while (i2 < bArr.length) {
            j2 = ((j2 << 8) | (bArr[i2] & 255)) % j;
            i2++;
            if (y <= 1957) {
                if ((x ^ 6031) != 0) {
                    while (true) {
                        int i3 = x;
                        int i4 = i3 + 39;
                        if (i4 == 75) {
                            break;
                        }
                        if (i4 == 114) {
                            x = (i3 % 38) ^ 5332;
                        } else if (i4 == 204) {
                            x = (i3 ^ 2305) % 27;
                            break;
                        }
                    }
                    while (true) {
                        x = (x % 27) ^ 3482;
                    }
                } else {
                    do {
                        i = y;
                    } while (i + 26 != 96);
                    y = ((i + i) ^ 4899) + i;
                    if ((x ^ 6031) != 0) {
                        while (true) {
                            int i5 = x;
                            if (i5 + 26 == 49) {
                                x = (i5 >> 65) + i5;
                            }
                        }
                    }
                }
            }
        }
        return j2;
    }

    public static U c() {
        return A;
    }

    public String b() {
        return this.f17a + CircleProgressBar.a("6Z}b\u0002NI_}QAmgIQ\u001c^@HR\u0013NXP\u001fA_X");
    }

    public final void d(int i, long j) {
        if (j > 0) {
            try {
                new Timer().schedule(new UG(i), j);
            } catch (IllegalArgumentException e) {
                O.a(CircleProgressBar.a("IjH"), CircleProgressBar.a("\\}|j]]EDL\u001b") + e, new Throwable[0]);
            }
        }
    }

    public final synchronized String e() {
        if (this.d == 0) {
            return "";
        }
        if (this.v.length() != 0) {
            int i = this.w + 1;
            this.w = i;
            if (i >= this.i * 0.9d) {
                d(0, 100L);
            }
            return this.v;
        }
        if (this.u.length() != 0) {
            return this.u;
        }
        String str = "";
        BaseShopApplication baseShopApplication = UA.f.f18a;
        if (baseShopApplication == null) {
            O.e(CircleProgressBar.a("J`q|B[hJV@c~eLG"), CircleProgressBar.a("~`k_B~~NQQOquA\u0018\u0003iVVCKEH\u001b[B\u0010ACYX"), new Throwable[0]);
        } else {
            String string = baseShopApplication.getSharedPreferences(CircleProgressBar.a("zjr!LBMFCH\u000e}iPOBD\u0017HEK[YIW_SJE"), 0).getString(CircleProgressBar.a("ijhP_L_[MOSz"), null);
            if (string != null) {
                str = string;
            }
        }
        return str;
    }

    public final Boolean f(JSONObject jSONObject, int i) {
        try {
            this.d = jSONObject.getInt(CircleProgressBar.a("tj{j"));
            this.e = jSONObject.getString(CircleProgressBar.a("wjqlH"));
            this.f = jSONObject.getLong(CircleProgressBar.a("mqs"));
            this.g = jSONObject.getLong(CircleProgressBar.a("}lyiDJYGVX"));
            this.h = jSONObject.getLong(CircleProgressBar.a("mlrjB\\X"));
            if (i == 0) {
                this.i = jSONObject.getLong("n");
            }
            this.j = jSONObject.getLong(CircleProgressBar.a("jZkf@LC^V"));
            this.k = jSONObject.getString(CircleProgressBar.a("zmzlFZYF"));
            O.b.d(3, CircleProgressBar.a("IjH"), CircleProgressBar.a("IjH/}H^JOR\u001a?kKFF\u0017") + this.d + CircleProgressBar.a("5%q`CJI\u0016") + this.e + CircleProgressBar.a("5%k{A\u0014") + this.f + CircleProgressBar.a("5%{fKOEHWMTf;") + this.g + CircleProgressBar.a("5%kf@LC^V\u001c") + this.h + CircleProgressBar.a("5%q2") + this.i + CircleProgressBar.a("5%lPY@ANMTT\"") + this.j + CircleProgressBar.a("5%|gHJGXWL\u001d") + this.k, new Throwable[0]);
            if (this.d != 0) {
                CircleProgressBar.a("\\k~mALH");
                this.c = 0;
                this.m = SystemClock.uptimeMillis();
                this.n = this.l + this.m + this.e;
                this.u = this.l + ";" + this.m + ";" + this.e + ";" + this.g + ";" + this.k;
                this.q = SystemClock.uptimeMillis();
                this.o = 0;
                if (this.b == 2) {
                    O.e(CircleProgressBar.a("IjH"), CircleProgressBar.a("ZdqlHE\flGU\u0000OgVCNY"), new Throwable[0]);
                    k();
                    return Boolean.TRUE;
                }
                n(i, 100L);
            } else {
                o(0);
                CircleProgressBar.a("]llnOEIO");
            }
            if (i == 0) {
                d(i, this.f * 1000);
            }
            return Boolean.TRUE;
        } catch (Exception e) {
            O.a(CircleProgressBar.a("IjH"), CircleProgressBar.a("\\}|j]]EDL\u001b") + e, new Throwable[0]);
            e.printStackTrace();
            return Boolean.FALSE;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a3 -> B:33:0x00b7). Please report as a decompilation issue!!! */
    public final void g() {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: YU.U.g():void");
    }

    public void h(Application application, String str, JSONObject jSONObject) {
        this.f17a = str;
        int i = Y.f37a;
        this.l = Settings.Secure.getString(application.getContentResolver(), Y.c);
        if (jSONObject == null) {
            d(0, 1000L);
        } else {
            f(jSONObject, 0);
        }
    }

    public final void i() {
        this.o = 0;
        this.p = 0;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.t = new ArrayList();
        k();
    }

    public void j(String str) {
        O.a(CircleProgressBar.a("IjH"), CircleProgressBar.a("\\wm`_\u0013\f").concat(str), new Throwable[0]);
    }

    public void k() {
    }

    public void l() {
        UA ua = UA.f;
        String str = this.v;
        synchronized (ua) {
            BaseShopApplication baseShopApplication = ua.f18a;
            if (baseShopApplication == null) {
                O.e(CircleProgressBar.a("J`q|B[hJV@c~eLG"), CircleProgressBar.a("jdij}F{yGRPphWG\u0019\nzWYZXDO\u0012XC\u000fX@X_"), new Throwable[0]);
                return;
            }
            SharedPreferences.Editor editorEdit = baseShopApplication.getSharedPreferences(CircleProgressBar.a("zjr!LBMFCH\u000e}iPOBD\u0017HEK[YIW_SJE"), 0).edit();
            editorEdit.putString(CircleProgressBar.a("ijhP_L_[MOSz"), str);
            editorEdit.commit();
        }
    }

    public void m(int i) {
    }

    public final void n(int i, long j) {
        if (j > 0) {
            try {
                new Timer().schedule(new F(i), j);
            } catch (IllegalArgumentException e) {
                O.a(CircleProgressBar.a("IjH"), CircleProgressBar.a("\\}|j]]EDL\u001b") + e, new Throwable[0]);
            }
        }
    }

    public final void o(int i) {
        synchronized (this) {
            this.b = i;
        }
    }
}
