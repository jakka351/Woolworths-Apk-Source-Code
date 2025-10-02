package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ShareActionProvider;

/* loaded from: classes2.dex */
public abstract class ActionProvider {

    /* renamed from: a, reason: collision with root package name */
    public SubUiVisibilityListener f2468a;
    public VisibilityListener b;

    @RestrictTo
    public interface SubUiVisibilityListener {
    }

    public interface VisibilityListener {
    }

    public ActionProvider(Context context) {
    }

    public boolean a() {
        return this instanceof ShareActionProvider;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItemImpl menuItemImpl) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenuBuilder subMenuBuilder) {
    }

    public boolean g() {
        return false;
    }

    public void h(VisibilityListener visibilityListener) {
        if (this.b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.b = visibilityListener;
    }
}
