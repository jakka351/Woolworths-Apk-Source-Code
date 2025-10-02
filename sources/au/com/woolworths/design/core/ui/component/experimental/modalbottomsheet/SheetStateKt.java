package au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SheetStateKt {
    public static final SheetState a(int i, int i2, Composer composer) {
        composer.o(-956249935);
        boolean z = true;
        boolean z2 = (i2 & 1) == 0;
        int i3 = i & 14;
        androidx.compose.material3.SheetState sheetStateF = androidx.compose.material3.ModalBottomSheetKt.f(z2, composer, i3, 2);
        composer.o(5004770);
        if (((i3 ^ 6) <= 4 || !composer.p(z2)) && (i & 6) != 4) {
            z = false;
        }
        Object objG = composer.G();
        if (z || objG == Composer.Companion.f1624a) {
            objG = new SheetState(sheetStateF);
            composer.A(objG);
        }
        SheetState sheetState = (SheetState) objG;
        composer.l();
        composer.l();
        return sheetState;
    }
}
