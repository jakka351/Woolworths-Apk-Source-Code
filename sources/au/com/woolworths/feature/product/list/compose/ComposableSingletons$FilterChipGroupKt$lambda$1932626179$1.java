package au.com.woolworths.feature.product.list.compose;

import androidx.compose.runtime.Composer;
import au.com.woolworths.shared.ui.compose.filter.AllFiltersChipKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$FilterChipGroupKt$lambda$1932626179$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objG);
            }
            composer.l();
            AllFiltersChipKt.a(true, false, "5", (Function0) objG, null, "Filter", null, null, null, composer, 1576374, 0, 1968);
        }
        return Unit.f24250a;
    }
}
