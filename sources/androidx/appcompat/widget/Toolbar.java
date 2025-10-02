package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.dynatrace.android.callback.Callback;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
public class Toolbar extends ViewGroup implements MenuHost {
    public CharSequence A;
    public CharSequence B;
    public ColorStateList C;
    public ColorStateList D;
    public boolean E;
    public boolean F;
    public final ArrayList G;
    public final ArrayList H;
    public final int[] I;
    public final MenuHostHelper J;
    public ArrayList K;
    public OnMenuItemClickListener L;
    public final ActionMenuView.OnMenuItemClickListener M;
    public ToolbarWidgetWrapper N;
    public ActionMenuPresenter O;
    public ExpandedActionViewMenuPresenter P;
    public MenuPresenter.Callback Q;
    public MenuBuilder.Callback R;
    public boolean S;
    public OnBackInvokedCallback T;
    public OnBackInvokedDispatcher U;
    public boolean V;
    public final Runnable W;
    public ActionMenuView d;
    public AppCompatTextView e;
    public AppCompatTextView f;
    public AppCompatImageButton g;
    public AppCompatImageView h;
    public final Drawable i;
    public final CharSequence j;
    public AppCompatImageButton k;
    public View l;
    public Context m;
    public int n;
    public int o;
    public int p;
    public final int q;
    public final int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public RtlSpacingHelper w;
    public int x;
    public int y;
    public final int z;

    @RequiresApi
    public static class Api33Impl {
        @Nullable
        @DoNotInline
        public static OnBackInvokedDispatcher a(@NonNull View view) {
            return view.findOnBackInvokedDispatcher();
        }

