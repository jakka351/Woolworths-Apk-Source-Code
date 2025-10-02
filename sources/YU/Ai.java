package YU;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.cyberfend.cyfsecurity.CYFManager;
import com.cyberfend.cyfsecurity.CYFMonitor;
import com.cyberfend.cyfsecurity.CircleProgressBar;

/* loaded from: classes.dex */
public class Ai implements Application.ActivityLifecycleCallbacks {
    public static String f = CircleProgressBar.a("Xfkf[@XR\u0002bRzgPGG\u0010\u0019");
    public static String g = CircleProgressBar.a("Xfkf[@XR\u0002eElrVMZO]\u0002\u0017");
    public static String h = CircleProgressBar.a("Xfkf[@XR\u0002qAjuAF\u0019\n");
    public static String i = CircleProgressBar.a("Xfkf[@XR\u0002sElsIGG\u0010");
    public static String j = CircleProgressBar.a("UlyjNPOGGbAsjFC@AJ");
    public int d;
    public int e;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        O.c(j, f + activity.getLocalClassName(), new Throwable[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        O.c(j, g + activity.getLocalClassName(), new Throwable[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        O.c(j, h + activity.getLocalClassName(), new Throwable[0]);
        int i2 = this.d + (-1);
        this.d = i2;
        if (i2 == 0) {
            CYFManager cYFManager = CYFMonitor.f14058a;
            try {
                O.c(CircleProgressBar.a("Z\\YBBGE_MS"), CircleProgressBar.a("Jqp\u007f\rJCGNDCkoJE\u0003Y\\VDAO\u001c_SEQ"), new Throwable[0]);
                CYFManager cYFManager2 = CYFMonitor.f14058a;
                cYFManager2.r();
                cYFManager2.s();
            } catch (Exception unused) {
            }
            CYFMonitor.c = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        r4.add(java.lang.Integer.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        r0 = com.cyberfend.cyfsecurity.CYFMonitor.f14058a;
        r0.o(r8.getWindow());
        r0.n(r8.getApplication().getBaseContext(), (android.view.ViewGroup) r8.findViewById(android.R.id.content));
        r0.m(r8);
     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityResumed(android.app.Activity r8) {
        /*
            r7 = this;
            java.lang.String r0 = YU.Ai.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = YU.Ai.i
            r1.append(r2)
            java.lang.String r2 = r8.getLocalClassName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            YU.O.c(r0, r1, r3)
            int r0 = r7.d
            r1 = 1
            if (r0 != 0) goto Lb1
            com.cyberfend.cyfsecurity.CYFManager r0 = com.cyberfend.cyfsecurity.CYFMonitor.f14058a
            java.lang.String r0 = "Z\\YBBGE_MS"
            java.lang.String r0 = com.cyberfend.cyfsecurity.CircleProgressBar.a(r0)     // Catch: java.lang.Exception -> La8
            java.lang.String r3 = "Jq~}Y\tODNME|rMLD\nJ]Y]RN\u001bVPDN"
            java.lang.String r3 = com.cyberfend.cyfsecurity.CircleProgressBar.a(r3)     // Catch: java.lang.Exception -> La8
            java.lang.Throwable[] r4 = new java.lang.Throwable[r2]     // Catch: java.lang.Exception -> La8
            YU.O.c(r0, r3, r4)     // Catch: java.lang.Exception -> La8
            long r3 = YU.Q.b     // Catch: java.lang.Exception -> La8
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L43
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Exception -> La8
            YU.Q.b = r3     // Catch: java.lang.Exception -> La8
        L43:
            long r3 = YU.Q.f15a     // Catch: java.lang.Exception -> La8
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L4f
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> La8
            YU.Q.f15a = r3     // Catch: java.lang.Exception -> La8
        L4f:
            com.cyberfend.cyfsecurity.CYFManager r0 = com.cyberfend.cyfsecurity.CYFMonitor.f14058a     // Catch: java.lang.Exception -> La8
            r0.p()     // Catch: java.lang.Exception -> La8
            r0.q()     // Catch: java.lang.Exception -> La8
            android.view.Window r0 = r8.getWindow()     // Catch: java.lang.Exception -> La8
            java.lang.Class<com.cyberfend.cyfsecurity.CYFManager> r3 = com.cyberfend.cyfsecurity.CYFManager.class
            monitor-enter(r3)     // Catch: java.lang.Exception -> La8
            int r0 = r0.hashCode()     // Catch: java.lang.Throwable -> L7b
        L62:
            java.util.ArrayList r4 = com.cyberfend.cyfsecurity.CYFManager.r     // Catch: java.lang.Throwable -> L7b
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L7b
            if (r2 >= r5) goto L7d
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L7b
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L7b
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L7b
            if (r0 != r4) goto L78
            monitor-exit(r3)     // Catch: java.lang.Exception -> La8
            goto Laf
        L78:
            int r2 = r2 + 1
            goto L62
        L7b:
            r8 = move-exception
            goto La6
        L7d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L7b
            r4.add(r0)     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r3)     // Catch: java.lang.Exception -> La8
            com.cyberfend.cyfsecurity.CYFManager r0 = com.cyberfend.cyfsecurity.CYFMonitor.f14058a     // Catch: java.lang.Exception -> La8
            android.view.Window r2 = r8.getWindow()     // Catch: java.lang.Exception -> La8
            r0.o(r2)     // Catch: java.lang.Exception -> La8
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r8.findViewById(r2)     // Catch: java.lang.Exception -> La8
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch: java.lang.Exception -> La8
            android.app.Application r3 = r8.getApplication()     // Catch: java.lang.Exception -> La8
            android.content.Context r3 = r3.getBaseContext()     // Catch: java.lang.Exception -> La8
            r0.n(r3, r2)     // Catch: java.lang.Exception -> La8
            r0.m(r8)     // Catch: java.lang.Exception -> La8
            goto Laf
        La6:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7b
            throw r8     // Catch: java.lang.Exception -> La8
        La8:
            YU.Ue r8 = YU.Ue.h()
            r8.e()
        Laf:
            com.cyberfend.cyfsecurity.CYFMonitor.c = r1
        Lb1:
            int r8 = r7.d
            int r8 = r8 + r1
            r7.d = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: YU.Ai.onActivityResumed(android.app.Activity):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.e == 0) {
            Application application = activity.getApplication();
            try {
                if (CYFMonitor.f14058a.e().booleanValue() && !CYFMonitor.e) {
                    CYFMonitor.a(false, application);
                }
            } catch (Exception unused) {
            }
        }
        this.e++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.e--;
    }
}
