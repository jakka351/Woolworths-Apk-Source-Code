package com.google.firebase.auth.internal;

import YU.a;
import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzahs;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.FirebaseApp;
import java.util.List;

/* loaded from: classes6.dex */
final class zzbw implements Continuation<zzahs, Task<RecaptchaTasksClient>> {
    public final /* synthetic */ String d;
    public final /* synthetic */ zzbx e;

    public zzbw(zzbx zzbxVar, String str) {
        this.d = str;
        this.e = zzbxVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Task<RecaptchaTasksClient> then(Task<zzahs> task) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new zzbu((String) Preconditions.checkNotNull(((Exception) Preconditions.checkNotNull(task.getException())).getMessage())));
        }
        zzahs result = task.getResult();
        String strZza = result.zza();
        if (com.google.android.gms.internal.p002firebaseauthapi.zzac.zzc(strZza)) {
            return Tasks.forException(new zzbu(a.A("No Recaptcha Enterprise siteKey configured for tenant/project ", this.d)));
        }
        List<String> listZza = com.google.android.gms.internal.p002firebaseauthapi.zzt.zza('/').zza((CharSequence) strZza);
        String str = listZza.size() != 4 ? null : listZza.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception(a.A("Invalid siteKey format ", strZza)));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + this.d);
        }
        zzbx zzbxVar = this.e;
        zzbs zzbsVar = zzbxVar.f;
        FirebaseApp firebaseApp = zzbxVar.d;
        firebaseApp.a();
        Application application = (Application) firebaseApp.f15169a;
        ((zzbv) zzbsVar).getClass();
        Task<RecaptchaTasksClient> taskFetchTaskClient = Recaptcha.fetchTaskClient(application, str);
        zzbx zzbxVar2 = this.e;
        String str2 = this.d;
        synchronized (zzbxVar2.f15203a) {
            zzbxVar2.c = result;
            zzbxVar2.b.put(str2, taskFetchTaskClient);
        }
        return taskFetchTaskClient;
    }
}
