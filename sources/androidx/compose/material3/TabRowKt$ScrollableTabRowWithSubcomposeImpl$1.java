package androidx.compose.material3;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.RememberedCoroutineScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class TabRowKt$ScrollableTabRowWithSubcomposeImpl$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        Object objG = composer.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (objG == composer$Companion$Empty$1) {
            objG = new CompositionScopedCoroutineScopeCanceller(new RememberedCoroutineScope(composer.y()));
            composer.A(objG);
        }
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objG).d;
        boolean zN = composer.n(null) | composer.n(coroutineScope);
        Object objG2 = composer.G();
        if (zN || objG2 == composer$Companion$Empty$1) {
            objG2 = new ScrollableTabData(null, coroutineScope);
            composer.A(objG2);
        }
        ClipKt.b(SelectableGroupKt.a(ScrollKt.b(SizeKt.z(SizeKt.e(Modifier.Companion.d, 1.0f), Alignment.Companion.d, 2), null, false)));
        composer.q(BitmapDescriptorFactory.HUE_RED);
        throw null;
    }
}
