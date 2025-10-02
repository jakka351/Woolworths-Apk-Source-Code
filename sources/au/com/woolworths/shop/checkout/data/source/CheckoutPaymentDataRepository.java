package au.com.woolworths.shop.checkout.data.source;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.checkout.data.mappers.PaymentResponseMapper;
import au.com.woolworths.shop.checkout.domain.CheckoutPaymentRepository;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/data/source/CheckoutPaymentDataRepository;", "Lau/com/woolworths/shop/checkout/domain/CheckoutPaymentRepository;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutPaymentDataRepository implements CheckoutPaymentRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f10544a;
    public final PaymentResponseMapper b;

    public CheckoutPaymentDataRepository(ApolloClient apolloClient, PaymentResponseMapper paymentResponseMapper) {
        Intrinsics.h(apolloClient, "apolloClient");
        this.f10544a = apolloClient;
        this.b = paymentResponseMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(au.com.woolworths.foundation.shop.model.checkout.DigitalPayPaymentData r10, java.lang.String r11, java.lang.String r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.lang.Exception {
        /*
            r9 = this;
            boolean r0 = r13 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutPaymentDataRepository$makePayment$1
            if (r0 == 0) goto L13
            r0 = r13
            au.com.woolworths.shop.checkout.data.source.CheckoutPaymentDataRepository$makePayment$1 r0 = (au.com.woolworths.shop.checkout.data.source.CheckoutPaymentDataRepository$makePayment$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.checkout.data.source.CheckoutPaymentDataRepository$makePayment$1 r0 = new au.com.woolworths.shop.checkout.data.source.CheckoutPaymentDataRepository$makePayment$1
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            kotlin.ResultKt.b(r13)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            goto Lae
        L28:
            r10 = move-exception
            goto Lde
        L2b:
            r10 = move-exception
            goto Ld4
        L2e:
            r10 = move-exception
            goto Ld9
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            kotlin.ResultKt.b(r13)
            com.apollographql.apollo.ApolloClient r13 = r9.f10544a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.util.List r10 = r10.a()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.String r2 = "getPayments(...)"
            kotlin.jvm.internal.Intrinsics.g(r10, r2)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.s(r10, r4)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r2.<init>(r4)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.util.Iterator r10 = r10.iterator()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
        L58:
            boolean r4 = r10.hasNext()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r4 == 0) goto L8b
            java.lang.Object r4 = r10.next()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.foundation.shop.model.checkout.DigitalPayPaymentMethod r4 = (au.com.woolworths.foundation.shop.model.checkout.DigitalPayPaymentMethod) r4     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.payment.graphql.type.PaymentInstrument r5 = new au.com.woolworths.payment.graphql.type.PaymentInstrument     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.math.BigDecimal r6 = r4.a()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.String r6 = r6.toString()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.String r7 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.g(r6, r7)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.String r7 = r4.b()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.String r8 = "getPaymentInstrumentId(...)"
            kotlin.jvm.internal.Intrinsics.g(r7, r8)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.String r4 = r4.c()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional r4 = com.apollographql.apollo.api.Optional.Companion.a(r4)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r5.<init>(r6, r7, r4)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r2.add(r5)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            goto L58
        L8b:
            com.apollographql.apollo.api.Optional r10 = com.apollographql.apollo.api.Optional.Companion.a(r11)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional r11 = com.apollographql.apollo.api.Optional.Companion.a(r12)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.payment.graphql.type.PaymentsInput r12 = new au.com.woolworths.payment.graphql.type.PaymentsInput     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r12.<init>(r2, r10, r11)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.payment.MakePaymentMutation r10 = new com.woolworths.shop.payment.MakePaymentMutation     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r10.<init>(r12)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r13.getClass()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.ApolloCall r11 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r11.<init>(r13, r10)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Object r13 = r11.b(r0)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r13 != r1) goto Lae
            return r1
        Lae:
            com.apollographql.apollo.api.ApolloResponse r13 = (com.apollographql.apollo.api.ApolloResponse) r13     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Operation$Data r10 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r13)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.payment.MakePaymentMutation$Data r10 = (com.woolworths.shop.payment.MakePaymentMutation.Data) r10     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.payment.MakePaymentMutation$MakePayment r10 = r10.f23371a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.payment.fragment.PaymentResponse r10 = r10.b     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.shop.checkout.domain.model.PaymentResponse r10 = au.com.woolworths.shop.checkout.data.mappers.CheckoutPaymentMapperKt.a(r10)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r10 == 0) goto Lcd
            boolean r11 = r13.b()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r11 != 0) goto Lcd
            au.com.woolworths.shop.checkout.data.mappers.PaymentResponseMapper r11 = r9.b     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.google.gson.JsonObject r10 = r11.a(r10)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            return r10
        Lcd:
            java.util.List r10 = r13.d     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.android.onesite.network.GraphQlException r10 = au.com.woolworths.android.onesite.network.ExceptionExtKt.f(r10)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            throw r10     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
        Ld4:
            au.com.woolworths.android.onesite.network.ServerErrorException r10 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r10)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28
            throw r10     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28
        Ld9:
            java.lang.Exception r10 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r10)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28
            throw r10     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28
        Lde:
            java.lang.Throwable r11 = r10.getCause()
            boolean r12 = r11 instanceof retrofit2.HttpException
            if (r12 == 0) goto Le9
            retrofit2.HttpException r11 = (retrofit2.HttpException) r11
            goto Lea
        Le9:
            r11 = 0
        Lea:
            if (r11 != 0) goto Led
            throw r10
        Led:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutPaymentDataRepository.a(au.com.woolworths.foundation.shop.model.checkout.DigitalPayPaymentData, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r6 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutPaymentDataRepository$makeZeroPayment$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.shop.checkout.data.source.CheckoutPaymentDataRepository$makeZeroPayment$1 r0 = (au.com.woolworths.shop.checkout.data.source.CheckoutPaymentDataRepository$makeZeroPayment$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.checkout.data.source.CheckoutPaymentDataRepository$makeZeroPayment$1 r0 = new au.com.woolworths.shop.checkout.data.source.CheckoutPaymentDataRepository$makeZeroPayment$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r6)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            goto L50
        L27:
            r6 = move-exception
            goto L80
        L29:
            r6 = move-exception
            goto L76
        L2b:
            r6 = move-exception
            goto L7b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.ResultKt.b(r6)
            com.apollographql.apollo.ApolloClient r6 = r5.f10544a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.payment.MakeZeroPaymentMutation r2 = new com.woolworths.shop.payment.MakeZeroPaymentMutation     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r2.<init>()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r6.getClass()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.ApolloCall r4 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r4.<init>(r6, r2)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.Object r6 = r4.b(r0)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r6 != r1) goto L50
            return r1
        L50:
            com.apollographql.apollo.api.ApolloResponse r6 = (com.apollographql.apollo.api.ApolloResponse) r6     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.api.Operation$Data r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r6)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.payment.MakeZeroPaymentMutation$Data r0 = (com.woolworths.shop.payment.MakeZeroPaymentMutation.Data) r0     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.payment.MakeZeroPaymentMutation$ZeroPayment r0 = r0.f23373a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.payment.fragment.ZeroPaymentResponse r0 = r0.b     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            au.com.woolworths.shop.checkout.domain.model.PaymentResponse r0 = au.com.woolworths.shop.checkout.data.mappers.CheckoutPaymentMapperKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r0 == 0) goto L6f
            boolean r1 = r6.b()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r1 != 0) goto L6f
            au.com.woolworths.shop.checkout.data.mappers.PaymentResponseMapper r6 = r5.b     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.google.gson.JsonObject r6 = r6.a(r0)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            return r6
        L6f:
            java.util.List r6 = r6.d     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            au.com.woolworths.android.onesite.network.GraphQlException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.f(r6)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            throw r6     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
        L76:
            au.com.woolworths.android.onesite.network.ServerErrorException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r6)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27
            throw r6     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27
        L7b:
            java.lang.Exception r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r6)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27
            throw r6     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27
        L80:
            java.lang.Throwable r0 = r6.getCause()
            boolean r1 = r0 instanceof retrofit2.HttpException
            if (r1 == 0) goto L8b
            retrofit2.HttpException r0 = (retrofit2.HttpException) r0
            goto L8c
        L8b:
            r0 = 0
        L8c:
            if (r0 != 0) goto L8f
            throw r6
        L8f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutPaymentDataRepository.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
