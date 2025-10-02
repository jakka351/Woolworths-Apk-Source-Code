package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Nullable;
import androidx.compose.ui.input.pointer.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;

/* loaded from: classes5.dex */
public final class zzafx {
    private final String zza;
    private final String zzb;

    public zzafx(Context context) {
        this(context, context.getPackageName());
    }

    @Nullable
    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    private zzafx(Context context, String str) {
        Preconditions.checkNotNull(context);
        String strCheckNotEmpty = Preconditions.checkNotEmpty(str);
        this.zza = strCheckNotEmpty;
        try {
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, strCheckNotEmpty);
            if (packageCertificateHashBytes != null) {
                this.zzb = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            } else {
                a.v("single cert required: ", str, "FBA-PackageInfo");
                this.zzb = null;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            a.v("no pkg: ", str, "FBA-PackageInfo");
            this.zzb = null;
        }
    }
}
