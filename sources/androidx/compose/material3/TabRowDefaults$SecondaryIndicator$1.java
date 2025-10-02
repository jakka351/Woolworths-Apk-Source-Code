package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TabRowDefaults$SecondaryIndicator$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ TabRowDefaults h;
    public final /* synthetic */ Modifier i;
    public final /* synthetic */ float j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowDefaults$SecondaryIndicator$1(TabRowDefaults tabRowDefaults, Modifier modifier, float f, long j, int i) {
        super(2);
        this.h = tabRowDefaults;
        this.i = modifier;
        this.j = f;
        this.k = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(3073);
        ComposerImpl composerImplV = ((Composer) obj).v(-1498258020);
        Modifier modifier = this.i;
        int i = ((composerImplV.n(modifier) ? 4 : 2) | iA | 176) & 147;
        float f = this.j;
        long jD = this.k;
        if (i == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.u0();
            if ((iA & 1) == 0 || composerImplV.c0()) {
                f = PrimaryNavigationTabTokens.f1597a;
                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.p, composerImplV);
            } else {
                composerImplV.j();
            }
            composerImplV.W();
            BoxKt.a(BackgroundKt.b(SizeKt.g(SizeKt.e(modifier, 1.0f), f), jD, RectangleShapeKt.f1779a), composerImplV, 0);
        }
        long j = jD;
        float f2 = f;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new TabRowDefaults$SecondaryIndicator$1(this.h, modifier, f2, j, iA);
        }
        return Unit.f24250a;
    }
}
