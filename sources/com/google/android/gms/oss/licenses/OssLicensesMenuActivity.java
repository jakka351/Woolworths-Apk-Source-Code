package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import com.dynatrace.android.callback.Callback;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class OssLicensesMenuActivity extends AppCompatActivity {
    private static String zza;
    private boolean zzb;
    private zze zzc;

    public static void setActivityTitle(@NonNull String str) {
        zza = str;
    }

    @VisibleForTesting
    public static boolean zza(@NonNull Context context, @NonNull String str) throws IOException {
        InputStream inputStreamOpenRawResource = null;
        try {
            Resources resources = context.getResources();
            inputStreamOpenRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.license_list)));
            boolean z = inputStreamOpenRawResource.available() > 0;
            try {
                inputStreamOpenRawResource.close();
            } catch (IOException unused) {
            }
            return z;
        } catch (Resources.NotFoundException | IOException unused2) {
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException unused3) {
                }
            }
            return false;
        } catch (Throwable th) {
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.zzc = zze.zza(this);
        zza.zza(this);
        setContentView(R.layout.libraries_social_licenses_license_menu_activity);
        boolean z = false;
        if (zza(this, "third_party_licenses") && zza(this, "third_party_license_metadata")) {
            z = true;
        }
        this.zzb = z;
        if (zza == null) {
            Intent intent = getIntent();
            if (intent.hasExtra("title")) {
                zza = intent.getStringExtra("title");
                Log.w("OssLicensesMenuActivity", "The intent based title is deprecated. Use OssLicensesMenuActivity.setActivityTitle(title) instead.");
            }
        }
        String str = zza;
        if (str != null) {
            setTitle(str);
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().s(true);
        }
        String strZzd = this.zzc.zzd(getPackageName());
        zzd zzdVarZzb = zze.zzb(this, strZzd);
        if (!this.zzb) {
            if (bundle == null) {
                zze.zza(this);
                int iZzf = zze.zzf(zzdVarZzb);
                if (((zzc) getSupportFragmentManager().F(iZzf)) == null) {
                    zzc zzcVar = new zzc();
                    FragmentTransaction fragmentTransactionE = getSupportFragmentManager().e();
                    fragmentTransactionE.g(iZzf, zzcVar, null, 1);
                    fragmentTransactionE.f();
                    return;
                }
                return;
            }
            return;
        }
        if (bundle == null) {
            zze.zza(this);
            int iZzf2 = zze.zzf(zzdVarZzb);
            if (((zzp) getSupportFragmentManager().F(iZzf2)) == null) {
                zzp zzpVar = new zzp();
                if (strZzd != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("license_activity_package_name", strZzd);
                    zzpVar.setArguments(bundle2);
                }
                FragmentTransaction fragmentTransactionE2 = getSupportFragmentManager().e();
                fragmentTransactionE2.g(iZzf2, zzpVar, null, 1);
                fragmentTransactionE2.f();
            }
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        Callback.p(menuItem);
        try {
            if (menuItem.getItemId() == 16908332) {
                finish();
                Callback.q();
                return true;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }
}
