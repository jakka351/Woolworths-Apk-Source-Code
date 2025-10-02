package androidx.compose.animation.core;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AnimationStateKt {
    public static AnimationState a(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        return new AnimationState(VectorConvertersKt.f788a, Float.valueOf(f), new AnimationVector1D(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static AnimationState b(AnimationState animationState, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = ((Number) ((SnapshotMutableStateImpl) animationState.e).getD()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((AnimationVector1D) animationState.f).f745a;
        }
        return new AnimationState(animationState.d, Float.valueOf(f), new AnimationVector1D(f2), animationState.g, animationState.h, animationState.i);
    }
}
