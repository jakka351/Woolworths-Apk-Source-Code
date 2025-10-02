package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;

/* loaded from: classes5.dex */
public final class zacm extends com.google.android.gms.signin.internal.zac implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    private static final Api.AbstractClientBuilder zaa = com.google.android.gms.signin.zad.zac;
    private final Context zab;
    private final Handler zac;
    private final Api.AbstractClientBuilder zad;
    private final Set zae;
    private final ClientSettings zaf;
    private com.google.android.gms.signin.zae zag;
    private zacl zah;

    @WorkerThread
    public zacm(Context context, Handler handler, @NonNull ClientSettings clientSettings) {
        Api.AbstractClientBuilder abstractClientBuilder = zaa;
        this.zab = context;
        this.zac = handler;
        this.zaf = (ClientSettings) Preconditions.checkNotNull(clientSettings, "ClientSettings must not be null");
        this.zae = clientSettings.getRequiredScopes();
        this.zad = abstractClientBuilder;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    @WorkerThread
    public final void onConnected(@Nullable Bundle bundle) {
        this.zag.zaa(this);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    @WorkerThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zah.zaa(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    @WorkerThread
    public final void onConnectionSuspended(int i) {
        this.zah.zab(i);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    @BinderThread
    public final void zab(com.google.android.gms.signin.internal.zak zakVar) {
        this.zac.post(new zack(this, zakVar));
    }

    @WorkerThread
    public final void zac(zacl zaclVar) {
        com.google.android.gms.signin.zae zaeVar = this.zag;
        if (zaeVar != null) {
            zaeVar.disconnect();
        }
        ClientSettings clientSettings = this.zaf;
        clientSettings.zae(Integer.valueOf(System.identityHashCode(this)));
        Api.AbstractClientBuilder abstractClientBuilder = this.zad;
        Context context = this.zab;
        Handler handler = this.zac;
        this.zag = (com.google.android.gms.signin.zae) abstractClientBuilder.buildClient(context, handler.getLooper(), clientSettings, (ClientSettings) clientSettings.zac(), (GoogleApiClient.ConnectionCallbacks) this, (GoogleApiClient.OnConnectionFailedListener) this);
        this.zah = zaclVar;
        Set set = this.zae;
        if (set == null || set.isEmpty()) {
            handler.post(new zacj(this));
        } else {
            this.zag.zad();
        }
    }

    public final void zad() {
        com.google.android.gms.signin.zae zaeVar = this.zag;
        if (zaeVar != null) {
            zaeVar.disconnect();
        }
    }

    public final /* synthetic */ void zae(com.google.android.gms.signin.internal.zak zakVar) {
        ConnectionResult connectionResultZaa = zakVar.zaa();
        if (connectionResultZaa.isSuccess()) {
            com.google.android.gms.common.internal.zav zavVar = (com.google.android.gms.common.internal.zav) Preconditions.checkNotNull(zakVar.zab());
            ConnectionResult connectionResultZab = zavVar.zab();
            if (!connectionResultZab.isSuccess()) {
                String strValueOf = String.valueOf(connectionResultZab);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                this.zah.zaa(connectionResultZab);
                this.zag.disconnect();
                return;
            }
            this.zah.zac(zavVar.zaa(), this.zae);
        } else {
            this.zah.zaa(connectionResultZaa);
        }
        this.zag.disconnect();
    }

    public final /* synthetic */ zacl zaf() {
        return this.zah;
    }
}
