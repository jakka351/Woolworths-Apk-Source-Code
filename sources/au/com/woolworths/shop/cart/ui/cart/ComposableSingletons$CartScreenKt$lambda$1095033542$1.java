package au.com.woolworths.shop.cart.ui.cart;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$CartScreenKt$lambda$1095033542$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$CartScreenKt$lambda$1095033542$1 d = new ComposableSingletons$CartScreenKt$lambda$1095033542$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            SpacerKt.a(composer, SizeKt.c(SizeKt.g(Modifier.Companion.d, 144), 1.0f));
        }
        return Unit.f24250a;
    }
}
