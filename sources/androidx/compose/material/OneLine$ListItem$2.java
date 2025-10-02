package androidx.compose.material;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OneLine$ListItem$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ OneLine h;
    public final /* synthetic */ Modifier i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ ComposableLambdaImpl k;
    public final /* synthetic */ Function2 l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneLine$ListItem$2(OneLine oneLine, Modifier modifier, Function2 function2, ComposableLambdaImpl composableLambdaImpl, Function2 function22, int i) {
        super(2);
        this.h = oneLine;
        this.i = modifier;
        this.j = function2;
        this.k = composableLambdaImpl;
        this.l = function22;
        this.m = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        OneLine oneLine;
        Modifier modifier;
        int i2;
        Function2 function2;
        ComposableLambdaImpl composableLambdaImpl;
        Function2 function22;
        boolean z;
        boolean z2;
        Function2 function23;
        boolean z3;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.m | 1);
        ComposerImpl composerImplV = ((Composer) obj).v(-1884451315);
        int i3 = iA & 6;
        Modifier modifier2 = this.i;
        if (i3 == 0) {
            i = (composerImplV.n(modifier2) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i4 = iA & 48;
        Function2 function24 = this.j;
        if (i4 == 0) {
            i |= composerImplV.I(function24) ? 32 : 16;
        }
        int i5 = iA & KyberEngine.KyberPolyBytes;
        ComposableLambdaImpl composableLambdaImpl2 = this.k;
        if (i5 == 0) {
            i |= composerImplV.I(composableLambdaImpl2) ? 256 : 128;
        }
        int i6 = iA & 3072;
        Function2 function25 = this.l;
        if (i6 == 0) {
            i |= composerImplV.I(function25) ? 2048 : 1024;
        }
        int i7 = iA & 24576;
        OneLine oneLine2 = this.h;
        if (i7 == 0) {
            i |= composerImplV.n(oneLine2) ? 16384 : 8192;
        }
        if (composerImplV.z(i & 1, (i & 9363) != 9362)) {
            Modifier modifierI = SizeKt.i(modifier2, function24 == null ? OneLine.f1305a : OneLine.b, BitmapDescriptorFactory.HUE_RED, 2);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i8 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierI);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function26 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function26);
            Function2 function27 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function27);
            Function2 function28 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                b.B(i8, composerImplV, i8, function28);
            }
            Function2 function29 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function29);
            Modifier.Companion companion = Modifier.Companion.d;
            BiasAlignment biasAlignment = Alignment.Companion.d;
            BiasAlignment.Vertical vertical = Alignment.Companion.k;
            int i9 = i;
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            if (function24 != null) {
                oneLine = oneLine2;
                composerImplV.o(-1966455448);
                Modifier modifierB = rowScopeInstance.b(companion, vertical);
                float f = OneLine.d;
                modifier = modifier2;
                function22 = function25;
                i2 = iA;
                Modifier modifierW = SizeKt.w(modifierB, f + OneLine.c, BitmapDescriptorFactory.HUE_RED, 2);
                float f2 = OneLine.e;
                Modifier modifierJ = PaddingKt.j(modifierW, f, f2, BitmapDescriptorFactory.HUE_RED, f2, 4);
                MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
                int i10 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierJ);
                composerImplV.i();
                composableLambdaImpl = composableLambdaImpl2;
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD, function26);
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, function27);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i10))) {
                    b.B(i10, composerImplV, i10, function28);
                }
                Updater.b(composerImplV, modifierD2, function29);
                function24.invoke(composerImplV, Integer.valueOf((i9 >> 3) & 14));
                z = true;
                composerImplV.V(true);
                z2 = false;
                composerImplV.V(false);
            } else {
                oneLine = oneLine2;
                modifier = modifier2;
                composableLambdaImpl = composableLambdaImpl2;
                function22 = function25;
                i2 = iA;
                z = true;
                z2 = false;
                composerImplV.o(-1965948040);
                composerImplV.V(false);
            }
            Modifier modifierJ2 = PaddingKt.j(rowScopeInstance.b(rowScopeInstance.a(companion, 1.0f, z), vertical), OneLine.f, BitmapDescriptorFactory.HUE_RED, OneLine.g, BitmapDescriptorFactory.HUE_RED, 10);
            MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, z2);
            int i11 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierJ2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD2, function26);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function27);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i11))) {
                b.B(i11, composerImplV, i11, function28);
            }
            Updater.b(composerImplV, modifierD3, function29);
            composableLambdaImpl2 = composableLambdaImpl;
            a.y((i9 >> 6) & 14, composableLambdaImpl2, composerImplV, true);
            if (function22 != null) {
                composerImplV.o(-1965606420);
                Modifier modifierJ3 = PaddingKt.j(rowScopeInstance.b(companion, vertical), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, OneLine.h, BitmapDescriptorFactory.HUE_RED, 11);
                MeasurePolicy measurePolicyD3 = BoxKt.d(Alignment.Companion.f1719a, false);
                int i12 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImplV.Q();
                Modifier modifierD4 = ComposedModifierKt.d(composerImplV, modifierJ3);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD3, function26);
                Updater.b(composerImplV, persistentCompositionLocalMapQ4, function27);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i12))) {
                    b.B(i12, composerImplV, i12, function28);
                }
                Updater.b(composerImplV, modifierD4, function29);
                Function2 function210 = function22;
                function210.invoke(composerImplV, Integer.valueOf((i9 >> 9) & 14));
                z3 = true;
                composerImplV.V(true);
                composerImplV.V(false);
                function23 = function210;
            } else {
                function23 = function22;
                z3 = true;
                composerImplV.o(-1965410376);
                composerImplV.V(false);
            }
            composerImplV.V(z3);
            function2 = function23;
        } else {
            oneLine = oneLine2;
            modifier = modifier2;
            i2 = iA;
            composerImplV.j();
            function2 = function25;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new OneLine$ListItem$2(oneLine, modifier, function24, composableLambdaImpl2, function2, i2);
        }
        return Unit.f24250a;
    }
}
