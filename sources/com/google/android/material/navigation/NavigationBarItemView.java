package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.ripple.RippleUtils;
import java.util.WeakHashMap;

@RestrictTo
/* loaded from: classes6.dex */
public abstract class NavigationBarItemView extends FrameLayout implements MenuView.ItemView {
    public static final int[] J = {R.attr.state_checked};
    public static final ActiveIndicatorTransform K = new ActiveIndicatorTransform();
    public static final ActiveIndicatorUnlabeledTransform L = new ActiveIndicatorUnlabeledTransform();
    public ValueAnimator A;
    public ActiveIndicatorTransform B;
    public float C;
    public boolean D;
    public int E;
    public int F;
    public boolean G;
    public int H;
    public BadgeDrawable I;
    public boolean d;
    public ColorStateList e;
    public Drawable f;
    public int g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public int m;
    public boolean n;
    public final FrameLayout o;
    public final View p;
    public final ImageView q;
    public final ViewGroup r;
    public final TextView s;
    public final TextView t;
    public int u;
    public int v;
    public MenuItemImpl w;
    public ColorStateList x;
    public Drawable y;
    public Drawable z;

    public static class ActiveIndicatorTransform {
        public float a(float f, float f2) {
            return 1.0f;
        }
    }

    public static class ActiveIndicatorUnlabeledTransform extends ActiveIndicatorTransform {
        @Override // com.google.android.material.navigation.NavigationBarItemView.ActiveIndicatorTransform
        public final float a(float f, float f2) {
            return AnimationUtils.a(0.4f, 1.0f, f);
        }
    }

