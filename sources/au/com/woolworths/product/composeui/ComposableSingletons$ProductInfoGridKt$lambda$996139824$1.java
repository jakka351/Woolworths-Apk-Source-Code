package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.product.models.MemberPriceInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.product.composeui.ComposableSingletons$ProductInfoGridKt$lambda$-996139824$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductInfoGridKt$lambda$996139824$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductInfoGridKt$lambda$996139824$1 d = new ComposableSingletons$ProductInfoGridKt$lambda$996139824$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductInfoGridKt.a(ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, new MemberPriceInfo("Member price", "$88.88", "$8 per 1l"), null, -1207965697, 3), false, null, true, false, null, false, false, false, true, false, false, null, false, null, false, false, null, false, composer, 805309488, 0, 523764);
        }
        return Unit.f24250a;
    }
}
