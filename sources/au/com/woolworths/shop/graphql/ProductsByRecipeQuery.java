package au.com.woolworths.shop.graphql;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.shop.graphql.adapter.ProductsByRecipeQuery_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.ListSectionHeaderTypes;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000e\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/shop/graphql/ProductsByRecipeQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/shop/graphql/ProductsByRecipeQuery$Data;", "Data", "ProductsByRecipe", "ProductsFeed", "OnIngredientCard", "SwapButton", "AlternativeProduct", "Analytics", "OnListSectionHeader", "OnProductCard", "OnDietaryDisclaimer", "InsetBanner", "Action", "DietaryInfo", "Companion", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductsByRecipeQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f10946a;
    public final Optional b;
    public final Optional c;
    public final boolean d;
    public final Optional e;
    public final Optional f;
    public final boolean g;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/ProductsByRecipeQuery$Action;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerActionPlacement f10947a;
        public final InsetBannerActionType b;
        public final String c;
        public final String d;

        public Action(InsetBannerActionPlacement insetBannerActionPlacement, InsetBannerActionType insetBannerActionType, String str, String str2) {
            this.f10947a = insetBannerActionPlacement;
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
            return this.f10947a == action.f10947a && this.b == action.b && Intrinsics.c(this.c, action.c) && Intrinsics.c(this.d, action.d);
        }

        public final int hashCode() {
            int iC = b.c(d.c(this.b, this.f10947a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.l(d.t("Action(placement=", this.f10947a, ", type=", this.b, ", label="), this.c, ", url=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/ProductsByRecipeQuery$AlternativeProduct;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AlternativeProduct {

        /* renamed from: a, reason: collision with root package name */
        public final String f10948a;
        public final ProductCard b;

        public AlternativeProduct(String str, ProductCard productCard) {
            this.f10948a = str;
            this.b = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AlternativeProduct)) {
                return false;
            }
            AlternativeProduct alternativeProduct = (AlternativeProduct) obj;
            return Intrinsics.c(this.f10948a, alternativeProduct.f10948a) && Intrinsics.c(this.b, alternativeProduct.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10948a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("AlternativeProduct(__typename=", this.f10948a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/ProductsByRecipeQuery$Analytics;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f10949a;

        public Analytics(String str) {
            this.f10949a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Analytics) && Intrinsics.c(this.f10949a, ((Analytics) obj).f10949a);
        }

        public final int hashCode() {
            return this.f10949a.hashCode();
        }

        public final String toString() {
            return YU.a.h("Analytics(label=", this.f10949a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/graphql/ProductsByRecipeQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/ProductsByRecipeQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ProductsByRecipe f10950a;

        public Data(ProductsByRecipe productsByRecipe) {
            this.f10950a = productsByRecipe;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f10950a, ((Data) obj).f10950a);
        }

        public final int hashCode() {
            ProductsByRecipe productsByRecipe = this.f10950a;
            if (productsByRecipe == null) {
                return 0;
            }
            return productsByRecipe.hashCode();
        }

        public final String toString() {
            return "Data(productsByRecipe=" + this.f10950a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/ProductsByRecipeQuery$DietaryInfo;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DietaryInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f10951a;
        public final String b;

        public DietaryInfo(String str, String str2) {
            this.f10951a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DietaryInfo)) {
                return false;
            }
            DietaryInfo dietaryInfo = (DietaryInfo) obj;
            return Intrinsics.c(this.f10951a, dietaryInfo.f10951a) && Intrinsics.c(this.b, dietaryInfo.b);
        }

        public final int hashCode() {
            String str = this.f10951a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return YU.a.j("DietaryInfo(title=", this.f10951a, ", content=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/ProductsByRecipeQuery$InsetBanner;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InsetBanner {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f10952a;
        public final String b;
        public final String c;
        public final Action d;

        public InsetBanner(InsetBannerDisplayType insetBannerDisplayType, String str, String str2, Action action) {
            this.f10952a = insetBannerDisplayType;
            this.b = str;
            this.c = str2;
            this.d = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InsetBanner)) {
                return false;
            }
            InsetBanner insetBanner = (InsetBanner) obj;
            return this.f10952a == insetBanner.f10952a && Intrinsics.c(this.b, insetBanner.b) && Intrinsics.c(this.c, insetBanner.c) && Intrinsics.c(this.d, insetBanner.d);
        }

        public final int hashCode() {
            int iC = b.c(this.f10952a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Action action = this.d;
            return iHashCode + (action != null ? action.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbU = d.u("InsetBanner(displayType=", this.f10952a, ", message=", this.b, ", title=");
            sbU.append(this.c);
            sbU.append(", action=");
            sbU.append(this.d);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/ProductsByRecipeQuery$OnDietaryDisclaimer;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnDietaryDisclaimer {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBanner f10953a;
        public final DietaryInfo b;

        public OnDietaryDisclaimer(InsetBanner insetBanner, DietaryInfo dietaryInfo) {
            this.f10953a = insetBanner;
            this.b = dietaryInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnDietaryDisclaimer)) {
                return false;
            }
            OnDietaryDisclaimer onDietaryDisclaimer = (OnDietaryDisclaimer) obj;
            return Intrinsics.c(this.f10953a, onDietaryDisclaimer.f10953a) && Intrinsics.c(this.b, onDietaryDisclaimer.b);
        }

        public final int hashCode() {
            int iHashCode = this.f10953a.hashCode() * 31;
            DietaryInfo dietaryInfo = this.b;
            return iHashCode + (dietaryInfo == null ? 0 : dietaryInfo.hashCode());
        }

        public final String toString() {
            return "OnDietaryDisclaimer(insetBanner=" + this.f10953a + ", dietaryInfo=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/ProductsByRecipeQuery$OnIngredientCard;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnIngredientCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f10954a;
        public final SwapButton b;
        public final ArrayList c;
        public final Analytics d;

        public OnIngredientCard(String str, SwapButton swapButton, ArrayList arrayList, Analytics analytics) {
            this.f10954a = str;
            this.b = swapButton;
            this.c = arrayList;
            this.d = analytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnIngredientCard)) {
                return false;
            }
            OnIngredientCard onIngredientCard = (OnIngredientCard) obj;
            return this.f10954a.equals(onIngredientCard.f10954a) && Intrinsics.c(this.b, onIngredientCard.b) && this.c.equals(onIngredientCard.c) && this.d.equals(onIngredientCard.d);
        }

        public final int hashCode() {
            int iHashCode = this.f10954a.hashCode() * 31;
            SwapButton swapButton = this.b;
            return this.d.f10949a.hashCode() + androidx.compose.ui.input.pointer.a.b((iHashCode + (swapButton == null ? 0 : swapButton.hashCode())) * 31, 31, this.c);
        }

        public final String toString() {
            return "OnIngredientCard(ingredientDetails=" + this.f10954a + ", swapButton=" + this.b + ", alternativeProducts=" + this.c + ", analytics=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/ProductsByRecipeQuery$OnListSectionHeader;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnListSectionHeader {

        /* renamed from: a, reason: collision with root package name */
        public final ListSectionHeaderTypes f10955a;
        public final String b;

        public OnListSectionHeader(ListSectionHeaderTypes listSectionHeaderTypes, String str) {
            this.f10955a = listSectionHeaderTypes;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnListSectionHeader)) {
                return false;
            }
            OnListSectionHeader onListSectionHeader = (OnListSectionHeader) obj;
            return this.f10955a == onListSectionHeader.f10955a && Intrinsics.c(this.b, onListSectionHeader.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10955a.hashCode() * 31);
        }

        public final String toString() {
            return "OnListSectionHeader(listSectionHeaderType=" + this.f10955a + ", listSectionHeaderText=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/ProductsByRecipeQuery$OnProductCard;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f10956a;
        public final ProductCard b;

        public OnProductCard(String str, ProductCard productCard) {
            this.f10956a = str;
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
            return Intrinsics.c(this.f10956a, onProductCard.f10956a) && Intrinsics.c(this.b, onProductCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10956a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard(__typename=", this.f10956a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/ProductsByRecipeQuery$ProductsByRecipe;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductsByRecipe {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f10957a;
        public final Integer b;
        public final ArrayList c;

        public ProductsByRecipe(Integer num, Integer num2, ArrayList arrayList) {
            this.f10957a = num;
            this.b = num2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductsByRecipe)) {
                return false;
            }
            ProductsByRecipe productsByRecipe = (ProductsByRecipe) obj;
            return Intrinsics.c(this.f10957a, productsByRecipe.f10957a) && Intrinsics.c(this.b, productsByRecipe.b) && this.c.equals(productsByRecipe.c);
        }

        public final int hashCode() {
            Integer num = this.f10957a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.b;
            return this.c.hashCode() + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", d.v("ProductsByRecipe(totalNumberOfProducts=", this.f10957a, ", nextPage=", this.b, ", productsFeed="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/ProductsByRecipeQuery$ProductsFeed;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductsFeed {

        /* renamed from: a, reason: collision with root package name */
        public final String f10958a;
        public final OnIngredientCard b;
        public final OnListSectionHeader c;
        public final OnProductCard d;
        public final OnDietaryDisclaimer e;

        public ProductsFeed(String __typename, OnIngredientCard onIngredientCard, OnListSectionHeader onListSectionHeader, OnProductCard onProductCard, OnDietaryDisclaimer onDietaryDisclaimer) {
            Intrinsics.h(__typename, "__typename");
            this.f10958a = __typename;
            this.b = onIngredientCard;
            this.c = onListSectionHeader;
            this.d = onProductCard;
            this.e = onDietaryDisclaimer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductsFeed)) {
                return false;
            }
            ProductsFeed productsFeed = (ProductsFeed) obj;
            return Intrinsics.c(this.f10958a, productsFeed.f10958a) && Intrinsics.c(this.b, productsFeed.b) && Intrinsics.c(this.c, productsFeed.c) && Intrinsics.c(this.d, productsFeed.d) && Intrinsics.c(this.e, productsFeed.e);
        }

        public final int hashCode() {
            int iHashCode = this.f10958a.hashCode() * 31;
            OnIngredientCard onIngredientCard = this.b;
            int iHashCode2 = (iHashCode + (onIngredientCard == null ? 0 : onIngredientCard.hashCode())) * 31;
            OnListSectionHeader onListSectionHeader = this.c;
            int iHashCode3 = (iHashCode2 + (onListSectionHeader == null ? 0 : onListSectionHeader.hashCode())) * 31;
            OnProductCard onProductCard = this.d;
            int iHashCode4 = (iHashCode3 + (onProductCard == null ? 0 : onProductCard.hashCode())) * 31;
            OnDietaryDisclaimer onDietaryDisclaimer = this.e;
            return iHashCode4 + (onDietaryDisclaimer != null ? onDietaryDisclaimer.hashCode() : 0);
        }

        public final String toString() {
            return "ProductsFeed(__typename=" + this.f10958a + ", onIngredientCard=" + this.b + ", onListSectionHeader=" + this.c + ", onProductCard=" + this.d + ", onDietaryDisclaimer=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/ProductsByRecipeQuery$SwapButton;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SwapButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f10959a;
        public final ButtonStyle b;
        public final boolean c;
        public final String d;
        public final String e;
        public final String f;

        public SwapButton(ButtonStyle buttonStyle, String str, String str2, String str3, String str4, boolean z) {
            this.f10959a = str;
            this.b = buttonStyle;
            this.c = z;
            this.d = str2;
            this.e = str3;
            this.f = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SwapButton)) {
                return false;
            }
            SwapButton swapButton = (SwapButton) obj;
            return Intrinsics.c(this.f10959a, swapButton.f10959a) && this.b == swapButton.b && this.c == swapButton.c && Intrinsics.c(this.d, swapButton.d) && Intrinsics.c(this.e, swapButton.e) && Intrinsics.c(this.f, swapButton.f);
        }

        public final int hashCode() {
            int iHashCode = this.f10959a.hashCode() * 31;
            ButtonStyle buttonStyle = this.b;
            int iE = b.e((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31, 31, this.c);
            String str = this.d;
            int iHashCode2 = (iE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbQ = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("SwapButton(label=", this.f10959a, ", style=", this.b, ", enabled=");
            au.com.woolworths.android.onesite.a.y(", action=", this.d, ", url=", sbQ, this.c);
            return a.l(sbQ, this.e, ", iconUrl=", this.f, ")");
        }
    }

    public ProductsByRecipeQuery(String recipeId, Optional optional, Optional optional2, boolean z, Optional optional3, boolean z2) {
        Intrinsics.h(recipeId, "recipeId");
        this.f10946a = recipeId;
        this.b = optional;
        this.c = optional2;
        this.d = z;
        this.e = Optional.Absent.f13523a;
        this.f = optional3;
        this.g = z2;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ProductsByRecipeQuery_ResponseAdapter.Data.f10982a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query productsByRecipe($recipeId: String!, $storeId: String, $servesQuantity: Int, $includeProductAvailabilityStates: Boolean!, $showNutritionInfo: Boolean!, $includeOfferMinimumSpend: Boolean!, $includeAvailabilityInfoStatus: Boolean! = false , $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!) { productsByRecipe(recipeId: $recipeId, storeId: $storeId, servesQuantity: $servesQuantity) { totalNumberOfProducts nextPage productsFeed { __typename ... on IngredientCard { ingredientDetails swapButton { label style enabled action url iconUrl } alternativeProducts { __typename ...productCard } analytics { label } } ... on ListSectionHeader { listSectionHeaderType listSectionHeaderText } ... on ProductCard { __typename ...productCard } ... on DietaryDisclaimer @include(if: $showNutritionInfo) { insetBanner { displayType message title action { placement type label url } } dietaryInfo { title content } } } } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductsByRecipeQuery)) {
            return false;
        }
        ProductsByRecipeQuery productsByRecipeQuery = (ProductsByRecipeQuery) obj;
        return Intrinsics.c(this.f10946a, productsByRecipeQuery.f10946a) && this.b.equals(productsByRecipeQuery.b) && this.c.equals(productsByRecipeQuery.c) && this.d == productsByRecipeQuery.d && this.e.equals(productsByRecipeQuery.e) && this.f.equals(productsByRecipeQuery.f) && this.g == productsByRecipeQuery.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.f, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.e, b.e(b.e(b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.c, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.b, this.f10946a.hashCode() * 31, 31), 31), 31, true), 31, this.d), 31, false), 31), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "ad23b92af457728b7b95974cf44f84e8cbb213644d57c60a6251383e6d818dbb";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "productsByRecipe";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("recipeId");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f10946a);
        Optional optional = this.b;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("storeId");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
        Optional optional2 = this.c;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("servesQuantity");
            Adapters.d(Adapters.k).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        }
        jsonWriter.F1("includeProductAvailabilityStates");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.TRUE);
        jsonWriter.F1("showNutritionInfo");
        d.B(this.d, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeOfferMinimumSpend");
        Boolean bool = Boolean.FALSE;
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, bool);
        Optional optional3 = this.e;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        } else if (z) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, bool);
        }
        Optional optional4 = this.f;
        if (optional4 instanceof Optional.Present) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional4);
        } else if (z) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, bool);
        }
        jsonWriter.F1("includeLowestPrice14Days");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.g));
    }

    public final String toString() {
        StringBuilder sbR = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.r("ProductsByRecipeQuery(recipeId=", this.f10946a, ", storeId=", this.b, ", servesQuantity=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.y(sbR, this.c, ", includeProductAvailabilityStates=true, showNutritionInfo=", this.d, ", includeOfferMinimumSpend=false, includeAvailabilityInfoStatus=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sbR, this.e, ", includePricingFootnote=", this.f, ", includeLowestPrice14Days=");
        return YU.a.k(")", sbR, this.g);
    }
}
