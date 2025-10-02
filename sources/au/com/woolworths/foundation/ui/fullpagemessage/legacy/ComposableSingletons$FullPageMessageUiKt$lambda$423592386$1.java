package au.com.woolworths.foundation.ui.fullpagemessage.legacy;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.painter.ColorPainter;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageSpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.foundation.ui.fullpagemessage.legacy.ComposableSingletons$FullPageMessageUiKt$lambda$-423592386$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$FullPageMessageUiKt$lambda$423592386$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ColorPainter colorPainter = new ColorPainter(WxTheme.a(composer).d());
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            FullPageMessageUiKt.a(FullPageMessageSpec.Companion.d(colorPainter, "Don't miss out", "To receive notifications on new boosters, eReceipts and the latest news, turn on your phone's notification settings", "OPEN SETTINGS", (Function0) objG), null, null, composer, 0, 6);
        }
        return Unit.f24250a;
    }
}
