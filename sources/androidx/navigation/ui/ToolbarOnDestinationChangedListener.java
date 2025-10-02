package androidx.navigation.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.internal.NavControllerImpl;
import androidx.transition.TransitionManager;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/ui/ToolbarOnDestinationChangedListener;", "Landroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener;", "navigation-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ToolbarOnDestinationChangedListener extends AbstractAppBarOnDestinationChangedListener {
    public final WeakReference f;

    /* JADX WARN: Illegal instructions before constructor call */
    public ToolbarOnDestinationChangedListener(Toolbar toolbar, AppBarConfiguration appBarConfiguration) {
        Intrinsics.h(toolbar, "toolbar");
        Context context = toolbar.getContext();
        Intrinsics.g(context, "getContext(...)");
        super(context, appBarConfiguration);
        this.f = new WeakReference(toolbar);
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener, androidx.navigation.NavController.OnDestinationChangedListener
    public final void a(NavController navController, NavDestination destination, Bundle bundle) {
        Intrinsics.h(destination, "destination");
        if (((Toolbar) this.f.get()) != null) {
            super.a(navController, destination, bundle);
            return;
        }
        NavControllerImpl navControllerImpl = navController.b;
        navControllerImpl.getClass();
        navControllerImpl.q.remove(this);
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    public final void b(DrawerArrowDrawable drawerArrowDrawable, int i) {
        Toolbar toolbar = (Toolbar) this.f.get();
        if (toolbar != null) {
            boolean z = drawerArrowDrawable == null && toolbar.getNavigationIcon() != null;
            toolbar.setNavigationIcon(drawerArrowDrawable);
            toolbar.setNavigationContentDescription(i);
            if (z) {
                TransitionManager.a(toolbar, null);
            }
        }
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    public final void c(String str) {
        Toolbar toolbar = (Toolbar) this.f.get();
        if (toolbar != null) {
            toolbar.setTitle(str);
        }
    }
}
