package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/AnimationDataConverter;", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/foundation/gestures/AnimationData;", "Landroidx/compose/animation/core/AnimationVector4D;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AnimationDataConverter implements TwoWayConverter<AnimationData, AnimationVector4D> {
    @Override // androidx.compose.animation.core.TwoWayConverter
    public final Function1 a() {
        return AnimationDataConverter$convertToVector$1.h;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public final Function1 b() {
        return AnimationDataConverter$convertFromVector$1.h;
    }
}
