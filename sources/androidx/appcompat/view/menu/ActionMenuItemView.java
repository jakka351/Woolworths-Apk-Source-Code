package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.ForwardingListener;
import androidx.appcompat.widget.TooltipCompat;
import com.dynatrace.android.callback.Callback;

@RestrictTo
/* loaded from: classes2.dex */
public class ActionMenuItemView extends AppCompatTextView implements MenuView.ItemView, View.OnClickListener, ActionMenuView.ActionMenuChildView {
    public MenuItemImpl j;
    public CharSequence k;
    public Drawable l;
    public MenuBuilder.ItemInvoker m;
    public ForwardingListener n;
    public PopupCallback o;
    public boolean p;
    public boolean q;
    public final int r;
    public int s;
    public final int t;

    public class ActionMenuItemForwardingListener extends ForwardingListener {
        public ActionMenuItemForwardingListener() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final ShowableListMenu c() {
            PopupCallback popupCallback = ActionMenuItemView.this.o;
            if (popupCallback != null) {
                return popupCallback.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final boolean d() {
            ShowableListMenu showableListMenuC;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            MenuBuilder.ItemInvoker itemInvoker = actionMenuItemView.m;
            return itemInvoker != null && itemInvoker.d(actionMenuItemView.j) && (showableListMenuC = c()) != null && showableListMenuC.b();
        }
    }

    public static abstract class PopupCallback {
        public abstract ShowableListMenu a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.j.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final void c(MenuItemImpl menuItemImpl) {
        this.j = menuItemImpl;
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitleCondensed());
        setId(menuItemImpl.f135a);
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setEnabled(menuItemImpl.isEnabled());
        if (menuItemImpl.hasSubMenu() && this.n == null) {
            this.n = new ActionMenuItemForwardingListener();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Callback.g(view);
        try {
            MenuBuilder.ItemInvoker itemInvoker = this.m;
            if (itemInvoker != null) {
                itemInvoker.d(this.j);
            }
            Callback.h();
        } catch (Throwable th) {
            Callback.h();
            throw th;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.p = q();
        r();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.s) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.r;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.l == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.l.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener;
        if (this.j.hasSubMenu() && (forwardingListener = this.n) != null && forwardingListener.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean q() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void r() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.k);
        if (this.l != null && ((this.j.y & 4) != 4 || (!this.p && !this.q))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.k : null);
        CharSequence charSequence = this.j.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.j.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.j.r;
        if (TextUtils.isEmpty(charSequence2)) {
            TooltipCompat.a(this, z3 ? null : this.j.e);
        } else {
            TooltipCompat.a(this, charSequence2);
        }
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.q != z) {
            this.q = z;
            MenuItemImpl menuItemImpl = this.j;
            if (menuItemImpl != null) {
                MenuBuilder menuBuilder = menuItemImpl.n;
                menuBuilder.k = true;
                menuBuilder.q(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.l = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.t;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        r();
    }

    public void setItemInvoker(MenuBuilder.ItemInvoker itemInvoker) {
        this.m = itemInvoker;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.s = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(PopupCallback popupCallback) {
        this.o = popupCallback;
    }

    public void setTitle(CharSequence charSequence) {
        this.k = charSequence;
        r();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.p = q();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.c, i, 0);
        this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.t = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.s = -1;
        setSaveEnabled(false);
    }
}
