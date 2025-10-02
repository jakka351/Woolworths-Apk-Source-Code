package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
/* loaded from: classes2.dex */
public final class TransitionKt$animateDp$1 extends Lambda implements Function3<Transition.Segment<Object>, Composer, Integer, SpringSpec<Dp>> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.o(-575880366);
        Rect rect = VisibilityThresholdsKt.f802a;
        SpringSpec springSpecD = AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new Dp(0.1f), 3);
        composer.l();
        return springSpecD;
    }
}
