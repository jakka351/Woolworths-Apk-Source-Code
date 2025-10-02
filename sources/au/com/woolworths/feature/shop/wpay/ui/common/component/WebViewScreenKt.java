package au.com.woolworths.feature.shop.wpay.ui.common.component;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.navigation.internal.c;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.product.list.d0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"wpay_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class WebViewScreenKt {
    public static final void a(Function1 onCreated, Function0 onPageFinished, Function2 onPageLoadConnectionError, Function2 onPageLoadServerError, Modifier modifier, boolean z, boolean z2, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        boolean z3;
        boolean z4;
        boolean z5;
        Intrinsics.h(onCreated, "onCreated");
        Intrinsics.h(onPageFinished, "onPageFinished");
        Intrinsics.h(onPageLoadConnectionError, "onPageLoadConnectionError");
        Intrinsics.h(onPageLoadServerError, "onPageLoadServerError");
        ComposerImpl composerImplV = composer.v(-820200464);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(onCreated) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onPageFinished) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onPageLoadConnectionError) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onPageLoadServerError) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(modifier) ? 16384 : 8192;
        }
        int i3 = 1769472 | i2;
        if ((599187 & i3) == 599186 && composerImplV.c()) {
            composerImplV.j();
            z5 = z;
            z3 = z2;
            composerImpl = composerImplV;
        } else {
            composerImplV.o(2061350421);
            if (((Boolean) composerImplV.x(InspectionModeKt.f1972a)).booleanValue()) {
                TextKt.b("Preview not available for WebViewScreen", PaddingKt.f(BackgroundKt.b(SizeKt.e(Modifier.Companion.d, 1.0f), CoreTheme.b(composerImplV).e.f4848a.e, RectangleShapeKt.f1779a), 16), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, null, composerImplV, 6, 0, 130556);
                composerImplV.V(false);
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    recomposeScopeImplX.d = new d0(onCreated, onPageFinished, onPageLoadConnectionError, onPageLoadServerError, modifier, i, 16);
                    return;
                }
                return;
            }
            composerImpl = composerImplV;
            composerImpl.V(false);
            composerImpl.o(-1224400529);
            z3 = true;
            boolean z6 = ((458752 & i3) == 131072) | ((i3 & 14) == 4) | ((3670016 & i3) == 1048576) | ((i3 & 112) == 32) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objG = composerImpl.G();
            if (z6 || objG == Composer.Companion.f1624a) {
                z4 = false;
                c cVar = new c(onCreated, onPageFinished, onPageLoadConnectionError, onPageLoadServerError, 5);
                composerImpl.A(cVar);
                objG = cVar;
            } else {
                z4 = false;
            }
            composerImpl.V(z4);
            AndroidView_androidKt.a((Function1) objG, modifier, null, composerImpl, (i3 >> 9) & 112, 4);
            z5 = true;
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImpl.X();
        if (recomposeScopeImplX2 != null) {
            recomposeScopeImplX2.d = new au.com.woolworths.feature.product.list.legacy.compose.a(onCreated, onPageFinished, onPageLoadConnectionError, onPageLoadServerError, modifier, z5, z3, i);
        }
    }
}
