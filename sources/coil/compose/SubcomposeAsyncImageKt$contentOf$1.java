package coil.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import coil.compose.AsyncImagePainter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lcoil/compose/SubcomposeAsyncImageScope;", "invoke", "(Lcoil/compose/SubcomposeAsyncImageScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class SubcomposeAsyncImageKt$contentOf$1 extends Lambda implements Function3<SubcomposeAsyncImageScope, Composer, Integer, Unit> {
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
            AsyncImagePainter.State state = (AsyncImagePainter.State) ((SnapshotMutableStateImpl) subcomposeAsyncImageScope.b().u).getD();
            if (state instanceof AsyncImagePainter.State.Loading) {
                composer.F(-418307549);
                composer.N();
            } else if (state instanceof AsyncImagePainter.State.Success) {
                composer.F(-418307455);
                composer.N();
            } else if (state instanceof AsyncImagePainter.State.Error) {
                composer.F(-418307363);
                composer.N();
            } else if (state instanceof AsyncImagePainter.State.Empty) {
                composer.F(-418307275);
                composer.N();
            } else {
                composer.F(-418307215);
                composer.N();
            }
            SubcomposeAsyncImageKt.a(subcomposeAsyncImageScope, null, null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, composer, iIntValue & 14);
        }
        return Unit.f24250a;
    }
}
