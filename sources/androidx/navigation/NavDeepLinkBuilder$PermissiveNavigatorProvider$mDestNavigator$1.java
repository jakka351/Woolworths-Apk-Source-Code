package androidx.navigation;

import android.os.Bundle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/navigation/NavDeepLinkBuilder$PermissiveNavigatorProvider$mDestNavigator$1", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavDeepLinkBuilder$PermissiveNavigatorProvider$mDestNavigator$1 extends Navigator<NavDestination> {
    @Override // androidx.navigation.Navigator
    public final NavDestination a() {
        return new NavDestination("permissive");
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination c(NavDestination navDestination, Bundle bundle, NavOptions navOptions) {
        throw new IllegalStateException("navigate is not supported");
    }

    @Override // androidx.navigation.Navigator
    public final boolean j() {
        throw new IllegalStateException("popBackStack is not supported");
    }
}
