package au.com.woolworths.feature.product.list.legacy.compose;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.data.DownloadableAssetType;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.compose.m;
import au.com.woolworths.feature.product.list.legacy.data.FullScreenMessage;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
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
public final class FullScreenMessageContentKt {
    public static final void a(int i, Composer composer, Modifier modifier, String str) {
        ComposerImpl composerImpl;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-2042669497);
        int i2 = (composerImplV.n(str) ? 4 : 2) | i | 48;
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            composerImpl = composerImplV;
            TextKt.b(str, PaddingKt.h(companion, 20, BitmapDescriptorFactory.HUE_RED, 2), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, TextStyle.a(WxTheme.b(composerImplV).o, WxTheme.a(composerImplV).f(), 0L, FontWeight.j, null, 0L, 0L, null, null, 0, 16777210), composerImpl, i2 & 14, 0, 65020);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.badge.a(str, modifier2, i, 4);
        }
    }

    public static final void b(FullScreenMessage fullScreenMessage, Modifier modifier, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        Function1 onButtonClick = function1;
        DownloadableAsset downloadableAsset = fullScreenMessage.f;
        Intrinsics.h(onButtonClick, "onButtonClick");
        ComposerImpl composerImplV = composer.v(2133264739);
        int i2 = i | (composerImplV.I(fullScreenMessage) ? 4 : 2) | 48 | (composerImplV.I(onButtonClick) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            ScrollState scrollStateA = ScrollKt.a(composerImplV);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierB = ScrollKt.b(companion, scrollStateA, true);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.e, Alignment.Companion.n, composerImplV, 54);
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-1285537651);
            DownloadableAssetType assetType = downloadableAsset != null ? downloadableAsset.getAssetType() : null;
            composerImplV.o(-1285537257);
            if (assetType == DownloadableAssetType.IMAGE) {
                c(downloadableAsset, null, composerImplV, 0);
                SpacerKt.a(composerImplV, SizeKt.g(companion, 16));
            }
            composerImplV.V(false);
            String str = fullScreenMessage.d;
            composerImplV.o(-1285524658);
            if (str != null) {
                d(0, composerImplV, null, str);
                SpacerKt.a(composerImplV, SizeKt.g(companion, 2));
            }
            composerImplV.V(false);
            String str2 = fullScreenMessage.e;
            composerImplV.o(-1285520069);
            if (str2 != null) {
                a(0, composerImplV, null, str2);
                SpacerKt.a(composerImplV, SizeKt.g(companion, 24));
            }
            composerImplV.V(false);
            composerImplV.o(-1285514907);
            Iterator it = fullScreenMessage.g.iterator();
            while (it.hasNext()) {
                au.com.woolworths.sdui.legacy.button.ApiDrivenButtonKt.a((ButtonApiData) it.next(), onButtonClick, TestTagKt.a(PaddingKt.g(SizeKt.e(companion, 1.0f), 16, 4), "FullScreenMessageButtons"), null, composerImplV, ((i2 >> 3) & 112) | KyberEngine.KyberPolyBytes, 8);
                onButtonClick = function1;
            }
            android.support.v4.media.session.a.C(composerImplV, false, false, true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a((Object) fullScreenMessage, modifier2, function1, i, 2);
        }
    }

    public static final void c(DownloadableAsset downloadableAsset, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1993294467);
        if ((((composerImplV.I(downloadableAsset) ? 4 : 2) | i | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float assetWidth = downloadableAsset.getAssetWidth();
            Modifier.Companion companion = Modifier.Companion.d;
            SingletonAsyncImageKt.a(downloadableAsset.getAssetUrl(), null, SizeKt.g(SizeKt.u(companion, assetWidth), downloadableAsset.getAssetHeight()), null, ContentScale.Companion.b, composerImplV, 1572912, 1976);
            modifier = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new m(downloadableAsset, modifier, i, 1);
        }
    }

    public static final void d(int i, Composer composer, Modifier modifier, String str) {
        ComposerImpl composerImpl;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-2120541461);
        int i2 = (composerImplV.n(str) ? 4 : 2) | i | 48;
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            modifier2 = modifier;
        } else {
            composerImpl = composerImplV;
            modifier2 = Modifier.Companion.d;
            TextKt.b(str, modifier2, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).w, composerImpl, i2 & 126, 0, 65532);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.badge.a(str, modifier2, i, 5);
        }
    }
}
