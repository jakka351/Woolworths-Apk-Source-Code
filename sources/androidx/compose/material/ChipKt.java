package androidx.compose.material;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003¨\u0006\u0003²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "contentColor", "leadingIconContentColor", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ChipKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1252a = 12;
    public static final float b = 4;
    public static final float c;
    public static final float d;

    static {
        float f = 8;
        c = f;
        d = f;
    }

    public static final void a(final Function0 function0, final Modifier modifier, final boolean z, final Shape shape, final ChipColors chipColors, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        Function0 function02;
        int i2;
        ComposerImpl composerImplV = composer.v(-368396408);
        if ((i & 6) == 0) {
            function02 = function0;
            i2 = (composerImplV.I(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= composerImplV.n(shape) ? 16384 : 8192;
        }
        int i4 = i3 | 196608;
        if ((1572864 & i) == 0) {
            i4 |= composerImplV.n(chipColors) ? 1048576 : 524288;
        }
        int i5 = i4 | 12582912;
        if ((100663296 & i) == 0) {
            i5 |= composerImplV.I(composableLambdaImpl) ? 67108864 : 33554432;
        }
        if (composerImplV.z(i5 & 1, (38347923 & i5) != 38347922)) {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            final MutableState mutableStateA = chipColors.a(z, composerImplV);
            SurfaceKt.b(function02, SemanticsModifierKt.b(modifier, false, ChipKt$Chip$1.h), z, shape, ((Color) chipColors.b(z, composerImplV).getD()).f1766a, Color.b(((Color) mutableStateA.getD()).f1766a, 1.0f), null, BitmapDescriptorFactory.HUE_RED, null, ComposableLambdaKt.c(139076687, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ContentAlphaKt.f1260a;
                        float f = ChipKt.f1252a;
                        ProvidedValue providedValueB = dynamicProvidableCompositionLocal.b(Float.valueOf(Color.d(((Color) mutableStateA.getD()).f1766a)));
                        final boolean z2 = z;
                        final ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                        final ChipColors chipColors2 = chipColors;
                        CompositionLocalKt.a(providedValueB, ComposableLambdaKt.c(667535631, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                int iIntValue2 = ((Number) obj4).intValue();
                                if (composer3.z(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    TextKt.a(MaterialTheme.c(composer3).j, ComposableLambdaKt.c(-1131213696, new Function2<Composer, Integer, Unit>(z2, composableLambdaImpl2) { // from class: androidx.compose.material.ChipKt.Chip.2.1.1
                                        public final /* synthetic */ ComposableLambdaImpl i;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                            this.i = composableLambdaImpl;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            Composer composer4 = (Composer) obj5;
                                            int iIntValue3 = ((Number) obj6).intValue();
                                            if (composer4.z(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                Modifier modifierB = SizeKt.b(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, ChipDefaults.f1251a, 1);
                                                float f2 = ChipKt.f1252a;
                                                Modifier modifierJ = PaddingKt.j(modifierB, f2, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, 10);
                                                RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer4, 54);
                                                int p = composer4.getP();
                                                PersistentCompositionLocalMap persistentCompositionLocalMapD = composer4.d();
                                                Modifier modifierD = ComposedModifierKt.d(composer4, modifierJ);
                                                ComposeUiNode.e3.getClass();
                                                Function0 function03 = ComposeUiNode.Companion.b;
                                                if (composer4.w() == null) {
                                                    ComposablesKt.b();
                                                    throw null;
                                                }
                                                composer4.i();
                                                if (composer4.getO()) {
                                                    composer4.K(function03);
                                                } else {
                                                    composer4.e();
                                                }
                                                Updater.b(composer4, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                                                Updater.b(composer4, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                                Function2 function2 = ComposeUiNode.Companion.j;
                                                if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p))) {
                                                    b.z(p, composer4, p, function2);
                                                }
                                                Updater.b(composer4, modifierD, ComposeUiNode.Companion.d);
                                                composer4.o(2028143316);
                                                composer4.l();
                                                this.i.invoke(RowScopeInstance.f974a, composer4, 6);
                                                composer4.f();
                                            } else {
                                                composer4.j();
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), composer3, 48);
                                } else {
                                    composer3.j();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 56);
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i5 & 896) | (i5 & 14) | 805306368 | ((i5 >> 3) & 7168) | ((i5 << 3) & 3670016) | ((i5 << 15) & 234881024), 128);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    ChipKt.a(function0, modifier, z, shape, chipColors, composableLambdaImpl, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final boolean z, final Function0 function0, final Modifier modifier, final boolean z2, final Shape shape, final BorderStroke borderStroke, final SelectableChipColors selectableChipColors, final Function2 function2, final Function2 function22, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(-1259208246);
        int i2 = i | (composerImplV.p(z) ? 4 : 2) | (composerImplV.I(function0) ? 32 : 16) | (composerImplV.n(modifier) ? 256 : 128) | (composerImplV.p(z2) ? 2048 : 1024) | 24576 | (composerImplV.n(shape) ? 131072 : 65536) | (composerImplV.n(borderStroke) ? 1048576 : 524288) | (composerImplV.n(selectableChipColors) ? 8388608 : 4194304) | (composerImplV.I(function2) ? 67108864 : 33554432) | (composerImplV.I(null) ? 536870912 : 268435456);
        if (composerImplV.z(i2 & 1, ((306783379 & i2) == 306783378 && (('0' | (composerImplV.I(function22) ? (char) 4 : (char) 2)) & 19) == 18) ? false : true)) {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            final MutableState mutableStateC = selectableChipColors.c(z2, z, composerImplV);
            SurfaceKt.c(z, function0, SemanticsModifierKt.b(modifier, false, ChipKt$FilterChip$1.h), z2, shape, ((Color) selectableChipColors.b(z2, z, composerImplV).getD()).f1766a, Color.b(((Color) mutableStateC.getD()).f1766a, 1.0f), borderStroke, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(722126431, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ContentAlphaKt.f1260a;
                        final State state = mutableStateC;
                        ProvidedValue providedValueB = dynamicProvidableCompositionLocal.b(Float.valueOf(Color.d(((Color) state.getD()).f1766a)));
                        final SelectableChipColors selectableChipColors2 = selectableChipColors;
                        final boolean z3 = z2;
                        final ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                        final Function2 function23 = function2;
                        final Function2 function24 = function22;
                        final boolean z4 = z;
                        CompositionLocalKt.a(providedValueB, ComposableLambdaKt.c(1582291359, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                int iIntValue2 = ((Number) obj4).intValue();
                                if (composer3.z(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    TextStyle textStyle = MaterialTheme.c(composer3).j;
                                    final boolean z5 = z3;
                                    final State state2 = state;
                                    final SelectableChipColors selectableChipColors3 = selectableChipColors2;
                                    final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
                                    final Function2 function25 = function23;
                                    final Function2 function26 = function24;
                                    final boolean z6 = z4;
                                    TextKt.a(textStyle, ComposableLambdaKt.c(-1543702066, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.2.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            int i3;
                                            Function2 function27;
                                            Function2 function28;
                                            Composer composer4 = (Composer) obj5;
                                            int iIntValue3 = ((Number) obj6).intValue();
                                            if (composer4.z(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                IntrinsicSize intrinsicSize = IntrinsicSize.e;
                                                Modifier.Companion companion = Modifier.Companion.d;
                                                Modifier modifierB = SizeKt.b(IntrinsicKt.b(companion, intrinsicSize), BitmapDescriptorFactory.HUE_RED, ChipDefaults.f1251a, 1);
                                                Function2 function29 = function25;
                                                float f = function29 == null ? ChipKt.f1252a : 0;
                                                Function2 function210 = function26;
                                                Modifier modifierJ = PaddingKt.j(modifierB, f, BitmapDescriptorFactory.HUE_RED, function210 == null ? ChipKt.f1252a : 0, BitmapDescriptorFactory.HUE_RED, 10);
                                                Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                                                BiasAlignment.Vertical vertical = Alignment.Companion.k;
                                                RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$1, vertical, composer4, 54);
                                                int p = composer4.getP();
                                                PersistentCompositionLocalMap persistentCompositionLocalMapD = composer4.d();
                                                Modifier modifierD = ComposedModifierKt.d(composer4, modifierJ);
                                                ComposeUiNode.e3.getClass();
                                                Function0 function02 = ComposeUiNode.Companion.b;
                                                if (composer4.w() == null) {
                                                    ComposablesKt.b();
                                                    throw null;
                                                }
                                                composer4.i();
                                                if (composer4.getO()) {
                                                    composer4.K(function02);
                                                } else {
                                                    composer4.e();
                                                }
                                                Function2 function211 = ComposeUiNode.Companion.g;
                                                Updater.b(composer4, rowMeasurePolicyA, function211);
                                                Function2 function212 = ComposeUiNode.Companion.f;
                                                Updater.b(composer4, persistentCompositionLocalMapD, function212);
                                                Function2 function213 = ComposeUiNode.Companion.j;
                                                if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p))) {
                                                    b.z(p, composer4, p, function213);
                                                }
                                                Function2 function214 = ComposeUiNode.Companion.d;
                                                Updater.b(composer4, modifierD, function214);
                                                if (function29 == null) {
                                                    composer4.o(694250524);
                                                    composer4.l();
                                                    function27 = function210;
                                                    function28 = function214;
                                                    i3 = 0;
                                                } else {
                                                    composer4.o(692233385);
                                                    SpacerKt.a(composer4, SizeKt.u(companion, ChipKt.b));
                                                    MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                                                    int p2 = composer4.getP();
                                                    PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer4.d();
                                                    i3 = 0;
                                                    Modifier modifierD2 = ComposedModifierKt.d(composer4, companion);
                                                    if (composer4.w() == null) {
                                                        ComposablesKt.b();
                                                        throw null;
                                                    }
                                                    composer4.i();
                                                    if (composer4.getO()) {
                                                        composer4.K(function02);
                                                    } else {
                                                        composer4.e();
                                                    }
                                                    Updater.b(composer4, measurePolicyD, function211);
                                                    Updater.b(composer4, persistentCompositionLocalMapD2, function212);
                                                    if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p2))) {
                                                        b.z(p2, composer4, p2, function213);
                                                    }
                                                    Updater.b(composer4, modifierD2, function214);
                                                    if (function29 != null) {
                                                        composer4.o(1866339666);
                                                        MutableState mutableStateA = selectableChipColors3.a(z5, z6, composer4);
                                                        function27 = function210;
                                                        function28 = function214;
                                                        CompositionLocalKt.b(new ProvidedValue[]{ContentColorKt.f1261a.b(mutableStateA.getD()), ContentAlphaKt.f1260a.b(Float.valueOf(Color.d(((Color) mutableStateA.getD()).f1766a)))}, function29, composer4, 8);
                                                        composer4.l();
                                                    } else {
                                                        function27 = function210;
                                                        function28 = function214;
                                                        composer4.o(1866780765);
                                                        composer4.l();
                                                    }
                                                    composer4.o(1868134845);
                                                    composer4.l();
                                                    composer4.f();
                                                    SpacerKt.a(composer4, SizeKt.u(companion, ChipKt.c));
                                                    composer4.l();
                                                }
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
                                                Modifier modifierA = rowScopeInstance.a(companion, 1.0f, true);
                                                RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(arrangement$Start$1, vertical, composer4, 54);
                                                int p3 = composer4.getP();
                                                PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer4.d();
                                                Modifier modifierD3 = ComposedModifierKt.d(composer4, modifierA);
                                                if (composer4.w() == null) {
                                                    ComposablesKt.b();
                                                    throw null;
                                                }
                                                composer4.i();
                                                if (composer4.getO()) {
                                                    composer4.K(function02);
                                                } else {
                                                    composer4.e();
                                                }
                                                Updater.b(composer4, rowMeasurePolicyA2, function211);
                                                Updater.b(composer4, persistentCompositionLocalMapD3, function212);
                                                if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p3))) {
                                                    b.z(p3, composer4, p3, function213);
                                                }
                                                Updater.b(composer4, modifierD3, function28);
                                                composableLambdaImpl3.invoke(rowScopeInstance, composer4, 6);
                                                composer4.f();
                                                if (function27 != null) {
                                                    composer4.o(694586006);
                                                    float f2 = ChipKt.d;
                                                    SpacerKt.a(composer4, SizeKt.u(companion, f2));
                                                    function27.invoke(composer4, Integer.valueOf(i3));
                                                    SpacerKt.a(composer4, SizeKt.u(companion, f2));
                                                    composer4.l();
                                                } else {
                                                    composer4.o(694776284);
                                                    composer4.l();
                                                }
                                                composer4.f();
                                            } else {
                                                composer4.j();
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), composer3, 48);
                                } else {
                                    composer3.j();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 56);
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i2 & 7294) | (57344 & (i2 >> 3)) | (29360128 & (i2 << 3)) | 805306368);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(z, function0, modifier, z2, shape, borderStroke, selectableChipColors, function2, function22, composableLambdaImpl, i) { // from class: androidx.compose.material.ChipKt$FilterChip$3
                public final /* synthetic */ boolean h;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Modifier j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ Shape l;
                public final /* synthetic */ BorderStroke m;
                public final /* synthetic */ SelectableChipColors n;
                public final /* synthetic */ Function2 o;
                public final /* synthetic */ Function2 p;
                public final /* synthetic */ ComposableLambdaImpl q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(1);
                    ChipKt.b(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
