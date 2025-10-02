package au.com.woolworths.feature.shop.editorder.review.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"edit-order_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CmoReviewOtherScreenKt {
    public static final void a(FullPageMessage.Error error, Function0 onRetry, Composer composer, int i) {
        FullPageMessageSpec fullPageMessageSpecF;
        Function0 function0;
        ComposerImpl composerImpl;
        Intrinsics.h(onRetry, "onRetry");
        ComposerImpl composerImplV = composer.v(1366656850);
        if ((((composerImplV.n(error) ? 4 : 2) | i | (composerImplV.I(onRetry) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function0 = onRetry;
        } else {
            if (error.equals(FullPageMessage.Error.ConnectionError.f8915a)) {
                composerImplV.o(-902752298);
                composerImpl = composerImplV;
                fullPageMessageSpecF = FullPageMessageSpec.Companion.c(null, null, StringResources_androidKt.c(composerImplV, R.string.cmo_review_connection_error), null, onRetry, composerImpl, 23);
                composerImpl.V(false);
                function0 = onRetry;
            } else {
                if (!error.equals(FullPageMessage.Error.ServerError.f8916a)) {
                    throw au.com.woolworths.android.onesite.a.w(-902754789, composerImplV, false);
                }
                composerImplV.o(-902744786);
                fullPageMessageSpecF = FullPageMessageSpec.Companion.f(null, null, null, StringResources_androidKt.c(composerImplV, R.string.cmo_review_server_error), null, onRetry, composerImplV, 23);
                function0 = onRetry;
                composerImpl = composerImplV;
                composerImpl.V(false);
            }
            composerImplV = composerImpl;
            FullPageMessageUiKt.a(fullPageMessageSpecF, null, null, composerImplV, 0, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.account.ui.details.components.c(error, function0, i, 1);
        }
    }

    public static final void b(final boolean z, Composer composer, final int i, final int i2) {
        int i3;
        long jB;
        long j;
        ComposerImpl composerImplV = composer.v(-1190961398);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (i4 != 0) {
                z = false;
            }
            FillElement fillElement = SizeKt.c;
            if (z) {
                composerImplV.o(794076935);
                jB = Color.b(CoreTheme.b(composerImplV).e.f4848a.b.f4851a, 0.6f);
                composerImplV.V(false);
            } else {
                composerImplV.o(794194146);
                jB = CoreTheme.b(composerImplV).e.f4848a.c;
                composerImplV.V(false);
            }
            Modifier modifierB = BackgroundKt.b(fillElement, jB, RectangleShapeKt.f1779a);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i5 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier modifierG = BoxScopeInstance.f944a.g(Modifier.Companion.d, Alignment.Companion.e);
            if (z) {
                composerImplV.o(317052844);
                j = CoreTheme.b(composerImplV).e.c.c.b;
                composerImplV.V(false);
            } else {
                composerImplV.o(317139892);
                j = CoreTheme.b(composerImplV).e.c.f4854a;
                composerImplV.V(false);
            }
            CircularProgressIndicatorKt.b(modifierG, j, BitmapDescriptorFactory.HUE_RED, 0, composerImplV, 0, 12);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.shop.editorder.review.components.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    CmoReviewOtherScreenKt.b(z, (Composer) obj, iA, i2);
                    return Unit.f24250a;
                }
            };
        }
    }
}
