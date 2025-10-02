package com.woolworths.shop.deliveryunlimited.signup;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.BadgeType;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.DownloadableAssetFit;
import au.com.woolworths.shop.graphql.type.DownloadableAssetType;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.SpacerType;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.deliveryunlimited.signup.adapter.DeliveryUnlimitedSubscribeQuery_ResponseAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0018\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Data;", "Data", "DeliveryUnlimitedSubscribe", "Summary", "BannerAsset", "Badge", "Feature", "Link", "Footer", "Button", "Disclaimer", "Link1", "TermsMarkdown", "Plans", "PlanType", "Feed", "OnInsetBanner", "Action", "OnDeliveryUnlimitedSubscribeFeature", "OnDeliveryUnlimitedSubscribePlan", "Badge1", "OnSpacer", "Footer1", "Button1", "Companion", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DeliveryUnlimitedSubscribeQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22616a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Action;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerActionPlacement f22617a;
        public final InsetBannerActionType b;
        public final String c;
        public final String d;

        public Action(InsetBannerActionPlacement insetBannerActionPlacement, InsetBannerActionType insetBannerActionType, String str, String str2) {
            this.f22617a = insetBannerActionPlacement;
            this.b = insetBannerActionType;
            this.c = str;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return this.f22617a == action.f22617a && this.b == action.b && Intrinsics.c(this.c, action.c) && Intrinsics.c(this.d, action.d);
        }

        public final int hashCode() {
            int iC = b.c(d.c(this.b, this.f22617a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.l(d.t("Action(placement=", this.f22617a, ", type=", this.b, ", label="), this.c, ", url=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Badge;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Badge {

        /* renamed from: a, reason: collision with root package name */
        public final String f22618a;
        public final BadgeType b;

        public Badge(String str, BadgeType badgeType) {
            this.f22618a = str;
            this.b = badgeType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) obj;
            return Intrinsics.c(this.f22618a, badge.f22618a) && this.b == badge.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22618a.hashCode() * 31);
        }

        public final String toString() {
            return "Badge(label=" + this.f22618a + ", type=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Badge1;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Badge1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22619a;
        public final BadgeType b;

        public Badge1(String str, BadgeType badgeType) {
            this.f22619a = str;
            this.b = badgeType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Badge1)) {
                return false;
            }
            Badge1 badge1 = (Badge1) obj;
            return Intrinsics.c(this.f22619a, badge1.f22619a) && this.b == badge1.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22619a.hashCode() * 31);
        }

        public final String toString() {
            return "Badge1(label=" + this.f22619a + ", type=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$BannerAsset;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BannerAsset {

        /* renamed from: a, reason: collision with root package name */
        public final DownloadableAssetType f22620a;
        public final String b;
        public final int c;
        public final int d;
        public final DownloadableAssetFit e;
        public final String f;

        public BannerAsset(DownloadableAssetType downloadableAssetType, String str, int i, int i2, DownloadableAssetFit downloadableAssetFit, String str2) {
            this.f22620a = downloadableAssetType;
            this.b = str;
            this.c = i;
            this.d = i2;
            this.e = downloadableAssetFit;
            this.f = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BannerAsset)) {
                return false;
            }
            BannerAsset bannerAsset = (BannerAsset) obj;
            return this.f22620a == bannerAsset.f22620a && Intrinsics.c(this.b, bannerAsset.b) && this.c == bannerAsset.c && this.d == bannerAsset.d && this.e == bannerAsset.e && Intrinsics.c(this.f, bannerAsset.f);
        }

        public final int hashCode() {
            int iA = b.a(this.d, b.a(this.c, b.c(this.f22620a.hashCode() * 31, 31, this.b), 31), 31);
            DownloadableAssetFit downloadableAssetFit = this.e;
            int iHashCode = (iA + (downloadableAssetFit == null ? 0 : downloadableAssetFit.hashCode())) * 31;
            String str = this.f;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BannerAsset(assetType=");
            sb.append(this.f22620a);
            sb.append(", assetUrl=");
            sb.append(this.b);
            sb.append(", assetWidth=");
            YU.a.w(this.c, this.d, ", assetHeight=", ", fit=", sb);
            sb.append(this.e);
            sb.append(", altText=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Button;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        public final String f22621a;
        public final ButtonStyle b;
        public final boolean c;

        public Button(String str, ButtonStyle buttonStyle, boolean z) {
            this.f22621a = str;
            this.b = buttonStyle;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.c(this.f22621a, button.f22621a) && this.b == button.b && this.c == button.c;
        }

        public final int hashCode() {
            int iHashCode = this.f22621a.hashCode() * 31;
            ButtonStyle buttonStyle = this.b;
            return Boolean.hashCode(this.c) + ((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31);
        }

        public final String toString() {
            return YU.a.k(")", au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("Button(label=", this.f22621a, ", style=", this.b, ", enabled="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Button1;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22622a;
        public final ButtonStyle b;
        public final boolean c;

        public Button1(String str, ButtonStyle buttonStyle, boolean z) {
            this.f22622a = str;
            this.b = buttonStyle;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button1)) {
                return false;
            }
            Button1 button1 = (Button1) obj;
            return Intrinsics.c(this.f22622a, button1.f22622a) && this.b == button1.b && this.c == button1.c;
        }

        public final int hashCode() {
            int iHashCode = this.f22622a.hashCode() * 31;
            ButtonStyle buttonStyle = this.b;
            return Boolean.hashCode(this.c) + ((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31);
        }

        public final String toString() {
            return YU.a.k(")", au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("Button1(label=", this.f22622a, ", style=", this.b, ", enabled="), this.c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final DeliveryUnlimitedSubscribe f22623a;

        public Data(DeliveryUnlimitedSubscribe deliveryUnlimitedSubscribe) {
            this.f22623a = deliveryUnlimitedSubscribe;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f22623a, ((Data) obj).f22623a);
        }

        public final int hashCode() {
            DeliveryUnlimitedSubscribe deliveryUnlimitedSubscribe = this.f22623a;
            if (deliveryUnlimitedSubscribe == null) {
                return 0;
            }
            return deliveryUnlimitedSubscribe.hashCode();
        }

        public final String toString() {
            return "Data(deliveryUnlimitedSubscribe=" + this.f22623a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$DeliveryUnlimitedSubscribe;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeliveryUnlimitedSubscribe {

        /* renamed from: a, reason: collision with root package name */
        public final Summary f22624a;
        public final Plans b;
        public final Boolean c;

        public DeliveryUnlimitedSubscribe(Summary summary, Plans plans, Boolean bool) {
            this.f22624a = summary;
            this.b = plans;
            this.c = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeliveryUnlimitedSubscribe)) {
                return false;
            }
            DeliveryUnlimitedSubscribe deliveryUnlimitedSubscribe = (DeliveryUnlimitedSubscribe) obj;
            return Intrinsics.c(this.f22624a, deliveryUnlimitedSubscribe.f22624a) && Intrinsics.c(this.b, deliveryUnlimitedSubscribe.b) && Intrinsics.c(this.c, deliveryUnlimitedSubscribe.c);
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.f22624a.hashCode() * 31)) * 31;
            Boolean bool = this.c;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DeliveryUnlimitedSubscribe(summary=");
            sb.append(this.f22624a);
            sb.append(", plans=");
            sb.append(this.b);
            sb.append(", isUserWPayMigrated=");
            return au.com.woolworths.android.onesite.a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Disclaimer;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Disclaimer {

        /* renamed from: a, reason: collision with root package name */
        public final String f22625a;
        public final String b;
        public final ArrayList c;

        public Disclaimer(String str, String str2, ArrayList arrayList) {
            this.f22625a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Disclaimer)) {
                return false;
            }
            Disclaimer disclaimer = (Disclaimer) obj;
            return this.f22625a.equals(disclaimer.f22625a) && this.b.equals(disclaimer.b) && this.c.equals(disclaimer.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f22625a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", YU.a.v("Disclaimer(title=", this.f22625a, ", content=", this.b, ", links="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Feature;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Feature {

        /* renamed from: a, reason: collision with root package name */
        public final String f22626a;
        public final String b;
        public final String c;
        public final Link d;

        public Feature(String str, String str2, String str3, Link link) {
            this.f22626a = str;
            this.b = str2;
            this.c = str3;
            this.d = link;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Feature)) {
                return false;
            }
            Feature feature = (Feature) obj;
            return Intrinsics.c(this.f22626a, feature.f22626a) && Intrinsics.c(this.b, feature.b) && Intrinsics.c(this.c, feature.c) && Intrinsics.c(this.d, feature.d);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f22626a.hashCode() * 31, 31, this.b), 31, this.c);
            Link link = this.d;
            return iC + (link == null ? 0 : link.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Feature(title=", this.f22626a, ", iconUrl=", this.b, ", description=");
            sbV.append(this.c);
            sbV.append(", link=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Feed;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Feed {

        /* renamed from: a, reason: collision with root package name */
        public final String f22627a;
        public final OnInsetBanner b;
        public final OnDeliveryUnlimitedSubscribeFeature c;
        public final OnDeliveryUnlimitedSubscribePlan d;
        public final OnSpacer e;

        public Feed(String __typename, OnInsetBanner onInsetBanner, OnDeliveryUnlimitedSubscribeFeature onDeliveryUnlimitedSubscribeFeature, OnDeliveryUnlimitedSubscribePlan onDeliveryUnlimitedSubscribePlan, OnSpacer onSpacer) {
            Intrinsics.h(__typename, "__typename");
            this.f22627a = __typename;
            this.b = onInsetBanner;
            this.c = onDeliveryUnlimitedSubscribeFeature;
            this.d = onDeliveryUnlimitedSubscribePlan;
            this.e = onSpacer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Feed)) {
                return false;
            }
            Feed feed = (Feed) obj;
            return Intrinsics.c(this.f22627a, feed.f22627a) && Intrinsics.c(this.b, feed.b) && Intrinsics.c(this.c, feed.c) && Intrinsics.c(this.d, feed.d) && Intrinsics.c(this.e, feed.e);
        }

        public final int hashCode() {
            int iHashCode = this.f22627a.hashCode() * 31;
            OnInsetBanner onInsetBanner = this.b;
            int iHashCode2 = (iHashCode + (onInsetBanner == null ? 0 : onInsetBanner.hashCode())) * 31;
            OnDeliveryUnlimitedSubscribeFeature onDeliveryUnlimitedSubscribeFeature = this.c;
            int iHashCode3 = (iHashCode2 + (onDeliveryUnlimitedSubscribeFeature == null ? 0 : onDeliveryUnlimitedSubscribeFeature.hashCode())) * 31;
            OnDeliveryUnlimitedSubscribePlan onDeliveryUnlimitedSubscribePlan = this.d;
            int iHashCode4 = (iHashCode3 + (onDeliveryUnlimitedSubscribePlan == null ? 0 : onDeliveryUnlimitedSubscribePlan.hashCode())) * 31;
            OnSpacer onSpacer = this.e;
            return iHashCode4 + (onSpacer != null ? onSpacer.f22635a.hashCode() : 0);
        }

        public final String toString() {
            return "Feed(__typename=" + this.f22627a + ", onInsetBanner=" + this.b + ", onDeliveryUnlimitedSubscribeFeature=" + this.c + ", onDeliveryUnlimitedSubscribePlan=" + this.d + ", onSpacer=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Footer;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer {

        /* renamed from: a, reason: collision with root package name */
        public final Button f22628a;
        public final String b;

        public Footer(Button button, String str) {
            this.f22628a = button;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) obj;
            return Intrinsics.c(this.f22628a, footer.f22628a) && Intrinsics.c(this.b, footer.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22628a.hashCode() * 31);
        }

        public final String toString() {
            return "Footer(button=" + this.f22628a + ", disclaimer=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Footer1;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer1 {

        /* renamed from: a, reason: collision with root package name */
        public final Button1 f22629a;
        public final String b;

        public Footer1(Button1 button1, String str) {
            this.f22629a = button1;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Footer1)) {
                return false;
            }
            Footer1 footer1 = (Footer1) obj;
            return Intrinsics.c(this.f22629a, footer1.f22629a) && Intrinsics.c(this.b, footer1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22629a.hashCode() * 31);
        }

        public final String toString() {
            return "Footer1(button=" + this.f22629a + ", disclaimer=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Link;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Link {

        /* renamed from: a, reason: collision with root package name */
        public final String f22630a;
        public final String b;

        public Link(String str, String str2) {
            this.f22630a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Link)) {
                return false;
            }
            Link link = (Link) obj;
            return Intrinsics.c(this.f22630a, link.f22630a) && Intrinsics.c(this.b, link.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22630a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("Link(text=", this.f22630a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Link1;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Link1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22631a;
        public final String b;

        public Link1(String str, String str2) {
            this.f22631a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Link1)) {
                return false;
            }
            Link1 link1 = (Link1) obj;
            return Intrinsics.c(this.f22631a, link1.f22631a) && Intrinsics.c(this.b, link1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22631a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("Link1(text=", this.f22631a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$OnDeliveryUnlimitedSubscribeFeature;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnDeliveryUnlimitedSubscribeFeature {

        /* renamed from: a, reason: collision with root package name */
        public final String f22632a;
        public final String b;

        public OnDeliveryUnlimitedSubscribeFeature(String str, String str2) {
            this.f22632a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnDeliveryUnlimitedSubscribeFeature)) {
                return false;
            }
            OnDeliveryUnlimitedSubscribeFeature onDeliveryUnlimitedSubscribeFeature = (OnDeliveryUnlimitedSubscribeFeature) obj;
            return Intrinsics.c(this.f22632a, onDeliveryUnlimitedSubscribeFeature.f22632a) && Intrinsics.c(this.b, onDeliveryUnlimitedSubscribeFeature.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22632a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("OnDeliveryUnlimitedSubscribeFeature(iconUrl=", this.f22632a, ", description=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$OnDeliveryUnlimitedSubscribePlan;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnDeliveryUnlimitedSubscribePlan {

        /* renamed from: a, reason: collision with root package name */
        public final String f22633a;
        public final String b;
        public final String c;
        public final int d;
        public final Badge1 e;

        public OnDeliveryUnlimitedSubscribePlan(String str, String str2, String str3, int i, Badge1 badge1) {
            this.f22633a = str;
            this.b = str2;
            this.c = str3;
            this.d = i;
            this.e = badge1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnDeliveryUnlimitedSubscribePlan)) {
                return false;
            }
            OnDeliveryUnlimitedSubscribePlan onDeliveryUnlimitedSubscribePlan = (OnDeliveryUnlimitedSubscribePlan) obj;
            return Intrinsics.c(this.f22633a, onDeliveryUnlimitedSubscribePlan.f22633a) && Intrinsics.c(this.b, onDeliveryUnlimitedSubscribePlan.b) && Intrinsics.c(this.c, onDeliveryUnlimitedSubscribePlan.c) && this.d == onDeliveryUnlimitedSubscribePlan.d && Intrinsics.c(this.e, onDeliveryUnlimitedSubscribePlan.e);
        }

        public final int hashCode() {
            int iA = b.a(this.d, b.c(b.c(this.f22633a.hashCode() * 31, 31, this.b), 31, this.c), 31);
            Badge1 badge1 = this.e;
            return iA + (badge1 == null ? 0 : badge1.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnDeliveryUnlimitedSubscribePlan(identifier=", this.f22633a, ", planTitle=", this.b, ", subtitle=");
            YU.a.x(this.d, this.c, ", price=", ", badge=", sbV);
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$OnInsetBanner;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnInsetBanner {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f22634a;
        public final String b;
        public final String c;
        public final Action d;

        public OnInsetBanner(InsetBannerDisplayType insetBannerDisplayType, String str, String str2, Action action) {
            this.f22634a = insetBannerDisplayType;
            this.b = str;
            this.c = str2;
            this.d = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnInsetBanner)) {
                return false;
            }
            OnInsetBanner onInsetBanner = (OnInsetBanner) obj;
            return this.f22634a == onInsetBanner.f22634a && Intrinsics.c(this.b, onInsetBanner.b) && Intrinsics.c(this.c, onInsetBanner.c) && Intrinsics.c(this.d, onInsetBanner.d);
        }

        public final int hashCode() {
            int iC = b.c(this.f22634a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Action action = this.d;
            return iHashCode + (action != null ? action.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbU = d.u("OnInsetBanner(displayType=", this.f22634a, ", message=", this.b, ", bannerTitle=");
            sbU.append(this.c);
            sbU.append(", action=");
            sbU.append(this.d);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$OnSpacer;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnSpacer {

        /* renamed from: a, reason: collision with root package name */
        public final SpacerType f22635a;

        public OnSpacer(SpacerType spacerType) {
            this.f22635a = spacerType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSpacer) && this.f22635a == ((OnSpacer) obj).f22635a;
        }

        public final int hashCode() {
            return this.f22635a.hashCode();
        }

        public final String toString() {
            return "OnSpacer(size=" + this.f22635a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$PlanType;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PlanType {

        /* renamed from: a, reason: collision with root package name */
        public final String f22636a;
        public final String b;
        public final ArrayList c;

        public PlanType(String str, String str2, ArrayList arrayList) {
            this.f22636a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlanType)) {
                return false;
            }
            PlanType planType = (PlanType) obj;
            return this.f22636a.equals(planType.f22636a) && Intrinsics.c(this.b, planType.b) && this.c.equals(planType.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22636a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", YU.a.v("PlanType(title=", this.f22636a, ", defaultPlanSelection=", this.b, ", feed="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Plans;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Plans {

        /* renamed from: a, reason: collision with root package name */
        public final String f22637a;
        public final ArrayList b;
        public final Footer1 c;

        public Plans(String str, ArrayList arrayList, Footer1 footer1) {
            this.f22637a = str;
            this.b = arrayList;
            this.c = footer1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Plans)) {
                return false;
            }
            Plans plans = (Plans) obj;
            return this.f22637a.equals(plans.f22637a) && this.b.equals(plans.b) && this.c.equals(plans.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + androidx.compose.ui.input.pointer.a.b(this.f22637a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbX = d.x("Plans(title=", this.f22637a, ", planTypes=", ", footer=", this.b);
            sbX.append(this.c);
            sbX.append(")");
            return sbX.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Summary;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Summary {

        /* renamed from: a, reason: collision with root package name */
        public final String f22638a;
        public final BannerAsset b;
        public final Badge c;
        public final ArrayList d;
        public final Footer e;
        public final Disclaimer f;
        public final TermsMarkdown g;

        public Summary(String str, BannerAsset bannerAsset, Badge badge, ArrayList arrayList, Footer footer, Disclaimer disclaimer, TermsMarkdown termsMarkdown) {
            this.f22638a = str;
            this.b = bannerAsset;
            this.c = badge;
            this.d = arrayList;
            this.e = footer;
            this.f = disclaimer;
            this.g = termsMarkdown;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Summary)) {
                return false;
            }
            Summary summary = (Summary) obj;
            return this.f22638a.equals(summary.f22638a) && Intrinsics.c(this.b, summary.b) && Intrinsics.c(this.c, summary.c) && this.d.equals(summary.d) && this.e.equals(summary.e) && Intrinsics.c(this.f, summary.f) && this.g.equals(summary.g);
        }

        public final int hashCode() {
            int iHashCode = this.f22638a.hashCode() * 31;
            BannerAsset bannerAsset = this.b;
            int iHashCode2 = (iHashCode + (bannerAsset == null ? 0 : bannerAsset.hashCode())) * 31;
            Badge badge = this.c;
            int iHashCode3 = (this.e.hashCode() + androidx.compose.ui.input.pointer.a.b((iHashCode2 + (badge == null ? 0 : badge.hashCode())) * 31, 31, this.d)) * 31;
            Disclaimer disclaimer = this.f;
            return this.g.hashCode() + ((iHashCode3 + (disclaimer != null ? disclaimer.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Summary(title=" + this.f22638a + ", bannerAsset=" + this.b + ", badge=" + this.c + ", features=" + this.d + ", footer=" + this.e + ", disclaimer=" + this.f + ", termsMarkdown=" + this.g + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$TermsMarkdown;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TermsMarkdown {

        /* renamed from: a, reason: collision with root package name */
        public final String f22639a;
        public final String b;

        public TermsMarkdown(String str, String str2) {
            this.f22639a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TermsMarkdown)) {
                return false;
            }
            TermsMarkdown termsMarkdown = (TermsMarkdown) obj;
            return Intrinsics.c(this.f22639a, termsMarkdown.f22639a) && Intrinsics.c(this.b, termsMarkdown.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22639a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("TermsMarkdown(title=", this.f22639a, ", content=", this.b, ")");
        }
    }

    public DeliveryUnlimitedSubscribeQuery(boolean z) {
        this.f22616a = z;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(DeliveryUnlimitedSubscribeQuery_ResponseAdapter.Data.f22653a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query DeliveryUnlimitedSubscribe($isWPayEnabled: Boolean!) { deliveryUnlimitedSubscribe { summary { title bannerAsset { assetType assetUrl assetWidth assetHeight fit altText } badge { label type } features { title iconUrl description link { text url } } footer { button { label style enabled } disclaimer } disclaimer { title content links { text url } } termsMarkdown { title content } } plans { title planTypes { title defaultPlanSelection feed { __typename ... on InsetBanner { displayType message bannerTitle: title action { placement type label url } } ... on DeliveryUnlimitedSubscribeFeature { iconUrl description } ... on DeliveryUnlimitedSubscribePlan { identifier planTitle subtitle price badge { label type } } ... on Spacer { size } } } footer { button { label style enabled } disclaimer } } isUserWPayMigrated @include(if: $isWPayEnabled) } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeliveryUnlimitedSubscribeQuery) && this.f22616a == ((DeliveryUnlimitedSubscribeQuery) obj).f22616a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22616a);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "95d3d2ca9ea189be442631f7d658d300923d9c86e4035c8a95cfeafb5067f54a";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "DeliveryUnlimitedSubscribe";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("isWPayEnabled");
        Adapters.f.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.f22616a));
    }

    public final String toString() {
        return androidx.compose.ui.input.pointer.a.n("DeliveryUnlimitedSubscribeQuery(isWPayEnabled=", ")", this.f22616a);
    }
}
