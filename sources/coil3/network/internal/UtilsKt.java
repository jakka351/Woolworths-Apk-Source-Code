package coil3.network.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-network-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class UtilsKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(coil3.network.NetworkResponseBody r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof coil3.network.internal.UtilsKt$readBuffer$1
            if (r0 == 0) goto L13
            r0 = r5
            coil3.network.internal.UtilsKt$readBuffer$1 r0 = (coil3.network.internal.UtilsKt$readBuffer$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            coil3.network.internal.UtilsKt$readBuffer$1 r0 = new coil3.network.internal.UtilsKt$readBuffer$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            okio.Buffer r4 = r0.q
            coil3.network.NetworkResponseBody r0 = r0.p
            kotlin.ResultKt.b(r5)     // Catch: java.lang.Throwable -> L2b
            goto L4d
        L2b:
            r4 = move-exception
            goto L57
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.ResultKt.b(r5)
            okio.Buffer r5 = new okio.Buffer     // Catch: java.lang.Throwable -> L55
            r5.<init>()     // Catch: java.lang.Throwable -> L55
            r0.p = r4     // Catch: java.lang.Throwable -> L55
            r0.q = r5     // Catch: java.lang.Throwable -> L55
            r0.s = r3     // Catch: java.lang.Throwable -> L55
            r4.L(r5)     // Catch: java.lang.Throwable -> L55
            kotlin.Unit r0 = kotlin.Unit.f24250a     // Catch: java.lang.Throwable -> L55
            if (r0 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
            r4 = r5
        L4d:
            r5 = 0
            kotlin.jdk7.AutoCloseableKt.a(r0, r5)
            return r4
        L52:
            r0 = r4
            r4 = r5
            goto L57
        L55:
            r5 = move-exception
            goto L52
        L57:
            throw r4     // Catch: java.lang.Throwable -> L58
        L58:
            r5 = move-exception
            kotlin.jdk7.AutoCloseableKt.a(r0, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.internal.UtilsKt.a(coil3.network.NetworkResponseBody, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
