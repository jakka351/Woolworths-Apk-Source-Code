package androidx.compose.animation.core;

import androidx.compose.animation.core.KeyframesSpec;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimationSpecKt {
    public static InfiniteRepeatableSpec a(int i, long j, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        if ((i & 2) != 0) {
            repeatMode = RepeatMode.d;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        return new InfiniteRepeatableSpec(durationBasedAnimationSpec, repeatMode, j);
    }

    public static final KeyframesSpec b(Function1 function1) {
        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new KeyframesSpec.KeyframesSpecConfig();
        function1.invoke(keyframesSpecConfig);
        return new KeyframesSpec(keyframesSpecConfig);
    }

    public static RepeatableSpec c(int i, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j, int i2) {
        if ((i2 & 4) != 0) {
            repeatMode = RepeatMode.d;
        }
        RepeatMode repeatMode2 = repeatMode;
        if ((i2 & 8) != 0) {
            j = 0;
        }
        return new RepeatableSpec(i, j, durationBasedAnimationSpec, repeatMode2);
    }

    public static SpringSpec d(float f, float f2, Object obj, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new SpringSpec(f, f2, obj);
    }

    public static TweenSpec e(int i, int i2, Easing easing, int i3) {
        if ((i3 & 1) != 0) {
            i = nlnlnnn.xxx00780078x0078;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            easing = EasingKt.f756a;
        }
        return new TweenSpec(i, i2, easing);
    }
}
