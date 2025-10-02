package com.dynatrace.android.lifecycle.callback;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.dynatrace.android.lifecycle.LifecycleController;
import com.dynatrace.android.lifecycle.event.ActivityEventType;

/* loaded from: classes.dex */
public class ActivityLifecycleListener implements Application.ActivityLifecycleCallbacks {
    public final LifecycleController d;
    public final ActivityComponentIdentifier e;

    public ActivityLifecycleListener(LifecycleController lifecycleController, ActivityComponentIdentifier activityComponentIdentifier) {
        this.d = lifecycleController;
        this.e = activityComponentIdentifier;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.d.b(this.e.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        this.d.b(this.e.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        this.d.a(this.e.a(activity), ActivityEventType.d);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(Activity activity) {
        this.d.a(this.e.a(activity), ActivityEventType.f);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
        this.d.a(this.e.a(activity), ActivityEventType.e);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.d.b(this.e.a(activity));
    }
}
