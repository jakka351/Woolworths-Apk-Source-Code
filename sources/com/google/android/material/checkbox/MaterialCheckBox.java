package com.google.android.material.checkbox;

import YU.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.TintTypedArray;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.woolworths.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes6.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    public static final int[] B = {R.attr.state_indeterminate};
    public static final int[] C = {R.attr.state_error};
    public static final int[][] D = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int E = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public final Animatable2Compat.AnimationCallback A;
    public final LinkedHashSet h;
    public final LinkedHashSet i;
    public ColorStateList j;
    public boolean k;
    public boolean l;
    public boolean m;
    public CharSequence n;
    public Drawable o;
    public Drawable p;
    public boolean q;
    public ColorStateList r;
    public ColorStateList s;
    public PorterDuff.Mode t;
    public int u;
    public int[] v;
    public boolean w;
    public CharSequence x;
    public CompoundButton.OnCheckedChangeListener y;
    public final AnimatedVectorDrawableCompat z;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface CheckedState {
    }

    public interface OnCheckedStateChangedListener {
        void a();
    }

    public interface OnErrorChangedListener {
        void a();
    }

    public static class SavedState extends View.BaseSavedState {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public int d;

        /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.d = ((Integer) parcel.readValue(SavedState.class.getClassLoader())).intValue();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" CheckedState=");
            int i = this.d;
            return a.o(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.d));
        }
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    @NonNull
    private String getButtonStateDescription() {
        int i = this.u;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.j == null) {
            int iB = MaterialColors.b(R.attr.colorControlActivated, this);
            int iB2 = MaterialColors.b(R.attr.colorError, this);
            int iB3 = MaterialColors.b(R.attr.colorSurface, this);
            int iB4 = MaterialColors.b(R.attr.colorOnSurface, this);
            this.j = new ColorStateList(D, new int[]{MaterialColors.g(1.0f, iB3, iB2), MaterialColors.g(1.0f, iB3, iB), MaterialColors.g(0.54f, iB3, iB4), MaterialColors.g(0.38f, iB3, iB4), MaterialColors.g(0.38f, iB3, iB4)});
        }
        return this.j;
    }

    @Nullable
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.r;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void b() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        this.o = DrawableUtils.b(this.o, this.r, getButtonTintMode());
        this.p = DrawableUtils.b(this.p, this.s, this.t);
        if (this.q) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.z;
            if (animatedVectorDrawableCompat != null) {
                Animatable2Compat.AnimationCallback animationCallback = this.A;
                animatedVectorDrawableCompat.c(animationCallback);
                animatedVectorDrawableCompat.b(animationCallback);
            }
            Drawable drawable = this.o;
            if ((drawable instanceof AnimatedStateListDrawable) && animatedVectorDrawableCompat != null) {
                ((AnimatedStateListDrawable) drawable).addTransition(R.id.checked, R.id.unchecked, animatedVectorDrawableCompat, false);
                ((AnimatedStateListDrawable) this.o).addTransition(R.id.indeterminate, R.id.unchecked, animatedVectorDrawableCompat, false);
            }
        }
        Drawable drawable2 = this.o;
        if (drawable2 != null && (colorStateList2 = this.r) != null) {
            drawable2.setTintList(colorStateList2);
        }
        Drawable drawable3 = this.p;
        if (drawable3 != null && (colorStateList = this.s) != null) {
            drawable3.setTintList(colorStateList);
        }
        super.setButtonDrawable(DrawableUtils.a(this.o, this.p, -1, -1));
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public Drawable getButtonDrawable() {
        return this.o;
    }

    @Nullable
    public Drawable getButtonIconDrawable() {
        return this.p;
    }

    @Nullable
    public ColorStateList getButtonIconTintList() {
        return this.s;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.t;
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public ColorStateList getButtonTintList() {
        return this.r;
    }

    public int getCheckedState() {
        return this.u;
    }

    @Nullable
    public CharSequence getErrorAccessibilityLabel() {
        return this.n;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.u == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.k && this.r == null && this.s == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, B);
        }
        if (this.m) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, C);
        }
        this.v = DrawableUtils.c(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.l || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (ViewUtils.h(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, BitmapDescriptorFactory.HUE_RED);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.m) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.n));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.d);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.d = getCheckedState();
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i) {
        setButtonDrawable(AppCompatResources.b(i, getContext()));
    }

    public void setButtonIconDrawable(@Nullable Drawable drawable) {
        this.p = drawable;
        b();
    }

    public void setButtonIconDrawableResource(@DrawableRes int i) {
        setButtonIconDrawable(AppCompatResources.b(i, getContext()));
    }

    public void setButtonIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.s == colorStateList) {
            return;
        }
        this.s = colorStateList;
        b();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.t == mode) {
            return;
        }
        this.t = mode;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(@Nullable ColorStateList colorStateList) {
        if (this.r == colorStateList) {
            return;
        }
        this.r = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.l = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.u != i) {
            this.u = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.x == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.w) {
                return;
            }
            this.w = true;
            LinkedHashSet linkedHashSet = this.i;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((OnCheckedStateChangedListener) it.next()).a();
                }
            }
            if (this.u != 2 && (onCheckedChangeListener = this.y) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.w = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(@Nullable CharSequence charSequence) {
        this.n = charSequence;
    }

    public void setErrorAccessibilityLabelResource(@StringRes int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.m == z) {
            return;
        }
        this.m = z;
        refreshDrawableState();
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((OnErrorChangedListener) it.next()).a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.y = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    @RequiresApi
    public void setStateDescription(@Nullable CharSequence charSequence) {
        this.x = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.k = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public MaterialCheckBox(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@Nullable Drawable drawable) {
        this.o = drawable;
        this.q = false;
        b();
    }

    public MaterialCheckBox(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.a(context, attributeSet, i, 2132084106), attributeSet, i);
        this.h = new LinkedHashSet();
        this.i = new LinkedHashSet();
        this.z = AnimatedVectorDrawableCompat.a(R.drawable.mtrl_checkbox_button_checked_unchecked, getContext());
        this.A = new Animatable2Compat.AnimationCallback() { // from class: com.google.android.material.checkbox.MaterialCheckBox.1
            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            public final void a(Drawable drawable) {
                ColorStateList colorStateList = MaterialCheckBox.this.r;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                }
            }

            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            public final void b(Drawable drawable) {
                MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
                ColorStateList colorStateList = materialCheckBox.r;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(materialCheckBox.v, colorStateList.getDefaultColor()));
                }
            }
        };
        Context context2 = getContext();
        this.o = getButtonDrawable();
        this.r = getSuperButtonTintList();
        setSupportButtonTintList(null);
        TintTypedArray tintTypedArrayE = ThemeEnforcement.e(context2, attributeSet, com.google.android.material.R.styleable.F, i, 2132084106, new int[0]);
        TypedArray typedArray = tintTypedArrayE.b;
        this.p = tintTypedArrayE.b(2);
        if (this.o != null && MaterialAttributes.b(context2, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == E && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.o = AppCompatResources.b(R.drawable.mtrl_checkbox_button, context2);
                this.q = true;
                if (this.p == null) {
                    this.p = AppCompatResources.b(R.drawable.mtrl_checkbox_button_icon, context2);
                }
            }
        }
        this.s = MaterialResources.b(context2, tintTypedArrayE, 3);
        this.t = ViewUtils.i(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.k = typedArray.getBoolean(10, false);
        this.l = typedArray.getBoolean(6, true);
        this.m = typedArray.getBoolean(9, false);
        this.n = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        tintTypedArrayE.g();
        b();
    }
}
