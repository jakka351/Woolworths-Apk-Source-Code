package com.woolworths.shop.brandedshop;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.BrandedShopInput;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.DownloadableAssetFit;
import au.com.woolworths.shop.graphql.type.DownloadableAssetType;
import au.com.woolworths.shop.graphql.type.ParagraphTextItemType;
import au.com.woolworths.shop.graphql.type.TitleSectionTypes;
import au.com.woolworths.shop.graphql.type.adapter.BrandedShopInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.brandedshop.adapter.BrandedShopQuery_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b-\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:,\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-.¨\u0006/"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/brandedshop/BrandedShopQuery$Data;", "Data", "BrandedShop", "Header", "BottomSheet", "OnStaticBottomSheet", "StaticBottomSheetItem", "OnParagraphTextItem", "Analytics", "ImpressionAnalytics", "Item", "OnDownloadableAsset", "OnTitleSection", "OnTabSection", "TabSectionItem", "TabItemFeed", "OnProductSection", "ProductSectionLink", "LinkTextWithAlt", "LinkAction", "ProductSectionFeed", "OnProductCard", "OnLink", "LinkTextWithAlt1", "LinkAction1", "OnButton", "ButtonAction", "Analytics1", "OnHorizontalList", "Item1", "OnContentCard", "ContentCardAction", "OnNavRoundel", "NavRoundelAction", "OnFullWidthImageCard", "OnFullWidthContentCard", "ContentCardAction1", "OnParagraphTextItem1", "OnProductSection1", "ProductSectionLink1", "LinkTextWithAlt2", "LinkAction2", "ProductSectionFeed1", "OnProductCard1", "Companion", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BrandedShopQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final BrandedShopInput f21389a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final boolean f;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$Analytics;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f21390a;
        public final AnalyticsFields b;

        public Analytics(String str, AnalyticsFields analyticsFields) {
            this.f21390a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics)) {
                return false;
            }
            Analytics analytics = (Analytics) obj;
            return Intrinsics.c(this.f21390a, analytics.f21390a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21390a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics(__typename=", this.f21390a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$Analytics1;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f21391a;
        public final String b;

        public Analytics1(String str, String str2) {
            this.f21391a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics1)) {
                return false;
            }
            Analytics1 analytics1 = (Analytics1) obj;
            return Intrinsics.c(this.f21391a, analytics1.f21391a) && Intrinsics.c(this.b, analytics1.b);
        }

        public final int hashCode() {
            int iHashCode = this.f21391a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("Analytics1(__typename=", this.f21391a, ", label=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$BottomSheet;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BottomSheet {

        /* renamed from: a, reason: collision with root package name */
        public final String f21392a;
        public final OnStaticBottomSheet b;

        public BottomSheet(String __typename, OnStaticBottomSheet onStaticBottomSheet) {
            Intrinsics.h(__typename, "__typename");
            this.f21392a = __typename;
            this.b = onStaticBottomSheet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BottomSheet)) {
                return false;
            }
            BottomSheet bottomSheet = (BottomSheet) obj;
            return Intrinsics.c(this.f21392a, bottomSheet.f21392a) && Intrinsics.c(this.b, bottomSheet.b);
        }

        public final int hashCode() {
            int iHashCode = this.f21392a.hashCode() * 31;
            OnStaticBottomSheet onStaticBottomSheet = this.b;
            return iHashCode + (onStaticBottomSheet == null ? 0 : onStaticBottomSheet.hashCode());
        }

        public final String toString() {
            return "BottomSheet(__typename=" + this.f21392a + ", onStaticBottomSheet=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$BrandedShop;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BrandedShop {

        /* renamed from: a, reason: collision with root package name */
        public final Header f21393a;
        public final List b;
        public final Analytics c;
        public final ImpressionAnalytics d;
        public final ArrayList e;

        public BrandedShop(Header header, List list, Analytics analytics, ImpressionAnalytics impressionAnalytics, ArrayList arrayList) {
            this.f21393a = header;
            this.b = list;
            this.c = analytics;
            this.d = impressionAnalytics;
            this.e = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandedShop)) {
                return false;
            }
            BrandedShop brandedShop = (BrandedShop) obj;
            return Intrinsics.c(this.f21393a, brandedShop.f21393a) && Intrinsics.c(this.b, brandedShop.b) && Intrinsics.c(this.c, brandedShop.c) && Intrinsics.c(this.d, brandedShop.d) && this.e.equals(brandedShop.e);
        }

        public final int hashCode() {
            Header header = this.f21393a;
            int iHashCode = (header == null ? 0 : header.hashCode()) * 31;
            List list = this.b;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            Analytics analytics = this.c;
            int iHashCode3 = (iHashCode2 + (analytics == null ? 0 : analytics.hashCode())) * 31;
            ImpressionAnalytics impressionAnalytics = this.d;
            return this.e.hashCode() + ((iHashCode3 + (impressionAnalytics != null ? impressionAnalytics.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BrandedShop(header=");
            sb.append(this.f21393a);
            sb.append(", bottomSheets=");
            sb.append(this.b);
            sb.append(", analytics=");
            sb.append(this.c);
            sb.append(", impressionAnalytics=");
            sb.append(this.d);
            sb.append(", items=");
            return android.support.v4.media.session.a.q(")", sb, this.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$ButtonAction;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ButtonAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f21394a;
        public final ActionType b;
        public final String c;
        public final String d;

        public ButtonAction(String str, ActionType actionType, String str2, String str3) {
            this.f21394a = str;
            this.b = actionType;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonAction)) {
                return false;
            }
            ButtonAction buttonAction = (ButtonAction) obj;
            return Intrinsics.c(this.f21394a, buttonAction.f21394a) && this.b == buttonAction.b && Intrinsics.c(this.c, buttonAction.c) && Intrinsics.c(this.d, buttonAction.d);
        }

        public final int hashCode() {
            int iC = b.c(d.a(this.b, this.f21394a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(d.w("ButtonAction(__typename=", this.f21394a, ", type=", this.b, ", action="), this.c, ", id=", this.d, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$ContentCardAction;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContentCardAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f21395a;
        public final ActionType b;
        public final String c;
        public final String d;

        public ContentCardAction(String str, ActionType actionType, String str2, String str3) {
            this.f21395a = str;
            this.b = actionType;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentCardAction)) {
                return false;
            }
            ContentCardAction contentCardAction = (ContentCardAction) obj;
            return Intrinsics.c(this.f21395a, contentCardAction.f21395a) && this.b == contentCardAction.b && Intrinsics.c(this.c, contentCardAction.c) && Intrinsics.c(this.d, contentCardAction.d);
        }

        public final int hashCode() {
            int iC = b.c(d.a(this.b, this.f21395a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(d.w("ContentCardAction(__typename=", this.f21395a, ", type=", this.b, ", action="), this.c, ", id=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$ContentCardAction1;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContentCardAction1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f21396a;
        public final ActionType b;
        public final String c;
        public final String d;

        public ContentCardAction1(String str, ActionType actionType, String str2, String str3) {
            this.f21396a = str;
            this.b = actionType;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentCardAction1)) {
                return false;
            }
            ContentCardAction1 contentCardAction1 = (ContentCardAction1) obj;
            return Intrinsics.c(this.f21396a, contentCardAction1.f21396a) && this.b == contentCardAction1.b && Intrinsics.c(this.c, contentCardAction1.c) && Intrinsics.c(this.d, contentCardAction1.d);
        }

        public final int hashCode() {
            int iC = b.c(d.a(this.b, this.f21396a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(d.w("ContentCardAction1(__typename=", this.f21396a, ", type=", this.b, ", action="), this.c, ", id=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final BrandedShop f21397a;

        public Data(BrandedShop brandedShop) {
            this.f21397a = brandedShop;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21397a, ((Data) obj).f21397a);
        }

        public final int hashCode() {
            return this.f21397a.hashCode();
        }

        public final String toString() {
            return "Data(brandedShop=" + this.f21397a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$Header;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Header {

        /* renamed from: a, reason: collision with root package name */
        public final String f21398a;
        public final String b;

        public Header(String str, String str2) {
            this.f21398a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return Intrinsics.c(this.f21398a, header.f21398a) && Intrinsics.c(this.b, header.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21398a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Header(__typename=", this.f21398a, ", pageTitle=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$ImpressionAnalytics;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f21399a;
        public final AnalyticsFields b;

        public ImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f21399a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImpressionAnalytics)) {
                return false;
            }
            ImpressionAnalytics impressionAnalytics = (ImpressionAnalytics) obj;
            return Intrinsics.c(this.f21399a, impressionAnalytics.f21399a) && Intrinsics.c(this.b, impressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21399a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics(__typename=", this.f21399a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$Item;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f21400a;
        public final OnDownloadableAsset b;
        public final OnTitleSection c;
        public final OnTabSection d;
        public final OnLink e;
        public final OnButton f;
        public final OnHorizontalList g;
        public final OnFullWidthImageCard h;
        public final OnFullWidthContentCard i;
        public final OnParagraphTextItem1 j;
        public final OnProductSection1 k;

        public Item(String __typename, OnDownloadableAsset onDownloadableAsset, OnTitleSection onTitleSection, OnTabSection onTabSection, OnLink onLink, OnButton onButton, OnHorizontalList onHorizontalList, OnFullWidthImageCard onFullWidthImageCard, OnFullWidthContentCard onFullWidthContentCard, OnParagraphTextItem1 onParagraphTextItem1, OnProductSection1 onProductSection1) {
            Intrinsics.h(__typename, "__typename");
            this.f21400a = __typename;
            this.b = onDownloadableAsset;
            this.c = onTitleSection;
            this.d = onTabSection;
            this.e = onLink;
            this.f = onButton;
            this.g = onHorizontalList;
            this.h = onFullWidthImageCard;
            this.i = onFullWidthContentCard;
            this.j = onParagraphTextItem1;
            this.k = onProductSection1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f21400a, item.f21400a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d) && Intrinsics.c(this.e, item.e) && Intrinsics.c(this.f, item.f) && Intrinsics.c(this.g, item.g) && Intrinsics.c(this.h, item.h) && Intrinsics.c(this.i, item.i) && Intrinsics.c(this.j, item.j) && Intrinsics.c(this.k, item.k);
        }

        public final int hashCode() {
            int iHashCode = this.f21400a.hashCode() * 31;
            OnDownloadableAsset onDownloadableAsset = this.b;
            int iHashCode2 = (iHashCode + (onDownloadableAsset == null ? 0 : onDownloadableAsset.hashCode())) * 31;
            OnTitleSection onTitleSection = this.c;
            int iHashCode3 = (iHashCode2 + (onTitleSection == null ? 0 : onTitleSection.hashCode())) * 31;
            OnTabSection onTabSection = this.d;
            int iHashCode4 = (iHashCode3 + (onTabSection == null ? 0 : onTabSection.hashCode())) * 31;
            OnLink onLink = this.e;
            int iHashCode5 = (iHashCode4 + (onLink == null ? 0 : onLink.hashCode())) * 31;
            OnButton onButton = this.f;
            int iHashCode6 = (iHashCode5 + (onButton == null ? 0 : onButton.hashCode())) * 31;
            OnHorizontalList onHorizontalList = this.g;
            int iHashCode7 = (iHashCode6 + (onHorizontalList == null ? 0 : onHorizontalList.hashCode())) * 31;
            OnFullWidthImageCard onFullWidthImageCard = this.h;
            int iHashCode8 = (iHashCode7 + (onFullWidthImageCard == null ? 0 : onFullWidthImageCard.hashCode())) * 31;
            OnFullWidthContentCard onFullWidthContentCard = this.i;
            int iHashCode9 = (iHashCode8 + (onFullWidthContentCard == null ? 0 : onFullWidthContentCard.hashCode())) * 31;
            OnParagraphTextItem1 onParagraphTextItem1 = this.j;
            int iHashCode10 = (iHashCode9 + (onParagraphTextItem1 == null ? 0 : onParagraphTextItem1.hashCode())) * 31;
            OnProductSection1 onProductSection1 = this.k;
            return iHashCode10 + (onProductSection1 != null ? onProductSection1.hashCode() : 0);
        }

        public final String toString() {
            return "Item(__typename=" + this.f21400a + ", onDownloadableAsset=" + this.b + ", onTitleSection=" + this.c + ", onTabSection=" + this.d + ", onLink=" + this.e + ", onButton=" + this.f + ", onHorizontalList=" + this.g + ", onFullWidthImageCard=" + this.h + ", onFullWidthContentCard=" + this.i + ", onParagraphTextItem=" + this.j + ", onProductSection=" + this.k + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$Item1;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f21401a;
        public final OnContentCard b;
        public final OnNavRoundel c;

        public Item1(String __typename, OnContentCard onContentCard, OnNavRoundel onNavRoundel) {
            Intrinsics.h(__typename, "__typename");
            this.f21401a = __typename;
            this.b = onContentCard;
            this.c = onNavRoundel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item1)) {
                return false;
            }
            Item1 item1 = (Item1) obj;
            return Intrinsics.c(this.f21401a, item1.f21401a) && Intrinsics.c(this.b, item1.b) && Intrinsics.c(this.c, item1.c);
        }

        public final int hashCode() {
            int iHashCode = this.f21401a.hashCode() * 31;
            OnContentCard onContentCard = this.b;
            int iHashCode2 = (iHashCode + (onContentCard == null ? 0 : onContentCard.hashCode())) * 31;
            OnNavRoundel onNavRoundel = this.c;
            return iHashCode2 + (onNavRoundel != null ? onNavRoundel.hashCode() : 0);
        }

        public final String toString() {
            return "Item1(__typename=" + this.f21401a + ", onContentCard=" + this.b + ", onNavRoundel=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$LinkAction;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f21402a;
        public final ActionType b;
        public final String c;
        public final String d;

        public LinkAction(String str, ActionType actionType, String str2, String str3) {
            this.f21402a = str;
            this.b = actionType;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkAction)) {
                return false;
            }
            LinkAction linkAction = (LinkAction) obj;
            return Intrinsics.c(this.f21402a, linkAction.f21402a) && this.b == linkAction.b && Intrinsics.c(this.c, linkAction.c) && Intrinsics.c(this.d, linkAction.d);
        }

        public final int hashCode() {
            int iC = b.c(d.a(this.b, this.f21402a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(d.w("LinkAction(__typename=", this.f21402a, ", type=", this.b, ", action="), this.c, ", id=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$LinkAction1;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkAction1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f21403a;
        public final ActionType b;
        public final String c;
        public final String d;

        public LinkAction1(String str, ActionType actionType, String str2, String str3) {
            this.f21403a = str;
            this.b = actionType;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkAction1)) {
                return false;
            }
            LinkAction1 linkAction1 = (LinkAction1) obj;
            return Intrinsics.c(this.f21403a, linkAction1.f21403a) && this.b == linkAction1.b && Intrinsics.c(this.c, linkAction1.c) && Intrinsics.c(this.d, linkAction1.d);
        }

        public final int hashCode() {
            int iC = b.c(d.a(this.b, this.f21403a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(d.w("LinkAction1(__typename=", this.f21403a, ", type=", this.b, ", action="), this.c, ", id=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$LinkAction2;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkAction2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f21404a;
        public final ActionType b;
        public final String c;
        public final String d;

        public LinkAction2(String str, ActionType actionType, String str2, String str3) {
            this.f21404a = str;
            this.b = actionType;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkAction2)) {
                return false;
            }
            LinkAction2 linkAction2 = (LinkAction2) obj;
            return Intrinsics.c(this.f21404a, linkAction2.f21404a) && this.b == linkAction2.b && Intrinsics.c(this.c, linkAction2.c) && Intrinsics.c(this.d, linkAction2.d);
        }

        public final int hashCode() {
            int iC = b.c(d.a(this.b, this.f21404a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(d.w("LinkAction2(__typename=", this.f21404a, ", type=", this.b, ", action="), this.c, ", id=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$LinkTextWithAlt;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkTextWithAlt {

        /* renamed from: a, reason: collision with root package name */
        public final String f21405a;
        public final String b;
        public final String c;

        public LinkTextWithAlt(String str, String str2, String str3) {
            this.f21405a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkTextWithAlt)) {
                return false;
            }
            LinkTextWithAlt linkTextWithAlt = (LinkTextWithAlt) obj;
            return Intrinsics.c(this.f21405a, linkTextWithAlt.f21405a) && Intrinsics.c(this.b, linkTextWithAlt.b) && Intrinsics.c(this.c, linkTextWithAlt.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f21405a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("LinkTextWithAlt(__typename=", this.f21405a, ", text=", this.b, ", altText="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$LinkTextWithAlt1;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkTextWithAlt1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f21406a;
        public final String b;
        public final String c;

        public LinkTextWithAlt1(String str, String str2, String str3) {
            this.f21406a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkTextWithAlt1)) {
                return false;
            }
            LinkTextWithAlt1 linkTextWithAlt1 = (LinkTextWithAlt1) obj;
            return Intrinsics.c(this.f21406a, linkTextWithAlt1.f21406a) && Intrinsics.c(this.b, linkTextWithAlt1.b) && Intrinsics.c(this.c, linkTextWithAlt1.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f21406a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("LinkTextWithAlt1(__typename=", this.f21406a, ", text=", this.b, ", altText="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$LinkTextWithAlt2;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkTextWithAlt2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f21407a;
        public final String b;
        public final String c;

        public LinkTextWithAlt2(String str, String str2, String str3) {
            this.f21407a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkTextWithAlt2)) {
                return false;
            }
            LinkTextWithAlt2 linkTextWithAlt2 = (LinkTextWithAlt2) obj;
            return Intrinsics.c(this.f21407a, linkTextWithAlt2.f21407a) && Intrinsics.c(this.b, linkTextWithAlt2.b) && Intrinsics.c(this.c, linkTextWithAlt2.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f21407a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("LinkTextWithAlt2(__typename=", this.f21407a, ", text=", this.b, ", altText="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$NavRoundelAction;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NavRoundelAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f21408a;
        public final ActionType b;
        public final String c;
        public final String d;

        public NavRoundelAction(String str, ActionType actionType, String str2, String str3) {
            this.f21408a = str;
            this.b = actionType;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavRoundelAction)) {
                return false;
            }
            NavRoundelAction navRoundelAction = (NavRoundelAction) obj;
            return Intrinsics.c(this.f21408a, navRoundelAction.f21408a) && this.b == navRoundelAction.b && Intrinsics.c(this.c, navRoundelAction.c) && Intrinsics.c(this.d, navRoundelAction.d);
        }

        public final int hashCode() {
            int iC = b.c(d.a(this.b, this.f21408a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(d.w("NavRoundelAction(__typename=", this.f21408a, ", type=", this.b, ", action="), this.c, ", id=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnButton;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f21409a;
        public final String b;
        public final String c;
        public final ButtonStyle d;
        public final boolean e;
        public final ButtonAction f;
        public final String g;
        public final String h;
        public final Analytics1 i;

        public OnButton(String str, String str2, String str3, ButtonStyle buttonStyle, boolean z, ButtonAction buttonAction, String str4, String str5, Analytics1 analytics1) {
            this.f21409a = str;
            this.b = str2;
            this.c = str3;
            this.d = buttonStyle;
            this.e = z;
            this.f = buttonAction;
            this.g = str4;
            this.h = str5;
            this.i = analytics1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnButton)) {
                return false;
            }
            OnButton onButton = (OnButton) obj;
            return Intrinsics.c(this.f21409a, onButton.f21409a) && Intrinsics.c(this.b, onButton.b) && Intrinsics.c(this.c, onButton.c) && this.d == onButton.d && this.e == onButton.e && Intrinsics.c(this.f, onButton.f) && Intrinsics.c(this.g, onButton.g) && Intrinsics.c(this.h, onButton.h) && Intrinsics.c(this.i, onButton.i);
        }

        public final int hashCode() {
            int iHashCode = this.f21409a.hashCode() * 31;
            String str = this.b;
            int iC = b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
            ButtonStyle buttonStyle = this.d;
            int iE = b.e((iC + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31, 31, this.e);
            ButtonAction buttonAction = this.f;
            int iHashCode2 = (iE + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
            String str2 = this.g;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.h;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Analytics1 analytics1 = this.i;
            return iHashCode4 + (analytics1 != null ? analytics1.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnButton(__typename=", this.f21409a, ", buttonId=", this.b, ", label=");
            sbV.append(this.c);
            sbV.append(", style=");
            sbV.append(this.d);
            sbV.append(", enabled=");
            sbV.append(this.e);
            sbV.append(", buttonAction=");
            sbV.append(this.f);
            sbV.append(", iconUrl=");
            androidx.constraintlayout.core.state.a.B(sbV, this.g, ", altText=", this.h, ", analytics=");
            sbV.append(this.i);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnContentCard;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnContentCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f21410a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final ContentCardAction f;

        public OnContentCard(String str, String str2, String str3, String str4, String str5, ContentCardAction contentCardAction) {
            this.f21410a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = contentCardAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnContentCard)) {
                return false;
            }
            OnContentCard onContentCard = (OnContentCard) obj;
            return Intrinsics.c(this.f21410a, onContentCard.f21410a) && Intrinsics.c(this.b, onContentCard.b) && Intrinsics.c(this.c, onContentCard.c) && Intrinsics.c(this.d, onContentCard.d) && Intrinsics.c(this.e, onContentCard.e) && Intrinsics.c(this.f, onContentCard.f);
        }

        public final int hashCode() {
            int iHashCode = this.f21410a.hashCode() * 31;
            String str = this.b;
            int iC = b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
            String str2 = this.d;
            int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            ContentCardAction contentCardAction = this.f;
            return iHashCode3 + (contentCardAction != null ? contentCardAction.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnContentCard(__typename=", this.f21410a, ", contentCardId=", this.b, ", contentCardImageUrl=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", contentCardTitle=", this.d, ", contentCardDescription=");
            sbV.append(this.e);
            sbV.append(", contentCardAction=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnDownloadableAsset;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnDownloadableAsset {

        /* renamed from: a, reason: collision with root package name */
        public final String f21411a;
        public final String b;
        public final DownloadableAssetType c;
        public final String d;
        public final int e;
        public final int f;
        public final DownloadableAssetFit g;
        public final String h;

        public OnDownloadableAsset(String str, String str2, DownloadableAssetType downloadableAssetType, String str3, int i, int i2, DownloadableAssetFit downloadableAssetFit, String str4) {
            this.f21411a = str;
            this.b = str2;
            this.c = downloadableAssetType;
            this.d = str3;
            this.e = i;
            this.f = i2;
            this.g = downloadableAssetFit;
            this.h = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnDownloadableAsset)) {
                return false;
            }
            OnDownloadableAsset onDownloadableAsset = (OnDownloadableAsset) obj;
            return Intrinsics.c(this.f21411a, onDownloadableAsset.f21411a) && Intrinsics.c(this.b, onDownloadableAsset.b) && this.c == onDownloadableAsset.c && Intrinsics.c(this.d, onDownloadableAsset.d) && this.e == onDownloadableAsset.e && this.f == onDownloadableAsset.f && this.g == onDownloadableAsset.g && Intrinsics.c(this.h, onDownloadableAsset.h);
        }

        public final int hashCode() {
            int iHashCode = this.f21411a.hashCode() * 31;
            String str = this.b;
            int iA = b.a(this.f, b.a(this.e, b.c((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d), 31), 31);
            DownloadableAssetFit downloadableAssetFit = this.g;
            int iHashCode2 = (iA + (downloadableAssetFit == null ? 0 : downloadableAssetFit.hashCode())) * 31;
            String str2 = this.h;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnDownloadableAsset(__typename=", this.f21411a, ", assetId=", this.b, ", assetType=");
            sbV.append(this.c);
            sbV.append(", assetUrl=");
            sbV.append(this.d);
            sbV.append(", assetWidth=");
            a.w(this.e, this.f, ", assetHeight=", ", fit=", sbV);
            sbV.append(this.g);
            sbV.append(", altText=");
            sbV.append(this.h);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnFullWidthContentCard;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnFullWidthContentCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f21412a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final ContentCardAction1 f;

        public OnFullWidthContentCard(String str, String str2, String str3, String str4, String str5, ContentCardAction1 contentCardAction1) {
            this.f21412a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = contentCardAction1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnFullWidthContentCard)) {
                return false;
            }
            OnFullWidthContentCard onFullWidthContentCard = (OnFullWidthContentCard) obj;
            return Intrinsics.c(this.f21412a, onFullWidthContentCard.f21412a) && Intrinsics.c(this.b, onFullWidthContentCard.b) && Intrinsics.c(this.c, onFullWidthContentCard.c) && Intrinsics.c(this.d, onFullWidthContentCard.d) && Intrinsics.c(this.e, onFullWidthContentCard.e) && Intrinsics.c(this.f, onFullWidthContentCard.f);
        }

        public final int hashCode() {
            int iHashCode = this.f21412a.hashCode() * 31;
            String str = this.b;
            int iC = b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
            String str2 = this.d;
            int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            ContentCardAction1 contentCardAction1 = this.f;
            return iHashCode3 + (contentCardAction1 != null ? contentCardAction1.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnFullWidthContentCard(__typename=", this.f21412a, ", contentCardId=", this.b, ", contentCardImageUrl=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", contentCardTitle=", this.d, ", contentCardDescription=");
            sbV.append(this.e);
            sbV.append(", contentCardAction=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnFullWidthImageCard;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnFullWidthImageCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f21413a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public OnFullWidthImageCard(String str, String str2, String str3, String str4, String str5) {
            this.f21413a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnFullWidthImageCard)) {
                return false;
            }
            OnFullWidthImageCard onFullWidthImageCard = (OnFullWidthImageCard) obj;
            return Intrinsics.c(this.f21413a, onFullWidthImageCard.f21413a) && Intrinsics.c(this.b, onFullWidthImageCard.b) && Intrinsics.c(this.c, onFullWidthImageCard.c) && Intrinsics.c(this.d, onFullWidthImageCard.d) && Intrinsics.c(this.e, onFullWidthImageCard.e);
        }

        public final int hashCode() {
            int iHashCode = this.f21413a.hashCode() * 31;
            String str = this.b;
            int iC = b.c(b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
            String str2 = this.e;
            return iC + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnFullWidthImageCard(__typename=", this.f21413a, ", imageCardId=", this.b, ", imageCardImageUrl=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", imageCardImageAltText=", this.d, ", imageCardTitle=");
            return a.o(sbV, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnHorizontalList;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHorizontalList {

        /* renamed from: a, reason: collision with root package name */
        public final String f21414a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final ArrayList f;

        public OnHorizontalList(String str, String str2, String str3, String str4, String str5, ArrayList arrayList) {
            this.f21414a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnHorizontalList)) {
                return false;
            }
            OnHorizontalList onHorizontalList = (OnHorizontalList) obj;
            return this.f21414a.equals(onHorizontalList.f21414a) && Intrinsics.c(this.b, onHorizontalList.b) && this.c.equals(onHorizontalList.c) && Intrinsics.c(this.d, onHorizontalList.d) && Intrinsics.c(this.e, onHorizontalList.e) && this.f.equals(onHorizontalList.f);
        }

        public final int hashCode() {
            int iHashCode = this.f21414a.hashCode() * 31;
            String str = this.b;
            int iC = b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
            String str2 = this.d;
            int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            return this.f.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnHorizontalList(__typename=", this.f21414a, ", id=", this.b, ", title=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", actionTitle=", this.d, ", deepLink=");
            sbV.append(this.e);
            sbV.append(", items=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnLink;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnLink {

        /* renamed from: a, reason: collision with root package name */
        public final String f21415a;
        public final String b;
        public final LinkTextWithAlt1 c;
        public final LinkAction1 d;

        public OnLink(String str, String str2, LinkTextWithAlt1 linkTextWithAlt1, LinkAction1 linkAction1) {
            this.f21415a = str;
            this.b = str2;
            this.c = linkTextWithAlt1;
            this.d = linkAction1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnLink)) {
                return false;
            }
            OnLink onLink = (OnLink) obj;
            return Intrinsics.c(this.f21415a, onLink.f21415a) && Intrinsics.c(this.b, onLink.b) && Intrinsics.c(this.c, onLink.c) && Intrinsics.c(this.d, onLink.d);
        }

        public final int hashCode() {
            int iHashCode = this.f21415a.hashCode() * 31;
            String str = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnLink(__typename=", this.f21415a, ", linkId=", this.b, ", linkTextWithAlt=");
            sbV.append(this.c);
            sbV.append(", linkAction=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnNavRoundel;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnNavRoundel {

        /* renamed from: a, reason: collision with root package name */
        public final String f21416a;
        public final String b;
        public final String c;
        public final String d;
        public final NavRoundelAction e;

        public OnNavRoundel(String str, String str2, String str3, String str4, NavRoundelAction navRoundelAction) {
            this.f21416a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = navRoundelAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnNavRoundel)) {
                return false;
            }
            OnNavRoundel onNavRoundel = (OnNavRoundel) obj;
            return Intrinsics.c(this.f21416a, onNavRoundel.f21416a) && Intrinsics.c(this.b, onNavRoundel.b) && Intrinsics.c(this.c, onNavRoundel.c) && Intrinsics.c(this.d, onNavRoundel.d) && Intrinsics.c(this.e, onNavRoundel.e);
        }

        public final int hashCode() {
            int iHashCode = this.f21416a.hashCode() * 31;
            String str = this.b;
            int iC = b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
            String str2 = this.d;
            int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            NavRoundelAction navRoundelAction = this.e;
            return iHashCode2 + (navRoundelAction != null ? navRoundelAction.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnNavRoundel(__typename=", this.f21416a, ", navRoundelId=", this.b, ", navRoundelImageUrl=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", navRoundelTitle=", this.d, ", navRoundelAction=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnParagraphTextItem;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnParagraphTextItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f21417a;
        public final String b;
        public final ParagraphTextItemType c;

        public OnParagraphTextItem(String str, String str2, ParagraphTextItemType paragraphTextItemType) {
            this.f21417a = str;
            this.b = str2;
            this.c = paragraphTextItemType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnParagraphTextItem)) {
                return false;
            }
            OnParagraphTextItem onParagraphTextItem = (OnParagraphTextItem) obj;
            return Intrinsics.c(this.f21417a, onParagraphTextItem.f21417a) && Intrinsics.c(this.b, onParagraphTextItem.b) && this.c == onParagraphTextItem.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f21417a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnParagraphTextItem(__typename=", this.f21417a, ", content=", this.b, ", type=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnParagraphTextItem1;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnParagraphTextItem1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f21418a;
        public final String b;
        public final String c;
        public final ParagraphTextItemType d;

        public OnParagraphTextItem1(String str, String str2, String str3, ParagraphTextItemType paragraphTextItemType) {
            this.f21418a = str;
            this.b = str2;
            this.c = str3;
            this.d = paragraphTextItemType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnParagraphTextItem1)) {
                return false;
            }
            OnParagraphTextItem1 onParagraphTextItem1 = (OnParagraphTextItem1) obj;
            return Intrinsics.c(this.f21418a, onParagraphTextItem1.f21418a) && Intrinsics.c(this.b, onParagraphTextItem1.b) && Intrinsics.c(this.c, onParagraphTextItem1.c) && this.d == onParagraphTextItem1.d;
        }

        public final int hashCode() {
            int iHashCode = this.f21418a.hashCode() * 31;
            String str = this.b;
            return this.d.hashCode() + b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnParagraphTextItem1(__typename=", this.f21418a, ", paragraphTextItemId=", this.b, ", content=");
            sbV.append(this.c);
            sbV.append(", type=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnProductCard;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f21419a;
        public final ProductCard b;

        public OnProductCard(String str, ProductCard productCard) {
            this.f21419a = str;
            this.b = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductCard)) {
                return false;
            }
            OnProductCard onProductCard = (OnProductCard) obj;
            return Intrinsics.c(this.f21419a, onProductCard.f21419a) && Intrinsics.c(this.b, onProductCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21419a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard(__typename=", this.f21419a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnProductCard1;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f21420a;
        public final ProductCard b;

        public OnProductCard1(String str, ProductCard productCard) {
            this.f21420a = str;
            this.b = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductCard1)) {
                return false;
            }
            OnProductCard1 onProductCard1 = (OnProductCard1) obj;
            return Intrinsics.c(this.f21420a, onProductCard1.f21420a) && Intrinsics.c(this.b, onProductCard1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21420a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard1(__typename=", this.f21420a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnProductSection;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f21421a;
        public final String b;
        public final ProductSectionLink c;
        public final String d;
        public final ArrayList e;

        public OnProductSection(String str, String str2, ProductSectionLink productSectionLink, String str3, ArrayList arrayList) {
            this.f21421a = str;
            this.b = str2;
            this.c = productSectionLink;
            this.d = str3;
            this.e = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductSection)) {
                return false;
            }
            OnProductSection onProductSection = (OnProductSection) obj;
            return this.f21421a.equals(onProductSection.f21421a) && Intrinsics.c(this.b, onProductSection.b) && Intrinsics.c(this.c, onProductSection.c) && Intrinsics.c(this.d, onProductSection.d) && this.e.equals(onProductSection.e);
        }

        public final int hashCode() {
            int iHashCode = this.f21421a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ProductSectionLink productSectionLink = this.c;
            int iHashCode3 = (iHashCode2 + (productSectionLink == null ? 0 : productSectionLink.hashCode())) * 31;
            String str2 = this.d;
            return this.e.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnProductSection(__typename=", this.f21421a, ", productSectionId=", this.b, ", productSectionLink=");
            sbV.append(this.c);
            sbV.append(", productSectionTotal=");
            sbV.append(this.d);
            sbV.append(", productSectionFeed=");
            return android.support.v4.media.session.a.q(")", sbV, this.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnProductSection1;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductSection1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f21422a;
        public final String b;
        public final ProductSectionLink1 c;
        public final String d;
        public final ArrayList e;

        public OnProductSection1(String str, String str2, ProductSectionLink1 productSectionLink1, String str3, ArrayList arrayList) {
            this.f21422a = str;
            this.b = str2;
            this.c = productSectionLink1;
            this.d = str3;
            this.e = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductSection1)) {
                return false;
            }
            OnProductSection1 onProductSection1 = (OnProductSection1) obj;
            return this.f21422a.equals(onProductSection1.f21422a) && Intrinsics.c(this.b, onProductSection1.b) && Intrinsics.c(this.c, onProductSection1.c) && Intrinsics.c(this.d, onProductSection1.d) && this.e.equals(onProductSection1.e);
        }

        public final int hashCode() {
            int iHashCode = this.f21422a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ProductSectionLink1 productSectionLink1 = this.c;
            int iHashCode3 = (iHashCode2 + (productSectionLink1 == null ? 0 : productSectionLink1.hashCode())) * 31;
            String str2 = this.d;
            return this.e.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnProductSection1(__typename=", this.f21422a, ", productSectionId=", this.b, ", productSectionLink=");
            sbV.append(this.c);
            sbV.append(", productSectionTotal=");
            sbV.append(this.d);
            sbV.append(", productSectionFeed=");
            return android.support.v4.media.session.a.q(")", sbV, this.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnStaticBottomSheet;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnStaticBottomSheet {

        /* renamed from: a, reason: collision with root package name */
        public final String f21423a;
        public final String b;
        public final String c;
        public final ArrayList d;

        public OnStaticBottomSheet(String str, String str2, String str3, ArrayList arrayList) {
            this.f21423a = str;
            this.b = str2;
            this.c = str3;
            this.d = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnStaticBottomSheet)) {
                return false;
            }
            OnStaticBottomSheet onStaticBottomSheet = (OnStaticBottomSheet) obj;
            return this.f21423a.equals(onStaticBottomSheet.f21423a) && this.b.equals(onStaticBottomSheet.b) && this.c.equals(onStaticBottomSheet.c) && this.d.equals(onStaticBottomSheet.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + b.c(b.c(this.f21423a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnStaticBottomSheet(__typename=", this.f21423a, ", id=", this.b, ", title=");
            sbV.append(this.c);
            sbV.append(", staticBottomSheetItems=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnTabSection;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnTabSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f21424a;
        public final String b;
        public final ArrayList c;

        public OnTabSection(String str, String str2, ArrayList arrayList) {
            this.f21424a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnTabSection)) {
                return false;
            }
            OnTabSection onTabSection = (OnTabSection) obj;
            return this.f21424a.equals(onTabSection.f21424a) && Intrinsics.c(this.b, onTabSection.b) && this.c.equals(onTabSection.c);
        }

        public final int hashCode() {
            int iHashCode = this.f21424a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", a.v("OnTabSection(__typename=", this.f21424a, ", tabSectionId=", this.b, ", tabSectionItems="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$OnTitleSection;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnTitleSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f21425a;
        public final String b;
        public final TitleSectionTypes c;
        public final String d;

        public OnTitleSection(String str, String str2, TitleSectionTypes titleSectionTypes, String str3) {
            this.f21425a = str;
            this.b = str2;
            this.c = titleSectionTypes;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnTitleSection)) {
                return false;
            }
            OnTitleSection onTitleSection = (OnTitleSection) obj;
            return Intrinsics.c(this.f21425a, onTitleSection.f21425a) && Intrinsics.c(this.b, onTitleSection.b) && this.c == onTitleSection.c && Intrinsics.c(this.d, onTitleSection.d);
        }

        public final int hashCode() {
            int iHashCode = this.f21425a.hashCode() * 31;
            String str = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnTitleSection(__typename=", this.f21425a, ", titleSectionId=", this.b, ", titleSectionType=");
            sbV.append(this.c);
            sbV.append(", titleSectionText=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$ProductSectionFeed;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductSectionFeed {

        /* renamed from: a, reason: collision with root package name */
        public final String f21426a;
        public final OnProductCard b;

        public ProductSectionFeed(String __typename, OnProductCard onProductCard) {
            Intrinsics.h(__typename, "__typename");
            this.f21426a = __typename;
            this.b = onProductCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductSectionFeed)) {
                return false;
            }
            ProductSectionFeed productSectionFeed = (ProductSectionFeed) obj;
            return Intrinsics.c(this.f21426a, productSectionFeed.f21426a) && Intrinsics.c(this.b, productSectionFeed.b);
        }

        public final int hashCode() {
            int iHashCode = this.f21426a.hashCode() * 31;
            OnProductCard onProductCard = this.b;
            return iHashCode + (onProductCard == null ? 0 : onProductCard.hashCode());
        }

        public final String toString() {
            return "ProductSectionFeed(__typename=" + this.f21426a + ", onProductCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$ProductSectionFeed1;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductSectionFeed1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f21427a;
        public final OnProductCard1 b;

        public ProductSectionFeed1(String __typename, OnProductCard1 onProductCard1) {
            Intrinsics.h(__typename, "__typename");
            this.f21427a = __typename;
            this.b = onProductCard1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductSectionFeed1)) {
                return false;
            }
            ProductSectionFeed1 productSectionFeed1 = (ProductSectionFeed1) obj;
            return Intrinsics.c(this.f21427a, productSectionFeed1.f21427a) && Intrinsics.c(this.b, productSectionFeed1.b);
        }

        public final int hashCode() {
            int iHashCode = this.f21427a.hashCode() * 31;
            OnProductCard1 onProductCard1 = this.b;
            return iHashCode + (onProductCard1 == null ? 0 : onProductCard1.hashCode());
        }

        public final String toString() {
            return "ProductSectionFeed1(__typename=" + this.f21427a + ", onProductCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$ProductSectionLink;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductSectionLink {

        /* renamed from: a, reason: collision with root package name */
        public final String f21428a;
        public final String b;
        public final LinkTextWithAlt c;
        public final LinkAction d;

        public ProductSectionLink(String str, String str2, LinkTextWithAlt linkTextWithAlt, LinkAction linkAction) {
            this.f21428a = str;
            this.b = str2;
            this.c = linkTextWithAlt;
            this.d = linkAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductSectionLink)) {
                return false;
            }
            ProductSectionLink productSectionLink = (ProductSectionLink) obj;
            return Intrinsics.c(this.f21428a, productSectionLink.f21428a) && Intrinsics.c(this.b, productSectionLink.b) && Intrinsics.c(this.c, productSectionLink.c) && Intrinsics.c(this.d, productSectionLink.d);
        }

        public final int hashCode() {
            int iHashCode = this.f21428a.hashCode() * 31;
            String str = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("ProductSectionLink(__typename=", this.f21428a, ", linkId=", this.b, ", linkTextWithAlt=");
            sbV.append(this.c);
            sbV.append(", linkAction=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$ProductSectionLink1;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductSectionLink1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f21429a;
        public final String b;
        public final LinkTextWithAlt2 c;
        public final LinkAction2 d;

        public ProductSectionLink1(String str, String str2, LinkTextWithAlt2 linkTextWithAlt2, LinkAction2 linkAction2) {
            this.f21429a = str;
            this.b = str2;
            this.c = linkTextWithAlt2;
            this.d = linkAction2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductSectionLink1)) {
                return false;
            }
            ProductSectionLink1 productSectionLink1 = (ProductSectionLink1) obj;
            return Intrinsics.c(this.f21429a, productSectionLink1.f21429a) && Intrinsics.c(this.b, productSectionLink1.b) && Intrinsics.c(this.c, productSectionLink1.c) && Intrinsics.c(this.d, productSectionLink1.d);
        }

        public final int hashCode() {
            int iHashCode = this.f21429a.hashCode() * 31;
            String str = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("ProductSectionLink1(__typename=", this.f21429a, ", linkId=", this.b, ", linkTextWithAlt=");
            sbV.append(this.c);
            sbV.append(", linkAction=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$StaticBottomSheetItem;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StaticBottomSheetItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f21430a;
        public final OnParagraphTextItem b;

        public StaticBottomSheetItem(String __typename, OnParagraphTextItem onParagraphTextItem) {
            Intrinsics.h(__typename, "__typename");
            this.f21430a = __typename;
            this.b = onParagraphTextItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StaticBottomSheetItem)) {
                return false;
            }
            StaticBottomSheetItem staticBottomSheetItem = (StaticBottomSheetItem) obj;
            return Intrinsics.c(this.f21430a, staticBottomSheetItem.f21430a) && Intrinsics.c(this.b, staticBottomSheetItem.b);
        }

        public final int hashCode() {
            int iHashCode = this.f21430a.hashCode() * 31;
            OnParagraphTextItem onParagraphTextItem = this.b;
            return iHashCode + (onParagraphTextItem == null ? 0 : onParagraphTextItem.hashCode());
        }

        public final String toString() {
            return "StaticBottomSheetItem(__typename=" + this.f21430a + ", onParagraphTextItem=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$TabItemFeed;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TabItemFeed {

        /* renamed from: a, reason: collision with root package name */
        public final String f21431a;
        public final OnProductSection b;

        public TabItemFeed(String __typename, OnProductSection onProductSection) {
            Intrinsics.h(__typename, "__typename");
            this.f21431a = __typename;
            this.b = onProductSection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TabItemFeed)) {
                return false;
            }
            TabItemFeed tabItemFeed = (TabItemFeed) obj;
            return Intrinsics.c(this.f21431a, tabItemFeed.f21431a) && Intrinsics.c(this.b, tabItemFeed.b);
        }

        public final int hashCode() {
            int iHashCode = this.f21431a.hashCode() * 31;
            OnProductSection onProductSection = this.b;
            return iHashCode + (onProductSection == null ? 0 : onProductSection.hashCode());
        }

        public final String toString() {
            return "TabItemFeed(__typename=" + this.f21431a + ", onProductSection=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/BrandedShopQuery$TabSectionItem;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TabSectionItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f21432a;
        public final String b;
        public final String c;
        public final ArrayList d;

        public TabSectionItem(String str, String str2, String str3, ArrayList arrayList) {
            this.f21432a = str;
            this.b = str2;
            this.c = str3;
            this.d = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TabSectionItem)) {
                return false;
            }
            TabSectionItem tabSectionItem = (TabSectionItem) obj;
            return this.f21432a.equals(tabSectionItem.f21432a) && Intrinsics.c(this.b, tabSectionItem.b) && this.c.equals(tabSectionItem.c) && this.d.equals(tabSectionItem.d);
        }

        public final int hashCode() {
            int iHashCode = this.f21432a.hashCode() * 31;
            String str = this.b;
            return this.d.hashCode() + b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sbV = a.v("TabSectionItem(__typename=", this.f21432a, ", tabItemId=", this.b, ", tabItemTitle=");
            sbV.append(this.c);
            sbV.append(", tabItemFeed=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    public BrandedShopQuery(BrandedShopInput brandedShopInput, Optional optional, boolean z) {
        this.f21389a = brandedShopInput;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.b = absent;
        this.c = absent;
        this.d = absent;
        this.e = optional;
        this.f = z;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(BrandedShopQuery_ResponseAdapter.Data.f21448a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query brandedShop($brandedShopInput: BrandedShopInput!, $includeAvailabilityInfoStatus: Boolean! = false , $includeProductAvailabilityStates: Boolean! = false , $includeOfferMinimumSpend: Boolean! = false , $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!) { brandedShop(brandedShopInput: $brandedShopInput) { header { __typename pageTitle } bottomSheets { __typename ... on StaticBottomSheet { __typename id title staticBottomSheetItems { __typename ... on ParagraphTextItem { __typename content type } } } } analytics { __typename ...analyticsFields } impressionAnalytics { __typename ...analyticsFields } items { __typename ... on DownloadableAsset { __typename assetId assetType assetUrl assetWidth assetHeight fit altText } ... on TitleSection { __typename titleSectionId titleSectionType titleSectionText } ... on TabSection { __typename tabSectionId tabSectionItems { __typename tabItemId tabItemTitle tabItemFeed { __typename ... on ProductSection { __typename productSectionId productSectionLink { __typename linkId linkTextWithAlt { __typename text altText } linkAction { __typename type action id } } productSectionTotal productSectionFeed { __typename ... on ProductCard { __typename ...productCard } } } } } } ... on Link { __typename linkId linkTextWithAlt { __typename text altText } linkAction { __typename type action id } } ... on Button { __typename buttonId label style enabled buttonAction { __typename type action id } iconUrl altText analytics { __typename label } } ... on HorizontalList { __typename id title actionTitle deepLink items { __typename ... on ContentCard { __typename contentCardId contentCardImageUrl contentCardTitle contentCardDescription contentCardAction { __typename type action id } } ... on NavRoundel { __typename navRoundelId navRoundelImageUrl navRoundelTitle navRoundelAction { __typename type action id } } } } ... on FullWidthImageCard { __typename imageCardId imageCardImageUrl imageCardImageAltText imageCardTitle } ... on FullWidthContentCard { __typename contentCardId contentCardImageUrl contentCardTitle contentCardDescription contentCardAction { __typename type action id } } ... on ParagraphTextItem { __typename paragraphTextItemId content type } ... on ProductSection { __typename productSectionId productSectionLink { __typename linkId linkTextWithAlt { __typename text altText } linkAction { __typename type action id } } productSectionTotal productSectionFeed { __typename ... on ProductCard { __typename ...productCard } } } } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandedShopQuery)) {
            return false;
        }
        BrandedShopQuery brandedShopQuery = (BrandedShopQuery) obj;
        return Intrinsics.c(this.f21389a, brandedShopQuery.f21389a) && Intrinsics.c(this.b, brandedShopQuery.b) && Intrinsics.c(this.c, brandedShopQuery.c) && Intrinsics.c(this.d, brandedShopQuery.d) && Intrinsics.c(this.e, brandedShopQuery.e) && this.f == brandedShopQuery.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.e, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.d, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.c, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.b, this.f21389a.hashCode() * 31, 31), 31), 31), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "ec86824cdcc23a2dd96f41d93039b32056c638d488117a3c1e2a79fe03560443";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "brandedShop";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("brandedShopInput");
        Adapters.c(BrandedShopInput_InputAdapter.f12038a, false).toJson(jsonWriter, customScalarAdapters, this.f21389a);
        Optional optional = this.b;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        } else if (z) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional2 = this.c;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("includeProductAvailabilityStates");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        } else if (z) {
            jsonWriter.F1("includeProductAvailabilityStates");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional3 = this.d;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("includeOfferMinimumSpend");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        } else if (z) {
            jsonWriter.F1("includeOfferMinimumSpend");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional4 = this.e;
        if (optional4 instanceof Optional.Present) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional4);
        } else if (z) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        jsonWriter.F1("includeLowestPrice14Days");
        Adapters.f.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.f));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrandedShopQuery(brandedShopInput=");
        sb.append(this.f21389a);
        sb.append(", includeAvailabilityInfoStatus=");
        sb.append(this.b);
        sb.append(", includeProductAvailabilityStates=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.c, ", includeOfferMinimumSpend=", this.d, ", includePricingFootnote=");
        sb.append(this.e);
        sb.append(", includeLowestPrice14Days=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
