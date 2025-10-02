package com.cyberfend.cyfsecurity;

import YU.Ai;
import YU.B;
import YU.FX;
import YU.Fl;
import YU.Fq;
import YU.K;
import YU.N;
import YU.O;
import YU.S;
import YU.U;
import YU.UA;
import YU.UB;
import YU.Ue;
import YU.Up;
import YU.Us;
import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Patterns;
import au.com.woolworths.android.onesite.app.BaseShopApplication;
import com.cyberfend.cyfsecurity.CYFManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint
@Deprecated
/* loaded from: classes.dex */
public class CYFMonitor {

    /* renamed from: a, reason: collision with root package name */
    public static final CYFManager f14058a;
    public static boolean b;
    public static boolean c;
    public static String d;
    public static boolean e;

    static {
        Log.i(CircleProgressBar.a("Z\\YBBGE_MS"), CircleProgressBar.a("Pkv{DH@BXHNx&eIBGXQ\u0017lpl\u001bau{\u000f`PF@sFf'\t\u0007<%6"));
        SensorDataBuilder sensorDataBuilder = SensorDataBuilder.f14060a;
        new Thread(new Runnable() { // from class: com.cyberfend.cyfsecurity.SensorDataBuilder.1
            public final /* synthetic */ SensorDataBuilder d = SensorDataBuilder.f14060a;

            @Override // java.lang.Runnable
            public final void run() {
                if (SensorDataBuilder.b) {
                    return;
                }
                this.d.initializeKeyN();
            }
        }).start();
        f14058a = new CYFManager();
        b = false;
        c = false;
        d = null;
        e = false;
    }

    public static void a(final boolean z, final Application application) {
        CYFManager cYFManager = f14058a;
        try {
            cYFManager.getClass();
            try {
                new Thread(new CYFManager.AnonymousClass2()).start();
            } catch (Exception unused) {
            }
            String str = d;
            if (str == null || str.length() <= 0) {
                return;
            }
            e = true;
            int i = z ? 3 : 2;
            cYFManager.l(13);
            Up.b(application, d, i, new Up.Ud() { // from class: com.cyberfend.cyfsecurity.CYFMonitor.2
                public static String c = CircleProgressBar.a("j`myH[_BFDSvaJCO");

                @Override // YU.Up.Ud
                public final void c() {
                    boolean z2 = z;
                    Application application2 = application;
                    if (z2) {
                        U.c().h(application2, CYFMonitor.d, null);
                    }
                    CYFManager cYFManager2 = CYFMonitor.f14058a;
                    cYFManager2.getClass();
                    CYFManager.g();
                    cYFManager2.j(application2, CYFMonitor.d, null);
                    cYFManager2.l(2);
                    CYFMonitor.e = false;
                    Ue.h().b(false);
                }

                @Override // YU.Up.Ud
                public final void d() {
                    CYFMonitor.f14058a.l(3);
                    CYFMonitor.e = false;
                    N.b();
                    Ue.h().b(false);
                }

                @Override // YU.Up.Ud
                public final void e(JSONObject jSONObject) throws JSONException {
                    String string;
                    N.c();
                    CYFMonitor.f14058a.getClass();
                    CYFManager.g();
                    boolean z2 = z;
                    Application application2 = application;
                    if (z2) {
                        U.c().h(application2, CYFMonitor.d, jSONObject);
                    }
                    try {
                        string = jSONObject.getString(c);
                    } catch (JSONException unused2) {
                        CYFMonitor.f14058a.l(4);
                        string = null;
                    }
                    CYFMonitor.f14058a.j(application2, CYFMonitor.d, string);
                    CYFMonitor.e = false;
                    Ue.h().b(true);
                }
            });
        } catch (Exception unused2) {
            e = false;
        }
    }

