package au.com.woolworths.shop.checkout.ui.summary.promocode;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.design.core.ui.component.experimental.loadingbutton.PrimaryLoadingButtonKt;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.product.list.v2.ui.f;
import au.com.woolworths.sdui.legacy.banner.designcoreadapter.StandardAlertKt;
import au.com.woolworths.shop.cart.ui.cart.l;
import au.com.woolworths.shop.checkout.domain.model.ApplyCheckoutPromoCodeResult;
import au.com.woolworths.shop.checkout.domain.model.CheckoutPromoCode;
import au.com.woolworths.shop.checkout.ui.content.ModalBottomSheetData;
import au.com.woolworths.shop.checkout.ui.summary.common.DiscountItemUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PromoCodeUiKt {
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r8v7 */
    public static final void a(boolean z, final ModalBottomSheetData.PromoCode bottomSheetData, final Function1 onValueChange, Function0 onApplyPromoCode, final Function1 onRemovePromoCode, Function0 onSnackBarMessageShown, final Function1 onInsetBannerActionClick, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        ?? r8;
        boolean z2;
        SnackbarHostState snackbarHostState;
        int i5;
        Modifier modifier3;
        Intrinsics.h(bottomSheetData, "bottomSheetData");
        String str = bottomSheetData.b;
        Intrinsics.h(onValueChange, "onValueChange");
        Intrinsics.h(onApplyPromoCode, "onApplyPromoCode");
        Intrinsics.h(onRemovePromoCode, "onRemovePromoCode");
        Intrinsics.h(onSnackBarMessageShown, "onSnackBarMessageShown");
        Intrinsics.h(onInsetBannerActionClick, "onInsetBannerActionClick");
        ComposerImpl composerImplV = composer.v(223427477);
        if ((i & 6) == 0) {
            i3 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | (composerImplV.I(bottomSheetData) ? 32 : 16);
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i6 |= composerImplV.I(onValueChange) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i6 |= composerImplV.I(onApplyPromoCode) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i6 |= composerImplV.I(onRemovePromoCode) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i6 |= composerImplV.I(onSnackBarMessageShown) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i6 |= composerImplV.I(onInsetBannerActionClick) ? 1048576 : 524288;
        }
        int i7 = i2 & 128;
        if (i7 != 0) {
            i4 = i6 | 12582912;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i4 = i6 | (composerImplV.n(modifier2) ? 8388608 : 4194304);
        }
        if ((i4 & 4793491) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier2;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifier4 = i7 != 0 ? companion : modifier2;
            final Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            FocusManager focusManager = (FocusManager) composerImplV.x(CompositionLocalsKt.i);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objG;
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new SnackbarHostState();
                composerImplV.A(objG2);
            }
            SnackbarHostState snackbarHostState2 = (SnackbarHostState) objG2;
            composerImplV.V(false);
            Text text = bottomSheetData.c;
            CharSequence text2 = text != null ? text.getText(context) : null;
            composerImplV.o(-34535172);
            if (text2 != null) {
                focusManager.u(false);
                composerImplV.o(-1633490746);
                boolean zI = composerImplV.I(text2);
                Object objG3 = composerImplV.G();
                if (zI || objG3 == composer$Companion$Empty$1) {
                    r8 = 0;
                    objG3 = new PromoCodeUiKt$PromoCodeUi$1$1$1(snackbarHostState2, text2, null);
                    composerImplV.A(objG3);
                } else {
                    r8 = 0;
                }
                composerImplV.V(false);
                BuildersKt.c(coroutineScope, r8, r8, (Function2) objG3, 3);
                onSnackBarMessageShown.invoke();
            }
            composerImplV.V(false);
            float f = 16;
            Modifier modifierJ = PaddingKt.j(modifier4.x0(SizeKt.c), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i8 = composerImplV.P;
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                androidx.camera.core.impl.b.B(i8, composerImplV, i8, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier modifierJ2 = PaddingKt.j(ColumnScopeInstance.f948a.a(companion, 1.0f, true), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 7);
            composerImplV.o(-1224400529);
            boolean zI2 = composerImplV.I(bottomSheetData) | ((i4 & 896) == 256) | composerImplV.I(context) | ((3670016 & i4) == 1048576) | ((57344 & i4) == 16384);
            Object objG4 = composerImplV.G();
            if (zI2 || objG4 == composer$Companion$Empty$1) {
                z2 = true;
                snackbarHostState = snackbarHostState2;
                i5 = i4;
                Function1 function1 = new Function1() { // from class: au.com.woolworths.shop.checkout.ui.summary.promocode.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        final ModalBottomSheetData.PromoCode promoCode = bottomSheetData;
                        final Function1 function12 = onValueChange;
                        final Context context2 = context;
                        final Function1 function13 = onInsetBannerActionClick;
                        LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.promocode.PromoCodeUiKt$PromoCodeUi$2$1$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                Modifier.Companion companion2;
                                PromoCodeUiKt$PromoCodeUi$2$1$1$1 promoCodeUiKt$PromoCodeUi$2$1$1$1;
                                Composer composer2;
                                LazyItemScope item = (LazyItemScope) obj2;
                                Composer composer3 = (Composer) obj3;
                                int iIntValue = ((Number) obj4).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    Modifier.Companion companion3 = Modifier.Companion.d;
                                    float f2 = 16;
                                    Modifier modifierH = PaddingKt.h(SizeKt.e(companion3, 1.0f), f2, BitmapDescriptorFactory.HUE_RED, 2);
                                    final ModalBottomSheetData.PromoCode promoCode2 = promoCode;
                                    String str2 = promoCode2.b;
                                    TextStyle textStyle = CoreTheme.f(composer3).f5120a.b.f5123a;
                                    ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-2113292080, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.promocode.PromoCodeUiKt$PromoCodeUi$2$1$1$1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            Composer composer4 = (Composer) obj5;
                                            if ((((Number) obj6).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                String str3 = promoCode2.f10760a.f.f10576a;
                                                if (str3 != null) {
                                                    TextKt.b(str3, null, CoreTheme.b(composer4).e.d.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer4).f5120a.b.f5123a, composer4, 0, 0, 65530);
                                                }
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3);
                                    ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$PromoCodeUiKt.f10827a;
                                    final Function1 function14 = function12;
                                    OutlinedTextFieldKt.b(str2, function12, modifierH, false, false, textStyle, composableLambdaImplC, null, composableLambdaImpl, ComposableLambdaKt.c(385499603, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.promocode.PromoCodeUiKt$PromoCodeUi$2$1$1$1.2
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            Composer composer4 = (Composer) obj5;
                                            if ((((Number) obj6).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else if (!StringsKt.D(promoCode2.b)) {
                                                ImageVector imageVector = CoreTheme.e(composer4).f4879a.H;
                                                long j = CoreTheme.b(composer4).e.c.d;
                                                String strC = StringResources_androidKt.c(composer4, R.string.checkout_promo_code_clear);
                                                composer4.o(5004770);
                                                Function1 function15 = function14;
                                                boolean zN = composer4.n(function15);
                                                Object objG5 = composer4.G();
                                                if (zN || objG5 == Composer.Companion.f1624a) {
                                                    objG5 = new f(26, function15);
                                                    composer4.A(objG5);
                                                }
                                                composer4.l();
                                                IconKt.b(imageVector, strC, ClickableKt.d(Modifier.Companion.d, false, null, null, (Function0) objG5, 7), j, composer4, 0, 0);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), false, null, null, null, true, 0, 0, null, null, null, composer3, 907542912, 24576, 1031320);
                                    Composer composer4 = composer3;
                                    Text text3 = promoCode2.d;
                                    composer4.o(-2032216184);
                                    if (text3 == null) {
                                        companion2 = companion3;
                                        promoCodeUiKt$PromoCodeUi$2$1$1$1 = this;
                                        composer2 = composer4;
                                    } else {
                                        Modifier modifierJ3 = PaddingKt.j(SizeKt.e(companion3, 1.0f), f2, f2, f2, BitmapDescriptorFactory.HUE_RED, 8);
                                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composer4, 0);
                                        int p = composer4.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer4.d();
                                        Modifier modifierD2 = ComposedModifierKt.d(composer4, modifierJ3);
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
                                        Updater.b(composer4, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                                        Updater.b(composer4, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                        Function2 function22 = ComposeUiNode.Companion.j;
                                        if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p))) {
                                            androidx.camera.core.impl.b.z(p, composer4, p, function22);
                                        }
                                        Updater.b(composer4, modifierD2, ComposeUiNode.Companion.d);
                                        IconKt.b(CoreTheme.e(composer4).i.b, null, null, CoreTheme.b(composer4).b.b.f4805a, composer4, 48, 4);
                                        companion2 = companion3;
                                        promoCodeUiKt$PromoCodeUi$2$1$1$1 = this;
                                        TextKt.b(text3.getText(context2).toString(), PaddingKt.j(companion3, 8, 4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer4).f5120a.b.f5123a, composer4, 48, 0, 65532);
                                        Composer composer5 = composer4;
                                        composer5.f();
                                        composer2 = composer5;
                                    }
                                    composer2.l();
                                    ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeAdditionalInfo applyCheckoutPromoCodeAdditionalInfo = promoCode2.f;
                                    if (applyCheckoutPromoCodeAdditionalInfo != null) {
                                        Modifier modifierJ4 = PaddingKt.j(companion2, f2, f2, f2, BitmapDescriptorFactory.HUE_RED, 8);
                                        InsetBannerData uiModel = InsetBannerApiDataExtKt.toUiModel(applyCheckoutPromoCodeAdditionalInfo.b);
                                        composer2.o(-1633490746);
                                        Function1 function15 = function13;
                                        boolean zN = composer2.n(function15) | composer2.I(applyCheckoutPromoCodeAdditionalInfo);
                                        Object objG5 = composer2.G();
                                        if (zN || objG5 == Composer.Companion.f1624a) {
                                            objG5 = new l(13, function15, applyCheckoutPromoCodeAdditionalInfo);
                                            composer2.A(objG5);
                                        }
                                        composer2.l();
                                        StandardAlertKt.c(uiModel, modifierJ4, (Function1) objG5, composer2, 48, 0);
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, true, -833398742), 3);
                        final List list = promoCode.f10760a.f.c;
                        int size = list.size();
                        Function1<Integer, Object> function14 = new Function1<Integer, Object>() { // from class: au.com.woolworths.shop.checkout.ui.summary.promocode.PromoCodeUiKt$PromoCodeUi$lambda$10$lambda$7$lambda$6$$inlined$items$default$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                list.get(((Number) obj2).intValue());
                                return null;
                            }
                        };
                        final Function1 function15 = onRemovePromoCode;
                        LazyColumn.b(size, null, function14, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.promocode.PromoCodeUiKt$PromoCodeUi$lambda$10$lambda$7$lambda$6$$inlined$items$default$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                int i9;
                                LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                                int iIntValue = ((Number) obj3).intValue();
                                Composer composer2 = (Composer) obj4;
                                int iIntValue2 = ((Number) obj5).intValue();
                                if ((iIntValue2 & 6) == 0) {
                                    i9 = (composer2.n(lazyItemScope) ? 4 : 2) | iIntValue2;
                                } else {
                                    i9 = iIntValue2;
                                }
                                if ((iIntValue2 & 48) == 0) {
                                    i9 |= composer2.r(iIntValue) ? 32 : 16;
                                }
                                if (composer2.z(i9 & 1, (i9 & 147) != 146)) {
                                    CheckoutPromoCode checkoutPromoCode = (CheckoutPromoCode) list.get(iIntValue);
                                    composer2.o(-941839738);
                                    composer2.o(108165405);
                                    if (!(checkoutPromoCode instanceof CheckoutPromoCode.CheckoutPromoCodeItem)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    final CheckoutPromoCode.CheckoutPromoCodeItem checkoutPromoCodeItem = (CheckoutPromoCode.CheckoutPromoCodeItem) checkoutPromoCode;
                                    boolean z3 = checkoutPromoCodeItem.e;
                                    if (z3) {
                                        String str2 = checkoutPromoCodeItem.f10575a;
                                        String str3 = checkoutPromoCodeItem.b;
                                        String str4 = checkoutPromoCodeItem.c;
                                        String str5 = checkoutPromoCodeItem.d;
                                        Boolean bool = checkoutPromoCodeItem.g;
                                        long j = CoreTheme.d(composer2).f4872a.f;
                                        float f2 = 16;
                                        Modifier modifierJ3 = PaddingKt.j(Modifier.Companion.d, f2, f2, f2, BitmapDescriptorFactory.HUE_RED, 8);
                                        Color color = new Color(j);
                                        composer2.o(1849434622);
                                        Object objG5 = composer2.G();
                                        Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                                        if (objG5 == composer$Companion$Empty$12) {
                                            objG5 = PromoCodeUiKt$PromoCodeUi$2$1$1$2$1$1.d;
                                            composer2.A(objG5);
                                        }
                                        Function0 function02 = (Function0) objG5;
                                        final Function1 function16 = function15;
                                        boolean zN = composer2.n(checkoutPromoCode) | au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.C(-1633490746, composer2, function16);
                                        Object objG6 = composer2.G();
                                        if (zN || objG6 == composer$Companion$Empty$12) {
                                            objG6 = new Function0<Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.promocode.PromoCodeUiKt$PromoCodeUi$2$1$1$2$2$1
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    function16.invoke(checkoutPromoCodeItem.f);
                                                    return Unit.f24250a;
                                                }
                                            };
                                            composer2.A(objG6);
                                        }
                                        composer2.l();
                                        DiscountItemUiKt.a(str2, str3, str4, str5, z3, bool, R.drawable.ic_promo_code, color, function02, (Function0) objG6, modifierJ3, composer2, 100663296);
                                        composer2.l();
                                        composer2.l();
                                    } else {
                                        composer2.l();
                                        composer2.l();
                                    }
                                } else {
                                    composer2.j();
                                }
                                return Unit.f24250a;
                            }
                        }, true, -632812321));
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(function1);
                objG4 = function1;
            } else {
                i5 = i4;
                z2 = true;
                snackbarHostState = snackbarHostState2;
            }
            composerImplV.V(false);
            Modifier modifier5 = modifier4;
            int i9 = i5;
            LazyDslKt.b(modifierJ2, null, null, false, null, null, null, false, null, (Function1) objG4, composerImplV, 0, 510);
            composerImplV = composerImplV;
            SnackbarHostKt.b(snackbarHostState, null, composerImplV, 6, 2);
            composerImplV.o(966767334);
            WeakHashMap weakHashMap = WindowInsetsHolder.x;
            if (((Boolean) ((SnapshotMutableStateImpl) WindowInsetsHolder.Companion.c(composerImplV).c.d).getD()).booleanValue() || !StringsKt.D(str)) {
                Modifier modifierJ3 = PaddingKt.j(SizeKt.e(companion, 1.0f), f, BitmapDescriptorFactory.HUE_RED, f, f, 2);
                String str2 = bottomSheetData.f10760a.f.b;
                boolean z3 = !StringsKt.D(str);
                composerImplV.o(5004770);
                boolean z4 = (i9 & 7168) == 2048 ? z2 : false;
                Object objG5 = composerImplV.G();
                if (z4 || objG5 == composer$Companion$Empty$1) {
                    objG5 = new au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui.f(19, onApplyPromoCode);
                    composerImplV.A(objG5);
                }
                composerImplV.V(false);
                PrimaryLoadingButtonKt.a(str2, (Function0) objG5, z3, z, modifierJ3, null, null, composerImplV, ((i9 << 9) & 7168) | 24576, 992);
                composerImplV = composerImplV;
            }
            composerImplV.V(false);
            composerImplV.V(z2);
            modifier3 = modifier5;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.onboarding.ui.d(z, bottomSheetData, onValueChange, onApplyPromoCode, onRemovePromoCode, onSnackBarMessageShown, onInsetBannerActionClick, modifier3, i, i2);
        }
    }
}
