package androidx.compose.material3.pulltorefresh;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PullToRefreshKt$PullToRefreshBox$1 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BoxScope boxScope = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.n(boxScope) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && composer.c()) {
            composer.j();
        } else {
            PullToRefreshDefaults.f1566a.a(null, false, boxScope.g(Modifier.Companion.d, Alignment.Companion.b), 0L, 0L, BitmapDescriptorFactory.HUE_RED, composer, 1572864, 56);
        }
        return Unit.f24250a;
    }
}
