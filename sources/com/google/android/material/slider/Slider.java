package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.woolworths.R;

/* loaded from: classes6.dex */
public class Slider extends BaseSlider<Slider, OnChangeListener, OnSliderTouchListener> {

    public interface OnChangeListener extends BaseOnChangeListener<Slider> {
        @Override // com.google.android.material.slider.BaseOnChangeListener
        /* bridge */ /* synthetic */ default void a(Object obj, float f, boolean z) {
            c();
        }

        void c();
    }

    public interface OnSliderTouchListener extends BaseOnSliderTouchListener<Slider> {
        @Override // com.google.android.material.slider.BaseOnSliderTouchListener
        /* bridge */ /* synthetic */ default void a(Object obj) {
            d();
        }

        @Override // com.google.android.material.slider.BaseOnSliderTouchListener
        /* bridge */ /* synthetic */ default void b(Object obj) {
            e();
        }

        void d();

        void e();
    }

    public Slider(@NonNull Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public int getActiveThumbIndex() {
        return this.a0;
    }

    public int getFocusedThumbIndex() {
        return this.b0;
    }

    @Px
    public int getHaloRadius() {
        return this.J;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.k0;
    }

    public int getLabelBehavior() {
        return this.E;
    }

    public float getStepSize() {
        return this.c0;
    }

    public float getThumbElevation() {
        return this.s0.d.m;
    }

    @Px
    public int getThumbHeight() {
        return this.I;
    }

    @Override // com.google.android.material.slider.BaseSlider
    @Px
    public int getThumbRadius() {
        return this.H / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.s0.d.d;
    }

    public float getThumbStrokeWidth() {
        return this.s0.d.j;
    }

    @NonNull
    public ColorStateList getThumbTintList() {
        return this.s0.d.c;
    }

    public int getThumbTrackGapSize() {
        return this.K;
    }

    @Px
    public int getThumbWidth() {
        return this.H;
    }

    @Px
    public int getTickActiveRadius() {
        return this.f0;
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.l0;
    }

    @Px
    public int getTickInactiveRadius() {
        return this.g0;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.m0;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if (this.m0.equals(this.l0)) {
            return this.l0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.n0;
    }

    @Px
    public int getTrackHeight() {
        return this.F;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.o0;
    }

    public int getTrackInsideCornerSize() {
        return this.O;
    }

    @Px
    public int getTrackSidePadding() {
        return this.G;
    }

    public int getTrackStopIndicatorSize() {
        return this.N;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if (this.o0.equals(this.n0)) {
            return this.n0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @Px
    public int getTrackWidth() {
        return this.h0;
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public float getValueFrom() {
        return this.U;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public float getValueTo() {
        return this.V;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public final boolean r() {
        if (getActiveThumbIndex() != -1) {
            return true;
        }
        setActiveThumbIndex(0);
        return true;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawable(@NonNull Drawable drawable) {
        super.setCustomThumbDrawable(drawable);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i) {
        super.setFocusedThumbIndex(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloRadius(@IntRange @Px int i) {
        super.setHaloRadius(i);
    }

    public void setHaloRadiusResource(@DimenRes int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloTintList(@NonNull ColorStateList colorStateList) {
        super.setHaloTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setLabelBehavior(int i) {
        super.setLabelBehavior(i);
    }

    public void setLabelFormatter(@Nullable LabelFormatter labelFormatter) {
        this.S = labelFormatter;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setStepSize(float f) {
        super.setStepSize(f);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbElevation(float f) {
        super.setThumbElevation(f);
    }

    public void setThumbElevationResource(@DimenRes int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbHeight(@IntRange @Px int i) {
        super.setThumbHeight(i);
    }

    public void setThumbHeightResource(@DimenRes int i) {
        setThumbHeight(getResources().getDimensionPixelSize(i));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadius(@IntRange @Px int i) {
        super.setThumbRadius(i);
    }

    public void setThumbRadiusResource(@DimenRes int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeColor(@Nullable ColorStateList colorStateList) {
        super.setThumbStrokeColor(colorStateList);
    }

    public void setThumbStrokeColorResource(@ColorRes int i) {
        if (i != 0) {
            setThumbStrokeColor(ContextCompat.c(i, getContext()));
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float f) {
        super.setThumbStrokeWidth(f);
    }

    public void setThumbStrokeWidthResource(@DimenRes int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.s0;
        if (colorStateList.equals(materialShapeDrawable.d.c)) {
            return;
        }
        materialShapeDrawable.m(colorStateList);
        invalidate();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbTrackGapSize(@Px int i) {
        super.setThumbTrackGapSize(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbWidth(@IntRange @Px int i) {
        super.setThumbWidth(i);
    }

    public void setThumbWidthResource(@DimenRes int i) {
        setThumbWidth(getResources().getDimensionPixelSize(i));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickActiveRadius(@IntRange @Px int i) {
        super.setTickActiveRadius(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        super.setTickActiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickInactiveRadius(@IntRange @Px int i) {
        super.setTickInactiveRadius(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        super.setTickInactiveTintList(colorStateList);
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.e0 != z) {
            this.e0 = z;
            postInvalidate();
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        super.setTrackActiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackHeight(@IntRange @Px int i) {
        super.setTrackHeight(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        super.setTrackInactiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackInsideCornerSize(@Px int i) {
        super.setTrackInsideCornerSize(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackStopIndicatorSize(@Px int i) {
        super.setTrackStopIndicatorSize(i);
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValue(float f) {
        setValues(Float.valueOf(f));
    }

    public void setValueFrom(float f) {
        this.U = f;
        this.j0 = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.V = f;
        this.j0 = true;
        postInvalidate();
    }

    public Slider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    public void setCustomThumbDrawable(@DrawableRes int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    public Slider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.value});
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setValue(typedArrayObtainStyledAttributes.getFloat(0, BitmapDescriptorFactory.HUE_RED));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
