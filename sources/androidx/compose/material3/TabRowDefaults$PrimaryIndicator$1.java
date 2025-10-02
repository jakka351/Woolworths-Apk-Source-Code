package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TabRowDefaults$PrimaryIndicator$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ TabRowDefaults h;
    public final /* synthetic */ Modifier i;
    public final /* synthetic */ float j;
    public final /* synthetic */ float k;
    public final /* synthetic */ long l;
    public final /* synthetic */ Shape m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowDefaults$PrimaryIndicator$1(TabRowDefaults tabRowDefaults, Modifier modifier, float f, float f2, long j, Shape shape, int i) {
        super(2);
        this.h = tabRowDefaults;
        this.i = modifier;
        this.j = f;
        this.k = f2;
        this.l = j;
        this.m = shape;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(196657);
        ComposerImpl composerImplV = ((Composer) obj).v(-1895596205);
        Modifier modifier = this.i;
        int i = ((composerImplV.n(modifier) ? 4 : 2) | iA | 25984) & 9363;
        float f = this.j;
        float f2 = this.k;
        long jD = this.l;
        Shape shape = this.m;
        if (i == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.u0();
            if ((iA & 1) == 0 || composerImplV.c0()) {
                f2 = PrimaryNavigationTabTokens.f1597a;
                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.p, composerImplV);
                shape = PrimaryNavigationTabTokens.b;
            } else {
                composerImplV.j();
            }
            composerImplV.W();
            SpacerKt.a(composerImplV, BackgroundKt.b(SizeKt.o(SizeKt.j(modifier, f2), f), jD, shape));
        }
        Shape shape2 = shape;
        long j = jD;
        float f3 = f2;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new TabRowDefaults$PrimaryIndicator$1(this.h, modifier, f, f3, j, shape2, iA);
        }
        return Unit.f24250a;
    }
}
