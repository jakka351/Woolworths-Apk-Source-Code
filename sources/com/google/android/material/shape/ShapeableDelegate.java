package com.google.android.material.shape;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import com.google.android.material.shape.ShapeAppearancePathProvider;

@RestrictTo
/* loaded from: classes6.dex */
public abstract class ShapeableDelegate {
    public ShapeAppearanceModel c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f14643a = false;
    public boolean b = false;
    public RectF d = new RectF();
    public final Path e = new Path();

    public static ShapeableDelegate a(FrameLayout frameLayout) {
        return Build.VERSION.SDK_INT >= 33 ? new ShapeableDelegateV33(frameLayout) : new ShapeableDelegateV22(frameLayout);
    }

    public abstract void b(FrameLayout frameLayout);

    public abstract boolean c();

    public final void d() {
        ShapeAppearanceModel shapeAppearanceModel;
        RectF rectF = this.d;
        if (rectF.left > rectF.right || rectF.top > rectF.bottom || (shapeAppearanceModel = this.c) == null) {
            return;
        }
        ShapeAppearancePathProvider.Lazy.f14639a.a(shapeAppearanceModel, 1.0f, rectF, null, this.e);
    }
}
