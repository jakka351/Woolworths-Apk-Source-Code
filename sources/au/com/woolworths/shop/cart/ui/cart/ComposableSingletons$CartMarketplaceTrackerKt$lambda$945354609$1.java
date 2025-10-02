package au.com.woolworths.shop.cart.ui.cart;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.cart.ui.cart.ComposableSingletons$CartMarketplaceTrackerKt$lambda$-945354609$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$CartMarketplaceTrackerKt$lambda$945354609$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objG);
            }
            composer.l();
            CartMarketplaceTrackerKt.a("You are $23.00 away from free shipping", 0.75f, "Orders under $100 have a $10 shipping fee", true, (Function0) objG, composer, 28086, 0);
        }
        return Unit.f24250a;
    }
}
