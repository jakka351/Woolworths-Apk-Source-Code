package au.com.woolworths.feature.shop.homepage.data;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.base.shopapp.data.models.CartProductInfo;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListTrailingLinkData;
import au.com.woolworths.feature.shop.myorders.orders.data.OrderStatus;
import au.com.woolworths.foundation.shop.model.recipes.RecipeSource;
import au.com.woolworths.foundation.shop.model.recipes.RecipeTagList;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.InStoreLocationData;
import au.com.woolworths.product.models.InstoreDetailsData;
import au.com.woolworths.product.models.MemberPriceInfo;
import au.com.woolworths.product.models.MultiBuyPriceInfo;
import au.com.woolworths.product.models.ProductCardCartProductInfoExtKt;
import au.com.woolworths.product.models.ProductCardCategoryExtKt;
import au.com.woolworths.product.models.ProductCardInStoreAvailabilityInfoExtKt;
import au.com.woolworths.product.models.ProductCardInStoreDetailsExtKt;
import au.com.woolworths.product.models.ProductCardInStoreLocationExtKt;
import au.com.woolworths.product.models.ProductCardInlineLabelExtKt;
import au.com.woolworths.product.models.ProductCardKt;
import au.com.woolworths.product.models.ProductCardListExtKt;
import au.com.woolworths.product.models.ProductCardMarketplaceExtKt;
import au.com.woolworths.product.models.ProductCardMemberPriceInfoExtKt;
import au.com.woolworths.product.models.ProductCardMultiBuyPriceInfoExtKt;
import au.com.woolworths.product.models.ProductCardProductCardActionExtKt;
import au.com.woolworths.product.models.ProductCardProductCardAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCardProductVarietiesExtKt;
import au.com.woolworths.product.models.ProductCardPromotionInfoExtKt;
import au.com.woolworths.product.models.ProductCardRewardsOfferInfoExtKt;
import au.com.woolworths.product.models.ProductCardTagLabelExtKt;
import au.com.woolworths.product.models.ProductInlineLabelApiData;
import au.com.woolworths.product.models.ProductShoppingList;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.models.ProductVarieties;
import au.com.woolworths.product.models.PromotionCard;
import au.com.woolworths.product.models.PurchaseRestrictionExtKt;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.models.TagLabel;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.OverlayAnimation;
import au.com.woolworths.shop.aem.components.model.QuickLinkCard;
import au.com.woolworths.shop.aem.components.model.contentcard.ContentCardData;
import au.com.woolworths.shop.aem.components.model.contentcard.ContentCardFooter;
import au.com.woolworths.shop.aem.components.model.footer.ContentFooterStyle;
import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCostPerServeData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeDuration;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeMoreCard;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragment;
import au.com.woolworths.shop.graphql.type.ContentCardSize;
import au.com.woolworths.shop.graphql.type.PurchaseRestriction;
import com.woolworths.shop.homepage.HomeContentPageQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"homepage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class HomeContentPageQueryOnHorizontalListExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15, types: [au.com.woolworths.product.models.ProductCard] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r18v6, types: [au.com.woolworths.feature.shop.homepage.data.OrderCardData] */
    /* JADX WARN: Type inference failed for: r19v5, types: [au.com.woolworths.shop.aem.components.model.contentcard.ContentCardData] */
    /* JADX WARN: Type inference failed for: r19v7, types: [au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData] */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6, types: [au.com.woolworths.shop.aem.components.model.contentcard.ContentCardFooter] */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v6, types: [au.com.woolworths.shop.aem.components.model.contentcard.ContentCardSize] */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v85, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v86, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v33, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v63, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v19, types: [au.com.woolworths.shop.aem.components.model.QuickLinkCard] */
    /* JADX WARN: Type inference failed for: r9v4, types: [au.com.woolworths.product.models.PromotionCard] */
    public static final HorizontalListData a(HomeContentPageQuery.OnHorizontalList onHorizontalList) {
        EmptyList emptyList;
        AnalyticsData analyticsData;
        AnalyticsData analyticsData2;
        String str;
        ArrayList arrayList;
        HorizontalListTrailingLinkData horizontalListTrailingLinkData;
        AnalyticsData analyticsData3;
        String str2;
        EmptyList emptyList2;
        String str3;
        ?? arrayList2;
        ?? arrayList3;
        Iterator it;
        String str4;
        String str5;
        String str6;
        RecipeMoreCard recipeMoreCard;
        String str7;
        String str8;
        String str9;
        EmptyList emptyList3;
        ?? arrayList4;
        String str10;
        String str11;
        String str12;
        EmptyList emptyList4;
        AnalyticsData analyticsData4;
        AnalyticsData analyticsData5;
        String str13;
        String str14;
        EmptyList emptyList5;
        String str15;
        String str16;
        String str17;
        ?? arrayList5;
        String str18;
        String str19;
        ImageWithAltText imageWithAltText;
        ActionData actionData;
        ?? contentCardFooter;
        ?? r28;
        AnalyticsData analyticsData6;
        String str20;
        EmptyList emptyList6;
        Object recipeSource;
        RecipeMoreCard contentCardData;
        ?? arrayList6;
        RecipeMoreCard promotionCard;
        AnalyticsData analyticsData7;
        String str21;
        EmptyList emptyList7;
        ?? arrayList7;
        String str22;
        String str23;
        AnalyticsData analyticsData8;
        String str24;
        ?? arrayList8;
        ?? arrayList9;
        ?? arrayList10;
        String str25;
        String str26;
        ?? arrayList11;
        Intrinsics.h(onHorizontalList, "<this>");
        String str27 = onHorizontalList.f;
        String str28 = onHorizontalList.g;
        String str29 = onHorizontalList.f22874a;
        String str30 = onHorizontalList.h;
        ArrayList arrayList12 = onHorizontalList.i;
        ArrayList arrayList13 = new ArrayList();
        Iterator it2 = arrayList12.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            emptyList = EmptyList.d;
            if (!zHasNext) {
                break;
            }
            HomeContentPageQuery.Item3 item3 = (HomeContentPageQuery.Item3) it2.next();
            HomeContentPageQuery.OnProductCard2 onProductCard2 = item3.b;
            if (onProductCard2 != null) {
                ProductCard productCard = onProductCard2.b;
                String str31 = productCard.f8949a;
                String str32 = productCard.b;
                String str33 = productCard.e;
                String str34 = productCard.j;
                Integer num = productCard.h;
                String str35 = productCard.i;
                String str36 = productCard.l;
                it = it2;
                boolean z = productCard.f;
                boolean z2 = productCard.c;
                String str37 = productCard.m;
                String str38 = productCard.n;
                ProductCard.Trolley trolley = productCard.p;
                ProductTrolleyData uiModel = trolley != null ? ProductCardKt.toUiModel(trolley) : null;
                List list = productCard.q;
                if (list != null) {
                    List list2 = list;
                    str4 = str27;
                    str5 = str28;
                    str6 = str29;
                    arrayList9 = new ArrayList(CollectionsKt.s(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList9.add(ProductCardKt.toUiModel((ProductCard.Trolley1) it3.next()));
                    }
                } else {
                    str4 = str27;
                    str5 = str28;
                    str6 = str29;
                    arrayList9 = 0;
                }
                EmptyList emptyList8 = arrayList9 == 0 ? emptyList : arrayList9;
                ProductShoppingList uiModel2 = ProductCardListExtKt.toUiModel(productCard.r);
                ProductCard.InStoreDetails inStoreDetails = productCard.s;
                InstoreDetailsData uiModel3 = inStoreDetails != null ? ProductCardInStoreDetailsExtKt.toUiModel(inStoreDetails) : null;
                PurchaseRestriction purchaseRestriction = productCard.d;
                au.com.woolworths.product.models.PurchaseRestriction uiModel4 = purchaseRestriction != null ? PurchaseRestrictionExtKt.toUiModel(purchaseRestriction) : null;
                List<ProductCard.InlineLabel> list3 = productCard.o;
                if (list3 != null) {
                    arrayList10 = new ArrayList();
                    for (ProductCard.InlineLabel inlineLabel : list3) {
                        ProductInlineLabelApiData uiModel5 = inlineLabel != null ? ProductCardInlineLabelExtKt.toUiModel(inlineLabel) : null;
                        if (uiModel5 != null) {
                            arrayList10.add(uiModel5);
                        }
                    }
                } else {
                    arrayList10 = 0;
                }
                EmptyList emptyList9 = arrayList10 == 0 ? emptyList : arrayList10;
                ProductCard.PromotionInfo promotionInfo = productCard.k;
                PromotionInfo uiModel6 = promotionInfo != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo) : null;
                String str39 = productCard.u;
                String str40 = productCard.v;
                ProductCard.Marketplace marketplace = productCard.w;
                ProductListMarketplace uiModel7 = marketplace != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace) : null;
                ProductCard.RewardsOfferInfo rewardsOfferInfo = productCard.x;
                RewardsOfferInfo uiModel8 = rewardsOfferInfo != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo) : null;
                String str41 = productCard.y;
                ProductCard.TagLabel tagLabel = productCard.z;
                TagLabel uiModel9 = tagLabel != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel) : null;
                ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo = productCard.g;
                InStoreAvailabilityInfo uiModel10 = inStoreAvailabilityInfo != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo) : null;
                ProductCard.ProductVarieties productVarieties = productCard.A;
                ProductVarieties uiModel11 = productVarieties != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties) : null;
                List list4 = productCard.B;
                if (list4 != null) {
                    List list5 = list4;
                    str25 = str39;
                    str26 = str40;
                    arrayList11 = new ArrayList(CollectionsKt.s(list5, 10));
                    Iterator it4 = list5.iterator();
                    while (it4.hasNext()) {
                        arrayList11.add(ProductCardCategoryExtKt.toUiModel((ProductCard.Category) it4.next()));
                    }
                } else {
                    str25 = str39;
                    str26 = str40;
                    arrayList11 = 0;
                }
                EmptyList emptyList10 = arrayList11 == 0 ? emptyList : arrayList11;
                boolean z3 = productCard.C;
                ProductCard.MultiBuyPriceInfo multiBuyPriceInfo = productCard.E;
                MultiBuyPriceInfo uiModel12 = multiBuyPriceInfo != null ? ProductCardMultiBuyPriceInfoExtKt.toUiModel(multiBuyPriceInfo) : null;
                ProductCard.MemberPriceInfo memberPriceInfo = productCard.D;
                MemberPriceInfo uiModel13 = memberPriceInfo != null ? ProductCardMemberPriceInfoExtKt.toUiModel(memberPriceInfo) : null;
                ProductCard.CartProductInfo cartProductInfo = productCard.F;
                CartProductInfo uiModel14 = cartProductInfo != null ? ProductCardCartProductInfoExtKt.toUiModel(cartProductInfo) : null;
                ProductCard.InStoreLocation inStoreLocation = productCard.t;
                InStoreLocationData uiModel15 = inStoreLocation != null ? ProductCardInStoreLocationExtKt.toUiModel(inStoreLocation) : null;
                ProductCard.ProductCardAnalytics productCardAnalytics = productCard.G;
                AnalyticsData uiModel16 = productCardAnalytics != null ? ProductCardProductCardAnalyticsExtKt.toUiModel(productCardAnalytics) : null;
                ProductCard.ProductCardAction productCardAction = productCard.H;
                recipeMoreCard = new au.com.woolworths.product.models.ProductCard(str31, str32, str33, str34, num, str35, null, null, str36, z, z2, str37, null, null, str38, uiModel, emptyList8, uiModel2, uiModel3, uiModel4, emptyList9, uiModel6, str25, str26, uiModel7, uiModel8, str41, uiModel9, uiModel10, uiModel11, emptyList10, z3, uiModel12, uiModel13, uiModel14, uiModel15, uiModel16, null, productCardAction != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction) : null, productCard.I, 12480, 32, null);
            } else {
                it = it2;
                str4 = str27;
                str5 = str28;
                str6 = str29;
                HomeContentPageQuery.OnOrderCard onOrderCard = item3.c;
                if (onOrderCard != null) {
                    String str42 = onOrderCard.b;
                    String str43 = onOrderCard.c;
                    OrderStatus orderStatusA = OrderStatusExtKt.a(onOrderCard.d);
                    int i = onOrderCard.e;
                    String str44 = onOrderCard.f;
                    String str45 = onOrderCard.g;
                    String str46 = onOrderCard.h;
                    String str47 = onOrderCard.i;
                    HomeContentPageQuery.OrderCardAction orderCardAction = onOrderCard.k;
                    String str48 = orderCardAction.b;
                    ActionType uiModel17 = au.com.woolworths.product.models.ActionTypeExtKt.toUiModel(orderCardAction.f22892a);
                    HomeContentPageQuery.Analytics9 analytics9 = orderCardAction.c;
                    if (analytics9 != null) {
                        AnalyticsFields analyticsFields = analytics9.b;
                        String str49 = analyticsFields.f10032a;
                        str22 = str42;
                        String str50 = analyticsFields.b;
                        String str51 = analyticsFields.c;
                        String str52 = analyticsFields.e;
                        String str53 = analyticsFields.f;
                        String str54 = analyticsFields.g;
                        String str55 = analyticsFields.d;
                        String str56 = analyticsFields.h;
                        String str57 = analyticsFields.i;
                        List list6 = analyticsFields.j;
                        if (list6 != null) {
                            List list7 = list6;
                            str24 = str57;
                            str23 = str43;
                            arrayList8 = new ArrayList(CollectionsKt.s(list7, 10));
                            Iterator it5 = list7.iterator();
                            while (it5.hasNext()) {
                                arrayList8.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it5.next()));
                            }
                        } else {
                            str24 = str57;
                            str23 = str43;
                            arrayList8 = 0;
                        }
                        analyticsData8 = new AnalyticsData((EventConfig) null, str49, str50, str51, str52, str53, str54, str55, str56, str24, arrayList8 == 0 ? emptyList : arrayList8, 1, (DefaultConstructorMarker) null);
                    } else {
                        str22 = str42;
                        str23 = str43;
                        analyticsData8 = null;
                    }
                    ActionData actionData2 = new ActionData(str48, uiModel17, null, analyticsData8);
                    HomeContentPageQuery.FulfilmentStatusBanner fulfilmentStatusBanner = onOrderCard.j;
                    recipeMoreCard = new OrderCardData(str22, str23, orderStatusA, i, str44, str45, str46, str47, actionData2, fulfilmentStatusBanner != null ? new FulfilmentStatusBannerData(fulfilmentStatusBanner.f22819a, fulfilmentStatusBanner.b) : null);
                } else {
                    HomeContentPageQuery.OnQuickLinkCard onQuickLinkCard = item3.d;
                    if (onQuickLinkCard != null) {
                        String str58 = onQuickLinkCard.b;
                        HomeContentPageQuery.LinkCardAction linkCardAction = onQuickLinkCard.e;
                        String str59 = linkCardAction.b;
                        ActionType uiModel18 = au.com.woolworths.product.models.ActionTypeExtKt.toUiModel(linkCardAction.f22852a);
                        HomeContentPageQuery.Analytics10 analytics10 = linkCardAction.c;
                        if (analytics10 != null) {
                            AnalyticsFields analyticsFields2 = analytics10.b;
                            String str60 = analyticsFields2.f10032a;
                            String str61 = analyticsFields2.b;
                            String str62 = analyticsFields2.c;
                            String str63 = analyticsFields2.e;
                            String str64 = analyticsFields2.f;
                            String str65 = analyticsFields2.g;
                            String str66 = analyticsFields2.d;
                            String str67 = analyticsFields2.h;
                            String str68 = analyticsFields2.i;
                            List list8 = analyticsFields2.j;
                            if (list8 != null) {
                                List list9 = list8;
                                str21 = str68;
                                emptyList7 = emptyList;
                                arrayList7 = new ArrayList(CollectionsKt.s(list9, 10));
                                Iterator it6 = list9.iterator();
                                while (it6.hasNext()) {
                                    arrayList7.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it6.next()));
                                }
                            } else {
                                str21 = str68;
                                emptyList7 = emptyList;
                                arrayList7 = 0;
                            }
                            analyticsData7 = new AnalyticsData((EventConfig) null, str60, str61, str62, str63, str64, str65, str66, str67, str21, arrayList7 == 0 ? emptyList7 : arrayList7, 1, (DefaultConstructorMarker) null);
                        } else {
                            analyticsData7 = null;
                        }
                        ActionData actionData3 = new ActionData(str59, uiModel18, null, analyticsData7);
                        String str69 = onQuickLinkCard.c;
                        String str70 = onQuickLinkCard.d;
                        Boolean bool = onQuickLinkCard.g;
                        HomeContentPageQuery.LinkCardAnimation linkCardAnimation = onQuickLinkCard.f;
                        promotionCard = new QuickLinkCard(str58, actionData3, str69, str70, bool, linkCardAnimation != null ? new OverlayAnimation(linkCardAnimation.f22853a, linkCardAnimation.b) : null);
                    } else {
                        HomeContentPageQuery.OnRecipeSummaryCard onRecipeSummaryCard = item3.e;
                        if (onRecipeSummaryCard != null) {
                            RecipeSummaryCardFragment recipeSummaryCardFragment = onRecipeSummaryCard.b;
                            String str71 = recipeSummaryCardFragment.c;
                            String str72 = recipeSummaryCardFragment.f10200a;
                            String str73 = recipeSummaryCardFragment.b;
                            List list10 = recipeSummaryCardFragment.d;
                            if (list10 != null) {
                                List list11 = list10;
                                arrayList6 = new ArrayList(CollectionsKt.s(list11, 10));
                                Iterator it7 = list11.iterator();
                                while (it7.hasNext()) {
                                    arrayList6.add((String) it7.next());
                                }
                            } else {
                                arrayList6 = 0;
                            }
                            EmptyList emptyList11 = arrayList6 == 0 ? emptyList : arrayList6;
                            String str74 = recipeSummaryCardFragment.e;
                            Boolean bool2 = recipeSummaryCardFragment.f;
                            RecipeSummaryCardFragment.RecipePrepDuration recipePrepDuration = recipeSummaryCardFragment.g;
                            RecipeDuration recipeDuration = recipePrepDuration != null ? new RecipeDuration(recipePrepDuration.f10203a, recipePrepDuration.b) : null;
                            RecipeSummaryCardFragment.RecipeCookDuration recipeCookDuration = recipeSummaryCardFragment.h;
                            RecipeDuration recipeDuration2 = recipeCookDuration != null ? new RecipeDuration(recipeCookDuration.f10201a, recipeCookDuration.b) : null;
                            RecipeSummaryCardFragment.RecipeCostPerServe recipeCostPerServe = recipeSummaryCardFragment.i;
                            contentCardData = new RecipeCardSummaryData(str71, str72, str73, emptyList11, str74, bool2, recipeDuration, recipeDuration2, recipeCostPerServe != null ? new RecipeCostPerServeData(recipeCostPerServe.f10202a, null) : null);
                        } else {
                            HomeContentPageQuery.OnRecipeMoreCard onRecipeMoreCard = item3.f;
                            if (onRecipeMoreCard != null) {
                                ArrayList<HomeContentPageQuery.ActionMetadatum> arrayList14 = onRecipeMoreCard.f22884a;
                                ArrayList arrayList15 = new ArrayList();
                                for (HomeContentPageQuery.ActionMetadatum actionMetadatum : arrayList14) {
                                    HomeContentPageQuery.OnRecipeTagList onRecipeTagList = actionMetadatum.b;
                                    if (onRecipeTagList != null) {
                                        ArrayList arrayList16 = onRecipeTagList.f22887a;
                                        ArrayList arrayList17 = new ArrayList(CollectionsKt.s(arrayList16, 10));
                                        Iterator it8 = arrayList16.iterator();
                                        while (it8.hasNext()) {
                                            arrayList17.add((String) it8.next());
                                        }
                                        recipeSource = new RecipeTagList(arrayList17);
                                    } else {
                                        HomeContentPageQuery.OnRecipeSource onRecipeSource = actionMetadatum.c;
                                        recipeSource = onRecipeSource != null ? new RecipeSource(onRecipeSource.f22885a) : null;
                                    }
                                    if (recipeSource != null) {
                                        arrayList15.add(recipeSource);
                                    }
                                }
                                recipeMoreCard = new RecipeMoreCard(arrayList15);
                            } else {
                                HomeContentPageQuery.OnContentCard onContentCard = item3.g;
                                if (onContentCard != null) {
                                    String str75 = onContentCard.f22864a;
                                    String str76 = onContentCard.b;
                                    String str77 = onContentCard.c;
                                    String str78 = onContentCard.d;
                                    HomeContentPageQuery.ContentCardAction contentCardAction = onContentCard.e;
                                    if (contentCardAction != null) {
                                        String str79 = contentCardAction.b;
                                        ActionType uiModel19 = au.com.woolworths.product.models.ActionTypeExtKt.toUiModel(contentCardAction.f22807a);
                                        HomeContentPageQuery.Analytics11 analytics11 = contentCardAction.c;
                                        if (analytics11 != null) {
                                            AnalyticsFields analyticsFields3 = analytics11.b;
                                            String str80 = analyticsFields3.f10032a;
                                            String str81 = analyticsFields3.b;
                                            String str82 = analyticsFields3.c;
                                            String str83 = analyticsFields3.e;
                                            String str84 = analyticsFields3.f;
                                            str18 = str75;
                                            String str85 = analyticsFields3.g;
                                            String str86 = analyticsFields3.d;
                                            String str87 = analyticsFields3.h;
                                            String str88 = analyticsFields3.i;
                                            List list12 = analyticsFields3.j;
                                            if (list12 != null) {
                                                List list13 = list12;
                                                str20 = str88;
                                                str19 = str76;
                                                ?? arrayList18 = new ArrayList(CollectionsKt.s(list13, 10));
                                                Iterator it9 = list13.iterator();
                                                while (it9.hasNext()) {
                                                    arrayList18.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it9.next()));
                                                }
                                                emptyList6 = arrayList18;
                                            } else {
                                                str20 = str88;
                                                str19 = str76;
                                                emptyList6 = null;
                                            }
                                            analyticsData6 = new AnalyticsData((EventConfig) null, str80, str81, str82, str83, str84, str85, str86, str87, str20, emptyList6 == null ? emptyList : emptyList6, 1, (DefaultConstructorMarker) null);
                                        } else {
                                            str18 = str75;
                                            str19 = str76;
                                            analyticsData6 = null;
                                        }
                                        imageWithAltText = null;
                                        actionData = new ActionData(str79, uiModel19, null, analyticsData6);
                                    } else {
                                        str18 = str75;
                                        str19 = str76;
                                        imageWithAltText = null;
                                        actionData = null;
                                    }
                                    HomeContentPageQuery.ContentCardBrandImage contentCardBrandImage = onContentCard.g;
                                    ImageWithAltText imageWithAltText2 = contentCardBrandImage != null ? new ImageWithAltText(contentCardBrandImage.f22808a, contentCardBrandImage.b) : imageWithAltText;
                                    HomeContentPageQuery.ContentCardFooter contentCardFooter2 = onContentCard.f;
                                    if (contentCardFooter2 != null) {
                                        int iOrdinal = contentCardFooter2.f22809a.ordinal();
                                        ContentFooterStyle contentFooterStyle = iOrdinal != 0 ? iOrdinal != 1 ? ContentFooterStyle.e : ContentFooterStyle.e : ContentFooterStyle.d;
                                        String str89 = contentCardFooter2.b;
                                        HomeContentPageQuery.Logo logo = contentCardFooter2.c;
                                        contentCardFooter = new ContentCardFooter(contentFooterStyle, str89, logo != null ? new ImageWithAltText(logo.f22856a, logo.b) : imageWithAltText);
                                    } else {
                                        contentCardFooter = imageWithAltText;
                                    }
                                    Boolean bool3 = onContentCard.h;
                                    ContentCardSize contentCardSize = onContentCard.i;
                                    if (contentCardSize != null) {
                                        int iOrdinal2 = contentCardSize.ordinal();
                                        r28 = iOrdinal2 != 0 ? iOrdinal2 != 1 ? au.com.woolworths.shop.aem.components.model.contentcard.ContentCardSize.e : au.com.woolworths.shop.aem.components.model.contentcard.ContentCardSize.e : au.com.woolworths.shop.aem.components.model.contentcard.ContentCardSize.d;
                                    } else {
                                        r28 = imageWithAltText;
                                    }
                                    contentCardData = new ContentCardData(str18, str19, str77, str78, actionData, imageWithAltText2, contentCardFooter, bool3, r28, null, null);
                                } else {
                                    HomeContentPageQuery.OnPromotionCard onPromotionCard = item3.h;
                                    if (onPromotionCard != null) {
                                        ProductCard productCard2 = onPromotionCard.f22882a.b;
                                        String str90 = productCard2.f8949a;
                                        String str91 = productCard2.b;
                                        String str92 = productCard2.e;
                                        String str93 = productCard2.j;
                                        Integer num2 = productCard2.h;
                                        String str94 = productCard2.i;
                                        String str95 = productCard2.l;
                                        boolean z4 = productCard2.f;
                                        boolean z5 = productCard2.c;
                                        String str96 = productCard2.m;
                                        String str97 = productCard2.n;
                                        ProductCard.Trolley trolley2 = productCard2.p;
                                        ProductTrolleyData uiModel20 = trolley2 != null ? ProductCardKt.toUiModel(trolley2) : null;
                                        List list14 = productCard2.q;
                                        if (list14 != null) {
                                            List list15 = list14;
                                            str7 = str90;
                                            str8 = str91;
                                            str9 = str92;
                                            ?? arrayList19 = new ArrayList(CollectionsKt.s(list15, 10));
                                            Iterator it10 = list15.iterator();
                                            while (it10.hasNext()) {
                                                arrayList19.add(ProductCardKt.toUiModel((ProductCard.Trolley1) it10.next()));
                                            }
                                            emptyList3 = arrayList19;
                                        } else {
                                            str7 = str90;
                                            str8 = str91;
                                            str9 = str92;
                                            emptyList3 = null;
                                        }
                                        EmptyList emptyList12 = emptyList3 == null ? emptyList : emptyList3;
                                        ProductShoppingList uiModel21 = ProductCardListExtKt.toUiModel(productCard2.r);
                                        ProductCard.InStoreDetails inStoreDetails2 = productCard2.s;
                                        InstoreDetailsData uiModel22 = inStoreDetails2 != null ? ProductCardInStoreDetailsExtKt.toUiModel(inStoreDetails2) : null;
                                        PurchaseRestriction purchaseRestriction2 = productCard2.d;
                                        au.com.woolworths.product.models.PurchaseRestriction uiModel23 = purchaseRestriction2 != null ? PurchaseRestrictionExtKt.toUiModel(purchaseRestriction2) : null;
                                        List<ProductCard.InlineLabel> list16 = productCard2.o;
                                        if (list16 != null) {
                                            arrayList4 = new ArrayList();
                                            for (ProductCard.InlineLabel inlineLabel2 : list16) {
                                                ProductInlineLabelApiData uiModel24 = inlineLabel2 != null ? ProductCardInlineLabelExtKt.toUiModel(inlineLabel2) : null;
                                                if (uiModel24 != null) {
                                                    arrayList4.add(uiModel24);
                                                }
                                            }
                                        } else {
                                            arrayList4 = 0;
                                        }
                                        EmptyList emptyList13 = arrayList4 == 0 ? emptyList : arrayList4;
                                        ProductCard.PromotionInfo promotionInfo2 = productCard2.k;
                                        PromotionInfo uiModel25 = promotionInfo2 != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo2) : null;
                                        String str98 = productCard2.u;
                                        String str99 = productCard2.v;
                                        ProductCard.Marketplace marketplace2 = productCard2.w;
                                        ProductListMarketplace uiModel26 = marketplace2 != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace2) : null;
                                        ProductCard.RewardsOfferInfo rewardsOfferInfo2 = productCard2.x;
                                        RewardsOfferInfo uiModel27 = rewardsOfferInfo2 != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo2) : null;
                                        String str100 = productCard2.y;
                                        ProductCard.TagLabel tagLabel2 = productCard2.z;
                                        TagLabel uiModel28 = tagLabel2 != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel2) : null;
                                        ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo2 = productCard2.g;
                                        InStoreAvailabilityInfo uiModel29 = inStoreAvailabilityInfo2 != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo2) : null;
                                        ProductCard.ProductVarieties productVarieties2 = productCard2.A;
                                        ProductVarieties uiModel30 = productVarieties2 != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties2) : null;
                                        List list17 = productCard2.B;
                                        if (list17 != null) {
                                            List list18 = list17;
                                            str10 = str98;
                                            str11 = str99;
                                            str12 = str100;
                                            ?? arrayList20 = new ArrayList(CollectionsKt.s(list18, 10));
                                            Iterator it11 = list18.iterator();
                                            while (it11.hasNext()) {
                                                arrayList20.add(ProductCardCategoryExtKt.toUiModel((ProductCard.Category) it11.next()));
                                            }
                                            emptyList4 = arrayList20;
                                        } else {
                                            str10 = str98;
                                            str11 = str99;
                                            str12 = str100;
                                            emptyList4 = null;
                                        }
                                        EmptyList emptyList14 = emptyList4 == null ? emptyList : emptyList4;
                                        boolean z6 = productCard2.C;
                                        ProductCard.MultiBuyPriceInfo multiBuyPriceInfo2 = productCard2.E;
                                        MultiBuyPriceInfo uiModel31 = multiBuyPriceInfo2 != null ? ProductCardMultiBuyPriceInfoExtKt.toUiModel(multiBuyPriceInfo2) : null;
                                        ProductCard.MemberPriceInfo memberPriceInfo2 = productCard2.D;
                                        MemberPriceInfo uiModel32 = memberPriceInfo2 != null ? ProductCardMemberPriceInfoExtKt.toUiModel(memberPriceInfo2) : null;
                                        ProductCard.CartProductInfo cartProductInfo2 = productCard2.F;
                                        CartProductInfo uiModel33 = cartProductInfo2 != null ? ProductCardCartProductInfoExtKt.toUiModel(cartProductInfo2) : null;
                                        ProductCard.InStoreLocation inStoreLocation2 = productCard2.t;
                                        InStoreLocationData uiModel34 = inStoreLocation2 != null ? ProductCardInStoreLocationExtKt.toUiModel(inStoreLocation2) : null;
                                        ProductCard.ProductCardAnalytics productCardAnalytics2 = productCard2.G;
                                        AnalyticsData uiModel35 = productCardAnalytics2 != null ? ProductCardProductCardAnalyticsExtKt.toUiModel(productCardAnalytics2) : null;
                                        ProductCard.ProductCardAction productCardAction2 = productCard2.H;
                                        au.com.woolworths.product.models.ProductCard productCard3 = new au.com.woolworths.product.models.ProductCard(str7, str8, str9, str93, num2, str94, null, null, str95, z4, z5, str96, null, null, str97, uiModel20, emptyList12, uiModel21, uiModel22, uiModel23, emptyList13, uiModel25, str10, str11, uiModel26, uiModel27, str12, uiModel28, uiModel29, uiModel30, emptyList14, z6, uiModel31, uiModel32, uiModel33, uiModel34, uiModel35, null, productCardAction2 != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction2) : null, productCard2.I, 12480, 32, null);
                                        String str101 = onPromotionCard.b;
                                        HomeContentPageQuery.Analytics12 analytics12 = onPromotionCard.c;
                                        if (analytics12 != null) {
                                            AnalyticsFields analyticsFields4 = analytics12.b;
                                            String str102 = analyticsFields4.f10032a;
                                            String str103 = analyticsFields4.b;
                                            String str104 = analyticsFields4.c;
                                            String str105 = analyticsFields4.e;
                                            String str106 = analyticsFields4.f;
                                            String str107 = analyticsFields4.g;
                                            String str108 = analyticsFields4.d;
                                            String str109 = analyticsFields4.h;
                                            String str110 = analyticsFields4.i;
                                            List list19 = analyticsFields4.j;
                                            if (list19 != null) {
                                                List list20 = list19;
                                                str15 = str110;
                                                str16 = str103;
                                                str17 = str104;
                                                arrayList5 = new ArrayList(CollectionsKt.s(list20, 10));
                                                Iterator it12 = list20.iterator();
                                                while (it12.hasNext()) {
                                                    arrayList5.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it12.next()));
                                                }
                                            } else {
                                                str15 = str110;
                                                str16 = str103;
                                                str17 = str104;
                                                arrayList5 = 0;
                                            }
                                            analyticsData4 = new AnalyticsData((EventConfig) null, str102, str16, str17, str105, str106, str107, str108, str109, str15, arrayList5 == 0 ? emptyList : arrayList5, 1, (DefaultConstructorMarker) null);
                                        } else {
                                            analyticsData4 = null;
                                        }
                                        HomeContentPageQuery.ImpressionAnalytics4 impressionAnalytics4 = onPromotionCard.d;
                                        if (impressionAnalytics4 != null) {
                                            AnalyticsFields analyticsFields5 = impressionAnalytics4.b;
                                            String str111 = analyticsFields5.f10032a;
                                            String str112 = analyticsFields5.b;
                                            String str113 = analyticsFields5.c;
                                            String str114 = analyticsFields5.e;
                                            String str115 = analyticsFields5.f;
                                            String str116 = analyticsFields5.g;
                                            String str117 = analyticsFields5.d;
                                            String str118 = analyticsFields5.h;
                                            String str119 = analyticsFields5.i;
                                            List list21 = analyticsFields5.j;
                                            if (list21 != null) {
                                                List list22 = list21;
                                                str13 = str119;
                                                str14 = str112;
                                                ?? arrayList21 = new ArrayList(CollectionsKt.s(list22, 10));
                                                Iterator it13 = list22.iterator();
                                                while (it13.hasNext()) {
                                                    arrayList21.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it13.next()));
                                                }
                                                emptyList5 = arrayList21;
                                            } else {
                                                str13 = str119;
                                                str14 = str112;
                                                emptyList5 = null;
                                            }
                                            analyticsData5 = new AnalyticsData((EventConfig) null, str111, str14, str113, str114, str115, str116, str117, str118, str13, emptyList5 == null ? emptyList : emptyList5, 1, (DefaultConstructorMarker) null);
                                        } else {
                                            analyticsData5 = null;
                                        }
                                        promotionCard = new PromotionCard(productCard3, str101, analyticsData4, analyticsData5, null, 16, null);
                                    } else {
                                        recipeMoreCard = null;
                                    }
                                }
                            }
                        }
                        recipeMoreCard = contentCardData;
                    }
                    recipeMoreCard = promotionCard;
                }
            }
            if (recipeMoreCard != null) {
                arrayList13.add(recipeMoreCard);
            }
            it2 = it;
            str27 = str4;
            str28 = str5;
            str29 = str6;
        }
        String str120 = str27;
        String str121 = str28;
        String str122 = str29;
        HomeContentPageQuery.HorizontalListImpressionAnalytics horizontalListImpressionAnalytics = onHorizontalList.d;
        if (horizontalListImpressionAnalytics != null) {
            AnalyticsFields analyticsFields6 = horizontalListImpressionAnalytics.b;
            String str123 = analyticsFields6.f10032a;
            String str124 = analyticsFields6.b;
            String str125 = analyticsFields6.c;
            String str126 = analyticsFields6.e;
            String str127 = analyticsFields6.f;
            String str128 = analyticsFields6.g;
            String str129 = analyticsFields6.d;
            String str130 = analyticsFields6.h;
            String str131 = analyticsFields6.i;
            List list23 = analyticsFields6.j;
            if (list23 != null) {
                List list24 = list23;
                arrayList3 = new ArrayList(CollectionsKt.s(list24, 10));
                Iterator it14 = list24.iterator();
                while (it14.hasNext()) {
                    arrayList3.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it14.next()));
                }
            } else {
                arrayList3 = 0;
            }
            analyticsData = new AnalyticsData((EventConfig) null, str123, str124, str125, str126, str127, str128, str129, str130, str131, arrayList3 == 0 ? emptyList : arrayList3, 1, (DefaultConstructorMarker) null);
        } else {
            analyticsData = null;
        }
        HomeContentPageQuery.HorizontalListAnalytics horizontalListAnalytics = onHorizontalList.c;
        if (horizontalListAnalytics != null) {
            AnalyticsFields analyticsFields7 = horizontalListAnalytics.b;
            String str132 = analyticsFields7.f10032a;
            String str133 = analyticsFields7.b;
            String str134 = analyticsFields7.c;
            String str135 = analyticsFields7.e;
            String str136 = analyticsFields7.f;
            String str137 = analyticsFields7.g;
            String str138 = analyticsFields7.d;
            String str139 = analyticsFields7.h;
            String str140 = analyticsFields7.i;
            List list25 = analyticsFields7.j;
            if (list25 != null) {
                List list26 = list25;
                str3 = str132;
                arrayList2 = new ArrayList(CollectionsKt.s(list26, 10));
                Iterator it15 = list26.iterator();
                while (it15.hasNext()) {
                    arrayList2.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it15.next()));
                }
            } else {
                str3 = str132;
                arrayList2 = 0;
            }
            analyticsData2 = new AnalyticsData((EventConfig) null, str3, str133, str134, str135, str136, str137, str138, str139, str140, arrayList2 == 0 ? emptyList : arrayList2, 1, (DefaultConstructorMarker) null);
        } else {
            analyticsData2 = null;
        }
        HomeContentPageQuery.HorizontalListTrailingLink horizontalListTrailingLink = onHorizontalList.b;
        if (horizontalListTrailingLink != null) {
            String str141 = horizontalListTrailingLink.b;
            HomeContentPageQuery.LinkAction1 linkAction1 = horizontalListTrailingLink.c;
            String str142 = linkAction1.b;
            ActionType uiModel36 = au.com.woolworths.product.models.ActionTypeExtKt.toUiModel(linkAction1.d);
            String str143 = linkAction1.f22851a;
            HomeContentPageQuery.Analytics8 analytics8 = linkAction1.c;
            if (analytics8 != null) {
                AnalyticsFields analyticsFields8 = analytics8.b;
                String str144 = analyticsFields8.f10032a;
                String str145 = analyticsFields8.b;
                String str146 = analyticsFields8.c;
                String str147 = analyticsFields8.e;
                str = str30;
                String str148 = analyticsFields8.f;
                String str149 = analyticsFields8.g;
                String str150 = analyticsFields8.d;
                String str151 = analyticsFields8.h;
                String str152 = analyticsFields8.i;
                List list27 = analyticsFields8.j;
                if (list27 != null) {
                    List list28 = list27;
                    str2 = str152;
                    arrayList = arrayList13;
                    ?? arrayList22 = new ArrayList(CollectionsKt.s(list28, 10));
                    Iterator it16 = list28.iterator();
                    while (it16.hasNext()) {
                        arrayList22.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it16.next()));
                    }
                    emptyList2 = arrayList22;
                } else {
                    str2 = str152;
                    arrayList = arrayList13;
                    emptyList2 = null;
                }
                analyticsData3 = new AnalyticsData((EventConfig) null, str144, str145, str146, str147, str148, str149, str150, str151, str2, emptyList2 == null ? emptyList : emptyList2, 1, (DefaultConstructorMarker) null);
            } else {
                str = str30;
                arrayList = arrayList13;
                analyticsData3 = null;
            }
            ActionData actionData4 = new ActionData(str142, uiModel36, str143, analyticsData3);
            HomeContentPageQuery.LinkTextWithAlt1 linkTextWithAlt1 = horizontalListTrailingLink.f22837a;
            horizontalListTrailingLinkData = new HorizontalListTrailingLinkData(str141, actionData4, new TextWithAltData(linkTextWithAlt1.b, linkTextWithAlt1.f22855a));
        } else {
            str = str30;
            arrayList = arrayList13;
            horizontalListTrailingLinkData = null;
        }
        return new HorizontalListData(str120, str121, str122, null, str, arrayList, null, null, null, analyticsData, analyticsData2, horizontalListTrailingLinkData);
    }
}
