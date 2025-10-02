package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ReceiveChannel;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {67}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes.dex */
final class GlobalSnapshotManager$ensureStarted$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public ReceiveChannel p;
    public ChannelIterator q;
    public int r;
    public final /* synthetic */ BufferedChannel s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$1(BufferedChannel bufferedChannel, Continuation continuation) {
        super(2, continuation);
        this.s = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GlobalSnapshotManager$ensureStarted$1(this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GlobalSnapshotManager$ensureStarted$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: all -> 0x0011, TRY_LEAVE, TryCatch #0 {all -> 0x0011, blocks: (B:6:0x000d, B:17:0x0032, B:19:0x003a, B:14:0x0025, B:13:0x0020), top: B:27:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002f -> B:17:0x0032). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r5.r
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            kotlinx.coroutines.channels.ChannelIterator r1 = r5.q
            kotlinx.coroutines.channels.ReceiveChannel r3 = r5.p
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L11
            goto L32
        L11:
            r6 = move-exception
            goto L51
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            kotlin.ResultKt.b(r6)
            kotlinx.coroutines.channels.BufferedChannel r3 = r5.s
            kotlinx.coroutines.channels.ChannelIterator r6 = r3.iterator()     // Catch: java.lang.Throwable -> L11
            r1 = r6
        L25:
            r5.p = r3     // Catch: java.lang.Throwable -> L11
            r5.q = r1     // Catch: java.lang.Throwable -> L11
            r5.r = r2     // Catch: java.lang.Throwable -> L11
            java.lang.Object r6 = r1.b(r5)     // Catch: java.lang.Throwable -> L11
            if (r6 != r0) goto L32
            return r0
        L32:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L11
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L4a
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L11
            kotlin.Unit r6 = (kotlin.Unit) r6     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.atomic.AtomicBoolean r6 = androidx.compose.ui.platform.GlobalSnapshotManager.b     // Catch: java.lang.Throwable -> L11
            r4 = 0
            r6.set(r4)     // Catch: java.lang.Throwable -> L11
            androidx.compose.runtime.snapshots.Snapshot.Companion.f()     // Catch: java.lang.Throwable -> L11
            goto L25
        L4a:
            r6 = 0
            r3.cancel(r6)
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        L51:
            throw r6     // Catch: java.lang.Throwable -> L52
        L52:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.a(r3, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
