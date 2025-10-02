package au.com.woolworths.shop.cart.ui.cart;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.MoreVertKt;
import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material.pullrefresh.PullRefreshStateKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.modules.couponbanner.CouponBannerTermsAndConditions;
import au.com.woolworths.android.onesite.modules.couponbanner.EverydayMarketCouponBannerColorTheme;
import au.com.woolworths.android.onesite.modules.couponbanner.EverydayMarketCouponBannerData;
import au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessage;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiDataExtKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.banners.imagetextbanner.ImageTextBannerUiKt;
import au.com.woolworths.feature.shop.banners.imagetextbanner.data.ImageTextBanner;
import au.com.woolworths.foundation.shop.cart.data.model.Cart;
import au.com.woolworths.foundation.shop.cart.data.model.CartBanner;
import au.com.woolworths.foundation.shop.cart.data.model.CartBannerType;
import au.com.woolworths.foundation.shop.cart.data.model.CartFooterData;
import au.com.woolworths.foundation.shop.cart.data.model.CartImageTextBanner;
import au.com.woolworths.foundation.shop.cart.data.model.CartInlineMessage;
import au.com.woolworths.foundation.shop.cart.data.model.CartMarketplaceSection;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductCard;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductCategory;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductFeed;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductSection;
import au.com.woolworths.foundation.shop.cart.data.model.CartPromotionInfo;
import au.com.woolworths.foundation.shop.cart.data.model.CartPromotionSection;
import au.com.woolworths.foundation.shop.cart.data.model.CartRewardsInfo;
import au.com.woolworths.foundation.shop.cart.data.model.CartSection;
import au.com.woolworths.foundation.shop.cart.data.model.CartShippingPromotionBanner;
import au.com.woolworths.foundation.shop.cart.data.model.EverydayMarketCouponBannerDataSection;
import au.com.woolworths.foundation.shop.cart.data.model.MarketplaceCartTracker;
import au.com.woolworths.foundation.shop.cart.data.model.MarketplaceSeller;
import au.com.woolworths.foundation.shop.cart.data.model.SectionHeader;
import au.com.woolworths.promotion.banner.ui.PromotionBanner;
import au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt;
import au.com.woolworths.sdui.legacy.banner.inlinemessage.InlineMessageUiKt;
import au.com.woolworths.shared.ui.compose.couponbanner.EverydayMarketCouponBannerKt;
import au.com.woolworths.shop.cart.ui.cart.CartContract;
import au.com.woolworths.shop.cart.ui.shared.CartFooterKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import me.onebone.toolbar.CollapsingToolbarKt;
import me.onebone.toolbar.CollapsingToolbarScaffoldKt;
import me.onebone.toolbar.CollapsingToolbarScaffoldScope;
import me.onebone.toolbar.CollapsingToolbarScaffoldState;
import me.onebone.toolbar.CollapsingToolbarScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "collapsed", "shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CartScreenKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f10493a;
    public static final float b = 16;
    public static final float c;
    public static final Timber.Forest d;

    static {
        float f = 56;
        f10493a = f;
        c = f;
        Timber.Forest forest = Timber.f27013a;
        forest.s("CartScreen");
        d = forest;
    }

    public static final void a(final boolean z, final CartViewModel viewModel, final Function0 onNavigateUp, final Function1 onNavigateToQuickAdd, Composer composer, int i) {
        boolean z2;
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onNavigateToQuickAdd, "onNavigateToQuickAdd");
        ComposerImpl composerImplV = composer.v(270767200);
        if (((i | (composerImplV.p(z) ? 4 : 2) | (composerImplV.I(viewModel) ? 32 : 16) | (composerImplV.I(onNavigateUp) ? 256 : 128) | (composerImplV.I(onNavigateToQuickAdd) ? 2048 : 1024)) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final MutableState mutableStateA = FlowExtKt.a(viewModel.o, composerImplV);
            final CartFullErrorMessage cartFullErrorMessage = ((CartContract.ViewState) mutableStateA.getD()).d;
            Cart cart = ((CartContract.ViewState) mutableStateA.getD()).c;
            final boolean z3 = true;
            if ((cart != null ? cart.e : null) != null) {
                z2 = true;
            } else {
                z2 = true;
                z3 = false;
            }
            final CollapsingToolbarScaffoldState collapsingToolbarScaffoldStateB = CollapsingToolbarScaffoldKt.b(CollapsingToolbarKt.b(cartFullErrorMessage != null ? 0 : Integer.MAX_VALUE, 0, composerImplV), composerImplV, 0);
            if (!z) {
                z2 = ((CartContract.ViewState) mutableStateA.getD()).f10490a;
            } else if (!((CartContract.ViewState) mutableStateA.getD()).b && z3) {
                z2 = false;
            }
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(viewModel);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new g(viewModel, 1);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            final PullRefreshState pullRefreshStateA = PullRefreshStateKt.a(z2, (Function0) objG, composerImplV, 0);
            if (cartFullErrorMessage != null) {
                composerImplV.o(478154780);
                ScaffoldKt.a(SizeKt.c, null, ComposableLambdaKt.c(-885159936, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartScreenKt$CartScreen$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            String strC = StringResources_androidKt.c(composer2, R.string.cart);
                            boolean z4 = ((CartContract.ViewState) mutableStateA.getD()).c != null;
                            composer2.o(5004770);
                            CartViewModel cartViewModel = viewModel;
                            boolean zI2 = composer2.I(cartViewModel);
                            Object objG2 = composer2.G();
                            if (zI2 || objG2 == Composer.Companion.f1624a) {
                                objG2 = new g(cartViewModel, 2);
                                composer2.A(objG2);
                            }
                            composer2.l();
                            CartScreenKt.c(onNavigateUp, z4, strC, (Function0) objG2, composer2, 0, 0);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), null, null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(-2126989746, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartScreenKt$CartScreen$2
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        PaddingValues paddings = (PaddingValues) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Intrinsics.h(paddings, "paddings");
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= composer2.n(paddings) ? 4 : 2;
                        }
                        if ((iIntValue & 19) == 18 && composer2.c()) {
                            composer2.j();
                        } else {
                            PullRefreshState pullRefreshState = pullRefreshStateA;
                            Modifier.Companion companion = Modifier.Companion.d;
                            Modifier modifierX0 = PullRefreshKt.a(companion, pullRefreshState, true).x0(SizeKt.c);
                            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                            int p = composer2.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                            Modifier modifierD = ComposedModifierKt.d(composer2, modifierX0);
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
                            Modifier modifierA = TestTagKt.a(PaddingKt.e(companion, paddings), "cart error state");
                            composer2.o(5004770);
                            CartViewModel cartViewModel = viewModel;
                            boolean zI2 = composer2.I(cartViewModel);
                            Object objG2 = composer2.G();
                            Object obj4 = Composer.Companion.f1624a;
                            if (zI2 || objG2 == obj4) {
                                objG2 = new g(cartViewModel, 3);
                                composer2.A(objG2);
                            }
                            Function0 function02 = (Function0) objG2;
                            composer2.l();
                            composer2.o(5004770);
                            boolean zI3 = composer2.I(cartViewModel);
                            Object objG3 = composer2.G();
                            if (zI3 || objG3 == obj4) {
                                objG3 = new g(cartViewModel, 4);
                                composer2.A(objG3);
                            }
                            composer2.l();
                            CartErrorScreenKt.a(cartFullErrorMessage, modifierA, function02, (Function0) objG3, composer2, 0);
                            PullRefreshIndicatorKt.a(((CartContract.ViewState) mutableStateA.getD()).f10490a, pullRefreshStateA, BoxScopeInstance.f944a.g(companion, Alignment.Companion.b), 0L, 0L, composer2, 64, 56);
                            composer2.f();
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImplV, 390, 1018);
                composerImplV = composerImplV;
                composerImplV.V(false);
            } else {
                composerImplV.o(479808661);
                CollapsingToolbarScaffoldKt.a(WindowInsetsPadding_androidKt.a(SizeKt.e(Modifier.Companion.d, 1.0f)), collapsingToolbarScaffoldStateB, false, null, ComposableLambdaKt.c(494640214, new Function3<CollapsingToolbarScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartScreenKt$CartScreen$3
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        CollapsingToolbarScope CollapsingToolbarScaffold = (CollapsingToolbarScope) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Intrinsics.h(CollapsingToolbarScaffold, "$this$CollapsingToolbarScaffold");
                        BoxKt.a(SizeKt.c(SizeKt.g(WindowInsetsPadding_androidKt.b(Modifier.Companion.d), 144), 1.0f), composer2, 0);
                        MutableState mutableState = mutableStateA;
                        boolean z4 = ((CartContract.ViewState) mutableState.getD()).c != null;
                        composer2.o(5004770);
                        CartViewModel cartViewModel = viewModel;
                        boolean zI2 = composer2.I(cartViewModel);
                        Object objG2 = composer2.G();
                        if (zI2 || objG2 == Composer.Companion.f1624a) {
                            objG2 = new g(cartViewModel, 5);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        CartScreenKt.c(onNavigateUp, z4, null, (Function0) objG2, composer2, 0, 4);
                        if (((CartContract.ViewState) mutableState.getD()).c != null) {
                            String strC = StringResources_androidKt.c(composer2, R.string.cart);
                            Cart cart2 = ((CartContract.ViewState) mutableState.getD()).c;
                            CartScreenKt.b(CollapsingToolbarScaffold, collapsingToolbarScaffoldStateB, strC, cart2 != null ? cart2.b.d : null, composer2, iIntValue & 14);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), ComposableLambdaKt.c(355049217, new Function3<CollapsingToolbarScaffoldScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartScreenKt$CartScreen$4
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        MutableState mutableState;
                        boolean z4;
                        CollapsingToolbarScaffoldScope CollapsingToolbarScaffold = (CollapsingToolbarScaffoldScope) obj;
                        Composer composer2 = (Composer) obj2;
                        ((Number) obj3).intValue();
                        Intrinsics.h(CollapsingToolbarScaffold, "$this$CollapsingToolbarScaffold");
                        final MutableState mutableState2 = mutableStateA;
                        Cart cart2 = ((CartContract.ViewState) mutableState2.getD()).c;
                        final List list = cart2 != null ? cart2.d : EmptyList.d;
                        boolean z5 = collapsingToolbarScaffoldStateB.f24914a.j() >= 1.0f;
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierA = PullRefreshKt.a(companion, pullRefreshStateA, z5);
                        FillElement fillElement = SizeKt.c;
                        Modifier modifierX0 = modifierA.x0(fillElement);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierX0);
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
                        Modifier modifierA2 = TestTagKt.a(BackgroundKt.b(fillElement, ToneColors.j, RectangleShapeKt.f1779a), "cart product list");
                        composer2.o(-1224400529);
                        boolean zN = composer2.n(mutableState2) | composer2.I(list);
                        final boolean z6 = z;
                        boolean zP = zN | composer2.p(z6);
                        final CartViewModel cartViewModel = viewModel;
                        boolean zI2 = zP | composer2.I(cartViewModel);
                        final Function1 function1 = onNavigateToQuickAdd;
                        boolean zN2 = zI2 | composer2.n(function1);
                        Object objG2 = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (zN2 || objG2 == composer$Companion$Empty$1) {
                            Function1 function12 = new Function1() { // from class: au.com.woolworths.shop.cart.ui.cart.q
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) throws Throwable {
                                    MutableState mutableState3;
                                    Throwable th;
                                    int i2;
                                    final ArrayList arrayList;
                                    final Map map;
                                    MutableState mutableState4;
                                    Function1 function13;
                                    final CartRewardsInfo cartRewardsInfo;
                                    q qVar = this;
                                    LazyListScope LazyColumn = (LazyListScope) obj4;
                                    Intrinsics.h(LazyColumn, "$this$LazyColumn");
                                    MutableState mutableState5 = mutableState2;
                                    Cart cart3 = ((CartContract.ViewState) mutableState5.getD()).c;
                                    int i3 = 3;
                                    Throwable th2 = null;
                                    boolean z7 = true;
                                    if (cart3 != null && (cartRewardsInfo = cart3.c) != null) {
                                        LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartScreenKt$CartScreen$4$1$1$1$1$1
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                LazyItemScope item = (LazyItemScope) obj5;
                                                Composer composer3 = (Composer) obj6;
                                                int iIntValue = ((Number) obj7).intValue();
                                                Intrinsics.h(item, "$this$item");
                                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                                    composer3.j();
                                                } else {
                                                    DividerKt.a(BitmapDescriptorFactory.HUE_RED, KyberEngine.KyberPolyBytes, 3, 0L, composer3, null);
                                                    CartRewardsHeaderKt.a(cartRewardsInfo, composer3, 0);
                                                }
                                                return Unit.f24250a;
                                            }
                                        }, true, 647780121), 3);
                                    }
                                    final Ref.IntRef intRef = new Ref.IntRef();
                                    final List list2 = list;
                                    final int i4 = 0;
                                    for (Object obj5 : list2) {
                                        int i5 = i4 + 1;
                                        if (i4 < 0) {
                                            Throwable th3 = th2;
                                            CollectionsKt.z0();
                                            throw th3;
                                        }
                                        CartSection cartSection = (CartSection) obj5;
                                        boolean z8 = cartSection instanceof CartProductSection;
                                        final boolean z9 = z6;
                                        final CartViewModel viewModel2 = cartViewModel;
                                        final Function1 onNavigateToQuickAdd2 = function1;
                                        if (z8) {
                                            CartProductSection cartProductSection = (CartProductSection) cartSection;
                                            final Map map2 = ((CartContract.ViewState) mutableState5.getD()).e;
                                            Intrinsics.h(viewModel2, "viewModel");
                                            Intrinsics.h(onNavigateToQuickAdd2, "onNavigateToQuickAdd");
                                            final String str = cartProductSection.f8685a;
                                            if (str != null) {
                                                LazyListScope.i(LazyColumn, "cart_section_title_".concat(str), null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartProductSectionKt$cartProductSectionUI$1$1
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                        LazyItemScope item = (LazyItemScope) obj6;
                                                        Composer composer3 = (Composer) obj7;
                                                        int iIntValue = ((Number) obj8).intValue();
                                                        Intrinsics.h(item, "$this$item");
                                                        if ((iIntValue & 17) == 16 && composer3.c()) {
                                                            composer3.j();
                                                        } else {
                                                            TextKt.b(str, PaddingKt.g(Modifier.Companion.d, 16, 12), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer3).s, composer3, 0, 0, 65532);
                                                        }
                                                        return Unit.f24250a;
                                                    }
                                                }, z7, 791995695), 2);
                                            }
                                            final SectionHeader sectionHeader = cartProductSection.b;
                                            if (sectionHeader != null) {
                                                LazyListScope.i(LazyColumn, "cart_section_header_" + sectionHeader, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartProductSectionKt$cartProductSectionUI$2$1
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                        LazyItemScope item = (LazyItemScope) obj6;
                                                        Composer composer3 = (Composer) obj7;
                                                        int iIntValue = ((Number) obj8).intValue();
                                                        Intrinsics.h(item, "$this$item");
                                                        if ((iIntValue & 17) == 16 && composer3.c()) {
                                                            composer3.j();
                                                        } else {
                                                            SpacerKt.a(composer3, SizeKt.g(Modifier.Companion.d, 12));
                                                            SectionHeader sectionHeader2 = sectionHeader;
                                                            String str2 = sectionHeader2.f8699a;
                                                            String str3 = sectionHeader2.b;
                                                            composer3.o(-1633490746);
                                                            CartViewModel cartViewModel2 = viewModel2;
                                                            boolean zI3 = composer3.I(cartViewModel2) | composer3.I(sectionHeader2);
                                                            Object objG3 = composer3.G();
                                                            if (zI3 || objG3 == Composer.Companion.f1624a) {
                                                                objG3 = new f(cartViewModel2, sectionHeader2, 1);
                                                                composer3.A(objG3);
                                                            }
                                                            composer3.l();
                                                            CartSectionHeaderLargeKt.a(str2, str3, (Function0) objG3, composer3, 0);
                                                        }
                                                        return Unit.f24250a;
                                                    }
                                                }, z7, 1686005875), 2);
                                            }
                                            ArrayList arrayList2 = cartProductSection.c;
                                            final ArrayList arrayList3 = new ArrayList();
                                            for (Object obj6 : arrayList2) {
                                                Double d2 = (Double) map2.get((CartProductFeed) obj6);
                                                if (d2 == null || d2.doubleValue() > 0.0d) {
                                                    arrayList3.add(obj6);
                                                }
                                            }
                                            LazyColumn.b(arrayList3.size(), null, new Function1<Integer, Object>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartProductSectionKt$cartProductSectionUI$$inlined$itemsIndexed$default$2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj7) {
                                                    arrayList3.get(((Number) obj7).intValue());
                                                    return null;
                                                }
                                            }, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartProductSectionKt$cartProductSectionUI$$inlined$itemsIndexed$default$3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(4);
                                                }

                                                @Override // kotlin.jvm.functions.Function4
                                                public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                                                    int i6;
                                                    LazyItemScope lazyItemScope = (LazyItemScope) obj7;
                                                    int iIntValue = ((Number) obj8).intValue();
                                                    Composer composer3 = (Composer) obj9;
                                                    int iIntValue2 = ((Number) obj10).intValue();
                                                    if ((iIntValue2 & 6) == 0) {
                                                        i6 = (composer3.n(lazyItemScope) ? 4 : 2) | iIntValue2;
                                                    } else {
                                                        i6 = iIntValue2;
                                                    }
                                                    if ((iIntValue2 & 48) == 0) {
                                                        i6 |= composer3.r(iIntValue) ? 32 : 16;
                                                    }
                                                    if (composer3.z(i6 & 1, (i6 & 147) != 146)) {
                                                        CartProductFeed cartProductFeed = (CartProductFeed) arrayList3.get(iIntValue);
                                                        composer3.o(2015635611);
                                                        if (cartProductFeed instanceof CartProductCard) {
                                                            composer3.o(2015669028);
                                                            CartProductKt.a(z9, (CartProductCard) cartProductFeed, (Double) map2.get(cartProductFeed), viewModel2, onNavigateToQuickAdd2, composer3, 0, 0);
                                                            DividerKt.a(BitmapDescriptorFactory.HUE_RED, KyberEngine.KyberPolyBytes, 3, 0L, composer3, null);
                                                            composer3.l();
                                                        } else {
                                                            if (!(cartProductFeed instanceof CartProductCategory)) {
                                                                throw au.com.woolworths.android.onesite.a.x(composer3, 619209832);
                                                            }
                                                            composer3.o(2016134059);
                                                            if (z9) {
                                                                ArrayList arrayList4 = arrayList3;
                                                                if (CollectionsKt.I(arrayList4) == iIntValue || (arrayList4.get(iIntValue + 1) instanceof CartProductCategory)) {
                                                                    composer3.l();
                                                                    composer3.l();
                                                                }
                                                            }
                                                            float f = 16;
                                                            TextKt.b(((CartProductCategory) cartProductFeed).f8680a, PaddingKt.i(Modifier.Companion.d, f, 12, f, 4), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer3).r, composer3, 0, 0, 65532);
                                                            composer3 = composer3;
                                                            composer3.l();
                                                        }
                                                        composer3.l();
                                                    } else {
                                                        composer3.j();
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, z7, -1091073711));
                                            mutableState3 = mutableState5;
                                            th = null;
                                        } else {
                                            final Function1 onNavigateToQuickAdd3 = onNavigateToQuickAdd2;
                                            if (cartSection instanceof CartMarketplaceSection) {
                                                final CartMarketplaceSection cartMarketplaceSection = (CartMarketplaceSection) cartSection;
                                                Map map3 = ((CartContract.ViewState) mutableState5.getD()).e;
                                                Intrinsics.h(viewModel2, "viewModel");
                                                Intrinsics.h(onNavigateToQuickAdd3, "onNavigateToQuickAdd");
                                                LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartMarketplaceProductSectionKt$cartMarketplaceSectionUI$1
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                        LazyItemScope item = (LazyItemScope) obj7;
                                                        Composer composer3 = (Composer) obj8;
                                                        int iIntValue = ((Number) obj9).intValue();
                                                        Intrinsics.h(item, "$this$item");
                                                        if ((iIntValue & 17) == 16 && composer3.c()) {
                                                            composer3.j();
                                                        } else {
                                                            SpacerKt.a(composer3, SizeKt.g(Modifier.Companion.d, 12));
                                                            CartMarketplaceSection cartMarketplaceSection2 = cartMarketplaceSection;
                                                            SectionHeader sectionHeader2 = cartMarketplaceSection2.f8678a;
                                                            composer3.o(-324037943);
                                                            Object obj10 = Composer.Companion.f1624a;
                                                            CartViewModel cartViewModel2 = viewModel2;
                                                            if (sectionHeader2 != null) {
                                                                String str2 = sectionHeader2.f8699a;
                                                                String str3 = sectionHeader2.b;
                                                                composer3.o(-1633490746);
                                                                boolean zI3 = composer3.I(cartViewModel2) | composer3.I(sectionHeader2);
                                                                Object objG3 = composer3.G();
                                                                if (zI3 || objG3 == obj10) {
                                                                    objG3 = new f(cartViewModel2, sectionHeader2, 0);
                                                                    composer3.A(objG3);
                                                                }
                                                                composer3.l();
                                                                CartSectionHeaderLargeKt.a(str2, str3, (Function0) objG3, composer3, 0);
                                                            }
                                                            composer3.l();
                                                            MarketplaceCartTracker marketplaceCartTracker = cartMarketplaceSection2.b;
                                                            composer3.o(-324027585);
                                                            if (marketplaceCartTracker != null) {
                                                                DividerKt.a(BitmapDescriptorFactory.HUE_RED, KyberEngine.KyberPolyBytes, 3, 0L, composer3, null);
                                                                String str4 = marketplaceCartTracker.f8694a;
                                                                float f = (float) marketplaceCartTracker.b;
                                                                String str5 = marketplaceCartTracker.c;
                                                                composer3.o(5004770);
                                                                boolean zI4 = composer3.I(cartViewModel2);
                                                                Object objG4 = composer3.G();
                                                                if (zI4 || objG4 == obj10) {
                                                                    objG4 = new g(cartViewModel2, 0);
                                                                    composer3.A(objG4);
                                                                }
                                                                composer3.l();
                                                                CartMarketplaceTrackerKt.a(str4, f, str5, false, (Function0) objG4, composer3, 0, 8);
                                                            }
                                                            composer3.l();
                                                            Object obj11 = cartMarketplaceSection2.c;
                                                            if (obj11 != null) {
                                                                DividerKt.a(BitmapDescriptorFactory.HUE_RED, KyberEngine.KyberPolyBytes, 3, 0L, composer3, null);
                                                                composer3.o(-324012030);
                                                                if (!(obj11 instanceof CartShippingPromotionBanner)) {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                PromotionBanner promotionBanner = ((CartShippingPromotionBanner) obj11).f8691a;
                                                                composer3.o(-1633490746);
                                                                boolean zI5 = composer3.I(cartViewModel2) | composer3.I(obj11);
                                                                Object objG5 = composer3.G();
                                                                if (zI5 || objG5 == obj10) {
                                                                    objG5 = new au.com.woolworths.sdui.common.alert.a(17, cartViewModel2, obj11);
                                                                    composer3.A(objG5);
                                                                }
                                                                composer3.l();
                                                                CartPromotionBannerKt.a(promotionBanner, (Function0) objG5, composer3, 0);
                                                                composer3.l();
                                                            }
                                                        }
                                                        return Unit.f24250a;
                                                    }
                                                }, z7, 2109157672), 3);
                                                for (final MarketplaceSeller marketplaceSeller : cartMarketplaceSection.d) {
                                                    Iterable iterable = (Iterable) marketplaceSeller.c;
                                                    ArrayList arrayList4 = new ArrayList();
                                                    for (Object obj7 : iterable) {
                                                        if (obj7 instanceof CartProductCard) {
                                                            arrayList4.add(obj7);
                                                        }
                                                    }
                                                    if (z9) {
                                                        arrayList = new ArrayList();
                                                        Iterator it = arrayList4.iterator();
                                                        while (it.hasNext()) {
                                                            Object next = it.next();
                                                            Double d3 = (Double) map3.get((CartProductCard) next);
                                                            if (d3 == null || d3.doubleValue() > 0.0d) {
                                                                arrayList.add(next);
                                                            }
                                                        }
                                                        if (arrayList.isEmpty()) {
                                                            arrayList = null;
                                                        }
                                                    } else {
                                                        arrayList = arrayList4;
                                                    }
                                                    if (arrayList == null) {
                                                        mutableState4 = mutableState5;
                                                        map = map3;
                                                        function13 = onNavigateToQuickAdd3;
                                                    } else {
                                                        LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartMarketplaceProductSectionKt$cartMarketplaceSectionUI$2$1
                                                            @Override // kotlin.jvm.functions.Function3
                                                            public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                                LazyItemScope item = (LazyItemScope) obj8;
                                                                Composer composer3 = (Composer) obj9;
                                                                int iIntValue = ((Number) obj10).intValue();
                                                                Intrinsics.h(item, "$this$item");
                                                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                                                    composer3.j();
                                                                } else {
                                                                    DividerKt.a(BitmapDescriptorFactory.HUE_RED, KyberEngine.KyberPolyBytes, 3, 0L, composer3, null);
                                                                    MarketplaceSeller marketplaceSeller2 = marketplaceSeller;
                                                                    CartMarketplaceSellerKt.a(marketplaceSeller2.f8696a, marketplaceSeller2.b, composer3, 0);
                                                                }
                                                                return Unit.f24250a;
                                                            }
                                                        }, true, -392863051), 3);
                                                        int size = arrayList.size();
                                                        Function1<Integer, Object> function14 = new Function1<Integer, Object>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartMarketplaceProductSectionKt$cartMarketplaceSectionUI$lambda$5$$inlined$items$default$3
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj8) {
                                                                arrayList.get(((Number) obj8).intValue());
                                                                return null;
                                                            }
                                                        };
                                                        final Function1 function15 = onNavigateToQuickAdd3;
                                                        map = map3;
                                                        final CartViewModel cartViewModel2 = viewModel2;
                                                        final ArrayList arrayList5 = arrayList;
                                                        Function4<LazyItemScope, Integer, Composer, Integer, Unit> function4 = new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartMarketplaceProductSectionKt$cartMarketplaceSectionUI$lambda$5$$inlined$items$default$4
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(4);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function4
                                                            public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                                                                int i6;
                                                                LazyItemScope lazyItemScope = (LazyItemScope) obj8;
                                                                int iIntValue = ((Number) obj9).intValue();
                                                                Composer composer3 = (Composer) obj10;
                                                                int iIntValue2 = ((Number) obj11).intValue();
                                                                if ((iIntValue2 & 6) == 0) {
                                                                    i6 = (composer3.n(lazyItemScope) ? 4 : 2) | iIntValue2;
                                                                } else {
                                                                    i6 = iIntValue2;
                                                                }
                                                                if ((iIntValue2 & 48) == 0) {
                                                                    i6 |= composer3.r(iIntValue) ? 32 : 16;
                                                                }
                                                                if (composer3.z(i6 & 1, (i6 & 147) != 146)) {
                                                                    CartProductCard cartProductCard = (CartProductCard) arrayList5.get(iIntValue);
                                                                    composer3.o(-1789080541);
                                                                    DividerKt.a(BitmapDescriptorFactory.HUE_RED, KyberEngine.KyberPolyBytes, 3, 0L, composer3, null);
                                                                    CartProductKt.a(z9, cartProductCard, (Double) map.get(cartProductCard), cartViewModel2, function15, composer3, 0, 0);
                                                                    composer3.l();
                                                                } else {
                                                                    composer3.j();
                                                                }
                                                                return Unit.f24250a;
                                                            }
                                                        };
                                                        mutableState4 = mutableState5;
                                                        viewModel2 = cartViewModel2;
                                                        function13 = function15;
                                                        LazyColumn.b(size, null, function14, new ComposableLambdaImpl(function4, true, -632812321));
                                                    }
                                                    onNavigateToQuickAdd3 = function13;
                                                    map3 = map;
                                                    mutableState5 = mutableState4;
                                                    z7 = true;
                                                }
                                                mutableState3 = mutableState5;
                                                th = null;
                                            } else {
                                                mutableState3 = mutableState5;
                                                if (cartSection instanceof CartInlineMessage) {
                                                    final CartInlineMessage cartInlineMessage = (CartInlineMessage) cartSection;
                                                    LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartScreenKt$CartScreen$4$1$1$1$2$1
                                                        @Override // kotlin.jvm.functions.Function3
                                                        public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                            LazyItemScope item = (LazyItemScope) obj8;
                                                            Composer composer3 = (Composer) obj9;
                                                            int iIntValue = ((Number) obj10).intValue();
                                                            Intrinsics.h(item, "$this$item");
                                                            if ((iIntValue & 17) == 16 && composer3.c()) {
                                                                composer3.j();
                                                            } else {
                                                                composer3.o(-548627667);
                                                                if (i4 > 0) {
                                                                    SpacerKt.a(composer3, SizeKt.g(Modifier.Companion.d, 1));
                                                                }
                                                                composer3.l();
                                                                CartInlineMessage cartInlineMessage2 = cartInlineMessage;
                                                                InlineMessageUiKt.a(new InlineMessage(InsetBannerTypeApiDataExtKt.toInlineErrorType(cartInlineMessage2.f8677a), new PlainText(cartInlineMessage2.b), null), null, composer3, 0, 2);
                                                            }
                                                            return Unit.f24250a;
                                                        }
                                                    }, true, -1792747674), 3);
                                                    i2 = 3;
                                                    th = null;
                                                    z7 = true;
                                                } else if (cartSection instanceof CartPromotionSection) {
                                                    final CartPromotionSection cartPromotionSection = (CartPromotionSection) cartSection;
                                                    final Map map4 = ((CartContract.ViewState) mutableState3.getD()).e;
                                                    Intrinsics.h(viewModel2, "viewModel");
                                                    Intrinsics.h(onNavigateToQuickAdd3, "onNavigateToQuickAdd");
                                                    LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartPromotionProductSectionKt$cartPromotionSectionUi$1
                                                        @Override // kotlin.jvm.functions.Function3
                                                        public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                            LazyItemScope item = (LazyItemScope) obj8;
                                                            Composer composer3 = (Composer) obj9;
                                                            int iIntValue = ((Number) obj10).intValue();
                                                            Intrinsics.h(item, "$this$item");
                                                            if ((iIntValue & 17) == 16 && composer3.c()) {
                                                                composer3.j();
                                                            } else {
                                                                final CartPromotionSection cartPromotionSection2 = cartPromotionSection;
                                                                String str2 = cartPromotionSection2.b;
                                                                composer3.o(1243898045);
                                                                if (str2 != null) {
                                                                    Modifier.Companion companion2 = Modifier.Companion.d;
                                                                    SpacerKt.a(composer3, SizeKt.g(companion2, 8));
                                                                    TextKt.b(str2, PaddingKt.g(companion2, 16, 12), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer3).s, composer3, 0, 0, 65532);
                                                                    composer3 = composer3;
                                                                }
                                                                composer3.l();
                                                                CartPromotionInfo cartPromotionInfo = cartPromotionSection2.d;
                                                                composer3.o(-1633490746);
                                                                final CartViewModel cartViewModel3 = viewModel2;
                                                                boolean zI3 = composer3.I(cartViewModel3) | composer3.I(cartPromotionSection2);
                                                                Object objG3 = composer3.G();
                                                                Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                                                                if (zI3 || objG3 == composer$Companion$Empty$12) {
                                                                    final int i6 = 0;
                                                                    objG3 = new Function0() { // from class: au.com.woolworths.shop.cart.ui.cart.o
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Object invoke() {
                                                                            switch (i6) {
                                                                                case 0:
                                                                                    cartViewModel3.q3(cartPromotionSection2.d);
                                                                                    break;
                                                                                default:
                                                                                    cartViewModel3.i6(cartPromotionSection2.d);
                                                                                    break;
                                                                            }
                                                                            return Unit.f24250a;
                                                                        }
                                                                    };
                                                                    composer3.A(objG3);
                                                                }
                                                                Function0 function02 = (Function0) objG3;
                                                                composer3.l();
                                                                composer3.o(-1633490746);
                                                                boolean zI4 = composer3.I(cartViewModel3) | composer3.I(cartPromotionSection2);
                                                                Object objG4 = composer3.G();
                                                                if (zI4 || objG4 == composer$Companion$Empty$12) {
                                                                    final int i7 = 1;
                                                                    objG4 = new Function0() { // from class: au.com.woolworths.shop.cart.ui.cart.o
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Object invoke() {
                                                                            switch (i7) {
                                                                                case 0:
                                                                                    cartViewModel3.q3(cartPromotionSection2.d);
                                                                                    break;
                                                                                default:
                                                                                    cartViewModel3.i6(cartPromotionSection2.d);
                                                                                    break;
                                                                            }
                                                                            return Unit.f24250a;
                                                                        }
                                                                    };
                                                                    composer3.A(objG4);
                                                                }
                                                                composer3.l();
                                                                CartItemPromotionInfoKt.a(cartPromotionInfo, function02, (Function0) objG4, composer3, 0);
                                                            }
                                                            return Unit.f24250a;
                                                        }
                                                    }, true, 1668331632), 3);
                                                    ArrayList arrayList6 = cartPromotionSection.c;
                                                    final ArrayList arrayList7 = new ArrayList();
                                                    for (Object obj8 : arrayList6) {
                                                        if (obj8 instanceof CartProductCard) {
                                                            arrayList7.add(obj8);
                                                        }
                                                    }
                                                    int size2 = arrayList7.size();
                                                    Function1<Integer, Object> function16 = new Function1<Integer, Object>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartPromotionProductSectionKt$cartPromotionSectionUi$$inlined$items$default$3
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj9) {
                                                            arrayList7.get(((Number) obj9).intValue());
                                                            return null;
                                                        }
                                                    };
                                                    z7 = true;
                                                    ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartPromotionProductSectionKt$cartPromotionSectionUi$$inlined$items$default$4
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(4);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function4
                                                        public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                                                            int i6;
                                                            LazyItemScope lazyItemScope = (LazyItemScope) obj9;
                                                            int iIntValue = ((Number) obj10).intValue();
                                                            Composer composer3 = (Composer) obj11;
                                                            int iIntValue2 = ((Number) obj12).intValue();
                                                            if ((iIntValue2 & 6) == 0) {
                                                                i6 = (composer3.n(lazyItemScope) ? 4 : 2) | iIntValue2;
                                                            } else {
                                                                i6 = iIntValue2;
                                                            }
                                                            if ((iIntValue2 & 48) == 0) {
                                                                i6 |= composer3.r(iIntValue) ? 32 : 16;
                                                            }
                                                            if (composer3.z(i6 & 1, (i6 & 147) != 146)) {
                                                                CartProductCard cartProductCard = (CartProductCard) arrayList7.get(iIntValue);
                                                                composer3.o(409898404);
                                                                DividerKt.a(BitmapDescriptorFactory.HUE_RED, KyberEngine.KyberPolyBytes, 3, 0L, composer3, null);
                                                                CartProductKt.a(z9, cartProductCard, (Double) map4.get(cartProductCard), viewModel2, onNavigateToQuickAdd3, composer3, 0, 0);
                                                                composer3.l();
                                                            } else {
                                                                composer3.j();
                                                            }
                                                            return Unit.f24250a;
                                                        }
                                                    }, true, -632812321);
                                                    th = null;
                                                    LazyColumn.b(size2, null, function16, composableLambdaImpl);
                                                } else {
                                                    th = null;
                                                    z7 = true;
                                                    if (cartSection instanceof CartImageTextBanner) {
                                                        final CartImageTextBanner cartImageTextBanner = (CartImageTextBanner) cartSection;
                                                        i2 = 3;
                                                        LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartScreenKt$CartScreen$4$1$1$1$2$2
                                                            @Override // kotlin.jvm.functions.Function3
                                                            public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                                                LazyItemScope item = (LazyItemScope) obj9;
                                                                Composer composer3 = (Composer) obj10;
                                                                int iIntValue = ((Number) obj11).intValue();
                                                                Intrinsics.h(item, "$this$item");
                                                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                                                    composer3.j();
                                                                } else {
                                                                    Modifier.Companion companion2 = Modifier.Companion.d;
                                                                    SpacerKt.a(composer3, SizeKt.g(companion2, 1));
                                                                    Modifier modifierB = BackgroundKt.b(companion2, WxTheme.a(composer3).a(), RectangleShapeKt.f1779a);
                                                                    MeasurePolicy measurePolicyD2 = BoxKt.d(Alignment.Companion.f1719a, false);
                                                                    int p2 = composer3.getP();
                                                                    PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer3.d();
                                                                    Modifier modifierD2 = ComposedModifierKt.d(composer3, modifierB);
                                                                    ComposeUiNode.e3.getClass();
                                                                    Function0 function02 = ComposeUiNode.Companion.b;
                                                                    if (composer3.w() == null) {
                                                                        ComposablesKt.b();
                                                                        throw null;
                                                                    }
                                                                    composer3.i();
                                                                    if (composer3.getO()) {
                                                                        composer3.K(function02);
                                                                    } else {
                                                                        composer3.e();
                                                                    }
                                                                    Updater.b(composer3, measurePolicyD2, ComposeUiNode.Companion.g);
                                                                    Updater.b(composer3, persistentCompositionLocalMapD2, ComposeUiNode.Companion.f);
                                                                    Function2 function22 = ComposeUiNode.Companion.j;
                                                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p2))) {
                                                                        androidx.camera.core.impl.b.z(p2, composer3, p2, function22);
                                                                    }
                                                                    Updater.b(composer3, modifierD2, ComposeUiNode.Companion.d);
                                                                    CartImageTextBanner cartImageTextBanner2 = cartImageTextBanner;
                                                                    ImageTextBannerUiKt.a(new ImageTextBanner(cartImageTextBanner2.f8676a, cartImageTextBanner2.b), null, BitmapDescriptorFactory.HUE_RED, composer3, 0, 6);
                                                                    composer3.f();
                                                                }
                                                                return Unit.f24250a;
                                                            }
                                                        }, true, -1168535260), 3);
                                                    } else {
                                                        i2 = 3;
                                                        if (cartSection instanceof CartBanner) {
                                                            final CartBanner cartBanner = (CartBanner) cartSection;
                                                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartScreenKt$CartScreen$4$1$1$1$2$3
                                                                @Override // kotlin.jvm.functions.Function3
                                                                public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                                                    LazyItemScope item = (LazyItemScope) obj9;
                                                                    Composer composer3 = (Composer) obj10;
                                                                    int iIntValue = ((Number) obj11).intValue();
                                                                    Intrinsics.h(item, "$this$item");
                                                                    if ((iIntValue & 17) == 16 && composer3.c()) {
                                                                        composer3.j();
                                                                    } else {
                                                                        Ref.IntRef intRef2 = intRef;
                                                                        int i6 = intRef2.d + 1;
                                                                        intRef2.d = i6;
                                                                        int i7 = i6 * 500;
                                                                        int i8 = i4;
                                                                        List list3 = list2;
                                                                        final boolean z10 = CollectionsKt.J(i8 - 1, list3) instanceof CartBanner;
                                                                        final boolean z11 = CollectionsKt.J(i8 + 1, list3) instanceof CartBanner;
                                                                        composer3.o(1605413586);
                                                                        if (!z10) {
                                                                            SpacerKt.a(composer3, SizeKt.g(Modifier.Companion.d, 1));
                                                                        }
                                                                        Object objE = au.com.woolworths.android.onesite.a.e(composer3, 1849434622);
                                                                        Object obj12 = objE;
                                                                        if (objE == Composer.Companion.f1624a) {
                                                                            MutableTransitionState mutableTransitionState = new MutableTransitionState(Boolean.FALSE);
                                                                            ((SnapshotMutableStateImpl) mutableTransitionState.c).setValue(Boolean.TRUE);
                                                                            composer3.A(mutableTransitionState);
                                                                            obj12 = mutableTransitionState;
                                                                        }
                                                                        composer3.l();
                                                                        EnterTransition enterTransitionB = EnterExitTransitionKt.e(AnimationSpecKt.e(0, i7, null, 5), 2).b(EnterExitTransitionKt.d(AnimationSpecKt.e(0, i7, null, 5), 14));
                                                                        final CartBanner cartBanner2 = cartBanner;
                                                                        final CartViewModel cartViewModel3 = viewModel2;
                                                                        AnimatedVisibilityKt.b((MutableTransitionState) obj12, null, enterTransitionB, null, null, ComposableLambdaKt.c(592280795, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartScreenKt$CartScreen$4$1$1$1$2$3.2

                                                                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                                                                            /* renamed from: au.com.woolworths.shop.cart.ui.cart.CartScreenKt$CartScreen$4$1$1$1$2$3$2$WhenMappings */
                                                                            public /* synthetic */ class WhenMappings {
                                                                                static {
                                                                                    int[] iArr = new int[CartBannerType.values().length];
                                                                                    try {
                                                                                        iArr[1] = 1;
                                                                                    } catch (NoSuchFieldError unused) {
                                                                                    }
                                                                                    try {
                                                                                        CartBannerType cartBannerType = CartBannerType.d;
                                                                                        iArr[2] = 2;
                                                                                    } catch (NoSuchFieldError unused2) {
                                                                                    }
                                                                                    try {
                                                                                        CartBannerType cartBannerType2 = CartBannerType.d;
                                                                                        iArr[0] = 3;
                                                                                    } catch (NoSuchFieldError unused3) {
                                                                                    }
                                                                                    try {
                                                                                        CartBannerType cartBannerType3 = CartBannerType.d;
                                                                                        iArr[3] = 4;
                                                                                    } catch (NoSuchFieldError unused4) {
                                                                                    }
                                                                                }
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function3
                                                                            public final Object invoke(Object obj13, Object obj14, Object obj15) {
                                                                                AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj13;
                                                                                Composer composer4 = (Composer) obj14;
                                                                                ((Number) obj15).intValue();
                                                                                Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                                                                                float f = 16;
                                                                                Modifier modifierH = PaddingKt.h(BackgroundKt.b(Modifier.Companion.d, Color.f, RectangleShapeKt.f1779a), f, BitmapDescriptorFactory.HUE_RED, 2);
                                                                                float f2 = z10 ? 0 : f;
                                                                                if (z11) {
                                                                                    f = 8;
                                                                                }
                                                                                Modifier modifierJ = PaddingKt.j(modifierH, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, f, 5);
                                                                                MeasurePolicy measurePolicyD2 = BoxKt.d(Alignment.Companion.f1719a, false);
                                                                                int p2 = composer4.getP();
                                                                                PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer4.d();
                                                                                Modifier modifierD2 = ComposedModifierKt.d(composer4, modifierJ);
                                                                                ComposeUiNode.e3.getClass();
                                                                                Function0 function02 = ComposeUiNode.Companion.b;
                                                                                if (composer4.w() == null) {
                                                                                    ComposablesKt.b();
                                                                                    throw null;
                                                                                }
                                                                                composer4.i();
                                                                                if (composer4.getO()) {
                                                                                    composer4.K(function02);
                                                                                } else {
                                                                                    composer4.e();
                                                                                }
                                                                                Updater.b(composer4, measurePolicyD2, ComposeUiNode.Companion.g);
                                                                                Updater.b(composer4, persistentCompositionLocalMapD2, ComposeUiNode.Companion.f);
                                                                                Function2 function22 = ComposeUiNode.Companion.j;
                                                                                if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p2))) {
                                                                                    androidx.camera.core.impl.b.z(p2, composer4, p2, function22);
                                                                                }
                                                                                Updater.b(composer4, modifierD2, ComposeUiNode.Companion.d);
                                                                                CartBanner cartBanner3 = cartBanner2;
                                                                                InsetBannerData uiModel = InsetBannerApiDataExtKt.toUiModel(cartBanner3.f8673a);
                                                                                composer4.o(-1633490746);
                                                                                boolean zI3 = composer4.I(cartBanner3);
                                                                                Object obj16 = cartViewModel3;
                                                                                boolean zI4 = zI3 | composer4.I(obj16);
                                                                                Object objG3 = composer4.G();
                                                                                if (zI4 || objG3 == Composer.Companion.f1624a) {
                                                                                    objG3 = new l(1, cartBanner3, obj16);
                                                                                    composer4.A(objG3);
                                                                                }
                                                                                composer4.l();
                                                                                InsetBannerUiKt.b(uiModel, null, false, (Function1) objG3, composer4, 0, 14);
                                                                                composer4.f();
                                                                                return Unit.f24250a;
                                                                            }
                                                                        }, composer3), composer3, 196608, 26);
                                                                    }
                                                                    return Unit.f24250a;
                                                                }
                                                            }, true, -856429053), 3);
                                                        } else {
                                                            if (!(cartSection instanceof EverydayMarketCouponBannerDataSection)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            final EverydayMarketCouponBannerDataSection everydayMarketCouponBannerDataSection = (EverydayMarketCouponBannerDataSection) cartSection;
                                                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartScreenKt$CartScreen$4$1$1$1$2$4
                                                                @Override // kotlin.jvm.functions.Function3
                                                                public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                                                    LazyItemScope item = (LazyItemScope) obj9;
                                                                    Composer composer3 = (Composer) obj10;
                                                                    int iIntValue = ((Number) obj11).intValue();
                                                                    Intrinsics.h(item, "$this$item");
                                                                    if ((iIntValue & 17) == 16 && composer3.c()) {
                                                                        composer3.j();
                                                                    } else {
                                                                        final EverydayMarketCouponBannerDataSection everydayMarketCouponBannerDataSection2 = everydayMarketCouponBannerDataSection;
                                                                        final CartViewModel cartViewModel3 = viewModel2;
                                                                        CoreThemeKt.b(6, composer3, ComposableLambdaKt.c(-160687649, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartScreenKt$CartScreen$4$1$1$1$2$4.1
                                                                            @Override // kotlin.jvm.functions.Function2
                                                                            public final Object invoke(Object obj12, Object obj13) {
                                                                                Composer$Companion$Empty$1 composer$Companion$Empty$12;
                                                                                Composer composer4 = (Composer) obj12;
                                                                                int iIntValue2 = ((Number) obj13).intValue();
                                                                                EverydayMarketCouponBannerData everydayMarketCouponBannerData = everydayMarketCouponBannerDataSection2.f8693a;
                                                                                if ((iIntValue2 & 3) == 2 && composer4.c()) {
                                                                                    composer4.j();
                                                                                } else {
                                                                                    float f = 16;
                                                                                    Modifier modifierI = PaddingKt.i(Modifier.Companion.d, f, f, f, 4);
                                                                                    String str2 = everydayMarketCouponBannerData.e;
                                                                                    String str3 = everydayMarketCouponBannerData.f;
                                                                                    CouponBannerTermsAndConditions couponBannerTermsAndConditions = everydayMarketCouponBannerData.k;
                                                                                    String str4 = couponBannerTermsAndConditions.e;
                                                                                    String str5 = couponBannerTermsAndConditions.d;
                                                                                    String strM = CollectionsKt.M(StringsKt.m(str3), ",", null, null, null, 62);
                                                                                    String str6 = everydayMarketCouponBannerData.g;
                                                                                    String str7 = everydayMarketCouponBannerData.h;
                                                                                    EverydayMarketCouponBannerColorTheme everydayMarketCouponBannerColorTheme = everydayMarketCouponBannerData.d;
                                                                                    composer4.o(5004770);
                                                                                    CartViewModel cartViewModel4 = cartViewModel3;
                                                                                    boolean zI3 = composer4.I(cartViewModel4);
                                                                                    Object objG3 = composer4.G();
                                                                                    Composer$Companion$Empty$1 composer$Companion$Empty$13 = Composer.Companion.f1624a;
                                                                                    if (zI3 || objG3 == composer$Companion$Empty$13) {
                                                                                        composer$Companion$Empty$12 = composer$Companion$Empty$13;
                                                                                        objG3 = new CartScreenKt$CartScreen$4$1$1$1$2$4$1$1$1(2, cartViewModel4, CartViewModel.class, "onEverydayMarketTermsAndConditionsClicked", "onEverydayMarketTermsAndConditionsClicked(Ljava/lang/String;Ljava/lang/String;)V", 0);
                                                                                        composer4.A(objG3);
                                                                                    } else {
                                                                                        composer$Companion$Empty$12 = composer$Companion$Empty$13;
                                                                                    }
                                                                                    KFunction kFunction = (KFunction) objG3;
                                                                                    composer4.l();
                                                                                    composer4.o(5004770);
                                                                                    CartViewModel cartViewModel5 = cartViewModel3;
                                                                                    boolean zI4 = composer4.I(cartViewModel5);
                                                                                    Object objG4 = composer4.G();
                                                                                    if (zI4 || objG4 == composer$Companion$Empty$12) {
                                                                                        CartScreenKt$CartScreen$4$1$1$1$2$4$1$2$1 cartScreenKt$CartScreen$4$1$1$1$2$4$1$2$1 = new CartScreenKt$CartScreen$4$1$1$1$2$4$1$2$1(1, cartViewModel5, CartViewModel.class, "onEverydayMarketCouponCodeClicked", "onEverydayMarketCouponCodeClicked(Ljava/lang/String;)V", 0);
                                                                                        composer4.A(cartScreenKt$CartScreen$4$1$1$1$2$4$1$2$1);
                                                                                        objG4 = cartScreenKt$CartScreen$4$1$1$1$2$4$1$2$1;
                                                                                    }
                                                                                    composer4.l();
                                                                                    EverydayMarketCouponBannerKt.a(str2, str3, str7, str4, str5, strM, str6, everydayMarketCouponBannerColorTheme, (Function2) kFunction, (Function1) ((KFunction) objG4), modifierI, composer4, 0, 0, 0);
                                                                                }
                                                                                return Unit.f24250a;
                                                                            }
                                                                        }, composer3));
                                                                    }
                                                                    return Unit.f24250a;
                                                                }
                                                            }, true, -544322846), 3);
                                                        }
                                                    }
                                                }
                                                th2 = th;
                                                i3 = i2;
                                                i4 = i5;
                                                mutableState5 = mutableState3;
                                                qVar = this;
                                            }
                                        }
                                        i2 = 3;
                                        th2 = th;
                                        i3 = i2;
                                        i4 = i5;
                                        mutableState5 = mutableState3;
                                        qVar = this;
                                    }
                                    Throwable th4 = th2;
                                    LazyListScope.i(LazyColumn, th4, th4, ComposableSingletons$CartScreenKt.f10497a, i3);
                                    return Unit.f24250a;
                                }
                            };
                            mutableState = mutableState2;
                            z4 = z6;
                            composer2.A(function12);
                            objG2 = function12;
                        } else {
                            mutableState = mutableState2;
                            z4 = z6;
                        }
                        composer2.l();
                        LazyDslKt.b(modifierA2, null, null, false, null, null, null, false, null, (Function1) objG2, composer2, 0, 510);
                        PullRefreshIndicatorKt.a(z4 ? ((CartContract.ViewState) mutableState.getD()).b || !z3 : ((CartContract.ViewState) mutableState.getD()).f10490a, pullRefreshStateA, BoxScopeInstance.f944a.g(companion, Alignment.Companion.b), 0L, 0L, composer2, 64, 56);
                        composer2.f();
                        Cart cart3 = ((CartContract.ViewState) mutableState.getD()).c;
                        CartFooterData cartFooterData = cart3 != null ? cart3.e : null;
                        if (cartFooterData != null) {
                            boolean z7 = ((CartContract.ViewState) mutableState.getD()).f10490a;
                            Modifier modifierA3 = CollapsingToolbarScaffold.a();
                            composer2.o(5004770);
                            CartViewModel cartViewModel2 = viewModel;
                            boolean zI3 = composer2.I(cartViewModel2);
                            Object objG3 = composer2.G();
                            if (zI3 || objG3 == composer$Companion$Empty$1) {
                                objG3 = new g(cartViewModel2, 6);
                                composer2.A(objG3);
                            }
                            composer2.l();
                            CartFooterKt.a(z, z7, cartFooterData, modifierA3, null, false, (Function0) objG3, composer2, 0, 48);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImplV, 1769856, 24);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new i(z, viewModel, onNavigateUp, onNavigateToQuickAdd, i);
        }
    }

    public static final void b(CollapsingToolbarScope collapsingToolbarScope, CollapsingToolbarScaffoldState collapsingToolbarScaffoldState, String str, String str2, Composer composer, int i) {
        int i2;
        boolean z;
        TextStyle textStyle;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(1063636045);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(collapsingToolbarScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(collapsingToolbarScaffoldState) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(str2) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            float fJ = collapsingToolbarScaffoldState.f24914a.j();
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = SnapshotStateKt.d(new e(collapsingToolbarScaffoldState, 2));
                composerImplV.A(objG);
            }
            State state = (State) objG;
            composerImplV.V(false);
            float fB = MathHelpersKt.b(f10493a, b, fJ);
            float fB2 = MathHelpersKt.b(0, 16, fJ);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierA = collapsingToolbarScope.a(SizeKt.x(SizeKt.c(SizeKt.b(PaddingKt.j(WindowInsetsPadding_androidKt.b(companion), fB, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fB2, 6), BitmapDescriptorFactory.HUE_RED, c, 1), 1.0f), Alignment.Companion.k, false), Alignment.Companion.g);
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
            long jD = TextUnitKt.d(WxTheme.b(composerImplV).h.f2068a.fontSize, fJ, WxTheme.b(composerImplV).d.f2068a.fontSize);
            if (((Boolean) state.getD()).booleanValue()) {
                composerImplV.o(-1948604583);
                textStyle = WxTheme.b(composerImplV).h;
                z = false;
            } else {
                z = false;
                composerImplV.o(-1948603719);
                textStyle = WxTheme.b(composerImplV).d;
            }
            composerImplV.V(z);
            TextKt.b(str, SizeKt.x(companion, Alignment.Companion.k, false), 0L, jD, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composerImplV, ((i2 >> 6) & 14) | 48, 0, 65524);
            composerImpl = composerImplV;
            composerImpl.o(-1948599066);
            if (str2 != null) {
                TextKt.b(str2, SizeKt.x(companion, Alignment.Companion.k, false), WxTheme.a(composerImpl).f(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImpl).n, composerImpl, ((i2 >> 9) & 14) | 48, 0, 65528);
                composerImpl = composerImpl;
            }
            composerImpl.V(false);
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.instore.presence.presentation.b(i, 14, (Object) collapsingToolbarScope, (Object) collapsingToolbarScaffoldState, (Object) str, (Object) str2, false);
        }
    }

    public static final void c(final Function0 function0, final boolean z, String str, final Function0 function02, Composer composer, int i, int i2) {
        String str2;
        int i3;
        ComposerImpl composerImpl;
        String str3;
        ComposerImpl composerImplV = composer.v(-43403206);
        int i4 = i | (composerImplV.I(function0) ? 4 : 2) | (composerImplV.p(z) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | KyberEngine.KyberPolyBytes;
            str2 = str;
        } else {
            str2 = str;
            i3 = i4 | (composerImplV.n(str2) ? 256 : 128);
        }
        int i6 = i3 | (composerImplV.I(function02) ? 2048 : 1024);
        if ((i6 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            str3 = str2;
        } else {
            String str4 = i5 != 0 ? null : str2;
            composerImpl = composerImplV;
            TopNavBarKt.b(str4, null, null, null, 0L, Color.j, 0L, null, 0, ComposableLambdaKt.c(-1662531701, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartScreenKt$ToolbarTopNavBar$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        IconButtonKt.c(ArrowBackKt.a(), StringResources_androidKt.c(composer2, R.string.content_description_back_button), function0, null, false, WxTheme.a(composer2).h(), composer2, 0, 24);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(-1379604699, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartScreenKt$ToolbarTopNavBar$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    RowScope TopNavBar = (RowScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(TopNavBar, "$this$TopNavBar");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else if (z) {
                        IconButtonKt.c(MoreVertKt.a(), StringResources_androidKt.c(composer2, R.string.cart_menu_more), function02, TestTagKt.a(Modifier.Companion.d, "cart more menu"), false, 0L, composer2, 3072, 48);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, ((i6 >> 6) & 14) | 906166272, 6, 222);
            str3 = str4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.pullrefresh.a(function0, z, str3, function02, i, i2);
        }
    }
}
