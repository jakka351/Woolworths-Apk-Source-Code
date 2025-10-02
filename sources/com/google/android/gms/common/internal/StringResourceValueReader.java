package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes.dex */
public class StringResourceValueReader {
    private final Resources zza;
    private final String zzb;

    public StringResourceValueReader(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        Resources resources = context.getResources();
        this.zza = resources;
        this.zzb = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    @Nullable
    @KeepForSdk
    public String getString(@NonNull String str) {
        String str2 = this.zzb;
        Resources resources = this.zza;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
