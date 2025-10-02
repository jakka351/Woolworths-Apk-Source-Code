package au.com.woolworths.feature.product.list.compose.filter;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.product.list.ProductsDisplayMode;
import au.com.woolworths.feature.product.list.c0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.product.list.compose.filter.ComposableSingletons$DisplayModeItemKt$lambda$-1376303284$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$DisplayModeItemKt$lambda$1376303284$1 implements Function2<Composer, Integer, Unit> {
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
                objG = new c0(24);
                composer.A(objG);
            }
            composer.l();
            DisplayModeItemKt.a(productsDisplayMode, false, (Function1) objG, composer, 438);
        }
        return Unit.f24250a;
    }
}
