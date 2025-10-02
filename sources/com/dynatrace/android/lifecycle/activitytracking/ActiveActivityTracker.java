package com.dynatrace.android.lifecycle.activitytracking;

import android.app.Activity;
import android.app.Application;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetrics;
import com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetricsListener;
import com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetricsUtility;
import com.dynatrace.android.lifecycle.callback.ActivityComponentIdentifier;
import com.dynatrace.android.lifecycle.callback.ComponentIdentity;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class ActiveActivityTracker implements Application.ActivityLifecycleCallbacks {
    public static final String j;
    public final ActivityComponentIdentifier d;
    public final ActiveActivityListener e;
    public final ActivityScreenMetricsCollector f;
    public final ScreenMetricsListener g;
    public final LinkedList h = new LinkedList();
    public ComponentIdentity i;

    static {
        boolean z = Global.f14077a;
        j = "dtxActiveActivityTracker";
    }

    public ActiveActivityTracker(ActivityComponentIdentifier activityComponentIdentifier, ActiveActivityListener activeActivityListener, ActivityScreenMetricsCollector activityScreenMetricsCollector, ScreenMetricsListener screenMetricsListener) {
        this.d = activityComponentIdentifier;
        this.e = activeActivityListener;
        this.f = activityScreenMetricsCollector;
        this.g = screenMetricsListener;
    }

    public final void a(ComponentIdentity componentIdentity) {
        if (this.i == componentIdentity) {
            return;
        }
        if (Global.f14077a) {
            String str = j;
            if (componentIdentity == null) {
                Utility.h(str, "unset current activity");
            } else {
                Utility.h(str, "set current activity to " + componentIdentity.f14170a);
            }
        }
        ActiveActivityListener activeActivityListener = this.e;
        if (componentIdentity == null) {
            activeActivityListener.b(null);
        } else {
            activeActivityListener.b(componentIdentity.f14170a);
        }
        this.i = componentIdentity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f.getClass();
        ScreenMetrics.Builder builder = new ScreenMetrics.Builder();
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        if (Build.VERSION.SDK_INT <= 29) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            int i = ScreenMetricsUtility.f14164a;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            builder.d = displayMetrics.density;
            builder.c = displayMetrics.densityDpi;
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            builder.f14163a = point.x;
            builder.b = point.y;
        } else {
            Rect bounds = windowManager.getMaximumWindowMetrics().getBounds();
            builder.f14163a = bounds.width();
            builder.b = bounds.height();
            int i2 = activity.getResources().getConfiguration().densityDpi;
            builder.d = i2 / 160.0f;
            builder.c = i2;
        }
        this.g.a(new ScreenMetrics(builder));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ComponentIdentity componentIdentityA = this.d.a(activity);
        LinkedList linkedList = this.h;
        linkedList.remove(componentIdentityA);
        if (linkedList.size() > 0) {
            a((ComponentIdentity) linkedList.peekFirst());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ComponentIdentity componentIdentityA = this.d.a(activity);
        if (componentIdentityA.equals(this.i)) {
            return;
        }
        this.h.addFirst(componentIdentityA);
        a(componentIdentityA);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (this.h.size() == 0) {
            a(null);
        }
    }
}
