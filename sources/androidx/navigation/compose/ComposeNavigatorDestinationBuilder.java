package androidx.navigation.compose;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavDestination;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.compose.ComposeNavigator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;

@StabilityInferred
@NavDestinationDsl
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/compose/ComposeNavigator$Destination;", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposeNavigatorDestinationBuilder extends NavDestinationBuilder<ComposeNavigator.Destination> {
    public final ComposeNavigator h;
    public final ComposableLambdaImpl i;
    public Function1 j;
    public Function1 k;
    public Function1 l;
    public Function1 m;

    public ComposeNavigatorDestinationBuilder(ComposeNavigator composeNavigator, KClass kClass, Map map, ComposableLambdaImpl composableLambdaImpl) {
        super(composeNavigator, kClass, map);
        this.h = composeNavigator;
        this.i = composableLambdaImpl;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public final NavDestination a() {
        ComposeNavigator.Destination destination = (ComposeNavigator.Destination) super.a();
        destination.k = this.j;
        destination.l = this.k;
        destination.m = this.l;
        destination.n = this.m;
        return destination;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public final NavDestination b() {
        return new ComposeNavigator.Destination(this.h, this.i);
    }
}
