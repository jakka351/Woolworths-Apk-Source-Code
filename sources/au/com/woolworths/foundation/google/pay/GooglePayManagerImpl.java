package au.com.woolworths.foundation.google.pay;

import android.app.PendingIntent;
import android.content.Context;
import androidx.activity.result.IntentSenderRequest;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentRequest;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.json.JSONException;
import org.json.JSONObject;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/google/pay/GooglePayManagerImpl;", "Lau/com/woolworths/foundation/google/pay/GooglePayManager;", "google-pay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GooglePayManagerImpl implements GooglePayManager {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentsClient f8529a;
    public final String b;

    public GooglePayManagerImpl(Context context, boolean z) {
        Intrinsics.h(context, "context");
        JSONObject jSONObject = PaymentsUtil.f8532a;
        Wallet.WalletOptions walletOptionsBuild = new Wallet.WalletOptions.Builder().setEnvironment(z ? 1 : 3).build();
        Intrinsics.g(walletOptionsBuild, "build(...)");
        PaymentsClient paymentsClient = Wallet.getPaymentsClient(context, walletOptionsBuild);
        Intrinsics.g(paymentsClient, "getPaymentsClient(...)");
        this.f8529a = paymentsClient;
        this.b = z ? "app.gr4vy.wpay1.woolworths-online" : "app.gr4vy.sandbox.wpay1.woolworths-online";
    }

    @Override // au.com.woolworths.foundation.google.pay.GooglePayManager
    public final Object a(String priceLabel, List list, Continuation continuation) throws JSONException {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.o();
        JSONObject jSONObject = PaymentsUtil.f8532a;
        Intrinsics.h(priceLabel, "priceLabel");
        String merchantId = this.b;
        Intrinsics.h(merchantId, "merchantId");
        JSONObject jSONObjectPut = PaymentsUtil.f8532a.put("allowedPaymentMethods", PaymentsUtil.b(merchantId, list));
        JSONObject jSONObjectPut2 = new JSONObject().put("totalPrice", priceLabel).put("totalPriceStatus", "FINAL").put("countryCode", "AU").put("currencyCode", "AUD");
        Intrinsics.g(jSONObjectPut2, "put(...)");
        JSONObject jSONObjectPut3 = jSONObjectPut.put("transactionInfo", jSONObjectPut2).put("merchantInfo", PaymentsUtil.c);
        Intrinsics.g(jSONObjectPut3, "put(...)");
        PaymentDataRequest paymentDataRequestFromJson = PaymentDataRequest.fromJson(jSONObjectPut3.toString());
        Intrinsics.g(paymentDataRequestFromJson, "fromJson(...)");
        this.f8529a.loadPaymentData(paymentDataRequestFromJson).addOnCompleteListener(new OnCompleteListener() { // from class: au.com.woolworths.foundation.google.pay.GooglePayManagerImpl$requestPayment$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task it) {
                Intrinsics.h(it, "it");
                cancellableContinuationImpl.resumeWith(it);
            }
        });
        Object objN = cancellableContinuationImpl.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objN;
    }

    @Override // au.com.woolworths.foundation.google.pay.GooglePayManager
    public final Object b(Continuation continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.o();
        Task<PaymentCardRecognitionIntentResponse> paymentCardRecognitionIntent = this.f8529a.getPaymentCardRecognitionIntent(PaymentCardRecognitionIntentRequest.getDefaultInstance());
        final Function1<PaymentCardRecognitionIntentResponse, Unit> function1 = new Function1<PaymentCardRecognitionIntentResponse, Unit>() { // from class: au.com.woolworths.foundation.google.pay.GooglePayManagerImpl$requestPaymentCardRecognitionIntent$2$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                PendingIntent paymentCardRecognitionPendingIntent = ((PaymentCardRecognitionIntentResponse) obj).getPaymentCardRecognitionPendingIntent();
                Intrinsics.g(paymentCardRecognitionPendingIntent, "getPaymentCardRecognitionPendingIntent(...)");
                cancellableContinuationImpl.resumeWith(new IntentSenderRequest.Builder(paymentCardRecognitionPendingIntent).a());
                return Unit.f24250a;
            }
        };
        paymentCardRecognitionIntent.addOnSuccessListener(new OnSuccessListener() { // from class: au.com.woolworths.foundation.google.pay.GooglePayManagerImpl$sam$com_google_android_gms_tasks_OnSuccessListener$0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final /* synthetic */ void onSuccess(Object obj) {
                function1.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: au.com.woolworths.foundation.google.pay.GooglePayManagerImpl$requestPaymentCardRecognitionIntent$2$2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception e) {
                Intrinsics.h(e, "e");
                cancellableContinuationImpl.resumeWith(ResultKt.a(e));
            }
        });
        Object objN = cancellableContinuationImpl.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objN;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.foundation.google.pay.GooglePayManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.util.List r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws org.json.JSONException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.foundation.google.pay.GooglePayManagerImpl$verifyGooglePayReadiness$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.foundation.google.pay.GooglePayManagerImpl$verifyGooglePayReadiness$1 r0 = (au.com.woolworths.foundation.google.pay.GooglePayManagerImpl$verifyGooglePayReadiness$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.foundation.google.pay.GooglePayManagerImpl$verifyGooglePayReadiness$1 r0 = new au.com.woolworths.foundation.google.pay.GooglePayManagerImpl$verifyGooglePayReadiness$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.p
            java.util.List r5 = (java.util.List) r5
            kotlin.ResultKt.b(r6)     // Catch: com.google.android.gms.common.api.ApiException -> L2b
            goto L43
        L2b:
            r5 = move-exception
            goto L6b
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r6)
            r0.p = r5     // Catch: com.google.android.gms.common.api.ApiException -> L2b
            r0.s = r3     // Catch: com.google.android.gms.common.api.ApiException -> L2b
            java.lang.Object r6 = r4.d(r5, r0)     // Catch: com.google.android.gms.common.api.ApiException -> L2b
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: com.google.android.gms.common.api.ApiException -> L2b
            boolean r6 = r6.booleanValue()     // Catch: com.google.android.gms.common.api.ApiException -> L2b
            if (r6 == 0) goto L62
            au.com.woolworths.foundation.google.pay.GooglePayState$Success r6 = new au.com.woolworths.foundation.google.pay.GooglePayState$Success     // Catch: com.google.android.gms.common.api.ApiException -> L2b
            org.json.JSONObject r0 = au.com.woolworths.foundation.google.pay.PaymentsUtil.f8532a     // Catch: com.google.android.gms.common.api.ApiException -> L2b
            java.lang.String r0 = r4.b     // Catch: com.google.android.gms.common.api.ApiException -> L2b
            org.json.JSONArray r5 = au.com.woolworths.foundation.google.pay.PaymentsUtil.b(r0, r5)     // Catch: com.google.android.gms.common.api.ApiException -> L2b
            java.lang.String r5 = r5.toString()     // Catch: com.google.android.gms.common.api.ApiException -> L2b
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.g(r5, r0)     // Catch: com.google.android.gms.common.api.ApiException -> L2b
            r6.<init>(r5)     // Catch: com.google.android.gms.common.api.ApiException -> L2b
            return r6
        L62:
            au.com.woolworths.foundation.google.pay.GooglePayState$Fail r5 = new au.com.woolworths.foundation.google.pay.GooglePayState$Fail     // Catch: com.google.android.gms.common.api.ApiException -> L2b
            r6 = 13
            r0 = 0
            r5.<init>(r6, r0)     // Catch: com.google.android.gms.common.api.ApiException -> L2b
            return r5
        L6b:
            au.com.woolworths.foundation.google.pay.GooglePayState$Fail r6 = new au.com.woolworths.foundation.google.pay.GooglePayState$Fail
            int r0 = r5.getStatusCode()
            java.lang.String r5 = r5.getMessage()
            r6.<init>(r0, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.google.pay.GooglePayManagerImpl.c(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.util.List r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws org.json.JSONException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof au.com.woolworths.foundation.google.pay.GooglePayManagerImpl$fetchCanUseGooglePay$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.foundation.google.pay.GooglePayManagerImpl$fetchCanUseGooglePay$1 r0 = (au.com.woolworths.foundation.google.pay.GooglePayManagerImpl$fetchCanUseGooglePay$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.foundation.google.pay.GooglePayManagerImpl$fetchCanUseGooglePay$1 r0 = new au.com.woolworths.foundation.google.pay.GooglePayManagerImpl$fetchCanUseGooglePay$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r7)
            goto L71
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            kotlin.ResultKt.b(r7)
            org.json.JSONObject r7 = au.com.woolworths.foundation.google.pay.PaymentsUtil.f8532a
            java.lang.String r7 = "allowedCardNetworks"
            kotlin.jvm.internal.Intrinsics.h(r6, r7)
            org.json.JSONObject r7 = au.com.woolworths.foundation.google.pay.PaymentsUtil.f8532a     // Catch: org.json.JSONException -> L4f
            java.lang.String r2 = "allowedPaymentMethods"
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: org.json.JSONException -> L4f
            r4.<init>()     // Catch: org.json.JSONException -> L4f
            org.json.JSONObject r6 = au.com.woolworths.foundation.google.pay.PaymentsUtil.a(r6)     // Catch: org.json.JSONException -> L4f
            org.json.JSONArray r6 = r4.put(r6)     // Catch: org.json.JSONException -> L4f
            org.json.JSONObject r6 = r7.put(r2, r6)     // Catch: org.json.JSONException -> L4f
            goto L50
        L4f:
            r6 = 0
        L50:
            java.lang.String r6 = java.lang.String.valueOf(r6)
            com.google.android.gms.wallet.IsReadyToPayRequest r6 = com.google.android.gms.wallet.IsReadyToPayRequest.fromJson(r6)
            java.lang.String r7 = "fromJson(...)"
            kotlin.jvm.internal.Intrinsics.g(r6, r7)
            com.google.android.gms.wallet.PaymentsClient r7 = r5.f8529a
            com.google.android.gms.tasks.Task r6 = r7.isReadyToPay(r6)
            java.lang.String r7 = "isReadyToPay(...)"
            kotlin.jvm.internal.Intrinsics.g(r6, r7)
            r0.r = r3
            java.lang.Object r7 = kotlinx.coroutines.tasks.TasksKt.a(r6, r0)
            if (r7 != r1) goto L71
            return r1
        L71:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.g(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.google.pay.GooglePayManagerImpl.d(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
