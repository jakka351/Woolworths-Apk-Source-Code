package au.com.woolworths.feature.shop.catalogue.storeselector;

import android.text.SpannableStringBuilder;
import android.text.style.TtsSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueStoreBinding;
import au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreInfo;
import com.woolworths.R;
import com.xwray.groupie.databinding.BindableItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/storeselector/CatalogueStoreInfoItem;", "Lcom/xwray/groupie/databinding/BindableItem;", "Lau/com/woolworths/feature/shop/catalogue/databinding/ItemCatalogueStoreBinding;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CatalogueStoreInfoItem extends BindableItem<ItemCatalogueStoreBinding> {
    public final CatalogueStoreInfo g;
    public final CatalogueStoreSelectorViewModel h;

    public CatalogueStoreInfoItem(CatalogueStoreInfo catalogueStore, CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel) {
        Intrinsics.h(catalogueStore, "catalogueStore");
        Intrinsics.h(catalogueStoreSelectorViewModel, "catalogueStoreSelectorViewModel");
        this.g = catalogueStore;
        this.h = catalogueStoreSelectorViewModel;
    }

    @Override // com.xwray.groupie.Item
    public final int h() {
        return R.layout.item_catalogue_store;
    }

    @Override // com.xwray.groupie.databinding.BindableItem
    public final void i(ViewDataBinding viewDataBinding) {
        ItemCatalogueStoreBinding viewBinding = (ItemCatalogueStoreBinding) viewDataBinding;
        Intrinsics.h(viewBinding, "viewBinding");
        CatalogueStoreInfo catalogueStoreInfo = this.g;
        viewBinding.L(catalogueStoreInfo.getDisplayName());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TtsSpan ttsSpanBuild = new TtsSpan.DigitsBuilder(catalogueStoreInfo.getPostCode()).build();
        Intrinsics.g(ttsSpanBuild, "build(...)");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) catalogueStoreInfo.getPostCode());
        spannableStringBuilder.setSpan(ttsSpanBuild, length, spannableStringBuilder.length(), 17);
        viewBinding.M(spannableStringBuilder);
        viewBinding.N(catalogueStoreInfo);
        viewBinding.O(this.h);
        viewBinding.l();
    }
}
