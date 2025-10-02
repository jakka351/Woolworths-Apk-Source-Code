package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "drawerPredictiveBackState", "Landroidx/compose/material3/DrawerPredictiveBackState;", "invoke", "(Landroidx/compose/material3/DrawerPredictiveBackState;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NavigationDrawerKt$ModalDrawerSheet$2 extends Lambda implements Function3<DrawerPredictiveBackState, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DrawerPredictiveBackState drawerPredictiveBackState = (DrawerPredictiveBackState) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.n(drawerPredictiveBackState) ? 4 : 2;
        }
        if ((iIntValue & 19) != 18 || !composer.c()) {
            throw null;
        }
        composer.j();
        return Unit.f24250a;
    }
}
