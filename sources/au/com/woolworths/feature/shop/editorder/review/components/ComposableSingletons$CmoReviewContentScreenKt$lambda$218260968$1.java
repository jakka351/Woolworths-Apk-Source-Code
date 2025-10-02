package au.com.woolworths.feature.shop.editorder.review.components;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.shop.editorder.review.components.ComposableSingletons$CmoReviewContentScreenKt$lambda$-218260968$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$CmoReviewContentScreenKt$lambda$218260968$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SurfaceKt.b(PaddingKt.f(Modifier.Companion.d, 16), null, 0L, 0L, null, null, ComposableSingletons$CmoReviewContentScreenKt.f7118a, composer, 62);
        }
        return Unit.f24250a;
    }
}
