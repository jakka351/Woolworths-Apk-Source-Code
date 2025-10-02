package au.com.woolworths.shop.aem.components.ui.bottomsheet;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class StaticBottomSheetContentKt$StaticBottomSheetContent$1$1$2 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            AnimatedVisibilityKt.d(true, null, null, null, null, ComposableSingletons$StaticBottomSheetContentKt.f10212a, composer, 196608, 30);
        }
        return Unit.f24250a;
    }
}
