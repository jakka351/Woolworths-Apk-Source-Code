package au.com.woolworths.shop.lists.ui.details.ui;

import android.widget.LinearLayout;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

/* loaded from: classes4.dex */
public abstract class Hilt_ListDetailsView extends LinearLayout implements GeneratedComponentManagerHolder {
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
