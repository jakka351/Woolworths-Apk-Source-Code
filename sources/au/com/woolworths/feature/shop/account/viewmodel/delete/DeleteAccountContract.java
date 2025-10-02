package au.com.woolworths.feature.shop.account.viewmodel.delete;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.account.model.delete.DeleteAccountTnCData;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/account/viewmodel/delete/DeleteAccountContract;", "", "Action", "ViewState", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeleteAccountContract {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/account/viewmodel/delete/DeleteAccountContract$Action;", "", "LaunchHome", "Logout", "Lau/com/woolworths/feature/shop/account/viewmodel/delete/DeleteAccountContract$Action$LaunchHome;", "Lau/com/woolworths/feature/shop/account/viewmodel/delete/DeleteAccountContract$Action$Logout;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/viewmodel/delete/DeleteAccountContract$Action$LaunchHome;", "Lau/com/woolworths/feature/shop/account/viewmodel/delete/DeleteAccountContract$Action;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchHome implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchHome f6589a = new LaunchHome();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchHome);
            }

            public final int hashCode() {
                return 465090155;
            }

            public final String toString() {
                return "LaunchHome";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/viewmodel/delete/DeleteAccountContract$Action$Logout;", "Lau/com/woolworths/feature/shop/account/viewmodel/delete/DeleteAccountContract$Action;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Logout implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final Logout f6590a = new Logout();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Logout);
            }

            public final int hashCode() {
                return 101504323;
            }

            public final String toString() {
                return "Logout";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/account/viewmodel/delete/DeleteAccountContract$ViewState;", "", "Content", "Loading", "Error", "Lau/com/woolworths/feature/shop/account/viewmodel/delete/DeleteAccountContract$ViewState$Content;", "Lau/com/woolworths/feature/shop/account/viewmodel/delete/DeleteAccountContract$ViewState$Error;", "Lau/com/woolworths/feature/shop/account/viewmodel/delete/DeleteAccountContract$ViewState$Loading;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/viewmodel/delete/DeleteAccountContract$ViewState$Content;", "Lau/com/woolworths/feature/shop/account/viewmodel/delete/DeleteAccountContract$ViewState;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Content implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final DeleteAccountTnCData f6591a;
            public final AccountDeletionState b;

            public Content(DeleteAccountTnCData deleteAccountTnCData, AccountDeletionState accountDeletionState) {
                Intrinsics.h(deleteAccountTnCData, "deleteAccountTnCData");
                this.f6591a = deleteAccountTnCData;
                this.b = accountDeletionState;
            }

            public static Content b(Content content, AccountDeletionState accountDeletionState) {
                DeleteAccountTnCData deleteAccountTnCData = content.f6591a;
                Intrinsics.h(deleteAccountTnCData, "deleteAccountTnCData");
                return new Content(deleteAccountTnCData, accountDeletionState);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return false;
                }
                Content content = (Content) obj;
                return Intrinsics.c(this.f6591a, content.f6591a) && Intrinsics.c(this.b, content.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f6591a.hashCode() * 31);
            }

            public final String toString() {
                return "Content(deleteAccountTnCData=" + this.f6591a + ", deletionState=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/viewmodel/delete/DeleteAccountContract$ViewState$Error;", "Lau/com/woolworths/feature/shop/account/viewmodel/delete/DeleteAccountContract$ViewState;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final FullPageMessage.Error f6592a;

            public Error(FullPageMessage.Error error) {
                this.f6592a = error;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.c(this.f6592a, ((Error) obj).f6592a);
            }

            public final int hashCode() {
                return this.f6592a.hashCode();
            }

            public final String toString() {
                return "Error(error=" + this.f6592a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/viewmodel/delete/DeleteAccountContract$ViewState$Loading;", "Lau/com/woolworths/feature/shop/account/viewmodel/delete/DeleteAccountContract$ViewState;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Loading implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final Loading f6593a = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return -1788480901;
            }

            public final String toString() {
                return "Loading";
            }
        }

        default AccountDeletionState a() {
            Content content = this instanceof Content ? (Content) this : null;
            if (content != null) {
                return content.b;
            }
            return null;
        }
    }
}
