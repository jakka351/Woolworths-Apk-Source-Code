package au.com.woolworths.shop.aem.components.ui.tab;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.l;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.aem.components.ui.tab.ComposableSingletons$TabItemsKt$lambda$-793410138$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$TabItemsKt$lambda$793410138$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < 4) {
                i++;
                arrayList.add("Tab Label " + i);
            }
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new l(22);
                composer.A(objG);
            }
            composer.l();
            TabItemsKt.b(arrayList, (Function1) objG, 0, SizeKt.e(Modifier.Companion.d, 1.0f), null, null, composer, 3504, 48);
        }
        return Unit.f24250a;
    }
}
