package coil.request;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/BaseRequestDelegate;", "Lcoil/request/RequestDelegate;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BaseRequestDelegate implements RequestDelegate {
    public final Lifecycle d;
    public final Job e;

    public BaseRequestDelegate(Lifecycle lifecycle, Job job) {
        this.d = lifecycle;
        this.e = job;
    }

    @Override // coil.request.RequestDelegate
    public final void complete() {
        this.d.c(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.e.cancel((CancellationException) null);
    }

    @Override // coil.request.RequestDelegate
    public final void start() {
        this.d.a(this);
    }
}
