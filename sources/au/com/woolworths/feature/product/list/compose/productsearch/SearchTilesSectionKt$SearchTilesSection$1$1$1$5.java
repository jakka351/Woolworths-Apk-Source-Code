package au.com.woolworths.feature.product.list.compose.productsearch;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.StringResources_androidKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SearchTilesSectionKt$SearchTilesSection$1$1$1$5 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SearchTilesSectionKt.a(CollectionsKt.R(StringResources_androidKt.c(composer, R.string.olive_voice_sample_description_vps), StringResources_androidKt.c(composer, R.string.olive_voice_sample_description_alt_vps)), null, true, composer, KyberEngine.KyberPolyBytes, 2);
        }
        return Unit.f24250a;
    }
}
