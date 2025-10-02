package au.com.woolworths.shop.receipts.ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ProgressIndicatorKt;
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
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.TextColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.shop.receipts.data.ReceiptListItem;
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

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"receipts_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ReceiptListItemUIKt {
    public static final void a(String str, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(180298518);
        if ((i & 6) == 0) {
            i2 = i | (composerImplV.n(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 7, 0L, composerImplV, null);
            composerImpl = composerImplV;
            float f = 16;
            TextKt.b(str, PaddingKt.i(Modifier.Companion.d, f, 14, f, 8), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImpl).o, composerImpl, i2 & 14, 0, 65532);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.filter.g(str, i, 4, (byte) 0);
        }
    }

    public static final void b(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1277257014);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierF = PaddingKt.f(SizeKt.e(Modifier.Companion.d, 1.0f), 32);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
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
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 31, 0L, 0L, composerImplV, null);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b(i, 6);
        }
    }

    public static final void c(int i, Composer composer, Modifier modifier, Function0 onMoreInfoClick) {
        Modifier modifier2;
        Intrinsics.h(onMoreInfoClick, "onMoreInfoClick");
        ComposerImpl composerImplV = composer.v(-1460986229);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onMoreInfoClick) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 16;
            Modifier modifierF = PaddingKt.f(SizeKt.e(companion, 1.0f), f);
            composerImplV.o(5004770);
            boolean z = (i2 & 112) == 32;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.shop.lists.ui.magicmatch.ui.c(12, onMoreInfoClick);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierD = ClickableKt.d(modifierF, false, null, null, (Function0) objG, 7);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierD);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD2, function24);
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.receipt_list_last_page_emoji), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).e, composerImplV, 0, 0, 65534);
            SpacerKt.a(composerImplV, SizeKt.g(companion, 12));
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.receipt_list_last_page_title), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).o, composerImplV, 0, 0, 65534);
            Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierJ);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.receipt_list_last_page_subtitle), null, TextColors.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, 0, 0, 65530);
            composerImplV = composerImplV;
            IconKt.a(PainterResources_androidKt.a(R.drawable.ic_help, 0, composerImplV), StringResources_androidKt.c(composerImplV, R.string.receipt_list_older_activity_help_content_description), SizeKt.q(PaddingKt.j(companion, 6, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), f), WxTheme.a(composerImplV).h(), composerImplV, KyberEngine.KyberPolyBytes, 0);
            composerImplV.V(true);
            composerImplV.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.card.unlock.b(modifier2, onMoreInfoClick, i, 21);
        }
    }

    public static final void d(final ReceiptListItem receiptListItem, Function1 onReceiptClick, Composer composer, int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(onReceiptClick, "onReceiptClick");
        ComposerImpl composerImplV = composer.v(-379615624);
        int i2 = (composerImplV.n(receiptListItem) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onReceiptClick) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(-1633490746);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new g(1, onReceiptClick, receiptListItem);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            SurfaceKt.b((Function0) objG, null, false, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, null, ComposableLambdaKt.c(-754716207, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.receipts.ui.ReceiptListItemUIKt$ReceiptListItemUI$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier.Companion companion = Modifier.Companion.d;
                        float f = 16;
                        Modifier modifierF = PaddingKt.f(SizeKt.e(companion, 1.0f), f);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer2, 48);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierF);
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
                        Function2 function2 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, rowMeasurePolicyA, function2);
                        Function2 function22 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function22);
                        Function2 function23 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function24);
                        ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_woolworths_badge, 0, composer2), null, SizeKt.q(companion, 40), null, null, BitmapDescriptorFactory.HUE_RED, null, composer2, 432, 120);
                        Modifier modifierA = RowScopeInstance.f974a.a(PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, 2), 1.0f, true);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(4), Alignment.Companion.m, composer2, 6);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierA);
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
                        Updater.b(composer2, columnMeasurePolicyA, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            androidx.camera.core.impl.b.z(p2, composer2, p2, function23);
                        }
                        Updater.b(composer2, modifierD2, function24);
                        ReceiptListItem receiptListItem2 = receiptListItem;
                        TextKt.b(receiptListItem2.b, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).l, composer2, 0, 0, 65534);
                        TextKt.b(receiptListItem2.c, null, TextColors.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).n, composer2, 0, 0, 65530);
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 805306368, 510);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.lists.ui.details.ui.compose.b(receiptListItem, i, 14, onReceiptClick);
        }
    }
}
