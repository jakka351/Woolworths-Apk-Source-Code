package au.com.woolworths.shop.lists.ui.lists.compose;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.lists.ui.lists.compose.ComposableSingletons$MyListScreenKt$lambda$-1712711066$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$MyListScreenKt$lambda$1712711066$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$MyListScreenKt$lambda$1712711066$1 d = new ComposableSingletons$MyListScreenKt$lambda$1712711066$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            ListHeaderItemKt.a(R.string.shop_listsmy_lists_header, 0, composer, null);
        }
        return Unit.f24250a;
    }
}
