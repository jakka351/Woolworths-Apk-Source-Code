package au.com.woolworths.feature.rewards.card.overlay.ui;

import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$RewardsCardOverlayScreenKt$lambda$1749035806$1 implements Function3<SnackbarHostState, Composer, Integer, Unit> {
    public static final ComposableSingletons$RewardsCardOverlayScreenKt$lambda$1749035806$1 d = new ComposableSingletons$RewardsCardOverlayScreenKt$lambda$1749035806$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SnackbarHostState it = (SnackbarHostState) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(it, "it");
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.n(it) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && composer.c()) {
            composer.j();
        } else {
            SnackbarHostKt.b(it, null, ComposableSingletons$RewardsCardOverlayScreenKt.f5835a, composer, (iIntValue & 14) | KyberEngine.KyberPolyBytes, 2);
        }
        return Unit.f24250a;
    }
}
