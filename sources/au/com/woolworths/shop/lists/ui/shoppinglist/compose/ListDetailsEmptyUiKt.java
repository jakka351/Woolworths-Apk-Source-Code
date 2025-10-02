package au.com.woolworths.shop.lists.ui.shoppinglist.compose;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.component.stable.button.SecondaryButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.rewards.account.closeaccount.ui.f;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ListDetailsEmptyUiKt {
    public static final void a(boolean z, boolean z2, Function1 searchClick, Function0 scanAndUploadClick, Composer composer, int i) {
        int i2;
        Intrinsics.h(searchClick, "searchClick");
        Intrinsics.h(scanAndUploadClick, "scanAndUploadClick");
        ComposerImpl composerImplV = composer.v(-1952264939);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(searchClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(scanAndUploadClick) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else if (z) {
            composerImplV.o(-1772424960);
            c(composerImplV, 0);
            composerImplV.V(false);
        } else {
            composerImplV.o(-1772372694);
            b(z2, searchClick, scanAndUploadClick, composerImplV, (i2 >> 3) & 1022);
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new f(z, z2, searchClick, scanAndUploadClick, i);
        }
    }

    public static final void b(boolean z, Function1 searchClick, Function0 scanAndUploadClick, Composer composer, int i) {
        int i2;
        Intrinsics.h(searchClick, "searchClick");
        Intrinsics.h(scanAndUploadClick, "scanAndUploadClick");
        ComposerImpl composerImplV = composer.v(94274321);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(searchClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(scanAndUploadClick) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            String string = ((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b)).getText(R.string.shop_lists_empty_list_search_product_button).toString();
            Modifier modifierH = PaddingKt.h(SizeKt.c, 50, BitmapDescriptorFactory.HUE_RED, 2);
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierH);
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
            Updater.b(composerImplV, modifierD, function24);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
            Modifier.Companion companion = Modifier.Companion.d;
            SpacerKt.a(composerImplV, columnScopeInstance.a(companion, 0.1f, true));
            Modifier modifierA = columnScopeInstance.a(companion, 0.9f, true);
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, Alignment.Companion.n, composerImplV, 48);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierA);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            int i5 = i2;
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.shop_lists_empty_list_error_title), PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), CoreTheme.b(composerImplV).e.d.d, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).d.c.f5132a, composerImplV, 48, 0, 65016);
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.shop_lists_empty_list_error_message), PaddingKt.h(companion, BitmapDescriptorFactory.HUE_RED, 16, 1), CoreTheme.b(composerImplV).e.d.b, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).e.f5133a.b, composerImplV, 48, 0, 65016);
            composerImplV = composerImplV;
            Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 4, 7);
            ImageVector imageVector = CoreTheme.e(composerImplV).f4879a.w;
            composerImplV.o(-1633490746);
            boolean zN = composerImplV.n(string) | ((i5 & 112) == 32);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.shop.instore.navigation.productfinder.d(searchClick, string, 4);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            PrimaryButtonKt.a(string, (Function0) objG, modifierJ, false, null, imageVector, null, null, composerImplV, KyberEngine.KyberPolyBytes, 216);
            composerImplV.o(56330270);
            if (z) {
                String strC = StringResources_androidKt.c(composerImplV, R.string.shop_lists_empty_list_scan_or_upload_a_list_button);
                ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$ListDetailsEmptyUiKt.f12373a;
                SecondaryButtonKt.b(strC, scanAndUploadClick, false, null, composerImplV, ((i5 >> 3) & 112) | 28032);
            }
            android.support.v4.media.session.a.C(composerImplV, false, true, true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.filter.b(z, searchClick, scanAndUploadClick, i, 19);
        }
    }

    public static final void c(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-563275133);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            List listR = CollectionsKt.R(Integer.valueOf(R.drawable.empty_watchlist), Integer.valueOf(R.string.shop_lists_watchlist_empty_list_error_title), Integer.valueOf(R.string.shop_lists_watchlist_empty_list_error_message));
            FullPageMessageUiKt.a(FullPageMessageSpec.Companion.g(PainterResources_androidKt.a(((Number) listR.get(0)).intValue(), 0, composerImplV), StringResources_androidKt.c(composerImplV, ((Number) listR.get(1)).intValue()), StringResources_androidKt.c(composerImplV, ((Number) listR.get(2)).intValue())), null, null, composerImplV, 0, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.olive.voice.ui.permission.a(i, 22);
        }
    }
}
