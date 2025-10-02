package au.com.woolworths.feature.shop.marketplace.ui.personalised;

import androidx.compose.runtime.Composer;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.shop.marketplace.ui.personalised.ComposableSingletons$MarketplaceProductCarouselUiKt$lambda$-595501364$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$MarketplaceProductCarouselUiKt$lambda$595501364$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$MarketplaceProductCarouselUiKt$lambda$595501364$1 d = new ComposableSingletons$MarketplaceProductCarouselUiKt$lambda$595501364$1();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/marketplace/ui/personalised/ComposableSingletons$MarketplaceProductCarouselUiKt$lambda$-595501364$1$1", "Lau/com/woolworths/product/tile/ProductClickListener;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.shop.marketplace.ui.personalised.ComposableSingletons$MarketplaceProductCarouselUiKt$lambda$-595501364$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements ProductClickListener {
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ArrayList arrayList = MarketplaceProductCarouselUiKt.b;
            ProductCardConfig productCardConfig = new ProductCardConfig(false, true, false, false, false, false, null, 124, null);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            MarketplaceProductCarouselUiKt.a(productCardConfig, "Weekly Specials", null, null, arrayList, (Function0) objG, anonymousClass1, true, composer, ProductCardConfig.$stable | 12783024);
        }
        return Unit.f24250a;
    }
}
