package au.com.woolworths.foundation.rewards.common.ui.shop;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.rewards.base.data.IconAsset;
import au.com.woolworths.rewards.base.data.LocalAssetIconName;
import au.com.woolworths.rewards.base.data.TextWithAlt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$ShippingEtaUiKt$lambda$1393364007$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ShippingEtaUiKt.a(new TextWithAlt("ETA Wed 24 May - Fri 26 May", ""), new IconAsset.LocalAsset(LocalAssetIconName.TRUCK), PaddingKt.g(Modifier.Companion.d, 12, 8), composer, TextWithAlt.$stable | KyberEngine.KyberPolyBytes | (IconAsset.LocalAsset.$stable << 3));
        }
        return Unit.f24250a;
    }
}
