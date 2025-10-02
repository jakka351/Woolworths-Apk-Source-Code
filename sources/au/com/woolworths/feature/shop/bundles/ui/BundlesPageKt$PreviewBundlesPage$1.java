package au.com.woolworths.feature.shop.bundles.ui;

import androidx.compose.runtime.Composer;
import androidx.paging.PageEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class BundlesPageKt$PreviewBundlesPage$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        composer.o(1849434622);
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            objG = new au.com.woolworths.feature.shared.instore.wifi.ui.c(22);
            composer.A(objG);
        }
        composer.l();
        Intrinsics.h(null, "data");
        new PageEvent.StaticList(null);
        throw null;
    }
}
