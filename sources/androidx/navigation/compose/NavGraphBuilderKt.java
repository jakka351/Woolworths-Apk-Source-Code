package androidx.navigation.compose;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavigatorProvider;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"navigation-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class NavGraphBuilderKt {
    public static final void a(NavGraphBuilder navGraphBuilder, KClass kClass, Map map, Function1 function1, Function1 function12, Function1 function13, Function1 function14, ComposableLambdaImpl composableLambdaImpl) {
        NavigatorProvider navigatorProvider = navGraphBuilder.h;
        navigatorProvider.getClass();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navigatorProvider.b(NavigatorProvider.Companion.a(ComposeNavigator.class)), kClass, map, composableLambdaImpl);
        for (NavDeepLink navDeepLink : EmptyList.d) {
            Intrinsics.h(navDeepLink, "navDeepLink");
            composeNavigatorDestinationBuilder.f.add(navDeepLink);
        }
        composeNavigatorDestinationBuilder.j = function1;
        composeNavigatorDestinationBuilder.k = function12;
        composeNavigatorDestinationBuilder.l = function13;
        composeNavigatorDestinationBuilder.m = function14;
        navGraphBuilder.j.add(composeNavigatorDestinationBuilder.a());
    }
}
