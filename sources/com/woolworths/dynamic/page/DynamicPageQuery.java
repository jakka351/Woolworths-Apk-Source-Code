package com.woolworths.dynamic.page;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.DynamicPageInput;
import au.com.woolworths.shop.graphql.type.adapter.DynamicPageInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.dynamic.page.adapter.DynamicPageQuery_ResponseAdapter;
import com.woolworths.dynamic.page.fragment.CampaignCopy;
import com.woolworths.dynamic.page.fragment.CampaignTermsAndConditions;
import com.woolworths.dynamic.page.fragment.ContentList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u001d\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/dynamic/page/DynamicPageQuery$Data;", "Data", "DynamicPage", "HeaderSection", "FeedItem", "OnCampaignCopy", "OnContentList", "OnCampaignTermsAndConditions", "OnCampaignCardCarousel", "CampaignCard", "OnCampaignCardList", "CampaignCard1", "OnQuickLinkList", "Item", "LinkCardAction", "OnCategoryTileList", "CategoryTileListTile", "FooterSection", "Action", "BottomSheet", "OnDynamicPageBottomSheet", "Analytics", "BottomSheetFeedItem", "OnCampaignCopy1", "OnContentList1", "OnCampaignTermsAndConditions1", "OnCampaignCardList1", "CampaignCard2", "Analytics1", "Companion", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DynamicPageQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final DynamicPageInput f19227a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$Action;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final String f19228a;
        public final String b;

        public Action(String str, String str2) {
            this.f19228a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return Intrinsics.c(this.f19228a, action.f19228a) && Intrinsics.c(this.b, action.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19228a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Action(label=", this.f19228a, ", action=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$Analytics;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f19229a;
        public final AnalyticsFields b;

        public Analytics(String str, AnalyticsFields analyticsFields) {
            this.f19229a = str;
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
            return Intrinsics.c(this.f19229a, analytics.f19229a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19229a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics(__typename=", this.f19229a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$Analytics1;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19230a;
        public final AnalyticsFields b;

        public Analytics1(String str, AnalyticsFields analyticsFields) {
            this.f19230a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics1)) {
                return false;
            }
            Analytics1 analytics1 = (Analytics1) obj;
            return Intrinsics.c(this.f19230a, analytics1.f19230a) && Intrinsics.c(this.b, analytics1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19230a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics1(__typename=", this.f19230a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$BottomSheet;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BottomSheet {

        /* renamed from: a, reason: collision with root package name */
        public final String f19231a;
        public final OnDynamicPageBottomSheet b;

        public BottomSheet(String __typename, OnDynamicPageBottomSheet onDynamicPageBottomSheet) {
            Intrinsics.h(__typename, "__typename");
            this.f19231a = __typename;
            this.b = onDynamicPageBottomSheet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BottomSheet)) {
                return false;
            }
            BottomSheet bottomSheet = (BottomSheet) obj;
            return Intrinsics.c(this.f19231a, bottomSheet.f19231a) && Intrinsics.c(this.b, bottomSheet.b);
        }

        public final int hashCode() {
            int iHashCode = this.f19231a.hashCode() * 31;
            OnDynamicPageBottomSheet onDynamicPageBottomSheet = this.b;
            return iHashCode + (onDynamicPageBottomSheet == null ? 0 : onDynamicPageBottomSheet.hashCode());
        }

        public final String toString() {
            return "BottomSheet(__typename=" + this.f19231a + ", onDynamicPageBottomSheet=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$BottomSheetFeedItem;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BottomSheetFeedItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f19232a;
        public final OnCampaignCopy1 b;
        public final OnContentList1 c;
        public final OnCampaignTermsAndConditions1 d;
        public final OnCampaignCardList1 e;

        public BottomSheetFeedItem(String __typename, OnCampaignCopy1 onCampaignCopy1, OnContentList1 onContentList1, OnCampaignTermsAndConditions1 onCampaignTermsAndConditions1, OnCampaignCardList1 onCampaignCardList1) {
            Intrinsics.h(__typename, "__typename");
            this.f19232a = __typename;
            this.b = onCampaignCopy1;
            this.c = onContentList1;
            this.d = onCampaignTermsAndConditions1;
            this.e = onCampaignCardList1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BottomSheetFeedItem)) {
                return false;
            }
            BottomSheetFeedItem bottomSheetFeedItem = (BottomSheetFeedItem) obj;
            return Intrinsics.c(this.f19232a, bottomSheetFeedItem.f19232a) && Intrinsics.c(this.b, bottomSheetFeedItem.b) && Intrinsics.c(this.c, bottomSheetFeedItem.c) && Intrinsics.c(this.d, bottomSheetFeedItem.d) && Intrinsics.c(this.e, bottomSheetFeedItem.e);
        }

        public final int hashCode() {
            int iHashCode = this.f19232a.hashCode() * 31;
            OnCampaignCopy1 onCampaignCopy1 = this.b;
            int iHashCode2 = (iHashCode + (onCampaignCopy1 == null ? 0 : onCampaignCopy1.hashCode())) * 31;
            OnContentList1 onContentList1 = this.c;
            int iHashCode3 = (iHashCode2 + (onContentList1 == null ? 0 : onContentList1.hashCode())) * 31;
            OnCampaignTermsAndConditions1 onCampaignTermsAndConditions1 = this.d;
            int iHashCode4 = (iHashCode3 + (onCampaignTermsAndConditions1 == null ? 0 : onCampaignTermsAndConditions1.hashCode())) * 31;
            OnCampaignCardList1 onCampaignCardList1 = this.e;
            return iHashCode4 + (onCampaignCardList1 != null ? onCampaignCardList1.hashCode() : 0);
        }

        public final String toString() {
            return "BottomSheetFeedItem(__typename=" + this.f19232a + ", onCampaignCopy=" + this.b + ", onContentList=" + this.c + ", onCampaignTermsAndConditions=" + this.d + ", onCampaignCardList=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$CampaignCard;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CampaignCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f19233a;
        public final com.woolworths.dynamic.page.fragment.CampaignCard b;

        public CampaignCard(String str, com.woolworths.dynamic.page.fragment.CampaignCard campaignCard) {
            this.f19233a = str;
            this.b = campaignCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CampaignCard)) {
                return false;
            }
            CampaignCard campaignCard = (CampaignCard) obj;
            return Intrinsics.c(this.f19233a, campaignCard.f19233a) && Intrinsics.c(this.b, campaignCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19233a.hashCode() * 31);
        }

        public final String toString() {
            return "CampaignCard(__typename=" + this.f19233a + ", campaignCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$CampaignCard1;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CampaignCard1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19234a;
        public final com.woolworths.dynamic.page.fragment.CampaignCard b;

        public CampaignCard1(String str, com.woolworths.dynamic.page.fragment.CampaignCard campaignCard) {
            this.f19234a = str;
            this.b = campaignCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CampaignCard1)) {
                return false;
            }
            CampaignCard1 campaignCard1 = (CampaignCard1) obj;
            return Intrinsics.c(this.f19234a, campaignCard1.f19234a) && Intrinsics.c(this.b, campaignCard1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19234a.hashCode() * 31);
        }

        public final String toString() {
            return "CampaignCard1(__typename=" + this.f19234a + ", campaignCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$CampaignCard2;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CampaignCard2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19235a;
        public final com.woolworths.dynamic.page.fragment.CampaignCard b;

        public CampaignCard2(String str, com.woolworths.dynamic.page.fragment.CampaignCard campaignCard) {
            this.f19235a = str;
            this.b = campaignCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CampaignCard2)) {
                return false;
            }
            CampaignCard2 campaignCard2 = (CampaignCard2) obj;
            return Intrinsics.c(this.f19235a, campaignCard2.f19235a) && Intrinsics.c(this.b, campaignCard2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19235a.hashCode() * 31);
        }

        public final String toString() {
            return "CampaignCard2(__typename=" + this.f19235a + ", campaignCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$CategoryTileListTile;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CategoryTileListTile {

        /* renamed from: a, reason: collision with root package name */
        public final String f19236a;
        public final String b;
        public final String c;
        public final String d;

        public CategoryTileListTile(String str, String str2, String str3, String str4) {
            this.f19236a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CategoryTileListTile)) {
                return false;
            }
            CategoryTileListTile categoryTileListTile = (CategoryTileListTile) obj;
            return Intrinsics.c(this.f19236a, categoryTileListTile.f19236a) && Intrinsics.c(this.b, categoryTileListTile.b) && Intrinsics.c(this.c, categoryTileListTile.c) && Intrinsics.c(this.d, categoryTileListTile.d);
        }

        public final int hashCode() {
            int iC = b.c(this.f19236a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(a.v("CategoryTileListTile(title=", this.f19236a, ", imageUrl=", this.b, ", imageAltText="), this.c, ", action=", this.d, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final DynamicPage f19237a;

        public Data(DynamicPage dynamicPage) {
            this.f19237a = dynamicPage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f19237a, ((Data) obj).f19237a);
        }

        public final int hashCode() {
            DynamicPage dynamicPage = this.f19237a;
            if (dynamicPage == null) {
                return 0;
            }
            return dynamicPage.hashCode();
        }

        public final String toString() {
            return "Data(dynamicPage=" + this.f19237a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$DynamicPage;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DynamicPage {

        /* renamed from: a, reason: collision with root package name */
        public final HeaderSection f19238a;
        public final ArrayList b;
        public final FooterSection c;
        public final List d;
        public final Analytics1 e;

        public DynamicPage(HeaderSection headerSection, ArrayList arrayList, FooterSection footerSection, List list, Analytics1 analytics1) {
            this.f19238a = headerSection;
            this.b = arrayList;
            this.c = footerSection;
            this.d = list;
            this.e = analytics1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DynamicPage)) {
                return false;
            }
            DynamicPage dynamicPage = (DynamicPage) obj;
            return this.f19238a.equals(dynamicPage.f19238a) && this.b.equals(dynamicPage.b) && Intrinsics.c(this.c, dynamicPage.c) && Intrinsics.c(this.d, dynamicPage.d) && this.e.equals(dynamicPage.e);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(this.f19238a.hashCode() * 31, 31, this.b);
            FooterSection footerSection = this.c;
            int iHashCode = (iB + (footerSection == null ? 0 : footerSection.f19240a.hashCode())) * 31;
            List list = this.d;
            return this.e.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "DynamicPage(headerSection=" + this.f19238a + ", feedItems=" + this.b + ", footerSection=" + this.c + ", bottomSheets=" + this.d + ", analytics=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$FeedItem;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FeedItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f19239a;
        public final OnCampaignCopy b;
        public final OnContentList c;
        public final OnCampaignTermsAndConditions d;
        public final OnCampaignCardCarousel e;
        public final OnCampaignCardList f;
        public final OnQuickLinkList g;
        public final OnCategoryTileList h;

        public FeedItem(String __typename, OnCampaignCopy onCampaignCopy, OnContentList onContentList, OnCampaignTermsAndConditions onCampaignTermsAndConditions, OnCampaignCardCarousel onCampaignCardCarousel, OnCampaignCardList onCampaignCardList, OnQuickLinkList onQuickLinkList, OnCategoryTileList onCategoryTileList) {
            Intrinsics.h(__typename, "__typename");
            this.f19239a = __typename;
            this.b = onCampaignCopy;
            this.c = onContentList;
            this.d = onCampaignTermsAndConditions;
            this.e = onCampaignCardCarousel;
            this.f = onCampaignCardList;
            this.g = onQuickLinkList;
            this.h = onCategoryTileList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeedItem)) {
                return false;
            }
            FeedItem feedItem = (FeedItem) obj;
            return Intrinsics.c(this.f19239a, feedItem.f19239a) && Intrinsics.c(this.b, feedItem.b) && Intrinsics.c(this.c, feedItem.c) && Intrinsics.c(this.d, feedItem.d) && Intrinsics.c(this.e, feedItem.e) && Intrinsics.c(this.f, feedItem.f) && Intrinsics.c(this.g, feedItem.g) && Intrinsics.c(this.h, feedItem.h);
        }

        public final int hashCode() {
            int iHashCode = this.f19239a.hashCode() * 31;
            OnCampaignCopy onCampaignCopy = this.b;
            int iHashCode2 = (iHashCode + (onCampaignCopy == null ? 0 : onCampaignCopy.hashCode())) * 31;
            OnContentList onContentList = this.c;
            int iHashCode3 = (iHashCode2 + (onContentList == null ? 0 : onContentList.hashCode())) * 31;
            OnCampaignTermsAndConditions onCampaignTermsAndConditions = this.d;
            int iHashCode4 = (iHashCode3 + (onCampaignTermsAndConditions == null ? 0 : onCampaignTermsAndConditions.hashCode())) * 31;
            OnCampaignCardCarousel onCampaignCardCarousel = this.e;
            int iHashCode5 = (iHashCode4 + (onCampaignCardCarousel == null ? 0 : onCampaignCardCarousel.hashCode())) * 31;
            OnCampaignCardList onCampaignCardList = this.f;
            int iHashCode6 = (iHashCode5 + (onCampaignCardList == null ? 0 : onCampaignCardList.hashCode())) * 31;
            OnQuickLinkList onQuickLinkList = this.g;
            int iHashCode7 = (iHashCode6 + (onQuickLinkList == null ? 0 : onQuickLinkList.f19255a.hashCode())) * 31;
            OnCategoryTileList onCategoryTileList = this.h;
            return iHashCode7 + (onCategoryTileList != null ? onCategoryTileList.hashCode() : 0);
        }

        public final String toString() {
            return "FeedItem(__typename=" + this.f19239a + ", onCampaignCopy=" + this.b + ", onContentList=" + this.c + ", onCampaignTermsAndConditions=" + this.d + ", onCampaignCardCarousel=" + this.e + ", onCampaignCardList=" + this.f + ", onQuickLinkList=" + this.g + ", onCategoryTileList=" + this.h + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$FooterSection;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FooterSection {

        /* renamed from: a, reason: collision with root package name */
        public final Action f19240a;

        public FooterSection(Action action) {
            this.f19240a = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FooterSection) && Intrinsics.c(this.f19240a, ((FooterSection) obj).f19240a);
        }

        public final int hashCode() {
            return this.f19240a.hashCode();
        }

        public final String toString() {
            return "FooterSection(action=" + this.f19240a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$HeaderSection;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeaderSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f19241a;
        public final String b;
        public final String c;
        public final String d;

        public HeaderSection(String str, String str2, String str3, String str4) {
            this.f19241a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeaderSection)) {
                return false;
            }
            HeaderSection headerSection = (HeaderSection) obj;
            return Intrinsics.c(this.f19241a, headerSection.f19241a) && Intrinsics.c(this.b, headerSection.b) && Intrinsics.c(this.c, headerSection.c) && Intrinsics.c(this.d, headerSection.d);
        }

        public final int hashCode() {
            int iHashCode = this.f19241a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(a.v("HeaderSection(title=", this.f19241a, ", imageUrl=", this.b, ", imageAltText="), this.c, ", shareUrl=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$Item;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f19242a;
        public final String b;
        public final String c;
        public final LinkCardAction d;

        public Item(String str, String str2, String str3, LinkCardAction linkCardAction) {
            this.f19242a = str;
            this.b = str2;
            this.c = str3;
            this.d = linkCardAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f19242a, item.f19242a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d);
        }

        public final int hashCode() {
            String str = this.f19242a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return this.d.hashCode() + b.c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Item(linkCardImage=", this.f19242a, ", linkCardSubtitle=", this.b, ", linkCardTitle=");
            sbV.append(this.c);
            sbV.append(", linkCardAction=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$LinkCardAction;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkCardAction {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f19243a;
        public final String b;

        public LinkCardAction(ActionType actionType, String str) {
            this.f19243a = actionType;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkCardAction)) {
                return false;
            }
            LinkCardAction linkCardAction = (LinkCardAction) obj;
            return this.f19243a == linkCardAction.f19243a && Intrinsics.c(this.b, linkCardAction.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19243a.hashCode() * 31);
        }

        public final String toString() {
            return "LinkCardAction(type=" + this.f19243a + ", action=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$OnCampaignCardCarousel;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCampaignCardCarousel {

        /* renamed from: a, reason: collision with root package name */
        public final String f19244a;
        public final ArrayList b;

        public OnCampaignCardCarousel(String str, ArrayList arrayList) {
            this.f19244a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCampaignCardCarousel)) {
                return false;
            }
            OnCampaignCardCarousel onCampaignCardCarousel = (OnCampaignCardCarousel) obj;
            return Intrinsics.c(this.f19244a, onCampaignCardCarousel.f19244a) && this.b.equals(onCampaignCardCarousel.b);
        }

        public final int hashCode() {
            String str = this.f19244a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return d.q("OnCampaignCardCarousel(campaignCardCarouselTitle=", this.f19244a, ", campaignCards=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$OnCampaignCardList;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCampaignCardList {

        /* renamed from: a, reason: collision with root package name */
        public final String f19245a;
        public final ArrayList b;

        public OnCampaignCardList(String str, ArrayList arrayList) {
            this.f19245a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCampaignCardList)) {
                return false;
            }
            OnCampaignCardList onCampaignCardList = (OnCampaignCardList) obj;
            return Intrinsics.c(this.f19245a, onCampaignCardList.f19245a) && this.b.equals(onCampaignCardList.b);
        }

        public final int hashCode() {
            String str = this.f19245a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return d.q("OnCampaignCardList(campaignCardListTitle=", this.f19245a, ", campaignCards=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$OnCampaignCardList1;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCampaignCardList1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19246a;
        public final ArrayList b;

        public OnCampaignCardList1(String str, ArrayList arrayList) {
            this.f19246a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCampaignCardList1)) {
                return false;
            }
            OnCampaignCardList1 onCampaignCardList1 = (OnCampaignCardList1) obj;
            return Intrinsics.c(this.f19246a, onCampaignCardList1.f19246a) && this.b.equals(onCampaignCardList1.b);
        }

        public final int hashCode() {
            String str = this.f19246a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return d.q("OnCampaignCardList1(campaignCardListTitle=", this.f19246a, ", campaignCards=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$OnCampaignCopy;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCampaignCopy {

        /* renamed from: a, reason: collision with root package name */
        public final String f19247a;
        public final CampaignCopy b;

        public OnCampaignCopy(String str, CampaignCopy campaignCopy) {
            this.f19247a = str;
            this.b = campaignCopy;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCampaignCopy)) {
                return false;
            }
            OnCampaignCopy onCampaignCopy = (OnCampaignCopy) obj;
            return Intrinsics.c(this.f19247a, onCampaignCopy.f19247a) && Intrinsics.c(this.b, onCampaignCopy.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19247a.hashCode() * 31);
        }

        public final String toString() {
            return "OnCampaignCopy(__typename=" + this.f19247a + ", campaignCopy=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$OnCampaignCopy1;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCampaignCopy1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19248a;
        public final CampaignCopy b;

        public OnCampaignCopy1(String str, CampaignCopy campaignCopy) {
            this.f19248a = str;
            this.b = campaignCopy;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCampaignCopy1)) {
                return false;
            }
            OnCampaignCopy1 onCampaignCopy1 = (OnCampaignCopy1) obj;
            return Intrinsics.c(this.f19248a, onCampaignCopy1.f19248a) && Intrinsics.c(this.b, onCampaignCopy1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19248a.hashCode() * 31);
        }

        public final String toString() {
            return "OnCampaignCopy1(__typename=" + this.f19248a + ", campaignCopy=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$OnCampaignTermsAndConditions;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCampaignTermsAndConditions {

        /* renamed from: a, reason: collision with root package name */
        public final String f19249a;
        public final CampaignTermsAndConditions b;

        public OnCampaignTermsAndConditions(String str, CampaignTermsAndConditions campaignTermsAndConditions) {
            this.f19249a = str;
            this.b = campaignTermsAndConditions;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCampaignTermsAndConditions)) {
                return false;
            }
            OnCampaignTermsAndConditions onCampaignTermsAndConditions = (OnCampaignTermsAndConditions) obj;
            return Intrinsics.c(this.f19249a, onCampaignTermsAndConditions.f19249a) && Intrinsics.c(this.b, onCampaignTermsAndConditions.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19249a.hashCode() * 31);
        }

        public final String toString() {
            return "OnCampaignTermsAndConditions(__typename=" + this.f19249a + ", campaignTermsAndConditions=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$OnCampaignTermsAndConditions1;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCampaignTermsAndConditions1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19250a;
        public final CampaignTermsAndConditions b;

        public OnCampaignTermsAndConditions1(String str, CampaignTermsAndConditions campaignTermsAndConditions) {
            this.f19250a = str;
            this.b = campaignTermsAndConditions;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCampaignTermsAndConditions1)) {
                return false;
            }
            OnCampaignTermsAndConditions1 onCampaignTermsAndConditions1 = (OnCampaignTermsAndConditions1) obj;
            return Intrinsics.c(this.f19250a, onCampaignTermsAndConditions1.f19250a) && Intrinsics.c(this.b, onCampaignTermsAndConditions1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19250a.hashCode() * 31);
        }

        public final String toString() {
            return "OnCampaignTermsAndConditions1(__typename=" + this.f19250a + ", campaignTermsAndConditions=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$OnCategoryTileList;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCategoryTileList {

        /* renamed from: a, reason: collision with root package name */
        public final String f19251a;
        public final ArrayList b;

        public OnCategoryTileList(String str, ArrayList arrayList) {
            this.f19251a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCategoryTileList)) {
                return false;
            }
            OnCategoryTileList onCategoryTileList = (OnCategoryTileList) obj;
            return Intrinsics.c(this.f19251a, onCategoryTileList.f19251a) && this.b.equals(onCategoryTileList.b);
        }

        public final int hashCode() {
            String str = this.f19251a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return d.q("OnCategoryTileList(categoryTileListTitle=", this.f19251a, ", categoryTileListTiles=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$OnContentList;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnContentList {

        /* renamed from: a, reason: collision with root package name */
        public final String f19252a;
        public final ContentList b;

        public OnContentList(String str, ContentList contentList) {
            this.f19252a = str;
            this.b = contentList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnContentList)) {
                return false;
            }
            OnContentList onContentList = (OnContentList) obj;
            return Intrinsics.c(this.f19252a, onContentList.f19252a) && Intrinsics.c(this.b, onContentList.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19252a.hashCode() * 31);
        }

        public final String toString() {
            return "OnContentList(__typename=" + this.f19252a + ", contentList=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$OnContentList1;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnContentList1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19253a;
        public final ContentList b;

        public OnContentList1(String str, ContentList contentList) {
            this.f19253a = str;
            this.b = contentList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnContentList1)) {
                return false;
            }
            OnContentList1 onContentList1 = (OnContentList1) obj;
            return Intrinsics.c(this.f19253a, onContentList1.f19253a) && Intrinsics.c(this.b, onContentList1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19253a.hashCode() * 31);
        }

        public final String toString() {
            return "OnContentList1(__typename=" + this.f19253a + ", contentList=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$OnDynamicPageBottomSheet;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnDynamicPageBottomSheet {

        /* renamed from: a, reason: collision with root package name */
        public final String f19254a;
        public final Analytics b;
        public final ArrayList c;

        public OnDynamicPageBottomSheet(String str, Analytics analytics, ArrayList arrayList) {
            this.f19254a = str;
            this.b = analytics;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnDynamicPageBottomSheet)) {
                return false;
            }
            OnDynamicPageBottomSheet onDynamicPageBottomSheet = (OnDynamicPageBottomSheet) obj;
            return this.f19254a.equals(onDynamicPageBottomSheet.f19254a) && Intrinsics.c(this.b, onDynamicPageBottomSheet.b) && this.c.equals(onDynamicPageBottomSheet.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19254a.hashCode() * 31;
            Analytics analytics = this.b;
            return this.c.hashCode() + ((iHashCode + (analytics == null ? 0 : analytics.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnDynamicPageBottomSheet(id=");
            sb.append(this.f19254a);
            sb.append(", analytics=");
            sb.append(this.b);
            sb.append(", bottomSheetFeedItems=");
            return android.support.v4.media.session.a.q(")", sb, this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/DynamicPageQuery$OnQuickLinkList;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnQuickLinkList {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f19255a;

        public OnQuickLinkList(ArrayList arrayList) {
            this.f19255a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnQuickLinkList) && this.f19255a.equals(((OnQuickLinkList) obj).f19255a);
        }

        public final int hashCode() {
            return this.f19255a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("OnQuickLinkList(items=", ")", this.f19255a);
        }
    }

    public DynamicPageQuery(DynamicPageInput dynamicPageInput) {
        this.f19227a = dynamicPageInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(DynamicPageQuery_ResponseAdapter.Data.f19265a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query DynamicPage($dynamicPageInput: DynamicPageInput!) { dynamicPage(dynamicPageInput: $dynamicPageInput) { headerSection { title imageUrl imageAltText shareUrl } feedItems { __typename ... on CampaignCopy { __typename ...campaignCopy } ... on ContentList { __typename ...contentList } ... on CampaignTermsAndConditions { __typename ...campaignTermsAndConditions } ... on CampaignCardCarousel { campaignCardCarouselTitle campaignCards { __typename ...campaignCard } } ... on CampaignCardList { campaignCardListTitle campaignCards { __typename ...campaignCard } } ... on QuickLinkList { items { linkCardImage linkCardSubtitle linkCardTitle linkCardAction { type action } } } ... on CategoryTileList { categoryTileListTitle categoryTileListTiles { title imageUrl imageAltText action } } } footerSection { action { label action } } bottomSheets { __typename ... on DynamicPageBottomSheet { id analytics { __typename ...analyticsFields } bottomSheetFeedItems { __typename ... on CampaignCopy { __typename ...campaignCopy } ... on ContentList { __typename ...contentList } ... on CampaignTermsAndConditions { __typename ...campaignTermsAndConditions } ... on CampaignCardList { campaignCardListTitle campaignCards { __typename ...campaignCard } } } } } analytics { __typename ...analyticsFields } } }  fragment campaignCopy on CampaignCopy { campaignCopyTitle campaignCopySubtitle campaignCopyBody }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment contentList on ContentList { contentListTitle contentListItems { title imageUrl imageAltText subtitle cta { label action analytics { __typename ...analyticsFields } } } }  fragment campaignTermsAndConditions on CampaignTermsAndConditions { termsAndConditionsTitle markdownText }  fragment campaignCard on CampaignCardBase { title imageUrl imageAltText action subtitle }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DynamicPageQuery) && Intrinsics.c(this.f19227a, ((DynamicPageQuery) obj).f19227a);
    }

    public final int hashCode() {
        return this.f19227a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "42aa8325a3e0fe5fc972f0957a62b4286cd9960ba3a830b5fafdd682f684f9d5";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "DynamicPage";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("dynamicPageInput");
        Adapters.c(DynamicPageInput_InputAdapter.f12071a, false).toJson(jsonWriter, customScalarAdapters, this.f19227a);
    }

    public final String toString() {
        return "DynamicPageQuery(dynamicPageInput=" + this.f19227a + ")";
    }
}
