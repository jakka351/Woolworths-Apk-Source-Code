package com.dynatrace.android.lifecycle.appstate;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.callback.ActivityComponentIdentifier;
import com.dynatrace.android.lifecycle.callback.ComponentIdentity;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class ApplicationStateTracker implements Application.ActivityLifecycleCallbacks {
    public static final String h;
    public final ActivityComponentIdentifier f;
    public final LinkedHashSet d = new LinkedHashSet();
    public boolean g = false;
    public final HashSet e = new HashSet();

    static {
        boolean z = Global.f14077a;
        h = "dtxApplicationStateTracker";
    }

    public ApplicationStateTracker(ActivityComponentIdentifier activityComponentIdentifier) {
        this.f = activityComponentIdentifier;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.e.add(this.f.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        ComponentIdentity componentIdentityA = this.f.a(activity);
        HashSet hashSet = this.e;
        hashSet.add(componentIdentityA);
        if (hashSet.size() != 1 || this.g) {
            return;
        }
        if (Global.f14077a) {
            Utility.h(h, "app returns to foreground");
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((ApplicationStateListener) it.next()).onForeground();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.g = activity.isChangingConfigurations();
        ComponentIdentity componentIdentityA = this.f.a(activity);
        HashSet hashSet = this.e;
        hashSet.remove(componentIdentityA);
        if (!hashSet.isEmpty() || this.g) {
            return;
        }
        if (Global.f14077a) {
            Utility.h(h, "app goes into background");
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((ApplicationStateListener) it.next()).onBackground();
        }
    }
}
