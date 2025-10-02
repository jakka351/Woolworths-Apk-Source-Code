package au.com.woolworths.feature.product.list.legacy.compose.filter;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.product.list.legacy.ProductsDisplayMode;
import au.com.woolworths.feature.product.list.legacy.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$DisplayModeItemKt$lambda$1135257859$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductsDisplayMode productsDisplayMode = ProductsDisplayMode.e;
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new y(25);
                composer.A(objG);
            }
            composer.l();
            DisplayModeItemKt.a(productsDisplayMode, false, (Function1) objG, composer, 438);
        }
        return Unit.f24250a;
    }
}
