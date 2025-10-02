package au.com.woolworths.design.core.ui.component.experimental.coachmark;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSizeKt;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.textbutton.TextButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"", "tooltipHeight", "Landroidx/compose/ui/geometry/Rect;", "refinedSpotLightRect", "ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CoachMarkKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CoachMarkPopupDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CoachMarkPopupDirection coachMarkPopupDirection = CoachMarkPopupDirection.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final au.com.woolworths.design.core.ui.component.experimental.coachmark.CoachMarkState r29, final kotlin.jvm.functions.Function0 r30, float r31, final float r32, float r33, float r34, float r35, float r36, final kotlin.jvm.functions.Function2 r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.design.core.ui.component.experimental.coachmark.CoachMarkKt.a(au.com.woolworths.design.core.ui.component.experimental.coachmark.CoachMarkState, kotlin.jvm.functions.Function0, float, float, float, float, float, float, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(final int i, final int i2, final float f, Composer composer, final int i3) {
        int i4;
        ComposerImpl composerImplV = composer.v(-1579279979);
        int i5 = i3 & 6;
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
        if (i5 == 0) {
            i4 = (composerImplV.n(columnScopeInstance) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerImplV.r(i) ? 32 : 16;
        }
        if ((i3 & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.r(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerImplV.q(f) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final float f2 = 24;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierB = columnScopeInstance.b(SizeKt.e(companion, 1.0f), Alignment.Companion.m);
            composerImplV.o(-1746271574);
            boolean z = ((i4 & 896) == 256) | ((i4 & 112) == 32);
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new Function3() { // from class: au.com.woolworths.design.core.ui.component.experimental.coachmark.a
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        final MeasureScope layout = (MeasureScope) obj;
                        Measurable measurable = (Measurable) obj2;
                        Intrinsics.h(layout, "$this$layout");
                        Intrinsics.h(measurable, "measurable");
                        final Placeable placeableC0 = measurable.c0(((Constraints) obj3).f2197a);
                        int i6 = placeableC0.d;
                        int i7 = placeableC0.e;
                        final float f3 = f2;
                        final int i8 = i;
                        final int i9 = i2;
                        return layout.L0(i6, i7, EmptyMap.d, new Function1() { // from class: au.com.woolworths.design.core.ui.component.experimental.coachmark.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                Placeable.PlacementScope layout2 = (Placeable.PlacementScope) obj4;
                                Intrinsics.h(layout2, "$this$layout");
                                int iT1 = (int) layout.T1(f3);
                                int i10 = i8 - (iT1 / 2);
                                Placeable placeable = placeableC0;
                                int i11 = placeable.d - iT1;
                                int i12 = i9;
                                Placeable.PlacementScope.h(layout2, placeable, Math.min(Math.max(i12, i10), i11 - i12), 0);
                                return Unit.f24250a;
                            }
                        });
                    }
                };
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierA = LayoutModifierKt.a(modifierB, (Function3) objG);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            IconKt.a(PainterResources_androidKt.a(R.drawable.ic_coach_mark_arrow, 0, composerImplV), null, RotateKt.a(SizeKt.r(companion, f2, 12), f), CoreTheme.b(composerImplV).e.f4848a.c, composerImplV, 48, 0);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.design.core.ui.component.experimental.coachmark.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i3 | 1);
                    CoachMarkKt.b(i, i2, f, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void c(String title, String body, String cta, Function0 onDismissRequest, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.h(title, "title");
        Intrinsics.h(body, "body");
        Intrinsics.h(cta, "cta");
        Intrinsics.h(onDismissRequest, "onDismissRequest");
        ComposerImpl composerImplV = composer.v(-1837612812);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(title) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(body) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(cta) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onDismissRequest) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((i3 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierB = BackgroundKt.b(SizeKt.e(companion, 1.0f), CoreTheme.b(composerImplV).e.f4848a.c, RectangleShapeKt.f1779a);
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i4 = composerImplV.P;
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
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            float f = 16;
            Modifier modifierI = PaddingKt.i(companion, f, f, f, 4);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierI);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Object objF = au.com.woolworths.android.onesite.a.f(composerImplV, modifierD2, function24, 1849434622);
            if (objF == Composer.Companion.f1624a) {
                objF = new au.com.woolworths.android.onesite.repository.b(11);
                composerImplV.A(objF);
            }
            composerImplV.V(false);
            Modifier modifierB2 = SemanticsModifierKt.b(companion, true, (Function1) objF);
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierB2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            TextKt.b(title, null, CoreTheme.b(composerImplV).e.d.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.f5121a.b, composerImplV, i3 & 14, 0, 65530);
            SpacerKt.a(composerImplV, SizeKt.g(companion, 8));
            int i7 = i3 >> 3;
            TextKt.b(body, null, CoreTheme.b(composerImplV).e.d.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.b.f5123a, composerImplV, i7 & 14, 0, 65530);
            composerImplV = composerImplV;
            composerImplV.V(true);
            composerImplV.V(true);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i8 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImplV.Q();
            Modifier modifierD4 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ4, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                androidx.camera.core.impl.b.B(i8, composerImplV, i8, function23);
            }
            Updater.b(composerImplV, modifierD4, function24);
            SpacerKt.a(composerImplV, RowScopeInstance.f974a.a(companion, 1.0f, true));
            TextButtonKt.a(onDismissRequest, cta, null, false, null, null, null, null, composerImplV, ((i3 >> 9) & 14) | (i7 & 112), 508);
            composerImplV.V(true);
            composerImplV.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(title, body, cta, onDismissRequest, modifier2, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(au.com.woolworths.design.core.ui.component.experimental.coachmark.CoachMarkPopupDirection r18, int r19, androidx.compose.ui.Modifier r20, kotlin.jvm.functions.Function2 r21, androidx.compose.runtime.Composer r22, int r23) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.design.core.ui.component.experimental.coachmark.CoachMarkKt.d(au.com.woolworths.design.core.ui.component.experimental.coachmark.CoachMarkPopupDirection, int, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    public static final Rect e(LayoutCoordinates layoutCoordinates) {
        if (layoutCoordinates.q()) {
            long jY = layoutCoordinates.y(0L);
            return RectKt.a(Offset.a(jY, Float.intBitsToFloat((int) (jY & 4294967295L)), 1), IntSizeKt.d(layoutCoordinates.a()));
        }
        return RectKt.a((Float.floatToRawIntBits(r9) & 4294967295L) | (Float.floatToRawIntBits((int) 0) << 32), IntSizeKt.d(0L));
    }

    public static final CoachMarkState f(boolean z, Composer composer, int i, int i2) {
        composer.o(141054424);
        boolean z2 = true;
        if ((i2 & 1) != 0) {
            z = false;
        }
        CoachMarkPopupDirection coachMarkPopupDirection = CoachMarkPopupDirection.d;
        composer.o(1849434622);
        Object objG = composer.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (objG == composer$Companion$Empty$1) {
            objG = new CoachMarkState(z, null);
            composer.A(objG);
        }
        CoachMarkState coachMarkState = (CoachMarkState) objG;
        composer.l();
        composer.o(-1633490746);
        if ((((i & 14) ^ 6) <= 4 || !composer.p(z)) && (i & 6) != 4) {
            z2 = false;
        }
        Object objG2 = composer.G();
        if (z2 || objG2 == composer$Companion$Empty$1) {
            objG2 = new au.com.woolworths.foundation.shop.video.advertising.ui.c(coachMarkState, z, 2);
            composer.A(objG2);
        }
        composer.l();
        composer.g((Function0) objG2);
        composer.l();
        return coachMarkState;
    }
}
