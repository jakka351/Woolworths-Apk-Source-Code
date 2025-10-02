package au.com.woolworths.feature.product.list.compose.productsearch;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.StringResources_androidKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.product.list.compose.productsearch.ComposableSingletons$SearchRowSectionKt$lambda$-437584019$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$SearchRowSectionKt$lambda$437584019$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$SearchRowSectionKt$lambda$437584019$1 d = new ComposableSingletons$SearchRowSectionKt$lambda$437584019$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SearchTilesSectionKt.a(CollectionsKt.R(StringResources_androidKt.c(composer, R.string.ask_olive_entry_point_subtitle_gluten_free_snack), StringResources_androidKt.c(composer, R.string.ask_olive_entry_point_subtitle_cleaning_product_under_10), StringResources_androidKt.c(composer, R.string.ask_olive_entry_point_subtitle_half_price_this_week)), null, false, composer, 0, 6);
        }
        return Unit.f24250a;
    }
}
