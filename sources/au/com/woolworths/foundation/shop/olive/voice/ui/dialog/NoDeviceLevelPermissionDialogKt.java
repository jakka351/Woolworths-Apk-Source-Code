package au.com.woolworths.foundation.shop.olive.voice.ui.dialog;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.experimental.dialog.AlertDialogKt;
import au.com.woolworths.feature.rewards.card.unlock.b;
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
public final class NoDeviceLevelPermissionDialogKt {
    public static final void a(int i, Composer composer, Modifier modifier, Function0 onDismissAction) {
        Intrinsics.h(onDismissAction, "onDismissAction");
        ComposerImpl composerImplV = composer.v(283812934);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onDismissAction) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            String strC = StringResources_androidKt.c(composerImplV, R.string.olive_voice_no_device_level_permission_dialog_title);
            String strC2 = StringResources_androidKt.c(composerImplV, R.string.olive_voice_no_device_level_permission_dialog_body);
            String strC3 = StringResources_androidKt.c(composerImplV, R.string.olive_voice_action_ok);
            composerImplV.o(5004770);
            boolean z = (i2 & 112) == 32;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new k(20, onDismissAction);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier.Companion companion = Modifier.Companion.d;
            AlertDialogKt.a(strC2, strC3, companion, strC, null, null, (Function0) objG, composerImplV, KyberEngine.KyberPolyBytes, 48);
            modifier = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(modifier, onDismissAction, i, 5);
        }
    }
}
