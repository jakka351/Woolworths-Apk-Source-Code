package com.woolworths.feature.shop.bundles;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.CompatibleColor;
import au.com.woolworths.sdui.shop.fragment.CoreTagUI;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.BundlesInput;
import au.com.woolworths.shop.graphql.type.CoreAlertStyle;
import au.com.woolworths.shop.graphql.type.CoreBroadcastBannerStyle;
import au.com.woolworths.shop.graphql.type.adapter.BundlesInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.bundles.adapter.BundlesQuery_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b2\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:1\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123¨\u00064"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/feature/shop/bundles/BundlesQuery$Data;", "Data", "Bundles", "OnBundlesLandingPage", "Analytics", "ImpressionAnalytics", "Header", "SortOptions", "OnBundleSortOptions", "Option", "CoreRadioRowUI", "Chip", "Text", "Item", "OnBasicCoreBroadcastBanner", "ImpressionAnalytics1", "BroadcastBannerDismissAnalytics", "BroadcastBannerUI", "Icon", "OnCoreIcon", "OnHostedIcon", "BroadcastBannerAction", "OnBasicInsetAlert", "InsetAlertUI", "InsetAlertAction", "Analytics1", "ImpressionAnalytics2", "OnBundle", "BundleDetails", "TitleTag", "TextColor", "Pricing", "OnBundleStandardPricing", "Tag", "OnBundleComparisonPricing", "BundleItem", "OnBundleProductCard", "ProductCard", "BundleCta", "OnBundleQuantityStepper", "BundleAnalytics", "BundleImpressionAnalytics", "OnBundlesLandingErrorPage", "Cta", "LinkTextWithAlt", "LinkAction", "Analytics2", "Analytics3", "ImpressionAnalytics3", "Companion", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BundlesQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final BundlesInput f19392a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final boolean f;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$Analytics;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f19393a;
        public final AnalyticsFields b;

        public Analytics(String str, AnalyticsFields analyticsFields) {
            this.f19393a = str;
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
            return Intrinsics.c(this.f19393a, analytics.f19393a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19393a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics(__typename=", this.f19393a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$Analytics1;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19394a;
        public final AnalyticsFields b;

        public Analytics1(String str, AnalyticsFields analyticsFields) {
            this.f19394a = str;
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
            return Intrinsics.c(this.f19394a, analytics1.f19394a) && Intrinsics.c(this.b, analytics1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19394a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics1(__typename=", this.f19394a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$Analytics2;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19395a;
        public final AnalyticsFields b;

        public Analytics2(String str, AnalyticsFields analyticsFields) {
            this.f19395a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics2)) {
                return false;
            }
            Analytics2 analytics2 = (Analytics2) obj;
            return Intrinsics.c(this.f19395a, analytics2.f19395a) && Intrinsics.c(this.b, analytics2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19395a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics2(__typename=", this.f19395a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$Analytics3;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19396a;
        public final AnalyticsFields b;

        public Analytics3(String str, AnalyticsFields analyticsFields) {
            this.f19396a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics3)) {
                return false;
            }
            Analytics3 analytics3 = (Analytics3) obj;
            return Intrinsics.c(this.f19396a, analytics3.f19396a) && Intrinsics.c(this.b, analytics3.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19396a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics3(__typename=", this.f19396a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$BroadcastBannerAction;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BroadcastBannerAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f19397a;
        public final String b;
        public final ActionType c;

        public BroadcastBannerAction(ActionType actionType, String str, String str2) {
            this.f19397a = str;
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
            return Intrinsics.c(this.f19397a, broadcastBannerAction.f19397a) && Intrinsics.c(this.b, broadcastBannerAction.b) && this.c == broadcastBannerAction.c;
        }

        public final int hashCode() {
            int iHashCode = this.f19397a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("BroadcastBannerAction(action=", this.f19397a, ", id=", this.b, ", type=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$BroadcastBannerDismissAnalytics;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BroadcastBannerDismissAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f19398a;
        public final AnalyticsFields b;

        public BroadcastBannerDismissAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f19398a = str;
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
            return Intrinsics.c(this.f19398a, broadcastBannerDismissAnalytics.f19398a) && Intrinsics.c(this.b, broadcastBannerDismissAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19398a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("BroadcastBannerDismissAnalytics(__typename=", this.f19398a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$BroadcastBannerUI;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BroadcastBannerUI {

        /* renamed from: a, reason: collision with root package name */
        public final String f19399a;
        public final String b;
        public final CoreBroadcastBannerStyle c;
        public final Icon d;

        public BroadcastBannerUI(String str, String str2, CoreBroadcastBannerStyle coreBroadcastBannerStyle, Icon icon) {
            this.f19399a = str;
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
            return Intrinsics.c(this.f19399a, broadcastBannerUI.f19399a) && Intrinsics.c(this.b, broadcastBannerUI.b) && this.c == broadcastBannerUI.c && Intrinsics.c(this.d, broadcastBannerUI.d);
        }

        public final int hashCode() {
            int iHashCode = this.f19399a.hashCode() * 31;
            String str = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("BroadcastBannerUI(title=", this.f19399a, ", subtitle=", this.b, ", style=");
            sbV.append(this.c);
            sbV.append(", icon=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$BundleAnalytics;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BundleAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f19400a;
        public final AnalyticsFields b;

        public BundleAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f19400a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BundleAnalytics)) {
                return false;
            }
            BundleAnalytics bundleAnalytics = (BundleAnalytics) obj;
            return Intrinsics.c(this.f19400a, bundleAnalytics.f19400a) && Intrinsics.c(this.b, bundleAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19400a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("BundleAnalytics(__typename=", this.f19400a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$BundleCta;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BundleCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f19401a;
        public final OnBundleQuantityStepper b;

        public BundleCta(String __typename, OnBundleQuantityStepper onBundleQuantityStepper) {
            Intrinsics.h(__typename, "__typename");
            this.f19401a = __typename;
            this.b = onBundleQuantityStepper;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BundleCta)) {
                return false;
            }
            BundleCta bundleCta = (BundleCta) obj;
            return Intrinsics.c(this.f19401a, bundleCta.f19401a) && Intrinsics.c(this.b, bundleCta.b);
        }

        public final int hashCode() {
            int iHashCode = this.f19401a.hashCode() * 31;
            OnBundleQuantityStepper onBundleQuantityStepper = this.b;
            return iHashCode + (onBundleQuantityStepper == null ? 0 : onBundleQuantityStepper.hashCode());
        }

        public final String toString() {
            return "BundleCta(__typename=" + this.f19401a + ", onBundleQuantityStepper=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$BundleDetails;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BundleDetails {

        /* renamed from: a, reason: collision with root package name */
        public final TitleTag f19402a;
        public final String b;
        public final String c;
        public final Pricing d;

        public BundleDetails(TitleTag titleTag, String str, String str2, Pricing pricing) {
            this.f19402a = titleTag;
            this.b = str;
            this.c = str2;
            this.d = pricing;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BundleDetails)) {
                return false;
            }
            BundleDetails bundleDetails = (BundleDetails) obj;
            return Intrinsics.c(this.f19402a, bundleDetails.f19402a) && Intrinsics.c(this.b, bundleDetails.b) && Intrinsics.c(this.c, bundleDetails.c) && Intrinsics.c(this.d, bundleDetails.d);
        }

        public final int hashCode() {
            TitleTag titleTag = this.f19402a;
            int iC = b.c((titleTag == null ? 0 : titleTag.hashCode()) * 31, 31, this.b);
            String str = this.c;
            return this.d.hashCode() + ((iC + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "BundleDetails(titleTag=" + this.f19402a + ", title=" + this.b + ", description=" + this.c + ", pricing=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$BundleImpressionAnalytics;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BundleImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f19403a;
        public final AnalyticsFields b;

        public BundleImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f19403a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BundleImpressionAnalytics)) {
                return false;
            }
            BundleImpressionAnalytics bundleImpressionAnalytics = (BundleImpressionAnalytics) obj;
            return Intrinsics.c(this.f19403a, bundleImpressionAnalytics.f19403a) && Intrinsics.c(this.b, bundleImpressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19403a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("BundleImpressionAnalytics(__typename=", this.f19403a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$BundleItem;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BundleItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f19404a;
        public final OnBundleProductCard b;

        public BundleItem(String __typename, OnBundleProductCard onBundleProductCard) {
            Intrinsics.h(__typename, "__typename");
            this.f19404a = __typename;
            this.b = onBundleProductCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BundleItem)) {
                return false;
            }
            BundleItem bundleItem = (BundleItem) obj;
            return Intrinsics.c(this.f19404a, bundleItem.f19404a) && Intrinsics.c(this.b, bundleItem.b);
        }

        public final int hashCode() {
            int iHashCode = this.f19404a.hashCode() * 31;
            OnBundleProductCard onBundleProductCard = this.b;
            return iHashCode + (onBundleProductCard == null ? 0 : onBundleProductCard.hashCode());
        }

        public final String toString() {
            return "BundleItem(__typename=" + this.f19404a + ", onBundleProductCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$Bundles;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Bundles {

        /* renamed from: a, reason: collision with root package name */
        public final String f19405a;
        public final OnBundlesLandingPage b;
        public final OnBundlesLandingErrorPage c;

        public Bundles(String __typename, OnBundlesLandingPage onBundlesLandingPage, OnBundlesLandingErrorPage onBundlesLandingErrorPage) {
            Intrinsics.h(__typename, "__typename");
            this.f19405a = __typename;
            this.b = onBundlesLandingPage;
            this.c = onBundlesLandingErrorPage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Bundles)) {
                return false;
            }
            Bundles bundles = (Bundles) obj;
            return Intrinsics.c(this.f19405a, bundles.f19405a) && Intrinsics.c(this.b, bundles.b) && Intrinsics.c(this.c, bundles.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19405a.hashCode() * 31;
            OnBundlesLandingPage onBundlesLandingPage = this.b;
            int iHashCode2 = (iHashCode + (onBundlesLandingPage == null ? 0 : onBundlesLandingPage.hashCode())) * 31;
            OnBundlesLandingErrorPage onBundlesLandingErrorPage = this.c;
            return iHashCode2 + (onBundlesLandingErrorPage != null ? onBundlesLandingErrorPage.hashCode() : 0);
        }

        public final String toString() {
            return "Bundles(__typename=" + this.f19405a + ", onBundlesLandingPage=" + this.b + ", onBundlesLandingErrorPage=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$Chip;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Chip {

        /* renamed from: a, reason: collision with root package name */
        public final String f19406a;
        public final boolean b;
        public final Text c;

        public Chip(String str, boolean z, Text text) {
            this.f19406a = str;
            this.b = z;
            this.c = text;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Chip)) {
                return false;
            }
            Chip chip = (Chip) obj;
            return Intrinsics.c(this.f19406a, chip.f19406a) && this.b == chip.b && Intrinsics.c(this.c, chip.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.e(this.f19406a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbQ = androidx.constraintlayout.core.state.a.q("Chip(id=", this.f19406a, ", isSelected=", ", text=", this.b);
            sbQ.append(this.c);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$CoreRadioRowUI;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CoreRadioRowUI {

        /* renamed from: a, reason: collision with root package name */
        public final String f19407a;
        public final String b;
        public final boolean c;

        public CoreRadioRowUI(String str, String str2, boolean z) {
            this.f19407a = str;
            this.b = str2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CoreRadioRowUI)) {
                return false;
            }
            CoreRadioRowUI coreRadioRowUI = (CoreRadioRowUI) obj;
            return Intrinsics.c(this.f19407a, coreRadioRowUI.f19407a) && Intrinsics.c(this.b, coreRadioRowUI.b) && this.c == coreRadioRowUI.c;
        }

        public final int hashCode() {
            String str = this.f19407a;
            return Boolean.hashCode(this.c) + b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            return a.k(")", a.v("CoreRadioRowUI(description=", this.f19407a, ", label=", this.b, ", isSelected="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$Cta;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cta {

        /* renamed from: a, reason: collision with root package name */
        public final String f19408a;
        public final LinkTextWithAlt b;
        public final LinkAction c;

        public Cta(String str, LinkTextWithAlt linkTextWithAlt, LinkAction linkAction) {
            this.f19408a = str;
            this.b = linkTextWithAlt;
            this.c = linkAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cta)) {
                return false;
            }
            Cta cta = (Cta) obj;
            return Intrinsics.c(this.f19408a, cta.f19408a) && Intrinsics.c(this.b, cta.b) && Intrinsics.c(this.c, cta.c);
        }

        public final int hashCode() {
            String str = this.f19408a;
            return this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
        }

        public final String toString() {
            return "Cta(linkId=" + this.f19408a + ", linkTextWithAlt=" + this.b + ", linkAction=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final Bundles f19409a;

        public Data(Bundles bundles) {
            this.f19409a = bundles;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f19409a, ((Data) obj).f19409a);
        }

        public final int hashCode() {
            return this.f19409a.hashCode();
        }

        public final String toString() {
            return "Data(bundles=" + this.f19409a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$Header;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Header {

        /* renamed from: a, reason: collision with root package name */
        public final SortOptions f19410a;
        public final List b;
        public final String c;

        public Header(SortOptions sortOptions, List list, String str) {
            this.f19410a = sortOptions;
            this.b = list;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return Intrinsics.c(this.f19410a, header.f19410a) && Intrinsics.c(this.b, header.b) && Intrinsics.c(this.c, header.c);
        }

        public final int hashCode() {
            SortOptions sortOptions = this.f19410a;
            int iHashCode = (sortOptions == null ? 0 : sortOptions.hashCode()) * 31;
            List list = this.b;
            return this.c.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Header(sortOptions=");
            sb.append(this.f19410a);
            sb.append(", chips=");
            sb.append(this.b);
            sb.append(", totalBundles=");
            return a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$Icon;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Icon {

        /* renamed from: a, reason: collision with root package name */
        public final String f19411a;
        public final OnCoreIcon b;
        public final OnHostedIcon c;

        public Icon(String __typename, OnCoreIcon onCoreIcon, OnHostedIcon onHostedIcon) {
            Intrinsics.h(__typename, "__typename");
            this.f19411a = __typename;
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
            return Intrinsics.c(this.f19411a, icon.f19411a) && Intrinsics.c(this.b, icon.b) && Intrinsics.c(this.c, icon.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19411a.hashCode() * 31;
            OnCoreIcon onCoreIcon = this.b;
            int iHashCode2 = (iHashCode + (onCoreIcon == null ? 0 : onCoreIcon.f19431a.hashCode())) * 31;
            OnHostedIcon onHostedIcon = this.c;
            return iHashCode2 + (onHostedIcon != null ? onHostedIcon.f19432a.hashCode() : 0);
        }

        public final String toString() {
            return "Icon(__typename=" + this.f19411a + ", onCoreIcon=" + this.b + ", onHostedIcon=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$ImpressionAnalytics;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f19412a;
        public final AnalyticsFields b;

        public ImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f19412a = str;
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
            return Intrinsics.c(this.f19412a, impressionAnalytics.f19412a) && Intrinsics.c(this.b, impressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19412a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics(__typename=", this.f19412a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$ImpressionAnalytics1;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19413a;
        public final AnalyticsFields b;

        public ImpressionAnalytics1(String str, AnalyticsFields analyticsFields) {
            this.f19413a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImpressionAnalytics1)) {
                return false;
            }
            ImpressionAnalytics1 impressionAnalytics1 = (ImpressionAnalytics1) obj;
            return Intrinsics.c(this.f19413a, impressionAnalytics1.f19413a) && Intrinsics.c(this.b, impressionAnalytics1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19413a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics1(__typename=", this.f19413a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$ImpressionAnalytics2;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19414a;
        public final AnalyticsFields b;

        public ImpressionAnalytics2(String str, AnalyticsFields analyticsFields) {
            this.f19414a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImpressionAnalytics2)) {
                return false;
            }
            ImpressionAnalytics2 impressionAnalytics2 = (ImpressionAnalytics2) obj;
            return Intrinsics.c(this.f19414a, impressionAnalytics2.f19414a) && Intrinsics.c(this.b, impressionAnalytics2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19414a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics2(__typename=", this.f19414a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$ImpressionAnalytics3;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19415a;
        public final AnalyticsFields b;

        public ImpressionAnalytics3(String str, AnalyticsFields analyticsFields) {
            this.f19415a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImpressionAnalytics3)) {
                return false;
            }
            ImpressionAnalytics3 impressionAnalytics3 = (ImpressionAnalytics3) obj;
            return Intrinsics.c(this.f19415a, impressionAnalytics3.f19415a) && Intrinsics.c(this.b, impressionAnalytics3.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19415a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics3(__typename=", this.f19415a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$InsetAlertAction;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InsetAlertAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f19416a;
        public final String b;
        public final ActionType c;
        public final Analytics1 d;

        public InsetAlertAction(String str, String str2, ActionType actionType, Analytics1 analytics1) {
            this.f19416a = str;
            this.b = str2;
            this.c = actionType;
            this.d = analytics1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InsetAlertAction)) {
                return false;
            }
            InsetAlertAction insetAlertAction = (InsetAlertAction) obj;
            return Intrinsics.c(this.f19416a, insetAlertAction.f19416a) && Intrinsics.c(this.b, insetAlertAction.b) && this.c == insetAlertAction.c && Intrinsics.c(this.d, insetAlertAction.d);
        }

        public final int hashCode() {
            int iHashCode = this.f19416a.hashCode() * 31;
            String str = this.b;
            int iA = d.a(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            Analytics1 analytics1 = this.d;
            return iA + (analytics1 != null ? analytics1.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("InsetAlertAction(action=", this.f19416a, ", id=", this.b, ", type=");
            sbV.append(this.c);
            sbV.append(", analytics=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$InsetAlertUI;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InsetAlertUI {

        /* renamed from: a, reason: collision with root package name */
        public final String f19417a;
        public final String b;
        public final CoreAlertStyle c;

        public InsetAlertUI(CoreAlertStyle coreAlertStyle, String str, String str2) {
            this.f19417a = str;
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
            return Intrinsics.c(this.f19417a, insetAlertUI.f19417a) && Intrinsics.c(this.b, insetAlertUI.b) && this.c == insetAlertUI.c;
        }

        public final int hashCode() {
            String str = this.f19417a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("InsetAlertUI(title=", this.f19417a, ", description=", this.b, ", style=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$Item;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f19418a;
        public final OnBasicCoreBroadcastBanner b;
        public final OnBasicInsetAlert c;
        public final OnBundle d;

        public Item(String __typename, OnBasicCoreBroadcastBanner onBasicCoreBroadcastBanner, OnBasicInsetAlert onBasicInsetAlert, OnBundle onBundle) {
            Intrinsics.h(__typename, "__typename");
            this.f19418a = __typename;
            this.b = onBasicCoreBroadcastBanner;
            this.c = onBasicInsetAlert;
            this.d = onBundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f19418a, item.f19418a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d);
        }

        public final int hashCode() {
            int iHashCode = this.f19418a.hashCode() * 31;
            OnBasicCoreBroadcastBanner onBasicCoreBroadcastBanner = this.b;
            int iHashCode2 = (iHashCode + (onBasicCoreBroadcastBanner == null ? 0 : onBasicCoreBroadcastBanner.hashCode())) * 31;
            OnBasicInsetAlert onBasicInsetAlert = this.c;
            int iHashCode3 = (iHashCode2 + (onBasicInsetAlert == null ? 0 : onBasicInsetAlert.hashCode())) * 31;
            OnBundle onBundle = this.d;
            return iHashCode3 + (onBundle != null ? onBundle.hashCode() : 0);
        }

        public final String toString() {
            return "Item(__typename=" + this.f19418a + ", onBasicCoreBroadcastBanner=" + this.b + ", onBasicInsetAlert=" + this.c + ", onBundle=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$LinkAction;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f19419a;
        public final String b;
        public final ActionType c;
        public final Analytics2 d;

        public LinkAction(String str, String str2, ActionType actionType, Analytics2 analytics2) {
            this.f19419a = str;
            this.b = str2;
            this.c = actionType;
            this.d = analytics2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkAction)) {
                return false;
            }
            LinkAction linkAction = (LinkAction) obj;
            return Intrinsics.c(this.f19419a, linkAction.f19419a) && Intrinsics.c(this.b, linkAction.b) && this.c == linkAction.c && Intrinsics.c(this.d, linkAction.d);
        }

        public final int hashCode() {
            int iHashCode = this.f19419a.hashCode() * 31;
            String str = this.b;
            int iA = d.a(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            Analytics2 analytics2 = this.d;
            return iA + (analytics2 != null ? analytics2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("LinkAction(action=", this.f19419a, ", id=", this.b, ", type=");
            sbV.append(this.c);
            sbV.append(", analytics=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$LinkTextWithAlt;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkTextWithAlt {

        /* renamed from: a, reason: collision with root package name */
        public final String f19420a;
        public final String b;

        public LinkTextWithAlt(String str, String str2) {
            this.f19420a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkTextWithAlt)) {
                return false;
            }
            LinkTextWithAlt linkTextWithAlt = (LinkTextWithAlt) obj;
            return Intrinsics.c(this.f19420a, linkTextWithAlt.f19420a) && Intrinsics.c(this.b, linkTextWithAlt.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19420a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("LinkTextWithAlt(text=", this.f19420a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$OnBasicCoreBroadcastBanner;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBasicCoreBroadcastBanner {

        /* renamed from: a, reason: collision with root package name */
        public final ImpressionAnalytics1 f19421a;
        public final BroadcastBannerDismissAnalytics b;
        public final BroadcastBannerUI c;
        public final BroadcastBannerAction d;
        public final String e;
        public final String f;
        public final boolean g;

        public OnBasicCoreBroadcastBanner(ImpressionAnalytics1 impressionAnalytics1, BroadcastBannerDismissAnalytics broadcastBannerDismissAnalytics, BroadcastBannerUI broadcastBannerUI, BroadcastBannerAction broadcastBannerAction, String str, String str2, boolean z) {
            this.f19421a = impressionAnalytics1;
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
            return Intrinsics.c(this.f19421a, onBasicCoreBroadcastBanner.f19421a) && Intrinsics.c(this.b, onBasicCoreBroadcastBanner.b) && Intrinsics.c(this.c, onBasicCoreBroadcastBanner.c) && Intrinsics.c(this.d, onBasicCoreBroadcastBanner.d) && Intrinsics.c(this.e, onBasicCoreBroadcastBanner.e) && Intrinsics.c(this.f, onBasicCoreBroadcastBanner.f) && this.g == onBasicCoreBroadcastBanner.g;
        }

        public final int hashCode() {
            ImpressionAnalytics1 impressionAnalytics1 = this.f19421a;
            int iHashCode = (impressionAnalytics1 == null ? 0 : impressionAnalytics1.hashCode()) * 31;
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
            sb.append(this.f19421a);
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$OnBasicInsetAlert;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBasicInsetAlert {

        /* renamed from: a, reason: collision with root package name */
        public final InsetAlertUI f19422a;
        public final String b;
        public final InsetAlertAction c;
        public final ImpressionAnalytics2 d;

        public OnBasicInsetAlert(InsetAlertUI insetAlertUI, String str, InsetAlertAction insetAlertAction, ImpressionAnalytics2 impressionAnalytics2) {
            this.f19422a = insetAlertUI;
            this.b = str;
            this.c = insetAlertAction;
            this.d = impressionAnalytics2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBasicInsetAlert)) {
                return false;
            }
            OnBasicInsetAlert onBasicInsetAlert = (OnBasicInsetAlert) obj;
            return Intrinsics.c(this.f19422a, onBasicInsetAlert.f19422a) && Intrinsics.c(this.b, onBasicInsetAlert.b) && Intrinsics.c(this.c, onBasicInsetAlert.c) && Intrinsics.c(this.d, onBasicInsetAlert.d);
        }

        public final int hashCode() {
            int iHashCode = this.f19422a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            InsetAlertAction insetAlertAction = this.c;
            int iHashCode3 = (iHashCode2 + (insetAlertAction == null ? 0 : insetAlertAction.hashCode())) * 31;
            ImpressionAnalytics2 impressionAnalytics2 = this.d;
            return iHashCode3 + (impressionAnalytics2 != null ? impressionAnalytics2.hashCode() : 0);
        }

        public final String toString() {
            return "OnBasicInsetAlert(insetAlertUI=" + this.f19422a + ", insetAlertActionLabel=" + this.b + ", insetAlertAction=" + this.c + ", impressionAnalytics=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$OnBundle;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBundle {

        /* renamed from: a, reason: collision with root package name */
        public final BundleDetails f19423a;
        public final ArrayList b;
        public final BundleCta c;
        public final BundleAnalytics d;
        public final BundleImpressionAnalytics e;
        public final String f;

        public OnBundle(BundleDetails bundleDetails, ArrayList arrayList, BundleCta bundleCta, BundleAnalytics bundleAnalytics, BundleImpressionAnalytics bundleImpressionAnalytics, String str) {
            this.f19423a = bundleDetails;
            this.b = arrayList;
            this.c = bundleCta;
            this.d = bundleAnalytics;
            this.e = bundleImpressionAnalytics;
            this.f = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBundle)) {
                return false;
            }
            OnBundle onBundle = (OnBundle) obj;
            return this.f19423a.equals(onBundle.f19423a) && this.b.equals(onBundle.b) && this.c.equals(onBundle.c) && Intrinsics.c(this.d, onBundle.d) && Intrinsics.c(this.e, onBundle.e) && Intrinsics.c(this.f, onBundle.f);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + androidx.compose.ui.input.pointer.a.b(this.f19423a.hashCode() * 31, 31, this.b)) * 31;
            BundleAnalytics bundleAnalytics = this.d;
            int iHashCode2 = (iHashCode + (bundleAnalytics == null ? 0 : bundleAnalytics.hashCode())) * 31;
            BundleImpressionAnalytics bundleImpressionAnalytics = this.e;
            int iHashCode3 = (iHashCode2 + (bundleImpressionAnalytics == null ? 0 : bundleImpressionAnalytics.hashCode())) * 31;
            String str = this.f;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "OnBundle(bundleDetails=" + this.f19423a + ", bundleItems=" + this.b + ", bundleCta=" + this.c + ", bundleAnalytics=" + this.d + ", bundleImpressionAnalytics=" + this.e + ", footerText=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$OnBundleComparisonPricing;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBundleComparisonPricing {

        /* renamed from: a, reason: collision with root package name */
        public final String f19424a;

        public OnBundleComparisonPricing(String str) {
            this.f19424a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnBundleComparisonPricing) && Intrinsics.c(this.f19424a, ((OnBundleComparisonPricing) obj).f19424a);
        }

        public final int hashCode() {
            String str = this.f19424a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return a.h("OnBundleComparisonPricing(logo=", this.f19424a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$OnBundleProductCard;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBundleProductCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f19425a;
        public final ProductCard b;

        public OnBundleProductCard(String str, ProductCard productCard) {
            this.f19425a = str;
            this.b = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBundleProductCard)) {
                return false;
            }
            OnBundleProductCard onBundleProductCard = (OnBundleProductCard) obj;
            return Intrinsics.c(this.f19425a, onBundleProductCard.f19425a) && Intrinsics.c(this.b, onBundleProductCard.b);
        }

        public final int hashCode() {
            String str = this.f19425a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "OnBundleProductCard(quantity=" + this.f19425a + ", productCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$OnBundleQuantityStepper;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBundleQuantityStepper {

        /* renamed from: a, reason: collision with root package name */
        public final int f19426a;
        public final int b;
        public final int c;
        public final int d;
        public final String e;
        public final String f;
        public final String g;

        public OnBundleQuantityStepper(int i, int i2, int i3, int i4, String str, String str2, String str3) {
            this.f19426a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = str;
            this.f = str2;
            this.g = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBundleQuantityStepper)) {
                return false;
            }
            OnBundleQuantityStepper onBundleQuantityStepper = (OnBundleQuantityStepper) obj;
            return this.f19426a == onBundleQuantityStepper.f19426a && this.b == onBundleQuantityStepper.b && this.c == onBundleQuantityStepper.c && this.d == onBundleQuantityStepper.d && Intrinsics.c(this.e, onBundleQuantityStepper.e) && Intrinsics.c(this.f, onBundleQuantityStepper.f) && Intrinsics.c(this.g, onBundleQuantityStepper.g);
        }

        public final int hashCode() {
            int iC = b.c(b.a(this.d, b.a(this.c, b.a(this.b, Integer.hashCode(this.f19426a) * 31, 31), 31), 31), 31, this.e);
            String str = this.f;
            return this.g.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbQ = a.q(this.f19426a, this.b, "OnBundleQuantityStepper(minimum=", ", maximum=", ", increment=");
            a.w(this.c, this.d, ", inCart=", ", addToCartLabel=", sbQ);
            androidx.constraintlayout.core.state.a.B(sbQ, this.e, ", maximumReachedLabel=", this.f, ", offerId=");
            return a.o(sbQ, this.g, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$OnBundleSortOptions;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBundleSortOptions {

        /* renamed from: a, reason: collision with root package name */
        public final String f19427a;
        public final ArrayList b;

        public OnBundleSortOptions(String str, ArrayList arrayList) {
            this.f19427a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBundleSortOptions)) {
                return false;
            }
            OnBundleSortOptions onBundleSortOptions = (OnBundleSortOptions) obj;
            return this.f19427a.equals(onBundleSortOptions.f19427a) && this.b.equals(onBundleSortOptions.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19427a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("OnBundleSortOptions(title=", this.f19427a, ", options=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$OnBundleStandardPricing;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBundleStandardPricing {

        /* renamed from: a, reason: collision with root package name */
        public final String f19428a;
        public final String b;
        public final Tag c;

        public OnBundleStandardPricing(String str, String str2, Tag tag) {
            this.f19428a = str;
            this.b = str2;
            this.c = tag;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBundleStandardPricing)) {
                return false;
            }
            OnBundleStandardPricing onBundleStandardPricing = (OnBundleStandardPricing) obj;
            return Intrinsics.c(this.f19428a, onBundleStandardPricing.f19428a) && Intrinsics.c(this.b, onBundleStandardPricing.b) && Intrinsics.c(this.c, onBundleStandardPricing.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f19428a.hashCode() * 31, 31, this.b);
            Tag tag = this.c;
            return iC + (tag == null ? 0 : tag.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnBundleStandardPricing(prefix=", this.f19428a, ", price=", this.b, ", tag=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$OnBundlesLandingErrorPage;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBundlesLandingErrorPage {

        /* renamed from: a, reason: collision with root package name */
        public final String f19429a;
        public final String b;
        public final String c;
        public final Cta d;
        public final Analytics3 e;
        public final ImpressionAnalytics3 f;

        public OnBundlesLandingErrorPage(String str, String str2, String str3, Cta cta, Analytics3 analytics3, ImpressionAnalytics3 impressionAnalytics3) {
            this.f19429a = str;
            this.b = str2;
            this.c = str3;
            this.d = cta;
            this.e = analytics3;
            this.f = impressionAnalytics3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBundlesLandingErrorPage)) {
                return false;
            }
            OnBundlesLandingErrorPage onBundlesLandingErrorPage = (OnBundlesLandingErrorPage) obj;
            return Intrinsics.c(this.f19429a, onBundlesLandingErrorPage.f19429a) && Intrinsics.c(this.b, onBundlesLandingErrorPage.b) && Intrinsics.c(this.c, onBundlesLandingErrorPage.c) && Intrinsics.c(this.d, onBundlesLandingErrorPage.d) && Intrinsics.c(this.e, onBundlesLandingErrorPage.e) && Intrinsics.c(this.f, onBundlesLandingErrorPage.f);
        }

        public final int hashCode() {
            String str = this.f19429a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Cta cta = this.d;
            int iHashCode4 = (iHashCode3 + (cta == null ? 0 : cta.hashCode())) * 31;
            Analytics3 analytics3 = this.e;
            int iHashCode5 = (iHashCode4 + (analytics3 == null ? 0 : analytics3.hashCode())) * 31;
            ImpressionAnalytics3 impressionAnalytics3 = this.f;
            return iHashCode5 + (impressionAnalytics3 != null ? impressionAnalytics3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnBundlesLandingErrorPage(image=", this.f19429a, ", title=", this.b, ", description=");
            sbV.append(this.c);
            sbV.append(", cta=");
            sbV.append(this.d);
            sbV.append(", analytics=");
            sbV.append(this.e);
            sbV.append(", impressionAnalytics=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$OnBundlesLandingPage;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBundlesLandingPage {

        /* renamed from: a, reason: collision with root package name */
        public final Analytics f19430a;
        public final ImpressionAnalytics b;
        public final Header c;
        public final ArrayList d;
        public final Integer e;

        public OnBundlesLandingPage(Analytics analytics, ImpressionAnalytics impressionAnalytics, Header header, ArrayList arrayList, Integer num) {
            this.f19430a = analytics;
            this.b = impressionAnalytics;
            this.c = header;
            this.d = arrayList;
            this.e = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBundlesLandingPage)) {
                return false;
            }
            OnBundlesLandingPage onBundlesLandingPage = (OnBundlesLandingPage) obj;
            return Intrinsics.c(this.f19430a, onBundlesLandingPage.f19430a) && Intrinsics.c(this.b, onBundlesLandingPage.b) && this.c.equals(onBundlesLandingPage.c) && this.d.equals(onBundlesLandingPage.d) && Intrinsics.c(this.e, onBundlesLandingPage.e);
        }

        public final int hashCode() {
            Analytics analytics = this.f19430a;
            int iHashCode = (analytics == null ? 0 : analytics.hashCode()) * 31;
            ImpressionAnalytics impressionAnalytics = this.b;
            int iB = androidx.compose.ui.input.pointer.a.b((this.c.hashCode() + ((iHashCode + (impressionAnalytics == null ? 0 : impressionAnalytics.hashCode())) * 31)) * 31, 31, this.d);
            Integer num = this.e;
            return iB + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnBundlesLandingPage(analytics=");
            sb.append(this.f19430a);
            sb.append(", impressionAnalytics=");
            sb.append(this.b);
            sb.append(", header=");
            sb.append(this.c);
            sb.append(", items=");
            sb.append(this.d);
            sb.append(", nextPageNumber=");
            return au.com.woolworths.android.onesite.a.p(sb, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$OnCoreIcon;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCoreIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f19431a;

        public OnCoreIcon(String str) {
            this.f19431a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCoreIcon) && Intrinsics.c(this.f19431a, ((OnCoreIcon) obj).f19431a);
        }

        public final int hashCode() {
            return this.f19431a.hashCode();
        }

        public final String toString() {
            return a.h("OnCoreIcon(coreIconName=", this.f19431a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$OnHostedIcon;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f19432a;

        public OnHostedIcon(String str) {
            this.f19432a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon) && Intrinsics.c(this.f19432a, ((OnHostedIcon) obj).f19432a);
        }

        public final int hashCode() {
            return this.f19432a.hashCode();
        }

        public final String toString() {
            return a.h("OnHostedIcon(url=", this.f19432a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$Option;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Option {

        /* renamed from: a, reason: collision with root package name */
        public final String f19433a;
        public final CoreRadioRowUI b;

        public Option(String str, CoreRadioRowUI coreRadioRowUI) {
            this.f19433a = str;
            this.b = coreRadioRowUI;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option option = (Option) obj;
            return Intrinsics.c(this.f19433a, option.f19433a) && Intrinsics.c(this.b, option.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19433a.hashCode() * 31);
        }

        public final String toString() {
            return "Option(id=" + this.f19433a + ", coreRadioRowUI=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$Pricing;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Pricing {

        /* renamed from: a, reason: collision with root package name */
        public final String f19434a;
        public final OnBundleStandardPricing b;
        public final OnBundleComparisonPricing c;

        public Pricing(String __typename, OnBundleStandardPricing onBundleStandardPricing, OnBundleComparisonPricing onBundleComparisonPricing) {
            Intrinsics.h(__typename, "__typename");
            this.f19434a = __typename;
            this.b = onBundleStandardPricing;
            this.c = onBundleComparisonPricing;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pricing)) {
                return false;
            }
            Pricing pricing = (Pricing) obj;
            return Intrinsics.c(this.f19434a, pricing.f19434a) && Intrinsics.c(this.b, pricing.b) && Intrinsics.c(this.c, pricing.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19434a.hashCode() * 31;
            OnBundleStandardPricing onBundleStandardPricing = this.b;
            int iHashCode2 = (iHashCode + (onBundleStandardPricing == null ? 0 : onBundleStandardPricing.hashCode())) * 31;
            OnBundleComparisonPricing onBundleComparisonPricing = this.c;
            return iHashCode2 + (onBundleComparisonPricing != null ? onBundleComparisonPricing.hashCode() : 0);
        }

        public final String toString() {
            return "Pricing(__typename=" + this.f19434a + ", onBundleStandardPricing=" + this.b + ", onBundleComparisonPricing=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$ProductCard;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f19435a;
        public final au.com.woolworths.graphql.common.fragment.ProductCard b;

        public ProductCard(String str, au.com.woolworths.graphql.common.fragment.ProductCard productCard) {
            this.f19435a = str;
            this.b = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductCard)) {
                return false;
            }
            ProductCard productCard = (ProductCard) obj;
            return Intrinsics.c(this.f19435a, productCard.f19435a) && Intrinsics.c(this.b, productCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19435a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("ProductCard(__typename=", this.f19435a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$SortOptions;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SortOptions {

        /* renamed from: a, reason: collision with root package name */
        public final String f19436a;
        public final OnBundleSortOptions b;

        public SortOptions(String str, OnBundleSortOptions onBundleSortOptions) {
            this.f19436a = str;
            this.b = onBundleSortOptions;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SortOptions)) {
                return false;
            }
            SortOptions sortOptions = (SortOptions) obj;
            return Intrinsics.c(this.f19436a, sortOptions.f19436a) && Intrinsics.c(this.b, sortOptions.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19436a.hashCode() * 31);
        }

        public final String toString() {
            return "SortOptions(__typename=" + this.f19436a + ", onBundleSortOptions=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$Tag;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Tag {

        /* renamed from: a, reason: collision with root package name */
        public final String f19437a;
        public final CoreTagUI b;

        public Tag(String str, CoreTagUI coreTagUI) {
            this.f19437a = str;
            this.b = coreTagUI;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tag)) {
                return false;
            }
            Tag tag = (Tag) obj;
            return Intrinsics.c(this.f19437a, tag.f19437a) && Intrinsics.c(this.b, tag.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19437a.hashCode() * 31);
        }

        public final String toString() {
            return "Tag(__typename=" + this.f19437a + ", coreTagUI=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$Text;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Text {

        /* renamed from: a, reason: collision with root package name */
        public final String f19438a;
        public final String b;

        public Text(String str, String str2) {
            this.f19438a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Text)) {
                return false;
            }
            Text text = (Text) obj;
            return Intrinsics.c(this.f19438a, text.f19438a) && Intrinsics.c(this.b, text.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19438a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Text(text=", this.f19438a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$TextColor;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TextColor {

        /* renamed from: a, reason: collision with root package name */
        public final String f19439a;
        public final CompatibleColor b;

        public TextColor(String str, CompatibleColor compatibleColor) {
            this.f19439a = str;
            this.b = compatibleColor;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextColor)) {
                return false;
            }
            TextColor textColor = (TextColor) obj;
            return Intrinsics.c(this.f19439a, textColor.f19439a) && Intrinsics.c(this.b, textColor.b);
        }

        public final int hashCode() {
            return this.b.f10042a.hashCode() + (this.f19439a.hashCode() * 31);
        }

        public final String toString() {
            return "TextColor(__typename=" + this.f19439a + ", compatibleColor=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/BundlesQuery$TitleTag;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TitleTag {

        /* renamed from: a, reason: collision with root package name */
        public final String f19440a;
        public final TextColor b;

        public TitleTag(String str, TextColor textColor) {
            this.f19440a = str;
            this.b = textColor;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TitleTag)) {
                return false;
            }
            TitleTag titleTag = (TitleTag) obj;
            return Intrinsics.c(this.f19440a, titleTag.f19440a) && Intrinsics.c(this.b, titleTag.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19440a.hashCode() * 31);
        }

        public final String toString() {
            return "TitleTag(text=" + this.f19440a + ", textColor=" + this.b + ")";
        }
    }

    public BundlesQuery(BundlesInput bundlesInput, boolean z) {
        this.f19392a = bundlesInput;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.b = absent;
        this.c = absent;
        this.d = absent;
        this.e = absent;
        this.f = z;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(BundlesQuery_ResponseAdapter.Data.f19464a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query Bundles($bundlesInput: BundlesInput!, $includeOfferMinimumSpend: Boolean! = false , $includeAvailabilityInfoStatus: Boolean! = false , $includeProductAvailabilityStates: Boolean! = false , $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!) { bundles(bundlesInput: $bundlesInput) { __typename ... on BundlesLandingPage { analytics { __typename ...analyticsFields } impressionAnalytics { __typename ...analyticsFields } header { sortOptions { __typename ... on BundleSortOptions { title options { id coreRadioRowUI { description label isSelected } } } } chips { id isSelected text { text altText } } totalBundles } items { __typename ... on BasicCoreBroadcastBanner { impressionAnalytics { __typename ...analyticsFields } broadcastBannerDismissAnalytics { __typename ...analyticsFields } broadcastBannerUI { title subtitle style icon { __typename ... on CoreIcon { coreIconName } ... on HostedIcon { url } } } broadcastBannerAction { action id type } broadcastBannerActionLabel broadcastBannerId broadcastBannerDismissible } ... on BasicInsetAlert { insetAlertUI { title description style } insetAlertActionLabel insetAlertAction { action id type analytics { __typename ...analyticsFields } } impressionAnalytics { __typename ...analyticsFields } } ... on Bundle { bundleDetails { titleTag { text textColor { __typename ...compatibleColor } } title description pricing { __typename ... on BundleStandardPricing { prefix price tag { __typename ...coreTagUI } } ... on BundleComparisonPricing { logo } } } bundleItems { __typename ... on BundleProductCard { quantity productCard { __typename ...productCard } } } bundleCta { __typename ... on BundleQuantityStepper { minimum maximum increment inCart addToCartLabel maximumReachedLabel offerId } } bundleAnalytics { __typename ...analyticsFields } bundleImpressionAnalytics { __typename ...analyticsFields } footerText } } nextPageNumber } ... on BundlesLandingErrorPage { image title description cta { linkId linkTextWithAlt { text altText } linkAction { action id type analytics { __typename ...analyticsFields } } } analytics { __typename ...analyticsFields } impressionAnalytics { __typename ...analyticsFields } } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment compatibleColor on CompatibleColor { lightHexCode }  fragment iconFragment on IconAsset { __typename ... on HostedIcon { __typename url } ... on CoreIcon { __typename coreIconName } }  fragment coreTagUI on CoreTagUI { __typename label coreColorTheme { __typename background { __typename ...compatibleColor } foreground { __typename primary { __typename ...compatibleColor } secondary { __typename ...compatibleColor } highlight { __typename ...compatibleColor } } } hasBorder icon { __typename ...iconFragment } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundlesQuery)) {
            return false;
        }
        BundlesQuery bundlesQuery = (BundlesQuery) obj;
        return Intrinsics.c(this.f19392a, bundlesQuery.f19392a) && Intrinsics.c(this.b, bundlesQuery.b) && Intrinsics.c(this.c, bundlesQuery.c) && Intrinsics.c(this.d, bundlesQuery.d) && Intrinsics.c(this.e, bundlesQuery.e) && this.f == bundlesQuery.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.e, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.d, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.c, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.b, this.f19392a.hashCode() * 31, 31), 31), 31), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "67534c8c542176e399b45fdb9ca28f22b862329bee3cc2069f67bf351b2b2cd0";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "Bundles";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("bundlesInput");
        Adapters.c(BundlesInput_InputAdapter.f12039a, false).toJson(jsonWriter, customScalarAdapters, this.f19392a);
        Optional optional = this.b;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("includeOfferMinimumSpend");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        } else if (z) {
            jsonWriter.F1("includeOfferMinimumSpend");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional2 = this.c;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        } else if (z) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional3 = this.d;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("includeProductAvailabilityStates");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        } else if (z) {
            jsonWriter.F1("includeProductAvailabilityStates");
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
        StringBuilder sb = new StringBuilder("BundlesQuery(bundlesInput=");
        sb.append(this.f19392a);
        sb.append(", includeOfferMinimumSpend=");
        sb.append(this.b);
        sb.append(", includeAvailabilityInfoStatus=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.c, ", includeProductAvailabilityStates=", this.d, ", includePricingFootnote=");
        sb.append(this.e);
        sb.append(", includeLowestPrice14Days=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
