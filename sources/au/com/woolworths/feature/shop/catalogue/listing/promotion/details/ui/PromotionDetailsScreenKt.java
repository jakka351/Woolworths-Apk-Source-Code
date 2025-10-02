package au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.f;
import androidx.paging.CombinedLoadStates;
import androidx.paging.ItemSnapshotList;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.compose.utils.extensions.ColorExtKt;
import au.com.woolworths.design.core.ui.component.experimental.chip.e;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.button.TertiaryButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.bundles.ui.k;
import au.com.woolworths.feature.shop.catalogue.CatalogueFeature;
import au.com.woolworths.feature.shop.catalogue.common.BottomSheetResult;
import au.com.woolworths.feature.shop.catalogue.common.ui.BottomSheetResultKt;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsContract;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsViewModel;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.model.PromotionHeader;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.model.TermsAndConditions;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageUiKt;
import au.com.woolworths.product.composeui.ProductCardButtonsHorizontalKt;
import au.com.woolworths.product.composeui.ProductCardHorizontalUiKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt;
import au.com.woolworths.shared.ui.compose.shop.CartIconButtonKt;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsContract$ViewState;", "viewState", "", "expanded", "catalogue_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PromotionDetailsScreenKt {
    public static final void a(InsetBanner insetBanner, Composer composer, int i) {
        InsetBanner insetBanner2;
        ComposerImpl composerImplV = composer.v(1710398491);
        int i2 = (composerImplV.I(insetBanner) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            insetBanner2 = insetBanner;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.shop.catalogue.browse.page.promotion.b(7);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            insetBanner2 = insetBanner;
            InsetBannerUiKt.b(insetBanner2, null, false, (Function1) objG, composerImplV, (i2 & 14) | 24576, 14);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(i, 21, insetBanner2);
        }
    }

    public static final void b(final TermsAndConditions termsAndConditions, Composer composer, int i) {
        boolean z;
        String strL;
        MutableState mutableState;
        ComposerImpl composerImplV = composer.v(-1473985178);
        if (((i | (composerImplV.n(termsAndConditions) ? 4 : 2)) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG);
            }
            MutableState mutableState2 = (MutableState) objG;
            composerImplV.V(false);
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            float f = 8;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 7), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g, Alignment.Companion.m, composerImplV, 54);
            int i2 = composerImplV.P;
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.b(termsAndConditions.f6902a, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, 0, 0, 65534);
            AnimatedVisibilityKt.c(ColumnScopeInstance.f948a, ((Boolean) mutableState2.getD()).booleanValue(), null, null, null, null, ComposableLambdaKt.c(-1693625932, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui.PromotionDetailsScreenKt$ExpandableTermsAndConditions$1$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                    Composer composer2 = (Composer) obj2;
                    ((Number) obj3).intValue();
                    Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                    TextKt.b(termsAndConditions.b, PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).n, composer2, 48, 0, 65532);
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1572870, 30);
            SpacerKt.a(composerImplV, SizeKt.g(companion, f));
            if (((Boolean) mutableState2.getD()).booleanValue()) {
                z = false;
                strL = au.com.woolworths.dynamic.page.ui.content.d.l(composerImplV, -402052741, R.string.catalogue_promotion_details_see_less, composerImplV, false);
            } else {
                z = false;
                strL = au.com.woolworths.dynamic.page.ui.content.d.l(composerImplV, -401940645, R.string.catalogue_promotion_details_see_more, composerImplV, false);
            }
            String str = strL;
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = InteractionSourceKt.a();
                composerImplV.A(objG2);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objG2;
            Object objD = au.com.woolworths.android.onesite.a.d(5004770, composerImplV, z);
            if (objD == composer$Companion$Empty$1) {
                mutableState = mutableState2;
                objD = new au.com.woolworths.feature.rewards.offers.listpage.ui.e(mutableState, 2);
                composerImplV.A(objD);
            } else {
                mutableState = mutableState2;
            }
            composerImplV.V(z);
            Modifier modifierB = ClickableKt.b(companion, mutableInteractionSource, null, false, null, null, (Function0) objD, 28);
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(context);
            Object objG3 = composerImplV.G();
            if (zI || objG3 == composer$Companion$Empty$1) {
                objG3 = new f(29, context, mutableState);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            TextKt.b(str, SemanticsModifierKt.b(modifierB, false, (Function1) objG3), WxTheme.a(composerImplV).h(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).o, composerImplV, 0, 0, 65528);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(i, 22, termsAndConditions);
        }
    }

    public static final void c(LoadState.Error error, Function0 function0, Composer composer, int i) {
        ComposerImpl composerImpl;
        FullPageMessageSpec fullPageMessageSpecE;
        ComposerImpl composerImplV = composer.v(1286316587);
        if ((((composerImplV.I(error) ? 4 : 2) | i | (composerImplV.I(function0) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (error.b instanceof NoConnectivityException) {
                composerImplV.o(-800333460);
                fullPageMessageSpecE = FullPageMessageSpec.Companion.b(null, StringResources_androidKt.c(composerImplV, R.string.promotion_details_connection_error), function0, composerImplV, 7);
                composerImplV.V(false);
                composerImpl = composerImplV;
            } else {
                composerImplV.o(-800325948);
                composerImpl = composerImplV;
                fullPageMessageSpecE = FullPageMessageSpec.Companion.e(null, null, StringResources_androidKt.c(composerImplV, R.string.promotion_details_server_error), null, function0, composerImpl, 23);
                composerImpl.V(false);
            }
            composerImplV = composerImpl;
            FullPageMessageUiKt.a(fullPageMessageSpecE, null, null, composerImplV, 0, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.catalogue.listing.category.ui.c(error, function0, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    public static final void d(PromotionHeader promotionHeader, Composer composer, int i) {
        int i2;
        Function2 function2;
        Function0 function0;
        Function2 function22;
        ?? r2;
        Modifier.Companion companion;
        Function2 function23;
        Function2 function24;
        String str;
        ComposerImpl composerImpl;
        PromotionHeader promotionHeader2 = promotionHeader;
        ComposerImpl composerImplV = composer.v(-80533277);
        if (((i | (composerImplV.n(promotionHeader2) ? 4 : 2)) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(8);
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion2, 1.0f);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(spacedAlignedG, Alignment.Companion.k, composerImplV, 54);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierE);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Function2 function25 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function25);
            Function2 function26 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function26);
            Function2 function27 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function27);
            }
            Function2 function28 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function28);
            String str2 = promotionHeader2.d;
            String str3 = promotionHeader2.c;
            composerImplV.o(1986551053);
            if (str2 == null) {
                function2 = function26;
                i2 = 2;
                companion = companion2;
                function23 = function28;
                function24 = function27;
                function0 = function02;
                function22 = function25;
                str = str3;
                r2 = 0;
            } else {
                Modifier modifierQ = SizeKt.q(companion2, 56);
                composerImplV.o(1092799647);
                Painter painterA = ((Boolean) composerImplV.x(InspectionModeKt.f1972a)).booleanValue() ? PainterResources_androidKt.a(R.drawable.ic_wapple_flat, 0, composerImplV) : null;
                composerImplV.V(false);
                i2 = 2;
                function2 = function26;
                function0 = function02;
                function22 = function25;
                r2 = 0;
                companion = companion2;
                function23 = function28;
                function24 = function27;
                str = str3;
                SingletonAsyncImageKt.b(str2, null, modifierQ, painterA, null, null, null, null, null, Alignment.Companion.e, ContentScale.Companion.f1880a, null, composerImplV, 805306800, 6, 31216);
            }
            composerImplV.V(r2);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, r2);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function22);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function2);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function24);
            }
            Updater.b(composerImplV, modifierD2, function23);
            promotionHeader2 = promotionHeader;
            String str4 = promotionHeader2.f6901a;
            TextStyle textStyle = WxTheme.b(composerImplV).i;
            int i5 = Color.l;
            TextKt.b(str4, null, ColorExtKt.a(WxTheme.a(composerImplV).c(), promotionHeader2.b), 0L, null, 0L, null, null, 0L, 2, false, (str == null || StringsKt.D(str)) ? i2 : 1, 0, null, textStyle, composerImplV, 0, 48, 55290);
            ComposerImpl composerImpl2 = composerImplV;
            composerImpl2.o(1772356173);
            ComposerImpl composerImpl3 = composerImpl2;
            if (str != null) {
                TextKt.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, WxTheme.b(composerImpl2).m, composerImpl2, 0, 3120, 55294);
                composerImpl3 = composerImpl2;
            }
            android.support.v4.media.session.a.C(composerImpl3, r2, true, true);
            composerImpl = composerImpl3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(i, 23, promotionHeader2);
        }
    }

    public static final void e(final LazyPagingItems lazyPagingItems, final ProductClickListener productClickListener, final boolean z, Function1 function1, Function1 function12, final boolean z2, final List list, Composer composer, int i) {
        int i2;
        Object obj;
        boolean z3;
        ComposerImpl composerImplV = composer.v(-53926547);
        int i3 = i | (composerImplV.I(lazyPagingItems) ? 4 : 2) | (composerImplV.I(productClickListener) ? 32 : 16) | (composerImplV.p(z) ? 256 : 128) | (composerImplV.I(function1) ? 2048 : 1024) | (composerImplV.I(function12) ? 16384 : 8192) | (composerImplV.p(z2) ? 131072 : 65536) | (composerImplV.I(list) ? 1048576 : 524288);
        if ((599187 & i3) == 599186 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (lazyPagingItems == null || (lazyPagingItems.d().f3529a instanceof LoadState.Error)) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    recomposeScopeImplX.d = new a(lazyPagingItems, productClickListener, z, function1, function12, z2, list, i, 0);
                    return;
                }
                return;
            }
            LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            composerImplV.o(5004770);
            boolean z4 = (57344 & i3) == 16384;
            Object objG = composerImplV.G();
            Object obj2 = Composer.Companion.f1624a;
            if (z4 || objG == obj2) {
                objG = new au.com.woolworths.design.wx.component.searchbar.a(19, function12);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            ListItemsSeenEffectKt.a(ListItemsSeenEffectKt.e(lazyListStateA, BitmapDescriptorFactory.HUE_RED, (Function1) objG, composerImplV, 0, 2), composerImplV, 0);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(12);
            float f = 16;
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f, f, f, f);
            composerImplV.o(-1224400529);
            boolean zI = ((i3 & 14) == 4 || composerImplV.I(lazyPagingItems)) | composerImplV.I(productClickListener) | ((i3 & 896) == 256) | ((458752 & i3) == 131072) | composerImplV.I(list);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == obj2) {
                i2 = i3;
                z3 = false;
                obj = new Function1() { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        LazyListScope LazyColumn = (LazyListScope) obj3;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        final LazyPagingItems lazyPagingItems2 = lazyPagingItems;
                        int iB = lazyPagingItems2.b();
                        final ProductClickListener productClickListener2 = productClickListener;
                        final boolean z5 = z;
                        final boolean z6 = z2;
                        final List list2 = list;
                        LazyListScope.g(LazyColumn, iB, null, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui.PromotionDetailsScreenKt$Listing$2$1$1
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                LazyItemScope items = (LazyItemScope) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Composer composer2 = (Composer) obj6;
                                int iIntValue2 = ((Number) obj7).intValue();
                                Intrinsics.h(items, "$this$items");
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= composer2.r(iIntValue) ? 32 : 16;
                                }
                                if ((iIntValue2 & 145) == 144 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    LazyPagingItems lazyPagingItems3 = lazyPagingItems2;
                                    Object objA = lazyPagingItems3.a(iIntValue);
                                    if (objA instanceof PromotionHeader) {
                                        composer2.o(95570720);
                                        PromotionDetailsScreenKt.d((PromotionHeader) objA, composer2, 0);
                                        composer2.l();
                                    } else if (objA instanceof InsetBannerApiData) {
                                        composer2.o(95572748);
                                        PromotionDetailsScreenKt.a(InsetBannerApiDataExtKt.toUiModel((InsetBannerApiData) objA), composer2, 0);
                                        composer2.l();
                                    } else if (objA instanceof TermsAndConditions) {
                                        composer2.o(95575157);
                                        PromotionDetailsScreenKt.b((TermsAndConditions) objA, composer2, 0);
                                        composer2.l();
                                    } else if (objA instanceof ProductCard) {
                                        composer2.o(95578208);
                                        ProductCard productCard = (ProductCard) objA;
                                        PromotionDetailsScreenKt.i(productCard, productClickListener2, z5, z6, ProductCardExtKt.t(productCard, list2), composer2, ProductCard.$stable);
                                        Object objJ = CollectionsKt.J(iIntValue + 1, lazyPagingItems3.c());
                                        if ((objJ instanceof ProductCard ? (ProductCard) objJ : null) != null) {
                                            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 6, 0L, composer2, PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13));
                                        }
                                        composer2.l();
                                    } else {
                                        composer2.o(-1331424489);
                                        composer2.l();
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, true, -683698677), 6);
                        LoadState loadState = lazyPagingItems2.d().c;
                        if (loadState instanceof LoadState.Loading) {
                            LazyListScope.i(LazyColumn, null, null, ComposableSingletons$PromotionDetailsScreenKt.f6903a, 3);
                        } else if (loadState instanceof LoadState.Error) {
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui.PromotionDetailsScreenKt$Listing$2$1$2
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    LazyItemScope item = (LazyItemScope) obj4;
                                    Composer composer2 = (Composer) obj5;
                                    int iIntValue = ((Number) obj6).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        composer2.o(5004770);
                                        LazyPagingItems lazyPagingItems3 = lazyPagingItems2;
                                        boolean zI2 = composer2.I(lazyPagingItems3);
                                        Object objG3 = composer2.G();
                                        if (zI2 || objG3 == Composer.Companion.f1624a) {
                                            objG3 = new k(lazyPagingItems3, 4);
                                            composer2.A(objG3);
                                        }
                                        composer2.l();
                                        PromotionDetailsScreenKt.f((Function0) objG3, composer2, 0);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, -1980630237), 3);
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(obj);
            } else {
                i2 = i3;
                obj = objG2;
                z3 = false;
            }
            Function1 function13 = (Function1) obj;
            composerImplV.V(z3);
            int i4 = i2;
            boolean z5 = z3;
            LazyDslKt.b(null, lazyListStateA, paddingValuesImpl, false, spacedAlignedG, null, null, false, null, function13, composerImplV, 24960, 489);
            composerImplV = composerImplV;
            ItemSnapshotList itemSnapshotListC = lazyPagingItems.c();
            if (!itemSnapshotListC.isEmpty()) {
                composerImplV.o(-1746271574);
                boolean zN = composerImplV.n(lazyListStateA) | composerImplV.I(itemSnapshotListC) | ((i4 & 7168) == 2048 ? true : z5);
                Object objG3 = composerImplV.G();
                if (zN || objG3 == obj2) {
                    objG3 = new PromotionDetailsScreenKt$Listing$3$1(lazyListStateA, function1, itemSnapshotListC, null);
                    composerImplV.A(objG3);
                }
                composerImplV.V(z5);
                EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG3);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            recomposeScopeImplX2.d = new a(lazyPagingItems, productClickListener, z, function1, function12, z2, list, i, 1);
        }
    }

    public static final void f(Function0 function0, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(471243311);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierF = PaddingKt.f(SizeKt.e(Modifier.Companion.d, 1.0f), 16);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
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
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.promotion_details_append_error), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, 0, 0, 65534);
            TertiaryButtonKt.a(StringResources_androidKt.c(composerImplV, R.string.try_again_button_text), function0, null, false, false, null, null, composerImplV, (i2 << 3) & 112, 124);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.filter.d(i, 3, function0);
        }
    }

    public static final void g(int i, int i2, Composer composer, Modifier modifier) {
        int i3;
        ComposerImpl composerImplV = composer.v(-1482400783);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            if (i4 != 0) {
                modifier = companion;
            }
            Modifier modifierF = PaddingKt.f(SizeKt.e(modifier, 1.0f), 32);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i5 = composerImplV.P;
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
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 30, 0L, 0L, composerImplV, BoxScopeInstance.f944a.g(companion, Alignment.Companion.e));
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.account.settings.v2.ui.d(modifier, i, i2, 2);
        }
    }

    public static final void h(LazyPagingItems lazyPagingItems, Composer composer, int i) {
        CombinedLoadStates combinedLoadStatesD;
        ComposerImpl composerImplV = composer.v(148957256);
        int i2 = (composerImplV.I(lazyPagingItems) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            LoadState loadState = (lazyPagingItems == null || (combinedLoadStatesD = lazyPagingItems.d()) == null) ? null : combinedLoadStatesD.f3529a;
            if (loadState instanceof LoadState.Loading) {
                composerImplV.o(884552009);
                if (lazyPagingItems.b() == 0) {
                    g(6, 0, composerImplV, SizeKt.c);
                }
                composerImplV.V(false);
            } else if (loadState instanceof LoadState.Error) {
                composerImplV.o(884695446);
                LoadState.Error error = (LoadState.Error) loadState;
                composerImplV.o(5004770);
                boolean z = (i2 & 14) == 4 || composerImplV.I(lazyPagingItems);
                Object objG = composerImplV.G();
                if (z || objG == Composer.Companion.f1624a) {
                    objG = new k(lazyPagingItems, 3);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                c(error, (Function0) objG, composerImplV, 0);
                composerImplV.V(false);
            } else {
                composerImplV.o(884809464);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.catalogue.listing.category.ui.d(lazyPagingItems, i);
        }
    }

    public static final void i(final ProductCard productCard, final ProductClickListener productClickListener, final boolean z, final boolean z2, final boolean z3, Composer composer, final int i) {
        int i2;
        boolean z4;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-221203563);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(productCard) : composerImplV.I(productCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(productClickListener) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z4 = z2;
            i2 |= composerImplV.p(z4) ? 2048 : 1024;
        } else {
            z4 = z2;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.p(z3) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(-1633490746);
            int i3 = i2 & 14;
            boolean zI = composerImplV.I(productClickListener) | (i3 == 4 || ((i2 & 8) != 0 && composerImplV.I(productCard)));
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.feature.product.list.compose.productfinder.d(productClickListener, productCard, 18);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierD = ClickableKt.d(Modifier.Companion.d, false, null, null, (Function0) objG, 7);
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.feature.shop.catalogue.browse.page.promotion.b(8);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifierD, false, (Function1) objG2);
            composerImplV.o(-1633490746);
            boolean zI2 = composerImplV.I(productClickListener) | (i3 == 4 || ((i2 & 8) != 0 && composerImplV.I(productCard)));
            Object objG3 = composerImplV.G();
            if (zI2 || objG3 == composer$Companion$Empty$1) {
                objG3 = new au.com.woolworths.feature.product.list.compose.productfinder.d(productClickListener, productCard, 19);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-903431289, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui.PromotionDetailsScreenKt$Product$4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        boolean z5 = z;
                        ProductCard productCard2 = productCard;
                        ProductCardButtonsHorizontalKt.b(productCard2, "", productClickListener, ProductCardExtKt.i(productCard2, z5, false, false, 14), null, false, composer2, ProductCard.$stable | 48, 48);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV);
            int i4 = ProductCard.$stable | 432 | i3;
            int i5 = i2 << 6;
            composerImpl = composerImplV;
            ProductCardHorizontalUiKt.a(productCard, true, false, modifierB, false, z4, z3, (Function0) objG3, false, false, z, false, false, false, null, null, null, composableLambdaImplC, composerImpl, i4 | (458752 & i5) | (i5 & 3670016), ((i2 >> 6) & 14) | 12583296, 125712);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    PromotionDetailsScreenKt.i(productCard, productClickListener, z, z2, z3, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    public static final void j(final PromotionDetailsViewModel viewModel, final Function0 onNavigateUp, final Function0 onCartButton, Composer composer, int i) {
        ?? r13;
        ComposerImpl composerImpl;
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onCartButton, "onCartButton");
        ComposerImpl composerImplV = composer.v(975473518);
        if (((i | (composerImplV.I(viewModel) ? 4 : 2) | (composerImplV.I(onNavigateUp) ? 32 : 16) | (composerImplV.I(onCartButton) ? 256 : 128)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            final MutableState mutableStateA = FlowExtKt.a(viewModel.i, composerImplV);
            Flow flow = ((PromotionDetailsContract.ViewState) mutableStateA.getD()).d;
            composerImplV.o(1127189832);
            final LazyPagingItems lazyPagingItemsA = flow == null ? null : LazyPagingItemsKt.a(flow, composerImplV);
            composerImplV.V(false);
            ScaffoldKt.a(SizeKt.c, null, ComposableLambdaKt.c(-1437918775, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui.PromotionDetailsScreenKt$PromotionDetailsScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final Function0 function0 = onNavigateUp;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-16137832, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui.PromotionDetailsScreenKt$PromotionDetailsScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(ArrowBackKt.a(), StringResources_androidKt.c(composer3, R.string.content_description_back_button), function0, null, false, 0L, composer3, 0, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final Function0 function02 = onCartButton;
                        final MutableState mutableState = mutableStateA;
                        TopNavBarKt.b("", null, null, null, 0L, 0L, 0L, null, 0, composableLambdaImplC, ComposableLambdaKt.c(824002366, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui.PromotionDetailsScreenKt$PromotionDetailsScreen$1.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                RowScope TopNavBar = (RowScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(TopNavBar, "$this$TopNavBar");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    MutableState mutableState2 = mutableState;
                                    if (((PromotionDetailsContract.ViewState) mutableState2.getD()).b) {
                                        CartIconButtonKt.a(((PromotionDetailsContract.ViewState) mutableState2.getD()).c, function02, null, 0L, composer3, 0, 12);
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 905969670, 6, 254);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(2089639191, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui.PromotionDetailsScreenKt$PromotionDetailsScreen$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, Modifier.Companion.d);
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
                        MutableState mutableState = mutableStateA;
                        boolean z = ((PromotionDetailsContract.ViewState) mutableState.getD()).f6895a;
                        composer2.o(5004770);
                        PromotionDetailsViewModel promotionDetailsViewModel = viewModel;
                        boolean zI = composer2.I(promotionDetailsViewModel);
                        Object objG = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (zI || objG == composer$Companion$Empty$1) {
                            PromotionDetailsScreenKt$PromotionDetailsScreen$2$1$1$1 promotionDetailsScreenKt$PromotionDetailsScreen$2$1$1$1 = new PromotionDetailsScreenKt$PromotionDetailsScreen$2$1$1$1(1, promotionDetailsViewModel, PromotionDetailsViewModel.class, "onPageLoaded", "onPageLoaded(Ljava/util/List;)V", 0);
                            composer2.A(promotionDetailsScreenKt$PromotionDetailsScreen$2$1$1$1);
                            objG = promotionDetailsScreenKt$PromotionDetailsScreen$2$1$1$1;
                        }
                        composer2.l();
                        Function1 function1 = (Function1) ((KFunction) objG);
                        composer2.o(5004770);
                        boolean zI2 = composer2.I(promotionDetailsViewModel);
                        Object objG2 = composer2.G();
                        if (zI2 || objG2 == composer$Companion$Empty$1) {
                            PromotionDetailsScreenKt$PromotionDetailsScreen$2$1$2$1 promotionDetailsScreenKt$PromotionDetailsScreen$2$1$2$1 = new PromotionDetailsScreenKt$PromotionDetailsScreen$2$1$2$1(1, promotionDetailsViewModel, PromotionDetailsViewModel.class, "onItemImpression", "onItemImpression(I)V", 0);
                            composer2.A(promotionDetailsScreenKt$PromotionDetailsScreen$2$1$2$1);
                            objG2 = promotionDetailsScreenKt$PromotionDetailsScreen$2$1$2$1;
                        }
                        composer2.l();
                        PromotionDetailsScreenKt.e(lazyPagingItemsA, promotionDetailsViewModel, z, function1, (Function1) ((KFunction) objG2), promotionDetailsViewModel.g.c(CatalogueFeature.g), ((PromotionDetailsContract.ViewState) mutableState.getD()).f, composer2, 8);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 390, 1018);
            ComposerImpl composerImpl2 = composerImplV;
            h(lazyPagingItemsA, composerImpl2, 8);
            k(((PromotionDetailsContract.ViewState) mutableStateA.getD()).g, composerImpl2, 0);
            BottomSheetResult bottomSheetResult = ((PromotionDetailsContract.ViewState) mutableStateA.getD()).e;
            composerImpl2.o(5004770);
            boolean zI = composerImpl2.I(viewModel);
            Object objG = composerImpl2.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                r13 = 0;
                PromotionDetailsScreenKt$PromotionDetailsScreen$3$1 promotionDetailsScreenKt$PromotionDetailsScreen$3$1 = new PromotionDetailsScreenKt$PromotionDetailsScreen$3$1(0, viewModel, PromotionDetailsViewModel.class, "onSnackbarDismissed", "onSnackbarDismissed()V", 0);
                composerImpl2.A(promotionDetailsScreenKt$PromotionDetailsScreen$3$1);
                objG = promotionDetailsScreenKt$PromotionDetailsScreen$3$1;
            } else {
                r13 = 0;
            }
            composerImpl2.V(r13);
            Function0 function0 = (Function0) ((KFunction) objG);
            composerImpl2.o(5004770);
            boolean zI2 = composerImpl2.I(viewModel);
            Object objG2 = composerImpl2.G();
            if (zI2 || objG2 == composer$Companion$Empty$1) {
                PromotionDetailsScreenKt$PromotionDetailsScreen$4$1 promotionDetailsScreenKt$PromotionDetailsScreen$4$1 = new PromotionDetailsScreenKt$PromotionDetailsScreen$4$1(1, viewModel, PromotionDetailsViewModel.class, "onViewShoppingListAction", "onViewShoppingListAction(Ljava/lang/String;)V", 0);
                composerImpl2.A(promotionDetailsScreenKt$PromotionDetailsScreen$4$1);
                objG2 = promotionDetailsScreenKt$PromotionDetailsScreen$4$1;
            }
            composerImpl2.V(r13);
            BottomSheetResultKt.a(bottomSheetResult, function0, (Function1) ((KFunction) objG2), composerImpl2, r13);
            composerImpl = composerImpl2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(viewModel, onNavigateUp, onCartButton, i, 16);
        }
    }

    public static final void k(final PromotionDetailsContract.Snackbar snackbar, Composer composer, final int i) {
        final PromotionDetailsContract.Snackbar snackbar2;
        String string;
        ComposerImpl composerImplV = composer.v(-1001900774);
        if ((((composerImplV.I(snackbar) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            snackbar2 = snackbar;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = new SnackbarHostState();
                composerImplV.A(objG);
            }
            SnackbarHostState snackbarHostState = (SnackbarHostState) objG;
            composerImplV.V(false);
            Modifier modifierA = WindowInsetsPadding_androidKt.a(SizeKt.c);
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
            SnackbarHostKt.b(snackbarHostState, BoxScopeInstance.f944a.g(Modifier.Companion.d, Alignment.Companion.h), ComposableSingletons$PromotionDetailsScreenKt.b, composerImplV, 390, 0);
            composerImplV.V(true);
            if (snackbar == null) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    final int i3 = 0;
                    recomposeScopeImplX.d = new Function2(snackbar, i, i3) { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui.c
                        public final /* synthetic */ int d;
                        public final /* synthetic */ PromotionDetailsContract.Snackbar e;

                        {
                            this.d = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            int i4 = this.d;
                            Composer composer2 = (Composer) obj2;
                            ((Integer) obj3).getClass();
                            switch (i4) {
                                case 0:
                                    PromotionDetailsScreenKt.k(this.e, composer2, RecomposeScopeImplKt.a(1));
                                    break;
                                default:
                                    PromotionDetailsScreenKt.k(this.e, composer2, RecomposeScopeImplKt.a(1));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            ResText resText = snackbar.f6894a;
            CompositionLocal compositionLocal = AndroidCompositionLocals_androidKt.b;
            String string2 = resText.getText((Context) composerImplV.x(compositionLocal)).toString();
            Text text = snackbar.b;
            composerImplV.o(-753948617);
            String upperCase = null;
            CharSequence text2 = text == null ? null : text.getText((Context) composerImplV.x(compositionLocal));
            composerImplV.V(false);
            if (text2 != null && (string = text2.toString()) != null) {
                upperCase = string.toUpperCase(Locale.ROOT);
                Intrinsics.g(upperCase, "toUpperCase(...)");
            }
            String str = upperCase;
            composerImplV.o(-1224400529);
            boolean zI = composerImplV.I(snackbar) | composerImplV.n(string2) | composerImplV.n(str);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == obj) {
                snackbar2 = snackbar;
                Object promotionDetailsScreenKt$Snackbar$3$1 = new PromotionDetailsScreenKt$Snackbar$3$1(snackbar2, string2, snackbarHostState, str, null);
                composerImplV.A(promotionDetailsScreenKt$Snackbar$3$1);
                objG2 = promotionDetailsScreenKt$Snackbar$3$1;
            } else {
                snackbar2 = snackbar;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, snackbar2, (Function2) objG2);
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            final int i4 = 1;
            recomposeScopeImplX2.d = new Function2(snackbar2, i, i4) { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui.c
                public final /* synthetic */ int d;
                public final /* synthetic */ PromotionDetailsContract.Snackbar e;

                {
                    this.d = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i42 = this.d;
                    Composer composer2 = (Composer) obj2;
                    ((Integer) obj3).getClass();
                    switch (i42) {
                        case 0:
                            PromotionDetailsScreenKt.k(this.e, composer2, RecomposeScopeImplKt.a(1));
                            break;
                        default:
                            PromotionDetailsScreenKt.k(this.e, composer2, RecomposeScopeImplKt.a(1));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }
}
