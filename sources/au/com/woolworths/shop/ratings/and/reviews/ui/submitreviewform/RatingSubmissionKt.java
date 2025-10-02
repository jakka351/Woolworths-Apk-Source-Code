package au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.aem.components.ui.pagecover.e;
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

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "rating", "ratings-and-reviews_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RatingSubmissionKt {

    /* renamed from: a, reason: collision with root package name */
    public static final long f12783a = ColorKt.d(4290582044L);
    public static final /* synthetic */ int b = 0;

    public static final void a(long j, final int i, Function0 function0, final long j2, final String str, Composer composer, int i2) {
        ComposerImpl composerImplV = composer.v(648369026);
        int i3 = i2 | (composerImplV.s(j) ? 4 : 2) | (composerImplV.r(i) ? 32 : 16) | (composerImplV.I(function0) ? 256 : 128) | (composerImplV.s(j2) ? 2048 : 1024) | (composerImplV.n(str) ? 16384 : 8192);
        if ((i3 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            IconButtonKt.a(function0, BackgroundKt.b(Modifier.Companion.d, j, RoundedCornerShapeKt.b(10)), false, ComposableLambdaKt.c(-1809795705, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.RatingSubmissionKt$RatingIconButton$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        IconKt.a(PainterResources_androidKt.a(i, 0, composer2), str, null, j2, composer2, 0, 4);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i3 >> 6) & 14) | 3072, 4);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(j, i, function0, j2, str, i2);
        }
    }

    public static final void b(String title, int i, Modifier modifier, String str, Function1 onRatingChanged, Composer composer, int i2, int i3) {
        String str2;
        int i4;
        Modifier modifier2;
        boolean z;
        long jB;
        long jC;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        int i5 = i;
        Intrinsics.h(title, "title");
        Intrinsics.h(onRatingChanged, "onRatingChanged");
        ComposerImpl composerImplV = composer.v(-633625508);
        int i6 = (composerImplV.n(title) ? 4 : 2) | i2 | (composerImplV.r(i5) ? 32 : 16);
        int i7 = i6 | KyberEngine.KyberPolyBytes;
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 = i6 | 3456;
            str2 = str;
        } else {
            str2 = str;
            i4 = i7 | (composerImplV.n(str2) ? 2048 : 1024);
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerImplV.I(onRatingChanged) ? 16384 : 8192;
        }
        if ((i4 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            if (i8 != 0) {
                str2 = null;
            }
            String str3 = str2;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(PaddingKt.h(companion, 16, BitmapDescriptorFactory.HUE_RED, 2), 1.0f);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$12) {
                objG = new au.com.woolworths.shop.product.details.ui.a(19);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifierE, false, (Function1) objG);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i9 = composerImplV.P;
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
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i9))) {
                androidx.camera.core.impl.b.B(i9, composerImplV, i9, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            TextStyle textStyle = WxTheme.b(composerImplV).o;
            composerImplV.o(-828885319);
            long jF = f12783a;
            long jF2 = (str3 == null || str3.length() == 0) ? WxTheme.a(composerImplV).f() : jF;
            composerImplV.V(false);
            int i10 = i4;
            Composer$Companion$Empty$1 composer$Companion$Empty$13 = composer$Companion$Empty$12;
            TextKt.b(title, null, jF2, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composerImplV, i4 & 14, 0, 65530);
            Arrangement.SpacedAligned spacedAlignedH = Arrangement.h(8, horizontal);
            Modifier modifierH = PaddingKt.h(companion, BitmapDescriptorFactory.HUE_RED, 12, 1);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(spacedAlignedH, Alignment.Companion.j, composerImplV, 6);
            int i11 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierH);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i11))) {
                androidx.camera.core.impl.b.B(i11, composerImplV, i11, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            composerImplV.o(679912640);
            int i12 = 1;
            while (i12 < 6) {
                if (i12 <= i) {
                    composerImplV.o(679917833);
                    jB = WxTheme.a(composerImplV).h();
                    z = false;
                    composerImplV.V(false);
                } else {
                    z = false;
                    composerImplV.o(679919765);
                    jB = WxTheme.a(composerImplV).b();
                    composerImplV.V(false);
                }
                int i13 = i12 <= i ? R.drawable.icon_submit_review_star_filled : R.drawable.icon_submit_review_star;
                if (i12 <= i) {
                    composerImplV.o(679931372);
                    jC = WxTheme.a(composerImplV).a();
                    composerImplV.V(z);
                } else {
                    composerImplV.o(679933385);
                    jC = WxTheme.a(composerImplV).c();
                    composerImplV.V(z);
                }
                long j = jC;
                composerImplV.o(-868945888);
                String strL = i12 <= i ? d.l(composerImplV, -1833337587, R.string.review_submission_talkback_state_label_selected, composerImplV, z) : d.l(composerImplV, -1833334577, R.string.review_submission_talkback_state_label_unselected, composerImplV, z);
                String str4 = strL + ", " + StringResources_androidKt.a(R.plurals.review_submission_star_content_description, i12, new Object[]{Integer.valueOf(i12)}, composerImplV);
                composerImplV.V(z);
                composerImplV.o(-1633490746);
                boolean zR = ((i10 & 57344) == 16384 ? true : z) | composerImplV.r(i12);
                Object objG2 = composerImplV.G();
                if (zR) {
                    composer$Companion$Empty$1 = composer$Companion$Empty$13;
                } else {
                    composer$Companion$Empty$1 = composer$Companion$Empty$13;
                    if (objG2 == composer$Companion$Empty$1) {
                    }
                    composerImplV.V(z);
                    composer$Companion$Empty$13 = composer$Companion$Empty$1;
                    a(jB, i13, (Function0) objG2, j, str4, composerImplV, 0);
                    i12++;
                }
                objG2 = new au.com.woolworths.design.core.ui.component.experimental.segmentedbuttons.b(i12, 6, onRatingChanged);
                composerImplV.A(objG2);
                composerImplV.V(z);
                composer$Companion$Empty$13 = composer$Companion$Empty$1;
                a(jB, i13, (Function0) objG2, j, str4, composerImplV, 0);
                i12++;
            }
            i5 = i;
            composerImplV.V(false);
            composerImplV.V(true);
            composerImplV.o(-828845476);
            String strB = str3 == null ? StringResources_androidKt.b(R.string.product_review_submission_selection, new Object[]{Integer.valueOf(i5)}, composerImplV) : str3;
            composerImplV.V(false);
            TextStyle textStyle2 = WxTheme.b(composerImplV).r;
            composerImplV.o(-828840487);
            if (str3 == null || str3.length() == 0) {
                jF = WxTheme.a(composerImplV).f();
            }
            long j2 = jF;
            composerImplV.V(false);
            TextKt.b(strB, null, j2, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle2, composerImplV, 0, 0, 65530);
            composerImplV = composerImplV;
            composerImplV.V(true);
            modifier2 = companion;
            str2 = str3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(title, i5, modifier2, str2, onRatingChanged, i2, i3);
        }
    }
}
