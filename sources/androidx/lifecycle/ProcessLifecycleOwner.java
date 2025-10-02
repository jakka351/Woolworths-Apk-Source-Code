package androidx.lifecycle;

import android.app.Activity;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "Companion", "Api29Impl", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleOwner implements LifecycleOwner {
    public static final ProcessLifecycleOwner l = new ProcessLifecycleOwner();
    public int d;
    public int e;
    public Handler h;
    public boolean f = true;
    public boolean g = true;
    public final LifecycleRegistry i = new LifecycleRegistry(this, true);
    public final androidx.compose.material.ripple.a j = new androidx.compose.material.ripple.a(this, 3);
    public final ProcessLifecycleOwner$initializationListener$1 k = new ProcessLifecycleOwner$initializationListener$1(this);

    @RequiresApi
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner$Api29Impl;", "", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Api29Impl {
        public static final void a(Activity activity, ProcessLifecycleOwner$attach$1$onActivityPreCreated$1 processLifecycleOwner$attach$1$onActivityPreCreated$1) {
            activity.registerActivityLifecycleCallbacks(processLifecycleOwner$attach$1$onActivityPreCreated$1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner$Companion;", "", "Landroidx/lifecycle/ProcessLifecycleOwner;", "newInstance", "Landroidx/lifecycle/ProcessLifecycleOwner;", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public final void a() {
        int i = this.e + 1;
        this.e = i;
        if (i == 1) {
            if (this.f) {
                this.i.f(Lifecycle.Event.ON_RESUME);
                this.f = false;
            } else {
                Handler handler = this.h;
                Intrinsics.e(handler);
                handler.removeCallbacks(this.j);
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* renamed from: getLifecycle */
    public final Lifecycle getD() {
        return this.i;
    }
}
