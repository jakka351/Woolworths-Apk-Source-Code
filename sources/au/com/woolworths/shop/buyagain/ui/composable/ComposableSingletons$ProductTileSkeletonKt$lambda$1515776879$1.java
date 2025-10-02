package au.com.woolworths.shop.buyagain.ui.composable;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.buyagain.ui.composable.ComposableSingletons$ProductTileSkeletonKt$lambda$-1515776879$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductTileSkeletonKt$lambda$1515776879$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductTileSkeletonKt$lambda$1515776879$1 d = new ComposableSingletons$ProductTileSkeletonKt$lambda$1515776879$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            ProductTileSkeletonKt.e(null, composer, 0);
        }
        return Unit.f24250a;
    }
}
