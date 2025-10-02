package au.com.woolworths.shop.productcard.ui.containers;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.productcard.ui.ProductCardDataKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.productcard.ui.containers.ComposableSingletons$ProductTileGridUiKt$lambda$-408726061$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductTileGridUiKt$lambda$408726061$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductTileGridUiKt.a(ProductCardDataKt.a(), SizeKt.g(SizeKt.u(Modifier.Companion.d, 200), 430), ComposableSingletons$ProductTileGridUiKt.f12664a, composer, 432);
        }
        return Unit.f24250a;
    }
}
