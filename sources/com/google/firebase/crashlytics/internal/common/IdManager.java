package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.InstallIdProvider;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.medallia.digital.mobilesdk.q2;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class IdManager implements InstallIdProvider {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote(q2.c);

    /* renamed from: a, reason: collision with root package name */
    public final InstallerPackageNameProvider f15278a;
    public final Context b;
    public final String c;
    public final FirebaseInstallationsApi d;
    public final DataCollectionArbiter e;
    public InstallIdProvider.InstallIds f;

    public IdManager(Context context, String str, FirebaseInstallationsApi firebaseInstallationsApi, DataCollectionArbiter dataCollectionArbiter) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.b = context;
        this.c = str;
        this.d = firebaseInstallationsApi;
        this.e = dataCollectionArbiter;
        this.f15278a = new InstallerPackageNameProvider();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        Logger.f15258a.e("Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final FirebaseInstallationId b(boolean z) {
        String strB;
        CrashlyticsWorkers.c();
        Logger logger = Logger.f15258a;
        FirebaseInstallationsApi firebaseInstallationsApi = this.d;
        String str = null;
        if (z) {
            try {
                strB = ((InstallationTokenResult) Tasks.await(firebaseInstallationsApi.a(), 10000L, TimeUnit.MILLISECONDS)).b();
            } catch (Exception e) {
                logger.f(e, "Error getting Firebase authentication token.");
            }
        } else {
            strB = null;
        }
        try {
            str = (String) Tasks.await(firebaseInstallationsApi.getId(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            logger.f(e2, "Error getting Firebase installation id.");
        }
        return new FirebaseInstallationId(str, strB);
    }

    public final synchronized InstallIdProvider.InstallIds c() {
        String str;
        InstallIdProvider.InstallIds installIds = this.f;
        if (installIds != null && (((AutoValue_InstallIdProvider_InstallIds) installIds).b != null || !this.e.a())) {
            return this.f;
        }
        Logger logger = Logger.f15258a;
        logger.e("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        logger.e("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            FirebaseInstallationId firebaseInstallationIdB = b(false);
            logger.e("Fetched Firebase Installation ID: " + firebaseInstallationIdB.f15277a);
            if (firebaseInstallationIdB.f15277a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                firebaseInstallationIdB = new FirebaseInstallationId(str, null);
            }
            if (Objects.equals(firebaseInstallationIdB.f15277a, string)) {
                this.f = new AutoValue_InstallIdProvider_InstallIds(sharedPreferences.getString("crashlytics.installation.id", null), firebaseInstallationIdB.f15277a, firebaseInstallationIdB.b);
            } else {
                this.f = new AutoValue_InstallIdProvider_InstallIds(a(sharedPreferences, firebaseInstallationIdB.f15277a), firebaseInstallationIdB.f15277a, firebaseInstallationIdB.b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new AutoValue_InstallIdProvider_InstallIds(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f = new AutoValue_InstallIdProvider_InstallIds(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        logger.e("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        InstallerPackageNameProvider installerPackageNameProvider = this.f15278a;
        Context context = this.b;
        synchronized (installerPackageNameProvider) {
            try {
                if (installerPackageNameProvider.f15279a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    installerPackageNameProvider.f15279a = installerPackageName;
                }
                str = "".equals(installerPackageNameProvider.f15279a) ? null : installerPackageNameProvider.f15279a;
            } finally {
            }
        }
        return str;
    }
}
