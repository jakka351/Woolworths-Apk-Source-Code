package au.com.woolworths.feature.shop.brandedshop;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.shop.brandedshop.data.BrandedShopErrorData;
import au.com.woolworths.feature.shop.brandedshop.data.BrandedShopHeaderData;
import au.com.woolworths.feature.shop.brandedshop.data.BrandedShopProductGridConfig;
import au.com.woolworths.feature.shop.brandedshop.data.SnackbarContent;
import au.com.woolworths.shop.aem.components.model.bottomsheet.GenericPageBottomSheetItem;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/ViewState;", "", "Companion", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ViewState {
    public static final ViewState j = new ViewState(null, false, EmptyMap.d, null, null, null, null, null, null);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f6676a;
    public final boolean b;
    public final Map c;
    public final BrandedShopProductGridConfig d;
    public final BrandedShopHeaderData e;
    public final List f;
    public final SnackbarContent g;
    public final GenericPageBottomSheetItem h;
    public final BrandedShopErrorData i;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/ViewState$Companion;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ViewState(Integer num, boolean z, Map map, BrandedShopProductGridConfig brandedShopProductGridConfig, BrandedShopHeaderData brandedShopHeaderData, List list, SnackbarContent snackbarContent, GenericPageBottomSheetItem genericPageBottomSheetItem, BrandedShopErrorData brandedShopErrorData) {
        this.f6676a = num;
        this.b = z;
        this.c = map;
        this.d = brandedShopProductGridConfig;
        this.e = brandedShopHeaderData;
        this.f = list;
        this.g = snackbarContent;
        this.h = genericPageBottomSheetItem;
        this.i = brandedShopErrorData;
    }

    public static ViewState a(ViewState viewState, Integer num, boolean z, Map map, BrandedShopProductGridConfig brandedShopProductGridConfig, BrandedShopHeaderData brandedShopHeaderData, List list, SnackbarContent snackbarContent, GenericPageBottomSheetItem genericPageBottomSheetItem, BrandedShopErrorData brandedShopErrorData, int i) {
        if ((i & 1) != 0) {
            num = viewState.f6676a;
        }
        Integer num2 = num;
        if ((i & 2) != 0) {
            z = viewState.b;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            map = viewState.c;
        }
        Map selectedTabs = map;
        if ((i & 8) != 0) {
            brandedShopProductGridConfig = viewState.d;
        }
        BrandedShopProductGridConfig brandedShopProductGridConfig2 = brandedShopProductGridConfig;
        if ((i & 16) != 0) {
            brandedShopHeaderData = viewState.e;
        }
        BrandedShopHeaderData brandedShopHeaderData2 = brandedShopHeaderData;
        List list2 = (i & 32) != 0 ? viewState.f : list;
        SnackbarContent snackbarContent2 = (i & 64) != 0 ? viewState.g : snackbarContent;
        GenericPageBottomSheetItem genericPageBottomSheetItem2 = (i & 128) != 0 ? viewState.h : genericPageBottomSheetItem;
        BrandedShopErrorData brandedShopErrorData2 = (i & 256) != 0 ? viewState.i : brandedShopErrorData;
        viewState.getClass();
        Intrinsics.h(selectedTabs, "selectedTabs");
        return new ViewState(num2, z2, selectedTabs, brandedShopProductGridConfig2, brandedShopHeaderData2, list2, snackbarContent2, genericPageBottomSheetItem2, brandedShopErrorData2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewState)) {
            return false;
        }
        ViewState viewState = (ViewState) obj;
        return Intrinsics.c(this.f6676a, viewState.f6676a) && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && Intrinsics.c(this.e, viewState.e) && Intrinsics.c(this.f, viewState.f) && Intrinsics.c(this.g, viewState.g) && Intrinsics.c(this.h, viewState.h) && Intrinsics.c(this.i, viewState.i);
    }

    public final int hashCode() {
        Integer num = this.f6676a;
        int iD = d.d(this.c, b.e((num == null ? 0 : num.hashCode()) * 31, 31, this.b), 31);
        BrandedShopProductGridConfig brandedShopProductGridConfig = this.d;
        int iHashCode = (iD + (brandedShopProductGridConfig == null ? 0 : brandedShopProductGridConfig.hashCode())) * 31;
        BrandedShopHeaderData brandedShopHeaderData = this.e;
        int iHashCode2 = (iHashCode + (brandedShopHeaderData == null ? 0 : brandedShopHeaderData.hashCode())) * 31;
        List list = this.f;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        SnackbarContent snackbarContent = this.g;
        int iHashCode4 = (iHashCode3 + (snackbarContent == null ? 0 : snackbarContent.hashCode())) * 31;
        GenericPageBottomSheetItem genericPageBottomSheetItem = this.h;
        int iHashCode5 = (iHashCode4 + (genericPageBottomSheetItem == null ? 0 : genericPageBottomSheetItem.hashCode())) * 31;
        BrandedShopErrorData brandedShopErrorData = this.i;
        return iHashCode5 + (brandedShopErrorData != null ? brandedShopErrorData.hashCode() : 0);
    }

    public final String toString() {
        return "ViewState(cartItemCount=" + this.f6676a + ", contentLoading=" + this.b + ", selectedTabs=" + this.c + ", brandedShopProductGridConfig=" + this.d + ", headerData=" + this.e + ", content=" + this.f + ", snackbarContent=" + this.g + ", bottomSheetData=" + this.h + ", brandedShopErrorData=" + this.i + ")";
    }
}
