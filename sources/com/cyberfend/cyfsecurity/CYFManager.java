package com.cyberfend.cyfsecurity;

import YU.AX;
import YU.Ah;
import YU.B;
import YU.FU;
import YU.FX;
import YU.Fl;
import YU.Fq;
import YU.K;
import YU.O;
import YU.Q;
import YU.UB;
import YU.UK;
import YU.UY;
import YU.Ue;
import YU.Ui;
import YU.Us;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class CYFManager implements AX {
    public static int q = 7263;
    public static final ArrayList r = new ArrayList();
    public static boolean s = false;
    public static boolean t = false;
    public static boolean u = false;
    public static boolean v = false;
    public int m;

    /* renamed from: a, reason: collision with root package name */
    public UY f14056a = null;
    public FU b = null;
    public FX c = null;
    public K d = null;
    public Ui e = null;
    public B f = null;
    public Fl g = null;
    public Us h = null;
    public Fq i = null;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public Handler k = null;
    public String l = null;
    public int n = -1;
    public Date o = null;
    public boolean p = false;

    /* renamed from: com.cyberfend.cyfsecurity.CYFManager$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            SensorDataBuilder.f14060a.encryptKeyN();
        }
    }

    /* renamed from: com.cyberfend.cyfsecurity.CYFManager$2, reason: invalid class name */
    class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            SensorDataBuilder.f14060a.decryptN();
        }
    }

    /* renamed from: com.cyberfend.cyfsecurity.CYFManager$5, reason: invalid class name */
    /* loaded from: classes4.dex */
    /* synthetic */ class AnonymousClass5 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14057a;

        static {
            int[] iArr = new int[SDKInitFailure.values().length];
            f14057a = iArr;
            try {
                iArr[SDKInitFailure.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14057a[SDKInitFailure.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static void g() {
        try {
            new Thread(new AnonymousClass1()).start();
        } catch (Exception unused) {
        }
    }

    @Override // YU.AX
    public final void a() {
        CYFManager cYFManager = CYFMonitor.f14058a;
    }

    @Override // YU.AX
    public final void b() {
        CYFManager cYFManager = CYFMonitor.f14058a;
    }

    public final synchronized void c(Application application, String str, String str2) {
        if (application != null) {
            try {
                if (this.h != null) {
                    this.o = new Date();
                    Us us = this.h;
                    us.getClass();
                    try {
                        us.b = application;
                        us.d = str;
                        us.e = str2;
                        us.a();
                    } catch (Exception e) {
                        UB.a(e);
                    }
                }
            } catch (Exception e2) {
                UB.a(e2);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(78:0|2|(1:4)|5|(1:7)|8|(2:10|(2:12|(6:14|(1:16)|17|(1:19)|20|21)))(1:22)|23|(1:25)(1:26)|27|(6:308|29|(2:31|32)(1:33)|298|34|(2:36|37)(1:38))|39|(3:304|40|(4:327|42|43|(4:318|54|(3:335|58|59)|317))(2:52|(0)))|70|(3:300|71|313)|(64:331|73|74|(4:306|92|(3:333|96|97)|305)|108|315|109|(2:112|110)|340|115|(1:117)|118|119|121|325|122|(2:125|123)|341|128|(1:130)|131|132|134|(4:136|(4:337|138|139|(2:149|(1:161)(2:329|153)))(1:146)|147|(0))(1:163)|162|164|(1:166)|167|(6:323|169|(2:172|170)|353|175|179)(1:179)|178|180|(6:182|310|183|(2:186|184)|342|189)(1:192)|193|321|194|(1:196)(2:197|(1:199))|320|202|302|203|(1:205)(2:206|(1:208))|301|211|(1:213)(1:214)|215|(1:217)|(1:219)|220|(1:222)(1:223)|224|(1:226)(1:227)|228|(1:230)(1:231)|232|(1:237)(1:236)|238|(1:245)(2:242|(1:244))|246|(1:249)|250|(2:253|251)|343|254|(2:256|257)(7:258|(8:264|(1:268)|269|(3:272|(4:344|(2:274|(2:276|(1:348)(2:278|(1:350)(2:349|282)))(2:347|(2:283|352)))|351|(2:281|339))(1:346)|270)|345|284|(1:286)(1:287)|288)|263|289|(1:293)|294|295))(1:89)|90|(0)|108|315|109|(1:110)|340|115|(0)|118|119|121|325|122|(1:123)|341|128|(0)|131|132|134|(0)(0)|162|164|(0)|167|(0)(0)|178|180|(0)(0)|193|321|194|(0)(0)|320|202|302|203|(0)(0)|301|211|(0)(0)|215|(0)|(0)|220|(0)(0)|224|(0)(0)|228|(0)(0)|232|(2:234|237)(0)|238|(2:240|245)(0)|246|(0)|250|(1:251)|343|254|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(80:0|2|(1:4)|5|(1:7)|8|(2:10|(2:12|(6:14|(1:16)|17|(1:19)|20|21)))(1:22)|23|(1:25)(1:26)|27|(6:308|29|(2:31|32)(1:33)|298|34|(2:36|37)(1:38))|39|304|40|(4:327|42|43|(4:318|54|(3:335|58|59)|317))(2:52|(0))|70|(3:300|71|313)|(64:331|73|74|(4:306|92|(3:333|96|97)|305)|108|315|109|(2:112|110)|340|115|(1:117)|118|119|121|325|122|(2:125|123)|341|128|(1:130)|131|132|134|(4:136|(4:337|138|139|(2:149|(1:161)(2:329|153)))(1:146)|147|(0))(1:163)|162|164|(1:166)|167|(6:323|169|(2:172|170)|353|175|179)(1:179)|178|180|(6:182|310|183|(2:186|184)|342|189)(1:192)|193|321|194|(1:196)(2:197|(1:199))|320|202|302|203|(1:205)(2:206|(1:208))|301|211|(1:213)(1:214)|215|(1:217)|(1:219)|220|(1:222)(1:223)|224|(1:226)(1:227)|228|(1:230)(1:231)|232|(1:237)(1:236)|238|(1:245)(2:242|(1:244))|246|(1:249)|250|(2:253|251)|343|254|(2:256|257)(7:258|(8:264|(1:268)|269|(3:272|(4:344|(2:274|(2:276|(1:348)(2:278|(1:350)(2:349|282)))(2:347|(2:283|352)))|351|(2:281|339))(1:346)|270)|345|284|(1:286)(1:287)|288)|263|289|(1:293)|294|295))(1:89)|90|(0)|108|315|109|(1:110)|340|115|(0)|118|119|121|325|122|(1:123)|341|128|(0)|131|132|134|(0)(0)|162|164|(0)|167|(0)(0)|178|180|(0)(0)|193|321|194|(0)(0)|320|202|302|203|(0)(0)|301|211|(0)(0)|215|(0)|(0)|220|(0)(0)|224|(0)(0)|228|(0)(0)|232|(2:234|237)(0)|238|(2:240|245)(0)|246|(0)|250|(1:251)|343|254|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0361, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x037a, code lost:
    
        YU.O.a(YU.K.t, YU.K.v, r0);
        YU.UB.a(r0);
        r8 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03bf, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03da, code lost:
    
        r30 = r15;
        YU.O.a(YU.FX.s, YU.FX.t, r0);
        YU.UB.a(r0);
        r11 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x05d2, code lost:
    
        r0 = com.cyberfend.cyfsecurity.CircleProgressBar.a(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x05f6, code lost:
    
        r2 = com.cyberfend.cyfsecurity.CircleProgressBar.a(r22);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x034a A[Catch: Exception -> 0x0361, LOOP:0: B:110:0x0344->B:112:0x034a, LOOP_END, TryCatch #15 {Exception -> 0x0361, blocks: (B:109:0x0339, B:110:0x0344, B:112:0x034a, B:115:0x0363, B:117:0x0369, B:118:0x0374), top: B:315:0x0339 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0369 A[Catch: Exception -> 0x0361, TryCatch #15 {Exception -> 0x0361, blocks: (B:109:0x0339, B:110:0x0344, B:112:0x034a, B:115:0x0363, B:117:0x0369, B:118:0x0374), top: B:315:0x0339 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03a4 A[Catch: Exception -> 0x03bf, LOOP:1: B:123:0x039e->B:125:0x03a4, LOOP_END, TryCatch #22 {Exception -> 0x03bf, blocks: (B:122:0x0393, B:123:0x039e, B:125:0x03a4, B:128:0x03c1, B:130:0x03c7, B:131:0x03d2), top: B:325:0x0393 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03c7 A[Catch: Exception -> 0x03bf, TryCatch #22 {Exception -> 0x03bf, blocks: (B:122:0x0393, B:123:0x039e, B:125:0x03a4, B:128:0x03c1, B:130:0x03c7, B:131:0x03d2), top: B:325:0x0393 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0560 A[PHI: r0
  0x0560: PHI (r0v93 java.lang.String) = (r0v25 java.lang.String), (r0v30 java.lang.String) binds: [B:168:0x04eb, B:175:0x0541] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05c0 A[Catch: Exception -> 0x05d2, TryCatch #20 {Exception -> 0x05d2, blocks: (B:194:0x05b8, B:196:0x05c0, B:197:0x05c5, B:199:0x05cb), top: B:321:0x05b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05c5 A[Catch: Exception -> 0x05d2, TryCatch #20 {Exception -> 0x05d2, blocks: (B:194:0x05b8, B:196:0x05c0, B:197:0x05c5, B:199:0x05cb), top: B:321:0x05b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05e4 A[Catch: Exception -> 0x05f6, TryCatch #4 {Exception -> 0x05f6, blocks: (B:203:0x05dc, B:205:0x05e4, B:206:0x05e9, B:208:0x05ef), top: B:302:0x05dc }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05e9 A[Catch: Exception -> 0x05f6, TryCatch #4 {Exception -> 0x05f6, blocks: (B:203:0x05dc, B:205:0x05e4, B:206:0x05e9, B:208:0x05ef), top: B:302:0x05dc }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x09bb  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0a16 A[LOOP:3: B:251:0x0a10->B:253:0x0a16, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0a52  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0a59  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x02ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x01fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x04ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x026d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c5  */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable[]] */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r29v10 */
    /* JADX WARN: Type inference failed for: r29v13 */
    /* JADX WARN: Type inference failed for: r29v14 */
    /* JADX WARN: Type inference failed for: r29v6 */
    /* JADX WARN: Type inference failed for: r29v8 */
    /* JADX WARN: Type inference failed for: r29v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d() {
        /*
            Method dump skipped, instructions count: 2886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cyberfend.cyfsecurity.CYFManager.d():java.lang.String");
    }

    public final synchronized Boolean e() {
        if (this.o == null) {
            return Boolean.FALSE;
        }
        Date date = new Date();
        Us us = this.h;
        return Boolean.valueOf((date.getTime() - this.o.getTime()) / 1000 > ((long) ((us == null || us.c.d.intValue() <= 0) ? 3600 : this.h.c.d.intValue())));
    }

    public final void f() {
        try {
            this.d.c();
            FX fx = this.c;
            fx.getClass();
            fx.f = SystemClock.uptimeMillis();
            fx.g.clear();
            Future future = fx.h;
            if (future != null) {
                if (!future.isCancelled() && !fx.h.isDone()) {
                    fx.h.cancel(true);
                }
                fx.h = null;
            }
            fx.j.clear();
        } catch (Exception e) {
            UB.a(e);
        }
    }

    public final synchronized int h() {
        return this.m;
    }

    public final synchronized String i() {
        try {
            O.c(CircleProgressBar.a("Z\\YBLGMLGS"), CircleProgressBar.a("^`k{DGK\u000bQDNliV\u0002GKMY"), new Throwable[0]);
            String strA = CircleProgressBar.a("}`ynXEX\u0006ONBvjA");
            try {
            } catch (Exception e) {
                O.a(CircleProgressBar.a("Z\\YBLGMLGS"), CircleProgressBar.a("_dvcHM\f_M\u0001Gzr\u0004QFDJWE\u000eY]OS"), e);
                UB.a(e);
                Ue ueH = Ue.h();
                ArrayList arrayList = ueH.g;
                try {
                    if (ueH.e != CYFIntegrityChecker$DebugMode.d) {
                        CYFIntegrityChecker$IntegrityCheckState cYFIntegrityChecker$IntegrityCheckState = CYFIntegrityChecker$IntegrityCheckState.t;
                        if (!arrayList.contains(cYFIntegrityChecker$IntegrityCheckState)) {
                            arrayList.add(cYFIntegrityChecker$IntegrityCheckState);
                        }
                        ueH.k(Ue.P, Ue.N);
                        arrayList.remove(cYFIntegrityChecker$IntegrityCheckState);
                        ueH.i();
                    }
                } catch (Exception unused) {
                }
            }
            if (this.c != null && this.d != null) {
                strA = d();
                Ue.h().f();
                O.c(CircleProgressBar.a("Z\\YBLGMLGS"), CircleProgressBar.a("J`q|B[\foCUA%&") + strA, new Throwable[0]);
                return strA;
            }
            O.a(CircleProgressBar.a("Z\\YBLGMLGS"), CircleProgressBar.a("Xn~bL@nfr\u0001s[M\u0004KP\nWWC\u000eTRRFXQC_OQW"), new Throwable[0]);
            return strA;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:4:0x0003, B:6:0x0007, B:10:0x000d, B:13:0x0023, B:15:0x0027), top: B:20:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void j(android.app.Application r2, java.lang.String r3, java.lang.String r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L23
            boolean r0 = com.cyberfend.cyfsecurity.CYFManager.v     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L23
            YU.Us r0 = r1.h     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto Ld
            monitor-exit(r1)
            return
        Ld:
            java.util.Date r0 = new java.util.Date     // Catch: java.lang.Throwable -> L21
            r0.<init>()     // Catch: java.lang.Throwable -> L21
            r1.o = r0     // Catch: java.lang.Throwable -> L21
            YU.Us r0 = new YU.Us     // Catch: java.lang.Throwable -> L21
            r0.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L21
            r1.h = r0     // Catch: java.lang.Throwable -> L21
            r2 = 1
            com.cyberfend.cyfsecurity.CYFManager.v = r2     // Catch: java.lang.Throwable -> L21
            com.cyberfend.cyfsecurity.CYFManager r2 = com.cyberfend.cyfsecurity.CYFMonitor.f14058a     // Catch: java.lang.Throwable -> L21
            goto L2a
        L21:
            r2 = move-exception
            goto L2c
        L23:
            boolean r0 = com.cyberfend.cyfsecurity.CYFManager.v     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L2a
            r1.c(r2, r3, r4)     // Catch: java.lang.Throwable -> L21
        L2a:
            monitor-exit(r1)
            return
        L2c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cyberfend.cyfsecurity.CYFManager.j(android.app.Application, java.lang.String, java.lang.String):void");
    }

    public final void k() {
        try {
            Ui ui = this.e;
            if (ui != null) {
                ui.b();
            }
            UY uy = this.f14056a;
            if (uy != null) {
                uy.d();
            }
            FU fu = this.b;
            if (fu != null) {
                fu.f7a.clear();
            }
            String str = UK.f20a;
            O.c(CircleProgressBar.a("\\szaY{IXWMT"), CircleProgressBar.a("K`ljY]EEE\u0001V~jQGP"), new Throwable[0]);
            UK.f20a = "";
            int i = Q.c;
            O.c(CircleProgressBar.a("Zjq|YHB_Q"), CircleProgressBar.a("K`ljY]EEE\u0001V~jQGP"), new Throwable[0]);
            Q.b = SystemClock.uptimeMillis();
            Q.f15a = System.currentTimeMillis();
        } catch (Exception e) {
            UB.a(e);
        }
    }

    public final synchronized void l(int i) {
        this.m = i;
    }

    public final void m(Activity activity) {
        try {
            if (this.f14056a != null) {
                if (this.b == null) {
                    this.b = new FU();
                }
                activity.getWindow().getDecorView().getRootView().getViewTreeObserver().addOnGlobalFocusChangeListener(this.b.b);
                this.b.b.addObserver(this.f14056a.f25a);
            }
        } catch (Exception e) {
            O.a(CircleProgressBar.a("Z\\YBLGMLGS"), CircleProgressBar.a("\\}|j]]EDL\u0001Iq&GPFKMQYI\u001dZTQDC\u000fZ\\GG\u007fGmu"), e);
            UB.a(e);
            Ue.h().e();
        }
    }

    public final void n(Context context, ViewGroup viewGroup) {
        try {
            ArrayList arrayListA = Ah.a(viewGroup);
            for (int i = 0; i < arrayListA.size(); i++) {
                View view = (View) arrayListA.get(i);
                if (view instanceof EditText) {
                    if (!this.p) {
                        this.f14056a = new UY(context);
                        this.p = true;
                    }
                    this.f14056a.c((EditText) view);
                }
            }
        } catch (Exception e) {
            O.a(CircleProgressBar.a("Z\\YBLGMLGS"), CircleProgressBar.a("\\}|j]]EDL\u0001Iq&GPFKMQYI\u001dH^JE\u0010C_F@VtLz"), e);
            UB.a(e);
            Ue.h().e();
        }
    }

    public final void o(Window window) {
        try {
            if (this.e == null) {
                this.e = new Ui();
            }
            Ui ui = this.e;
            ui.getClass();
            O.c(CircleProgressBar.a("MjjlEdMECFEm"), CircleProgressBar.a("Ull{HGEEE\u0001Oq&SKMNVO"), new Throwable[0]);
            ui.d = SystemClock.uptimeMillis();
            YU.R r2 = new YU.R(window.getCallback());
            window.setCallback(r2);
            r2.addObserver(ui);
        } catch (Exception e) {
            O.a(CircleProgressBar.a("Z\\YBLGMLGS"), CircleProgressBar.a("\\}|j]]EDL\u0001Iq&GPFKMQYI\u001dHTGRX\u000f[TZR}Lz"), e);
            UB.a(e);
            Ue.h().e();
        }
    }

    public final synchronized void p() {
        try {
            this.c.c();
            Ue.h().c(Boolean.TRUE);
        } catch (Exception e) {
            e.getMessage();
            SDKInitFailure sDKInitFailure = SDKInitFailure.d;
            CYFManager cYFManager = CYFMonitor.f14058a;
            O.a(CircleProgressBar.a("Z\\YBLGMLGS"), CircleProgressBar.a("\\}|j]]EDL\u0001Iq&WVBXMQYI\u001dQTFX_A\u0016XU]{Nmu"), e);
            UB.a(e);
            Ue.h().c(Boolean.FALSE);
        }
    }

    public final synchronized void q() {
        try {
            this.d.d();
            Ue.h().d(Boolean.TRUE);
        } catch (Exception e) {
            e.getMessage();
            SDKInitFailure sDKInitFailure = SDKInitFailure.d;
            CYFManager cYFManager = CYFMonitor.f14058a;
            Ue.h().d(Boolean.FALSE);
            O.a(CircleProgressBar.a("Z\\YBLGMLGS"), CircleProgressBar.a("\\}|j]]EDL\u0001Iq&WVBXMQYI\u001dSI[T^[WA]\\t\tefSHknp"), e);
            UB.a(e);
        }
    }

    public final synchronized void r() {
        try {
            this.c.d();
        } catch (Exception e) {
            O.a(CircleProgressBar.a("Z\\YBLGMLGS"), CircleProgressBar.a("\\}|j]]EDL\u0001Iq&WVLZIQYI\u001dQTFX_A\u0016XU]{Nmu"), e);
            UB.a(e);
        }
    }

    public final synchronized void s() {
        try {
            this.d.e();
        } catch (Exception e) {
            O.a(CircleProgressBar.a("Z\\YBLGMLGS"), CircleProgressBar.a("\\}|j]]EDL\u0001Iq&WVLZIQYI\u001dSI[T^[WA]\\t\tefSHknp"), e);
            UB.a(e);
        }
    }
}
