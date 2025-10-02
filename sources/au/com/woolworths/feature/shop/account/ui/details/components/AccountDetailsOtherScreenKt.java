package au.com.woolworths.feature.shop.account.ui.details.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.experimental.progressindicator.CircularProgressIndicatorKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AccountDetailsOtherScreenKt {
    public static final void a(FullPageMessage.Error error, Function0 onRetry, Composer composer, int i) {
        FullPageMessageSpec fullPageMessageSpecF;
        Function0 function0;
        ComposerImpl composerImpl;
        Intrinsics.h(onRetry, "onRetry");
        ComposerImpl composerImplV = composer.v(-970597233);
        if ((((composerImplV.n(error) ? 4 : 2) | i | (composerImplV.I(onRetry) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function0 = onRetry;
        } else {
            if (error.equals(FullPageMessage.Error.ConnectionError.f8915a)) {
                composerImplV.o(-736030248);
                composerImpl = composerImplV;
                fullPageMessageSpecF = FullPageMessageSpec.Companion.c(null, null, StringResources_androidKt.c(composerImplV, R.string.account_details_connection_error), null, onRetry, composerImpl, 23);
                composerImpl.V(false);
                function0 = onRetry;
            } else {
                if (!error.equals(FullPageMessage.Error.ServerError.f8916a)) {
                    throw au.com.woolworths.android.onesite.a.w(-736032734, composerImplV, false);
                }
                composerImplV.o(-736022576);
                fullPageMessageSpecF = FullPageMessageSpec.Companion.f(null, null, null, StringResources_androidKt.c(composerImplV, R.string.account_details_server_error), null, onRetry, composerImplV, 23);
                function0 = onRetry;
                composerImpl = composerImplV;
                composerImpl.V(false);
            }
            composerImplV = composerImpl;
            FullPageMessageUiKt.a(fullPageMessageSpecF, null, null, composerImplV, 0, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(error, function0, i, 0);
        }
    }

    public static final void b(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(602064555);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierB = BackgroundKt.b(SizeKt.c, CoreTheme.b(composerImplV).e.f4848a.c, RectangleShapeKt.f1779a);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            CircularProgressIndicatorKt.b(BoxScopeInstance.f944a.g(Modifier.Companion.d, Alignment.Companion.e), 0L, BitmapDescriptorFactory.HUE_RED, 0, composerImplV, 0, 14);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.instore.wifi.ui.b(i, 9);
        }
    }
}
