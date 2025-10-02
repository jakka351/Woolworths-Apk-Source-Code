package au.com.woolworths.product.composeui;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductMemberPriceLabelKt$lambda$148358349$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductMemberPriceLabelKt$lambda$148358349$1 d = new ComposableSingletons$ProductMemberPriceLabelKt$lambda$148358349$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductMemberPriceLabelKt.b("Member Price", "$88.88", SizeKt.u(Modifier.Companion.d, 99), "$54.00 per 1KG", ProductMemberPriceLabelStyling.d, composer, 28086, 0);
        }
        return Unit.f24250a;
    }
}
