package au.com.woolworths.feature.shop.myorders.editorderconditions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.feature.shop.myorders.details.models.EditOrderWarning;
import au.com.woolworths.feature.shop.myorders.details.models.EditOrderWarningItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.shop.myorders.editorderconditions.ComposableSingletons$EditOrderConditionScreenKt$lambda$-2041353307$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$EditOrderConditionScreenKt$lambda$2041353307$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$EditOrderConditionScreenKt$lambda$2041353307$1 d = new ComposableSingletons$EditOrderConditionScreenKt$lambda$2041353307$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            EditOrderWarning editOrderWarning = new EditOrderWarning("", "Some important things you need to know", "I've read and understand these conditions.", "Change my order", "Cancel", "By selecting Change my order, I confirm I've read and understand these conditions.", CollectionsKt.R(new EditOrderWarningItem("Checkout again to confirm changes."), new EditOrderWarningItem("Specials and prices may change from when you originally placed your order."), new EditOrderWarningItem("Cancel changes at any time, and receive your original order."), new EditOrderWarningItem("Available windows and products may change from when you originally placed your order."), new EditOrderWarningItem("Payment will be taken if your new order is more than 7 days after the original date.")));
            Flow flowV = FlowKt.v();
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new h(20);
                composer.A(objG);
            }
            Function0 function0 = (Function0) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new h(20);
                composer.A(objE);
            }
            composer.l();
            EditOrderConditionScreenKt.c(editOrderWarning, function0, (Function0) objE, flowV, composer, 432);
        }
        return Unit.f24250a;
    }
}
