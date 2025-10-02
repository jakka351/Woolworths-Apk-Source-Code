package au.com.woolworths.foundation.shop.deeplink.resolver;

import YU.a;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/shop/deeplink/resolver/ShopAppDeepLinkContract;", "", "Actions", "ViewState", "Snackbar", "deeplink-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ShopAppDeepLinkContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/foundation/shop/deeplink/resolver/ShopAppDeepLinkContract$Actions;", "", "LaunchDeepLink", "LaunchFallbackDeepLinkIntent", "LaunchSplashScreen", "FinishActivity", "Lau/com/woolworths/foundation/shop/deeplink/resolver/ShopAppDeepLinkContract$Actions$FinishActivity;", "Lau/com/woolworths/foundation/shop/deeplink/resolver/ShopAppDeepLinkContract$Actions$LaunchDeepLink;", "Lau/com/woolworths/foundation/shop/deeplink/resolver/ShopAppDeepLinkContract$Actions$LaunchFallbackDeepLinkIntent;", "Lau/com/woolworths/foundation/shop/deeplink/resolver/ShopAppDeepLinkContract$Actions$LaunchSplashScreen;", "deeplink-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/deeplink/resolver/ShopAppDeepLinkContract$Actions$FinishActivity;", "Lau/com/woolworths/foundation/shop/deeplink/resolver/ShopAppDeepLinkContract$Actions;", "deeplink-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class FinishActivity extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final FinishActivity f8706a = new FinishActivity();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof FinishActivity);
            }

            public final int hashCode() {
                return -1663007256;
            }

            public final String toString() {
                return "FinishActivity";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/deeplink/resolver/ShopAppDeepLinkContract$Actions$LaunchDeepLink;", "Lau/com/woolworths/foundation/shop/deeplink/resolver/ShopAppDeepLinkContract$Actions;", "deeplink-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchDeepLink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f8707a;

            public LaunchDeepLink(String deepLink) {
                Intrinsics.h(deepLink, "deepLink");
                this.f8707a = deepLink;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchDeepLink) && Intrinsics.c(this.f8707a, ((LaunchDeepLink) obj).f8707a);
            }

            public final int hashCode() {
                return this.f8707a.hashCode();
            }

            public final String toString() {
                return a.h("LaunchDeepLink(deepLink=", this.f8707a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/deeplink/resolver/ShopAppDeepLinkContract$Actions$LaunchFallbackDeepLinkIntent;", "Lau/com/woolworths/foundation/shop/deeplink/resolver/ShopAppDeepLinkContract$Actions;", "deeplink-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchFallbackDeepLinkIntent extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Intent f8708a;

            public LaunchFallbackDeepLinkIntent(Intent fallbackIntent) {
                Intrinsics.h(fallbackIntent, "fallbackIntent");
                this.f8708a = fallbackIntent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchFallbackDeepLinkIntent) && Intrinsics.c(this.f8708a, ((LaunchFallbackDeepLinkIntent) obj).f8708a);
            }

            public final int hashCode() {
                return this.f8708a.hashCode();
            }

            public final String toString() {
                return "LaunchFallbackDeepLinkIntent(fallbackIntent=" + this.f8708a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/deeplink/resolver/ShopAppDeepLinkContract$Actions$LaunchSplashScreen;", "Lau/com/woolworths/foundation/shop/deeplink/resolver/ShopAppDeepLinkContract$Actions;", "deeplink-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchSplashScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchSplashScreen f8709a = new LaunchSplashScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchSplashScreen);
            }

            public final int hashCode() {
                return -1607298260;
            }

            public final String toString() {
                return "LaunchSplashScreen";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/deeplink/resolver/ShopAppDeepLinkContract$Snackbar;", "", "deeplink-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Snackbar {

        /* renamed from: a, reason: collision with root package name */
        public final ResText f8710a;
        public final Function0 b;
        public final Function1 c;

        public Snackbar(ResText resText) {
            h hVar = new h(20);
            au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a aVar = new au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a(19);
            this.f8710a = resText;
            this.b = hVar;
            this.c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Snackbar)) {
                return false;
            }
            Snackbar snackbar = (Snackbar) obj;
            return this.f8710a.equals(snackbar.f8710a) && this.b.equals(snackbar.b) && this.c.equals(snackbar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.f8710a.hashCode() * 961)) * 31);
        }

        public final String toString() {
            return "Snackbar(message=" + this.f8710a + ", actionLabel=null, actionCallback=" + this.b + ", onImpression=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/deeplink/resolver/ShopAppDeepLinkContract$ViewState;", "", "Companion", "deeplink-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public static final ViewState d = new ViewState(false, null, null);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f8711a;
        public final FullPageMessage.Error b;
        public final Snackbar c;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/deeplink/resolver/ShopAppDeepLinkContract$ViewState$Companion;", "", "deeplink-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public ViewState(boolean z, FullPageMessage.Error error, Snackbar snackbar) {
            this.f8711a = z;
            this.b = error;
            this.c = snackbar;
        }

        public static ViewState a(ViewState viewState, Snackbar snackbar, int i) {
            FullPageMessage.Error error = (i & 2) != 0 ? viewState.b : FullPageMessage.Error.ConnectionError.f8915a;
            if ((i & 4) != 0) {
                snackbar = viewState.c;
            }
            viewState.getClass();
            return new ViewState(false, error, snackbar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f8711a == viewState.f8711a && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f8711a) * 31;
            FullPageMessage.Error error = this.b;
            int iHashCode2 = (iHashCode + (error == null ? 0 : error.hashCode())) * 31;
            Snackbar snackbar = this.c;
            return iHashCode2 + (snackbar != null ? snackbar.hashCode() : 0);
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f8711a + ", error=" + this.b + ", snackbar=" + this.c + ")";
        }
    }
}
