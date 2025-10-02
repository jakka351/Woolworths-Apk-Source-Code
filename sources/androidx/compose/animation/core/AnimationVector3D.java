package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/core/AnimationVector3D;", "Landroidx/compose/animation/core/AnimationVector;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimationVector3D extends AnimationVector {

    /* renamed from: a, reason: collision with root package name */
    public float f747a;
    public float b;
    public float c;

    public AnimationVector3D(float f, float f2, float f3) {
        this.f747a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final float a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? BitmapDescriptorFactory.HUE_RED : this.c : this.b : this.f747a;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final int b() {
        return 3;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final AnimationVector c() {
        return new AnimationVector3D(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void d() {
        this.f747a = BitmapDescriptorFactory.HUE_RED;
        this.b = BitmapDescriptorFactory.HUE_RED;
        this.c = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void e(float f, int i) {
        if (i == 0) {
            this.f747a = f;
        } else if (i == 1) {
            this.b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnimationVector3D)) {
            return false;
        }
        AnimationVector3D animationVector3D = (AnimationVector3D) obj;
        return animationVector3D.f747a == this.f747a && animationVector3D.b == this.b && animationVector3D.c == this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + android.support.v4.media.session.a.b(this.b, Float.hashCode(this.f747a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f747a + ", v2 = " + this.b + ", v3 = " + this.c;
    }
}
