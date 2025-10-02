package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import au.com.woolworths.android.onesite.models.checkout.SavedGiftCardData;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003¨\u0006\u0004"}, d2 = {"au/com/woolworths/android/onesite/modules/checkout/digitalpay/DigitalPayForOrderPresenter$manageFetchedGiftCards$1", "Ljava/util/Comparator;", "Lau/com/woolworths/android/onesite/models/checkout/SavedGiftCardData;", "Lkotlin/Comparator;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DigitalPayForOrderPresenter$manageFetchedGiftCards$1 implements Comparator<SavedGiftCardData> {
    @Override // java.util.Comparator
    public final int compare(SavedGiftCardData savedGiftCardData, SavedGiftCardData savedGiftCardData2) {
        SavedGiftCardData savedGiftCardData1 = savedGiftCardData;
        SavedGiftCardData savedGiftCardData22 = savedGiftCardData2;
        Intrinsics.h(savedGiftCardData1, "savedGiftCardData1");
        Intrinsics.h(savedGiftCardData22, "savedGiftCardData2");
        if (savedGiftCardData1.getBalance() == null) {
            return 1;
        }
        return savedGiftCardData22.getBalance() == null ? -1 : 0;
    }
}
