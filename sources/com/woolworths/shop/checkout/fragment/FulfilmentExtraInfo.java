package com.woolworths.shop.checkout.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.CoreAlertStyle;
import au.com.woolworths.shop.graphql.type.CoreBroadcastBannerStyle;
import au.com.woolworths.shop.graphql.type.ParagraphTextItemType;
import com.apollographql.apollo.api.Fragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001:\u001c\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Content", "OnBasicInsetAlert", "InsetAlertUI", "InsetAlertAction", "Analytics", "OnBasicCoreBroadcastBanner", "ImpressionAnalytics", "BroadcastBannerDismissAnalytics", "BroadcastBannerUI", "Icon", "OnCoreIcon", "OnHostedIcon", "BroadcastBannerAction", "OnFulfilmentFeesInfoSection", "Item", "OnFulfilmentFeeItem", "Price", "OnFulfilmentFeePriceInfo", "OnCheckoutTermsConditions", "OnFulfilmentInfoRowAccordion", "OpenActionAnalytics", "CloseActionAnalytics", "RowUI", "LeadingAsset", "OnHostedIcon1", "OnCoreIcon1", "ExpandedContent", "OnParagraphTextItem", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FulfilmentExtraInfo implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f22478a;
    public final ArrayList b;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$Analytics;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22479a;
        public final AnalyticsFields b;

        public Analytics(String str, AnalyticsFields analyticsFields) {
            this.f22479a = str;
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
            return Intrinsics.c(this.f22479a, analytics.f22479a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22479a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics(__typename=", this.f22479a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$BroadcastBannerAction;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BroadcastBannerAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f22480a;
        public final String b;
        public final ActionType c;

        public BroadcastBannerAction(ActionType actionType, String str, String str2) {
            this.f22480a = str;
            this.b = str2;
            this.c = actionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BroadcastBannerAction)) {
                return false;
            }
            BroadcastBannerAction broadcastBannerAction = (BroadcastBannerAction) obj;
            return Intrinsics.c(this.f22480a, broadcastBannerAction.f22480a) && Intrinsics.c(this.b, broadcastBannerAction.b) && this.c == broadcastBannerAction.c;
        }

        public final int hashCode() {
            int iHashCode = this.f22480a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("BroadcastBannerAction(action=", this.f22480a, ", id=", this.b, ", type=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$BroadcastBannerDismissAnalytics;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BroadcastBannerDismissAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22481a;
        public final AnalyticsFields b;

        public BroadcastBannerDismissAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f22481a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BroadcastBannerDismissAnalytics)) {
                return false;
            }
            BroadcastBannerDismissAnalytics broadcastBannerDismissAnalytics = (BroadcastBannerDismissAnalytics) obj;
            return Intrinsics.c(this.f22481a, broadcastBannerDismissAnalytics.f22481a) && Intrinsics.c(this.b, broadcastBannerDismissAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22481a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("BroadcastBannerDismissAnalytics(__typename=", this.f22481a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$BroadcastBannerUI;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BroadcastBannerUI {

        /* renamed from: a, reason: collision with root package name */
        public final String f22482a;
        public final String b;
        public final CoreBroadcastBannerStyle c;
        public final Icon d;

        public BroadcastBannerUI(String str, String str2, CoreBroadcastBannerStyle coreBroadcastBannerStyle, Icon icon) {
            this.f22482a = str;
            this.b = str2;
            this.c = coreBroadcastBannerStyle;
            this.d = icon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BroadcastBannerUI)) {
                return false;
            }
            BroadcastBannerUI broadcastBannerUI = (BroadcastBannerUI) obj;
            return Intrinsics.c(this.f22482a, broadcastBannerUI.f22482a) && Intrinsics.c(this.b, broadcastBannerUI.b) && this.c == broadcastBannerUI.c && Intrinsics.c(this.d, broadcastBannerUI.d);
        }

        public final int hashCode() {
            int iHashCode = this.f22482a.hashCode() * 31;
            String str = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("BroadcastBannerUI(title=", this.f22482a, ", subtitle=", this.b, ", style=");
            sbV.append(this.c);
            sbV.append(", icon=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$CloseActionAnalytics;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CloseActionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22483a;
        public final AnalyticsFields b;

        public CloseActionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f22483a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CloseActionAnalytics)) {
                return false;
            }
            CloseActionAnalytics closeActionAnalytics = (CloseActionAnalytics) obj;
            return Intrinsics.c(this.f22483a, closeActionAnalytics.f22483a) && Intrinsics.c(this.b, closeActionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22483a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("CloseActionAnalytics(__typename=", this.f22483a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$Content;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Content {

        /* renamed from: a, reason: collision with root package name */
        public final String f22484a;
        public final OnBasicInsetAlert b;
        public final OnBasicCoreBroadcastBanner c;
        public final OnFulfilmentFeesInfoSection d;
        public final OnCheckoutTermsConditions e;
        public final OnFulfilmentInfoRowAccordion f;

        public Content(String __typename, OnBasicInsetAlert onBasicInsetAlert, OnBasicCoreBroadcastBanner onBasicCoreBroadcastBanner, OnFulfilmentFeesInfoSection onFulfilmentFeesInfoSection, OnCheckoutTermsConditions onCheckoutTermsConditions, OnFulfilmentInfoRowAccordion onFulfilmentInfoRowAccordion) {
            Intrinsics.h(__typename, "__typename");
            this.f22484a = __typename;
            this.b = onBasicInsetAlert;
            this.c = onBasicCoreBroadcastBanner;
            this.d = onFulfilmentFeesInfoSection;
            this.e = onCheckoutTermsConditions;
            this.f = onFulfilmentInfoRowAccordion;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.c(this.f22484a, content.f22484a) && Intrinsics.c(this.b, content.b) && Intrinsics.c(this.c, content.c) && Intrinsics.c(this.d, content.d) && Intrinsics.c(this.e, content.e) && Intrinsics.c(this.f, content.f);
        }

        public final int hashCode() {
            int iHashCode = this.f22484a.hashCode() * 31;
            OnBasicInsetAlert onBasicInsetAlert = this.b;
            int iHashCode2 = (iHashCode + (onBasicInsetAlert == null ? 0 : onBasicInsetAlert.hashCode())) * 31;
            OnBasicCoreBroadcastBanner onBasicCoreBroadcastBanner = this.c;
            int iHashCode3 = (iHashCode2 + (onBasicCoreBroadcastBanner == null ? 0 : onBasicCoreBroadcastBanner.hashCode())) * 31;
            OnFulfilmentFeesInfoSection onFulfilmentFeesInfoSection = this.d;
            int iHashCode4 = (iHashCode3 + (onFulfilmentFeesInfoSection == null ? 0 : onFulfilmentFeesInfoSection.hashCode())) * 31;
            OnCheckoutTermsConditions onCheckoutTermsConditions = this.e;
            int iHashCode5 = (iHashCode4 + (onCheckoutTermsConditions == null ? 0 : onCheckoutTermsConditions.f22494a.hashCode())) * 31;
            OnFulfilmentInfoRowAccordion onFulfilmentInfoRowAccordion = this.f;
            return iHashCode5 + (onFulfilmentInfoRowAccordion != null ? onFulfilmentInfoRowAccordion.hashCode() : 0);
        }

        public final String toString() {
            return "Content(__typename=" + this.f22484a + ", onBasicInsetAlert=" + this.b + ", onBasicCoreBroadcastBanner=" + this.c + ", onFulfilmentFeesInfoSection=" + this.d + ", onCheckoutTermsConditions=" + this.e + ", onFulfilmentInfoRowAccordion=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$ExpandedContent;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ExpandedContent {

        /* renamed from: a, reason: collision with root package name */
        public final String f22485a;
        public final OnParagraphTextItem b;

        public ExpandedContent(String __typename, OnParagraphTextItem onParagraphTextItem) {
            Intrinsics.h(__typename, "__typename");
            this.f22485a = __typename;
            this.b = onParagraphTextItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExpandedContent)) {
                return false;
            }
            ExpandedContent expandedContent = (ExpandedContent) obj;
            return Intrinsics.c(this.f22485a, expandedContent.f22485a) && Intrinsics.c(this.b, expandedContent.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22485a.hashCode() * 31;
            OnParagraphTextItem onParagraphTextItem = this.b;
            return iHashCode + (onParagraphTextItem == null ? 0 : onParagraphTextItem.hashCode());
        }

        public final String toString() {
            return "ExpandedContent(__typename=" + this.f22485a + ", onParagraphTextItem=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$Icon;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Icon {

        /* renamed from: a, reason: collision with root package name */
        public final String f22486a;
        public final OnCoreIcon b;
        public final OnHostedIcon c;

        public Icon(String __typename, OnCoreIcon onCoreIcon, OnHostedIcon onHostedIcon) {
            Intrinsics.h(__typename, "__typename");
            this.f22486a = __typename;
            this.b = onCoreIcon;
            this.c = onHostedIcon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) obj;
            return Intrinsics.c(this.f22486a, icon.f22486a) && Intrinsics.c(this.b, icon.b) && Intrinsics.c(this.c, icon.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22486a.hashCode() * 31;
            OnCoreIcon onCoreIcon = this.b;
            int iHashCode2 = (iHashCode + (onCoreIcon == null ? 0 : onCoreIcon.f22495a.hashCode())) * 31;
            OnHostedIcon onHostedIcon = this.c;
            return iHashCode2 + (onHostedIcon != null ? onHostedIcon.f22501a.hashCode() : 0);
        }

        public final String toString() {
            return "Icon(__typename=" + this.f22486a + ", onCoreIcon=" + this.b + ", onHostedIcon=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$ImpressionAnalytics;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22487a;
        public final AnalyticsFields b;

        public ImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f22487a = str;
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
            return Intrinsics.c(this.f22487a, impressionAnalytics.f22487a) && Intrinsics.c(this.b, impressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22487a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics(__typename=", this.f22487a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$InsetAlertAction;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InsetAlertAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f22488a;
        public final ActionType b;
        public final String c;
        public final Analytics d;

        public InsetAlertAction(String str, ActionType actionType, String str2, Analytics analytics) {
            this.f22488a = str;
            this.b = actionType;
            this.c = str2;
            this.d = analytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InsetAlertAction)) {
                return false;
            }
            InsetAlertAction insetAlertAction = (InsetAlertAction) obj;
            return Intrinsics.c(this.f22488a, insetAlertAction.f22488a) && this.b == insetAlertAction.b && Intrinsics.c(this.c, insetAlertAction.c) && Intrinsics.c(this.d, insetAlertAction.d);
        }

        public final int hashCode() {
            String str = this.f22488a;
            int iC = b.c(d.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.c);
            Analytics analytics = this.d;
            return iC + (analytics != null ? analytics.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbW = d.w("InsetAlertAction(id=", this.f22488a, ", type=", this.b, ", action=");
            sbW.append(this.c);
            sbW.append(", analytics=");
            sbW.append(this.d);
            sbW.append(")");
            return sbW.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$InsetAlertUI;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InsetAlertUI {

        /* renamed from: a, reason: collision with root package name */
        public final String f22489a;
        public final String b;
        public final CoreAlertStyle c;

        public InsetAlertUI(CoreAlertStyle coreAlertStyle, String str, String str2) {
            this.f22489a = str;
            this.b = str2;
            this.c = coreAlertStyle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InsetAlertUI)) {
                return false;
            }
            InsetAlertUI insetAlertUI = (InsetAlertUI) obj;
            return Intrinsics.c(this.f22489a, insetAlertUI.f22489a) && Intrinsics.c(this.b, insetAlertUI.b) && this.c == insetAlertUI.c;
        }

        public final int hashCode() {
            String str = this.f22489a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("InsetAlertUI(title=", this.f22489a, ", description=", this.b, ", style=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$Item;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f22490a;
        public final OnFulfilmentFeeItem b;

        public Item(String str, OnFulfilmentFeeItem onFulfilmentFeeItem) {
            this.f22490a = str;
            this.b = onFulfilmentFeeItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f22490a, item.f22490a) && Intrinsics.c(this.b, item.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22490a.hashCode() * 31);
        }

        public final String toString() {
            return "Item(__typename=" + this.f22490a + ", onFulfilmentFeeItem=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$LeadingAsset;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LeadingAsset {

        /* renamed from: a, reason: collision with root package name */
        public final String f22491a;
        public final OnHostedIcon1 b;
        public final OnCoreIcon1 c;

        public LeadingAsset(String __typename, OnHostedIcon1 onHostedIcon1, OnCoreIcon1 onCoreIcon1) {
            Intrinsics.h(__typename, "__typename");
            this.f22491a = __typename;
            this.b = onHostedIcon1;
            this.c = onCoreIcon1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LeadingAsset)) {
                return false;
            }
            LeadingAsset leadingAsset = (LeadingAsset) obj;
            return Intrinsics.c(this.f22491a, leadingAsset.f22491a) && Intrinsics.c(this.b, leadingAsset.b) && Intrinsics.c(this.c, leadingAsset.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22491a.hashCode() * 31;
            OnHostedIcon1 onHostedIcon1 = this.b;
            int iHashCode2 = (iHashCode + (onHostedIcon1 == null ? 0 : onHostedIcon1.f22502a.hashCode())) * 31;
            OnCoreIcon1 onCoreIcon1 = this.c;
            return iHashCode2 + (onCoreIcon1 != null ? onCoreIcon1.f22496a.hashCode() : 0);
        }

        public final String toString() {
            return "LeadingAsset(__typename=" + this.f22491a + ", onHostedIcon=" + this.b + ", onCoreIcon=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OnBasicCoreBroadcastBanner;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBasicCoreBroadcastBanner {

        /* renamed from: a, reason: collision with root package name */
        public final ImpressionAnalytics f22492a;
        public final BroadcastBannerDismissAnalytics b;
        public final BroadcastBannerUI c;
        public final BroadcastBannerAction d;
        public final String e;
        public final String f;
        public final boolean g;

        public OnBasicCoreBroadcastBanner(ImpressionAnalytics impressionAnalytics, BroadcastBannerDismissAnalytics broadcastBannerDismissAnalytics, BroadcastBannerUI broadcastBannerUI, BroadcastBannerAction broadcastBannerAction, String str, String str2, boolean z) {
            this.f22492a = impressionAnalytics;
            this.b = broadcastBannerDismissAnalytics;
            this.c = broadcastBannerUI;
            this.d = broadcastBannerAction;
            this.e = str;
            this.f = str2;
            this.g = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBasicCoreBroadcastBanner)) {
                return false;
            }
            OnBasicCoreBroadcastBanner onBasicCoreBroadcastBanner = (OnBasicCoreBroadcastBanner) obj;
            return Intrinsics.c(this.f22492a, onBasicCoreBroadcastBanner.f22492a) && Intrinsics.c(this.b, onBasicCoreBroadcastBanner.b) && Intrinsics.c(this.c, onBasicCoreBroadcastBanner.c) && Intrinsics.c(this.d, onBasicCoreBroadcastBanner.d) && Intrinsics.c(this.e, onBasicCoreBroadcastBanner.e) && Intrinsics.c(this.f, onBasicCoreBroadcastBanner.f) && this.g == onBasicCoreBroadcastBanner.g;
        }

        public final int hashCode() {
            ImpressionAnalytics impressionAnalytics = this.f22492a;
            int iHashCode = (impressionAnalytics == null ? 0 : impressionAnalytics.hashCode()) * 31;
            BroadcastBannerDismissAnalytics broadcastBannerDismissAnalytics = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (broadcastBannerDismissAnalytics == null ? 0 : broadcastBannerDismissAnalytics.hashCode())) * 31)) * 31;
            BroadcastBannerAction broadcastBannerAction = this.d;
            int iHashCode3 = (iHashCode2 + (broadcastBannerAction == null ? 0 : broadcastBannerAction.hashCode())) * 31;
            String str = this.e;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            return Boolean.hashCode(this.g) + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnBasicCoreBroadcastBanner(impressionAnalytics=");
            sb.append(this.f22492a);
            sb.append(", broadcastBannerDismissAnalytics=");
            sb.append(this.b);
            sb.append(", broadcastBannerUI=");
            sb.append(this.c);
            sb.append(", broadcastBannerAction=");
            sb.append(this.d);
            sb.append(", broadcastBannerActionLabel=");
            androidx.constraintlayout.core.state.a.B(sb, this.e, ", broadcastBannerId=", this.f, ", broadcastBannerDismissible=");
            return a.k(")", sb, this.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OnBasicInsetAlert;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBasicInsetAlert {

        /* renamed from: a, reason: collision with root package name */
        public final InsetAlertUI f22493a;
        public final InsetAlertAction b;
        public final String c;

        public OnBasicInsetAlert(InsetAlertUI insetAlertUI, InsetAlertAction insetAlertAction, String str) {
            this.f22493a = insetAlertUI;
            this.b = insetAlertAction;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBasicInsetAlert)) {
                return false;
            }
            OnBasicInsetAlert onBasicInsetAlert = (OnBasicInsetAlert) obj;
            return Intrinsics.c(this.f22493a, onBasicInsetAlert.f22493a) && Intrinsics.c(this.b, onBasicInsetAlert.b) && Intrinsics.c(this.c, onBasicInsetAlert.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22493a.hashCode() * 31;
            InsetAlertAction insetAlertAction = this.b;
            int iHashCode2 = (iHashCode + (insetAlertAction == null ? 0 : insetAlertAction.hashCode())) * 31;
            String str = this.c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnBasicInsetAlert(insetAlertUI=");
            sb.append(this.f22493a);
            sb.append(", insetAlertAction=");
            sb.append(this.b);
            sb.append(", insetAlertActionLabel=");
            return a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OnCheckoutTermsConditions;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutTermsConditions {

        /* renamed from: a, reason: collision with root package name */
        public final String f22494a;

        public OnCheckoutTermsConditions(String str) {
            this.f22494a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCheckoutTermsConditions) && Intrinsics.c(this.f22494a, ((OnCheckoutTermsConditions) obj).f22494a);
        }

        public final int hashCode() {
            return this.f22494a.hashCode();
        }

        public final String toString() {
            return a.h("OnCheckoutTermsConditions(markdownText=", this.f22494a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OnCoreIcon;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCoreIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f22495a;

        public OnCoreIcon(String str) {
            this.f22495a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCoreIcon) && Intrinsics.c(this.f22495a, ((OnCoreIcon) obj).f22495a);
        }

        public final int hashCode() {
            return this.f22495a.hashCode();
        }

        public final String toString() {
            return a.h("OnCoreIcon(coreIconName=", this.f22495a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OnCoreIcon1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCoreIcon1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22496a;

        public OnCoreIcon1(String str) {
            this.f22496a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCoreIcon1) && Intrinsics.c(this.f22496a, ((OnCoreIcon1) obj).f22496a);
        }

        public final int hashCode() {
            return this.f22496a.hashCode();
        }

        public final String toString() {
            return a.h("OnCoreIcon1(coreIconName=", this.f22496a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OnFulfilmentFeeItem;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnFulfilmentFeeItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f22497a;
        public final String b;
        public final ArrayList c;

        public OnFulfilmentFeeItem(String str, String str2, ArrayList arrayList) {
            this.f22497a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnFulfilmentFeeItem)) {
                return false;
            }
            OnFulfilmentFeeItem onFulfilmentFeeItem = (OnFulfilmentFeeItem) obj;
            return this.f22497a.equals(onFulfilmentFeeItem.f22497a) && Intrinsics.c(this.b, onFulfilmentFeeItem.b) && this.c.equals(onFulfilmentFeeItem.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22497a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", a.v("OnFulfilmentFeeItem(title=", this.f22497a, ", subtitle=", this.b, ", prices="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OnFulfilmentFeePriceInfo;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnFulfilmentFeePriceInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f22498a;
        public final String b;

        public OnFulfilmentFeePriceInfo(String str, String str2) {
            this.f22498a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnFulfilmentFeePriceInfo)) {
                return false;
            }
            OnFulfilmentFeePriceInfo onFulfilmentFeePriceInfo = (OnFulfilmentFeePriceInfo) obj;
            return Intrinsics.c(this.f22498a, onFulfilmentFeePriceInfo.f22498a) && Intrinsics.c(this.b, onFulfilmentFeePriceInfo.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22498a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("OnFulfilmentFeePriceInfo(amount=", this.f22498a, ", description=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OnFulfilmentFeesInfoSection;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnFulfilmentFeesInfoSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f22499a;
        public final ArrayList b;

        public OnFulfilmentFeesInfoSection(String str, ArrayList arrayList) {
            this.f22499a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnFulfilmentFeesInfoSection)) {
                return false;
            }
            OnFulfilmentFeesInfoSection onFulfilmentFeesInfoSection = (OnFulfilmentFeesInfoSection) obj;
            return Intrinsics.c(this.f22499a, onFulfilmentFeesInfoSection.f22499a) && this.b.equals(onFulfilmentFeesInfoSection.b);
        }

        public final int hashCode() {
            String str = this.f22499a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return d.q("OnFulfilmentFeesInfoSection(feesInfoSectionTitle=", this.f22499a, ", items=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OnFulfilmentInfoRowAccordion;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnFulfilmentInfoRowAccordion {

        /* renamed from: a, reason: collision with root package name */
        public final OpenActionAnalytics f22500a;
        public final CloseActionAnalytics b;
        public final RowUI c;
        public final boolean d;
        public final boolean e;
        public final ExpandedContent f;

        public OnFulfilmentInfoRowAccordion(OpenActionAnalytics openActionAnalytics, CloseActionAnalytics closeActionAnalytics, RowUI rowUI, boolean z, boolean z2, ExpandedContent expandedContent) {
            this.f22500a = openActionAnalytics;
            this.b = closeActionAnalytics;
            this.c = rowUI;
            this.d = z;
            this.e = z2;
            this.f = expandedContent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnFulfilmentInfoRowAccordion)) {
                return false;
            }
            OnFulfilmentInfoRowAccordion onFulfilmentInfoRowAccordion = (OnFulfilmentInfoRowAccordion) obj;
            return Intrinsics.c(this.f22500a, onFulfilmentInfoRowAccordion.f22500a) && Intrinsics.c(this.b, onFulfilmentInfoRowAccordion.b) && Intrinsics.c(this.c, onFulfilmentInfoRowAccordion.c) && this.d == onFulfilmentInfoRowAccordion.d && this.e == onFulfilmentInfoRowAccordion.e && Intrinsics.c(this.f, onFulfilmentInfoRowAccordion.f);
        }

        public final int hashCode() {
            OpenActionAnalytics openActionAnalytics = this.f22500a;
            int iHashCode = (openActionAnalytics == null ? 0 : openActionAnalytics.hashCode()) * 31;
            CloseActionAnalytics closeActionAnalytics = this.b;
            int iE = b.e(b.e((this.c.hashCode() + ((iHashCode + (closeActionAnalytics == null ? 0 : closeActionAnalytics.hashCode())) * 31)) * 31, 31, this.d), 31, this.e);
            ExpandedContent expandedContent = this.f;
            return iE + (expandedContent != null ? expandedContent.hashCode() : 0);
        }

        public final String toString() {
            return "OnFulfilmentInfoRowAccordion(openActionAnalytics=" + this.f22500a + ", closeActionAnalytics=" + this.b + ", rowUI=" + this.c + ", isExpanded=" + this.d + ", hasTopSeparator=" + this.e + ", expandedContent=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OnHostedIcon;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f22501a;

        public OnHostedIcon(String str) {
            this.f22501a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon) && Intrinsics.c(this.f22501a, ((OnHostedIcon) obj).f22501a);
        }

        public final int hashCode() {
            return this.f22501a.hashCode();
        }

        public final String toString() {
            return a.h("OnHostedIcon(url=", this.f22501a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OnHostedIcon1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22502a;

        public OnHostedIcon1(String str) {
            this.f22502a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon1) && Intrinsics.c(this.f22502a, ((OnHostedIcon1) obj).f22502a);
        }

        public final int hashCode() {
            return this.f22502a.hashCode();
        }

        public final String toString() {
            return a.h("OnHostedIcon1(url=", this.f22502a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OnParagraphTextItem;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnParagraphTextItem {

        /* renamed from: a, reason: collision with root package name */
        public final ParagraphTextItemType f22503a;
        public final String b;

        public OnParagraphTextItem(ParagraphTextItemType paragraphTextItemType, String str) {
            this.f22503a = paragraphTextItemType;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnParagraphTextItem)) {
                return false;
            }
            OnParagraphTextItem onParagraphTextItem = (OnParagraphTextItem) obj;
            return this.f22503a == onParagraphTextItem.f22503a && Intrinsics.c(this.b, onParagraphTextItem.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22503a.hashCode() * 31);
        }

        public final String toString() {
            return "OnParagraphTextItem(type=" + this.f22503a + ", content=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$OpenActionAnalytics;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenActionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22504a;
        public final AnalyticsFields b;

        public OpenActionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f22504a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenActionAnalytics)) {
                return false;
            }
            OpenActionAnalytics openActionAnalytics = (OpenActionAnalytics) obj;
            return Intrinsics.c(this.f22504a, openActionAnalytics.f22504a) && Intrinsics.c(this.b, openActionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22504a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("OpenActionAnalytics(__typename=", this.f22504a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$Price;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Price {

        /* renamed from: a, reason: collision with root package name */
        public final String f22505a;
        public final OnFulfilmentFeePriceInfo b;

        public Price(String str, OnFulfilmentFeePriceInfo onFulfilmentFeePriceInfo) {
            this.f22505a = str;
            this.b = onFulfilmentFeePriceInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Price)) {
                return false;
            }
            Price price = (Price) obj;
            return Intrinsics.c(this.f22505a, price.f22505a) && Intrinsics.c(this.b, price.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22505a.hashCode() * 31);
        }

        public final String toString() {
            return "Price(__typename=" + this.f22505a + ", onFulfilmentFeePriceInfo=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/FulfilmentExtraInfo$RowUI;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RowUI {

        /* renamed from: a, reason: collision with root package name */
        public final LeadingAsset f22506a;
        public final String b;
        public final String c;

        public RowUI(LeadingAsset leadingAsset, String str, String str2) {
            this.f22506a = leadingAsset;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RowUI)) {
                return false;
            }
            RowUI rowUI = (RowUI) obj;
            return Intrinsics.c(this.f22506a, rowUI.f22506a) && Intrinsics.c(this.b, rowUI.b) && Intrinsics.c(this.c, rowUI.c);
        }

        public final int hashCode() {
            LeadingAsset leadingAsset = this.f22506a;
            int iHashCode = (leadingAsset == null ? 0 : leadingAsset.hashCode()) * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RowUI(leadingAsset=");
            sb.append(this.f22506a);
            sb.append(", description=");
            sb.append(this.b);
            sb.append(", label=");
            return a.o(sb, this.c, ")");
        }
    }

    public FulfilmentExtraInfo(String str, ArrayList arrayList) {
        this.f22478a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentExtraInfo)) {
            return false;
        }
        FulfilmentExtraInfo fulfilmentExtraInfo = (FulfilmentExtraInfo) obj;
        return this.f22478a.equals(fulfilmentExtraInfo.f22478a) && this.b.equals(fulfilmentExtraInfo.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22478a.hashCode() * 31);
    }

    public final String toString() {
        return d.q("FulfilmentExtraInfo(title=", this.f22478a, ", content=", ")", this.b);
    }
}
