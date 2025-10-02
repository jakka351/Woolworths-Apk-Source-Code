package au.com.woolworths.foundation.shop.instore.presence.util;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-presence_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class DurationKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(long r10, kotlin.jvm.functions.Function1 r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            boolean r0 = r13 instanceof au.com.woolworths.foundation.shop.instore.presence.util.DurationKt$coerceDuration$1
            if (r0 == 0) goto L13
            r0 = r13
            au.com.woolworths.foundation.shop.instore.presence.util.DurationKt$coerceDuration$1 r0 = (au.com.woolworths.foundation.shop.instore.presence.util.DurationKt$coerceDuration$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            au.com.woolworths.foundation.shop.instore.presence.util.DurationKt$coerceDuration$1 r0 = new au.com.woolworths.foundation.shop.instore.presence.util.DurationKt$coerceDuration$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.t
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.jvm.internal.Ref$ObjectRef r10 = r0.r
            kotlin.ResultKt.b(r13)
            goto L7e
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            long r10 = r0.q
            long r4 = r0.p
            kotlin.jvm.internal.Ref$ObjectRef r12 = r0.s
            kotlin.jvm.internal.Ref$ObjectRef r2 = r0.r
            kotlin.ResultKt.b(r13)
            r8 = r2
            r2 = r13
            r13 = r8
            goto L61
        L43:
            kotlin.jvm.internal.Ref$ObjectRef r13 = androidx.camera.core.impl.b.x(r13)
            long r5 = java.lang.System.currentTimeMillis()
            r0.r = r13
            r0.s = r13
            r0.p = r10
            r0.q = r5
            r0.u = r4
            java.lang.Object r12 = r12.invoke(r0)
            if (r12 != r1) goto L5c
            goto L7c
        L5c:
            r8 = r5
            r4 = r10
            r10 = r8
            r2 = r12
            r12 = r13
        L61:
            r12.d = r2
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r10
            long r4 = r4 - r6
            r10 = 0
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L7f
            r0.r = r13
            r10 = 0
            r0.s = r10
            r0.u = r3
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.b(r4, r0)
            if (r10 != r1) goto L7d
        L7c:
            return r1
        L7d:
            r10 = r13
        L7e:
            r13 = r10
        L7f:
            java.lang.Object r10 = r13.d
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.shop.instore.presence.util.DurationKt.a(long, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
