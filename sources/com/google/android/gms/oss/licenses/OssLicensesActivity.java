package com.google.android.gms.oss.licenses;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes5.dex */
public final class OssLicensesActivity extends AppCompatActivity {
    zzd zza;
    private com.google.android.gms.internal.oss_licenses.zzg zzb;
    private String zzc = "";
    private ScrollView zzd = null;
    private TextView zze = null;
    private int zzf = 0;
    private zze zzg;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        zza.zza(this);
        setContentView(R.layout.libraries_social_licenses_license_activity);
        TextView textView = (TextView) findViewById(R.id.license_activity_textview);
        this.zze = textView;
        textView.setText(getString(R.string.license_is_loading));
        this.zzg = zze.zza(this);
        this.zzb = (com.google.android.gms.internal.oss_licenses.zzg) getIntent().getParcelableExtra("license");
        if (getSupportActionBar() != null) {
            getSupportActionBar().A(this.zzb.zzb());
            getSupportActionBar().t();
            getSupportActionBar().s(true);
            getSupportActionBar().y();
        }
        zzd zzdVarZzb = zze.zzb(this, this.zzg.zzd(getPackageName()));
        this.zza = zzdVarZzb;
        this.zzd = (ScrollView) findViewById(zzdVarZzb.zza.getIdentifier("license_activity_scrollview", "id", zzdVarZzb.zzb));
        zzd zzdVar = this.zza;
        this.zze = (TextView) findViewById(zzdVar.zza.getIdentifier("license_activity_textview", "id", zzdVar.zzb));
        String strZze = this.zzg.zze(this.zzb);
        this.zzc = strZze;
        if (strZze == null || strZze.isEmpty()) {
            this.zzc = com.google.android.gms.internal.oss_licenses.zzh.zzb(this, this.zzb, R.raw.keep_third_party_licenses);
        }
        if (this.zzc == null) {
            this.zzc = getString(R.string.license_content_error);
        }
        this.zze.setText(this.zzc);
        if (this.zzf == 0) {
            return;
        }
        this.zzd.post(new zzf(this));
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

    @Override // android.app.Activity
    public void onRestoreInstanceState(@NonNull Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.zzf = bundle.getInt("scroll_pos");
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TextView textView = this.zze;
        if (textView == null || this.zzd == null) {
            return;
        }
        bundle.putInt("scroll_pos", this.zze.getLayout().getLineStart(textView.getLayout().getLineForVertical(this.zzd.getScrollY())));
    }

    public final /* synthetic */ ScrollView zza() {
        return this.zzd;
    }

    public final /* synthetic */ TextView zzb() {
        return this.zze;
    }

    public final /* synthetic */ int zzc() {
        return this.zzf;
    }
}
