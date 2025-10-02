package au.com.woolworths.shop.lists.ui.shoppinglist.sort.ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$SortByViewScreenKt$lambda$1957754998$1 implements Function3<RowScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$SortByViewScreenKt$lambda$1957754998$1 d = new ComposableSingletons$SortByViewScreenKt$lambda$1957754998$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RowScope OutlinedButton = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(OutlinedButton, "$this$OutlinedButton");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            IconKt.a(PainterResources_androidKt.a(R.drawable.ic_shop_lists_sort_direction, 0, composer), StringResources_androidKt.c(composer, R.string.shop_lists_sort_direction_button_description), null, 0L, composer, 0, 12);
        }
        return Unit.f24250a;
    }
}
