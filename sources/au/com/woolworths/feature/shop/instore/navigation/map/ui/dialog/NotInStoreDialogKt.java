package au.com.woolworths.feature.shop.instore.navigation.map.ui.dialog;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.experimental.dialog.AlertDialogKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.homepage.presentation.lists.b;
import au.com.woolworths.feature.shop.instore.navigation.featurehighlight.a;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class NotInStoreDialogKt {
    public static final void a(int i, Composer composer, Modifier modifier, final Function0 onDismissAction, Function0 onDialogImpression) {
        int i2;
        Intrinsics.h(onDismissAction, "onDismissAction");
        Intrinsics.h(onDialogImpression, "onDialogImpression");
        ComposerImpl composerImplV = composer.v(-586059348);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(onDismissAction) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(onDialogImpression) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(5004770);
            boolean z = (i3 & 896) == 256;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new NotInStoreDialogKt$NotInStoreDialog$1$1(onDialogImpression, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG);
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(380249552, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.dialog.NotInStoreDialogKt$NotInStoreDialog$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC = StringResources_androidKt.c(composer2, R.string.not_instore_positioning_error_title);
                        String strC2 = StringResources_androidKt.c(composer2, R.string.not_instore_positioning_error_text);
                        String strC3 = StringResources_androidKt.c(composer2, R.string.ok);
                        composer2.o(5004770);
                        Function0 function0 = onDismissAction;
                        boolean zN = composer2.n(function0);
                        Object objG2 = composer2.G();
                        if (zN || objG2 == Composer.Companion.f1624a) {
                            objG2 = new b(15, function0);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        AlertDialogKt.a(strC2, strC3, Modifier.Companion.d, strC, null, null, (Function0) objG2, composer2, 0, 48);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            modifier = Modifier.Companion.d;
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(onDismissAction, modifier2, onDialogImpression, i, 3);
        }
    }
}
