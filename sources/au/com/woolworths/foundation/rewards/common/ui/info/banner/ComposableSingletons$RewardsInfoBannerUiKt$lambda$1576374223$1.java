package au.com.woolworths.foundation.rewards.common.ui.info.banner;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$RewardsInfoBannerUiKt$lambda$1576374223$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            float f = 16;
            RewardsInfoBannerUiKt.b(new RewardsInfoBannerData(null, null, null), new PaddingValuesImpl(f, f, f, f), ContentAlignment.d, PaddingKt.h(Modifier.Companion.d, f, BitmapDescriptorFactory.HUE_RED, 2), composer, 3504);
        }
        return Unit.f24250a;
    }
}
