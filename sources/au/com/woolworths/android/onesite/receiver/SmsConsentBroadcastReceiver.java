package au.com.woolworths.android.onesite.receiver;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import au.com.woolworths.feature.rewards.account.authentication.i;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/receiver/SmsConsentBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SmsConsentBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final i f4584a;

    public SmsConsentBroadcastReceiver(i iVar) {
        this.f4584a = iVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intent intent2;
        Intrinsics.h(context, "context");
        Intrinsics.h(intent, "intent");
        if (SmsRetriever.SMS_RETRIEVED_ACTION.equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            Object obj = extras != null ? extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS") : null;
            Intrinsics.f(obj, "null cannot be cast to non-null type com.google.android.gms.common.api.Status");
            if (((Status) obj).getStatusCode() == 0 && (intent2 = (Intent) extras.getParcelable(SmsRetriever.EXTRA_CONSENT_INTENT)) != null) {
                try {
                    this.f4584a.invoke(intent2);
                } catch (ActivityNotFoundException unused) {
                }
            }
        }
    }
}
