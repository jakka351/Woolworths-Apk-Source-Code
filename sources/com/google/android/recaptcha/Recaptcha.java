package com.google.android.recaptcha;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzcq;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0087@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u001e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u0013J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u0015"}, d2 = {"Lcom/google/android/recaptcha/Recaptcha;", "", "<init>", "()V", "getClient", "Lkotlin/Result;", "Lcom/google/android/recaptcha/RecaptchaClient;", "application", "Landroid/app/Application;", "siteKey", "", "timeout", "", "getClient-BWLJW6A", "(Landroid/app/Application;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTasksClient", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/recaptcha/RecaptchaTasksClient;", "fetchClient", "(Landroid/app/Application;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTaskClient", "java.com.google.android.libraries.abuse.recaptcha.enterprise_enterprise"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Recaptcha {

    @NotNull
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    @JvmStatic
    @NotNull
    public static final Task<RecaptchaTasksClient> fetchTaskClient(@NonNull Application application, @NonNull String siteKey) {
        return zzcq.zze(application, siteKey);
    }

    @NonNull
    /* renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m50getClientBWLJW6A$default(@NonNull Recaptcha recaptcha, @NonNull Application application, @NonNull String str, long j, @NonNull Continuation continuation, int i, @NonNull Object obj) {
        if ((i & 4) != 0) {
            j = 10000;
        }
        return recaptcha.m51getClientBWLJW6A(application, str, j, continuation);
    }

    @Deprecated
    @JvmStatic
    @NotNull
    public static final Task<RecaptchaTasksClient> getTasksClient(@NonNull Application application, @NonNull String siteKey) {
        return zzcq.zzc(application, siteKey, 10000L);
    }

    @Nullable
    public final Object fetchClient(@NonNull Application application, @NonNull String str, @NonNull Continuation<? super RecaptchaClient> continuation) {
        return zzcq.zzd(application, str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.Nullable
    @kotlin.Deprecated
    /* renamed from: getClient-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m51getClientBWLJW6A(@androidx.annotation.NonNull android.app.Application r5, @androidx.annotation.NonNull java.lang.String r6, long r7, @androidx.annotation.NonNull kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.google.android.recaptcha.RecaptchaClient>> r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.Recaptcha$getClient$1
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = (com.google.android.recaptcha.Recaptcha$getClient$1) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = new com.google.android.recaptcha.Recaptcha$getClient$1
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.zza
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L27
            goto L3d
        L27:
            r5 = move-exception
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r9)
            r0.zzc = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r9 = com.google.android.recaptcha.internal.zzcq.zzb(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L27
            if (r9 != r1) goto L3d
            return r1
        L3d:
            com.google.android.recaptcha.internal.zzdc r9 = (com.google.android.recaptcha.internal.zzdc) r9     // Catch: java.lang.Throwable -> L27
            return r9
        L40:
            kotlin.Result$Failure r5 = kotlin.ResultKt.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.Recaptcha.m51getClientBWLJW6A(android.app.Application, java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Deprecated
    @JvmStatic
    @NotNull
    public static final Task<RecaptchaTasksClient> getTasksClient(@NonNull Application application, @NonNull String siteKey, long timeout) {
        return zzcq.zzc(application, siteKey, timeout);
    }
}
