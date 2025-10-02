package au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesFilterGroupItem;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$YourGroceriesFilterRowKt$lambda$63050324$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$YourGroceriesFilterRowKt$lambda$63050324$1 d = new ComposableSingletons$YourGroceriesFilterRowKt$lambda$63050324$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            YourGroceriesFilterGroupItem yourGroceriesFilterGroupItem = new YourGroceriesFilterGroupItem(CollectionsKt.R(new YourGroceriesFilterGroupItem.YourGroceriesFilterItem("All", "All", true, 10), new YourGroceriesFilterGroupItem.YourGroceriesFilterItem("Out of Stock", "Out of Stock", false, 5), new YourGroceriesFilterGroupItem.YourGroceriesFilterItem("Substitutions", "Substitutions", false, 3), new YourGroceriesFilterGroupItem.YourGroceriesFilterItem("Supplied", "Supplied", false, 2)));
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new l(4);
                composer.A(objG);
            }
            composer.l();
            YourGroceriesFilterRowKt.a(yourGroceriesFilterGroupItem, (Function1) objG, composer, 48);
        }
        return Unit.f24250a;
    }
}
