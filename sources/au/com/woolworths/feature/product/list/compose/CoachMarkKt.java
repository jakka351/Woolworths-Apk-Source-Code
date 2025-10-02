package au.com.woolworths.feature.product.list.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import au.com.woolworths.design.wx.component.icon.IconKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"", "tooltipHeight", "Landroidx/compose/ui/geometry/Rect;", "refinedSpotLightRect", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
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
                CoachMarkPopupDirection[] coachMarkPopupDirectionArr = CoachMarkPopupDirection.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final void a(final Rect spotLightRect, Function0 onDismissRequest, float f, float f2, boolean z, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        boolean z2;
        final ComposableLambdaImpl composableLambdaImpl2;
        float f3;
        CoachMarkPopupDirection[] coachMarkPopupDirectionArr = CoachMarkPopupDirection.d;
        Intrinsics.h(spotLightRect, "spotLightRect");
        Intrinsics.h(onDismissRequest, "onDismissRequest");
        ComposerImpl composerImplV = composer.v(-837387215);
        int i2 = i | (composerImplV.n(spotLightRect) ? 4 : 2) | (composerImplV.I(onDismissRequest) ? 256 : 128) | 24576;
        if ((599187 & i2) == 599186 && composerImplV.c()) {
            composerImplV.j();
            f3 = f2;
            z2 = z;
            composableLambdaImpl2 = composableLambdaImpl;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotIntStateKt.a(0);
                composerImplV.A(objG);
            }
            final MutableIntState mutableIntState = (MutableIntState) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == composer$Companion$Empty$1) {
                float f4 = (int) 0;
                objD = SnapshotStateKt.f(RectKt.a((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), IntSizeKt.d(0L)));
                composerImplV.A(objD);
            }
            MutableState mutableState = (MutableState) objD;
            composerImplV.V(false);
            final float f5 = 16 + ((Rect) mutableState.getD()).d;
            FillElement fillElement = SizeKt.c;
            composerImplV.o(-1746271574);
            boolean z3 = (i2 & 14) == 4;
            Object objG2 = composerImplV.G();
            if (z3 || objG2 == composer$Companion$Empty$1) {
                z2 = z;
                objG2 = new h(z2, spotLightRect, mutableState, 0);
                composerImplV.A(objG2);
            } else {
                z2 = z;
            }
            composerImplV.V(false);
            c((Rect) mutableState.getD(), 0.5f, f, OnGloballyPositionedModifierKt.a(fillElement, (Function1) objG2), composerImplV, 432);
            PopupProperties popupProperties = new PopupProperties(true, 14);
            PopupPositionProvider popupPositionProvider = new PopupPositionProvider() { // from class: au.com.woolworths.feature.product.list.compose.CoachMarkKt$CoachMark$2
                @Override // androidx.compose.ui.window.PopupPositionProvider
                public final long a(IntRect anchorBounds, long j, LayoutDirection layoutDirection, long j2) {
                    Intrinsics.h(anchorBounds, "anchorBounds");
                    Intrinsics.h(layoutDirection, "layoutDirection");
                    mutableIntState.i((int) (j2 & 4294967295L));
                    return ((anchorBounds.b + ((int) f5)) & 4294967295L) | (anchorBounds.f2201a << 32);
                }
            };
            composableLambdaImpl2 = composableLambdaImpl;
            composerImplV = composerImplV;
            AndroidPopup_androidKt.a(popupPositionProvider, onDismissRequest, popupProperties, ComposableLambdaKt.c(-1666233393, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.CoachMarkKt$CoachMark$3
                {
                    CoachMarkPopupDirection[] coachMarkPopupDirectionArr2 = CoachMarkPopupDirection.d;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierB = BackgroundKt.b(Modifier.Companion.d, Color.j, RectangleShapeKt.f1779a);
                        CoachMarkPopupDirection[] coachMarkPopupDirectionArr2 = CoachMarkPopupDirection.d;
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierB);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        composer2.o(1083655598);
                        Rect rect = spotLightRect;
                        int i3 = (int) rect.f1752a;
                        CoachMarkKt.b(BitmapDescriptorFactory.HUE_RED, YU.a.D((int) rect.c, i3, 2, i3), 390, composer2);
                        composer2.l();
                        composableLambdaImpl2.invoke(composer2, 0);
                        composer2.o(1083665582);
                        CoachMarkPopupDirection[] coachMarkPopupDirectionArr3 = CoachMarkPopupDirection.d;
                        composer2.l();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i2 >> 3) & 112) | 3456, 0);
            f3 = 0.5f;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new i(spotLightRect, onDismissRequest, f, f3, z2, composableLambdaImpl2, i, 0);
        }
    }

    public static final void b(float f, int i, int i2, Composer composer) {
        ComposerImpl composerImplV = composer.v(-1195058510);
        int i3 = (composerImplV.r(i) ? 32 : 16) | i2;
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f2 = 24;
            Modifier modifierB = ColumnScopeInstance.f948a.b(Modifier.Companion.d, Alignment.Companion.m);
            composerImplV.o(-1633490746);
            boolean z = (i3 & 112) == 32;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new f(f2, i, 0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            IconKt.a(PainterResources_androidKt.a(R.drawable.ic_coach_mark_arrow, 0, composerImplV), null, RotateKt.a(SizeKt.r(OffsetKt.a(modifierB, (Function1) objG), f2, 12), f), Color.f, composerImplV, 3120, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(f, i, i2, 0);
        }
    }

    public static final void c(Rect rect, float f, float f2, Modifier modifier, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-1168719684);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(rect) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.q(f) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.q(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(modifier) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-1746271574);
            boolean z = ((i2 & 14) == 4) | ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new j(rect, f2, f, 0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            CanvasKt.a(modifier, (Function1) objG, composerImplV, (i2 >> 9) & 14);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new k(rect, f, f2, modifier, i, 0);
        }
    }

    public static final Rect d(LayoutCoordinates layoutCoordinates) {
        Intrinsics.h(layoutCoordinates, "<this>");
        if (layoutCoordinates.q()) {
            long jY = layoutCoordinates.y(0L);
            return RectKt.a(Offset.a(jY, Float.intBitsToFloat((int) (jY & 4294967295L)), 1), IntSizeKt.d(layoutCoordinates.a()));
        }
        return RectKt.a((Float.floatToRawIntBits(r9) & 4294967295L) | (Float.floatToRawIntBits((int) 0) << 32), IntSizeKt.d(0L));
    }
}
