package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbde extends CustomTabsCallback {
    final /* synthetic */ zzbdh zza;

    public zzbde(zzbdh zzbdhVar) {
        Objects.requireNonNull(zzbdhVar);
        this.zza = zzbdhVar;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, @Nullable Bundle bundle) {
        this.zza.zzc(i);
    }
}
