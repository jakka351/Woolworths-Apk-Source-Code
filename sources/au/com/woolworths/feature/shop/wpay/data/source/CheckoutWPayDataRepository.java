package au.com.woolworths.feature.shop.wpay.data.source;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.shop.wpay.domain.CheckoutWPayRepository;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.InputPayment;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.UnlinkedGiftCardInput;
import au.com.woolworths.payment.graphql.type.Payment;
import au.com.woolworths.payment.graphql.type.PaymentType;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/data/source/CheckoutWPayDataRepository;", "Lau/com/woolworths/feature/shop/wpay/domain/CheckoutWPayRepository;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CheckoutWPayDataRepository implements CheckoutWPayRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f8264a;
    public final ApolloClient b;
    public final FeatureToggleManager c;

    public CheckoutWPayDataRepository(ApolloClient apolloClientShop, ApolloClient apolloClientPayment, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(apolloClientShop, "apolloClientShop");
        Intrinsics.h(apolloClientPayment, "apolloClientPayment");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f8264a = apolloClientShop;
        this.b = apolloClientPayment;
        this.c = featureToggleManager;
    }

    public static Payment a(InputPayment inputPayment) {
        if (inputPayment instanceof InputPayment.CreditCard) {
            InputPayment.CreditCard creditCard = (InputPayment.CreditCard) inputPayment;
            Optional optionalA = Optional.Companion.a(creditCard.f8294a);
            return new Payment(creditCard.b, PaymentType.g, optionalA, null, null, null, 56);
        }
        if (inputPayment instanceof InputPayment.GooglePay) {
            InputPayment.GooglePay googlePay = (InputPayment.GooglePay) inputPayment;
            return new Payment(googlePay.f8295a, PaymentType.i, null, null, null, Optional.Companion.a(googlePay.b), 28);
        }
        if (!(inputPayment instanceof InputPayment.PayPal)) {
            if (inputPayment instanceof InputPayment.None) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        InputPayment.PayPal payPal = (InputPayment.PayPal) inputPayment;
        Optional optionalA2 = Optional.Companion.a(payPal.f8297a);
        return new Payment(payPal.b, PaymentType.h, optionalA2, null, null, null, 56);
    }

    public static Payment b(UnlinkedGiftCardInput unlinkedGiftCardInput) {
        return new Payment(unlinkedGiftCardInput.d, PaymentType.f, null, Optional.Companion.a(unlinkedGiftCardInput.f8320a), Optional.Companion.a(unlinkedGiftCardInput.b), null, 36);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(au.com.woolworths.feature.shop.wpay.domain.model.payment.InputPayment r18, java.util.List r19, java.util.List r20, java.lang.String r21, java.lang.String r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) throws java.lang.Exception {
        /*
            r17 = this;
            r1 = r17
            r0 = r23
            boolean r2 = r0 instanceof au.com.woolworths.feature.shop.wpay.data.source.CheckoutWPayDataRepository$mutationPay$1
            if (r2 == 0) goto L17
            r2 = r0
            au.com.woolworths.feature.shop.wpay.data.source.CheckoutWPayDataRepository$mutationPay$1 r2 = (au.com.woolworths.feature.shop.wpay.data.source.CheckoutWPayDataRepository$mutationPay$1) r2
            int r3 = r2.r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.r = r3
            goto L1c
        L17:
            au.com.woolworths.feature.shop.wpay.data.source.CheckoutWPayDataRepository$mutationPay$1 r2 = new au.com.woolworths.feature.shop.wpay.data.source.CheckoutWPayDataRepository$mutationPay$1
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.r
            r5 = 1
            if (r4 == 0) goto L3a
            if (r4 != r5) goto L32
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            goto Lce
        L2c:
            r0 = move-exception
            goto Ldf
        L2f:
            r0 = move-exception
            goto Le4
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3a:
            kotlin.ResultKt.b(r0)
            com.apollographql.apollo.ApolloClient r0 = r1.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r4 = r19
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r7 = 10
            int r8 = kotlin.collections.CollectionsKt.s(r4, r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r6.<init>(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.util.Iterator r4 = r4.iterator()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
        L52:
            boolean r8 = r4.hasNext()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            if (r8 == 0) goto L76
            java.lang.Object r8 = r4.next()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.feature.shop.wpay.domain.model.payment.LinkedGiftCardInput r8 = (au.com.woolworths.feature.shop.wpay.domain.model.payment.LinkedGiftCardInput) r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.payment.graphql.type.PaymentType r11 = au.com.woolworths.payment.graphql.type.PaymentType.f     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.lang.String r9 = r8.f8300a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.api.Optional r12 = com.apollographql.apollo.api.Optional.Companion.a(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            int r10 = r8.c     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.payment.graphql.type.Payment r9 = new au.com.woolworths.payment.graphql.type.Payment     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r15 = 0
            r16 = 56
            r13 = 0
            r14 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r6.add(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            goto L52
        L76:
            r4 = r20
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            int r7 = kotlin.collections.CollectionsKt.s(r4, r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r8.<init>(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.util.Iterator r4 = r4.iterator()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
        L87:
            boolean r7 = r4.hasNext()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            if (r7 == 0) goto L9b
            java.lang.Object r7 = r4.next()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.feature.shop.wpay.domain.model.payment.UnlinkedGiftCardInput r7 = (au.com.woolworths.feature.shop.wpay.domain.model.payment.UnlinkedGiftCardInput) r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.payment.graphql.type.Payment r7 = b(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r8.add(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            goto L87
        L9b:
            java.util.ArrayList r4 = kotlin.collections.CollectionsKt.c0(r8, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.payment.graphql.type.Payment r6 = a(r18)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.util.List r6 = kotlin.collections.CollectionsKt.S(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.util.ArrayList r4 = kotlin.collections.CollectionsKt.c0(r6, r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.api.Optional r6 = com.apollographql.apollo.api.Optional.Companion.a(r21)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.payment.graphql.type.PaymentInput r7 = new au.com.woolworths.payment.graphql.type.PaymentInput     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r8 = r22
            r7.<init>(r4, r6, r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.woolworths.feature.shop.payment.PayMutation r4 = new com.woolworths.feature.shop.payment.PayMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r4.<init>(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r0.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.ApolloCall r6 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r6.<init>(r0, r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r2.r = r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.lang.Object r0 = r6.b(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            if (r0 != r3) goto Lce
            return r3
        Lce:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.api.Operation$Data r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.woolworths.feature.shop.payment.PayMutation$Data r0 = (com.woolworths.feature.shop.payment.PayMutation.Data) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.woolworths.feature.shop.payment.PayMutation$Pay r0 = r0.f20207a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.feature.shop.wpay.domain.model.payment.WpayPaymentResponse r0 = au.com.woolworths.feature.shop.wpay.data.mappers.payment.PayMutationPayExtKt.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentResponse r0 = r0.f8321a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            return r0
        Ldf:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r0)
            throw r0
        Le4:
            java.lang.Exception r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.wpay.data.source.CheckoutWPayDataRepository.c(au.com.woolworths.feature.shop.wpay.domain.model.payment.InputPayment, java.util.List, java.util.List, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.util.List r17, java.lang.String r18, java.util.List r19, java.util.List r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.wpay.data.source.CheckoutWPayDataRepository.d(java.util.List, java.lang.String, java.util.List, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
