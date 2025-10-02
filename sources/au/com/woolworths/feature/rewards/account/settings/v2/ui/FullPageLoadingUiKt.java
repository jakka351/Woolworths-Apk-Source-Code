package au.com.woolworths.feature.rewards.account.settings.v2.ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.android.onesite.deeplink.h;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FullPageLoadingUiKt {
    public static final void a(Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1278182064);
        if (((i | 6) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            FillElement fillElement = SizeKt.c;
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = InteractionSourceKt.a();
                composerImplV.A(objG);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == composer$Companion$Empty$1) {
                objD = new h(20);
                composerImplV.A(objD);
            }
            composerImplV.V(false);
            Modifier modifierB = ClickableKt.b(fillElement, mutableInteractionSource, null, false, null, null, (Function0) objD, 28);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
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
            ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 31, 0L, 0L, composerImplV, null);
            composerImplV.V(true);
            modifier = Modifier.Companion.d;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.compose.utils.layout.a(i, 11, modifier);
        }
    }
}
