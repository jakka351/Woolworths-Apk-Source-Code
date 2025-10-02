package au.com.woolworths.feature.shop.inbox.ui;

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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.design.core.ui.component.experimental.CardKt;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.homepage.presentation.modeselector.d;
import au.com.woolworths.feature.shop.inbox.domain.LastUnreadChatbotMessageItem;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"inbox_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MessageUsBannerKt {
    public static final void a(final LastUnreadChatbotMessageItem item, final Function0 onClickMessage, Modifier modifier, Composer composer, int i) {
        Intrinsics.h(item, "item");
        Intrinsics.h(onClickMessage, "onClickMessage");
        ComposerImpl composerImplV = composer.v(-1756925710);
        if ((((composerImplV.n(item) ? 4 : 2) | i | (composerImplV.I(onClickMessage) ? 32 : 16) | KyberEngine.KyberPolyBytes) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(1389976910, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.inbox.ui.MessageUsBannerKt$MessageUsBanner$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    final TextStyle textStyle;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final LastUnreadChatbotMessageItem lastUnreadChatbotMessageItem = item;
                        if (lastUnreadChatbotMessageItem.e) {
                            composer2.o(1022470584);
                            textStyle = CoreTheme.f(composer2).f5120a.b.f5123a;
                            composer2.l();
                        } else {
                            composer2.o(1022536025);
                            textStyle = CoreTheme.f(composer2).f5120a.b.b;
                            composer2.l();
                        }
                        composer2.o(32991243);
                        String strC = !lastUnreadChatbotMessageItem.e ? StringResources_androidKt.c(composer2, R.string.inbox_message_us_banner_new_message_label) : "";
                        composer2.l();
                        String strB = StringResources_androidKt.b(R.string.inbox_message_us_banner_content_description, new Object[]{strC, lastUnreadChatbotMessageItem.f7287a, lastUnreadChatbotMessageItem.b}, composer2);
                        float f = 16;
                        Modifier modifierA = TestTagKt.a(SizeKt.e(PaddingKt.g(Modifier.Companion.d, f, f), 1.0f), "MessageUsBanner");
                        composer2.o(5004770);
                        boolean zN = composer2.n(strB);
                        Object objG = composer2.G();
                        if (zN || objG == Composer.Companion.f1624a) {
                            objG = new au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.a(strB, 8);
                            composer2.A(objG);
                        }
                        composer2.l();
                        CardKt.b(onClickMessage, SemanticsModifierKt.a(modifierA, (Function1) objG), false, null, 0L, 0L, 0L, 0L, null, null, null, ComposableLambdaKt.c(-2060855309, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.inbox.ui.MessageUsBannerKt$MessageUsBanner$1.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                Function2 function2;
                                ColumnScope Card = (ColumnScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(Card, "$this$Card");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    float f2 = 16;
                                    Modifier.Companion companion = Modifier.Companion.d;
                                    Modifier modifierG = PaddingKt.g(companion, f2, 12);
                                    composer3.o(1849434622);
                                    Object objG2 = composer3.G();
                                    if (objG2 == Composer.Companion.f1624a) {
                                        objG2 = new d(14);
                                        composer3.A(objG2);
                                    }
                                    composer3.l();
                                    Modifier modifierE = SizeKt.e(SemanticsModifierKt.a(modifierG, (Function1) objG2), 1.0f);
                                    RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composer3, 0);
                                    int p = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                    Modifier modifierD = ComposedModifierKt.d(composer3, modifierE);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function0 = ComposeUiNode.Companion.b;
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function0);
                                    } else {
                                        composer3.e();
                                    }
                                    Function2 function22 = ComposeUiNode.Companion.g;
                                    Updater.b(composer3, rowMeasurePolicyA, function22);
                                    Function2 function23 = ComposeUiNode.Companion.f;
                                    Updater.b(composer3, persistentCompositionLocalMapD, function23);
                                    Function2 function24 = ComposeUiNode.Companion.j;
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                        androidx.camera.core.impl.b.z(p, composer3, p, function24);
                                    }
                                    Function2 function25 = ComposeUiNode.Companion.d;
                                    Updater.b(composer3, modifierD, function25);
                                    Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, 11);
                                    Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
                                    BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
                                    ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composer3, 0);
                                    int p2 = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer3.d();
                                    Modifier modifierD2 = ComposedModifierKt.d(composer3, modifierJ);
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function0);
                                    } else {
                                        composer3.e();
                                    }
                                    Updater.b(composer3, columnMeasurePolicyA, function22);
                                    Updater.b(composer3, persistentCompositionLocalMapD2, function23);
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p2))) {
                                        androidx.camera.core.impl.b.z(p2, composer3, p2, function24);
                                    }
                                    Updater.b(composer3, modifierD2, function25);
                                    Modifier modifierQ = SizeKt.q(companion, 48);
                                    MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                                    int p3 = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer3.d();
                                    Modifier modifierD3 = ComposedModifierKt.d(composer3, modifierQ);
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function0);
                                    } else {
                                        composer3.e();
                                    }
                                    Updater.b(composer3, measurePolicyD, function22);
                                    Updater.b(composer3, persistentCompositionLocalMapD3, function23);
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p3))) {
                                        androidx.camera.core.impl.b.z(p3, composer3, p3, function24);
                                    }
                                    Updater.b(composer3, modifierD3, function25);
                                    ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_message_us, 0, composer3), null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, composer3, 48, 124);
                                    composer3.o(1512194736);
                                    LastUnreadChatbotMessageItem lastUnreadChatbotMessageItem2 = lastUnreadChatbotMessageItem;
                                    if (!lastUnreadChatbotMessageItem2.e) {
                                        BoxKt.a(BackgroundKt.b(SizeKt.q(PaddingKt.j(BoxScopeInstance.f944a.g(companion, Alignment.Companion.c), BitmapDescriptorFactory.HUE_RED, 6, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 8), CoreTheme.d(composer3).f4872a.h, RoundedCornerShapeKt.f1100a), composer3, 0);
                                    }
                                    composer3.l();
                                    composer3.f();
                                    composer3.f();
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
                                    float f3 = 8;
                                    Modifier modifierJ2 = PaddingKt.j(rowScopeInstance.a(companion, 1.0f, true), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, BitmapDescriptorFactory.HUE_RED, 11);
                                    ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composer3, 0);
                                    int p4 = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD4 = composer3.d();
                                    Modifier modifierD4 = ComposedModifierKt.d(composer3, modifierJ2);
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function0);
                                    } else {
                                        composer3.e();
                                    }
                                    Updater.b(composer3, columnMeasurePolicyA2, function22);
                                    Updater.b(composer3, persistentCompositionLocalMapD4, function23);
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p4))) {
                                        function2 = function24;
                                        androidx.camera.core.impl.b.z(p4, composer3, p4, function2);
                                    } else {
                                        function2 = function24;
                                    }
                                    Updater.b(composer3, modifierD4, function25);
                                    Function2 function26 = function2;
                                    TextKt.b(StringResources_androidKt.c(composer3, R.string.inbox_message_us_banner_title), PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, 7), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer3).f5120a.f5121a.b, composer3, 48, 0, 65532);
                                    TextKt.b(lastUnreadChatbotMessageItem2.b, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 3, 0, null, textStyle, composer3, 0, 3072, 57342);
                                    composer3.f();
                                    Modifier modifierB = rowScopeInstance.b(companion, Alignment.Companion.k);
                                    ColumnMeasurePolicy columnMeasurePolicyA3 = ColumnKt.a(arrangement$Top$1, horizontal, composer3, 0);
                                    int p5 = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD5 = composer3.d();
                                    Modifier modifierD5 = ComposedModifierKt.d(composer3, modifierB);
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function0);
                                    } else {
                                        composer3.e();
                                    }
                                    Updater.b(composer3, columnMeasurePolicyA3, function22);
                                    Updater.b(composer3, persistentCompositionLocalMapD5, function23);
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p5))) {
                                        androidx.camera.core.impl.b.z(p5, composer3, p5, function26);
                                    }
                                    Updater.b(composer3, modifierD5, function25);
                                    IconKt.b(CoreTheme.e(composer3).e.n, null, PaddingKt.j(companion, f3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), CoreTheme.b(composer3).e.c.d, composer3, 432, 0);
                                    composer3.f();
                                    composer3.f();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 0, 2044);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            modifier = Modifier.Companion.d;
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(item, onClickMessage, modifier2, i, 23);
        }
    }
}