    public static boolean b() {
        boolean z;
        CYFManager cYFManager = f14058a;
        synchronized (cYFManager) {
            Us us = cYFManager.h;
            z = false;
            if (us != null && us.f != null) {
                if (us.c() != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    public static void c(final BaseShopApplication baseShopApplication, String str) {
        Ue ue;
        boolean zMatches;
        boolean zBooleanValue;
        String str2;
        String str3;
        Log.i(CircleProgressBar.a("Z\\YBBGE_MS"), CircleProgressBar.a("Pkv{DH@BXHNx&eIBGXQ\u0017lpl\u001b\u007f^^FBZF"));
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    new URL(str);
                    if (b) {
                        return;
                    }
                    if (SensorDataBuilder.b) {
                        O.c(CircleProgressBar.a("Z\\YBBGE_MS"), CircleProgressBar.a("Uj~k\reEIP@Rf&bCJFLJR"), new Throwable[0]);
                        return;
                    }
                    N.b = baseShopApplication;
                    Log.i(CircleProgressBar.a("Z\\YBBGE_MS"), CircleProgressBar.a("XgpzY\tXD\u0002BAsj\u0004azlpVCKZNRFHsGSV_Vh"));
                    int i = Ue.i;
                    synchronized (Ue.class) {
                        try {
                            if (Ue.j == null) {
                                Ue.j = new Ue(baseShopApplication);
                            }
                            ue = Ue.j;
                        } finally {
                        }
                    }
                    ArrayList arrayList = ue.g;
                    try {
                        if (ue.e != CYFIntegrityChecker$DebugMode.d) {
                            ue.j();
                            arrayList.clear();
                            if (Looper.myLooper() != Looper.getMainLooper()) {
                                arrayList.add(CYFIntegrityChecker$IntegrityCheckState.e);
                                ue.k(Ue.V, Ue.b0);
                            } else {
                                if (str.trim().isEmpty()) {
                                    zMatches = false;
                                } else {
                                    new URL(str);
                                    zMatches = Patterns.WEB_URL.matcher(str).matches();
                                }
                                if (zMatches) {
                                    try {
                                        zBooleanValue = N.a().booleanValue();
                                    } catch (Exception unused) {
                                        zBooleanValue = false;
                                    }
                                    if (zBooleanValue) {
                                        int i2 = CYFIntegrityChecker$IntegrityCheckState.d;
                                    } else {
                                        arrayList.add(CYFIntegrityChecker$IntegrityCheckState.h);
                                        str2 = Ue.r;
                                        str3 = Ue.o;
                                    }
                                } else {
                                    arrayList.add(CYFIntegrityChecker$IntegrityCheckState.f);
                                    str2 = Ue.u;
                                    str3 = Ue.B;
                                }
                                ue.k(str2, str3);
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    CYFManager cYFManager = f14058a;
                    cYFManager.l = str;
                    cYFManager.l(0);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    O.c(CircleProgressBar.a("Z\\YBBGE_MS"), CircleProgressBar.a("K`xf^]IYKOG?gGVJ\\PLN\u000eQU]WRILZP\u0014P{Ede\\Jgx"), new Throwable[0]);
                    UA.f.b(baseShopApplication);
                    synchronized (cYFManager) {
                        if (!CYFManager.s) {
                            try {
                                Fq fq = new Fq();
                                cYFManager.i = fq;
                                fq.a(baseShopApplication);
                                CYFManager.s = true;
                            } catch (Exception e2) {
                                UB.a(e2);
                                e2.getMessage();
                                SDKInitFailure sDKInitFailure = SDKInitFailure.d;
                                Ue.h().e();
                            }
                        }
                    }
                    CYFManager cYFManager2 = f14058a;
                    synchronized (cYFManager2) {
                        if (!CYFManager.t) {
                            B b2 = new B();
                            b2.d = new ArrayList();
                            cYFManager2.f = b2;
                            baseShopApplication.registerActivityLifecycleCallbacks(b2);
                            CYFManager.t = true;
                        }
                    }
                    synchronized (cYFManager2) {
                        try {
                        } catch (Exception e3) {
                            Ue.h().e();
                            UB.a(e3);
                            e3.getMessage();
                            SDKInitFailure sDKInitFailure2 = SDKInitFailure.d;
                        }
                        if (!CYFManager.u) {
                            cYFManager2.g = new Fl(baseShopApplication);
                            CYFManager.u = true;
                        }
                    }
                    CYFManager cYFManager3 = f14058a;
                    synchronized (cYFManager3) {
                        if (cYFManager3.c == null) {
                            cYFManager3.c = new FX(baseShopApplication, cYFManager3);
                        }
                    }
                    synchronized (cYFManager3) {
                        if (cYFManager3.d == null) {
                            cYFManager3.d = new K(baseShopApplication, cYFManager3);
                        }
                    }
                    S.j.d();
                    Ai ai = new Ai();
                    ai.d = 0;
                    ai.e = 0;
                    baseShopApplication.registerActivityLifecycleCallbacks(ai);
                    b = true;
                    d = str;
                    new Thread(new Runnable() { // from class: com.cyberfend.cyfsecurity.CYFMonitor.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            CYFMonitor.a(false, baseShopApplication);
                        }
                    }).start();
                    long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                    O.c(CircleProgressBar.a("Z\\YBBGE_MS"), CircleProgressBar.a("Pkv{DH@BXD\rKoIG\u0019\n") + jUptimeMillis2 + CircleProgressBar.a("tv"), new Throwable[0]);
                    return;
                }
            } catch (MalformedURLException unused3) {
            }
        }
        O.a(CircleProgressBar.a("Z\\YBBGE_MS"), CircleProgressBar.a("Pkv{\roMBNDD?+\u0004kM\\XT^J\u001dii~"), new Throwable[0]);
        throw new RuntimeException(CircleProgressBar.a("Mmz/x{`\u000bDNRrgP\u0002JY\u0019OEAS[\u0015\u0012|_]S\u0015PVnHakN\td\u007fvqs\u0004\u000b.pfiq|xmn2zyp}n\u007f;w|W$FI]C]I\bGWX\fVQEKXiD\u0002NISASTL\u001cAW_2J`sj\u0005bbqc`z`vf)c\u007fkI\u007f\u007f6}ef:lcsurTs\u001aqy`"));
    }
}
