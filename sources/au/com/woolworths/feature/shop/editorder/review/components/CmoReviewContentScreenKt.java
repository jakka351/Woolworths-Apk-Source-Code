package au.com.woolworths.feature.shop.editorder.review.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.base.shopapp.modules.text.TextWithAltApiData;
import au.com.woolworths.design.core.ui.component.experimental.chip.e;
import au.com.woolworths.design.core.ui.component.experimental.dialog.AlertDialogKt;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.button.DestructiveButtonKt;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.product.list.v2.ui.f;
import au.com.woolworths.feature.shared.instore.wifi.ui.r;
import au.com.woolworths.feature.shop.editorder.review.CmoReviewContract;
import au.com.woolworths.feature.shop.editorder.review.data.ChangeMyOrderDetailsSection;
import au.com.woolworths.feature.shop.editorder.review.data.ChangeMyOrderDetailsSectionItems;
import au.com.woolworths.feature.shop.editorder.review.data.ChangeMyOrderSummary;
import au.com.woolworths.feature.shop.editorder.review.data.FooterCtaSection;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderConfirmation;
import au.com.woolworths.sdui.common.broadcastbanner.BroadcastBannerKt;
import au.com.woolworths.sdui.common.broadcastbanner.model.CoreBroadcastBannerModel;
import au.com.woolworths.sdui.shop.broadcastbanner.model.BasicCoreBroadcastBannerModel;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"edit-order_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CmoReviewContentScreenKt {
    public static final void a(BasicCoreBroadcastBannerModel basicCoreBroadcastBannerModel, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-211980512);
        if ((((composerImplV.I(basicCoreBroadcastBannerModel) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreBroadcastBannerModel coreBroadcastBannerModel = basicCoreBroadcastBannerModel.b;
            CoreBroadcastBannerModel.Companion companion = CoreBroadcastBannerModel.INSTANCE;
            BroadcastBannerKt.a(coreBroadcastBannerModel, null, null, null, composerImplV, 8, 14);
            SpacerKt.a(composerImplV, SizeKt.g(Modifier.Companion.d, 24));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(i, 25, basicCoreBroadcastBannerModel);
        }
    }

    public static final void b(List list, Function1 function1, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(696446601);
        int i3 = (composerImplV.I(list) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= composerImplV.I(function1) ? 32 : 16;
        }
        int i4 = 0;
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            i2 = 0;
        } else {
            Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(8);
            PaddingValuesImpl paddingValuesImplA = PaddingKt.a(16, BitmapDescriptorFactory.HUE_RED, 2);
            composerImplV.o(-1633490746);
            boolean zI = ((i3 & 112) == 32) | composerImplV.I(list);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new a(i4, list, function1);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            i2 = 0;
            LazyDslKt.d(modifierE, null, paddingValuesImplA, false, spacedAlignedG, Alignment.Companion.k, null, false, null, (Function1) objG, composerImplV, 221574, 458);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(list, function1, i, i2);
        }
    }

    public static final void c(ChangeMyOrderDetailsSectionItems.Cart cart, Function1 function1, Composer composer, int i) {
        Function1 function12;
        ComposerImpl composerImplV = composer.v(777785949);
        int i2 = i | (composerImplV.I(cart) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function1) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function12 = function1;
        } else {
            float f = 8;
            Modifier.Companion companion = Modifier.Companion.d;
            float f2 = 16;
            Modifier modifierB = BackgroundKt.b(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, 4, 5), CoreTheme.b(composerImplV).e.f4848a.d, RoundedCornerShapeKt.b(f2));
            composerImplV.o(5004770);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new f(13, function1);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierD = ClickableKt.d(modifierB, false, null, null, (Function0) objG, 7);
            float f3 = 20;
            Modifier modifierH = PaddingKt.h(modifierD, BitmapDescriptorFactory.HUE_RED, f3, 1);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierH);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
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
            Updater.b(composerImplV, modifierD2, function24);
            Modifier modifierH2 = PaddingKt.h(SizeKt.e(companion, 1.0f), f2, BitmapDescriptorFactory.HUE_RED, 2);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(f), Alignment.Companion.k, composerImplV, 54);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierH2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            Modifier modifierA = RowScopeInstance.f974a.a(companion, 1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD4 = ComposedModifierKt.d(composerImplV, modifierA);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function23);
            }
            Updater.b(composerImplV, modifierD4, function24);
            TextKt.a(cart.f7121a, CoreTheme.f(composerImplV).f5120a.f5121a.b, null, CoreTheme.b(composerImplV).d.d.c, null, 0, 0, false, 0, null, composerImplV, 0, 1012);
            String str = cart.b;
            composerImplV.o(1171860981);
            if (str != null) {
                TextKt.a(cart.b, CoreTheme.f(composerImplV).f5120a.c.f5124a, null, CoreTheme.b(composerImplV).d.d.e.b, null, 0, 0, false, 0, null, composerImplV, 0, 1012);
            }
            composerImplV.V(false);
            composerImplV.V(true);
            d(cart.c, 0, composerImplV);
            IconKt.b(CoreTheme.e(composerImplV).e.n, null, SizeKt.q(companion, 24), CoreTheme.b(composerImplV).e.c.b, composerImplV, 432, 0);
            composerImplV.V(true);
            SpacerKt.a(composerImplV, SizeKt.g(companion, f3));
            function12 = function1;
            b(cart.d, function12, composerImplV, i3);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.b(cart, i, 26, function12);
        }
    }

    public static final void d(int i, int i2, Composer composer) {
        int i3;
        ComposerImpl composerImplV = composer.v(-1262646598);
        if ((((composerImplV.r(i) ? 4 : 2) | i2) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            i3 = 1;
        } else {
            long j = CoreTheme.b(composerImplV).e.f4848a.f4849a.f4850a;
            float f = 12;
            RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(f);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierG = PaddingKt.g(BackgroundKt.b(companion, j, roundedCornerShapeB), 8, 4);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(2), Alignment.Companion.k, composerImplV, 54);
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
            IconKt.b(CoreTheme.e(composerImplV).e.j, null, SizeKt.q(companion, f), CoreTheme.b(composerImplV).e.c.c.b, composerImplV, 432, 0);
            i3 = 1;
            TextKt.a(String.valueOf(i), CoreTheme.f(composerImplV).b.f5125a.f5126a, null, CoreTheme.b(composerImplV).f4782a.d.c.b, null, 0, 0, false, 0, null, composerImplV, 0, 1012);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new r(i, i2, i3);
        }
    }

    public static final void e(CmoReviewContract.ViewState.Content viewState, Function1 onEvent, Composer composer, int i) {
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(onEvent, "onEvent");
        ComposerImpl composerImplV = composer.v(-379766265);
        int i2 = (composerImplV.I(viewState) ? 4 : 2) | i | (composerImplV.I(onEvent) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierB = ScrollKt.b(PaddingKt.f(SizeKt.c, 16), ScrollKt.a(composerImplV), true);
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
            composerImplV.o(770803286);
            ChangeMyOrderSummary changeMyOrderSummary = viewState.f7095a;
            BasicCoreBroadcastBannerModel basicCoreBroadcastBannerModel = changeMyOrderSummary.f7126a;
            composerImplV.o(770804363);
            if (basicCoreBroadcastBannerModel != null) {
                a(basicCoreBroadcastBannerModel, composerImplV, 8);
            }
            composerImplV.V(false);
            int i4 = i2 & 112;
            h(changeMyOrderSummary.b, onEvent, composerImplV, i4);
            g(changeMyOrderSummary.c, onEvent, composerImplV, i4);
            composerImplV.V(false);
            composerImplV.V(true);
            EditOrderConfirmation editOrderConfirmation = viewState.b;
            composerImplV.o(116863756);
            if (editOrderConfirmation != null) {
                String title = editOrderConfirmation.getTitle();
                String message = editOrderConfirmation.getMessage();
                String strC = StringResources_androidKt.c(composerImplV, R.string.cmo_review_dialog_close);
                String strC2 = StringResources_androidKt.c(composerImplV, R.string.cmo_review_dialog_confirm);
                composerImplV.o(5004770);
                boolean z = i4 == 32;
                Object objG = composerImplV.G();
                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                if (z || objG == composer$Companion$Empty$1) {
                    objG = new f(14, onEvent);
                    composerImplV.A(objG);
                }
                Function0 function02 = (Function0) objG;
                composerImplV.V(false);
                composerImplV.o(5004770);
                boolean z2 = i4 == 32;
                Object objG2 = composerImplV.G();
                if (z2 || objG2 == composer$Companion$Empty$1) {
                    objG2 = new f(15, onEvent);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                AlertDialogKt.a(message, strC, null, title, strC2, function02, (Function0) objG2, composerImplV, 0, 4);
            }
            composerImplV.V(false);
            if (viewState.c) {
                CmoReviewOtherScreenKt.b(true, composerImplV, 6, 0);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.receipt.details.compose.a(viewState, i, 4, onEvent);
        }
    }

    public static final void f(String str, String str2, String str3, String str4, Composer composer, int i, int i2) {
        int i3;
        String str5;
        int i4;
        String str6;
        String str7;
        ComposerImpl composerImplV = composer.v(-1708146127);
        if ((i & 6) == 0) {
            i3 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.n(str2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(str3) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 = i3 | 3072;
            str5 = str4;
        } else {
            str5 = str4;
            i4 = i3 | (composerImplV.n(str5) ? 2048 : 1024);
        }
        if ((i4 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            str7 = str5;
        } else {
            String str8 = i5 != 0 ? null : str5;
            float f = 8;
            Modifier.Companion companion = Modifier.Companion.d;
            float f2 = 16;
            Modifier modifierG = PaddingKt.g(BackgroundKt.b(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, 4, 5), CoreTheme.b(composerImplV).e.f4848a.d, RoundedCornerShapeKt.b(f2)), f2, 20);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i6 = composerImplV.P;
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
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            String str9 = str8;
            SingletonAsyncImageKt.a(str3, null, SizeKt.q(companion, 40), null, ContentScale.Companion.b, composerImplV, ((i4 >> 6) & 14) | 1573296, 1976);
            SpacerKt.a(composerImplV, SizeKt.u(companion, f2));
            Modifier modifierA = RowScopeInstance.f974a.a(companion, 1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i7 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                androidx.camera.core.impl.b.B(i7, composerImplV, i7, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            composerImplV.o(-1633490746);
            int i8 = i4 & 14;
            boolean z = ((i4 & 7168) == 2048) | (i8 == 4);
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                str6 = str9;
                objG = new au.com.woolworths.feature.rewards.account.preferences.f(str6, str, 1);
                composerImplV.A(objG);
            } else {
                str6 = str9;
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(companion, false, (Function1) objG);
            TextStyle textStyle = CoreTheme.f(composerImplV).f5120a.f5121a.b;
            long j = CoreTheme.b(composerImplV).d.d.c;
            String str10 = str6;
            composerImplV = composerImplV;
            int i9 = i4;
            TextKt.a(str, textStyle, modifierB, j, null, 0, 0, false, 0, null, composerImplV, i8, 1008);
            composerImplV.o(-508373394);
            if (str2 != null) {
                TextKt.a(str2, CoreTheme.f(composerImplV).f5120a.c.f5124a, null, CoreTheme.b(composerImplV).d.d.e.b, null, 0, 2, false, 1, null, composerImplV, ((i9 >> 3) & 14) | 102236160, 692);
            }
            composerImplV.V(false);
            composerImplV.V(true);
            SpacerKt.a(composerImplV, SizeKt.u(companion, f));
            IconKt.b(CoreTheme.e(composerImplV).e.n, null, SizeKt.q(companion, 24), CoreTheme.b(composerImplV).e.c.b, composerImplV, 432, 0);
            composerImplV.V(true);
            str7 = str10;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.chip.b(str, str2, str3, str7, i, i2, 4);
        }
    }

    public static final void g(FooterCtaSection footerCtaSection, Function1 function1, Composer composer, int i) {
        Function1 function12;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(1290119476);
        int i2 = i | (composerImplV.I(footerCtaSection) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function1) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function12 = function1;
            composerImpl = composerImplV;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            Modifier modifierA = rowScopeInstance.a(companion, 1.0f, true);
            String label = footerCtaSection.f7127a.getLabel();
            composerImplV.o(5004770);
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z || objG == composer$Companion$Empty$1) {
                objG = new f(16, function1);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            DestructiveButtonKt.a(label, (Function0) objG, modifierA, null, null, null, composerImplV, 0, 120);
            SpacerKt.a(composerImplV, SizeKt.u(companion, 8));
            Modifier modifierA2 = rowScopeInstance.a(companion, 1.0f, true);
            String label2 = footerCtaSection.b.getLabel();
            composerImplV.o(5004770);
            boolean z2 = i4 == 32;
            Object objG2 = composerImplV.G();
            if (z2 || objG2 == composer$Companion$Empty$1) {
                function12 = function1;
                objG2 = new f(17, function12);
                composerImplV.A(objG2);
            } else {
                function12 = function1;
            }
            composerImplV.V(false);
            PrimaryButtonKt.a(label2, (Function0) objG2, modifierA2, false, null, null, null, null, composerImplV, 0, 248);
            composerImpl = composerImplV;
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.b(footerCtaSection, i, 27, function12);
        }
    }

    public static final void h(ChangeMyOrderDetailsSection changeMyOrderDetailsSection, Function1 function1, Composer composer, int i) {
        ComposerImpl composerImpl;
        Modifier.Companion companion;
        ComposerImpl composerImplV = composer.v(1456066622);
        int i2 = i | (composerImplV.I(changeMyOrderDetailsSection) ? 4 : 2) | (composerImplV.I(function1) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            String str = changeMyOrderDetailsSection.f7120a;
            TextStyle textStyle = CoreTheme.f(composerImplV).b.f5125a.f5126a;
            long j = CoreTheme.b(composerImplV).e.c.c.b;
            float f = 8;
            Modifier.Companion companion2 = Modifier.Companion.d;
            float f2 = 4;
            TextKt.a(str, textStyle, PaddingKt.g(BackgroundKt.b(PaddingKt.h(companion2, BitmapDescriptorFactory.HUE_RED, f, 1), CoreTheme.a(composerImplV).f4774a.b.f4779a, RoundedCornerShapeKt.b(3)), f, f2), j, null, 0, 0, false, 0, null, composerImplV, 0, 1008);
            String str2 = changeMyOrderDetailsSection.b;
            composerImplV.o(-879294809);
            if (str2 == null) {
                composerImpl = composerImplV;
                companion = companion2;
            } else {
                composerImpl = composerImplV;
                companion = companion2;
                TextKt.a(str2, CoreTheme.f(composerImplV).f5120a.f5121a.f5122a, PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 7), CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImpl, KyberEngine.KyberPolyBytes, 1008);
            }
            composerImpl.V(false);
            composerImpl.o(-879286116);
            for (ChangeMyOrderDetailsSectionItems changeMyOrderDetailsSectionItems : changeMyOrderDetailsSection.c) {
                if (changeMyOrderDetailsSectionItems instanceof ChangeMyOrderDetailsSectionItems.DeliveryInstructions) {
                    composerImpl.o(838990757);
                    ChangeMyOrderDetailsSectionItems.DeliveryInstructions deliveryInstructions = (ChangeMyOrderDetailsSectionItems.DeliveryInstructions) changeMyOrderDetailsSectionItems;
                    f(deliveryInstructions.f7123a, deliveryInstructions.b, deliveryInstructions.c, null, composerImpl, 0, 8);
                    composerImpl.V(false);
                } else if (changeMyOrderDetailsSectionItems instanceof ChangeMyOrderDetailsSectionItems.FulfilmentMethod) {
                    composerImpl.o(838997637);
                    ChangeMyOrderDetailsSectionItems.FulfilmentMethod fulfilmentMethod = (ChangeMyOrderDetailsSectionItems.FulfilmentMethod) changeMyOrderDetailsSectionItems;
                    f(fulfilmentMethod.f7124a, fulfilmentMethod.b, fulfilmentMethod.c, null, composerImpl, 0, 8);
                    composerImpl.V(false);
                } else if (changeMyOrderDetailsSectionItems instanceof ChangeMyOrderDetailsSectionItems.FulfilmentTimeSlot) {
                    composerImpl.o(839004666);
                    ChangeMyOrderDetailsSectionItems.FulfilmentTimeSlot fulfilmentTimeSlot = (ChangeMyOrderDetailsSectionItems.FulfilmentTimeSlot) changeMyOrderDetailsSectionItems;
                    TextWithAltApiData textWithAltApiData = fulfilmentTimeSlot.f7125a;
                    f(textWithAltApiData.getText(), fulfilmentTimeSlot.b, fulfilmentTimeSlot.c, textWithAltApiData.getAltText(), composerImpl, 0, 0);
                    composerImpl.V(false);
                } else {
                    if (!(changeMyOrderDetailsSectionItems instanceof ChangeMyOrderDetailsSectionItems.Cart)) {
                        throw au.com.woolworths.android.onesite.a.w(838988826, composerImpl, false);
                    }
                    composerImpl.o(839013740);
                    c((ChangeMyOrderDetailsSectionItems.Cart) changeMyOrderDetailsSectionItems, function1, composerImpl, i2 & 112);
                    composerImpl.V(false);
                }
            }
            composerImpl.V(false);
            SpacerKt.a(composerImpl, SizeKt.g(companion, f2));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.receipt.details.compose.a(changeMyOrderDetailsSection, i, 3, function1);
        }
    }
}
