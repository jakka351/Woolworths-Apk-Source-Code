package au.com.woolworths.feature.shop.marketplace.ui.facet;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.IntOffset;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceBrands;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceFacet;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceSectionItem;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceSellers;
import au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetContract;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"marketplace_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FacetScreenKt {
    public static final void a(final MarketplaceSectionItem marketplaceSectionItem, final int i, final MarketplaceFacetListener marketplaceFacetListener, final Function1 function1, Composer composer, final int i2) {
        final List list;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-40020639);
        int i3 = composerImplV.O ? -composerImplV.H.v : composerImplV.F.i;
        int i4 = (composerImplV.n(marketplaceSectionItem) ? 4 : 2) | i2 | (composerImplV.r(i) ? 32 : 16);
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= (i2 & 512) == 0 ? composerImplV.n(marketplaceFacetListener) : composerImplV.I(marketplaceFacetListener) ? 256 : 128;
        }
        int i5 = i4 | (composerImplV.I(function1) ? 2048 : 1024);
        if ((i5 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, Modifier.Companion.d);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(1090334214);
            FacetSearchBarKt.a(i, function1, composerImplV, ((i5 >> 3) & 14) | ((i5 >> 6) & 112));
            if (marketplaceSectionItem instanceof MarketplaceBrands) {
                list = ((MarketplaceBrands) marketplaceSectionItem).e;
            } else {
                if (!(marketplaceSectionItem instanceof MarketplaceSellers)) {
                    if (i3 >= 0) {
                        if (composerImplV.O) {
                            SlotWriter slotWriter = composerImplV.H;
                            while (composerImplV.O) {
                                composerImplV.V(slotWriter.w(slotWriter.v));
                            }
                        }
                        SlotReader slotReader = composerImplV.F;
                        while (true) {
                            int i7 = slotReader.i;
                            if (i7 <= i3) {
                                break;
                            } else {
                                composerImplV.V(slotReader.j(i7));
                            }
                        }
                    } else {
                        int i8 = -i3;
                        SlotWriter slotWriter2 = composerImplV.H;
                        while (true) {
                            int i9 = slotWriter2.v;
                            if (i9 <= i8) {
                                break;
                            } else {
                                composerImplV.V(slotWriter2.w(i9));
                            }
                        }
                    }
                    RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                    if (recomposeScopeImplX != null) {
                        final int i10 = 0;
                        recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.shop.marketplace.ui.facet.d
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i10) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        FacetScreenKt.a(marketplaceSectionItem, i, marketplaceFacetListener, function1, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        FacetScreenKt.a(marketplaceSectionItem, i, marketplaceFacetListener, function1, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                                        break;
                                }
                                return Unit.f24250a;
                            }
                        };
                        return;
                    }
                    return;
                }
                list = ((MarketplaceSellers) marketplaceSectionItem).e;
            }
            final boolean z = marketplaceSectionItem instanceof MarketplaceSellers;
            FillElement fillElement = SizeKt.c;
            LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            PaddingValuesImpl paddingValuesImplB = PaddingKt.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, WindowInsetsKt.d(WindowInsets_androidKt.c(composerImplV), composerImplV).getD(), 7);
            composerImplV.o(-1224400529);
            boolean zI = ((i5 & 14) == 4) | ((i5 & 896) == 256 || ((i5 & 512) != 0 && composerImplV.I(marketplaceFacetListener))) | composerImplV.I(list) | composerImplV.p(z);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new Function1() { // from class: au.com.woolworths.feature.shop.marketplace.ui.facet.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        final List listW = CollectionsKt.w(list);
                        final a aVar = new a(1);
                        final a aVar2 = new a(2);
                        int size = listW.size();
                        Function1<Integer, Object> function12 = new Function1<Integer, Object>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.facet.FacetScreenKt$FacetContentUi$lambda$9$lambda$8$lambda$7$$inlined$items$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return aVar.invoke(listW.get(((Number) obj2).intValue()));
                            }
                        };
                        Function1<Integer, Object> function13 = new Function1<Integer, Object>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.facet.FacetScreenKt$FacetContentUi$lambda$9$lambda$8$lambda$7$$inlined$items$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return aVar2.invoke(listW.get(((Number) obj2).intValue()));
                            }
                        };
                        final boolean z2 = z;
                        final MarketplaceFacetListener marketplaceFacetListener2 = marketplaceFacetListener;
                        final MarketplaceSectionItem marketplaceSectionItem2 = marketplaceSectionItem;
                        LazyColumn.b(size, function12, function13, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.facet.FacetScreenKt$FacetContentUi$lambda$9$lambda$8$lambda$7$$inlined$items$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                int i11;
                                LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                                int iIntValue = ((Number) obj3).intValue();
                                Composer composer2 = (Composer) obj4;
                                int iIntValue2 = ((Number) obj5).intValue();
                                if ((iIntValue2 & 6) == 0) {
                                    i11 = (composer2.n(lazyItemScope) ? 4 : 2) | iIntValue2;
                                } else {
                                    i11 = iIntValue2;
                                }
                                if ((iIntValue2 & 48) == 0) {
                                    i11 |= composer2.r(iIntValue) ? 32 : 16;
                                }
                                if (composer2.z(i11 & 1, (i11 & 147) != 146)) {
                                    final MarketplaceFacet marketplaceFacet = (MarketplaceFacet) listW.get(iIntValue);
                                    composer2.o(-890431020);
                                    Modifier modifierA = lazyItemScope.a(AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5), AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntOffset(VisibilityThresholdsKt.a()), 1), AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5));
                                    String f7474a = marketplaceFacet.getF7474a();
                                    String b = z2 ? marketplaceFacet.getB() : null;
                                    composer2.o(-1746271574);
                                    final MarketplaceFacetListener marketplaceFacetListener3 = marketplaceFacetListener2;
                                    boolean zI2 = composer2.I(marketplaceFacetListener3) | composer2.I(marketplaceFacet);
                                    final MarketplaceSectionItem marketplaceSectionItem3 = marketplaceSectionItem2;
                                    boolean zI3 = zI2 | composer2.I(marketplaceSectionItem3);
                                    Object objG2 = composer2.G();
                                    if (zI3 || objG2 == Composer.Companion.f1624a) {
                                        objG2 = new Function0<Unit>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.facet.FacetScreenKt$FacetContentUi$1$1$1$3$1$1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                MarketplaceSectionItem marketplaceSectionItem4 = marketplaceSectionItem3;
                                                marketplaceFacetListener3.F2(marketplaceFacet, marketplaceSectionItem4.getC(), marketplaceSectionItem4.getD());
                                                return Unit.f24250a;
                                            }
                                        };
                                        composer2.A(objG2);
                                    }
                                    composer2.l();
                                    FacetItemKt.a(0, 0, composer2, modifierA, f7474a, b, (Function0) objG2);
                                    composer2.l();
                                } else {
                                    composer2.j();
                                }
                                return Unit.f24250a;
                            }
                        }, true, -632812321));
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            LazyDslKt.b(fillElement, lazyListStateA, paddingValuesImplB, false, null, null, null, false, null, (Function1) objG, composerImplV, 6, 504);
            composerImpl = composerImplV;
            composerImpl.V(false);
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImpl.X();
        if (recomposeScopeImplX2 != null) {
            final int i11 = 1;
            recomposeScopeImplX2.d = new Function2() { // from class: au.com.woolworths.feature.shop.marketplace.ui.facet.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i11) {
                        case 0:
                            ((Integer) obj2).getClass();
                            FacetScreenKt.a(marketplaceSectionItem, i, marketplaceFacetListener, function1, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            FacetScreenKt.a(marketplaceSectionItem, i, marketplaceFacetListener, function1, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(MarketplaceFacetContract.ViewState viewState, MarketplaceFacetListener onFacetClick, Function0 onErrorRetry, Function1 onSubmitSearch, Composer composer, int i) {
        boolean z;
        Intrinsics.h(viewState, "viewState");
        MarketplaceErrorState marketplaceErrorState = viewState.f;
        Intrinsics.h(onFacetClick, "onFacetClick");
        Intrinsics.h(onErrorRetry, "onErrorRetry");
        Intrinsics.h(onSubmitSearch, "onSubmitSearch");
        ComposerImpl composerImplV = composer.v(1468894970);
        int i2 = i | (composerImplV.I(viewState) ? 4 : 2) | (composerImplV.n(onFacetClick) ? 32 : 16) | (composerImplV.I(onErrorRetry) ? 256 : 128) | (composerImplV.I(onSubmitSearch) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            FillElement fillElement = SizeKt.c;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, fillElement);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            if (marketplaceErrorState != null) {
                composerImplV.o(-589755057);
                ErrorScreenKt.a(marketplaceErrorState, onErrorRetry, composerImplV, (i2 >> 3) & 112);
                composerImplV.V(false);
                z = true;
            } else if (viewState.f7489a) {
                composerImplV.o(-589752069);
                ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 30, 0L, 0L, composerImplV, BoxScopeInstance.f944a.g(Modifier.Companion.d, Alignment.Companion.e));
                composerImplV.V(false);
                z = true;
            } else {
                z = true;
                if (viewState.c != null) {
                    composerImplV.o(-589748671);
                    a(viewState.c, viewState.d, onFacetClick, onSubmitSearch, composerImplV, ((i2 << 3) & 896) | (i2 & 7168));
                    composerImplV.V(false);
                } else {
                    composerImplV.o(-1102113470);
                    composerImplV.V(false);
                }
            }
            composerImplV.V(z);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a(viewState, onFacetClick, onErrorRetry, onSubmitSearch, i, 18);
        }
    }
}
