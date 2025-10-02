package au.com.woolworths.feature.shop.weblink;

import androidx.camera.core.impl.b;
import au.com.woolworths.feature.shop.weblink.model.WebLink;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/weblink/WebLinkContract;", "", "ViewState", "web-link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface WebLinkContract {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/weblink/WebLinkContract$ViewState;", "", "web-link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final WebLink f8255a;
        public final boolean b;
        public final WebLinkErrorState c;

        public ViewState(WebLink webLink, boolean z, WebLinkErrorState webLinkErrorState) {
            this.f8255a = webLink;
            this.b = z;
            this.c = webLinkErrorState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f8255a, viewState.f8255a) && this.b == viewState.b && this.c == viewState.c;
        }

        public final int hashCode() {
            WebLink webLink = this.f8255a;
            int iE = b.e((webLink == null ? 0 : webLink.hashCode()) * 31, 31, this.b);
            WebLinkErrorState webLinkErrorState = this.c;
            return iE + (webLinkErrorState != null ? webLinkErrorState.hashCode() : 0);
        }

        public final String toString() {
            return "ViewState(webLink=" + this.f8255a + ", isLoading=" + this.b + ", errorState=" + this.c + ")";
        }
    }
}
