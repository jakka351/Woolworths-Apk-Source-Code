package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material.TabKt;
import androidx.compose.material.TabPosition;
import androidx.compose.material.TabRowDefaults;
import androidx.compose.material.TabRowKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerKt;
import au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType;
import au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec;
import au.com.woolworths.design.core.ui.component.stable.corerow.SimpleRowKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.feature.shop.myorders.details.infomodal.DeliveryMethodStyle;
import au.com.woolworths.feature.shop.myorders.details.models.DeliveryMethodBulletInfo;
import au.com.woolworths.feature.shop.myorders.details.models.DeliveryMethodsTooltip;
import au.com.woolworths.feature.shop.myorders.details.models.DriverRatingAssetIcon;
import au.com.woolworths.feature.shop.myorders.details.models.DriverRatingBanner;
import au.com.woolworths.feature.shop.myorders.details.models.DriverRatingBroadcastBannerUI;
import au.com.woolworths.feature.shop.myorders.details.models.TooltipDeliveryMethodInfo;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ApplicableDeliveryMethodScreenKt {
    public static final void a(final DeliveryMethodsTooltip deliveryTooltip, final Function0 onUpClicked, Composer composer, int i) {
        Intrinsics.h(deliveryTooltip, "deliveryTooltip");
        Intrinsics.h(onUpClicked, "onUpClicked");
        ComposerImpl composerImplV = composer.v(221167247);
        int i2 = (composerImplV.I(deliveryTooltip) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onUpClicked) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ScaffoldKt.a(SizeKt.c, ComposableLambdaKt.c(1446565459, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.ApplicableDeliveryMethodScreenKt$ApplicableDeliveryMethodScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String str = deliveryTooltip.d;
                        long j = CoreTheme.b(composer2).e.f4848a.c;
                        CoreElevation coreElevation = CoreTheme.c(composer2).f4876a;
                        final Function0 function0 = onUpClicked;
                        TopNavBarKt.a(str, null, j, 0L, 0L, null, coreElevation, ComposableLambdaKt.c(-596139707, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.ApplicableDeliveryMethodScreenKt$ApplicableDeliveryMethodScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(ArrowBackKt.a(), StringResources_androidKt.c(composer3, R.string.content_description_back_button), function0, null, false, null, CoreTheme.b(composer3).e.c.f4854a, composer3, 0, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 100663296, 630);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0L, null, ComposableLambdaKt.c(-302425124, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.ApplicableDeliveryMethodScreenKt$ApplicableDeliveryMethodScreen$2

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    static {
                        int[] iArr = new int[DeliveryMethodStyle.values().length];
                        try {
                            iArr[0] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            DeliveryMethodStyle deliveryMethodStyle = DeliveryMethodStyle.d;
                            iArr[1] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            DeliveryMethodStyle deliveryMethodStyle2 = DeliveryMethodStyle.d;
                            iArr[2] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues padding = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(padding, "padding");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(padding) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierE = PaddingKt.e(Modifier.Companion.d, padding);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierE);
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
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        DeliveryMethodsTooltip deliveryMethodsTooltip = deliveryTooltip;
                        List list = deliveryMethodsTooltip.f;
                        int iOrdinal = (list.size() > 1 ? DeliveryMethodStyle.d : list.size() == 1 ? DeliveryMethodStyle.e : DeliveryMethodStyle.f).ordinal();
                        if (iOrdinal == 0) {
                            composer2.o(-218707767);
                            ApplicableDeliveryMethodScreenKt.d(deliveryMethodsTooltip, composer2, 0);
                            composer2.l();
                        } else if (iOrdinal == 1) {
                            composer2.o(-218567833);
                            ApplicableDeliveryMethodScreenKt.c((TooltipDeliveryMethodInfo) CollectionsKt.D(deliveryMethodsTooltip.f), composer2, 0);
                            composer2.l();
                        } else {
                            if (iOrdinal != 2) {
                                throw au.com.woolworths.android.onesite.a.x(composer2, -1808173589);
                            }
                            composer2.o(-218403347);
                            composer2.l();
                        }
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12582966, 124);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(deliveryTooltip, i, 0, onUpClicked);
        }
    }

    public static final void b(TooltipDeliveryMethodInfo tooltipDeliveryMethodInfo, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1265025256);
        if (((i | (composerImplV.I(tooltipDeliveryMethodInfo) ? 4 : 2)) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierB = ScrollKt.b(SizeKt.c, ScrollKt.a(composerImplV), true);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i2 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            String str = tooltipDeliveryMethodInfo.e;
            Painter painterA = PainterResources_androidKt.a(R.drawable.ic_product_image_unavailable_circle, 0, composerImplV);
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 16;
            SingletonAsyncImageKt.b(str, null, PaddingKt.h(SizeKt.q(companion, 108), f, BitmapDescriptorFactory.HUE_RED, 2), painterA, null, null, null, null, null, null, null, null, composerImplV, 432, 0, 32752);
            float f2 = 12;
            SpacerKt.a(composerImplV, SizeKt.g(companion, f2));
            TextKt.b(tooltipDeliveryMethodInfo.f, PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, 2), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.f5121a.f5122a, composerImplV, 48, 0, 65532);
            composerImplV = composerImplV;
            SpacerKt.a(composerImplV, SizeKt.g(companion, f2));
            composerImplV.o(-414731763);
            Iterator it = tooltipDeliveryMethodInfo.g.iterator();
            while (it.hasNext()) {
                String str2 = ((DeliveryMethodBulletInfo) it.next()).d;
                CoreRowSpec.Image.LocalImage localImage = new CoreRowSpec.Image.LocalImage(CoreTheme.e(composerImplV).j.q, ApplicableDeliveryMethodScreenKt$DeliveryMethodContent$1$1$1.d, BitmapDescriptorFactory.HUE_RED, 4);
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                if (objG == Composer.Companion.f1624a) {
                    objG = new au.com.woolworths.android.onesite.deeplink.h(20);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                SimpleRowKt.a(str2, (Function0) objG, null, null, null, localImage, null, null, null, composerImplV, 48, 476);
            }
            composerImplV.V(false);
            DriverRatingBanner driverRatingBanner = tooltipDeliveryMethodInfo.h;
            DriverRatingBroadcastBannerUI driverRatingBroadcastBannerUI = driverRatingBanner != null ? driverRatingBanner.d : null;
            composerImplV.o(-414718154);
            if (driverRatingBroadcastBannerUI != null) {
                BroadcastBannerType broadcastBannerTypeA = driverRatingBroadcastBannerUI.f.a();
                String str3 = driverRatingBroadcastBannerUI.d;
                DriverRatingAssetIcon driverRatingAssetIcon = driverRatingBroadcastBannerUI.g;
                Intrinsics.f(driverRatingAssetIcon, "null cannot be cast to non-null type au.com.woolworths.feature.shop.myorders.details.models.DriverRatingAssetIcon.DriverRatingHostedIcon");
                BroadcastBannerKt.a(broadcastBannerTypeA, str3, ((DriverRatingAssetIcon.DriverRatingHostedIcon) driverRatingAssetIcon).d, PaddingKt.g(companion, f, 8), null, null, null, driverRatingBroadcastBannerUI.e, null, composerImplV, 3072, 368);
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(tooltipDeliveryMethodInfo, i, 1);
        }
    }

    public static final void c(TooltipDeliveryMethodInfo tooltipDeliveryMethodInfo, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1169173828);
        int i2 = i | (composerImplV.I(tooltipDeliveryMethodInfo) ? 4 : 2);
        if ((i2 & 3) == 2 && composerImplV.c()) {
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
            SpacerKt.a(composerImplV, SizeKt.g(companion, 24));
            TextKt.b(tooltipDeliveryMethodInfo.d, PaddingKt.h(companion, 16, BitmapDescriptorFactory.HUE_RED, 2), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).e.f5133a.b, composerImplV, 48, 0, 65532);
            composerImpl = composerImplV;
            SpacerKt.a(composerImpl, SizeKt.g(companion, 12));
            b(tooltipDeliveryMethodInfo, composerImpl, i2 & 14);
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(tooltipDeliveryMethodInfo, i, 0);
        }
    }

    public static final void d(final DeliveryMethodsTooltip deliveryMethodsTooltip, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1632946864);
        if ((((composerImplV.I(deliveryMethodsTooltip) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            TextKt.b(deliveryMethodsTooltip.e, PaddingKt.f(SizeKt.e(Modifier.Companion.d, 1.0f), 16), CoreTheme.b(composerImplV).e.d.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.f5121a.f5122a, composerImplV, 48, 0, 65528);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objG;
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(deliveryMethodsTooltip);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.feature.shop.myorders.details.infomodal.a(deliveryMethodsTooltip, 6);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            final PagerState pagerStateC = PagerStateKt.c((Function0) objG2, composerImplV, 54, 0);
            TabRowKt.b(pagerStateC.j(), null, CoreTheme.b(composerImplV).e.f4848a.c, CoreTheme.b(composerImplV).f4782a.d.b.f4798a, ComposableLambdaKt.c(-1829648152, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.ApplicableDeliveryMethodScreenKt$DeliveryMethodTabs$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    List tabPositions = (List) obj;
                    Composer composer2 = (Composer) obj2;
                    ((Number) obj3).intValue();
                    Intrinsics.h(tabPositions, "tabPositions");
                    TabRowDefaults.f1337a.b(BitmapDescriptorFactory.HUE_RED, 0, 2, CoreTheme.b(composer2).e.d.f4856a, composer2, TabRowDefaults.c((TabPosition) tabPositions.get(pagerStateC.j())));
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableSingletons$ApplicableDeliveryMethodScreenKt.f7791a, ComposableLambdaKt.c(847313640, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.ApplicableDeliveryMethodScreenKt$DeliveryMethodTabs$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final int i2 = 0;
                        for (Object obj3 : deliveryMethodsTooltip.f) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            final TooltipDeliveryMethodInfo tooltipDeliveryMethodInfo = (TooltipDeliveryMethodInfo) obj3;
                            final PagerState pagerState = pagerStateC;
                            boolean z = pagerState.j() == i2;
                            composer2.o(-1746271574);
                            final CoroutineScope coroutineScope2 = coroutineScope;
                            boolean zI2 = composer2.I(coroutineScope2) | composer2.n(pagerState) | composer2.r(i2);
                            Object objG3 = composer2.G();
                            if (zI2 || objG3 == Composer.Companion.f1624a) {
                                objG3 = new Function0() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.c
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        BuildersKt.c(coroutineScope2, null, null, new ApplicableDeliveryMethodScreenKt$DeliveryMethodTabs$2$1$1$1$1(pagerState, i2, null), 3);
                                        return Unit.f24250a;
                                    }
                                };
                                composer2.A(objG3);
                            }
                            composer2.l();
                            TabKt.b(z, (Function0) objG3, null, false, CoreTheme.b(composer2).e.d.f4856a, CoreTheme.b(composer2).e.d.b, ComposableLambdaKt.c(1629336886, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.ApplicableDeliveryMethodScreenKt$DeliveryMethodTabs$2$1$2
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    ColumnScope Tab = (ColumnScope) obj4;
                                    Composer composer3 = (Composer) obj5;
                                    int iIntValue = ((Number) obj6).intValue();
                                    Intrinsics.h(Tab, "$this$Tab");
                                    if ((iIntValue & 17) == 16 && composer3.c()) {
                                        composer3.j();
                                    } else {
                                        TextKt.b(tooltipDeliveryMethodInfo.d, PaddingKt.h(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, 12, 1), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer3).e.b.b, composer3, 48, 0, 65532);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2), composer2, 12582912, 28);
                            i2 = i3;
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1794048, 2);
            composerImpl = composerImplV;
            PagerKt.a(pagerStateC, null, null, null, 0, BitmapDescriptorFactory.HUE_RED, null, null, false, null, null, null, ComposableLambdaKt.c(1981828689, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.ApplicableDeliveryMethodScreenKt$DeliveryMethodTabs$3
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    PagerScope HorizontalPager = (PagerScope) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    Composer composer2 = (Composer) obj3;
                    ((Number) obj4).intValue();
                    Intrinsics.h(HorizontalPager, "$this$HorizontalPager");
                    Modifier modifierH = PaddingKt.h(SizeKt.c, BitmapDescriptorFactory.HUE_RED, 16, 1);
                    MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
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
                    Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                    Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                    Function2 function2 = ComposeUiNode.Companion.j;
                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                        androidx.camera.core.impl.b.z(p, composer2, p, function2);
                    }
                    Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                    ApplicableDeliveryMethodScreenKt.b((TooltipDeliveryMethodInfo) deliveryMethodsTooltip.f.get(iIntValue), composer2, 0);
                    composer2.f();
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 0, 24576, 16382);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.homepage.presentation.marketplace.a(i, 9, deliveryMethodsTooltip);
        }
    }
}
