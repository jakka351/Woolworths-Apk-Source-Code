package au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets;

import androidx.compose.animation.TransitionKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RadialGradient;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientHeading;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientPosition;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$showUserPositionOnMap$lambda$16$lambda$15$$inlined$mapNotNull$1;
import au.com.woolworths.feature.shop.instore.navigation.map.utils.UtilsKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\n²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/widgets/UserPositionMarkerData;", "data", "", "size", "currentAngle", "startAngle", "Landroidx/compose/ui/graphics/Color;", "animatedBackgroundColor", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/OriientPosition;", "position", "instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class UserPositionMarkerKt {
    public static final void a(OriientPosition userPosition, float f, Modifier modifier, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        float f2;
        long j;
        Intrinsics.h(userPosition, "userPosition");
        double d = userPosition.d;
        boolean z = userPosition.e;
        ComposerImpl composerImplV = composer.v(-2002024710);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(userPosition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.q(f) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            OriientHeading oriientHeading = userPosition.b;
            float degrees = (float) Math.toDegrees(Math.atan2(oriientHeading.b, oriientHeading.f7340a));
            float f3 = 30;
            State stateB = AnimateAsStateKt.b((((float) d) * f3) + f3, AnimationSpecKt.e(1000, 0, null, 6), "sizeAnimation", null, composerImplV, 3120, 20);
            float f4 = (f - degrees) - 30.0f;
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
                composerImplV.A(objG);
            }
            MutableFloatState mutableFloatState = (MutableFloatState) objG;
            composerImplV.V(false);
            float fA = UtilsKt.a(mutableFloatState.a(), f4, composerImplV, 0) + mutableFloatState.a();
            final State stateB2 = AnimateAsStateKt.b(fA, AnimationSpecKt.e(1000, 0, null, 6), "targetStartAngleAnimation", null, composerImplV, 3120, 20);
            if (((Number) stateB2.getD()).floatValue() == fA) {
                mutableFloatState.p(fA);
            }
            if (z) {
                composerImplV.o(199642713);
                i3 = R.color.user_dot;
            } else {
                composerImplV.o(199643902);
                i3 = R.color.user_dot_lost;
            }
            final long jA = ColorResources_androidKt.a(composerImplV, i3);
            composerImplV.V(false);
            final long jA2 = ColorResources_androidKt.a(composerImplV, R.color.user_dot_outline);
            if (z) {
                composerImplV.o(199648893);
                i4 = R.color.user_heading;
            } else {
                composerImplV.o(199650198);
                i4 = R.color.clear;
            }
            final long jA3 = ColorResources_androidKt.a(composerImplV, i4);
            composerImplV.V(false);
            boolean z2 = d >= 2.0d && z;
            InfiniteTransition.TransitionAnimationState transitionAnimationStateA = TransitionKt.a(InfiniteTransitionKt.c("infiniteTransition", composerImplV, 0), ColorKt.d(3701602946L), ColorKt.d(3693646338L), AnimationSpecKt.a(4, 0L, AnimationSpecKt.e(600, 0, EasingKt.d, 2), RepeatMode.e), composerImplV, 29112, 0);
            composerImplV = composerImplV;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.h;
            final float e = ((Density) composerImplV.x(staticProvidableCompositionLocal)).getE() * 70.0f;
            final float e2 = ((Density) composerImplV.x(staticProvidableCompositionLocal)).getE() * 25;
            final float e3 = ((Density) composerImplV.x(staticProvidableCompositionLocal)).getE() * 15.0f;
            float e4 = ((Density) composerImplV.x(staticProvidableCompositionLocal)).getE() * 10.0f;
            Modifier modifierA = ClipKt.a(SizeKt.q(modifier, ((Number) stateB.getD()).floatValue()), RoundedCornerShapeKt.f1100a);
            if (z2) {
                f2 = e4;
                j = ((Color) transitionAnimationStateA.getD()).f1766a;
            } else {
                f2 = e4;
                j = Color.j;
            }
            Modifier modifierB = BackgroundKt.b(modifierA, j, RectangleShapeKt.f1779a);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i5 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            FillElement fillElement = SizeKt.c;
            composerImplV.o(-1224400529);
            final float f5 = f2;
            boolean zQ = composerImplV.q(e) | composerImplV.s(jA) | composerImplV.s(jA3) | composerImplV.n(stateB2) | composerImplV.s(jA2) | composerImplV.q(e2) | composerImplV.q(e3) | composerImplV.q(f5);
            Object objG2 = composerImplV.G();
            if (zQ || objG2 == composer$Companion$Empty$1) {
                objG2 = new Function1() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        DrawScope Canvas = (DrawScope) obj;
                        Intrinsics.h(Canvas, "$this$Canvas");
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.M0() >> 32));
                        float f6 = e;
                        float f7 = f6 / 2;
                        float f8 = fIntBitsToFloat - f7;
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.M0() & 4294967295L)) - f7;
                        long j2 = jA;
                        Canvas.N1(new RadialGradient(CollectionsKt.R(new Color(j2), new Color(j2), new Color(Color.b(jA3, 0.1f))), (Float.floatToRawIntBits(f8 + f7) << 32) | (Float.floatToRawIntBits(f7 + fIntBitsToFloat2) & 4294967295L), f6 / 2.5f), ((Number) stateB2.getD()).floatValue(), 60.0f, true, (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32), (4294967295L & Float.floatToRawIntBits(f6)) | (Float.floatToRawIntBits(f6) << 32), (832 & 128) != 0 ? Fill.f1802a : null);
                        DrawScope.j0(Canvas, jA2, e2, 0L, null, 0, 124);
                        DrawScope.j0(Canvas, Color.f, e3, 0L, null, 0, 124);
                        DrawScope.j0(Canvas, j2, f5, 0L, null, 0, 124);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            CanvasKt.a(fillElement, (Function1) objG2, composerImplV, 6);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.progressindicator.b(userPosition, f, modifier, i);
        }
    }

    public static final void b(InstoreMapViewModel$showUserPositionOnMap$lambda$16$lambda$15$$inlined$mapNotNull$1 instoreMapViewModel$showUserPositionOnMap$lambda$16$lambda$15$$inlined$mapNotNull$1, Function1 onTrackOriientAppEvent, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.h(onTrackOriientAppEvent, "onTrackOriientAppEvent");
        ComposerImpl composerImplV = composer.v(-1103775828);
        int i2 = (composerImplV.I(instoreMapViewModel$showUserPositionOnMap$lambda$16$lambda$15$$inlined$mapNotNull$1) ? 4 : 2) | i | (composerImplV.I(onTrackOriientAppEvent) ? 32 : 16) | KyberEngine.KyberPolyBytes;
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            composerImplV.o(5004770);
            boolean z = (i2 & 112) == 32;
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z || objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.feature.shop.contentpage.ui.c(19, onTrackOriientAppEvent);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Unit unit = Unit.f24250a;
            EffectsKt.c(unit, (Function1) objG, composerImplV);
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = SnapshotStateKt.f(null);
                composerImplV.A(objG2);
            }
            MutableState mutableState = (MutableState) objG2;
            composerImplV.V(false);
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objG3;
            composerImplV.o(-1746271574);
            boolean zI = composerImplV.I(coroutineScope) | composerImplV.I(instoreMapViewModel$showUserPositionOnMap$lambda$16$lambda$15$$inlined$mapNotNull$1);
            Object objG4 = composerImplV.G();
            if (zI || objG4 == composer$Companion$Empty$1) {
                objG4 = new UserPositionMarkerKt$UserPositionMarker$2$1(coroutineScope, instoreMapViewModel$showUserPositionOnMap$lambda$16$lambda$15$$inlined$mapNotNull$1, mutableState, null);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, unit, (Function2) objG4);
            UserPositionMarkerData userPositionMarkerData = (UserPositionMarkerData) mutableState.getD();
            Modifier.Companion companion = Modifier.Companion.d;
            if (userPositionMarkerData != null) {
                a(userPositionMarkerData.f7408a, userPositionMarkerData.b, companion, composerImplV, KyberEngine.KyberPolyBytes);
            }
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(instoreMapViewModel$showUserPositionOnMap$lambda$16$lambda$15$$inlined$mapNotNull$1, onTrackOriientAppEvent, modifier2, i, 28);
        }
    }
}
