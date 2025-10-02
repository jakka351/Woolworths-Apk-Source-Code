package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class zzaqq extends zzhpi implements Closeable {
    static {
        zzhpp.zzb(zzaqq.class);
    }

    public zzaqq(zzhpj zzhpjVar, zzaqp zzaqpVar) throws IOException {
        zzd(zzhpjVar, zzhpjVar.zzb(), zzaqpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhpi, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzhpi
    public final String toString() {
        String string = this.zzc.toString();
        StringBuilder sb = new StringBuilder(au.com.woolworths.shop.checkout.ui.confirmation.c.f(7, string));
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
