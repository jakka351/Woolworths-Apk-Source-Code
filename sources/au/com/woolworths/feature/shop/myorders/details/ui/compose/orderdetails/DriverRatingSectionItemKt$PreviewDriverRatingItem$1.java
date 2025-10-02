package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.feature.shop.myorders.details.models.DriverRating;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.preview.DriverRatingItemPreviewProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class DriverRatingSectionItemKt$PreviewDriverRatingItem$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        DriverRating driverRating = DriverRatingItemPreviewProvider.f7801a;
        composer.o(1849434622);
        Object objG = composer.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (objG == composer$Companion$Empty$1) {
            objG = new au.com.woolworths.feature.shop.modeselector.ui.c(20);
            composer.A(objG);
        }
        Function1 function1 = (Function1) objG;
        Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE == composer$Companion$Empty$1) {
            objE = new au.com.woolworths.feature.shop.modeselector.ui.c(21);
            composer.A(objE);
        }
        Function1 function12 = (Function1) objE;
        Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE2 == composer$Companion$Empty$1) {
            objE2 = new au.com.woolworths.feature.shop.modeselector.ui.c(22);
            composer.A(objE2);
        }
        Function1 function13 = (Function1) objE2;
        Object objE3 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE3 == composer$Companion$Empty$1) {
            objE3 = new au.com.woolworths.feature.shop.modeselector.ui.c(23);
            composer.A(objE3);
        }
        Function1 function14 = (Function1) objE3;
        Object objE4 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE4 == composer$Companion$Empty$1) {
            objE4 = new au.com.woolworths.feature.shop.modeselector.ui.c(24);
            composer.A(objE4);
        }
        Function1 function15 = (Function1) objE4;
        Object objE5 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE5 == composer$Companion$Empty$1) {
            objE5 = new au.com.woolworths.feature.shop.modeselector.ui.c(25);
            composer.A(objE5);
        }
        composer.l();
        DriverRatingSectionItemKt.a(null, driverRating, function1, function12, function13, function14, function15, (Function1) objE5, composer, 14380416);
        throw null;
    }
}
