package au.com.woolworths.feature.shop.homepage.presentation.modeselector;

import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.collectionmode.common.DeliveryModeVariant;
import au.com.woolworths.base.shopapp.modules.text.TextWithLinkApiData;
import au.com.woolworths.feature.shop.homepage.data.HomeFulfilmentWindowButtonStyleType;
import au.com.woolworths.feature.shop.homepage.data.HomeModeSelectorContainerData;
import au.com.woolworths.feature.shop.homepage.data.InStoreDetailsCardData;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/modeselector/PreviewModeSelectorType;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreviewModeSelectorType {
    public static final /* synthetic */ PreviewModeSelectorType[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        PreviewModeSelectorType previewModeSelectorType = new PreviewModeSelectorType("PICKUP_UNSELECTED", 0, ModeSelectorSubHeaderKt.h(ModeSelectorSubHeaderKt.k()));
        PreviewModeSelectorType previewModeSelectorType2 = new PreviewModeSelectorType("PICKUP_SELECTED", 1, ModeSelectorSubHeaderKt.h(ModeSelectorSubHeaderKt.i(21, "Wednesday", "23 Nov • 7am-10am")));
        PreviewModeSelectorType previewModeSelectorType3 = new PreviewModeSelectorType("PICKUP_SELECTED_GUEST", 2, new MockPreviewData(new HomeModeSelectorContainerData(ModeSelectorSubHeaderKt.k(), null, null, null, ModeSelectorSubHeaderKt.j("Direct to boot", "Surry Hills")), "Direct to boot", "Surry Hills", null, 40));
        PreviewModeSelectorType previewModeSelectorType4 = new PreviewModeSelectorType("PICKUP_LONG_ADDRESS", 3, new MockPreviewData(new HomeModeSelectorContainerData(ModeSelectorSubHeaderKt.k(), null, null, null, ModeSelectorSubHeaderKt.j("Direct to boot", "This is a long store name for some reason")), "Direct to boot", "This is a long store name for some reason", null, 42));
        PreviewModeSelectorType previewModeSelectorType5 = new PreviewModeSelectorType("DELIVERY_UNSELECTED", 4, ModeSelectorSubHeaderKt.g(ModeSelectorSubHeaderKt.i(21, "Wednesday", "23 Nov • 7am-10am"), false));
        PreviewModeSelectorType previewModeSelectorType6 = new PreviewModeSelectorType("DELIVERY_SELECTED", 5, ModeSelectorSubHeaderKt.g(ModeSelectorSubHeaderKt.k(), false));
        HomeFulfilmentWindowButtonStyleType homeFulfilmentWindowButtonStyleType = HomeFulfilmentWindowButtonStyleType.e;
        PreviewModeSelectorType[] previewModeSelectorTypeArr = {previewModeSelectorType, previewModeSelectorType2, previewModeSelectorType3, previewModeSelectorType4, previewModeSelectorType5, previewModeSelectorType6, new PreviewModeSelectorType("DELIVERY_NOW", 6, ModeSelectorSubHeaderKt.g(ModeSelectorSubHeaderKt.i(20, "Delivery Now", "Arriving in 1-2 hours"), true)), new PreviewModeSelectorType("IN_STORE", 7, new MockPreviewData(new HomeModeSelectorContainerData(null, null, null, new InStoreDetailsCardData(new TextWithLinkApiData("Leichhardt Marketplace Metro store", "com.woolworths.shop://storeSelector"), new TextWithLinkApiData("Open until 10pm", "com.woolworths.shop://storeDetails/1154"), Boolean.FALSE), null), null, null, CollectionMode.InStore.d, 18)), new PreviewModeSelectorType("DEFAULT_SHOPPING_MODE", 8, new MockPreviewData(new HomeModeSelectorContainerData(null, null, null, null, ModeSelectorSubHeaderKt.j(null, "Set a delivery address")), null, null, new CollectionMode.Delivery(DeliveryModeVariant.DeliveryStandard), 18))};
        d = previewModeSelectorTypeArr;
        e = EnumEntriesKt.a(previewModeSelectorTypeArr);
    }

    public PreviewModeSelectorType(String str, int i, MockPreviewData mockPreviewData) {
    }

    public static PreviewModeSelectorType valueOf(String str) {
        return (PreviewModeSelectorType) Enum.valueOf(PreviewModeSelectorType.class, str);
    }

    public static PreviewModeSelectorType[] values() {
        return (PreviewModeSelectorType[]) d.clone();
    }
}
