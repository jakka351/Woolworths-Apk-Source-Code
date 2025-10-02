package au.com.woolworths.feature.shop.editorder.review.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class CmoReviewScreenKt$CmoReviewScreenPreview$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        Flow flowV = FlowKt.v();
        composer.o(1849434622);
        Object objG = composer.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (objG == composer$Companion$Empty$1) {
            objG = new c(1);
            composer.A(objG);
        }
        Function1 function1 = (Function1) objG;
        Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE == composer$Companion$Empty$1) {
            objE = new c(2);
            composer.A(objE);
        }
        composer.l();
        CmoReviewScreenKt.a(null, flowV, function1, (Function1) objE, composer, 3456);
        throw null;
    }
}
