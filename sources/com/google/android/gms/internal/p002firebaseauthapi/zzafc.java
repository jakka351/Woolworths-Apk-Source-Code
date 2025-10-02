package com.google.android.gms.internal.p002firebaseauthapi;

import YU.a;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.LibraryVersion;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzafc {
    private final int zza;

    private zzafc(String str) {
        this.zza = zza(str);
    }

    private static int zza(String str) {
        try {
            List<String> listZza = zzt.zza("[.-]").zza((CharSequence) str);
            if (listZza.size() == 1) {
                return Integer.parseInt(str);
            }
            if (listZza.size() < 3) {
                return -1;
            }
            return (Integer.parseInt(listZza.get(1)) * 1000) + (Integer.parseInt(listZza.get(0)) * 1000000) + Integer.parseInt(listZza.get(2));
        } catch (IllegalArgumentException e) {
            if (!Log.isLoggable("LibraryVersionContainer", 3)) {
                return -1;
            }
            Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e));
            return -1;
        }
    }

    public final String zzb() {
        return a.A("X", Integer.toString(this.zza));
    }

    public static zzafc zza() throws Throwable {
        String version = LibraryVersion.getInstance().getVersion("firebase-auth");
        if (TextUtils.isEmpty(version) || version.equals("UNKNOWN")) {
            version = "-1";
        }
        return new zzafc(version);
    }
}
