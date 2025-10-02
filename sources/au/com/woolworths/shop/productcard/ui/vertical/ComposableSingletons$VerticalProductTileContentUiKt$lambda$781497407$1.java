package au.com.woolworths.shop.productcard.ui.vertical;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import au.com.woolworths.shop.productcard.data.MarketplaceInfo;
import au.com.woolworths.shop.productcard.data.ProductPriceInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.productcard.ui.vertical.ComposableSingletons$VerticalProductTileContentUiKt$lambda$-781497407$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$VerticalProductTileContentUiKt$lambda$781497407$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            VerticalProductTileContentUiKt.a(1772934, KyberEngine.KyberPolyBytes, composer, SizeKt.u(Modifier.Companion.d, 280), new MarketplaceInfo("", new TextWithAltData("Marketplace partner", "Marketplace partner alternative text")), new ProductPriceInfo("", 55, "/4kg", CollectionsKt.Q(new TextWithAltData("4/5kg", "")), new TextWithAltData("$12.50", "Was $12.50"), new TextWithAltData("$5.50", "Save $5.50"), null), "This is the article name it can be quite long and run over a four lines like this example of article name", "", "", ComposableSingletons$VerticalProductTileContentUiKt.b);
        }
        return Unit.f24250a;
    }
}
