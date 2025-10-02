package au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.ComposableSingletons$ModalBottomSheetKt$lambda$-1625840829$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ModalBottomSheetKt$lambda$1625840829$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$ModalBottomSheetKt$lambda$1625840829$1 d = new ComposableSingletons$ModalBottomSheetKt$lambda$1625840829$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ColumnScope ModalBottomSheet = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(ModalBottomSheet, "$this$ModalBottomSheet");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            TextKt.b("Hello world", PaddingKt.f(Modifier.Companion.d, 12), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 54, 0, 131068);
        }
        return Unit.f24250a;
    }
}
