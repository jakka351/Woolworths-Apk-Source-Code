package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TabRowKt$PrimaryScrollableTabRow$1 extends Lambda implements Function3<TabIndicatorScope, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TabIndicatorScope tabIndicatorScope = (TabIndicatorScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? composer.n(tabIndicatorScope) : composer.I(tabIndicatorScope) ? 4 : 2;
        }
        if ((iIntValue & 19) != 18 || !composer.c()) {
            throw null;
        }
        composer.j();
        return Unit.f24250a;
    }
}
