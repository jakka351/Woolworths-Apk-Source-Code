package au.com.woolworths.shop.lists.ui.details.ui.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.dynamic.page.ui.content.o;
import au.com.woolworths.shop.lists.ui.details.models.ListDetails;
import au.com.woolworths.shop.lists.ui.details.models.ListDetailsTotal;
import au.com.woolworths.shop.lists.ui.details.models.ListDetailsTotalDisclaimer;
import au.com.woolworths.shop.lists.ui.details.models.ListDetailsTotalSectionSubItemBase;
import au.com.woolworths.shop.lists.ui.details.models.ListDetailsTotalSummary;
import au.com.woolworths.shop.lists.ui.details.ui.ListDetailsContract;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ListDetailsViewContentKt {
    public static final void a(final ListDetailsContract.ViewState viewState, final Modifier modifier, Composer composer, final int i) {
        ListDetailsTotal listDetailsTotal;
        final Modifier modifier2;
        boolean z;
        Modifier.Companion companion;
        ComposerImpl composerImplV = composer.v(-1972516793);
        if ((((composerImplV.I(viewState) ? 4 : 2) | i) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            ListDetails listDetails = viewState.f12317a;
            if (listDetails == null || (listDetailsTotal = listDetails.f12306a) == null) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    final int i2 = 0;
                    recomposeScopeImplX.d = new Function2(viewState, modifier, i, i2) { // from class: au.com.woolworths.shop.lists.ui.details.ui.compose.a
                        public final /* synthetic */ int d;
                        public final /* synthetic */ ListDetailsContract.ViewState e;
                        public final /* synthetic */ Modifier f;

                        {
                            this.d = i2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i3 = this.d;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i3) {
                                case 0:
                                    ListDetailsViewContentKt.a(this.e, this.f, composer2, RecomposeScopeImplKt.a(49));
                                    break;
                                default:
                                    ListDetailsViewContentKt.a(this.e, this.f, composer2, RecomposeScopeImplKt.a(49));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            float f = viewState.d ? 0.4f : 1.0f;
            modifier2 = modifier;
            Modifier modifierJ = PaddingKt.j(modifier2, BitmapDescriptorFactory.HUE_RED, 4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            composerImplV.o(5004770);
            boolean zQ = composerImplV.q(f);
            Object objG = composerImplV.G();
            if (zQ || objG == Composer.Companion.f1624a) {
                objG = new o(f, 7);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierA = GraphicsLayerModifierKt.a(modifierJ, (Function1) objG);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
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
            ListDetailsTotalSummary listDetailsTotalSummary = listDetailsTotal.b;
            composerImplV.o(417923366);
            Modifier.Companion companion2 = Modifier.Companion.d;
            if (listDetailsTotalSummary == null) {
                companion = companion2;
                z = true;
            } else {
                composerImplV.o(417924655);
                Iterator it = listDetailsTotalSummary.f12314a.iterator();
                while (it.hasNext()) {
                    ListDetailsViewSectionKt.a((ListDetailsTotalSectionSubItemBase) it.next(), PaddingKt.h(companion2, 16, BitmapDescriptorFactory.HUE_RED, 2), composerImplV, 48);
                }
                composerImplV.V(false);
                float f2 = 16;
                Modifier modifierJ2 = PaddingKt.j(companion2, f2, 8, f2, BitmapDescriptorFactory.HUE_RED, 8);
                z = true;
                companion = companion2;
                DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 6, 0L, composerImplV, modifierJ2);
            }
            composerImplV.V(false);
            ListDetailsTotalDisclaimer listDetailsTotalDisclaimer = listDetailsTotal.c;
            composerImplV.o(417936371);
            if (listDetailsTotalDisclaimer != null) {
                float f3 = 16;
                ListDetailsViewDisclaimerKt.a(listDetailsTotalDisclaimer, PaddingKt.i(companion, f3, f3, f3, WindowInsetsKt.d(WindowInsets_androidKt.a(composerImplV), composerImplV).getD()), composerImplV, 0);
            }
            composerImplV.V(false);
            composerImplV.V(z);
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            final int i4 = 1;
            recomposeScopeImplX2.d = new Function2(viewState, modifier2, i, i4) { // from class: au.com.woolworths.shop.lists.ui.details.ui.compose.a
                public final /* synthetic */ int d;
                public final /* synthetic */ ListDetailsContract.ViewState e;
                public final /* synthetic */ Modifier f;

                {
                    this.d = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i32 = this.d;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i32) {
                        case 0:
                            ListDetailsViewContentKt.a(this.e, this.f, composer2, RecomposeScopeImplKt.a(49));
                            break;
                        default:
                            ListDetailsViewContentKt.a(this.e, this.f, composer2, RecomposeScopeImplKt.a(49));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }
}
