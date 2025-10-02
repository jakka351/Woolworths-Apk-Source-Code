package au.com.woolworths.shop.lists.ui.lists.compose;

import androidx.compose.runtime.Composer;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ListHeaderItemKt$lambda$1614078671$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ListHeaderItemKt.a(R.string.shop_lists_past_shops_header, 0, composer, null);
        }
        return Unit.f24250a;
    }
}
