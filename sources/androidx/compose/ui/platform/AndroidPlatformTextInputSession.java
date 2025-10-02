package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.input.TextInputService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/AndroidPlatformTextInputSession;", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Lkotlinx/coroutines/CoroutineScope;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidPlatformTextInputSession implements PlatformTextInputSessionScope, CoroutineScope {
    public final View d;
    public final TextInputService e;
    public final CoroutineScope f;
    public final AtomicReference g = new AtomicReference(null);

    public AndroidPlatformTextInputSession(View view, TextInputService textInputService, CoroutineScope coroutineScope) {
        this.d = view;
        this.e = textInputService;
        this.f = coroutineScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(final androidx.compose.ui.platform.PlatformTextInputMethodRequest r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = (androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            kotlin.ResultKt.b(r6)
            goto L48
        L2f:
            kotlin.ResultKt.b(r6)
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2 r6 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2
            r6.<init>()
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3 r5 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3
            r2 = 0
            r5.<init>(r4, r2)
            r0.r = r3
            java.util.concurrent.atomic.AtomicReference r2 = r4.g
            java.lang.Object r5 = androidx.compose.ui.SessionMutex.b(r2, r6, r5, r0)
            if (r5 != r1) goto L48
            return
        L48:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidPlatformTextInputSession.a(androidx.compose.ui.platform.PlatformTextInputMethodRequest, kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* renamed from: getCoroutineContext */
    public final CoroutineContext getE() {
        return this.f.getE();
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    /* renamed from: getView, reason: from getter */
    public final View getD() {
        return this.d;
    }
}
