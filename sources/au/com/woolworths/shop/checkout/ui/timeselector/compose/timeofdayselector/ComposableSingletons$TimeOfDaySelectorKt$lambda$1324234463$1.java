package au.com.woolworths.shop.checkout.ui.timeselector.compose.timeofdayselector;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot;
import au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector.a;
import au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeOfDay;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.checkout.ui.timeselector.compose.timeofdayselector.ComposableSingletons$TimeOfDaySelectorKt$lambda$-1324234463$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$TimeOfDaySelectorKt$lambda$1324234463$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            Modifier modifierF = PaddingKt.f(Modifier.Companion.d, 16);
            List listR = CollectionsKt.R(new TimeOfDay("Morning", 28, null, true), new TimeOfDay("Afternoon", 30, null, false), new TimeOfDay("Evening", 30, null, false));
            EmptyList emptyList = EmptyList.d;
            List listR2 = CollectionsKt.R(new FulfilmentSlot(1, "9am - 12pm", "3hrs", "$2", false, false, null, "", emptyList, emptyList), new FulfilmentSlot(2, "9am - 2pm", "5hrs", "$2", false, false, null, "", emptyList, emptyList), new FulfilmentSlot(3, "9am - 5pm", "8hrs", "$2", false, false, null, "", emptyList, emptyList));
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new a(5);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new a(6);
                composer.A(objE);
            }
            Function1 function12 = (Function1) objE;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new a(7);
                composer.A(objE2);
            }
            composer.l();
            TimeOfDaySelectorKt.a("All times", listR, listR2, function1, function12, (Function1) objE2, modifierF, composer, 1797126);
        }
        return Unit.f24250a;
    }
}
