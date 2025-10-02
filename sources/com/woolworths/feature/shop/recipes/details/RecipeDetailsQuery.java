package com.woolworths.feature.shop.recipes.details;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragment;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.AdBannerNativeSize;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.CoreBroadcastBannerStyle;
import au.com.woolworths.shop.graphql.type.FeatureType;
import au.com.woolworths.shop.graphql.type.adapter.ShoppingModeType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.recipes.details.adapter.RecipeDetailsQuery_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b'\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:&\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'(¨\u0006)"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Data;", "Data", "RecipeDetails", "RecipeCostPerServe", "RecipeCostPerServeBanner", "BroadcastBannerUI", "Icon", "OnHostedIcon", "BroadcastBannerAction", "Method", "Description", "Item", "Byline", "ImpressionAnalytics", "Analytics", "Feature", "OnRecipeSummaryFeature", "OnRecipeSummaryDifficulty", "LatestRecipes", "Item1", "OnRecipeSummaryCard", "ActionMetadatum", "OnRecipeTagList", "NutritionTile", "Feature1", "UserInteraction", "IngredientsSection", "ServesInfo", "UniversalInventory", "OnActionableCard", "OnGoogleAdBannerCard", "OnUniversalInventoryContainer", "GoogleAdBannerCard", "NextBestAction", "OnActionableCard1", "ShopIngredientButton", "Button", "Video", "Companion", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RecipeDetailsQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f20231a;
    public final String b;
    public final Optional c;
    public final boolean d;
    public final Optional e;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$ActionMetadatum;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActionMetadatum {

        /* renamed from: a, reason: collision with root package name */
        public final String f20232a;
        public final OnRecipeTagList b;

        public ActionMetadatum(String __typename, OnRecipeTagList onRecipeTagList) {
            Intrinsics.h(__typename, "__typename");
            this.f20232a = __typename;
            this.b = onRecipeTagList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionMetadatum)) {
                return false;
            }
            ActionMetadatum actionMetadatum = (ActionMetadatum) obj;
            return Intrinsics.c(this.f20232a, actionMetadatum.f20232a) && Intrinsics.c(this.b, actionMetadatum.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20232a.hashCode() * 31;
            OnRecipeTagList onRecipeTagList = this.b;
            return iHashCode + (onRecipeTagList == null ? 0 : onRecipeTagList.f20259a.hashCode());
        }

        public final String toString() {
            return "ActionMetadatum(__typename=" + this.f20232a + ", onRecipeTagList=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Analytics;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f20233a;
        public final AnalyticsFields b;

        public Analytics(String str, AnalyticsFields analyticsFields) {
            this.f20233a = str;
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
            return Intrinsics.c(this.f20233a, analytics.f20233a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20233a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics(__typename=", this.f20233a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$BroadcastBannerAction;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BroadcastBannerAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f20234a;
        public final ActionType b;
        public final String c;

        public BroadcastBannerAction(String str, ActionType actionType, String str2) {
            this.f20234a = str;
            this.b = actionType;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BroadcastBannerAction)) {
                return false;
            }
            BroadcastBannerAction broadcastBannerAction = (BroadcastBannerAction) obj;
            return Intrinsics.c(this.f20234a, broadcastBannerAction.f20234a) && this.b == broadcastBannerAction.b && Intrinsics.c(this.c, broadcastBannerAction.c);
        }

        public final int hashCode() {
            String str = this.f20234a;
            return this.c.hashCode() + d.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        }

        public final String toString() {
            return a.o(d.w("BroadcastBannerAction(id=", this.f20234a, ", type=", this.b, ", action="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$BroadcastBannerUI;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BroadcastBannerUI {

        /* renamed from: a, reason: collision with root package name */
        public final String f20235a;
        public final String b;
        public final CoreBroadcastBannerStyle c;
        public final Icon d;

        public BroadcastBannerUI(String str, String str2, CoreBroadcastBannerStyle coreBroadcastBannerStyle, Icon icon) {
            this.f20235a = str;
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
            return Intrinsics.c(this.f20235a, broadcastBannerUI.f20235a) && Intrinsics.c(this.b, broadcastBannerUI.b) && this.c == broadcastBannerUI.c && Intrinsics.c(this.d, broadcastBannerUI.d);
        }

        public final int hashCode() {
            int iHashCode = this.f20235a.hashCode() * 31;
            String str = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("BroadcastBannerUI(title=", this.f20235a, ", subtitle=", this.b, ", style=");
            sbV.append(this.c);
            sbV.append(", icon=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Button;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        public final String f20236a;
        public final ButtonStyle b;
        public final boolean c;
        public final String d;
        public final String e;

        public Button(String str, ButtonStyle buttonStyle, boolean z, String str2, String str3) {
            this.f20236a = str;
            this.b = buttonStyle;
            this.c = z;
            this.d = str2;
            this.e = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.c(this.f20236a, button.f20236a) && this.b == button.b && this.c == button.c && Intrinsics.c(this.d, button.d) && Intrinsics.c(this.e, button.e);
        }

        public final int hashCode() {
            int iHashCode = this.f20236a.hashCode() * 31;
            ButtonStyle buttonStyle = this.b;
            int iE = b.e((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31, 31, this.c);
            String str = this.d;
            int iHashCode2 = (iE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbQ = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("Button(label=", this.f20236a, ", style=", this.b, ", enabled=");
            au.com.woolworths.android.onesite.a.y(", action=", this.d, ", url=", sbQ, this.c);
            return a.o(sbQ, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Byline;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Byline {

        /* renamed from: a, reason: collision with root package name */
        public final String f20237a;
        public final String b;

        public Byline(String str, String str2) {
            this.f20237a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Byline)) {
                return false;
            }
            Byline byline = (Byline) obj;
            return Intrinsics.c(this.f20237a, byline.f20237a) && Intrinsics.c(this.b, byline.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20237a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("Byline(title=", this.f20237a, ", image=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final RecipeDetails f20238a;

        public Data(RecipeDetails recipeDetails) {
            this.f20238a = recipeDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20238a, ((Data) obj).f20238a);
        }

        public final int hashCode() {
            RecipeDetails recipeDetails = this.f20238a;
            if (recipeDetails == null) {
                return 0;
            }
            return recipeDetails.hashCode();
        }

        public final String toString() {
            return "Data(recipeDetails=" + this.f20238a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Description;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Description {

        /* renamed from: a, reason: collision with root package name */
        public final String f20239a;
        public final String b;
        public final String c;

        public Description(String str, String str2, String str3) {
            this.f20239a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Description)) {
                return false;
            }
            Description description = (Description) obj;
            return Intrinsics.c(this.f20239a, description.f20239a) && Intrinsics.c(this.b, description.b) && Intrinsics.c(this.c, description.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f20239a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("Description(__typename=", this.f20239a, ", title=", this.b, ", content="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Feature;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Feature {

        /* renamed from: a, reason: collision with root package name */
        public final String f20240a;
        public final OnRecipeSummaryFeature b;
        public final OnRecipeSummaryDifficulty c;

        public Feature(String __typename, OnRecipeSummaryFeature onRecipeSummaryFeature, OnRecipeSummaryDifficulty onRecipeSummaryDifficulty) {
            Intrinsics.h(__typename, "__typename");
            this.f20240a = __typename;
            this.b = onRecipeSummaryFeature;
            this.c = onRecipeSummaryDifficulty;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Feature)) {
                return false;
            }
            Feature feature = (Feature) obj;
            return Intrinsics.c(this.f20240a, feature.f20240a) && Intrinsics.c(this.b, feature.b) && Intrinsics.c(this.c, feature.c);
        }

        public final int hashCode() {
            int iHashCode = this.f20240a.hashCode() * 31;
            OnRecipeSummaryFeature onRecipeSummaryFeature = this.b;
            int iHashCode2 = (iHashCode + (onRecipeSummaryFeature == null ? 0 : onRecipeSummaryFeature.hashCode())) * 31;
            OnRecipeSummaryDifficulty onRecipeSummaryDifficulty = this.c;
            return iHashCode2 + (onRecipeSummaryDifficulty != null ? onRecipeSummaryDifficulty.hashCode() : 0);
        }

        public final String toString() {
            return "Feature(__typename=" + this.f20240a + ", onRecipeSummaryFeature=" + this.b + ", onRecipeSummaryDifficulty=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Feature1;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Feature1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f20241a;
        public final String b;

        public Feature1(String str, String str2) {
            this.f20241a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Feature1)) {
                return false;
            }
            Feature1 feature1 = (Feature1) obj;
            return Intrinsics.c(this.f20241a, feature1.f20241a) && Intrinsics.c(this.b, feature1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20241a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Feature1(title=", this.f20241a, ", value=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$GoogleAdBannerCard;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GoogleAdBannerCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f20242a;
        public final String b;
        public final String c;
        public final boolean d;
        public final String e;
        public final AdBannerNativeSize f;
        public final GoogleAdCustomTargeting g;
        public final String h;
        public final Boolean i;

        public GoogleAdBannerCard(String str, String str2, String str3, boolean z, String str4, AdBannerNativeSize adBannerNativeSize, GoogleAdCustomTargeting googleAdCustomTargeting, String str5, Boolean bool) {
            this.f20242a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = str4;
            this.f = adBannerNativeSize;
            this.g = googleAdCustomTargeting;
            this.h = str5;
            this.i = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GoogleAdBannerCard)) {
                return false;
            }
            GoogleAdBannerCard googleAdBannerCard = (GoogleAdBannerCard) obj;
            return Intrinsics.c(this.f20242a, googleAdBannerCard.f20242a) && Intrinsics.c(this.b, googleAdBannerCard.b) && Intrinsics.c(this.c, googleAdBannerCard.c) && this.d == googleAdBannerCard.d && Intrinsics.c(this.e, googleAdBannerCard.e) && this.f == googleAdBannerCard.f && Intrinsics.c(this.g, googleAdBannerCard.g) && Intrinsics.c(this.h, googleAdBannerCard.h) && Intrinsics.c(this.i, googleAdBannerCard.i);
        }

        public final int hashCode() {
            int iE = b.e(b.c(b.c(this.f20242a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            String str = this.e;
            int iHashCode = (this.f.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            GoogleAdCustomTargeting googleAdCustomTargeting = this.g;
            int iHashCode2 = (iHashCode + (googleAdCustomTargeting == null ? 0 : googleAdCustomTargeting.hashCode())) * 31;
            String str2 = this.h;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.i;
            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("GoogleAdBannerCard(__typename=", this.f20242a, ", adUnit=", this.b, ", nativeCustomTemplateId=");
            d.A(this.c, ", iabSpec=", ", iabSize=", sbV, this.d);
            sbV.append(this.e);
            sbV.append(", height=");
            sbV.append(this.f);
            sbV.append(", targeting=");
            sbV.append(this.g);
            sbV.append(", correlator=");
            sbV.append(this.h);
            sbV.append(", _excluded=");
            return au.com.woolworths.android.onesite.a.o(sbV, this.i, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Icon;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Icon {

        /* renamed from: a, reason: collision with root package name */
        public final String f20243a;
        public final OnHostedIcon b;

        public Icon(String __typename, OnHostedIcon onHostedIcon) {
            Intrinsics.h(__typename, "__typename");
            this.f20243a = __typename;
            this.b = onHostedIcon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) obj;
            return Intrinsics.c(this.f20243a, icon.f20243a) && Intrinsics.c(this.b, icon.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20243a.hashCode() * 31;
            OnHostedIcon onHostedIcon = this.b;
            return iHashCode + (onHostedIcon == null ? 0 : onHostedIcon.f20255a.hashCode());
        }

        public final String toString() {
            return "Icon(__typename=" + this.f20243a + ", onHostedIcon=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$ImpressionAnalytics;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f20244a;
        public final AnalyticsFields b;

        public ImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f20244a = str;
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
            return Intrinsics.c(this.f20244a, impressionAnalytics.f20244a) && Intrinsics.c(this.b, impressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20244a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics(__typename=", this.f20244a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$IngredientsSection;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class IngredientsSection {

        /* renamed from: a, reason: collision with root package name */
        public final ServesInfo f20245a;
        public final ArrayList b;

        public IngredientsSection(ServesInfo servesInfo, ArrayList arrayList) {
            this.f20245a = servesInfo;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IngredientsSection)) {
                return false;
            }
            IngredientsSection ingredientsSection = (IngredientsSection) obj;
            return Intrinsics.c(this.f20245a, ingredientsSection.f20245a) && this.b.equals(ingredientsSection.b);
        }

        public final int hashCode() {
            ServesInfo servesInfo = this.f20245a;
            return this.b.hashCode() + ((servesInfo == null ? 0 : servesInfo.hashCode()) * 31);
        }

        public final String toString() {
            return "IngredientsSection(servesInfo=" + this.f20245a + ", ingredients=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Item;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f20246a;
        public final String b;
        public final String c;
        public final String d;

        public Item(String str, String str2, String str3, String str4) {
            this.f20246a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f20246a, item.f20246a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f20246a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(a.v("Item(__typename=", this.f20246a, ", title=", this.b, ", content="), this.c, ", methodImage=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Item1;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f20247a;
        public final OnRecipeSummaryCard b;

        public Item1(String __typename, OnRecipeSummaryCard onRecipeSummaryCard) {
            Intrinsics.h(__typename, "__typename");
            this.f20247a = __typename;
            this.b = onRecipeSummaryCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item1)) {
                return false;
            }
            Item1 item1 = (Item1) obj;
            return Intrinsics.c(this.f20247a, item1.f20247a) && Intrinsics.c(this.b, item1.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20247a.hashCode() * 31;
            OnRecipeSummaryCard onRecipeSummaryCard = this.b;
            return iHashCode + (onRecipeSummaryCard == null ? 0 : onRecipeSummaryCard.hashCode());
        }

        public final String toString() {
            return "Item1(__typename=" + this.f20247a + ", onRecipeSummaryCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$LatestRecipes;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LatestRecipes {

        /* renamed from: a, reason: collision with root package name */
        public final String f20248a;
        public final String b;
        public final ArrayList c;
        public final String d;
        public final ArrayList e;

        public LatestRecipes(String str, String str2, ArrayList arrayList, String str3, ArrayList arrayList2) {
            this.f20248a = str;
            this.b = str2;
            this.c = arrayList;
            this.d = str3;
            this.e = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LatestRecipes)) {
                return false;
            }
            LatestRecipes latestRecipes = (LatestRecipes) obj;
            return this.f20248a.equals(latestRecipes.f20248a) && Intrinsics.c(this.b, latestRecipes.b) && this.c.equals(latestRecipes.c) && Intrinsics.c(this.d, latestRecipes.d) && this.e.equals(latestRecipes.e);
        }

        public final int hashCode() {
            int iHashCode = this.f20248a.hashCode() * 31;
            String str = this.b;
            int iB = androidx.compose.ui.input.pointer.a.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
            String str2 = this.d;
            return this.e.hashCode() + ((iB + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("LatestRecipes(title=", this.f20248a, ", subtitle=", this.b, ", items=");
            sbV.append(this.c);
            sbV.append(", actionTitle=");
            sbV.append(this.d);
            sbV.append(", actionMetadata=");
            return android.support.v4.media.session.a.q(")", sbV, this.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Method;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Method {

        /* renamed from: a, reason: collision with root package name */
        public final String f20249a;
        public final Description b;
        public final ArrayList c;
        public final String d;

        public Method(String str, Description description, ArrayList arrayList, String str2) {
            this.f20249a = str;
            this.b = description;
            this.c = arrayList;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Method)) {
                return false;
            }
            Method method = (Method) obj;
            return this.f20249a.equals(method.f20249a) && Intrinsics.c(this.b, method.b) && this.c.equals(method.c) && Intrinsics.c(this.d, method.d);
        }

        public final int hashCode() {
            int iHashCode = this.f20249a.hashCode() * 31;
            Description description = this.b;
            int iB = androidx.compose.ui.input.pointer.a.b((iHashCode + (description == null ? 0 : description.hashCode())) * 31, 31, this.c);
            String str = this.d;
            return iB + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "Method(__typename=" + this.f20249a + ", description=" + this.b + ", items=" + this.c + ", disclaimer=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$NextBestAction;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NextBestAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f20250a;
        public final OnActionableCard1 b;

        public NextBestAction(String __typename, OnActionableCard1 onActionableCard1) {
            Intrinsics.h(__typename, "__typename");
            this.f20250a = __typename;
            this.b = onActionableCard1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NextBestAction)) {
                return false;
            }
            NextBestAction nextBestAction = (NextBestAction) obj;
            return Intrinsics.c(this.f20250a, nextBestAction.f20250a) && Intrinsics.c(this.b, nextBestAction.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20250a.hashCode() * 31;
            OnActionableCard1 onActionableCard1 = this.b;
            return iHashCode + (onActionableCard1 == null ? 0 : onActionableCard1.hashCode());
        }

        public final String toString() {
            return "NextBestAction(__typename=" + this.f20250a + ", onActionableCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$NutritionTile;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NutritionTile {

        /* renamed from: a, reason: collision with root package name */
        public final String f20251a;
        public final String b;
        public final String c;
        public final int d;
        public final String e;
        public final String f;
        public final ArrayList g;

        public NutritionTile(String str, String str2, String str3, int i, String str4, String str5, ArrayList arrayList) {
            this.f20251a = str;
            this.b = str2;
            this.c = str3;
            this.d = i;
            this.e = str4;
            this.f = str5;
            this.g = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NutritionTile)) {
                return false;
            }
            NutritionTile nutritionTile = (NutritionTile) obj;
            return this.f20251a.equals(nutritionTile.f20251a) && this.b.equals(nutritionTile.b) && this.c.equals(nutritionTile.c) && this.d == nutritionTile.d && this.e.equals(nutritionTile.e) && this.f.equals(nutritionTile.f) && this.g.equals(nutritionTile.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + b.c(b.c(b.a(this.d, b.c(b.c(this.f20251a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sbV = a.v("NutritionTile(title=", this.f20251a, ", perServeKilojoules=", this.b, ", perServeCalories=");
            a.x(this.d, this.c, ", dailyIntakePercentage=", ", dailyIntakeText=", sbV);
            androidx.constraintlayout.core.state.a.B(sbV, this.e, ", disclaimer=", this.f, ", features=");
            return android.support.v4.media.session.a.q(")", sbV, this.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$OnActionableCard;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnActionableCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f20252a;
        public final String b;
        public final String c;
        public final String d;
        public final CardHeight e;
        public final TealiumAnalytics f;
        public final Boolean g;

        public OnActionableCard(String str, String str2, String str3, String str4, CardHeight cardHeight, TealiumAnalytics tealiumAnalytics, Boolean bool) {
            this.f20252a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = cardHeight;
            this.f = tealiumAnalytics;
            this.g = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnActionableCard)) {
                return false;
            }
            OnActionableCard onActionableCard = (OnActionableCard) obj;
            return Intrinsics.c(this.f20252a, onActionableCard.f20252a) && Intrinsics.c(this.b, onActionableCard.b) && Intrinsics.c(this.c, onActionableCard.c) && Intrinsics.c(this.d, onActionableCard.d) && this.e == onActionableCard.e && Intrinsics.c(this.f, onActionableCard.f) && Intrinsics.c(this.g, onActionableCard.g);
        }

        public final int hashCode() {
            int iB = d.b(this.e, b.c(b.c(b.c(this.f20252a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
            TealiumAnalytics tealiumAnalytics = this.f;
            int iHashCode = (iB + (tealiumAnalytics == null ? 0 : tealiumAnalytics.hashCode())) * 31;
            Boolean bool = this.g;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnActionableCard(__typename=", this.f20252a, ", link=", this.b, ", image=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", altText=", this.d, ", cardHeight=");
            sbV.append(this.e);
            sbV.append(", analytics=");
            sbV.append(this.f);
            sbV.append(", _excluded=");
            return au.com.woolworths.android.onesite.a.o(sbV, this.g, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$OnActionableCard1;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnActionableCard1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f20253a;
        public final String b;
        public final String c;
        public final String d;
        public final CardHeight e;
        public final TealiumAnalytics f;
        public final Boolean g;

        public OnActionableCard1(String str, String str2, String str3, String str4, CardHeight cardHeight, TealiumAnalytics tealiumAnalytics, Boolean bool) {
            this.f20253a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = cardHeight;
            this.f = tealiumAnalytics;
            this.g = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnActionableCard1)) {
                return false;
            }
            OnActionableCard1 onActionableCard1 = (OnActionableCard1) obj;
            return Intrinsics.c(this.f20253a, onActionableCard1.f20253a) && Intrinsics.c(this.b, onActionableCard1.b) && Intrinsics.c(this.c, onActionableCard1.c) && Intrinsics.c(this.d, onActionableCard1.d) && this.e == onActionableCard1.e && Intrinsics.c(this.f, onActionableCard1.f) && Intrinsics.c(this.g, onActionableCard1.g);
        }

        public final int hashCode() {
            int iB = d.b(this.e, b.c(b.c(b.c(this.f20253a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
            TealiumAnalytics tealiumAnalytics = this.f;
            int iHashCode = (iB + (tealiumAnalytics == null ? 0 : tealiumAnalytics.hashCode())) * 31;
            Boolean bool = this.g;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnActionableCard1(__typename=", this.f20253a, ", link=", this.b, ", image=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", altText=", this.d, ", cardHeight=");
            sbV.append(this.e);
            sbV.append(", analytics=");
            sbV.append(this.f);
            sbV.append(", _excluded=");
            return au.com.woolworths.android.onesite.a.o(sbV, this.g, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$OnGoogleAdBannerCard;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnGoogleAdBannerCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f20254a;
        public final String b;
        public final String c;
        public final boolean d;
        public final String e;
        public final AdBannerNativeSize f;
        public final GoogleAdCustomTargeting g;
        public final Boolean h;

        public OnGoogleAdBannerCard(String str, String str2, boolean z, String str3, AdBannerNativeSize adBannerNativeSize, GoogleAdCustomTargeting googleAdCustomTargeting, String str4, Boolean bool) {
            this.f20254a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = str4;
            this.f = adBannerNativeSize;
            this.g = googleAdCustomTargeting;
            this.h = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnGoogleAdBannerCard)) {
                return false;
            }
            OnGoogleAdBannerCard onGoogleAdBannerCard = (OnGoogleAdBannerCard) obj;
            return Intrinsics.c(this.f20254a, onGoogleAdBannerCard.f20254a) && Intrinsics.c(this.b, onGoogleAdBannerCard.b) && Intrinsics.c(this.c, onGoogleAdBannerCard.c) && this.d == onGoogleAdBannerCard.d && Intrinsics.c(this.e, onGoogleAdBannerCard.e) && this.f == onGoogleAdBannerCard.f && Intrinsics.c(this.g, onGoogleAdBannerCard.g) && Intrinsics.c(this.h, onGoogleAdBannerCard.h);
        }

        public final int hashCode() {
            int iE = b.e(b.c(b.c(this.f20254a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            String str = this.e;
            int iHashCode = (this.f.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            GoogleAdCustomTargeting googleAdCustomTargeting = this.g;
            int iHashCode2 = (iHashCode + (googleAdCustomTargeting == null ? 0 : googleAdCustomTargeting.hashCode())) * 31;
            Boolean bool = this.h;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnGoogleAdBannerCard(__typename=", this.f20254a, ", adUnit=", this.b, ", nativeCustomTemplateId=");
            d.A(this.c, ", iabSpec=", ", iabSize=", sbV, this.d);
            sbV.append(this.e);
            sbV.append(", height=");
            sbV.append(this.f);
            sbV.append(", targeting=");
            sbV.append(this.g);
            sbV.append(", _excluded=");
            sbV.append(this.h);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$OnHostedIcon;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f20255a;

        public OnHostedIcon(String str) {
            this.f20255a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon) && Intrinsics.c(this.f20255a, ((OnHostedIcon) obj).f20255a);
        }

        public final int hashCode() {
            return this.f20255a.hashCode();
        }

        public final String toString() {
            return a.h("OnHostedIcon(url=", this.f20255a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$OnRecipeSummaryCard;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRecipeSummaryCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f20256a;
        public final RecipeSummaryCardFragment b;

        public OnRecipeSummaryCard(String str, RecipeSummaryCardFragment recipeSummaryCardFragment) {
            this.f20256a = str;
            this.b = recipeSummaryCardFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRecipeSummaryCard)) {
                return false;
            }
            OnRecipeSummaryCard onRecipeSummaryCard = (OnRecipeSummaryCard) obj;
            return Intrinsics.c(this.f20256a, onRecipeSummaryCard.f20256a) && Intrinsics.c(this.b, onRecipeSummaryCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20256a.hashCode() * 31);
        }

        public final String toString() {
            return "OnRecipeSummaryCard(__typename=" + this.f20256a + ", recipeSummaryCardFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$OnRecipeSummaryDifficulty;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRecipeSummaryDifficulty {

        /* renamed from: a, reason: collision with root package name */
        public final String f20257a;
        public final int b;
        public final int c;
        public final String d;

        public OnRecipeSummaryDifficulty(String str, int i, int i2, String str2) {
            this.f20257a = str;
            this.b = i;
            this.c = i2;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRecipeSummaryDifficulty)) {
                return false;
            }
            OnRecipeSummaryDifficulty onRecipeSummaryDifficulty = (OnRecipeSummaryDifficulty) obj;
            return Intrinsics.c(this.f20257a, onRecipeSummaryDifficulty.f20257a) && this.b == onRecipeSummaryDifficulty.b && this.c == onRecipeSummaryDifficulty.c && Intrinsics.c(this.d, onRecipeSummaryDifficulty.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + b.a(this.c, b.a(this.b, this.f20257a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sbU = b.u("OnRecipeSummaryDifficulty(title=", this.b, this.f20257a, ", value=", ", maxValue=");
            sbU.append(this.c);
            sbU.append(", altText=");
            sbU.append(this.d);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$OnRecipeSummaryFeature;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRecipeSummaryFeature {

        /* renamed from: a, reason: collision with root package name */
        public final String f20258a;
        public final String b;
        public final String c;
        public final String d;
        public final FeatureType e;

        public OnRecipeSummaryFeature(String str, String str2, String str3, String str4, FeatureType featureType) {
            this.f20258a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = featureType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRecipeSummaryFeature)) {
                return false;
            }
            OnRecipeSummaryFeature onRecipeSummaryFeature = (OnRecipeSummaryFeature) obj;
            return Intrinsics.c(this.f20258a, onRecipeSummaryFeature.f20258a) && Intrinsics.c(this.b, onRecipeSummaryFeature.b) && Intrinsics.c(this.c, onRecipeSummaryFeature.c) && Intrinsics.c(this.d, onRecipeSummaryFeature.d) && this.e == onRecipeSummaryFeature.e;
        }

        public final int hashCode() {
            int iC = b.c(this.f20258a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return this.e.hashCode() + b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnRecipeSummaryFeature(title=", this.f20258a, ", amount=", this.b, ", unit=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", altText=", this.d, ", featureType=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$OnRecipeTagList;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRecipeTagList {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f20259a;

        public OnRecipeTagList(ArrayList arrayList) {
            this.f20259a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRecipeTagList) && this.f20259a.equals(((OnRecipeTagList) obj).f20259a);
        }

        public final int hashCode() {
            return this.f20259a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("OnRecipeTagList(tags=", ")", this.f20259a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$OnUniversalInventoryContainer;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnUniversalInventoryContainer {

        /* renamed from: a, reason: collision with root package name */
        public final GoogleAdBannerCard f20260a;
        public final NextBestAction b;

        public OnUniversalInventoryContainer(GoogleAdBannerCard googleAdBannerCard, NextBestAction nextBestAction) {
            this.f20260a = googleAdBannerCard;
            this.b = nextBestAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnUniversalInventoryContainer)) {
                return false;
            }
            OnUniversalInventoryContainer onUniversalInventoryContainer = (OnUniversalInventoryContainer) obj;
            return Intrinsics.c(this.f20260a, onUniversalInventoryContainer.f20260a) && Intrinsics.c(this.b, onUniversalInventoryContainer.b);
        }

        public final int hashCode() {
            GoogleAdBannerCard googleAdBannerCard = this.f20260a;
            int iHashCode = (googleAdBannerCard == null ? 0 : googleAdBannerCard.hashCode()) * 31;
            NextBestAction nextBestAction = this.b;
            return iHashCode + (nextBestAction != null ? nextBestAction.hashCode() : 0);
        }

        public final String toString() {
            return "OnUniversalInventoryContainer(googleAdBannerCard=" + this.f20260a + ", nextBestAction=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$RecipeCostPerServe;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RecipeCostPerServe {

        /* renamed from: a, reason: collision with root package name */
        public final double f20261a;
        public final RecipeCostPerServeBanner b;

        public RecipeCostPerServe(double d, RecipeCostPerServeBanner recipeCostPerServeBanner) {
            this.f20261a = d;
            this.b = recipeCostPerServeBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecipeCostPerServe)) {
                return false;
            }
            RecipeCostPerServe recipeCostPerServe = (RecipeCostPerServe) obj;
            return Double.compare(this.f20261a, recipeCostPerServe.f20261a) == 0 && Intrinsics.c(this.b, recipeCostPerServe.b);
        }

        public final int hashCode() {
            int iHashCode = Double.hashCode(this.f20261a) * 31;
            RecipeCostPerServeBanner recipeCostPerServeBanner = this.b;
            return iHashCode + (recipeCostPerServeBanner == null ? 0 : recipeCostPerServeBanner.hashCode());
        }

        public final String toString() {
            return "RecipeCostPerServe(recipeCostPerServePrice=" + this.f20261a + ", recipeCostPerServeBanner=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$RecipeCostPerServeBanner;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RecipeCostPerServeBanner {

        /* renamed from: a, reason: collision with root package name */
        public final BroadcastBannerUI f20262a;
        public final String b;
        public final BroadcastBannerAction c;

        public RecipeCostPerServeBanner(BroadcastBannerUI broadcastBannerUI, String str, BroadcastBannerAction broadcastBannerAction) {
            this.f20262a = broadcastBannerUI;
            this.b = str;
            this.c = broadcastBannerAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecipeCostPerServeBanner)) {
                return false;
            }
            RecipeCostPerServeBanner recipeCostPerServeBanner = (RecipeCostPerServeBanner) obj;
            return Intrinsics.c(this.f20262a, recipeCostPerServeBanner.f20262a) && Intrinsics.c(this.b, recipeCostPerServeBanner.b) && Intrinsics.c(this.c, recipeCostPerServeBanner.c);
        }

        public final int hashCode() {
            int iHashCode = this.f20262a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            BroadcastBannerAction broadcastBannerAction = this.c;
            return iHashCode2 + (broadcastBannerAction != null ? broadcastBannerAction.hashCode() : 0);
        }

        public final String toString() {
            return "RecipeCostPerServeBanner(broadcastBannerUI=" + this.f20262a + ", broadcastBannerActionLabel=" + this.b + ", broadcastBannerAction=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$RecipeDetails;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RecipeDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f20263a;
        public final RecipeCostPerServe b;
        public final String c;
        public final String d;
        public final String e;
        public final ArrayList f;
        public final ArrayList g;
        public final String h;
        public final ArrayList i;
        public final Method j;
        public final Byline k;
        public final ImpressionAnalytics l;
        public final Analytics m;
        public final List n;
        public final LatestRecipes o;
        public final NutritionTile p;
        public final UserInteraction q;
        public final IngredientsSection r;
        public final UniversalInventory s;
        public final ShopIngredientButton t;
        public final Video u;

        public RecipeDetails(String str, RecipeCostPerServe recipeCostPerServe, String str2, String str3, String str4, ArrayList arrayList, ArrayList arrayList2, String str5, ArrayList arrayList3, Method method, Byline byline, ImpressionAnalytics impressionAnalytics, Analytics analytics, List list, LatestRecipes latestRecipes, NutritionTile nutritionTile, UserInteraction userInteraction, IngredientsSection ingredientsSection, UniversalInventory universalInventory, ShopIngredientButton shopIngredientButton, Video video) {
            this.f20263a = str;
            this.b = recipeCostPerServe;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = arrayList;
            this.g = arrayList2;
            this.h = str5;
            this.i = arrayList3;
            this.j = method;
            this.k = byline;
            this.l = impressionAnalytics;
            this.m = analytics;
            this.n = list;
            this.o = latestRecipes;
            this.p = nutritionTile;
            this.q = userInteraction;
            this.r = ingredientsSection;
            this.s = universalInventory;
            this.t = shopIngredientButton;
            this.u = video;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecipeDetails)) {
                return false;
            }
            RecipeDetails recipeDetails = (RecipeDetails) obj;
            return this.f20263a.equals(recipeDetails.f20263a) && Intrinsics.c(this.b, recipeDetails.b) && Intrinsics.c(this.c, recipeDetails.c) && this.d.equals(recipeDetails.d) && this.e.equals(recipeDetails.e) && this.f.equals(recipeDetails.f) && this.g.equals(recipeDetails.g) && Intrinsics.c(this.h, recipeDetails.h) && this.i.equals(recipeDetails.i) && this.j.equals(recipeDetails.j) && Intrinsics.c(this.k, recipeDetails.k) && Intrinsics.c(this.l, recipeDetails.l) && Intrinsics.c(this.m, recipeDetails.m) && Intrinsics.c(this.n, recipeDetails.n) && Intrinsics.c(this.o, recipeDetails.o) && Intrinsics.c(this.p, recipeDetails.p) && Intrinsics.c(this.q, recipeDetails.q) && this.r.equals(recipeDetails.r) && Intrinsics.c(this.s, recipeDetails.s) && this.t.equals(recipeDetails.t) && Intrinsics.c(this.u, recipeDetails.u);
        }

        public final int hashCode() {
            int iHashCode = this.f20263a.hashCode() * 31;
            RecipeCostPerServe recipeCostPerServe = this.b;
            int iHashCode2 = (iHashCode + (recipeCostPerServe == null ? 0 : recipeCostPerServe.hashCode())) * 31;
            String str = this.c;
            int iB = androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(b.c(b.c((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
            String str2 = this.h;
            int iHashCode3 = (this.j.hashCode() + androidx.compose.ui.input.pointer.a.b((iB + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i)) * 31;
            Byline byline = this.k;
            int iHashCode4 = (iHashCode3 + (byline == null ? 0 : byline.hashCode())) * 31;
            ImpressionAnalytics impressionAnalytics = this.l;
            int iHashCode5 = (iHashCode4 + (impressionAnalytics == null ? 0 : impressionAnalytics.hashCode())) * 31;
            Analytics analytics = this.m;
            int iHashCode6 = (iHashCode5 + (analytics == null ? 0 : analytics.hashCode())) * 31;
            List list = this.n;
            int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
            LatestRecipes latestRecipes = this.o;
            int iHashCode8 = (iHashCode7 + (latestRecipes == null ? 0 : latestRecipes.hashCode())) * 31;
            NutritionTile nutritionTile = this.p;
            int iHashCode9 = (iHashCode8 + (nutritionTile == null ? 0 : nutritionTile.hashCode())) * 31;
            UserInteraction userInteraction = this.q;
            int iHashCode10 = (this.r.hashCode() + ((iHashCode9 + (userInteraction == null ? 0 : userInteraction.hashCode())) * 31)) * 31;
            UniversalInventory universalInventory = this.s;
            int iHashCode11 = (this.t.f20265a.hashCode() + ((iHashCode10 + (universalInventory == null ? 0 : universalInventory.hashCode())) * 31)) * 31;
            Video video = this.u;
            return iHashCode11 + (video != null ? video.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RecipeDetails(id=");
            sb.append(this.f20263a);
            sb.append(", recipeCostPerServe=");
            sb.append(this.b);
            sb.append(", recipeUrl=");
            androidx.constraintlayout.core.state.a.B(sb, this.c, ", title=", this.d, ", image=");
            sb.append(this.e);
            sb.append(", ingredientProductIds=");
            sb.append(this.f);
            sb.append(", ingredients=");
            sb.append(this.g);
            sb.append(", sourceName=");
            sb.append(this.h);
            sb.append(", tags=");
            sb.append(this.i);
            sb.append(", method=");
            sb.append(this.j);
            sb.append(", byline=");
            sb.append(this.k);
            sb.append(", impressionAnalytics=");
            sb.append(this.l);
            sb.append(", analytics=");
            sb.append(this.m);
            sb.append(", features=");
            sb.append(this.n);
            sb.append(", latestRecipes=");
            sb.append(this.o);
            sb.append(", nutritionTile=");
            sb.append(this.p);
            sb.append(", userInteraction=");
            sb.append(this.q);
            sb.append(", ingredientsSection=");
            sb.append(this.r);
            sb.append(", universalInventory=");
            sb.append(this.s);
            sb.append(", shopIngredientButton=");
            sb.append(this.t);
            sb.append(", video=");
            sb.append(this.u);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$ServesInfo;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ServesInfo {

        /* renamed from: a, reason: collision with root package name */
        public final int f20264a;
        public final String b;
        public final int c;
        public final int d;

        public ServesInfo(int i, int i2, int i3, String str) {
            this.f20264a = i;
            this.b = str;
            this.c = i2;
            this.d = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServesInfo)) {
                return false;
            }
            ServesInfo servesInfo = (ServesInfo) obj;
            return this.f20264a == servesInfo.f20264a && Intrinsics.c(this.b, servesInfo.b) && this.c == servesInfo.c && this.d == servesInfo.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + b.a(this.c, b.c(Integer.hashCode(this.f20264a) * 31, 31, this.b), 31);
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.i(this.c, this.d, ", maximum=", ")", androidx.constraintlayout.core.state.a.p("ServesInfo(quantity=", this.f20264a, ", title=", this.b, ", minimum="));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$ShopIngredientButton;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShopIngredientButton {

        /* renamed from: a, reason: collision with root package name */
        public final Button f20265a;

        public ShopIngredientButton(Button button) {
            this.f20265a = button;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShopIngredientButton) && Intrinsics.c(this.f20265a, ((ShopIngredientButton) obj).f20265a);
        }

        public final int hashCode() {
            return this.f20265a.hashCode();
        }

        public final String toString() {
            return "ShopIngredientButton(button=" + this.f20265a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$UniversalInventory;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UniversalInventory {

        /* renamed from: a, reason: collision with root package name */
        public final String f20266a;
        public final OnActionableCard b;
        public final OnGoogleAdBannerCard c;
        public final OnUniversalInventoryContainer d;

        public UniversalInventory(String __typename, OnActionableCard onActionableCard, OnGoogleAdBannerCard onGoogleAdBannerCard, OnUniversalInventoryContainer onUniversalInventoryContainer) {
            Intrinsics.h(__typename, "__typename");
            this.f20266a = __typename;
            this.b = onActionableCard;
            this.c = onGoogleAdBannerCard;
            this.d = onUniversalInventoryContainer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UniversalInventory)) {
                return false;
            }
            UniversalInventory universalInventory = (UniversalInventory) obj;
            return Intrinsics.c(this.f20266a, universalInventory.f20266a) && Intrinsics.c(this.b, universalInventory.b) && Intrinsics.c(this.c, universalInventory.c) && Intrinsics.c(this.d, universalInventory.d);
        }

        public final int hashCode() {
            int iHashCode = this.f20266a.hashCode() * 31;
            OnActionableCard onActionableCard = this.b;
            int iHashCode2 = (iHashCode + (onActionableCard == null ? 0 : onActionableCard.hashCode())) * 31;
            OnGoogleAdBannerCard onGoogleAdBannerCard = this.c;
            int iHashCode3 = (iHashCode2 + (onGoogleAdBannerCard == null ? 0 : onGoogleAdBannerCard.hashCode())) * 31;
            OnUniversalInventoryContainer onUniversalInventoryContainer = this.d;
            return iHashCode3 + (onUniversalInventoryContainer != null ? onUniversalInventoryContainer.hashCode() : 0);
        }

        public final String toString() {
            return "UniversalInventory(__typename=" + this.f20266a + ", onActionableCard=" + this.b + ", onGoogleAdBannerCard=" + this.c + ", onUniversalInventoryContainer=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$UserInteraction;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UserInteraction {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f20267a;
        public final String b;

        public UserInteraction(String str, Boolean bool) {
            this.f20267a = bool;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserInteraction)) {
                return false;
            }
            UserInteraction userInteraction = (UserInteraction) obj;
            return Intrinsics.c(this.f20267a, userInteraction.f20267a) && Intrinsics.c(this.b, userInteraction.b);
        }

        public final int hashCode() {
            Boolean bool = this.f20267a;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "UserInteraction(isSaved=" + this.f20267a + ", recipeUrl=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Video;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Video {

        /* renamed from: a, reason: collision with root package name */
        public final String f20268a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public Video(String str, String str2, String str3, String str4, String str5) {
            this.f20268a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Video)) {
                return false;
            }
            Video video = (Video) obj;
            return Intrinsics.c(this.f20268a, video.f20268a) && Intrinsics.c(this.b, video.b) && Intrinsics.c(this.c, video.c) && Intrinsics.c(this.d, video.d) && Intrinsics.c(this.e, video.e);
        }

        public final int hashCode() {
            int iC = b.c(b.c(b.c(this.f20268a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            String str = this.e;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("Video(url=", this.f20268a, ", title=", this.b, ", thumbnail=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", duration=", this.d, ", id=");
            return a.o(sbV, this.e, ")");
        }
    }

    public RecipeDetailsQuery(Optional optional, String recipeId, Optional optional2, boolean z) {
        Intrinsics.h(recipeId, "recipeId");
        this.f20231a = optional;
        this.b = recipeId;
        this.c = optional2;
        this.d = z;
        this.e = Optional.Absent.f13523a;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(RecipeDetailsQuery_ResponseAdapter.Data.f20281a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query RecipeDetails($shoppingMode: ShoppingModeType, $recipeId: String!, $supportedLinks: [String!], $includeUniversalInventoryFallback: Boolean!, $isVideoTagOnRecipeCardEnabled: Boolean! = false ) { recipeDetails(shoppingMode: $shoppingMode, recipeId: $recipeId, supportedLinks: $supportedLinks) { id recipeCostPerServe { recipeCostPerServePrice recipeCostPerServeBanner { broadcastBannerUI { title subtitle style icon { __typename ... on HostedIcon { url } } } broadcastBannerActionLabel broadcastBannerAction { id type action } } } recipeUrl title image ingredientProductIds ingredients sourceName tags method { __typename description { __typename title content } items { __typename title content methodImage: image } disclaimer } byline { title image } impressionAnalytics { __typename ...analyticsFields } analytics { __typename ...analyticsFields } features { __typename ... on RecipeSummaryFeature { title amount unit altText featureType } ... on RecipeSummaryDifficulty { title value maxValue altText } } latestRecipes { title subtitle items { __typename ... on RecipeSummaryCard { __typename ...recipeSummaryCardFragment } } actionTitle actionMetadata { __typename ... on RecipeTagList { tags } } } nutritionTile { title perServeKilojoules perServeCalories dailyIntakePercentage dailyIntakeText disclaimer features { title value } } userInteraction { isSaved recipeUrl } ingredientsSection { servesInfo { quantity title minimum maximum } ingredients } universalInventory { __typename ... on ActionableCard { __typename link image altText cardHeight analytics _excluded } ... on GoogleAdBannerCard @skip(if: $includeUniversalInventoryFallback) { __typename adUnit nativeCustomTemplateId iabSpec iabSize height targeting _excluded } ... on UniversalInventoryContainer @include(if: $includeUniversalInventoryFallback) { googleAdBannerCard { __typename adUnit nativeCustomTemplateId iabSpec iabSize height targeting correlator _excluded } nextBestAction { __typename ... on ActionableCard { __typename link image altText cardHeight analytics _excluded } } } } shopIngredientButton { button { label style enabled action url } } video { url title thumbnail duration id } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment recipeSummaryCardFragment on RecipeSummaryCard { title image id tags sourceName isVideoAvailable @include(if: $isVideoTagOnRecipeCardEnabled) recipePrepDuration { duration altText } recipeCookDuration { duration altText } recipeCostPerServe { recipeCostPerServePrice } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipeDetailsQuery)) {
            return false;
        }
        RecipeDetailsQuery recipeDetailsQuery = (RecipeDetailsQuery) obj;
        return Intrinsics.c(this.f20231a, recipeDetailsQuery.f20231a) && Intrinsics.c(this.b, recipeDetailsQuery.b) && Intrinsics.c(this.c, recipeDetailsQuery.c) && this.d == recipeDetailsQuery.d && Intrinsics.c(this.e, recipeDetailsQuery.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.c, b.c(this.f20231a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "5ec549b030122c98a1b474a03c937bb4966bd609f8a7a04df19a8350be5e0f70";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "RecipeDetails";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Optional optional = this.f20231a;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("shoppingMode");
            Adapters.d(Adapters.b(ShoppingModeType_ResponseAdapter.f12118a)).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
        jsonWriter.F1("recipeId");
        Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
        adapters$StringAdapter$1.toJson(jsonWriter, customScalarAdapters, this.b);
        Optional optional2 = this.c;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("supportedLinks");
            Adapters.d(Adapters.b(Adapters.a(adapters$StringAdapter$1))).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        }
        jsonWriter.F1("includeUniversalInventoryFallback");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.d));
        Optional optional3 = this.e;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("isVideoTagOnRecipeCardEnabled");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        } else if (z) {
            jsonWriter.F1("isVideoTagOnRecipeCardEnabled");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecipeDetailsQuery(shoppingMode=");
        sb.append(this.f20231a);
        sb.append(", recipeId=");
        sb.append(this.b);
        sb.append(", supportedLinks=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.y(sb, this.c, ", includeUniversalInventoryFallback=", this.d, ", isVideoTagOnRecipeCardEnabled=");
        return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.o(sb, this.e, ")");
    }
}
