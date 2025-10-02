package au.com.woolworths.dynamic.page.ui.content;

import androidx.compose.runtime.Composer;
import au.com.woolworths.dynamic.page.data.DynamicPageFeedData;
import au.com.woolworths.dynamic.page.utils.DynamicPageStubs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$ScreenContentKt$lambda$1253477505$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            DynamicPageFeedData dynamicPageFeedData = DynamicPageStubs.DynamicPageFeedDataProvider.b;
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new androidx.navigation.compose.h(17, (byte) 0);
                composer.A(objG);
            }
            composer.l();
            ScreenContentKt.f(dynamicPageFeedData, null, (Function2) objG, composer, KyberEngine.KyberPolyBytes, 2);
        }
        return Unit.f24250a;
    }
}
