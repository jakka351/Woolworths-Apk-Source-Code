package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes5.dex */
public class zzhiw extends IOException {
    private boolean zza;

    public zzhiw(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public final void zza() {
        this.zza = true;
    }

    public final boolean zzb() {
        return this.zza;
    }

    public zzhiw(String str) {
        super(str);
    }

    public zzhiw(String str, IOException iOException) {
        super("Unable to parse map entry.", iOException);
    }
}
