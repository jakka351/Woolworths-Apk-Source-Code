package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes2.dex */
public interface MenuPresenter {

    public interface Callback {
        void c(MenuBuilder menuBuilder, boolean z);

        boolean d(MenuBuilder menuBuilder);
    }

    void c(MenuBuilder menuBuilder, boolean z);

    Parcelable d();

    boolean e(MenuItemImpl menuItemImpl);

    void f(boolean z);

    boolean g();

    int getId();

    void h(Context context, MenuBuilder menuBuilder);

    void j(Callback callback);

    boolean k(MenuItemImpl menuItemImpl);

    void l(Parcelable parcelable);

    boolean m(SubMenuBuilder subMenuBuilder);
}
