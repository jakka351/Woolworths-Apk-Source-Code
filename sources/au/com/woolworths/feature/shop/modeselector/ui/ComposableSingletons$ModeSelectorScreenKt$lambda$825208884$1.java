package au.com.woolworths.feature.shop.modeselector.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.base.shopapp.modules.button.ButtonActionApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.feature.shop.modeselector.ModeSelectorContract;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeButton;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeButtonType;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeDetails;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorAddressDetails;
import au.com.woolworths.feature.shop.modeselector.model.V1AddressDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$ModeSelectorScreenKt$lambda$825208884$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ModeSelectorContract.ViewState viewState = new ModeSelectorContract.ViewState(true, null, CollectionsKt.R(new ShoppingModeButton(ShoppingModeButtonType.e, false, "Delivery", true), new ShoppingModeButton(ShoppingModeButtonType.f, true, "Pick up", true), new ShoppingModeButton(ShoppingModeButtonType.g, false, "Instore", true)), null, new ShoppingModeSection.ShoppingModeSelectorAddressInfoSection(new ShoppingModeSelectorAddressDetails(null, null, "1 Bushel Way, TRUGANINA VIC 3029", new ButtonApiData("Edit", ButtonActionApiData.LINK, ButtonStyleApiData.TERTIARY, true, "com.woolworths.shop://selectDeliveryAddress", null, null, null, null, KyberEngine.KyberPolyBytes, null), new V1AddressDetails.ModeSelectorV1AddressDetailsDelivery("DELIVERY", 1007726761, "1 Bushel Way, TRUGANINA VIC 3029", true, "3029", "1 Bushel Way", "TRUGANINA VIC", 4556, "TRUGANINA"), null, new ShoppingModeDetails("Set a delivery address", "DELIVERY", null)), "Delivering to"), "Just a quick footnote.", 1478);
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
            Function0 function02 = (Function0) objE;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new au.com.woolworths.feature.shop.marketplace.ui.facet.a(19);
                composer.A(objE2);
            }
            Function1 function1 = (Function1) objE2;
            Object objE3 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE3 == composer$Companion$Empty$1) {
                objE3 = new b(0);
                composer.A(objE3);
            }
            Function2 function2 = (Function2) objE3;
            Object objE4 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE4 == composer$Companion$Empty$1) {
                objE4 = new au.com.woolworths.feature.shop.marketplace.ui.facet.a(20);
                composer.A(objE4);
            }
            Function1 function12 = (Function1) objE4;
            Object objE5 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE5 == composer$Companion$Empty$1) {
                objE5 = new au.com.woolworths.feature.shop.marketplace.ui.facet.a(21);
                composer.A(objE5);
            }
            composer.l();
            ModeSelectorScreenKt.a(viewState, function0, function02, function1, function2, function12, (Function1) objE5, null, composer, 1797552, 128);
        }
        return Unit.f24250a;
    }
}
