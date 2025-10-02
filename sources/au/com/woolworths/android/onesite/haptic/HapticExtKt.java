package au.com.woolworths.android.onesite.haptic;

import android.app.Activity;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HapticExtKt {
    public static final void a(ComponentActivity componentActivity) {
        BuildersKt.c(LifecycleOwnerKt.a(componentActivity), null, null, new HapticExtKt$performHapticFeedbackFailure$1(componentActivity, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007d -> B:27:0x0080). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(android.app.Activity r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof au.com.woolworths.android.onesite.haptic.HapticExtKt$performHapticFeedbackFailureAsync$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.android.onesite.haptic.HapticExtKt$performHapticFeedbackFailureAsync$1 r0 = (au.com.woolworths.android.onesite.haptic.HapticExtKt$performHapticFeedbackFailureAsync$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            au.com.woolworths.android.onesite.haptic.HapticExtKt$performHapticFeedbackFailureAsync$1 r0 = new au.com.woolworths.android.onesite.haptic.HapticExtKt$performHapticFeedbackFailureAsync$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            int r7 = r0.r
            int r2 = r0.q
            android.app.Activity r5 = r0.p
            kotlin.ResultKt.b(r8)
            r8 = r5
            goto L80
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.ResultKt.b(r8)
            int r8 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r8 < r2) goto L5e
            java.lang.String r8 = "<this>"
            kotlin.jvm.internal.Intrinsics.h(r7, r8)
            java.lang.Class<android.os.Vibrator> r8 = android.os.Vibrator.class
            java.lang.Object r7 = r7.getSystemService(r8)
            android.os.Vibrator r7 = (android.os.Vibrator) r7
            if (r7 == 0) goto L82
            boolean r8 = r7.hasVibrator()
            if (r8 != 0) goto L56
            goto L82
        L56:
            android.os.VibrationEffect r8 = androidx.media3.exoplayer.source.mediaparser.a.o(r4)
            r7.vibrate(r8)
            goto L82
        L5e:
            r8 = 2
            r2 = r8
            r8 = r7
            r7 = r3
        L62:
            if (r7 >= r2) goto L82
            android.view.Window r5 = r8.getWindow()
            android.view.View r5 = r5.getDecorView()
            r5.performHapticFeedback(r3, r4)
            r0.p = r8
            r0.q = r2
            r0.r = r7
            r0.t = r4
            r5 = 150(0x96, double:7.4E-322)
            java.lang.Object r5 = kotlinx.coroutines.DelayKt.b(r5, r0)
            if (r5 != r1) goto L80
            return r1
        L80:
            int r7 = r7 + r4
            goto L62
        L82:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.haptic.HapticExtKt.b(android.app.Activity, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void c(Activity activity) {
        Intrinsics.h(activity, "<this>");
        if (Build.VERSION.SDK_INT < 29) {
            activity.getWindow().getDecorView().performHapticFeedback(1, 1);
            return;
        }
        Vibrator vibrator = (Vibrator) activity.getSystemService(Vibrator.class);
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        vibrator.vibrate(VibrationEffect.createPredefined(0));
    }
}
