package leakcanary;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import leakcanary.AndroidLeakFixes;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"leakcanary/AndroidLeakFixes$IMM_FOCUSED_VIEW$apply$2", "Landroid/app/Application$ActivityLifecycleCallbacks;", "plumber-android-core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class AndroidLeakFixes$IMM_FOCUSED_VIEW$apply$2 implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(final Activity activity, Bundle bundle) {
        AndroidLeakFixes.Companion.WindowDelegateCallback windowDelegateCallback;
        Intrinsics.i(activity, "activity");
        AndroidLeakFixes[] androidLeakFixesArr = AndroidLeakFixes.e;
        Window window = activity.getWindow();
        Intrinsics.d(window, "activity.window");
        final Function0<Unit> function0 = new Function0<Unit>(activity) { // from class: leakcanary.AndroidLeakFixes$IMM_FOCUSED_VIEW$apply$2$onActivityCreated$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                throw null;
            }
        };
        if (window.peekDecorView() != null) {
            function0.invoke();
            return;
        }
        Function0<Boolean> function02 = new Function0<Boolean>() { // from class: leakcanary.AndroidLeakFixes$Companion$onDecorViewReady$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                function0.invoke();
                return Boolean.FALSE;
            }
        };
        Window.Callback currentCallback = window.getCallback();
        if (currentCallback instanceof AndroidLeakFixes.Companion.WindowDelegateCallback) {
            windowDelegateCallback = (AndroidLeakFixes.Companion.WindowDelegateCallback) currentCallback;
        } else {
            Intrinsics.d(currentCallback, "currentCallback");
            AndroidLeakFixes.Companion.WindowDelegateCallback windowDelegateCallback2 = new AndroidLeakFixes.Companion.WindowDelegateCallback(currentCallback);
            window.setCallback(windowDelegateCallback2);
            windowDelegateCallback = windowDelegateCallback2;
        }
        windowDelegateCallback.e.add(function02);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity p0) {
        Intrinsics.i(p0, "p0");
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
