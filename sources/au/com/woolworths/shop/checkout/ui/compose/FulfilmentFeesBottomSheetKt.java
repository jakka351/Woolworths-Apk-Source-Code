package au.com.woolworths.shop.checkout.ui.compose;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.DragHandleBehaviour;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.ModalBottomSheetKt;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec;
import au.com.woolworths.design.core.ui.component.stable.corerow.SimpleRowKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.product.list.d0;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.markdown.compat.MarkdownTextViewStyle;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.corerow.ImageUtilKt;
import au.com.woolworths.sdui.common.corerow.model.CoreRowModel;
import au.com.woolworths.sdui.shop.alert.StandardAlertKt;
import au.com.woolworths.sdui.shop.alert.model.BasicInsetAlertModel;
import au.com.woolworths.sdui.shop.broadcastbanner.BroadcastBannerKt;
import au.com.woolworths.sdui.shop.broadcastbanner.model.BasicCoreBroadcastBannerModel;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemData;
import au.com.woolworths.shop.checkout.domain.model.CheckoutTermsConditions;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentExtraInfo;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentFeeItem;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentFeePriceInfo;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentFeesInfoSection;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentInfoRowAccordion;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsActivity;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
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
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isExpanded", "shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class FulfilmentFeesBottomSheetKt {
    public static final void a(FulfilmentExtraInfo fulfilmentExtraInfo, final Function1 function1, final Function1 function12, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-860747254);
        if (((i | (composerImplV.I(fulfilmentExtraInfo) ? 4 : 2) | (composerImplV.I(function1) ? 32 : 16) | (composerImplV.I(function12) ? 256 : 128) | (composerImplV.n(modifier) ? 2048 : 1024)) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierB = ScrollKt.b(modifier, ScrollKt.a(composerImplV), true);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
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
            composerImplV.o(-192510196);
            for (Object obj : fulfilmentExtraInfo.b) {
                if (obj instanceof BasicInsetAlertModel) {
                    composerImplV.o(1464533091);
                    final BasicInsetAlertModel basicInsetAlertModel = (BasicInsetAlertModel) obj;
                    CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(2090277699, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.compose.FulfilmentFeesBottomSheetKt$FulfilmentFeeBottomSheetContentUI$1$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            Composer composer2 = (Composer) obj2;
                            if ((((Number) obj3).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                Modifier modifierF = PaddingKt.f(SizeKt.e(Modifier.Companion.d, 1.0f), 16);
                                composer2.o(5004770);
                                Function1 function13 = function12;
                                boolean zN = composer2.n(function13);
                                Object objG = composer2.G();
                                if (zN || objG == Composer.Companion.f1624a) {
                                    objG = new d(function13, 1);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                StandardAlertKt.a(basicInsetAlertModel, (Function1) objG, modifierF, null, composer2, 392, 8);
                            }
                            return Unit.f24250a;
                        }
                    }, composerImplV));
                    composerImplV.V(false);
                } else if (obj instanceof BasicCoreBroadcastBannerModel) {
                    composerImplV.o(1465093199);
                    final BasicCoreBroadcastBannerModel basicCoreBroadcastBannerModel = (BasicCoreBroadcastBannerModel) obj;
                    CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(1628347194, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.compose.FulfilmentFeesBottomSheetKt$FulfilmentFeeBottomSheetContentUI$1$1$2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            Composer composer2 = (Composer) obj2;
                            if ((((Number) obj3).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                Modifier modifierJ = PaddingKt.j(PaddingKt.h(SizeKt.e(Modifier.Companion.d, 1.0f), 16, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, 24, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                                composer2.o(-1633490746);
                                Function1 function13 = function1;
                                boolean zN = composer2.n(function13);
                                BasicCoreBroadcastBannerModel basicCoreBroadcastBannerModel2 = basicCoreBroadcastBannerModel;
                                boolean zI = zN | composer2.I(basicCoreBroadcastBannerModel2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new f(0, function13, basicCoreBroadcastBannerModel2);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                BroadcastBannerKt.a(basicCoreBroadcastBannerModel2, (Function1) objG, modifierJ, null, null, null, composer2, 392, 56);
                            }
                            return Unit.f24250a;
                        }
                    }, composerImplV));
                    composerImplV.V(false);
                } else {
                    boolean z = obj instanceof CheckoutTermsConditions;
                    Modifier.Companion companion = Modifier.Companion.d;
                    if (z) {
                        composerImplV.o(1465600824);
                        g(48, composerImplV, PaddingKt.j(PaddingKt.h(SizeKt.e(companion, 1.0f), 16, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, 24, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), ((CheckoutTermsConditions) obj).f10590a);
                        composerImplV.V(false);
                    } else if (obj instanceof FulfilmentFeesInfoSection) {
                        composerImplV.o(1465978528);
                        e((FulfilmentFeesInfoSection) obj, PaddingKt.j(PaddingKt.h(SizeKt.e(companion, 1.0f), 16, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, 24, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), composerImplV, 48);
                        composerImplV.V(false);
                    } else if (obj instanceof FulfilmentInfoRowAccordion) {
                        composerImplV.o(1466345351);
                        f((FulfilmentInfoRowAccordion) obj, SizeKt.e(companion, 1.0f), composerImplV, 48);
                        composerImplV.V(false);
                    } else {
                        composerImplV.o(1466539907);
                        composerImplV.V(false);
                    }
                }
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a((Object) fulfilmentExtraInfo, (Object) function1, (Object) function12, modifier, i, 29);
        }
    }

    public static final void b(final FulfilmentExtraInfo fulfilmentExtraInfo, final Function0 function0, final Function1 function1, final Function1 function12, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(345059115);
        int i2 = (composerImplV.I(fulfilmentExtraInfo) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function12) ? 2048 : 1024;
        }
        if (((i2 | 24576) & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            modifier2 = Modifier.Companion.d;
            ScaffoldKt.a(SizeKt.c(modifier2, 0.7f), ComposableLambdaKt.c(541969647, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.compose.FulfilmentFeesBottomSheetKt$FulfilmentFeeBottomSheetUI$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String str = fulfilmentExtraInfo.f10600a;
                        float f = 0;
                        PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f, f, f, f);
                        final Function0 function02 = function0;
                        TopNavBarKt.a(str, null, 0L, 0L, 0L, paddingValuesImpl, null, ComposableLambdaKt.c(-641731871, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.compose.FulfilmentFeesBottomSheetKt$FulfilmentFeeBottomSheetUI$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(CoreTheme.e(composer3).f4879a.G, StringResources_androidKt.c(composer3, R.string.close_button), function02, null, false, null, CoreTheme.b(composer3).e.c.f4854a, composer3, 0, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 102236160, 702);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0L, null, ComposableLambdaKt.c(1120638968, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.compose.FulfilmentFeesBottomSheetKt$FulfilmentFeeBottomSheetUI$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues paddingValues = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(paddingValues, "paddingValues");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(paddingValues) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        FulfilmentFeesBottomSheetKt.a(fulfilmentExtraInfo, function1, function12, PaddingKt.e(SizeKt.e(Modifier.Companion.d, 1.0f), paddingValues), composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12582960, 124);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d0(fulfilmentExtraInfo, function0, function1, function12, modifier2, i, 21);
        }
    }

    public static final void c(final FulfilmentFeeItem fulfilmentFeeItem, Composer composer, final int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1127659440);
        if (((i | (composerImplV.I(fulfilmentFeeItem) ? 4 : 2)) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 48);
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
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Modifier modifierA = RowScopeInstance.f974a.a(companion, 1.0f, true);
            float f = 4;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(f), Alignment.Companion.m, composerImplV, 54);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierA);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            String str = fulfilmentFeeItem.f10601a;
            long j = CoreTheme.b(composerImplV).e.d.d;
            TextStyle textStyle = CoreTheme.f(composerImplV).f5120a.b.f5123a;
            Modifier.Companion companion2 = companion;
            boolean z = true;
            TextKt.b(str, null, j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composerImplV, 0, 0, 65530);
            composerImpl = composerImplV;
            composerImpl.o(914759951);
            String str2 = fulfilmentFeeItem.b;
            if (str2 != null && str2.length() != 0) {
                TextKt.b(fulfilmentFeeItem.b, null, CoreTheme.b(composerImpl).e.d.d, 0L, FontWeight.l, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImpl).b.f5125a.f5126a, composerImpl, 196608, 0, 65498);
                composerImpl = composerImpl;
            }
            boolean z2 = false;
            composerImpl.V(false);
            composerImpl.V(true);
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(8);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.o;
            int i4 = 54;
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(spacedAlignedG, horizontal, composerImpl, 54);
            int i5 = composerImpl.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImpl.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImpl, companion2);
            composerImpl.i();
            if (composerImpl.O) {
                composerImpl.K(function0);
            } else {
                composerImpl.e();
            }
            Updater.b(composerImpl, columnMeasurePolicyA2, function2);
            Updater.b(composerImpl, persistentCompositionLocalMapQ3, function22);
            if (composerImpl.O || !Intrinsics.c(composerImpl.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImpl, i5, function23);
            }
            Updater.b(composerImpl, modifierD3, function24);
            composerImpl.o(1645251649);
            for (FulfilmentFeePriceInfo fulfilmentFeePriceInfo : fulfilmentFeeItem.c) {
                Arrangement$Start$1 arrangement$Start$12 = Arrangement.f934a;
                ColumnMeasurePolicy columnMeasurePolicyA3 = ColumnKt.a(Arrangement.g(f), horizontal, composerImpl, i4);
                int i6 = composerImpl.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImpl.Q();
                Modifier modifierD4 = ComposedModifierKt.d(composerImpl, companion2);
                ComposeUiNode.e3.getClass();
                Function0 function02 = ComposeUiNode.Companion.b;
                composerImpl.i();
                if (composerImpl.O) {
                    composerImpl.K(function02);
                } else {
                    composerImpl.e();
                }
                Updater.b(composerImpl, columnMeasurePolicyA3, ComposeUiNode.Companion.g);
                Updater.b(composerImpl, persistentCompositionLocalMapQ4, ComposeUiNode.Companion.f);
                Function2 function25 = ComposeUiNode.Companion.j;
                if (composerImpl.O || !Intrinsics.c(composerImpl.G(), Integer.valueOf(i6))) {
                    androidx.camera.core.impl.b.B(i6, composerImpl, i6, function25);
                }
                Updater.b(composerImpl, modifierD4, ComposeUiNode.Companion.d);
                ComposerImpl composerImpl2 = composerImpl;
                boolean z3 = z2;
                BiasAlignment.Horizontal horizontal2 = horizontal;
                int i7 = i4;
                Modifier.Companion companion3 = companion2;
                TextKt.b(fulfilmentFeePriceInfo.f10602a, null, CoreTheme.b(composerImpl2).e.d.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImpl2).f5120a.b.f5123a, composerImpl2, 0, 0, 65530);
                composerImpl = composerImpl2;
                composerImpl.o(1357710216);
                String str3 = fulfilmentFeePriceInfo.b;
                if (str3 != null && str3.length() != 0) {
                    TextKt.b(fulfilmentFeePriceInfo.b, null, CoreTheme.b(composerImpl).e.d.d, 0L, FontWeight.l, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImpl).b.f5125a.f5126a, composerImpl, 196608, 0, 65498);
                    composerImpl = composerImpl;
                }
                composerImpl.V(z3);
                z = true;
                composerImpl.V(true);
                z2 = z3;
                horizontal = horizontal2;
                companion2 = companion3;
                i4 = i7;
            }
            android.support.v4.media.session.a.C(composerImpl, z2, z, z);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(i) { // from class: au.com.woolworths.shop.checkout.ui.compose.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    FulfilmentFeesBottomSheetKt.c(this.d, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void d(final FulfilmentExtraInfo fulfilmentExtraInfo, final Function0 function0, final au.com.woolworths.shop.checkout.ui.fulfilmentwindows.a aVar, final Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-1096323434);
        int i2 = i | (composerImplV.I(fulfilmentExtraInfo) ? 4 : 2) | (composerImplV.I(function0) ? 32 : 16) | (composerImplV.I(aVar) ? 256 : 128) | (composerImplV.I(function1) ? 2048 : 1024) | 24576;
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            float f = 16;
            RoundedCornerShape roundedCornerShapeD = RoundedCornerShapeKt.d(f, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12);
            DragHandleBehaviour dragHandleBehaviour = DragHandleBehaviour.f;
            ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(1230761547, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.compose.FulfilmentFeesBottomSheetKt$FulfilmentFeesBottomSheet$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope ModalBottomSheet = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(ModalBottomSheet, "$this$ModalBottomSheet");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        FulfilmentFeesBottomSheetKt.b(fulfilmentExtraInfo, function0, aVar, function1, null, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV);
            int i3 = ((i2 >> 3) & 14) | 12607536;
            Modifier.Companion companion = Modifier.Companion.d;
            ModalBottomSheetKt.a(function0, companion, null, roundedCornerShapeD, dragHandleBehaviour, 0L, 0L, composableLambdaImplC, composerImplV, i3, 100);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.productfinder.g(fulfilmentExtraInfo, function0, aVar, function1, modifier2, i, 15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    public static final void e(FulfilmentFeesInfoSection fulfilmentFeesInfoSection, Modifier modifier, Composer composer, int i) {
        Function2 function2;
        float f;
        Function2 function22;
        BiasAlignment.Horizontal horizontal;
        List list;
        Function2 function23;
        Function0 function0;
        Function2 function24;
        Modifier.Companion companion;
        boolean z;
        ComposerImpl composerImpl;
        ComposerImpl composerImpl2;
        ?? r3;
        ComposerImpl composerImplV = composer.v(598717849);
        if ((((composerImplV.I(fulfilmentFeesInfoSection) ? 4 : 2) | i) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            r3 = 0;
            composerImpl2 = composerImplV;
        } else {
            Modifier modifierE = SizeKt.e(modifier, 1.0f);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            float f2 = 8;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(f2);
            BiasAlignment.Horizontal horizontal2 = Alignment.Companion.m;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(spacedAlignedG, horizontal2, composerImplV, 6);
            int i2 = composerImplV.P;
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
            Updater.b(composerImplV, columnMeasurePolicyA, function25);
            Function2 function26 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function26);
            Function2 function27 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function27);
            }
            Function2 function28 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function28);
            composerImplV.o(-687011066);
            String str = fulfilmentFeesInfoSection.f10603a;
            List list2 = fulfilmentFeesInfoSection.b;
            Modifier.Companion companion2 = Modifier.Companion.d;
            if (str == null || str.length() == 0) {
                function2 = function28;
                f = f2;
                function22 = function26;
                horizontal = horizontal2;
                list = list2;
                function23 = function27;
                function0 = function02;
                function24 = function25;
                companion = companion2;
                z = false;
                composerImpl = composerImplV;
            } else {
                list = list2;
                function24 = function25;
                function2 = function28;
                companion = companion2;
                function22 = function26;
                horizontal = horizontal2;
                function23 = function27;
                function0 = function02;
                f = f2;
                z = false;
                TextKt.b(fulfilmentFeesInfoSection.f10603a, SizeKt.e(companion2, 1.0f), CoreTheme.b(composerImplV).e.d.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).e.b.b, composerImplV, 48, 0, 65528);
                composerImpl = composerImplV;
            }
            composerImpl.V(z);
            Modifier.Companion companion3 = companion;
            Modifier modifierF = PaddingKt.f(SizeKt.e(BackgroundKt.b(companion3, CoreTheme.b(composerImpl).e.f4848a.d, RoundedCornerShapeKt.b(f)), 1.0f), 12);
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(Arrangement.g(f), horizontal, composerImpl, 6);
            int i3 = composerImpl.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImpl.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImpl, modifierF);
            composerImpl.i();
            if (composerImpl.O) {
                composerImpl.K(function0);
            } else {
                composerImpl.e();
            }
            Updater.b(composerImpl, columnMeasurePolicyA2, function24);
            Updater.b(composerImpl, persistentCompositionLocalMapQ2, function22);
            if (composerImpl.O || !Intrinsics.c(composerImpl.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImpl, i3, function23);
            }
            Updater.b(composerImpl, modifierD2, function2);
            composerImpl.o(1969762694);
            int i4 = z ? 1 : 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                c((FulfilmentFeeItem) obj, composerImpl, z ? 1 : 0);
                composerImpl.o(1969765501);
                if (i4 < CollectionsKt.I(list)) {
                    DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 4, CoreTheme.b(composerImpl).e.b.e, composerImpl, SizeKt.e(companion3, 1.0f));
                }
                composerImpl.V(z);
                i4 = i5;
            }
            android.support.v4.media.session.a.C(composerImpl, z, true, true);
            r3 = z;
            composerImpl2 = composerImpl;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(fulfilmentFeesInfoSection, i, r3, modifier);
        }
    }

    public static final void f(FulfilmentInfoRowAccordion fulfilmentInfoRowAccordion, Modifier modifier, Composer composer, int i) {
        ImageVector imageVector;
        ComposerImpl composerImplV = composer.v(-1732685071);
        if ((((composerImplV.I(fulfilmentInfoRowAccordion) ? 4 : 2) | i) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean z = false;
            Object[] objArr = new Object[0];
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(fulfilmentInfoRowAccordion);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new c(fulfilmentInfoRowAccordion, 0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            MutableState mutableState = (MutableState) RememberSaveableKt.c(objArr, null, (Function0) objG, composerImplV, 0, 6);
            if (((Boolean) mutableState.getD()).booleanValue()) {
                composerImplV.o(-1503749123);
                imageVector = CoreTheme.e(composerImplV).e.o;
                composerImplV.V(false);
            } else {
                composerImplV.o(-1503691525);
                imageVector = CoreTheme.e(composerImplV).e.l;
                composerImplV.V(false);
            }
            String strL = ((Boolean) mutableState.getD()).booleanValue() ? au.com.woolworths.dynamic.page.ui.content.d.l(composerImplV, -1503590496, R.string.expanded, composerImplV, false) : au.com.woolworths.dynamic.page.ui.content.d.l(composerImplV, -1503535905, R.string.collapsed, composerImplV, false);
            Modifier modifierE = SizeKt.e(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
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
            CoreRowModel coreRowModel = fulfilmentInfoRowAccordion.f10604a;
            Object obj = fulfilmentInfoRowAccordion.d;
            ParagraphTextItemData paragraphTextItemData = obj instanceof ParagraphTextItemData ? (ParagraphTextItemData) obj : null;
            composerImplV.o(-463171956);
            if (paragraphTextItemData != null) {
                String str = coreRowModel.d;
                String str2 = coreRowModel.c;
                CoreRowSpec.Image.LocalImage localImage = new CoreRowSpec.Image.LocalImage(imageVector, null, BitmapDescriptorFactory.HUE_RED, 6);
                IconAsset iconAsset = coreRowModel.b;
                composerImplV.o(-463164782);
                CoreRowSpec.Image imageA = iconAsset != null ? ImageUtilKt.a(iconAsset, CoreRowSpec.ImageSize.f4756a, null, composerImplV, 6) : null;
                composerImplV.V(false);
                composerImplV.o(5004770);
                boolean zN = composerImplV.n(strL);
                Object objG2 = composerImplV.G();
                if (zN || objG2 == composer$Companion$Empty$1) {
                    objG2 = new d(strL, 0);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                Modifier.Companion companion = Modifier.Companion.d;
                Modifier modifierB = SemanticsModifierKt.b(companion, true, (Function1) objG2);
                composerImplV.o(5004770);
                boolean zN2 = composerImplV.n(mutableState);
                Object objG3 = composerImplV.G();
                if (zN2 || objG3 == composer$Companion$Empty$1) {
                    objG3 = new c(mutableState, 1);
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                final ParagraphTextItemData paragraphTextItemData2 = paragraphTextItemData;
                SimpleRowKt.a(str, (Function0) objG3, modifierB, str2, null, imageA, localImage, null, null, composerImplV, 0, 400);
                AnimatedVisibilityKt.c(ColumnScopeInstance.f948a, ((Boolean) mutableState.getD()).booleanValue(), null, null, null, null, ComposableLambdaKt.c(1470759024, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.compose.FulfilmentFeesBottomSheetKt$FulfilmentInfoRowAccordionUI$1$1$3
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj2;
                        ((Number) obj4).intValue();
                        Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                        float f = 16;
                        FulfilmentFeesBottomSheetKt.g(0, (Composer) obj3, PaddingKt.j(PaddingKt.h(Modifier.Companion.d, f, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, 4, BitmapDescriptorFactory.HUE_RED, f, 5), paragraphTextItemData2.b);
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImplV, 1572870, 30);
                composerImplV = composerImplV;
                DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 4, CoreTheme.b(composerImplV).e.b.e, composerImplV, SizeKt.e(companion, 1.0f));
                z = false;
            }
            composerImplV.V(z);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(fulfilmentInfoRowAccordion, i, 1, modifier);
        }
    }

    public static final void g(int i, Composer composer, Modifier modifier, String str) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-1256987972);
        int i2 = i | (composerImplV.n(str) ? 4 : 2);
        if ((i & 48) == 0) {
            modifier2 = modifier;
            i2 |= composerImplV.n(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.h;
            Density density = (Density) composerImplV.x(staticProvidableCompositionLocal);
            float f = 4;
            MarkdownCompatKt.a(str, modifier2, new MarkdownTextViewStyle((Density) composerImplV.x(staticProvidableCompositionLocal), CoreTheme.b(composerImplV).e.d.d, CoreTheme.f(composerImplV).f5120a.c.f5124a, (TextAlign) null, 24), null, false, null, null, false, CollectionsKt.Q(new CloseAccountMarkwonPlugin((int) density.T1(f), (int) density.T1(f))), null, composerImplV, i2 & 126, 760);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.quantitystepper.a(str, modifier, i, 7, (byte) 0);
        }
    }

    public static final void h(FulfilmentWindowsActivity fulfilmentWindowsActivity, final FulfilmentExtraInfo data, final au.com.woolworths.shop.checkout.ui.fulfilmentwindows.a aVar, final au.com.woolworths.shop.checkout.ui.fulfilmentwindows.a aVar2) {
        Intrinsics.h(data, "data");
        final ViewGroup viewGroup = (ViewGroup) fulfilmentWindowsActivity.findViewById(android.R.id.content);
        Context context = viewGroup.getContext();
        Intrinsics.g(context, "getContext(...)");
        final ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.compose.FulfilmentFeesBottomSheetKt$showFulfilmentFeesBottomSheet$composeView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final au.com.woolworths.shop.checkout.ui.fulfilmentwindows.a aVar3 = aVar;
                    final au.com.woolworths.shop.checkout.ui.fulfilmentwindows.a aVar4 = aVar2;
                    final FulfilmentExtraInfo fulfilmentExtraInfo = data;
                    final ViewGroup viewGroup2 = viewGroup;
                    final ComposeView composeView2 = composeView;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(2036706363, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.compose.FulfilmentFeesBottomSheetKt$showFulfilmentFeesBottomSheet$composeView$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                composer2.o(-1633490746);
                                ViewGroup viewGroup3 = viewGroup2;
                                boolean zI = composer2.I(viewGroup3);
                                ComposeView composeView3 = composeView2;
                                boolean zI2 = zI | composer2.I(composeView3);
                                Object objG = composer2.G();
                                Object obj5 = Composer.Companion.f1624a;
                                if (zI2 || objG == obj5) {
                                    objG = new FulfilmentFeesBottomSheetKt$showFulfilmentFeesBottomSheet$composeView$1$1$1$1$1(viewGroup3, composeView3);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                Function0 function0 = (Function0) ((KFunction) objG);
                                composer2.o(-1746271574);
                                boolean zI3 = composer2.I(viewGroup3) | composer2.I(composeView3);
                                Object obj6 = aVar4;
                                boolean zN = zI3 | composer2.n(obj6);
                                Object objG2 = composer2.G();
                                if (zN || objG2 == obj5) {
                                    objG2 = new j(1, obj6, viewGroup3, composeView3);
                                    composer2.A(objG2);
                                }
                                composer2.l();
                                FulfilmentFeesBottomSheetKt.d(fulfilmentExtraInfo, function0, aVar3, (Function1) objG2, null, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -57546217));
        viewGroup.addView(composeView);
    }
}
