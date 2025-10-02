package au.com.woolworths.shop.cart.ui;

import android.widget.ActionMenuView;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

/* loaded from: classes4.dex */
public abstract class Hilt_CartBadgeActionView extends ActionMenuView implements GeneratedComponentManagerHolder {
    public ViewComponentManager d;
    public boolean e;

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object t3() {
        if (this.d == null) {
            this.d = new ViewComponentManager(this);
        }
        return this.d.t3();
    }
}
