package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.ComposableSingletons$PickupOrderFulfilmentDetailsItemKt$lambda$-1123254999$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$PickupOrderFulfilmentDetailsItemKt$lambda$1123254999$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objG);
            }
            composer.l();
            OrderDetailFulfilmentData orderDetailFulfilmentData = new OrderDetailFulfilmentData("Direct to boot", "463 Newfinland Road, Alexander Heights", null, (Function0) objG);
            composer.o(1849434622);
            Object objG2 = composer.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objG2);
            }
            composer.l();
            PickupOrderFulfilmentDetailsItemKt.a("Collection details", CollectionsKt.R(orderDetailFulfilmentData, new OrderDetailFulfilmentData("Selected time", "Tuesday 14 October, between 2:00pm - 3:00pm", null, (Function0) objG2)), composer, 6);
        }
        return Unit.f24250a;
    }
}
