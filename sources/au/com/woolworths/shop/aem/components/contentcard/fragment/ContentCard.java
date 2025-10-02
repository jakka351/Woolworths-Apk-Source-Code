package au.com.woolworths.shop.aem.components.contentcard.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.FooterStyle;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/aem/components/contentcard/fragment/ContentCard;", "Lcom/apollographql/apollo/api/Fragment$Data;", "ContentCardAction", "ContentCardBrandImage", "ContentCardFooter", "Logo", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ContentCard implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f10129a;
    public final String b;
    public final String c;
    public final String d;
    public final ContentCardAction e;
    public final ContentCardBrandImage f;
    public final ContentCardFooter g;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/contentcard/fragment/ContentCard$ContentCardAction;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContentCardAction {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f10130a;
        public final String b;

        public ContentCardAction(ActionType actionType, String str) {
            this.f10130a = actionType;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentCardAction)) {
                return false;
            }
            ContentCardAction contentCardAction = (ContentCardAction) obj;
            return this.f10130a == contentCardAction.f10130a && Intrinsics.c(this.b, contentCardAction.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10130a.hashCode() * 31);
        }

        public final String toString() {
            return "ContentCardAction(type=" + this.f10130a + ", action=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/contentcard/fragment/ContentCard$ContentCardBrandImage;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContentCardBrandImage {

        /* renamed from: a, reason: collision with root package name */
        public final String f10131a;
        public final String b;

        public ContentCardBrandImage(String str, String str2) {
            this.f10131a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentCardBrandImage)) {
                return false;
            }
            ContentCardBrandImage contentCardBrandImage = (ContentCardBrandImage) obj;
            return Intrinsics.c(this.f10131a, contentCardBrandImage.f10131a) && Intrinsics.c(this.b, contentCardBrandImage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10131a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("ContentCardBrandImage(imageUrl=", this.f10131a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/contentcard/fragment/ContentCard$ContentCardFooter;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContentCardFooter {

        /* renamed from: a, reason: collision with root package name */
        public final FooterStyle f10132a;
        public final String b;
        public final Logo c;

        public ContentCardFooter(FooterStyle footerStyle, String str, Logo logo) {
            this.f10132a = footerStyle;
            this.b = str;
            this.c = logo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentCardFooter)) {
                return false;
            }
            ContentCardFooter contentCardFooter = (ContentCardFooter) obj;
            return this.f10132a == contentCardFooter.f10132a && Intrinsics.c(this.b, contentCardFooter.b) && Intrinsics.c(this.c, contentCardFooter.c);
        }

        public final int hashCode() {
            int iHashCode = this.f10132a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Logo logo = this.c;
            return iHashCode2 + (logo != null ? logo.hashCode() : 0);
        }

        public final String toString() {
            return "ContentCardFooter(style=" + this.f10132a + ", text=" + this.b + ", logo=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/contentcard/fragment/ContentCard$Logo;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Logo {

        /* renamed from: a, reason: collision with root package name */
        public final String f10133a;
        public final String b;

        public Logo(String str, String str2) {
            this.f10133a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Logo)) {
                return false;
            }
            Logo logo = (Logo) obj;
            return Intrinsics.c(this.f10133a, logo.f10133a) && Intrinsics.c(this.b, logo.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10133a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Logo(imageUrl=", this.f10133a, ", altText=", this.b, ")");
        }
    }

    public ContentCard(String str, String str2, String str3, String str4, ContentCardAction contentCardAction, ContentCardBrandImage contentCardBrandImage, ContentCardFooter contentCardFooter) {
        this.f10129a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = contentCardAction;
        this.f = contentCardBrandImage;
        this.g = contentCardFooter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentCard)) {
            return false;
        }
        ContentCard contentCard = (ContentCard) obj;
        return Intrinsics.c(this.f10129a, contentCard.f10129a) && Intrinsics.c(this.b, contentCard.b) && Intrinsics.c(this.c, contentCard.c) && Intrinsics.c(this.d, contentCard.d) && Intrinsics.c(this.e, contentCard.e) && Intrinsics.c(this.f, contentCard.f) && Intrinsics.c(this.g, contentCard.g);
    }

    public final int hashCode() {
        String str = this.f10129a;
        int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        ContentCardAction contentCardAction = this.e;
        int iHashCode3 = (iHashCode2 + (contentCardAction == null ? 0 : contentCardAction.hashCode())) * 31;
        ContentCardBrandImage contentCardBrandImage = this.f;
        int iHashCode4 = (iHashCode3 + (contentCardBrandImage == null ? 0 : contentCardBrandImage.hashCode())) * 31;
        ContentCardFooter contentCardFooter = this.g;
        return iHashCode4 + (contentCardFooter != null ? contentCardFooter.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ContentCard(contentCardId=", this.f10129a, ", contentCardImageUrl=", this.b, ", contentCardTitle=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", contentCardDescription=", this.d, ", contentCardAction=");
        sbV.append(this.e);
        sbV.append(", contentCardBrandImage=");
        sbV.append(this.f);
        sbV.append(", contentCardFooter=");
        sbV.append(this.g);
        sbV.append(")");
        return sbV.toString();
    }
}
