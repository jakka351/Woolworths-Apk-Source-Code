package leakcanary;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"leakcanary/AndroidLeakFixes$Companion$onActivityDestroyed$1", "Landroid/app/Application$ActivityLifecycleCallbacks;", "plumber-android-core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class AndroidLeakFixes$Companion$onActivityDestroyed$1 implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity p0, Bundle bundle) {
        Intrinsics.i(p0, "p0");
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.i(activity, "activity");
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity p0) {
        Intrinsics.i(p0, "p0");
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity p0) {
        Intrinsics.i(p0, "p0");
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity p0, Bundle p1) {
        Intrinsics.i(p0, "p0");
        Intrinsics.i(p1, "p1");
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity p0) {
        Intrinsics.i(p0, "p0");
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity p0) {
        Intrinsics.i(p0, "p0");
        throw null;
    }
}
