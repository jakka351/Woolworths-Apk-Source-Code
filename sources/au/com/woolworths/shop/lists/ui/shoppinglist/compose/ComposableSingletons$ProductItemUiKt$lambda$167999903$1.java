package au.com.woolworths.shop.lists.ui.shoppinglist.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import au.com.woolworths.shop.lists.ui.utils.ComposeUiPreviewDataKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.compose.ComposableSingletons$ProductItemUiKt$lambda$-167999903$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductItemUiKt$lambda$167999903$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductItemUiModel productItemUiModelA = ComposeUiPreviewDataKt.a();
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector.a(27);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new au.com.woolworths.foundation.shop.olive.voice.ui.permission.a(20);
                composer.A(objE);
            }
            Function2 function2 = (Function2) objE;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector.a(28);
                composer.A(objE2);
            }
            Function1 function12 = (Function1) objE2;
            Object objE3 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE3 == composer$Companion$Empty$1) {
                objE3 = new au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector.a(29);
                composer.A(objE3);
            }
            Function1 function13 = (Function1) objE3;
            Object objE4 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE4 == composer$Companion$Empty$1) {
                objE4 = new a(0);
                composer.A(objE4);
            }
            Function1 function14 = (Function1) objE4;
            Object objE5 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE5 == composer$Companion$Empty$1) {
                objE5 = new a(1);
                composer.A(objE5);
            }
            composer.l();
            ProductItemUiKt.b(productItemUiModelA, true, true, false, function1, function2, function12, function13, function14, (Function1) objE5, null, composer, 920350128);
        }
        return Unit.f24250a;
    }
}
