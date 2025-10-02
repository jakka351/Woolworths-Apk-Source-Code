package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
@SourceDebugExtension
/* loaded from: classes7.dex */
final /* synthetic */ class ChannelsKt__DeprecatedKt {
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        if (r2.z(r8, r0) == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:13:0x002c, B:28:0x0062, B:30:0x006a, B:20:0x0043), top: B:43:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.channels.ProducerScope] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007a -> B:14:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(kotlinx.coroutines.channels.ReceiveChannel r6, kotlinx.coroutines.channels.ProducerScope r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            kotlinx.coroutines.channels.ChannelIterator r6 = r0.r
            kotlinx.coroutines.channels.ReceiveChannel r7 = r0.q
            kotlinx.coroutines.channels.SendChannel r2 = r0.p
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L33
        L2f:
            r8 = r6
            r6 = r7
            r7 = r2
            goto L4e
        L33:
            r6 = move-exception
            goto L86
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            kotlinx.coroutines.channels.ChannelIterator r6 = r0.r
            kotlinx.coroutines.channels.ReceiveChannel r7 = r0.q
            kotlinx.coroutines.channels.SendChannel r2 = r0.p
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L33
            goto L62
        L47:
            kotlin.ResultKt.b(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L82
        L4e:
            r0.p = r7     // Catch: java.lang.Throwable -> L82
            r0.q = r6     // Catch: java.lang.Throwable -> L82
            r0.r = r8     // Catch: java.lang.Throwable -> L82
            r0.t = r4     // Catch: java.lang.Throwable -> L82
            java.lang.Object r2 = r8.b(r0)     // Catch: java.lang.Throwable -> L82
            if (r2 != r1) goto L5d
            goto L7c
        L5d:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r2
            r2 = r5
        L62:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L33
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto L7d
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L33
            r0.p = r2     // Catch: java.lang.Throwable -> L33
            r0.q = r7     // Catch: java.lang.Throwable -> L33
            r0.r = r6     // Catch: java.lang.Throwable -> L33
            r0.t = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r8 = r2.z(r8, r0)     // Catch: java.lang.Throwable -> L33
            if (r8 != r1) goto L2f
        L7c:
            return r1
        L7d:
            r6 = 0
            r7.cancel(r6)
            return r2
        L82:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L86:
            throw r6     // Catch: java.lang.Throwable -> L87
        L87:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.a(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.a(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.ProducerScope, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
