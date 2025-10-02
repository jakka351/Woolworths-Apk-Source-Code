package com.google.android.gms.internal.p002firebaseauthapi;

import YU.a;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import io.jsonwebtoken.JwtParser;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzahx {
    public static long zza(String str) {
        zzahw zzahwVarZzb = zzb(str);
        return zzahwVarZzb.zza().longValue() - zzahwVarZzb.zzb().longValue();
    }

    @NonNull
    private static zzahw zzb(String str) {
        Preconditions.checkNotEmpty(str);
        List<String> listZza = zzt.zza(JwtParser.SEPARATOR_CHAR).zza((CharSequence) str);
        if (listZza.size() < 2) {
            throw new RuntimeException(a.A("Invalid idToken ", str));
        }
        try {
            return zzahw.zza(new String(Base64Utils.decodeUrlSafeNoPadding(listZza.get(1)), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Unable to decode token", e);
        }
    }
}
