package au.com.woolworths.shop.buyagain.ui.composable;

import androidx.compose.runtime.Composer;
import au.com.woolworths.base.shopapp.modules.text.TextWithAltApiData;
import au.com.woolworths.design.core.ui.component.experimental.coachmark.CoachMarkKt;
import au.com.woolworths.design.core.ui.component.experimental.coachmark.CoachMarkState;
import au.com.woolworths.shop.buyagain.domain.BuyAgainChip;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$FilterChipsKt$lambda$691920843$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            List listR = CollectionsKt.R(new BuyAgainChip("1", new TextWithAltApiData("Specials", "Specials"), false, 0), new BuyAgainChip("2", new TextWithAltApiData("Boosters", "Boosters"), false, 0));
            CoachMarkState coachMarkStateF = CoachMarkKt.f(false, composer, 0, 7);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.shop.aem.components.ui.merchcard.a(20);
                composer.A(objG);
            }
            composer.l();
            FilterChipsKt.a(listR, (Function1) objG, false, coachMarkStateF, null, composer, 432);
        }
        return Unit.f24250a;
    }
}
