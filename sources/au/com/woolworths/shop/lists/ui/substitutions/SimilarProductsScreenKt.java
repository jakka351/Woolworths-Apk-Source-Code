package au.com.woolworths.shop.lists.ui.substitutions;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.modules.common.InlineErrorAction;
import au.com.woolworths.android.onesite.modules.common.InlineErrorCause;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiDataExtKt;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.AccentColors;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageUiKt;
import au.com.woolworths.product.composeui.ProductCardButtonsHorizontalKt;
import au.com.woolworths.product.composeui.ProductCardHorizontalUiKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt;
import au.com.woolworths.shop.lists.data.model.AlternativeProductCard;
import au.com.woolworths.shop.lists.data.model.AlternativeProducts;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsCtaSection;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsDisclaimer;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsInsetBannerSection;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsNoResultSection;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsProductSection;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsProductsHeaderSection;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsSection;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsTargetProductSection;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsType;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsTypeTag;
import au.com.woolworths.shop.lists.ui.substitutions.HeaderBannerKt;
import au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsContract;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SimilarProductsScreenKt {
    public static final void a(final List sections, final boolean z, final boolean z2, final Function1 function1, final Function1 function12, final Function1 onCtaClick, final ProductClickListener productClickListener, final ScrollState scrollState, Composer composer, final int i) {
        Function1 onSelectProductClick = function1;
        Function1 onInfoClick = function12;
        ProductClickListener productClickListener2 = productClickListener;
        Intrinsics.h(sections, "sections");
        Intrinsics.h(onSelectProductClick, "onSelectProductClick");
        Intrinsics.h(onInfoClick, "onInfoClick");
        Intrinsics.h(onCtaClick, "onCtaClick");
        Intrinsics.h(productClickListener2, "productClickListener");
        Intrinsics.h(scrollState, "scrollState");
        ComposerImpl composerImplV = composer.v(-323942352);
        boolean z3 = z;
        boolean z4 = z2;
        int i2 = i | (composerImplV.I(sections) ? 4 : 2) | (composerImplV.p(z3) ? 32 : 16) | (composerImplV.p(z4) ? 256 : 128) | (composerImplV.I(onSelectProductClick) ? 2048 : 1024) | (composerImplV.I(onInfoClick) ? 16384 : 8192) | (composerImplV.I(onCtaClick) ? 131072 : 65536) | (composerImplV.I(productClickListener2) ? 1048576 : 524288) | (composerImplV.n(scrollState) ? 8388608 : 4194304);
        if ((4793491 & i2) == 4793490 && composerImplV.c()) {
            composerImplV.j();
        } else {
            e(composerImplV, 0);
            Modifier modifierB = ScrollKt.b(SizeKt.c(Modifier.Companion.d, 1.0f), scrollState, true);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(2009822570);
            Iterator it = sections.iterator();
            while (it.hasNext()) {
                AlternativeProductsSection alternativeProductsSection = (AlternativeProductsSection) it.next();
                if (alternativeProductsSection instanceof AlternativeProductsProductSection) {
                    composerImplV.o(-1211731140);
                    n((AlternativeProductsProductSection) alternativeProductsSection, z3, z4, onSelectProductClick, onInfoClick, productClickListener2, composerImplV, (65520 & i2) | ((i2 >> 3) & 458752));
                    composerImplV.V(false);
                } else if (alternativeProductsSection instanceof AlternativeProductsNoResultSection) {
                    composerImplV.o(-1211718656);
                    h((AlternativeProductsNoResultSection) alternativeProductsSection, composerImplV, 0);
                    composerImplV.V(false);
                } else if (alternativeProductsSection instanceof AlternativeProductsCtaSection) {
                    composerImplV.o(-1211716154);
                    b((AlternativeProductsCtaSection) alternativeProductsSection, onCtaClick, composerImplV, (i2 >> 12) & 112);
                    composerImplV.V(false);
                } else if (alternativeProductsSection instanceof AlternativeProductsInsetBannerSection) {
                    composerImplV.o(-1211713214);
                    f((AlternativeProductsInsetBannerSection) alternativeProductsSection, composerImplV, 0);
                    composerImplV.V(false);
                } else if (alternativeProductsSection instanceof AlternativeProductsDisclaimer) {
                    composerImplV.o(1091677624);
                    composerImplV.V(false);
                } else {
                    if (!(alternativeProductsSection instanceof AlternativeProductsTargetProductSection)) {
                        throw au.com.woolworths.android.onesite.a.w(-1211732820, composerImplV, false);
                    }
                    composerImplV.o(1091839258);
                    composerImplV.V(false);
                }
                z3 = z;
                z4 = z2;
                onSelectProductClick = function1;
                onInfoClick = function12;
                productClickListener2 = productClickListener;
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(sections, z, z2, function1, function12, onCtaClick, productClickListener, scrollState, i) { // from class: au.com.woolworths.shop.lists.ui.substitutions.f
                public final /* synthetic */ List d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ Function1 g;
                public final /* synthetic */ Function1 h;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ ProductClickListener j;
                public final /* synthetic */ ScrollState k;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    SimilarProductsScreenKt.a(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final AlternativeProductsCtaSection alternativeProductsCtaSection, Function1 onCtaClick, Composer composer, int i) {
        int i2;
        Intrinsics.h(onCtaClick, "onCtaClick");
        ComposerImpl composerImplV = composer.v(455459117);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(alternativeProductsCtaSection) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onCtaClick) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierJ = PaddingKt.j(SizeKt.b(SizeKt.e(Modifier.Companion.d, 1.0f), BitmapDescriptorFactory.HUE_RED, 68, 1), BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, 80, 5);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.e, Alignment.Companion.k, composerImplV, 54);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierJ);
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
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 112) == 32) | composerImplV.I(alternativeProductsCtaSection);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new k(2, onCtaClick, alternativeProductsCtaSection);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            ButtonKt.c((Function0) objG, null, false, null, null, null, null, null, ComposableLambdaKt.c(-1058294962, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.substitutions.SimilarProductsScreenKt$CtaSection$1$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    RowScope TextButton = (RowScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(TextButton, "$this$TextButton");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        String upperCase = alternativeProductsCtaSection.getText().toUpperCase(Locale.ROOT);
                        Intrinsics.g(upperCase, "toUpperCase(...)");
                        TextKt.b(upperCase, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 805306368, 510);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.lists.ui.details.ui.compose.b(alternativeProductsCtaSection, i, 9, onCtaClick);
        }
    }

    public static final void c(ViewSimilarProductsContract.ViewState.Error viewState, Function0 onRetryClick, Composer composer, int i) {
        int i2;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(onRetryClick, "onRetryClick");
        ComposerImpl composerImplV = composer.v(-1661039743);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onRetryClick) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            FullPageMessageSpec fullPageMessageSpecA = FullPageMessageSpec.Companion.a(viewState.f12481a, null, null, onRetryClick, composerImplV, ((i2 << 12) & 458752) | 1572864, 30);
            composerImplV = composerImplV;
            FullPageMessageUiKt.a(fullPageMessageSpecA, BackgroundKt.b(Modifier.Companion.d, WxTheme.a(composerImplV).a(), RectangleShapeKt.f1779a), null, composerImplV, 0, 4);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.lists.ui.details.ui.compose.b(viewState, i, 8, onRetryClick);
        }
    }

    public static final void d(final List sections, final Function1 onSelectProductClick, final Function1 onInfoClick, final boolean z, final boolean z2, final boolean z3, final ProductClickListener productClickListener, final Function1 function1, Composer composer, final int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(sections, "sections");
        Intrinsics.h(onSelectProductClick, "onSelectProductClick");
        Intrinsics.h(onInfoClick, "onInfoClick");
        Intrinsics.h(productClickListener, "productClickListener");
        ComposerImpl composerImplV = composer.v(-2120675335);
        int i2 = (composerImplV.I(sections) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onSelectProductClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onInfoClick) ? 256 : 128;
        }
        int i3 = i2 | (composerImplV.p(z) ? 2048 : 1024) | (composerImplV.p(z2) ? 16384 : 8192);
        if ((196608 & i) == 0) {
            i3 |= composerImplV.p(z3) ? 131072 : 65536;
        }
        int i4 = i3 | (composerImplV.I(productClickListener) ? 1048576 : 524288);
        if ((12582912 & i) == 0) {
            i4 |= composerImplV.I(function1) ? 8388608 : 4194304;
        }
        if ((i4 & 4793491) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            final ScrollState scrollStateA = ScrollKt.a(composerImplV);
            composerImpl = composerImplV;
            ScaffoldKt.a(SizeKt.c, null, ComposableLambdaKt.c(-239100332, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.substitutions.SimilarProductsScreenKt$FullContentUi$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        List list = sections;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            if (obj3 instanceof AlternativeProductsTargetProductSection) {
                                arrayList.add(obj3);
                            }
                        }
                        AlternativeProductsTargetProductSection alternativeProductsTargetProductSection = (AlternativeProductsTargetProductSection) ((AlternativeProductsSection) CollectionsKt.F(arrayList));
                        if (alternativeProductsTargetProductSection != null) {
                            SimilarProductsScreenKt.i(alternativeProductsTargetProductSection, scrollStateA, z, z3, composer2, 0);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0, ToneColors.j, 0L, null, null, ComposableLambdaKt.c(-1006509662, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.substitutions.SimilarProductsScreenKt$FullContentUi$3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        SimilarProductsScreenKt.a(sections, z2, z3, onSelectProductClick, onInfoClick, function1, productClickListener, scrollStateA, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 390, 954);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.shop.lists.ui.substitutions.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    SimilarProductsScreenKt.d(sections, onSelectProductClick, onInfoClick, z, z2, z3, productClickListener, function1, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void e(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-34339366);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, KyberEngine.KyberPolyBytes, 1, ToneColors.g, composerImplV, null);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.olive.voice.ui.permission.a(i, 27);
        }
    }

    public static final void f(final AlternativeProductsInsetBannerSection alternativeProductsInsetBannerSection, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(-1727550516);
        if ((((composerImplV.I(alternativeProductsInsetBannerSection) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            InsetBannerApiData insetBanner = alternativeProductsInsetBannerSection.getInsetBanner();
            if (insetBanner == null) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    final int i2 = 0;
                    recomposeScopeImplX.d = new Function2(alternativeProductsInsetBannerSection, i, i2) { // from class: au.com.woolworths.shop.lists.ui.substitutions.g
                        public final /* synthetic */ int d;
                        public final /* synthetic */ AlternativeProductsInsetBannerSection e;

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
                                    SimilarProductsScreenKt.f(this.e, composer2, RecomposeScopeImplKt.a(1));
                                    break;
                                default:
                                    SimilarProductsScreenKt.f(this.e, composer2, RecomposeScopeImplKt.a(1));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            String titleString = insetBanner.getTitleString();
            InsetBannerData insetBannerData = new InsetBannerData(titleString != null ? new PlainText(titleString) : null, null, new PlainText(insetBanner.getMessage()), InlineErrorAction.None.d, InsetBannerTypeApiDataExtKt.toInlineErrorType(insetBanner.getDisplayType()), InlineErrorCause.IconConfig.Default.d);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierB = BackgroundKt.b(SizeKt.x(SizeKt.e(companion, 1.0f), Alignment.Companion.k, false), ToneColors.k, RectangleShapeKt.f1779a);
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
            float f = 16;
            Modifier modifierJ = PaddingKt.j(SizeKt.e(companion, 1.0f), f, BitmapDescriptorFactory.HUE_RED, f, f, 2);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.shop.lists.ui.shoppinglist.compose.a(26);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            InsetBannerUiKt.b(insetBannerData, modifierJ, false, (Function1) objG, composerImplV, 24624, 12);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            final int i4 = 1;
            recomposeScopeImplX2.d = new Function2(alternativeProductsInsetBannerSection, i, i4) { // from class: au.com.woolworths.shop.lists.ui.substitutions.g
                public final /* synthetic */ int d;
                public final /* synthetic */ AlternativeProductsInsetBannerSection e;

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
                            SimilarProductsScreenKt.f(this.e, composer2, RecomposeScopeImplKt.a(1));
                            break;
                        default:
                            SimilarProductsScreenKt.f(this.e, composer2, RecomposeScopeImplKt.a(1));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void g(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1429620789);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            FillElement fillElement = SizeKt.c;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
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
            ProgressIndicatorKt.b(2, 0, 390, 24, WxTheme.a(composerImplV).h(), 0L, composerImplV, SizeKt.q(Modifier.Companion.d, 24));
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.olive.voice.ui.permission.a(i, 26);
        }
    }

    public static final void h(AlternativeProductsNoResultSection alternativeProductsNoResultSection, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1182318299);
        if ((((composerImplV.I(alternativeProductsNoResultSection) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierG = PaddingKt.g(SizeKt.e(BackgroundKt.b(Modifier.Companion.d, WxTheme.a(composerImplV).a(), RectangleShapeKt.f1779a), 1.0f), 16, 27);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.e, Alignment.Companion.k, composerImplV, 54);
            int i2 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.b(alternativeProductsNoResultSection.getText(), null, 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).l, composerImplV, 0, 0, 65022);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(i, 0, alternativeProductsNoResultSection);
        }
    }

    public static final void i(final AlternativeProductsTargetProductSection alternativeProductsTargetProductSection, final ScrollState scrollState, final boolean z, final boolean z2, Composer composer, int i) {
        Intrinsics.h(scrollState, "scrollState");
        ComposerImpl composerImplV = composer.v(882604806);
        if (((i | (composerImplV.I(alternativeProductsTargetProductSection) ? 4 : 2) | (composerImplV.n(scrollState) ? 32 : 16) | (composerImplV.p(z) ? 256 : 128) | (composerImplV.p(z2) ? 2048 : 1024)) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = SnapshotStateKt.d(new Function0() { // from class: au.com.woolworths.shop.lists.ui.substitutions.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float f;
                        float f2;
                        Integer num = 2;
                        float fD = ((SnapshotMutableIntStateImpl) scrollState.f848a).d() / 3.0f;
                        float fFloatValue = ((Number) RangesKt.f(Float.valueOf(96.0f - fD), RangesKt.j(64.0f, 96.0f))).floatValue();
                        float fB = RangesKt.b((96.0f - fFloatValue) / 32.0f, BitmapDescriptorFactory.HUE_RED, 1.0f);
                        boolean z3 = z;
                        float f3 = z3 ? 96.0f : fFloatValue;
                        if (z3) {
                            f = 16;
                        } else {
                            float f4 = 16;
                            f = ((Dp) RangesKt.g(new Dp(f4 - fD), RangesKt.k(new Dp(8), new Dp(f4)))).d;
                        }
                        float f5 = f;
                        if (z3) {
                            f2 = 24;
                        } else {
                            float f6 = 24;
                            f2 = ((Dp) RangesKt.g(new Dp(f6 - fD), RangesKt.k(new Dp(16), new Dp(f6)))).d;
                        }
                        float f7 = f2;
                        if (!z3 && fFloatValue > 64.0f) {
                            num = null;
                        }
                        return new ScrollSizes(f3, f5, f7, num, MathHelpersKt.b(BitmapDescriptorFactory.HUE_RED, 4.0f, fB));
                    }
                });
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            final ScrollSizes scrollSizes = (ScrollSizes) ((State) objG).getD();
            SurfaceKt.a(null, null, 0L, 0L, null, scrollSizes.e, ComposableLambdaKt.c(1191172162, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.substitutions.SimilarProductsScreenKt$OriginalProductSection$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2;
                    Composer composer3 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer3.c()) {
                        composer3.j();
                    } else {
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierE = SizeKt.e(companion, 1.0f);
                        composer3.o(1849434622);
                        Object objG2 = composer3.G();
                        if (objG2 == Composer.Companion.f1624a) {
                            objG2 = new au.com.woolworths.shop.lists.ui.shoppinglist.compose.a(27);
                            composer3.A(objG2);
                        }
                        composer3.l();
                        Modifier modifierB = SemanticsModifierKt.b(modifierE, true, (Function1) objG2);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer3, 0);
                        int p = composer3.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                        Modifier modifierD = ComposedModifierKt.d(composer3, modifierB);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer3.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer3.i();
                        if (composer3.getO()) {
                            composer3.K(function0);
                        } else {
                            composer3.e();
                        }
                        Updater.b(composer3, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer3, p, function2);
                        }
                        Updater.b(composer3, modifierD, ComposeUiNode.Companion.d);
                        SimilarProductsScreenKt.e(composer3, 0);
                        boolean z3 = z;
                        AlternativeProductsTargetProductSection alternativeProductsTargetProductSection2 = alternativeProductsTargetProductSection;
                        if (z3) {
                            composer2 = composer3;
                            composer2.o(536309518);
                            SimilarProductsScreenKt.l(alternativeProductsTargetProductSection2.getProduct(), false, z2, new SimilarProductsScreenKt$OriginalProductSection$1$2$1(), ComposableSingletons$SimilarProductsScreenKt.f12466a, composer3, ProductCard.$stable | 24624);
                            composer2.l();
                        } else {
                            composer3.o(535647575);
                            ScrollSizes scrollSizes2 = scrollSizes;
                            composer2 = composer3;
                            TargetProductCardHorizontalUiKt.a(alternativeProductsTargetProductSection2.getProduct(), true, scrollSizes2.f12471a, PaddingKt.g(companion, 16, scrollSizes2.b), true, false, true, null, scrollSizes2.c, scrollSizes2.d, composer2, ProductCard.$stable | 12779952, DilithiumEngine.DilithiumPolyT1PackedBytes);
                            composer2.l();
                        }
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1572864, 31);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.d(alternativeProductsTargetProductSection, scrollState, z, z2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static final void j(AlternativeProductsProductsHeaderSection alternativeProductsProductsHeaderSection, Function1 onInfoClick, Composer composer, int i) {
        int i2;
        long j;
        HeaderBannerType headerBannerType;
        boolean z;
        int i3;
        ?? r3;
        ComposerImpl composerImpl;
        ComposerImpl composerImpl2;
        Intrinsics.h(onInfoClick, "onInfoClick");
        ComposerImpl composerImplV = composer.v(2030822778);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(alternativeProductsProductsHeaderSection) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onInfoClick) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl2 = composerImplV;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 6;
            Modifier modifierG = PaddingKt.g(SizeKt.e(BackgroundKt.b(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), WxTheme.a(composerImplV).a(), RectangleShapeKt.f1779a), 1.0f), 16, f);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(f), Alignment.Companion.k, composerImplV, 54);
            int i4 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            AlternativeProductsTypeTag typeTag = alternativeProductsProductsHeaderSection.getTypeTag();
            AlternativeProductsType swapType = typeTag != null ? typeTag.getSwapType() : null;
            composerImplV.o(930658735);
            if (swapType == AlternativeProductsType.PRICE || swapType == AlternativeProductsType.SPECIALS || swapType == AlternativeProductsType.REWARDS) {
                AlternativeProductsTypeTag typeTag2 = alternativeProductsProductsHeaderSection.getTypeTag();
                Intrinsics.e(typeTag2);
                AlternativeProductsType swapType2 = typeTag2.getSwapType();
                int[] iArr = HeaderBannerKt.WhenMappings.f12468a;
                int i5 = iArr[swapType2.ordinal()];
                if (i5 == 1) {
                    j = AccentColors.b;
                } else if (i5 == 2) {
                    j = Color.k;
                } else if (i5 != 3) {
                    Timber.f27013a.p(new IllegalArgumentException("Unknown header banner type"));
                    j = AccentColors.b;
                } else {
                    j = AccentColors.d;
                }
                long j2 = j;
                PlainText plainText = new PlainText(typeTag2.getText());
                int i6 = iArr[typeTag2.getSwapType().ordinal()];
                if (i6 == 1) {
                    headerBannerType = HeaderBannerType.f;
                } else if (i6 == 2) {
                    headerBannerType = HeaderBannerType.g;
                } else if (i6 != 3) {
                    Timber.f27013a.p(new IllegalArgumentException("Unknown header banner type"));
                    headerBannerType = HeaderBannerType.i;
                } else {
                    headerBannerType = HeaderBannerType.h;
                }
                z = false;
                HeaderBannerKt.a(new HeaderBannerState(plainText, headerBannerType, j2), null, composerImplV, 0);
            } else {
                z = false;
            }
            composerImplV.V(z);
            String title = alternativeProductsProductsHeaderSection.getTitle();
            composerImplV.o(930670321);
            if (title == null) {
                i3 = i2;
                r3 = z;
                composerImpl = composerImplV;
            } else {
                i3 = i2;
                r3 = z;
                TextKt.b(title, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, 0, 0, 65534);
                composerImpl = composerImplV;
            }
            composerImpl.V(r3);
            AlternativeProductsDisclaimer disclaimer = alternativeProductsProductsHeaderSection.getDisclaimer();
            composerImpl.o(930675539);
            if (disclaimer != null) {
                composerImpl.o(1849434622);
                Object objG = composerImpl.G();
                Object obj = Composer.Companion.f1624a;
                if (objG == obj) {
                    objG = InteractionSourceKt.a();
                    composerImpl.A(objG);
                }
                MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objG;
                composerImpl.V(r3);
                composerImpl.o(-1633490746);
                boolean zI = composerImpl.I(disclaimer) | ((i3 & 112) == 32 ? true : r3);
                Object objG2 = composerImpl.G();
                if (zI || objG2 == obj) {
                    objG2 = new d(onInfoClick, disclaimer, r3);
                    composerImpl.A(objG2);
                }
                composerImpl.V(r3);
                IconKt.a(PainterResources_androidKt.a(R.drawable.ic_info_filled, r3, composerImpl), "Info", ClickableKt.b(companion, mutableInteractionSource, null, false, null, null, (Function0) objG2, 28), Color.k, composerImpl, 3120, 0);
            }
            composerImpl.V(r3);
            composerImpl.V(true);
            e(composerImpl, r3);
            composerImpl2 = composerImpl;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.lists.ui.details.ui.compose.b(alternativeProductsProductsHeaderSection, i, 7, onInfoClick);
        }
    }

    public static final void k(ViewSimilarProductsContract.ViewState viewState, boolean z, Function1 function1, Function1 function12, Function0 function0, Function1 function13, ProductClickListener productClickListener, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(904370612);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function12) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(function13) ? 131072 : 65536;
        }
        int i3 = i2 | (composerImplV.I(productClickListener) ? 1048576 : 524288);
        if ((599187 & i3) == 599186 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, Modifier.Companion.d);
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
            if (viewState instanceof ViewSimilarProductsContract.ViewState.Loading) {
                composerImplV.o(-2092218651);
                g(composerImplV, 0);
                composerImplV.V(false);
            } else if (viewState instanceof ViewSimilarProductsContract.ViewState.Content) {
                composerImplV.o(-434177072);
                ViewSimilarProductsContract.ViewState.Content content = (ViewSimilarProductsContract.ViewState.Content) viewState;
                d(content.f12480a.getSections(), function1, function12, content.e, content.f, z, productClickListener, function13, composerImplV, ((i3 >> 3) & 1008) | ((i3 << 12) & 458752) | (3670016 & i3) | ((i3 << 6) & 29360128));
                composerImplV.V(false);
            } else {
                if (!(viewState instanceof ViewSimilarProductsContract.ViewState.Error)) {
                    throw au.com.woolworths.android.onesite.a.w(-2092220517, composerImplV, false);
                }
                composerImplV.o(-2092196998);
                c((ViewSimilarProductsContract.ViewState.Error) viewState, function0, composerImplV, (i3 >> 9) & 112);
                composerImplV.V(false);
            }
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.legacy.compose.productsearch.a(viewState, z, function1, function12, function0, function13, productClickListener, i);
        }
    }

    public static final void l(ProductCard productCard, boolean z, boolean z2, ProductClickListener productClickListener, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        Intrinsics.h(productCard, "productCard");
        Intrinsics.h(productClickListener, "productClickListener");
        ComposerImpl composerImplV = composer.v(-1184304315);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(productCard) : composerImplV.I(productCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(productClickListener) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            long jA = WxTheme.a(composerImplV).a();
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(BackgroundKt.b(companion, jA, rectangleShapeKt$RectangleShape$1), 1.0f);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
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
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier modifierF = PaddingKt.f(companion, 16);
            composerImplV.o(-1633490746);
            int i4 = i2 & 14;
            boolean zI = composerImplV.I(productClickListener) | (i4 == 4 || ((i2 & 8) != 0 && composerImplV.I(productCard)));
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new k(1, productClickListener, productCard);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            ProductCardHorizontalUiKt.a(productCard, true, true, ClickableKt.d(modifierF, false, null, null, (Function0) objG, 7), z2, false, false, null, true, false, false, true, false, false, null, null, null, composableLambdaImpl, composerImplV, i4 | 100663728 | ProductCard.$stable | (57344 & (i2 << 6)), ((i2 << 9) & 29360128) | 48, 128736);
            composerImpl = composerImplV;
            composerImpl.V(true);
            if (z) {
                e(composerImpl, 0);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.redemptionsettings.ui.b(productCard, z, z2, productClickListener, composableLambdaImpl, i);
        }
    }

    public static final void m(final ViewSimilarProductsContract.ViewState viewState, final boolean z, final String str, final String productId, final Function1 onSelectProductClick, final Function1 onInfoClick, final Function1 onRetryClick, final Function1 onSeeMoreClick, final Function0 onCloseClick, final ProductClickListener productClickListener, Composer composer, int i) {
        AlternativeProducts alternativeProducts;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(productId, "productId");
        Intrinsics.h(onSelectProductClick, "onSelectProductClick");
        Intrinsics.h(onInfoClick, "onInfoClick");
        Intrinsics.h(onRetryClick, "onRetryClick");
        Intrinsics.h(onSeeMoreClick, "onSeeMoreClick");
        Intrinsics.h(onCloseClick, "onCloseClick");
        Intrinsics.h(productClickListener, "productClickListener");
        ComposerImpl composerImplV = composer.v(-873139089);
        if (((i | (composerImplV.n(viewState) ? 4 : 2) | (composerImplV.p(z) ? 32 : 16) | (composerImplV.n(str) ? 256 : 128) | (composerImplV.n(productId) ? 2048 : 1024) | (composerImplV.I(onSelectProductClick) ? 16384 : 8192) | (composerImplV.I(onInfoClick) ? 131072 : 65536) | (composerImplV.I(onRetryClick) ? 1048576 : 524288) | (composerImplV.I(onSeeMoreClick) ? 8388608 : 4194304) | (composerImplV.I(onCloseClick) ? 67108864 : 33554432) | (composerImplV.I(productClickListener) ? 536870912 : 268435456)) & 306783379) == 306783378 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ViewSimilarProductsContract.ViewState.Content content = viewState instanceof ViewSimilarProductsContract.ViewState.Content ? (ViewSimilarProductsContract.ViewState.Content) viewState : null;
            final AlternativeProductsDisclaimer disclaimer = (content == null || (alternativeProducts = content.f12480a) == null) ? null : alternativeProducts.getDisclaimer();
            ScaffoldKt.a(SizeKt.c, androidx.compose.material.ScaffoldKt.d(null, composerImplV, 3), ComposableLambdaKt.c(61037236, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.substitutions.SimilarProductsScreenKt$SimilarProductsScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String str2;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ViewSimilarProductsContract.ViewState viewState2 = viewState;
                        ViewSimilarProductsContract.ViewState.Content content2 = viewState2 instanceof ViewSimilarProductsContract.ViewState.Content ? (ViewSimilarProductsContract.ViewState.Content) viewState2 : null;
                        String str3 = str;
                        SimilarProductsScreenKt.o(str3, onCloseClick, null, (content2 == null || (str2 = content2.d) == null) ? str3 : str2, disclaimer, onInfoClick, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0, ToneColors.j, 0L, null, null, ComposableLambdaKt.c(-2004079194, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.substitutions.SimilarProductsScreenKt$SimilarProductsScreen$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        composer2.o(-1633490746);
                        Function1 function1 = onRetryClick;
                        boolean zN = composer2.n(function1);
                        String str2 = productId;
                        boolean zN2 = zN | composer2.n(str2);
                        Object objG = composer2.G();
                        if (zN2 || objG == Composer.Companion.f1624a) {
                            objG = new k(3, function1, str2);
                            composer2.A(objG);
                        }
                        composer2.l();
                        SimilarProductsScreenKt.k(viewState, z, onSelectProductClick, onInfoClick, (Function0) objG, onSeeMoreClick, productClickListener, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 390, 952);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.checkout.ui.summary.promocode.b(viewState, z, str, productId, onSelectProductClick, onInfoClick, onRetryClick, onSeeMoreClick, onCloseClick, productClickListener, i);
        }
    }

    public static final void n(AlternativeProductsProductSection alternativeProductsProductSection, final boolean z, boolean z2, final Function1 onSelectClick, Function1 onInfoClick, ProductClickListener productClickListener, Composer composer, int i) {
        final ProductClickListener productClickListener2 = productClickListener;
        Intrinsics.h(onSelectClick, "onSelectClick");
        Intrinsics.h(onInfoClick, "onInfoClick");
        Intrinsics.h(productClickListener2, "productClickListener");
        ComposerImpl composerImplV = composer.v(1654398775);
        int i2 = i | (composerImplV.I(alternativeProductsProductSection) ? 4 : 2) | (composerImplV.p(z) ? 32 : 16) | (composerImplV.p(z2) ? 256 : 128) | (composerImplV.I(onSelectClick) ? 2048 : 1024) | (composerImplV.I(onInfoClick) ? 16384 : 8192);
        if ((i & 196608) == 0) {
            i2 |= composerImplV.I(productClickListener2) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            AlternativeProductsProductsHeaderSection sectionHeader = alternativeProductsProductSection.getSectionHeader();
            composerImplV.o(739336400);
            if (sectionHeader != null) {
                j(sectionHeader, onInfoClick, composerImplV, (i2 >> 9) & 112);
            }
            composerImplV.V(false);
            boolean z3 = alternativeProductsProductSection.getProducts().size() > 1;
            for (final AlternativeProductCard alternativeProductCard : alternativeProductsProductSection.getProducts()) {
                l(alternativeProductCard.getProduct(), z3, z2, productClickListener2, ComposableLambdaKt.c(1509983032, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.substitutions.SimilarProductsScreenKt$SimilarProductsSection$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            Modifier.Companion companion = Modifier.Companion.d;
                            AlternativeProductCard alternativeProductCard2 = alternativeProductCard;
                            boolean z4 = z;
                            if (z4) {
                                composer2.o(-1582850775);
                                ProductCardButtonsHorizontalKt.b(alternativeProductCard2.getProduct(), null, productClickListener2, ProductCardExtKt.i(alternativeProductCard2.getProduct(), false, false, false, 6), SizeKt.e(companion, 1.0f), false, composer2, ProductCard.$stable | 24624, 32);
                                composer2.l();
                            } else {
                                if (z4) {
                                    throw au.com.woolworths.android.onesite.a.x(composer2, -605250728);
                                }
                                composer2.o(-1582227396);
                                Modifier modifierW = SizeKt.w(companion, 120, BitmapDescriptorFactory.HUE_RED, 2);
                                composer2.o(-1633490746);
                                Object obj3 = onSelectClick;
                                boolean zN = composer2.n(obj3) | composer2.I(alternativeProductCard2);
                                Object objG = composer2.G();
                                if (zN || objG == Composer.Companion.f1624a) {
                                    objG = new k(4, obj3, alternativeProductCard2);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                PrimaryButtonKt.a("Select", (Function0) objG, modifierW, false, false, null, null, null, null, composer2, 390, 1016);
                                composer2.l();
                            }
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImplV, ((i2 >> 6) & 7168) | ProductCard.$stable | 24576 | (i2 & 896));
                productClickListener2 = productClickListener;
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.aem.components.ui.downloadableAsset.a(alternativeProductsProductSection, z, z2, onSelectClick, onInfoClick, productClickListener, i);
        }
    }

    public static final void o(String str, final Function0 onCloseClick, Modifier modifier, String str2, final AlternativeProductsDisclaimer alternativeProductsDisclaimer, final Function1 onInfoClick, Composer composer, int i) {
        ComposerImpl composerImpl;
        Modifier modifier2;
        Intrinsics.h(onCloseClick, "onCloseClick");
        Intrinsics.h(onInfoClick, "onInfoClick");
        ComposerImpl composerImplV = composer.v(1224535228);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.I(onCloseClick) ? 32 : 16) | KyberEngine.KyberPolyBytes | (composerImplV.n(str2) ? 2048 : 1024) | (composerImplV.I(alternativeProductsDisclaimer) ? 16384 : 8192) | (composerImplV.I(onInfoClick) ? 131072 : 65536);
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            composerImpl = composerImplV;
            TopNavBarKt.b(str, companion, null, str2, 0L, 0L, 0L, null, 0, ComposableLambdaKt.c(1388160461, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.substitutions.SimilarProductsScreenKt$Toolbar$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ImageVector imageVectorA = CloseKt.a();
                        String strC = StringResources_androidKt.c(composer2, R.string.cancel);
                        composer2.o(5004770);
                        Function0 function0 = onCloseClick;
                        boolean zN = composer2.n(function0);
                        Object objG = composer2.G();
                        if (zN || objG == Composer.Companion.f1624a) {
                            objG = new au.com.woolworths.shop.lists.ui.magicmatch.ui.c(7, function0);
                            composer2.A(objG);
                        }
                        composer2.l();
                        IconButtonKt.c(imageVectorA, strC, (Function0) objG, null, false, 0L, composer2, 0, 56);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(-1935349017, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.substitutions.SimilarProductsScreenKt$Toolbar$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    RowScope TopNavBar = (RowScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(TopNavBar, "$this$TopNavBar");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        AlternativeProductsDisclaimer alternativeProductsDisclaimer2 = alternativeProductsDisclaimer;
                        if (alternativeProductsDisclaimer2 != null) {
                            Modifier modifierJ = PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, 11);
                            composer2.o(1849434622);
                            Object objG = composer2.G();
                            Object obj4 = Composer.Companion.f1624a;
                            if (objG == obj4) {
                                objG = InteractionSourceKt.a();
                                composer2.A(objG);
                            }
                            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objG;
                            Function1 function1 = onInfoClick;
                            boolean zC = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.C(-1633490746, composer2, function1) | composer2.I(alternativeProductsDisclaimer2);
                            Object objG2 = composer2.G();
                            if (zC || objG2 == obj4) {
                                objG2 = new d(function1, alternativeProductsDisclaimer2, 1);
                                composer2.A(objG2);
                            }
                            composer2.l();
                            IconKt.a(PainterResources_androidKt.a(R.drawable.ic_info_filled_primary, 0, composer2), "Info", ClickableKt.b(modifierJ, mutableInteractionSource, null, false, null, null, (Function0) objG2, 28), WxTheme.a(composer2).h(), composer2, 48, 0);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, (i2 & 14) | 905969712 | (i2 & 7168), 6, 244);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.productsearch.c(str, onCloseClick, modifier2, str2, alternativeProductsDisclaimer, onInfoClick, i);
        }
    }
}
