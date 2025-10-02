package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import androidx.annotation.VisibleForTesting;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@VisibleForTesting
/* loaded from: classes5.dex */
final class zzazm {

    @VisibleForTesting
    ByteArrayOutputStream zza = new ByteArrayOutputStream(4096);

    @VisibleForTesting
    Base64OutputStream zzb = new Base64OutputStream(this.zza, 10);

    public final String toString() throws IOException {
        String string;
        try {
            this.zzb.close();
        } catch (IOException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("HashManager: Unable to convert to Base64.", e);
        }
        try {
            try {
                this.zza.close();
                string = this.zza.toString();
            } catch (IOException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("HashManager: Unable to convert to Base64.", e2);
                string = "";
            }
            return string;
        } finally {
            this.zza = null;
            this.zzb = null;
        }
    }
}
