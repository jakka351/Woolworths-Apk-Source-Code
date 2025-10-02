package au.com.woolworths.design.core.ui.component.experimental.chip;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.text.AnnotatedString;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.core.ui.component.experimental.chip.spec.ChipVariant;
import au.com.woolworths.feature.product.list.v2.ui.ProductCardListTileUiKt;
import au.com.woolworths.feature.shop.banners.broadcastbanner.BroadcastBannerKt;
import au.com.woolworths.feature.shop.myorders.details.location.RequestLocationPermissionPrimingDialogContentKt;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.product.composeui.ProductCardButtonsVerticalKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.product.ui.ProductCardButtonsState;
import au.com.woolworths.shop.aem.components.model.merchcard.MerchCardData;
import au.com.woolworths.shop.aem.components.ui.merchcard.MerchCardKt;
import com.halilibo.richtext.ui.RichTextLocalsKt;
import com.halilibo.richtext.ui.RichTextScope;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ a(ProductCard productCard, ProductClickListener productClickListener, ProductCardConfig productCardConfig, List list, Function0 function0, int i, int i2) {
        this.d = 1;
        this.h = productCard;
        this.i = productClickListener;
        this.j = productCardConfig;
        this.k = list;
        this.e = function0;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                AssistChipKt.a((String) this.h, (ImageVector) this.i, (Function0) this.e, (Modifier) this.j, (ChipVariant) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ProductCardListTileUiKt.a((ProductCard) this.h, (ProductClickListener) this.i, (ProductCardConfig) this.j, (List) this.k, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 2:
                ((Integer) obj2).getClass();
                BroadcastBannerKt.a((BroadcastBannerData) this.h, (Function1) this.i, (Function1) this.e, (Modifier) this.j, (Function1) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 3:
                ((Integer) obj2).getClass();
                RequestLocationPermissionPrimingDialogContentKt.c((String) this.h, (List) this.i, (List) this.e, (String) this.j, (Function1) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 4:
                ((Integer) obj2).getClass();
                ProductCardButtonsVerticalKt.b((ProductCard) this.i, (String) this.h, (ProductClickListener) this.e, (ProductCardButtonsState) this.k, (Modifier) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 5:
                ((Integer) obj2).getClass();
                MerchCardKt.a((MerchCardData) this.h, (Function1) this.i, (Function1) this.e, (Modifier) this.j, (SharedIntrinsicHeightState) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                RichTextLocalsKt.a((RichTextScope) this.h, (AnnotatedString) this.i, (Modifier) this.j, (Function1) this.e, (Map) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(ProductCard productCard, String str, ProductClickListener productClickListener, ProductCardButtonsState productCardButtonsState, Modifier modifier, int i, int i2) {
        this.d = 4;
        this.i = productCard;
        this.h = str;
        this.e = productClickListener;
        this.k = productCardButtonsState;
        this.j = modifier;
        this.f = i;
        this.g = i2;
    }

    public /* synthetic */ a(RichTextScope richTextScope, AnnotatedString annotatedString, Modifier modifier, Function1 function1, Map map, int i, int i2) {
        this.d = 6;
        this.h = richTextScope;
        this.i = annotatedString;
        this.j = modifier;
        this.e = function1;
        this.k = map;
        this.f = i;
        this.g = i2;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, int i3) {
        this.d = i3;
        this.h = obj;
        this.i = obj2;
        this.e = obj3;
        this.j = obj4;
        this.k = obj5;
        this.f = i;
        this.g = i2;
    }
}
