package androidx.compose.animation.graphics.vector;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.State;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/graphics/vector/FloatPropertyValues;", "Landroidx/compose/animation/graphics/vector/PropertyValues;", "", "animation-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class FloatPropertyValues extends PropertyValues<Float> {
    @Override // androidx.compose.animation.graphics.vector.PropertyValues
    public final State a(Transition transition, String str, int i, Composer composer, int i2) {
        composer.o(2006928772);
        PropertyValues$createAnimationSpec$1 propertyValues$createAnimationSpec$1 = new PropertyValues$createAnimationSpec$1(this, i);
        int i3 = (i2 & 14) | ((i2 << 3) & 896);
        TwoWayConverter twoWayConverter = VectorConvertersKt.f788a;
        int i4 = ((i3 << 3) & 7168) | (i3 & 14);
        boolean zBooleanValue = ((Boolean) transition.f776a.a()).booleanValue();
        composer.o(-1743438372);
        ArrayList arrayList = this.f814a;
        float fFloatValue = zBooleanValue ? ((Number) ((Keyframe) CollectionsKt.O(((PropertyValuesHolderFloat) ((Timestamp) CollectionsKt.O(arrayList)).e).b)).b).floatValue() : ((Number) ((Keyframe) CollectionsKt.D(((PropertyValuesHolderFloat) ((Timestamp) CollectionsKt.D(arrayList)).e).b)).b).floatValue();
        composer.l();
        Float fValueOf = Float.valueOf(fFloatValue);
        boolean zBooleanValue2 = ((Boolean) ((SnapshotMutableStateImpl) transition.d).getD()).booleanValue();
        composer.o(-1743438372);
        float fFloatValue2 = zBooleanValue2 ? ((Number) ((Keyframe) CollectionsKt.O(((PropertyValuesHolderFloat) ((Timestamp) CollectionsKt.O(arrayList)).e).b)).b).floatValue() : ((Number) ((Keyframe) CollectionsKt.D(((PropertyValuesHolderFloat) ((Timestamp) CollectionsKt.D(arrayList)).e).b)).b).floatValue();
        composer.l();
        Transition.TransitionAnimationState transitionAnimationStateD = TransitionKt.d(transition, fValueOf, Float.valueOf(fFloatValue2), (FiniteAnimationSpec) propertyValues$createAnimationSpec$1.invoke(transition.f(), composer, 0), twoWayConverter, composer, (i4 & 14) | ((i4 << 6) & 458752));
        composer.l();
        return transitionAnimationStateD;
    }
}
