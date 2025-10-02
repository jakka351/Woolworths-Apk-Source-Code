package androidx.compose.animation.core;

import androidx.collection.IntListKt;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.Immutable;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/ArcAnimationSpec;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalAnimationSpecApi
/* loaded from: classes2.dex */
public final class ArcAnimationSpec<T> implements DurationBasedAnimationSpec<T> {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ArcAnimationSpec);
    }

    public final int hashCode() {
        Integer.hashCode(0);
        throw null;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public final VectorizedDurationBasedAnimationSpec a(TwoWayConverter twoWayConverter) {
        MutableIntList mutableIntList = IntListKt.f677a;
        MutableIntList mutableIntList2 = new MutableIntList(2);
        mutableIntList2.c(0);
        mutableIntList2.c(0);
        MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.f679a;
        Intrinsics.f(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
        return new VectorizedKeyframesSpec(mutableIntList2, mutableIntObjectMap, 0, null);
    }
}
