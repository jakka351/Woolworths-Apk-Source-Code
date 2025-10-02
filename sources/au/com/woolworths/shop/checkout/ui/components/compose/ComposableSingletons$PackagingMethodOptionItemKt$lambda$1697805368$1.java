package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.runtime.Composer;
import au.com.woolworths.shop.cart.ui.productreview.h;
import au.com.woolworths.shop.checkout.domain.model.PackagingMethodOption;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$PackagingMethodOptionItemKt$lambda$1697805368$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            PackagingMethodOption packagingMethodOption = new PackagingMethodOption(1000, true, "Reusable Bags", "$1.50", "/ per order", "imageUrl");
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(12);
                composer.A(objG);
            }
            composer.l();
            PackagingMethodOptionItemKt.a(packagingMethodOption, (Function1) objG, composer, 54);
        }
        return Unit.f24250a;
    }
}
