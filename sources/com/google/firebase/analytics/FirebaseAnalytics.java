package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics b;

    /* renamed from: a, reason: collision with root package name */
    public final zzfb f15179a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public static final class ConsentStatus {
        public static final /* synthetic */ ConsentStatus[] d = {new ConsentStatus("GRANTED", 0), new ConsentStatus("DENIED", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        ConsentStatus EF5;

        @NonNull
        public static ConsentStatus valueOf(@NonNull String str) {
            return (ConsentStatus) Enum.valueOf(ConsentStatus.class, str);
        }

        @NonNull
        public static ConsentStatus[] values() {
            return (ConsentStatus[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public static final class ConsentType {
        public static final /* synthetic */ ConsentType[] d = {new ConsentType("AD_STORAGE", 0), new ConsentType("ANALYTICS_STORAGE", 1), new ConsentType("AD_USER_DATA", 2), new ConsentType("AD_PERSONALIZATION", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        ConsentType EF5;

        @NonNull
        public static ConsentType valueOf(@NonNull String str) {
            return (ConsentType) Enum.valueOf(ConsentType.class, str);
        }

        @NonNull
        public static ConsentType[] values() {
            return (ConsentType[]) d.clone();
        }
    }

    /* loaded from: classes6.dex */
    public static class Event {
    }

    /* loaded from: classes6.dex */
    public static class Param {
    }

    /* loaded from: classes6.dex */
    public static class UserProperty {
    }

    public FirebaseAnalytics(zzfb zzfbVar) {
        Preconditions.checkNotNull(zzfbVar);
        this.f15179a = zzfbVar;
    }

    @NonNull
    @RequiresPermission
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (b == null) {
                        b = new FirebaseAnalytics(zzfb.zza(context, null));
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Nullable
    @Keep
    public static zzlk getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        zzfb zzfbVarZza = zzfb.zza(context, bundle);
        if (zzfbVarZza == null) {
            return null;
        }
        return new zzd(zzfbVarZza);
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = FirebaseInstallations.m;
            FirebaseApp firebaseAppD = FirebaseApp.d();
            Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
            return (String) Tasks.await(((FirebaseInstallations) firebaseAppD.b(FirebaseInstallationsApi.class)).getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @MainThread
    @Deprecated
    public void setCurrentScreen(@NonNull Activity activity, @Nullable @Size String str, @Nullable @Size String str2) {
        this.f15179a.zzp(zzdf.zza(activity), str, str2);
    }
}
