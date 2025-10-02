package au.com.woolworths.design.core.ui.component.stable.broadcastbanner;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class BroadcastBannerKt$BroadcastBanner$3 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ImageKt.b(null, SizeKt.q(Modifier.Companion.d, BroadcastBannerKt.f4745a), null, composer, 432, 120);
        }
        return Unit.f24250a;
    }
}
