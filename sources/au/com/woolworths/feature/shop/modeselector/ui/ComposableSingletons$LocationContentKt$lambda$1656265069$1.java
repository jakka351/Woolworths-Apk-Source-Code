package au.com.woolworths.feature.shop.modeselector.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.base.shopapp.modules.button.ButtonActionApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeDetails;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorAddressDetails;
import au.com.woolworths.feature.shop.modeselector.model.V1AddressDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.shop.modeselector.ui.ComposableSingletons$LocationContentKt$lambda$-1656265069$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$LocationContentKt$lambda$1656265069$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ShoppingModeSection.ShoppingModeSelectorAddressInfoSection shoppingModeSelectorAddressInfoSection = new ShoppingModeSection.ShoppingModeSelectorAddressInfoSection(new ShoppingModeSelectorAddressDetails(null, "Bondi Beach Metro", "1 Bushel Way, TRUGANINA VIC 3029", new ButtonApiData("Edit", ButtonActionApiData.LINK, ButtonStyleApiData.TERTIARY, true, "com.woolworths.shop://selectDeliveryAddress", null, null, null, null, KyberEngine.KyberPolyBytes, null), new V1AddressDetails.ModeSelectorV1AddressDetailsDelivery("DELIVERY", 1007726761, "1 Bushel Way, TRUGANINA VIC 3029", true, "3029", "1 Bushel Way", "TRUGANINA VIC", 4556, "TRUGANINA"), null, new ShoppingModeDetails("Set a delivery address", "DELIVERY", null)), "Delivering to");
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.shop.marketplace.ui.facet.a(4);
                composer.A(objG);
            }
            composer.l();
            LocationContentKt.a(shoppingModeSelectorAddressInfoSection, (Function1) objG, null, composer, 48, 4);
        }
        return Unit.f24250a;
    }
}
