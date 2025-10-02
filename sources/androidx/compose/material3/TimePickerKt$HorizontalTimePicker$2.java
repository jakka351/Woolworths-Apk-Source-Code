package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TimePickerKt$HorizontalTimePicker$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ AnalogTimePickerState h;
    public final /* synthetic */ Modifier i;
    public final /* synthetic */ TimePickerColors j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$HorizontalTimePicker$2(AnalogTimePickerState analogTimePickerState, Modifier modifier, TimePickerColors timePickerColors, boolean z, int i) {
        super(2);
        this.h = analogTimePickerState;
        this.i = modifier;
        this.j = timePickerColors;
        this.k = z;
        this.l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.l | 1);
        float f = TimePickerKt.f1519a;
        ComposerImpl composerImplV = ((Composer) obj).v(1432307537);
        int i2 = iA & 6;
        AnalogTimePickerState analogTimePickerState = this.h;
        if (i2 == 0) {
            i = (composerImplV.I(analogTimePickerState) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i3 = iA & 48;
        Modifier modifier = this.i;
        if (i3 == 0) {
            i |= composerImplV.n(modifier) ? 32 : 16;
        }
        int i4 = iA & KyberEngine.KyberPolyBytes;
        TimePickerColors timePickerColors = this.j;
        if (i4 == 0) {
            i |= composerImplV.n(timePickerColors) ? 256 : 128;
        }
        int i5 = iA & 3072;
        boolean z = this.k;
        if (i5 == 0) {
            i |= composerImplV.p(z) ? 2048 : 1024;
        }
        if ((i & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.u0();
            if ((iA & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            Modifier modifierJ = PaddingKt.j(modifier, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, TimePickerKt.c, 7);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierJ);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            int i7 = i & 14;
            int i8 = i >> 3;
            int i9 = i7 | (i8 & 112);
            TimePickerKt.c(analogTimePickerState, timePickerColors, composerImplV, i9);
            SpacerKt.a(composerImplV, SizeKt.u(Modifier.Companion.d, TimePickerKt.b));
            TimePickerKt.b(analogTimePickerState, timePickerColors, z, composerImplV, (i8 & 896) | i9);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new TimePickerKt$HorizontalTimePicker$2(analogTimePickerState, modifier, timePickerColors, z, iA);
        }
        return Unit.f24250a;
    }
}
