package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ApplicableDeliveryMethodScreenKt$DeliveryMethodContent$1$1$1 implements Function2<Composer, Integer, Color> {
    public static final ApplicableDeliveryMethodScreenKt$DeliveryMethodContent$1$1$1 d = new ApplicableDeliveryMethodScreenKt$DeliveryMethodContent$1$1$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        composer.o(760542965);
        long j = CoreTheme.b(composer).e.c.f4854a;
        composer.l();
        return new Color(j);
    }
}
