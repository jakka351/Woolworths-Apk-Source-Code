package androidx.core.view;

import android.view.MenuItem;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public final class MenuItemCompat {

    /* renamed from: androidx.core.view.MenuItemCompat$1, reason: invalid class name */
    class AnonymousClass1 implements MenuItem.OnActionExpandListener {
        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            throw null;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            throw null;
        }
    }

    @RequiresApi
    public static class Api26Impl {
    }

    @Deprecated
    public interface OnActionExpandListener {
    }
}
