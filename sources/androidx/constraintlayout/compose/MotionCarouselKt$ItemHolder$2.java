package androidx.constraintlayout.compose;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MotionCarouselKt$ItemHolder$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int h;
    public final /* synthetic */ String i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ ComposableLambdaImpl k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionCarouselKt$ItemHolder$2(int i, String str, boolean z, ComposableLambdaImpl composableLambdaImpl, int i2) {
        super(2);
        this.h = i;
        this.i = str;
        this.j = z;
        this.k = composableLambdaImpl;
        this.l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.l | 1);
        ComposerImpl composerImplV = ((Composer) obj).v(1970516035);
        int i2 = iA & 6;
        int i3 = this.h;
        if (i2 == 0) {
            i = (composerImplV.r(i3) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i4 = iA & 48;
        String str = this.i;
        if (i4 == 0) {
            i |= composerImplV.n(str) ? 32 : 16;
        }
        int i5 = iA & KyberEngine.KyberPolyBytes;
        boolean z = this.j;
        if (i5 == 0) {
            i |= composerImplV.p(z) ? 256 : 128;
        }
        int i6 = iA & 3072;
        ComposableLambdaImpl composableLambdaImpl = this.k;
        if (i6 == 0) {
            i |= composerImplV.I(composableLambdaImpl) ? 2048 : 1024;
        }
        if ((i & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierB = LayoutIdKt.b(Modifier.Companion.d, str + i3);
            if (z) {
                float f = 20;
                modifierB = BorderKt.a(ClipKt.a(modifierB, RoundedCornerShapeKt.b(f)), 2, ColorKt.c(0, 0, 0, 60), RoundedCornerShapeKt.b(f));
            }
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i7 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                b.B(i7, composerImplV, i7, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            a.y((i >> 9) & 14, composableLambdaImpl, composerImplV, true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new MotionCarouselKt$ItemHolder$2(i3, str, z, composableLambdaImpl, iA);
        }
        return Unit.f24250a;
    }
}
