package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbot;

@KeepForSdk
/* loaded from: classes5.dex */
public final class OutOfContextTestingActivity extends Activity {

    @NonNull
    @KeepForSdk
    public static final String AD_UNIT_KEY = "adUnit";

    @NonNull
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.OutOfContextTestingActivity";

    @Override // android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        zzdw zzdwVarZzi = zzbb.zzb().zzi(this, new zzbot());
        if (zzdwVarZzi == null) {
            finish();
            return;
        }
        setContentView(R.layout.admob_empty_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra(AD_UNIT_KEY);
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            zzdwVarZzi.zze(stringExtra, ObjectWrapper.wrap(this), ObjectWrapper.wrap(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
