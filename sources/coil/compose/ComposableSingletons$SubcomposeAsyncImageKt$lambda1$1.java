package coil.compose;

import androidx.compose.runtime.Composer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lcoil/compose/SubcomposeAsyncImageScope;", "invoke", "(Lcoil/compose/SubcomposeAsyncImageScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: coil.compose.ComposableSingletons$SubcomposeAsyncImageKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$SubcomposeAsyncImageKt$lambda1$1 extends Lambda implements Function3<SubcomposeAsyncImageScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$SubcomposeAsyncImageKt$lambda1$1 h = new ComposableSingletons$SubcomposeAsyncImageKt$lambda1$1(3);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SubcomposeAsyncImageScope subcomposeAsyncImageScope = (SubcomposeAsyncImageScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= composer.n(subcomposeAsyncImageScope) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && composer.c()) {
            composer.j();
        } else {
            SubcomposeAsyncImageKt.a(subcomposeAsyncImageScope, null, null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, composer, iIntValue & 14);
        }
        return Unit.f24250a;
    }
}
