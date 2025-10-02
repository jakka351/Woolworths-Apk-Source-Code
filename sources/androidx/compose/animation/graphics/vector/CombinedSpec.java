package androidx.compose.animation.graphics.vector;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorizedFiniteAnimationSpec;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/graphics/vector/CombinedSpec;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animation-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class CombinedSpec<T> implements FiniteAnimationSpec<T> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f811a;

    public CombinedSpec(ArrayList arrayList) {
        this.f811a = arrayList;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public final VectorizedFiniteAnimationSpec a(TwoWayConverter twoWayConverter) {
        ArrayList arrayList = this.f811a;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(new Pair(Long.valueOf(((Number) r4.d).intValue() * 1000000), ((FiniteAnimationSpec) ((Pair) arrayList.get(i)).e).a(twoWayConverter)));
        }
        return new VectorizedCombinedSpec(arrayList2);
    }
}
