package au.com.woolworths.feature.shop.instore.navigation.productfinder;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.LinearGradient;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.button.TertiaryButtonKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.contentpage.ui.n;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.h;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderContract;
import au.com.woolworths.foundation.shop.instore.navigation.productfinder.ProductFinderSearchButtonKt;
import au.com.woolworths.foundation.shop.instore.navigation.productfinder.ProductFinderTitleKt;
import au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.wx.CollapsingToolbarScaffoldKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003¨\u0006\u0003²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "heroTile1Height", "heroTile2Height", "instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductFinderScreenKt {
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v25, types: [androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r0v31 */
    public static final void a(final List list, final List list2, final ProductFinderContract.LocationServicesUnavailableState locationServicesUnavailableState, final float f, final NestedScrollConnection nestedScrollConnection, final Function1 function1, final Function1 function12, final Function0 function0, final Modifier modifier, Composer composer, final int i) {
        int i2;
        ?? r0;
        float f2;
        boolean z;
        Unit unit;
        Modifier.Companion companion;
        ComposerImpl composerImplV = composer.v(-220122945);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(list2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.r(locationServicesUnavailableState == null ? -1 : locationServicesUnavailableState.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.q(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(nestedScrollConnection) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(function12) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.I(function0) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerImplV.n(modifier) ? 67108864 : 33554432;
        }
        if ((38347923 & i2) == 38347922 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierE = SizeKt.e(modifier, 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
            int i3 = i2;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i4 = composerImplV.P;
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
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierE2 = SizeKt.e(companion2, 1.0f);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
            Modifier modifierB = ScrollKt.b(NestedScrollModifierKt.a(PaddingKt.j(columnScopeInstance.a(modifierE2, 1.0f, true), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), nestedScrollConnection, null), ScrollKt.a(composerImplV), true);
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierB);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            composerImplV.o(1453454227);
            if (locationServicesUnavailableState == null) {
                r0 = 0;
                f2 = 1.0f;
                z = false;
                unit = null;
            } else {
                composerImplV.o(-1633490746);
                boolean zR = composerImplV.r(locationServicesUnavailableState.ordinal()) | ((i3 & 3670016) == 1048576);
                Object objG = composerImplV.G();
                if (zR || objG == Composer.Companion.f1624a) {
                    objG = new n(17, function12, locationServicesUnavailableState);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                r0 = 0;
                LocationServicesUnavailableUiKt.a(locationServicesUnavailableState, (Function0) objG, null, composerImplV, 0);
                f2 = 1.0f;
                z = false;
                DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 7, 0L, composerImplV, null);
                composerImplV = composerImplV;
                unit = Unit.f24250a;
            }
            composerImplV.V(z);
            composerImplV.o(1453453234);
            if (unit == null) {
                SpacerKt.c(columnScopeInstance, 8, composerImplV, 48);
            }
            composerImplV.V(z);
            List list3 = (list == null || list.isEmpty()) ? r0 : list;
            composerImplV.o(1453466401);
            if (list3 == null) {
                companion = companion2;
            } else {
                d((i3 >> 18) & 112, composerImplV, r0, StringResources_androidKt.c(composerImplV, R.string.recent), function0);
                composerImplV.o(1453471068);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    e((String) it.next(), function1, 2131231405, SizeKt.e(companion2, f2), composerImplV, ((i3 >> 12) & 112) | 3072);
                }
                companion = companion2;
                composerImplV.V(z);
            }
            composerImplV.V(z);
            List list4 = (list2 == null || list2.isEmpty()) ? r0 : list2;
            composerImplV.o(1453483060);
            if (list4 != null) {
                d(48, composerImplV, r0, StringResources_androidKt.c(composerImplV, R.string.popular), r0);
                composerImplV.o(1453487355);
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    e((String) it2.next(), function1, R.drawable.ic_search, SizeKt.e(companion, f2), composerImplV, ((i3 >> 12) & 112) | 3072);
                }
                composerImplV.V(z);
            }
            android.support.v4.media.session.a.C(composerImplV, z, true, true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.shop.instore.navigation.productfinder.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ProductFinderScreenKt.a(list, list2, locationServicesUnavailableState, f, nestedScrollConnection, function1, function12, function0, modifier, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final String str, final Function0 function0, final Function0 function02, final Function0 function03, final float f, final Modifier modifier, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(1758869860);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.I(function0) ? 32 : 16) | (composerImplV.I(function02) ? 256 : 128) | (composerImplV.I(function03) ? 2048 : 1024);
        if ((i2 & 66707) == 66706 && composerImplV.c()) {
            composerImplV.j();
        } else {
            LinearGradient linearGradientA = Brush.Companion.a(CollectionsKt.R(new Color(ColorKt.d(4279863619L)), new Color(ColorKt.d(4284723797L))), 0L, 0L, 14);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierA = BackgroundKt.a(companion, linearGradientA);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
            ComposeUiNode.e3.getClass();
            Function0 function04 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function04);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicyD, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifier);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function04);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
            SpacerKt.c(columnScopeInstance, 92, composerImplV, 54);
            ImageKt.a(PainterResources_androidKt.a(R.drawable.hero_navigate, 0, composerImplV), "", PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 4, BitmapDescriptorFactory.HUE_RED, 11), null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 432, 120);
            float f2 = 16;
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.what_can_we_help_you_find), PaddingKt.h(companion, f2, BitmapDescriptorFactory.HUE_RED, 2), WxTheme.a(composerImplV).e(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).f, composerImplV, 48, 0, 65528);
            SpacerKt.c(columnScopeInstance, f2, composerImplV, 54);
            float f3 = 24;
            int i5 = i2 >> 3;
            ProductFinderSearchButtonKt.a(function0, Color.f, ToneColors.g, PaddingKt.i(SizeKt.e(companion, 1.0f), f2, 0, f2, f3), StringResources_androidKt.c(composerImplV, R.string.locate_a_product_on_a_map), composerImplV, (i5 & 14) | 3120, 0);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(0);
                composerImplV.A(objG);
            }
            MutableState mutableState = (MutableState) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == composer$Companion$Empty$1) {
                objD = SnapshotStateKt.f(0);
                composerImplV.A(objD);
            }
            MutableState mutableState2 = (MutableState) objD;
            composerImplV.V(false);
            int iMax = Math.max(((Number) mutableState.getD()).intValue(), ((Number) mutableState2.getD()).intValue());
            Modifier modifierH = PaddingKt.h(SizeKt.e(companion, 1.0f), f2, BitmapDescriptorFactory.HUE_RED, 2);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(f2), Alignment.Companion.j, composerImplV, 6);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierH);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function04);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            Modifier modifierA2 = rowScopeInstance.a(companion, 1.0f, true);
            composerImplV.o(5004770);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b(mutableState, 11);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier modifierA3 = OnGloballyPositionedModifierKt.a(modifierA2, (Function1) objG2);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.h;
            HeroTileKt.a(R.drawable.hero_store, (i5 & 112) | ((i2 << 6) & 896), composerImplV, SizeKt.i(modifierA3, ((Density) composerImplV.x(staticProvidableCompositionLocal)).B(iMax), BitmapDescriptorFactory.HUE_RED, 2), str, StringResources_androidKt.c(composerImplV, R.string.hero_tile_store_description), function02);
            Modifier modifierA4 = rowScopeInstance.a(companion, 1.0f, true);
            composerImplV.o(5004770);
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b(mutableState2, 12);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            HeroTileKt.a(R.drawable.hero_olive, (i2 >> 6) & 112, composerImplV, SizeKt.i(OnGloballyPositionedModifierKt.a(modifierA4, (Function1) objG3), ((Density) composerImplV.x(staticProvidableCompositionLocal)).B(iMax), BitmapDescriptorFactory.HUE_RED, 2), StringResources_androidKt.c(composerImplV, R.string.hero_tile_voice_search_title), StringResources_androidKt.c(composerImplV, R.string.hero_tile_voice_search_description), function03);
            composerImplV = composerImplV;
            composerImplV.V(true);
            SpacerKt.c(columnScopeInstance, f3, composerImplV, 54);
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(str, function0, function02, function03, f, modifier, i) { // from class: au.com.woolworths.feature.shop.instore.navigation.productfinder.c
                public final /* synthetic */ String d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 g;
                public final /* synthetic */ float h;
                public final /* synthetic */ Modifier i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(196609);
                    ProductFinderScreenKt.b(this.d, this.e, this.f, this.g, this.h, this.i, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void c(final ProductFinderContract.ViewState viewState, final ProductFinderCallbacks callbacks, Composer composer, int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(callbacks, "callbacks");
        ComposerImpl composerImplV = composer.v(-2107218201);
        int i2 = (composerImplV.I(viewState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(callbacks) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(5004770);
            boolean z = (i2 & 112) == 32;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new ProductFinderScreenKt$ProductFinderScreen$1$1(callbacks, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG);
            composerImpl = composerImplV;
            CollapsingToolbarScaffoldKt.a(ComposableLambdaKt.c(149690281, new Function3<Float, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderScreenKt$ProductFinderScreen$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float fFloatValue = ((Number) obj).floatValue();
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.q(fFloatValue) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        ImageVector imageVectorA = ArrowBackKt.a();
                        composer2.o(5004770);
                        ProductFinderCallbacks productFinderCallbacks = callbacks;
                        boolean zI = composer2.I(productFinderCallbacks);
                        Object objG2 = composer2.G();
                        if (zI || objG2 == Composer.Companion.f1624a) {
                            ProductFinderScreenKt$ProductFinderScreen$2$1$1 productFinderScreenKt$ProductFinderScreen$2$1$1 = new ProductFinderScreenKt$ProductFinderScreen$2$1$1(0, productFinderCallbacks, ProductFinderCallbacks.class, "onBackClick", "onBackClick()V", 0);
                            composer2.A(productFinderScreenKt$ProductFinderScreen$2$1$1);
                            objG2 = productFinderScreenKt$ProductFinderScreen$2$1$1;
                        }
                        composer2.l();
                        IconButtonKt.c(imageVectorA, "", (Function0) ((KFunction) objG2), null, false, ColorKt.h(WxTheme.a(composer2).e(), fFloatValue, WxTheme.a(composer2).h()), composer2, 48, 24);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(-86927544, new Function3<Float, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderScreenKt$ProductFinderScreen$3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float fFloatValue = ((Number) obj).floatValue();
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.q(fFloatValue) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
                        String str = viewState.f7436a;
                        float f = 1.0f - fFloatValue;
                        composer2.o(5004770);
                        ProductFinderCallbacks productFinderCallbacks = callbacks;
                        boolean zI = composer2.I(productFinderCallbacks);
                        Object objG2 = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (zI || objG2 == composer$Companion$Empty$1) {
                            ProductFinderScreenKt$ProductFinderScreen$3$1$1 productFinderScreenKt$ProductFinderScreen$3$1$1 = new ProductFinderScreenKt$ProductFinderScreen$3$1$1(0, productFinderCallbacks, ProductFinderCallbacks.class, "onSearchClick", "onSearchClick()V", 0);
                            composer2.A(productFinderScreenKt$ProductFinderScreen$3$1$1);
                            objG2 = productFinderScreenKt$ProductFinderScreen$3$1$1;
                        }
                        KFunction kFunction = (KFunction) objG2;
                        composer2.l();
                        composer2.o(5004770);
                        ProductFinderCallbacks productFinderCallbacks2 = callbacks;
                        boolean zI2 = composer2.I(productFinderCallbacks2);
                        Object objG3 = composer2.G();
                        if (zI2 || objG3 == composer$Companion$Empty$1) {
                            objG3 = new ProductFinderScreenKt$ProductFinderScreen$3$2$1(0, productFinderCallbacks2, ProductFinderCallbacks.class, "onStoreDetailsClick", "onStoreDetailsClick()V", 0);
                            composer2.A(objG3);
                        }
                        KFunction kFunction2 = (KFunction) objG3;
                        composer2.l();
                        composer2.o(5004770);
                        ProductFinderCallbacks productFinderCallbacks3 = callbacks;
                        boolean zI3 = composer2.I(productFinderCallbacks3);
                        Object objG4 = composer2.G();
                        if (zI3 || objG4 == composer$Companion$Empty$1) {
                            ProductFinderScreenKt$ProductFinderScreen$3$3$1 productFinderScreenKt$ProductFinderScreen$3$3$1 = new ProductFinderScreenKt$ProductFinderScreen$3$3$1(0, productFinderCallbacks3, ProductFinderCallbacks.class, "onOliveClick", "onOliveClick()V", 0);
                            composer2.A(productFinderScreenKt$ProductFinderScreen$3$3$1);
                            objG4 = productFinderScreenKt$ProductFinderScreen$3$3$1;
                        }
                        composer2.l();
                        ProductFinderScreenKt.b(str, (Function0) kFunction, (Function0) kFunction2, (Function0) ((KFunction) objG4), f, modifierE, composer2, 196608);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), SizeKt.c, null, 0L, 0L, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(-1506634494, new Function3<Float, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderScreenKt$ProductFinderScreen$4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float fFloatValue = ((Number) obj).floatValue();
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.q(fFloatValue) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else if (fFloatValue > 0.5f) {
                        Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer2, 54);
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
                        Updater.b(composer2, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        ProductFinderTitleKt.a(fFloatValue, (iIntValue << 3) & 112, 4, composer2, null, viewState.f7436a);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, ComposableLambdaKt.c(-1571106864, new Function4<ColumnScope, Float, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderScreenKt$ProductFinderScreen$5
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    ColumnScope CollapsingToolbarScaffold = (ColumnScope) obj;
                    float fFloatValue = ((Number) obj2).floatValue();
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Number) obj4).intValue();
                    Intrinsics.h(CollapsingToolbarScaffold, "$this$CollapsingToolbarScaffold");
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= composer2.q(fFloatValue) ? 32 : 16;
                    }
                    if ((iIntValue & 145) == 144 && composer2.c()) {
                        composer2.j();
                    } else if (fFloatValue > 0.5f) {
                        composer2.o(5004770);
                        ProductFinderCallbacks productFinderCallbacks = callbacks;
                        boolean zI = composer2.I(productFinderCallbacks);
                        Object objG2 = composer2.G();
                        if (zI || objG2 == Composer.Companion.f1624a) {
                            ProductFinderScreenKt$ProductFinderScreen$5$1$1 productFinderScreenKt$ProductFinderScreen$5$1$1 = new ProductFinderScreenKt$ProductFinderScreen$5$1$1(0, productFinderCallbacks, ProductFinderCallbacks.class, "onSearchClick", "onSearchClick()V", 0);
                            composer2.A(productFinderScreenKt$ProductFinderScreen$5$1$1);
                            objG2 = productFinderScreenKt$ProductFinderScreen$5$1$1;
                        }
                        composer2.l();
                        float f = 16;
                        ProductFinderSearchButtonKt.a((Function0) ((KFunction) objG2), ToneColors.j, ToneColors.c, PaddingKt.i(SizeKt.e(Modifier.Companion.d, 1.0f), f, 0, f, 24), StringResources_androidKt.c(composer2, R.string.locate_a_product_on_a_map), composer2, 3072, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, ComposableLambdaKt.c(-272464608, new Function5<PaddingValues, NestedScrollConnection, Float, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderScreenKt$ProductFinderScreen$6
                @Override // kotlin.jvm.functions.Function5
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    Composer$Companion$Empty$1 composer$Companion$Empty$1;
                    PaddingValues paddingValues = (PaddingValues) obj;
                    NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) obj2;
                    ((Number) obj3).floatValue();
                    Composer composer2 = (Composer) obj4;
                    int iIntValue = ((Number) obj5).intValue();
                    Intrinsics.h(paddingValues, "paddingValues");
                    Intrinsics.h(nestedScrollConnection, "nestedScrollConnection");
                    Modifier modifierA = WindowInsetsPadding_androidKt.a(SizeKt.e(Modifier.Companion.d, 1.0f));
                    ProductFinderContract.ViewState viewState2 = viewState;
                    List list = viewState2.b;
                    List list2 = viewState2.c;
                    ProductFinderContract.LocationServicesUnavailableState locationServicesUnavailableState = viewState2.d;
                    float b = paddingValues.getB();
                    composer2.o(5004770);
                    ProductFinderCallbacks productFinderCallbacks = callbacks;
                    boolean zI = composer2.I(productFinderCallbacks);
                    Object objG2 = composer2.G();
                    Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                    if (zI || objG2 == composer$Companion$Empty$12) {
                        composer$Companion$Empty$1 = composer$Companion$Empty$12;
                        ProductFinderScreenKt$ProductFinderScreen$6$1$1 productFinderScreenKt$ProductFinderScreen$6$1$1 = new ProductFinderScreenKt$ProductFinderScreen$6$1$1(1, productFinderCallbacks, ProductFinderCallbacks.class, "onSearchSuggestionClick", "onSearchSuggestionClick(Ljava/lang/String;)V", 0);
                        composer2.A(productFinderScreenKt$ProductFinderScreen$6$1$1);
                        objG2 = productFinderScreenKt$ProductFinderScreen$6$1$1;
                    } else {
                        composer$Companion$Empty$1 = composer$Companion$Empty$12;
                    }
                    KFunction kFunction = (KFunction) objG2;
                    composer2.l();
                    composer2.o(5004770);
                    ProductFinderCallbacks productFinderCallbacks2 = callbacks;
                    boolean zI2 = composer2.I(productFinderCallbacks2);
                    Object objG3 = composer2.G();
                    if (zI2 || objG3 == composer$Companion$Empty$1) {
                        ProductFinderScreenKt$ProductFinderScreen$6$2$1 productFinderScreenKt$ProductFinderScreen$6$2$1 = new ProductFinderScreenKt$ProductFinderScreen$6$2$1(1, productFinderCallbacks2, ProductFinderCallbacks.class, "onLocationServicesUnavailableActionClick", "onLocationServicesUnavailableActionClick(Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$LocationServicesUnavailableState;)V", 0);
                        composer2.A(productFinderScreenKt$ProductFinderScreen$6$2$1);
                        objG3 = productFinderScreenKt$ProductFinderScreen$6$2$1;
                    }
                    KFunction kFunction2 = (KFunction) objG3;
                    composer2.l();
                    composer2.o(5004770);
                    ProductFinderCallbacks productFinderCallbacks3 = callbacks;
                    boolean zI3 = composer2.I(productFinderCallbacks3);
                    Object objG4 = composer2.G();
                    if (zI3 || objG4 == composer$Companion$Empty$1) {
                        objG4 = new ProductFinderScreenKt$ProductFinderScreen$6$3$1(0, productFinderCallbacks3, ProductFinderCallbacks.class, "onClearRecentClick", "onClearRecentClick()V", 0);
                        composer2.A(objG4);
                    }
                    composer2.l();
                    ProductFinderScreenKt.a(list, list2, locationServicesUnavailableState, b, nestedScrollConnection, (Function1) kFunction, (Function1) kFunction2, (Function0) ((KFunction) objG4), modifierA, composer2, 57344 & (iIntValue << 9));
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 817889718, 48, 1400);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new h(viewState, i, 9, callbacks);
        }
    }

    public static final void d(int i, Composer composer, Modifier modifier, String str, Function0 function0) {
        int i2;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(562608932);
        if ((i & 6) == 0) {
            i2 = i | (composerImplV.n(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        int i3 = i2 | KyberEngine.KyberPolyBytes;
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(PaddingKt.j(SizeKt.j(companion, 48), 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), 1.0f);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g, Alignment.Companion.k, composerImplV, 54);
            int i4 = composerImplV.P;
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
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerImplV, i3 & 14, 0, 131070);
            composerImplV = composerImplV;
            composerImplV.o(-332697189);
            if (function0 != null) {
                TertiaryButtonKt.a(StringResources_androidKt.c(composerImplV, R.string.clear), function0, null, false, false, null, null, composerImplV, i3 & 112, 124);
            }
            composerImplV.V(false);
            composerImplV.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.offers.ui.d(str, function0, modifier2, i, 2);
        }
    }

    public static final void e(String str, Function1 function1, int i, Modifier modifier, Composer composer, int i2) {
        int i3;
        ComposerImpl composerImplV = composer.v(1367583681);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.n(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.I(function1) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.r(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerImplV.n(modifier) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-1633490746);
            int i4 = i3 & 14;
            boolean z = (i4 == 4) | ((i3 & 112) == 32);
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new d(function1, str, 0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierG = PaddingKt.g(ClickableKt.d(modifier, false, null, null, (Function0) objG, 7), 16, 8);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i5 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            ImageKt.a(PainterResources_androidKt.a(i, (i3 >> 6) & 14, composerImplV), null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 48, 124);
            SpacerKt.d(RowScopeInstance.f974a, 12, composerImplV, 54);
            TextKt.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerImplV, i4, 0, 131070);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.base.rewards.account.ui.a(str, function1, i, modifier, i2);
        }
    }
}
