package au.com.woolworths.feature.shop.account.viewmodel.details;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.shop.account.model.details.AccountDetailsData;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/account/viewmodel/details/AccountDetailsContract;", "", "ViewState", "Action", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AccountDetailsContract {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/account/viewmodel/details/AccountDetailsContract$Action;", "", "OpenLink", "Lau/com/woolworths/feature/shop/account/viewmodel/details/AccountDetailsContract$Action$OpenLink;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/viewmodel/details/AccountDetailsContract$Action$OpenLink;", "Lau/com/woolworths/feature/shop/account/viewmodel/details/AccountDetailsContract$Action;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenLink implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f6596a;
            public final ArrayList b;

            public OpenLink(String link, ArrayList arrayList) {
                Intrinsics.h(link, "link");
                this.f6596a = link;
                this.b = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenLink)) {
                    return false;
                }
                OpenLink openLink = (OpenLink) obj;
                return Intrinsics.c(this.f6596a, openLink.f6596a) && Intrinsics.c(this.b, openLink.b);
            }

            public final int hashCode() {
                int iHashCode = this.f6596a.hashCode() * 31;
                ArrayList arrayList = this.b;
                return iHashCode + (arrayList == null ? 0 : arrayList.hashCode());
            }

            public final String toString() {
                return d.q("OpenLink(link=", this.f6596a, ", extraMagicLinkCookies=", ")", this.b);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/account/viewmodel/details/AccountDetailsContract$ViewState;", "", "Loading", "Error", "Content", "Lau/com/woolworths/feature/shop/account/viewmodel/details/AccountDetailsContract$ViewState$Content;", "Lau/com/woolworths/feature/shop/account/viewmodel/details/AccountDetailsContract$ViewState$Error;", "Lau/com/woolworths/feature/shop/account/viewmodel/details/AccountDetailsContract$ViewState$Loading;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/viewmodel/details/AccountDetailsContract$ViewState$Content;", "Lau/com/woolworths/feature/shop/account/viewmodel/details/AccountDetailsContract$ViewState;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Content implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final AccountDetailsData f6597a;

            public Content(AccountDetailsData data) {
                Intrinsics.h(data, "data");
                this.f6597a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Content) && Intrinsics.c(this.f6597a, ((Content) obj).f6597a);
            }

            public final int hashCode() {
                return this.f6597a.f6575a.hashCode();
            }

            public final String toString() {
                return "Content(data=" + this.f6597a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/viewmodel/details/AccountDetailsContract$ViewState$Error;", "Lau/com/woolworths/feature/shop/account/viewmodel/details/AccountDetailsContract$ViewState;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final FullPageMessage.Error f6598a;

            public Error(FullPageMessage.Error error) {
                this.f6598a = error;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.c(this.f6598a, ((Error) obj).f6598a);
            }

            public final int hashCode() {
                return this.f6598a.hashCode();
            }

            public final String toString() {
                return "Error(error=" + this.f6598a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/viewmodel/details/AccountDetailsContract$ViewState$Loading;", "Lau/com/woolworths/feature/shop/account/viewmodel/details/AccountDetailsContract$ViewState;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Loading implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final Loading f6599a = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return -2120532419;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }
}
