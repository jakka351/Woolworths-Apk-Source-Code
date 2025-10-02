package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.persistence.FileStore;

/* loaded from: classes.dex */
public class LogFileManager {
    public static final NoopLogStore c = new NoopLogStore();

    /* renamed from: a, reason: collision with root package name */
    public final FileStore f15291a;
    public FileLogStore b = c;

    public static final class NoopLogStore implements FileLogStore {
        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public final void a(long j, String str) {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public final void b() {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public final String c() {
            return null;
        }
    }

    public LogFileManager(FileStore fileStore) {
        this.f15291a = fileStore;
    }

    public final String a() {
        return this.b.c();
    }

    public final void b(String str) {
        this.b.b();
        this.b = c;
        if (str == null) {
            return;
        }
        this.b = new QueueFileLogStore(this.f15291a.b(str, "userlog"));
    }

    public final void c(long j, String str) {
        this.b.a(j, str);
    }
}
