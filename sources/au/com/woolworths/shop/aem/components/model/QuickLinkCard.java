package au.com.woolworths.shop.aem.components.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.graphql.MappedName;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/QuickLinkCard;", "Lau/com/woolworths/shop/aem/components/model/horizontalList/HorizontalListItem;", "", "title", "Lau/com/woolworths/sdui/model/action/ActionData;", UrlHandler.ACTION, NotificationMessage.NOTIF_KEY_SUB_TITLE, "image", "", "isQuickLinkView", "Lau/com/woolworths/shop/aem/components/model/OverlayAnimation;", "linkCardAnimation", "<init>", "(Ljava/lang/String;Lau/com/woolworths/sdui/model/action/ActionData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lau/com/woolworths/shop/aem/components/model/OverlayAnimation;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lau/com/woolworths/sdui/model/action/ActionData;", "a", "()Lau/com/woolworths/sdui/model/action/ActionData;", "getSubtitle", "b", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "Lau/com/woolworths/shop/aem/components/model/OverlayAnimation;", "c", "()Lau/com/woolworths/shop/aem/components/model/OverlayAnimation;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QuickLinkCard implements HorizontalListItem {

    @SerializedName("linkCardAction")
    @MappedName
    @NotNull
    private final ActionData action;

    @SerializedName("linkCardImage")
    @MappedName
    @Nullable
    private final String image;

    @SerializedName("isQuickLinkView")
    @MappedName
    @Nullable
    private final Boolean isQuickLinkView;

    @SerializedName("linkCardAnimation")
    @MappedName
    @Nullable
    private final OverlayAnimation linkCardAnimation;

    @SerializedName("linkCardSubtitle")
    @MappedName
    @Nullable
    private final String subtitle;

    @SerializedName("linkCardTitle")
    @MappedName
    @NotNull
    private final String title;

    public QuickLinkCard(@NotNull String title, @NotNull ActionData action, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable OverlayAnimation overlayAnimation) {
        Intrinsics.h(title, "title");
        Intrinsics.h(action, "action");
        this.title = title;
        this.action = action;
        this.subtitle = str;
        this.image = str2;
        this.isQuickLinkView = bool;
        this.linkCardAnimation = overlayAnimation;
    }

    /* renamed from: a, reason: from getter */
    public final ActionData getAction() {
        return this.action;
    }

    /* renamed from: b, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: c, reason: from getter */
    public final OverlayAnimation getLinkCardAnimation() {
        return this.linkCardAnimation;
    }

    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: e, reason: from getter */
    public final Boolean getIsQuickLinkView() {
        return this.isQuickLinkView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickLinkCard)) {
            return false;
        }
        QuickLinkCard quickLinkCard = (QuickLinkCard) obj;
        return Intrinsics.c(this.title, quickLinkCard.title) && Intrinsics.c(this.action, quickLinkCard.action) && Intrinsics.c(this.subtitle, quickLinkCard.subtitle) && Intrinsics.c(this.image, quickLinkCard.image) && Intrinsics.c(this.isQuickLinkView, quickLinkCard.isQuickLinkView) && Intrinsics.c(this.linkCardAnimation, quickLinkCard.linkCardAnimation);
    }

    @Override // au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem
    public final AnalyticsData getImpressionAnalyticsData() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = (this.action.hashCode() + (this.title.hashCode() * 31)) * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.image;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isQuickLinkView;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        OverlayAnimation overlayAnimation = this.linkCardAnimation;
        return iHashCode4 + (overlayAnimation != null ? overlayAnimation.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        ActionData actionData = this.action;
        String str2 = this.subtitle;
        String str3 = this.image;
        Boolean bool = this.isQuickLinkView;
        OverlayAnimation overlayAnimation = this.linkCardAnimation;
        StringBuilder sb = new StringBuilder("QuickLinkCard(title=");
        sb.append(str);
        sb.append(", action=");
        sb.append(actionData);
        sb.append(", subtitle=");
        a.B(sb, str2, ", image=", str3, ", isQuickLinkView=");
        sb.append(bool);
        sb.append(", linkCardAnimation=");
        sb.append(overlayAnimation);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ QuickLinkCard(String str, ActionData actionData, String str2, String str3, Boolean bool, OverlayAnimation overlayAnimation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, actionData, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : overlayAnimation);
    }
}
