package au.com.woolworths.shop.lists.ui.shoppinglist.compose;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.CheckboxKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.product.composeui.ProductCardInfoUiKt;
import au.com.woolworths.product.composeui.ProductImageWithBadgeKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductQuantityHelper;
import au.com.woolworths.product.models.ProductShoppingList;
import au.com.woolworths.shop.cart.ui.cart.l;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductItemUiKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    public static final void a(final ProductItemUiModel productItemUiModel, final boolean z, final Function1 function1, final Function1 function12, Composer composer, final int i) {
        Modifier.Companion companion;
        Object obj;
        boolean z2;
        ?? r13;
        Function1 function13;
        ComposerImpl composerImpl;
        ComposerImpl composerImpl2;
        ComposerImpl composerImplV = composer.v(1260902622);
        int i2 = i | (composerImplV.I(productItemUiModel) ? 4 : 2) | (composerImplV.p(z) ? 32 : 16) | (composerImplV.I(function1) ? 256 : 128) | (composerImplV.I(function12) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            function13 = function12;
            composerImpl2 = composerImplV;
        } else {
            ProductCard productCard = productItemUiModel.i;
            if (productCard == null) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    final int i3 = 0;
                    recomposeScopeImplX.d = new Function2(productItemUiModel, z, function1, function12, i, i3) { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.compose.e
                        public final /* synthetic */ int d;
                        public final /* synthetic */ ProductItemUiModel e;
                        public final /* synthetic */ boolean f;
                        public final /* synthetic */ Function1 g;
                        public final /* synthetic */ Function1 h;

                        {
                            this.d = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            switch (this.d) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    int iA = RecomposeScopeImplKt.a(1);
                                    ProductItemUiKt.a(this.e, this.f, this.g, this.h, (Composer) obj2, iA);
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    int iA2 = RecomposeScopeImplKt.a(1);
                                    ProductItemUiKt.a(this.e, this.f, this.g, this.h, (Composer) obj2, iA2);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion2, 1.0f);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i4 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(458993151);
            boolean z3 = productItemUiModel.k;
            Object obj2 = Composer.Companion.f1624a;
            if (z3) {
                Modifier modifierV = SizeKt.v(companion2, 148, 160);
                String str = productItemUiModel.o;
                boolean z4 = productItemUiModel.j;
                composerImplV.o(-1633490746);
                boolean zI = ((i2 & 896) == 256) | composerImplV.I(productItemUiModel);
                Object objG = composerImplV.G();
                if (zI || objG == obj2) {
                    objG = new c(function1, productItemUiModel, 2);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                companion = companion2;
                r13 = 0;
                obj = obj2;
                z2 = true;
                PrimaryButtonKt.a(str, (Function0) objG, modifierV, z4, false, null, null, null, null, composerImplV, KyberEngine.KyberPolyBytes, 1008);
            } else {
                companion = companion2;
                obj = obj2;
                z2 = true;
                r13 = 0;
            }
            composerImplV.V(r13);
            Modifier.Companion companion3 = companion;
            SpacerKt.a(composerImplV, RowScopeInstance.f974a.a(companion3, 1.0f, z2));
            composerImplV.o(459008521);
            if (productCard.getTagLabel() == null && z) {
                Modifier modifierQ = SizeKt.q(PaddingKt.j(companion3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, 11), 28);
                Painter painterA = PainterResources_androidKt.a(R.drawable.ic_shop_lists_copy_to_list, r13, composerImplV);
                long jH = WxTheme.a(composerImplV).h();
                String strC = StringResources_androidKt.c(composerImplV, R.string.shop_lists_copy_to_list_button_description);
                composerImplV.o(-1633490746);
                boolean zI2 = composerImplV.I(productItemUiModel) | ((i2 & 7168) == 2048 ? z2 : r13);
                Object objG2 = composerImplV.G();
                if (zI2 || objG2 == obj) {
                    function13 = function12;
                    objG2 = new c(function13, productItemUiModel, 3);
                    composerImplV.A(objG2);
                } else {
                    function13 = function12;
                }
                composerImplV.V(r13);
                IconButtonKt.b(painterA, strC, (Function0) objG2, modifierQ, false, jH, composerImplV, 3072, 16);
                composerImpl = composerImplV;
            } else {
                function13 = function12;
                composerImpl = composerImplV;
            }
            composerImpl.V(r13);
            composerImpl.V(z2);
            composerImpl2 = composerImpl;
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImpl2.X();
        if (recomposeScopeImplX2 != null) {
            final int i5 = 1;
            final Function1 function14 = function13;
            recomposeScopeImplX2.d = new Function2(productItemUiModel, z, function1, function14, i, i5) { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.compose.e
                public final /* synthetic */ int d;
                public final /* synthetic */ ProductItemUiModel e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ Function1 g;
                public final /* synthetic */ Function1 h;

                {
                    this.d = i5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj22, Object obj3) {
                    switch (this.d) {
                        case 0:
                            ((Integer) obj3).getClass();
                            int iA = RecomposeScopeImplKt.a(1);
                            ProductItemUiKt.a(this.e, this.f, this.g, this.h, (Composer) obj22, iA);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            int iA2 = RecomposeScopeImplKt.a(1);
                            ProductItemUiKt.a(this.e, this.f, this.g, this.h, (Composer) obj22, iA2);
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final ProductItemUiModel uiModel, final boolean z, final boolean z2, final boolean z3, final Function1 onProductItemClick, final Function2 onCheckedChange, final Function1 onAddToCartButtonClick, final Function1 onCopyToListClick, final Function1 onProductQuantityClick, final Function1 onAisleClicked, Modifier modifier, Composer composer, final int i) {
        final boolean z4;
        final boolean z5;
        final Modifier modifier2;
        Intrinsics.h(uiModel, "uiModel");
        Intrinsics.h(onProductItemClick, "onProductItemClick");
        Intrinsics.h(onCheckedChange, "onCheckedChange");
        Intrinsics.h(onAddToCartButtonClick, "onAddToCartButtonClick");
        Intrinsics.h(onCopyToListClick, "onCopyToListClick");
        Intrinsics.h(onProductQuantityClick, "onProductQuantityClick");
        Intrinsics.h(onAisleClicked, "onAisleClicked");
        ComposerImpl composerImplV = composer.v(-1539925261);
        int i2 = (composerImplV.I(uiModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            z4 = z;
            i2 |= composerImplV.p(z4) ? 32 : 16;
        } else {
            z4 = z;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            z5 = z2;
            i2 |= composerImplV.p(z5) ? 256 : 128;
        } else {
            z5 = z2;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.p(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(onProductItemClick) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(onCheckedChange) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(onAddToCartButtonClick) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.I(onCopyToListClick) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerImplV.I(onProductQuantityClick) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= composerImplV.I(onAisleClicked) ? 536870912 : 268435456;
        }
        if ((306783379 & i2) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            final ProductCard productCard = uiModel.i;
            if (productCard == null) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.compose.b
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ProductItemUiKt.b(uiModel, z4, z5, z3, onProductItemClick, onCheckedChange, onAddToCartButtonClick, onCopyToListClick, onProductQuantityClick, onAisleClicked, Modifier.Companion.d, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 57344) == 16384) | composerImplV.I(uiModel);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new c(onProductItemClick, uiModel, 0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            SurfaceKt.b((Function0) objG, modifierE, false, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, null, ComposableLambdaKt.c(122165836, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.compose.ProductItemUiKt$ProductItemUi$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Function2 function2;
                    Function2 function22;
                    Arrangement$Start$1 arrangement$Start$1;
                    Function2 function23;
                    BiasAlignment.Vertical vertical;
                    Function2 function24;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
                        BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier.Companion companion2 = Modifier.Companion.d;
                        Modifier modifierD = ComposedModifierKt.d(composer2, companion2);
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
                        Function2 function25 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, columnMeasurePolicyA, function25);
                        Function2 function26 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function26);
                        Function2 function27 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function27);
                        }
                        Function2 function28 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function28);
                        float f = 12;
                        Modifier modifierJ = PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                        Arrangement$Start$1 arrangement$Start$12 = Arrangement.f934a;
                        BiasAlignment.Vertical vertical2 = Alignment.Companion.j;
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$12, vertical2, composer2, 48);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierJ);
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
                        Updater.b(composer2, rowMeasurePolicyA, function25);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function26);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            androidx.camera.core.impl.b.z(p2, composer2, p2, function27);
                        }
                        Updater.b(composer2, modifierD2, function28);
                        composer2.o(636400000);
                        boolean z6 = z2;
                        ProductItemUiModel productItemUiModel = uiModel;
                        if (z6) {
                            function2 = function27;
                            function22 = function28;
                            arrangement$Start$1 = arrangement$Start$12;
                            function23 = function25;
                            vertical = vertical2;
                        } else {
                            boolean z7 = productItemUiModel.e;
                            composer2.o(-1633490746);
                            Function2 function29 = onCheckedChange;
                            boolean zN = composer2.n(function29) | composer2.I(productItemUiModel);
                            Object objG2 = composer2.G();
                            if (zN || objG2 == Composer.Companion.f1624a) {
                                objG2 = new l(19, function29, productItemUiModel);
                                composer2.A(objG2);
                            }
                            composer2.l();
                            function22 = function28;
                            function23 = function25;
                            function2 = function27;
                            arrangement$Start$1 = arrangement$Start$12;
                            vertical = vertical2;
                            CheckboxKt.a(z7, (Function1) objG2, null, false, null, composer2, 0, 60);
                        }
                        composer2.l();
                        final ProductCard productCard2 = productCard;
                        String productImage = productCard2.getProductImage();
                        String badgeImage = productCard2.getBadgeImage();
                        Modifier modifierB = IntrinsicKt.b(companion2, IntrinsicSize.e);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
                        BiasAlignment.Vertical vertical3 = vertical;
                        Function2 function210 = function23;
                        ProductImageWithBadgeKt.a(productImage, badgeImage, PaddingKt.j(rowScopeInstance.b(modifierB, vertical), 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), 50, 36, false, false, null, composer2, 27648, BERTags.FLAGS);
                        SpacerKt.a(composer2, PaddingKt.j(companion2, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14));
                        ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composer2, 0);
                        int p3 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer2.d();
                        Modifier modifierD3 = ComposedModifierKt.d(composer2, companion2);
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
                        Updater.b(composer2, columnMeasurePolicyA2, function210);
                        Updater.b(composer2, persistentCompositionLocalMapD3, function26);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p3))) {
                            function24 = function2;
                            androidx.camera.core.impl.b.z(p3, composer2, p3, function24);
                        } else {
                            function24 = function2;
                        }
                        Function2 function211 = function22;
                        Updater.b(composer2, modifierD3, function211);
                        Modifier modifierJ2 = PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                        RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(arrangement$Start$1, vertical3, composer2, 48);
                        int p4 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD4 = composer2.d();
                        Modifier modifierD4 = ComposedModifierKt.d(composer2, modifierJ2);
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
                        Updater.b(composer2, rowMeasurePolicyA2, function210);
                        Updater.b(composer2, persistentCompositionLocalMapD4, function26);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p4))) {
                            androidx.camera.core.impl.b.z(p4, composer2, p4, function24);
                        }
                        Updater.b(composer2, modifierD4, function211);
                        Modifier modifierJ3 = PaddingKt.j(rowScopeInstance.a(companion2, 1.0f, true), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 7);
                        final boolean z8 = z3;
                        final Function1 function1 = onAisleClicked;
                        SurfaceKt.a(modifierJ3, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(2089993436, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.compose.ProductItemUiKt$ProductItemUi$2$1$1$2$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    boolean z9 = z8;
                                    ProductCard productCard3 = productCard2;
                                    boolean z10 = z9 && ProductCardExtKt.q(productCard3);
                                    composer3.o(-1633490746);
                                    Function1 function12 = function1;
                                    boolean zN2 = composer3.n(function12) | composer3.I(productCard3);
                                    Object objG3 = composer3.G();
                                    if (zN2 || objG3 == Composer.Companion.f1624a) {
                                        objG3 = new au.com.woolworths.feature.product.list.compose.b(function12, productCard3, 8);
                                        composer3.A(objG3);
                                    }
                                    composer3.l();
                                    ProductCardInfoUiKt.b(productCard2, true, true, null, false, false, false, null, true, z10, false, false, z8, (Function0) objG3, null, null, null, null, composer3, ProductCard.$stable | 905970096, 48, 495864);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 1572864, 62);
                        SpacerKt.a(composer2, SizeKt.u(companion2, 24));
                        ProductItemUiKt.c(productItemUiModel, onProductQuantityClick, composer2, 0);
                        composer2.f();
                        ProductItemUiKt.a(productItemUiModel, z, onAddToCartButtonClick, onCopyToListClick, composer2, 0);
                        SpacerKt.a(composer2, PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 7));
                        composer2.f();
                        composer2.f();
                        DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, ToneColors.i, composer2, null);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 805306368, 508);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            recomposeScopeImplX2.d = new Function2() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.compose.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ProductItemUiKt.b(uiModel, z, z2, z3, onProductItemClick, onCheckedChange, onAddToCartButtonClick, onCopyToListClick, onProductQuantityClick, onAisleClicked, modifier2, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void c(ProductItemUiModel productItemUiModel, Function1 function1, Composer composer, int i) {
        ProductShoppingList productShoppingList;
        ProductShoppingList productShoppingList2;
        ComposerImpl composerImplV = composer.v(-978786513);
        int i2 = (composerImplV.I(productItemUiModel) ? 4 : 2) | i | (composerImplV.I(function1) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f = productItemUiModel.h;
            ProductCard productCard = productItemUiModel.i;
            String unitLabel = null;
            String strB = StringResources_androidKt.b(R.string.shop_lists_quantity_button_description, new Object[]{ProductQuantityHelper.getQuantityLabel(f, (productCard == null || (productShoppingList2 = productCard.getProductShoppingList()) == null) ? null : productShoppingList2.getUnitLabel())}, composerImplV);
            float f2 = productItemUiModel.h;
            if (productCard != null && (productShoppingList = productCard.getProductShoppingList()) != null) {
                unitLabel = productShoppingList.getUnitLabel();
            }
            final String quantityLabel = ProductQuantityHelper.getQuantityLabel(f2, unitLabel);
            Modifier modifierU = SizeKt.u(PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, 11), 64);
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(strB);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zN || objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.shared.ui.compose.a(strB, 15);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifierU, false, (Function1) objG);
            BorderStroke borderStrokeA = BorderStrokeKt.a(ToneColors.g, 1);
            float f3 = 8;
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f3, f3, f3, f3);
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(productItemUiModel) | ((i2 & 112) == 32);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new c(function1, productItemUiModel, 1);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            ButtonKt.b((Function0) objG2, modifierB, false, null, null, borderStrokeA, null, paddingValuesImpl, ComposableLambdaKt.c(589339553, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.compose.ProductItemUiKt$QuantityButtonUi$3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    RowScope OutlinedButton = (RowScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(OutlinedButton, "$this$OutlinedButton");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        TextStyle textStyle = WxTheme.b(composer2).q;
                        TextKt.b(quantityLabel, null, ToneColors.e, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer2, 0, 0, 65530);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 905969664, 188);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.b(productItemUiModel, i, 23, function1);
        }
    }
}
