package au.com.woolworths.feature.shop.marketplace.ui.facet;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$FacetSearchBarKt$lambda$502065935$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$FacetSearchBarKt$lambda$502065935$1 d = new ComposableSingletons$FacetSearchBarKt$lambda$502065935$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            IconKt.b(SearchKt.a(), StringResources_androidKt.c(composer, R.string.search), PaddingKt.j(Modifier.Companion.d, 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), ToneColors.d, composer, KyberEngine.KyberPolyBytes, 0);
        }
        return Unit.f24250a;
    }
}
