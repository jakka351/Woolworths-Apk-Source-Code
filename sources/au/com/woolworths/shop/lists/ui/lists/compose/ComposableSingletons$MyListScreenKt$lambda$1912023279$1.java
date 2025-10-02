package au.com.woolworths.shop.lists.ui.lists.compose;

import androidx.compose.material.icons.filled.MoreVertKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.lists.ui.lists.compose.ComposableSingletons$MyListScreenKt$lambda$-1912023279$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$MyListScreenKt$lambda$1912023279$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$MyListScreenKt$lambda$1912023279$1 d = new ComposableSingletons$MyListScreenKt$lambda$1912023279$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            IconKt.b(MoreVertKt.a(), StringResources_androidKt.c(composer, R.string.shop_lists_more_button_description), null, 0L, composer, 0, 12);
        }
        return Unit.f24250a;
    }
}
