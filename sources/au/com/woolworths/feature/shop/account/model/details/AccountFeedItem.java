package au.com.woolworths.feature.shop.account.model.details;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.aem.components.model.button.ButtonData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/account/model/details/AccountFeedItem;", "", "AccountPersonalDetails", "AccountBusinessDetails", "AccountContactDetails", "AccountPreferences", "AccountFooter", "Lau/com/woolworths/feature/shop/account/model/details/AccountFeedItem$AccountBusinessDetails;", "Lau/com/woolworths/feature/shop/account/model/details/AccountFeedItem$AccountContactDetails;", "Lau/com/woolworths/feature/shop/account/model/details/AccountFeedItem$AccountFooter;", "Lau/com/woolworths/feature/shop/account/model/details/AccountFeedItem$AccountPersonalDetails;", "Lau/com/woolworths/feature/shop/account/model/details/AccountFeedItem$AccountPreferences;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AccountFeedItem {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/model/details/AccountFeedItem$AccountBusinessDetails;", "Lau/com/woolworths/feature/shop/account/model/details/AccountFeedItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AccountBusinessDetails implements AccountFeedItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f6576a;
        public final String b;
        public final ArrayList c;

        public AccountBusinessDetails(String str, String str2, ArrayList arrayList) {
            this.f6576a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccountBusinessDetails)) {
                return false;
            }
            AccountBusinessDetails accountBusinessDetails = (AccountBusinessDetails) obj;
            return this.f6576a.equals(accountBusinessDetails.f6576a) && Intrinsics.c(this.b, accountBusinessDetails.b) && this.c.equals(accountBusinessDetails.c);
        }

        public final int hashCode() {
            int iHashCode = this.f6576a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return a.q(")", YU.a.v("AccountBusinessDetails(title=", this.f6576a, ", subtitle=", this.b, ", rowItems="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/model/details/AccountFeedItem$AccountContactDetails;", "Lau/com/woolworths/feature/shop/account/model/details/AccountFeedItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AccountContactDetails implements AccountFeedItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f6577a;
        public final String b;
        public final List c;

        public AccountContactDetails(String str, String str2, List list) {
            this.f6577a = str;
            this.b = str2;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccountContactDetails)) {
                return false;
            }
            AccountContactDetails accountContactDetails = (AccountContactDetails) obj;
            return Intrinsics.c(this.f6577a, accountContactDetails.f6577a) && Intrinsics.c(this.b, accountContactDetails.b) && Intrinsics.c(this.c, accountContactDetails.c);
        }

        public final int hashCode() {
            int iHashCode = this.f6577a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return a.t(YU.a.v("AccountContactDetails(title=", this.f6577a, ", subtitle=", this.b, ", rowItems="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/model/details/AccountFeedItem$AccountFooter;", "Lau/com/woolworths/feature/shop/account/model/details/AccountFeedItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AccountFooter implements AccountFeedItem {

        /* renamed from: a, reason: collision with root package name */
        public final ButtonData f6578a;

        public AccountFooter(ButtonData buttonData) {
            this.f6578a = buttonData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AccountFooter) && Intrinsics.c(this.f6578a, ((AccountFooter) obj).f6578a);
        }

        public final int hashCode() {
            return this.f6578a.hashCode();
        }

        public final String toString() {
            return "AccountFooter(button=" + this.f6578a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/model/details/AccountFeedItem$AccountPersonalDetails;", "Lau/com/woolworths/feature/shop/account/model/details/AccountFeedItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AccountPersonalDetails implements AccountFeedItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f6579a;
        public final String b;
        public final List c;

        public AccountPersonalDetails(String str, String str2, List list) {
            this.f6579a = str;
            this.b = str2;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccountPersonalDetails)) {
                return false;
            }
            AccountPersonalDetails accountPersonalDetails = (AccountPersonalDetails) obj;
            return Intrinsics.c(this.f6579a, accountPersonalDetails.f6579a) && Intrinsics.c(this.b, accountPersonalDetails.b) && Intrinsics.c(this.c, accountPersonalDetails.c);
        }

        public final int hashCode() {
            int iHashCode = this.f6579a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return a.t(YU.a.v("AccountPersonalDetails(title=", this.f6579a, ", subtitle=", this.b, ", rowItems="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/model/details/AccountFeedItem$AccountPreferences;", "Lau/com/woolworths/feature/shop/account/model/details/AccountFeedItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AccountPreferences implements AccountFeedItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f6580a;
        public final String b;
        public final List c;

        public AccountPreferences(String str, String str2, List list) {
            this.f6580a = str;
            this.b = str2;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccountPreferences)) {
                return false;
            }
            AccountPreferences accountPreferences = (AccountPreferences) obj;
            return Intrinsics.c(this.f6580a, accountPreferences.f6580a) && Intrinsics.c(this.b, accountPreferences.b) && Intrinsics.c(this.c, accountPreferences.c);
        }

        public final int hashCode() {
            int iHashCode = this.f6580a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return a.t(YU.a.v("AccountPreferences(title=", this.f6580a, ", subtitle=", this.b, ", rowItems="), this.c, ")");
        }
    }
}
