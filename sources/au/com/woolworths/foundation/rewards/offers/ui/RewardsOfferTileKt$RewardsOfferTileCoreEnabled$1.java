package au.com.woolworths.foundation.rewards.offers.ui;

import androidx.compose.runtime.Composer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RewardsOfferTileKt$RewardsOfferTileCoreEnabled$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        RewardsOfferTileKt.h(null, null, null, null, null, null, BitmapDescriptorFactory.HUE_RED, composer, 0, 64);
        throw null;
    }
}
