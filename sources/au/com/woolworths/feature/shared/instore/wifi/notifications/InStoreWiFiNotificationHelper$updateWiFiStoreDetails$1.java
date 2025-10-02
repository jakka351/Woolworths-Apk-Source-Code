package au.com.woolworths.feature.shared.instore.wifi.notifications;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shared.instore.wifi.notifications.InStoreWiFiNotificationHelper$updateWiFiStoreDetails$1", f = "InStoreWiFiNotificationHelper.kt", l = {54, 55}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes.dex */
final class InStoreWiFiNotificationHelper$updateWiFiStoreDetails$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ InStoreWiFiNotificationHelper q;
    public final /* synthetic */ Context r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InStoreWiFiNotificationHelper$updateWiFiStoreDetails$1(InStoreWiFiNotificationHelper inStoreWiFiNotificationHelper, Context context, Continuation continuation) {
        super(2, continuation);
        this.q = inStoreWiFiNotificationHelper;
        this.r = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InStoreWiFiNotificationHelper$updateWiFiStoreDetails$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InStoreWiFiNotificationHelper$updateWiFiStoreDetails$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        if (r11 == r2) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            au.com.woolworths.feature.shared.instore.wifi.notifications.InStoreWiFiNotificationHelper r0 = r10.q
            au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor r1 = r0.f6522a
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r10.p
            r4 = 1
            r5 = 2
            if (r3 == 0) goto L20
            if (r3 == r4) goto L1c
            if (r3 != r5) goto L14
            kotlin.ResultKt.b(r11)
            goto L84
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            kotlin.ResultKt.b(r11)
            goto L79
        L20:
            kotlin.ResultKt.b(r11)
            boolean r11 = r1.getE()
            if (r11 == 0) goto La7
            android.content.Context r11 = r10.r
            android.content.Context r11 = r11.getApplicationContext()
            java.lang.String r3 = "wifi"
            java.lang.Object r11 = r11.getSystemService(r3)
            java.lang.String r3 = "null cannot be cast to non-null type android.net.wifi.WifiManager"
            kotlin.jvm.internal.Intrinsics.f(r11, r3)
            android.net.wifi.WifiManager r11 = (android.net.wifi.WifiManager) r11
            android.net.wifi.WifiInfo r11 = r11.getConnectionInfo()
            java.lang.String r3 = "getConnectionInfo(...)"
            kotlin.jvm.internal.Intrinsics.g(r11, r3)
            android.net.wifi.SupplicantState r3 = r11.getSupplicantState()
            android.net.wifi.SupplicantState r6 = android.net.wifi.SupplicantState.COMPLETED
            if (r3 != r6) goto La3
            au.com.woolworths.foundation.shared.instore.wifi.config.OpenRoamingAppConfiguration r3 = r1.j()
            java.lang.String r3 = r3.f8658a
            boolean r11 = au.com.woolworths.feature.shared.instore.wifi.notifications.ExtensionsKt.a(r11, r3)
            if (r11 == 0) goto La3
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r11 = r0.c
            au.com.woolworths.feature.shared.instore.wifi.notifications.InStoreWiFiNotificationHelper$InStoreWifiForShopRemoteConfig r3 = au.com.woolworths.feature.shared.instore.wifi.notifications.InStoreWiFiNotificationHelper.InStoreWifiForShopRemoteConfig.d
            r6 = 0
            java.lang.String r11 = r11.e(r3, r6)
            java.lang.Integer r11 = kotlin.text.StringsKt.i0(r11)
            if (r11 == 0) goto L6c
            int r6 = r11.intValue()
        L6c:
            long r6 = (long) r6
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            r10.p = r4
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.b(r6, r10)
            if (r11 != r2) goto L79
            goto L83
        L79:
            au.com.woolworths.feature.shared.instore.wifi.notifications.InStoreWiFiNotificationHelper$backgroundExceptionHandler$1 r11 = r0.e
            r10.p = r5
            java.lang.Object r11 = r1.f(r11, r10)
            if (r11 != r2) goto L84
        L83:
            return r2
        L84:
            com.cisco.or.sdk.models.LocationDetails r11 = (com.cisco.or.sdk.models.LocationDetails) r11
            au.com.woolworths.foundation.shared.instore.wifi.WiFiStoreDetailsAnalyticsProvider r0 = r0.b
            org.json.JSONObject r11 = r11.getG()
            java.lang.String r1 = "buildingName"
            java.lang.String r11 = r11.optString(r1)
            kotlin.jvm.internal.Intrinsics.e(r11)
            int r1 = r11.length()
            if (r1 != 0) goto L9c
            r11 = 0
        L9c:
            if (r11 != 0) goto La0
            java.lang.String r11 = "unknown"
        La0:
            r0.f8657a = r11
            goto Laa
        La3:
            r0.a()
            goto Laa
        La7:
            r0.a()
        Laa:
            kotlin.Unit r11 = kotlin.Unit.f24250a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shared.instore.wifi.notifications.InStoreWiFiNotificationHelper$updateWiFiStoreDetails$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
