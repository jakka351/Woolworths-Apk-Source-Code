package com.airbnb.lottie.compose;

import YU.a;
import android.content.Context;
import android.provider.Settings;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "wasPlaying", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AnimateLottieCompositionAsStateKt {
    public static final LottieAnimatable a(LottieComposition lottieComposition, LottieClipSpec lottieClipSpec, int i, Composer composer, int i2) {
        composer.F(683659508);
        if ((i2 & 16) != 0) {
            lottieClipSpec = null;
        }
        LottieClipSpec lottieClipSpec2 = lottieClipSpec;
        LottieCancellationBehavior lottieCancellationBehavior = LottieCancellationBehavior.d;
        if (i <= 0) {
            throw new IllegalArgumentException(a.e(i, "Iterations must be a positive number (", ").").toString());
        }
        if (Float.isInfinite(1.0f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(("Speed must be a finite number. It is 1.0.").toString());
        }
        LottieAnimatable lottieAnimatableA = LottieAnimatableKt.a(composer);
        composer.F(-180606964);
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            objG = SnapshotStateKt.f(true);
            composer.A(objG);
        }
        MutableState mutableState = (MutableState) objG;
        composer.N();
        composer.F(-180606834);
        Context context = (Context) composer.x(AndroidCompositionLocals_androidKt.b);
        ThreadLocal threadLocal = Utils.f13480a;
        float f = 1.0f / Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        composer.N();
        EffectsKt.g(new Object[]{lottieComposition, true, lottieClipSpec2, Float.valueOf(f), Integer.valueOf(i)}, new AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(true, true, lottieAnimatableA, lottieComposition, i, false, f, lottieClipSpec2, mutableState, null), composer);
        composer.N();
        return lottieAnimatableA;
    }
}
