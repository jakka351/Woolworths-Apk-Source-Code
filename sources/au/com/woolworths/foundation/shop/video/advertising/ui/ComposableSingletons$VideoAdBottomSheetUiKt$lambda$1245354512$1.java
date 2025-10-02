package au.com.woolworths.foundation.shop.video.advertising.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdBottomSheet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.foundation.shop.video.advertising.ui.ComposableSingletons$VideoAdBottomSheetUiKt$lambda$-1245354512$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$VideoAdBottomSheetUiKt$lambda$1245354512$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            VideoAdBottomSheet videoAdBottomSheet = new VideoAdBottomSheet("#Elevate Easter celebrations\n#Elevate Easter celebrations\n\n**Bold** [content](www.google.com)", "Video Ad Unit", "", "", null);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            VideoAdBottomSheetUiKt.b(videoAdBottomSheet, false, (Function0) objG, null, composer, 432);
        }
        return Unit.f24250a;
    }
}
