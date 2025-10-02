package au.com.woolworths.feature.shop.wpay.ui.wpay;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.AddPayPalAlert;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.GiftCardItem;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.feature.shop.wpay.ui.wpay.GooglePayUiState;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract;", "", "ViewState", "Action", "UiEvent", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface WPayForOrderContract {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$Action;", "", "LaunchSnackBar", "LaunchCustomTabs", "CvvFormSubmit", "CvvFormReload", "LaunchOrderConfirmation", "LaunchCheckoutDetails", "LaunchGooglePay", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$Action$CvvFormReload;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$Action$CvvFormSubmit;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$Action$LaunchCheckoutDetails;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$Action$LaunchCustomTabs;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$Action$LaunchGooglePay;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$Action$LaunchOrderConfirmation;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$Action$LaunchSnackBar;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$Action$CvvFormReload;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$Action;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CvvFormReload implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final CvvFormReload f8370a = new CvvFormReload();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CvvFormReload);
            }

            public final int hashCode() {
                return 807391521;
            }

            public final String toString() {
                return "CvvFormReload";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$Action$CvvFormSubmit;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$Action;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CvvFormSubmit implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final CvvFormSubmit f8371a = new CvvFormSubmit();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CvvFormSubmit);
            }

            public final int hashCode() {
                return 850497440;
            }

            public final String toString() {
                return "CvvFormSubmit";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$Action$LaunchCheckoutDetails;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$Action;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchCheckoutDetails implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchCheckoutDetails f8372a = new LaunchCheckoutDetails();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchCheckoutDetails);
            }

            public final int hashCode() {
                return 2013971402;
            }

            public final String toString() {
                return "LaunchCheckoutDetails";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$Action$LaunchCustomTabs;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$Action;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchCustomTabs implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f8373a;
            public final Map b;

            public LaunchCustomTabs(String str, Map map) {
                this.f8373a = str;
                this.b = map;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchCustomTabs)) {
                    return false;
                }
                LaunchCustomTabs launchCustomTabs = (LaunchCustomTabs) obj;
                return Intrinsics.c(this.f8373a, launchCustomTabs.f8373a) && Intrinsics.c(this.b, launchCustomTabs.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f8373a.hashCode() * 31);
            }

            public final String toString() {
                return "LaunchCustomTabs(url=" + this.f8373a + ", headers=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$Action$LaunchGooglePay;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$Action;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchGooglePay implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final Task f8374a;

            public LaunchGooglePay(Task task) {
                Intrinsics.h(task, "task");
                this.f8374a = task;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchGooglePay) && Intrinsics.c(this.f8374a, ((LaunchGooglePay) obj).f8374a);
            }

            public final int hashCode() {
                return this.f8374a.hashCode();
            }

            public final String toString() {
                return "LaunchGooglePay(task=" + this.f8374a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$Action$LaunchOrderConfirmation;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$Action;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchOrderConfirmation implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final int f8375a;

            public LaunchOrderConfirmation(int i) {
                this.f8375a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchOrderConfirmation) && this.f8375a == ((LaunchOrderConfirmation) obj).f8375a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f8375a);
            }

            public final String toString() {
                return YU.a.e(this.f8375a, "LaunchOrderConfirmation(orderId=", ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$Action$LaunchSnackBar;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$Action;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchSnackBar implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final Text f8376a;

            public LaunchSnackBar(Text text) {
                this.f8376a = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchSnackBar) && Intrinsics.c(this.f8376a, ((LaunchSnackBar) obj).f8376a);
            }

            public final int hashCode() {
                return this.f8376a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.h("LaunchSnackBar(message=", this.f8376a, ")");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent;", "", "GiftCard", "PaymentMethod", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$GiftCard;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface UiEvent {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$GiftCard;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent;", "Add", "Delete", "Focus", "Check", "Done", "Update", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$GiftCard$Add;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$GiftCard$Check;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$GiftCard$Delete;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$GiftCard$Done;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$GiftCard$Focus;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$GiftCard$Update;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface GiftCard extends UiEvent {

            @StabilityInferred
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$GiftCard$Add;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$GiftCard;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class Add implements GiftCard {

                /* renamed from: a, reason: collision with root package name */
                public final GiftCardItem.AddGiftCard f8377a;

                public Add(GiftCardItem.AddGiftCard addGiftCard) {
                    Intrinsics.h(addGiftCard, "addGiftCard");
                    this.f8377a = addGiftCard;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Add) && Intrinsics.c(this.f8377a, ((Add) obj).f8377a);
                }

                public final int hashCode() {
                    return this.f8377a.hashCode();
                }

                public final String toString() {
                    return "Add(addGiftCard=" + this.f8377a + ")";
                }
            }

            @StabilityInferred
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$GiftCard$Check;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$GiftCard;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class Check implements GiftCard {

                /* renamed from: a, reason: collision with root package name */
                public final String f8378a;
                public final String b;
                public final boolean c;

                public Check(String str, String str2, boolean z) {
                    this.f8378a = str;
                    this.b = str2;
                    this.c = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Check)) {
                        return false;
                    }
                    Check check = (Check) obj;
                    return Intrinsics.c(this.f8378a, check.f8378a) && Intrinsics.c(this.b, check.b) && this.c == check.c;
                }

                public final int hashCode() {
                    int iHashCode = this.f8378a.hashCode() * 31;
                    String str = this.b;
                    return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
                }

                public final String toString() {
                    return YU.a.k(")", YU.a.v("Check(id=", this.f8378a, ", snackBarMessage=", this.b, ", checked="), this.c);
                }
            }

            @StabilityInferred
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$GiftCard$Delete;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$GiftCard;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class Delete implements GiftCard {

                /* renamed from: a, reason: collision with root package name */
                public final String f8379a;
                public final boolean b;

                public Delete(String str, boolean z) {
                    this.f8379a = str;
                    this.b = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Delete)) {
                        return false;
                    }
                    Delete delete = (Delete) obj;
                    return this.f8379a.equals(delete.f8379a) && this.b == delete.b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.b) + (this.f8379a.hashCode() * 31);
                }

                public final String toString() {
                    return au.com.woolworths.android.onesite.a.j("Delete(id=", this.f8379a, ", linked=", this.b, ")");
                }
            }

            @StabilityInferred
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$GiftCard$Done;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$GiftCard;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class Done implements GiftCard {
                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Done);
                }

                public final int hashCode() {
                    throw null;
                }

                public final String toString() {
                    return "Done(id=null)";
                }
            }

            @StabilityInferred
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$GiftCard$Focus;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$GiftCard;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class Focus implements GiftCard {

                /* renamed from: a, reason: collision with root package name */
                public final String f8380a;
                public final boolean b;

                public Focus(String str, boolean z) {
                    this.f8380a = str;
                    this.b = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Focus)) {
                        return false;
                    }
                    Focus focus = (Focus) obj;
                    return Intrinsics.c(this.f8380a, focus.f8380a) && this.b == focus.b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.b) + (this.f8380a.hashCode() * 31);
                }

                public final String toString() {
                    return au.com.woolworths.android.onesite.a.j("Focus(id=", this.f8380a, ", focused=", this.b, ")");
                }
            }

            @StabilityInferred
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$GiftCard$Update;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$GiftCard;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class Update implements GiftCard {

                /* renamed from: a, reason: collision with root package name */
                public final String f8381a;
                public final String b;
                public final String c;

                public Update(String str, String newValue, String str2) {
                    Intrinsics.h(newValue, "newValue");
                    this.f8381a = str;
                    this.b = newValue;
                    this.c = str2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Update)) {
                        return false;
                    }
                    Update update = (Update) obj;
                    return Intrinsics.c(this.f8381a, update.f8381a) && Intrinsics.c(this.b, update.b) && Intrinsics.c(this.c, update.c);
                }

                public final int hashCode() {
                    return this.c.hashCode() + androidx.camera.core.impl.b.c(this.f8381a.hashCode() * 31, 31, this.b);
                }

                public final String toString() {
                    return YU.a.o(YU.a.v("Update(id=", this.f8381a, ", newValue=", this.b, ", oldValue="), this.c, ")");
                }
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent;", "CreditCard", "PayPal", "GooglePay", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$CreditCard;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$GooglePay;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$PayPal;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface PaymentMethod extends UiEvent {

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$CreditCard;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod;", "Add", "Select", "Delete", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$CreditCard$Add;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$CreditCard$Delete;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$CreditCard$Select;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public interface CreditCard extends PaymentMethod {

                @StabilityInferred
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$CreditCard$Add;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$CreditCard;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final /* data */ class Add implements CreditCard {

                    /* renamed from: a, reason: collision with root package name */
                    public final PaymentMethodItem.CreditCard.Add f8382a;

                    public Add(PaymentMethodItem.CreditCard.Add add) {
                        this.f8382a = add;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Add) && Intrinsics.c(this.f8382a, ((Add) obj).f8382a);
                    }

                    public final int hashCode() {
                        return this.f8382a.hashCode();
                    }

                    public final String toString() {
                        return "Add(creditCard=" + this.f8382a + ")";
                    }
                }

                @StabilityInferred
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$CreditCard$Delete;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$CreditCard;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final /* data */ class Delete implements CreditCard {

                    /* renamed from: a, reason: collision with root package name */
                    public final String f8383a;
                    public final boolean b;

                    public Delete(String id, boolean z) {
                        Intrinsics.h(id, "id");
                        this.f8383a = id;
                        this.b = z;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Delete)) {
                            return false;
                        }
                        Delete delete = (Delete) obj;
                        return Intrinsics.c(this.f8383a, delete.f8383a) && this.b == delete.b;
                    }

                    public final int hashCode() {
                        return Boolean.hashCode(this.b) + (this.f8383a.hashCode() * 31);
                    }

                    public final String toString() {
                        return au.com.woolworths.android.onesite.a.j("Delete(id=", this.f8383a, ", linked=", this.b, ")");
                    }
                }

                @StabilityInferred
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$CreditCard$Select;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$CreditCard;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final /* data */ class Select implements CreditCard {

                    /* renamed from: a, reason: collision with root package name */
                    public final String f8384a;
                    public final boolean b;

                    public Select(String id, boolean z) {
                        Intrinsics.h(id, "id");
                        this.f8384a = id;
                        this.b = z;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Select)) {
                            return false;
                        }
                        Select select = (Select) obj;
                        return Intrinsics.c(this.f8384a, select.f8384a) && this.b == select.b;
                    }

                    public final int hashCode() {
                        return Boolean.hashCode(this.b) + (this.f8384a.hashCode() * 31);
                    }

                    public final String toString() {
                        return au.com.woolworths.android.onesite.a.j("Select(id=", this.f8384a, ", selected=", this.b, ")");
                    }
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$GooglePay;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod;", "Select", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$GooglePay$Select;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public interface GooglePay extends PaymentMethod {

                @StabilityInferred
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$GooglePay$Select;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$GooglePay;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final /* data */ class Select implements GooglePay {

                    /* renamed from: a, reason: collision with root package name */
                    public final String f8385a;
                    public final boolean b;

                    public Select(String str, boolean z) {
                        this.f8385a = str;
                        this.b = z;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Select)) {
                            return false;
                        }
                        Select select = (Select) obj;
                        return Intrinsics.c(this.f8385a, select.f8385a) && this.b == select.b;
                    }

                    public final int hashCode() {
                        return Boolean.hashCode(this.b) + (this.f8385a.hashCode() * 31);
                    }

                    public final String toString() {
                        return au.com.woolworths.android.onesite.a.j("Select(id=", this.f8385a, ", selected=", this.b, ")");
                    }
                }
            }

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$PayPal;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod;", "Add", "Select", "Delete", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$PayPal$Add;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$PayPal$Delete;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$PayPal$Select;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public interface PayPal extends PaymentMethod {

                @StabilityInferred
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$PayPal$Add;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$PayPal;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final /* data */ class Add implements PayPal {

                    /* renamed from: a, reason: collision with root package name */
                    public final AddPayPalAlert f8386a;

                    public Add(AddPayPalAlert addPayPalAlert) {
                        this.f8386a = addPayPalAlert;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Add) && Intrinsics.c(this.f8386a, ((Add) obj).f8386a);
                    }

                    public final int hashCode() {
                        return this.f8386a.hashCode();
                    }

                    public final String toString() {
                        return "Add(addPayPal=" + this.f8386a + ")";
                    }
                }

                @StabilityInferred
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$PayPal$Delete;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$PayPal;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final /* data */ class Delete implements PayPal {

                    /* renamed from: a, reason: collision with root package name */
                    public final String f8387a;

                    public Delete(String str) {
                        this.f8387a = str;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Delete) && Intrinsics.c(this.f8387a, ((Delete) obj).f8387a);
                    }

                    public final int hashCode() {
                        return this.f8387a.hashCode();
                    }

                    public final String toString() {
                        return YU.a.h("Delete(id=", this.f8387a, ")");
                    }
                }

                @StabilityInferred
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$PayPal$Select;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent$PaymentMethod$PayPal;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final /* data */ class Select implements PayPal {

                    /* renamed from: a, reason: collision with root package name */
                    public final String f8388a;
                    public final boolean b;

                    public Select(String str, boolean z) {
                        this.f8388a = str;
                        this.b = z;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Select)) {
                            return false;
                        }
                        Select select = (Select) obj;
                        return Intrinsics.c(this.f8388a, select.f8388a) && this.b == select.b;
                    }

                    public final int hashCode() {
                        return Boolean.hashCode(this.b) + (this.f8388a.hashCode() * 31);
                    }

                    public final String toString() {
                        return au.com.woolworths.android.onesite.a.j("Select(id=", this.f8388a, ", selected=", this.b, ")");
                    }
                }
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$ViewState;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final LoadingState f8389a;
        public final String b;
        public final PageResult c;
        public final ModalBottomSheetData d;
        public final Set e;
        public final Map f;
        public final Map g;
        public final Map h;
        public final boolean i;
        public final String j;
        public final GooglePayUiState k;
        public final AlertDialogData l;
        public final String m;

        public ViewState(LoadingState loadingState, String str, PageResult pageResult, ModalBottomSheetData modalBottomSheetData, Set set, Map linkedGiftCardEditMap, Map unlinkedGiftCardEditMap, Map giftCardErrorMap, boolean z, String str2, GooglePayUiState googlePayUiState, AlertDialogData alertDialogData, String str3) {
            Intrinsics.h(pageResult, "pageResult");
            Intrinsics.h(linkedGiftCardEditMap, "linkedGiftCardEditMap");
            Intrinsics.h(unlinkedGiftCardEditMap, "unlinkedGiftCardEditMap");
            Intrinsics.h(giftCardErrorMap, "giftCardErrorMap");
            this.f8389a = loadingState;
            this.b = str;
            this.c = pageResult;
            this.d = modalBottomSheetData;
            this.e = set;
            this.f = linkedGiftCardEditMap;
            this.g = unlinkedGiftCardEditMap;
            this.h = giftCardErrorMap;
            this.i = z;
            this.j = str2;
            this.k = googlePayUiState;
            this.l = alertDialogData;
            this.m = str3;
        }

        public static ViewState a(ViewState viewState, LoadingState loadingState, String str, PageResult pageResult, ModalBottomSheetData modalBottomSheetData, Set set, Map map, Map map2, Map map3, boolean z, String str2, GooglePayUiState googlePayUiState, AlertDialogData alertDialogData, String str3, int i) {
            if ((i & 1) != 0) {
                loadingState = viewState.f8389a;
            }
            LoadingState loadingState2 = loadingState;
            String str4 = (i & 2) != 0 ? viewState.b : str;
            PageResult pageResult2 = (i & 4) != 0 ? viewState.c : pageResult;
            ModalBottomSheetData modalBottomSheetData2 = (i & 8) != 0 ? viewState.d : modalBottomSheetData;
            Set checkoutSessionIds = (i & 16) != 0 ? viewState.e : set;
            Map linkedGiftCardEditMap = (i & 32) != 0 ? viewState.f : map;
            Map unlinkedGiftCardEditMap = (i & 64) != 0 ? viewState.g : map2;
            Map giftCardErrorMap = (i & 128) != 0 ? viewState.h : map3;
            boolean z2 = (i & 256) != 0 ? viewState.i : z;
            String str5 = (i & 512) != 0 ? viewState.j : str2;
            GooglePayUiState googlePayUiState2 = (i & 1024) != 0 ? viewState.k : googlePayUiState;
            AlertDialogData alertDialogData2 = (i & 2048) != 0 ? viewState.l : alertDialogData;
            String str6 = (i & 4096) != 0 ? viewState.m : str3;
            viewState.getClass();
            Intrinsics.h(loadingState2, "loadingState");
            Intrinsics.h(pageResult2, "pageResult");
            Intrinsics.h(checkoutSessionIds, "checkoutSessionIds");
            Intrinsics.h(linkedGiftCardEditMap, "linkedGiftCardEditMap");
            Intrinsics.h(unlinkedGiftCardEditMap, "unlinkedGiftCardEditMap");
            Intrinsics.h(giftCardErrorMap, "giftCardErrorMap");
            Intrinsics.h(googlePayUiState2, "googlePayUiState");
            return new ViewState(loadingState2, str4, pageResult2, modalBottomSheetData2, checkoutSessionIds, linkedGiftCardEditMap, unlinkedGiftCardEditMap, giftCardErrorMap, z2, str5, googlePayUiState2, alertDialogData2, str6);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f8389a == viewState.f8389a && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && Intrinsics.c(this.e, viewState.e) && Intrinsics.c(this.f, viewState.f) && Intrinsics.c(this.g, viewState.g) && Intrinsics.c(this.h, viewState.h) && this.i == viewState.i && Intrinsics.c(this.j, viewState.j) && Intrinsics.c(this.k, viewState.k) && Intrinsics.c(this.l, viewState.l) && Intrinsics.c(this.m, viewState.m);
        }

        public final int hashCode() {
            int iHashCode = this.f8389a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            ModalBottomSheetData modalBottomSheetData = this.d;
            int iE = androidx.camera.core.impl.b.e(au.com.woolworths.dynamic.page.ui.content.d.d(this.h, au.com.woolworths.dynamic.page.ui.content.d.d(this.g, au.com.woolworths.dynamic.page.ui.content.d.d(this.f, (this.e.hashCode() + ((iHashCode2 + (modalBottomSheetData == null ? 0 : modalBottomSheetData.hashCode())) * 31)) * 31, 31), 31), 31), 31, this.i);
            String str2 = this.j;
            int iHashCode3 = (this.k.hashCode() + ((iE + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            AlertDialogData alertDialogData = this.l;
            int iHashCode4 = (iHashCode3 + (alertDialogData == null ? 0 : alertDialogData.hashCode())) * 31;
            String str3 = this.m;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(loadingState=");
            sb.append(this.f8389a);
            sb.append(", errorBannerMessage=");
            sb.append(this.b);
            sb.append(", pageResult=");
            sb.append(this.c);
            sb.append(", modalBottomSheetData=");
            sb.append(this.d);
            sb.append(", checkoutSessionIds=");
            sb.append(this.e);
            sb.append(", linkedGiftCardEditMap=");
            sb.append(this.f);
            sb.append(", unlinkedGiftCardEditMap=");
            sb.append(this.g);
            sb.append(", giftCardErrorMap=");
            sb.append(this.h);
            sb.append(", cvvErrorLoadingVisible=");
            au.com.woolworths.android.onesite.a.y(", cvvErrorValidationMessage=", this.j, ", googlePayUiState=", sb, this.i);
            sb.append(this.k);
            sb.append(", alertDialogData=");
            sb.append(this.l);
            sb.append(", activePaymentMethodId=");
            return YU.a.o(sb, this.m, ")");
        }

        public /* synthetic */ ViewState(PageResult pageResult, Map map, Map map2, Map map3, String str, int i) {
            this(LoadingState.d, null, (i & 4) != 0 ? PageResult.Uninitialized.f8286a : pageResult, null, EmptySet.d, (i & 32) != 0 ? EmptyMap.d : map, (i & 64) != 0 ? EmptyMap.d : map2, (i & 128) != 0 ? EmptyMap.d : map3, (i & 256) == 0, (i & 512) != 0 ? null : "Please enter CVV", GooglePayUiState.Uninitialized.f8366a, null, str);
        }
    }
}
