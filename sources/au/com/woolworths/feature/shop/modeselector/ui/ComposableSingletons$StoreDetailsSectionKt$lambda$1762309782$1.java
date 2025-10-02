package au.com.woolworths.feature.shop.modeselector.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$StoreDetailsSectionKt$lambda$1762309782$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ButtonApiData buttonApiData = StoreDetailsSectionKt.f7551a;
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new c(0);
                composer.A(objG);
            }
            composer.l();
            StoreDetailsSectionKt.a(null, "Getting there", null, buttonApiData, (Function1) objG, null, composer, 25014, 32);
        }
        return Unit.f24250a;
    }
}
