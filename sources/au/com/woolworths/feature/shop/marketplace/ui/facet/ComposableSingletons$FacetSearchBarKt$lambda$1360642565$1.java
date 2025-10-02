package au.com.woolworths.feature.shop.marketplace.ui.facet;

import androidx.compose.runtime.Composer;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$FacetSearchBarKt$lambda$1360642565$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new a(0);
                composer.A(objG);
            }
            composer.l();
            FacetSearchBarKt.a(R.string.brands_search_hint, (Function1) objG, composer, 48);
        }
        return Unit.f24250a;
    }
}
