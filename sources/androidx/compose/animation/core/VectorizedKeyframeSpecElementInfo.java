package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class VectorizedKeyframeSpecElementInfo<V extends AnimationVector> {

    /* renamed from: a, reason: collision with root package name */
    public final AnimationVector f796a;
    public final Easing b;

    public VectorizedKeyframeSpecElementInfo(AnimationVector animationVector, Easing easing) {
        this.f796a = animationVector;
        this.b = easing;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VectorizedKeyframeSpecElementInfo)) {
            return false;
        }
        VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) obj;
        return Intrinsics.c(this.f796a, vectorizedKeyframeSpecElementInfo.f796a) && Intrinsics.c(this.b, vectorizedKeyframeSpecElementInfo.b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.b.hashCode() + (this.f796a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f796a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
