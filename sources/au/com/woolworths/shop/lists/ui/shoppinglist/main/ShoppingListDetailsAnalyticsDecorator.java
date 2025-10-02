package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.lists.ListDetailsAnalytics;
import au.com.woolworths.analytics.supers.lists.ListsAnalytics;
import au.com.woolworths.analytics.supers.lists.SnapAListAnalytics;
import au.com.woolworths.analytics.supers.lists.WatchlistAnalytics;
import au.com.woolworths.analytics.supers.local.ListsAnalytics;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductTileButtonType;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import au.com.woolworths.shop.lists.ui.ListDetailsAnalyticsParams;
import au.com.woolworths.shop.lists.ui.ListScreen;
import au.com.woolworths.shop.lists.ui.ListScreenKt;
import au.com.woolworths.shop.lists.ui.lists.analytics.SharedListsActions;
import au.com.woolworths.shop.lists.ui.shoppinglist.analytics.ShoppingListDetailsActions;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListDetailsUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.TextItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.utils.ShoppingListsExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlow;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsAnalyticsDecorator;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$IShoppingListDetailsViewModel;", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShoppingListDetailsAnalyticsDecorator implements ShoppingListDetailsContract.IShoppingListDetailsViewModel {
    public final ShoppingListDetailsContract.IShoppingListDetailsViewModel d;
    public final AnalyticsManager e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsAnalyticsDecorator$Companion;", "", "", "AUTO_CHECK_OFF_ANALYTICS_DESC", "Ljava/lang/String;", "WATCHLIST_PRODUCT_SOURCE", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12384a;

        static {
            int[] iArr = new int[ProductTileButtonType.values().length];
            try {
                iArr[ProductTileButtonType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductTileButtonType.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12384a = iArr;
        }
    }

    public ShoppingListDetailsAnalyticsDecorator(ShoppingListDetailsViewModel wrappedViewModel, AnalyticsManager analyticsManager) {
        Intrinsics.h(wrappedViewModel, "wrappedViewModel");
        this.d = wrappedViewModel;
        this.e = analyticsManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static TrackingMetadata a(ShoppingListDetailsAnalyticsDecorator shoppingListDetailsAnalyticsDecorator, List list, String str, int i) {
        ?? arrayList;
        String str2 = (i & 4) != 0 ? null : str;
        if (shoppingListDetailsAnalyticsDecorator.d.H5()) {
            List<ProductCard> list2 = list;
            arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            for (ProductCard productCard : list2) {
                arrayList.add(productCard.copy(((-33554433) & 1) != 0 ? productCard.productId : null, ((-33554433) & 2) != 0 ? productCard.name : null, ((-33554433) & 4) != 0 ? productCard.productImage : null, ((-33554433) & 8) != 0 ? productCard.badgeImage : null, ((-33554433) & 16) != 0 ? productCard.price : null, ((-33554433) & 32) != 0 ? productCard.unitOfMeasureLabel : null, ((-33554433) & 64) != 0 ? productCard.promotionValue : null, ((-33554433) & 128) != 0 ? productCard.promotionType : null, ((-33554433) & 256) != 0 ? productCard.unitPriceDescription : null, ((-33554433) & 512) != 0 ? productCard.isAvailable : false, ((-33554433) & 1024) != 0 ? productCard.isNew : false, ((-33554433) & 2048) != 0 ? productCard.wasPrice : null, ((-33554433) & 4096) != 0 ? productCard.multiBuyPrice : null, ((-33554433) & 8192) != 0 ? productCard.multiBuyUnitPrice : null, ((-33554433) & 16384) != 0 ? productCard.purchaseWarning : null, ((-33554433) & 32768) != 0 ? productCard.trolley : null, ((-33554433) & 65536) != 0 ? productCard.trolleys : null, ((-33554433) & 131072) != 0 ? productCard.productShoppingList : null, ((-33554433) & 262144) != 0 ? productCard.inStoreDetails : null, ((-33554433) & 524288) != 0 ? productCard.purchaseRestriction : null, ((-33554433) & 1048576) != 0 ? productCard.inlineLabels : null, ((-33554433) & 2097152) != 0 ? productCard.promotionInfo : null, ((-33554433) & 4194304) != 0 ? productCard.adId : null, ((-33554433) & 8388608) != 0 ? productCard.source : "watchlist", ((-33554433) & 16777216) != 0 ? productCard.marketplace : null, ((-33554433) & 33554432) != 0 ? productCard.rewardsOfferInfo : null, ((-33554433) & 67108864) != 0 ? productCard.disclaimer : null, ((-33554433) & 134217728) != 0 ? productCard.tagLabel : null, ((-33554433) & 268435456) != 0 ? productCard.inStoreAvailabilityInfo : null, ((-33554433) & 536870912) != 0 ? productCard.productVarieties : null, ((-33554433) & 1073741824) != 0 ? productCard.categories : null, ((-33554433) & Integer.MIN_VALUE) != 0 ? productCard.isTobacco : false, (255 & 1) != 0 ? productCard.multiBuyPriceInfo : null, (255 & 2) != 0 ? productCard.memberPriceInfo : null, (255 & 4) != 0 ? productCard.cartProductInfo : null, (255 & 8) != 0 ? productCard.inStoreLocation : null, (255 & 16) != 0 ? productCard.productCardAnalytics : null, (255 & 32) != 0 ? productCard.impressionAnalyticsData : null, (255 & 64) != 0 ? productCard.productCardAction : null, (255 & 128) != 0 ? productCard.pricingFootnoteMd : null));
            }
        } else {
            arrayList = list;
        }
        return ProductAnalyticsExtKt.a(arrayList, null, str2);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void A5() {
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        c(new ShoppingListDetailsActions.FreetextProductSearchClick(iShoppingListDetailsViewModel.u0()), null);
        iShoppingListDetailsViewModel.A5();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void B(ProductItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        this.e.g(ListsAnalytics.Lists.Action.f);
        this.d.B(uiModel);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void C(View view, ProductItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        this.e.g((Event) ListScreenKt.a(iShoppingListDetailsViewModel.u0()).h.d.getD());
        iShoppingListDetailsViewModel.C(view, uiModel);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void C5(TextItemUiModel uiModel, boolean z) {
        Action uncheckFreetextItem;
        Intrinsics.h(uiModel, "uiModel");
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        if (z) {
            uncheckFreetextItem = new ShoppingListDetailsActions.CheckFreetextItem(iShoppingListDetailsViewModel.u0());
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            uncheckFreetextItem = new ShoppingListDetailsActions.UncheckFreetextItem(iShoppingListDetailsViewModel.u0());
        }
        c(uncheckFreetextItem, null);
        iShoppingListDetailsViewModel.C5(uiModel, z);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void D(String listId, boolean z) {
        Action deleteListCancelClick;
        Intrinsics.h(listId, "listId");
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        if (z) {
            deleteListCancelClick = new SharedListsActions.DeleteListClick(iShoppingListDetailsViewModel.S0());
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            deleteListCancelClick = new SharedListsActions.DeleteListCancelClick(iShoppingListDetailsViewModel.S0());
        }
        c(deleteListCancelClick, null);
        iShoppingListDetailsViewModel.D(listId, z);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final CoroutineScope D1() {
        return this.d.D1();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void F(ProductItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        c(new ShoppingListDetailsActions.UpdateQuantityClick(iShoppingListDetailsViewModel.u0()), null);
        iShoppingListDetailsViewModel.F(uiModel);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    /* renamed from: G */
    public final StateFlow getY() {
        return this.d.getY();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void G1() {
        ?? arrayList;
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        ShoppingListDetailsUiModel shoppingListDetailsUiModel = ((ShoppingListDetailsContract.ViewState) iShoppingListDetailsViewModel.getY().getValue()).f12428a;
        if (shoppingListDetailsUiModel != null) {
            List list = shoppingListDetailsUiModel.b;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ProductCard productCard = ((ProductItemUiModel) it.next()).i;
                if (productCard != null) {
                    arrayList2.add(productCard);
                }
            }
            arrayList = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                RewardsOfferInfo rewardsOfferInfo = ((ProductCard) next).getRewardsOfferInfo();
                if ((rewardsOfferInfo != null ? rewardsOfferInfo.getN() : null) == RewardsOfferStatus.NOT_ACTIVATED) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = EmptyList.d;
        }
        TrackingMetadata trackingMetadataA = a(this, arrayList, null, 6);
        if (trackingMetadataA != null) {
            this.e.j(new ShoppingListDetailsActions.BoostAllClick(iShoppingListDetailsViewModel.u0(), arrayList.size()), trackingMetadataA);
        }
        iShoppingListDetailsViewModel.G1();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void H() {
        this.e.g(SnapAListAnalytics.ListDetails.Action.e);
        this.d.H();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final boolean H5() {
        return this.d.H5();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final ShoppingListProductItemState I0() {
        return this.d.I0();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void I2(ShoppingListItemUiModel deletedItemUiModel) {
        Intrinsics.h(deletedItemUiModel, "deletedItemUiModel");
        boolean z = deletedItemUiModel instanceof ProductItemUiModel;
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        if (z) {
            c(new ShoppingListDetailsActions.DeleteProductItem(iShoppingListDetailsViewModel.u0()), null);
        } else {
            if (!(deletedItemUiModel instanceof TextItemUiModel)) {
                throw new NoWhenBranchMatchedException();
            }
            c(new ShoppingListDetailsActions.DeleteFreetextItem(iShoppingListDetailsViewModel.u0()), null);
        }
        iShoppingListDetailsViewModel.I2(deletedItemUiModel);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void J() {
        this.d.J();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void J4(ProductCard product) {
        Intrinsics.h(product, "product");
        this.d.J4(product);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void K() {
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        c(new ShoppingListDetailsActions.AddFreeTextItemToListClick(iShoppingListDetailsViewModel.u0()), null);
        iShoppingListDetailsViewModel.K();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void L() {
        this.d.L();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void L2(ProductItemUiModel uiModel, boolean z) {
        Action uncheckProductItem;
        Intrinsics.h(uiModel, "uiModel");
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        if (z) {
            uncheckProductItem = new ShoppingListDetailsActions.CheckProductItem(iShoppingListDetailsViewModel.u0());
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            uncheckProductItem = new ShoppingListDetailsActions.UncheckProductItem(iShoppingListDetailsViewModel.u0());
        }
        c(uncheckProductItem, null);
        iShoppingListDetailsViewModel.L2(uiModel, z);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void M(ProductCard product) {
        Intrinsics.h(product, "product");
        this.d.M(product);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void O1(ProductItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        ProductCard productCard = uiModel.i;
        Intrinsics.e(productCard);
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        ListsAnalytics.Details.Action action = ListScreenKt.a(iShoppingListDetailsViewModel.u0()).h;
        ProductTrolleyData trolley = productCard.getTrolley();
        ProductTileButtonType buttonState = trolley != null ? trolley.getButtonState() : null;
        int i = buttonState == null ? -1 : WhenMappings.f12384a[buttonState.ordinal()];
        Event event = i != 1 ? i != 2 ? null : (Event) action.c.getD() : (Event) action.b.getD();
        TrackingMetadata trackingMetadataA = a(this, CollectionsKt.Q(productCard), null, 6);
        if (event != null && trackingMetadataA != null) {
            this.e.i(event, trackingMetadataA);
        }
        iShoppingListDetailsViewModel.O1(uiModel);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void P0() {
        this.d.P0();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void P5() {
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        c(new ShoppingListDetailsActions.AutoCheckOffDialogSettingsClick(iShoppingListDetailsViewModel.u0()), "auto check off list items");
        iShoppingListDetailsViewModel.P5();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void R1(boolean z) {
        this.d.R1(z);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final ListScreen S0() {
        return this.d.S0();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void T5(boolean z) {
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        boolean zH5 = iShoppingListDetailsViewModel.H5();
        AnalyticsManager analyticsManager = this.e;
        if (zH5) {
            analyticsManager.f(new WatchlistAnalytics.Impression(z ? "watchlist optin" : "watchlist optout"));
        } else {
            analyticsManager.a(iShoppingListDetailsViewModel.S0());
        }
        iShoppingListDetailsViewModel.T5(z);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void V2() {
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        c(new ShoppingListDetailsActions.CartIconClick(iShoppingListDetailsViewModel.u0()), null);
        iShoppingListDetailsViewModel.V2();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void V5() {
        this.d.V5();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void W() {
        ArrayList arrayListC;
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        ShoppingListDetailsContract.ListState listState = ((ShoppingListDetailsContract.ViewState) iShoppingListDetailsViewModel.getY().getValue()).c;
        if (listState != null && (arrayListC = ShoppingListsExtKt.c(listState.b)) != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListC, 10));
            Iterator it = arrayListC.iterator();
            while (it.hasNext()) {
                arrayList.add(((ProductItemUiModel) it.next()).g);
            }
            ShoppingListDetailsUiModel shoppingListDetailsUiModel = ((ShoppingListDetailsContract.ViewState) iShoppingListDetailsViewModel.getY().getValue()).f12428a;
            if (shoppingListDetailsUiModel != null) {
                TrackingMetadata trackingMetadataA = a(this, ShoppingListsExtKt.d(shoppingListDetailsUiModel, arrayList), arrayListC.size() + " product added to cart", 2);
                if (trackingMetadataA != null) {
                    this.e.j(new ShoppingListDetailsActions.AddAllToCartClick(iShoppingListDetailsViewModel.u0()), trackingMetadataA);
                }
            }
        }
        iShoppingListDetailsViewModel.W();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void W0(ShoppingListItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        this.d.W0(uiModel);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void X() {
        this.d.X();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void Y2() {
        this.d.Y2();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void Z1() {
        this.d.Z1();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void b() {
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        c(new ShoppingListDetailsActions.SearchIconClick(iShoppingListDetailsViewModel.u0()), null);
        iShoppingListDetailsViewModel.b();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void b0(String listId, boolean z) {
        Intrinsics.h(listId, "listId");
        this.d.b0(listId, z);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void b1(TextItemUiModel uiModel, String text) {
        Intrinsics.h(uiModel, "uiModel");
        Intrinsics.h(text, "text");
        this.d.b1(uiModel, text);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void b6(ShoppingListItemUiModel shoppingListItemUiModel) {
        this.d.b6(shoppingListItemUiModel);
    }

    public final void c(Action action, String str) {
        AnalyticsManager analyticsManager = this.e;
        if (str == null) {
            analyticsManager.c(action);
        } else {
            analyticsManager.j(action, TrackingMetadata.Companion.a(TrackableValue.o0, str));
        }
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void c0() {
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        c(new ShoppingListDetailsActions.DeleteListClick(iShoppingListDetailsViewModel.u0()), null);
        iShoppingListDetailsViewModel.c0();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void c5() {
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        c(new ShoppingListDetailsActions.PullDownToRefreshList(iShoppingListDetailsViewModel.u0()), null);
        iShoppingListDetailsViewModel.c5();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    /* renamed from: d0 */
    public final Flow getZ() {
        return new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ShoppingListDetailsAnalyticsDecorator$actions$1(this, null), this.d.getZ());
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void e(ProductCard product) {
        ButtonApiData button;
        final String label;
        Intrinsics.h(product, "product");
        InStoreAvailabilityInfo inStoreAvailabilityInfo = product.getInStoreAvailabilityInfo();
        if (inStoreAvailabilityInfo == null || (button = inStoreAvailabilityInfo.getButton()) == null || (label = button.getLabel()) == null) {
            Bark.Companion companion = Bark.f8483a;
            Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.q), "onProductAvailabilityClicked: expected non-null product.inStoreAvailabilityInfo", null);
        } else {
            ListsAnalytics.Lists.Action.d.getClass();
            this.e.g(new Event(label) { // from class: au.com.woolworths.analytics.supers.lists.ListsAnalytics$Lists$Action$Companion$availabilityInfoCtaClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ListsAnalytics.Lists.e);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", label, spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj;
                    return "button_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
        }
        this.d.e(product);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void e0(ShoppingListItemUiModel deletedItemModel) {
        Intrinsics.h(deletedItemModel, "deletedItemModel");
        this.d.e0(deletedItemModel);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void i(String listId, boolean z) {
        Intrinsics.h(listId, "listId");
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        if (z) {
            c(new ShoppingListDetailsActions.RemoveAllItemsClick(iShoppingListDetailsViewModel.u0()), null);
        } else {
            c(new ShoppingListDetailsActions.RemoveAllItemsCancelClick(iShoppingListDetailsViewModel.u0()), null);
        }
        iShoppingListDetailsViewModel.i(listId, z);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void k(TextItemUiModel uiModel, boolean z) {
        Intrinsics.h(uiModel, "uiModel");
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        if (z) {
            c(new ShoppingListDetailsActions.EditFreetextItem(iShoppingListDetailsViewModel.u0()), null);
        }
        iShoppingListDetailsViewModel.k(uiModel, z);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void l(final String str) {
        ListDetailsAnalytics.ListDetails.Action.d.getClass();
        this.e.g(new Event(str) { // from class: au.com.woolworths.analytics.supers.lists.ListDetailsAnalytics$ListDetails$Action$Companion$buttonClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(ListDetailsAnalytics.ListDetails.e);
                spreadBuilder.a(new Pair("event.Category", "list"));
                spreadBuilder.a(new Pair("event.Action", "button_click"));
                a.y("event.Label", str, spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "list_button_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "list_button_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        this.d.l(str);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void l3() {
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        c(new ShoppingListDetailsActions.ListChangeClick(iShoppingListDetailsViewModel.u0()), null);
        iShoppingListDetailsViewModel.l3();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void n(TextItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        this.e.c(new ShoppingListDetailsActions.FreetextClearClick(iShoppingListDetailsViewModel.u0()));
        iShoppingListDetailsViewModel.n(uiModel);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void n5(ProductItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        this.e.g((Event) ListScreenKt.a(iShoppingListDetailsViewModel.u0()).h.e.getD());
        iShoppingListDetailsViewModel.n5(uiModel);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void o() {
        this.d.o();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void o4(List list) {
        Intrinsics.h(list, "list");
        this.e.g(SnapAListAnalytics.ListDetails.Action.f);
        this.d.o4(list);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void p5() {
        this.e.g(ListsAnalytics.Lists.Action.g);
        this.d.p5();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void q2() {
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        c(new ShoppingListDetailsActions.AutoCheckOffDialogContinueClick(iShoppingListDetailsViewModel.u0()), "auto check off list items");
        iShoppingListDetailsViewModel.q2();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void s1() {
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        c(new ShoppingListDetailsActions.RemoveAllItemsClick(iShoppingListDetailsViewModel.u0()), null);
        iShoppingListDetailsViewModel.s1();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void s3(ShoppingListItemUiModel shoppingListItemUiModel) {
        this.d.s3(shoppingListItemUiModel);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void t0() {
        this.d.t0();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void t1() {
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        c(new ShoppingListDetailsActions.ScanItemClick(iShoppingListDetailsViewModel.u0()), null);
        iShoppingListDetailsViewModel.t1();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void t3() {
        this.d.t3();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void u(String searchTerm) {
        Intrinsics.h(searchTerm, "searchTerm");
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        this.e.c(new ShoppingListDetailsActions.FreetextItemSearchClick(iShoppingListDetailsViewModel.u0()));
        iShoppingListDetailsViewModel.u(searchTerm);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final ListDetailsAnalyticsParams u0() {
        return this.d.u0();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void v(ProductItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        c(new ShoppingListDetailsActions.CopyToListClick(iShoppingListDetailsViewModel.u0()), null);
        iShoppingListDetailsViewModel.v(uiModel);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void v5() {
        this.d.v5();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void w0(ShoppingList shoppingList) {
        Intrinsics.h(shoppingList, "shoppingList");
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        c(new ShoppingListDetailsActions.DuplicateListClick(iShoppingListDetailsViewModel.u0()), null);
        iShoppingListDetailsViewModel.w0(shoppingList);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void w2() {
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        c(new ShoppingListDetailsActions.RenameListClick(iShoppingListDetailsViewModel.u0()), null);
        iShoppingListDetailsViewModel.w2();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void w4(ProductItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.F2, "lists");
        ProductCard productCard = uiModel.i;
        if (productCard != null) {
            trackingMetadataA.a(ProductAnalyticsExtKt.h(productCard, null, null, 7));
        }
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        this.e.j(new ShoppingListDetailsActions.SaveToWatchlistClick(iShoppingListDetailsViewModel.u0()), trackingMetadataA);
        iShoppingListDetailsViewModel.w4(uiModel);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void y() {
        this.d.y();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void y4(ShoppingListItemUiModel deletedItemUiModel) {
        Intrinsics.h(deletedItemUiModel, "deletedItemUiModel");
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d;
        c(new ShoppingListDetailsActions.ListItemDeletedSnackbarImpression(iShoppingListDetailsViewModel.u0()), null);
        iShoppingListDetailsViewModel.y4(deletedItemUiModel);
    }
}
