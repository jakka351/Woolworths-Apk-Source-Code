package androidx.compose.ui.platform;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class ChainedPlatformTextInputInterceptor {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.compose.ui.node.Owner r5, kotlin.jvm.functions.Function2 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1 r0 = (androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1 r0 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r0.r
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 == r2) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            kotlin.KotlinNothingValueException r5 = android.support.v4.media.session.a.v(r7)
            throw r5
        L30:
            kotlin.ResultKt.b(r7)
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2 r7 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2
            r1 = 0
            r7.<init>(r6, r4, r1)
            r0.r = r2
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.b(r5, r1, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor.a(androidx.compose.ui.node.Owner, kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }
}
