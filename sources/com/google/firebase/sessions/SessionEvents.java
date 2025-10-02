package com.google.firebase.sessions;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.FirebaseApp;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/SessionEvents;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SessionEvents {

    /* renamed from: a, reason: collision with root package name */
    public static final SessionEvents f15818a = new SessionEvents();
    public static final DataEncoder b;

    static {
        JsonDataEncoderBuilder jsonDataEncoderBuilder = new JsonDataEncoderBuilder();
        AutoSessionEventEncoder.f15786a.configure(jsonDataEncoderBuilder);
        jsonDataEncoderBuilder.d = true;
        b = jsonDataEncoderBuilder.a();
    }

    public static ApplicationInfo a(FirebaseApp firebaseApp) throws PackageManager.NameNotFoundException {
        firebaseApp.a();
        Context context = firebaseApp.f15169a;
        Intrinsics.g(context, "getApplicationContext(...)");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = String.valueOf(packageInfo.getLongVersionCode());
        firebaseApp.a();
        String str = firebaseApp.c.b;
        Intrinsics.g(str, "getApplicationId(...)");
        String MODEL = Build.MODEL;
        Intrinsics.g(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.g(RELEASE, "RELEASE");
        LogEnvironment logEnvironment = LogEnvironment.e;
        Intrinsics.e(packageName);
        String str2 = packageInfo.versionName;
        String str3 = str2 == null ? strValueOf : str2;
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.g(MANUFACTURER, "MANUFACTURER");
        firebaseApp.a();
        ProcessDetails processDetailsB = ProcessDetailsProvider.b(context);
        firebaseApp.a();
        return new ApplicationInfo(str, new AndroidApplicationInfo(packageName, str3, strValueOf, processDetailsB, ProcessDetailsProvider.a(context)));
    }
}
