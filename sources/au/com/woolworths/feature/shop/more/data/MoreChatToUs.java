package au.com.woolworths.feature.shop.more.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.common.RoundedBackgroundSpan;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.base.shopapp.customviews.BrandedInlineLabel;
import au.com.woolworths.base.shopapp.customviews.InlineLabel;
import au.com.woolworths.base.shopapp.customviews.InlineLabelType;
import au.com.woolworths.feature.shop.more.MoreFeedQuery;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lau/com/woolworths/feature/shop/more/data/MoreChatToUs;", "Lau/com/woolworths/base/shopapp/customviews/InlineLabel;", "", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "url", "Lau/com/woolworths/feature/shop/more/MoreFeedQuery$UnreadChatbotMsg;", "unreadChatbotMsg", "Lau/com/woolworths/android/onesite/models/text/Text;", "spannedText", "plainText", "Lau/com/woolworths/base/shopapp/customviews/InlineLabelType;", "type", "Lau/com/woolworths/android/onesite/common/RoundedBackgroundSpan$SpanPlacement;", "spanPlacement", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/feature/shop/more/MoreFeedQuery$UnreadChatbotMsg;Lau/com/woolworths/android/onesite/models/text/Text;Lau/com/woolworths/android/onesite/models/text/Text;Lau/com/woolworths/base/shopapp/customviews/InlineLabelType;Lau/com/woolworths/android/onesite/common/RoundedBackgroundSpan$SpanPlacement;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "getSubtitle", "d", "Lau/com/woolworths/feature/shop/more/MoreFeedQuery$UnreadChatbotMsg;", "c", "()Lau/com/woolworths/feature/shop/more/MoreFeedQuery$UnreadChatbotMsg;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class MoreChatToUs implements InlineLabel {
    public final Text d;
    public final Text e;
    public final InlineLabelType f;
    public final RoundedBackgroundSpan.SpanPlacement g;

    @SerializedName(NotificationMessage.NOTIF_KEY_SUB_TITLE)
    @Nullable
    private final String subtitle;

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName("unreadChatbotMsg")
    @Nullable
    private final MoreFeedQuery.UnreadChatbotMsg unreadChatbotMsg;

    @SerializedName("url")
    @Nullable
    private final String url;

    public MoreChatToUs(@NotNull String title, @Nullable String str, @Nullable String str2, @Nullable MoreFeedQuery.UnreadChatbotMsg unreadChatbotMsg, @Nullable Text text, @Nullable Text text2, @NotNull InlineLabelType type, @NotNull RoundedBackgroundSpan.SpanPlacement spanPlacement) {
        Intrinsics.h(title, "title");
        Intrinsics.h(type, "type");
        Intrinsics.h(spanPlacement, "spanPlacement");
        this.title = title;
        this.subtitle = str;
        this.url = str2;
        this.unreadChatbotMsg = unreadChatbotMsg;
        this.d = text;
        this.e = text2;
        this.f = type;
        this.g = spanPlacement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [au.com.woolworths.android.onesite.models.text.Text] */
    public static MoreChatToUs a(MoreChatToUs moreChatToUs, ResText resText, Text text, int i) {
        String title = moreChatToUs.title;
        String str = moreChatToUs.subtitle;
        String str2 = moreChatToUs.url;
        MoreFeedQuery.UnreadChatbotMsg unreadChatbotMsg = moreChatToUs.unreadChatbotMsg;
        ResText resText2 = resText;
        if ((i & 16) != 0) {
            resText2 = moreChatToUs.d;
        }
        InlineLabelType type = moreChatToUs.f;
        RoundedBackgroundSpan.SpanPlacement spanPlacement = moreChatToUs.g;
        Intrinsics.h(title, "title");
        Intrinsics.h(type, "type");
        Intrinsics.h(spanPlacement, "spanPlacement");
        return new MoreChatToUs(title, str, str2, unreadChatbotMsg, resText2, text, type, spanPlacement);
    }

    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: c, reason: from getter */
    public final MoreFeedQuery.UnreadChatbotMsg getUnreadChatbotMsg() {
        return this.unreadChatbotMsg;
    }

    /* renamed from: d, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoreChatToUs)) {
            return false;
        }
        MoreChatToUs moreChatToUs = (MoreChatToUs) obj;
        return Intrinsics.c(this.title, moreChatToUs.title) && Intrinsics.c(this.subtitle, moreChatToUs.subtitle) && Intrinsics.c(this.url, moreChatToUs.url) && Intrinsics.c(this.unreadChatbotMsg, moreChatToUs.unreadChatbotMsg) && Intrinsics.c(this.d, moreChatToUs.d) && Intrinsics.c(this.e, moreChatToUs.e) && Intrinsics.c(this.f, moreChatToUs.f) && this.g == moreChatToUs.g;
    }

    @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
    /* renamed from: getPlainText, reason: from getter */
    public final Text getE() {
        return this.e;
    }

    @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
    /* renamed from: getSpanPlacement, reason: from getter */
    public final RoundedBackgroundSpan.SpanPlacement getG() {
        return this.g;
    }

    @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
    /* renamed from: getSpannedText, reason: from getter */
    public final Text getD() {
        return this.d;
    }

    @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
    /* renamed from: getType, reason: from getter */
    public final InlineLabelType getF() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MoreFeedQuery.UnreadChatbotMsg unreadChatbotMsg = this.unreadChatbotMsg;
        int iHashCode4 = (iHashCode3 + (unreadChatbotMsg == null ? 0 : Integer.hashCode(unreadChatbotMsg.f7602a))) * 31;
        Text text = this.d;
        int iHashCode5 = (iHashCode4 + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((iHashCode5 + (text2 != null ? text2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.url;
        MoreFeedQuery.UnreadChatbotMsg unreadChatbotMsg = this.unreadChatbotMsg;
        StringBuilder sbV = a.v("MoreChatToUs(title=", str, ", subtitle=", str2, ", url=");
        sbV.append(str3);
        sbV.append(", unreadChatbotMsg=");
        sbV.append(unreadChatbotMsg);
        sbV.append(", spannedText=");
        sbV.append(this.d);
        sbV.append(", plainText=");
        sbV.append(this.e);
        sbV.append(", type=");
        sbV.append(this.f);
        sbV.append(", spanPlacement=");
        sbV.append(this.g);
        sbV.append(")");
        return sbV.toString();
    }

    public /* synthetic */ MoreChatToUs(String str, String str2, String str3, MoreFeedQuery.UnreadChatbotMsg unreadChatbotMsg, Text text, Text text2, InlineLabelType inlineLabelType, RoundedBackgroundSpan.SpanPlacement spanPlacement, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, unreadChatbotMsg, (i & 16) != 0 ? null : text, (i & 32) != 0 ? null : text2, (i & 64) != 0 ? BrandedInlineLabel.d : inlineLabelType, (i & 128) != 0 ? RoundedBackgroundSpan.SpanPlacement.e : spanPlacement);
    }
}
