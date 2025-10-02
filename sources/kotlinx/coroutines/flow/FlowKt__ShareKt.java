package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
/* loaded from: classes.dex */
final /* synthetic */ class FlowKt__ShareKt {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlinx.coroutines.flow.SharingConfig a(kotlinx.coroutines.flow.Flow r7, int r8) {
        /*
            kotlinx.coroutines.channels.Channel$Factory r0 = kotlinx.coroutines.channels.Channel.w3
            r0.getClass()
            int r0 = kotlinx.coroutines.channels.Channel.Factory.b
            if (r8 >= r0) goto La
            goto Lb
        La:
            r0 = r8
        Lb:
            int r0 = r0 - r8
            boolean r1 = r7 instanceof kotlinx.coroutines.flow.internal.ChannelFlow
            if (r1 == 0) goto L3b
            r1 = r7
            kotlinx.coroutines.flow.internal.ChannelFlow r1 = (kotlinx.coroutines.flow.internal.ChannelFlow) r1
            kotlinx.coroutines.channels.BufferOverflow r2 = r1.f
            kotlinx.coroutines.flow.Flow r3 = r1.j()
            if (r3 == 0) goto L3b
            kotlinx.coroutines.flow.SharingConfig r7 = new kotlinx.coroutines.flow.SharingConfig
            int r4 = r1.e
            r5 = -3
            if (r4 == r5) goto L29
            r5 = -2
            if (r4 == r5) goto L29
            if (r4 == 0) goto L29
            r0 = r4
            goto L35
        L29:
            kotlinx.coroutines.channels.BufferOverflow r5 = kotlinx.coroutines.channels.BufferOverflow.d
            r6 = 0
            if (r2 != r5) goto L32
            if (r4 != 0) goto L35
        L30:
            r0 = r6
            goto L35
        L32:
            if (r8 != 0) goto L30
            r0 = 1
        L35:
            kotlin.coroutines.CoroutineContext r8 = r1.d
            r7.<init>(r0, r8, r2, r3)
            return r7
        L3b:
            kotlinx.coroutines.flow.SharingConfig r8 = new kotlinx.coroutines.flow.SharingConfig
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.d
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.d
            r8.<init>(r0, r2, r1, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt.a(kotlinx.coroutines.flow.Flow, int):kotlinx.coroutines.flow.SharingConfig");
    }
}
