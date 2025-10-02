package au.com.woolworths.shop.aem.components.ui.editorialbanner;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.compose.utils.extensions.ColorExtKt;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.design.wx.foundation.RewardsColors;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WoolworthsColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.h;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialBannerData;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialBannerFooter;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialBannerImageFormat;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialBannerTextPosition;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialCarousel;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialCarouselItem;
import au.com.woolworths.shop.aem.components.ui.ImagePlaceholderHelperKt;
import au.com.woolworths.shop.aem.components.ui.byline.BylineKt;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class EditorialBannerKt {
    public static final void a(boolean z, EditorialBannerData bannerData, Function1 onEditorialBannerClick, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.h(bannerData, "bannerData");
        Intrinsics.h(onEditorialBannerClick, "onEditorialBannerClick");
        ComposerImpl composerImplV = composer.v(-782675350);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(bannerData) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onEditorialBannerClick) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            EditorialBannerImageFormat editorialBannerImageFormat = bannerData.d;
            EditorialBannerImageFormat editorialBannerImageFormat2 = EditorialBannerImageFormat.g;
            Modifier.Companion companion = Modifier.Companion.d;
            if (editorialBannerImageFormat == editorialBannerImageFormat2) {
                composerImplV.o(696394341);
                f(bannerData, onEditorialBannerClick, composerImplV, (i3 >> 3) & 1022);
                composerImplV.V(false);
                modifier2 = companion;
            } else {
                composerImplV.o(696579566);
                int i4 = i3 & 8190;
                modifier2 = companion;
                e(z, bannerData, onEditorialBannerClick, modifier2, composerImplV, i4);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(z, bannerData, onEditorialBannerClick, modifier2, i, 0);
        }
    }

    public static final void b(final EditorialBannerData editorialBannerData, final Function1 function1, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        String action;
        Modifier modifier2 = modifier;
        ComposerImpl composerImplV = composer.v(-369774635);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(editorialBannerData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function1) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ActionData actionData = editorialBannerData.i;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (actionData == null || (action = actionData.getAction()) == null || !(!StringsKt.D(action))) {
                composerImplV.o(635589405);
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                if (objG == composer$Companion$Empty$1) {
                    objG = new au.com.woolworths.shop.aem.components.ui.chatentrycard.b(17);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                CardKt.a(SemanticsModifierKt.b(modifier2, true, (Function1) objG), RoundedCornerShapeKt.b(12), 0L, 0L, BorderStrokeKt.a(ToneColors.i, 1), 0, composableLambdaImpl, composerImplV, ((i2 << 9) & 3670016) | 196608, 12);
                composerImplV.V(false);
            } else {
                composerImplV.o(635256930);
                BorderStroke borderStrokeA = BorderStrokeKt.a(ToneColors.i, 1);
                RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(12);
                float f = 0;
                composerImplV.o(-1633490746);
                boolean zI = composerImplV.I(editorialBannerData) | ((i2 & 112) == 32);
                Object objG2 = composerImplV.G();
                if (zI || objG2 == composer$Companion$Empty$1) {
                    objG2 = new Function0() { // from class: au.com.woolworths.shop.aem.components.ui.editorialbanner.e
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(editorialBannerData);
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                CardKt.b((Function0) objG2, modifier, false, roundedCornerShapeB, 0L, 0L, borderStrokeA, f, null, composableLambdaImpl, composerImplV, ((i2 >> 3) & 112) | 12582912 | ((i2 << 18) & 1879048192), 308);
                modifier2 = modifier;
                composerImplV = composerImplV;
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.instore.presence.presentation.b(editorialBannerData, function1, modifier2, composableLambdaImpl, i, 13);
        }
    }

    public static final void c(final EditorialCarousel editorialCarousel, final Function1 onEditorialBannerCarouselItemClick, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        EditorialBannerData editorialBannerData;
        Intrinsics.h(onEditorialBannerCarouselItemClick, "onEditorialBannerCarouselItemClick");
        ComposerImpl composerImplV = composer.v(14272156);
        int i2 = i | (composerImplV.I(editorialCarousel) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onEditorialBannerCarouselItemClick) ? 32 : 16;
        }
        int i3 = i2 | KyberEngine.KyberPolyBytes;
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            EditorialBannerKt$EditorialBannerCarousel$positionInLayout$1 editorialBannerKt$EditorialBannerCarousel$positionInLayout$1 = new EditorialBannerKt$EditorialBannerCarousel$positionInLayout$1();
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(lazyListStateA);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (zN || objG == obj) {
                objG = new LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1(lazyListStateA, editorialBannerKt$EditorialBannerCarousel$positionInLayout$1);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            TargetedFlingBehavior targetedFlingBehaviorE = SnapFlingBehaviorKt.e((SnapLayoutInfoProvider) objG, composerImplV, 0);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            EditorialCarouselItem editorialCarouselItem = (EditorialCarouselItem) CollectionsKt.F(editorialCarousel.f10157a);
            Modifier modifierX0 = modifierE.x0(((editorialCarouselItem == null || (editorialBannerData = editorialCarouselItem.f10158a) == null) ? null : editorialBannerData.d) == EditorialBannerImageFormat.g ? TestTagKt.a(companion, "narrowEditorialBannerCarousel") : TestTagKt.a(companion, "fullEditorialBannerCarousel"));
            float f = 16;
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f, f, f, f);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(f);
            composerImplV.o(-1633490746);
            boolean zI = ((i3 & 112) == 32) | composerImplV.I(editorialCarousel);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == obj) {
                objG2 = new Function1() { // from class: au.com.woolworths.shop.aem.components.ui.editorialbanner.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        final boolean z;
                        LazyListScope LazyRow = (LazyListScope) obj2;
                        Intrinsics.h(LazyRow, "$this$LazyRow");
                        ArrayList arrayList = editorialCarousel.f10157a;
                        if (arrayList.isEmpty()) {
                            z = true;
                        } else {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                EditorialBannerData editorialBannerData2 = ((EditorialCarouselItem) it.next()).f10158a;
                                if ((editorialBannerData2 != null ? editorialBannerData2.c : null) != null) {
                                    z = false;
                                    break;
                                }
                            }
                            z = true;
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            final EditorialBannerData editorialBannerData3 = ((EditorialCarouselItem) it2.next()).f10158a;
                            if (editorialBannerData3 != null) {
                                final Function1 function1 = onEditorialBannerCarouselItemClick;
                                LazyListScope.i(LazyRow, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.editorialbanner.EditorialBannerKt$EditorialBannerCarousel$1$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        LazyItemScope item = (LazyItemScope) obj3;
                                        Composer composer2 = (Composer) obj4;
                                        int iIntValue = ((Number) obj5).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        if ((iIntValue & 17) == 16 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            Modifier modifierU = SizeKt.u(Modifier.Companion.d, 280);
                                            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                                            int p = composer2.getP();
                                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                                            Modifier modifierD = ComposedModifierKt.d(composer2, modifierU);
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
                                            Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                                            Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                            Function2 function2 = ComposeUiNode.Companion.j;
                                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                                androidx.camera.core.impl.b.z(p, composer2, p, function2);
                                            }
                                            Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                                            EditorialBannerKt.a(z, editorialBannerData3, function1, null, composer2, 0);
                                            composer2.f();
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, -751838630), 3);
                            }
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            LazyDslKt.d(modifierX0, lazyListStateA, paddingValuesImpl, false, spacedAlignedG, null, targetedFlingBehaviorE, false, null, (Function1) objG2, composerImplV, 24960, 424);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(i, 15, editorialCarousel, onEditorialBannerCarouselItemClick, modifier2, false);
        }
    }

    public static final void d(EditorialBannerData editorialBannerData, Modifier modifier, Function1 onEditorialBannerClick, Composer composer, int i) {
        Intrinsics.h(onEditorialBannerClick, "onEditorialBannerClick");
        ComposerImpl composerImplV = composer.v(-1837192965);
        int i2 = (composerImplV.I(editorialBannerData) ? 4 : 2) | i;
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onEditorialBannerClick) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierE = SizeKt.e(modifier, 1.0f);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierE);
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
            a(true, editorialBannerData, onEditorialBannerClick, null, composerImplV, ((i2 << 3) & 112) | 6 | (i2 & 896));
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(editorialBannerData, modifier, onEditorialBannerClick, i, 14);
        }
    }

    public static final void e(final boolean z, final EditorialBannerData editorialBannerData, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        double d;
        long j;
        String str;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-207051495);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(editorialBannerData) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(modifier) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            String str2 = editorialBannerData.b;
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(str2);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zN || objG == composer$Companion$Empty$1) {
                int i4 = Color.l;
                Color color = new Color(ColorExtKt.a(WoolworthsColors.b, str2));
                composerImplV.A(color);
                objG = color;
            }
            final long j2 = ((Color) objG).f1766a;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zN2 = composerImplV.n(str2);
            Object objG2 = composerImplV.G();
            if (zN2 || objG2 == composer$Companion$Empty$1) {
                d = 0.5d;
                Color color2 = new Color(((double) ColorKt.i(j2)) > 0.5d ? RewardsColors.c : ToneColors.k);
                composerImplV.A(color2);
                objG2 = color2;
            } else {
                d = 0.5d;
            }
            long j3 = ((Color) objG2).f1766a;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zN3 = composerImplV.n(str2);
            Object objG3 = composerImplV.G();
            if (zN3 || objG3 == composer$Companion$Empty$1) {
                j = j3;
                objG3 = new Color(((double) ColorKt.i(j2)) > d ? ToneColors.d : ToneColors.k);
                composerImplV.A(objG3);
            } else {
                j = j3;
            }
            final long j4 = ((Color) objG3).f1766a;
            composerImplV.V(false);
            String str3 = editorialBannerData.f;
            final boolean z2 = (str3 != null && (StringsKt.D(str3) ^ true)) || ((str = editorialBannerData.g) != null && (StringsKt.D(str) ^ true)) || editorialBannerData.h != null;
            Modifier modifierA = TestTagKt.a(modifier, "fullEditorialBanner");
            final long j5 = j;
            ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-2133674492, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.editorialbanner.EditorialBannerKt$FullEditorialBanner$1
                /* JADX WARN: Removed duplicated region for block: B:106:0x033e  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
                @Override // kotlin.jvm.functions.Function2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r40, java.lang.Object r41) {
                    /*
                        Method dump skipped, instructions count: 838
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.aem.components.ui.editorialbanner.EditorialBannerKt$FullEditorialBanner$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerImplV);
            int i5 = i3 >> 3;
            composerImpl = composerImplV;
            b(editorialBannerData, function1, modifierA, composableLambdaImplC, composerImpl, (i5 & 14) | 3072 | (i5 & 112));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(z, editorialBannerData, function1, modifier, i, 1);
        }
    }

    public static final void f(final EditorialBannerData editorialBannerData, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        ComposerImpl composerImpl;
        EditorialBannerData editorialBannerData2 = editorialBannerData;
        ComposerImpl composerImplV = composer.v(-1916865471);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(editorialBannerData2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function1) ? 32 : 16;
        }
        int i3 = i & KyberEngine.KyberPolyBytes;
        Modifier.Companion companion = Modifier.Companion.d;
        if (i3 == 0) {
            i2 |= composerImplV.n(companion) ? 256 : 128;
        }
        int i4 = i2;
        if ((i4 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            function12 = function1;
            composerImpl = composerImplV;
        } else {
            String str = editorialBannerData2.b;
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(str);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zN || objG == composer$Companion$Empty$1) {
                int i5 = Color.l;
                Color color = new Color(ColorExtKt.a(WoolworthsColors.b, str));
                composerImplV.A(color);
                objG = color;
            }
            final long j = ((Color) objG).f1766a;
            boolean z = false;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zN2 = composerImplV.n(str);
            Object objG2 = composerImplV.G();
            if (zN2 || objG2 == composer$Companion$Empty$1) {
                Color color2 = new Color(((double) ColorKt.i(j)) > 0.5d ? RewardsColors.c : ToneColors.k);
                composerImplV.A(color2);
                objG2 = color2;
            }
            final long j2 = ((Color) objG2).f1766a;
            composerImplV.V(false);
            if (editorialBannerData2.f != null && (!StringsKt.D(r5))) {
                z = true;
            }
            final boolean z2 = z;
            editorialBannerData2 = editorialBannerData;
            function12 = function1;
            composerImpl = composerImplV;
            b(editorialBannerData2, function12, companion, ComposableLambdaKt.c(72798572, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.editorialbanner.EditorialBannerKt$NarrowEditorialBanner$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier.Companion companion2 = Modifier.Companion.d;
                        Modifier modifierB = BackgroundKt.b(SizeKt.g(TestTagKt.a(companion2, "narrowEditorialBanner"), 112), j, RectangleShapeKt.f1779a);
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierB);
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
                        Updater.b(composer2, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        EditorialBannerData editorialBannerData3 = editorialBannerData;
                        EditorialBannerTextPosition editorialBannerTextPosition = editorialBannerData3.e;
                        EditorialBannerTextPosition editorialBannerTextPosition2 = EditorialBannerTextPosition.e;
                        boolean z3 = z2;
                        long j3 = j2;
                        RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
                        if (editorialBannerTextPosition == editorialBannerTextPosition2) {
                            composer2.o(-1957976824);
                            EditorialBannerKt.g(editorialBannerData3, rowScopeInstance.a(companion2, 1.0f, true), composer2, 0);
                            if (z3) {
                                EditorialBannerKt.h(editorialBannerData3, j3, rowScopeInstance.a(companion2, 1.0f, true), composer2, 0);
                            }
                            composer2.l();
                        } else {
                            composer2.o(-1957707000);
                            composer2.o(768132611);
                            if (z3) {
                                EditorialBannerKt.h(editorialBannerData3, j3, rowScopeInstance.a(companion2, 1.0f, true), composer2, 0);
                            }
                            composer2.l();
                            EditorialBannerKt.g(editorialBannerData3, rowScopeInstance.a(companion2, 1.0f, true), composer2, 0);
                            composer2.l();
                        }
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, (i4 & 14) | 3072 | (i4 & 112) | (i4 & 896));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new h(editorialBannerData2, function12, i);
        }
    }

    public static final void g(final EditorialBannerData editorialBannerData, final Modifier modifier, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(150949351);
        if ((((composerImplV.I(editorialBannerData) ? 4 : 2) | i | (composerImplV.n(modifier) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ImageWithAltText imageWithAltText = editorialBannerData.c;
            if (imageWithAltText != null) {
                Modifier modifierA = TestTagKt.a(modifier, "narrowEditorialBannerImageContent");
                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                int i2 = composerImplV.P;
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
                Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
                Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
                Function2 function2 = ComposeUiNode.Companion.j;
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                    androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
                }
                Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
                Painter painterA = ImagePlaceholderHelperKt.a(BitmapDescriptorFactory.HUE_RED, 0, 3, composerImplV);
                SingletonAsyncImageKt.b(imageWithAltText.f10141a, imageWithAltText.b, BackgroundKt.b(SizeKt.e(TestTagKt.a(Modifier.Companion.d, "narrowEditorialBannerImage"), 1.0f), ToneColors.i, RectangleShapeKt.f1779a), null, painterA, painterA, null, null, null, null, ContentScale.Companion.f1880a, null, composerImplV, 0, 6, 31688);
                composerImplV.V(true);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(modifier, i) { // from class: au.com.woolworths.shop.aem.components.ui.editorialbanner.c
                public final /* synthetic */ Modifier e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    EditorialBannerKt.g(this.d, this.e, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void h(final EditorialBannerData editorialBannerData, final long j, final Modifier modifier, Composer composer, final int i) {
        float f;
        Modifier.Companion companion;
        boolean z;
        ComposerImpl composerImplV = composer.v(1541129567);
        int i2 = i | (composerImplV.I(editorialBannerData) ? 4 : 2) | (composerImplV.s(j) ? 32 : 16) | (composerImplV.n(modifier) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f2 = 16;
            Modifier modifierF = PaddingKt.f(TestTagKt.a(modifier, "narrowEditorialBannerTextContent"), f2);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
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
            composerImplV.o(903211660);
            String str = editorialBannerData.f;
            Modifier.Companion companion2 = Modifier.Companion.d;
            if (str == null || !(!StringsKt.D(str))) {
                f = f2;
                companion = companion2;
                z = false;
            } else {
                int i4 = ((i2 << 3) & 896) | 48;
                f = f2;
                companion = companion2;
                z = false;
                TextKt.b(editorialBannerData.f, TestTagKt.a(companion2, "narrowEditorialBannerTitle"), j, 0L, null, 0L, null, null, TextUnitKt.c(20), 2, false, 2, 2, null, WxTheme.b(composerImplV).o, composerImplV, i4, 27702, 37880);
                composerImplV = composerImplV;
            }
            composerImplV.V(z);
            EditorialBannerFooter editorialBannerFooter = editorialBannerData.h;
            composerImplV.o(903226426);
            if (editorialBannerFooter != null) {
                BylineKt.a(editorialBannerFooter.c, null, TestTagKt.a(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), "narrowEditorialBannerLogo"), null, 0L, false, false, false, composerImplV, 432, 248);
            }
            composerImplV.V(z);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(j, modifier, i) { // from class: au.com.woolworths.shop.aem.components.ui.editorialbanner.b
                public final /* synthetic */ long e;
                public final /* synthetic */ Modifier f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    EditorialBannerKt.h(this.d, this.e, this.f, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
