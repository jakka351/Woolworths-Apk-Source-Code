package au.com.woolworths.product.infoview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.collectionmode.InStoreModeInteractor;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.feature.product.list.legacy.ui.a;
import au.com.woolworths.product.composeui.ProductMemberPriceLabelStyling;
import au.com.woolworths.product.databinding.LayoutProductInfoBinding;
import au.com.woolworths.product.extensions.ProductExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.offers.ProductsBoostViewListener;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R.\u00100\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010(8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Lau/com/woolworths/product/infoview/ProductInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "f", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "getFeatureToggleManager", "()Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "setFeatureToggleManager", "(Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;)V", "featureToggleManager", "Lau/com/woolworths/android/onesite/modules/collectionmode/InStoreModeInteractor;", "g", "Lau/com/woolworths/android/onesite/modules/collectionmode/InStoreModeInteractor;", "getInStoreModeInteractor", "()Lau/com/woolworths/android/onesite/modules/collectionmode/InStoreModeInteractor;", "setInStoreModeInteractor", "(Lau/com/woolworths/android/onesite/modules/collectionmode/InStoreModeInteractor;)V", "inStoreModeInteractor", "Landroidx/appcompat/app/AppCompatActivity;", "i", "Lkotlin/Lazy;", "getActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "activity", "Lau/com/woolworths/product/models/ProductCard;", "j", "Lau/com/woolworths/product/models/ProductCard;", "getProductData", "()Lau/com/woolworths/product/models/ProductCard;", "setProductData", "(Lau/com/woolworths/product/models/ProductCard;)V", "productData", "Lau/com/woolworths/product/offers/ProductsBoostViewListener;", "value", "k", "Lau/com/woolworths/product/offers/ProductsBoostViewListener;", "getBoostViewListener", "()Lau/com/woolworths/product/offers/ProductsBoostViewListener;", "setBoostViewListener", "(Lau/com/woolworths/product/offers/ProductsBoostViewListener;)V", "boostViewListener", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class ProductInfoView extends Hilt_ProductInfoView {
    public static final /* synthetic */ int l = 0;

    /* renamed from: f, reason: from kotlin metadata */
    public FeatureToggleManager featureToggleManager;

    /* renamed from: g, reason: from kotlin metadata */
    public InStoreModeInteractor inStoreModeInteractor;
    public final LayoutProductInfoBinding h;

    /* renamed from: i, reason: from kotlin metadata */
    public final Lazy activity;

    /* renamed from: j, reason: from kotlin metadata */
    public ProductCard productData;

    /* renamed from: k, reason: from kotlin metadata */
    public ProductsBoostViewListener boostViewListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProductInfoView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    @NotNull
    public final AppCompatActivity getActivity() {
        return (AppCompatActivity) this.activity.getD();
    }

    @Nullable
    public final ProductsBoostViewListener getBoostViewListener() {
        return this.boostViewListener;
    }

    @NotNull
    public final FeatureToggleManager getFeatureToggleManager() {
        FeatureToggleManager featureToggleManager = this.featureToggleManager;
        if (featureToggleManager != null) {
            return featureToggleManager;
        }
        Intrinsics.p("featureToggleManager");
        throw null;
    }

    @NotNull
    public final InStoreModeInteractor getInStoreModeInteractor() {
        InStoreModeInteractor inStoreModeInteractor = this.inStoreModeInteractor;
        if (inStoreModeInteractor != null) {
            return inStoreModeInteractor;
        }
        Intrinsics.p("inStoreModeInteractor");
        throw null;
    }

    @NotNull
    public final ProductCard getProductData() {
        ProductCard productCard = this.productData;
        if (productCard != null) {
            return productCard;
        }
        Intrinsics.p("productData");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProductCard productData = getProductData();
        LayoutProductInfoBinding layoutProductInfoBinding = this.h;
        layoutProductInfoBinding.P(productData);
        layoutProductInfoBinding.O(new ProductCardConfig(getInStoreModeInteractor().b(), true, false, false, false, false, null, 124, null));
        layoutProductInfoBinding.N(getFeatureToggleManager().c(BaseShopAppFeature.w));
        ComposeView memberPriceComposeView = layoutProductInfoBinding.z;
        Intrinsics.g(memberPriceComposeView, "memberPriceComposeView");
        ProductExtKt.a(memberPriceComposeView, getProductData().getMemberPriceInfo(), ProductMemberPriceLabelStyling.d);
    }

    public final void setBoostViewListener(@Nullable ProductsBoostViewListener productsBoostViewListener) {
        this.boostViewListener = productsBoostViewListener;
        this.h.L(productsBoostViewListener);
    }

    public final void setFeatureToggleManager(@NotNull FeatureToggleManager featureToggleManager) {
        Intrinsics.h(featureToggleManager, "<set-?>");
        this.featureToggleManager = featureToggleManager;
    }

    public final void setInStoreModeInteractor(@NotNull InStoreModeInteractor inStoreModeInteractor) {
        Intrinsics.h(inStoreModeInteractor, "<set-?>");
        this.inStoreModeInteractor = inStoreModeInteractor;
    }

    public final void setProductData(@NotNull ProductCard productCard) {
        Intrinsics.h(productCard, "<set-?>");
        this.productData = productCard;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProductInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ ProductInfoView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProductInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i2 = LayoutProductInfoBinding.P;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        LayoutProductInfoBinding layoutProductInfoBinding = (LayoutProductInfoBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.layout_product_info, this, true, null);
        Intrinsics.g(layoutProductInfoBinding, "inflate(...)");
        this.h = layoutProductInfoBinding;
        this.activity = LazyKt.b(new a(context, 6));
    }
}
