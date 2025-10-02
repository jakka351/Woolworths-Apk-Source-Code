package com.google.android.material.animation;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* loaded from: classes6.dex */
public class ImageMatrixProperty extends Property<ImageView, Matrix> {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f14508a;

    public ImageMatrixProperty() {
        super(Matrix.class, "imageMatrixProperty");
        this.f14508a = new Matrix();
    }

    @Override // android.util.Property
    public final Matrix get(ImageView imageView) {
        Matrix imageMatrix = imageView.getImageMatrix();
        Matrix matrix = this.f14508a;
        matrix.set(imageMatrix);
        return matrix;
    }

    @Override // android.util.Property
    public final void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
