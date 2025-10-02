package au.com.woolworths.feature.product.list.legacy.compose.productsearch;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.navigation.fragment.d;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.product.list.d0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SearchRowSectionKt {
    public static final void a(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-554949991);
        if ((i & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_ask_olive, 0, composerImplV), null, modifier2, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 432, 120);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.compose.utils.layout.a(i, 5, modifier2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final kotlin.jvm.functions.Function0 r15, final java.lang.String r16, final java.lang.String r17, final androidx.compose.runtime.internal.ComposableLambdaImpl r18, final androidx.compose.runtime.internal.ComposableLambdaImpl r19, boolean r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchRowSectionKt.b(kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.internal.ComposableLambdaImpl, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(int i, Composer composer, Modifier modifier, String str) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(1809412957);
        int i2 = (composerImplV.n(str) ? 4 : 2) | i | 48;
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            composerImplV.o(5004770);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new d(str, 17);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            modifier2 = Modifier.Companion.d;
            TextKt.a(str, CoreTheme.f(composerImplV).f5120a.c.f5124a, SemanticsModifierKt.a(modifier2, (Function1) objG), 0L, null, 0, 2, false, 2, null, composerImplV, i3 | 102236160, 696);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.badge.a(str, modifier2, i, 6);
        }
    }

    public static final void d(Function0 onScanBarcodeClicked, Function0 onBuyAgainClicked, Function0 onOliveClicked, Function1 shouldDisplaySearchTile, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.h(onScanBarcodeClicked, "onScanBarcodeClicked");
        Intrinsics.h(onBuyAgainClicked, "onBuyAgainClicked");
        Intrinsics.h(onOliveClicked, "onOliveClicked");
        Intrinsics.h(shouldDisplaySearchTile, "shouldDisplaySearchTile");
        ComposerImpl composerImplV = composer.v(1778214480);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(onScanBarcodeClicked) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onBuyAgainClicked) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onOliveClicked) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(shouldDisplaySearchTile) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((i3 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
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
            Updater.b(composerImplV, modifierD, function24);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            float f = 16;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(f), Alignment.Companion.n, composerImplV, 54);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            Modifier modifierJ = PaddingKt.j(PaddingKt.h(SizeKt.e(companion, 1.0f), f, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(Arrangement.g(f), Alignment.Companion.m, composerImplV, 6);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierJ);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                b.B(i6, composerImplV, i6, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            composerImplV.o(-696254775);
            if (((Boolean) shouldDisplaySearchTile.invoke(SearchTile.f)).booleanValue()) {
                b(onScanBarcodeClicked, StringResources_androidKt.c(composerImplV, R.string.olive_voice_scan_barcode_tile_title), "scan a barcode", ComposableSingletons$SearchRowSectionKt.f5349a, ComposableSingletons$SearchRowSectionKt.b, false, composerImplV, (i3 & 14) | 224640, 64);
            }
            composerImplV.V(false);
            composerImplV.o(-696227369);
            if (((Boolean) shouldDisplaySearchTile.invoke(SearchTile.g)).booleanValue()) {
                b(onBuyAgainClicked, StringResources_androidKt.c(composerImplV, R.string.buy_again_entry_point_title), "buy again", ComposableSingletons$SearchRowSectionKt.c, ComposableSingletons$SearchRowSectionKt.d, false, composerImplV, ((i3 >> 3) & 14) | 224640, 64);
            }
            composerImplV.V(false);
            composerImplV.o(-696200146);
            if (((Boolean) shouldDisplaySearchTile.invoke(SearchTile.h)).booleanValue()) {
                b(onOliveClicked, StringResources_androidKt.c(composerImplV, R.string.ask_olive_entry_point_title), "ask olive", ComposableSingletons$SearchRowSectionKt.e, ComposableSingletons$SearchRowSectionKt.f, true, composerImplV, ((i3 >> 6) & 14) | 1797504, 0);
            }
            composerImplV.V(false);
            composerImplV.V(true);
            composerImplV.V(true);
            composerImplV.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d0(onScanBarcodeClicked, onBuyAgainClicked, onOliveClicked, shouldDisplaySearchTile, modifier2, i, 3);
        }
    }
}
