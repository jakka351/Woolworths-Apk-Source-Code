package au.com.woolworths.design.core.ui.component.stable.button;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.media3.exoplayer.ExoPlayer;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import au.com.woolworths.feature.shared.instore.wifi.ui.JoinInStoreWifiScreenKt;
import au.com.woolworths.feature.shop.brandedshop.data.BrandedShopProductGridConfig;
import au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopContentKt;
import au.com.woolworths.feature.shop.homepage.data.HomeModeSelectorContainerData;
import au.com.woolworths.feature.shop.homepage.presentation.modeselector.ModeSelectorSubHeaderKt;
import au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplaceProductCarouselUiKt;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.shop.aem.components.ui.video.VideoUiKt;
import au.com.woolworths.shop.checkout.ui.components.compose.PreferenceTextUiKt;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.TermsBottomSheetData;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.TermsModalKt;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function2 {
    public final /* synthetic */ int d = 6;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ g(ExoPlayer exoPlayer, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, boolean z, int i) {
        this.e = exoPlayer;
        this.m = function1;
        this.i = function12;
        this.f = function0;
        this.j = function02;
        this.k = function03;
        this.g = modifier;
        this.h = z;
        this.l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                TertiaryButtonKt.b((String) this.e, (String) this.m, (Function0) this.f, (Modifier) this.g, this.h, (Function2) this.i, (Function2) this.j, (ButtonSpec.Size) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.l | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                TertiaryButtonKt.c((String) this.e, (Function0) this.f, (Modifier) this.g, this.h, (Function2) this.i, (Function2) this.j, (ButtonSpec.Size) this.k, (Function2) this.m, (Composer) obj, RecomposeScopeImplKt.a(this.l | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                JoinInStoreWifiScreenKt.i((Function0) this.f, (Function0) this.g, (String) this.e, (String) this.m, (Function2) this.i, (Function2) this.j, (Function2) this.k, this.h, (Composer) obj, RecomposeScopeImplKt.a(this.l | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                BrandedShopContentKt.a((Map) this.e, (List) this.m, (Function1) this.f, (Function1) this.i, (BrandedShopProductGridConfig) this.j, (ProductClickListener) this.k, this.h, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.l | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ModeSelectorSubHeaderKt.f(this.h, (HomeModeSelectorContainerData) this.m, (Text) this.g, (Function0) this.f, (Function0) this.i, (CollectionMode) this.j, (String) this.e, (Function0) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.l | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                MarketplaceProductCarouselUiKt.a((ProductCardConfig) this.g, (String) this.e, (String) this.m, (String) this.i, (List) this.j, (Function0) this.f, (ProductClickListener) this.k, this.h, (Composer) obj, RecomposeScopeImplKt.a(this.l | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                VideoUiKt.a((ExoPlayer) this.e, (Function1) this.m, (Function1) this.i, (Function0) this.f, (Function0) this.j, (Function0) this.k, (Modifier) this.g, this.h, (Composer) obj, RecomposeScopeImplKt.a(this.l | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                PreferenceTextUiKt.b(this.h, (String) this.e, (String) this.m, (String) this.f, (String) this.g, (String) this.i, (Function1) this.j, (Function1) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.l | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                TermsModalKt.a((TermsBottomSheetData.Terms) this.e, this.h, (SheetState) this.m, (Function2) this.i, (Function1) this.j, (Function1) this.k, (Function0) this.f, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.l | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ g(ProductCardConfig productCardConfig, String str, String str2, String str3, List list, Function0 function0, ProductClickListener productClickListener, boolean z, int i) {
        this.g = productCardConfig;
        this.e = str;
        this.m = str2;
        this.i = str3;
        this.j = list;
        this.f = function0;
        this.k = productClickListener;
        this.h = z;
        this.l = i;
    }

    public /* synthetic */ g(TermsBottomSheetData.Terms terms, boolean z, SheetState sheetState, Function2 function2, Function1 function1, Function1 function12, Function0 function0, Modifier modifier, int i) {
        this.e = terms;
        this.h = z;
        this.m = sheetState;
        this.i = function2;
        this.j = function1;
        this.k = function12;
        this.f = function0;
        this.g = modifier;
        this.l = i;
    }

    public /* synthetic */ g(String str, String str2, Function0 function0, Modifier modifier, boolean z, Function2 function2, Function2 function22, ButtonSpec.Size size, int i) {
        this.e = str;
        this.m = str2;
        this.f = function0;
        this.g = modifier;
        this.h = z;
        this.i = function2;
        this.j = function22;
        this.k = size;
        this.l = i;
    }

    public /* synthetic */ g(String str, Function0 function0, Modifier modifier, boolean z, Function2 function2, Function2 function22, ButtonSpec.Size size, Function2 function23, int i) {
        this.e = str;
        this.f = function0;
        this.g = modifier;
        this.h = z;
        this.i = function2;
        this.j = function22;
        this.k = size;
        this.m = function23;
        this.l = i;
    }

    public /* synthetic */ g(Map map, List list, Function1 function1, Function1 function12, BrandedShopProductGridConfig brandedShopProductGridConfig, ProductClickListener productClickListener, boolean z, Modifier modifier, int i) {
        this.e = map;
        this.m = list;
        this.f = function1;
        this.i = function12;
        this.j = brandedShopProductGridConfig;
        this.k = productClickListener;
        this.h = z;
        this.g = modifier;
        this.l = i;
    }

    public /* synthetic */ g(Function0 function0, Function0 function02, String str, String str2, Function2 function2, Function2 function22, Function2 function23, boolean z, int i) {
        this.f = function0;
        this.g = function02;
        this.e = str;
        this.m = str2;
        this.i = function2;
        this.j = function22;
        this.k = function23;
        this.h = z;
        this.l = i;
    }

    public /* synthetic */ g(boolean z, HomeModeSelectorContainerData homeModeSelectorContainerData, Text text, Function0 function0, Function0 function02, CollectionMode collectionMode, String str, Function0 function03, int i) {
        this.h = z;
        this.m = homeModeSelectorContainerData;
        this.g = text;
        this.f = function0;
        this.i = function02;
        this.j = collectionMode;
        this.e = str;
        this.k = function03;
        this.l = i;
    }

    public /* synthetic */ g(boolean z, String str, String str2, String str3, String str4, String str5, Function1 function1, Function1 function12, int i) {
        this.h = z;
        this.e = str;
        this.m = str2;
        this.f = str3;
        this.g = str4;
        this.i = str5;
        this.j = function1;
        this.k = function12;
        this.l = i;
    }
}
