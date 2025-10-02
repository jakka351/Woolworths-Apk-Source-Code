package au.com.woolworths.feature.shared.instore.wifi.ui;

import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.core.graphics.Insets;
import au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountScreenKt;
import au.com.woolworths.feature.shop.account.ui.details.components.AccountDetailsOtherScreenKt;
import au.com.woolworths.feature.shop.ask.olive.ui.AskOliveActivity;
import au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopBlankSlateKt;
import au.com.woolworths.feature.shop.bundles.ui.BundlesLoadingSkeletonUiKt;
import au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageKt;
import au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsActivity;
import au.com.woolworths.feature.shop.countryselector.ui.LoadingScreenKt;
import au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt;
import au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartScreenKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt$EmptyCallbacks$1;
import au.com.woolworths.feature.shop.login.LoginFullPageErrorState;
import au.com.woolworths.feature.shop.login.guest.ui.fragment.GuestLoginFragment;
import dev.chrisbanes.snapper.SnapOffsets;
import dev.chrisbanes.snapper.SnapperLayoutInfo;
import dev.chrisbanes.snapper.SnapperLayoutItemInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;

    public /* synthetic */ b(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue;
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                ((Boolean) obj).booleanValue();
                Intrinsics.h((String) obj2, "<unused var>");
                return unit;
            case 1:
                ((Boolean) obj).booleanValue();
                Intrinsics.h((String) obj2, "<unused var>");
                return unit;
            case 2:
                ((Boolean) obj).booleanValue();
                Intrinsics.h((String) obj2, "<unused var>");
                return unit;
            case 3:
                ((Boolean) obj).booleanValue();
                Intrinsics.h((String) obj2, "<unused var>");
                return unit;
            case 4:
                ((Integer) obj2).getClass();
                InstoreWifiScreenKt.h((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 5:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                return unit;
            case 6:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                return unit;
            case 7:
                ((Integer) obj2).getClass();
                JoinInStoreWifiScreenKt.c((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 8:
                ((Integer) obj2).getClass();
                DeleteAccountScreenKt.c((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 9:
                ((Integer) obj2).getClass();
                AccountDetailsOtherScreenKt.b((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 10:
                ViewGroup.MarginLayoutParams applyInsets = (ViewGroup.MarginLayoutParams) obj;
                Insets it = (Insets) obj2;
                int i2 = AskOliveActivity.I;
                Intrinsics.h(applyInsets, "$this$applyInsets");
                Intrinsics.h(it, "it");
                applyInsets.bottomMargin = it.d;
                return unit;
            case 11:
                ((Integer) obj2).getClass();
                BrandedShopBlankSlateKt.a((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 12:
                ((Integer) obj2).getClass();
                BundlesLoadingSkeletonUiKt.c((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 13:
                ((Integer) obj2).getClass();
                BundlesLoadingSkeletonUiKt.b((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 14:
                ((Integer) obj2).getClass();
                BundlesLoadingSkeletonUiKt.a((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 15:
                ((Integer) obj2).getClass();
                PromotionPageKt.e((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 16:
                ViewGroup.MarginLayoutParams applyInsets2 = (ViewGroup.MarginLayoutParams) obj;
                Insets it2 = (Insets) obj2;
                int i3 = CatalogueDetailsActivity.B;
                Intrinsics.h(applyInsets2, "$this$applyInsets");
                Intrinsics.h(it2, "it");
                applyInsets2.bottomMargin = it2.d;
                return unit;
            case 17:
                ((Integer) obj2).getClass();
                LoadingScreenKt.a((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 18:
                SnapperLayoutInfo layoutInfo = (SnapperLayoutInfo) obj;
                SnapperLayoutItemInfo layoutItemInfo = (SnapperLayoutItemInfo) obj2;
                Intrinsics.h(layoutInfo, "layoutInfo");
                Intrinsics.h(layoutItemInfo, "layoutItemInfo");
                iIntValue = ((Number) SnapOffsets.a().invoke(layoutInfo, layoutItemInfo)).intValue();
                break;
            case 19:
                ((Integer) obj2).getClass();
                InboxScreenKt.f((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 20:
                ((Integer) obj2).getClass();
                InboxScreenKt.e((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 21:
                ((Integer) obj2).getClass();
                InstoreCartScreenKt.j((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 22:
                ((Integer) obj2).getClass();
                InstoreCartScreenKt.k((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 23:
                SnapperLayoutInfo layoutInfo2 = (SnapperLayoutInfo) obj;
                SnapperLayoutItemInfo layoutItemInfo2 = (SnapperLayoutItemInfo) obj2;
                InstoreMapScreenKt$EmptyCallbacks$1 instoreMapScreenKt$EmptyCallbacks$1 = InstoreMapScreenKt.f7385a;
                Intrinsics.h(layoutInfo2, "layoutInfo");
                Intrinsics.h(layoutItemInfo2, "layoutItemInfo");
                iIntValue = ((Number) SnapOffsets.a().invoke(layoutInfo2, layoutItemInfo2)).intValue();
                break;
            case 24:
                ViewGroup.MarginLayoutParams applyInsets3 = (ViewGroup.MarginLayoutParams) obj;
                Insets it3 = (Insets) obj2;
                KProperty[] kPropertyArr = GuestLoginFragment.j;
                Intrinsics.h(applyInsets3, "$this$applyInsets");
                Intrinsics.h(it3, "it");
                applyInsets3.bottomMargin = it3.d;
                return unit;
            case 25:
                Intrinsics.h((LoginFullPageErrorState) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                return unit;
            case 26:
                Intrinsics.h((LoginFullPageErrorState) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                return unit;
            case 27:
                Intrinsics.h((String) obj, "<unused var>");
                return unit;
            case 28:
                Intrinsics.h((String) obj, "<unused var>");
                return unit;
            default:
                Intrinsics.h((String) obj, "<unused var>");
                return unit;
        }
        return Integer.valueOf(iIntValue);
    }

    public /* synthetic */ b(int i, int i2) {
        this.d = i2;
    }
}
