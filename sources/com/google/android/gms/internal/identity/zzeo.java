package com.google.android.gms.internal.identity;

import androidx.annotation.GuardedBy;
import com.medallia.digital.mobilesdk.l8;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class zzeo {
    private static final SimpleDateFormat zza;
    private static final SimpleDateFormat zzb;

    @GuardedBy
    private static final StringBuilder zzc;

    static {
        Locale locale = Locale.ROOT;
        zza = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        zzb = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        zzc = new StringBuilder(33);
    }

    public static String zza(long j) {
        return j >= 0 ? zza.format(new Date(j)) : Long.toString(j);
    }

    public static String zzb(long j) {
        String string;
        StringBuilder sb = zzc;
        synchronized (sb) {
            sb.setLength(0);
            zzc(j, sb);
            string = sb.toString();
        }
        return string;
    }

    public static StringBuilder zzc(long j, StringBuilder sb) {
        if (j == 0) {
            sb.append("0s");
            return sb;
        }
        sb.ensureCapacity(sb.length() + 27);
        boolean z = false;
        if (j < 0) {
            sb.append("-");
            if (j != Long.MIN_VALUE) {
                j = -j;
            } else {
                j = Long.MAX_VALUE;
                z = true;
            }
        }
        if (j >= 86400000) {
            sb.append(j / 86400000);
            sb.append("d");
            j %= 86400000;
        }
        if (true == z) {
            j = 25975808;
        }
        if (j >= l8.b.c) {
            sb.append(j / l8.b.c);
            sb.append("h");
            j %= l8.b.c;
        }
        if (j >= l8.b.b) {
            sb.append(j / l8.b.b);
            sb.append("m");
            j %= l8.b.b;
        }
        if (j >= 1000) {
            sb.append(j / 1000);
            sb.append("s");
            j %= 1000;
        }
        if (j > 0) {
            sb.append(j);
            sb.append("ms");
        }
        return sb;
    }
}
