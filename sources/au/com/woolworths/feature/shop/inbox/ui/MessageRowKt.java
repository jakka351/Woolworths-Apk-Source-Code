package au.com.woolworths.feature.shop.inbox.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.foundation.AccentColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.v2.ui.g;
import au.com.woolworths.feature.shop.homepage.presentation.modeselector.d;
import au.com.woolworths.feature.shop.inbox.domain.NotificationItem;
import au.com.woolworths.feature.shop.inbox.ui.component.CategoryTagKt;
import au.com.woolworths.feature.shop.inbox.ui.component.LinkButtonKt;
import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"inbox_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MessageRowKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f7297a = -4;

    public static final void a(final NotificationItem item, final boolean z, final Function0 onCtaButtonClick, final Function0 onTncsButtonClick, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.h(item, "item");
        Intrinsics.h(onCtaButtonClick, "onCtaButtonClick");
        Intrinsics.h(onTncsButtonClick, "onTncsButtonClick");
        ComposerImpl composerImplV = composer.v(309863360);
        if (((i | (composerImplV.n(item) ? 4 : 2) | (composerImplV.p(z) ? 32 : 16) | (composerImplV.I(onCtaButtonClick) ? 256 : 128) | (composerImplV.I(onTncsButtonClick) ? 2048 : 1024) | 24576) & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            SurfaceKt.a(TestTagKt.a(companion, "MessageRow"), null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(-1998863356, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.inbox.ui.MessageRowKt$MessageRow$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Function0 function0;
                    Function2 function2;
                    MessageRowKt$MessageRow$1 messageRowKt$MessageRow$1;
                    Function2 function22;
                    Function2 function23;
                    Function2 function24;
                    Function0 function02;
                    Function2 function25;
                    float f;
                    RowScopeInstance rowScopeInstance;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        NotificationItem notificationItem = item;
                        InboxMessage inboxMessage = notificationItem.f7288a;
                        boolean z2 = inboxMessage.j;
                        float f2 = 16;
                        Modifier.Companion companion2 = Modifier.Companion.d;
                        Modifier modifierF = PaddingKt.f(companion2, f2);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$1, Alignment.Companion.j, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierF);
                        ComposeUiNode.e3.getClass();
                        Function0 function03 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function03);
                        } else {
                            composer2.e();
                        }
                        Function2 function26 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, rowMeasurePolicyA, function26);
                        Function2 function27 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function27);
                        Function2 function28 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function28);
                        }
                        Function2 function29 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function29);
                        composer2.o(1354254593);
                        if (!z2) {
                            MessageRowKt.b(z, SizeKt.g(companion2, 20), composer2, 48);
                        }
                        composer2.l();
                        SpacerKt.a(composer2, SizeKt.u(companion2, !z2 ? 8 : f2));
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.f974a;
                        Modifier modifierA = rowScopeInstance2.a(companion2, 1.0f, true);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierA);
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function03);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, columnMeasurePolicyA, function26);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function27);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            androidx.camera.core.impl.b.z(p2, composer2, p2, function28);
                        }
                        Updater.b(composer2, modifierD2, function29);
                        String str = inboxMessage.d;
                        if (str == null) {
                            str = "";
                        }
                        float f3 = 8;
                        TextKt.b(str, PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, 7), WxTheme.a(composer2).c(), 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, WxTheme.b(composer2).o, composer2, 48, 3120, 55288);
                        String str2 = inboxMessage.e;
                        if (str2 == null) {
                            str2 = "";
                        }
                        TextKt.b(str2, null, WxTheme.a(composer2).f(), 0L, null, 0L, null, null, 0L, 2, false, 6, 0, null, WxTheme.b(composer2).n, composer2, 0, 3120, 55290);
                        Modifier modifierB = SizeKt.b(companion2, BitmapDescriptorFactory.HUE_RED, f3, 1);
                        BiasAlignment.Vertical vertical = Alignment.Companion.k;
                        RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(arrangement$Start$1, vertical, composer2, 48);
                        int p3 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer2.d();
                        Modifier modifierD3 = ComposedModifierKt.d(composer2, modifierB);
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            function0 = function03;
                            composer2.K(function0);
                        } else {
                            function0 = function03;
                            composer2.e();
                        }
                        Updater.b(composer2, rowMeasurePolicyA2, function26);
                        Updater.b(composer2, persistentCompositionLocalMapD3, function27);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p3))) {
                            function2 = function28;
                            androidx.camera.core.impl.b.z(p3, composer2, p3, function2);
                        } else {
                            function2 = function28;
                        }
                        Updater.b(composer2, modifierD3, function29);
                        InboxMessage.Cta cta = inboxMessage.f;
                        composer2.o(2108759641);
                        if (cta != null) {
                            messageRowKt$MessageRow$1 = this;
                            function22 = function27;
                            function25 = function26;
                            function24 = function2;
                            function02 = function0;
                            function23 = function29;
                            LinkButtonKt.a(cta.f8441a, onCtaButtonClick, PaddingKt.h(OffsetKt.c(companion2, MessageRowKt.f7297a, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, f3, 1), false, null, composer2, KyberEngine.KyberPolyBytes, 24);
                        } else {
                            messageRowKt$MessageRow$1 = this;
                            function22 = function27;
                            function23 = function29;
                            function24 = function2;
                            function02 = function0;
                            function25 = function26;
                        }
                        composer2.l();
                        SpacerKt.a(composer2, rowScopeInstance2.a(companion2, 1.0f, true));
                        InboxMessage.TermsAndConditions termsAndConditions = inboxMessage.h;
                        composer2.o(2108781469);
                        if (termsAndConditions != null) {
                            rowScopeInstance = rowScopeInstance2;
                            f = 1.0f;
                            LinkButtonKt.a(termsAndConditions.f8442a, onTncsButtonClick, PaddingKt.h(companion2, BitmapDescriptorFactory.HUE_RED, f3, 1), false, null, composer2, KyberEngine.KyberPolyBytes, 24);
                        } else {
                            f = 1.0f;
                            rowScopeInstance = rowScopeInstance2;
                        }
                        composer2.l();
                        composer2.f();
                        RowMeasurePolicy rowMeasurePolicyA3 = RowKt.a(arrangement$Start$1, vertical, composer2, 48);
                        int p4 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD4 = composer2.d();
                        Modifier modifierD4 = ComposedModifierKt.d(composer2, companion2);
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function02);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, rowMeasurePolicyA3, function25);
                        Updater.b(composer2, persistentCompositionLocalMapD4, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p4))) {
                            androidx.camera.core.impl.b.z(p4, composer2, p4, function24);
                        }
                        Updater.b(composer2, modifierD4, function23);
                        TextKt.b(notificationItem.b, null, WxTheme.a(composer2).f(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.a(WxTheme.b(composer2).t, 0L, 0L, FontWeight.j, null, 0L, 0L, null, null, 0, 16777211), composer2, 0, 0, 65530);
                        SpacerKt.a(composer2, rowScopeInstance.a(companion2, f, true));
                        InboxMessage.Category category = inboxMessage.g;
                        composer2.o(597957735);
                        if (category != null) {
                            CategoryTagKt.a(category, null, composer2, 0);
                        }
                        composer2.l();
                        composer2.f();
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1572864, 62);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(item, z, onCtaButtonClick, onTncsButtonClick, modifier2, i, 2);
        }
    }

    public static final void b(boolean z, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-859711161);
        if ((((composerImplV.p(z) ? 4 : 2) | i) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new d(12);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierA = ClipKt.a(SemanticsModifierKt.b(modifier, false, (Function1) objG), RoundedCornerShapeKt.f1100a);
            composerImplV.o(-1548693749);
            long jH = z ? AccentColors.f5153a : WxTheme.a(composerImplV).h();
            composerImplV.V(false);
            BoxKt.a(TestTagKt.a(SizeKt.k(BackgroundKt.b(modifierA, jH, RectangleShapeKt.f1779a), 8), "UnreadIndicator"), composerImplV, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.homepage.presentation.rewards.b(z, modifier, i, 1);
        }
    }
}
