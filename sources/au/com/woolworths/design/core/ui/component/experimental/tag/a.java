package au.com.woolworths.design.core.ui.component.experimental.tag;

import androidx.compose.material.ScaffoldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import au.com.woolworths.design.core.ui.component.stable.button.DestructiveButtonKt;
import au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayContract;
import au.com.woolworths.feature.rewards.card.overlay.ui.RewardsCardOverlayScreenKt;
import au.com.woolworths.feature.shop.homepage.data.FulfilmentStatusBannerData;
import au.com.woolworths.feature.shop.homepage.data.OrderCardData;
import au.com.woolworths.feature.shop.homepage.data.RewardsBalanceCardData;
import au.com.woolworths.feature.shop.homepage.presentation.order.OrderCardUIKt;
import au.com.woolworths.feature.shop.homepage.presentation.rewards.RewardsBalanceCardUiKt;
import au.com.woolworths.feature.shop.modeselector.ui.StoreDetailsSectionKt;
import au.com.woolworths.feature.shop.myorders.details.models.OrderCollectionParkingDetails;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderCollectionDetailsItemKt;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionHeaderIconType;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionHeaderSelectionType;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionHeaderTileKt;
import au.com.woolworths.shop.cart.domain.model.ProductReviewCard;
import au.com.woolworths.shop.cart.ui.productreview.RestrictedProductItemKt;
import au.com.woolworths.shop.checkout.ui.summary.storecredit.StoreCreditListUiKt;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ a(DownloadableAsset downloadableAsset, String str, String str2, ButtonApiData buttonApiData, Function1 function1, Modifier modifier, int i, int i2) {
        this.d = 5;
        this.j = downloadableAsset;
        this.e = str;
        this.k = str2;
        this.g = buttonApiData;
        this.l = function1;
        this.f = modifier;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                TagKt.b((String) this.e, (TagSpec.Style) this.j, this.f, (TagSpec.Size) this.k, (ImageVector) this.g, (TagSpec.IconPosition) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            case 1:
                ((Integer) obj2).getClass();
                DestructiveButtonKt.a((String) this.e, (Function0) this.j, this.f, (ImageVector) this.g, (ImageVector) this.k, (ButtonSpec.Size) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            case 2:
                ((Integer) obj2).getClass();
                RewardsCardOverlayScreenKt.c((RewardsCardOverlayContract.ViewState) this.e, (Function1) this.j, (Function0) this.k, this.f, (ScaffoldState) this.g, (Function0) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            case 3:
                ((Integer) obj2).getClass();
                OrderCardUIKt.c((OrderCardData) this.e, (Function0) this.j, (Function0) this.k, (Function0) this.g, this.f, (FulfilmentStatusBannerData) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            case 4:
                ((Integer) obj2).getClass();
                RewardsBalanceCardUiKt.c((RewardsBalanceCardData) this.e, (Function0) this.j, (Function0) this.k, (Function0) this.g, (Function0) this.l, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            case 5:
                ((Integer) obj2).getClass();
                StoreDetailsSectionKt.a((DownloadableAsset) this.j, (String) this.e, (String) this.k, (ButtonApiData) this.g, (Function1) this.l, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            case 6:
                ((Integer) obj2).getClass();
                OrderCollectionDetailsItemKt.a((String) this.e, (String) this.j, (String) this.k, this.f, (OrderCollectionParkingDetails) this.g, (Function0) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            case 7:
                ((Integer) obj2).getClass();
                SectionOptionHeaderTileKt.a((SectionOptionHeaderSelectionType) this.j, (SectionOptionHeaderIconType) this.k, (String) this.e, (String) this.g, this.f, (Function0) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            case 8:
                ((Integer) obj2).getClass();
                RestrictedProductItemKt.a((ProductReviewCard) this.e, (Function0) this.j, (Function1) this.k, (Function1) this.g, (Function1) this.l, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                StoreCreditListUiKt.a((String) this.e, (String) this.j, (List) this.k, (Function1) this.g, (Function1) this.l, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(OrderCardData orderCardData, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, FulfilmentStatusBannerData fulfilmentStatusBannerData, int i, int i2) {
        this.d = 3;
        this.e = orderCardData;
        this.j = function0;
        this.k = function02;
        this.g = function03;
        this.f = modifier;
        this.l = fulfilmentStatusBannerData;
        this.h = i;
        this.i = i2;
    }

    public /* synthetic */ a(SectionOptionHeaderSelectionType sectionOptionHeaderSelectionType, SectionOptionHeaderIconType sectionOptionHeaderIconType, String str, String str2, Modifier modifier, Function0 function0, int i, int i2) {
        this.d = 7;
        this.j = sectionOptionHeaderSelectionType;
        this.k = sectionOptionHeaderIconType;
        this.e = str;
        this.g = str2;
        this.f = modifier;
        this.l = function0;
        this.h = i;
        this.i = i2;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Modifier modifier, Object obj4, Function0 function0, int i, int i2, int i3) {
        this.d = i3;
        this.e = obj;
        this.j = obj2;
        this.k = obj3;
        this.f = modifier;
        this.g = obj4;
        this.l = function0;
        this.h = i;
        this.i = i2;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Function function, Function function2, Modifier modifier, int i, int i2, int i3) {
        this.d = i3;
        this.e = obj;
        this.j = obj2;
        this.k = obj3;
        this.g = function;
        this.l = function2;
        this.f = modifier;
        this.h = i;
        this.i = i2;
    }

    public /* synthetic */ a(String str, TagSpec.Style style, Modifier modifier, TagSpec.Size size, ImageVector imageVector, TagSpec.IconPosition iconPosition, int i, int i2) {
        this.d = 0;
        this.e = str;
        this.j = style;
        this.f = modifier;
        this.k = size;
        this.g = imageVector;
        this.l = iconPosition;
        this.h = i;
        this.i = i2;
    }

    public /* synthetic */ a(String str, Function0 function0, Modifier modifier, ImageVector imageVector, ImageVector imageVector2, ButtonSpec.Size size, int i, int i2) {
        this.d = 1;
        this.e = str;
        this.j = function0;
        this.f = modifier;
        this.g = imageVector;
        this.k = imageVector2;
        this.l = size;
        this.h = i;
        this.i = i2;
    }
}
