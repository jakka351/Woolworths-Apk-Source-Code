package au.com.woolworths.shop.product.details.ui;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.product.details.ui.ComposableSingletons$CountryOfOriginAndHelathInfoKt$lambda$-1203180290$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$CountryOfOriginAndHelathInfoKt$lambda$1203180290$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            CountryOfOriginAndHelathInfoKt.a(null, "Australia", "Made in Austrlia", null, composer, 438, 8);
        }
        return Unit.f24250a;
    }
}
