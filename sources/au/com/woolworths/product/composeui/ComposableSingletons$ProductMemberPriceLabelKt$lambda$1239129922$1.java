package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductMemberPriceLabelKt$lambda$1239129922$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductMemberPriceLabelKt$lambda$1239129922$1 d = new ComposableSingletons$ProductMemberPriceLabelKt$lambda$1239129922$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductMemberPriceLabelKt.b("Member Price", "2 for $88.88", null, "$88.88 per 1KG", ProductMemberPriceLabelStyling.e, composer, 27702, 4);
        }
        return Unit.f24250a;
    }
}
