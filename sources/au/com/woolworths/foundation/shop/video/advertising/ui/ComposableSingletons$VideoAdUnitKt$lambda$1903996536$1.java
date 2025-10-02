package au.com.woolworths.foundation.shop.video.advertising.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdBottomSheet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$VideoAdUnitKt$lambda$1903996536$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            VideoAdBottomSheet videoAdBottomSheet = new VideoAdBottomSheet("", "", null, "Terms and Conditions", null);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.foundation.shop.olive.voice.ui.search.a(8);
                composer.A(objG);
            }
            composer.l();
            VideoAdUnitKt.a(videoAdBottomSheet, (Function1) objG, null, composer, 48, 4);
        }
        return Unit.f24250a;
    }
}