        @NonNull
        @DoNotInline
        public static OnBackInvokedCallback b(@NonNull final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.c
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        @DoNotInline
        public static void c(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        @DoNotInline
        public static void d(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class ExpandedActionViewMenuPresenter implements MenuPresenter {
        public MenuBuilder d;
        public MenuItemImpl e;

        public ExpandedActionViewMenuPresenter() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final void c(MenuBuilder menuBuilder, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final Parcelable d() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final boolean e(MenuItemImpl menuItemImpl) {
            Toolbar toolbar = Toolbar.this;
            toolbar.c();
            ViewParent parent = toolbar.k.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.k);
                }
                toolbar.addView(toolbar.k);
            }
            View actionView = menuItemImpl.getActionView();
            toolbar.l = actionView;
            this.e = menuItemImpl;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.l);
                }
                LayoutParams layoutParamsH = Toolbar.h();
                layoutParamsH.f89a = (toolbar.q & 112) | 8388611;
                layoutParamsH.b = 2;
                toolbar.l.setLayoutParams(layoutParamsH);
                toolbar.addView(toolbar.l);
            }
            for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = toolbar.getChildAt(childCount);
                if (((LayoutParams) childAt.getLayoutParams()).b != 2 && childAt != toolbar.d) {
                    toolbar.removeViewAt(childCount);
                    toolbar.H.add(childAt);
                }
            }
            toolbar.requestLayout();
            menuItemImpl.C = true;
            menuItemImpl.n.q(false);
            KeyEvent.Callback callback = toolbar.l;
            if (callback instanceof CollapsibleActionView) {
                ((CollapsibleActionView) callback).onActionViewExpanded();
            }
            toolbar.x();
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final void f(boolean z) {
            if (this.e != null) {
                MenuBuilder menuBuilder = this.d;
                if (menuBuilder != null) {
                    int size = menuBuilder.f.size();
                    for (int i = 0; i < size; i++) {
                        if (this.d.getItem(i) == this.e) {
                            return;
                        }
                    }
                }
                k(this.e);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final boolean g() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final void h(Context context, MenuBuilder menuBuilder) {
            MenuItemImpl menuItemImpl;
            MenuBuilder menuBuilder2 = this.d;
            if (menuBuilder2 != null && (menuItemImpl = this.e) != null) {
                menuBuilder2.e(menuItemImpl);
            }
            this.d = menuBuilder;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final boolean k(MenuItemImpl menuItemImpl) {
            Toolbar toolbar = Toolbar.this;
            KeyEvent.Callback callback = toolbar.l;
            if (callback instanceof CollapsibleActionView) {
                ((CollapsibleActionView) callback).onActionViewCollapsed();
            }
            toolbar.removeView(toolbar.l);
            toolbar.removeView(toolbar.k);
            toolbar.l = null;
            ArrayList arrayList = toolbar.H;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                toolbar.addView((View) arrayList.get(size));
            }
            arrayList.clear();
            this.e = null;
            toolbar.requestLayout();
            menuItemImpl.C = false;
            menuItemImpl.n.q(false);
            toolbar.x();
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final void l(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final boolean m(SubMenuBuilder subMenuBuilder) {
            return false;
        }
    }

    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* renamed from: a, reason: collision with root package name */
        public int f193a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;

        public final void mapProperties(PropertyMapper propertyMapper) {
            this.f193a = propertyMapper.mapObject("collapseContentDescription", R.attr.collapseContentDescription);
            this.b = propertyMapper.mapObject("collapseIcon", R.attr.collapseIcon);
            this.c = propertyMapper.mapInt("contentInsetEnd", R.attr.contentInsetEnd);
            this.d = propertyMapper.mapInt("contentInsetEndWithActions", R.attr.contentInsetEndWithActions);
            this.e = propertyMapper.mapInt("contentInsetLeft", R.attr.contentInsetLeft);
            this.f = propertyMapper.mapInt("contentInsetRight", R.attr.contentInsetRight);
            this.g = propertyMapper.mapInt("contentInsetStart", R.attr.contentInsetStart);
            this.h = propertyMapper.mapInt("contentInsetStartWithNavigation", R.attr.contentInsetStartWithNavigation);
            this.i = propertyMapper.mapObject("logo", R.attr.logo);
            this.j = propertyMapper.mapObject("logoDescription", R.attr.logoDescription);
            this.k = propertyMapper.mapObject("menu", R.attr.menu);
            this.l = propertyMapper.mapObject("navigationContentDescription", R.attr.navigationContentDescription);
            this.m = propertyMapper.mapObject("navigationIcon", R.attr.navigationIcon);
            this.n = propertyMapper.mapResourceId("popupTheme", R.attr.popupTheme);
            this.o = propertyMapper.mapObject(NotificationMessage.NOTIF_KEY_SUB_TITLE, R.attr.subtitle);
            this.p = propertyMapper.mapObject("title", R.attr.title);
            this.q = propertyMapper.mapInt("titleMarginBottom", R.attr.titleMarginBottom);
            this.r = propertyMapper.mapInt("titleMarginEnd", R.attr.titleMarginEnd);
            this.s = propertyMapper.mapInt("titleMarginStart", R.attr.titleMarginStart);
            this.t = propertyMapper.mapInt("titleMarginTop", R.attr.titleMarginTop);
        }

        public final void readProperties(Object obj, PropertyReader propertyReader) {
            Toolbar toolbar = (Toolbar) obj;
            propertyReader.readObject(this.f193a, toolbar.getCollapseContentDescription());
            propertyReader.readObject(this.b, toolbar.getCollapseIcon());
            propertyReader.readInt(this.c, toolbar.getContentInsetEnd());
            propertyReader.readInt(this.d, toolbar.getContentInsetEndWithActions());
            propertyReader.readInt(this.e, toolbar.getContentInsetLeft());
            propertyReader.readInt(this.f, toolbar.getContentInsetRight());
            propertyReader.readInt(this.g, toolbar.getContentInsetStart());
            propertyReader.readInt(this.h, toolbar.getContentInsetStartWithNavigation());
            propertyReader.readObject(this.i, toolbar.getLogo());
            propertyReader.readObject(this.j, toolbar.getLogoDescription());
            propertyReader.readObject(this.k, toolbar.getMenu());
            propertyReader.readObject(this.l, toolbar.getNavigationContentDescription());
            propertyReader.readObject(this.m, toolbar.getNavigationIcon());
            propertyReader.readResourceId(this.n, toolbar.getPopupTheme());
            propertyReader.readObject(this.o, toolbar.getSubtitle());
            propertyReader.readObject(this.p, toolbar.getTitle());
            propertyReader.readInt(this.q, toolbar.getTitleMarginBottom());
            propertyReader.readInt(this.r, toolbar.getTitleMarginEnd());
            propertyReader.readInt(this.s, toolbar.getTitleMarginStart());
            propertyReader.readInt(this.t, toolbar.getTitleMarginTop());
        }
    }

    public static class LayoutParams extends ActionBar.LayoutParams {
        public int b;

        public LayoutParams(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = 0;
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public int f;
        public boolean g;

        /* renamed from: androidx.appcompat.widget.Toolbar$SavedState$1, reason: invalid class name */
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
            this.f = parcel.readInt();
            this.g = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g ? 1 : 0);
        }
    }

    public Toolbar(@NonNull Context context) {
        this(context, null);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new SupportMenuInflater(getContext());
    }

    public static LayoutParams h() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.b = 0;
        layoutParams.f89a = 8388627;
        return layoutParams;
    }

