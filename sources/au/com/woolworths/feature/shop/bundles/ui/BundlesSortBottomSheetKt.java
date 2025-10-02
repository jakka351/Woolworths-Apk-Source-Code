package au.com.woolworths.feature.shop.bundles.ui;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.DragHandleBehaviour;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.ModalBottomSheetKt;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.feature.shop.bundles.data.BundleSortOptions;
import au.com.woolworths.feature.shop.bundles.data.BundlesData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"bundles_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BundlesSortBottomSheetKt {
    public static final void a(final BundlesData bundlesData, final SheetState sheetState, final Function1 eventSink, Composer composer, final int i) {
        final BundleSortOptions bundleSortOptions;
        Intrinsics.h(sheetState, "sheetState");
        Intrinsics.h(eventSink, "eventSink");
        ComposerImpl composerImplV = composer.v(1962681428);
        int i2 = i | (composerImplV.n(bundlesData) ? 4 : 2) | (composerImplV.n(sheetState) ? 32 : 16) | (composerImplV.I(eventSink) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            BundlesData.BundlesLandingPage bundlesLandingPage = bundlesData instanceof BundlesData.BundlesLandingPage ? (BundlesData.BundlesLandingPage) bundlesData : null;
            if (bundlesLandingPage == null || (bundleSortOptions = bundlesLandingPage.f6763a.c) == null) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    final int i3 = 0;
                    recomposeScopeImplX.d = new Function2(bundlesData, sheetState, eventSink, i, i3) { // from class: au.com.woolworths.feature.shop.bundles.ui.l
                        public final /* synthetic */ int d;
                        public final /* synthetic */ BundlesData e;
                        public final /* synthetic */ SheetState f;
                        public final /* synthetic */ Function1 g;

                        {
                            this.d = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.d;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    BundlesSortBottomSheetKt.a(this.e, this.f, this.g, composer2, RecomposeScopeImplKt.a(1));
                                    break;
                                default:
                                    BundlesSortBottomSheetKt.a(this.e, this.f, this.g, composer2, RecomposeScopeImplKt.a(1));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            float f = 8;
            RoundedCornerShape roundedCornerShapeD = RoundedCornerShapeKt.d(f, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12);
            DragHandleBehaviour dragHandleBehaviour = DragHandleBehaviour.f;
            composerImplV.o(5004770);
            boolean z = (i2 & 896) == 256;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.product.list.v2.ui.f(10, eventSink);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            ModalBottomSheetKt.a((Function0) objG, null, sheetState, roundedCornerShapeD, dragHandleBehaviour, 0L, 0L, ComposableLambdaKt.c(-868760065, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.bundles.ui.BundlesSortBottomSheetKt$BundlesSortBottomSheet$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope ModalBottomSheet = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(ModalBottomSheet, "$this$ModalBottomSheet");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composer2);
                        composer2.o(-1633490746);
                        Object obj4 = bundleSortOptions;
                        boolean zI = composer2.I(obj4);
                        Function1 function1 = eventSink;
                        boolean zN = zI | composer2.n(function1);
                        Object objG2 = composer2.G();
                        if (zN || objG2 == Composer.Companion.f1624a) {
                            objG2 = new m(0, obj4, function1);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        LazyDslKt.b(null, lazyListStateA, null, false, null, null, null, false, null, (Function1) objG2, composer2, 0, 509);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12607488 | ((i2 << 3) & 896), 98);
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            final int i4 = 1;
            recomposeScopeImplX2.d = new Function2(bundlesData, sheetState, eventSink, i, i4) { // from class: au.com.woolworths.feature.shop.bundles.ui.l
                public final /* synthetic */ int d;
                public final /* synthetic */ BundlesData e;
                public final /* synthetic */ SheetState f;
                public final /* synthetic */ Function1 g;

                {
                    this.d = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.d;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            BundlesSortBottomSheetKt.a(this.e, this.f, this.g, composer2, RecomposeScopeImplKt.a(1));
                            break;
                        default:
                            BundlesSortBottomSheetKt.a(this.e, this.f, this.g, composer2, RecomposeScopeImplKt.a(1));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }
}
