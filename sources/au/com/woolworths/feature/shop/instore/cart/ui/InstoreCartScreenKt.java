package au.com.woolworths.feature.shop.instore.cart.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.AndroidWindowInsets;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.design.core.ui.component.experimental.progressindicator.CircularProgressIndicatorKt;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.catalogue.listing.category.ui.h;
import au.com.woolworths.feature.shop.instore.cart.InstoreCartContract;
import au.com.woolworths.feature.shop.instore.cart.InstoreCartViewModel;
import au.com.woolworths.feature.shop.instore.cart.ext.InstoreCartDataExtKt;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import au.com.woolworths.product.models.AisleSide;
import au.com.woolworths.product.models.InStoreLocationData;
import au.com.woolworths.product.models.InStoreLocationType;
import au.com.woolworths.product.models.InstoreDetailsData;
import au.com.woolworths.product.models.InstoreLocationDetailsData;
import au.com.woolworths.product.models.MemberPriceInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCategory;
import au.com.woolworths.product.models.ProductInlineLabelApiData;
import au.com.woolworths.product.models.ProductInlineTypeApiData;
import au.com.woolworths.product.models.ProductShoppingList;
import au.com.woolworths.product.models.ProductTileButtonType;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.models.PurchaseRestriction;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
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
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;
import me.onebone.toolbar.CollapsingToolbarKt;
import me.onebone.toolbar.CollapsingToolbarScaffoldKt;
import me.onebone.toolbar.CollapsingToolbarScaffoldScope;
import me.onebone.toolbar.CollapsingToolbarScaffoldState;
import me.onebone.toolbar.CollapsingToolbarScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003¨\u0006\u0007²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/cart/InstoreCartContract$ViewState;", "viewState", "Landroidx/compose/ui/unit/Dp;", "topInsetDpState", "", "insetsReady", "collapsed", "instore-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstoreCartScreenKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f7322a;
    public static final float b = 16;
    public static final float c;
    public static final ProductCard d;
    public static final ProductCard e;
    public static final ProductCard f;

    static {
        float f2 = 56;
        f7322a = f2;
        c = f2;
        ProductShoppingList productShoppingList = new ProductShoppingList(0.0d, 0.0d, 1.0d, 0.0d, null, 16, null);
        MemberPriceInfo memberPriceInfo = new MemberPriceInfo("Member Price", "$88.88", "$88.88 per 1KG");
        ProductTileButtonType productTileButtonType = ProductTileButtonType.ADD;
        Double dValueOf = Double.valueOf(1.0d);
        int i = 290;
        d = new ProductCard("0", "Helga's Bread Light Rye 680g", null, null, i, null, null, null, "$0.72 per 100G", true, false, null, null, null, null, new ProductTrolleyData(1.0d, 29.0d, 1.0d, 1.0d, dValueOf, "dozen", productTileButtonType, "Add", null, null), null, productShoppingList, new InstoreDetailsData("Aisle 3", InStoreLocationType.AVAILABLE), null, null, null, null, null, null, null, null, null, null, null, null, false, null, memberPriceInfo, null, new InStoreLocationData(new InstoreLocationDetailsData(3, AisleSide.LEFT, "location", 3, null, 1, 5.0d, 6.0d, 0.0d), null), null, null, null, null, -427796, 245, null);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        AnalyticsData analyticsData = null;
        e = new ProductCard("1", "Helga's Bread Light Rye 680g", null, null, i, null, str, str2, "$0.72 per 100G", true, false, null, str3, str4, str5, new ProductTrolleyData(1.0d, 29.0d, 1.0d, 1.0d, dValueOf, "Kilo", productTileButtonType, "Add", null, null), null, new ProductShoppingList(0.0d, 0.0d, 1.0d, 0.0d, null, 16, 0 == true ? 1 : 0), null, null, null, null, null, str6, null, null, null, null, null, null, null, false, null, new MemberPriceInfo("Member Price", "$88.88", "$88.88 per 1KG"), null, null, null, analyticsData, null, null, -165652, 253, null);
        f = new ProductCard("2", "Eat Later Cavendish Bananas Each", "https://uat-assets.woolworths.com.au/images/1005/157649.jpg?impolicy=wowsmmobeac&w=260&h=260", null, 76, str, str2, null, "$0.76 each", true, true, str3, str4, str5, null, new ProductTrolleyData(1.0d, 29.0d, 1.0d, 1.0d, Double.valueOf(99.0d), "EACH", productTileButtonType, "Add", null, null), null, new ProductShoppingList(1.0d, 29.0d, 1.0d, 1.0d, null), 0 == true ? 1 : 0, PurchaseRestriction.NO_RESTRICTION, CollectionsKt.Q(new ProductInlineLabelApiData(ProductInlineTypeApiData.NEW, "NEW", 0)), 0 == true ? 1 : 0, str6, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, CollectionsKt.R(new ProductCategory("Fruit & Veg", 1), new ProductCategory("Fruit", 2), new ProductCategory("Mince", 3)), false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, analyticsData, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 478228704, 248, null);
    }

    public static final void a(final InstoreCartContract.ViewState.InstoreCartContent instoreCartContent, final Function0 function0, final Function1 function1, float f2, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-673901092);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(instoreCartContent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.q(f2) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Timber.f27013a.b(YU.a.A("InstoreCartScreen: ActualContentUi composing with topInsetDp = ", Dp.b(f2)), new Object[0]);
            final float f3 = 144 + f2;
            final CollapsingToolbarScaffoldState collapsingToolbarScaffoldStateB = CollapsingToolbarScaffoldKt.b(CollapsingToolbarKt.b(Integer.MAX_VALUE, 0, composerImplV), composerImplV, 0);
            CollapsingToolbarScaffoldKt.a(TestTagKt.a(WindowInsetsPadding_androidKt.a(SizeKt.c), "instore_cart_screen"), collapsingToolbarScaffoldStateB, false, null, ComposableLambdaKt.c(-3420286, new Function3<CollapsingToolbarScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartScreenKt$ActualContentUi$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Double inTrolley;
                    CollapsingToolbarScope CollapsingToolbarScaffold = (CollapsingToolbarScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(CollapsingToolbarScaffold, "$this$CollapsingToolbarScaffold");
                    String strC = StringResources_androidKt.c(composer2, R.string.cart);
                    Iterator it = InstoreCartDataExtKt.a(instoreCartContent.f7305a).iterator();
                    int iDoubleValue = 0;
                    while (it.hasNext()) {
                        ProductTrolleyData trolley = ((ProductCard) it.next()).getTrolley();
                        iDoubleValue += (trolley == null || (inTrolley = trolley.getInTrolley()) == null) ? 0 : (int) inTrolley.doubleValue();
                    }
                    InstoreCartScreenKt.f(CollapsingToolbarScaffold, f3, collapsingToolbarScaffoldStateB, strC, iDoubleValue, function0, composer2, iIntValue & 14);
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(-964116105, new Function3<CollapsingToolbarScaffoldScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartScreenKt$ActualContentUi$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    CollapsingToolbarScaffoldScope CollapsingToolbarScaffold = (CollapsingToolbarScaffoldScope) obj;
                    Composer composer2 = (Composer) obj2;
                    ((Number) obj3).intValue();
                    Intrinsics.h(CollapsingToolbarScaffold, "$this$CollapsingToolbarScaffold");
                    DividerKt.a(BitmapDescriptorFactory.HUE_RED, 432, 1, Color.e, composer2, null);
                    InstoreCartContract.ViewState.InstoreCartContent instoreCartContent2 = instoreCartContent;
                    InstoreCartScreenKt.g(InstoreCartDataExtKt.a(instoreCartContent2.f7305a), instoreCartContent2.b, function1, null, composer2, 0);
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1769856, 24);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(instoreCartContent, function0, function1, f2, i);
        }
    }

    public static final void b(final InstoreCartContract.ViewState.InstoreCartContent instoreCartContent, final Function0 function0, final Function1 function1, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(2133417034);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(instoreCartContent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(null) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-298737463);
            e(48, composerImplV, ComposableLambdaKt.c(1544549565, new Function3<Dp, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartScreenKt$ContentUi$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float f2 = ((Dp) obj).d;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.q(f2) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        InstoreCartScreenKt.a(instoreCartContent, function0, function1, f2, composer2, (iIntValue << 9) & 7168);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null);
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c(instoreCartContent, function0, function1, i, 15);
        }
    }

    public static final void c(final Function0 function0, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-452316044);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ScaffoldKt.a(SizeKt.c, ComposableLambdaKt.c(2030335032, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartScreenKt$EmptyCartUi$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final Function0 function02 = function0;
                        ThemeKt.b(6, composer2, ComposableLambdaKt.c(378885760, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartScreenKt$EmptyCartUi$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    InstoreCartScreenKt.m(0, 0, composer3, StringResources_androidKt.c(composer3, R.string.cart), function02);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2));
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0L, null, ComposableSingletons$InstoreCartScreenKt.c, composerImplV, 12582966, 124);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.filter.d(i, 4, function0);
        }
    }

    public static final void d(final InstoreCartContract.ViewState.Error error, final Function0 function0, final Function0 function02, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-617213193);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(error) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function02) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ScaffoldKt.a(SizeKt.c, ComposableLambdaKt.c(588958907, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartScreenKt$ErrorUi$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final Function0 function03 = function02;
                        ThemeKt.b(6, composer2, ComposableLambdaKt.c(-1455258877, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartScreenKt$ErrorUi$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    InstoreCartScreenKt.m(0, 0, composer3, StringResources_androidKt.c(composer3, R.string.cart), function03);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2));
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0L, null, ComposableLambdaKt.c(1880770244, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartScreenKt$ErrorUi$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        FullPageMessageUiKt.a(FullPageMessageSpec.Companion.a(error.f7304a, StringResources_androidKt.c(composer2, R.string.generic_server_error_subtitle), StringResources_androidKt.c(composer2, R.string.generic_network_error_subtitle), function0, composer2, 1572864, 6), TestTagKt.a(Modifier.Companion.d, "error_instore_cart_screen"), null, composer2, 48, 4);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12582966, 124);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c(error, function0, function02, i, 14);
        }
    }

    public static final void e(int i, Composer composer, ComposableLambdaImpl composableLambdaImpl, Function2 function2) {
        MutableState mutableState;
        Density density;
        Function2 function22;
        ComposerImpl composerImplV = composer.v(1645628318);
        if (((i | 6) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function22 = function2;
        } else {
            ComposableLambdaImpl composableLambdaImpl2 = ComposableSingletons$InstoreCartScreenKt.f7321a;
            AndroidWindowInsets androidWindowInsetsC = WindowInsets_androidKt.c(composerImplV);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = SnapshotStateKt.f(new Dp(0));
                composerImplV.A(objG);
            }
            MutableState mutableState2 = (MutableState) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == obj) {
                objD = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objD);
            }
            MutableState mutableState3 = (MutableState) objD;
            composerImplV.V(false);
            Density density2 = (Density) composerImplV.x(CompositionLocalsKt.h);
            composerImplV.o(-1224400529);
            boolean zN = composerImplV.n(androidWindowInsetsC) | composerImplV.n(density2);
            Object objG2 = composerImplV.G();
            if (zN || objG2 == obj) {
                mutableState = mutableState2;
                density = density2;
                Object instoreCartScreenKt$InsetAwareContent$1$1 = new InstoreCartScreenKt$InsetAwareContent$1$1(androidWindowInsetsC, density, mutableState, mutableState3, null);
                composerImplV.A(instoreCartScreenKt$InsetAwareContent$1$1);
                objG2 = instoreCartScreenKt$InsetAwareContent$1$1;
            } else {
                mutableState = mutableState2;
                density = density2;
            }
            composerImplV.V(false);
            EffectsKt.f(androidWindowInsetsC, density, (Function2) objG2, composerImplV);
            if (((Boolean) mutableState3.getD()).booleanValue()) {
                composerImplV.o(-2136507595);
                Timber.f27013a.b(YU.a.A("InsetAwareContent: Insets ready, composing Scaffold. topInsetDp = ", Dp.b(((Dp) mutableState.getD()).d)), new Object[0]);
                composableLambdaImpl.invoke(new Dp(((Dp) mutableState.getD()).d), composerImplV, 48);
                composerImplV.V(false);
                function22 = composableLambdaImpl2;
            } else {
                composerImplV.o(-2136611197);
                Timber.f27013a.b("InsetAwareContent: Waiting for insets...", new Object[0]);
                composableLambdaImpl2.invoke(composerImplV, 6);
                composerImplV.V(false);
                function22 = composableLambdaImpl2;
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.receipt.details.compose.a(function22, i, 9, composableLambdaImpl);
        }
    }

    public static final void f(final CollapsingToolbarScope InstoreCartCollapsingToolbarContent, final float f2, final CollapsingToolbarScaffoldState collapsingToolbarState, final String titleText, final int i, final Function0 onNavigateUp, Composer composer, int i2) {
        int i3;
        Intrinsics.h(InstoreCartCollapsingToolbarContent, "$this$InstoreCartCollapsingToolbarContent");
        Intrinsics.h(collapsingToolbarState, "collapsingToolbarState");
        Intrinsics.h(titleText, "titleText");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        ComposerImpl composerImplV = composer.v(-858187468);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.I(InstoreCartCollapsingToolbarContent) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.q(f2) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(collapsingToolbarState) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerImplV.n(titleText) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerImplV.r(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerImplV.I(onNavigateUp) ? 131072 : 65536;
        }
        if ((i3 & 74899) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-1244800644, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartScreenKt$InstoreCartCollapsingToolbarContent$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        BoxKt.a(SizeKt.c(SizeKt.g(Modifier.Companion.d, f2), 1.0f), composer2, 0);
                        InstoreCartScreenKt.m(0, 2, composer2, null, onNavigateUp);
                        InstoreCartScreenKt.l(InstoreCartCollapsingToolbarContent, collapsingToolbarState, titleText, i, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(InstoreCartCollapsingToolbarContent, f2, collapsingToolbarState, titleText, i, onNavigateUp, i2);
        }
    }

    public static final void g(ArrayList arrayList, boolean z, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(8734564);
        int i2 = i | (composerImplV.I(arrayList) ? 4 : 2) | (composerImplV.p(z) ? 32 : 16) | (composerImplV.I(function1) ? 256 : 128) | 3072;
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier modifierA = TestTagKt.a(PaddingKt.h(SizeKt.c, 16, BitmapDescriptorFactory.HUE_RED, 2), "cart product list");
            composerImplV.o(-1746271574);
            boolean zI = composerImplV.I(arrayList) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new androidx.navigation.compose.c(arrayList, 1, function1, z);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            LazyDslKt.b(modifierA, null, null, false, null, null, null, false, null, (Function1) objG, composerImplV, 0, 510);
            modifier2 = Modifier.Companion.d;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.d(arrayList, z, function1, modifier2, i, 2);
        }
    }

    public static final void h(InstoreCartViewModel instoreCartViewModel, Function0 onNavigateUp, Function1 onAisleClicked, Composer composer, int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onAisleClicked, "onAisleClicked");
        ComposerImpl composerImplV = composer.v(1929098944);
        int i2 = i | (composerImplV.n(instoreCartViewModel) ? 4 : 2) | (composerImplV.I(onNavigateUp) ? 32 : 16) | (composerImplV.I(onAisleClicked) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Flow flow = instoreCartViewModel.i;
            composerImplV.o(-1633490746);
            int i3 = i2 & 14;
            int i4 = i2 & 112;
            boolean z = (i4 == 32) | (i3 == 4);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z || objG == composer$Companion$Empty$1) {
                objG = new InstoreCartScreenKt$InstoreCartScreen$1$1(instoreCartViewModel, onNavigateUp, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) objG);
            InstoreCartContract.ViewState viewState = (InstoreCartContract.ViewState) FlowExtKt.a(instoreCartViewModel.k, composerImplV).getD();
            composerImplV.o(5004770);
            boolean z2 = i3 == 4;
            Object objG2 = composerImplV.G();
            if (z2 || objG2 == composer$Companion$Empty$1) {
                objG2 = new InstoreCartScreenKt$InstoreCartScreen$2$1(0, instoreCartViewModel, InstoreCartViewModel.class, "onTryAgainTapped", "onTryAgainTapped()V", 0);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            i(viewState, onNavigateUp, (Function0) ((KFunction) objG2), onAisleClicked, composerImpl, i4 | ((i2 << 3) & 7168));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(instoreCartViewModel, onNavigateUp, onAisleClicked, i, 24);
        }
    }

    public static final void i(InstoreCartContract.ViewState viewState, Function0 onNavigateUp, Function0 onErrorRetry, Function1 onAisleClicked, Composer composer, int i) {
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onErrorRetry, "onErrorRetry");
        Intrinsics.h(onAisleClicked, "onAisleClicked");
        ComposerImpl composerImplV = composer.v(255577222);
        int i2 = (composerImplV.n(viewState) ? 4 : 2) | i | (composerImplV.I(onNavigateUp) ? 32 : 16) | (composerImplV.I(onErrorRetry) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onAisleClicked) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((i3 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else if (viewState.equals(InstoreCartContract.ViewState.Loading.f7306a)) {
            composerImplV.o(796589201);
            j(composerImplV, 0);
            composerImplV.V(false);
        } else if (viewState instanceof InstoreCartContract.ViewState.Error) {
            composerImplV.o(796591301);
            d((InstoreCartContract.ViewState.Error) viewState, onErrorRetry, onNavigateUp, composerImplV, ((i3 << 3) & 896) | ((i3 >> 3) & 112));
            composerImplV.V(false);
        } else if (viewState instanceof InstoreCartContract.ViewState.InstoreCartContent) {
            composerImplV.o(796597472);
            b((InstoreCartContract.ViewState.InstoreCartContent) viewState, onNavigateUp, onAisleClicked, composerImplV, ((i3 >> 3) & 896) | (i3 & 112) | 3072);
            composerImplV.V(false);
        } else {
            if (!viewState.equals(InstoreCartContract.ViewState.Empty.f7303a)) {
                throw au.com.woolworths.android.onesite.a.w(796587266, composerImplV, false);
            }
            composerImplV.o(796604837);
            c(onNavigateUp, composerImplV, (i3 >> 3) & 14);
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.d(viewState, onNavigateUp, onErrorRetry, onAisleClicked, i, 18);
        }
    }

    public static final void j(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-783409737);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierA = TestTagKt.a(SizeKt.c, "loading_instore_cart_screen");
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
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
            CircularProgressIndicatorKt.b(null, 0L, BitmapDescriptorFactory.HUE_RED, 0, composerImplV, 0, 15);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.instore.wifi.ui.b(i, 21);
        }
    }

    public static final void k(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1299374260);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            TextKt.a("You are in In-store mode. To complete an order, switch to Delivery or Pick up mode.", CoreTheme.f(composerImplV).f5120a.b.f5123a, PaddingKt.g(BackgroundKt.b(PaddingKt.h(TestTagKt.a(Modifier.Companion.d, "instoreCartMessageBanner"), BitmapDescriptorFactory.HUE_RED, 16, 1), CoreTheme.b(composerImplV).b.f4803a.b, RoundedCornerShapeKt.b(8)), 12, 9), CoreTheme.b(composerImplV).e.d.d, null, 5, 0, false, 0, null, composerImplV, 6, 976);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.instore.wifi.ui.b(i, 22);
        }
    }

    public static final void l(CollapsingToolbarScope collapsingToolbarScope, CollapsingToolbarScaffoldState collapsingToolbarScaffoldState, String str, int i, Composer composer, int i2) {
        TextStyle textStyle;
        ComposerImpl composerImplV = composer.v(1130902393);
        int i3 = i2 | (composerImplV.I(collapsingToolbarScope) ? 4 : 2) | (composerImplV.n(collapsingToolbarScaffoldState) ? 32 : 16) | (composerImplV.n(str) ? 256 : 128) | (composerImplV.r(i) ? 2048 : 1024);
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float fJ = collapsingToolbarScaffoldState.f24914a.j();
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = SnapshotStateKt.d(new h(collapsingToolbarScaffoldState, 2));
                composerImplV.A(objG);
            }
            State state = (State) objG;
            composerImplV.V(false);
            float fB = MathHelpersKt.b(f7322a, b, fJ);
            float fB2 = MathHelpersKt.b(0, 16, fJ);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierA = collapsingToolbarScope.a(SizeKt.x(SizeKt.c(SizeKt.b(PaddingKt.j(WindowInsetsPadding_androidKt.b(companion), fB, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fB2, 6), BitmapDescriptorFactory.HUE_RED, c, 1), 1.0f), Alignment.Companion.k, false), Alignment.Companion.g);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            long jD = TextUnitKt.d(WxTheme.b(composerImplV).h.f2068a.fontSize, fJ, WxTheme.b(composerImplV).e.f2068a.fontSize);
            if (((Boolean) state.getD()).booleanValue()) {
                composerImplV.o(1316471217);
                textStyle = WxTheme.b(composerImplV).h;
            } else {
                composerImplV.o(1316472081);
                textStyle = WxTheme.b(composerImplV).e;
            }
            composerImplV.V(false);
            androidx.compose.material.TextKt.b(str, SizeKt.x(companion, Alignment.Companion.k, false), 0L, jD, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composerImplV, ((i3 >> 6) & 14) | 48, 0, 65524);
            androidx.compose.material.TextKt.b(i + " Items", SizeKt.x(TestTagKt.a(companion, "instoreCartTotalItemsCount"), Alignment.Companion.k, false), WxTheme.a(composerImplV).f(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, 48, 0, 65528);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c(collapsingToolbarScope, collapsingToolbarScaffoldState, str, i, i2);
        }
    }

    public static final void m(int i, int i2, Composer composer, String str, final Function0 function0) {
        String str2;
        int i3;
        String str3;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-651564346);
        int i4 = (composerImplV.I(function0) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            str2 = str;
        } else {
            str2 = str;
            i3 = i4 | (composerImplV.n(str2) ? 32 : 16);
        }
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            str3 = str2;
        } else {
            int i6 = ((i3 >> 3) & 14) | 100666368;
            str3 = i5 != 0 ? null : str2;
            composerImpl = composerImplV;
            TopNavBarKt.a(str3, null, Color.j, 0L, 0L, null, CoreTheme.c(composerImplV).f4876a, ComposableLambdaKt.c(-332153544, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartScreenKt$ToolbarTopNavBar$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        IconButtonKt.c(ArrowBackKt.a(), StringResources_androidKt.c(composer2, R.string.content_description_back_button), function0, null, false, null, WxTheme.a(composer2).h(), composer2, 0, 56);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, composerImpl, i6, 630);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(i, i2, str3, function0);
        }
    }
}
