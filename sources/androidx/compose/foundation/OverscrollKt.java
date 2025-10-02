package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComputedProvidableCompositionLocal;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class OverscrollKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ComputedProvidableCompositionLocal f844a = new ComputedProvidableCompositionLocal(OverscrollKt$LocalOverscrollFactory$1.h);

    public static final OverscrollEffect a(Composer composer) {
        composer.o(282942128);
        OverscrollFactory overscrollFactory = (OverscrollFactory) composer.x(f844a);
        if (overscrollFactory == null) {
            composer.l();
            return null;
        }
        boolean zN = composer.n(overscrollFactory);
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            objG = overscrollFactory.a();
            composer.A(objG);
        }
        OverscrollEffect overscrollEffect = (OverscrollEffect) objG;
        composer.l();
        return overscrollEffect;
    }
}
