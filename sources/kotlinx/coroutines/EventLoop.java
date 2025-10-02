package kotlinx.coroutines;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/EventLoop;", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class EventLoop extends CoroutineDispatcher {
    public static final /* synthetic */ int i = 0;
    public long f;
    public boolean g;
    public ArrayDeque h;

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher A(int i2) {
        LimitedDispatcherKt.a(i2);
        return this;
    }

    public final void T(boolean z) {
        long j = this.f - (z ? llqqqql.a00610061aaaa : 1L);
        this.f = j;
        if (j <= 0 && this.g) {
            shutdown();
        }
    }

    public final void U(DispatchedTask dispatchedTask) {
        ArrayDeque arrayDeque = this.h;
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque();
            this.h = arrayDeque;
        }
        arrayDeque.addLast(dispatchedTask);
    }

    public final void Y(boolean z) {
        this.f = (z ? llqqqql.a00610061aaaa : 1L) + this.f;
        if (z) {
            return;
        }
        this.g = true;
    }

    public long b0() {
        return !d0() ? Long.MAX_VALUE : 0L;
    }

    public final boolean d0() {
        ArrayDeque arrayDeque = this.h;
        if (arrayDeque == null) {
            return false;
        }
        DispatchedTask dispatchedTask = (DispatchedTask) (arrayDeque.isEmpty() ? null : arrayDeque.removeFirst());
        if (dispatchedTask == null) {
            return false;
        }
        dispatchedTask.run();
        return true;
    }

    public void shutdown() {
    }
}
