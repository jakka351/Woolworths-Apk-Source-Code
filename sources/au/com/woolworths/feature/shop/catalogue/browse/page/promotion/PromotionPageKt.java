package au.com.woolworths.feature.shop.catalogue.browse.page.promotion;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.compose.utils.extensions.ColorExtKt;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.feature.product.list.d0;
import au.com.woolworths.feature.shared.instore.wifi.ui.m;
import au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePage;
import au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePageButton;
import au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePageHeader;
import au.com.woolworths.product.composeui.ProductCardPreviewDataKt;
import au.com.woolworths.product.models.ProductCard;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"catalogue_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PromotionPageKt {

    /* renamed from: a, reason: collision with root package name */
    public static final long f6817a = ColorKt.d(2852126720L);
    public static final long b = ColorKt.b(0);
    public static final long c = ColorKt.b(1040187391);
    public static final /* synthetic */ int d = 0;

    public static final void a(BrowsePage.Promotion promotion, Function0 function0, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-476928976);
        int i2 = (i & 6) == 0 ? (composerImplV.I(promotion) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            List list = promotion.e;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof BrowsePageButton) {
                    arrayList.add(obj);
                }
            }
            BrowsePageButton browsePageButton = (BrowsePageButton) CollectionsKt.F(arrayList);
            if (browsePageButton != null) {
                PrimaryButtonKt.a(browsePageButton.f6808a.getLabel(), function0, SizeKt.e(Modifier.Companion.d, 1.0f), false, false, null, null, null, null, composerImplV, (i2 & 112) | KyberEngine.KyberPolyBytes, 1016);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.b(promotion, i, 22, function0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePage.Promotion r31, androidx.compose.ui.focus.FocusRequester r32, androidx.compose.runtime.Composer r33, int r34) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageKt.b(au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePage$Promotion, androidx.compose.ui.focus.FocusRequester, androidx.compose.runtime.Composer, int):void");
    }

    public static final void c(final MutableState mutableState, final Function1 function1, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1827137807);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(ColumnScopeInstance.f948a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(mutableState) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function1) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final List list = ((PromotionPageGridState) mutableState.getD()).f6816a;
            CompositionLocalKt.a(CompositionLocalsKt.n.b(LayoutDirection.e), ComposableLambdaKt.c(200264783, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageKt$PromotionGrid$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        List list2 = list;
                        GridCells.Fixed fixed = new GridCells.Fixed(list2.size() <= 1 ? 1 : 2);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        float f = 8;
                        Arrangement.SpacedAligned spacedAlignedI = Arrangement.i(f, Alignment.Companion.l);
                        Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(f);
                        Modifier modifierJ = PaddingKt.j(ColumnScopeInstance.f948a.a(Modifier.Companion.d, 1.0f, true), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 7);
                        composer2.o(-1746271574);
                        boolean zI = composer2.I(list2);
                        Function1 function12 = function1;
                        boolean zN = zI | composer2.n(function12);
                        Object obj3 = mutableState;
                        boolean zN2 = zN | composer2.n(obj3);
                        Object objG = composer2.G();
                        if (zN2 || objG == Composer.Companion.f1624a) {
                            objG = new androidx.lifecycle.compose.b(list2, function12, obj3, 13);
                            composer2.A(objG);
                        }
                        composer2.l();
                        LazyGridDslKt.b(fixed, modifierJ, null, null, true, spacedAlignedI, spacedAlignedG, null, false, null, (Function1) objG, composer2, 102457344, 0, 652);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 56);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new m(mutableState, function1, i, 1);
        }
    }

    public static final void d(BrowsePage.Promotion page, Function1 function1, Function0 function0, FocusRequester focusRequester, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Function1 onPromotionCardClick = function1;
        Function0 onPromotionPageButtonClick = function0;
        Intrinsics.h(page, "page");
        String str = page.d;
        Intrinsics.h(onPromotionCardClick, "onPromotionCardClick");
        Intrinsics.h(onPromotionPageButtonClick, "onPromotionPageButtonClick");
        Intrinsics.h(focusRequester, "focusRequester");
        ComposerImpl composerImplV = composer.v(-522432283);
        int i2 = (composerImplV.I(page) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onPromotionCardClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onPromotionPageButtonClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(focusRequester) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((i3 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            FillElement fillElement = SizeKt.c;
            BiasAlignment biasAlignment = Alignment.Companion.f1719a;
            MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, fillElement);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            String str2 = page.c;
            long j = Color.j;
            SingletonAsyncImageKt.b(str2, null, fillElement, new ColorPainter(ColorExtKt.a(j, str)), new ColorPainter(ColorExtKt.a(j, str)), null, null, null, null, null, ContentScale.Companion.f1880a, null, composerImplV, 432, 6, 31712);
            composerImplV = composerImplV;
            e(composerImplV, 0);
            List list = page.e;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof ProductCard) {
                    arrayList.add(obj);
                }
            }
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(new PromotionPageGridState(CollectionsKt.l(arrayList), BitmapDescriptorFactory.HUE_RED));
                composerImplV.A(objG);
            }
            MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            float f = 16;
            Modifier modifierI = PaddingKt.i(SizeKt.c, f, 105, f, 12);
            MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierI);
            ComposeUiNode.e3.getClass();
            Function0 function03 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Function2 function22 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicyD2, function22);
            Function2 function23 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function23);
            Function2 function24 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function24);
            }
            Function2 function25 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD2, function25);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function22);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function23);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function24);
            }
            Updater.b(composerImplV, modifierD3, function25);
            int i7 = i3 << 3;
            int i8 = i3 >> 3;
            b(page, focusRequester, composerImplV, (i7 & 112) | 6 | (i8 & 896));
            long j2 = Color.j;
            composerImplV.o(5004770);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b(mutableState, 5);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 54, 4, j2, composerImplV, OnGloballyPositionedModifierKt.a(companion, (Function1) objG2));
            onPromotionCardClick = function1;
            c(mutableState, onPromotionCardClick, composerImplV, (i7 & 896) | 54);
            int i9 = (i3 & 14) | (i8 & 112);
            onPromotionPageButtonClick = function0;
            a(page, onPromotionPageButtonClick, composerImplV, i9);
            composerImplV.V(true);
            composerImplV.V(true);
            BoxKt.a(BackgroundKt.b(BoxScopeInstance.f944a.g(SizeKt.g(SizeKt.e(companion, 1.0f), 4), Alignment.Companion.g), ToneColors.f5162a, RectangleShapeKt.f1779a), composerImplV, 0);
            composerImplV.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d0(page, onPromotionCardClick, onPromotionPageButtonClick, focusRequester, modifier2, i, 7);
        }
    }

    public static final void e(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1515663641);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            BoxKt.a(BackgroundKt.a(SizeKt.c(SizeKt.e(Modifier.Companion.d, 1.0f), 0.5f), Brush.Companion.b(CollectionsKt.R(new Color(f6817a), new Color(b)))), composerImplV, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.instore.wifi.ui.b(i, 15);
        }
    }

    public static final BrowsePage.Promotion f() {
        List listQ = CollectionsKt.Q(new BrowsePageHeader("Meat, Seafood & Deli", ""));
        IntRange intRange = new IntRange(1, 7, 1);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(intRange, 10));
        IntProgressionIterator it = intRange.iterator();
        while (it.f) {
            arrayList.add(ProductCardPreviewDataKt.b(String.valueOf(it.nextInt()), null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -2, 3));
        }
        return new BrowsePage.Promotion("id", 1, "", "#00dd00", CollectionsKt.d0(new BrowsePageButton(new ButtonApiData("Shop Full Range", null, null, true, null, null, null, null, null, 502, null)), CollectionsKt.c0(arrayList, listQ)), 4);
    }
}
