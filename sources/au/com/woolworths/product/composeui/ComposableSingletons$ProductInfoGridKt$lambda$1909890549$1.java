package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.product.composeui.ComposableSingletons$ProductInfoGridKt$lambda$-1909890549$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductInfoGridKt$lambda$1909890549$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductInfoGridKt$lambda$1909890549$1 d = new ComposableSingletons$ProductInfoGridKt$lambda$1909890549$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductInfoGridKt.a(ProductCardPreviewDataKt.b(null, "Woolworths NZ Chicken 0.8-1.3kg 2-3pcs", null, "10.50 per 1kg\n$4.40 / tray (approx)", false, null, null, null, null, null, null, null, null, null, null, null, null, -134217987, 1), false, null, false, false, null, false, false, false, false, false, false, 2, false, null, false, false, null, false, composer, 48, KyberEngine.KyberPolyBytes, 520188);
        }
        return Unit.f24250a;
    }
}
