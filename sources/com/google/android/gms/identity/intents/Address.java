package com.google.android.gms.identity.intents;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes5.dex */
public final class Address {

    @NonNull
    public static final Api<AddressOptions> API;
    static final Api.ClientKey<com.google.android.gms.internal.identity.zze> zza;
    private static final Api.AbstractClientBuilder<com.google.android.gms.internal.identity.zze, AddressOptions> zzb;

    public static final class AddressOptions implements Api.ApiOptions.HasOptions {
        public final int theme;

        public AddressOptions() {
            this.theme = 0;
        }

        public AddressOptions(int i) {
            this.theme = i;
        }
    }

    static {
        Api.ClientKey<com.google.android.gms.internal.identity.zze> clientKey = new Api.ClientKey<>();
        zza = clientKey;
        zza zzaVar = new zza();
        zzb = zzaVar;
        API = new Api<>("Address.API", zzaVar, clientKey);
    }

    public static void requestUserAddress(@NonNull GoogleApiClient googleApiClient, @NonNull UserAddressRequest userAddressRequest, int i) {
        googleApiClient.enqueue(new zzb(googleApiClient, userAddressRequest, i));
    }
}