    public static LayoutParams i(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            layoutParams3.b = 0;
            layoutParams3.b = layoutParams2.b;
            return layoutParams3;
        }
        if (layoutParams instanceof ActionBar.LayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ActionBar.LayoutParams) layoutParams);
            layoutParams4.b = 0;
            return layoutParams4;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            LayoutParams layoutParams5 = new LayoutParams(layoutParams);
            layoutParams5.b = 0;
            return layoutParams5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        LayoutParams layoutParams6 = new LayoutParams(marginLayoutParams);
        layoutParams6.b = 0;
        ((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = marginLayoutParams.bottomMargin;
        return layoutParams6;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.b == 0 && v(childAt)) {
                    int i3 = layoutParams.f89a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.b == 0 && v(childAt2)) {
                int i5 = layoutParams2.f89a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // androidx.core.view.MenuHost
    public final void addMenuProvider(MenuProvider menuProvider) {
        MenuHostHelper menuHostHelper = this.J;
        menuHostHelper.b.add(menuProvider);
        menuHostHelper.f2477a.run();
    }

    public final void b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LayoutParams layoutParamsH = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (LayoutParams) layoutParams;
        layoutParamsH.b = 1;
        if (!z || this.l == null) {
            addView(view, layoutParamsH);
        } else {
            view.setLayoutParams(layoutParamsH);
            this.H.add(view);
        }
    }

    public final void c() {
        if (this.k == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.k = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.i);
            this.k.setContentDescription(this.j);
            LayoutParams layoutParamsH = h();
            layoutParamsH.f89a = (this.q & 112) | 8388611;
            layoutParamsH.b = 2;
            this.k.setLayoutParams(layoutParamsH);
            this.k.setOnClickListener(new View.OnClickListener() { // from class: androidx.appcompat.widget.Toolbar.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Callback.g(view);
                    try {
                        ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = Toolbar.this.P;
                        MenuItemImpl menuItemImpl = expandedActionViewMenuPresenter == null ? null : expandedActionViewMenuPresenter.e;
                        if (menuItemImpl != null) {
                            menuItemImpl.collapseActionView();
                        }
                    } finally {
                        Callback.h();
                    }
                }
            });
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public final void d() {
        if (this.w == null) {
            RtlSpacingHelper rtlSpacingHelper = new RtlSpacingHelper();
            rtlSpacingHelper.f181a = 0;
            rtlSpacingHelper.b = 0;
            rtlSpacingHelper.c = Integer.MIN_VALUE;
            rtlSpacingHelper.d = Integer.MIN_VALUE;
            rtlSpacingHelper.e = 0;
            rtlSpacingHelper.f = 0;
            rtlSpacingHelper.g = false;
            rtlSpacingHelper.h = false;
            this.w = rtlSpacingHelper;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.d;
        if (actionMenuView.s == null) {
            MenuBuilder menuBuilder = (MenuBuilder) actionMenuView.getMenu();
            if (this.P == null) {
                this.P = new ExpandedActionViewMenuPresenter();
            }
            this.d.setExpandedActionViewsExclusive(true);
            menuBuilder.c(this.P, this.m);
            x();
        }
    }

    public final void f() {
        if (this.d == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.d = actionMenuView;
            actionMenuView.setPopupTheme(this.n);
            this.d.setOnMenuItemClickListener(this.M);
            ActionMenuView actionMenuView2 = this.d;
            MenuPresenter.Callback callback = this.Q;
            MenuBuilder.Callback callback2 = new MenuBuilder.Callback() { // from class: androidx.appcompat.widget.Toolbar.3
                @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
                public final boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
                    return false;
                }

                @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
                public final void b(MenuBuilder menuBuilder) {
                    Toolbar toolbar = Toolbar.this;
                    ActionMenuPresenter actionMenuPresenter = toolbar.d.w;
                    if (actionMenuPresenter == null || !actionMenuPresenter.p()) {
                        Iterator it = toolbar.J.b.iterator();
                        while (it.hasNext()) {
                            ((MenuProvider) it.next()).c(menuBuilder);
                        }
                    }
                    MenuBuilder.Callback callback3 = toolbar.R;
                    if (callback3 != null) {
                        callback3.b(menuBuilder);
                    }
                }
            };
            actionMenuView2.x = callback;
            actionMenuView2.y = callback2;
            LayoutParams layoutParamsH = h();
            layoutParamsH.f89a = (this.q & 112) | 8388613;
            this.d.setLayoutParams(layoutParamsH);
            b(this.d, false);
        }
    }

    public final void g() {
        if (this.g == null) {
            this.g = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            LayoutParams layoutParamsH = h();
            layoutParamsH.f89a = (this.q & 112) | 8388611;
            this.g.setLayoutParams(layoutParamsH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Nullable
    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.k;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.k;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        RtlSpacingHelper rtlSpacingHelper = this.w;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.g ? rtlSpacingHelper.f181a : rtlSpacingHelper.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.y;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        RtlSpacingHelper rtlSpacingHelper = this.w;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.f181a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        RtlSpacingHelper rtlSpacingHelper = this.w;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        RtlSpacingHelper rtlSpacingHelper = this.w;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.g ? rtlSpacingHelper.b : rtlSpacingHelper.f181a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.x;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuBuilder menuBuilder;
        ActionMenuView actionMenuView = this.d;
        return (actionMenuView == null || (menuBuilder = actionMenuView.s) == null || !menuBuilder.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.y, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.x, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.h;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.h;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.d.getMenu();
    }

    @Nullable
    @VisibleForTesting
    public View getNavButtonView() {
        return this.g;
    }

    @Nullable
    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.g;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.g;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.O;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        e();
        return this.d.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.m;
    }

    @StyleRes
    public int getPopupTheme() {
        return this.n;
    }

    public CharSequence getSubtitle() {
        return this.B;
    }

    @Nullable
    @VisibleForTesting
    public final TextView getSubtitleTextView() {
        return this.f;
    }

    public CharSequence getTitle() {
        return this.A;
    }

    public int getTitleMarginBottom() {
        return this.v;
    }

    public int getTitleMarginEnd() {
        return this.t;
    }

    public int getTitleMarginStart() {
        return this.s;
    }

    public int getTitleMarginTop() {
        return this.u;
    }

    @Nullable
    @VisibleForTesting
    public final TextView getTitleTextView() {
        return this.e;
    }

    @RestrictTo
    public DecorToolbar getWrapper() {
        if (this.N == null) {
            this.N = new ToolbarWidgetWrapper(this, true);
        }
        return this.N;
    }

    public final int j(int i, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = layoutParams.f89a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.z & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final boolean m() {
        ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.P;
        return (expandedActionViewMenuPresenter == null || expandedActionViewMenuPresenter.e == null) ? false : true;
    }

    public void n(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void o() {
        Iterator it = this.K.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = this.J.b.iterator();
        while (it2.hasNext()) {
            ((MenuProvider) it2.next()).a(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.K = currentMenuItems2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        x();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.W);
        x();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.F = false;
        }
        if (!this.F) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.F = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.F = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c7 A[LOOP:2: B:108:0x02c5->B:109:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031a A[LOOP:3: B:117:0x0318->B:118:0x031a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        byte b;
        byte b2;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            b2 = true;
            b = 0;
        } else {
            b = 1;
            b2 = false;
        }
        if (v(this.g)) {
            u(this.g, i, 0, i2, this.r);
            iK = k(this.g) + this.g.getMeasuredWidth();
            iMax = Math.max(0, l(this.g) + this.g.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.g.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (v(this.k)) {
            u(this.k, i, 0, i2, this.r);
            iK = k(this.k) + this.k.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.k) + this.k.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.k.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        byte b3 = b2;
        int[] iArr = this.I;
        iArr[b3 == true ? 1 : 0] = iMax4;
        if (v(this.d)) {
            u(this.d, i, iMax3, i2, this.r);
            iK2 = k(this.d) + this.d.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.d) + this.d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.d.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[b] = Math.max(0, currentContentInsetEnd - iK2);
        if (v(this.l)) {
            iMax5 += t(this.l, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.l) + this.l.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.l.getMeasuredState());
        }
        if (v(this.h)) {
            iMax5 += t(this.h, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.h) + this.h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.h.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((LayoutParams) childAt.getLayoutParams()).b == 0 && v(childAt)) {
                iMax5 += t(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.u + this.v;
        int i7 = this.s + this.t;
        if (v(this.e)) {
            t(this.e, i, i5 + i7, i2, i6, iArr);
            int iK3 = k(this.e) + this.e.getMeasuredWidth();
            iL = l(this.e) + this.e.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (v(this.f)) {
            iMax2 = Math.max(iMax2, t(this.f, i, i5 + i7, i2, i6 + iL, iArr));
            iL += l(this.f) + this.f.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.S) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (v(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        ActionMenuView actionMenuView = this.d;
        MenuBuilder menuBuilder = actionMenuView != null ? actionMenuView.s : null;
        int i = savedState.f;
        if (i != 0 && this.P != null && menuBuilder != null && (menuItemFindItem = menuBuilder.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.g) {
            Runnable runnable = this.W;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        RtlSpacingHelper rtlSpacingHelper = this.w;
        boolean z = i == 1;
        if (z == rtlSpacingHelper.g) {
            return;
        }
        rtlSpacingHelper.g = z;
        if (!rtlSpacingHelper.h) {
            rtlSpacingHelper.f181a = rtlSpacingHelper.e;
            rtlSpacingHelper.b = rtlSpacingHelper.f;
            return;
        }
        if (z) {
            int i2 = rtlSpacingHelper.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = rtlSpacingHelper.e;
            }
            rtlSpacingHelper.f181a = i2;
            int i3 = rtlSpacingHelper.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = rtlSpacingHelper.f;
            }
            rtlSpacingHelper.b = i3;
            return;
        }
        int i4 = rtlSpacingHelper.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = rtlSpacingHelper.e;
        }
        rtlSpacingHelper.f181a = i4;
        int i5 = rtlSpacingHelper.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = rtlSpacingHelper.f;
        }
        rtlSpacingHelper.b = i5;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ActionMenuPresenter actionMenuPresenter;
        MenuItemImpl menuItemImpl;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.P;
        if (expandedActionViewMenuPresenter != null && (menuItemImpl = expandedActionViewMenuPresenter.e) != null) {
            savedState.f = menuItemImpl.f135a;
        }
        ActionMenuView actionMenuView = this.d;
        savedState.g = (actionMenuView == null || (actionMenuPresenter = actionMenuView.w) == null || !actionMenuPresenter.p()) ? false : true;
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.E = false;
        }
        if (!this.E) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.E = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.E = false;
        return true;
    }

    public final boolean p(View view) {
        return view.getParent() == this || this.H.contains(view);
    }

    public final boolean q() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.d;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.w) == null || !actionMenuPresenter.p()) ? false : true;
    }

    public final int r(View view, int i, int i2, int[] iArr) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iJ = j(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + iMax;
    }

    @Override // androidx.core.view.MenuHost
    public final void removeMenuProvider(MenuProvider menuProvider) {
        this.J.c(menuProvider);
    }

    public final int s(View view, int i, int i2, int[] iArr) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iJ = j(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.V != z) {
            this.V = z;
            x();
        }
    }

    public void setCollapseContentDescription(@StringRes int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(@DrawableRes int i) {
        setCollapseIcon(AppCompatResources.b(i, getContext()));
    }

    @RestrictTo
    public void setCollapsible(boolean z) {
        this.S = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.y) {
            this.y = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.x) {
            this.x = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(@DrawableRes int i) {
        setLogo(AppCompatResources.b(i, getContext()));
    }

    public void setLogoDescription(@StringRes int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(@StringRes int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(@DrawableRes int i) {
        setNavigationIcon(AppCompatResources.b(i, getContext()));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.g.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.L = onMenuItemClickListener;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        e();
        this.d.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@StyleRes int i) {
        if (this.n != i) {
            this.n = i;
            if (i == 0) {
                this.m = getContext();
            } else {
                this.m = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(@StringRes int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(@ColorInt int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(@StringRes int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.v = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.t = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.s = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.u = i;
        requestLayout();
    }

    public void setTitleTextColor(@ColorInt int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final int t(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void u(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean v(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean w() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.d;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.w) == null || !actionMenuPresenter.r()) ? false : true;
    }

    public final void x() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = Api33Impl.a(this);
            boolean z = m() && onBackInvokedDispatcherA != null && isAttachedToWindow() && this.V;
            if (z && this.U == null) {
                if (this.T == null) {
                    this.T = Api33Impl.b(new b(this, 0));
                }
                Api33Impl.c(onBackInvokedDispatcherA, this.T);
                this.U = onBackInvokedDispatcherA;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.U) == null) {
                return;
            }
            Api33Impl.d(onBackInvokedDispatcher, this.T);
            this.U = null;
        }
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.k;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            c();
            this.k.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.k;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.i);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.h == null) {
                this.h = new AppCompatImageView(getContext());
            }
            if (!p(this.h)) {
                b(this.h, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.h;
            if (appCompatImageView != null && p(appCompatImageView)) {
                removeView(this.h);
                this.H.remove(this.h);
            }
        }
        AppCompatImageView appCompatImageView2 = this.h;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.h == null) {
            this.h = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.h;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        AppCompatImageButton appCompatImageButton = this.g;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            TooltipCompat.Api26Impl.a(this.g, charSequence);
        }
    }

    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            g();
            if (!p(this.g)) {
                b(this.g, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.g;
            if (appCompatImageButton != null && p(appCompatImageButton)) {
                removeView(this.g);
                this.H.remove(this.g);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.g;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f;
            if (appCompatTextView != null && p(appCompatTextView)) {
                removeView(this.f);
                this.H.remove(this.f);
            }
        } else {
            if (this.f == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.f = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.p;
                if (i != 0) {
                    this.f.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.D;
                if (colorStateList != null) {
                    this.f.setTextColor(colorStateList);
                }
            }
            if (!p(this.f)) {
                b(this.f, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.B = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.D = colorStateList;
        AppCompatTextView appCompatTextView = this.f;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.e;
            if (appCompatTextView != null && p(appCompatTextView)) {
                removeView(this.e);
                this.H.remove(this.e);
            }
        } else {
            if (this.e == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.e = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.e.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.o;
                if (i != 0) {
                    this.e.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.C;
                if (colorStateList != null) {
                    this.e.setTextColor(colorStateList);
                }
            }
            if (!p(this.e)) {
                b(this.e, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.e;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.A = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.C = colorStateList;
        AppCompatTextView appCompatTextView = this.e;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.z = 8388627;
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new int[2];
        this.J = new MenuHostHelper(new b(this, 1));
        this.K = new ArrayList();
        this.M = new ActionMenuView.OnMenuItemClickListener() { // from class: androidx.appcompat.widget.Toolbar.1
            @Override // androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                Toolbar toolbar = Toolbar.this;
                Iterator it = toolbar.J.b.iterator();
                while (it.hasNext()) {
                    if (((MenuProvider) it.next()).d(menuItem)) {
                        return true;
                    }
                }
                OnMenuItemClickListener onMenuItemClickListener = toolbar.L;
                if (onMenuItemClickListener != null) {
                    return onMenuItemClickListener.onMenuItemClick(menuItem);
                }
                return false;
            }
        };
        this.W = new Runnable() { // from class: androidx.appcompat.widget.Toolbar.2
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.w();
            }
        };
        Context context2 = getContext();
        int[] iArr = androidx.appcompat.R.styleable.A;
        TintTypedArray tintTypedArrayF = TintTypedArray.f(context2, attributeSet, iArr, i, 0);
        ViewCompat.z(this, context, iArr, attributeSet, tintTypedArrayF.b, i);
        TypedArray typedArray = tintTypedArrayF.b;
        this.o = typedArray.getResourceId(28, 0);
        this.p = typedArray.getResourceId(19, 0);
        this.z = typedArray.getInteger(0, 8388627);
        this.q = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.v = dimensionPixelOffset;
        this.u = dimensionPixelOffset;
        this.t = dimensionPixelOffset;
        this.s = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.s = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.t = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.u = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.v = dimensionPixelOffset5;
        }
        this.r = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        RtlSpacingHelper rtlSpacingHelper = this.w;
        rtlSpacingHelper.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            rtlSpacingHelper.e = dimensionPixelSize;
            rtlSpacingHelper.f181a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            rtlSpacingHelper.f = dimensionPixelSize2;
            rtlSpacingHelper.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            rtlSpacingHelper.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.x = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.y = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.i = tintTypedArrayF.b(4);
        this.j = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.m = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableB = tintTypedArrayF.b(16);
        if (drawableB != null) {
            setNavigationIcon(drawableB);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableB2 = tintTypedArrayF.b(11);
        if (drawableB2 != null) {
            setLogo(drawableB2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(tintTypedArrayF.a(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(tintTypedArrayF.a(20));
        }
        if (typedArray.hasValue(14)) {
            n(typedArray.getResourceId(14, 0));
        }
        tintTypedArrayF.g();
    }
}
