package au.com.woolworths.feature.shop.wpay.ui.wpay;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.AddPayPalAlert;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/AlertDialogData;", "", "DeleteCreditCard", "AddPayPal", "DeleteGiftCard", "DeletePayPal", "ValidationFailure", "UnlinkCardFailure", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/AlertDialogData$AddPayPal;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/AlertDialogData$DeleteCreditCard;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/AlertDialogData$DeleteGiftCard;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/AlertDialogData$DeletePayPal;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/AlertDialogData$UnlinkCardFailure;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/AlertDialogData$ValidationFailure;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AlertDialogData {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/AlertDialogData$AddPayPal;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/AlertDialogData;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddPayPal implements AlertDialogData {

        /* renamed from: a, reason: collision with root package name */
        public final AddPayPalAlert f8351a;

        public AddPayPal(AddPayPalAlert addPayPalAlert) {
            this.f8351a = addPayPalAlert;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/AlertDialogData$DeleteCreditCard;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/AlertDialogData;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeleteCreditCard implements AlertDialogData {

        /* renamed from: a, reason: collision with root package name */
        public final String f8352a;
        public final boolean b;

        public DeleteCreditCard(String creditCardId, boolean z) {
            Intrinsics.h(creditCardId, "creditCardId");
            this.f8352a = creditCardId;
            this.b = z;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/AlertDialogData$DeleteGiftCard;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/AlertDialogData;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeleteGiftCard implements AlertDialogData {

        /* renamed from: a, reason: collision with root package name */
        public final String f8353a;
        public final boolean b;

        public DeleteGiftCard(String str, boolean z) {
            this.f8353a = str;
            this.b = z;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/AlertDialogData$DeletePayPal;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/AlertDialogData;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeletePayPal implements AlertDialogData {

        /* renamed from: a, reason: collision with root package name */
        public final String f8354a;

        public DeletePayPal(String str) {
            this.f8354a = str;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/AlertDialogData$UnlinkCardFailure;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/AlertDialogData;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnlinkCardFailure implements AlertDialogData {

        /* renamed from: a, reason: collision with root package name */
        public final String f8355a;
        public final String b;
        public final String c;

        public UnlinkCardFailure(String str, String str2, String str3) {
            this.f8355a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/AlertDialogData$ValidationFailure;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/AlertDialogData;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ValidationFailure implements AlertDialogData {

        /* renamed from: a, reason: collision with root package name */
        public final String f8356a;
        public final String b;

        public ValidationFailure(String str, String str2) {
            this.f8356a = str;
            this.b = str2;
        }
    }
}
