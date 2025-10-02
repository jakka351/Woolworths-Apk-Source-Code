package au.com.woolworths.feature.product.list.compose.filter;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.text.InlineLabelSpec;
import au.com.woolworths.design.wx.component.text.InlineLabelTextKt;
import au.com.woolworths.design.wx.component.text.SpanPlacement;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.data.FilterHighlightCard;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FilterCardItemKt {
    public static final void a(final Function0 onCardDismissed, Composer composer, int i) {
        int i2;
        Intrinsics.h(onCardDismissed, "onCardDismissed");
        ComposerImpl composerImplV = composer.v(1325418806);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(onCardDismissed) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CardKt.a(PaddingKt.h(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, 4, 1), null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(-237172941, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.filter.FilterCardItemKt$FilterCardItem$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Function2 function2;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierF = PaddingKt.f(companion, 12);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$1, Alignment.Companion.k, composer2, 48);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierF);
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
                        Function2 function22 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, rowMeasurePolicyA, function22);
                        Function2 function23 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function23);
                        Function2 function24 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function24);
                        }
                        Function2 function25 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function25);
                        float f = 4;
                        ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_filter_card_icon, 0, composer2), null, PaddingKt.j(SizeKt.q(companion, 44), f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), null, null, BitmapDescriptorFactory.HUE_RED, null, composer2, 432, 120);
                        RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(arrangement$Start$1, Alignment.Companion.j, composer2, 0);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, companion);
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
                        Updater.b(composer2, rowMeasurePolicyA2, function22);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function23);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            function2 = function24;
                            androidx.camera.core.impl.b.z(p2, composer2, p2, function2);
                        } else {
                            function2 = function24;
                        }
                        Updater.b(composer2, modifierD2, function25);
                        Modifier modifierH = PaddingKt.h(RowScopeInstance.f974a.a(companion, 1.0f, true), 16, BitmapDescriptorFactory.HUE_RED, 2);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p3 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer2.d();
                        Modifier modifierD3 = ComposedModifierKt.d(composer2, modifierH);
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
                        Updater.b(composer2, columnMeasurePolicyA, function22);
                        Updater.b(composer2, persistentCompositionLocalMapD3, function23);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p3))) {
                            androidx.camera.core.impl.b.z(p3, composer2, p3, function2);
                        }
                        Updater.b(composer2, modifierD3, function25);
                        InlineLabelSpec inlineLabelSpec = InlineLabelSpec.Branded.f5149a;
                        FilterHighlightCard filterHighlightCard = FilterHighlightCard.TITLE;
                        Text spannedText = filterHighlightCard.getSpannedText();
                        composer2.o(1821976338);
                        CharSequence text = spannedText == null ? null : spannedText.getText((Context) composer2.x(AndroidCompositionLocals_androidKt.b));
                        composer2.l();
                        String string = text != null ? text.toString() : null;
                        if (string == null) {
                            string = "";
                        }
                        Text plainText = filterHighlightCard.getPlainText();
                        composer2.o(1821981298);
                        CharSequence text2 = plainText == null ? null : plainText.getText((Context) composer2.x(AndroidCompositionLocals_androidKt.b));
                        composer2.l();
                        String string2 = text2 != null ? text2.toString() : null;
                        String str = string2 == null ? "" : string2;
                        SpanPlacement[] spanPlacementArr = SpanPlacement.d;
                        InlineLabelTextKt.a(inlineLabelSpec, string, null, true, 0L, null, null, str, 1, null, composer2, 24960, 6, 232);
                        TextKt.b(StringResources_androidKt.c(composer2, R.string.filter_highlight_card_contents), PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), WxTheme.a(composer2).f(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).r, composer2, 48, 0, 65528);
                        composer2.f();
                        IconButtonKt.c(CloseKt.a(), StringResources_androidKt.c(composer2, R.string.content_description_close_button), onCardDismissed, SizeKt.q(companion, 24), false, ToneColors.e, composer2, 3072, 16);
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1572870, 62);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(i, 0, onCardDismissed);
        }
    }
}
