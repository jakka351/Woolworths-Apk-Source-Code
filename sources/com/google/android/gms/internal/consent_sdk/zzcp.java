package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.medallia.digital.mobilesdk.q2;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public final class zzcp {
    @Nullable
    public static zzcn zza(Context context, String str) {
        String strConcat;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(q2.c, -1);
        int length = strArrSplit.length;
        if (length == 1) {
            String strValueOf = String.valueOf(context.getPackageName());
            str2 = strArrSplit[0];
            strConcat = strValueOf.concat("_preferences");
        } else {
            if (length != 2) {
                return null;
            }
            strConcat = strArrSplit[0];
            str2 = strArrSplit[1];
        }
        if (TextUtils.isEmpty(strConcat) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new zzcn(strConcat, str2);
    }

    public static void zzb(Context context, Set set) {
        zzco zzcoVar = new zzco(context);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzcn zzcnVarZza = zza(context, str);
            if (zzcnVarZza == null) {
                Log.d("UserMessagingPlatform", "clearKeys: unable to process key: ".concat(String.valueOf(str)));
            } else {
                zzcoVar.zzf(zzcnVarZza.zza).remove(zzcnVarZza.zzb);
            }
        }
        zzcoVar.zzc();
    }
}
