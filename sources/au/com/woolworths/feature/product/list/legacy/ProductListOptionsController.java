package au.com.woolworths.feature.product.list.legacy;

import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.extensions.SpannableStringExtKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.product.list.legacy.data.ProductFilterSwitch;
import au.com.woolworths.feature.product.list.legacy.data.SortOption;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductListOptionsMarketplaceLegacyBinding;
import au.com.woolworths.feature.product.list.legacy.ui.DisplayModeClickListener;
import au.com.woolworths.feature.product.list.legacy.ui.FilterCardClickListener;
import au.com.woolworths.feature.product.list.legacy.ui.FilterOptionsClickListener;
import au.com.woolworths.feature.product.list.legacy.ui.MarketplaceSwitchListener;
import au.com.woolworths.feature.product.list.legacy.ui.ProductListOptionsItem;
import au.com.woolworths.feature.product.list.legacy.ui.ProductListOptionsSortOptionItem;
import au.com.woolworths.feature.product.list.legacy.ui.SortOptionsClickListener;
import au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt;
import com.airbnb.epoxy.ComposeInteropKt;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.TypedEpoxyController;
import com.google.android.material.switchmaterial.SwitchMaterial;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListOptionsController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "Lau/com/woolworths/feature/product/list/legacy/ui/ProductListOptionsItem;", "sortOptionsClickListener", "Lau/com/woolworths/feature/product/list/legacy/ui/SortOptionsClickListener;", "displayModeClickListener", "Lau/com/woolworths/feature/product/list/legacy/ui/DisplayModeClickListener;", "filterOptionsClickListener", "Lau/com/woolworths/feature/product/list/legacy/ui/FilterOptionsClickListener;", "filterCardClickListener", "Lau/com/woolworths/feature/product/list/legacy/ui/FilterCardClickListener;", "marketplaceSwitchListener", "Lau/com/woolworths/feature/product/list/legacy/ui/MarketplaceSwitchListener;", "<init>", "(Lau/com/woolworths/feature/product/list/legacy/ui/SortOptionsClickListener;Lau/com/woolworths/feature/product/list/legacy/ui/DisplayModeClickListener;Lau/com/woolworths/feature/product/list/legacy/ui/FilterOptionsClickListener;Lau/com/woolworths/feature/product/list/legacy/ui/FilterCardClickListener;Lau/com/woolworths/feature/product/list/legacy/ui/MarketplaceSwitchListener;)V", "buildModels", "", "data", "buildSortByItemSection", "sortOptionsSection", "Lau/com/woolworths/feature/product/list/legacy/ui/ProductListOptionsItem$SortOptionsSection;", "buildDisplayModeSection", "section", "Lau/com/woolworths/feature/product/list/legacy/ui/ProductListOptionsItem$DisplayMode;", "buildDisplayModeItem", "mode", "Lau/com/woolworths/feature/product/list/legacy/ProductsDisplayMode;", "checkedMode", "buildFilterCard", "filterCard", "Lau/com/woolworths/feature/product/list/legacy/ui/ProductListOptionsItem$FilterCard;", "buildMarketplaceSwitch", "switch", "Lau/com/woolworths/feature/product/list/legacy/ui/ProductListOptionsItem$MarketplaceSwitch;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListOptionsController extends TypedEpoxyController<List<? extends ProductListOptionsItem>> {
    public static final int $stable = 8;

    @NotNull
    private final DisplayModeClickListener displayModeClickListener;

    @NotNull
    private final FilterCardClickListener filterCardClickListener;

    @NotNull
    private final FilterOptionsClickListener filterOptionsClickListener;

    @NotNull
    private final MarketplaceSwitchListener marketplaceSwitchListener;

    @NotNull
    private final SortOptionsClickListener sortOptionsClickListener;

    public ProductListOptionsController(@NotNull SortOptionsClickListener sortOptionsClickListener, @NotNull DisplayModeClickListener displayModeClickListener, @NotNull FilterOptionsClickListener filterOptionsClickListener, @NotNull FilterCardClickListener filterCardClickListener, @NotNull MarketplaceSwitchListener marketplaceSwitchListener) {
        Intrinsics.h(sortOptionsClickListener, "sortOptionsClickListener");
        Intrinsics.h(displayModeClickListener, "displayModeClickListener");
        Intrinsics.h(filterOptionsClickListener, "filterOptionsClickListener");
        Intrinsics.h(filterCardClickListener, "filterCardClickListener");
        Intrinsics.h(marketplaceSwitchListener, "marketplaceSwitchListener");
        this.sortOptionsClickListener = sortOptionsClickListener;
        this.displayModeClickListener = displayModeClickListener;
        this.filterOptionsClickListener = filterOptionsClickListener;
        this.filterCardClickListener = filterCardClickListener;
        this.marketplaceSwitchListener = marketplaceSwitchListener;
    }

    private final void buildDisplayModeItem(ProductsDisplayMode mode, ProductsDisplayMode checkedMode) {
        ItemProductListOptionsDisplayModeLegacyBindingModel_ itemProductListOptionsDisplayModeLegacyBindingModel_ = new ItemProductListOptionsDisplayModeLegacyBindingModel_();
        itemProductListOptionsDisplayModeLegacyBindingModel_.M(mode.toString());
        itemProductListOptionsDisplayModeLegacyBindingModel_.t();
        itemProductListOptionsDisplayModeLegacyBindingModel_.n = mode;
        boolean z = mode == checkedMode;
        itemProductListOptionsDisplayModeLegacyBindingModel_.t();
        itemProductListOptionsDisplayModeLegacyBindingModel_.o = z;
        DisplayModeClickListener displayModeClickListener = this.displayModeClickListener;
        itemProductListOptionsDisplayModeLegacyBindingModel_.t();
        itemProductListOptionsDisplayModeLegacyBindingModel_.p = displayModeClickListener;
        add(itemProductListOptionsDisplayModeLegacyBindingModel_);
    }

    private final void buildDisplayModeSection(ProductListOptionsItem.DisplayMode section) {
        buildDisplayModeItem(ProductsDisplayMode.e, section.f5377a);
        buildDisplayModeItem(ProductsDisplayMode.d, section.f5377a);
    }

    private final void buildFilterCard(ProductListOptionsItem.FilterCard filterCard) {
        ItemFilterHighlightCardLegacyBindingModel_ itemFilterHighlightCardLegacyBindingModel_ = new ItemFilterHighlightCardLegacyBindingModel_();
        itemFilterHighlightCardLegacyBindingModel_.r(Integer.valueOf(filterCard.hashCode()));
        FilterCardClickListener filterCardClickListener = this.filterCardClickListener;
        itemFilterHighlightCardLegacyBindingModel_.t();
        itemFilterHighlightCardLegacyBindingModel_.n = filterCardClickListener;
        itemFilterHighlightCardLegacyBindingModel_.l = new k(9);
        add(itemFilterHighlightCardLegacyBindingModel_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildFilterCard$lambda$10$lambda$9(int i, int i2, int i3) {
        return i;
    }

    private final void buildMarketplaceSwitch(ProductListOptionsItem.MarketplaceSwitch marketplaceSwitch) {
        ItemProductListOptionsMarketplaceLegacyBindingModel_ itemProductListOptionsMarketplaceLegacyBindingModel_ = new ItemProductListOptionsMarketplaceLegacyBindingModel_();
        itemProductListOptionsMarketplaceLegacyBindingModel_.q("marketplace_switch", marketplaceSwitch.f5381a.d);
        ProductFilterSwitch productFilterSwitch = marketplaceSwitch.f5381a;
        itemProductListOptionsMarketplaceLegacyBindingModel_.t();
        itemProductListOptionsMarketplaceLegacyBindingModel_.o = productFilterSwitch;
        itemProductListOptionsMarketplaceLegacyBindingModel_.l = new k(10);
        v vVar = new v(marketplaceSwitch, this, 0);
        itemProductListOptionsMarketplaceLegacyBindingModel_.t();
        itemProductListOptionsMarketplaceLegacyBindingModel_.n = vVar;
        add(itemProductListOptionsMarketplaceLegacyBindingModel_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildMarketplaceSwitch$lambda$16$lambda$11(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildMarketplaceSwitch$lambda$16$lambda$15(ProductListOptionsItem.MarketplaceSwitch marketplaceSwitch, final ProductListOptionsController productListOptionsController, ItemProductListOptionsMarketplaceLegacyBindingModel_ itemProductListOptionsMarketplaceLegacyBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        String label;
        String label2;
        ViewDataBinding viewDataBinding = dataBindingHolder.f13309a;
        Intrinsics.f(viewDataBinding, "null cannot be cast to non-null type au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductListOptionsMarketplaceLegacyBinding");
        EpoxyItemProductListOptionsMarketplaceLegacyBinding epoxyItemProductListOptionsMarketplaceLegacyBinding = (EpoxyItemProductListOptionsMarketplaceLegacyBinding) viewDataBinding;
        ProductFilterSwitch productFilterSwitch = marketplaceSwitch.f5381a;
        MarketplaceSwitchListener marketplaceSwitchListener = productListOptionsController.marketplaceSwitchListener;
        Intrinsics.h(productFilterSwitch, "<this>");
        String str = productFilterSwitch.e;
        ContentCta contentCta = productFilterSwitch.h;
        if (contentCta == null || (label = contentCta.getLabel()) == null) {
            label = "";
        }
        SpannableString spannableString = new SpannableString(androidx.camera.core.impl.b.o(str, " ", label));
        if (contentCta != null && (label2 = contentCta.getLabel()) != null) {
            SpannableStringExtKt.a(spannableString, label2, null, new h(marketplaceSwitchListener, 1));
        }
        TextView textView = epoxyItemProductListOptionsMarketplaceLegacyBinding.y;
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        SwitchMaterial switchMaterial = epoxyItemProductListOptionsMarketplaceLegacyBinding.C;
        switchMaterial.setOnCheckedChangeListener(null);
        switchMaterial.setChecked(marketplaceSwitch.f5381a.g);
        switchMaterial.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: au.com.woolworths.feature.product.list.legacy.u
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ProductListOptionsController.buildMarketplaceSwitch$lambda$16$lambda$15$lambda$14$lambda$13$lambda$12(this.f5375a, compoundButton, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildMarketplaceSwitch$lambda$16$lambda$15$lambda$14$lambda$13$lambda$12(ProductListOptionsController productListOptionsController, CompoundButton compoundButton, boolean z) {
        Intrinsics.h(compoundButton, "<unused var>");
        productListOptionsController.marketplaceSwitchListener.j(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$4$lambda$1$lambda$0(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$4$lambda$3$lambda$2(int i, int i2, int i3) {
        return i;
    }

    private final void buildSortByItemSection(ProductListOptionsItem.SortOptionsSection sortOptionsSection) {
        for (ProductListOptionsSortOptionItem productListOptionsSortOptionItem : sortOptionsSection.f5383a) {
            if (productListOptionsSortOptionItem instanceof ProductListOptionsSortOptionItem.SortOptionItem) {
                ItemProductListOptionsSortLegacyBindingModel_ itemProductListOptionsSortLegacyBindingModel_ = new ItemProductListOptionsSortLegacyBindingModel_();
                SortOption sortOption = ((ProductListOptionsSortOptionItem.SortOptionItem) productListOptionsSortOptionItem).f5384a;
                itemProductListOptionsSortLegacyBindingModel_.M(sortOption.d);
                itemProductListOptionsSortLegacyBindingModel_.t();
                itemProductListOptionsSortLegacyBindingModel_.n = sortOption;
                SortOptionsClickListener sortOptionsClickListener = this.sortOptionsClickListener;
                itemProductListOptionsSortLegacyBindingModel_.t();
                itemProductListOptionsSortLegacyBindingModel_.o = sortOptionsClickListener;
                add(itemProductListOptionsSortLegacyBindingModel_);
            } else {
                if (!(productListOptionsSortOptionItem instanceof ProductListOptionsSortOptionItem.SortOptionsToggleItem)) {
                    throw new NoWhenBranchMatchedException();
                }
                ItemProductListOptionsSortExpandLegacyBindingModel_ itemProductListOptionsSortExpandLegacyBindingModel_ = new ItemProductListOptionsSortExpandLegacyBindingModel_();
                itemProductListOptionsSortExpandLegacyBindingModel_.M();
                Integer numValueOf = Integer.valueOf(((ProductListOptionsSortOptionItem.SortOptionsToggleItem) productListOptionsSortOptionItem).f5385a);
                itemProductListOptionsSortExpandLegacyBindingModel_.t();
                itemProductListOptionsSortExpandLegacyBindingModel_.n = numValueOf;
                SortOptionsClickListener sortOptionsClickListener2 = this.sortOptionsClickListener;
                itemProductListOptionsSortExpandLegacyBindingModel_.t();
                itemProductListOptionsSortExpandLegacyBindingModel_.o = sortOptionsClickListener2;
                add(itemProductListOptionsSortExpandLegacyBindingModel_);
            }
        }
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@NotNull List<? extends ProductListOptionsItem> data) {
        Intrinsics.h(data, "data");
        int i = 0;
        for (Object obj : data) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            ProductListOptionsItem productListOptionsItem = (ProductListOptionsItem) obj;
            if (productListOptionsItem instanceof ProductListOptionsItem.Header) {
                ItemProductListOptionsHeaderLegacyBindingModel_ itemProductListOptionsHeaderLegacyBindingModel_ = new ItemProductListOptionsHeaderLegacyBindingModel_();
                int i3 = ((ProductListOptionsItem.Header) productListOptionsItem).f5380a;
                itemProductListOptionsHeaderLegacyBindingModel_.r(Integer.valueOf(i3));
                Integer numValueOf = Integer.valueOf(i3);
                itemProductListOptionsHeaderLegacyBindingModel_.t();
                itemProductListOptionsHeaderLegacyBindingModel_.n = numValueOf;
                itemProductListOptionsHeaderLegacyBindingModel_.l = new k(7);
                add(itemProductListOptionsHeaderLegacyBindingModel_);
            } else if (productListOptionsItem instanceof ProductListOptionsItem.FilterOptionItem) {
                ItemProductListOptionsFilterLegacyBindingModel_ itemProductListOptionsFilterLegacyBindingModel_ = new ItemProductListOptionsFilterLegacyBindingModel_();
                ProductListOptionsItem.FilterOptionItem filterOptionItem = (ProductListOptionsItem.FilterOptionItem) productListOptionsItem;
                itemProductListOptionsFilterLegacyBindingModel_.M(filterOptionItem.f5379a);
                itemProductListOptionsFilterLegacyBindingModel_.t();
                itemProductListOptionsFilterLegacyBindingModel_.n = filterOptionItem;
                FilterOptionsClickListener filterOptionsClickListener = this.filterOptionsClickListener;
                itemProductListOptionsFilterLegacyBindingModel_.t();
                itemProductListOptionsFilterLegacyBindingModel_.o = filterOptionsClickListener;
                itemProductListOptionsFilterLegacyBindingModel_.l = new k(8);
                add(itemProductListOptionsFilterLegacyBindingModel_);
            } else if (productListOptionsItem instanceof ProductListOptionsItem.SortOptionsInsetBanner) {
                final ProductListOptionsItem.SortOptionsInsetBanner sortOptionsInsetBanner = (ProductListOptionsItem.SortOptionsInsetBanner) productListOptionsItem;
                ComposeInteropKt.a(this, YU.a.d(i, "sort_option_inset_banner_"), new Object[]{data}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListOptionsController$buildModels$1$3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Composer composer = (Composer) obj2;
                        if ((((Number) obj3).intValue() & 3) == 2 && composer.c()) {
                            composer.j();
                        } else {
                            final ProductListOptionsItem.SortOptionsInsetBanner sortOptionsInsetBanner2 = sortOptionsInsetBanner;
                            ThemeKt.b(6, composer, ComposableLambdaKt.c(-1789485263, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListOptionsController$buildModels$1$3.1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    Composer composer2 = (Composer) obj4;
                                    if ((((Number) obj5).intValue() & 3) == 2 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        InsetBannerData insetBannerData = sortOptionsInsetBanner2.f5382a;
                                        composer2.o(1849434622);
                                        Object objG = composer2.G();
                                        if (objG == Composer.Companion.f1624a) {
                                            objG = new au.com.woolworths.feature.product.list.compose.filter.a(21);
                                            composer2.A(objG);
                                        }
                                        composer2.l();
                                        InsetBannerUiKt.b(insetBannerData, null, false, (Function1) objG, composer2, 24576, 14);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer));
                        }
                        return Unit.f24250a;
                    }
                }, true, -1241190279));
            } else if (productListOptionsItem instanceof ProductListOptionsItem.SortOptionsSection) {
                buildSortByItemSection((ProductListOptionsItem.SortOptionsSection) productListOptionsItem);
            } else if (productListOptionsItem instanceof ProductListOptionsItem.MarketplaceSwitch) {
                buildMarketplaceSwitch((ProductListOptionsItem.MarketplaceSwitch) productListOptionsItem);
            } else if (productListOptionsItem instanceof ProductListOptionsItem.DisplayMode) {
                buildDisplayModeSection((ProductListOptionsItem.DisplayMode) productListOptionsItem);
            } else {
                if (!(productListOptionsItem instanceof ProductListOptionsItem.FilterCard)) {
                    throw new NoWhenBranchMatchedException();
                }
                buildFilterCard((ProductListOptionsItem.FilterCard) productListOptionsItem);
            }
            i = i2;
        }
    }
}
