package au.com.woolworths.shared.ui.compose.price;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shared.ui.compose.price.ComposableSingletons$PriceLabelKt$lambda$-1378316716$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$PriceLabelKt$lambda$1378316716$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            PriceLabelKt.a(null, null, "5", null, null, 0L, composer, KyberEngine.KyberPolyBytes, 59);
        }
        return Unit.f24250a;
    }
}
