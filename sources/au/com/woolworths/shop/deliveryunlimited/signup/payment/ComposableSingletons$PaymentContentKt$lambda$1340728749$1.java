package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.deliveryunlimited.signup.payment.ComposableSingletons$PaymentContentKt$lambda$-1340728749$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$PaymentContentKt$lambda$1340728749$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$PaymentContentKt$lambda$1340728749$1 d = new ComposableSingletons$PaymentContentKt$lambda$1340728749$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        }
        return Unit.f24250a;
    }
}
