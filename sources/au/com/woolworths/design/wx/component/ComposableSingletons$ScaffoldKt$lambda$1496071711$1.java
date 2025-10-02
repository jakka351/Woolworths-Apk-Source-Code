package au.com.woolworths.design.wx.component;

import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposableSingletons$ScaffoldKt$lambda$1496071711$1 implements Function3<SnackbarHostState, Composer, Integer, Unit> {
    public static final ComposableSingletons$ScaffoldKt$lambda$1496071711$1 d = new ComposableSingletons$ScaffoldKt$lambda$1496071711$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SnackbarHostState it = (SnackbarHostState) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(it, "it");
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.n(it) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && composer.c()) {
            composer.j();
        } else {
            SnackbarHostKt.b(it, null, null, composer, iIntValue & 14, 6);
        }
        return Unit.f24250a;
    }
}
