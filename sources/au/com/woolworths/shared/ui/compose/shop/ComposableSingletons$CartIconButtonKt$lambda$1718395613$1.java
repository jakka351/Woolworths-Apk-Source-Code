package au.com.woolworths.shared.ui.compose.shop;

import androidx.compose.runtime.Composer;
import au.com.woolworths.android.onesite.deeplink.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shared.ui.compose.shop.ComposableSingletons$CartIconButtonKt$lambda$-1718395613$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$CartIconButtonKt$lambda$1718395613$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$CartIconButtonKt$lambda$1718395613$1 d = new ComposableSingletons$CartIconButtonKt$lambda$1718395613$1();

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
            CartIconButtonKt.a(1, (Function0) objG, null, 0L, composer, 54, 12);
        }
        return Unit.f24250a;
    }
}
