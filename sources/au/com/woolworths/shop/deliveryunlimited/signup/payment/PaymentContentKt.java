package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.IntSize;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.compose.utils.modifier.AlphaShadowKt;
import au.com.woolworths.design.core.ui.component.experimental.CardKt;
import au.com.woolworths.design.core.ui.component.experimental.loadingbutton.PrimaryLoadingButtonKt;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertKt;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle;
import au.com.woolworths.design.core.ui.component.stable.alert.Placement;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodSection;
import au.com.woolworths.feature.shop.wpay.ui.wpay.CreditCardActions;
import au.com.woolworths.feature.shop.wpay.ui.wpay.CvvActions;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionAddItemKt;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionExpiredCreditCardItemKt;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionLinkedCreditCardItemKt;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionTitleItemKt;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedIconItem;
import au.com.woolworths.shop.deliveryunlimited.signup.domain.model.DeliveryUnlimitedPaymentResponse;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-delivery-unlimited-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PaymentContentKt {
    public static final void a(final DeliveryUnlimitedPaymentResponse deliveryUnlimitedPaymentResponse, final String str, final boolean z, final String str2, final String str3, final CreditCardActions creditCardActions, final CvvActions cvvActions, Function0 function0, final Function1 function1, Function2 function2, Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        DeliveryUnlimitedPaymentResponse deliveryUnlimitedPaymentResponse2;
        ComposerImpl composerImpl;
        Function2 function22 = function2;
        ComposerImpl composerImplV = composer.v(902597661);
        if ((i & 6) == 0) {
            i3 = (composerImplV.I(deliveryUnlimitedPaymentResponse) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerImplV.n(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerImplV.n(str3) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= (i & 262144) == 0 ? composerImplV.n(creditCardActions) : composerImplV.I(creditCardActions) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= (i & 2097152) == 0 ? composerImplV.n(cvvActions) : composerImplV.I(cvvActions) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerImplV.I(function0) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerImplV.I(function1) ? 67108864 : 33554432;
        }
        int i6 = i & 805306368;
        Modifier.Companion companion = Modifier.Companion.d;
        if (i6 == 0) {
            i3 |= composerImplV.n(companion) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerImplV.I(function22) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Modifier modifierX0 = BackgroundKt.b(companion, CoreTheme.b(composerImplV).f4782a.f4783a.d.b, RectangleShapeKt.f1779a).x0(SizeKt.c);
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i7 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierX0);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Function2 function23 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function23);
            Function2 function24 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function24);
            Function2 function25 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                androidx.camera.core.impl.b.B(i7, composerImplV, i7, function25);
            }
            Function2 function26 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function26);
            Modifier modifierA = ColumnScopeInstance.f948a.a(companion, 1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i8 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierA);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA2, function23);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function24);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                androidx.camera.core.impl.b.B(i8, composerImplV, i8, function25);
            }
            Updater.b(composerImplV, modifierD2, function26);
            float f = 16;
            Modifier modifierA2 = AnimationModifierKt.a(PaddingKt.j(companion, f, f, f, BitmapDescriptorFactory.HUE_RED, 8), AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntSize(VisibilityThresholdsKt.b()), 1), null);
            composerImplV.o(-1224400529);
            boolean zI = composerImplV.I(deliveryUnlimitedPaymentResponse) | ((57344 & i3) == 16384) | ((234881024 & i3) == 67108864) | ((i3 & 112) == 32) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048) | ((3670016 & i3) == 1048576 || ((i3 & 2097152) != 0 && composerImplV.I(cvvActions))) | ((458752 & i3) == 131072 || ((i3 & 262144) != 0 && composerImplV.I(creditCardActions)));
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                i5 = i3;
                Function1 function12 = new Function1() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        final String str4 = str3;
                        if (str4 != null) {
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContentKt$DeliveryUnlimitedPaymentsOptions$1$1$1$1$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        AlertKt.c(AlertStyle.g, Placement.d, null, null, str4, null, null, composer2, 54, 108);
                                        SpacerKt.a(composer2, SizeKt.g(Modifier.Companion.d, 16));
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, -239258404), 3);
                        }
                        final DeliveryUnlimitedPaymentResponse deliveryUnlimitedPaymentResponse3 = deliveryUnlimitedPaymentResponse;
                        final PaymentMethodSection paymentMethodSection = deliveryUnlimitedPaymentResponse3.getPaymentMethodSection();
                        if (!paymentMethodSection.getPaymentMethods().isEmpty()) {
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContentKt$DeliveryUnlimitedPaymentsOptions$1$1$1$1$2$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        SectionTitleItemKt.a(0, composer2, null, paymentMethodSection.getTitle());
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 260884889), 3);
                        }
                        final List paymentMethods = paymentMethodSection.getPaymentMethods();
                        int size = paymentMethods.size();
                        Function1<Integer, Object> function13 = new Function1<Integer, Object>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContentKt$DeliveryUnlimitedPaymentsOptions$lambda$12$lambda$11$lambda$9$lambda$8$lambda$7$$inlined$items$default$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                paymentMethods.get(((Number) obj2).intValue());
                                return null;
                            }
                        };
                        final Function1 function14 = function1;
                        final String str5 = str;
                        final boolean z2 = z;
                        final String str6 = str2;
                        final CvvActions cvvActions2 = cvvActions;
                        final CreditCardActions creditCardActions2 = creditCardActions;
                        LazyColumn.b(size, null, function13, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContentKt$DeliveryUnlimitedPaymentsOptions$lambda$12$lambda$11$lambda$9$lambda$8$lambda$7$$inlined$items$default$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                int i9;
                                Object obj6 = (LazyItemScope) obj2;
                                int iIntValue = ((Number) obj3).intValue();
                                Composer composer2 = (Composer) obj4;
                                int iIntValue2 = ((Number) obj5).intValue();
                                if ((iIntValue2 & 6) == 0) {
                                    i9 = (composer2.n(obj6) ? 4 : 2) | iIntValue2;
                                } else {
                                    i9 = iIntValue2;
                                }
                                if ((iIntValue2 & 48) == 0) {
                                    i9 |= composer2.r(iIntValue) ? 32 : 16;
                                }
                                if (composer2.z(i9 & 1, (i9 & 147) != 146)) {
                                    Object obj7 = (PaymentMethodItem) paymentMethods.get(iIntValue);
                                    composer2.o(-843267891);
                                    boolean z3 = obj7 instanceof PaymentMethodItem.CreditCard.Add;
                                    Object obj8 = Composer.Companion.f1624a;
                                    if (z3) {
                                        composer2.o(-843251834);
                                        final PaymentMethodItem.CreditCard.Add add = (PaymentMethodItem.CreditCard.Add) obj7;
                                        String title = add.getTitle();
                                        composer2.o(-1633490746);
                                        final Function1 function15 = function14;
                                        boolean zI2 = composer2.I(obj7) | composer2.n(function15);
                                        Object objG2 = composer2.G();
                                        if (zI2 || objG2 == obj8) {
                                            objG2 = new Function0<Unit>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContentKt$DeliveryUnlimitedPaymentsOptions$1$1$1$1$2$2$1$1
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    function15.invoke(add);
                                                    return Unit.f24250a;
                                                }
                                            };
                                            composer2.A(objG2);
                                        }
                                        composer2.l();
                                        SectionOptionAddItemKt.a(title, null, null, (Function0) objG2, composer2, 0, 6);
                                        composer2.l();
                                    } else if (obj7 instanceof PaymentMethodItem.PayPal.Add) {
                                        composer2.o(-842929341);
                                        composer2.l();
                                    } else if (obj7 instanceof PaymentMethodItem.CreditCard.Linked) {
                                        composer2.o(-842742535);
                                        final PaymentMethodItem.CreditCard.Linked linked = (PaymentMethodItem.CreditCard.Linked) obj7;
                                        final boolean zC = Intrinsics.c(linked.getId(), str5);
                                        Map map = deliveryUnlimitedPaymentResponse3.f10874a;
                                        CvvActions cvvActions3 = cvvActions2;
                                        Function1 function16 = cvvActions3.f8361a;
                                        Function0 function03 = cvvActions3.b;
                                        Function2 function27 = cvvActions3.c;
                                        Function0 function04 = cvvActions3.d;
                                        Function2 function28 = cvvActions3.e;
                                        composer2.o(-1746271574);
                                        final CreditCardActions creditCardActions3 = creditCardActions2;
                                        boolean zI3 = composer2.I(creditCardActions3) | composer2.I(obj7) | composer2.p(zC);
                                        Object objG3 = composer2.G();
                                        if (zI3 || objG3 == obj8) {
                                            objG3 = new Function0<Unit>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContentKt$DeliveryUnlimitedPaymentsOptions$1$1$1$1$2$2$2$1
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    creditCardActions3.c.invoke(linked.getId(), Boolean.valueOf(zC));
                                                    return Unit.f24250a;
                                                }
                                            };
                                            composer2.A(objG3);
                                        }
                                        Function0 function05 = (Function0) objG3;
                                        composer2.l();
                                        composer2.o(-1633490746);
                                        boolean zI4 = composer2.I(obj7) | composer2.I(creditCardActions3);
                                        Object objG4 = composer2.G();
                                        if (zI4 || objG4 == obj8) {
                                            objG4 = new Function0<Unit>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContentKt$DeliveryUnlimitedPaymentsOptions$1$1$1$1$2$2$3$1
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    creditCardActions3.b.invoke(linked.getId(), Boolean.TRUE);
                                                    return Unit.f24250a;
                                                }
                                            };
                                            composer2.A(objG4);
                                        }
                                        composer2.l();
                                        SectionOptionLinkedCreditCardItemKt.a(linked, map, zC, z2, str6, function16, function03, function27, function04, function28, function05, (Function0) objG4, composer2, 0);
                                        composer2.l();
                                    } else if (obj7 instanceof PaymentMethodItem.CreditCard.Unlinked) {
                                        composer2.o(-841383805);
                                        composer2.l();
                                    } else if (obj7 instanceof PaymentMethodItem.CreditCard.Expired) {
                                        composer2.o(-841229270);
                                        PaymentMethodItem.CreditCard.Expired expired = (PaymentMethodItem.CreditCard.Expired) obj7;
                                        composer2.o(1849434622);
                                        Object objG5 = composer2.G();
                                        if (objG5 == obj8) {
                                            objG5 = PaymentContentKt$DeliveryUnlimitedPaymentsOptions$1$1$1$1$2$2$4$1.d;
                                            composer2.A(objG5);
                                        }
                                        composer2.l();
                                        SectionOptionExpiredCreditCardItemKt.a(expired, (Function0) objG5, composer2, 48);
                                        composer2.l();
                                    } else if (obj7 instanceof PaymentMethodItem.PayPal.Linked) {
                                        composer2.o(-840907645);
                                        composer2.l();
                                    } else {
                                        if (!(obj7 instanceof PaymentMethodItem.GooglePay)) {
                                            throw au.com.woolworths.android.onesite.a.x(composer2, 111345142);
                                        }
                                        composer2.o(-840770098);
                                        composer2.l();
                                    }
                                    composer2.l();
                                } else {
                                    composer2.j();
                                }
                                return Unit.f24250a;
                            }
                        }, true, -632812321));
                        return Unit.f24250a;
                    }
                };
                deliveryUnlimitedPaymentResponse2 = deliveryUnlimitedPaymentResponse;
                composerImplV.A(function12);
                objG = function12;
            } else {
                i5 = i3;
                deliveryUnlimitedPaymentResponse2 = deliveryUnlimitedPaymentResponse;
            }
            composerImplV.V(false);
            LazyDslKt.b(modifierA2, null, null, false, null, null, null, false, null, (Function1) objG, composerImplV, 0, 510);
            composerImpl = composerImplV;
            String description = deliveryUnlimitedPaymentResponse2.getDescription();
            composerImpl.o(-47472999);
            if (description != null) {
                SpacerKt.a(composerImpl, SizeKt.g(companion, f));
                TextKt.b(description, PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, 2), CoreTheme.b(composerImpl).e.d.b, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, CoreTheme.f(composerImpl).b.f5125a.b, composerImpl, 48, 0, 65016);
            }
            composerImpl.V(false);
            int i9 = i5 & 14;
            c(deliveryUnlimitedPaymentResponse2, composerImpl, i9);
            SpacerKt.a(composerImpl, SizeKt.g(companion, f));
            composerImpl.V(true);
            function22 = function2;
            function22.invoke(composerImpl, Integer.valueOf(i4 & 14));
            e(deliveryUnlimitedPaymentResponse2, str != null, function0, null, composerImpl, i9 | ((i5 >> 15) & 896));
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.chip.c(deliveryUnlimitedPaymentResponse, str, z, str2, str3, creditCardActions, cvvActions, function0, function1, function22, i, i2);
        }
    }

    public static final void b(Throwable th, Function0 function0, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1033032967);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(th) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean z = th instanceof NoConnectivityException;
            FullPageMessageUiKt.a(FullPageMessageSpec.Companion.d(PainterResources_androidKt.a(R.drawable.ic_order_server_error, 0, composerImplV), StringResources_androidKt.c(composerImplV, z ? R.string.checkout_wpay_for_order_connection_error_title : R.string.checkout_wpay_for_order_server_error_title), StringResources_androidKt.c(composerImplV, z ? R.string.checkout_wpay_for_order_connection_error_msg : R.string.checkout_wpay_for_order_server_error_msg), StringResources_androidKt.c(composerImplV, R.string.try_again_button_text), function0), null, null, composerImplV, 0, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.wpay.ui.wpay.g(th, function0, i, 1);
        }
    }

    public static final void c(DeliveryUnlimitedPaymentResponse deliveryUnlimitedPaymentResponse, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1350309457);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(deliveryUnlimitedPaymentResponse) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            DeliveryUnlimitedIconItem iconItem = deliveryUnlimitedPaymentResponse.getIconItem();
            if (iconItem != null) {
                float f = 16;
                Modifier.Companion companion = Modifier.Companion.d;
                SpacerKt.a(composerImplV, SizeKt.g(companion, f));
                RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
                int i3 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
                Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
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
                SingletonAsyncImageKt.a(iconItem.getIconUrl(), null, SizeKt.q(PaddingKt.j(companion, f, BitmapDescriptorFactory.HUE_RED, 9, BitmapDescriptorFactory.HUE_RED, 10), 24), null, null, composerImplV, 432, 2040);
                TextKt.b(iconItem.getLabel(), null, CoreTheme.b(composerImplV).e.d.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).b.f5125a.b, composerImplV, 0, 0, 65530);
                composerImplV = composerImplV;
                composerImplV.V(true);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.foundation.a(i, 5, deliveryUnlimitedPaymentResponse);
        }
    }

    public static final void d(final PageResult pageResult, final String str, final boolean z, final String str2, final String str3, final CreditCardActions creditCardActions, final CvvActions cvvActions, final Function0 onRetryLoad, final Function0 onSubscribeClick, final Function1 onAddCreditCard, Modifier modifier, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        ComposerImpl composerImpl;
        final Modifier modifier2;
        Intrinsics.h(pageResult, "pageResult");
        Intrinsics.h(onRetryLoad, "onRetryLoad");
        Intrinsics.h(onSubscribeClick, "onSubscribeClick");
        Intrinsics.h(onAddCreditCard, "onAddCreditCard");
        ComposerImpl composerImplV = composer.v(671113294);
        int i2 = i | (composerImplV.I(pageResult) ? 4 : 2) | (composerImplV.n(str) ? 32 : 16) | (composerImplV.p(z) ? 256 : 128) | (composerImplV.n(str2) ? 2048 : 1024) | (composerImplV.n(str3) ? 16384 : 8192) | (composerImplV.n(creditCardActions) ? 131072 : 65536) | (composerImplV.n(cvvActions) ? 1048576 : 524288) | (composerImplV.I(onRetryLoad) ? 8388608 : 4194304) | (composerImplV.I(onSubscribeClick) ? 67108864 : 33554432) | (composerImplV.I(onAddCreditCard) ? 536870912 : 268435456);
        if ((306783379 & i2) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            if (pageResult.equals(PageResult.Uninitialized.f8286a)) {
                composerImplV.o(63966994);
                composerImplV.V(false);
            } else if (pageResult instanceof PageResult.Fail) {
                composerImplV.o(694801654);
                b(((PageResult.Fail) pageResult).f8284a, onRetryLoad, composerImplV, (i2 >> 18) & 112);
                composerImplV.V(false);
            } else {
                if (!(pageResult instanceof PageResult.Success)) {
                    throw au.com.woolworths.android.onesite.a.w(694799213, composerImplV, false);
                }
                composerImplV.o(64169579);
                int i3 = 4194288 & i2;
                int i4 = i2 >> 3;
                a((DeliveryUnlimitedPaymentResponse) ((PageResult.Success) pageResult).f8285a, str, z, str2, str3, creditCardActions, cvvActions, onSubscribeClick, onAddCreditCard, composableLambdaImpl, composerImplV, (i4 & 234881024) | i3 | (29360128 & i4) | 805306368, 6);
                composerImpl = composerImplV;
                composerImpl.V(false);
                modifier2 = Modifier.Companion.d;
            }
            composerImpl = composerImplV;
            modifier2 = Modifier.Companion.d;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(str, z, str2, str3, creditCardActions, cvvActions, onRetryLoad, onSubscribeClick, onAddCreditCard, modifier2, composableLambdaImpl, i) { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.c
                public final /* synthetic */ String e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ String g;
                public final /* synthetic */ String h;
                public final /* synthetic */ CreditCardActions i;
                public final /* synthetic */ CvvActions j;
                public final /* synthetic */ Function0 k;
                public final /* synthetic */ Function0 l;
                public final /* synthetic */ Function1 m;
                public final /* synthetic */ Modifier n;
                public final /* synthetic */ ComposableLambdaImpl o;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    PaymentContentKt.d(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, RecomposeScopeImplKt.a(1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void e(final DeliveryUnlimitedPaymentResponse deliveryUnlimitedPaymentResponse, final boolean z, final Function0 function0, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-854217867);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(deliveryUnlimitedPaymentResponse) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function0) ? 256 : 128;
        }
        if (((i2 | 3072) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            modifier2 = Modifier.Companion.d;
            CardKt.a(AlphaShadowKt.a(modifier2, 16), RectangleShapeKt.f1779a, 0L, 0L, null, null, ComposableLambdaKt.c(1252679144, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContentKt$PaymentFooter$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope Card = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(Card, "$this$Card");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = 16;
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierF = PaddingKt.f(companion, f);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierF);
                        ComposeUiNode.e3.getClass();
                        Function0 function02 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function02);
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
                        Modifier modifierE = SizeKt.e(companion, 1.0f);
                        DeliveryUnlimitedPaymentResponse deliveryUnlimitedPaymentResponse2 = deliveryUnlimitedPaymentResponse;
                        String upperCase = deliveryUnlimitedPaymentResponse2.getFooter().getButton().getLabel().toUpperCase(Locale.ROOT);
                        Intrinsics.g(upperCase, "toUpperCase(...)");
                        composer2.o(5004770);
                        Function0 function03 = function0;
                        boolean zN = composer2.n(function03);
                        Object objG = composer2.G();
                        if (zN || objG == Composer.Companion.f1624a) {
                            objG = new au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui.f(21, function03);
                            composer2.A(objG);
                        }
                        composer2.l();
                        PrimaryLoadingButtonKt.a(upperCase, (Function0) objG, z, false, modifierE, null, null, composer2, 27648, 992);
                        SpacerKt.a(composer2, SizeKt.g(companion, f));
                        TextKt.b(deliveryUnlimitedPaymentResponse2.getFooter().getDisclaimer(), ColumnScopeInstance.f948a.b(companion, Alignment.Companion.n), CoreTheme.b(composer2).e.d.b, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, CoreTheme.f(composer2).b.f5125a.b, composer2, 0, 0, 65016);
                        SpacerKt.a(composer2, SizeKt.g(companion, f));
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1572912, 60);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.pullrefresh.a(deliveryUnlimitedPaymentResponse, z, function0, modifier2, i, 13);
        }
    }
}
