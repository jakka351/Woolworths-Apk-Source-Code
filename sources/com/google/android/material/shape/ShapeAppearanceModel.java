package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.RestrictTo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.R;

/* loaded from: classes6.dex */
public class ShapeAppearanceModel {
    public static final RelativeCornerSize m = new RelativeCornerSize(0.5f);

    /* renamed from: a, reason: collision with root package name */
    public CornerTreatment f14636a = new RoundedCornerTreatment();
    public CornerTreatment b = new RoundedCornerTreatment();
    public CornerTreatment c = new RoundedCornerTreatment();
    public CornerTreatment d = new RoundedCornerTreatment();
    public CornerSize e = new AbsoluteCornerSize(BitmapDescriptorFactory.HUE_RED);
    public CornerSize f = new AbsoluteCornerSize(BitmapDescriptorFactory.HUE_RED);
    public CornerSize g = new AbsoluteCornerSize(BitmapDescriptorFactory.HUE_RED);
    public CornerSize h = new AbsoluteCornerSize(BitmapDescriptorFactory.HUE_RED);
    public EdgeTreatment i = new EdgeTreatment();
    public EdgeTreatment j = new EdgeTreatment();
    public EdgeTreatment k = new EdgeTreatment();
    public EdgeTreatment l = new EdgeTreatment();

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public CornerTreatment f14637a = new RoundedCornerTreatment();
        public CornerTreatment b = new RoundedCornerTreatment();
        public CornerTreatment c = new RoundedCornerTreatment();
        public CornerTreatment d = new RoundedCornerTreatment();
        public CornerSize e = new AbsoluteCornerSize(BitmapDescriptorFactory.HUE_RED);
        public CornerSize f = new AbsoluteCornerSize(BitmapDescriptorFactory.HUE_RED);
        public CornerSize g = new AbsoluteCornerSize(BitmapDescriptorFactory.HUE_RED);
        public CornerSize h = new AbsoluteCornerSize(BitmapDescriptorFactory.HUE_RED);
        public EdgeTreatment i = new EdgeTreatment();
        public EdgeTreatment j = new EdgeTreatment();
        public EdgeTreatment k = new EdgeTreatment();
        public EdgeTreatment l = new EdgeTreatment();

        public final ShapeAppearanceModel a() {
            ShapeAppearanceModel shapeAppearanceModel = new ShapeAppearanceModel();
            shapeAppearanceModel.f14636a = this.f14637a;
            shapeAppearanceModel.b = this.b;
            shapeAppearanceModel.c = this.c;
            shapeAppearanceModel.d = this.d;
            shapeAppearanceModel.e = this.e;
            shapeAppearanceModel.f = this.f;
            shapeAppearanceModel.g = this.g;
            shapeAppearanceModel.h = this.h;
            shapeAppearanceModel.i = this.i;
            shapeAppearanceModel.j = this.j;
            shapeAppearanceModel.k = this.k;
            shapeAppearanceModel.l = this.l;
            return shapeAppearanceModel;
        }

        public final void b(float f) {
            e(f);
            f(f);
            d(f);
            c(f);
        }

        public final void c(float f) {
            this.h = new AbsoluteCornerSize(f);
        }

        public final void d(float f) {
            this.g = new AbsoluteCornerSize(f);
        }

        public final void e(float f) {
            this.e = new AbsoluteCornerSize(f);
        }

        public final void f(float f) {
            this.f = new AbsoluteCornerSize(f);
        }
    }

    @RestrictTo
    public interface CornerSizeUnaryOperator {
        CornerSize c(CornerSize cornerSize);
    }

    public static Builder a(Context context, int i, int i2) {
        return b(context, i, i2, new AbsoluteCornerSize(0));
    }

    public static Builder b(Context context, int i, int i2, CornerSize cornerSize) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(R.styleable.Y);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            CornerSize cornerSizeE = e(typedArrayObtainStyledAttributes, 5, cornerSize);
            CornerSize cornerSizeE2 = e(typedArrayObtainStyledAttributes, 8, cornerSizeE);
            CornerSize cornerSizeE3 = e(typedArrayObtainStyledAttributes, 9, cornerSizeE);
            CornerSize cornerSizeE4 = e(typedArrayObtainStyledAttributes, 7, cornerSizeE);
            CornerSize cornerSizeE5 = e(typedArrayObtainStyledAttributes, 6, cornerSizeE);
            Builder builder = new Builder();
            builder.f14637a = MaterialShapeUtils.a(i4);
            builder.e = cornerSizeE2;
            builder.b = MaterialShapeUtils.a(i5);
            builder.f = cornerSizeE3;
            builder.c = MaterialShapeUtils.a(i6);
            builder.g = cornerSizeE4;
            builder.d = MaterialShapeUtils.a(i7);
            builder.h = cornerSizeE5;
            return builder;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static Builder c(Context context, AttributeSet attributeSet, int i, int i2, CornerSize cornerSize) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.I, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, cornerSize);
    }

    public static Builder d(Context context, AttributeSet attributeSet, int i, int i2) {
        return c(context, attributeSet, i, i2, new AbsoluteCornerSize(0));
    }

    public static CornerSize e(TypedArray typedArray, int i, CornerSize cornerSize) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new AbsoluteCornerSize(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new RelativeCornerSize(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cornerSize;
    }

    public final boolean f(RectF rectF) {
        boolean z = this.l.getClass().equals(EdgeTreatment.class) && this.j.getClass().equals(EdgeTreatment.class) && this.i.getClass().equals(EdgeTreatment.class) && this.k.getClass().equals(EdgeTreatment.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.b instanceof RoundedCornerTreatment) && (this.f14636a instanceof RoundedCornerTreatment) && (this.c instanceof RoundedCornerTreatment) && (this.d instanceof RoundedCornerTreatment));
    }

    public final Builder g() {
        Builder builder = new Builder();
        builder.f14637a = this.f14636a;
        builder.b = this.b;
        builder.c = this.c;
        builder.d = this.d;
        builder.e = this.e;
        builder.f = this.f;
        builder.g = this.g;
        builder.h = this.h;
        builder.i = this.i;
        builder.j = this.j;
        builder.k = this.k;
        builder.l = this.l;
        return builder;
    }

    public final ShapeAppearanceModel h(CornerSizeUnaryOperator cornerSizeUnaryOperator) {
        Builder builderG = g();
        builderG.e = cornerSizeUnaryOperator.c(this.e);
        builderG.f = cornerSizeUnaryOperator.c(this.f);
        builderG.h = cornerSizeUnaryOperator.c(this.h);
        builderG.g = cornerSizeUnaryOperator.c(this.g);
        return builderG.a();
    }
}
