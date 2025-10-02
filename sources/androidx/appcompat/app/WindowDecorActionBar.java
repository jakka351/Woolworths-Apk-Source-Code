package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.ViewPropertyAnimatorCompatSet;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import androidx.core.view.g;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@RestrictTo
/* loaded from: classes2.dex */
public class WindowDecorActionBar extends ActionBar implements ActionBarOverlayLayout.ActionBarVisibilityCallback {

    /* renamed from: a, reason: collision with root package name */
    public Context f112a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public DecorToolbar e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public ActionModeImpl i;
    public ActionModeImpl j;
    public ActionMode.Callback k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public ViewPropertyAnimatorCompatSet t;
    public boolean u;
    public boolean v;
    public final ViewPropertyAnimatorListener w;
    public final ViewPropertyAnimatorListener x;
    public final ViewPropertyAnimatorUpdateListener y;
    public static final AccelerateInterpolator z = new AccelerateInterpolator();
    public static final DecelerateInterpolator A = new DecelerateInterpolator();

    /* renamed from: androidx.appcompat.app.WindowDecorActionBar$1, reason: invalid class name */
    public class AnonymousClass1 extends ViewPropertyAnimatorListenerAdapter {
        public AnonymousClass1() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void d() {
            View view;
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            if (windowDecorActionBar.o && (view = windowDecorActionBar.g) != null) {
                view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                windowDecorActionBar.d.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
            windowDecorActionBar.d.setVisibility(8);
            windowDecorActionBar.d.setTransitioning(false);
            windowDecorActionBar.t = null;
            ActionMode.Callback callback = windowDecorActionBar.k;
            if (callback != null) {
                ((AppCompatDelegateImpl.ActionModeCallbackWrapperV9) callback).d(windowDecorActionBar.j);
                windowDecorActionBar.j = null;
                windowDecorActionBar.k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = windowDecorActionBar.c;
            if (actionBarOverlayLayout != null) {
                ViewCompat.y(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.WindowDecorActionBar$2, reason: invalid class name */
    public class AnonymousClass2 extends ViewPropertyAnimatorListenerAdapter {
        public AnonymousClass2() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void d() {
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            windowDecorActionBar.t = null;
            windowDecorActionBar.d.requestLayout();
        }
    }

    @RestrictTo
    public class ActionModeImpl extends ActionMode implements MenuBuilder.Callback {
        public final Context f;
        public final MenuBuilder g;
        public ActionMode.Callback h;
        public WeakReference i;

        public ActionModeImpl(Context context, ActionMode.Callback callback) {
            this.f = context;
            this.h = callback;
            MenuBuilder menuBuilder = new MenuBuilder(context);
            menuBuilder.l = 1;
            this.g = menuBuilder;
            menuBuilder.e = this;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
            ActionMode.Callback callback = this.h;
            if (callback != null) {
                return ((AppCompatDelegateImpl.ActionModeCallbackWrapperV9) callback).f101a.b(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final void b(MenuBuilder menuBuilder) {
            if (this.h == null) {
                return;
            }
            i();
            WindowDecorActionBar.this.f.i();
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void c() {
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            if (windowDecorActionBar.i != this) {
                return;
            }
            boolean z = windowDecorActionBar.p;
            boolean z2 = windowDecorActionBar.q;
            if (z || z2) {
                windowDecorActionBar.j = this;
                windowDecorActionBar.k = this.h;
            } else {
                ((AppCompatDelegateImpl.ActionModeCallbackWrapperV9) this.h).d(this);
            }
            this.h = null;
            windowDecorActionBar.E(false);
            ActionBarContextView actionBarContextView = windowDecorActionBar.f;
            if (actionBarContextView.n == null) {
                actionBarContextView.g();
            }
            windowDecorActionBar.c.setHideOnContentScrollEnabled(windowDecorActionBar.v);
            windowDecorActionBar.i = null;
        }

        @Override // androidx.appcompat.view.ActionMode
        public final View d() {
            WeakReference weakReference = this.i;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.ActionMode
        public final MenuBuilder e() {
            return this.g;
        }

        @Override // androidx.appcompat.view.ActionMode
        public final MenuInflater f() {
            return new SupportMenuInflater(this.f);
        }

        @Override // androidx.appcompat.view.ActionMode
        public final CharSequence g() {
            return WindowDecorActionBar.this.f.getSubtitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        public final CharSequence h() {
            return WindowDecorActionBar.this.f.getTitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void i() {
            if (WindowDecorActionBar.this.i != this) {
                return;
            }
            MenuBuilder menuBuilder = this.g;
            menuBuilder.B();
            try {
                this.h.c(this, menuBuilder);
            } finally {
                menuBuilder.A();
            }
        }

        @Override // androidx.appcompat.view.ActionMode
        public final boolean j() {
            return WindowDecorActionBar.this.f.v;
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void k(View view) {
            WindowDecorActionBar.this.f.setCustomView(view);
            this.i = new WeakReference(view);
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void l(int i) {
            m(WindowDecorActionBar.this.f112a.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void m(CharSequence charSequence) {
            WindowDecorActionBar.this.f.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void n(int i) {
            o(WindowDecorActionBar.this.f112a.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void o(CharSequence charSequence) {
            WindowDecorActionBar.this.f.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void p(boolean z) {
            this.e = z;
            WindowDecorActionBar.this.f.setTitleOptional(z);
        }
    }

    @RestrictTo
    public class TabImpl extends ActionBar.Tab {
        @Override // androidx.appcompat.app.ActionBar.Tab
        public final void a() {
            throw null;
        }
    }

    public WindowDecorActionBar(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.s = true;
        this.w = new AnonymousClass1();
        this.x = new AnonymousClass2();
        this.y = new ViewPropertyAnimatorUpdateListener() { // from class: androidx.appcompat.app.WindowDecorActionBar.3
            @Override // androidx.core.view.ViewPropertyAnimatorUpdateListener
            public final void a() {
                ((View) WindowDecorActionBar.this.d.getParent()).invalidate();
            }
        };
        View decorView = activity.getWindow().getDecorView();
        F(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void A(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void B(CharSequence charSequence) {
        this.e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void C() {
        if (this.p) {
            this.p = false;
            I(false);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final ActionMode D(ActionMode.Callback callback) {
        ActionModeImpl actionModeImpl = this.i;
        if (actionModeImpl != null) {
            actionModeImpl.c();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.g();
        ActionModeImpl actionModeImpl2 = new ActionModeImpl(this.f.getContext(), callback);
        MenuBuilder menuBuilder = actionModeImpl2.g;
        menuBuilder.B();
        try {
            if (!((AppCompatDelegateImpl.ActionModeCallbackWrapperV9) actionModeImpl2.h).f101a.a(actionModeImpl2, menuBuilder)) {
                return null;
            }
            this.i = actionModeImpl2;
            actionModeImpl2.i();
            this.f.e(actionModeImpl2);
            E(true);
            return actionModeImpl2;
        } finally {
            menuBuilder.A();
        }
    }

    public final void E(boolean z2) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatT;
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatH;
        if (z2) {
            if (!this.r) {
                this.r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                I(false);
            }
        } else if (this.r) {
            this.r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            I(false);
        }
        if (!this.d.isLaidOut()) {
            if (z2) {
                this.e.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                this.e.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            viewPropertyAnimatorCompatH = this.e.t(4, 100L);
            viewPropertyAnimatorCompatT = this.f.h(0, 200L);
        } else {
            viewPropertyAnimatorCompatT = this.e.t(0, 200L);
            viewPropertyAnimatorCompatH = this.f.h(8, 100L);
        }
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = new ViewPropertyAnimatorCompatSet();
        ArrayList arrayList = viewPropertyAnimatorCompatSet.f129a;
        arrayList.add(viewPropertyAnimatorCompatH);
        View view = (View) viewPropertyAnimatorCompatH.f2494a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) viewPropertyAnimatorCompatT.f2494a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(viewPropertyAnimatorCompatT);
        viewPropertyAnimatorCompatSet.b();
    }

    public final void F(View view) {
        DecorToolbar wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.woolworths.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.woolworths.R.id.action_bar);
        if (callbackFindViewById instanceof DecorToolbar) {
            wrapper = (DecorToolbar) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(com.woolworths.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.woolworths.R.id.action_bar_container);
        this.d = actionBarContainer;
        DecorToolbar decorToolbar = this.e;
        if (decorToolbar == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        this.f112a = decorToolbar.getContext();
        if ((this.e.q() & 4) != 0) {
            this.h = true;
        }
        Context context = ActionBarPolicy.a(this.f112a).f123a;
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        H(context.getResources().getBoolean(com.woolworths.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f112a.obtainStyledAttributes(null, androidx.appcompat.R.styleable.f88a, com.woolworths.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.j) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.v = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ViewCompat.F(this.d, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void G(int i, int i2) {
        int iQ = this.e.q();
        if ((i2 & 4) != 0) {
            this.h = true;
        }
        this.e.i((i & i2) | ((~i2) & iQ));
    }

    public final void H(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            this.e.p();
        } else {
            this.e.p();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        this.e.m(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void I(boolean z2) {
        boolean z3 = this.p;
        boolean z4 = this.q;
        boolean z5 = this.r;
        ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener = this.y;
        View view = this.g;
        if (!z5 && (z3 || z4)) {
            if (this.s) {
                this.s = false;
                ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.t;
                if (viewPropertyAnimatorCompatSet != null) {
                    viewPropertyAnimatorCompatSet.a();
                }
                int i = this.n;
                ViewPropertyAnimatorListener viewPropertyAnimatorListener = this.w;
                if (i != 0 || (!this.u && !z2)) {
                    ((AnonymousClass1) viewPropertyAnimatorListener).d();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet2 = new ViewPropertyAnimatorCompatSet();
                float f = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompatB = ViewCompat.b(this.d);
                viewPropertyAnimatorCompatB.e(f);
                View view2 = (View) viewPropertyAnimatorCompatB.f2494a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(viewPropertyAnimatorUpdateListener != null ? new g(0, viewPropertyAnimatorUpdateListener, view2) : null);
                }
                boolean z6 = viewPropertyAnimatorCompatSet2.e;
                ArrayList arrayList = viewPropertyAnimatorCompatSet2.f129a;
                if (!z6) {
                    arrayList.add(viewPropertyAnimatorCompatB);
                }
                if (this.o && view != null) {
                    ViewPropertyAnimatorCompat viewPropertyAnimatorCompatB2 = ViewCompat.b(view);
                    viewPropertyAnimatorCompatB2.e(f);
                    if (!viewPropertyAnimatorCompatSet2.e) {
                        arrayList.add(viewPropertyAnimatorCompatB2);
                    }
                }
                boolean z7 = viewPropertyAnimatorCompatSet2.e;
                if (!z7) {
                    viewPropertyAnimatorCompatSet2.c = z;
                }
                if (!z7) {
                    viewPropertyAnimatorCompatSet2.b = 250L;
                }
                ViewPropertyAnimatorListenerAdapter viewPropertyAnimatorListenerAdapter = (ViewPropertyAnimatorListenerAdapter) viewPropertyAnimatorListener;
                if (!z7) {
                    viewPropertyAnimatorCompatSet2.d = viewPropertyAnimatorListenerAdapter;
                }
                this.t = viewPropertyAnimatorCompatSet2;
                viewPropertyAnimatorCompatSet2.b();
                return;
            }
            return;
        }
        if (this.s) {
            return;
        }
        this.s = true;
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet3 = this.t;
        if (viewPropertyAnimatorCompatSet3 != null) {
            viewPropertyAnimatorCompatSet3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        ViewPropertyAnimatorListener viewPropertyAnimatorListener2 = this.x;
        if (i2 == 0 && (this.u || z2)) {
            this.d.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            float f2 = -this.d.getHeight();
            if (z2) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.d.setTranslationY(f2);
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet4 = new ViewPropertyAnimatorCompatSet();
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatB3 = ViewCompat.b(this.d);
            viewPropertyAnimatorCompatB3.e(BitmapDescriptorFactory.HUE_RED);
            View view3 = (View) viewPropertyAnimatorCompatB3.f2494a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(viewPropertyAnimatorUpdateListener != null ? new g(0, viewPropertyAnimatorUpdateListener, view3) : null);
            }
            boolean z8 = viewPropertyAnimatorCompatSet4.e;
            ArrayList arrayList2 = viewPropertyAnimatorCompatSet4.f129a;
            if (!z8) {
                arrayList2.add(viewPropertyAnimatorCompatB3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompatB4 = ViewCompat.b(view);
                viewPropertyAnimatorCompatB4.e(BitmapDescriptorFactory.HUE_RED);
                if (!viewPropertyAnimatorCompatSet4.e) {
                    arrayList2.add(viewPropertyAnimatorCompatB4);
                }
            }
            boolean z9 = viewPropertyAnimatorCompatSet4.e;
            if (!z9) {
                viewPropertyAnimatorCompatSet4.c = A;
            }
            if (!z9) {
                viewPropertyAnimatorCompatSet4.b = 250L;
            }
            ViewPropertyAnimatorListenerAdapter viewPropertyAnimatorListenerAdapter2 = (ViewPropertyAnimatorListenerAdapter) viewPropertyAnimatorListener2;
            if (!z9) {
                viewPropertyAnimatorCompatSet4.d = viewPropertyAnimatorListenerAdapter2;
            }
            this.t = viewPropertyAnimatorCompatSet4;
            viewPropertyAnimatorCompatSet4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            if (this.o && view != null) {
                view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
            ((AnonymousClass2) viewPropertyAnimatorListener2).d();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            ViewCompat.y(actionBarOverlayLayout);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public final void a() {
        if (this.q) {
            this.q = false;
            I(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public final void b() {
        if (this.q) {
            return;
        }
        this.q = true;
        I(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public final void c() {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.t;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.a();
            this.t = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public final void d(boolean z2) {
        this.o = z2;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean f() {
        DecorToolbar decorToolbar = this.e;
        if (decorToolbar == null || !decorToolbar.h()) {
            return false;
        }
        this.e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void g(boolean z2) {
        if (z2 == this.l) {
            return;
        }
        this.l = z2;
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ActionBar.OnMenuVisibilityListener) arrayList.get(i)).a();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int h() {
        return this.e.q();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final Context i() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.f112a.getTheme().resolveAttribute(com.woolworths.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.f112a, i);
            } else {
                this.b = this.f112a;
            }
        }
        return this.b;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final CharSequence j() {
        return this.e.getTitle();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void k() {
        if (this.p) {
            return;
        }
        this.p = true;
        I(false);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void m() {
        H(ActionBarPolicy.a(this.f112a).f123a.getResources().getBoolean(com.woolworths.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean o(int i, KeyEvent keyEvent) {
        MenuBuilder menuBuilder;
        ActionModeImpl actionModeImpl = this.i;
        if (actionModeImpl == null || (menuBuilder = actionModeImpl.g) == null) {
            return false;
        }
        menuBuilder.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuBuilder.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public final void onWindowVisibilityChanged(int i) {
        this.n = i;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void r(boolean z2) {
        if (this.h) {
            return;
        }
        s(z2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void s(boolean z2) {
        G(z2 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void t() {
        G(2, 2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void u() {
        G(0, 8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void v(int i) {
        this.e.k(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void w(String str) {
        this.e.j(str);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void x(Drawable drawable) {
        this.e.s(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void y() {
        this.e.o(null);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void z(boolean z2) {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet;
        this.u = z2;
        if (z2 || (viewPropertyAnimatorCompatSet = this.t) == null) {
            return;
        }
        viewPropertyAnimatorCompatSet.a();
    }

    public WindowDecorActionBar(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.s = true;
        this.w = new AnonymousClass1();
        this.x = new AnonymousClass2();
        this.y = new ViewPropertyAnimatorUpdateListener() { // from class: androidx.appcompat.app.WindowDecorActionBar.3
            @Override // androidx.core.view.ViewPropertyAnimatorUpdateListener
            public final void a() {
                ((View) WindowDecorActionBar.this.d.getParent()).invalidate();
            }
        };
        F(dialog.getWindow().getDecorView());
    }
}
