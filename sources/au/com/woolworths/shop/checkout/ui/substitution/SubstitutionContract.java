package au.com.woolworths.shop.checkout.ui.substitution;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionContract;", "", "Action", "ViewState", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SubstitutionContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionContract$Action;", "", "ShowNoProductSelected", "ShowSavingError", "LeaveScreen", "Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionContract$Action$LeaveScreen;", "Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionContract$Action$ShowNoProductSelected;", "Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionContract$Action$ShowSavingError;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionContract$Action$LeaveScreen;", "Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionContract$Action;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LeaveScreen extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LeaveScreen f10812a = new LeaveScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LeaveScreen);
            }

            public final int hashCode() {
                return 1137561526;
            }

            public final String toString() {
                return "LeaveScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionContract$Action$ShowNoProductSelected;", "Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionContract$Action;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowNoProductSelected extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowNoProductSelected f10813a = new ShowNoProductSelected();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowNoProductSelected);
            }

            public final int hashCode() {
                return -1861949153;
            }

            public final String toString() {
                return "ShowNoProductSelected";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionContract$Action$ShowSavingError;", "Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionContract$Action;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSavingError extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowSavingError f10814a = new ShowSavingError();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowSavingError);
            }

            public final int hashCode() {
                return 1297555492;
            }

            public final String toString() {
                return "ShowSavingError";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionContract$ViewState;", "", "Loading", "Error", "Content", "ButtonState", "Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionContract$ViewState$Content;", "Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionContract$ViewState$Error;", "Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionContract$ViewState$Loading;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ViewState {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionContract$ViewState$ButtonState;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ButtonState {
            public static final ButtonState d;
            public static final ButtonState e;
            public static final ButtonState f;
            public static final /* synthetic */ ButtonState[] g;
            public static final /* synthetic */ EnumEntries h;

            static {
                ButtonState buttonState = new ButtonState("Enabled", 0);
                d = buttonState;
                ButtonState buttonState2 = new ButtonState("Disabled", 1);
                e = buttonState2;
                ButtonState buttonState3 = new ButtonState("Loading", 2);
                f = buttonState3;
                ButtonState[] buttonStateArr = {buttonState, buttonState2, buttonState3};
                g = buttonStateArr;
                h = EnumEntriesKt.a(buttonStateArr);
            }

            public static ButtonState valueOf(String str) {
                return (ButtonState) Enum.valueOf(ButtonState.class, str);
            }

            public static ButtonState[] values() {
                return (ButtonState[]) g.clone();
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionContract$ViewState$Content;", "Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionContract$ViewState;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Content extends ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final SubstitutionPreference f10815a;
            public final String b;
            public final ButtonState c;
            public final Map d;
            public final boolean e;

            public Content(SubstitutionPreference substitutionPreference, String str, ButtonState buttonState, Map map, boolean z) {
                this.f10815a = substitutionPreference;
                this.b = str;
                this.c = buttonState;
                this.d = map;
                this.e = z;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Map] */
            public static Content a(Content content, String str, ButtonState buttonState, LinkedHashMap linkedHashMap, boolean z, int i) {
                String str2 = str;
                SubstitutionPreference substitutionPreference = content.f10815a;
                if ((i & 2) != 0) {
                    str2 = content.b;
                }
                if ((i & 4) != 0) {
                    buttonState = content.c;
                }
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                if ((i & 8) != 0) {
                    linkedHashMap2 = content.d;
                }
                if ((i & 16) != 0) {
                    z = content.e;
                }
                boolean z2 = z;
                content.getClass();
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                return new Content(substitutionPreference, str2, buttonState, linkedHashMap3, z2);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return false;
                }
                Content content = (Content) obj;
                return Intrinsics.c(this.f10815a, content.f10815a) && Intrinsics.c(this.b, content.b) && this.c == content.c && Intrinsics.c(this.d, content.d) && this.e == content.e;
            }

            public final int hashCode() {
                int iHashCode = this.f10815a.hashCode() * 31;
                String str = this.b;
                return Boolean.hashCode(this.e) + d.d(this.d, (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Content(data=");
                sb.append(this.f10815a);
                sb.append(", selectedOptionId=");
                sb.append(this.b);
                sb.append(", buttonState=");
                sb.append(this.c);
                sb.append(", currentProductSubstituteState=");
                sb.append(this.d);
                sb.append(", hasCheaperSubstituteBannerDismissed=");
                return YU.a.k(")", sb, this.e);
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionContract$ViewState$Error;", "Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionContract$ViewState;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error extends ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final FullPageMessage.Error f10816a;

            public Error(FullPageMessage.Error error) {
                this.f10816a = error;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.c(this.f10816a, ((Error) obj).f10816a);
            }

            public final int hashCode() {
                return this.f10816a.hashCode();
            }

            public final String toString() {
                return "Error(error=" + this.f10816a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionContract$ViewState$Loading;", "Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionContract$ViewState;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Loading extends ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final Loading f10817a = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return 1003109167;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }
}
