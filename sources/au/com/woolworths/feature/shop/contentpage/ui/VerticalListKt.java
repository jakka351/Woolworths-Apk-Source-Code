package au.com.woolworths.feature.shop.contentpage.ui;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileData;
import au.com.woolworths.feature.shop.contentpage.ui.infotile.InfoTileKt;
import au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListActionState;
import au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListUiKt;
import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthContentCardData;
import au.com.woolworths.shop.aem.components.model.verticallist.VerticalListActionData;
import au.com.woolworths.shop.aem.components.model.verticallist.VerticalListData;
import au.com.woolworths.shop.aem.components.model.verticallist.VerticalListItem;
import au.com.woolworths.shop.aem.components.ui.contentcard.FullWidthContentCardKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"content-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class VerticalListKt {
    public static final void a(final VerticalListData verticalListData, final Function2 function2, final Function1 function1, final Modifier modifier, Composer composer, final int i) {
        ArrayList<VerticalListItem> arrayList = verticalListData.c;
        ComposerImpl composerImplV = composer.v(1177016507);
        int i2 = i | (composerImplV.I(verticalListData) ? 4 : 2) | (composerImplV.I(function2) ? 32 : 16) | (composerImplV.I(function1) ? 256 : 128);
        if ((i2 & 1171) != 1170 || !composerImplV.c()) {
            if (!arrayList.isEmpty()) {
                for (VerticalListItem verticalListItem : arrayList) {
                    if (!(verticalListItem instanceof FullWidthContentCardData) && !(verticalListItem instanceof InfoTileData)) {
                        break;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                String str = verticalListData.f10186a;
                String str2 = verticalListData.b;
                VerticalListActionData verticalListActionData = verticalListData.d;
                String str3 = verticalListActionData != null ? verticalListActionData.f10185a : null;
                String action = verticalListActionData != null ? verticalListActionData.b.getAction() : null;
                ScrollableListActionState scrollableListActionState = (action == null || action.length() == 0) ? ScrollableListActionState.f : ScrollableListActionState.d;
                composerImplV.o(-1633490746);
                boolean z = true;
                boolean z2 = (i2 & 896) == 256;
                if ((i2 & 14) != 4 && !composerImplV.I(verticalListData)) {
                    z = false;
                }
                boolean z3 = z2 | z;
                Object objG = composerImplV.G();
                if (z3 || objG == Composer.Companion.f1624a) {
                    objG = new au.com.woolworths.feature.rewards.card.overlay.ui.b(29, function1, verticalListData);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                ScrollableListUiKt.c(str, str2, str3, (Function0) objG, scrollableListActionState, modifier, false, ComposableLambdaKt.c(-857018898, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.contentpage.ui.VerticalListKt$VerticalList$4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
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
                            Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                            Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                            Function2 function22 = ComposeUiNode.Companion.j;
                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                androidx.camera.core.impl.b.z(p, composer2, p, function22);
                            }
                            Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                            composer2.o(1545087832);
                            VerticalListData verticalListData2 = verticalListData;
                            for (VerticalListItem verticalListItem2 : verticalListData2.c) {
                                boolean z4 = verticalListItem2 instanceof FullWidthContentCardData;
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                Function2 function23 = function2;
                                if (z4) {
                                    composer2.o(-1117473568);
                                    Orientation orientation = Orientation.e;
                                    FullWidthContentCardData fullWidthContentCardData = (FullWidthContentCardData) verticalListItem2;
                                    composer2.o(-1746271574);
                                    boolean zN = composer2.n(function23) | composer2.I(verticalListData2) | composer2.I(verticalListItem2);
                                    Object objG2 = composer2.G();
                                    if (zN || objG2 == composer$Companion$Empty$1) {
                                        objG2 = new androidx.lifecycle.compose.b(18, function23, verticalListData2, fullWidthContentCardData);
                                        composer2.A(objG2);
                                    }
                                    composer2.l();
                                    Composer composer3 = composer2;
                                    FullWidthContentCardKt.a(orientation, fullWidthContentCardData, (Function1) objG2, null, composer3, 70, 8);
                                    Modifier.Companion companion2 = companion;
                                    companion = companion2;
                                    DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 4, ToneColors.i, composer3, PaddingKt.j(companion2, 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14));
                                    composer2 = composer3;
                                    composer2.l();
                                } else if (verticalListItem2 instanceof InfoTileData) {
                                    composer2.o(-1116950133);
                                    InfoTileData infoTileData = (InfoTileData) verticalListItem2;
                                    composer2.o(-1746271574);
                                    boolean zN2 = composer2.n(function23) | composer2.I(verticalListData2) | composer2.I(verticalListItem2);
                                    Object objG3 = composer2.G();
                                    if (zN2 || objG3 == composer$Companion$Empty$1) {
                                        objG3 = new androidx.lifecycle.compose.b(19, function23, verticalListData2, infoTileData);
                                        composer2.A(objG3);
                                    }
                                    composer2.l();
                                    InfoTileKt.a(infoTileData, null, (Function1) objG3, composer2, 0, 2);
                                    composer2.l();
                                } else {
                                    composer2.o(-1116712208);
                                    composer2.l();
                                }
                            }
                            composer2.l();
                            composer2.f();
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImplV, 12779520, 64);
            }
            RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
            if (recomposeScopeImplX != null) {
                final int i3 = 0;
                recomposeScopeImplX.d = new Function2(verticalListData, function2, function1, modifier, i, i3) { // from class: au.com.woolworths.feature.shop.contentpage.ui.l
                    public final /* synthetic */ int d;
                    public final /* synthetic */ VerticalListData e;
                    public final /* synthetic */ Function2 f;
                    public final /* synthetic */ Function1 g;
                    public final /* synthetic */ Modifier h;

                    {
                        this.d = i3;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.d) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iA = RecomposeScopeImplKt.a(3081);
                                VerticalListKt.a(this.e, this.f, this.g, this.h, (Composer) obj, iA);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iA2 = RecomposeScopeImplKt.a(3081);
                                VerticalListKt.a(this.e, this.f, this.g, this.h, (Composer) obj, iA2);
                                break;
                        }
                        return Unit.f24250a;
                    }
                };
                return;
            }
            return;
        }
        composerImplV.j();
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            final int i4 = 1;
            recomposeScopeImplX2.d = new Function2(verticalListData, function2, function1, modifier, i, i4) { // from class: au.com.woolworths.feature.shop.contentpage.ui.l
                public final /* synthetic */ int d;
                public final /* synthetic */ VerticalListData e;
                public final /* synthetic */ Function2 f;
                public final /* synthetic */ Function1 g;
                public final /* synthetic */ Modifier h;

                {
                    this.d = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.d) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iA = RecomposeScopeImplKt.a(3081);
                            VerticalListKt.a(this.e, this.f, this.g, this.h, (Composer) obj, iA);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iA2 = RecomposeScopeImplKt.a(3081);
                            VerticalListKt.a(this.e, this.f, this.g, this.h, (Composer) obj, iA2);
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }
}
