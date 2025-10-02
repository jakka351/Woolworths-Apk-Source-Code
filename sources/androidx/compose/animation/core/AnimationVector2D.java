package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/AnimationVector;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimationVector2D extends AnimationVector {

    /* renamed from: a, reason: collision with root package name */
    public float f746a;
    public float b;

    public AnimationVector2D(float f, float f2) {
        this.f746a = f;
        this.b = f2;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final float a(int i) {
        return i != 0 ? i != 1 ? BitmapDescriptorFactory.HUE_RED : this.b : this.f746a;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final int b() {
        return 2;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final AnimationVector c() {
        return new AnimationVector2D(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void d() {
        this.f746a = BitmapDescriptorFactory.HUE_RED;
        this.b = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void e(float f, int i) {
        if (i == 0) {
            this.f746a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnimationVector2D)) {
            return false;
        }
        AnimationVector2D animationVector2D = (AnimationVector2D) obj;
        return animationVector2D.f746a == this.f746a && animationVector2D.b == this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f746a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f746a + ", v2 = " + this.b;
    }
}
