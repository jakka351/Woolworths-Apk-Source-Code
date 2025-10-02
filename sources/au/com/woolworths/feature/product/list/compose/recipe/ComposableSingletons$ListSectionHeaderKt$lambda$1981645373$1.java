package au.com.woolworths.feature.product.list.compose.recipe;

import androidx.compose.runtime.Composer;
import au.com.woolworths.base.shopapp.modules.listsectionheader.ListSectionHeaderApiData;
import au.com.woolworths.base.shopapp.modules.listsectionheader.ListSectionHeaderTypeApiData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.product.list.compose.recipe.ComposableSingletons$ListSectionHeaderKt$lambda$-1981645373$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ListSectionHeaderKt$lambda$1981645373$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ListSectionHeaderKt$lambda$1981645373$1 d = new ComposableSingletons$ListSectionHeaderKt$lambda$1981645373$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ListSectionHeaderKt.a(new ListSectionHeaderApiData(ListSectionHeaderTypeApiData.PRIMARY, "Not in stock or not found:", null), null, composer, 0, 2);
        }
        return Unit.f24250a;
    }
}
