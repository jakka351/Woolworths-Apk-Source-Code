package au.com.woolworths.shop.aem.components.ui.searchnavcard;

import androidx.compose.runtime.Composer;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.shop.aem.components.model.searchnavcard.SearchNavCardData;
import au.com.woolworths.shop.aem.components.ui.merchcard.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$SearchNavCardKt$lambda$808962827$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SearchNavCardData searchNavCardData = new SearchNavCardData(null, new ActionData("", ActionType.e, null, null));
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new a(12);
                composer.A(objG);
            }
            composer.l();
            SearchNavCardKt.a(searchNavCardData, (Function1) objG, null, composer, 48, 4);
        }
        return Unit.f24250a;
    }
}
