package au.com.woolworths.feature.product.list.data;

import androidx.camera.core.impl.b;
import androidx.compose.ui.state.ToggleableState;
import au.com.woolworths.feature.product.list.ui.FilterMenuItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/product/list/ui/FilterMenuItem;", "Lau/com/woolworths/feature/product/list/data/FilterMenuItemApiData;", "activeFilterCount", "", "state", "Landroidx/compose/ui/state/ToggleableState;", "ancestorId", "", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FilterMenuItemApiDataKt {
    @NotNull
    public static final FilterMenuItem toUiModel(@NotNull FilterMenuItemApiData filterMenuItemApiData, int i, @NotNull ToggleableState state, @NotNull String ancestorId) {
        Intrinsics.h(filterMenuItemApiData, "<this>");
        Intrinsics.h(state, "state");
        Intrinsics.h(ancestorId, "ancestorId");
        String key = filterMenuItemApiData.getKey();
        String title = filterMenuItemApiData.getTitle();
        String displayLabel = filterMenuItemApiData.getDisplayLabel();
        String parentKey = filterMenuItemApiData.getParentKey();
        if (parentKey == null) {
            parentKey = "";
        }
        return new FilterMenuItem(key, title, displayLabel, parentKey, filterMenuItemApiData.getHasChildren(), state, i, b.o(filterMenuItemApiData.getKey(), "_", ancestorId), b.o(filterMenuItemApiData.getParentKey(), "_", ancestorId));
    }

    public static /* synthetic */ FilterMenuItem toUiModel$default(FilterMenuItemApiData filterMenuItemApiData, int i, ToggleableState toggleableState, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return toUiModel(filterMenuItemApiData, i, toggleableState, str);
    }
}
