package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.IOException;

/* loaded from: classes.dex */
class CrashlyticsAppQualitySessionsStore {
    public static final b d = new b(1);
    public static final a e = new a();

    /* renamed from: a, reason: collision with root package name */
    public final FileStore f15268a;
    public String b = null;
    public String c = null;

    public CrashlyticsAppQualitySessionsStore(FileStore fileStore) {
        this.f15268a = fileStore;
    }

    public static void a(FileStore fileStore, String str, String str2) throws IOException {
        if (str == null || str2 == null) {
            return;
        }
        try {
            fileStore.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e2) {
            Logger.f15258a.f(e2, "Failed to persist App Quality Sessions session id.");
        }
    }
}
