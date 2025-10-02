package androidx.appcompat.view.menu;

import YU.a;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.MenuItemHoverListener;
import androidx.appcompat.widget.MenuPopupWindow;
import com.woolworths.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class CascadingMenuPopup extends MenuPopup implements MenuPresenter, View.OnKeyListener, PopupWindow.OnDismissListener {
    public MenuPresenter.Callback A;
    public ViewTreeObserver B;
    public PopupWindow.OnDismissListener C;
    public boolean D;
    public final Context e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public final Handler j;
    public View r;
    public View s;
    public int t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public boolean z;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener m = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
            ArrayList arrayList = cascadingMenuPopup.l;
            if (!cascadingMenuPopup.b() || arrayList.size() <= 0 || ((CascadingMenuInfo) arrayList.get(0)).f133a.B) {
                return;
            }
            View view = cascadingMenuPopup.s;
            if (view == null || !view.isShown()) {
                cascadingMenuPopup.dismiss();
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((CascadingMenuInfo) it.next()).f133a.a();
            }
        }
    };
    public final View.OnAttachStateChangeListener n = new View.OnAttachStateChangeListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.2
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
            ViewTreeObserver viewTreeObserver = cascadingMenuPopup.B;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    cascadingMenuPopup.B = view.getViewTreeObserver();
                }
                cascadingMenuPopup.B.removeGlobalOnLayoutListener(cascadingMenuPopup.m);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    public final MenuItemHoverListener o = new MenuItemHoverListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.3
        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public final void h(MenuBuilder menuBuilder, MenuItem menuItem) {
            CascadingMenuPopup.this.j.removeCallbacksAndMessages(menuBuilder);
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public final void k(final MenuBuilder menuBuilder, final MenuItemImpl menuItemImpl) {
            CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
            Handler handler = cascadingMenuPopup.j;
            handler.removeCallbacksAndMessages(null);
            ArrayList arrayList = cascadingMenuPopup.l;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (menuBuilder == ((CascadingMenuInfo) arrayList.get(i)).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            final CascadingMenuInfo cascadingMenuInfo = i2 < arrayList.size() ? (CascadingMenuInfo) arrayList.get(i2) : null;
            handler.postAtTime(new Runnable() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    CascadingMenuPopup cascadingMenuPopup2 = CascadingMenuPopup.this;
                    CascadingMenuInfo cascadingMenuInfo2 = cascadingMenuInfo;
                    if (cascadingMenuInfo2 != null) {
                        cascadingMenuPopup2.D = true;
                        cascadingMenuInfo2.b.d(false);
                        cascadingMenuPopup2.D = false;
                    }
                    MenuItemImpl menuItemImpl2 = menuItemImpl;
                    if (menuItemImpl2.isEnabled() && menuItemImpl2.hasSubMenu()) {
                        menuBuilder.r(menuItemImpl2, null, 4);
                    }
                }
            }, menuBuilder, SystemClock.uptimeMillis() + 200);
        }
    };
    public int p = 0;
    public int q = 0;
    public boolean y = false;

    public static class CascadingMenuInfo {

        /* renamed from: a, reason: collision with root package name */
        public final MenuPopupWindow f133a;
        public final MenuBuilder b;
        public final int c;

        public CascadingMenuInfo(MenuPopupWindow menuPopupWindow, MenuBuilder menuBuilder, int i) {
            this.f133a = menuPopupWindow;
            this.b = menuBuilder;
            this.c = i;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface HorizPosition {
    }

    public CascadingMenuPopup(Context context, View view, int i, int i2, boolean z) {
        this.e = context;
        this.r = view;
        this.g = i;
        this.h = i2;
        this.i = z;
        this.t = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.j = new Handler();
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void a() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w((MenuBuilder) it.next());
        }
        arrayList.clear();
        View view = this.r;
        this.s = view;
        if (view != null) {
            boolean z = this.B == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.B = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.m);
            }
            this.s.addOnAttachStateChangeListener(this.n);
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final boolean b() {
        ArrayList arrayList = this.l;
        return arrayList.size() > 0 && ((CascadingMenuInfo) arrayList.get(0)).f133a.C.isShowing();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void c(MenuBuilder menuBuilder, boolean z) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuBuilder == ((CascadingMenuInfo) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((CascadingMenuInfo) arrayList.get(i2)).b.d(false);
        }
        CascadingMenuInfo cascadingMenuInfo = (CascadingMenuInfo) arrayList.remove(i);
        MenuBuilder menuBuilder2 = cascadingMenuInfo.b;
        MenuPopupWindow menuPopupWindow = cascadingMenuInfo.f133a;
        menuBuilder2.s(this);
        if (this.D) {
            menuPopupWindow.t();
            menuPopupWindow.C.setAnimationStyle(0);
        }
        menuPopupWindow.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.t = ((CascadingMenuInfo) arrayList.get(size2 - 1)).c;
        } else {
            this.t = this.r.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((CascadingMenuInfo) arrayList.get(0)).b.d(false);
                return;
            }
            return;
        }
        dismiss();
        MenuPresenter.Callback callback = this.A;
        if (callback != null) {
            callback.c(menuBuilder, true);
        }
        ViewTreeObserver viewTreeObserver = this.B;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.B.removeGlobalOnLayoutListener(this.m);
            }
            this.B = null;
        }
        this.s.removeOnAttachStateChangeListener(this.n);
        this.C.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final Parcelable d() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        if (size > 0) {
            CascadingMenuInfo[] cascadingMenuInfoArr = (CascadingMenuInfo[]) arrayList.toArray(new CascadingMenuInfo[size]);
            for (int i = size - 1; i >= 0; i--) {
                CascadingMenuInfo cascadingMenuInfo = cascadingMenuInfoArr[i];
                if (cascadingMenuInfo.f133a.C.isShowing()) {
                    cascadingMenuInfo.f133a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void f(boolean z) {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((CascadingMenuInfo) it.next()).f133a.f.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((MenuAdapter) adapter).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final ListView i() {
        ArrayList arrayList = this.l;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((CascadingMenuInfo) a.c(1, arrayList)).f133a.f;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void j(MenuPresenter.Callback callback) {
        this.A = callback;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void l(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean m(SubMenuBuilder subMenuBuilder) {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            CascadingMenuInfo cascadingMenuInfo = (CascadingMenuInfo) it.next();
            if (subMenuBuilder == cascadingMenuInfo.b) {
                cascadingMenuInfo.f133a.f.requestFocus();
                return true;
            }
        }
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        n(subMenuBuilder);
        MenuPresenter.Callback callback = this.A;
        if (callback != null) {
            callback.d(subMenuBuilder);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void n(MenuBuilder menuBuilder) {
        menuBuilder.c(this, this.e);
        if (b()) {
            w(menuBuilder);
        } else {
            this.k.add(menuBuilder);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        CascadingMenuInfo cascadingMenuInfo;
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                cascadingMenuInfo = null;
                break;
            }
            cascadingMenuInfo = (CascadingMenuInfo) arrayList.get(i);
            if (!cascadingMenuInfo.f133a.C.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (cascadingMenuInfo != null) {
            cascadingMenuInfo.b.d(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void p(View view) {
        if (this.r != view) {
            this.r = view;
            this.q = Gravity.getAbsoluteGravity(this.p, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void q(boolean z) {
        this.y = z;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void r(int i) {
        if (this.p != i) {
            this.p = i;
            this.q = Gravity.getAbsoluteGravity(i, this.r.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void s(int i) {
        this.u = true;
        this.w = i;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.C = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void u(boolean z) {
        this.z = z;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void v(int i) {
        this.v = true;
        this.x = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(androidx.appcompat.view.menu.MenuBuilder r19) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.CascadingMenuPopup.w(androidx.appcompat.view.menu.MenuBuilder):void");
    }
}
