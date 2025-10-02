package au.com.woolworths.feature.shop.wpay.ui.wpay;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/ModalBottomSheetData;", "", "AddCreditCard", "AddGiftCard", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/ModalBottomSheetData$AddCreditCard;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/ModalBottomSheetData$AddGiftCard;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ModalBottomSheetData {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/ModalBottomSheetData$AddCreditCard;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/ModalBottomSheetData;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddCreditCard extends ModalBottomSheetData {

        /* renamed from: a, reason: collision with root package name */
        public final String f8367a;

        public AddCreditCard(String title) {
            Intrinsics.h(title, "title");
            this.f8367a = title;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/ModalBottomSheetData$AddGiftCard;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/ModalBottomSheetData;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddGiftCard extends ModalBottomSheetData {

        /* renamed from: a, reason: collision with root package name */
        public final String f8368a;

        public AddGiftCard(String str) {
            this.f8368a = str;
        }
    }
}
