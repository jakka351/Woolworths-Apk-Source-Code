package au.com.woolworths.feature.shop.instore.cart.ui;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$InstoreCartScreenKt$lambda$1255389679$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$InstoreCartScreenKt$lambda$1255389679$1 d = new ComposableSingletons$InstoreCartScreenKt$lambda$1255389679$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            InstoreCartScreenKt.k(composer, 0);
        }
        return Unit.f24250a;
    }
}
