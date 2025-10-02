package au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import au.com.woolworths.android.onesite.deeplink.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.ComposableSingletons$ModalBottomSheetKt$lambda$-1618611944$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ModalBottomSheetKt$lambda$1618611944$1 implements Function2<Composer, Integer, Unit> {
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
            composer.o(-1937155621);
            SheetState sheetState = new SheetState(new androidx.compose.material3.SheetState(AndroidDensity_androidKt.a((Context) composer.x(AndroidCompositionLocals_androidKt.b))));
            composer.l();
            ModalBottomSheetKt.a((Function0) objG, null, sheetState, null, null, 0L, 0L, ComposableSingletons$ModalBottomSheetKt.f4724a, composer, 12582918, 122);
        }
        return Unit.f24250a;
    }
}
