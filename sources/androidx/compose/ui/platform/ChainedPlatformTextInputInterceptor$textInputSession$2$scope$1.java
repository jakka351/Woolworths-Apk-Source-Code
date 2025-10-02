package androidx.compose.ui.platform;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/platform/ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 implements PlatformTextInputSessionScope {
    public final /* synthetic */ PlatformTextInputSessionScope d;
    public final /* synthetic */ PlatformTextInputSessionScope e;
    public final /* synthetic */ AtomicReference f;
    public final /* synthetic */ ChainedPlatformTextInputInterceptor g;

    public ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1(PlatformTextInputSessionScope platformTextInputSessionScope, AtomicReference atomicReference, ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor) {
        this.e = platformTextInputSessionScope;
        this.f = atomicReference;
        this.g = chainedPlatformTextInputInterceptor;
        this.d = platformTextInputSessionScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.compose.ui.platform.PlatformTextInputMethodRequest r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 r0 = (androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 r0 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2b:
            kotlin.ResultKt.b(r8)
            goto L49
        L2f:
            kotlin.ResultKt.b(r8)
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 r8 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3
            androidx.compose.ui.platform.PlatformTextInputSessionScope r2 = r6.e
            r4 = 0
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r5 = r6.g
            r8.<init>(r5, r7, r2, r4)
            r0.r = r3
            java.util.concurrent.atomic.AtomicReference r7 = r6.f
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2 r2 = androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2.h
            java.lang.Object r7 = androidx.compose.ui.SessionMutex.b(r7, r2, r8, r0)
            if (r7 != r1) goto L49
            return
        L49:
            kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1.a(androidx.compose.ui.platform.PlatformTextInputMethodRequest, kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* renamed from: getCoroutineContext */
    public final CoroutineContext getE() {
        return this.d.getE();
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    public final View getView() {
        return this.d.getView();
    }
}
