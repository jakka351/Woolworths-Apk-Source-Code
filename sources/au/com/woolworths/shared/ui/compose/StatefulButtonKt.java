package au.com.woolworths.shared.ui.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.VectorResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.button.SecondaryButtonKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/customviews/statefulbutton/StatefulButtonState;", "statefulButtonState", "shared-ui-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class StatefulButtonKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10091a;

        static {
            int[] iArr = new int[StatefulButtonState.values().length];
            try {
                StatefulButtonState statefulButtonState = StatefulButtonState.d;
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f10091a = iArr;
        }
    }

    public static final void a(int i, Composer composer, Modifier modifier, String str) {
        int i2;
        ComposerImpl composerImplV = composer.v(-1455287846);
        if ((i & 6) == 0) {
            i2 = i | (composerImplV.n(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            long jH = WxTheme.a(composerImplV).h();
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            Modifier modifierB = BackgroundKt.b(BorderKt.a(ClipKt.a(SizeKt.g(modifier, 36), RoundedCornerShapeKt.b(4)), 1, jH, rectangleShapeKt$RectangleShape$1), Color.b(WxTheme.a(composerImplV).h(), 0.06f), rectangleShapeKt$RectangleShape$1);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.e, Alignment.Companion.k, composerImplV, 54);
            int i3 = composerImplV.P;
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
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier.Companion companion = Modifier.Companion.d;
            IconKt.b(VectorResources_androidKt.b(com.woolworths.R.drawable.ic_stateful_button_checked_tick, 6, composerImplV), null, SizeKt.q(companion, 20), WxTheme.a(composerImplV).h(), composerImplV, 432, 0);
            Modifier modifierJ = PaddingKt.j(companion, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.g(upperCase, "toUpperCase(...)");
            TextKt.b(upperCase, modifierJ, WxTheme.a(composerImplV).h(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.a(WxTheme.b(composerImplV).n, 0L, 0L, FontWeight.m, null, 0L, 0L, null, null, 0, 16777211), composerImplV, 48, 0, 65528);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.quantitystepper.a(str, modifier, i, 6, (byte) 0);
        }
    }

    public static final void b(final String normalText, String checkedText, Modifier modifier, StatefulButtonState statefulButtonState, long j, final Function0 onClick, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        final StatefulButtonState statefulButtonState2;
        int i4;
        long jH;
        StatefulButtonState statefulButtonState3;
        long j2;
        Intrinsics.h(normalText, "normalText");
        Intrinsics.h(checkedText, "checkedText");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(1514242333);
        if ((i & 6) == 0) {
            i3 = (composerImplV.n(normalText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.n(checkedText) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= composerImplV.n(modifier) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerImplV.r(statefulButtonState == null ? -1 : statefulButtonState.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerImplV.I(onClick) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && composerImplV.c()) {
            composerImplV.j();
            statefulButtonState3 = statefulButtonState;
            j2 = j;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                statefulButtonState2 = i5 != 0 ? StatefulButtonState.d : statefulButtonState;
                i4 = i3 & (-57345);
                jH = WxTheme.a(composerImplV).h();
            } else {
                composerImplV.j();
                i4 = i3 & (-57345);
                statefulButtonState2 = statefulButtonState;
                jH = j;
            }
            composerImplV.W();
            d(ComposableLambdaKt.c(1837593106, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shared.ui.compose.StatefulButtonKt$PrimaryStatefulButton$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
                        StatefulButtonState statefulButtonState4 = StatefulButtonState.e;
                        StatefulButtonState statefulButtonState5 = statefulButtonState2;
                        PrimaryButtonKt.a(statefulButtonState5 == statefulButtonState4 ? "" : normalText, onClick, modifierE, statefulButtonState5 == StatefulButtonState.d, false, null, null, null, null, composer2, KyberEngine.KyberPolyBytes, 1008);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), checkedText, modifier2, statefulButtonState2, jH, composerImplV, (i4 & 7168) | (i4 & 112) | 6 | (i4 & 896));
            statefulButtonState3 = statefulButtonState2;
            j2 = jH;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.wx.component.button.a(normalText, checkedText, modifier, statefulButtonState3, j2, onClick, i, i2);
        }
    }

    public static final void c(final String normalText, final String checkedText, final Modifier modifier, StatefulButtonState statefulButtonState, long j, final Function0 onClick, Composer composer, final int i) {
        int i2;
        Modifier modifier2;
        final StatefulButtonState statefulButtonState2;
        int i3;
        long jH;
        final StatefulButtonState statefulButtonState3;
        final long j2;
        Intrinsics.h(normalText, "normalText");
        Intrinsics.h(checkedText, "checkedText");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(2119283563);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(normalText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(checkedText) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int i4 = i2 | 3072;
        if ((i & 24576) == 0) {
            i4 = i2 | 11264;
        }
        if ((196608 & i) == 0) {
            i4 |= composerImplV.I(onClick) ? 131072 : 65536;
        }
        if ((74899 & i4) == 74898 && composerImplV.c()) {
            composerImplV.j();
            statefulButtonState3 = statefulButtonState;
            j2 = j;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                int i5 = i4 & (-57345);
                statefulButtonState2 = StatefulButtonState.d;
                i3 = i5;
                jH = WxTheme.a(composerImplV).h();
            } else {
                composerImplV.j();
                i3 = i4 & (-57345);
                statefulButtonState2 = statefulButtonState;
                jH = j;
            }
            composerImplV.W();
            d(ComposableLambdaKt.c(-673236192, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shared.ui.compose.StatefulButtonKt$SecondaryStatefulButton$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
                        StatefulButtonState statefulButtonState4 = StatefulButtonState.e;
                        StatefulButtonState statefulButtonState5 = statefulButtonState2;
                        SecondaryButtonKt.b(statefulButtonState5 == statefulButtonState4 ? "" : normalText, onClick, modifierE, statefulButtonState5 == StatefulButtonState.d, false, null, null, composer2, KyberEngine.KyberPolyBytes, 112);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), checkedText, modifier2, statefulButtonState2, jH, composerImplV, (i3 & 7168) | (i3 & 112) | 6 | (i3 & 896));
            statefulButtonState3 = statefulButtonState2;
            j2 = jH;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.shared.ui.compose.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    StatefulButtonKt.c(normalText, checkedText, modifier, statefulButtonState3, j2, onClick, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void d(ComposableLambdaImpl composableLambdaImpl, String str, Modifier modifier, StatefulButtonState statefulButtonState, long j, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        boolean z;
        boolean z2;
        ComposerImpl composerImplV = composer.v(-788401127);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.r(statefulButtonState == null ? -1 : statefulButtonState.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.s(j) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            int i4 = WhenMappings.f10091a[statefulButtonState.ordinal()];
            Modifier.Companion companion = Modifier.Companion.d;
            if (i4 == 1) {
                composerImplV.o(-718654920);
                a(((i2 >> 3) & 14) | 48, composerImplV, PaddingKt.h(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, 6, 1), str);
                composerImplV.V(false);
                composerImpl = composerImplV;
                z = true;
            } else {
                composerImplV.o(-718382585);
                composableLambdaImpl.invoke(composerImplV, Integer.valueOf(i2 & 14));
                if (statefulButtonState == StatefulButtonState.e) {
                    z = true;
                    z2 = false;
                    ProgressIndicatorKt.b(2, 0, ((i2 >> 9) & 112) | KyberEngine.KyberPolyBytes, 24, j, 0L, composerImplV, BoxScopeInstance.f944a.g(SizeKt.q(companion, 16), Alignment.Companion.e));
                    composerImpl = composerImplV;
                } else {
                    composerImpl = composerImplV;
                    z = true;
                    z2 = false;
                }
                composerImpl.V(z2);
            }
            composerImpl.V(z);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.buttons.b(composableLambdaImpl, str, modifier, statefulButtonState, j, i);
        }
    }
}
