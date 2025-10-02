package androidx.navigation.ui;

import android.os.Bundle;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/ui/CollapsingToolbarOnDestinationChangedListener;", "Landroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener;", "navigation-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CollapsingToolbarOnDestinationChangedListener extends AbstractAppBarOnDestinationChangedListener {
    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener, androidx.navigation.NavController.OnDestinationChangedListener
    public final void a(NavController navController, NavDestination destination, Bundle bundle) {
        Intrinsics.h(destination, "destination");
        throw null;
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    public final void b(DrawerArrowDrawable drawerArrowDrawable, int i) {
        throw null;
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    public final void c(String str) {
        throw null;
    }
}
