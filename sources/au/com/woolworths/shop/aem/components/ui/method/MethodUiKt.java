package au.com.woolworths.shop.aem.components.ui.method;

import android.content.Context;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.shop.aem.components.model.method.MethodData;
import au.com.woolworths.shop.aem.components.model.method.MethodItemData;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.CachePolicy;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MethodUiKt {
    public static final void a(MethodItemData methodItemData, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1166429821);
        if ((((composerImplV.n(methodItemData) ? 4 : 2) | i) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierF = PaddingKt.f(BackgroundKt.b(modifier, ToneColors.j, RoundedCornerShapeKt.b(12)), 16);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
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
                b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            float f = 8;
            Modifier.Companion companion = Modifier.Companion.d;
            TextKt.b(methodItemData.f10175a, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 7), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).m, composerImplV, 48, 0, 65532);
            String str = methodItemData.c;
            composerImplV.o(-1391346975);
            if (str != null) {
                Modifier modifierA = ClipKt.a(PaddingKt.h(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, f, 1), RoundedCornerShapeKt.b(f));
                ImageRequest.Builder builder = new ImageRequest.Builder((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b));
                builder.c = str;
                ImageRequests_androidKt.d(builder, R.drawable.ic_image_placeholder);
                ImageRequests_androidKt.a(builder, R.drawable.ic_image_placeholder);
                builder.j = CachePolicy.f;
                SingletonAsyncImageKt.a(builder.a(), null, modifierA, null, ContentScale.Companion.f1880a, composerImplV, 1572912, 1976);
            }
            composerImplV.V(false);
            MarkdownCompatKt.b(methodItemData.b, R.layout.content_page_method_item, null, null, null, null, composerImplV, 0, 252);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.b(methodItemData, i, 14, modifier);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static final void b(MethodData methodData, Modifier modifier, Composer composer, int i) {
        String str;
        Modifier modifier2;
        ?? r2;
        ComposerImpl composerImpl;
        ComposerImpl composerImpl2;
        ComposerImpl composerImplV = composer.v(-461363997);
        if (((i | (composerImplV.I(methodData) ? 4 : 2) | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl2 = composerImplV;
        } else {
            String strC = StringResources_androidKt.c(composerImplV, R.string.aem_method_disclaimer_prefix);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierF = PaddingKt.f(companion, 16);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
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
                b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            String str2 = methodData.d;
            composerImplV.o(-1789974950);
            if (str2 == null) {
                str = strC;
                modifier2 = companion;
                r2 = 0;
                composerImpl = composerImplV;
            } else {
                str = strC;
                modifier2 = companion;
                r2 = 0;
                TextKt.b(str2, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).m, composerImplV, 0, 0, 65534);
                composerImpl = composerImplV;
            }
            composerImpl.V(r2);
            String str3 = methodData.e;
            composerImpl.o(-1789969765);
            if (str3 != null) {
                MarkdownCompatKt.b(str3, R.layout.content_page_method_caption, PaddingKt.h(modifier2, BitmapDescriptorFactory.HUE_RED, 8, 1), null, null, null, composerImpl, KyberEngine.KyberPolyBytes, 248);
            }
            composerImpl.V(r2);
            composerImpl.o(-1789960799);
            Iterator it = methodData.b.iterator();
            while (it.hasNext()) {
                a((MethodItemData) it.next(), PaddingKt.h(modifier2, BitmapDescriptorFactory.HUE_RED, 8, 1), composerImpl, 48);
            }
            composerImpl.V(r2);
            String str4 = methodData.c;
            composerImpl.o(-1789953064);
            ComposerImpl composerImpl3 = composerImpl;
            if (str4 != null) {
                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                StringBuilder sb = new StringBuilder();
                String str5 = str;
                sb.append(str5);
                sb.append(str4);
                builder.e(sb.toString());
                builder.c(new SpanStyle(0L, 0L, FontWeight.m, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65531), r2, str5.length());
                Composer composer2 = composerImpl;
                TextKt.c(builder.m(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, WxTheme.b(composerImpl).r, composer2, 0, 0, 131070);
                composerImpl3 = composer2;
            }
            composerImpl3.V(r2);
            composerImpl3.V(true);
            composerImpl2 = composerImpl3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.b(methodData, i, 13, modifier2);
        }
    }
}
