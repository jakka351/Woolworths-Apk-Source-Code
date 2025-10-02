package com.dynatrace.android.lifecycle.callback;

import android.app.Activity;

/* loaded from: classes.dex */
public class ActivityComponentIdentifier implements ComponentIdentifier<Activity> {
    public final ComponentIdentity a(Object obj) {
        Activity activity = (Activity) obj;
        return new ComponentIdentity(activity.getComponentName().getClassName(), System.identityHashCode(activity));
    }
}
