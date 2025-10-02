package au.com.woolworths.design.core.ui.component.stable.iconbutton;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.button.TertiaryButtonKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonSpec;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TertiaryIconButtonKt {
    public static final void a(final ImageVector imageVector, String str, Function0 onClick, Modifier modifier, boolean z, IconButtonSpec.Size size, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        final IconButtonSpec.Size size2;
        Modifier modifier3;
        boolean z2;
        Intrinsics.h(imageVector, "imageVector");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(2096087520);
        int i4 = (composerImplV.n(imageVector) ? 4 : 2) | i;
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.I(onClick) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (composerImplV.n(modifier2) ? 2048 : 1024);
        }
        int i6 = i3 | 24576;
        if ((74899 & i6) == 74898 && composerImplV.c()) {
            composerImplV.j();
            size2 = size;
            modifier3 = modifier2;
            z2 = z;
        } else {
            if (i5 != 0) {
                modifier2 = Modifier.Companion.d;
            }
            size2 = size;
            TertiaryButtonKt.b(null, str, onClick, modifier2, true, null, ComposableLambdaKt.c(1785867401, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.iconbutton.TertiaryIconButtonKt$TertiaryIconButton$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        composer2.o(1015991140);
                        long j = CoreTheme.b(composer2).f4782a.c.d.f4795a;
                        composer2.l();
                        IconKt.b(imageVector, null, SizeKt.q(Modifier.Companion.d, size2.e), j, composer2, 48, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), size2.a(), composerImplV, (i6 & 7168) | (i6 & 896) | 1769526 | 24576);
            modifier3 = modifier2;
            z2 = true;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(imageVector, str, onClick, modifier3, z2, size2, i, i2, 0);
        }
    }
}
