package au.com.woolworths.shop.aem.components.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.shop.aem.components.model.CatalogueCard;
import au.com.woolworths.shop.aem.components.model.CatalogueCardType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.aem.components.ui.ComposableSingletons$CatalogueCardKt$lambda$-1241306128$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$CatalogueCardKt$lambda$1241306128$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            CatalogueCard catalogueCard = new CatalogueCard(null, "Weekly\nCatalogue", "Shop now", null, CatalogueCardType.d, null, null, 96, null);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.sdui.legacy.banner.c(24);
                composer.A(objG);
            }
            composer.l();
            CatalogueCardKt.a(catalogueCard, (Function1) objG, null, null, composer, 48, 12);
        }
        return Unit.f24250a;
    }
}
