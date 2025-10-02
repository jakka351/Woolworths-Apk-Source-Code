package au.com.woolworths.shop.ratingsandreviews.ui.reviewitem;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.core.ui.component.experimental.ratingbar.StarRatingBarKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.modeselector.ui.e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003¨\u0006\u0005²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isCollapsed", "Landroidx/compose/ui/unit/Dp;", "collapsedHeight", "isOverflowing", "ratingsandreviews-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ReviewCardKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x034a  */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(int r31, androidx.compose.runtime.Composer r32, androidx.compose.ui.Modifier r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 989
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.ratingsandreviews.ui.reviewitem.ReviewCardKt.a(int, androidx.compose.runtime.Composer, androidx.compose.ui.Modifier, java.lang.String):void");
    }

    public static final void b(int i, String str, String str2, String str3, String str4, String str5, String str6, Modifier modifier, String str7, Composer composer, int i2) {
        int i3;
        ComposerImpl composerImpl;
        Modifier.Companion companion;
        float f;
        int i4;
        String str8;
        String str9;
        String str10;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-380809655);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.r(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerImplV.n(str3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerImplV.p(true) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerImplV.n(str4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerImplV.n(str5) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerImplV.n(str6) ? 8388608 : 4194304;
        }
        int i5 = i3 | 100663296;
        if ((805306368 & i2) == 0) {
            i5 |= composerImplV.n(str7) ? 536870912 : 268435456;
        }
        int i6 = i5;
        if ((i6 & 306783379) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            str8 = str4;
            str9 = str5;
            str10 = str6;
            composerImpl = composerImplV;
        } else {
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, 12, BitmapDescriptorFactory.HUE_RED, 20, 5);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i7 = composerImplV.P;
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
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                b.B(i7, composerImplV, i7, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            composerImplV.o(387191560);
            StringBuilder sb = new StringBuilder();
            sb.append(StringResources_androidKt.b(R.string.reviews_card_rating_talkback_text, new Object[]{Integer.valueOf(i), 5}, composerImplV));
            composerImplV.o(387195394);
            if (str.equalsIgnoreCase("verified")) {
                sb.append(", " + StringResources_androidKt.c(composerImplV, R.string.reviews_card_rating_verified_talkback_text));
            }
            composerImplV.V(false);
            String string = sb.toString();
            composerImplV.V(false);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i8 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                b.B(i8, composerImplV, i8, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            float f2 = 8;
            float f3 = 16;
            StarRatingBarKt.b(i, string, PaddingKt.j(PaddingKt.h(companion2, BitmapDescriptorFactory.HUE_RED, f2, 1), f3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), 0L, composerImplV, 3120);
            Modifier modifierJ2 = PaddingKt.j(companion2, 2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.shop.product.details.ui.a(27);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            TextKt.a(str, CoreTheme.f(composerImplV).f5120a.c.f5124a, SemanticsModifierKt.b(modifierJ2, false, (Function1) objG), CoreTheme.b(composerImplV).e.d.b, null, 0, 0, false, 0, null, composerImplV, (i6 >> 3) & 14, 1008);
            composerImpl = composerImplV;
            composerImpl.V(true);
            String str11 = (str7 == null || StringsKt.D(str7)) ? null : str7;
            composerImpl.o(387229865);
            if (str11 == null) {
                f = f3;
                companion = companion2;
                i4 = 2;
            } else {
                companion = companion2;
                f = f3;
                i4 = 2;
                c(48, composerImpl, PaddingKt.h(PaddingKt.h(companion, BitmapDescriptorFactory.HUE_RED, f2, 1), f, BitmapDescriptorFactory.HUE_RED, 2), str11);
            }
            composerImpl.V(false);
            String str12 = !StringsKt.D(str3) ? str3 : null;
            composerImpl.o(387239177);
            if (str12 != null) {
                Modifier modifierH = PaddingKt.h(PaddingKt.h(companion, BitmapDescriptorFactory.HUE_RED, f2, 1), f, BitmapDescriptorFactory.HUE_RED, i4);
                int i9 = i6 >> 6;
                ReviewItemRecommendationKt.a(str2, str3, true, modifierH, composerImpl, (i9 & 14) | 3072 | (i9 & 112) | (i9 & 896));
            }
            composerImpl.V(false);
            float f4 = 4;
            int i10 = i6 >> 15;
            str8 = str4;
            str9 = str5;
            ReviewItemInfoKt.a(str8, str9, PaddingKt.h(PaddingKt.h(companion, BitmapDescriptorFactory.HUE_RED, f4, 1), f, BitmapDescriptorFactory.HUE_RED, i4), composerImpl, (i10 & 112) | (i10 & 14) | KyberEngine.KyberPolyBytes);
            Modifier.Companion companion3 = companion;
            str10 = str6;
            a(((i6 >> 21) & 14) | 48, composerImpl, PaddingKt.j(companion3, BitmapDescriptorFactory.HUE_RED, f4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), str10);
            composerImpl.V(true);
            modifier2 = companion3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(i, str, str2, str3, str8, str9, str10, modifier2, str7, i2);
        }
    }

    public static final void c(int i, Composer composer, Modifier modifier, String str) {
        ComposerImpl composerImplV = composer.v(-1889865592);
        int i2 = (composerImplV.n(str) ? 4 : 2) | i;
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else if (str.length() != 0) {
            TextKt.a(str, CoreTheme.f(composerImplV).e.f5133a.b, modifier, CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, (i2 & 14) | KyberEngine.KyberPolyBytes, 1008);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.badge.a(str, modifier, i, 17);
        }
    }
}
