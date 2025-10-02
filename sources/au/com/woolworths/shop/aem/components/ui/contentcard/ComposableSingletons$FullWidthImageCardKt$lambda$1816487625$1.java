package au.com.woolworths.shop.aem.components.ui.contentcard;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthImageCardData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$FullWidthImageCardKt$lambda$1816487625$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            float f = 16;
            FullWidthImageCardKt.a(new FullWidthImageCardData(null, "", "", "This is a full width image card title that goes into second line"), PaddingKt.g(SizeKt.e(Modifier.Companion.d, 1.0f), f, f), composer, 48);
        }
        return Unit.f24250a;
    }
}
