package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Navigator.Name("composable")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/navigation/compose/ComposeNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/compose/ComposeNavigator$Destination;", "<init>", "()V", "Destination", "Companion", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ComposeNavigator extends Navigator<Destination> {
    public final MutableState c = SnapshotStateKt.f(Boolean.FALSE);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/compose/ComposeNavigator$Companion;", "", "", "NAME", "Ljava/lang/String;", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/compose/ComposeNavigator$Destination;", "Landroidx/navigation/NavDestination;", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @NavDestination.ClassType
    public static final class Destination extends NavDestination {
        public final Function4 j;
        public Function1 k;
        public Function1 l;
        public Function1 m;
        public Function1 n;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: androidx.navigation.compose.ComposeNavigator$Destination$1, reason: invalid class name */
        final class AnonymousClass1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                ((Number) obj4).intValue();
                throw null;
            }
        }

        public Destination(ComposeNavigator composeNavigator, ComposableLambdaImpl composableLambdaImpl) {
            super(composeNavigator);
            this.j = composableLambdaImpl;
        }
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination a() {
        return new Destination(this, ComposableSingletons$ComposeNavigatorKt.f3495a);
    }

    @Override // androidx.navigation.Navigator
    public final void d(List list, NavOptions navOptions) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().h((NavBackStackEntry) it.next());
        }
        ((SnapshotMutableStateImpl) this.c).setValue(Boolean.FALSE);
    }

    @Override // androidx.navigation.Navigator
    public final void i(NavBackStackEntry navBackStackEntry, boolean z) {
        b().e(navBackStackEntry, z);
        ((SnapshotMutableStateImpl) this.c).setValue(Boolean.TRUE);
    }
}
