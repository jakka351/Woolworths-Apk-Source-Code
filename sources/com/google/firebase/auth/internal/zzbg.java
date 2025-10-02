package com.google.firebase.auth.internal;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.internal.p002firebaseauthapi.zzaer;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* loaded from: classes6.dex */
public final /* synthetic */ class zzbg implements OnCompleteListener {
    public /* synthetic */ GenericIdpActivity d;
    public /* synthetic */ String e;

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        GenericIdpActivity genericIdpActivity = this.d;
        String str = this.e;
        zzcg zzcgVar = GenericIdpActivity.v;
        if (genericIdpActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
            Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
            zzaer.zzb(genericIdpActivity, str);
            return;
        }
        List<ResolveInfo> listQueryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
            CustomTabsIntent customTabsIntentA = new CustomTabsIntent.Builder().a();
            Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
            customTabsIntentA.b(genericIdpActivity, (Uri) task.getResult());
        } else {
            Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
            intent.putExtra("com.android.browser.application_id", str);
            Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            genericIdpActivity.startActivity(intent);
        }
    }
}
