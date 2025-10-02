package au.com.woolworths.design.core.ui.component.experimental;

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

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$CardKt$lambda$1855643584$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$CardKt$lambda$1855643584$1 d = new ComposableSingletons$CardKt$lambda$1855643584$1();

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
            CardKt.b((Function0) objG, PaddingKt.f(SizeKt.q(Modifier.Companion.d, 120), 8), false, null, 0L, 0L, 0L, 0L, null, null, null, ComposableSingletons$CardKt.c, composer, 438, 2040);
        }
        return Unit.f24250a;
    }
}
