package au.com.woolworths.dynamic.page.ui.content;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
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
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.compose.utils.graphics.ForwardingPainterKt;
import au.com.woolworths.design.wx.foundation.TintColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.dynamic.page.data.ContentListData;
import au.com.woolworths.dynamic.page.data.ContentListItemData;
import au.com.woolworths.dynamic.page.data.DynamicPageActionData;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"dynamic-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ContentListUiKt {
    public static final void a(ContentListItemData contentListItemData, Modifier modifier, Function2 onLinkClick, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        Modifier modifier2;
        ContentListItemData data = contentListItemData;
        Intrinsics.h(data, "data");
        DynamicPageActionData dynamicPageActionData = data.e;
        Intrinsics.h(onLinkClick, "onLinkClick");
        ComposerImpl composerImplV = composer.v(-914441480);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(data) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(onLinkClick) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            boolean z = (dynamicPageActionData != null ? dynamicPageActionData.b : null) != null;
            composerImplV.o(-1633490746);
            boolean zI = ((i3 & 896) == 256) | composerImplV.I(data);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new g(1, data, onLinkClick);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierD = ClickableKt.d(modifierE, z, null, null, (Function0) objG, 6);
            float f = 16;
            Modifier modifierF = PaddingKt.f(modifierD, f);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(f);
            BiasAlignment.Vertical vertical = Alignment.Companion.j;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(spacedAlignedG, vertical, composerImplV, 6);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierF);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD2, function24);
            Painter painterA = ForwardingPainterKt.a(PainterResources_androidKt.a(R.drawable.wapple_grey, 0, composerImplV), ColorFilter.Companion.a(TintColors.e), null, 10);
            String str = data.b;
            String str2 = data.c;
            Modifier modifierQ = SizeKt.q(ClipKt.a(RowScopeInstance.f974a.b(companion, vertical), RoundedCornerShapeKt.f1100a), 56);
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.android.onesite.deeplink.h(20);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier modifierD3 = ClickableKt.d(modifierQ, false, null, null, (Function0) objG2, 7);
            composerImplV.o(5004770);
            boolean zI2 = composerImplV.I(data);
            Object objG3 = composerImplV.G();
            if (zI2 || objG3 == composer$Companion$Empty$1) {
                objG3 = new androidx.navigation.fragment.e(data, 12);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            SingletonAsyncImageKt.b(str, str2, SemanticsModifierKt.b(modifierD3, false, (Function1) objG3), painterA, painterA, null, null, null, null, null, ContentScale.Companion.f1880a, null, composerImplV, 0, 6, 31712);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(2), Alignment.Companion.m, composerImplV, 6);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD4 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD4, function24);
            data = contentListItemData;
            TextKt.b(data.f5182a, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).o, composerImplV, 0, 0, 65534);
            composerImpl = composerImplV;
            String str3 = data.d;
            composerImpl.o(1181324998);
            if (str3 != null) {
                TextKt.b(str3, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.a(WxTheme.b(composerImpl).n, 0L, 0L, null, null, 0L, TextUnitKt.c(19), null, null, 0, 16646143), composerImpl, 48, 0, 65532);
                composerImpl = composerImpl;
            }
            composerImpl.V(false);
            composerImpl.o(1181334563);
            if (dynamicPageActionData != null) {
                ComposerImpl composerImpl2 = composerImpl;
                TextKt.b(dynamicPageActionData.f5183a, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), WxTheme.a(composerImpl).h(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImpl).o, composerImpl2, 48, 0, 65528);
                composerImpl = composerImpl2;
            }
            android.support.v4.media.session.a.C(composerImpl, false, true, true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.lifecycle.compose.c(data, modifier2, onLinkClick, i, 11);
        }
    }

    public static final void b(ContentListData data, Modifier modifier, Function2 onLinkClick, Composer composer, int i) {
        ComposerImpl composerImpl;
        Modifier.Companion companion;
        boolean z;
        Modifier modifier2;
        Intrinsics.h(data, "data");
        Intrinsics.h(onLinkClick, "onLinkClick");
        ComposerImpl composerImplV = composer.v(-1998860846);
        int i2 = (composerImplV.I(data) ? 4 : 2) | i | 48;
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onLinkClick) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierB = BackgroundKt.b(SizeKt.e(companion2, 1.0f), WxTheme.a(composerImplV).a(), RectangleShapeKt.f1779a);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
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
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-1726978955);
            String str = data.f5181a;
            if (str == null || str.length() == 0) {
                composerImpl = composerImplV;
                companion = companion2;
                z = false;
            } else {
                String str2 = data.f5181a;
                TextStyle textStyle = WxTheme.b(composerImplV).i;
                z = false;
                companion = companion2;
                TextKt.b(str2, PaddingKt.f(companion2, 16), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composerImplV, 0, 0, 65532);
                composerImpl = composerImplV;
            }
            composerImpl.V(z);
            composerImpl.o(-1726970497);
            Iterator it = data.b.iterator();
            while (it.hasNext()) {
                a((ContentListItemData) it.next(), null, onLinkClick, composerImpl, i2 & 896);
            }
            composerImpl.V(z);
            composerImpl.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.lifecycle.compose.c(data, modifier2, onLinkClick, i, 10);
        }
    }
}
