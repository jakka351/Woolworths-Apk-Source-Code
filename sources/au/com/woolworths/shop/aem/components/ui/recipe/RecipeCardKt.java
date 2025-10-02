package au.com.woolworths.shop.aem.components.ui.recipe;

import android.content.Context;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.product.list.compose.filter.g;
import au.com.woolworths.shop.aem.components.ui.contentcard.VideoTagKt;
import au.com.woolworths.shop.aem.components.ui.merchcard.a;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RecipeCardKt {
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData r13, final au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryConfig r14, final kotlin.jvm.functions.Function0 r15, androidx.compose.ui.Modifier r16, boolean r17, au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState r18, androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.aem.components.ui.recipe.RecipeCardKt.a(au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData, au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryConfig, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(String str, Boolean bool, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1474265792);
        if ((((composerImplV.n(str) ? 4 : 2) | i | (composerImplV.n(bool) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
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
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier modifierA = AspectRatioKt.a(SizeKt.e(companion, 1.0f), 1.0f);
            ImageRequest.Builder builder = new ImageRequest.Builder((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b));
            builder.c = str;
            ImageRequests_androidKt.d(builder, R.drawable.ic_image_placeholder);
            ImageRequests_androidKt.a(builder, R.drawable.ic_image_placeholder);
            SingletonAsyncImageKt.a(builder.a(), null, modifierA, null, ContentScale.Companion.f1880a, composerImplV, 1573296, 1976);
            composerImplV.o(-323465841);
            if (Intrinsics.c(bool, Boolean.TRUE)) {
                float f = 8;
                Modifier modifierG = BoxScopeInstance.f944a.g(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f, 3), Alignment.Companion.i);
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                if (objG == Composer.Companion.f1624a) {
                    objG = new a(9);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                VideoTagKt.a(0, 0, composerImplV, SemanticsModifierKt.b(modifierG, false, (Function1) objG));
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.b(i, 15, bool, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x031e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData r44, au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryConfig r45, boolean r46, androidx.compose.runtime.Composer r47, int r48) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.aem.components.ui.recipe.RecipeCardKt.c(au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData, au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryConfig, boolean, androidx.compose.runtime.Composer, int):void");
    }

    public static final void d(String str, int i, Composer composer, int i2) {
        ComposerImpl composerImplV = composer.v(-1563908026);
        int i3 = i2 | (composerImplV.n(str) ? 4 : 2) | (composerImplV.r(i) ? 32 : 16);
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f = 3;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i4 = composerImplV.P;
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
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            ImageKt.a(PainterResources_androidKt.a(i, (i3 >> 3) & 14, composerImplV), null, companion, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 432, 120);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new a(10);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            TextKt.b(str, PaddingKt.j(SemanticsModifierKt.b(companion, false, (Function1) objG), f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), CoreTheme.b(composerImplV).e.d.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.b.f5123a, composerImplV, i3 & 14, 0, 65528);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(str, i, i2);
        }
    }
}
