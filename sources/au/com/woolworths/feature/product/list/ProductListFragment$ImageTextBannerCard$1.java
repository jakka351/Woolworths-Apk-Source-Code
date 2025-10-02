package au.com.woolworths.feature.product.list;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.shop.banners.imagetextbanner.ImageTextBannerUiKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ProductListFragment$ImageTextBannerCard$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        ImageTextBannerUiKt.a(null, null, ProductListFragment.u, composer, KyberEngine.KyberPolyBytes, 2);
        throw null;
    }
}
