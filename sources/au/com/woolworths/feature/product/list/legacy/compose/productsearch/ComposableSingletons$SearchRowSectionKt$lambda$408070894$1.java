package au.com.woolworths.feature.product.list.legacy.compose.productsearch;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.StringResources_androidKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$SearchRowSectionKt$lambda$408070894$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$SearchRowSectionKt$lambda$408070894$1 d = new ComposableSingletons$SearchRowSectionKt$lambda$408070894$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SearchRowSectionKt.c(0, composer, null, StringResources_androidKt.c(composer, R.string.olive_voice_scan_barcode_tile_description));
        }
        return Unit.f24250a;
    }
}
