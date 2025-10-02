package au.com.woolworths.feature.shop.inbox;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxUiEffect;", "", "OpenTermsAndConditions", "OpenAskOlive", "Lau/com/woolworths/feature/shop/inbox/InboxUiEffect$OpenAskOlive;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEffect$OpenTermsAndConditions;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface InboxUiEffect {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxUiEffect$OpenAskOlive;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEffect;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenAskOlive implements InboxUiEffect {

        /* renamed from: a, reason: collision with root package name */
        public static final OpenAskOlive f7264a = new OpenAskOlive();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenAskOlive);
        }

        public final int hashCode() {
            return 626966282;
        }

        public final String toString() {
            return "OpenAskOlive";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxUiEffect$OpenTermsAndConditions;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEffect;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenTermsAndConditions implements InboxUiEffect {

        /* renamed from: a, reason: collision with root package name */
        public final String f7265a;
        public final String b;

        public OpenTermsAndConditions(String content, String campaignCode) {
            Intrinsics.h(content, "content");
            Intrinsics.h(campaignCode, "campaignCode");
            this.f7265a = content;
            this.b = campaignCode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenTermsAndConditions)) {
                return false;
            }
            OpenTermsAndConditions openTermsAndConditions = (OpenTermsAndConditions) obj;
            return Intrinsics.c(this.f7265a, openTermsAndConditions.f7265a) && Intrinsics.c(this.b, openTermsAndConditions.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7265a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("OpenTermsAndConditions(content=", this.f7265a, ", campaignCode=", this.b, ")");
        }
    }
}
