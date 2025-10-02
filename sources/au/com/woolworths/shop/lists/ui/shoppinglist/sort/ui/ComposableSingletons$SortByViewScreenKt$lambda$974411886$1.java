package au.com.woolworths.shop.lists.ui.shoppinglist.sort.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.shop.lists.data.prefs.SortBy;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$SortByViewScreenKt$lambda$974411886$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SortByViewContract.ViewState viewState = new SortByViewContract.ViewState(SortBy.g, 4);
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new h(20);
                composer.A(objG);
            }
            Function0 function0 = (Function0) objG;
            Object objE = a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new h(20);
                composer.A(objE);
            }
            Function0 function02 = (Function0) objE;
            Object objE2 = a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new h(20);
                composer.A(objE2);
            }
            Function0 function03 = (Function0) objE2;
            Object objE3 = a.e(composer, 1849434622);
            if (objE3 == composer$Companion$Empty$1) {
                objE3 = new h(20);
                composer.A(objE3);
            }
            composer.l();
            SortByViewScreenKt.f(viewState, true, true, function0, function02, function03, (Function0) objE3, composer, 1797552);
        }
        return Unit.f24250a;
    }
}