    public NavigationBarItemView(@NonNull Context context) {
        super(context);
        this.d = false;
        this.u = -1;
        this.v = 0;
        this.B = K;
        this.C = BitmapDescriptorFactory.HUE_RED;
        this.D = false;
        this.E = 0;
        this.F = 0;
        this.G = false;
        this.H = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.o = (FrameLayout) findViewById(com.woolworths.R.id.navigation_bar_item_icon_container);
        this.p = findViewById(com.woolworths.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(com.woolworths.R.id.navigation_bar_item_icon_view);
        this.q = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.woolworths.R.id.navigation_bar_item_labels_group);
        this.r = viewGroup;
        TextView textView = (TextView) findViewById(com.woolworths.R.id.navigation_bar_item_small_label_view);
        this.s = textView;
        TextView textView2 = (TextView) findViewById(com.woolworths.R.id.navigation_bar_item_large_label_view);
        this.t = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.g = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.h = viewGroup.getPaddingBottom();
        this.i = getResources().getDimensionPixelSize(com.woolworths.R.dimen.m3_navigation_item_active_indicator_label_padding);
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        a(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.navigation.NavigationBarItemView.1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    BadgeDrawable badgeDrawable;
                    NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                    ImageView imageView2 = navigationBarItemView.q;
                    if (imageView2.getVisibility() != 0 || (badgeDrawable = navigationBarItemView.I) == null) {
                        return;
                    }
                    Rect rect = new Rect();
                    imageView2.getDrawingRect(rect);
                    badgeDrawable.setBounds(rect);
                    badgeDrawable.i(imageView2, null);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(android.widget.TextView r4, int r5) throws android.content.res.Resources.NotFoundException {
        /*
            r4.setTextAppearance(r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto Lb
            goto L1f
        Lb:
            int[] r2 = com.google.android.material.R.styleable.g0
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r3 = r5.getValue(r1, r2)
            r5.recycle()
            if (r3 != 0) goto L21
        L1f:
            r5 = r1
            goto L4c
        L21:
            int r5 = r2.getComplexUnit()
            r3 = 2
            if (r5 != r3) goto L3e
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L4c
        L3e:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L4c:
            if (r5 == 0) goto L52
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationBarItemView.f(android.widget.TextView, int):void");
    }

    public static void g(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.o;
        return frameLayout != null ? frameLayout : this.q;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < iIndexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        return getIconOrContainer().getMeasuredHeight() + ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
    }

    private int getSuggestedIconWidth() {
        BadgeDrawable badgeDrawable = this.I;
        int minimumWidth = badgeDrawable == null ? 0 : badgeDrawable.getMinimumWidth() - this.I.h.b.z.intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.q.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void h(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void j(int i, View view) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public final void a(float f, float f2) {
        this.j = f - f2;
        this.k = (f2 * 1.0f) / f;
        this.l = (f * 1.0f) / f2;
    }

    public final void b() {
        MenuItemImpl menuItemImpl = this.w;
        if (menuItemImpl != null) {
            setChecked(menuItemImpl.isChecked());
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final void c(MenuItemImpl menuItemImpl) {
        this.w = menuItemImpl;
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.e);
        setId(menuItemImpl.f135a);
        if (!TextUtils.isEmpty(menuItemImpl.q)) {
            setContentDescription(menuItemImpl.q);
        }
        TooltipCompat.a(this, !TextUtils.isEmpty(menuItemImpl.r) ? menuItemImpl.r : menuItemImpl.e);
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        this.d = true;
    }

    public final void d() {
        Drawable rippleDrawable = this.f;
        ColorStateList colorStateList = this.e;
        FrameLayout frameLayout = this.o;
        RippleDrawable rippleDrawable2 = null;
        boolean z = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.D && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable2 = new RippleDrawable(RippleUtils.c(this.e), null, activeIndicatorDrawable);
                z = false;
            } else if (rippleDrawable == null) {
                rippleDrawable = new RippleDrawable(RippleUtils.a(this.e), null, null);
            }
        }
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setForeground(rippleDrawable2);
        }
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        setBackground(rippleDrawable);
        setDefaultFocusHighlightEnabled(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.o;
        if (frameLayout != null && this.D) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(float f, float f2) {
        View view = this.p;
        if (view != null) {
            ActiveIndicatorTransform activeIndicatorTransform = this.B;
            activeIndicatorTransform.getClass();
            view.setScaleX(AnimationUtils.a(0.4f, 1.0f, f));
            view.setScaleY(activeIndicatorTransform.a(f, f2));
            view.setAlpha(AnimationUtils.b(BitmapDescriptorFactory.HUE_RED, 1.0f, f2 == BitmapDescriptorFactory.HUE_RED ? 0.8f : 0.0f, f2 == BitmapDescriptorFactory.HUE_RED ? 1.0f : 0.2f, f));
        }
        this.C = f;
    }

    @Nullable
    public Drawable getActiveIndicatorDrawable() {
        View view = this.p;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    @Nullable
    public BadgeDrawable getBadge() {
        return this.I;
    }

    @DrawableRes
    public int getItemBackgroundResId() {
        return com.woolworths.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    @Nullable
    public MenuItemImpl getItemData() {
        return this.w;
    }

    @DimenRes
    public int getItemDefaultMarginResId() {
        return com.woolworths.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    @LayoutRes
    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.u;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.r;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + (viewGroup.getVisibility() == 0 ? this.i : 0) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.r;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public final void i(int i) {
        View view = this.p;
        if (view == null || i <= 0) {
            return;
        }
        int iMin = Math.min(this.E, i - (this.H * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = (this.G && this.m == 2) ? iMin : this.F;
        layoutParams.width = iMin;
        view.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemImpl menuItemImpl = this.w;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.w.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, J);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) throws Resources.NotFoundException {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.I;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            MenuItemImpl menuItemImpl = this.w;
            CharSequence charSequence = menuItemImpl.e;
            if (!TextUtils.isEmpty(menuItemImpl.q)) {
                charSequence = this.w.q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.I.c()));
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
        accessibilityNodeInfoCompat.o(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfoCompat.m(false);
            accessibilityNodeInfoCompat.i(AccessibilityNodeInfoCompat.AccessibilityActionCompat.g);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.woolworths.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(final int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new Runnable() { // from class: com.google.android.material.navigation.NavigationBarItemView.2
            @Override // java.lang.Runnable
            public final void run() {
                int[] iArr = NavigationBarItemView.J;
                NavigationBarItemView.this.i(i);
            }
        });
    }

    public void setActiveIndicatorDrawable(@Nullable Drawable drawable) {
        View view = this.p;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        d();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.D = z;
        d();
        View view = this.p;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.F = i;
        i(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.i != i) {
            this.i = i;
            b();
        }
    }

    public void setActiveIndicatorMarginHorizontal(@Px int i) {
        this.H = i;
        i(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.G = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.E = i;
        i(getWidth());
    }

    public void setBadge(@NonNull BadgeDrawable badgeDrawable) {
        BadgeDrawable badgeDrawable2 = this.I;
        if (badgeDrawable2 == badgeDrawable) {
            return;
        }
        ImageView imageView = this.q;
        if (badgeDrawable2 != null && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.I != null) {
                setClipChildren(true);
                setClipToPadding(true);
                BadgeDrawable badgeDrawable3 = this.I;
                if (badgeDrawable3 != null) {
                    if (badgeDrawable3.d() != null) {
                        badgeDrawable3.d().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(badgeDrawable3);
                    }
                }
                this.I = null;
            }
        }
        this.I = badgeDrawable;
        if (imageView == null || badgeDrawable == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        BadgeDrawable badgeDrawable4 = this.I;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        badgeDrawable4.setBounds(rect);
        badgeDrawable4.i(imageView, null);
        if (badgeDrawable4.d() != null) {
            badgeDrawable4.d().setForeground(badgeDrawable4);
        } else {
            imageView.getOverlay().add(badgeDrawable4);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setChecked(boolean r13) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationBarItemView.setChecked(boolean):void");
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.s.setEnabled(z);
        this.t.setEnabled(z);
        this.q.setEnabled(z);
        if (z) {
            ViewCompat.J(this, new PointerIconCompat(PointerIcon.getSystemIcon(getContext(), 1002)));
        } else {
            ViewCompat.J(this, null);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (drawable == this.y) {
            return;
        }
        this.y = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.z = drawable;
            ColorStateList colorStateList = this.x;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.q.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        ImageView imageView = this.q;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        Drawable drawable;
        this.x = colorStateList;
        if (this.w == null || (drawable = this.z) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.z.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : getContext().getDrawable(i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.h != i) {
            this.h = i;
            b();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.g != i) {
            this.g = i;
            b();
        }
    }

    public void setItemPosition(int i) {
        this.u = i;
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.e = colorStateList;
        d();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.m != i) {
            this.m = i;
            if (this.G && i == 2) {
                this.B = L;
            } else {
                this.B = K;
            }
            i(getWidth());
            b();
        }
    }

    public void setShifting(boolean z) {
        if (this.n != z) {
            this.n = z;
            b();
        }
    }

    public void setTextAppearanceActive(@StyleRes int i) throws Resources.NotFoundException {
        this.v = i;
        TextView textView = this.t;
        f(textView, i);
        a(this.s.getTextSize(), textView.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z) throws Resources.NotFoundException {
        setTextAppearanceActive(this.v);
        TextView textView = this.t;
        textView.setTypeface(textView.getTypeface(), z ? 1 : 0);
    }

    public void setTextAppearanceInactive(@StyleRes int i) throws Resources.NotFoundException {
        TextView textView = this.s;
        f(textView, i);
        a(textView.getTextSize(), this.t.getTextSize());
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.s.setTextColor(colorStateList);
            this.t.setTextColor(colorStateList);
        }
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.s.setText(charSequence);
        this.t.setText(charSequence);
        MenuItemImpl menuItemImpl = this.w;
        if (menuItemImpl == null || TextUtils.isEmpty(menuItemImpl.q)) {
            setContentDescription(charSequence);
        }
        MenuItemImpl menuItemImpl2 = this.w;
        if (menuItemImpl2 != null && !TextUtils.isEmpty(menuItemImpl2.r)) {
            charSequence = this.w.r;
        }
        TooltipCompat.a(this, charSequence);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f = drawable;
        d();
    }
}
