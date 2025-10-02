package au.com.woolworths.shop.lists.ui.lists.compose;

import androidx.compose.runtime.Composer;
import au.com.woolworths.shop.lists.data.model.SuggestedListItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$SuggestedListItemCardKt$lambda$861528692$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SuggestedListItem suggestedListItem = new SuggestedListItem(1, "Test", "");
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector.a(17);
                composer.A(objG);
            }
            composer.l();
            SuggestedListItemCardKt.a(suggestedListItem, (Function1) objG, null, composer, 48, 4);
        }
        return Unit.f24250a;
    }
}
