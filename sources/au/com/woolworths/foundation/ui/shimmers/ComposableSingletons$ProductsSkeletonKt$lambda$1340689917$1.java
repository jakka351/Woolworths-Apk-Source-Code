package au.com.woolworths.foundation.ui.shimmers;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.foundation.ui.shimmers.ComposableSingletons$ProductsSkeletonKt$lambda$-1340689917$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductsSkeletonKt$lambda$1340689917$1 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductsSkeletonKt$lambda$1340689917$1 d = new ComposableSingletons$ProductsSkeletonKt$lambda$1340689917$1();

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        LazyItemScope items = (LazyItemScope) obj;
        ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue = ((Number) obj4).intValue();
        Intrinsics.h(items, "$this$items");
        if ((iIntValue & 129) == 128 && composer.c()) {
            composer.j();
        } else {
            ProductsSkeletonKt.a(null, composer, 0);
        }
        return Unit.f24250a;
    }
}
