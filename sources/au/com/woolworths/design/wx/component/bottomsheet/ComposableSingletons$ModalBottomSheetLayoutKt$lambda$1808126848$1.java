package au.com.woolworths.design.wx.component.bottomsheet;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.design.wx.component.bottomsheet.ComposableSingletons$ModalBottomSheetLayoutKt$lambda$-1808126848$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ModalBottomSheetLayoutKt$lambda$1808126848$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$ModalBottomSheetLayoutKt$lambda$1808126848$1 d = new ComposableSingletons$ModalBottomSheetLayoutKt$lambda$1808126848$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ColumnScope ModalBottomSheetLayout = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.design.core.ui.component.stable.corerow.c(7);
                composer.A(objG);
            }
            composer.l();
            LazyDslKt.b(null, null, null, false, null, null, null, false, null, (Function1) objG, composer, 805306368, 511);
        }
        return Unit.f24250a;
    }
}
