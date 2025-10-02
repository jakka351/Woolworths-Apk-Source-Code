package androidx.navigation.compose;

import android.content.Context;
import androidx.navigation.NavHostController;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.internal.NavControllerImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"navigation-compose_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/navigation/compose/NavHostControllerKt")
@SourceDebugExtension
/* loaded from: classes2.dex */
final /* synthetic */ class NavHostControllerKt__NavHostController_androidKt {
    public static final NavHostController a(Context context) {
        NavHostController navHostController = new NavHostController(context);
        NavControllerImpl navControllerImpl = navHostController.b;
        NavigatorProvider navigatorProvider = navControllerImpl.t;
        navigatorProvider.a(new ComposeNavGraphNavigator(navigatorProvider));
        NavigatorProvider navigatorProvider2 = navControllerImpl.t;
        navigatorProvider2.a(new ComposeNavigator());
        navigatorProvider2.a(new DialogNavigator());
        return navHostController;
    }
}
