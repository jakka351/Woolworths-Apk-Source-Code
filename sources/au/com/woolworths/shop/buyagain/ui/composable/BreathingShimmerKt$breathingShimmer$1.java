package au.com.woolworths.shop.buyagain.ui.composable;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import com.google.android.gms.common.ConnectionResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class BreathingShimmerKt$breathingShimmer$1 implements Function3<Modifier, Composer, Integer, Modifier> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier composed = (Modifier) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        Intrinsics.h(composed, "$this$composed");
        composer.o(-1884938385);
        Modifier modifierA = AlphaKt.a(composed, ((Number) InfiniteTransitionKt.a(InfiniteTransitionKt.c("", composer, 0), 1.0f, 0.4f, AnimationSpecKt.a(4, 0L, AnimationSpecKt.e(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 0, EasingKt.d, 2), RepeatMode.e), "", composer, 28680, 0).getD()).floatValue());
        composer.l();
        return modifierA;
    }
}
