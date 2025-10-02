package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/animation/core/AnimationVector;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimationVector1D extends AnimationVector {

    /* renamed from: a, reason: collision with root package name */
    public float f745a;

    public AnimationVector1D(float f) {
        this.f745a = f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final float a(int i) {
        return i == 0 ? this.f745a : BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final int b() {
        return 1;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final AnimationVector c() {
        return new AnimationVector1D(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void d() {
        this.f745a = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void e(float f, int i) {
        if (i == 0) {
            this.f745a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AnimationVector1D) && ((AnimationVector1D) obj).f745a == this.f745a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f745a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f745a;
    }
}
