package au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector.DateSelectorItemParameterProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$DateSelectorKt$lambda$1408990705$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            Modifier modifierH = PaddingKt.h(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, 16, 1);
            List list = DateSelectorItemParameterProvider.TestCase.f;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            Iterator it = ((AbstractList) list).iterator();
            while (it.hasNext()) {
                arrayList.add(((DateSelectorItemParameterProvider.TestCase) it.next()).d);
            }
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new a(0);
                composer.A(objG);
            }
            composer.l();
            DateSelectorKt.a(arrayList, modifierH, (Function1) objG, composer, 432);
        }
        return Unit.f24250a;
    }
}
