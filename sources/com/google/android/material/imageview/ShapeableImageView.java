package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* loaded from: classes6.dex */
public class ShapeableImageView extends AppCompatImageView implements Shapeable {
    public final ShapeAppearancePathProvider g;
    public final RectF h;
    public final RectF i;
    public final Paint j;
    public final Paint k;
    public final Path l;
    public ColorStateList m;
    public MaterialShapeDrawable n;
    public ShapeAppearanceModel o;
    public float p;
    public final Path q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public boolean x;

    @TargetApi
    public class OutlineProvider extends ViewOutlineProvider {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f14589a = new Rect();

        public OutlineProvider() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ShapeableImageView shapeableImageView = ShapeableImageView.this;
            if (shapeableImageView.o == null) {
                return;
            }
            if (shapeableImageView.n == null) {
                shapeableImageView.n = new MaterialShapeDrawable(shapeableImageView.o);
            }
            RectF rectF = shapeableImageView.h;
            Rect rect = this.f14589a;
            rectF.round(rect);
            shapeableImageView.n.setBounds(rect);
            shapeableImageView.n.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    public final boolean c() {
        return getLayoutDirection() == 1;
    }

    public final void d(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i - getPaddingRight();
        float paddingBottom = i2 - getPaddingBottom();
        RectF rectF = this.h;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        ShapeAppearanceModel shapeAppearanceModel = this.o;
        ShapeAppearancePathProvider shapeAppearancePathProvider = this.g;
        Path path = this.l;
        shapeAppearancePathProvider.a(shapeAppearanceModel, 1.0f, rectF, null, path);
        Path path2 = this.q;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.i;
        rectF2.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i, i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    @Dimension
    public int getContentPaddingBottom() {
        return this.u;
    }

    @Dimension
    public final int getContentPaddingEnd() {
        int i = this.w;
        return i != Integer.MIN_VALUE ? i : c() ? this.r : this.t;
    }

    @Dimension
    public int getContentPaddingLeft() {
        int i = this.w;
        int i2 = this.v;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (c() && i != Integer.MIN_VALUE) {
                return i;
            }
            if (!c() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.r;
    }

    @Dimension
    public int getContentPaddingRight() {
        int i = this.w;
        int i2 = this.v;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (c() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (!c() && i != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.t;
    }

    @Dimension
    public final int getContentPaddingStart() {
        int i = this.v;
        return i != Integer.MIN_VALUE ? i : c() ? this.t : this.r;
    }

    @Dimension
    public int getContentPaddingTop() {
        return this.s;
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.o;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.m;
    }

    @Dimension
    public float getStrokeWidth() {
        return this.p;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.q, this.k);
        if (this.m == null) {
            return;
        }
        float f = this.p;
        Paint paint = this.j;
        paint.setStrokeWidth(f);
        int colorForState = this.m.getColorForState(getDrawableState(), this.m.getDefaultColor());
        if (this.p <= BitmapDescriptorFactory.HUE_RED || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.l, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.x && isLayoutDirectionResolved()) {
            this.x = true;
            if (!isPaddingRelative() && this.v == Integer.MIN_VALUE && this.w == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        d(i, i2);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.o = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.n;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        this.m = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(@ColorRes int i) {
        setStrokeColor(ContextCompat.c(i, getContext()));
    }

    public void setStrokeWidth(@Dimension float f) {
        if (this.p != f) {
            this.p = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(@DimenRes int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.a(context, attributeSet, i, 2132084151), attributeSet, i);
        this.g = ShapeAppearancePathProvider.b();
        this.l = new Path();
        this.x = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.k = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.h = new RectF();
        this.i = new RectF();
        this.q = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.Z, i, 2132084151);
        setLayerType(2, null);
        this.m = MaterialResources.a(context2, typedArrayObtainStyledAttributes, 9);
        this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.r = dimensionPixelSize;
        this.s = dimensionPixelSize;
        this.t = dimensionPixelSize;
        this.u = dimensionPixelSize;
        this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.j = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.o = ShapeAppearanceModel.d(context2, attributeSet, i, 2132084151).a();
        setOutlineProvider(new OutlineProvider());
    }
}
