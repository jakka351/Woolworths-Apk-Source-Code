package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.view.ViewPropertyAnimatorCompat;

@RestrictTo
/* loaded from: classes2.dex */
public interface DecorToolbar {
    boolean a();

    boolean b();

    boolean c();

    void collapseActionView();

    boolean d();

    void e(Menu menu, MenuPresenter.Callback callback);

    void f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    void i(int i);

    void j(CharSequence charSequence);

    void k(int i);

    void l();

    void m(boolean z);

    void n();

    void o(Drawable drawable);

    void p();

    int q();

    void r();

    void s(Drawable drawable);

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    ViewPropertyAnimatorCompat t(int i, long j);

    void u(int i);
}
