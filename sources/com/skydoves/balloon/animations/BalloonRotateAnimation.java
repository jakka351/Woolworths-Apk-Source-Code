package com.skydoves.balloon.animations;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/skydoves/balloon/animations/BalloonRotateAnimation;", "Landroid/view/animation/Animation;", "Builder", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BalloonRotateAnimation extends Animation {
    public float d;
    public float e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/skydoves/balloon/animations/BalloonRotateAnimation$Builder;", "", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        Intrinsics.h(transformation, "transformation");
        float f2 = BitmapDescriptorFactory.HUE_RED * f;
        Matrix matrix = transformation.getMatrix();
        Camera camera = new Camera();
        camera.save();
        camera.rotateX(f2);
        camera.rotateY(f2);
        camera.rotateZ(f2);
        camera.getMatrix(matrix);
        camera.restore();
        matrix.preTranslate(-this.d, -this.e);
        matrix.postTranslate(this.d, this.e);
    }

    @Override // android.view.animation.Animation
    public final void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.d = i * 0.5f;
        this.e = i2 * 0.5f;
    }
}
