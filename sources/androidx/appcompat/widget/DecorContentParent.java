package androidx.appcompat.widget;

import android.view.Menu;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuPresenter;

@RestrictTo
/* loaded from: classes2.dex */
public interface DecorContentParent {
    boolean a();

    boolean b();

    boolean c();

    boolean d();

    void e(Menu menu, MenuPresenter.Callback callback);

    void f();

    boolean g();

    void k(int i);

    void m();

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
