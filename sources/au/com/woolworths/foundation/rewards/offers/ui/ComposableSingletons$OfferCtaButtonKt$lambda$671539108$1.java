package au.com.woolworths.foundation.rewards.offers.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.deeplink.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.foundation.rewards.offers.ui.ComposableSingletons$OfferCtaButtonKt$lambda$-671539108$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$OfferCtaButtonKt$lambda$671539108$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$OfferCtaButtonKt$lambda$671539108$1 d = new ComposableSingletons$OfferCtaButtonKt$lambda$671539108$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            OfferCtaButtonKt.a(3510, 0, composer, PaddingKt.f(Modifier.Companion.d, 8), "Button", (Function0) objG, false);
        }
        return Unit.f24250a;
    }
}
