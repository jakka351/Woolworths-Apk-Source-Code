package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class AppBarKt$SingleRowTopAppBar$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        final TopAppBarScrollBehavior topAppBarScrollBehavior = null;
        SizeKt.i(ClipKt.b(WindowInsetsPaddingKt.d(Modifier.Companion.d, null)), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1);
        boolean zN = composer.n(null);
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            objG = new ScrolledOffset() { // from class: androidx.compose.material3.a
                @Override // androidx.compose.material3.ScrolledOffset
                public final float a() {
                    TopAppBarState f1443a;
                    TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    return (topAppBarScrollBehavior2 == null || (f1443a = topAppBarScrollBehavior2.getF1443a()) == null) ? BitmapDescriptorFactory.HUE_RED : f1443a.b();
                }
            };
            composer.A(objG);
        }
        throw null;
    }
}
