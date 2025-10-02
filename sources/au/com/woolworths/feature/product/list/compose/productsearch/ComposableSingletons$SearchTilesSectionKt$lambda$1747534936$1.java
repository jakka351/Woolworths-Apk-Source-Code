package au.com.woolworths.feature.product.list.compose.productsearch;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.StringResources_androidKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$SearchTilesSectionKt$lambda$1747534936$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$SearchTilesSectionKt$lambda$1747534936$1 d = new ComposableSingletons$SearchTilesSectionKt$lambda$1747534936$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SearchTilesSectionKt.g(0, 2, composer, null, StringResources_androidKt.c(composer, R.string.buy_again_entry_point_subtitle));
        }
        return Unit.f24250a;
    }
}
