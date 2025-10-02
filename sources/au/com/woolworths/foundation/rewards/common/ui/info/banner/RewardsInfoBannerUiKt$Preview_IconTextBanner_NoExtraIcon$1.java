package au.com.woolworths.foundation.rewards.common.ui.info.banner;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.foundation.rewards.common.ui.info.banner.RewardsInfoBannerData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class RewardsInfoBannerUiKt$Preview_IconTextBanner_NoExtraIcon$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            float f = 16;
            float f2 = 40;
            RewardsInfoBannerUiKt.b(new RewardsInfoBannerData(new RewardsInfoBannerData.RemoteIconSpecs(f2, f2), "Title", new RewardsInfoBannerData.MessageData(null)), new PaddingValuesImpl(f, f, f, f), null, PaddingKt.h(Modifier.Companion.d, f, BitmapDescriptorFactory.HUE_RED, 2), composer, 3120);
        }
        return Unit.f24250a;
    }
}
