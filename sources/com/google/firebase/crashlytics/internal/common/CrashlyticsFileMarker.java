package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
class CrashlyticsFileMarker {

    /* renamed from: a, reason: collision with root package name */
    public final String f15273a;
    public final FileStore b;

    public CrashlyticsFileMarker(String str, FileStore fileStore) {
        this.f15273a = str;
        this.b = fileStore;
    }

    public final void a() throws IOException {
        String str = this.f15273a;
        try {
            FileStore fileStore = this.b;
            fileStore.getClass();
            new File(fileStore.c, str).createNewFile();
        } catch (IOException e) {
            Logger.f15258a.c(e, "Error creating marker: ".concat(str));
        }
    }
}
