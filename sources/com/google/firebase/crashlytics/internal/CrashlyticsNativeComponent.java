package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* loaded from: classes.dex */
public interface CrashlyticsNativeComponent {
    void a(String str, long j, StaticSessionData staticSessionData);

    NativeSessionFileProvider b(String str);

    boolean c();

    boolean d(String str);
}
