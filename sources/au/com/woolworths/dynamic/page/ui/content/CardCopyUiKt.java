package au.com.woolworths.dynamic.page.ui.content;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
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
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.dynamic.page.data.CampaignCardCopyData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"dynamic-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardCopyUiKt {
    public static final void a(final CampaignCardCopyData data, Modifier modifier, Composer composer, int i) {
        Intrinsics.h(data, "data");
        ComposerImpl composerImplV = composer.v(1355204032);
        if ((((composerImplV.n(data) ? 4 : 2) | i | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            SurfaceKt.a(null, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(1577054468, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.dynamic.page.ui.content.CardCopyUiKt$CardCopyUi$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    CampaignCardCopyData campaignCardCopyData;
                    CampaignCardCopyData campaignCardCopyData2;
                    Composer composer2;
                    Composer composer3 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer3.c()) {
                        composer3.j();
                    } else {
                        float f = 16;
                        Modifier modifierG = PaddingKt.g(BackgroundKt.b(SizeKt.e(Modifier.Companion.d, 1.0f), WxTheme.a(composer3).a(), RectangleShapeKt.f1779a), f, f);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(f), Alignment.Companion.m, composer3, 6);
                        int p = composer3.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                        Modifier modifierD = ComposedModifierKt.d(composer3, modifierG);
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
                        Updater.b(composer3, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer3, p, function2);
                        }
                        Updater.b(composer3, modifierD, ComposeUiNode.Companion.d);
                        composer3.o(-543624868);
                        CampaignCardCopyData campaignCardCopyData3 = data;
                        String str = campaignCardCopyData3.f5175a;
                        if (str == null || str.length() == 0) {
                            campaignCardCopyData = campaignCardCopyData3;
                        } else {
                            campaignCardCopyData = campaignCardCopyData3;
                            TextKt.b(campaignCardCopyData3.f5175a, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, WxTheme.b(composer3).e, composer3, 0, 3120, 55294);
                            composer3 = composer3;
                        }
                        composer3.l();
                        composer3.o(-543615160);
                        CampaignCardCopyData campaignCardCopyData4 = campaignCardCopyData;
                        String str2 = campaignCardCopyData4.b;
                        if (str2 == null || str2.length() == 0) {
                            campaignCardCopyData2 = campaignCardCopyData4;
                        } else {
                            Composer composer4 = composer3;
                            campaignCardCopyData2 = campaignCardCopyData4;
                            TextKt.b(campaignCardCopyData4.b, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, WxTheme.b(composer4).i, composer4, 0, 3120, 55294);
                            composer3 = composer4;
                        }
                        composer3.l();
                        composer3.o(-543605180);
                        CampaignCardCopyData campaignCardCopyData5 = campaignCardCopyData2;
                        String str3 = campaignCardCopyData5.c;
                        if (str3 == null || str3.length() == 0) {
                            composer2 = composer3;
                        } else {
                            composer2 = composer3;
                            TextKt.b(campaignCardCopyData5.c, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer3).n, composer2, 0, 0, 65534);
                        }
                        composer2.l();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1572864, 63);
            modifier = Modifier.Companion.d;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(data, i, 0, modifier);
        }
    }
}
