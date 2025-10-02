package com.google.android.gms.internal.vision;

import android.net.Uri;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzbe {
    private final Map<String, Map<String, String>> zza;

    public zzbe(Map<String, Map<String, String>> map) {
        this.zza = map;
    }

    @Nullable
    public final String zza(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        if (uri != null) {
            str = uri.toString();
        } else if (str == null) {
            return null;
        }
        Map<String, String> map = this.zza.get(str);
        if (map == null) {
            return null;
        }
        if (str2 != null) {
            String strValueOf = String.valueOf(str3);
            str3 = strValueOf.length() != 0 ? str2.concat(strValueOf) : new String(str2);
        }
        return map.get(str3);
    }
}
