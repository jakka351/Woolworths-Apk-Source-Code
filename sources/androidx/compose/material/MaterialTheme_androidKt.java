package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MaterialTheme_androidKt {
    public static final void a(final int i, Composer composer, final ComposableLambdaImpl composableLambdaImpl) {
        ComposerImpl composerImplV = composer.v(-1322912246);
        int i2 = (composerImplV.I(composableLambdaImpl) ? 4 : 2) | i;
        if (composerImplV.z(i2 & 1, (i2 & 3) != 2)) {
            composableLambdaImpl.invoke(composerImplV, Integer.valueOf(i2 & 14));
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(i) { // from class: androidx.compose.material.MaterialTheme_androidKt$PlatformMaterialTheme$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    MaterialTheme_androidKt.a(RecomposeScopeImplKt.a(1), (Composer) obj, this.h);
                    return Unit.f24250a;
                }
            };
        }
    }
}
