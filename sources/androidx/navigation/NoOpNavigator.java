package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.navigation.Navigator;
import kotlin.Metadata;

@Navigator.Name("NoOp")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/navigation/NoOpNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@RestrictTo
/* loaded from: classes2.dex */
public final class NoOpNavigator extends Navigator<NavDestination> {
    @Override // androidx.navigation.Navigator
    public final NavDestination a() {
        return new NavDestination(this);
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination c(NavDestination navDestination, Bundle bundle, NavOptions navOptions) {
        return navDestination;
    }
}
