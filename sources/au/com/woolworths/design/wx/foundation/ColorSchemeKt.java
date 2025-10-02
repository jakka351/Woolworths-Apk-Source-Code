package au.com.woolworths.design.wx.foundation;

import androidx.compose.material.ContentColorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.Color;
import androidx.lifecycle.compose.d;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"design-wx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ColorSchemeKt {

    /* renamed from: a, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f5155a = new StaticProvidableCompositionLocal(new d(9));

    public static final void a(ColorScheme colorScheme, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        MutableState mutableState = colorScheme.e;
        ComposerImpl composerImplV = composer.v(2041354660);
        if ((((composerImplV.n(colorScheme) ? 4 : 2) | i) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                ColorScheme colorScheme2 = new ColorScheme(colorScheme.h(), colorScheme.i(), colorScheme.a(), colorScheme.b(), ((Color) ((SnapshotMutableStateImpl) mutableState).getD()).f1766a, colorScheme.c(), colorScheme.f(), colorScheme.d(), colorScheme.e(), colorScheme.g());
                composerImplV.A(colorScheme2);
                objG = colorScheme2;
            }
            ColorScheme colorScheme3 = (ColorScheme) objG;
            composerImplV.V(false);
            colorScheme3.getClass();
            ((SnapshotMutableStateImpl) colorScheme3.f5154a).setValue(new Color(colorScheme.h()));
            ((SnapshotMutableStateImpl) colorScheme3.b).setValue(new Color(colorScheme.i()));
            ((SnapshotMutableStateImpl) colorScheme3.c).setValue(new Color(colorScheme.a()));
            ((SnapshotMutableStateImpl) colorScheme3.d).setValue(new Color(colorScheme.b()));
            ((SnapshotMutableStateImpl) colorScheme3.e).setValue(new Color(((Color) ((SnapshotMutableStateImpl) mutableState).getD()).f1766a));
            ((SnapshotMutableStateImpl) colorScheme3.f).setValue(new Color(colorScheme.c()));
            ((SnapshotMutableStateImpl) colorScheme3.g).setValue(new Color(colorScheme.f()));
            ((SnapshotMutableStateImpl) colorScheme3.h).setValue(new Color(colorScheme.d()));
            ((SnapshotMutableStateImpl) colorScheme3.i).setValue(new Color(colorScheme.e()));
            ((SnapshotMutableStateImpl) colorScheme3.j).setValue(new Color(colorScheme.g()));
            CompositionLocalKt.b(new ProvidedValue[]{f5155a.b(colorScheme3), androidx.camera.core.impl.b.g(colorScheme.c(), ContentColorKt.f1261a)}, composableLambdaImpl, composerImplV, 56);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(colorScheme, i, 0, composableLambdaImpl);
        }
    }
}
