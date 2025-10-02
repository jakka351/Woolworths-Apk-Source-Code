package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.design.core.ui.component.stable.CheckboxKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardResult;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.TermItemUiModel;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeLink;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContract;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.TermsBottomSheetData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ a(int i, Object obj, Object obj2, Object obj3) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.e;
                SheetState sheetState = (SheetState) this.f;
                final PaymentViewModel paymentViewModel = (PaymentViewModel) this.g;
                final AddCreditCardResult result = (AddCreditCardResult) obj;
                Intrinsics.h(result, "result");
                ((JobSupport) BuildersKt.c(coroutineScope, null, null, new PaymentBottomSheetKt$PaymentBottomSheet$1$1$1(sheetState, null), 3)).invokeOnCompletion(new Function1() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Object value;
                        PaymentViewModel paymentViewModel2 = paymentViewModel;
                        paymentViewModel2.getClass();
                        AddCreditCardResult result2 = result;
                        Intrinsics.h(result2, "result");
                        MutableStateFlow mutableStateFlow = paymentViewModel2.k;
                        do {
                            value = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.d(value, PaymentContract.ViewState.a((PaymentContract.ViewState) value, null, null, null, null, false, null, null, null, null, 503)));
                        if (result2 instanceof AddCreditCardResult.LinkedCard) {
                            paymentViewModel2.o = ((AddCreditCardResult.LinkedCard) result2).f8330a;
                        }
                        if (!(result2 instanceof AddCreditCardResult.None)) {
                            PaymentViewModel.q6(paymentViewModel2, 7);
                        }
                        return Unit.f24250a;
                    }
                });
                break;
            default:
                TermsBottomSheetData.Terms terms = (TermsBottomSheetData.Terms) this.e;
                final Function2 function2 = (Function2) this.f;
                final Function1 function1 = (Function1) this.g;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.h(LazyColumn, "$this$LazyColumn");
                final List list = terms.f10894a.b;
                LazyColumn.b(list.size(), null, new Function1<Integer, Object>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.TermsContentKt$TermsContent$lambda$11$lambda$8$lambda$7$lambda$6$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        list.get(((Number) obj2).intValue());
                        return null;
                    }
                }, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.TermsContentKt$TermsContent$lambda$11$lambda$8$lambda$7$lambda$6$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        Object obj6 = (LazyItemScope) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Composer composer = (Composer) obj4;
                        int iIntValue2 = ((Number) obj5).intValue();
                        int i = (iIntValue2 & 6) == 0 ? (composer.n(obj6) ? 4 : 2) | iIntValue2 : iIntValue2;
                        if ((iIntValue2 & 48) == 0) {
                            i |= composer.r(iIntValue) ? 32 : 16;
                        }
                        if (composer.z(i & 1, (i & 147) != 146)) {
                            final TermItemUiModel termItemUiModel = (TermItemUiModel) list.get(iIntValue);
                            composer.o(361588319);
                            Modifier.Companion companion = Modifier.Companion.d;
                            Modifier modifierE = SizeKt.e(companion, 1.0f);
                            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composer, 0);
                            int p = composer.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
                            Modifier modifierD = ComposedModifierKt.d(composer, modifierE);
                            ComposeUiNode.e3.getClass();
                            Function0 function0 = ComposeUiNode.Companion.b;
                            if (composer.w() == null) {
                                ComposablesKt.b();
                                throw null;
                            }
                            composer.i();
                            if (composer.getO()) {
                                composer.K(function0);
                            } else {
                                composer.e();
                            }
                            Updater.b(composer, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                            Updater.b(composer, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                            Function2 function22 = ComposeUiNode.Companion.j;
                            if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                                androidx.camera.core.impl.b.z(p, composer, p, function22);
                            }
                            Updater.b(composer, modifierD, ComposeUiNode.Companion.d);
                            boolean z = termItemUiModel.c;
                            int i2 = -1633490746;
                            composer.o(-1633490746);
                            final Function2 function23 = function2;
                            boolean zN = composer.n(function23) | composer.I(termItemUiModel);
                            Object objG = composer.G();
                            Object obj7 = Composer.Companion.f1624a;
                            if (zN || objG == obj7) {
                                objG = new Function1<Boolean, Unit>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.TermsContentKt$TermsContent$1$1$1$1$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj8) {
                                        ((Boolean) obj8).booleanValue();
                                        function23.invoke(termItemUiModel, Boolean.valueOf(!r3.c));
                                        return Unit.f24250a;
                                    }
                                };
                                composer.A(objG);
                            }
                            composer.l();
                            CheckboxKt.a(0, 12, composer, null, (Function1) objG, z, false);
                            String str = termItemUiModel.f10869a;
                            List<DeliveryUnlimitedSubscribeLink> list2 = termItemUiModel.b;
                            composer.o(20467292);
                            AnnotatedString.Builder builder = new AnnotatedString.Builder();
                            builder.e(str);
                            composer.o(20470304);
                            for (final DeliveryUnlimitedSubscribeLink deliveryUnlimitedSubscribeLink : list2) {
                                int iC = StringsKt.C(str, deliveryUnlimitedSubscribeLink.getText(), 0, false, 6);
                                int length = deliveryUnlimitedSubscribeLink.getText().length() + iC;
                                String str2 = deliveryUnlimitedSubscribeLink.getText() + deliveryUnlimitedSubscribeLink.getUrl();
                                composer.o(i2);
                                final Function1 function12 = function1;
                                boolean zN2 = composer.n(function12) | composer.n(deliveryUnlimitedSubscribeLink);
                                Object objG2 = composer.G();
                                if (zN2 || objG2 == obj7) {
                                    objG2 = new LinkInteractionListener() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.TermsContentKt$TermsContent$1$1$1$1$1$1$annotatedString$1$1$1$1
                                        @Override // androidx.compose.ui.text.LinkInteractionListener
                                        public final void a(LinkAnnotation it) {
                                            Intrinsics.h(it, "it");
                                            function12.invoke(deliveryUnlimitedSubscribeLink);
                                        }
                                    };
                                    composer.A(objG2);
                                }
                                composer.l();
                                builder.a(new LinkAnnotation.Clickable(str2, null, (LinkInteractionListener) objG2), iC, length);
                                builder.c(new SpanStyle(CoreTheme.b(composer).e.d.f4856a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65534), iC, length);
                                i2 = -1633490746;
                            }
                            composer.l();
                            AnnotatedString annotatedStringM = builder.m();
                            composer.l();
                            TextKt.c(annotatedStringM, RowScopeInstance.f974a.b(companion, Alignment.Companion.k), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, CoreTheme.f(composer).f5120a.b.f5123a, composer, 0, 0, 131068);
                            composer.f();
                            SpacerKt.a(composer, SizeKt.g(companion, 16));
                            composer.l();
                        } else {
                            composer.j();
                        }
                        return Unit.f24250a;
                    }
                }, true, -632812321));
                break;
        }
        return Unit.f24250a;
    }
}
