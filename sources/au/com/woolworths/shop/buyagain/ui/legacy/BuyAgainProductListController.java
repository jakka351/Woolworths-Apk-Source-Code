package au.com.woolworths.shop.buyagain.ui.legacy;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.product.composeui.ProductMemberPriceLabelStyling;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.extensions.ProductExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.buyagain.ItemBuyAgainProductBindingModel_;
import au.com.woolworths.shop.buyagain.ItemPaginationLoadingBindingModel_;
import au.com.woolworths.shop.buyagain.ItemProductListSkeletonBindingModel_;
import au.com.woolworths.shop.buyagain.databinding.EpoxyItemBuyAgainProductBinding;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.paging3.PagedListEpoxyController;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010!\u001a\u0006\u0012\u0002\b\u00030\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010&\u001a\u00020'2\u0010\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"0)H\u0016J\f\u0010*\u001a\u0006\u0012\u0002\b\u00030\"H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0019R<\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b0\u001a2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b0\u001a@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006,"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainProductListController;", "Lcom/airbnb/epoxy/paging3/PagedListEpoxyController;", "Lau/com/woolworths/product/models/ProductCard;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainProductItemListenerLegacy;", "buyAgainLayoutManager", "Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainLayoutManager;", "featureToggleManager", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "inMappedStore", "", "<init>", "(Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainProductItemListenerLegacy;Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainLayoutManager;Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;Z)V", "getListener", "()Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainProductItemListenerLegacy;", "getBuyAgainLayoutManager", "()Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainLayoutManager;", "getFeatureToggleManager", "()Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "getInMappedStore", "()Z", "value", "loading", "getLoading", "setLoading", "(Z)V", "", "", "selectedProductQuantityMap", "getSelectedProductQuantityMap", "()Ljava/util/Map;", "setSelectedProductQuantityMap", "(Ljava/util/Map;)V", "buildItemModel", "Lcom/airbnb/epoxy/EpoxyModel;", "currentPosition", "", "item", "addModels", "", "models", "", "buildSkeletonView", "Companion", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BuyAgainProductListController extends PagedListEpoxyController<ProductCard> {
    public static final int $stable = 8;
    private static final int SKELETON_ITEMS_COUNT = 30;

    @NotNull
    private final BuyAgainLayoutManager buyAgainLayoutManager;

    @NotNull
    private final FeatureToggleManager featureToggleManager;
    private final boolean inMappedStore;

    @NotNull
    private final BuyAgainProductItemListenerLegacy listener;
    private boolean loading;

    @NotNull
    private Map<ProductCard, Float> selectedProductQuantityMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyAgainProductListController(@NotNull BuyAgainProductItemListenerLegacy listener, @NotNull BuyAgainLayoutManager buyAgainLayoutManager, @NotNull FeatureToggleManager featureToggleManager, boolean z) {
        super(null, null, null, 7, null);
        Intrinsics.h(listener, "listener");
        Intrinsics.h(buyAgainLayoutManager, "buyAgainLayoutManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.listener = listener;
        this.buyAgainLayoutManager = buyAgainLayoutManager;
        this.featureToggleManager = featureToggleManager;
        this.inMappedStore = z;
        this.loading = true;
        this.selectedProductQuantityMap = EmptyMap.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildItemModel$lambda$1(ProductCard productCard, ItemBuyAgainProductBindingModel_ itemBuyAgainProductBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        ViewDataBinding viewDataBinding = dataBindingHolder.f13309a;
        EpoxyItemBuyAgainProductBinding epoxyItemBuyAgainProductBinding = viewDataBinding instanceof EpoxyItemBuyAgainProductBinding ? (EpoxyItemBuyAgainProductBinding) viewDataBinding : null;
        if (epoxyItemBuyAgainProductBinding != null) {
            ComposeView productMemberPricingLabel = epoxyItemBuyAgainProductBinding.E;
            Intrinsics.g(productMemberPricingLabel, "productMemberPricingLabel");
            ProductExtKt.a(productMemberPricingLabel, productCard.getMemberPriceInfo(), ProductMemberPriceLabelStyling.d);
        }
    }

    private final EpoxyModel<?> buildSkeletonView() {
        ItemProductListSkeletonBindingModel_ itemProductListSkeletonBindingModel_ = new ItemProductListSkeletonBindingModel_();
        itemProductListSkeletonBindingModel_.M();
        return itemProductListSkeletonBindingModel_;
    }

    @Override // com.airbnb.epoxy.paging3.PagedListEpoxyController
    public void addModels(@NotNull List<? extends EpoxyModel<?>> models) {
        Intrinsics.h(models, "models");
        ArrayList arrayListJ0 = CollectionsKt.J0(models);
        this.buyAgainLayoutManager.Q = (this.loading && models.isEmpty()) ? false : true;
        if (this.loading) {
            if (models.isEmpty()) {
                ArrayList arrayList = new ArrayList(30);
                for (int i = 0; i < 30; i++) {
                    arrayList.add(buildSkeletonView());
                }
                arrayListJ0.addAll(0, arrayList);
            } else {
                ItemPaginationLoadingBindingModel_ itemPaginationLoadingBindingModel_ = new ItemPaginationLoadingBindingModel_();
                itemPaginationLoadingBindingModel_.M();
                arrayListJ0.add(itemPaginationLoadingBindingModel_);
            }
        }
        super.addModels(arrayListJ0);
    }

    @NotNull
    public final BuyAgainLayoutManager getBuyAgainLayoutManager() {
        return this.buyAgainLayoutManager;
    }

    @NotNull
    public final FeatureToggleManager getFeatureToggleManager() {
        return this.featureToggleManager;
    }

    public final boolean getInMappedStore() {
        return this.inMappedStore;
    }

    @NotNull
    public final BuyAgainProductItemListenerLegacy getListener() {
        return this.listener;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    @NotNull
    public final Map<ProductCard, Float> getSelectedProductQuantityMap() {
        return this.selectedProductQuantityMap;
    }

    public final void setLoading(boolean z) {
        if (this.loading != z) {
            this.loading = z;
            requestModelBuild();
        }
    }

    public final void setSelectedProductQuantityMap(@NotNull Map<ProductCard, Float> value) {
        Intrinsics.h(value, "value");
        if (Intrinsics.c(this.selectedProductQuantityMap, value)) {
            return;
        }
        this.selectedProductQuantityMap = value;
        requestForcedModelBuild();
    }

    @Override // com.airbnb.epoxy.paging3.PagedListEpoxyController
    @NotNull
    public EpoxyModel<?> buildItemModel(int currentPosition, @Nullable ProductCard item) {
        if (item == null) {
            throw new IllegalStateException("Paged activity feed list contains null item");
        }
        ItemBuyAgainProductBindingModel_ itemBuyAgainProductBindingModel_ = new ItemBuyAgainProductBindingModel_();
        itemBuyAgainProductBindingModel_.M(ProductCardExtKt.b(item, currentPosition, this.featureToggleManager));
        itemBuyAgainProductBindingModel_.t();
        itemBuyAgainProductBindingModel_.o = item;
        Float orDefault = this.selectedProductQuantityMap.getOrDefault(item, Float.valueOf(BitmapDescriptorFactory.HUE_RED));
        itemBuyAgainProductBindingModel_.t();
        itemBuyAgainProductBindingModel_.q = orDefault;
        BuyAgainProductItemListenerLegacy buyAgainProductItemListenerLegacy = this.listener;
        itemBuyAgainProductBindingModel_.t();
        itemBuyAgainProductBindingModel_.p = buyAgainProductItemListenerLegacy;
        boolean z = this.inMappedStore;
        itemBuyAgainProductBindingModel_.t();
        itemBuyAgainProductBindingModel_.r = z;
        boolean zC = this.featureToggleManager.c(BaseShopAppFeature.w);
        itemBuyAgainProductBindingModel_.t();
        itemBuyAgainProductBindingModel_.s = zC;
        d dVar = new d(item);
        itemBuyAgainProductBindingModel_.t();
        itemBuyAgainProductBindingModel_.n = dVar;
        return itemBuyAgainProductBindingModel_;
    }
}
