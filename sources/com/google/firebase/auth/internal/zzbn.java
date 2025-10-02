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
public final /* synthetic */ class zzbn implements OnCompleteListener {
    public /* synthetic */ RecaptchaActivity d;
    public /* synthetic */ String e;

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        RecaptchaActivity recaptchaActivity = this.d;
        String str = this.e;
        zzcg zzcgVar = RecaptchaActivity.v;
        if (recaptchaActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
            Log.e("RecaptchaActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
            zzaer.zzb(recaptchaActivity, str);
            return;
        }
        List<ResolveInfo> listQueryIntentServices = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
            intent.putExtra("com.android.browser.application_id", str);
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            recaptchaActivity.startActivity(intent);
            return;
        }
        CustomTabsIntent customTabsIntentA = new CustomTabsIntent.Builder().a();
        Intent intent2 = customTabsIntentA.f208a;
        intent2.addFlags(1073741824);
        intent2.addFlags(268435456);
        customTabsIntentA.b(recaptchaActivity, (Uri) task.getResult());
    }
}
