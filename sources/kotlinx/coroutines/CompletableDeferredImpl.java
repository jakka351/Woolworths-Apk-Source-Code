package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause1Impl;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CompletableDeferredImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/CompletableDeferred;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class CompletableDeferredImpl<T> extends JobSupport implements CompletableDeferred<T> {
    @Override // kotlinx.coroutines.Deferred
    public final Object await(Continuation continuation) throws Throwable {
        Object objB = B(continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objB;
    }

    @Override // kotlinx.coroutines.CompletableDeferred
    public final boolean g(Throwable th) {
        return Z(new CompletedExceptionally(th, false));
    }

    @Override // kotlinx.coroutines.Deferred
    public final SelectClause1 getOnAwait() {
        JobSupport$onAwaitInternal$1 jobSupport$onAwaitInternal$1 = JobSupport$onAwaitInternal$1.d;
        TypeIntrinsics.d(3, jobSupport$onAwaitInternal$1);
        JobSupport$onAwaitInternal$2 jobSupport$onAwaitInternal$2 = JobSupport$onAwaitInternal$2.d;
        TypeIntrinsics.d(3, jobSupport$onAwaitInternal$2);
        return new SelectClause1Impl(this, jobSupport$onAwaitInternal$1, jobSupport$onAwaitInternal$2);
    }
}
