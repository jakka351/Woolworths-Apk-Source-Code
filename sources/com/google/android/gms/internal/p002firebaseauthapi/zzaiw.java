package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzaiw {
    private List<String> zza;

    public zzaiw() {
        this(null);
    }

    public static zzaiw zza() {
        return new zzaiw(null);
    }

    public final List<String> zzb() {
        return this.zza;
    }

    private zzaiw(@Nullable List<String> list) {
        this.zza = new ArrayList();
    }

    public zzaiw(int i, List<String> list) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                list.set(i2, Strings.emptyToNull(list.get(i2)));
            }
            this.zza = Collections.unmodifiableList(list);
            return;
        }
        this.zza = Collections.EMPTY_LIST;
    }
}
