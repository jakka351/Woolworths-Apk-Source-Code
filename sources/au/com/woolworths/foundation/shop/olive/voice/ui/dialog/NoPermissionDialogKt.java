package au.com.woolworths.foundation.shop.olive.voice.ui.dialog;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.experimental.dialog.AlertDialogKt;
import au.com.woolworths.feature.shop.instore.navigation.featurehighlight.a;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.k;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"olive-voice_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class NoPermissionDialogKt {
    public static final void a(int i, Composer composer, Modifier modifier, Function0 onPrimaryAction, Function0 onDismissAction) {
        int i2;
        Modifier modifier2;
        Intrinsics.h(onPrimaryAction, "onPrimaryAction");
        Intrinsics.h(onDismissAction, "onDismissAction");
        ComposerImpl composerImplV = composer.v(1046388248);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(onPrimaryAction) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onDismissAction) ? 32 : 16;
        }
        int i3 = i2 | KyberEngine.KyberPolyBytes;
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            String strC = StringResources_androidKt.c(composerImplV, R.string.olive_voice_no_permission_dialog_title);
            String strC2 = StringResources_androidKt.c(composerImplV, R.string.olive_voice_no_permission_dialog_body);
            String strC3 = StringResources_androidKt.c(composerImplV, R.string.olive_voice_action_settings);
            String strC4 = StringResources_androidKt.c(composerImplV, R.string.olive_voice_action_cancel);
            composerImplV.o(5004770);
            boolean z = (i3 & 14) == 4;
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z || objG == composer$Companion$Empty$1) {
                objG = new k(21, onPrimaryAction);
                composerImplV.A(objG);
            }
            Function0 function0 = (Function0) objG;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean z2 = (i3 & 112) == 32;
            Object objG2 = composerImplV.G();
            if (z2 || objG2 == composer$Companion$Empty$1) {
                objG2 = new k(22, onDismissAction);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier.Companion companion = Modifier.Companion.d;
            AlertDialogKt.a(strC2, strC4, companion, strC, strC3, function0, (Function0) objG2, composerImplV, KyberEngine.KyberPolyBytes, 0);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(onPrimaryAction, onDismissAction, modifier2, i, 5);
        }
    }
}
