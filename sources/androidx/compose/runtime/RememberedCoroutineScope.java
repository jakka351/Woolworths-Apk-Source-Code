package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/RememberedCoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/runtime/RememberObserver;", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RememberedCoroutineScope implements CoroutineScope, RememberObserver {
    public static final CoroutineContext g = new CancelledCoroutineContext();
    public final CoroutineContext d;
    public final RememberedCoroutineScope e = this;
    public volatile CoroutineContext f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/RememberedCoroutineScope$Companion;", "", "Lkotlin/coroutines/CoroutineContext;", "CancelledCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public RememberedCoroutineScope(CoroutineContext coroutineContext) {
        this.d = coroutineContext;
    }

    public final void a() {
        synchronized (this.e) {
            try {
                CoroutineContext coroutineContext = this.f;
                if (coroutineContext == null) {
                    this.f = g;
                } else {
                    JobKt.b(coroutineContext, new ForgottenCoroutineScopeException());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void c() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void g() {
        a();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* renamed from: getCoroutineContext */
    public final CoroutineContext getE() {
        CoroutineContext coroutineContextPlus;
        CoroutineContext coroutineContext = this.f;
        if (coroutineContext == null || coroutineContext == g) {
            synchronized (this.e) {
                try {
                    coroutineContextPlus = this.f;
                    if (coroutineContextPlus == null) {
                        CoroutineContext coroutineContext2 = this.d;
                        coroutineContextPlus = coroutineContext2.plus(new JobImpl((Job) coroutineContext2.get(Job.Key.d))).plus(EmptyCoroutineContext.d);
                    } else if (coroutineContextPlus == g) {
                        CoroutineContext coroutineContext3 = this.d;
                        JobImpl jobImpl = new JobImpl((Job) coroutineContext3.get(Job.Key.d));
                        jobImpl.E(new ForgottenCoroutineScopeException());
                        coroutineContextPlus = coroutineContext3.plus(jobImpl).plus(EmptyCoroutineContext.d);
                    }
                    this.f = coroutineContextPlus;
                } catch (Throwable th) {
                    throw th;
                }
            }
            coroutineContext = coroutineContextPlus;
        }
        Intrinsics.e(coroutineContext);
        return coroutineContext;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void i() {
        a();
    }
}
