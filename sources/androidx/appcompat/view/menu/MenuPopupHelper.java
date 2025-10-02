package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuPresenter;
import com.woolworths.R;

@RestrictTo
/* loaded from: classes2.dex */
public class MenuPopupHelper implements MenuHelper {

    /* renamed from: a, reason: collision with root package name */
    public final Context f138a;
    public final MenuBuilder b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public boolean h;
    public MenuPresenter.Callback i;
    public MenuPopup j;
    public PopupWindow.OnDismissListener k;
    public int g = 8388611;
    public final PopupWindow.OnDismissListener l = new PopupWindow.OnDismissListener() { // from class: androidx.appcompat.view.menu.MenuPopupHelper.1
        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            MenuPopupHelper.this.c();
        }
    };

    public MenuPopupHelper(int i, int i2, Context context, View view, MenuBuilder menuBuilder, boolean z) {
        this.f138a = context;
        this.b = menuBuilder;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public final MenuPopup a() {
        MenuPopup standardMenuPopup;
        if (this.j == null) {
            Context context = this.f138a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                standardMenuPopup = new CascadingMenuPopup(this.f138a, this.f, this.d, this.e, this.c);
            } else {
                View view = this.f;
                standardMenuPopup = new StandardMenuPopup(this.d, this.e, this.f138a, view, this.b, this.c);
            }
            standardMenuPopup.n(this.b);
            standardMenuPopup.t(this.l);
            standardMenuPopup.p(this.f);
            standardMenuPopup.j(this.i);
            standardMenuPopup.q(this.h);
            standardMenuPopup.r(this.g);
            this.j = standardMenuPopup;
        }
        return this.j;
    }

    public final boolean b() {
        MenuPopup menuPopup = this.j;
        return menuPopup != null && menuPopup.b();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(boolean z) {
        this.h = z;
        MenuPopup menuPopup = this.j;
        if (menuPopup != null) {
            menuPopup.q(z);
        }
    }

    public final void e(int i, int i2, boolean z, boolean z2) {
        MenuPopup menuPopupA = a();
        menuPopupA.u(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.g, this.f.getLayoutDirection()) & 7) == 5) {
                i -= this.f.getWidth();
            }
            menuPopupA.s(i);
            menuPopupA.v(i2);
            int i3 = (int) ((this.f138a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            menuPopupA.d = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        menuPopupA.a();
    }
}
