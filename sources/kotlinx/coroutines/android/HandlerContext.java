package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import com.woolworths.scanlibrary.ui.splash.d;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.NonDisposableHandle;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/android/HandlerContext;", "Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/Delay;", "kotlinx-coroutines-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class HandlerContext extends HandlerDispatcher implements Delay {
    public static final /* synthetic */ int j = 0;
    public final Handler f;
    public final String g;
    public final boolean h;
    public final HandlerContext i;

    public HandlerContext(Handler handler, String str, boolean z) {
        this.f = handler;
        this.g = str;
        this.h = z;
        this.i = z ? this : new HandlerContext(handler, str, true);
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public final MainCoroutineDispatcher T() {
        return this.i;
    }

    public final void U(CoroutineContext coroutineContext, Runnable runnable) {
        JobKt.b(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        DefaultIoScheduler.f.k(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.Delay
    public final void c(long j2, CancellableContinuationImpl cancellableContinuationImpl) {
        com.auth0.android.request.internal.a aVar = new com.auth0.android.request.internal.a(9, cancellableContinuationImpl, this);
        if (j2 > 4611686018427387903L) {
            j2 = 4611686018427387903L;
        }
        if (this.f.postDelayed(aVar, j2)) {
            cancellableContinuationImpl.r(new d(2, this, aVar));
        } else {
            U(cancellableContinuationImpl.h, aVar);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HandlerContext)) {
            return false;
        }
        HandlerContext handlerContext = (HandlerContext) obj;
        return handlerContext.f == this.f && handlerContext.h == this.h;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f) ^ (this.h ? 1231 : 1237);
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.Delay
    public final DisposableHandle j(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        if (j2 > 4611686018427387903L) {
            j2 = 4611686018427387903L;
        }
        if (this.f.postDelayed(runnable, j2)) {
            return new androidx.datastore.core.a(1, this, runnable);
        }
        U(coroutineContext, runnable);
        return NonDisposableHandle.d;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void k(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f.post(runnable)) {
            return;
        }
        U(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        MainCoroutineDispatcher mainCoroutineDispatcherT;
        String str;
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.f24726a;
        if (this == mainCoroutineDispatcher) {
            str = "Dispatchers.Main";
        } else {
            try {
                mainCoroutineDispatcherT = mainCoroutineDispatcher.T();
            } catch (UnsupportedOperationException unused) {
                mainCoroutineDispatcherT = null;
            }
            str = this == mainCoroutineDispatcherT ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.g;
        if (string == null) {
            string = this.f.toString();
        }
        return this.h ? YU.a.g(string, ".immediate") : string;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean v(CoroutineContext coroutineContext) {
        return (this.h && Intrinsics.c(Looper.myLooper(), this.f.getLooper())) ? false : true;
    }

    public HandlerContext(Handler handler) {
        this(handler, null, false);
    }
}
