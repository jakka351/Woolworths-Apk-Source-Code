package au.com.woolworths.feature.shop.instore.navigation.featurehighlight;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.shop.instore.navigation.featurehighlight.ComposableSingletons$MapFeatureHighlightKt$lambda$-193471542$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$MapFeatureHighlightKt$lambda$193471542$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$MapFeatureHighlightKt$lambda$193471542$1 d = new ComposableSingletons$MapFeatureHighlightKt$lambda$193471542$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            IconKt.a(PainterResources_androidKt.a(R.drawable.ic_close, 0, composer), null, PaddingKt.f(Modifier.Companion.d, 2), FeatureHighlightColor.d, composer, 3504, 0);
        }
        return Unit.f24250a;
    }
}
