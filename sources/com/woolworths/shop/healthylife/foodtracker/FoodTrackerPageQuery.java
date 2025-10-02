package com.woolworths.shop.healthylife.foodtracker;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.DownloadableAssetFit;
import au.com.woolworths.shop.graphql.type.DownloadableAssetType;
import au.com.woolworths.shop.graphql.type.FooterActionType;
import au.com.woolworths.shop.graphql.type.ListSectionHeaderTypes;
import au.com.woolworths.shop.graphql.type.ParagraphTextItemType;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.healthylife.foodtracker.adapter.FoodTrackerPageQuery_ResponseAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0011\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$Data;", "Data", "FoodTrackerPage", "OnFoodTrackerContentFeed", "HeaderAsset", "Content", "OnIconListItem", "OnParagraphTextItem", "OnListSectionHeader", "OnDownloadableAsset", "OnTextWithLink", "Footer", "Icon", "ConsentAction", "OnFoodTrackerConsent", "HeaderAsset1", "OnFoodTrackerWebView", "Companion", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FoodTrackerPageQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional.Present f22736a;
    public final Optional b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$ConsentAction;", "", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConsentAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f22737a;
        public final OnFoodTrackerConsent b;

        public ConsentAction(String __typename, OnFoodTrackerConsent onFoodTrackerConsent) {
            Intrinsics.h(__typename, "__typename");
            this.f22737a = __typename;
            this.b = onFoodTrackerConsent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConsentAction)) {
                return false;
            }
            ConsentAction consentAction = (ConsentAction) obj;
            return Intrinsics.c(this.f22737a, consentAction.f22737a) && Intrinsics.c(this.b, consentAction.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22737a.hashCode() * 31;
            OnFoodTrackerConsent onFoodTrackerConsent = this.b;
            return iHashCode + (onFoodTrackerConsent == null ? 0 : onFoodTrackerConsent.hashCode());
        }

        public final String toString() {
            return "ConsentAction(__typename=" + this.f22737a + ", onFoodTrackerConsent=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$Content;", "", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Content {

        /* renamed from: a, reason: collision with root package name */
        public final String f22738a;
        public final OnIconListItem b;
        public final OnParagraphTextItem c;
        public final OnListSectionHeader d;
        public final OnDownloadableAsset e;
        public final OnTextWithLink f;

        public Content(String __typename, OnIconListItem onIconListItem, OnParagraphTextItem onParagraphTextItem, OnListSectionHeader onListSectionHeader, OnDownloadableAsset onDownloadableAsset, OnTextWithLink onTextWithLink) {
            Intrinsics.h(__typename, "__typename");
            this.f22738a = __typename;
            this.b = onIconListItem;
            this.c = onParagraphTextItem;
            this.d = onListSectionHeader;
            this.e = onDownloadableAsset;
            this.f = onTextWithLink;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.c(this.f22738a, content.f22738a) && Intrinsics.c(this.b, content.b) && Intrinsics.c(this.c, content.c) && Intrinsics.c(this.d, content.d) && Intrinsics.c(this.e, content.e) && Intrinsics.c(this.f, content.f);
        }

        public final int hashCode() {
            int iHashCode = this.f22738a.hashCode() * 31;
            OnIconListItem onIconListItem = this.b;
            int iHashCode2 = (iHashCode + (onIconListItem == null ? 0 : onIconListItem.hashCode())) * 31;
            OnParagraphTextItem onParagraphTextItem = this.c;
            int iHashCode3 = (iHashCode2 + (onParagraphTextItem == null ? 0 : onParagraphTextItem.hashCode())) * 31;
            OnListSectionHeader onListSectionHeader = this.d;
            int iHashCode4 = (iHashCode3 + (onListSectionHeader == null ? 0 : onListSectionHeader.hashCode())) * 31;
            OnDownloadableAsset onDownloadableAsset = this.e;
            int iHashCode5 = (iHashCode4 + (onDownloadableAsset == null ? 0 : onDownloadableAsset.hashCode())) * 31;
            OnTextWithLink onTextWithLink = this.f;
            return iHashCode5 + (onTextWithLink != null ? onTextWithLink.hashCode() : 0);
        }

        public final String toString() {
            return "Content(__typename=" + this.f22738a + ", onIconListItem=" + this.b + ", onParagraphTextItem=" + this.c + ", onListSectionHeader=" + this.d + ", onDownloadableAsset=" + this.e + ", onTextWithLink=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final FoodTrackerPage f22739a;

        public Data(FoodTrackerPage foodTrackerPage) {
            this.f22739a = foodTrackerPage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f22739a, ((Data) obj).f22739a);
        }

        public final int hashCode() {
            FoodTrackerPage foodTrackerPage = this.f22739a;
            if (foodTrackerPage == null) {
                return 0;
            }
            return foodTrackerPage.hashCode();
        }

        public final String toString() {
            return "Data(foodTrackerPage=" + this.f22739a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$FoodTrackerPage;", "", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FoodTrackerPage {

        /* renamed from: a, reason: collision with root package name */
        public final String f22740a;
        public final OnFoodTrackerContentFeed b;
        public final OnFoodTrackerWebView c;

        public FoodTrackerPage(String __typename, OnFoodTrackerContentFeed onFoodTrackerContentFeed, OnFoodTrackerWebView onFoodTrackerWebView) {
            Intrinsics.h(__typename, "__typename");
            this.f22740a = __typename;
            this.b = onFoodTrackerContentFeed;
            this.c = onFoodTrackerWebView;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FoodTrackerPage)) {
                return false;
            }
            FoodTrackerPage foodTrackerPage = (FoodTrackerPage) obj;
            return Intrinsics.c(this.f22740a, foodTrackerPage.f22740a) && Intrinsics.c(this.b, foodTrackerPage.b) && Intrinsics.c(this.c, foodTrackerPage.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22740a.hashCode() * 31;
            OnFoodTrackerContentFeed onFoodTrackerContentFeed = this.b;
            int iHashCode2 = (iHashCode + (onFoodTrackerContentFeed == null ? 0 : onFoodTrackerContentFeed.hashCode())) * 31;
            OnFoodTrackerWebView onFoodTrackerWebView = this.c;
            return iHashCode2 + (onFoodTrackerWebView != null ? onFoodTrackerWebView.hashCode() : 0);
        }

        public final String toString() {
            return "FoodTrackerPage(__typename=" + this.f22740a + ", onFoodTrackerContentFeed=" + this.b + ", onFoodTrackerWebView=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$Footer;", "", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer {

        /* renamed from: a, reason: collision with root package name */
        public final Icon f22741a;
        public final String b;
        public final ConsentAction c;
        public final FooterActionType d;
        public final String e;

        public Footer(Icon icon, String str, ConsentAction consentAction, FooterActionType footerActionType, String str2) {
            this.f22741a = icon;
            this.b = str;
            this.c = consentAction;
            this.d = footerActionType;
            this.e = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) obj;
            return Intrinsics.c(this.f22741a, footer.f22741a) && Intrinsics.c(this.b, footer.b) && Intrinsics.c(this.c, footer.c) && this.d == footer.d && Intrinsics.c(this.e, footer.e);
        }

        public final int hashCode() {
            int iC = b.c(this.f22741a.hashCode() * 31, 31, this.b);
            ConsentAction consentAction = this.c;
            return this.e.hashCode() + ((this.d.hashCode() + ((iC + (consentAction == null ? 0 : consentAction.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Footer(icon=");
            sb.append(this.f22741a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", consentAction=");
            sb.append(this.c);
            sb.append(", actionType=");
            sb.append(this.d);
            sb.append(", primaryCtaLabel=");
            return a.o(sb, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$HeaderAsset;", "", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeaderAsset {

        /* renamed from: a, reason: collision with root package name */
        public final DownloadableAssetType f22742a;
        public final String b;
        public final int c;
        public final int d;
        public final DownloadableAssetFit e;
        public final String f;

        public HeaderAsset(DownloadableAssetType downloadableAssetType, String str, int i, int i2, DownloadableAssetFit downloadableAssetFit, String str2) {
            this.f22742a = downloadableAssetType;
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
            if (!(obj instanceof HeaderAsset)) {
                return false;
            }
            HeaderAsset headerAsset = (HeaderAsset) obj;
            return this.f22742a == headerAsset.f22742a && Intrinsics.c(this.b, headerAsset.b) && this.c == headerAsset.c && this.d == headerAsset.d && this.e == headerAsset.e && Intrinsics.c(this.f, headerAsset.f);
        }

        public final int hashCode() {
            int iA = b.a(this.d, b.a(this.c, b.c(this.f22742a.hashCode() * 31, 31, this.b), 31), 31);
            DownloadableAssetFit downloadableAssetFit = this.e;
            int iHashCode = (iA + (downloadableAssetFit == null ? 0 : downloadableAssetFit.hashCode())) * 31;
            String str = this.f;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HeaderAsset(assetType=");
            sb.append(this.f22742a);
            sb.append(", assetUrl=");
            sb.append(this.b);
            sb.append(", assetWidth=");
            a.w(this.c, this.d, ", assetHeight=", ", fit=", sb);
            sb.append(this.e);
            sb.append(", altText=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$HeaderAsset1;", "", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeaderAsset1 {

        /* renamed from: a, reason: collision with root package name */
        public final DownloadableAssetType f22743a;
        public final String b;
        public final int c;
        public final int d;
        public final DownloadableAssetFit e;
        public final String f;

        public HeaderAsset1(DownloadableAssetType downloadableAssetType, String str, int i, int i2, DownloadableAssetFit downloadableAssetFit, String str2) {
            this.f22743a = downloadableAssetType;
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
            if (!(obj instanceof HeaderAsset1)) {
                return false;
            }
            HeaderAsset1 headerAsset1 = (HeaderAsset1) obj;
            return this.f22743a == headerAsset1.f22743a && Intrinsics.c(this.b, headerAsset1.b) && this.c == headerAsset1.c && this.d == headerAsset1.d && this.e == headerAsset1.e && Intrinsics.c(this.f, headerAsset1.f);
        }

        public final int hashCode() {
            int iA = b.a(this.d, b.a(this.c, b.c(this.f22743a.hashCode() * 31, 31, this.b), 31), 31);
            DownloadableAssetFit downloadableAssetFit = this.e;
            int iHashCode = (iA + (downloadableAssetFit == null ? 0 : downloadableAssetFit.hashCode())) * 31;
            String str = this.f;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HeaderAsset1(assetType=");
            sb.append(this.f22743a);
            sb.append(", assetUrl=");
            sb.append(this.b);
            sb.append(", assetWidth=");
            a.w(this.c, this.d, ", assetHeight=", ", fit=", sb);
            sb.append(this.e);
            sb.append(", altText=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$Icon;", "", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Icon {

        /* renamed from: a, reason: collision with root package name */
        public final DownloadableAssetType f22744a;
        public final String b;
        public final int c;
        public final int d;
        public final DownloadableAssetFit e;
        public final String f;

        public Icon(DownloadableAssetType downloadableAssetType, String str, int i, int i2, DownloadableAssetFit downloadableAssetFit, String str2) {
            this.f22744a = downloadableAssetType;
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
            if (!(obj instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) obj;
            return this.f22744a == icon.f22744a && Intrinsics.c(this.b, icon.b) && this.c == icon.c && this.d == icon.d && this.e == icon.e && Intrinsics.c(this.f, icon.f);
        }

        public final int hashCode() {
            int iA = b.a(this.d, b.a(this.c, b.c(this.f22744a.hashCode() * 31, 31, this.b), 31), 31);
            DownloadableAssetFit downloadableAssetFit = this.e;
            int iHashCode = (iA + (downloadableAssetFit == null ? 0 : downloadableAssetFit.hashCode())) * 31;
            String str = this.f;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Icon(assetType=");
            sb.append(this.f22744a);
            sb.append(", assetUrl=");
            sb.append(this.b);
            sb.append(", assetWidth=");
            a.w(this.c, this.d, ", assetHeight=", ", fit=", sb);
            sb.append(this.e);
            sb.append(", altText=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$OnDownloadableAsset;", "", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnDownloadableAsset {

        /* renamed from: a, reason: collision with root package name */
        public final DownloadableAssetType f22745a;
        public final String b;
        public final int c;
        public final int d;
        public final DownloadableAssetFit e;
        public final String f;

        public OnDownloadableAsset(DownloadableAssetType downloadableAssetType, String str, int i, int i2, DownloadableAssetFit downloadableAssetFit, String str2) {
            this.f22745a = downloadableAssetType;
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
            if (!(obj instanceof OnDownloadableAsset)) {
                return false;
            }
            OnDownloadableAsset onDownloadableAsset = (OnDownloadableAsset) obj;
            return this.f22745a == onDownloadableAsset.f22745a && Intrinsics.c(this.b, onDownloadableAsset.b) && this.c == onDownloadableAsset.c && this.d == onDownloadableAsset.d && this.e == onDownloadableAsset.e && Intrinsics.c(this.f, onDownloadableAsset.f);
        }

        public final int hashCode() {
            int iA = b.a(this.d, b.a(this.c, b.c(this.f22745a.hashCode() * 31, 31, this.b), 31), 31);
            DownloadableAssetFit downloadableAssetFit = this.e;
            int iHashCode = (iA + (downloadableAssetFit == null ? 0 : downloadableAssetFit.hashCode())) * 31;
            String str = this.f;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnDownloadableAsset(assetType=");
            sb.append(this.f22745a);
            sb.append(", assetUrl=");
            sb.append(this.b);
            sb.append(", assetWidth=");
            a.w(this.c, this.d, ", assetHeight=", ", fit=", sb);
            sb.append(this.e);
            sb.append(", altText=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$OnFoodTrackerConsent;", "", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnFoodTrackerConsent {

        /* renamed from: a, reason: collision with root package name */
        public final HeaderAsset1 f22746a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public OnFoodTrackerConsent(HeaderAsset1 headerAsset1, String str, String str2, String str3, String str4, String str5) {
            this.f22746a = headerAsset1;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnFoodTrackerConsent)) {
                return false;
            }
            OnFoodTrackerConsent onFoodTrackerConsent = (OnFoodTrackerConsent) obj;
            return Intrinsics.c(this.f22746a, onFoodTrackerConsent.f22746a) && Intrinsics.c(this.b, onFoodTrackerConsent.b) && Intrinsics.c(this.c, onFoodTrackerConsent.c) && Intrinsics.c(this.d, onFoodTrackerConsent.d) && Intrinsics.c(this.e, onFoodTrackerConsent.e) && Intrinsics.c(this.f, onFoodTrackerConsent.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + b.c(b.c(b.c(b.c(this.f22746a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnFoodTrackerConsent(headerAsset=");
            sb.append(this.f22746a);
            sb.append(", consentTitle=");
            sb.append(this.b);
            sb.append(", consentMarkdownDescription=");
            androidx.constraintlayout.core.state.a.B(sb, this.c, ", termsMarkdownText=", this.d, ", primaryCtaLabel=");
            return androidx.constraintlayout.core.state.a.l(sb, this.e, ", secondaryCtaLabel=", this.f, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$OnFoodTrackerContentFeed;", "", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnFoodTrackerContentFeed {

        /* renamed from: a, reason: collision with root package name */
        public final String f22747a;
        public final HeaderAsset b;
        public final ArrayList c;
        public final Footer d;

        public OnFoodTrackerContentFeed(String str, HeaderAsset headerAsset, ArrayList arrayList, Footer footer) {
            this.f22747a = str;
            this.b = headerAsset;
            this.c = arrayList;
            this.d = footer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnFoodTrackerContentFeed)) {
                return false;
            }
            OnFoodTrackerContentFeed onFoodTrackerContentFeed = (OnFoodTrackerContentFeed) obj;
            return this.f22747a.equals(onFoodTrackerContentFeed.f22747a) && this.b.equals(onFoodTrackerContentFeed.b) && this.c.equals(onFoodTrackerContentFeed.c) && this.d.equals(onFoodTrackerContentFeed.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + androidx.compose.ui.input.pointer.a.b((this.b.hashCode() + (this.f22747a.hashCode() * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            return "OnFoodTrackerContentFeed(navigationTitle=" + this.f22747a + ", headerAsset=" + this.b + ", content=" + this.c + ", footer=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$OnFoodTrackerWebView;", "", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnFoodTrackerWebView {

        /* renamed from: a, reason: collision with root package name */
        public final String f22748a;
        public final String b;

        public OnFoodTrackerWebView(String str, String str2) {
            this.f22748a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnFoodTrackerWebView)) {
                return false;
            }
            OnFoodTrackerWebView onFoodTrackerWebView = (OnFoodTrackerWebView) obj;
            return Intrinsics.c(this.f22748a, onFoodTrackerWebView.f22748a) && Intrinsics.c(this.b, onFoodTrackerWebView.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22748a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnFoodTrackerWebView(navigationTitle=", this.f22748a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$OnIconListItem;", "", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnIconListItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f22749a;
        public final String b;
        public final String c;

        public OnIconListItem(String str, String str2, String str3) {
            this.f22749a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnIconListItem)) {
                return false;
            }
            OnIconListItem onIconListItem = (OnIconListItem) obj;
            return Intrinsics.c(this.f22749a, onIconListItem.f22749a) && Intrinsics.c(this.b, onIconListItem.b) && Intrinsics.c(this.c, onIconListItem.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f22749a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("OnIconListItem(iconUrl=", this.f22749a, ", title=", this.b, ", description="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$OnListSectionHeader;", "", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnListSectionHeader {

        /* renamed from: a, reason: collision with root package name */
        public final String f22750a;
        public final ListSectionHeaderTypes b;

        public OnListSectionHeader(ListSectionHeaderTypes listSectionHeaderTypes, String str) {
            this.f22750a = str;
            this.b = listSectionHeaderTypes;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnListSectionHeader)) {
                return false;
            }
            OnListSectionHeader onListSectionHeader = (OnListSectionHeader) obj;
            return Intrinsics.c(this.f22750a, onListSectionHeader.f22750a) && this.b == onListSectionHeader.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22750a.hashCode() * 31);
        }

        public final String toString() {
            return "OnListSectionHeader(listSectionHeaderText=" + this.f22750a + ", listSectionHeaderType=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$OnParagraphTextItem;", "", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnParagraphTextItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f22751a;
        public final ParagraphTextItemType b;

        public OnParagraphTextItem(ParagraphTextItemType paragraphTextItemType, String str) {
            this.f22751a = str;
            this.b = paragraphTextItemType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnParagraphTextItem)) {
                return false;
            }
            OnParagraphTextItem onParagraphTextItem = (OnParagraphTextItem) obj;
            return Intrinsics.c(this.f22751a, onParagraphTextItem.f22751a) && this.b == onParagraphTextItem.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22751a.hashCode() * 31);
        }

        public final String toString() {
            return "OnParagraphTextItem(content=" + this.f22751a + ", type=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/FoodTrackerPageQuery$OnTextWithLink;", "", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnTextWithLink {

        /* renamed from: a, reason: collision with root package name */
        public final String f22752a;
        public final String b;

        public OnTextWithLink(String str, String str2) {
            this.f22752a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnTextWithLink)) {
                return false;
            }
            OnTextWithLink onTextWithLink = (OnTextWithLink) obj;
            return Intrinsics.c(this.f22752a, onTextWithLink.f22752a) && Intrinsics.c(this.b, onTextWithLink.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22752a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnTextWithLink(label=", this.f22752a, ", url=", this.b, ")");
        }
    }

    public FoodTrackerPageQuery(Optional.Present present, Optional optional) {
        this.f22736a = present;
        this.b = optional;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(FoodTrackerPageQuery_ResponseAdapter.Data.f22758a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query FoodTrackerPage($isEDRLinkingEnabled: Boolean, $referralCode: String) { foodTrackerPage(isEDRLinkingEnabled: $isEDRLinkingEnabled, referralCode: $referralCode) { __typename ... on FoodTrackerContentFeed { navigationTitle headerAsset { assetType assetUrl assetWidth assetHeight fit altText } content { __typename ... on IconListItem { iconUrl title description } ... on ParagraphTextItem { content type } ... on ListSectionHeader { listSectionHeaderText listSectionHeaderType } ... on DownloadableAsset { assetType assetUrl assetWidth assetHeight fit altText } ... on TextWithLink { label url } } footer { icon { assetType assetUrl assetWidth assetHeight fit altText } title consentAction { __typename ... on FoodTrackerConsent { headerAsset { assetType assetUrl assetWidth assetHeight fit altText } consentTitle consentMarkdownDescription termsMarkdownText primaryCtaLabel secondaryCtaLabel } } actionType primaryCtaLabel } } ... on FoodTrackerWebView { navigationTitle url } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FoodTrackerPageQuery)) {
            return false;
        }
        FoodTrackerPageQuery foodTrackerPageQuery = (FoodTrackerPageQuery) obj;
        return this.f22736a.equals(foodTrackerPageQuery.f22736a) && this.b.equals(foodTrackerPageQuery.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22736a.hashCode() * 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "03f9822fa214db28c4c15d12efa579d687013653fcb9c67a095d8cfd3bbe0404";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "FoodTrackerPage";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("isEDRLinkingEnabled");
        Adapters.d(Adapters.l).toJson(jsonWriter, customScalarAdapters, this.f22736a);
        Optional optional = this.b;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("referralCode");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
    }

    public final String toString() {
        return "FoodTrackerPageQuery(isEDRLinkingEnabled=" + this.f22736a + ", referralCode=" + this.b + ")";
    }
}
