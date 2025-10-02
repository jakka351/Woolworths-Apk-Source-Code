package com.google.firebase.sessions.settings;

import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.TimeProvider;
import com.medallia.digital.mobilesdk.q2;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings;", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RemoteSettings implements SettingsProvider {
    public static final int g;
    public static final Regex h;

    /* renamed from: a, reason: collision with root package name */
    public final TimeProvider f15839a;
    public final FirebaseInstallationsApi b;
    public final ApplicationInfo c;
    public final CrashlyticsSettingsFetcher d;
    public final SettingsCache e;
    public final MutexImpl f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings$Companion;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        int i = Duration.g;
        g = (int) Duration.m(DurationKt.g(24, DurationUnit.j), DurationUnit.h);
        h = new Regex(q2.c);
    }

    public RemoteSettings(TimeProvider timeProvider, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo appInfo, CrashlyticsSettingsFetcher configsFetcher, SettingsCache settingsCache) {
        Intrinsics.h(timeProvider, "timeProvider");
        Intrinsics.h(firebaseInstallationsApi, "firebaseInstallationsApi");
        Intrinsics.h(appInfo, "appInfo");
        Intrinsics.h(configsFetcher, "configsFetcher");
        Intrinsics.h(settingsCache, "settingsCache");
        this.f15839a = timeProvider;
        this.b = firebaseInstallationsApi;
        this.c = appInfo;
        this.d = configsFetcher;
        this.e = settingsCache;
        this.f = MutexKt.a();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public final Double a() {
        return this.e.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:43:0x00a9, B:45:0x00b3, B:48:0x00bc, B:35:0x0086, B:37:0x008e, B:40:0x0097), top: B:56:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc A[Catch: all -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:43:0x00a9, B:45:0x00b3, B:48:0x00bc, B:35:0x0086, B:37:0x008e, B:40:0x0097), top: B:56:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    @Override // com.google.firebase.sessions.settings.SettingsProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.RemoteSettings.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public final Boolean c() {
        return this.e.e();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public final Duration d() {
        Integer numA = this.e.a();
        if (numA == null) {
            return null;
        }
        int i = Duration.g;
        return new Duration(DurationKt.g(numA.intValue(), DurationUnit.h));
    }
}
