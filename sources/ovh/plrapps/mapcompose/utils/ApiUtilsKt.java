package ovh.plrapps.mapcompose.utils;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"mapcompose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ApiUtilsKt {
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        if (r11 != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a5 -> B:31:0x00a8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(int r7, long r8, kotlin.jvm.functions.Function1 r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            boolean r0 = r11 instanceof ovh.plrapps.mapcompose.utils.ApiUtilsKt$withRetry$1
            if (r0 == 0) goto L13
            r0 = r11
            ovh.plrapps.mapcompose.utils.ApiUtilsKt$withRetry$1 r0 = (ovh.plrapps.mapcompose.utils.ApiUtilsKt$withRetry$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            ovh.plrapps.mapcompose.utils.ApiUtilsKt$withRetry$1 r0 = new ovh.plrapps.mapcompose.utils.ApiUtilsKt$withRetry$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.t
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.u
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L5c
            if (r2 == r5) goto L4e
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            int r7 = r0.q
            long r8 = r0.r
            int r10 = r0.p
            kotlin.jvm.functions.Function1 r2 = r0.s
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.ResultKt.b(r11)
            goto La8
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            int r7 = r0.q
            long r8 = r0.r
            int r10 = r0.p
            kotlin.jvm.functions.Function1 r2 = r0.s
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.ResultKt.b(r11)
            goto L94
        L4e:
            int r7 = r0.q
            long r8 = r0.r
            int r10 = r0.p
            kotlin.jvm.functions.Function1 r2 = r0.s
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.ResultKt.b(r11)
            goto L76
        L5c:
            kotlin.ResultKt.b(r11)
            r0.s = r10
            r0.p = r7
            r0.r = r8
            r11 = 0
            r0.q = r11
            r0.u = r5
            java.lang.Object r2 = r10.invoke(r0)
            if (r2 != r1) goto L71
            goto La7
        L71:
            r6 = r10
            r10 = r7
            r7 = r11
            r11 = r2
            r2 = r6
        L76:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
        L7c:
            if (r11 != 0) goto Lb0
            if (r7 >= r10) goto Lb0
            r11 = r2
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            r0.s = r11
            r0.p = r10
            r0.r = r8
            r0.q = r7
            r0.u = r4
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.b(r8, r0)
            if (r11 != r1) goto L94
            goto La7
        L94:
            r11 = r2
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            r0.s = r11
            r0.p = r10
            r0.r = r8
            r0.q = r7
            r0.u = r3
            java.lang.Object r11 = r2.invoke(r0)
            if (r11 != r1) goto La8
        La7:
            return r1
        La8:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            int r7 = r7 + r5
            goto L7c
        Lb0:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.utils.ApiUtilsKt.a(int, long, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
