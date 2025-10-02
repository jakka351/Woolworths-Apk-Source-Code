package au.com.woolworths.design.core.ui.component.stable.iconbutton;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import au.com.woolworths.design.core.ui.component.stable.button.DestructiveButtonKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonSpec;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DestructiveIconButtonKt {
    public static final void a(final ImageVector imageVector, Function0 onClick, Modifier modifier, final IconButtonSpec.Size size, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-685966740);
        if (((i | (composerImplV.n(imageVector) ? 4 : 2) | 3072) & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-699037528, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.iconbutton.DestructiveIconButtonKt$DestructiveIconButton$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        long j = CoreTheme.b(composer2).f4782a.c.f4791a.f4792a;
                        IconKt.b(imageVector, null, SizeKt.q(Modifier.Companion.d, size.e), j, composer2, 48, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV);
            ButtonSpec.Size sizeA = size.a();
            Modifier.Companion companion = Modifier.Companion.d;
            DestructiveButtonKt.c(null, "Settings", onClick, companion, null, composableLambdaImplC, sizeA, composerImplV, 224694);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(imageVector, onClick, modifier2, size, i, 0);
        }
    }
}
