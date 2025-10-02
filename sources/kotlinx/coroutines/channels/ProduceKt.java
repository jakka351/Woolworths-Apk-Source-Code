package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ProduceKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(kotlinx.coroutines.channels.ProducerScope r4, kotlin.jvm.functions.Function0 r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = (kotlinx.coroutines.channels.ProduceKt$awaitClose$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            kotlin.jvm.functions.Function0 r4 = r0.q
            r5 = r4
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L2c
            goto L69
        L2c:
            r4 = move-exception
            goto L6f
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.ResultKt.b(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.getH()
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key.d
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r2)
            if (r6 != r4) goto L73
            r0.p = r4     // Catch: java.lang.Throwable -> L2c
            r6 = r5
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6     // Catch: java.lang.Throwable -> L2c
            r0.q = r6     // Catch: java.lang.Throwable -> L2c
            r0.s = r3     // Catch: java.lang.Throwable -> L2c
            kotlinx.coroutines.CancellableContinuationImpl r6 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L2c
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r0)     // Catch: java.lang.Throwable -> L2c
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L2c
            r6.o()     // Catch: java.lang.Throwable -> L2c
            kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1     // Catch: java.lang.Throwable -> L2c
            r0.<init>()     // Catch: java.lang.Throwable -> L2c
            r4.j(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r4 = r6.n()     // Catch: java.lang.Throwable -> L2c
            if (r4 != r1) goto L69
            return r1
        L69:
            r5.invoke()
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        L6f:
            r5.invoke()
            throw r4
        L73:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ProduceKt.a(kotlinx.coroutines.channels.ProducerScope, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final ReceiveChannel b(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, Function2 function2) {
        ProducerCoroutine producerCoroutine = new ProducerCoroutine(CoroutineContextKt.b(coroutineScope, coroutineContext), ChannelKt.a(i, 4, bufferOverflow));
        producerCoroutine.p0(coroutineStart, producerCoroutine, function2);
        return producerCoroutine;
    }

    public static ReceiveChannel c(CoroutineScope coroutineScope, int i, Function2 function2, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        BufferOverflow bufferOverflow = BufferOverflow.d;
        CoroutineStart coroutineStart = CoroutineStart.d;
        return b(coroutineScope, EmptyCoroutineContext.d, i, bufferOverflow, coroutineStart, function2);
    }
}
