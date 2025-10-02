package com.google.android.gms.internal.mlkit_vision_common;

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
public final class zzmp implements zzmc {

    @Nullable
    private Provider zza;
    private final Provider zzb;
    private final zzme zzc;

    public zzmp(Context context, zzme zzmeVar) {
        this.zzc = zzmeVar;
        CCTDestination cCTDestination = CCTDestination.e;
        TransportRuntime.b(context);
        final TransportFactory transportFactoryC = TransportRuntime.a().c(cCTDestination);
        if (CCTDestination.d.contains(new Encoding("json"))) {
            this.zza = new Lazy(new Provider() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmm
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return transportFactoryC.a("FIREBASE_ML_SDK", new Encoding("json"), new Transformer() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmo
                        @Override // com.google.android.datatransport.Transformer
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new Lazy(new Provider() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmn
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return transportFactoryC.a("FIREBASE_ML_SDK", new Encoding("proto"), new Transformer() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzml
                    @Override // com.google.android.datatransport.Transformer
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    @VisibleForTesting
    public static Event zzb(zzme zzmeVar, zzmb zzmbVar) {
        return Event.h(zzmbVar.zzd(zzmeVar.zza(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmc
    public final void zza(zzmb zzmbVar) {
        if (this.zzc.zza() != 0) {
            ((Transport) this.zzb.get()).b(zzb(this.zzc, zzmbVar));
            return;
        }
        Provider provider = this.zza;
        if (provider != null) {
            ((Transport) provider.get()).b(zzb(this.zzc, zzmbVar));
        }
    }
}
