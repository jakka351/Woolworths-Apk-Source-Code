package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$SectionHeaderKt$lambda$206695851$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$SectionHeaderKt$lambda$206695851$1 d = new ComposableSingletons$SectionHeaderKt$lambda$206695851$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SectionHeaderKt.a("Woolworths delivery", "https://uatcdn0.woolworths.media/content/mobile/checkout/ic-woolworths.png", composer, 54);
        }
        return Unit.f24250a;
    }
}
