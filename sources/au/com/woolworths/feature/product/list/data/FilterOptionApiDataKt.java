package au.com.woolworths.feature.product.list.data;

import androidx.compose.ui.state.ToggleableState;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.feature.product.list.ui.FilterOption;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002\u001a\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/product/list/ui/FilterOption;", "Lau/com/woolworths/feature/product/list/data/FilterOptionApiData;", "activeFilterCount", "", "toFilterInsetBannerData", "Lau/com/woolworths/feature/product/list/data/FilterInsetBannerData;", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerData;", "getFilterState", "Landroidx/compose/ui/state/ToggleableState;", "filterMenuItemApiData", "Lau/com/woolworths/feature/product/list/data/FilterMenuItemApiData;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FilterOptionApiDataKt {
    private static final ToggleableState getFilterState(FilterMenuItemApiData filterMenuItemApiData) {
        return filterMenuItemApiData.isApplied() ? ToggleableState.d : ToggleableState.e;
    }

    private static final FilterInsetBannerData toFilterInsetBannerData(InsetBannerData insetBannerData) {
        return new FilterInsetBannerData(insetBannerData.getF(), insetBannerData.getE(), insetBannerData.getF(), insetBannerData.getG(), insetBannerData.getE(), null, 32, null);
    }

    @NotNull
    public static final FilterOption toUiModel(@NotNull FilterOptionApiData filterOptionApiData, int i) {
        InsetBannerData uiModel;
        Intrinsics.h(filterOptionApiData, "<this>");
        String key = filterOptionApiData.getKey();
        String headerTitle = filterOptionApiData.getHeaderTitle();
        List<FilterMenuItemApiData> filterItems = filterOptionApiData.getFilterItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(filterItems, 10));
        for (FilterMenuItemApiData filterMenuItemApiData : filterItems) {
            arrayList.add(FilterMenuItemApiDataKt.toUiModel$default(filterMenuItemApiData, 0, getFilterState(filterMenuItemApiData), filterOptionApiData.getKey(), 1, null));
        }
        InsetBannerApiData insetBannerApiData = filterOptionApiData.getInsetBannerApiData();
        return new FilterOption(key, headerTitle, arrayList, i, (insetBannerApiData == null || (uiModel = InsetBannerApiDataExtKt.toUiModel(insetBannerApiData)) == null) ? null : toFilterInsetBannerData(uiModel));
    }

    public static /* synthetic */ FilterOption toUiModel$default(FilterOptionApiData filterOptionApiData, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return toUiModel(filterOptionApiData, i);
    }
}
