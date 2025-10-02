package au.com.woolworths.feature.shop.modeselector.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import au.com.woolworths.compose.utils.graphics.ForwardingPainterKt;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.h;
import au.com.woolworths.feature.shop.modeselector.model.IconTextBanner;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "topPadding", "mode-selector_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FeaturesSectionKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ShoppingModeSection.ShoppingModeSelectorStoreFeaturesData f7547a = new ShoppingModeSection.ShoppingModeSelectorStoreFeaturesData("In-store features", CollectionsKt.R(new IconTextBanner("", "Current Stock Availability"), new IconTextBanner("", "Product Aisle Locations"), new IconTextBanner("", "In-store Wifi"), new IconTextBanner("", "Scan&Go")));

    public static final void a(IconTextBanner feature, Modifier modifier, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        Intrinsics.h(feature, "feature");
        ComposerImpl composerImplV = composer.v(839443680);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(feature) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new c(1);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifier, true, (Function1) objG);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
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
            Painter painterA = ForwardingPainterKt.a(PainterResources_androidKt.a(R.drawable.oval_placeholder, 0, composerImplV), ColorFilter.Companion.a(ToneColors.j), null, 10);
            SingletonAsyncImageKt.b(feature.f7527a, null, SizeKt.q(Modifier.Companion.d, 40), painterA, painterA, null, null, null, null, null, ContentScale.Companion.f1880a, null, composerImplV, 432, 6, 31712);
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = SnapshotStateKt.f(new Dp(16));
                composerImplV.A(objG2);
            }
            MutableState mutableState = (MutableState) objG2;
            composerImplV.V(false);
            Modifier modifierJ = PaddingKt.j(modifier, BitmapDescriptorFactory.HUE_RED, ((Dp) mutableState.getD()).d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            TextStyle textStyle = WxTheme.b(composerImplV).s;
            String str = feature.b;
            TextAlign textAlign = new TextAlign(3);
            composerImplV.o(5004770);
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b(mutableState, 13);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            TextKt.b(str, modifierJ, 0L, 0L, null, 0L, null, textAlign, 0L, 2, false, 2, 0, (Function1) objG3, textStyle, composerImplV, 0, 199728, 22012);
            composerImpl = composerImplV;
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new h(feature, i, 12, modifier);
        }
    }

    public static final void b(final ShoppingModeSection.ShoppingModeSelectorStoreFeaturesData data, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        Intrinsics.h(data, "data");
        ComposerImpl composerImplV = composer.v(-428392460);
        int i3 = i | (composerImplV.I(data) ? 4 : 2);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion.d;
            }
            Modifier modifier3 = modifier;
            SurfaceKt.a(modifier3, RoundedCornerShapeKt.b(8), 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(2039634744, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.modeselector.ui.FeaturesSectionKt$FeaturesSection$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = 16;
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierH = PaddingKt.h(companion, BitmapDescriptorFactory.HUE_RED, f, 1);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
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
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        Modifier modifierJ = PaddingKt.j(companion, 14, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 6);
                        ShoppingModeSection.ShoppingModeSelectorStoreFeaturesData shoppingModeSelectorStoreFeaturesData = data;
                        TextKt.b(shoppingModeSelectorStoreFeaturesData.f7536a, modifierJ, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).m, composer2, 48, 0, 65532);
                        final float f2 = 95;
                        PeekLazyRowKt.b(shoppingModeSelectorStoreFeaturesData.b, f2, SizeKt.e(companion, 1.0f), 0.5d, null, PaddingKt.a(10, BitmapDescriptorFactory.HUE_RED, 2), Arrangement.f, null, null, false, ComposableLambdaKt.c(1316591171, new Function4<LazyItemScope, IconTextBanner, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.modeselector.ui.FeaturesSectionKt$FeaturesSection$1$1$1
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                                LazyItemScope PeekLazyRow = (LazyItemScope) obj3;
                                IconTextBanner feature = (IconTextBanner) obj4;
                                Composer composer3 = (Composer) obj5;
                                int iIntValue = ((Number) obj6).intValue();
                                Intrinsics.h(PeekLazyRow, "$this$PeekLazyRow");
                                Intrinsics.h(feature, "feature");
                                if ((iIntValue & 48) == 0) {
                                    iIntValue |= composer3.n(feature) ? 32 : 16;
                                }
                                if ((iIntValue & 145) == 144 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    FeaturesSectionKt.a(feature, SizeKt.o(Modifier.Companion.d, f2), composer3, ((iIntValue >> 3) & 14) | 48);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 12783024);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i3 >> 3) & 14) | 1572864, 60);
            modifier2 = modifier3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.a(data, modifier2, i, i2, 6);
        }
    }
}
