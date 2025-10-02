package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.WeakHashMap;

@RestrictTo
/* loaded from: classes6.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements MenuView.ItemView {
    public static final int[] J = {R.attr.state_checked};
    public boolean A;
    public boolean B;
    public final CheckedTextView C;
    public FrameLayout D;
    public MenuItemImpl E;
    public ColorStateList F;
    public boolean G;
    public Drawable H;
    public final AccessibilityDelegateCompat I;
    public int y;
    public boolean z;

    public NavigationMenuItemView(@NonNull Context context) {
        this(context, null);
    }

    private void setActionView(@Nullable View view) {
        if (view != null) {
            if (this.D == null) {
                this.D = (FrameLayout) ((ViewStub) findViewById(com.woolworths.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.D.removeAllViews();
            this.D.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final void c(MenuItemImpl menuItemImpl) {
        StateListDrawable stateListDrawable;
        this.E = menuItemImpl;
        int i = menuItemImpl.f135a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.woolworths.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(J, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            setBackground(stateListDrawable);
        }
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setTitle(menuItemImpl.e);
        setIcon(menuItemImpl.getIcon());
        setActionView(menuItemImpl.getActionView());
        setContentDescription(menuItemImpl.q);
        TooltipCompat.a(this, menuItemImpl.r);
        MenuItemImpl menuItemImpl2 = this.E;
        CharSequence charSequence = menuItemImpl2.e;
        CheckedTextView checkedTextView = this.C;
        if (charSequence == null && menuItemImpl2.getIcon() == null && this.E.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.D;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.D.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.D;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.D.setLayoutParams(layoutParams2);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.E;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemImpl menuItemImpl = this.E;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.E.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, J);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.A != z) {
            this.A = z;
            this.I.h(this.C, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.C;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.B) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            if (this.G) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.F);
            }
            int i = this.y;
            drawable.setBounds(0, 0, i, i);
        } else if (this.z) {
            if (this.H == null) {
                Drawable drawableC = ResourcesCompat.c(com.woolworths.R.drawable.navigation_empty_icon, getContext().getTheme(), getResources());
                this.H = drawableC;
                if (drawableC != null) {
                    int i2 = this.y;
                    drawableC.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.H;
        }
        this.C.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.C.setCompoundDrawablePadding(i);
    }

    public void setIconSize(@Dimension int i) {
        this.y = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.F = colorStateList;
        this.G = colorStateList != null;
        MenuItemImpl menuItemImpl = this.E;
        if (menuItemImpl != null) {
            setIcon(menuItemImpl.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.C.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.z = z;
    }

    public void setTextAppearance(int i) {
        this.C.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.C.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.C.setText(charSequence);
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.B = true;
        AccessibilityDelegateCompat accessibilityDelegateCompat = new AccessibilityDelegateCompat() { // from class: com.google.android.material.internal.NavigationMenuItemView.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f2508a;
                this.f2466a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(NavigationMenuItemView.this.A);
            }
        };
        this.I = accessibilityDelegateCompat;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.woolworths.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.woolworths.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.woolworths.R.id.design_menu_item_text);
        this.C = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ViewCompat.A(checkedTextView, accessibilityDelegateCompat);
    }
}
