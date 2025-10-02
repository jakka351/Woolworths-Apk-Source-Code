package au.com.woolworths.feature.shop.inbox;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.inbox.domain.LastUnreadChatbotMessageItem;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxUiState;", "", "Loading", "Content", "Error", "Lau/com/woolworths/feature/shop/inbox/InboxUiState$Content;", "Lau/com/woolworths/feature/shop/inbox/InboxUiState$Error;", "Lau/com/woolworths/feature/shop/inbox/InboxUiState$Loading;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface InboxUiState {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxUiState$Content;", "Lau/com/woolworths/feature/shop/inbox/InboxUiState;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Content implements InboxUiState {

        /* renamed from: a, reason: collision with root package name */
        public final Map f7281a;
        public final LastUnreadChatbotMessageItem b;
        public final boolean c;
        public final boolean d;

        public Content(Map map, LastUnreadChatbotMessageItem lastUnreadChatbotMessageItem, boolean z, boolean z2) {
            this.f7281a = map;
            this.b = lastUnreadChatbotMessageItem;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.c(this.f7281a, content.f7281a) && Intrinsics.c(this.b, content.b) && this.c == content.c && this.d == content.d;
        }

        public final int hashCode() {
            int iHashCode = this.f7281a.hashCode() * 31;
            LastUnreadChatbotMessageItem lastUnreadChatbotMessageItem = this.b;
            return Boolean.hashCode(this.d) + androidx.camera.core.impl.b.e((iHashCode + (lastUnreadChatbotMessageItem == null ? 0 : lastUnreadChatbotMessageItem.hashCode())) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(items=");
            sb.append(this.f7281a);
            sb.append(", lastUnreadChatbotMessageItem=");
            sb.append(this.b);
            sb.append(", refreshing=");
            return au.com.woolworths.android.onesite.a.q(sb, this.c, ", hasTransientError=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxUiState$Error;", "Lau/com/woolworths/feature/shop/inbox/InboxUiState;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error implements InboxUiState {

        /* renamed from: a, reason: collision with root package name */
        public static final Error f7282a = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return -1982431828;
        }

        public final String toString() {
            return "Error";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxUiState$Loading;", "Lau/com/woolworths/feature/shop/inbox/InboxUiState;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Loading implements InboxUiState {

        /* renamed from: a, reason: collision with root package name */
        public static final Loading f7283a = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -630836256;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
