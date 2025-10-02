package com.google.firebase.sessions.settings;

import android.net.Uri;
import com.google.firebase.sessions.AndroidApplicationInfo;
import com.google.firebase.sessions.ApplicationInfo;
import java.net.URL;
import java.util.Map;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettingsFetcher;", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RemoteSettingsFetcher implements CrashlyticsSettingsFetcher {

    /* renamed from: a, reason: collision with root package name */
    public final ApplicationInfo f15840a;
    public final CoroutineContext b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettingsFetcher$Companion;", "", "", "FIREBASE_SESSIONS_BASE_URL_STRING", "Ljava/lang/String;", "FIREBASE_PLATFORM", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public RemoteSettingsFetcher(ApplicationInfo appInfo, CoroutineContext blockingDispatcher) {
        Intrinsics.h(appInfo, "appInfo");
        Intrinsics.h(blockingDispatcher, "blockingDispatcher");
        this.f15840a = appInfo;
        this.b = blockingDispatcher;
    }

    public static final URL b(RemoteSettingsFetcher remoteSettingsFetcher) {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        ApplicationInfo applicationInfo = remoteSettingsFetcher.f15840a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(applicationInfo.f15785a).appendPath("settings");
        AndroidApplicationInfo androidApplicationInfo = applicationInfo.b;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", androidApplicationInfo.c).appendQueryParameter("display_version", androidApplicationInfo.b).build().toString());
    }

    @Override // com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher
    public final Object a(Map map, Function2 function2, Function2 function22, Continuation continuation) throws Throwable {
        Object objF = BuildersKt.f(this.b, new RemoteSettingsFetcher$doConfigFetch$2(this, map, function2, function22, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }
}
