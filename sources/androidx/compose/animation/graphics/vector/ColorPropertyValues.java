package androidx.compose.animation.graphics.vector;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/graphics/vector/ColorPropertyValues;", "Landroidx/compose/animation/graphics/vector/PropertyValues;", "Landroidx/compose/ui/graphics/Color;", "animation-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class ColorPropertyValues extends PropertyValues<Color> {
    @Override // androidx.compose.animation.graphics.vector.PropertyValues
    public final State a(Transition transition, String str, int i, Composer composer, int i2) {
        composer.o(-2133734837);
        PropertyValues$createAnimationSpec$1 propertyValues$createAnimationSpec$1 = new PropertyValues$createAnimationSpec$1(this, i);
        int i3 = (i2 & 14) | ((i2 << 3) & 896);
        MutableState mutableState = transition.d;
        boolean zBooleanValue = ((Boolean) ((SnapshotMutableStateImpl) mutableState).getD()).booleanValue();
        composer.o(1880460593);
        ArrayList arrayList = this.f814a;
        long j = zBooleanValue ? ((Color) ((Keyframe) CollectionsKt.O(((PropertyValuesHolderColor) ((Timestamp) CollectionsKt.O(arrayList)).e).b)).b).f1766a : ((Color) ((Keyframe) CollectionsKt.D(((PropertyValuesHolderColor) ((Timestamp) CollectionsKt.D(arrayList)).e).b)).b).f1766a;
        composer.l();
        ColorSpace colorSpaceF = Color.f(j);
        boolean zN = composer.n(colorSpaceF);
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            objG = (TwoWayConverter) ColorVectorConverterKt.a().invoke(colorSpaceF);
            composer.A(objG);
        }
        TwoWayConverter twoWayConverter = (TwoWayConverter) objG;
        int i4 = ((i3 << 3) & 7168) | (i3 & 14);
        boolean zBooleanValue2 = ((Boolean) transition.f776a.a()).booleanValue();
        composer.o(1880460593);
        long j2 = zBooleanValue2 ? ((Color) ((Keyframe) CollectionsKt.O(((PropertyValuesHolderColor) ((Timestamp) CollectionsKt.O(arrayList)).e).b)).b).f1766a : ((Color) ((Keyframe) CollectionsKt.D(((PropertyValuesHolderColor) ((Timestamp) CollectionsKt.D(arrayList)).e).b)).b).f1766a;
        composer.l();
        Color color = new Color(j2);
        boolean zBooleanValue3 = ((Boolean) ((SnapshotMutableStateImpl) mutableState).getD()).booleanValue();
        composer.o(1880460593);
        long j3 = zBooleanValue3 ? ((Color) ((Keyframe) CollectionsKt.O(((PropertyValuesHolderColor) ((Timestamp) CollectionsKt.O(arrayList)).e).b)).b).f1766a : ((Color) ((Keyframe) CollectionsKt.D(((PropertyValuesHolderColor) ((Timestamp) CollectionsKt.D(arrayList)).e).b)).b).f1766a;
        composer.l();
        Transition.TransitionAnimationState transitionAnimationStateD = TransitionKt.d(transition, color, new Color(j3), (FiniteAnimationSpec) propertyValues$createAnimationSpec$1.invoke(transition.f(), composer, 0), twoWayConverter, composer, (i4 & 14) | ((i4 << 6) & 458752));
        composer.l();
        return transitionAnimationStateD;
    }
}
