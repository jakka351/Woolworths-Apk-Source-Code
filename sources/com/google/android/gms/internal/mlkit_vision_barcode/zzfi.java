package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.EncoderConfig;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzfi implements EncoderConfig {
    public static final /* synthetic */ int zza = 0;
    private static final ObjectEncoder zzb = new ObjectEncoder() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzfh
        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            int i = zzfi.zza;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final ObjectEncoder zze = zzb;

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public final /* bridge */ /* synthetic */ EncoderConfig registerEncoder(@NonNull Class cls, @NonNull ObjectEncoder objectEncoder) {
        this.zzc.put(cls, objectEncoder);
        this.zzd.remove(cls);
        return this;
    }

    public final zzfj zza() {
        return new zzfj(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
    }

    @NonNull
    public final /* bridge */ /* synthetic */ EncoderConfig registerEncoder(@NonNull Class cls, @NonNull ValueEncoder valueEncoder) {
        this.zzd.put(cls, valueEncoder);
        this.zzc.remove(cls);
        return this;
    }
}
