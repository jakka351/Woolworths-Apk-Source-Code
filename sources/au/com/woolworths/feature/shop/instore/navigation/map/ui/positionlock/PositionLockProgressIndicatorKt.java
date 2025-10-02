package au.com.woolworths.feature.shop.instore.navigation.map.ui.positionlock;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.d0;
import au.com.woolworths.feature.shop.contentpage.ui.c;
import au.com.woolworths.shared.ui.compose.GradientHorizontalProgressIndicatorKt;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResultImpl;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\b²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"", "loaded", "Lcom/airbnb/lottie/LottieComposition;", "lottieCompositionResult", "", "textWidthPx", "", "progress", "instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PositionLockProgressIndicatorKt {
    public static final void a(String title, Float f, Function1 onTrackOriientAppEvent, Modifier modifier, Function0 function0, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        Modifier modifier2;
        Function0 function02;
        Intrinsics.h(title, "title");
        Intrinsics.h(onTrackOriientAppEvent, "onTrackOriientAppEvent");
        ComposerImpl composerImplV = composer.v(615937814);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(title) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(f) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onTrackOriientAppEvent) ? 256 : 128;
        }
        int i3 = i2 | 27648;
        if ((i3 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            function02 = function0;
            composerImpl = composerImplV;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new h(20);
                composerImplV.A(objG);
            }
            Function0 function03 = (Function0) objG;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean z = (i3 & 896) == 256;
            Object objG2 = composerImplV.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                objG2 = new c(18, onTrackOriientAppEvent);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.c(Unit.f24250a, (Function1) objG2, composerImplV);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
            ComposeUiNode.e3.getClass();
            Function0 function04 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function04);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicyD, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                b.B(i4, composerImplV, i4, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Object objF = a.f(composerImplV, modifierD, function24, 1849434622);
            if (objF == composer$Companion$Empty$1) {
                objF = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objF);
            }
            MutableState mutableState = (MutableState) objF;
            composerImplV.V(false);
            LottieCompositionResultImpl lottieCompositionResultImplC = RememberLottieCompositionKt.c(new LottieCompositionSpec.RawRes(R.raw.footsteps), composerImplV, 0);
            if (((Boolean) lottieCompositionResultImplC.j.getD()).booleanValue() && !((Boolean) mutableState.getD()).booleanValue()) {
                function03.invoke();
                mutableState.setValue(Boolean.TRUE);
            }
            float f2 = 16;
            float f3 = 8;
            Modifier modifierI = PaddingKt.i(BackgroundKt.b(companion, ColorKt.d(4282009422L), RoundedCornerShapeKt.b(12)), f2, f3, 20, f3);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.n;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.h(f2, horizontal), Alignment.Companion.k, composerImplV, 54);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierI);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function04);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            composerImplV.o(-2027509669);
            LottieAnimationKt.a(lottieCompositionResultImplC.getD(), SizeKt.q(companion, 40), null, Integer.MAX_VALUE, null, null, ContentScale.Companion.b, false, composerImplV, 1572912, 196608, 2064316);
            composerImplV.V(false);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(2), horizontal, composerImplV, 54);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function04);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                b.B(i6, composerImplV, i6, function23);
            }
            Object objF2 = a.f(composerImplV, modifierD3, function24, 1849434622);
            if (objF2 == composer$Companion$Empty$1) {
                objF2 = SnapshotIntStateKt.a(600);
                composerImplV.A(objF2);
            }
            MutableIntState mutableIntState = (MutableIntState) objF2;
            Object objD = a.d(5004770, composerImplV, false);
            if (objD == composer$Companion$Empty$1) {
                objD = new au.com.woolworths.feature.product.list.compose.productsearch.b(9, mutableIntState);
                composerImplV.A(objD);
            }
            composerImplV.V(false);
            TextKt.b(title, OnGloballyPositionedModifierKt.a(companion, (Function1) objD), Color.f, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.a(WxTheme.b(composerImplV).l, 0L, 0L, null, null, 0L, 0L, new PlatformTextStyle(false), null, 0, 16252927), composerImplV, (i3 & 14) | 432, 0, 65528);
            composerImpl = composerImplV;
            composerImpl.o(-1431506163);
            float fFloatValue = f.floatValue();
            int iD = mutableIntState.d();
            composerImpl.o(745662435);
            float e = iD / ((Density) composerImpl.x(CompositionLocalsKt.h)).getE();
            composerImpl.V(false);
            GradientHorizontalProgressIndicatorKt.a(fFloatValue, SizeKt.g(SizeKt.u(companion, e), f3), null, null, 0, composerImpl, 0);
            composerImpl.V(false);
            composerImpl.V(true);
            composerImpl.V(true);
            composerImpl.V(true);
            modifier2 = companion;
            function02 = function03;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d0((Object) title, (Object) f, (Object) onTrackOriientAppEvent, modifier2, (Object) function02, i, 11);
        }
    }
}
