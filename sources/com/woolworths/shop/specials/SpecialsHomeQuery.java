package com.woolworths.shop.specials;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.aem.components.contentcard.fragment.ContentCard;
import au.com.woolworths.shop.aem.components.offercard.fragment.OfferCard;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.BannerImageFormat;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.CatalogueCardType;
import au.com.woolworths.shop.graphql.type.FooterStyle;
import au.com.woolworths.shop.graphql.type.ParagraphTextItemType;
import au.com.woolworths.shop.graphql.type.SpecialsHomeInput;
import au.com.woolworths.shop.graphql.type.adapter.SpecialsHomeInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.specials.adapter.SpecialsHomeQuery_ResponseAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u001a\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/specials/SpecialsHomeQuery$Data;", "Data", "SpecialsHome", "Item", "OnHorizontalList", "Item1", "OnQuickLinkCard", "LinkCardAction", "OnProductCard", "OnOfferCard", "OnContentCard", "OnPromotionCard", "PromotionCardProduct", "OnCatalogueCard", "OnChatEntryCard", "ChatEntryCardAction", "Analytics", "OnActionableCard", "OnEditorialBanner", "EditorialBannerImage", "EditorialBannerAction", "Analytics1", "EditorialBannerFooter", "Logo", "EditorialBannerAnalytics", "OnParagraphTextItem", "Companion", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SpecialsHomeQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final SpecialsHomeInput f23704a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final boolean e;
    public final boolean f;
    public final Optional g;
    public final Optional h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$Analytics;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f23705a;
        public final AnalyticsFields b;

        public Analytics(String str, AnalyticsFields analyticsFields) {
            this.f23705a = str;
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
            return Intrinsics.c(this.f23705a, analytics.f23705a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23705a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics(__typename=", this.f23705a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$Analytics1;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23706a;
        public final AnalyticsFields b;

        public Analytics1(String str, AnalyticsFields analyticsFields) {
            this.f23706a = str;
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
            return Intrinsics.c(this.f23706a, analytics1.f23706a) && Intrinsics.c(this.b, analytics1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23706a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics1(__typename=", this.f23706a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$ChatEntryCardAction;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChatEntryCardAction {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f23707a;
        public final String b;
        public final String c;
        public final Analytics d;

        public ChatEntryCardAction(ActionType actionType, String str, String str2, Analytics analytics) {
            this.f23707a = actionType;
            this.b = str;
            this.c = str2;
            this.d = analytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChatEntryCardAction)) {
                return false;
            }
            ChatEntryCardAction chatEntryCardAction = (ChatEntryCardAction) obj;
            return this.f23707a == chatEntryCardAction.f23707a && Intrinsics.c(this.b, chatEntryCardAction.b) && Intrinsics.c(this.c, chatEntryCardAction.c) && Intrinsics.c(this.d, chatEntryCardAction.d);
        }

        public final int hashCode() {
            int iC = b.c(this.f23707a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Analytics analytics = this.d;
            return iHashCode + (analytics != null ? analytics.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbS = d.s("ChatEntryCardAction(type=", this.f23707a, ", action=", this.b, ", id=");
            sbS.append(this.c);
            sbS.append(", analytics=");
            sbS.append(this.d);
            sbS.append(")");
            return sbS.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final SpecialsHome f23708a;

        public Data(SpecialsHome specialsHome) {
            this.f23708a = specialsHome;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f23708a, ((Data) obj).f23708a);
        }

        public final int hashCode() {
            SpecialsHome specialsHome = this.f23708a;
            if (specialsHome == null) {
                return 0;
            }
            return specialsHome.f23729a.hashCode();
        }

        public final String toString() {
            return "Data(specialsHome=" + this.f23708a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$EditorialBannerAction;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EditorialBannerAction {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f23709a;
        public final String b;
        public final String c;
        public final Analytics1 d;

        public EditorialBannerAction(ActionType actionType, String str, String str2, Analytics1 analytics1) {
            this.f23709a = actionType;
            this.b = str;
            this.c = str2;
            this.d = analytics1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditorialBannerAction)) {
                return false;
            }
            EditorialBannerAction editorialBannerAction = (EditorialBannerAction) obj;
            return this.f23709a == editorialBannerAction.f23709a && Intrinsics.c(this.b, editorialBannerAction.b) && Intrinsics.c(this.c, editorialBannerAction.c) && Intrinsics.c(this.d, editorialBannerAction.d);
        }

        public final int hashCode() {
            int iC = b.c(this.f23709a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Analytics1 analytics1 = this.d;
            return iHashCode + (analytics1 != null ? analytics1.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbS = d.s("EditorialBannerAction(type=", this.f23709a, ", action=", this.b, ", id=");
            sbS.append(this.c);
            sbS.append(", analytics=");
            sbS.append(this.d);
            sbS.append(")");
            return sbS.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$EditorialBannerAnalytics;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EditorialBannerAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f23710a;
        public final AnalyticsFields b;

        public EditorialBannerAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f23710a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditorialBannerAnalytics)) {
                return false;
            }
            EditorialBannerAnalytics editorialBannerAnalytics = (EditorialBannerAnalytics) obj;
            return Intrinsics.c(this.f23710a, editorialBannerAnalytics.f23710a) && Intrinsics.c(this.b, editorialBannerAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23710a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("EditorialBannerAnalytics(__typename=", this.f23710a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$EditorialBannerFooter;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EditorialBannerFooter {

        /* renamed from: a, reason: collision with root package name */
        public final FooterStyle f23711a;
        public final String b;
        public final Logo c;

        public EditorialBannerFooter(FooterStyle footerStyle, String str, Logo logo) {
            this.f23711a = footerStyle;
            this.b = str;
            this.c = logo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditorialBannerFooter)) {
                return false;
            }
            EditorialBannerFooter editorialBannerFooter = (EditorialBannerFooter) obj;
            return this.f23711a == editorialBannerFooter.f23711a && Intrinsics.c(this.b, editorialBannerFooter.b) && Intrinsics.c(this.c, editorialBannerFooter.c);
        }

        public final int hashCode() {
            int iHashCode = this.f23711a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Logo logo = this.c;
            return iHashCode2 + (logo != null ? logo.hashCode() : 0);
        }

        public final String toString() {
            return "EditorialBannerFooter(style=" + this.f23711a + ", text=" + this.b + ", logo=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$EditorialBannerImage;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EditorialBannerImage {

        /* renamed from: a, reason: collision with root package name */
        public final String f23712a;
        public final String b;

        public EditorialBannerImage(String str, String str2) {
            this.f23712a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditorialBannerImage)) {
                return false;
            }
            EditorialBannerImage editorialBannerImage = (EditorialBannerImage) obj;
            return Intrinsics.c(this.f23712a, editorialBannerImage.f23712a) && Intrinsics.c(this.b, editorialBannerImage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23712a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("EditorialBannerImage(imageUrl=", this.f23712a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$Item;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f23713a;
        public final OnHorizontalList b;
        public final OnCatalogueCard c;
        public final OnChatEntryCard d;
        public final OnActionableCard e;
        public final OnEditorialBanner f;
        public final OnParagraphTextItem g;

        public Item(String __typename, OnHorizontalList onHorizontalList, OnCatalogueCard onCatalogueCard, OnChatEntryCard onChatEntryCard, OnActionableCard onActionableCard, OnEditorialBanner onEditorialBanner, OnParagraphTextItem onParagraphTextItem) {
            Intrinsics.h(__typename, "__typename");
            this.f23713a = __typename;
            this.b = onHorizontalList;
            this.c = onCatalogueCard;
            this.d = onChatEntryCard;
            this.e = onActionableCard;
            this.f = onEditorialBanner;
            this.g = onParagraphTextItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f23713a, item.f23713a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d) && Intrinsics.c(this.e, item.e) && Intrinsics.c(this.f, item.f) && Intrinsics.c(this.g, item.g);
        }

        public final int hashCode() {
            int iHashCode = this.f23713a.hashCode() * 31;
            OnHorizontalList onHorizontalList = this.b;
            int iHashCode2 = (iHashCode + (onHorizontalList == null ? 0 : onHorizontalList.hashCode())) * 31;
            OnCatalogueCard onCatalogueCard = this.c;
            int iHashCode3 = (iHashCode2 + (onCatalogueCard == null ? 0 : onCatalogueCard.hashCode())) * 31;
            OnChatEntryCard onChatEntryCard = this.d;
            int iHashCode4 = (iHashCode3 + (onChatEntryCard == null ? 0 : onChatEntryCard.hashCode())) * 31;
            OnActionableCard onActionableCard = this.e;
            int iHashCode5 = (iHashCode4 + (onActionableCard == null ? 0 : onActionableCard.hashCode())) * 31;
            OnEditorialBanner onEditorialBanner = this.f;
            int iHashCode6 = (iHashCode5 + (onEditorialBanner == null ? 0 : onEditorialBanner.hashCode())) * 31;
            OnParagraphTextItem onParagraphTextItem = this.g;
            return iHashCode6 + (onParagraphTextItem != null ? onParagraphTextItem.hashCode() : 0);
        }

        public final String toString() {
            return "Item(__typename=" + this.f23713a + ", onHorizontalList=" + this.b + ", onCatalogueCard=" + this.c + ", onChatEntryCard=" + this.d + ", onActionableCard=" + this.e + ", onEditorialBanner=" + this.f + ", onParagraphTextItem=" + this.g + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$Item1;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23714a;
        public final OnQuickLinkCard b;
        public final OnProductCard c;
        public final OnOfferCard d;
        public final OnContentCard e;
        public final OnPromotionCard f;

        public Item1(String __typename, OnQuickLinkCard onQuickLinkCard, OnProductCard onProductCard, OnOfferCard onOfferCard, OnContentCard onContentCard, OnPromotionCard onPromotionCard) {
            Intrinsics.h(__typename, "__typename");
            this.f23714a = __typename;
            this.b = onQuickLinkCard;
            this.c = onProductCard;
            this.d = onOfferCard;
            this.e = onContentCard;
            this.f = onPromotionCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item1)) {
                return false;
            }
            Item1 item1 = (Item1) obj;
            return Intrinsics.c(this.f23714a, item1.f23714a) && Intrinsics.c(this.b, item1.b) && Intrinsics.c(this.c, item1.c) && Intrinsics.c(this.d, item1.d) && Intrinsics.c(this.e, item1.e) && Intrinsics.c(this.f, item1.f);
        }

        public final int hashCode() {
            int iHashCode = this.f23714a.hashCode() * 31;
            OnQuickLinkCard onQuickLinkCard = this.b;
            int iHashCode2 = (iHashCode + (onQuickLinkCard == null ? 0 : onQuickLinkCard.hashCode())) * 31;
            OnProductCard onProductCard = this.c;
            int iHashCode3 = (iHashCode2 + (onProductCard == null ? 0 : onProductCard.hashCode())) * 31;
            OnOfferCard onOfferCard = this.d;
            int iHashCode4 = (iHashCode3 + (onOfferCard == null ? 0 : onOfferCard.hashCode())) * 31;
            OnContentCard onContentCard = this.e;
            int iHashCode5 = (iHashCode4 + (onContentCard == null ? 0 : onContentCard.hashCode())) * 31;
            OnPromotionCard onPromotionCard = this.f;
            return iHashCode5 + (onPromotionCard != null ? onPromotionCard.hashCode() : 0);
        }

        public final String toString() {
            return "Item1(__typename=" + this.f23714a + ", onQuickLinkCard=" + this.b + ", onProductCard=" + this.c + ", onOfferCard=" + this.d + ", onContentCard=" + this.e + ", onPromotionCard=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$LinkCardAction;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkCardAction {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f23715a;
        public final String b;

        public LinkCardAction(ActionType actionType, String str) {
            this.f23715a = actionType;
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
            return this.f23715a == linkCardAction.f23715a && Intrinsics.c(this.b, linkCardAction.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23715a.hashCode() * 31);
        }

        public final String toString() {
            return "LinkCardAction(type=" + this.f23715a + ", action=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$Logo;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Logo {

        /* renamed from: a, reason: collision with root package name */
        public final String f23716a;
        public final String b;

        public Logo(String str, String str2) {
            this.f23716a = str;
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
            return Intrinsics.c(this.f23716a, logo.f23716a) && Intrinsics.c(this.b, logo.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23716a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Logo(imageUrl=", this.f23716a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$OnActionableCard;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnActionableCard {

        /* renamed from: a, reason: collision with root package name */
        public final CardHeight f23717a;
        public final String b;
        public final String c;
        public final String d;

        public OnActionableCard(CardHeight cardHeight, String str, String str2, String str3) {
            this.f23717a = cardHeight;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnActionableCard)) {
                return false;
            }
            OnActionableCard onActionableCard = (OnActionableCard) obj;
            return this.f23717a == onActionableCard.f23717a && Intrinsics.c(this.b, onActionableCard.b) && Intrinsics.c(this.c, onActionableCard.c) && Intrinsics.c(this.d, onActionableCard.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + b.c(b.c(this.f23717a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnActionableCard(cardHeight=");
            sb.append(this.f23717a);
            sb.append(", altText=");
            sb.append(this.b);
            sb.append(", image=");
            return androidx.constraintlayout.core.state.a.l(sb, this.c, ", link=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$OnCatalogueCard;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCatalogueCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f23718a;
        public final String b;
        public final String c;
        public final String d;
        public final CatalogueCardType e;

        public OnCatalogueCard(String str, String str2, String str3, String str4, CatalogueCardType catalogueCardType) {
            this.f23718a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = catalogueCardType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCatalogueCard)) {
                return false;
            }
            OnCatalogueCard onCatalogueCard = (OnCatalogueCard) obj;
            return Intrinsics.c(this.f23718a, onCatalogueCard.f23718a) && Intrinsics.c(this.b, onCatalogueCard.b) && Intrinsics.c(this.c, onCatalogueCard.c) && Intrinsics.c(this.d, onCatalogueCard.d) && this.e == onCatalogueCard.e;
        }

        public final int hashCode() {
            String str = this.f23718a;
            int iC = b.c(b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
            String str2 = this.d;
            int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            CatalogueCardType catalogueCardType = this.e;
            return iHashCode + (catalogueCardType != null ? catalogueCardType.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnCatalogueCard(catalogueCardId=", this.f23718a, ", title=", this.b, ", catalogueCardSubtitle=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", imageLeft=", this.d, ", catalogueCardType=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$OnChatEntryCard;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnChatEntryCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f23719a;
        public final String b;
        public final Boolean c;
        public final ArrayList d;
        public final String e;
        public final ChatEntryCardAction f;

        public OnChatEntryCard(String str, String str2, Boolean bool, ArrayList arrayList, String str3, ChatEntryCardAction chatEntryCardAction) {
            this.f23719a = str;
            this.b = str2;
            this.c = bool;
            this.d = arrayList;
            this.e = str3;
            this.f = chatEntryCardAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnChatEntryCard)) {
                return false;
            }
            OnChatEntryCard onChatEntryCard = (OnChatEntryCard) obj;
            return this.f23719a.equals(onChatEntryCard.f23719a) && this.b.equals(onChatEntryCard.b) && Intrinsics.c(this.c, onChatEntryCard.c) && this.d.equals(onChatEntryCard.d) && this.e.equals(onChatEntryCard.e) && this.f.equals(onChatEntryCard.f);
        }

        public final int hashCode() {
            int iC = b.c(this.f23719a.hashCode() * 31, 31, this.b);
            Boolean bool = this.c;
            return this.f.hashCode() + b.c(androidx.compose.ui.input.pointer.a.b((iC + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnChatEntryCard(chatEntryCardTitle=", this.f23719a, ", chatEntryCardSubtitle=", this.b, ", chatEntryCardShowBeta=");
            sbV.append(this.c);
            sbV.append(", chatEntryCardTextPrompts=");
            sbV.append(this.d);
            sbV.append(", chatEntryCardImageUrl=");
            sbV.append(this.e);
            sbV.append(", chatEntryCardAction=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$OnContentCard;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnContentCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f23720a;
        public final ContentCard b;

        public OnContentCard(String str, ContentCard contentCard) {
            this.f23720a = str;
            this.b = contentCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnContentCard)) {
                return false;
            }
            OnContentCard onContentCard = (OnContentCard) obj;
            return Intrinsics.c(this.f23720a, onContentCard.f23720a) && Intrinsics.c(this.b, onContentCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23720a.hashCode() * 31);
        }

        public final String toString() {
            return "OnContentCard(__typename=" + this.f23720a + ", contentCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$OnEditorialBanner;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEditorialBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f23721a;
        public final String b;
        public final EditorialBannerImage c;
        public final String d;
        public final String e;
        public final EditorialBannerAction f;
        public final EditorialBannerFooter g;
        public final BannerImageFormat h;
        public final EditorialBannerAnalytics i;

        public OnEditorialBanner(String str, String str2, EditorialBannerImage editorialBannerImage, String str3, String str4, EditorialBannerAction editorialBannerAction, EditorialBannerFooter editorialBannerFooter, BannerImageFormat bannerImageFormat, EditorialBannerAnalytics editorialBannerAnalytics) {
            this.f23721a = str;
            this.b = str2;
            this.c = editorialBannerImage;
            this.d = str3;
            this.e = str4;
            this.f = editorialBannerAction;
            this.g = editorialBannerFooter;
            this.h = bannerImageFormat;
            this.i = editorialBannerAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnEditorialBanner)) {
                return false;
            }
            OnEditorialBanner onEditorialBanner = (OnEditorialBanner) obj;
            return Intrinsics.c(this.f23721a, onEditorialBanner.f23721a) && Intrinsics.c(this.b, onEditorialBanner.b) && Intrinsics.c(this.c, onEditorialBanner.c) && Intrinsics.c(this.d, onEditorialBanner.d) && Intrinsics.c(this.e, onEditorialBanner.e) && Intrinsics.c(this.f, onEditorialBanner.f) && Intrinsics.c(this.g, onEditorialBanner.g) && this.h == onEditorialBanner.h && Intrinsics.c(this.i, onEditorialBanner.i);
        }

        public final int hashCode() {
            int iC = b.c(this.f23721a.hashCode() * 31, 31, this.b);
            EditorialBannerImage editorialBannerImage = this.c;
            int iHashCode = (iC + (editorialBannerImage == null ? 0 : editorialBannerImage.hashCode())) * 31;
            String str = this.d;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            EditorialBannerAction editorialBannerAction = this.f;
            int iHashCode4 = (iHashCode3 + (editorialBannerAction == null ? 0 : editorialBannerAction.hashCode())) * 31;
            EditorialBannerFooter editorialBannerFooter = this.g;
            int iHashCode5 = (this.h.hashCode() + ((iHashCode4 + (editorialBannerFooter == null ? 0 : editorialBannerFooter.hashCode())) * 31)) * 31;
            EditorialBannerAnalytics editorialBannerAnalytics = this.i;
            return iHashCode5 + (editorialBannerAnalytics != null ? editorialBannerAnalytics.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnEditorialBanner(editorialBannerId=", this.f23721a, ", editorialBannerBackgroundColour=", this.b, ", editorialBannerImage=");
            sbV.append(this.c);
            sbV.append(", editorialBannerTitle=");
            sbV.append(this.d);
            sbV.append(", editorialBannerSubtitle=");
            sbV.append(this.e);
            sbV.append(", editorialBannerAction=");
            sbV.append(this.f);
            sbV.append(", editorialBannerFooter=");
            sbV.append(this.g);
            sbV.append(", editorialBannerImageFormat=");
            sbV.append(this.h);
            sbV.append(", editorialBannerAnalytics=");
            sbV.append(this.i);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$OnHorizontalList;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHorizontalList {

        /* renamed from: a, reason: collision with root package name */
        public final String f23722a;
        public final String b;
        public final String c;
        public final String d;
        public final ArrayList e;

        public OnHorizontalList(String str, String str2, String str3, String str4, ArrayList arrayList) {
            this.f23722a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnHorizontalList)) {
                return false;
            }
            OnHorizontalList onHorizontalList = (OnHorizontalList) obj;
            return this.f23722a.equals(onHorizontalList.f23722a) && Intrinsics.c(this.b, onHorizontalList.b) && Intrinsics.c(this.c, onHorizontalList.c) && Intrinsics.c(this.d, onHorizontalList.d) && this.e.equals(onHorizontalList.e);
        }

        public final int hashCode() {
            int iHashCode = this.f23722a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return this.e.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnHorizontalList(title=", this.f23722a, ", subtitle=", this.b, ", actionTitle=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", deepLink=", this.d, ", items=");
            return android.support.v4.media.session.a.q(")", sbV, this.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$OnOfferCard;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOfferCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f23723a;
        public final OfferCard b;

        public OnOfferCard(String str, OfferCard offerCard) {
            this.f23723a = str;
            this.b = offerCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOfferCard)) {
                return false;
            }
            OnOfferCard onOfferCard = (OnOfferCard) obj;
            return Intrinsics.c(this.f23723a, onOfferCard.f23723a) && Intrinsics.c(this.b, onOfferCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23723a.hashCode() * 31);
        }

        public final String toString() {
            return "OnOfferCard(__typename=" + this.f23723a + ", offerCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$OnParagraphTextItem;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnParagraphTextItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f23724a;
        public final ParagraphTextItemType b;

        public OnParagraphTextItem(ParagraphTextItemType paragraphTextItemType, String str) {
            this.f23724a = str;
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
            return Intrinsics.c(this.f23724a, onParagraphTextItem.f23724a) && this.b == onParagraphTextItem.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23724a.hashCode() * 31);
        }

        public final String toString() {
            return "OnParagraphTextItem(content=" + this.f23724a + ", type=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$OnProductCard;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f23725a;
        public final ProductCard b;

        public OnProductCard(String str, ProductCard productCard) {
            this.f23725a = str;
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
            return Intrinsics.c(this.f23725a, onProductCard.f23725a) && Intrinsics.c(this.b, onProductCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23725a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard(__typename=", this.f23725a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$OnPromotionCard;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPromotionCard {

        /* renamed from: a, reason: collision with root package name */
        public final PromotionCardProduct f23726a;
        public final String b;

        public OnPromotionCard(PromotionCardProduct promotionCardProduct, String str) {
            this.f23726a = promotionCardProduct;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPromotionCard)) {
                return false;
            }
            OnPromotionCard onPromotionCard = (OnPromotionCard) obj;
            return Intrinsics.c(this.f23726a, onPromotionCard.f23726a) && Intrinsics.c(this.b, onPromotionCard.b);
        }

        public final int hashCode() {
            int iHashCode = this.f23726a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "OnPromotionCard(promotionCardProduct=" + this.f23726a + ", promotionCardOfferId=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$OnQuickLinkCard;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnQuickLinkCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f23727a;
        public final String b;
        public final LinkCardAction c;

        public OnQuickLinkCard(String str, String str2, LinkCardAction linkCardAction) {
            this.f23727a = str;
            this.b = str2;
            this.c = linkCardAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnQuickLinkCard)) {
                return false;
            }
            OnQuickLinkCard onQuickLinkCard = (OnQuickLinkCard) obj;
            return Intrinsics.c(this.f23727a, onQuickLinkCard.f23727a) && Intrinsics.c(this.b, onQuickLinkCard.b) && Intrinsics.c(this.c, onQuickLinkCard.c);
        }

        public final int hashCode() {
            String str = this.f23727a;
            return this.c.hashCode() + b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnQuickLinkCard(linkCardImage=", this.f23727a, ", linkCardTitle=", this.b, ", linkCardAction=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$PromotionCardProduct;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PromotionCardProduct {

        /* renamed from: a, reason: collision with root package name */
        public final String f23728a;
        public final ProductCard b;

        public PromotionCardProduct(String str, ProductCard productCard) {
            this.f23728a = str;
            this.b = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromotionCardProduct)) {
                return false;
            }
            PromotionCardProduct promotionCardProduct = (PromotionCardProduct) obj;
            return Intrinsics.c(this.f23728a, promotionCardProduct.f23728a) && Intrinsics.c(this.b, promotionCardProduct.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23728a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("PromotionCardProduct(__typename=", this.f23728a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/specials/SpecialsHomeQuery$SpecialsHome;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SpecialsHome {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f23729a;

        public SpecialsHome(ArrayList arrayList) {
            this.f23729a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SpecialsHome) && this.f23729a.equals(((SpecialsHome) obj).f23729a);
        }

        public final int hashCode() {
            return this.f23729a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("SpecialsHome(items=", ")", this.f23729a);
        }
    }

    public SpecialsHomeQuery(SpecialsHomeInput specialsHomeInput, boolean z, boolean z2, Optional optional, Optional.Present present, boolean z3, boolean z4, boolean z5) {
        this.f23704a = specialsHomeInput;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.b = absent;
        this.c = absent;
        this.d = absent;
        this.e = z;
        this.f = z2;
        this.g = optional;
        this.h = present;
        this.i = z3;
        this.j = z4;
        this.k = z5;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(SpecialsHomeQuery_ResponseAdapter.Data.f23733a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query SpecialsHome($specialsHomeInput: SpecialsHomeInput!, $includeAvailabilityInfoStatus: Boolean! = false , $includeProductAvailabilityStates: Boolean! = false , $includeOfferMinimumSpend: Boolean! = false , $includePromotionCard: Boolean!, $includeActionableCard: Boolean!, $includePricingFootnote: Boolean! = false , $includeChatEntryCard: Boolean! = false , $includeEditorialBanner: Boolean!, $includeParagraphText: Boolean!, $includeLowestPrice14Days: Boolean!) { specialsHome(specialsHomeInput: $specialsHomeInput) { items { __typename ... on HorizontalList { title subtitle actionTitle deepLink items { __typename ... on QuickLinkCard { linkCardImage linkCardTitle linkCardAction { type action } } ... on ProductCard { __typename ...productCard } ... on OfferCard { __typename ...offerCard } ... on ContentCard { __typename ...contentCard } ... on PromotionCard @include(if: $includePromotionCard) { promotionCardProduct { __typename ...productCard } promotionCardOfferId } } } ... on CatalogueCard { catalogueCardId: id title catalogueCardSubtitle: subtitle imageLeft catalogueCardType } ... on ChatEntryCard @include(if: $includeChatEntryCard) { chatEntryCardTitle chatEntryCardSubtitle chatEntryCardShowBeta chatEntryCardTextPrompts chatEntryCardImageUrl chatEntryCardAction { type action id analytics { __typename ...analyticsFields } } } ... on ActionableCard @include(if: $includeActionableCard) { cardHeight altText image link } ... on EditorialBanner @include(if: $includeEditorialBanner) { editorialBannerId editorialBannerBackgroundColour editorialBannerImage { imageUrl altText } editorialBannerTitle editorialBannerSubtitle editorialBannerAction { type action id analytics { __typename ...analyticsFields } } editorialBannerFooter { style text logo { imageUrl altText } } editorialBannerImageFormat editorialBannerAnalytics { __typename ...analyticsFields } } ... on ParagraphTextItem @include(if: $includeParagraphText) { content type } } } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }  fragment offerCard on OfferCard { offerCardImageUrl offerCardTitle offerCardDescription offerCardBadgeImage { imageUrl altText } offerCardTextColor offerCardTextBackgroundColor offerCardPriceInfo { offerCardPriceInfoPriceDollars offerCardPriceInfoPriceCents offerCardPriceInfoPrefix1 offerCardPriceInfoPrefix2 offerCardPriceInfoSuffix } offerCardAnalytics { __typename ...analyticsFields } offerCardAction { action analytics { __typename ...analyticsFields } type } offerCardVariant }  fragment contentCard on ContentCard { contentCardId contentCardImageUrl contentCardTitle contentCardDescription contentCardAction { type action } contentCardBrandImage { imageUrl altText } contentCardFooter { style text logo { imageUrl altText } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecialsHomeQuery)) {
            return false;
        }
        SpecialsHomeQuery specialsHomeQuery = (SpecialsHomeQuery) obj;
        return Intrinsics.c(this.f23704a, specialsHomeQuery.f23704a) && Intrinsics.c(this.b, specialsHomeQuery.b) && Intrinsics.c(this.c, specialsHomeQuery.c) && Intrinsics.c(this.d, specialsHomeQuery.d) && this.e == specialsHomeQuery.e && this.f == specialsHomeQuery.f && Intrinsics.c(this.g, specialsHomeQuery.g) && Intrinsics.c(this.h, specialsHomeQuery.h) && this.i == specialsHomeQuery.i && this.j == specialsHomeQuery.j && this.k == specialsHomeQuery.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + b.e(b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.h, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.g, b.e(b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.d, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.c, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.b, this.f23704a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, this.f), 31), 31), 31, this.i), 31, this.j);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "a9fc38ef0a4c2e7ac9cd67374c25edca1b7ee7b6c1bd884f9a010bfc386d6f5b";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "SpecialsHome";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("specialsHomeInput");
        Adapters.c(SpecialsHomeInput_InputAdapter.f12119a, false).toJson(jsonWriter, customScalarAdapters, this.f23704a);
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
        jsonWriter.F1("includePromotionCard");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        d.B(this.e, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeActionableCard");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.f));
        Optional optional4 = this.g;
        if (optional4 instanceof Optional.Present) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional4);
        } else if (z) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional5 = this.h;
        if (optional5 instanceof Optional.Present) {
            jsonWriter.F1("includeChatEntryCard");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional5);
        } else if (z) {
            jsonWriter.F1("includeChatEntryCard");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        jsonWriter.F1("includeEditorialBanner");
        d.B(this.i, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeParagraphText");
        d.B(this.j, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeLowestPrice14Days");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.k));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpecialsHomeQuery(specialsHomeInput=");
        sb.append(this.f23704a);
        sb.append(", includeAvailabilityInfoStatus=");
        sb.append(this.b);
        sb.append(", includeProductAvailabilityStates=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.c, ", includeOfferMinimumSpend=", this.d, ", includePromotionCard=");
        au.com.woolworths.android.onesite.a.D(sb, this.e, ", includeActionableCard=", this.f, ", includePricingFootnote=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.g, ", includeChatEntryCard=", this.h, ", includeEditorialBanner=");
        au.com.woolworths.android.onesite.a.D(sb, this.i, ", includeParagraphText=", this.j, ", includeLowestPrice14Days=");
        return a.k(")", sb, this.k);
    }
}
