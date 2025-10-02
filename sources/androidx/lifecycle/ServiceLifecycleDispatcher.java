package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/ServiceLifecycleDispatcher;", "", "DispatchRunnable", "lifecycle-service_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class ServiceLifecycleDispatcher {

    /* renamed from: a, reason: collision with root package name */
    public final LifecycleRegistry f2800a;
    public final Handler b = new Handler();
    public DispatchRunnable c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/ServiceLifecycleDispatcher$DispatchRunnable;", "Ljava/lang/Runnable;", "lifecycle-service_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DispatchRunnable implements Runnable {
        public final LifecycleRegistry d;
        public final Lifecycle.Event e;
        public boolean f;

        public DispatchRunnable(LifecycleRegistry registry, Lifecycle.Event event) {
            Intrinsics.h(registry, "registry");
            Intrinsics.h(event, "event");
            this.d = registry;
            this.e = event;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f) {
                return;
            }
            this.d.f(this.e);
            this.f = true;
        }
    }

    public ServiceLifecycleDispatcher(LifecycleService lifecycleService) {
        this.f2800a = new LifecycleRegistry(lifecycleService, true);
    }

    public final void a(Lifecycle.Event event) {
        DispatchRunnable dispatchRunnable = this.c;
        if (dispatchRunnable != null) {
            dispatchRunnable.run();
        }
        DispatchRunnable dispatchRunnable2 = new DispatchRunnable(this.f2800a, event);
        this.c = dispatchRunnable2;
        this.b.postAtFrontOfQueue(dispatchRunnable2);
    }
}
