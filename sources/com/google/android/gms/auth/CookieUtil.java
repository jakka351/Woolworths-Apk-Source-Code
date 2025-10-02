package com.google.android.gms.auth;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.b;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes5.dex */
public final class CookieUtil {
    private CookieUtil() {
    }

    @NonNull
    public static String getCookieUrl(@NonNull String str, @Nullable Boolean bool) {
        Preconditions.checkNotEmpty(str);
        return b.o(true != zza(bool) ? "http" : "https", "://", str);
    }

    @NonNull
    public static String getCookieValue(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Long l) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append('=');
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        if (zza(bool)) {
            sb.append(";HttpOnly");
        }
        if (zza(bool2)) {
            sb.append(";Secure");
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append(";Domain=");
            sb.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append(";Path=");
            sb.append(str4);
        }
        if (l != null && l.longValue() > 0) {
            sb.append(";Max-Age=");
            sb.append(l);
        }
        if (!TextUtils.isEmpty(null)) {
            sb.append(";Priority=null");
        }
        if (!TextUtils.isEmpty(null)) {
            sb.append(";SameSite=null");
        }
        if (zza(null)) {
            sb.append(";SameParty");
        }
        return sb.toString();
    }

    private static boolean zza(@Nullable Boolean bool) {
        return bool != null && bool.booleanValue();
    }
}
