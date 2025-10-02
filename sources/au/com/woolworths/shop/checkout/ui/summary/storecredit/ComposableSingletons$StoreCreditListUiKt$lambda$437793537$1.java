package au.com.woolworths.shop.checkout.ui.summary.storecredit;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.shop.checkout.ui.details.d;
import au.com.woolworths.shop.checkout.ui.summary.common.CheckoutStoreCreditItemProvider;
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
/* renamed from: au.com.woolworths.shop.checkout.ui.summary.storecredit.ComposableSingletons$StoreCreditListUiKt$lambda$-437793537$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$StoreCreditListUiKt$lambda$437793537$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            List list = CheckoutStoreCreditItemProvider.TestCase.f;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            Iterator it = ((AbstractList) list).iterator();
            while (it.hasNext()) {
                arrayList.add(((CheckoutStoreCreditItemProvider.TestCase) it.next()).d);
            }
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new d(22);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new d(23);
                composer.A(objE);
            }
            composer.l();
            StoreCreditListUiKt.a("Available balance:", "$24.30", arrayList, function1, (Function1) objE, null, composer, 27702, 32);
        }
        return Unit.f24250a;
    }
}
