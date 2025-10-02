package au.com.woolworths.feature.shop.trafficdrivers.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.feature.shop.trafficdrivers.data.TrafficDriverItem;
import au.com.woolworths.product.models.TagLabel;
import au.com.woolworths.product.models.TagStyle;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$TrafficDriverUiKt$lambda$839157906$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            TrafficDriverItem trafficDriverItem = new TrafficDriverItem("Coke", "A product of CocaCola company", "", EmptyList.d, new ActionData("", ActionType.e, null, null), new TagLabel("Featured", TagStyle.FEATURED), null);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            TrafficDriverUiKt.a(trafficDriverItem, null, (Function0) objG, composer, KyberEngine.KyberPolyBytes);
        }
        return Unit.f24250a;
    }
}
