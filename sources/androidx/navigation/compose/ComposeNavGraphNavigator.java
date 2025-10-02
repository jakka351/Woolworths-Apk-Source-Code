package androidx.navigation.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphNavigator;
import androidx.navigation.Navigator;
import kotlin.Metadata;

@StabilityInferred
@Navigator.Name("navigation")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/compose/ComposeNavGraphNavigator;", "Landroidx/navigation/NavGraphNavigator;", "ComposeNavGraph", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposeNavGraphNavigator extends NavGraphNavigator {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;", "Landroidx/navigation/NavGraph;", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ComposeNavGraph extends NavGraph {
    }

    @Override // androidx.navigation.NavGraphNavigator, androidx.navigation.Navigator
    public final NavDestination a() {
        return new ComposeNavGraph(this);
    }

    @Override // androidx.navigation.NavGraphNavigator
    /* renamed from: k */
    public final NavGraph a() {
        return new ComposeNavGraph(this);
    }
}
