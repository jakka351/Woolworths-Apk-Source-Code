package au.com.woolworths.feature.shop.marketplace.ui.facet;

import android.content.Context;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.CachePolicy;
import coil3.request.ImageRequest;
import coil3.request.ImageRequestsKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"marketplace_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FacetItemKt {
    public static final void a(int i, int i2, Composer composer, Modifier modifier, String title, String str, Function0 onClickListener) {
        Modifier modifier2;
        int i3;
        boolean z;
        Modifier.Companion companion;
        Modifier modifier3;
        Intrinsics.h(title, "title");
        Intrinsics.h(onClickListener, "onClickListener");
        ComposerImpl composerImplV = composer.v(2032886736);
        int i4 = (composerImplV.n(title) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= composerImplV.n(str) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | KyberEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (composerImplV.n(modifier2) ? 256 : 128);
        }
        if ((i & 3072) == 0) {
            i3 |= composerImplV.I(onClickListener) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier2;
        } else {
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifier4 = i5 != 0 ? companion2 : modifier2;
            composerImplV.o(5004770);
            boolean z2 = (i3 & 7168) == 2048;
            Object objG = composerImplV.G();
            if (z2 || objG == Composer.Companion.f1624a) {
                objG = new b(onClickListener, 0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifier5 = modifier4;
            Modifier modifierH = PaddingKt.h(ClickableKt.d(modifier4, false, null, null, (Function0) objG, 7), 24, BitmapDescriptorFactory.HUE_RED, 2);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i6 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i7 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                androidx.camera.core.impl.b.B(i7, composerImplV, i7, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            composerImplV.o(1133505523);
            if (str == null) {
                companion = companion2;
                z = false;
            } else {
                Painter painterA = PainterResources_androidKt.a(R.drawable.ic_facet_placeholder, 0, composerImplV);
                ImageRequest.Builder builder = new ImageRequest.Builder((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b));
                builder.c = str;
                ImageRequestsKt.a(builder);
                builder.j = CachePolicy.g;
                float f = 16;
                float f2 = 4;
                z = false;
                companion = companion2;
                SingletonAsyncImageKt.b(builder.a(), null, PaddingKt.f(BorderKt.a(ClipKt.a(SizeKt.g(SizeKt.u(PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, f, f, f, 1), 56), 32), RoundedCornerShapeKt.b(f2)), 1, ToneColors.i, RoundedCornerShapeKt.b(f2)), f2), painterA, painterA, null, null, null, null, null, ContentScale.Companion.e, null, composerImplV, 48, 6, 31712);
                composerImplV = composerImplV;
            }
            composerImplV.V(z);
            ComposerImpl composerImpl = composerImplV;
            TextKt.b(title, RowScopeInstance.f974a.b(SizeKt.e(PaddingKt.h(companion, BitmapDescriptorFactory.HUE_RED, 16, 1), 1.0f), Alignment.Companion.k), ToneColors.c, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImpl, i3 & 14, 0, 65528);
            composerImplV = composerImpl;
            composerImplV.V(true);
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 7, 0L, composerImplV, null);
            composerImplV.V(true);
            modifier3 = modifier5;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.instore.navigation.productfinder.a(i, i2, 1, modifier3, title, str, onClickListener);
        }
    }
}
