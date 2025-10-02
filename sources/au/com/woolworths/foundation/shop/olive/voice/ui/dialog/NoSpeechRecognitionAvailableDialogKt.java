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
public final class NoSpeechRecognitionAvailableDialogKt {
    public static final void a(int i, Composer composer, Modifier modifier, Function0 onDismissAction) {
        int i2;
        Intrinsics.h(onDismissAction, "onDismissAction");
        ComposerImpl composerImplV = composer.v(-759784358);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(onDismissAction) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            String strC = StringResources_androidKt.c(composerImplV, R.string.olive_voice_no_speech_recognition_available_dialog_title);
            String strC2 = StringResources_androidKt.c(composerImplV, R.string.olive_voice_no_speech_recognition_available_dialog_body);
            String strC3 = StringResources_androidKt.c(composerImplV, R.string.olive_voice_action_ok);
            composerImplV.o(5004770);
            boolean z = (i3 & 14) == 4;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new k(23, onDismissAction);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier.Companion companion = Modifier.Companion.d;
            AlertDialogKt.a(strC2, strC3, companion, strC, null, null, (Function0) objG, composerImplV, KyberEngine.KyberPolyBytes, 48);
            modifier = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(onDismissAction, modifier, i, 6);
        }
    }
}
