package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;

/* loaded from: classes5.dex */
public final class zzsp implements zzrz {

    @Nullable
    private Provider zza;
    private final Provider zzb;
    private final zzsb zzc;

    public zzsp(Context context, zzsb zzsbVar) {
        this.zzc = zzsbVar;
        CCTDestination cCTDestination = CCTDestination.e;
        TransportRuntime.b(context);
        final TransportFactory transportFactoryC = TransportRuntime.a().c(cCTDestination);
        if (CCTDestination.d.contains(new Encoding("json"))) {
            this.zza = new Lazy(new Provider() { // from class: com.google.android.gms.internal.mlkit_common.zzsm
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return transportFactoryC.a("FIREBASE_ML_SDK", new Encoding("json"), new Transformer() { // from class: com.google.android.gms.internal.mlkit_common.zzso
                        @Override // com.google.android.datatransport.Transformer
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new Lazy(new Provider() { // from class: com.google.android.gms.internal.mlkit_common.zzsn
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return transportFactoryC.a("FIREBASE_ML_SDK", new Encoding("proto"), new Transformer() { // from class: com.google.android.gms.internal.mlkit_common.zzsl
                    @Override // com.google.android.datatransport.Transformer
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    @VisibleForTesting
    public static Event zzb(zzsb zzsbVar, zzry zzryVar) {
        return Event.h(zzryVar.zze(zzsbVar.zza(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzrz
    public final void zza(zzry zzryVar) {
        if (this.zzc.zza() != 0) {
            ((Transport) this.zzb.get()).b(zzb(this.zzc, zzryVar));
            return;
        }
        Provider provider = this.zza;
        if (provider != null) {
            ((Transport) provider.get()).b(zzb(this.zzc, zzryVar));
        }
    }
}
