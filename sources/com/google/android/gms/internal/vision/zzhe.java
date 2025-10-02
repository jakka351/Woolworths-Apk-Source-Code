package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzhe;
import com.google.android.gms.internal.vision.zzhf;
import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class zzhe<MessageType extends zzhf<MessageType, BuilderType>, BuilderType extends zzhe<MessageType, BuilderType>> implements zzkn {
    @Override // 
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();

    public abstract BuilderType zza(MessageType messagetype);

    public abstract BuilderType zza(zzif zzifVar, zzio zzioVar) throws IOException;

    public BuilderType zza(byte[] bArr, int i, int i2, zzio zzioVar) throws zzjk {
        try {
            zzif zzifVarZza = zzif.zza(bArr, 0, i2, false);
            zza(zzifVarZza, zzioVar);
            zzifVarZza.zza(0);
            return this;
        } catch (zzjk e) {
            throw e;
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder("byte array".length() + name.length() + 60);
            sb.append("Reading ");
            sb.append(name);
            sb.append(" from a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    @Override // com.google.android.gms.internal.vision.zzkn
    public final /* synthetic */ zzkn zza(zzkk zzkkVar) {
        if (zzr().getClass().isInstance(zzkkVar)) {
            return zza((zzhe<MessageType, BuilderType>) zzkkVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
