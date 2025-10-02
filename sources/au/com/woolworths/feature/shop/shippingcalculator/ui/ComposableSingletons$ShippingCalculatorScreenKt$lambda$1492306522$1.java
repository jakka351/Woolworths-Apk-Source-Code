package au.com.woolworths.feature.shop.shippingcalculator.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.shop.shippingcalculator.ui.ComposableSingletons$ShippingCalculatorScreenKt$lambda$-1492306522$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ShippingCalculatorScreenKt$lambda$1492306522$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ShippingCalculatorScreenKt$lambda$1492306522$1 d = new ComposableSingletons$ShippingCalculatorScreenKt$lambda$1492306522$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ShippingCalculatorScreenKt.a(StringResources_androidKt.c(composer, R.string.shipping_calculator_no_results_title), StringResources_androidKt.c(composer, R.string.shipping_calculator_no_results_description), PaddingKt.g(Modifier.Companion.d, 16, 32), composer, KyberEngine.KyberPolyBytes);
        }
        return Unit.f24250a;
    }
}
