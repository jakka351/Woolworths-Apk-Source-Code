package YU;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Pair;
import com.cyberfend.cyfsecurity.CircleProgressBar;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class B implements Application.ActivityLifecycleCallbacks {
    public static String e = CircleProgressBar.a("Xfkf[@XR\u0002SElsIGG\u0010\u0019");
    public static String f = CircleProgressBar.a("[d|dJ[C^LEeicJVnKWYPKO");
    public static String g = CircleProgressBar.a("Xfkf[@XR\u0002QAjuAF\u0019\n");
    public ArrayList d;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ArrayList arrayList = this.d;
        if (arrayList.size() < 10) {
            arrayList.add(new Pair("2", Long.valueOf(System.currentTimeMillis())));
        }
        O.c(f, g + activity.getLocalClassName(), new Throwable[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ArrayList arrayList = this.d;
        if (arrayList.size() < 10) {
            arrayList.add(new Pair("3", Long.valueOf(System.currentTimeMillis())));
        }
        O.c(f, e + activity.getLocalClassName(), new Throwable[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
