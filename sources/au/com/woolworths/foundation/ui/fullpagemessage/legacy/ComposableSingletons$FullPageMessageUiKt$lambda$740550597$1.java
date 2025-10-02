package au.com.woolworths.foundation.ui.fullpagemessage.legacy;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.ui.graphics.painter.ColorPainter;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.design.wx.foundation.WxTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$FullPageMessageUiKt$lambda$740550597$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ColorPainter colorPainter = new ColorPainter(WxTheme.a(composer).d());
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new h(20);
                composer.A(objG);
            }
            Function0 onPrimaryButtonClick = (Function0) objG;
            Object objE = a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new h(20);
                composer.A(objE);
            }
            Function0 onSecondaryButtonClick = (Function0) objE;
            composer.l();
            Intrinsics.h(onPrimaryButtonClick, "onPrimaryButtonClick");
            Intrinsics.h(onSecondaryButtonClick, "onSecondaryButtonClick");
            FullPageMessageUiKt.a(new FullPageMessageSpec(colorPainter, null, "Location services are disabled", "Turn location ON in device settings to see Pick up locations nearby.", "Go To Settings", onPrimaryButtonClick, "Search Pick Up Locations", onSecondaryButtonClick), null, null, composer, 0, 6);
        }
        return Unit.f24250a;
    }
}
