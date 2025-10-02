package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListenableFutureKt {
    public static ListenableFuture a(final CoroutineContext context, final Function2 function2) {
        final CoroutineStart coroutineStart = CoroutineStart.d;
        Intrinsics.h(context, "context");
        return CallbackToFutureAdapter.a(new CallbackToFutureAdapter.Resolver(coroutineStart, function2) { // from class: androidx.work.a
            public final /* synthetic */ CoroutineStart e;
            public final /* synthetic */ SuspendLambda f;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f = (SuspendLambda) function2;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                Job.Key key = Job.Key.d;
                CoroutineContext coroutineContext = this.d;
                completer.a(new androidx.compose.material.ripple.a((Job) coroutineContext.get(key), 4), DirectExecutor.d);
                return BuildersKt.c(CoroutineScopeKt.a(coroutineContext), null, this.e, new ListenableFutureKt$launchFuture$1$2(this.f, completer, null), 1);
            }
        });
    }
}
