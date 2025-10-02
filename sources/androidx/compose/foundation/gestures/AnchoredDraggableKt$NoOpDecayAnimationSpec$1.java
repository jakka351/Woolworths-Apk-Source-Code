package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/gestures/AnchoredDraggableKt$NoOpDecayAnimationSpec$1", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnchoredDraggableKt$NoOpDecayAnimationSpec$1 implements FloatDecayAnimationSpec {
    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float a() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final long b(float f) {
        return 0L;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float c(float f, float f2) {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float d(long j, float f) {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float e(long j, float f, float f2) {
        return BitmapDescriptorFactory.HUE_RED;
    }
}
