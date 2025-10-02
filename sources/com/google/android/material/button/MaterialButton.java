package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class MaterialButton extends AppCompatButton implements Checkable, Shapeable {
    public static final int[] r = {R.attr.state_checkable};
    public static final int[] s = {R.attr.state_checked};
    public final MaterialButtonHelper d;
    public final LinkedHashSet e;
    public OnPressedChangeListener f;
    public PorterDuff.Mode g;
    public ColorStateList h;
    public Drawable i;
    public String j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;

    @Retention(RetentionPolicy.SOURCE)
    public @interface IconGravity {
    }

    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* renamed from: a, reason: collision with root package name */
        public int f14526a;

        public final void mapProperties(PropertyMapper propertyMapper) {
            this.f14526a = propertyMapper.mapInt("iconPadding", com.woolworths.R.attr.iconPadding);
        }

        public final void readProperties(Object obj, PropertyReader propertyReader) {
            propertyReader.readInt(this.f14526a, ((MaterialButton) obj).getIconPadding());
        }
    }

    public interface OnCheckedChangeListener {
        void a();
    }

    public interface OnPressedChangeListener {
        void a();
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public boolean f;

        /* renamed from: com.google.android.material.button.MaterialButton$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.f = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f ? 1 : 0);
        }
    }

    public MaterialButton(@NonNull Context context) {
        this(context, null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean a() {
        MaterialButtonHelper materialButtonHelper = this.d;
        return (materialButtonHelper == null || materialButtonHelper.o) ? false : true;
    }

    public final void b() {
        int i = this.q;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.i, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.i, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.i, null, null);
        }
    }

    public final void c(boolean z) {
        Drawable drawable = this.i;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.i = drawableMutate;
            drawableMutate.setTintList(this.h);
            PorterDuff.Mode mode = this.g;
            if (mode != null) {
                this.i.setTintMode(mode);
            }
            int intrinsicWidth = this.k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i = this.l;
            int i2 = this.m;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.i.setVisible(true, z);
        }
        if (z) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.q;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.i) || (((i3 == 3 || i3 == 4) && drawable5 != this.i) || ((i3 == 16 || i3 == 32) && drawable4 != this.i))) {
            b();
        }
    }

    public final void d(int i, int i2) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        int i3 = this.q;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.l = 0;
                if (i3 == 16) {
                    this.m = 0;
                    c(false);
                    return;
                }
                int intrinsicHeight = this.k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.n) - getPaddingBottom()) / 2);
                if (this.m != iMax) {
                    this.m = iMax;
                    c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.q;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.l = 0;
            c(false);
            return;
        }
        int intrinsicWidth = this.k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.i.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.l != paddingEnd) {
            this.l = paddingEnd;
            c(false);
        }
    }

    @NonNull
    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.j)) {
            return this.j;
        }
        MaterialButtonHelper materialButtonHelper = this.d;
        return ((materialButtonHelper == null || !materialButtonHelper.q) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @Px
    public int getCornerRadius() {
        if (a()) {
            return this.d.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.q;
    }

    @Px
    public int getIconPadding() {
        return this.n;
    }

    @Px
    public int getIconSize() {
        return this.k;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.g;
    }

    @Dimension
    public int getInsetBottom() {
        return this.d.f;
    }

    @Dimension
    public int getInsetTop() {
        return this.d.e;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        if (a()) {
            return this.d.l;
        }
        return null;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        if (a()) {
            return this.d.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.d.k;
        }
        return null;
    }

    @Px
    public int getStrokeWidth() {
        if (a()) {
            return this.d.h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @Nullable
    @RestrictTo
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.d.j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.d.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.o;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            MaterialShapeUtils.c(this, this.d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        MaterialButtonHelper materialButtonHelper = this.d;
        if (materialButtonHelper != null && materialButtonHelper.q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, r);
        }
        if (this.o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, s);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.o);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        MaterialButtonHelper materialButtonHelper = this.d;
        accessibilityNodeInfo.setCheckable(materialButtonHelper != null && materialButtonHelper.q);
        accessibilityNodeInfo.setChecked(this.o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        setChecked(savedState.f);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f = this.o;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.d.r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.i != null) {
            if (this.i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(@Nullable String str) {
        this.j = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i) {
        if (!a()) {
            super.setBackgroundColor(i);
            return;
        }
        MaterialButtonHelper materialButtonHelper = this.d;
        if (materialButtonHelper.b(false) != null) {
            materialButtonHelper.b(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        MaterialButtonHelper materialButtonHelper = this.d;
        materialButtonHelper.o = true;
        MaterialButton materialButton = materialButtonHelper.f14527a;
        materialButton.setSupportBackgroundTintList(materialButtonHelper.j);
        materialButton.setSupportBackgroundTintMode(materialButtonHelper.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        setBackgroundDrawable(i != 0 ? AppCompatResources.b(i, getContext()) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (a()) {
            this.d.q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        MaterialButtonHelper materialButtonHelper = this.d;
        if (materialButtonHelper == null || !materialButtonHelper.q || !isEnabled() || this.o == z) {
            return;
        }
        this.o = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.o;
            if (!materialButtonToggleGroup.i) {
                materialButtonToggleGroup.b(getId(), z2);
            }
        }
        if (this.p) {
            return;
        }
        this.p = true;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((OnCheckedChangeListener) it.next()).a();
        }
        this.p = false;
    }

    public void setCornerRadius(@Px int i) {
        if (a()) {
            MaterialButtonHelper materialButtonHelper = this.d;
            if (materialButtonHelper.p && materialButtonHelper.g == i) {
                return;
            }
            materialButtonHelper.g = i;
            materialButtonHelper.p = true;
            ShapeAppearanceModel.Builder builderG = materialButtonHelper.b.g();
            builderG.b(i);
            materialButtonHelper.c(builderG.a());
        }
    }

    public void setCornerRadiusResource(@DimenRes int i) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    @RequiresApi
    public void setElevation(float f) {
        super.setElevation(f);
        if (a()) {
            this.d.b(false).l(f);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.q != i) {
            this.q = i;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@Px int i) {
        if (this.n != i) {
            this.n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(@DrawableRes int i) {
        setIcon(i != 0 ? AppCompatResources.b(i, getContext()) : null);
    }

    public void setIconSize(@Px int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.k != i) {
            this.k = i;
            c(true);
        }
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.g != mode) {
            this.g = mode;
            c(false);
        }
    }

    public void setIconTintResource(@ColorRes int i) {
        setIconTint(ContextCompat.c(i, getContext()));
    }

    public void setInsetBottom(@Dimension int i) {
        MaterialButtonHelper materialButtonHelper = this.d;
        materialButtonHelper.d(materialButtonHelper.e, i);
    }

    public void setInsetTop(@Dimension int i) {
        MaterialButtonHelper materialButtonHelper = this.d;
        materialButtonHelper.d(i, materialButtonHelper.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@Nullable OnPressedChangeListener onPressedChangeListener) {
        this.f = onPressedChangeListener;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        OnPressedChangeListener onPressedChangeListener = this.f;
        if (onPressedChangeListener != null) {
            onPressedChangeListener.a();
        }
        super.setPressed(z);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (a()) {
            MaterialButtonHelper materialButtonHelper = this.d;
            MaterialButton materialButton = materialButtonHelper.f14527a;
            if (materialButtonHelper.l != colorStateList) {
                materialButtonHelper.l = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(RippleUtils.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(@ColorRes int i) {
        if (a()) {
            setRippleColor(ContextCompat.c(i, getContext()));
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.d.c(shapeAppearanceModel);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (a()) {
            MaterialButtonHelper materialButtonHelper = this.d;
            materialButtonHelper.n = z;
            materialButtonHelper.f();
        }
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (a()) {
            MaterialButtonHelper materialButtonHelper = this.d;
            if (materialButtonHelper.k != colorStateList) {
                materialButtonHelper.k = colorStateList;
                materialButtonHelper.f();
            }
        }
    }

    public void setStrokeColorResource(@ColorRes int i) {
        if (a()) {
            setStrokeColor(ContextCompat.c(i, getContext()));
        }
    }

    public void setStrokeWidth(@Px int i) {
        if (a()) {
            MaterialButtonHelper materialButtonHelper = this.d;
            if (materialButtonHelper.h != i) {
                materialButtonHelper.h = i;
                materialButtonHelper.f();
            }
        }
    }

    public void setStrokeWidthResource(@DimenRes int i) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @RestrictTo
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        MaterialButtonHelper materialButtonHelper = this.d;
        if (materialButtonHelper.j != colorStateList) {
            materialButtonHelper.j = colorStateList;
            if (materialButtonHelper.b(false) != null) {
                materialButtonHelper.b(false).setTintList(materialButtonHelper.j);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @RestrictTo
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        MaterialButtonHelper materialButtonHelper = this.d;
        if (materialButtonHelper.i != mode) {
            materialButtonHelper.i = mode;
            if (materialButtonHelper.b(false) == null || materialButtonHelper.i == null) {
                return;
            }
            materialButtonHelper.b(false).setTintMode(materialButtonHelper.i);
        }
    }

    @Override // android.view.View
    @RequiresApi
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.d.r = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.o);
    }

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.woolworths.R.attr.materialButtonStyle);
    }

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.a(context, attributeSet, i, 2132084082), attributeSet, i);
        this.e = new LinkedHashSet();
        this.o = false;
        this.p = false;
        Context context2 = getContext();
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.A, i, 2132084082, new int[0]);
        this.n = typedArrayD.getDimensionPixelSize(12, 0);
        int i2 = typedArrayD.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.g = ViewUtils.i(i2, mode);
        this.h = MaterialResources.a(getContext(), typedArrayD, 14);
        this.i = MaterialResources.d(getContext(), typedArrayD, 10);
        this.q = typedArrayD.getInteger(11, 1);
        this.k = typedArrayD.getDimensionPixelSize(13, 0);
        MaterialButtonHelper materialButtonHelper = new MaterialButtonHelper(this, ShapeAppearanceModel.d(context2, attributeSet, i, 2132084082).a());
        this.d = materialButtonHelper;
        materialButtonHelper.c = typedArrayD.getDimensionPixelOffset(1, 0);
        materialButtonHelper.d = typedArrayD.getDimensionPixelOffset(2, 0);
        materialButtonHelper.e = typedArrayD.getDimensionPixelOffset(3, 0);
        materialButtonHelper.f = typedArrayD.getDimensionPixelOffset(4, 0);
        if (typedArrayD.hasValue(8)) {
            int dimensionPixelSize = typedArrayD.getDimensionPixelSize(8, -1);
            materialButtonHelper.g = dimensionPixelSize;
            ShapeAppearanceModel.Builder builderG = materialButtonHelper.b.g();
            builderG.b(dimensionPixelSize);
            materialButtonHelper.c(builderG.a());
            materialButtonHelper.p = true;
        }
        materialButtonHelper.h = typedArrayD.getDimensionPixelSize(20, 0);
        materialButtonHelper.i = ViewUtils.i(typedArrayD.getInt(7, -1), mode);
        materialButtonHelper.j = MaterialResources.a(getContext(), typedArrayD, 6);
        materialButtonHelper.k = MaterialResources.a(getContext(), typedArrayD, 19);
        materialButtonHelper.l = MaterialResources.a(getContext(), typedArrayD, 16);
        materialButtonHelper.q = typedArrayD.getBoolean(5, false);
        materialButtonHelper.t = typedArrayD.getDimensionPixelSize(9, 0);
        materialButtonHelper.r = typedArrayD.getBoolean(21, true);
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayD.hasValue(0)) {
            materialButtonHelper.o = true;
            setSupportBackgroundTintList(materialButtonHelper.j);
            setSupportBackgroundTintMode(materialButtonHelper.i);
        } else {
            materialButtonHelper.e();
        }
        setPaddingRelative(paddingStart + materialButtonHelper.c, paddingTop + materialButtonHelper.e, paddingEnd + materialButtonHelper.d, paddingBottom + materialButtonHelper.f);
        typedArrayD.recycle();
        setCompoundDrawablePadding(this.n);
        c(this.i != null);
    }
}
