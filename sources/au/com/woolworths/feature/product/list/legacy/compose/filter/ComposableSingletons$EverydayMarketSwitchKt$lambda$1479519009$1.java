package au.com.woolworths.feature.product.list.legacy.compose.filter;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.feature.product.list.legacy.data.ProductFilterSwitch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.product.list.legacy.compose.filter.ComposableSingletons$EverydayMarketSwitchKt$lambda$-1479519009$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$EverydayMarketSwitchKt$lambda$1479519009$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductFilterSwitch productFilterSwitch = new ProductFilterSwitch("Show Everyday Market items", "Shop more brands you love with Everyday Market. Learn more", "", true, new ContentCta("Learn more", "url", (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null));
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.android.onesite.repository.b(10);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new h(20);
                composer.A(objE);
            }
            composer.l();
            EverydayMarketSwitchKt.a(productFilterSwitch, function1, (Function0) objE, composer, 432);
        }
        return Unit.f24250a;
    }
}
