package androidx.compose.animation.graphics.vector;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.VectorizedFiniteAnimationSpec;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/graphics/vector/VectorizedCombinedSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "animation-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class VectorizedCombinedSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f820a;

    public VectorizedCombinedSpec(ArrayList arrayList) {
        this.f820a = arrayList;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final long b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        Pair pair = (Pair) CollectionsKt.O(this.f820a);
        return ((VectorizedFiniteAnimationSpec) pair.e).b(animationVector, animationVector2, animationVector3) + ((Number) pair.d).longValue();
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector e(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        Pair pairH = h(j);
        return ((VectorizedFiniteAnimationSpec) pairH.e).e(j - ((Number) pairH.d).longValue(), animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector f(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        Pair pairH = h(j);
        return ((VectorizedFiniteAnimationSpec) pairH.e).f(j - ((Number) pairH.d).longValue(), animationVector, animationVector2, animationVector3);
    }

    public final Pair h(long j) {
        Object objPrevious;
        ArrayList arrayList = this.f820a;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((Number) ((Pair) objPrevious).d).longValue() <= j) {
                break;
            }
        }
        Pair pair = (Pair) objPrevious;
        return pair == null ? (Pair) CollectionsKt.D(arrayList) : pair;
    }
}
