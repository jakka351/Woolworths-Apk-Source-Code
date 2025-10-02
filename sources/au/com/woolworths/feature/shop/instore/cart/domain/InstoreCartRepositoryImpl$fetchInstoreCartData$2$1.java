package au.com.woolworths.feature.shop.instore.cart.domain;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.featuretoggles.BaseFeature;
import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.base.shopapp.data.models.CartProductInfo;
import au.com.woolworths.feature.shop.instore.cart.InstoreCartQuery;
import au.com.woolworths.feature.shop.instore.cart.data.InstoreCartData;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.InStoreLocationData;
import au.com.woolworths.product.models.InstoreDetailsData;
import au.com.woolworths.product.models.MemberPriceInfo;
import au.com.woolworths.product.models.MultiBuyPriceInfo;
import au.com.woolworths.product.models.ProductCard;
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
import au.com.woolworths.product.models.PurchaseRestrictionExtKt;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.models.TagLabel;
import au.com.woolworths.shop.graphql.type.PurchaseRestriction;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/shop/instore/cart/data/InstoreCartData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.cart.domain.InstoreCartRepositoryImpl$fetchInstoreCartData$2$1", f = "InstoreCartRepositoryImpl.kt", l = {33}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class InstoreCartRepositoryImpl$fetchInstoreCartData$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InstoreCartData>, Object> {
    public int p;
    public final /* synthetic */ InstoreCartRepositoryImpl q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreCartRepositoryImpl$fetchInstoreCartData$2$1(InstoreCartRepositoryImpl instoreCartRepositoryImpl, String str, Continuation continuation) {
        super(2, continuation);
        this.q = instoreCartRepositoryImpl;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstoreCartRepositoryImpl$fetchInstoreCartData$2$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstoreCartRepositoryImpl$fetchInstoreCartData$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Iterator it;
        ProductCard productCard;
        String str;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        List list;
        String str2;
        ArrayList arrayList3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            InstoreCartRepositoryImpl instoreCartRepositoryImpl = this.q;
            ApolloClient apolloClient = instoreCartRepositoryImpl.f7319a;
            InstoreCartQuery instoreCartQuery = new InstoreCartQuery(this.r, instoreCartRepositoryImpl.c.c(BaseFeature.g));
            apolloClient.getClass();
            ApolloCall apolloCall = new ApolloCall(apolloClient, instoreCartQuery);
            this.p = 1;
            objB = apolloCall.b(this);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            objB = obj;
        }
        InstoreCartQuery.InStoreCart inStoreCart = ((InstoreCartQuery.Data) ExceptionExtKt.k((ApolloResponse) objB)).f7308a;
        int i2 = inStoreCart.f7309a;
        ArrayList arrayList4 = inStoreCart.b;
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            InstoreCartQuery.OnProductCard onProductCard = ((InstoreCartQuery.ProductsFeed) it2.next()).b;
            if (onProductCard != null) {
                au.com.woolworths.graphql.common.fragment.ProductCard productCard2 = onProductCard.b;
                String str3 = productCard2.f8949a;
                String str4 = productCard2.b;
                String str5 = productCard2.e;
                String str6 = productCard2.j;
                Integer num = productCard2.h;
                String str7 = productCard2.i;
                String str8 = productCard2.l;
                boolean z2 = productCard2.f;
                boolean z3 = productCard2.c;
                String str9 = productCard2.m;
                String str10 = productCard2.n;
                ProductCard.Trolley trolley = productCard2.p;
                ProductTrolleyData uiModel = trolley != null ? ProductCardKt.toUiModel(trolley) : null;
                List list2 = productCard2.q;
                it = it2;
                if (list2 != null) {
                    List list3 = list2;
                    str = str10;
                    z = z2;
                    arrayList = new ArrayList(CollectionsKt.s(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(ProductCardKt.toUiModel((ProductCard.Trolley1) it3.next()));
                    }
                } else {
                    str = str10;
                    z = z2;
                    arrayList = null;
                }
                List list4 = EmptyList.d;
                List list5 = arrayList == null ? list4 : arrayList;
                ProductShoppingList uiModel2 = ProductCardListExtKt.toUiModel(productCard2.r);
                ProductCard.InStoreDetails inStoreDetails = productCard2.s;
                InstoreDetailsData uiModel3 = inStoreDetails != null ? ProductCardInStoreDetailsExtKt.toUiModel(inStoreDetails) : null;
                PurchaseRestriction purchaseRestriction = productCard2.d;
                au.com.woolworths.product.models.PurchaseRestriction uiModel4 = purchaseRestriction != null ? PurchaseRestrictionExtKt.toUiModel(purchaseRestriction) : null;
                List<ProductCard.InlineLabel> list6 = productCard2.o;
                if (list6 != null) {
                    arrayList2 = new ArrayList();
                    for (ProductCard.InlineLabel inlineLabel : list6) {
                        ProductInlineLabelApiData uiModel5 = inlineLabel != null ? ProductCardInlineLabelExtKt.toUiModel(inlineLabel) : null;
                        if (uiModel5 != null) {
                            arrayList2.add(uiModel5);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                List list7 = arrayList2 == null ? list4 : arrayList2;
                ProductCard.PromotionInfo promotionInfo = productCard2.k;
                PromotionInfo uiModel6 = promotionInfo != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo) : null;
                String str11 = productCard2.u;
                String str12 = productCard2.v;
                ProductCard.Marketplace marketplace = productCard2.w;
                ProductListMarketplace uiModel7 = marketplace != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace) : null;
                ProductCard.RewardsOfferInfo rewardsOfferInfo = productCard2.x;
                RewardsOfferInfo uiModel8 = rewardsOfferInfo != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo) : null;
                String str13 = productCard2.y;
                ProductCard.TagLabel tagLabel = productCard2.z;
                TagLabel uiModel9 = tagLabel != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel) : null;
                ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo = productCard2.g;
                InStoreAvailabilityInfo uiModel10 = inStoreAvailabilityInfo != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo) : null;
                ProductCard.ProductVarieties productVarieties = productCard2.A;
                ProductVarieties uiModel11 = productVarieties != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties) : null;
                List list8 = productCard2.B;
                if (list8 != null) {
                    List list9 = list8;
                    list = list4;
                    str2 = str12;
                    arrayList3 = new ArrayList(CollectionsKt.s(list9, 10));
                    Iterator it4 = list9.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(ProductCardCategoryExtKt.toUiModel((ProductCard.Category) it4.next()));
                    }
                } else {
                    list = list4;
                    str2 = str12;
                    arrayList3 = null;
                }
                List list10 = arrayList3 == null ? list : arrayList3;
                boolean z4 = productCard2.C;
                ProductCard.MultiBuyPriceInfo multiBuyPriceInfo = productCard2.E;
                MultiBuyPriceInfo uiModel12 = multiBuyPriceInfo != null ? ProductCardMultiBuyPriceInfoExtKt.toUiModel(multiBuyPriceInfo) : null;
                ProductCard.MemberPriceInfo memberPriceInfo = productCard2.D;
                MemberPriceInfo uiModel13 = memberPriceInfo != null ? ProductCardMemberPriceInfoExtKt.toUiModel(memberPriceInfo) : null;
                ProductCard.CartProductInfo cartProductInfo = productCard2.F;
                CartProductInfo uiModel14 = cartProductInfo != null ? ProductCardCartProductInfoExtKt.toUiModel(cartProductInfo) : null;
                ProductCard.InStoreLocation inStoreLocation = productCard2.t;
                InStoreLocationData uiModel15 = inStoreLocation != null ? ProductCardInStoreLocationExtKt.toUiModel(inStoreLocation) : null;
                ProductCard.ProductCardAnalytics productCardAnalytics = productCard2.G;
                AnalyticsData uiModel16 = productCardAnalytics != null ? ProductCardProductCardAnalyticsExtKt.toUiModel(productCardAnalytics) : null;
                ProductCard.ProductCardAction productCardAction = productCard2.H;
                productCard = new au.com.woolworths.product.models.ProductCard(str3, str4, str5, str6, num, str7, null, null, str8, z, z3, str9, null, null, str, uiModel, list5, uiModel2, uiModel3, uiModel4, list7, uiModel6, str11, str2, uiModel7, uiModel8, str13, uiModel9, uiModel10, uiModel11, list10, z4, uiModel12, uiModel13, uiModel14, uiModel15, uiModel16, null, productCardAction != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction) : null, productCard2.I, 12480, 32, null);
            } else {
                it = it2;
                productCard = null;
            }
            if (productCard != null) {
                arrayList5.add(productCard);
            }
            it2 = it;
        }
        return new InstoreCartData(i2, arrayList5);
    }
}
