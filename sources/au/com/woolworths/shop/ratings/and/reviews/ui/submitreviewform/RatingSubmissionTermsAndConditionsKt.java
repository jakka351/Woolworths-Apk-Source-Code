package au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.CheckboxKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
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

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "agreed", "ratings-and-reviews_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RatingSubmissionTermsAndConditionsKt {
    public static final void a(final String str, final boolean z, Function1 onAgreeSelectionChanged, final String str2, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        ComposerImpl composerImpl;
        Modifier modifier3;
        Intrinsics.h(onAgreeSelectionChanged, "onAgreeSelectionChanged");
        ComposerImpl composerImplV = composer.v(-631488457);
        if ((i & 6) == 0) {
            i3 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | (composerImplV.p(z) ? 32 : 16);
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i5 |= composerImplV.I(onAgreeSelectionChanged) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= composerImplV.n(str2) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i4 = i5 | 24576;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i4 = i5 | (composerImplV.n(modifier2) ? 16384 : 8192);
        }
        if ((i4 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            modifier3 = modifier2;
        } else {
            if (i6 != 0) {
                modifier2 = Modifier.Companion.d;
            }
            composerImplV.o(-1633490746);
            boolean z2 = ((i4 & 896) == 256) | ((i4 & 112) == 32);
            Object objG = composerImplV.G();
            if (z2 || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.foundation.shop.video.advertising.ui.c(onAgreeSelectionChanged, z, 1);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifier4 = modifier2;
            composerImpl = composerImplV;
            SurfaceKt.b((Function0) objG, modifier4, false, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, null, ComposableLambdaKt.c(432739710, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.RatingSubmissionTermsAndConditionsKt$RatingSubmissionTermsAndConditions$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String strC;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierD = ComposedModifierKt.d(composer2, companion);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Function2 function2 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, columnMeasurePolicyA, function2);
                        Function2 function22 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function22);
                        Function2 function23 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function24);
                        boolean z3 = z;
                        if (z3) {
                            composer2.o(1351519065);
                            strC = StringResources_androidKt.c(composer2, R.string.review_submission_tnc_talkback_accepted);
                            composer2.l();
                        } else {
                            composer2.o(1351522077);
                            strC = StringResources_androidKt.c(composer2, R.string.review_submission_tnc_talkback_not_accepted);
                            composer2.l();
                        }
                        Modifier modifierE = SizeKt.e(SizeKt.g(companion, 48), 1.0f);
                        composer2.o(5004770);
                        boolean zN = composer2.n(strC);
                        Object objG2 = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (zN || objG2 == composer$Companion$Empty$1) {
                            objG2 = new au.com.woolworths.shared.ui.compose.a(strC, 24);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        Modifier modifierB = SemanticsModifierKt.b(modifierE, false, (Function1) objG2);
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer2, 48);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierB);
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, rowMeasurePolicyA, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            androidx.camera.core.impl.b.z(p2, composer2, p2, function23);
                        }
                        Updater.b(composer2, modifierD2, function24);
                        CheckboxKt.a(z3, null, null, false, null, composer2, 48, 60);
                        int iJ = ColorKt.j(WxTheme.a(composer2).c());
                        Modifier modifierJ = PaddingKt.j(companion, 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                        composer2.o(5004770);
                        boolean zR = composer2.r(iJ);
                        Object objG3 = composer2.G();
                        if (zR || objG3 == composer$Companion$Empty$1) {
                            objG3 = new au.com.woolworths.markdown.compat.c(iJ, 2);
                            composer2.A(objG3);
                        }
                        composer2.l();
                        MarkdownCompatKt.a(str, modifierJ, null, (Function1) objG3, false, null, null, false, null, null, composer2, 48, 1012);
                        composer2.f();
                        TextKt.b(str2, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).n, composer2, 48, 0, 65532);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, ((i4 >> 9) & 112) | 805306368, 508);
            modifier3 = modifier4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.inbox.ui.component.a(str, z, onAgreeSelectionChanged, str2, modifier3, i, i2);
        }
    }
}
