package au.com.woolworths.feature.product.list.legacy.compose.errorscreen;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import au.com.woolworths.design.core.ui.component.experimental.quantitystepper.j;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.feature.product.list.compose.errorscreen.c;
import au.com.woolworths.feature.product.list.compose.errorscreen.e;
import au.com.woolworths.feature.product.list.compose.errorscreen.f;
import au.com.woolworths.feature.product.list.compose.errorscreen.g;
import au.com.woolworths.feature.product.list.legacy.data.ZeroResultPageData;
import au.com.woolworths.feature.product.list.legacy.data.ZeroResultProductCategories;
import au.com.woolworths.feature.product.list.legacy.y;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import au.com.woolworths.feature.shop.contentpage.ui.HorizontalListKt;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.shared.ui.compose.shop.chatentrycard.ChatEntryBannerUiKt;
import au.com.woolworths.shared.ui.compose.shop.chatentrycard.ChatEntryCardV3;
import au.com.woolworths.shop.aem.components.model.productcategorytile.ProductCategoryTileData;
import au.com.woolworths.shop.aem.components.ui.categorytile.ProductCategoryTileKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ZeroResultContentViewKt {
    public static final void a(int i, Composer composer, Function1 onBannerClick) {
        Intrinsics.h(onBannerClick, "onBannerClick");
        ComposerImpl composerImplV = composer.v(-952409169);
        int i2 = (composerImplV.I(onBannerClick) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ActionData actionData = new ActionData("", ActionType.e, null, null);
            Modifier modifierB = BackgroundKt.b(SizeKt.e(Modifier.Companion.d, 1.0f), CoreTheme.b(composerImplV).e.f4848a.c, RectangleShapeKt.f1779a);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
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
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            String strC = StringResources_androidKt.c(composerImplV, R.string.ask_olive_entry_banner_title);
            ChatEntryCardV3 chatEntryCardV3 = new ChatEntryCardV3(strC, Boolean.TRUE, CollectionsKt.R(StringResources_androidKt.c(composerImplV, R.string.ask_olive_entry_banner_subtitle_gluten_free_snack), StringResources_androidKt.c(composerImplV, R.string.ask_olive_entry_banner_subtitle_lunchbox_specials_under_10)), actionData);
            composerImplV.o(-1633490746);
            boolean zN = ((i2 & 14) == 4) | composerImplV.n(strC);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.product.list.compose.errorscreen.b(onBannerClick, strC, 1);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            ChatEntryBannerUiKt.a(chatEntryCardV3, (Function1) objG, composerImplV, 8);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(i, 1, onBannerClick);
        }
    }

    public static final void b(final ZeroResultPageData data, final boolean z, final ProductClickListener productClickListener, final Function1 onBrowseAllAislesClick, final Function1 onProductCategoryTileClick, Function0 onZeroResultVisible, final Function1 onZeroResultHorizontalListVisible, boolean z2, final Function1 onChatEntryBannerClicked, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        boolean z3;
        final Modifier modifier2;
        ComposerImpl composerImpl;
        Intrinsics.h(data, "data");
        Intrinsics.h(productClickListener, "productClickListener");
        Intrinsics.h(onBrowseAllAislesClick, "onBrowseAllAislesClick");
        Intrinsics.h(onProductCategoryTileClick, "onProductCategoryTileClick");
        Intrinsics.h(onZeroResultVisible, "onZeroResultVisible");
        Intrinsics.h(onZeroResultHorizontalListVisible, "onZeroResultHorizontalListVisible");
        Intrinsics.h(onChatEntryBannerClicked, "onChatEntryBannerClicked");
        ComposerImpl composerImplV = composer.v(-1509527017);
        if ((i & 6) == 0) {
            i3 = (composerImplV.I(data) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(productClickListener) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerImplV.I(onBrowseAllAislesClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerImplV.I(onProductCategoryTileClick) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerImplV.I(onZeroResultVisible) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerImplV.I(onZeroResultHorizontalListVisible) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            z3 = z2;
            i3 |= composerImplV.p(z3) ? 8388608 : 4194304;
        } else {
            z3 = z2;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerImplV.I(onChatEntryBannerClicked) ? 67108864 : 33554432;
        }
        int i4 = i2 & 512;
        if (i4 != 0) {
            i3 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i3 |= composerImplV.n(modifier) ? 536870912 : 268435456;
        }
        if ((i3 & 306783379) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.Companion.d : modifier;
            LazyGridState lazyGridStateA = LazyGridStateKt.a(0, 3, composerImplV);
            final LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            composerImplV.o(5004770);
            boolean z4 = (458752 & i3) == 131072;
            Object objG = composerImplV.G();
            boolean z5 = z4;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z5 || objG == composer$Companion$Empty$1) {
                objG = new j(2, onZeroResultVisible);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.c(Unit.f24250a, (Function1) objG, composerImplV);
            GridCells.Fixed fixed = new GridCells.Fixed(2);
            Modifier modifier4 = modifier3;
            Modifier modifierB = BackgroundKt.b(modifier3.x0(SizeKt.c), CoreTheme.b(composerImplV).e.f4848a.d, RectangleShapeKt.f1779a);
            composerImplV.o(-1224400529);
            boolean zI = composerImplV.I(data) | ((29360128 & i3) == 8388608) | ((234881024 & i3) == 67108864) | ((57344 & i3) == 16384) | ((i3 & 7168) == 2048) | ((3670016 & i3) == 1048576) | ((i3 & 112) == 32) | composerImplV.I(productClickListener) | composerImplV.n(lazyListStateA) | ((i3 & 1879048192) == 536870912);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                final boolean z6 = z3;
                modifier2 = modifier4;
                Function1 function1 = new Function1() { // from class: au.com.woolworths.feature.product.list.legacy.compose.errorscreen.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        final boolean z7;
                        boolean z8;
                        LazyGridScope LazyVerticalGrid = (LazyGridScope) obj;
                        Intrinsics.h(LazyVerticalGrid, "$this$LazyVerticalGrid");
                        final ZeroResultPageData zeroResultPageData = data;
                        final String str = zeroResultPageData.f5369a;
                        List list = zeroResultPageData.d;
                        if (str != null) {
                            LazyVerticalGrid.f(new y(14), new ComposableLambdaImpl(new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.compose.errorscreen.ZeroResultContentViewKt$ZeroResultContentView$2$1$1$2
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyGridItemScope item = (LazyGridItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        float f = 16;
                                        Modifier modifierH = PaddingKt.h(PaddingKt.j(BackgroundKt.b(SizeKt.e(Modifier.Companion.d, 1.0f), CoreTheme.b(composer2).e.f4848a.c, RectangleShapeKt.f1779a), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), f, BitmapDescriptorFactory.HUE_RED, 2);
                                        String str2 = str;
                                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composer2, 0);
                                        int p = composer2.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierH);
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
                                        AnnotatedString.Builder builder = new AnnotatedString.Builder();
                                        int iL = builder.l(new SpanStyle(0L, 0L, FontWeight.j, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65531));
                                        try {
                                            builder.e(str2);
                                            builder.i(iL);
                                            String str3 = zeroResultPageData.b;
                                            if (str3 != null) {
                                                iL = builder.l(new SpanStyle(0L, 0L, FontWeight.m, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65531));
                                                try {
                                                    builder.e(str3);
                                                } finally {
                                                }
                                            }
                                            TextKt.b(builder.m(), CoreTheme.f(composer2).d.b.b, null, CoreTheme.b(composer2).e.d.d, 0, 0, false, 0, null, null, composer2, 0, 2036);
                                            composer2.f();
                                        } finally {
                                        }
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, -806464999));
                        }
                        List list2 = list;
                        boolean z9 = list2 instanceof Collection;
                        if (z9 && list2.isEmpty()) {
                            z7 = false;
                        } else {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                if (it.next() instanceof ZeroResultProductCategories) {
                                    z7 = true;
                                    break;
                                }
                            }
                            z7 = false;
                        }
                        final String str2 = zeroResultPageData.c;
                        final boolean z10 = z6;
                        if (str2 != null) {
                            LazyVerticalGrid.f(new y(15), new ComposableLambdaImpl(new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.compose.errorscreen.ZeroResultContentViewKt$ZeroResultContentView$2$1$2$2
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyGridItemScope item = (LazyGridItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        float f = 16;
                                        TextKt.a(str2, CoreTheme.f(composer2).f5120a.f5121a.f5122a, PaddingKt.j(PaddingKt.h(BackgroundKt.b(Modifier.Companion.d, CoreTheme.b(composer2).e.f4848a.c, RectangleShapeKt.f1779a), f, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, (z7 && z10) ? f : 24, 5), CoreTheme.b(composer2).e.d.b, null, 0, 0, false, 0, null, composer2, 0, 1008);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, -2087345598));
                        }
                        if (z9 && list2.isEmpty()) {
                            z8 = false;
                        } else {
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (it2.next() instanceof HorizontalListData) {
                                    z8 = true;
                                    break;
                                }
                            }
                            z8 = false;
                        }
                        if ((z7 || z8) && z10) {
                            y yVar = new y(16);
                            final Function1 function12 = onChatEntryBannerClicked;
                            LazyVerticalGrid.f(yVar, new ComposableLambdaImpl(new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.compose.errorscreen.ZeroResultContentViewKt$ZeroResultContentView$2$1$4
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyGridItemScope item = (LazyGridItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        ZeroResultContentViewKt.a(0, composer2, function12);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, -465248280));
                        }
                        final int i5 = 0;
                        for (Object obj2 : list2) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            if (obj2 instanceof ZeroResultProductCategories) {
                                final ZeroResultProductCategories zeroResultProductCategories = (ZeroResultProductCategories) obj2;
                                final String str3 = zeroResultProductCategories.f5370a;
                                if (str3 != null) {
                                    LazyVerticalGrid.f(new y(17), new ComposableLambdaImpl(new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.compose.errorscreen.ZeroResultContentViewKt$ZeroResultContentView$2$1$5$1$2
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            LazyGridItemScope item = (LazyGridItemScope) obj3;
                                            Composer composer2 = (Composer) obj4;
                                            int iIntValue = ((Number) obj5).intValue();
                                            Intrinsics.h(item, "$this$item");
                                            if ((iIntValue & 17) == 16 && composer2.c()) {
                                                composer2.j();
                                            } else {
                                                TextKt.a(str3, CoreTheme.f(composer2).d.c.b, PaddingKt.h(PaddingKt.j(BackgroundKt.b(SizeKt.e(Modifier.Companion.d, 1.0f), CoreTheme.b(composer2).e.f4848a.c, RectangleShapeKt.f1779a), BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 16, BitmapDescriptorFactory.HUE_RED, 2), CoreTheme.b(composer2).e.d.d, null, 0, 0, false, 0, null, composer2, 0, 1008);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, true, 738758754));
                                }
                                int size = zeroResultProductCategories.b.size();
                                final Function1 function13 = onProductCategoryTileClick;
                                LazyGridScope.h(LazyVerticalGrid, size, null, null, null, new ComposableLambdaImpl(new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.compose.errorscreen.ZeroResultContentViewKt$ZeroResultContentView$2$1$5$2
                                    @Override // kotlin.jvm.functions.Function4
                                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                                        LazyGridItemScope items = (LazyGridItemScope) obj3;
                                        int iIntValue = ((Number) obj4).intValue();
                                        Composer composer2 = (Composer) obj5;
                                        int iIntValue2 = ((Number) obj6).intValue();
                                        Intrinsics.h(items, "$this$items");
                                        if ((iIntValue2 & 48) == 0) {
                                            iIntValue2 |= composer2.r(iIntValue) ? 32 : 16;
                                        }
                                        if ((iIntValue2 & 145) == 144 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            ProductCategoryTileData productCategoryTileData = (ProductCategoryTileData) zeroResultProductCategories.b.get(iIntValue);
                                            int i7 = iIntValue % 2;
                                            Modifier modifierJ = PaddingKt.j(PaddingKt.j(BackgroundKt.b(Modifier.Companion.d, CoreTheme.b(composer2).e.f4848a.c, RectangleShapeKt.f1779a), i7 != 0 ? 8 : 16, BitmapDescriptorFactory.HUE_RED, i7 != 0 ? 16 : 8, BitmapDescriptorFactory.HUE_RED, 10), BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                                            CoreElevation coreElevation = CoreTheme.c(composer2).f4876a;
                                            composer2.o(5004770);
                                            Function1 function14 = function13;
                                            boolean zN = composer2.n(function14);
                                            Object objG3 = composer2.G();
                                            if (zN || objG3 == Composer.Companion.f1624a) {
                                                objG3 = new au.com.woolworths.design.wx.component.searchbar.a(6, function14);
                                                composer2.A(objG3);
                                            }
                                            composer2.l();
                                            ProductCategoryTileKt.a(productCategoryTileData, modifierJ, coreElevation, Float.NaN, (Function1) objG3, composer2, 3080, 0);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, -2095278209), 14);
                                y yVar2 = new y(18);
                                final Function1 function14 = onBrowseAllAislesClick;
                                LazyVerticalGrid.f(yVar2, new ComposableLambdaImpl(new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.compose.errorscreen.ZeroResultContentViewKt$ZeroResultContentView$2$1$5$4
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        LazyGridItemScope item = (LazyGridItemScope) obj3;
                                        Composer composer2 = (Composer) obj4;
                                        int iIntValue = ((Number) obj5).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        if ((iIntValue & 17) == 16 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            Context context = (Context) composer2.x(AndroidCompositionLocals_androidKt.b);
                                            String strC = StringResources_androidKt.c(composer2, R.string.browse_all_categories);
                                            float f = 16;
                                            Modifier modifierJ = PaddingKt.j(PaddingKt.h(BackgroundKt.b(Modifier.Companion.d, CoreTheme.b(composer2).e.f4848a.c, RectangleShapeKt.f1779a), f, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                                            composer2.o(-1633490746);
                                            Function1 function15 = function14;
                                            boolean zN = composer2.n(function15) | composer2.I(context);
                                            Object objG3 = composer2.G();
                                            if (zN || objG3 == Composer.Companion.f1624a) {
                                                objG3 = new f(function15, context, 1);
                                                composer2.A(objG3);
                                            }
                                            composer2.l();
                                            PrimaryButtonKt.a(strC, (Function0) objG3, modifierJ, false, null, null, null, null, composer2, 0, 248);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, -1467255720));
                            } else if (obj2 instanceof HorizontalListData) {
                                y yVar3 = new y(13);
                                final HorizontalListData horizontalListData = (HorizontalListData) obj2;
                                final Function1 function15 = onZeroResultHorizontalListVisible;
                                final boolean z11 = z;
                                final ProductClickListener productClickListener2 = productClickListener;
                                final LazyListState lazyListState = lazyListStateA;
                                final Modifier modifier5 = modifier2;
                                LazyVerticalGrid.f(yVar3, new ComposableLambdaImpl(new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.compose.errorscreen.ZeroResultContentViewKt$ZeroResultContentView$2$1$5$6
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        LazyGridItemScope item = (LazyGridItemScope) obj3;
                                        Composer composer2 = (Composer) obj4;
                                        int iIntValue = ((Number) obj5).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        int i7 = iIntValue & 17;
                                        Unit unit = Unit.f24250a;
                                        if (i7 == 16 && composer2.c()) {
                                            composer2.j();
                                            return unit;
                                        }
                                        composer2.o(-1633490746);
                                        Function1 function16 = function15;
                                        boolean zN = composer2.n(function16);
                                        HorizontalListData horizontalListData2 = horizontalListData;
                                        boolean zI2 = zN | composer2.I(horizontalListData2);
                                        Object objG3 = composer2.G();
                                        if (zI2 || objG3 == Composer.Companion.f1624a) {
                                            objG3 = new g(function16, horizontalListData2, 1);
                                            composer2.A(objG3);
                                        }
                                        composer2.l();
                                        EffectsKt.c(unit, (Function1) objG3, composer2);
                                        HorizontalListKt.a(i5, horizontalListData2, z11, EmptyList.d, null, null, null, null, null, productClickListener2, lazyListState, modifier5, false, null, false, null, null, composer2, 115043392 | (ProductId.$stable << 9), 126976);
                                        return unit;
                                    }
                                }, true, -1836064447));
                            }
                            i5 = i6;
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(function1);
                objG2 = function1;
            } else {
                modifier2 = modifier4;
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            LazyGridDslKt.b(fixed, modifierB, lazyGridStateA, null, false, null, null, null, false, null, (Function1) objG2, composerImpl, 0, 0, 1016);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(data, z, productClickListener, onBrowseAllAislesClick, onProductCategoryTileClick, onZeroResultVisible, onZeroResultHorizontalListVisible, z2, onChatEntryBannerClicked, modifier2, i, i2, 1);
        }
    }
}
