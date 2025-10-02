package au.com.woolworths.dynamic.page.ui.content;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.dynamic.page.data.CampaignCardData;
import au.com.woolworths.dynamic.page.data.CampaignCardListData;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"dynamic-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CardListUiKt {
    public static final void a(final CampaignCardData data, Modifier modifier, Function2 function2, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        ComposerImpl composerImpl;
        Intrinsics.h(data, "data");
        ComposerImpl composerImplV = composer.v(-1752046634);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(data) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(function2) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(PaddingKt.g(companion, 16, 8), 1.0f);
            composerImplV.o(-1633490746);
            boolean z = ((i3 & 896) == 256) | ((i3 & 14) == 4);
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new a(function2, data, 1);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            modifier2 = companion;
            composerImpl = composerImplV;
            CardKt.b((Function0) objG, modifierE, false, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, null, ComposableLambdaKt.c(-87572432, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.dynamic.page.ui.content.CardListUiKt$CardListItemUi$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2;
                    Composer composer3 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer3.c()) {
                        composer3.j();
                    } else {
                        Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
                        BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composer3, 0);
                        int p = composer3.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                        Modifier.Companion companion2 = Modifier.Companion.d;
                        Modifier modifierD = ComposedModifierKt.d(composer3, companion2);
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
                        Updater.b(composer3, columnMeasurePolicyA, function22);
                        Function2 function23 = ComposeUiNode.Companion.f;
                        Updater.b(composer3, persistentCompositionLocalMapD, function23);
                        Function2 function24 = ComposeUiNode.Companion.j;
                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer3, p, function24);
                        }
                        Function2 function25 = ComposeUiNode.Companion.d;
                        Updater.b(composer3, modifierD, function25);
                        ColorPainter colorPainter = new ColorPainter(ToneColors.j);
                        Modifier modifierA = AspectRatioKt.a(SizeKt.e(companion2, 1.0f), 1.778f);
                        CampaignCardData campaignCardData = data;
                        SingletonAsyncImageKt.b(campaignCardData.b, campaignCardData.c, modifierA, colorPainter, colorPainter, null, null, null, null, null, ContentScale.Companion.f1880a, null, composer3, KyberEngine.KyberPolyBytes, 6, 31712);
                        float f = 16;
                        Modifier modifierI = PaddingKt.i(companion2, f, 18, f, 20);
                        ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composer3, 0);
                        int p2 = composer3.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer3.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer3, modifierI);
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
                        Updater.b(composer3, persistentCompositionLocalMapD2, function23);
                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p2))) {
                            androidx.camera.core.impl.b.z(p2, composer3, p2, function24);
                        }
                        Updater.b(composer3, modifierD2, function25);
                        TextKt.b(campaignCardData.f5176a, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, WxTheme.b(composer3).l, composer3, 0, 3120, 55294);
                        composer3.o(479995027);
                        String str = campaignCardData.e;
                        if (str == null || str.length() == 0) {
                            composer2 = composer3;
                        } else {
                            composer2 = composer3;
                            TextKt.b(campaignCardData.e, PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 0L, 0L, null, 0L, null, null, 0L, 2, false, 3, 0, null, WxTheme.b(composer3).n, composer2, 48, 3120, 55292);
                        }
                        composer2.l();
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 805306368, 508);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.lifecycle.compose.c(data, modifier2, function2, i, 8);
        }
    }

    public static final void b(CampaignCardListData data, Modifier modifier, Function2 function2, Composer composer, int i, int i2) {
        Function2 function22;
        int i3;
        ComposerImpl composerImpl;
        Modifier.Companion companion;
        Modifier modifier2;
        Intrinsics.h(data, "data");
        ComposerImpl composerImplV = composer.v(-727219419);
        int i4 = i | (composerImplV.I(data) ? 4 : 2);
        int i5 = i4 | 48;
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i4 | 432;
            function22 = function2;
        } else {
            function22 = function2;
            i3 = i5 | (composerImplV.I(function22) ? 256 : 128);
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            if (i6 != 0) {
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                if (objG == Composer.Companion.f1624a) {
                    objG = new androidx.navigation.compose.h(11, (byte) 0);
                    composerImplV.A(objG);
                }
                function22 = (Function2) objG;
                composerImplV.V(false);
            }
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(BackgroundKt.b(SizeKt.e(companion2, 1.0f), WxTheme.a(composerImplV).a(), RectangleShapeKt.f1779a), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 8, 7);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i7 = composerImplV.P;
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                androidx.camera.core.impl.b.B(i7, composerImplV, i7, function23);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-739534747);
            String str = data.f5177a;
            if (str == null || str.length() == 0) {
                composerImpl = composerImplV;
                companion = companion2;
            } else {
                String str2 = data.f5177a;
                TextStyle textStyle = WxTheme.b(composerImplV).i;
                companion = companion2;
                TextKt.b(str2, PaddingKt.f(companion2, 16), 0L, 0L, null, 0L, null, null, 0L, 0, false, 2, 0, null, textStyle, composerImplV, 0, 3072, 57340);
                composerImpl = composerImplV;
            }
            composerImpl.V(false);
            composerImpl.o(-739526365);
            Iterator it = data.b.iterator();
            while (it.hasNext()) {
                a((CampaignCardData) it.next(), null, function22, composerImpl, i3 & 896);
            }
            composerImpl.V(false);
            composerImpl.V(true);
            modifier2 = companion;
        }
        Function2 function24 = function22;
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.lifecycle.compose.c(i, i2, 7, modifier2, data, function24);
        }
    }
}
