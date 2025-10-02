package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.selects.SelectInstance;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl;", "E", "Lkotlinx/coroutines/channels/BufferedChannel;", "Lkotlinx/coroutines/channels/BroadcastChannel;", "SubscriberBuffered", "SubscriberConflated", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BroadcastChannelImpl<E> extends BufferedChannel<E> implements BroadcastChannel<E> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered;", "Lkotlinx/coroutines/channels/BufferedChannel;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public final class SubscriberBuffered extends BufferedChannel<E> {
        @Override // kotlinx.coroutines.channels.BufferedChannel
        public final void i(CancellationException cancellationException) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberConflated;", "Lkotlinx/coroutines/channels/ConflatedBufferedChannel;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class SubscriberConflated extends ConflatedBufferedChannel<E> {
        @Override // kotlinx.coroutines.channels.BufferedChannel
        public final void i(CancellationException cancellationException) {
            throw null;
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final void Q(SelectInstance selectInstance, Object obj) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final void i(CancellationException cancellationException) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public final Object k(Object obj) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public final boolean r() {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final String toString() {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public final boolean y(Throwable th) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r5 = r6 instanceof kotlinx.coroutines.channels.BroadcastChannelImpl$send$1
            if (r5 == 0) goto L13
            r5 = r6
            kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 r5 = (kotlinx.coroutines.channels.BroadcastChannelImpl$send$1) r5
            int r0 = r5.s
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.s = r0
            goto L18
        L13:
            kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 r5 = new kotlinx.coroutines.channels.BroadcastChannelImpl$send$1
            r5.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r5.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r5.s
            r2 = 0
            if (r1 == 0) goto L54
            r3 = 1
            if (r1 != r3) goto L4c
            java.util.Iterator r1 = r5.p
            kotlin.ResultKt.b(r6)
        L29:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L4b
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L48
            java.lang.Object r6 = r1.next()
            kotlinx.coroutines.channels.BufferedChannel r6 = (kotlinx.coroutines.channels.BufferedChannel) r6
            r5.p = r1
            r5.s = r3
            java.lang.Object r6 = r6.S(r5)
            if (r6 != r0) goto L29
            return r0
        L48:
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        L4b:
            throw r2
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L54:
            kotlin.ResultKt.b(r6)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastChannelImpl.z(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
