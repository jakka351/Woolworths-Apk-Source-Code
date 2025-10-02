package com.dynatrace.android.lifecycle.appstart;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import com.dynatrace.android.agent.measurement.MeasurementProviderImpl;

/* loaded from: classes.dex */
public class ActivityStateListener implements Application.ActivityLifecycleCallbacks {
    public final AppStartController d;
    public final MeasurementProviderImpl e;

    public ActivityStateListener(AppStartController appStartController, MeasurementProviderImpl measurementProviderImpl) {
        this.d = appStartController;
        this.e = measurementProviderImpl;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        this.d.a(this.e.a(), activity.getComponentName().getClassName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (Build.VERSION.SDK_INT < 29) {
            this.d.a(this.e.a(), activity.getComponentName().getClassName());
        }
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
