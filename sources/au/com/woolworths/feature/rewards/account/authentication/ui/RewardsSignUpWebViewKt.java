package au.com.woolworths.feature.rewards.account.authentication.ui;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.navigation.fragment.d;
import au.com.woolworths.android.onesite.appdata.AppEnvironment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsSignUpWebViewKt {
    public static final void a(String url, String callbackUrlPattern, String str, AppEnvironment appEnvironment, Function0 onWebViewError, Function1 onAppCallback, Composer composer, int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(url, "url");
        Intrinsics.h(callbackUrlPattern, "callbackUrlPattern");
        Intrinsics.h(appEnvironment, "appEnvironment");
        Intrinsics.h(onWebViewError, "onWebViewError");
        Intrinsics.h(onAppCallback, "onAppCallback");
        ComposerImpl composerImplV = composer.v(1263744458);
        int i2 = (composerImplV.I(onAppCallback) ? 131072 : 65536) | i | (composerImplV.n(url) ? 4 : 2) | (composerImplV.n(callbackUrlPattern) ? 32 : 16) | (composerImplV.n(str) ? 256 : 128) | (composerImplV.I(appEnvironment) ? 2048 : 1024) | (composerImplV.I(onWebViewError) ? 16384 : 8192);
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Modifier modifierC = SizeKt.c(Modifier.Companion.d, 1.0f);
            composerImplV.o(-1224400529);
            boolean zI = ((57344 & i2) == 16384) | ((i2 & 896) == 256) | ((i2 & 112) == 32) | ((458752 & i2) == 131072) | composerImplV.I(appEnvironment);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                androidx.navigation.internal.c cVar = new androidx.navigation.internal.c(onWebViewError, str, callbackUrlPattern, onAppCallback, appEnvironment);
                composerImplV.A(cVar);
                objG = cVar;
            }
            Function1 function1 = (Function1) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == composer$Companion$Empty$1) {
                objD = new au.com.woolworths.feature.product.list.legacy.compose.filter.a(23);
                composerImplV.A(objD);
            }
            Function1 function12 = (Function1) objD;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean z = (i2 & 14) == 4;
            Object objG2 = composerImplV.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                objG2 = new d(url, 25);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            AndroidView_androidKt.b(function1, modifierC, null, function12, (Function1) objG2, composerImpl, 3120, 4);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.productsearch.c(url, callbackUrlPattern, str, appEnvironment, onWebViewError, onAppCallback, i);
        }
    }
}
