package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatableKt {

    /* renamed from: a, reason: collision with root package name */
    public static final AnimationVector1D f741a = new AnimationVector1D(Float.POSITIVE_INFINITY);
    public static final AnimationVector2D b = new AnimationVector2D(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final AnimationVector3D c = new AnimationVector3D(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final AnimationVector4D d = new AnimationVector4D(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final AnimationVector1D e = new AnimationVector1D(Float.NEGATIVE_INFINITY);
    public static final AnimationVector2D f = new AnimationVector2D(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final AnimationVector3D g = new AnimationVector3D(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final AnimationVector4D h = new AnimationVector4D(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static Animatable a(float f2) {
        return new Animatable(Float.valueOf(f2), VectorConvertersKt.f788a, Float.valueOf(0.01f), 8);
    }
}
