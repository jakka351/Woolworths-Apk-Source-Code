package au.com.woolworths.feature.product.list.legacy.compose.filter;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.product.list.legacy.ui.ProductListOptionsItem;
import au.com.woolworths.feature.product.list.legacy.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$FilterItemKt$lambda$1239774757$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductListOptionsItem.FilterOptionItem filterOptionItem = new ProductListOptionsItem.FilterOptionItem("", "Brand", 0);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new y(27);
                composer.A(objG);
            }
            composer.l();
            FilterItemKt.a(filterOptionItem, (Function1) objG, composer, 48);
        }
        return Unit.f24250a;
    }
}
