package au.com.woolworths.foundation.rewards.common.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.foundation.rewards.common.ui.ComposableSingletons$OfferStatusBadgeKt$lambda$-1648961273$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$OfferStatusBadgeKt$lambda$1648961273$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            OfferStatusBadgeKt.a("Boosted", true, SizeKt.e(PaddingKt.f(Modifier.Companion.d, 8), 1.0f), composer, 438);
        }
        return Unit.f24250a;
    }
}
