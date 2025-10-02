package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.SendChannel;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/SimpleProducerScopeImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/SimpleProducerScope;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/channels/SendChannel;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SimpleProducerScopeImpl<T> implements SimpleProducerScope<T>, CoroutineScope, SendChannel<T> {
    public final BufferedChannel d;
    public final /* synthetic */ CoroutineScope e;

    public SimpleProducerScopeImpl(CoroutineScope scope, BufferedChannel bufferedChannel) {
        Intrinsics.h(scope, "scope");
        this.d = bufferedChannel;
        this.e = scope;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* renamed from: getCoroutineContext */
    public final CoroutineContext getE() {
        return this.e.getE();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final void j(Function1 function1) {
        this.d.j(function1);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final Object k(Object obj) {
        return this.d.k(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.paging.SimpleProducerScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(kotlin.jvm.functions.Function0 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.paging.SimpleProducerScopeImpl$awaitClose$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.paging.SimpleProducerScopeImpl$awaitClose$1 r0 = (androidx.paging.SimpleProducerScopeImpl$awaitClose$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            androidx.paging.SimpleProducerScopeImpl$awaitClose$1 r0 = new androidx.paging.SimpleProducerScopeImpl$awaitClose$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.jvm.internal.Lambda r5 = r0.p
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L2b
            goto L6c
        L2b:
            r6 = move-exception
            goto L7a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r6)
            kotlinx.coroutines.CoroutineScope r6 = r4.e     // Catch: java.lang.Throwable -> L2b
            kotlin.coroutines.CoroutineContext r6 = r6.getE()     // Catch: java.lang.Throwable -> L2b
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key.d     // Catch: java.lang.Throwable -> L2b
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r2)     // Catch: java.lang.Throwable -> L2b
            if (r6 == 0) goto L72
            kotlinx.coroutines.Job r6 = (kotlinx.coroutines.Job) r6     // Catch: java.lang.Throwable -> L2b
            r2 = r5
            kotlin.jvm.internal.Lambda r2 = (kotlin.jvm.internal.Lambda) r2     // Catch: java.lang.Throwable -> L2b
            r0.p = r2     // Catch: java.lang.Throwable -> L2b
            r0.q = r6     // Catch: java.lang.Throwable -> L2b
            r0.t = r3     // Catch: java.lang.Throwable -> L2b
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L2b
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r0)     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L2b
            r2.o()     // Catch: java.lang.Throwable -> L2b
            androidx.paging.SimpleProducerScopeImpl$awaitClose$2$1 r0 = new androidx.paging.SimpleProducerScopeImpl$awaitClose$2$1     // Catch: java.lang.Throwable -> L2b
            r0.<init>()     // Catch: java.lang.Throwable -> L2b
            r6.invokeOnCompletion(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = r2.n()     // Catch: java.lang.Throwable -> L2b
            if (r6 != r1) goto L6c
            return r1
        L6c:
            r5.invoke()
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        L72:
            java.lang.String r6 = "Internal error, context should have a job."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L2b
            throw r0     // Catch: java.lang.Throwable -> L2b
        L7a:
            r5.invoke()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SimpleProducerScopeImpl.v(kotlin.jvm.functions.Function0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean y(Throwable th) {
        return this.d.l(null, false);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final Object z(Object obj, Continuation continuation) {
        return this.d.z(obj, continuation);
    }
}
