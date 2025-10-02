package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes6.dex */
public class MaterialCardView extends CardView implements Checkable, Shapeable {
    public static final int[] p = {R.attr.state_checkable};
    public static final int[] q = {R.attr.state_checked};
    public static final int[] r = {com.woolworths.R.attr.state_dragged};
    public final MaterialCardViewHelper k;
    public final boolean l;
    public boolean m;
    public boolean n;
    public OnCheckedChangeListener o;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckedIconGravity {
    }

    public interface OnCheckedChangeListener {
        void a();
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.k.c.getBounds());
        return rectF;
    }

    public final void g() {
        MaterialCardViewHelper materialCardViewHelper = this.k;
        RippleDrawable rippleDrawable = materialCardViewHelper.o;
        if (rippleDrawable != null) {
            Rect bounds = rippleDrawable.getBounds();
            int i = bounds.bottom;
            materialCardViewHelper.o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            materialCardViewHelper.o.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.k.c.d.c;
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.k.d.d.c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.k.j;
    }

    public int getCheckedIconGravity() {
        return this.k.g;
    }

    @Dimension
    public int getCheckedIconMargin() {
        return this.k.e;
    }

    @Dimension
    public int getCheckedIconSize() {
        return this.k.f;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.k.l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.k.b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.k.b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.k.b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.k.b.top;
    }

    @FloatRange
    public float getProgress() {
        return this.k.c.d.i;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.k.c.i();
    }

    public ColorStateList getRippleColor() {
        return this.k.k;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.k.m;
    }

    @ColorInt
    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.k.n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    @Nullable
    public ColorStateList getStrokeColorStateList() {
        return this.k.n;
    }

    @Dimension
    public int getStrokeWidth() {
        return this.k.h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialCardViewHelper materialCardViewHelper = this.k;
        materialCardViewHelper.k();
        MaterialShapeUtils.c(this, materialCardViewHelper.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        MaterialCardViewHelper materialCardViewHelper = this.k;
        if (materialCardViewHelper != null && materialCardViewHelper.s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, p);
        }
        if (this.m) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, q);
        }
        if (this.n) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, r);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.m);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        MaterialCardViewHelper materialCardViewHelper = this.k;
        accessibilityNodeInfo.setCheckable(materialCardViewHelper != null && materialCardViewHelper.s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.m);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.k.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.l) {
            MaterialCardViewHelper materialCardViewHelper = this.k;
            if (!materialCardViewHelper.r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                materialCardViewHelper.r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@ColorInt int i) {
        this.k.c.m(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        MaterialCardViewHelper materialCardViewHelper = this.k;
        materialCardViewHelper.c.l(materialCardViewHelper.f14530a.getCardElevation());
    }

    public void setCardForegroundColor(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.k.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        materialShapeDrawable.m(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.k.s = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.m != z) {
            toggle();
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        this.k.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        MaterialCardViewHelper materialCardViewHelper = this.k;
        if (materialCardViewHelper.g != i) {
            materialCardViewHelper.g = i;
            MaterialCardView materialCardView = materialCardViewHelper.f14530a;
            materialCardViewHelper.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(@Dimension int i) {
        this.k.e = i;
    }

    public void setCheckedIconMarginResource(@DimenRes int i) {
        if (i != -1) {
            this.k.e = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(@DrawableRes int i) {
        this.k.g(AppCompatResources.b(i, getContext()));
    }

    public void setCheckedIconSize(@Dimension int i) {
        this.k.f = i;
    }

    public void setCheckedIconSizeResource(@DimenRes int i) {
        if (i != 0) {
            this.k.f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        MaterialCardViewHelper materialCardViewHelper = this.k;
        materialCardViewHelper.l = colorStateList;
        Drawable drawable = materialCardViewHelper.j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        MaterialCardViewHelper materialCardViewHelper = this.k;
        if (materialCardViewHelper != null) {
            materialCardViewHelper.k();
        }
    }

    public void setDragged(boolean z) {
        if (this.n != z) {
            this.n = z;
            refreshDrawableState();
            g();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.k.m();
    }

    public void setOnCheckedChangeListener(@Nullable OnCheckedChangeListener onCheckedChangeListener) {
        this.o = onCheckedChangeListener;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        MaterialCardViewHelper materialCardViewHelper = this.k;
        materialCardViewHelper.m();
        materialCardViewHelper.l();
    }

    public void setProgress(@FloatRange float f) {
        MaterialCardViewHelper materialCardViewHelper = this.k;
        materialCardViewHelper.c.n(f);
        MaterialShapeDrawable materialShapeDrawable = materialCardViewHelper.d;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.n(f);
        }
        MaterialShapeDrawable materialShapeDrawable2 = materialCardViewHelper.q;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.n(f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    @Override // androidx.cardview.widget.CardView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setRadius(float r3) {
        /*
            r2 = this;
            super.setRadius(r3)
            com.google.android.material.card.MaterialCardViewHelper r0 = r2.k
            com.google.android.material.shape.ShapeAppearanceModel r1 = r0.m
            com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r1.g()
            r1.b(r3)
            com.google.android.material.shape.ShapeAppearanceModel r3 = r1.a()
            r0.h(r3)
            android.graphics.drawable.Drawable r3 = r0.i
            r3.invalidateSelf()
            boolean r3 = r0.i()
            if (r3 != 0) goto L38
            com.google.android.material.card.MaterialCardView r3 = r0.f14530a
            boolean r3 = r3.getPreventCornerOverlap()
            if (r3 == 0) goto L3b
            com.google.android.material.shape.MaterialShapeDrawable r3 = r0.c
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r1 = r3.d
            com.google.android.material.shape.ShapeAppearanceModel r1 = r1.f14634a
            android.graphics.RectF r3 = r3.g()
            boolean r3 = r1.f(r3)
            if (r3 != 0) goto L3b
        L38:
            r0.l()
        L3b:
            boolean r3 = r0.i()
            if (r3 == 0) goto L44
            r0.m()
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.setRadius(float):void");
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        MaterialCardViewHelper materialCardViewHelper = this.k;
        materialCardViewHelper.k = colorStateList;
        RippleDrawable rippleDrawable = materialCardViewHelper.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(@ColorRes int i) {
        ColorStateList colorStateListC = ContextCompat.c(i, getContext());
        MaterialCardViewHelper materialCardViewHelper = this.k;
        materialCardViewHelper.k = colorStateListC;
        RippleDrawable rippleDrawable = materialCardViewHelper.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListC);
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        setClipToOutline(shapeAppearanceModel.f(getBoundsAsRectF()));
        this.k.h(shapeAppearanceModel);
    }

    public void setStrokeColor(@ColorInt int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(@Dimension int i) {
        MaterialCardViewHelper materialCardViewHelper = this.k;
        if (i != materialCardViewHelper.h) {
            materialCardViewHelper.h = i;
            MaterialShapeDrawable materialShapeDrawable = materialCardViewHelper.d;
            ColorStateList colorStateList = materialCardViewHelper.n;
            materialShapeDrawable.t(i);
            materialShapeDrawable.s(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        MaterialCardViewHelper materialCardViewHelper = this.k;
        materialCardViewHelper.m();
        materialCardViewHelper.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        MaterialCardViewHelper materialCardViewHelper = this.k;
        if (materialCardViewHelper != null && materialCardViewHelper.s && isEnabled()) {
            this.m = !this.m;
            refreshDrawableState();
            g();
            materialCardViewHelper.f(this.m, true);
            OnCheckedChangeListener onCheckedChangeListener = this.o;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.a();
            }
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.woolworths.R.attr.materialCardViewStyle);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        MaterialCardViewHelper materialCardViewHelper = this.k;
        if (materialCardViewHelper.n != colorStateList) {
            materialCardViewHelper.n = colorStateList;
            MaterialShapeDrawable materialShapeDrawable = materialCardViewHelper.d;
            materialShapeDrawable.t(materialCardViewHelper.h);
            materialShapeDrawable.s(colorStateList);
        }
        invalidate();
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.a(context, attributeSet, i, 2132084094), attributeSet, i);
        this.m = false;
        this.n = false;
        this.l = true;
        TypedArray typedArrayD = ThemeEnforcement.d(getContext(), attributeSet, com.google.android.material.R.styleable.E, i, 2132084094, new int[0]);
        MaterialCardViewHelper materialCardViewHelper = new MaterialCardViewHelper(this, attributeSet, i);
        this.k = materialCardViewHelper;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        MaterialShapeDrawable materialShapeDrawable = materialCardViewHelper.c;
        materialShapeDrawable.m(cardBackgroundColor);
        materialCardViewHelper.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        materialCardViewHelper.l();
        MaterialCardView materialCardView = materialCardViewHelper.f14530a;
        ColorStateList colorStateListA = MaterialResources.a(materialCardView.getContext(), typedArrayD, 11);
        materialCardViewHelper.n = colorStateListA;
        if (colorStateListA == null) {
            materialCardViewHelper.n = ColorStateList.valueOf(-1);
        }
        materialCardViewHelper.h = typedArrayD.getDimensionPixelSize(12, 0);
        boolean z = typedArrayD.getBoolean(0, false);
        materialCardViewHelper.s = z;
        materialCardView.setLongClickable(z);
        materialCardViewHelper.l = MaterialResources.a(materialCardView.getContext(), typedArrayD, 6);
        materialCardViewHelper.g(MaterialResources.d(materialCardView.getContext(), typedArrayD, 2));
        materialCardViewHelper.f = typedArrayD.getDimensionPixelSize(5, 0);
        materialCardViewHelper.e = typedArrayD.getDimensionPixelSize(4, 0);
        materialCardViewHelper.g = typedArrayD.getInteger(3, 8388661);
        ColorStateList colorStateListA2 = MaterialResources.a(materialCardView.getContext(), typedArrayD, 7);
        materialCardViewHelper.k = colorStateListA2;
        if (colorStateListA2 == null) {
            materialCardViewHelper.k = ColorStateList.valueOf(MaterialColors.b(com.woolworths.R.attr.colorControlHighlight, materialCardView));
        }
        ColorStateList colorStateListA3 = MaterialResources.a(materialCardView.getContext(), typedArrayD, 1);
        colorStateListA3 = colorStateListA3 == null ? ColorStateList.valueOf(0) : colorStateListA3;
        MaterialShapeDrawable materialShapeDrawable2 = materialCardViewHelper.d;
        materialShapeDrawable2.m(colorStateListA3);
        RippleDrawable rippleDrawable = materialCardViewHelper.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(materialCardViewHelper.k);
        }
        materialShapeDrawable.l(materialCardView.getCardElevation());
        float f = materialCardViewHelper.h;
        ColorStateList colorStateList = materialCardViewHelper.n;
        materialShapeDrawable2.t(f);
        materialShapeDrawable2.s(colorStateList);
        materialCardView.setBackgroundInternal(materialCardViewHelper.d(materialShapeDrawable));
        Drawable drawableC = materialCardViewHelper.j() ? materialCardViewHelper.c() : materialShapeDrawable2;
        materialCardViewHelper.i = drawableC;
        materialCardView.setForeground(materialCardViewHelper.d(drawableC));
        typedArrayD.recycle();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        this.k.c.m(colorStateList);
    }
}
