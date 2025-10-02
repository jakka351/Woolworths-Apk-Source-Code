package au.com.woolworths.feature.product.list.legacy.compose.filter.child;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.ui.state.ToggleableState;
import au.com.woolworths.feature.product.list.legacy.a0;
import au.com.woolworths.feature.product.list.legacy.ui.FilterMenuItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.product.list.legacy.compose.filter.child.ComposableSingletons$ProductListOptionsChildFilterKt$lambda$-1347028770$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ProductListOptionsChildFilterKt$lambda$1347028770$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            FilterMenuItem filterMenuItem = new FilterMenuItem("", "Title", " Title (10)", "", false, ToggleableState.e, 5, "", "");
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.feature.product.list.legacy.compose.filter.a(14);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new a0(7);
                composer.A(objE);
            }
            composer.l();
            ProductListOptionsChildFilterKt.a(filterMenuItem, function1, (Function2) objE, composer, 432);
        }
        return Unit.f24250a;
    }
}
