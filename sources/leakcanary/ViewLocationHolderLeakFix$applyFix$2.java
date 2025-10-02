package leakcanary;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.lang.reflect.Proxy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import leakcanary.internal.FragmentExtensionsKt;
import leakcanary.internal.ObjectsKt$NO_OP_HANDLER$1;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"leakcanary/ViewLocationHolderLeakFix$applyFix$2", "Landroid/app/Application$ActivityLifecycleCallbacks;", "plumber-android-core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class ViewLocationHolderLeakFix$applyFix$2 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ Application.ActivityLifecycleCallbacks d;
    public final /* synthetic */ Application e;

    public ViewLocationHolderLeakFix$applyFix$2(Application application) throws IllegalArgumentException {
        this.e = application;
        Object objNewProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, ObjectsKt$NO_OP_HANDLER$1.f24886a);
        if (objNewProxyInstance == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks");
        }
        this.d = (Application.ActivityLifecycleCallbacks) objNewProxyInstance;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.i(activity, "activity");
        final Function0<Unit> function0 = new Function0<Unit>() { // from class: leakcanary.ViewLocationHolderLeakFix$applyFix$2$onActivityCreated$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewLocationHolderLeakFix.a(this.h.e);
                return Unit.f24250a;
            }
        };
        if (((Boolean) FragmentExtensionsKt.f24883a.getD()).booleanValue() && (activity instanceof FragmentActivity)) {
            ((FragmentActivity) activity).getSupportFragmentManager().e0(new FragmentManager.FragmentLifecycleCallbacks() { // from class: leakcanary.internal.FragmentExtensionsKt$onAndroidXFragmentViewDestroyed$1
                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public final void f(FragmentManager fragmentManager, Fragment fragment2) {
                    Intrinsics.i(fragment2, "fragment");
                    function0.invoke();
                }
            }, true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity p0) {
        Intrinsics.i(p0, "p0");
        this.d.onActivityDestroyed(p0);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity p0) {
        Intrinsics.i(p0, "p0");
        this.d.onActivityPaused(p0);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity p0) {
        Intrinsics.i(p0, "p0");
        this.d.onActivityResumed(p0);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity p0, Bundle p1) {
        Intrinsics.i(p0, "p0");
        Intrinsics.i(p1, "p1");
        this.d.onActivitySaveInstanceState(p0, p1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity p0) {
        Intrinsics.i(p0, "p0");
        this.d.onActivityStarted(p0);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity p0) {
        Intrinsics.i(p0, "p0");
        this.d.onActivityStopped(p0);
    }
}
