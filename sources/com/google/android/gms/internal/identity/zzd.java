package com.google.android.gms.internal.identity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes5.dex */
public final class zzd extends zzf {
    private final int zza;

    @Nullable
    private Activity zzb;

    public zzd(int i, Activity activity) {
        this.zza = i;
        this.zzb = activity;
    }

    @Override // com.google.android.gms.internal.identity.zzg
    public final void zzc(int i, Bundle bundle) throws PendingIntent.CanceledException {
        PendingIntent pendingIntentCreatePendingResult;
        if (i == 1) {
            Intent intent = new Intent();
            intent.putExtras(bundle);
            Activity activity = this.zzb;
            if (activity == null || (pendingIntentCreatePendingResult = activity.createPendingResult(this.zza, intent, 1073741824)) == null) {
                return;
            }
            try {
                pendingIntentCreatePendingResult.send(1);
                return;
            } catch (PendingIntent.CanceledException e) {
                Log.w("AddressClientImpl", "Exception settng pending result", e);
                return;
            }
        }
        ConnectionResult connectionResult = new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT") : null);
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult((Activity) Preconditions.checkNotNull(this.zzb), this.zza);
                return;
            } catch (IntentSender.SendIntentException e2) {
                Log.w("AddressClientImpl", "Exception starting pending intent", e2);
                return;
            }
        }
        try {
            PendingIntent pendingIntentCreatePendingResult2 = ((Activity) Preconditions.checkNotNull(this.zzb)).createPendingResult(this.zza, new Intent(), 1073741824);
            if (pendingIntentCreatePendingResult2 != null) {
                pendingIntentCreatePendingResult2.send(1);
            }
        } catch (PendingIntent.CanceledException e3) {
            Log.w("AddressClientImpl", "Exception setting pending result", e3);
        }
    }
}
