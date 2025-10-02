package coil3.compose;

import androidx.compose.runtime.Composer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: coil3.compose.ComposableSingletons$SubcomposeAsyncImageKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$SubcomposeAsyncImageKt$lambda1$1 implements Function3<SubcomposeAsyncImageScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$SubcomposeAsyncImageKt$lambda1$1 d = new ComposableSingletons$SubcomposeAsyncImageKt$lambda1$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SubcomposeAsyncImageScope subcomposeAsyncImageScope = (SubcomposeAsyncImageScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.n(subcomposeAsyncImageScope) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && composer.c()) {
            composer.j();
        } else {
            SubcomposeAsyncImageKt.b(subcomposeAsyncImageScope, null, null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, false, composer, iIntValue & 14);
        }
        return Unit.f24250a;
    }
}
