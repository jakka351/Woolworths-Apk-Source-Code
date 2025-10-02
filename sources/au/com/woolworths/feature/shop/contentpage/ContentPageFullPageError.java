package au.com.woolworths.feature.shop.contentpage;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageFullPageError;", "", "ConnectionError", "ServerError", "GuestMode", "NoSavedRecipes", "Lau/com/woolworths/feature/shop/contentpage/ContentPageFullPageError$ConnectionError;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageFullPageError$GuestMode;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageFullPageError$NoSavedRecipes;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageFullPageError$ServerError;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ContentPageFullPageError {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageFullPageError$ConnectionError;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageFullPageError;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConnectionError implements ContentPageFullPageError {

        /* renamed from: a, reason: collision with root package name */
        public static final ConnectionError f6983a = new ConnectionError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConnectionError);
        }

        public final int hashCode() {
            return 1902088727;
        }

        public final String toString() {
            return "ConnectionError";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageFullPageError$GuestMode;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageFullPageError;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GuestMode implements ContentPageFullPageError {

        /* renamed from: a, reason: collision with root package name */
        public final int f6984a;
        public final Text b;
        public final int c;
        public final Text d;
        public final Text e;

        public GuestMode() {
            ResText resText = new ResText(com.woolworths.R.string.save_recipe_login_message);
            ResText resText2 = new ResText(com.woolworths.R.string.save_recipe_login_title);
            ResText resText3 = new ResText(com.woolworths.R.string.saved_recipes_title);
            this.f6984a = com.woolworths.R.drawable.ic_no_catalogue;
            this.b = resText;
            this.c = com.woolworths.R.string.save_recipe_login;
            this.d = resText2;
            this.e = resText3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GuestMode)) {
                return false;
            }
            GuestMode guestMode = (GuestMode) obj;
            return this.f6984a == guestMode.f6984a && Intrinsics.c(this.b, guestMode.b) && this.c == guestMode.c && Intrinsics.c(this.d, guestMode.d) && Intrinsics.c(this.e, guestMode.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + androidx.camera.core.impl.b.a(this.c, (this.b.hashCode() + (Integer.hashCode(this.f6984a) * 31)) * 31, 31)) * 31);
        }

        public final String toString() {
            return "GuestMode(drawableRes=" + this.f6984a + ", messageText=" + this.b + ", primaryActionRes=" + this.c + ", titleText=" + this.d + ", pageTitleText=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageFullPageError$NoSavedRecipes;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageFullPageError;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoSavedRecipes implements ContentPageFullPageError {

        /* renamed from: a, reason: collision with root package name */
        public final int f6985a;
        public final Text b;
        public final Text c;

        public NoSavedRecipes() {
            ResText resText = new ResText(com.woolworths.R.string.no_saved_recipes_error_message);
            ResText resText2 = new ResText(com.woolworths.R.string.no_saved_recipes_error_heading);
            this.f6985a = com.woolworths.R.drawable.ic_no_catalogue;
            this.b = resText;
            this.c = resText2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoSavedRecipes)) {
                return false;
            }
            NoSavedRecipes noSavedRecipes = (NoSavedRecipes) obj;
            return this.f6985a == noSavedRecipes.f6985a && Intrinsics.c(this.b, noSavedRecipes.b) && Intrinsics.c(this.c, noSavedRecipes.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.f6985a) * 31)) * 31);
        }

        public final String toString() {
            return "NoSavedRecipes(drawableRes=" + this.f6985a + ", messageText=" + this.b + ", titleText=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageFullPageError$ServerError;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageFullPageError;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ServerError implements ContentPageFullPageError {

        /* renamed from: a, reason: collision with root package name */
        public final Text f6986a;
        public final Boolean b;

        public ServerError(Text text, Boolean bool) {
            this.f6986a = text;
            this.b = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServerError)) {
                return false;
            }
            ServerError serverError = (ServerError) obj;
            return Intrinsics.c(this.f6986a, serverError.f6986a) && Intrinsics.c(this.b, serverError.b);
        }

        public final int hashCode() {
            Text text = this.f6986a;
            int iHashCode = (text == null ? 0 : text.hashCode()) * 31;
            Boolean bool = this.b;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            return "ServerError(messageText=" + this.f6986a + ", canBeRetried=" + this.b + ")";
        }
    }
}
