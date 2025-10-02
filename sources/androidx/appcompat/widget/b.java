package androidx.appcompat.widget;

import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Toolbar e;

    public /* synthetic */ b(Toolbar toolbar, int i) {
        this.d = i;
        this.e = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                Toolbar.ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.e.P;
                MenuItemImpl menuItemImpl = expandedActionViewMenuPresenter == null ? null : expandedActionViewMenuPresenter.e;
                if (menuItemImpl != null) {
                    menuItemImpl.collapseActionView();
                    break;
                }
                break;
            default:
                this.e.o();
                break;
        }
    }
}
