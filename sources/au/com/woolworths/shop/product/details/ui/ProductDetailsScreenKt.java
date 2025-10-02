package au.com.woolworths.shop.product.details.ui;

import android.content.Context;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.products.models.ProductPromotionTypes;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.component.stable.textbutton.TextButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import au.com.woolworths.foundation.ui.image.gallery.GalleryImagesCarouselKt;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.markdown.compat.MarkdownTextViewStyle;
import au.com.woolworths.product.composeui.WatchlistIconKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductInlineLabelApiData;
import au.com.woolworths.product.models.ProductInlineTypeApiData;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.corerow.model.CoreRowModel;
import au.com.woolworths.shared.ui.compose.shop.CartIconButtonKt;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemData;
import au.com.woolworths.shop.product.details.ConnectionErrorState;
import au.com.woolworths.shop.product.details.ProductDetailsActivity$setViewContent$1;
import au.com.woolworths.shop.product.details.ProductDetailsContract;
import au.com.woolworths.shop.product.details.ProductDetailsEvent;
import au.com.woolworths.shop.product.details.ProductDetailsPageErrorState;
import au.com.woolworths.shop.product.details.ProductDetailsViewModel;
import au.com.woolworths.shop.product.details.ServerErrorState;
import au.com.woolworths.shop.product.details.data.FooterData;
import au.com.woolworths.shop.product.details.data.ProductDetailsPage;
import au.com.woolworths.shop.product.details.data.ProductDetailsPageKt;
import au.com.woolworths.shop.product.details.data.ProductDetailsRowAccordion;
import au.com.woolworths.shop.product.details.data.ProductDetailsRowAccordionProductList;
import au.com.woolworths.shop.product.details.data.ProductDetailsRowLink;
import au.com.woolworths.shop.product.details.data.ProductHorizontalList;
import au.com.woolworths.shop.product.details.data.RoundelImage;
import au.com.woolworths.shop.product.details.data.RoundelImagePriority;
import au.com.woolworths.shop.product.details.ui.productscarousel.ProductsCarouselKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import com.woolworths.shop.product.ui.boost.BoostingState;
import com.woolworths.shop.product.ui.boost.ProductBoostKt;
import com.woolworths.shop.product.ui.tags.promotional.ProductPromotionLabelKt;
import com.woolworths.shop.product.ui.tags.promotional.RewardsProductPromotionLabelKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsContract$ViewState;", "viewState", "", "isExpanded", "product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsScreenKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12634a;

        static {
            int[] iArr = new int[ProductPromotionTypes.values().length];
            try {
                iArr[ProductPromotionTypes.CONTAINER_CREDITS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f12634a = iArr;
        }
    }

    public static final void a(String str, String str2, String str3, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(321417368);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(str2) ? 32 : 16) | (composerImplV.n(str3) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
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
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, CoreTheme.b(composerImplV).e.b.e, composerImplV, null);
            int i4 = ((i2 >> 6) & 14) | 3072;
            int i5 = i2 << 3;
            CountryOfOriginAndHelathInfoKt.a(str3, str, str2, TestTagKt.a(companion, "Country of origin Label"), composerImplV, (i5 & 896) | i4 | (i5 & 112), 0);
            composerImpl = composerImplV;
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new f(i, 0, str, str2, str3);
        }
    }

    public static final void b(ProductDetailsPageErrorState productDetailsPageErrorState, Function0 function0, Composer composer, int i) {
        FullPageMessageSpec fullPageMessageSpecF;
        Function0 function02;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(539281327);
        if ((((composerImplV.n(productDetailsPageErrorState) ? 4 : 2) | i | (composerImplV.I(function0) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function02 = function0;
        } else {
            if (productDetailsPageErrorState instanceof ConnectionErrorState) {
                composerImplV.o(-1441680025);
                composerImpl = composerImplV;
                fullPageMessageSpecF = FullPageMessageSpec.Companion.c(null, null, ((ConnectionErrorState) productDetailsPageErrorState).getE().getText((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b)).toString(), null, function0, composerImpl, 23);
                composerImpl.V(false);
                function02 = function0;
            } else {
                if (!(productDetailsPageErrorState instanceof ServerErrorState)) {
                    throw au.com.woolworths.android.onesite.a.w(-1441682183, composerImplV, false);
                }
                composerImplV.o(-1742186721);
                fullPageMessageSpecF = FullPageMessageSpec.Companion.f(null, null, null, ((ServerErrorState) productDetailsPageErrorState).getE().getText((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b)).toString(), null, function0, composerImplV, 23);
                function02 = function0;
                composerImpl = composerImplV;
                composerImpl.V(false);
            }
            composerImplV = composerImpl;
            FullPageMessageUiKt.a(fullPageMessageSpecF, null, null, composerImplV, 0, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.b(productDetailsPageErrorState, i, 27, function02);
        }
    }

    public static final void c(final String str, final ProductDetailsRowAccordionProductList productDetailsRowAccordionProductList, final boolean z, final ProductDetailsActivity$setViewContent$1.AnonymousClass1.AnonymousClass2 anonymousClass2, final Function2 function2, final boolean z2, final boolean z3, final boolean z4, final List list, Composer composer, final int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(1867767777);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.I(productDetailsRowAccordionProductList) ? 32 : 16) | (composerImplV.p(z) ? 256 : 128) | (composerImplV.I(anonymousClass2) ? 2048 : 1024) | (composerImplV.I(function2) ? 16384 : 8192) | (composerImplV.p(z2) ? 131072 : 65536) | (composerImplV.p(z3) ? 1048576 : 524288) | (composerImplV.p(z4) ? 8388608 : 4194304) | (composerImplV.I(list) ? 67108864 : 33554432);
        if ((38347923 & i2) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
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
            Function2 function22 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function22);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            float f = 12;
            MarkdownCompatKt.a(productDetailsRowAccordionProductList.f12611a.b, PaddingKt.j(PaddingKt.h(companion, 16, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, 8, 5), new MarkdownTextViewStyle((Density) composerImplV.x(CompositionLocalsKt.h), CoreTheme.b(composerImplV).e.d.d, CoreTheme.f(composerImplV).f5120a.b.f5123a, (TextAlign) null, 24), null, false, null, null, false, null, null, composerImplV, 0, 1016);
            Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 7);
            String str2 = productDetailsRowAccordionProductList.b.f12612a;
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 57344) == 16384) | composerImplV.I(productDetailsRowAccordionProductList);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.shop.checkout.ui.details.c(19, function2, productDetailsRowAccordionProductList);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            TextButtonKt.a((Function0) objG, str2, modifierJ, false, null, null, null, null, composerImplV, KyberEngine.KyberPolyBytes, 504);
            composerImpl = composerImplV;
            ProductHorizontalList productHorizontalList = productDetailsRowAccordionProductList.c;
            Intrinsics.f(productHorizontalList, "null cannot be cast to non-null type au.com.woolworths.shop.product.details.data.ProductHorizontalList");
            int i4 = i2 << 3;
            int i5 = (57344 & (i2 >> 3)) | (i4 & 112) | (i2 & 896) | (i2 & 7168);
            int i6 = i2 >> 6;
            ProductsCarouselKt.a(productHorizontalList, str, z, anonymousClass2, z2, z4, list, z3, productHorizontalList.e.isEmpty() && productHorizontalList.f != null, composerImpl, (i6 & 3670016) | i5 | (458752 & i6) | (29360128 & i4), 0);
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(str, productDetailsRowAccordionProductList, z, anonymousClass2, function2, z2, z3, z4, list, i) { // from class: au.com.woolworths.shop.product.details.ui.j
                public final /* synthetic */ String d;
                public final /* synthetic */ ProductDetailsRowAccordionProductList e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ ProductDetailsActivity$setViewContent$1.AnonymousClass1.AnonymousClass2 g;
                public final /* synthetic */ Function2 h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ List l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    ProductDetailsScreenKt.c(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void d(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(638458869);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            FillElement fillElement = SizeKt.c;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 30, 0L, 0L, composerImplV, TestTagKt.a(BoxScopeInstance.f944a.g(Modifier.Companion.d, Alignment.Companion.e), "loading"));
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.olive.voice.ui.permission.a(i, 28);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(au.com.woolworths.product.models.ProductCard r34, androidx.compose.runtime.Composer r35, int r36) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.product.details.ui.ProductDetailsScreenKt.e(au.com.woolworths.product.models.ProductCard, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(au.com.woolworths.shop.product.details.data.ProductDetailsProductPanel r35, kotlin.jvm.functions.Function0 r36, boolean r37, androidx.compose.ui.Modifier r38, final kotlin.jvm.functions.Function1 r39, androidx.compose.runtime.Composer r40, int r41) {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.product.details.ui.ProductDetailsScreenKt.f(au.com.woolworths.shop.product.details.data.ProductDetailsProductPanel, kotlin.jvm.functions.Function0, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    public static final void g(final ProductDetailsRowAccordion productDetailsRowAccordion, final Function1 function1, final ProductDetailsActivity$setViewContent$1.AnonymousClass1.AnonymousClass2 anonymousClass2, final Function2 function2, final boolean z, final boolean z2, final Function1 function12, final boolean z3, final boolean z4, final boolean z5, final List list, Composer composer, final int i) {
        Object obj;
        int i2;
        IconAsset iconAsset;
        Object obj2;
        String str;
        String str2;
        IconAsset iconAsset2;
        ComposerImpl composerImplV = composer.v(1179394732);
        int i3 = i | (composerImplV.I(productDetailsRowAccordion) ? 4 : 2) | (composerImplV.I(function1) ? 32 : 16) | (composerImplV.I(anonymousClass2) ? 256 : 128) | (composerImplV.I(function2) ? 2048 : 1024) | (composerImplV.p(z) ? 16384 : 8192) | (composerImplV.p(z2) ? 131072 : 65536) | (composerImplV.I(function12) ? 1048576 : 524288) | (composerImplV.p(z3) ? 8388608 : 4194304) | (composerImplV.p(z4) ? 67108864 : 33554432) | (composerImplV.p(z5) ? 536870912 : 268435456);
        char c = composerImplV.I(list) ? (char) 4 : (char) 2;
        if ((i3 & 306783379) == 306783378 && (c & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-473010220);
            boolean z6 = productDetailsRowAccordion.c;
            CoreRowModel coreRowModel = productDetailsRowAccordion.f12610a;
            Object obj3 = productDetailsRowAccordion.d;
            if (z6) {
                obj = obj3;
                i2 = 131072;
                DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, CoreTheme.b(composerImplV).e.b.e, composerImplV, null);
                composerImplV = composerImplV;
            } else {
                obj = obj3;
                i2 = 131072;
            }
            composerImplV.V(false);
            boolean z7 = obj instanceof ParagraphTextItemData;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z7) {
                composerImplV.o(-1778241237);
                String str3 = coreRowModel.d;
                String str4 = coreRowModel.c;
                String str5 = ((ParagraphTextItemData) obj).b;
                IconAsset iconAsset3 = coreRowModel.b;
                composerImplV.o(-1224400529);
                boolean zI = ((i3 & 458752) == i2) | ((i3 & 112) == 32) | composerImplV.I(productDetailsRowAccordion) | ((i3 & 3670016) == 1048576);
                Object objG = composerImplV.G();
                if (zI || objG == composer$Companion$Empty$1) {
                    final int i4 = 1;
                    str = str5;
                    str2 = str3;
                    iconAsset2 = iconAsset3;
                    obj2 = new Function0() { // from class: au.com.woolworths.shop.product.details.ui.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i4) {
                                case 0:
                                    boolean z8 = !z2;
                                    function1.invoke(new ProductDetailsEvent.OnAccordionClicked(z8, productDetailsRowAccordion));
                                    function12.invoke(Boolean.valueOf(z8));
                                    break;
                                default:
                                    boolean z9 = !z2;
                                    function1.invoke(new ProductDetailsEvent.OnAccordionClicked(z9, productDetailsRowAccordion));
                                    function12.invoke(Boolean.valueOf(z9));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(obj2);
                } else {
                    str = str5;
                    iconAsset2 = iconAsset3;
                    obj2 = objG;
                    str2 = str3;
                }
                composerImplV.V(false);
                ComposerImpl composerImpl = composerImplV;
                ProductDetailsAccordionKt.a(str2, str, iconAsset2, z2, str4, (Function0) obj2, composerImpl, (i3 >> 6) & 7168, 0);
                composerImplV = composerImpl;
                DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, CoreTheme.b(composerImplV).e.b.e, composerImplV, null);
                composerImplV.V(false);
            } else if (obj instanceof ProductDetailsRowAccordionProductList) {
                composerImplV.o(-1777603660);
                String str6 = coreRowModel.d;
                String str7 = coreRowModel.c;
                IconAsset iconAsset4 = coreRowModel.b;
                composerImplV.o(-1224400529);
                boolean zI2 = ((i3 & 458752) == i2) | ((i3 & 112) == 32) | composerImplV.I(productDetailsRowAccordion) | ((i3 & 3670016) == 1048576);
                Object objG2 = composerImplV.G();
                if (zI2 || objG2 == composer$Companion$Empty$1) {
                    final int i5 = 0;
                    iconAsset = iconAsset4;
                    Function0 function0 = new Function0() { // from class: au.com.woolworths.shop.product.details.ui.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i5) {
                                case 0:
                                    boolean z8 = !z2;
                                    function1.invoke(new ProductDetailsEvent.OnAccordionClicked(z8, productDetailsRowAccordion));
                                    function12.invoke(Boolean.valueOf(z8));
                                    break;
                                default:
                                    boolean z9 = !z2;
                                    function1.invoke(new ProductDetailsEvent.OnAccordionClicked(z9, productDetailsRowAccordion));
                                    function12.invoke(Boolean.valueOf(z9));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(function0);
                    objG2 = function0;
                } else {
                    iconAsset = iconAsset4;
                }
                composerImplV.V(false);
                ComposerImpl composerImpl2 = composerImplV;
                ProductDetailsHealthierOptionsAccordianKt.a(str6, iconAsset, z2, (Function0) objG2, str7, ComposableLambdaKt.c(-284365016, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.ProductDetailsScreenKt$ProductDetailsRowAccordionUI$3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        Composer composer2 = (Composer) obj4;
                        if ((((Number) obj5).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            ProductDetailsRowAccordion productDetailsRowAccordion2 = productDetailsRowAccordion;
                            ProductDetailsScreenKt.c(productDetailsRowAccordion2.f12610a.d, (ProductDetailsRowAccordionProductList) productDetailsRowAccordion2.d, z, anonymousClass2, function2, z3, z4, z5, list, composer2, 0);
                        }
                        return Unit.f24250a;
                    }
                }, composerImpl2), composerImpl2, ((i3 >> 9) & 896) | 196608);
                composerImplV = composerImpl2;
                DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, CoreTheme.b(composerImplV).e.b.e, composerImplV, null);
                composerImplV.V(false);
            } else {
                composerImplV.o(-1776617674);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(function1, anonymousClass2, function2, z, z2, function12, z3, z4, z5, list, i) { // from class: au.com.woolworths.shop.product.details.ui.e
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ ProductDetailsActivity$setViewContent$1.AnonymousClass1.AnonymousClass2 f;
                public final /* synthetic */ Function2 g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ Function1 j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ boolean l;
                public final /* synthetic */ boolean m;
                public final /* synthetic */ List n;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    ProductDetailsScreenKt.g(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj4, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void h(ProductDetailsRowLink productDetailsRowLink, Function1 function1, Function1 function12, Function0 function0, Function1 function13, Composer composer, int i) {
        ComposerImpl composerImpl;
        IconAsset iconAsset;
        String str;
        String str2;
        ComposerImpl composerImplV = composer.v(-108496638);
        int i2 = i | (composerImplV.I(productDetailsRowLink) ? 4 : 2) | (composerImplV.I(function1) ? 32 : 16) | (composerImplV.I(function12) ? 256 : 128) | (composerImplV.I(function0) ? 2048 : 1024) | (composerImplV.I(function13) ? 16384 : 8192);
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-1186042838);
            if (productDetailsRowLink.c) {
                composerImpl = composerImplV;
                DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, CoreTheme.b(composerImplV).e.b.e, composerImpl, null);
            } else {
                composerImpl = composerImplV;
            }
            composerImpl.V(false);
            CoreRowModel coreRowModel = productDetailsRowLink.f12613a;
            String str3 = coreRowModel.d;
            String str4 = coreRowModel.c;
            IconAsset iconAsset2 = coreRowModel.b;
            composerImpl.o(-1224400529);
            boolean zI = composerImpl.I(productDetailsRowLink) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((i2 & 57344) == 16384);
            Object objG = composerImpl.G();
            if (zI || objG == Composer.Companion.f1624a) {
                iconAsset = iconAsset2;
                str = str3;
                str2 = str4;
                au.com.woolworths.android.onesite.deeplink.f fVar = new au.com.woolworths.android.onesite.deeplink.f(productDetailsRowLink, function1, function12, function0, function13, 5);
                composerImpl.A(fVar);
                objG = fVar;
            } else {
                iconAsset = iconAsset2;
                str = str3;
                str2 = str4;
            }
            Function0 function02 = (Function0) objG;
            composerImpl.V(false);
            ComposerImpl composerImpl2 = composerImpl;
            ProductDetailsLinkRowKt.a(str, iconAsset, str2, function02, composerImpl2, 0, 0);
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, CoreTheme.b(composerImpl2).e.b.e, composerImpl2, null);
            composerImplV = composerImpl2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.productfinder.g(productDetailsRowLink, function1, function12, function0, function13, i, 17);
        }
    }

    public static final void i(final ProductDetailsContract.ViewState viewState, final PagerState imageGalleryPagerState, final ProductDetailsActivity$setViewContent$1.AnonymousClass1.C02631 c02631, final ProductDetailsActivity$setViewContent$1.AnonymousClass1.AnonymousClass2 anonymousClass2, final Function0 onNavigateUp, final Function0 onNavNutritionalInfoScreen, final Function0 onNavParagraphTextScreen, final Function0 onNavFullScreenTextScreen, final Function0 onNavAboutEverydayMarket, final boolean z, final Function1 productDetailsEventSink, final boolean z2, final boolean z3, final boolean z4, final List watchlistedProductIds, final Function1 onChatEntryBannerClicked, Composer composer, final int i, final int i2) {
        ComposerImpl composerImpl;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(imageGalleryPagerState, "imageGalleryPagerState");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onNavNutritionalInfoScreen, "onNavNutritionalInfoScreen");
        Intrinsics.h(onNavParagraphTextScreen, "onNavParagraphTextScreen");
        Intrinsics.h(onNavFullScreenTextScreen, "onNavFullScreenTextScreen");
        Intrinsics.h(onNavAboutEverydayMarket, "onNavAboutEverydayMarket");
        Intrinsics.h(productDetailsEventSink, "productDetailsEventSink");
        Intrinsics.h(watchlistedProductIds, "watchlistedProductIds");
        Intrinsics.h(onChatEntryBannerClicked, "onChatEntryBannerClicked");
        ComposerImpl composerImplV = composer.v(927850500);
        int i3 = i | (composerImplV.I(viewState) ? 4 : 2) | (composerImplV.n(imageGalleryPagerState) ? 32 : 16) | (composerImplV.I(c02631) ? 256 : 128) | (composerImplV.I(anonymousClass2) ? 2048 : 1024) | (composerImplV.I(onNavigateUp) ? 16384 : 8192) | (composerImplV.I(onNavNutritionalInfoScreen) ? 131072 : 65536) | (composerImplV.I(onNavParagraphTextScreen) ? 1048576 : 524288) | (composerImplV.I(onNavFullScreenTextScreen) ? 8388608 : 4194304) | (composerImplV.I(onNavAboutEverydayMarket) ? 67108864 : 33554432) | (composerImplV.p(z) ? 536870912 : 268435456);
        int i4 = i2 | (composerImplV.I(productDetailsEventSink) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i4 |= composerImplV.p(z2) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.p(z3) ? 256 : 128;
        }
        int i5 = i4 | (composerImplV.p(z4) ? 2048 : 1024) | (composerImplV.I(watchlistedProductIds) ? 16384 : 8192);
        if ((i2 & 196608) == 0) {
            i5 |= composerImplV.I(onChatEntryBannerClicked) ? 131072 : 65536;
        }
        if ((i3 & 306783379) == 306783378 && (i5 & 74899) == 74898 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objG;
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new SnackbarHostState();
                composerImplV.A(objG2);
            }
            final SnackbarHostState snackbarHostState = (SnackbarHostState) objG2;
            composerImplV.V(false);
            final String strC = StringResources_androidKt.c(composerImplV, R.string.copy_coupon_code_success_message);
            final String strC2 = StringResources_androidKt.c(composerImplV, R.string.product_details_title);
            composerImpl = composerImplV;
            CoreThemeKt.c(6, composerImpl, ComposableLambdaKt.c(-2119542944, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.ProductDetailsScreenKt$ProductDetailsScreen$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final ProductDetailsContract.ViewState viewState2 = viewState;
                        final boolean z5 = z3;
                        final String str = strC2;
                        final Function0 function0 = onNavigateUp;
                        final Function1 function1 = productDetailsEventSink;
                        final ProductDetailsActivity$setViewContent$1.AnonymousClass1.C02631 c026312 = c02631;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-720229596, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.ProductDetailsScreenKt$ProductDetailsScreen$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    final Function0 function02 = function0;
                                    ComposableLambdaImpl composableLambdaImplC2 = ComposableLambdaKt.c(-1667841002, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.ProductDetailsScreenKt.ProductDetailsScreen.2.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            Composer composer4 = (Composer) obj5;
                                            if ((((Number) obj6).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                ImageVector imageVector = CoreTheme.e(composer4).e.b;
                                                String strC3 = StringResources_androidKt.c(composer4, R.string.content_description_back_button);
                                                composer4.o(5004770);
                                                Function0 function03 = function02;
                                                boolean zN = composer4.n(function03);
                                                Object objG3 = composer4.G();
                                                if (zN || objG3 == Composer.Companion.f1624a) {
                                                    objG3 = new au.com.woolworths.shop.lists.ui.magicmatch.ui.c(8, function03);
                                                    composer4.A(objG3);
                                                }
                                                composer4.l();
                                                IconButtonKt.c(imageVector, strC3, (Function0) objG3, null, false, null, 0L, composer4, 0, 120);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3);
                                    final ProductDetailsActivity$setViewContent$1.AnonymousClass1.C02631 c026313 = c026312;
                                    final String str2 = str;
                                    final Function1 function12 = function1;
                                    final ProductDetailsContract.ViewState viewState3 = viewState2;
                                    final boolean z6 = z5;
                                    TopNavBarKt.a(str, null, 0L, 0L, 0L, null, null, composableLambdaImplC2, ComposableLambdaKt.c(-361234163, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.ProductDetailsScreenKt.ProductDetailsScreen.2.1.2
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            RowScope TopNavBar = (RowScope) obj5;
                                            Composer composer4 = (Composer) obj6;
                                            int iIntValue = ((Number) obj7).intValue();
                                            Intrinsics.h(TopNavBar, "$this$TopNavBar");
                                            if ((iIntValue & 17) == 16 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                ImageVector imageVector = CoreTheme.e(composer4).f4879a.y;
                                                String strC3 = StringResources_androidKt.c(composer4, R.string.content_description_share);
                                                composer4.o(5004770);
                                                Function1 function13 = function12;
                                                boolean zN = composer4.n(function13);
                                                Object objG3 = composer4.G();
                                                Object obj8 = Composer.Companion.f1624a;
                                                if (zN || objG3 == obj8) {
                                                    objG3 = new au.com.woolworths.feature.product.list.v2.ui.f(27, function13);
                                                    composer4.A(objG3);
                                                }
                                                composer4.l();
                                                IconButtonKt.c(imageVector, strC3, (Function0) objG3, null, false, null, 0L, composer4, 0, 120);
                                                ProductDetailsContract.ViewState viewState4 = viewState3;
                                                ProductDetailsPage productDetailsPage = viewState4.f12566a;
                                                ProductCard productCardA = productDetailsPage != null ? ProductDetailsPageKt.a(productDetailsPage) : null;
                                                composer4.o(746335650);
                                                if (productCardA != null) {
                                                    composer4.o(746337019);
                                                    if (z6 && ProductCardExtKt.a(productCardA)) {
                                                        boolean zT = ProductCardExtKt.t(productCardA, viewState4.k);
                                                        composer4.o(-1746271574);
                                                        Object obj9 = c026313;
                                                        boolean zI = composer4.I(obj9);
                                                        Object obj10 = str2;
                                                        boolean zN2 = zI | composer4.n(obj10) | composer4.I(productCardA);
                                                        Object objG4 = composer4.G();
                                                        if (zN2 || objG4 == obj8) {
                                                            objG4 = new androidx.work.impl.utils.c(26, obj9, obj10, productCardA);
                                                            composer4.A(objG4);
                                                        }
                                                        composer4.l();
                                                        WatchlistIconKt.b(0, composer4, null, (Function0) objG4, zT);
                                                    }
                                                    composer4.l();
                                                }
                                                composer4.l();
                                                Integer num = viewState4.g;
                                                if (num != null) {
                                                    int iIntValue2 = num.intValue();
                                                    long j = CoreTheme.b(composer4).e.c.f4854a;
                                                    Integer numValueOf = Integer.valueOf(iIntValue2);
                                                    composer4.o(5004770);
                                                    boolean zN3 = composer4.n(function13);
                                                    Object objG5 = composer4.G();
                                                    if (zN3 || objG5 == obj8) {
                                                        objG5 = new au.com.woolworths.feature.product.list.v2.ui.f(28, function13);
                                                        composer4.A(objG5);
                                                    }
                                                    composer4.l();
                                                    CartIconButtonKt.a(numValueOf, (Function0) objG5, null, j, composer4, 0, 4);
                                                }
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), composer3, 905969664, 254);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final SnackbarHostState snackbarHostState2 = snackbarHostState;
                        ComposableLambdaImpl composableLambdaImplC2 = ComposableLambdaKt.c(1469423270, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.ProductDetailsScreenKt$ProductDetailsScreen$2.2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    SnackbarHostKt.b(snackbarHostState2, null, null, composer3, 6, 6);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final Function1 function12 = onChatEntryBannerClicked;
                        final SnackbarHostState snackbarHostState3 = snackbarHostState;
                        final ProductDetailsContract.ViewState viewState3 = viewState;
                        final Function1 function13 = productDetailsEventSink;
                        final PagerState pagerState = imageGalleryPagerState;
                        final Function0 function02 = onNavNutritionalInfoScreen;
                        final Function0 function03 = onNavFullScreenTextScreen;
                        final Function0 function04 = onNavParagraphTextScreen;
                        final Function0 function05 = onNavAboutEverydayMarket;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        final String str2 = strC;
                        final ProductDetailsActivity$setViewContent$1.AnonymousClass1.AnonymousClass2 anonymousClass22 = anonymousClass2;
                        final boolean z6 = z;
                        final boolean z7 = z3;
                        final boolean z8 = z2;
                        final boolean z9 = z4;
                        final List list = watchlistedProductIds;
                        ScaffoldKt.a(null, composableLambdaImplC, null, composableLambdaImplC2, 0L, null, ComposableLambdaKt.c(-645167187, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.ProductDetailsScreenKt$ProductDetailsScreen$2.3
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                Function0 function06;
                                Object obj6;
                                ProductDetailsContract.ViewState viewState4;
                                String str3;
                                AnonymousClass3 anonymousClass3;
                                String string;
                                PaddingValues paddingVals = (PaddingValues) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(paddingVals, "paddingVals");
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= composer3.n(paddingVals) ? 4 : 2;
                                }
                                if ((iIntValue & 19) == 18 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ProductDetailsContract.ViewState viewState5 = viewState3;
                                    boolean z10 = viewState5.b;
                                    Object obj7 = Composer.Companion.f1624a;
                                    if (z10) {
                                        composer3.o(-196962422);
                                        ProductDetailsScreenKt.d(composer3, 0);
                                        composer3.l();
                                        viewState4 = viewState5;
                                        obj6 = obj7;
                                    } else {
                                        composer3.o(-196825123);
                                        ProductDetailsPage productDetailsPage = viewState5.f12566a;
                                        if (productDetailsPage == null) {
                                            viewState4 = viewState5;
                                            obj6 = obj7;
                                        } else {
                                            Modifier modifierX0 = PaddingKt.e(Modifier.Companion.d, paddingVals).x0(SizeKt.c);
                                            boolean z11 = viewState5.j;
                                            composer3.o(-1530325669);
                                            boolean z12 = viewState5.i;
                                            final Function1 function14 = function13;
                                            if (z12) {
                                                composer3.o(5004770);
                                                boolean zN = composer3.n(function14);
                                                Object objG3 = composer3.G();
                                                if (zN || objG3 == obj7) {
                                                    final int i6 = 1;
                                                    objG3 = new Function0() { // from class: au.com.woolworths.shop.product.details.ui.l
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            switch (i6) {
                                                                case 0:
                                                                    function14.invoke(ProductDetailsEvent.OnErrorTryAgain.f12572a);
                                                                    break;
                                                                default:
                                                                    function14.invoke(ProductDetailsEvent.OnLocationInfoClick.f12579a);
                                                                    break;
                                                            }
                                                            return Unit.f24250a;
                                                        }
                                                    };
                                                    composer3.A(objG3);
                                                }
                                                composer3.l();
                                                function06 = (Function0) objG3;
                                            } else {
                                                function06 = null;
                                            }
                                            composer3.l();
                                            composer3.o(5004770);
                                            Function0 function07 = function02;
                                            boolean zN2 = composer3.n(function07);
                                            Object objG4 = composer3.G();
                                            if (zN2 || objG4 == obj7) {
                                                objG4 = new au.com.woolworths.design.core.ui.component.experimental.quantitystepper.j(18, function07);
                                                composer3.A(objG4);
                                            }
                                            Function1 function15 = (Function1) objG4;
                                            boolean zC = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.C(-1633490746, composer3, function14);
                                            Function0 function08 = function03;
                                            boolean zN3 = zC | composer3.n(function08);
                                            Object objG5 = composer3.G();
                                            if (zN3 || objG5 == obj7) {
                                                objG5 = new au.com.woolworths.foundation.rewards.common.ui.b(function14, function08, 28);
                                                composer3.A(objG5);
                                            }
                                            Function2 function2 = (Function2) objG5;
                                            Object objE = au.com.woolworths.android.onesite.a.e(composer3, 1849434622);
                                            if (objE == obj7) {
                                                objE = new au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.l(22);
                                                composer3.A(objE);
                                            }
                                            Function1 function16 = (Function1) objE;
                                            composer3.l();
                                            composer3.o(5004770);
                                            Function0 function09 = function04;
                                            boolean zN4 = composer3.n(function09);
                                            Object objG6 = composer3.G();
                                            if (zN4 || objG6 == obj7) {
                                                objG6 = new au.com.woolworths.design.core.ui.component.experimental.quantitystepper.j(19, function09);
                                                composer3.A(objG6);
                                            }
                                            Function1 function17 = (Function1) objG6;
                                            composer3.l();
                                            composer3.o(5004770);
                                            Function0 function010 = function05;
                                            boolean zN5 = composer3.n(function010);
                                            Object objG7 = composer3.G();
                                            if (zN5 || objG7 == obj7) {
                                                objG7 = new au.com.woolworths.shop.lists.ui.magicmatch.ui.c(9, function010);
                                                composer3.A(objG7);
                                            }
                                            Function0 function011 = (Function0) objG7;
                                            boolean zC2 = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.C(-1224400529, composer3, function14);
                                            final CoroutineScope coroutineScope3 = coroutineScope2;
                                            boolean zI = zC2 | composer3.I(coroutineScope3);
                                            final String str4 = str2;
                                            boolean zN6 = zI | composer3.n(str4);
                                            Object objG8 = composer3.G();
                                            if (zN6 || objG8 == obj7) {
                                                final SnackbarHostState snackbarHostState4 = snackbarHostState3;
                                                objG8 = new Function1() { // from class: au.com.woolworths.shop.product.details.ui.k
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj8) {
                                                        String code = (String) obj8;
                                                        Intrinsics.h(code, "code");
                                                        function14.invoke(new ProductDetailsEvent.OnEverydayMarketCouponCodeClicked(code));
                                                        BuildersKt.c(coroutineScope3, null, null, new ProductDetailsScreenKt$ProductDetailsScreen$2$3$1$7$1$1(snackbarHostState4, str4, null), 3);
                                                        return Unit.f24250a;
                                                    }
                                                };
                                                composer3.A(objG8);
                                            }
                                            composer3.l();
                                            obj6 = obj7;
                                            viewState4 = viewState5;
                                            ProductDetailsScreenKt.k(pagerState, productDetailsPage, function15, function2, function16, function17, function011, (Function1) objG8, c026312, anonymousClass22, function06, z6, z11, function14, z7, z8, z9, list, modifierX0, function12, composer3, 24576);
                                            composer3 = composer3;
                                        }
                                        composer3.l();
                                    }
                                    ProductDetailsContract.Snackbar snackbar = viewState4.l;
                                    composer3.o(-1530278153);
                                    if (snackbar == null) {
                                        anonymousClass3 = this;
                                    } else {
                                        ResText resText = snackbar.f12565a;
                                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = AndroidCompositionLocals_androidKt.b;
                                        String string2 = resText.getText((Context) composer3.x(staticProvidableCompositionLocal)).toString();
                                        Text text = snackbar.b;
                                        composer3.o(-1530273526);
                                        CharSequence text2 = text == null ? null : text.getText((Context) composer3.x(staticProvidableCompositionLocal));
                                        composer3.l();
                                        if (text2 == null || (string = text2.toString()) == null) {
                                            str3 = null;
                                        } else {
                                            String upperCase = string.toUpperCase(Locale.ROOT);
                                            Intrinsics.g(upperCase, "toUpperCase(...)");
                                            str3 = upperCase;
                                        }
                                        composer3.o(-1224400529);
                                        boolean zI2 = composer3.I(snackbar) | composer3.n(string2) | composer3.n(str3);
                                        Object objG9 = composer3.G();
                                        if (zI2 || objG9 == obj6) {
                                            anonymousClass3 = this;
                                            ProductDetailsScreenKt$ProductDetailsScreen$2$3$2$1$1 productDetailsScreenKt$ProductDetailsScreen$2$3$2$1$1 = new ProductDetailsScreenKt$ProductDetailsScreen$2$3$2$1$1(snackbar, string2, snackbarHostState3, str3, null);
                                            composer3.A(productDetailsScreenKt$ProductDetailsScreen$2$3$2$1$1);
                                            objG9 = productDetailsScreenKt$ProductDetailsScreen$2$3$2$1$1;
                                        } else {
                                            anonymousClass3 = this;
                                        }
                                        composer3.l();
                                        EffectsKt.e(composer3, snackbar, (Function2) objG9);
                                    }
                                    composer3.l();
                                    ProductDetailsPageErrorState productDetailsPageErrorState = viewState4.h;
                                    if (productDetailsPageErrorState != null) {
                                        composer3.o(5004770);
                                        final Function1 function18 = function13;
                                        boolean zN7 = composer3.n(function18);
                                        Object objG10 = composer3.G();
                                        if (zN7 || objG10 == obj6) {
                                            final int i7 = 0;
                                            objG10 = new Function0() { // from class: au.com.woolworths.shop.product.details.ui.l
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i7) {
                                                        case 0:
                                                            function18.invoke(ProductDetailsEvent.OnErrorTryAgain.f12572a);
                                                            break;
                                                        default:
                                                            function18.invoke(ProductDetailsEvent.OnLocationInfoClick.f12579a);
                                                            break;
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            };
                                            composer3.A(objG10);
                                        }
                                        composer3.l();
                                        ProductDetailsScreenKt.b(productDetailsPageErrorState, (Function0) objG10, composer3, 0);
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 12586032, 117);
                    }
                    return Unit.f24250a;
                }
            }, composerImpl));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(imageGalleryPagerState, c02631, anonymousClass2, onNavigateUp, onNavNutritionalInfoScreen, onNavParagraphTextScreen, onNavFullScreenTextScreen, onNavAboutEverydayMarket, z, productDetailsEventSink, z2, z3, z4, watchlistedProductIds, onChatEntryBannerClicked, i, i2) { // from class: au.com.woolworths.shop.product.details.ui.i
                public final /* synthetic */ PagerState e;
                public final /* synthetic */ ProductDetailsActivity$setViewContent$1.AnonymousClass1.C02631 f;
                public final /* synthetic */ ProductDetailsActivity$setViewContent$1.AnonymousClass1.AnonymousClass2 g;
                public final /* synthetic */ Function0 h;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function0 j;
                public final /* synthetic */ Function0 k;
                public final /* synthetic */ Function0 l;
                public final /* synthetic */ boolean m;
                public final /* synthetic */ Function1 n;
                public final /* synthetic */ boolean o;
                public final /* synthetic */ boolean p;
                public final /* synthetic */ boolean q;
                public final /* synthetic */ List r;
                public final /* synthetic */ Function1 s;
                public final /* synthetic */ int t;

                {
                    this.t = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    int iA2 = RecomposeScopeImplKt.a(this.t);
                    ProductDetailsScreenKt.i(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (Composer) obj, iA, iA2);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void j(final ProductDetailsViewModel viewModel, final PagerState imageGalleryPagerState, final ProductDetailsActivity$setViewContent$1.AnonymousClass1.C02631 c02631, final ProductDetailsActivity$setViewContent$1.AnonymousClass1.AnonymousClass2 anonymousClass2, final Function0 onNavigateUp, final Function0 onNavNutritionalInfoScreen, final Function0 onNavParagraphTextScreen, final Function0 onNavFullScreenTextScreen, final Function0 onNavAboutEverydayMarket, final boolean z, final Function1 productDetailsEventSink, final boolean z2, final boolean z3, final Function1 onChatEntryBannerClicked, Composer composer, final int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(imageGalleryPagerState, "imageGalleryPagerState");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onNavNutritionalInfoScreen, "onNavNutritionalInfoScreen");
        Intrinsics.h(onNavParagraphTextScreen, "onNavParagraphTextScreen");
        Intrinsics.h(onNavFullScreenTextScreen, "onNavFullScreenTextScreen");
        Intrinsics.h(onNavAboutEverydayMarket, "onNavAboutEverydayMarket");
        Intrinsics.h(productDetailsEventSink, "productDetailsEventSink");
        Intrinsics.h(onChatEntryBannerClicked, "onChatEntryBannerClicked");
        ComposerImpl composerImplV = composer.v(-417843363);
        int i2 = i | (composerImplV.n(viewModel) ? 4 : 2) | (composerImplV.n(imageGalleryPagerState) ? 32 : 16) | (composerImplV.I(c02631) ? 256 : 128) | (composerImplV.I(anonymousClass2) ? 2048 : 1024) | (composerImplV.I(onNavigateUp) ? 16384 : 8192) | (composerImplV.I(onNavNutritionalInfoScreen) ? 131072 : 65536) | (composerImplV.I(onNavParagraphTextScreen) ? 1048576 : 524288) | (composerImplV.I(onNavFullScreenTextScreen) ? 8388608 : 4194304) | (composerImplV.I(onNavAboutEverydayMarket) ? 67108864 : 33554432) | (composerImplV.p(z) ? 536870912 : 268435456);
        int i3 = (composerImplV.I(productDetailsEventSink) ? 4 : 2) | (composerImplV.p(z2) ? 32 : 16) | (composerImplV.p(z3) ? 256 : 128) | (composerImplV.I(onChatEntryBannerClicked) ? 2048 : 1024);
        if ((i2 & 306783379) == 306783378 && (i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            MutableState mutableStateA = FlowExtKt.a(viewModel.r, composerImplV);
            composerImpl = composerImplV;
            i((ProductDetailsContract.ViewState) mutableStateA.getD(), imageGalleryPagerState, c02631, anonymousClass2, onNavigateUp, onNavNutritionalInfoScreen, onNavParagraphTextScreen, onNavFullScreenTextScreen, onNavAboutEverydayMarket, z, productDetailsEventSink, z3, z2, viewModel.j.c(BaseShopAppFeature.w), ((ProductDetailsContract.ViewState) mutableStateA.getD()).k, onChatEntryBannerClicked, composerImpl, i2 & 2147483632, ((i3 << 3) & 896) | (i3 & 14) | ((i3 >> 3) & 112) | (458752 & (i3 << 6)));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(imageGalleryPagerState, c02631, anonymousClass2, onNavigateUp, onNavNutritionalInfoScreen, onNavParagraphTextScreen, onNavFullScreenTextScreen, onNavAboutEverydayMarket, z, productDetailsEventSink, z2, z3, onChatEntryBannerClicked, i) { // from class: au.com.woolworths.shop.product.details.ui.g
                public final /* synthetic */ PagerState e;
                public final /* synthetic */ ProductDetailsActivity$setViewContent$1.AnonymousClass1.C02631 f;
                public final /* synthetic */ ProductDetailsActivity$setViewContent$1.AnonymousClass1.AnonymousClass2 g;
                public final /* synthetic */ Function0 h;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function0 j;
                public final /* synthetic */ Function0 k;
                public final /* synthetic */ Function0 l;
                public final /* synthetic */ boolean m;
                public final /* synthetic */ Function1 n;
                public final /* synthetic */ boolean o;
                public final /* synthetic */ boolean p;
                public final /* synthetic */ Function1 q;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    ProductDetailsScreenKt.j(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void k(final PagerState imageGalleryPagerState, ProductDetailsPage productDetailsPageData, final Function1 onNutritionalInfoLinkRowClicked, final Function2 onNavFullScreenImageGalleryScreen, final Function1 onImageGalleryIndexChanged, final Function1 onParagraphLinkRowClicked, final Function0 onAboutEverydayMarketClicked, final Function1 onEverydayMarketCouponCodeClicked, final ProductDetailsActivity$setViewContent$1.AnonymousClass1.C02631 c02631, final ProductDetailsActivity$setViewContent$1.AnonymousClass1.AnonymousClass2 anonymousClass2, final Function0 function0, final boolean z, final boolean z2, Function1 productDetailsEventSink, final boolean z3, final boolean z4, final boolean z5, final List watchlistedProductIds, final Modifier modifier, final Function1 onChatEntryBannerClicked, Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        LazyListState lazyListState;
        int i3;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        int i4;
        float f;
        Function1 function1;
        ComposerImpl composerImpl;
        ProductDetailsPage productDetailsPage;
        ComposerImpl composerImpl2;
        boolean z6;
        Intrinsics.h(imageGalleryPagerState, "imageGalleryPagerState");
        Intrinsics.h(productDetailsPageData, "productDetailsPageData");
        Intrinsics.h(onNutritionalInfoLinkRowClicked, "onNutritionalInfoLinkRowClicked");
        Intrinsics.h(onNavFullScreenImageGalleryScreen, "onNavFullScreenImageGalleryScreen");
        Intrinsics.h(onImageGalleryIndexChanged, "onImageGalleryIndexChanged");
        Intrinsics.h(onParagraphLinkRowClicked, "onParagraphLinkRowClicked");
        Intrinsics.h(onAboutEverydayMarketClicked, "onAboutEverydayMarketClicked");
        Intrinsics.h(onEverydayMarketCouponCodeClicked, "onEverydayMarketCouponCodeClicked");
        Intrinsics.h(productDetailsEventSink, "productDetailsEventSink");
        Intrinsics.h(watchlistedProductIds, "watchlistedProductIds");
        Intrinsics.h(onChatEntryBannerClicked, "onChatEntryBannerClicked");
        ComposerImpl composerImplV = composer.v(-1227186908);
        int i5 = i | (composerImplV.n(imageGalleryPagerState) ? 4 : 2) | (composerImplV.I(productDetailsPageData) ? 32 : 16) | (composerImplV.I(onNutritionalInfoLinkRowClicked) ? 256 : 128) | (composerImplV.I(onNavFullScreenImageGalleryScreen) ? 2048 : 1024) | (composerImplV.I(onParagraphLinkRowClicked) ? 131072 : 65536) | (composerImplV.I(onAboutEverydayMarketClicked) ? 1048576 : 524288) | (composerImplV.I(onEverydayMarketCouponCodeClicked) ? 8388608 : 4194304) | (composerImplV.I(c02631) ? 67108864 : 33554432) | (composerImplV.I(anonymousClass2) ? 536870912 : 268435456);
        int i6 = (composerImplV.I(function0) ? 4 : 2) | (composerImplV.p(z) ? 32 : 16) | (composerImplV.p(z2) ? 256 : 128) | (composerImplV.I(productDetailsEventSink) ? 2048 : 1024) | (composerImplV.p(z3) ? 16384 : 8192) | (composerImplV.p(z4) ? 131072 : 65536) | (composerImplV.p(z5) ? 1048576 : 524288) | (composerImplV.I(watchlistedProductIds) ? 8388608 : 4194304) | (composerImplV.n(modifier) ? 67108864 : 33554432) | (composerImplV.I(onChatEntryBannerClicked) ? 536870912 : 268435456);
        if ((i5 & 306775187) == 306775186 && (306783379 & i6) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            function1 = productDetailsEventSink;
            productDetailsPage = productDetailsPageData;
            composerImpl2 = composerImplV;
        } else {
            List list = productDetailsPageData.f12608a;
            LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            Modifier modifierA = TestTagKt.a(modifier, "product details content list");
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i7 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                androidx.camera.core.impl.b.B(i7, composerImplV, i7, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier.Companion companion2 = Modifier.Companion.d;
            float f2 = 16;
            Modifier modifierJ = PaddingKt.j(ColumnScopeInstance.f948a.a(SizeKt.e(companion2, 1.0f), 1.0f, true), BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            composerImplV.o(-1224400529);
            int i8 = i6 & 7168;
            boolean zI = ((i6 & 14) == 4) | composerImplV.I(list) | ((29360128 & i5) == 8388608) | (i8 == 2048) | ((i6 & 3670016) == 1048576) | ((i6 & 112) == 32) | ((i5 & 14) == 4) | ((i5 & 7168) == 2048) | composerImplV.I(anonymousClass2) | ((i6 & 57344) == 16384) | ((i6 & 458752) == 131072) | composerImplV.I(watchlistedProductIds) | composerImplV.n(lazyListStateA) | ((i5 & 458752) == 131072) | ((i5 & 896) == 256) | ((i5 & 3670016) == 1048576) | ((1879048192 & i6) == 536870912);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$12) {
                i2 = i6;
                companion = companion2;
                lazyListState = lazyListStateA;
                i3 = i8;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                i4 = i5;
                f = f2;
                function1 = productDetailsEventSink;
                au.com.woolworths.shop.buyagain.ui.composable.b bVar = new au.com.woolworths.shop.buyagain.ui.composable.b(list, function1, function0, z5, z, imageGalleryPagerState, onNavFullScreenImageGalleryScreen, anonymousClass2, z3, z4, watchlistedProductIds, lazyListState, onParagraphLinkRowClicked, onNutritionalInfoLinkRowClicked, onAboutEverydayMarketClicked, onChatEntryBannerClicked, onEverydayMarketCouponCodeClicked);
                composerImpl = composerImplV;
                composerImpl.A(bVar);
                objG = bVar;
            } else {
                function1 = productDetailsEventSink;
                companion = companion2;
                i2 = i6;
                lazyListState = lazyListStateA;
                composerImpl = composerImplV;
                i3 = i8;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                i4 = i5;
                f = f2;
            }
            composerImpl.V(false);
            ComposerImpl composerImpl3 = composerImpl;
            LazyDslKt.b(modifierJ, lazyListState, null, false, null, null, null, false, null, (Function1) objG, composerImpl3, 0, 508);
            productDetailsPage = productDetailsPageData;
            composerImpl2 = composerImpl3;
            FooterData footerData = productDetailsPage.d;
            composerImpl2.o(722451699);
            if (footerData == null) {
                z6 = true;
            } else {
                ProductCard productCardA = ProductDetailsPageKt.a(productDetailsPage);
                composerImpl2.o(722453828);
                if (productCardA == null) {
                    z6 = true;
                } else {
                    composerImpl2.o(5004770);
                    boolean z7 = i3 == 2048;
                    Object objG2 = composerImpl2.G();
                    if (z7 || objG2 == composer$Companion$Empty$1) {
                        objG2 = new au.com.woolworths.feature.shop.contentpage.ui.c(26, function1);
                        composerImpl2.A(objG2);
                    }
                    composerImpl2.V(false);
                    z6 = true;
                    int i9 = i2 << 9;
                    ProductDetailsFooterUIKt.c(productCardA, footerData, (Function1) objG2, c02631, z, z2, SizeKt.e(PaddingKt.g(BorderKt.a(companion, 1, CoreTheme.b(composerImpl2).e.b.e, RectangleShapeKt.f1779a), f, 12), 1.0f), composerImpl2, ProductCard.$stable | ((i4 >> 15) & 7168) | (i9 & 57344) | (i9 & 458752), 0);
                }
                composerImpl2.V(false);
            }
            composerImpl2.V(false);
            composerImpl2.V(z6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            final Function1 function12 = function1;
            final ProductDetailsPage productDetailsPage2 = productDetailsPage;
            recomposeScopeImplX.d = new Function2(productDetailsPage2, onNutritionalInfoLinkRowClicked, onNavFullScreenImageGalleryScreen, onImageGalleryIndexChanged, onParagraphLinkRowClicked, onAboutEverydayMarketClicked, onEverydayMarketCouponCodeClicked, c02631, anonymousClass2, function0, z, z2, function12, z3, z4, z5, watchlistedProductIds, modifier, onChatEntryBannerClicked, i) { // from class: au.com.woolworths.shop.product.details.ui.h
                public final /* synthetic */ ProductDetailsPage e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function2 g;
                public final /* synthetic */ Function1 h;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Function0 j;
                public final /* synthetic */ Function1 k;
                public final /* synthetic */ ProductDetailsActivity$setViewContent$1.AnonymousClass1.C02631 l;
                public final /* synthetic */ ProductDetailsActivity$setViewContent$1.AnonymousClass1.AnonymousClass2 m;
                public final /* synthetic */ Function0 n;
                public final /* synthetic */ boolean o;
                public final /* synthetic */ boolean p;
                public final /* synthetic */ Function1 q;
                public final /* synthetic */ boolean r;
                public final /* synthetic */ boolean s;
                public final /* synthetic */ boolean t;
                public final /* synthetic */ List u;
                public final /* synthetic */ Modifier v;
                public final /* synthetic */ Function1 w;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(24577);
                    ProductDetailsScreenKt.k(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void l(PagerState pagerState, ArrayList arrayList, ArrayList arrayList2, Function2 onImageClick, Function1 onThumbnailClicked, Function2 onSwipeImageGallery, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.h(pagerState, "pagerState");
        Intrinsics.h(onImageClick, "onImageClick");
        Intrinsics.h(onThumbnailClicked, "onThumbnailClicked");
        Intrinsics.h(onSwipeImageGallery, "onSwipeImageGallery");
        ComposerImpl composerImplV = composer.v(-684726323);
        int i2 = i | (composerImplV.n(pagerState) ? 4 : 2) | (composerImplV.I(arrayList) ? 32 : 16) | (composerImplV.I(arrayList2) ? 256 : 128) | (composerImplV.I(onImageClick) ? 2048 : 1024) | (composerImplV.I(onThumbnailClicked) ? 16384 : 8192) | (composerImplV.I(onSwipeImageGallery) ? 131072 : 65536);
        if ((599187 & i2) == 599186 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            Modifier modifierE = SizeKt.e(modifier2, 1.0f);
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
            int i4 = i2 >> 3;
            GalleryImagesCarouselKt.a(arrayList2, new ColorPainter(CoreTheme.b(composerImplV).f4782a.f4783a.b.c), onImageClick, pagerState, onThumbnailClicked, null, onSwipeImageGallery, !arrayList.isEmpty(), false, composerImplV, ((i2 >> 6) & 14) | (i4 & 896) | ((i2 << 9) & 7168) | (57344 & i2) | ((i2 << 3) & 3670016), 288);
            n(arrayList, BoxScopeInstance.f944a.g(PaddingKt.h(Modifier.Companion.d, 8, BitmapDescriptorFactory.HUE_RED, 2), Alignment.Companion.c), composerImplV, i4 & 14);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.account.authentication.ui.c(pagerState, arrayList, arrayList2, onImageClick, onThumbnailClicked, onSwipeImageGallery, modifier2, i);
        }
    }

    public static final void m(PromotionInfo promotionInfo, RewardsOfferInfo rewardsOfferInfo, List list, boolean z, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1273759386);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(promotionInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(rewardsOfferInfo) : composerImplV.I(rewardsOfferInfo) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.p(z) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierG = PaddingKt.g(Modifier.Companion.d, 16, 4);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(8), Alignment.Companion.j, composerImplV, 6);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierG);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(8003662);
            List list2 = list;
            boolean z2 = false;
            if (!(list2 == null || list2.isEmpty())) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ProductInlineLabelApiData productInlineLabelApiData = (ProductInlineLabelApiData) it.next();
                    composerImplV.o(8006769);
                    if (productInlineLabelApiData.getType() == ProductInlineTypeApiData.NEW) {
                        ProductPromotionLabelKt.a(productInlineLabelApiData.getLabel(), TagSpec.Style.d, null, composerImplV, 48, 12);
                    }
                    composerImplV.V(false);
                }
            }
            composerImplV.V(false);
            composerImplV.o(8016969);
            if (promotionInfo != null) {
                if (WhenMappings.f12634a[promotionInfo.getType().ordinal()] == 1) {
                    composerImplV.o(1753902063);
                    if ((rewardsOfferInfo != null ? rewardsOfferInfo.getN() : null) == RewardsOfferStatus.ACTIVATED) {
                        composerImplV.o(1753981888);
                        BoostingState boostingState = BoostingState.g;
                        String label = promotionInfo.getLabel();
                        composerImplV.o(1849434622);
                        Object objG = composerImplV.G();
                        if (objG == Composer.Companion.f1624a) {
                            objG = new au.com.woolworths.android.onesite.deeplink.h(20);
                            composerImplV.A(objG);
                        }
                        composerImplV.V(false);
                        ProductBoostKt.a(null, null, true, boostingState, (Function0) objG, label, composerImplV, 224310, 4);
                        composerImplV = composerImplV;
                        composerImplV.V(false);
                        z2 = false;
                    } else {
                        composerImplV.o(1754415640);
                        RewardsProductPromotionLabelKt.a(0, composerImplV, null, promotionInfo.getLabel());
                        composerImplV.V(false);
                    }
                    composerImplV.V(z2);
                } else {
                    composerImplV.o(1754620209);
                    ProductPromotionLabelKt.a(promotionInfo.getLabel(), ProductPromotionLabelKt.b(promotionInfo.getType(), z), null, composerImplV, 0, 12);
                    composerImplV.V(false);
                }
            }
            composerImplV.V(z2);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.pullrefresh.a(i, 15, promotionInfo, rewardsOfferInfo, list, z);
        }
    }

    public static final void n(ArrayList arrayList, Modifier modifier, Composer composer, int i) {
        int i2;
        Object obj;
        Object next;
        ComposerImpl composerImplV = composer.v(-1965305736);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(8), Alignment.Companion.m, composerImplV, 6);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
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
            Iterator it = arrayList.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((RoundelImage) next).c == RoundelImagePriority.d) {
                        break;
                    }
                }
            }
            RoundelImage roundelImage = (RoundelImage) next;
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((RoundelImage) next2).c == RoundelImagePriority.e) {
                    obj = next2;
                    break;
                }
            }
            RoundelImage roundelImage2 = (RoundelImage) obj;
            composerImplV.o(326002188);
            if (roundelImage != null) {
                ProductDetailsOffersRoundelsKt.a(roundelImage.f12619a, roundelImage.b, composerImplV, 0);
            }
            composerImplV.V(false);
            composerImplV.o(326008526);
            if (roundelImage2 != null) {
                ProductDetailsOffersRoundelsKt.c(roundelImage2.f12619a, roundelImage2.b, composerImplV, 0);
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.lists.ui.details.ui.compose.b(arrayList, i, 12, modifier);
        }
    }
}
