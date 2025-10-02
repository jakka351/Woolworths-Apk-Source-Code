package au.com.woolworths.shared.ui.compose.rewards;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ShimmerKt$shimmerLoadingAnimation$1 implements Function3<Modifier, Composer, Integer, Modifier> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier composed = (Modifier) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        Intrinsics.h(composed, "$this$composed");
        composer.o(2118090640);
        List listR = CollectionsKt.R(new Color(CoreTheme.b(composer).e.f4848a.e), new Color(CoreTheme.b(composer).e.f4848a.d), new Color(CoreTheme.b(composer).e.f4848a.c), new Color(CoreTheme.b(composer).e.f4848a.d), new Color(CoreTheme.b(composer).e.f4848a.e));
        InfiniteTransition.TransitionAnimationState transitionAnimationStateA = InfiniteTransitionKt.a(InfiniteTransitionKt.c("", composer, 0), BitmapDescriptorFactory.HUE_RED, 2000, AnimationSpecKt.a(4, 0L, AnimationSpecKt.e(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 0, EasingKt.d, 2), RepeatMode.d), "Shimmer loading animation", composer, 28728, 0);
        Modifier modifierA = BackgroundKt.a(composed, Brush.Companion.a(listR, (Float.floatToRawIntBits(((Number) ((SnapshotMutableStateImpl) transitionAnimationStateA.g).getD()).floatValue() - 500) << 32) | (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) & 4294967295L), (Float.floatToRawIntBits(((Number) ((SnapshotMutableStateImpl) transitionAnimationStateA.g).getD()).floatValue()) << 32) | (4294967295L & Float.floatToRawIntBits(270.0f)), 8));
        composer.l();
        return modifierA;
    }
}
