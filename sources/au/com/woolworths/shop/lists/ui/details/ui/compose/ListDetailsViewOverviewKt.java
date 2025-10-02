package au.com.woolworths.shop.lists.ui.details.ui.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.dynamic.page.ui.content.o;
import au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui.f;
import au.com.woolworths.product.details.d;
import au.com.woolworths.shop.lists.ui.details.models.ListDetails;
import au.com.woolworths.shop.lists.ui.details.models.ListDetailsTotal;
import au.com.woolworths.shop.lists.ui.details.models.ListDetailsTotalOverview;
import au.com.woolworths.shop.lists.ui.details.ui.ListDetailsContract;
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

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ListDetailsViewOverviewKt {
    public static final void a(final ListDetailsContract.ViewState viewState, final Modifier modifier, final Function0 onClick, Composer composer, final int i) {
        ListDetailsTotal listDetailsTotal;
        ListDetailsTotalOverview listDetailsTotalOverview;
        boolean z = viewState.d;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(398206219);
        int i2 = (composerImplV.I(viewState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onClick) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ListDetails listDetails = viewState.f12317a;
            if (listDetails == null || (listDetailsTotal = listDetails.f12306a) == null || (listDetailsTotalOverview = listDetailsTotal.f12310a) == null) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    final int i3 = 0;
                    recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.shop.lists.ui.details.ui.compose.c
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    ListDetailsViewOverviewKt.a(viewState, modifier, onClick, composer2, RecomposeScopeImplKt.a(i | 1));
                                    break;
                                default:
                                    ListDetailsViewOverviewKt.a(viewState, modifier, onClick, composer2, RecomposeScopeImplKt.a(i | 1));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            float f = z ? 0.4f : 1.0f;
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = InteractionSourceKt.a();
                composerImplV.A(objG);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objG;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean z2 = (i2 & 896) == 256;
            Object objG2 = composerImplV.G();
            if (z2 || objG2 == obj) {
                objG2 = new f(22, onClick);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            float f2 = 16;
            Modifier modifierH = PaddingKt.h(ClickableKt.b(modifier, mutableInteractionSource, null, false, null, null, (Function0) objG2, 28), BitmapDescriptorFactory.HUE_RED, f2, 1);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            BiasAlignment.Vertical vertical = Alignment.Companion.k;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$1, vertical, composerImplV, 48);
            int i4 = composerImplV.P;
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
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Modifier.Companion companion = Modifier.Companion.d;
            float f3 = 24;
            Modifier modifierB = BackgroundKt.b(ClipKt.a(SizeKt.q(PaddingKt.j(companion, f2, BitmapDescriptorFactory.HUE_RED, 12, BitmapDescriptorFactory.HUE_RED, 10), f3), RoundedCornerShapeKt.f1100a), WxTheme.a(composerImplV).b(), RectangleShapeKt.f1779a);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            Modifier modifierB2 = rowScopeInstance.b(modifierB, vertical);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierB2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            float f4 = 8;
            float f5 = f;
            ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_chevron_point_up_no_padding, 0, composerImplV), null, RotateKt.a(PaddingKt.g(companion, 6, f4), viewState.e), null, null, BitmapDescriptorFactory.HUE_RED, ColorFilter.Companion.a(WxTheme.a(composerImplV).h()), composerImplV, 48, 56);
            composerImplV.V(true);
            String str = listDetailsTotalOverview.f12312a;
            TextStyle textStyle = WxTheme.b(composerImplV).l;
            composerImplV.o(5004770);
            boolean zQ = composerImplV.q(f5);
            Object objG3 = composerImplV.G();
            if (zQ || objG3 == obj) {
                objG3 = new o(f5, 8);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            Modifier modifierJ = PaddingKt.j(GraphicsLayerModifierKt.a(companion, (Function1) objG3), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f4, BitmapDescriptorFactory.HUE_RED, 11);
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(listDetailsTotalOverview);
            Object objG4 = composerImplV.G();
            if (zN || objG4 == obj) {
                objG4 = new d(listDetailsTotalOverview, 29);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            TextKt.b(str, SemanticsModifierKt.b(modifierJ, false, (Function1) objG4), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composerImplV, 0, 0, 65532);
            String str2 = listDetailsTotalOverview.b;
            TextStyle textStyle2 = WxTheme.b(composerImplV).i;
            composerImplV.o(5004770);
            boolean zQ2 = composerImplV.q(f5);
            Object objG5 = composerImplV.G();
            if (zQ2 || objG5 == obj) {
                objG5 = new o(f5, 9);
                composerImplV.A(objG5);
            }
            composerImplV.V(false);
            TextKt.b(str2, GraphicsLayerModifierKt.a(companion, (Function1) objG5), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle2, composerImplV, 0, 0, 65532);
            composerImplV = composerImplV;
            SpacerKt.a(composerImplV, rowScopeInstance.a(companion, 1.0f, true));
            composerImplV.o(336479476);
            if (z) {
                ProgressIndicatorKt.b(3, 0, 390, 26, 0L, 0L, composerImplV, SizeKt.q(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, BitmapDescriptorFactory.HUE_RED, 11), f3));
                composerImplV = composerImplV;
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            final int i6 = 1;
            recomposeScopeImplX2.d = new Function2() { // from class: au.com.woolworths.shop.lists.ui.details.ui.compose.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj22) {
                    int i42 = i6;
                    Composer composer2 = (Composer) obj2;
                    ((Integer) obj22).getClass();
                    switch (i42) {
                        case 0:
                            ListDetailsViewOverviewKt.a(viewState, modifier, onClick, composer2, RecomposeScopeImplKt.a(i | 1));
                            break;
                        default:
                            ListDetailsViewOverviewKt.a(viewState, modifier, onClick, composer2, RecomposeScopeImplKt.a(i | 1));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }
}
