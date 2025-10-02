package au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.deeplink.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.ComposableSingletons$LocationFoundCardKt$lambda$-7671069$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$LocationFoundCardKt$lambda$7671069$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            LocationFoundCardKt.a(54, composer, SizeKt.u(SizeKt.g(PaddingKt.f(Modifier.Companion.d, 16), 80), DilithiumEngine.DilithiumPolyT1PackedBytes), (Function0) objG);
        }
        return Unit.f24250a;
    }
}
