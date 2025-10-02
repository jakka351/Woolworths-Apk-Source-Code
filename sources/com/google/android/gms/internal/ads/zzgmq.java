package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
final class zzgmq extends zzgml {
    private final File zza;
    private final zzgke zzb;

    public /* synthetic */ zzgmq(File file, zzgmp[] zzgmpVarArr, byte[] bArr) {
        file.getClass();
        this.zza = file;
        this.zzb = zzgke.zzp(zzgmpVarArr);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(length + 19 + strValueOf.length() + 1);
        androidx.constraintlayout.core.state.a.B(sb, "Files.asByteSink(", string, ", ", strValueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final /* bridge */ /* synthetic */ OutputStream zza() throws IOException {
        return new FileOutputStream(this.zza, this.zzb.contains(zzgmp.APPEND));
    }
}
