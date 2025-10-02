package au.com.woolworths.graphql.subscriptions.sse.channel;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sse-protocol"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChannelFactoryKt {
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[ADDED_TO_REGION, EDGE_INSN: B:26:0x0072->B:24:0x0072 BREAK  A[LOOP:0: B:21:0x0067->B:30:?], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005d -> B:20:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory.SideChannel r6, int r7, long r8, kotlin.jvm.functions.Function1 r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            boolean r0 = r11 instanceof au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactoryKt$sendWithRetry$1
            if (r0 == 0) goto L13
            r0 = r11
            au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactoryKt$sendWithRetry$1 r0 = (au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactoryKt$sendWithRetry$1) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactoryKt$sendWithRetry$1 r0 = new au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactoryKt$sendWithRetry$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.u
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r6 = r0.s
            long r7 = r0.t
            int r9 = r0.r
            kotlin.jvm.functions.Function1 r10 = r0.q
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory$SideChannel r2 = r0.p
            kotlin.ResultKt.b(r11)
            goto L62
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.ResultKt.b(r11)
            r11 = 0
            r4 = r7
            r7 = r6
            r6 = r11
            r11 = r10
            r9 = r8
            r8 = r4
        L45:
            if (r6 <= 0) goto L67
            r0.p = r7
            r2 = r11
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r0.q = r2
            r0.r = r8
            r0.t = r9
            r0.s = r6
            r0.v = r3
            java.lang.Object r2 = kotlinx.coroutines.DelayKt.b(r9, r0)
            if (r2 != r1) goto L5d
            return r1
        L5d:
            r2 = r7
            r4 = r9
            r9 = r8
            r7 = r4
            r10 = r11
        L62:
            r11 = r10
            r4 = r7
            r8 = r9
            r9 = r4
            r7 = r2
        L67:
            java.lang.Object r2 = r11.invoke(r7)
            au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage$Response r2 = (au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage.Response) r2
            int r6 = r6 + r3
            if (r2 != 0) goto L72
            if (r6 <= r8) goto L45
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactoryKt.a(au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory$SideChannel, int, long, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
