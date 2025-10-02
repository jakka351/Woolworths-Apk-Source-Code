package au.com.woolworths.feature.shop.recipes.freshmag.home.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.l;
import au.com.woolworths.feature.shop.recipes.freshmag.home.data.FreshMagSummaryData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.shop.recipes.freshmag.home.ui.ComposableSingletons$FreshMagHomeScreenKt$lambda$-2021685865$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$FreshMagHomeScreenKt$lambda$2021685865$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            FreshMagSummaryData freshMagSummaryData = new FreshMagSummaryData("", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "55916", "View Fresh Ideas Magazine");
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new l(23);
                composer.A(objG);
            }
            composer.l();
            FreshMagHomeScreenKt.c(freshMagSummaryData, (Function1) objG, null, composer, 48);
        }
        return Unit.f24250a;
    }
}
