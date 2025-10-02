package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.text.TextDirectionHeuristicCompat;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.chip.ChipDrawable;
import com.google.android.material.internal.MaterialCheckable;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.woolworths.scanlibrary.ui.tandc.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class Chip extends AppCompatCheckBox implements ChipDrawable.Delegate, Shapeable, MaterialCheckable<Chip> {
    public static final Rect A = new Rect();
    public static final int[] B = {R.attr.state_selected};
    public static final int[] C = {R.attr.state_checkable};
    public ChipDrawable h;
    public InsetDrawable i;
    public RippleDrawable j;
    public View.OnClickListener k;
    public CompoundButton.OnCheckedChangeListener l;
    public MaterialCheckable.OnCheckedChangeListener m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public CharSequence u;
    public final ChipTouchHelper v;
    public boolean w;
    public final Rect x;
    public final RectF y;
    public final TextAppearanceFontCallback z;

    public class ChipTouchHelper extends ExploreByTouchHelper {
        public ChipTouchHelper(Chip chip) {
            super(chip);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final int n(float f, float f2) {
            Rect rect = Chip.A;
            Chip chip = Chip.this;
            return (chip.e() && chip.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void o(ArrayList arrayList) {
            ChipDrawable chipDrawable;
            arrayList.add(0);
            Rect rect = Chip.A;
            Chip chip = Chip.this;
            if (!chip.e() || (chipDrawable = chip.h) == null || !chipDrawable.O || chip.k == null) {
                return;
            }
            arrayList.add(1);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final boolean s(int i, int i2, Bundle bundle) {
            boolean z = false;
            if (i2 == 16) {
                Chip chip = Chip.this;
                if (i == 0) {
                    return chip.performClick();
                }
                if (i == 1) {
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.k;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z = true;
                    }
                    if (chip.w) {
                        chip.v.x(1, 1);
                    }
                }
            }
            return z;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void t(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            Chip chip = Chip.this;
            ChipDrawable chipDrawable = chip.h;
            accessibilityNodeInfoCompat.f2508a.setCheckable(chipDrawable != null && chipDrawable.U);
            accessibilityNodeInfoCompat.m(chip.isClickable());
            accessibilityNodeInfoCompat.l(chip.getAccessibilityClassName());
            accessibilityNodeInfoCompat.s(chip.getText());
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void u(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f2508a;
            if (i != 1) {
                accessibilityNodeInfoCompat.p("");
                accessibilityNodeInfo.setBoundsInParent(Chip.A);
                return;
            }
            Chip chip = Chip.this;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfoCompat.p(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                accessibilityNodeInfoCompat.p(chip.getContext().getString(com.woolworths.R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
            accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.g);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void v(int i, boolean z) {
            if (i == 1) {
                Chip chip = Chip.this;
                chip.q = z;
                chip.refreshDrawableState();
            }
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.y;
        rectF.setEmpty();
        if (e() && this.k != null) {
            ChipDrawable chipDrawable = this.h;
            Rect bounds = chipDrawable.getBounds();
            rectF.setEmpty();
            if (chipDrawable.c0()) {
                float f = chipDrawable.h0 + chipDrawable.g0 + chipDrawable.S + chipDrawable.f0 + chipDrawable.e0;
                if (chipDrawable.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.x;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    @Nullable
    private TextAppearance getTextAppearance() {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            return chipDrawable.o0.g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.p != z) {
            this.p = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.o != z) {
            this.o = z;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.ChipDrawable.Delegate
    public final void a() {
        d(this.t);
        requestLayout();
        invalidateOutline();
    }

    public final void d(int i) {
        this.t = i;
        if (!this.r) {
            InsetDrawable insetDrawable = this.i;
            if (insetDrawable == null) {
                g();
                return;
            } else {
                if (insetDrawable != null) {
                    this.i = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    g();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.h.D));
        int iMax2 = Math.max(0, i - this.h.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.i;
            if (insetDrawable2 == null) {
                g();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.i = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    g();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.i != null) {
            Rect rect = new Rect();
            this.i.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                g();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.i = new InsetDrawable((Drawable) this.h, i2, i3, i2, i3);
        g();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.w ? super.dispatchHoverEvent(motionEvent) : this.v.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.w
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            com.google.android.material.chip.Chip$ChipTouchHelper r0 = r9.v
            r0.getClass()
            int r1 = r10.getAction()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1
            r4 = 0
            if (r1 == r3) goto L84
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L6e
            r5 = 66
            if (r1 == r5) goto L57
            switch(r1) {
                case 19: goto L29;
                case 20: goto L29;
                case 21: goto L29;
                case 22: goto L29;
                case 23: goto L57;
                default: goto L28;
            }
        L28:
            goto L84
        L29:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L84
            r7 = 19
            if (r1 == r7) goto L41
            r7 = 21
            if (r1 == r7) goto L3e
            r7 = 22
            if (r1 == r7) goto L43
            r5 = 130(0x82, float:1.82E-43)
            goto L43
        L3e:
            r5 = 17
            goto L43
        L41:
            r5 = 33
        L43:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r3
            r7 = r4
        L49:
            if (r4 >= r1) goto L55
            boolean r8 = r0.q(r5, r6)
            if (r8 == 0) goto L55
            int r4 = r4 + 1
            r7 = r3
            goto L49
        L55:
            r4 = r7
            goto L84
        L57:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L84
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L84
            int r1 = r0.l
            if (r1 == r2) goto L6c
            r4 = 16
            r0.s(r1, r4, r6)
        L6c:
            r4 = r3
            goto L84
        L6e:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L7a
            r1 = 2
            boolean r4 = r0.q(r1, r6)
            goto L84
        L7a:
            boolean r1 = r10.hasModifiers(r3)
            if (r1 == 0) goto L84
            boolean r4 = r0.q(r3, r6)
        L84:
            if (r4 == 0) goto L8b
            int r0 = r0.l
            if (r0 == r2) goto L8b
            return r3
        L8b:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        ChipDrawable chipDrawable = this.h;
        boolean zF = false;
        if (chipDrawable != null && ChipDrawable.D(chipDrawable.P)) {
            ChipDrawable chipDrawable2 = this.h;
            ?? IsEnabled = isEnabled();
            int i2 = IsEnabled;
            if (this.q) {
                i2 = IsEnabled + 1;
            }
            int i3 = i2;
            if (this.p) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.o) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.q) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.p) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.o) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(chipDrawable2.C0, iArr)) {
                chipDrawable2.C0 = iArr;
                if (chipDrawable2.c0()) {
                    zF = chipDrawable2.F(chipDrawable2.getState(), iArr);
                }
            }
        }
        if (zF) {
            invalidate();
        }
    }

    public final boolean e() {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable == null) {
            return false;
        }
        Drawable drawable = chipDrawable.P;
        return (drawable != null ? DrawableCompat.o(drawable) : null) != null;
    }

    public final void f() {
        ChipDrawable chipDrawable;
        if (!e() || (chipDrawable = this.h) == null || !chipDrawable.O || this.k == null) {
            ViewCompat.A(this, null);
            this.w = false;
        } else {
            ViewCompat.A(this, this.v);
            this.w = true;
        }
    }

    public final void g() {
        this.j = new RippleDrawable(RippleUtils.c(this.h.H), getBackgroundDrawable(), null);
        this.h.getClass();
        RippleDrawable rippleDrawable = this.j;
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        setBackground(rippleDrawable);
        h();
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.u)) {
            return this.u;
        }
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable == null || !chipDrawable.U) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).k.d) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    @Nullable
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.i;
        return insetDrawable == null ? this.h : insetDrawable;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            return chipDrawable.W;
        }
        return null;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            return chipDrawable.X;
        }
        return null;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            return chipDrawable.C;
        }
        return null;
    }

    public float getChipCornerRadius() {
        ChipDrawable chipDrawable = this.h;
        return chipDrawable != null ? Math.max(BitmapDescriptorFactory.HUE_RED, chipDrawable.B()) : BitmapDescriptorFactory.HUE_RED;
    }

    public Drawable getChipDrawable() {
        return this.h;
    }

    public float getChipEndPadding() {
        ChipDrawable chipDrawable = this.h;
        return chipDrawable != null ? chipDrawable.h0 : BitmapDescriptorFactory.HUE_RED;
    }

    @Nullable
    public Drawable getChipIcon() {
        Drawable drawable;
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable == null || (drawable = chipDrawable.K) == null) {
            return null;
        }
        return DrawableCompat.o(drawable);
    }

    public float getChipIconSize() {
        ChipDrawable chipDrawable = this.h;
        return chipDrawable != null ? chipDrawable.M : BitmapDescriptorFactory.HUE_RED;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            return chipDrawable.L;
        }
        return null;
    }

    public float getChipMinHeight() {
        ChipDrawable chipDrawable = this.h;
        return chipDrawable != null ? chipDrawable.D : BitmapDescriptorFactory.HUE_RED;
    }

    public float getChipStartPadding() {
        ChipDrawable chipDrawable = this.h;
        return chipDrawable != null ? chipDrawable.a0 : BitmapDescriptorFactory.HUE_RED;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            return chipDrawable.F;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        ChipDrawable chipDrawable = this.h;
        return chipDrawable != null ? chipDrawable.G : BitmapDescriptorFactory.HUE_RED;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @Nullable
    public Drawable getCloseIcon() {
        Drawable drawable;
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable == null || (drawable = chipDrawable.P) == null) {
            return null;
        }
        return DrawableCompat.o(drawable);
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            return chipDrawable.T;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        ChipDrawable chipDrawable = this.h;
        return chipDrawable != null ? chipDrawable.g0 : BitmapDescriptorFactory.HUE_RED;
    }

    public float getCloseIconSize() {
        ChipDrawable chipDrawable = this.h;
        return chipDrawable != null ? chipDrawable.S : BitmapDescriptorFactory.HUE_RED;
    }

    public float getCloseIconStartPadding() {
        ChipDrawable chipDrawable = this.h;
        return chipDrawable != null ? chipDrawable.f0 : BitmapDescriptorFactory.HUE_RED;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            return chipDrawable.R;
        }
        return null;
    }

    @Override // android.widget.TextView
    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            return chipDrawable.F0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.w) {
            ChipTouchHelper chipTouchHelper = this.v;
            if (chipTouchHelper.l == 1 || chipTouchHelper.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            return chipDrawable.Z;
        }
        return null;
    }

    public float getIconEndPadding() {
        ChipDrawable chipDrawable = this.h;
        return chipDrawable != null ? chipDrawable.c0 : BitmapDescriptorFactory.HUE_RED;
    }

    public float getIconStartPadding() {
        ChipDrawable chipDrawable = this.h;
        return chipDrawable != null ? chipDrawable.b0 : BitmapDescriptorFactory.HUE_RED;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            return chipDrawable.H;
        }
        return null;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.h.d.f14634a;
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            return chipDrawable.Y;
        }
        return null;
    }

    public float getTextEndPadding() {
        ChipDrawable chipDrawable = this.h;
        return chipDrawable != null ? chipDrawable.e0 : BitmapDescriptorFactory.HUE_RED;
    }

    public float getTextStartPadding() {
        ChipDrawable chipDrawable = this.h;
        return chipDrawable != null ? chipDrawable.d0 : BitmapDescriptorFactory.HUE_RED;
    }

    public final void h() {
        ChipDrawable chipDrawable;
        if (TextUtils.isEmpty(getText()) || (chipDrawable = this.h) == null) {
            return;
        }
        int iA = (int) (chipDrawable.A() + chipDrawable.h0 + chipDrawable.e0);
        ChipDrawable chipDrawable2 = this.h;
        int iZ = (int) (chipDrawable2.z() + chipDrawable2.a0 + chipDrawable2.d0);
        if (this.i != null) {
            Rect rect = new Rect();
            this.i.getPadding(rect);
            iZ += rect.left;
            iA += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        setPaddingRelative(iZ, paddingTop, iA, paddingBottom);
    }

    public final void i() {
        TextPaint paint = getPaint();
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            paint.drawableState = chipDrawable.getState();
        }
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.z);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.c(this, this.h);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, B);
        }
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null && chipDrawable.U) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, C);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.w) {
            ChipTouchHelper chipTouchHelper = this.v;
            int i2 = chipTouchHelper.l;
            if (i2 != Integer.MIN_VALUE) {
                chipTouchHelper.j(i2);
            }
            if (z) {
                chipTouchHelper.q(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        ChipDrawable chipDrawable = this.h;
        int i2 = 0;
        accessibilityNodeInfo.setCheckable(chipDrawable != null && chipDrawable.U);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
            if (chipGroup.f) {
                int i3 = 0;
                while (true) {
                    if (i2 >= chipGroup.getChildCount()) {
                        i3 = -1;
                        break;
                    }
                    View childAt = chipGroup.getChildAt(i2);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i2).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    i2++;
                }
                i = i3;
            } else {
                i = -1;
            }
            Object tag = getTag(com.woolworths.R.id.row_index_key);
            accessibilityNodeInfoCompat.o(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.s != i) {
            this.s = i;
            h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.o
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.o
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.k
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.w
            if (r0 == 0) goto L43
            com.google.android.material.chip.Chip$ChipTouchHelper r0 = r5.v
            r0.x(r2, r2)
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r3
        L46:
            r5.setCloseIconPressed(r3)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
            goto L2a
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            return r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(@Nullable CharSequence charSequence) {
        this.u = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.j) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.j) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.G(z);
        }
    }

    public void setCheckableResource(@BoolRes int i) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.G(chipDrawable.i0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable == null) {
            this.n = z;
        } else if (chipDrawable.U) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.H(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(@DrawableRes int i) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.H(AppCompatResources.b(i, chipDrawable.i0));
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.I(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@ColorRes int i) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.I(ContextCompat.c(i, chipDrawable.i0));
        }
    }

    public void setCheckedIconVisible(@BoolRes int i) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.J(chipDrawable.i0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable == null || chipDrawable.C == colorStateList) {
            return;
        }
        chipDrawable.C = colorStateList;
        chipDrawable.onStateChange(chipDrawable.getState());
    }

    public void setChipBackgroundColorResource(@ColorRes int i) {
        ColorStateList colorStateListC;
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable == null || chipDrawable.C == (colorStateListC = ContextCompat.c(i, chipDrawable.i0))) {
            return;
        }
        chipDrawable.C = colorStateListC;
        chipDrawable.onStateChange(chipDrawable.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.K(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.K(chipDrawable.i0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(@NonNull ChipDrawable chipDrawable) {
        ChipDrawable chipDrawable2 = this.h;
        if (chipDrawable2 != chipDrawable) {
            if (chipDrawable2 != null) {
                chipDrawable2.E0 = new WeakReference(null);
            }
            this.h = chipDrawable;
            chipDrawable.G0 = false;
            chipDrawable.E0 = new WeakReference(this);
            d(this.t);
        }
    }

    public void setChipEndPadding(float f) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable == null || chipDrawable.h0 == f) {
            return;
        }
        chipDrawable.h0 = f;
        chipDrawable.invalidateSelf();
        chipDrawable.E();
    }

    public void setChipEndPaddingResource(@DimenRes int i) throws Resources.NotFoundException {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            float dimension = chipDrawable.i0.getResources().getDimension(i);
            if (chipDrawable.h0 != dimension) {
                chipDrawable.h0 = dimension;
                chipDrawable.invalidateSelf();
                chipDrawable.E();
            }
        }
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.L(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(@DrawableRes int i) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.L(AppCompatResources.b(i, chipDrawable.i0));
        }
    }

    public void setChipIconSize(float f) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.M(f);
        }
    }

    public void setChipIconSizeResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.M(chipDrawable.i0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.N(colorStateList);
        }
    }

    public void setChipIconTintResource(@ColorRes int i) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.N(ContextCompat.c(i, chipDrawable.i0));
        }
    }

    public void setChipIconVisible(@BoolRes int i) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.O(chipDrawable.i0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable == null || chipDrawable.D == f) {
            return;
        }
        chipDrawable.D = f;
        chipDrawable.invalidateSelf();
        chipDrawable.E();
    }

    public void setChipMinHeightResource(@DimenRes int i) throws Resources.NotFoundException {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            float dimension = chipDrawable.i0.getResources().getDimension(i);
            if (chipDrawable.D != dimension) {
                chipDrawable.D = dimension;
                chipDrawable.invalidateSelf();
                chipDrawable.E();
            }
        }
    }

    public void setChipStartPadding(float f) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable == null || chipDrawable.a0 == f) {
            return;
        }
        chipDrawable.a0 = f;
        chipDrawable.invalidateSelf();
        chipDrawable.E();
    }

    public void setChipStartPaddingResource(@DimenRes int i) throws Resources.NotFoundException {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            float dimension = chipDrawable.i0.getResources().getDimension(i);
            if (chipDrawable.a0 != dimension) {
                chipDrawable.a0 = dimension;
                chipDrawable.invalidateSelf();
                chipDrawable.E();
            }
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.P(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@ColorRes int i) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.P(ContextCompat.c(i, chipDrawable.i0));
        }
    }

    public void setChipStrokeWidth(float f) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.Q(f);
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.Q(chipDrawable.i0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(@Nullable CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@StringRes int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.R(drawable);
        }
        f();
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable == null || chipDrawable.T == charSequence) {
            return;
        }
        BidiFormatter bidiFormatterC = BidiFormatter.c();
        bidiFormatterC.getClass();
        TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.f2459a;
        chipDrawable.T = bidiFormatterC.d(charSequence);
        chipDrawable.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.S(f);
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.S(chipDrawable.i0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(@DrawableRes int i) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.R(AppCompatResources.b(i, chipDrawable.i0));
        }
        f();
    }

    public void setCloseIconSize(float f) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.T(f);
        }
    }

    public void setCloseIconSizeResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.T(chipDrawable.i0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.U(f);
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.U(chipDrawable.i0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.V(colorStateList);
        }
    }

    public void setCloseIconTintResource(@ColorRes int i) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.V(ContextCompat.c(i, chipDrawable.i0));
        }
    }

    public void setCloseIconVisible(@BoolRes int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    @RequiresApi
    public void setElevation(float f) {
        super.setElevation(f);
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.l(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.h == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.F0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.r = z;
        d(this.t);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.Z = motionSpec;
        }
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.Z = MotionSpec.b(i, chipDrawable.i0);
        }
    }

    public void setIconEndPadding(float f) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.X(f);
        }
    }

    public void setIconEndPaddingResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.X(chipDrawable.i0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.Y(f);
        }
    }

    public void setIconStartPaddingResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.Y(chipDrawable.i0.getResources().getDimension(i));
        }
    }

    @Override // com.google.android.material.internal.MaterialCheckable
    @RestrictTo
    public void setInternalOnCheckedChangeListener(@Nullable MaterialCheckable.OnCheckedChangeListener<Chip> onCheckedChangeListener) {
        this.m = onCheckedChangeListener;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.h == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@Px int i) {
        super.setMaxWidth(i);
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.H0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.l = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.k = onClickListener;
        f();
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.Z(colorStateList);
        }
        this.h.getClass();
        g();
    }

    public void setRippleColorResource(@ColorRes int i) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.Z(ContextCompat.c(i, chipDrawable.i0));
            this.h.getClass();
            g();
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.h.setShapeAppearanceModel(shapeAppearanceModel);
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.Y = motionSpec;
        }
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.Y = MotionSpec.b(i, chipDrawable.i0);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(chipDrawable.G0 ? null : charSequence, bufferType);
        ChipDrawable chipDrawable2 = this.h;
        if (chipDrawable2 == null || TextUtils.equals(chipDrawable2.I, charSequence)) {
            return;
        }
        chipDrawable2.I = charSequence;
        chipDrawable2.o0.e = true;
        chipDrawable2.invalidateSelf();
        chipDrawable2.E();
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.o0.c(textAppearance, chipDrawable.i0);
        }
        i();
    }

    public void setTextAppearanceResource(@StyleRes int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable == null || chipDrawable.e0 == f) {
            return;
        }
        chipDrawable.e0 = f;
        chipDrawable.invalidateSelf();
        chipDrawable.E();
    }

    public void setTextEndPaddingResource(@DimenRes int i) throws Resources.NotFoundException {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            float dimension = chipDrawable.i0.getResources().getDimension(i);
            if (chipDrawable.e0 != dimension) {
                chipDrawable.e0 = dimension;
                chipDrawable.invalidateSelf();
                chipDrawable.E();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            TextDrawableHelper textDrawableHelper = chipDrawable.o0;
            TextAppearance textAppearance = textDrawableHelper.g;
            if (textAppearance != null) {
                textAppearance.k = fApplyDimension;
                textDrawableHelper.f14604a.setTextSize(fApplyDimension);
                chipDrawable.a();
            }
        }
        i();
    }

    public void setTextStartPadding(float f) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable == null || chipDrawable.d0 == f) {
            return;
        }
        chipDrawable.d0 = f;
        chipDrawable.invalidateSelf();
        chipDrawable.E();
    }

    public void setTextStartPaddingResource(@DimenRes int i) throws Resources.NotFoundException {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            float dimension = chipDrawable.i0.getResources().getDimension(i);
            if (chipDrawable.d0 != dimension) {
                chipDrawable.d0 = dimension;
                chipDrawable.invalidateSelf();
                chipDrawable.E();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.woolworths.R.attr.chipStyle);
    }

    public void setCloseIconVisible(boolean z) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.W(z);
        }
        f();
    }

    public Chip(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        super(MaterialThemeOverlay.a(context, attributeSet, i, 2132084096), attributeSet, i);
        this.x = new Rect();
        this.y = new RectF();
        this.z = new TextAppearanceFontCallback() { // from class: com.google.android.material.chip.Chip.1
            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public final void a(int i2) {
            }

            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public final void b(Typeface typeface, boolean z) {
                Chip chip = Chip.this;
                ChipDrawable chipDrawable = chip.h;
                chip.setText(chipDrawable.G0 ? chipDrawable.I : chip.getText());
                chip.requestLayout();
                chip.invalidate();
            }
        };
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        ChipDrawable chipDrawable = new ChipDrawable(context2, attributeSet, i);
        Context context3 = chipDrawable.i0;
        int[] iArr = com.google.android.material.R.styleable.j;
        TypedArray typedArrayD = ThemeEnforcement.d(context3, attributeSet, iArr, i, 2132084096, new int[0]);
        chipDrawable.I0 = typedArrayD.hasValue(37);
        Context context4 = chipDrawable.i0;
        ColorStateList colorStateListA = MaterialResources.a(context4, typedArrayD, 24);
        if (chipDrawable.B != colorStateListA) {
            chipDrawable.B = colorStateListA;
            chipDrawable.onStateChange(chipDrawable.getState());
        }
        ColorStateList colorStateListA2 = MaterialResources.a(context4, typedArrayD, 11);
        if (chipDrawable.C != colorStateListA2) {
            chipDrawable.C = colorStateListA2;
            chipDrawable.onStateChange(chipDrawable.getState());
        }
        float dimension = typedArrayD.getDimension(19, BitmapDescriptorFactory.HUE_RED);
        if (chipDrawable.D != dimension) {
            chipDrawable.D = dimension;
            chipDrawable.invalidateSelf();
            chipDrawable.E();
        }
        if (typedArrayD.hasValue(12)) {
            chipDrawable.K(typedArrayD.getDimension(12, BitmapDescriptorFactory.HUE_RED));
        }
        chipDrawable.P(MaterialResources.a(context4, typedArrayD, 22));
        chipDrawable.Q(typedArrayD.getDimension(23, BitmapDescriptorFactory.HUE_RED));
        chipDrawable.Z(MaterialResources.a(context4, typedArrayD, 36));
        String text = typedArrayD.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(chipDrawable.I, text);
        TextDrawableHelper textDrawableHelper = chipDrawable.o0;
        if (!zEquals) {
            chipDrawable.I = text;
            textDrawableHelper.e = true;
            chipDrawable.invalidateSelf();
            chipDrawable.E();
        }
        TextAppearance textAppearance = (!typedArrayD.hasValue(0) || (resourceId = typedArrayD.getResourceId(0, 0)) == 0) ? null : new TextAppearance(context4, resourceId);
        textAppearance.k = typedArrayD.getDimension(1, textAppearance.k);
        textDrawableHelper.c(textAppearance, context4);
        int i2 = typedArrayD.getInt(3, 0);
        if (i2 == 1) {
            chipDrawable.F0 = TextUtils.TruncateAt.START;
        } else if (i2 == 2) {
            chipDrawable.F0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i2 == 3) {
            chipDrawable.F0 = TextUtils.TruncateAt.END;
        }
        chipDrawable.O(typedArrayD.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            chipDrawable.O(typedArrayD.getBoolean(15, false));
        }
        chipDrawable.L(MaterialResources.d(context4, typedArrayD, 14));
        if (typedArrayD.hasValue(17)) {
            chipDrawable.N(MaterialResources.a(context4, typedArrayD, 17));
        }
        chipDrawable.M(typedArrayD.getDimension(16, -1.0f));
        chipDrawable.W(typedArrayD.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            chipDrawable.W(typedArrayD.getBoolean(26, false));
        }
        chipDrawable.R(MaterialResources.d(context4, typedArrayD, 25));
        chipDrawable.V(MaterialResources.a(context4, typedArrayD, 30));
        chipDrawable.T(typedArrayD.getDimension(28, BitmapDescriptorFactory.HUE_RED));
        chipDrawable.G(typedArrayD.getBoolean(6, false));
        chipDrawable.J(typedArrayD.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            chipDrawable.J(typedArrayD.getBoolean(8, false));
        }
        chipDrawable.H(MaterialResources.d(context4, typedArrayD, 7));
        if (typedArrayD.hasValue(9)) {
            chipDrawable.I(MaterialResources.a(context4, typedArrayD, 9));
        }
        chipDrawable.Y = MotionSpec.a(context4, typedArrayD, 39);
        chipDrawable.Z = MotionSpec.a(context4, typedArrayD, 33);
        float dimension2 = typedArrayD.getDimension(21, BitmapDescriptorFactory.HUE_RED);
        if (chipDrawable.a0 != dimension2) {
            chipDrawable.a0 = dimension2;
            chipDrawable.invalidateSelf();
            chipDrawable.E();
        }
        chipDrawable.Y(typedArrayD.getDimension(35, BitmapDescriptorFactory.HUE_RED));
        chipDrawable.X(typedArrayD.getDimension(34, BitmapDescriptorFactory.HUE_RED));
        float dimension3 = typedArrayD.getDimension(41, BitmapDescriptorFactory.HUE_RED);
        if (chipDrawable.d0 != dimension3) {
            chipDrawable.d0 = dimension3;
            chipDrawable.invalidateSelf();
            chipDrawable.E();
        }
        float dimension4 = typedArrayD.getDimension(40, BitmapDescriptorFactory.HUE_RED);
        if (chipDrawable.e0 != dimension4) {
            chipDrawable.e0 = dimension4;
            chipDrawable.invalidateSelf();
            chipDrawable.E();
        }
        chipDrawable.U(typedArrayD.getDimension(29, BitmapDescriptorFactory.HUE_RED));
        chipDrawable.S(typedArrayD.getDimension(27, BitmapDescriptorFactory.HUE_RED));
        float dimension5 = typedArrayD.getDimension(13, BitmapDescriptorFactory.HUE_RED);
        if (chipDrawable.h0 != dimension5) {
            chipDrawable.h0 = dimension5;
            chipDrawable.invalidateSelf();
            chipDrawable.E();
        }
        chipDrawable.H0 = typedArrayD.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayD.recycle();
        ThemeEnforcement.a(context2, attributeSet, i, 2132084096);
        ThemeEnforcement.b(context2, attributeSet, iArr, i, 2132084096, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, 2132084096);
        this.r = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.t = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(ViewUtils.d(48, getContext()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(chipDrawable);
        chipDrawable.l(ViewCompat.k(this));
        ThemeEnforcement.a(context2, attributeSet, i, 2132084096);
        ThemeEnforcement.b(context2, attributeSet, iArr, i, 2132084096, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, i, 2132084096);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.v = new ChipTouchHelper(this);
        f();
        if (!zHasValue) {
            setOutlineProvider(new ViewOutlineProvider() { // from class: com.google.android.material.chip.Chip.2
                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    ChipDrawable chipDrawable2 = Chip.this.h;
                    if (chipDrawable2 != null) {
                        chipDrawable2.getOutline(outline);
                    } else {
                        outline.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    }
                }
            });
        }
        setChecked(this.n);
        setText(chipDrawable.I);
        setEllipsize(chipDrawable.F0);
        i();
        if (!this.h.G0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        h();
        if (this.r) {
            setMinHeight(this.t);
        }
        this.s = getLayoutDirection();
        super.setOnCheckedChangeListener(new a(this, 2));
    }

    public void setCheckedIconVisible(boolean z) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.J(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            chipDrawable.O(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            Context context2 = chipDrawable.i0;
            chipDrawable.o0.c(new TextAppearance(context2, i), context2);
        }
        i();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        ChipDrawable chipDrawable = this.h;
        if (chipDrawable != null) {
            Context context = chipDrawable.i0;
            chipDrawable.o0.c(new TextAppearance(context, i), context);
        }
        i();
    }
}
