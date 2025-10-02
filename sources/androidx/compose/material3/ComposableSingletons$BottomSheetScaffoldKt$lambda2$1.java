package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material3/SnackbarHostState;", "invoke", "(Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$BottomSheetScaffoldKt$lambda2$1 extends Lambda implements Function3<SnackbarHostState, Composer, Integer, Unit> {
    public static final ComposableSingletons$BottomSheetScaffoldKt$lambda2$1 h = new ComposableSingletons$BottomSheetScaffoldKt$lambda2$1(3);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SnackbarHostState snackbarHostState = (SnackbarHostState) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.n(snackbarHostState) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && composer.c()) {
            composer.j();
        } else {
            SnackbarHostKt.a(snackbarHostState, null, null, composer, iIntValue & 14);
        }
        return Unit.f24250a;
    }
}
