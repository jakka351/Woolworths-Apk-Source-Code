package au.com.woolworths.feature.shop.catalogue.listing.category.ui;

import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$CategoryListingScreenKt$lambda$1804605503$1 implements Function3<LazyGridItemScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$CategoryListingScreenKt$lambda$1804605503$1 d = new ComposableSingletons$CategoryListingScreenKt$lambda$1804605503$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LazyGridItemScope item = (LazyGridItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            CategoryListingScreenKt.e(0, 1, composer, null);
        }
        return Unit.f24250a;
    }
}
