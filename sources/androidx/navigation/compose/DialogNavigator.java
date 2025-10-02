package androidx.navigation.compose;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.window.DialogProperties;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Navigator.Name("dialog")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/navigation/compose/DialogNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/compose/DialogNavigator$Destination;", "<init>", "()V", "Destination", "Companion", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DialogNavigator extends Navigator<Destination> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/compose/DialogNavigator$Companion;", "", "", "NAME", "Ljava/lang/String;", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/compose/DialogNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/FloatingWindow;", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @NavDestination.ClassType
    public static final class Destination extends NavDestination implements FloatingWindow {
        public final DialogProperties j;
        public final Function3 k;

        public Destination(DialogNavigator dialogNavigator, DialogProperties dialogProperties, ComposableLambdaImpl composableLambdaImpl) {
            super(dialogNavigator);
            this.j = dialogProperties;
            this.k = composableLambdaImpl;
        }
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination a() {
        return new Destination(this, new DialogProperties(7), ComposableSingletons$DialogNavigatorKt.f3496a);
    }

    @Override // androidx.navigation.Navigator
    public final void d(List list, NavOptions navOptions) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().g((NavBackStackEntry) it.next());
        }
    }

    @Override // androidx.navigation.Navigator
    public final void i(NavBackStackEntry navBackStackEntry, boolean z) {
        b().e(navBackStackEntry, z);
        int iK = CollectionsKt.K((Iterable) b().f.getValue(), navBackStackEntry);
        int i = 0;
        for (Object obj : (Iterable) b().f.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
            if (i > iK) {
                b().b(navBackStackEntry2);
            }
            i = i2;
        }
    }
}
