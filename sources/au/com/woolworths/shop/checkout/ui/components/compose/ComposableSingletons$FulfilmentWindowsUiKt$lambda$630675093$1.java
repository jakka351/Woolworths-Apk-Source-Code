package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.runtime.Composer;
import au.com.woolworths.shop.cart.ui.productreview.h;
import au.com.woolworths.shop.checkout.domain.model.DeliveryNowStatus;
import au.com.woolworths.shop.checkout.domain.model.DirectToBootNowStatus;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsOption;
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
/* renamed from: au.com.woolworths.shop.checkout.ui.components.compose.ComposableSingletons$FulfilmentWindowsUiKt$lambda$-630675093$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$FulfilmentWindowsUiKt$lambda$630675093$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$FulfilmentWindowsUiKt$lambda$630675093$1 d = new ComposableSingletons$FulfilmentWindowsUiKt$lambda$630675093$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            DeliveryNowStatus deliveryNowStatus = DeliveryNowStatus.d;
            DirectToBootNowStatus directToBootNowStatus = DirectToBootNowStatus.d;
            EmptyList emptyList = EmptyList.d;
            List listR = CollectionsKt.R(new FulfilmentWindowsOption("Today", "7 April", true, true, "$5.00", null, "sectionTitle", null, null, deliveryNowStatus, null, directToBootNowStatus, emptyList, null, null), new FulfilmentWindowsOption("Tomorrow", "8 April", true, false, "$5.00", null, "sectionTitle", null, null, deliveryNowStatus, null, directToBootNowStatus, emptyList, null, null), new FulfilmentWindowsOption("Monday", "9 April", false, false, "$5.00", null, "sectionTitle", null, null, deliveryNowStatus, null, directToBootNowStatus, emptyList, null, null), new FulfilmentWindowsOption("Tuesday", "10 April", false, true, "Free", null, "sectionTitle", null, null, deliveryNowStatus, null, directToBootNowStatus, emptyList, null, null));
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(8);
                composer.A(objG);
            }
            composer.l();
            FulfilmentWindowsUiKt.a("Select delivery date", listR, (Function1) objG, null, composer, 390);
        }
        return Unit.f24250a;
    }
}
