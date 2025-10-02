package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.ComposableSingletons$OrderNumberDetailsItemKt$lambda$-1383268598$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$OrderNumberDetailsItemKt$lambda$1383268598$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            OrderNumberDetailsItemKt.a(6, 14, composer, null, "117633904", null, null);
        }
        return Unit.f24250a;
    }
}
