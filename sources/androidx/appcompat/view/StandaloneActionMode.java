package androidx.appcompat.view;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

@RestrictTo
/* loaded from: classes2.dex */
public class StandaloneActionMode extends ActionMode implements MenuBuilder.Callback {
    public final Context f;
    public final ActionBarContextView g;
    public final ActionMode.Callback h;
    public WeakReference i;
    public boolean j;
    public final MenuBuilder k;

    public StandaloneActionMode(Context context, ActionBarContextView actionBarContextView, ActionMode.Callback callback) {
        this.f = context;
        this.g = actionBarContextView;
        this.h = callback;
        MenuBuilder menuBuilder = new MenuBuilder(actionBarContextView.getContext());
        menuBuilder.l = 1;
        this.k = menuBuilder;
        menuBuilder.e = this;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public final boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
        return this.h.b(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public final void b(MenuBuilder menuBuilder) {
        i();
        this.g.i();
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void c() {
        if (this.j) {
            return;
        }
        this.j = true;
        this.h.d(this);
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
        return this.k;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final MenuInflater f() {
        return new SupportMenuInflater(this.g.getContext());
    }

    @Override // androidx.appcompat.view.ActionMode
    public final CharSequence g() {
        return this.g.getSubtitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public final CharSequence h() {
        return this.g.getTitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void i() {
        this.h.c(this, this.k);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final boolean j() {
        return this.g.v;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void k(View view) {
        this.g.setCustomView(view);
        this.i = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void l(int i) {
        m(this.f.getString(i));
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void m(CharSequence charSequence) {
        this.g.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void n(int i) {
        o(this.f.getString(i));
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void o(CharSequence charSequence) {
        this.g.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void p(boolean z) {
        this.e = z;
        this.g.setTitleOptional(z);
    }
}
