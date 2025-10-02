package au.com.woolworths.shared.ui.compose;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.deeplink.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import nl.dionsegijn.konfetti.compose.KonfettiViewKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shared-ui-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ConfettiKt {
    public static final void a(List list, Modifier modifier, Function0 function0, Composer composer, int i, int i2) {
        int i3;
        ComposerImpl composerImplV = composer.v(-1236180581);
        if ((i & 6) == 0) {
            i3 = (composerImplV.I(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerImplV.n(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(function0) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion.d;
            }
            if (i5 != 0) {
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                if (objG == Composer.Companion.f1624a) {
                    objG = new h(20);
                    composerImplV.A(objG);
                }
                function0 = (Function0) objG;
                composerImplV.V(false);
            }
            KonfettiViewKt.a(modifier.x0(SizeKt.c), list, new ConfettiKt$Confetti$2(function0), composerImplV, (i3 << 3) & 112);
        }
        Modifier modifier2 = modifier;
        Function0 function02 = function0;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.base.rewards.account.ui.a(list, modifier2, function02, i, i2, 24);
        }
    }
}
