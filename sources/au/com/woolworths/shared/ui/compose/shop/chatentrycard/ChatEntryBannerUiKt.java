package au.com.woolworths.shared.ui.compose.shop.chatentrycard;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt;
import au.com.woolworths.design.core.ui.component.experimental.CardKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.foundation.rewards.common.ui.b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shared-ui-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ChatEntryBannerUiKt {
    public static final void a(ChatEntryCardV3 chatEntryCardV3, Function1 onBannerClick, Composer composer, int i) {
        Intrinsics.h(onBannerClick, "onBannerClick");
        ComposerImpl composerImplV = composer.v(-1307389790);
        if ((((composerImplV.I(chatEntryCardV3) ? 4 : 2) | i | (composerImplV.I(onBannerClick) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = AnimatableKt.a(0.3f);
                composerImplV.A(objG);
            }
            Animatable animatable = (Animatable) objG;
            Object objD = a.d(1849434622, composerImplV, false);
            if (objD == composer$Companion$Empty$1) {
                objD = AnimatableKt.a(BitmapDescriptorFactory.HUE_RED);
                composerImplV.A(objD);
            }
            Animatable animatable2 = (Animatable) objD;
            Object objD2 = a.d(1849434622, composerImplV, false);
            if (objD2 == composer$Companion$Empty$1) {
                objD2 = SnapshotStateKt.f(Boolean.TRUE);
                composerImplV.A(objD2);
            }
            composerImplV.V(false);
            float f = 16;
            Modifier modifierE = SizeKt.e(PaddingKt.g(Modifier.Companion.d, f, 20), 1.0f);
            WaveBackgroundModifierKt.b((MutableState) objD2, animatable, animatable2, f, modifierE, b(chatEntryCardV3, onBannerClick, modifierE, composerImplV, 0), composerImplV, 28230);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(chatEntryCardV3, i, 7, onBannerClick);
        }
    }

    public static final ComposableLambdaImpl b(final ChatEntryCardV3 chatEntryCardV3, final Function1 function1, final Modifier modifier, Composer composer, int i) {
        composer.o(-1159832306);
        if ((i & 4) != 0) {
            modifier = Modifier.Companion.d;
        }
        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(745239505, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shared.ui.compose.shop.chatentrycard.ChatEntryBannerUiKt$chatEntryBannerUi$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                    composer2.j();
                } else {
                    final Function1 function12 = function1;
                    final ChatEntryCardV3 chatEntryCardV32 = chatEntryCardV3;
                    final Modifier modifier2 = modifier;
                    CoreThemeKt.c(6, composer2, ComposableLambdaKt.c(1045685749, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shared.ui.compose.shop.chatentrycard.ChatEntryBannerUiKt$chatEntryBannerUi$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer3 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                composer3.j();
                            } else {
                                RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(16);
                                CoreElevation coreElevation = CoreTheme.c(composer3).f4876a;
                                Modifier modifierA = TestTagKt.a(modifier2, "chatEntryBanner");
                                composer3.o(-1633490746);
                                Function1 function13 = function12;
                                boolean zN = composer3.n(function13);
                                final ChatEntryCardV3 chatEntryCardV33 = chatEntryCardV32;
                                boolean zI = zN | composer3.I(chatEntryCardV33);
                                Object objG = composer3.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new au.com.woolworths.sdui.common.alert.a(5, function13, chatEntryCardV33);
                                    composer3.A(objG);
                                }
                                composer3.l();
                                CardKt.b((Function0) objG, modifierA, false, roundedCornerShapeB, 0L, 0L, 0L, 0L, coreElevation, null, null, ComposableLambdaKt.c(110827056, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shared.ui.compose.shop.chatentrycard.ChatEntryBannerUiKt.chatEntryBannerUi.1.1.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                        ColumnScope Card = (ColumnScope) obj5;
                                        Composer composer4 = (Composer) obj6;
                                        int iIntValue = ((Number) obj7).intValue();
                                        Intrinsics.h(Card, "$this$Card");
                                        if ((iIntValue & 17) == 16 && composer4.c()) {
                                            composer4.j();
                                        } else {
                                            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
                                            BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
                                            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composer4, 0);
                                            int p = composer4.getP();
                                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer4.d();
                                            Modifier.Companion companion = Modifier.Companion.d;
                                            Modifier modifierD = ComposedModifierKt.d(composer4, companion);
                                            ComposeUiNode.e3.getClass();
                                            Function0 function0 = ComposeUiNode.Companion.b;
                                            if (composer4.w() == null) {
                                                ComposablesKt.b();
                                                throw null;
                                            }
                                            composer4.i();
                                            if (composer4.getO()) {
                                                composer4.K(function0);
                                            } else {
                                                composer4.e();
                                            }
                                            Function2 function2 = ComposeUiNode.Companion.g;
                                            Updater.b(composer4, columnMeasurePolicyA, function2);
                                            Function2 function22 = ComposeUiNode.Companion.f;
                                            Updater.b(composer4, persistentCompositionLocalMapD, function22);
                                            Function2 function23 = ComposeUiNode.Companion.j;
                                            if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p))) {
                                                androidx.camera.core.impl.b.z(p, composer4, p, function23);
                                            }
                                            Function2 function24 = ComposeUiNode.Companion.d;
                                            Updater.b(composer4, modifierD, function24);
                                            float f = 8;
                                            Modifier modifierG = PaddingKt.g(BackgroundKt.b(SizeKt.e(companion, 1.0f), CoreTheme.b(composer4).e.f4848a.d, RectangleShapeKt.f1779a), f, f);
                                            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                                            int p2 = composer4.getP();
                                            PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer4.d();
                                            Modifier modifierD2 = ComposedModifierKt.d(composer4, modifierG);
                                            if (composer4.w() == null) {
                                                ComposablesKt.b();
                                                throw null;
                                            }
                                            composer4.i();
                                            if (composer4.getO()) {
                                                composer4.K(function0);
                                            } else {
                                                composer4.e();
                                            }
                                            Updater.b(composer4, measurePolicyD, function2);
                                            Updater.b(composer4, persistentCompositionLocalMapD2, function22);
                                            if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p2))) {
                                                androidx.camera.core.impl.b.z(p2, composer4, p2, function23);
                                            }
                                            Updater.b(composer4, modifierD2, function24);
                                            Modifier modifierE = SizeKt.e(companion, 1.0f);
                                            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer4, 48);
                                            int p3 = composer4.getP();
                                            PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer4.d();
                                            Modifier modifierD3 = ComposedModifierKt.d(composer4, modifierE);
                                            if (composer4.w() == null) {
                                                ComposablesKt.b();
                                                throw null;
                                            }
                                            composer4.i();
                                            if (composer4.getO()) {
                                                composer4.K(function0);
                                            } else {
                                                composer4.e();
                                            }
                                            Updater.b(composer4, rowMeasurePolicyA, function2);
                                            Updater.b(composer4, persistentCompositionLocalMapD3, function22);
                                            if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p3))) {
                                                androidx.camera.core.impl.b.z(p3, composer4, p3, function23);
                                            }
                                            Updater.b(composer4, modifierD3, function24);
                                            AskOliveIconLottieKt.a(composer4, 0);
                                            Modifier modifierA2 = RowScopeInstance.f974a.a(PaddingKt.j(companion, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), 1.0f, true);
                                            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(Arrangement.e, horizontal, composer4, 54);
                                            int p4 = composer4.getP();
                                            PersistentCompositionLocalMap persistentCompositionLocalMapD4 = composer4.d();
                                            Modifier modifierD4 = ComposedModifierKt.d(composer4, modifierA2);
                                            if (composer4.w() == null) {
                                                ComposablesKt.b();
                                                throw null;
                                            }
                                            composer4.i();
                                            if (composer4.getO()) {
                                                composer4.K(function0);
                                            } else {
                                                composer4.e();
                                            }
                                            Updater.b(composer4, columnMeasurePolicyA2, function2);
                                            Updater.b(composer4, persistentCompositionLocalMapD4, function22);
                                            if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p4))) {
                                                androidx.camera.core.impl.b.z(p4, composer4, p4, function23);
                                            }
                                            Updater.b(composer4, modifierD4, function24);
                                            ChatEntryCardV3 chatEntryCardV34 = chatEntryCardV33;
                                            TextKt.a(chatEntryCardV34.f10101a, CoreTheme.f(composer4).e.f5133a.b, null, CoreTheme.b(composer4).e.c.d, null, 0, 2, false, 1, null, composer4, 102236160, 692);
                                            composer4.o(-581738466);
                                            int i2 = 2;
                                            Iterator it = CollectionsKt.w0(chatEntryCardV34.c, 2).iterator();
                                            while (it.hasNext()) {
                                                TextKt.a((String) it.next(), CoreTheme.f(composer4).f5120a.c.f5124a, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, i2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), CoreTheme.b(composer4).e.c.d, null, 0, 2, false, 1, null, composer4, 102236544, 688);
                                                i2 = i2;
                                            }
                                            composer4.l();
                                            composer4.f();
                                            composer4.f();
                                            composer4.o(-1207101085);
                                            if (Intrinsics.c(chatEntryCardV34.b, Boolean.TRUE)) {
                                                ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_chat_banner_bbs_beta, 0, composer4), "Beta", BoxScopeInstance.f944a.g(companion, Alignment.Companion.c), null, null, BitmapDescriptorFactory.HUE_RED, null, composer4, 48, 120);
                                            }
                                            composer4.l();
                                            composer4.f();
                                            composer4.f();
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer3), composer3, 0, 1780);
                            }
                            return Unit.f24250a;
                        }
                    }, composer2));
                }
                return Unit.f24250a;
            }
        }, composer);
        composer.l();
        return composableLambdaImplC;
    }
}
