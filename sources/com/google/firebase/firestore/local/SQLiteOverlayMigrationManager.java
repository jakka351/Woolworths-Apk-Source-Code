package com.google.firebase.firestore.local;

/* loaded from: classes6.dex */
public class SQLiteOverlayMigrationManager implements OverlayMigrationManager {

    /* renamed from: a, reason: collision with root package name */
    public final SQLitePersistence f15512a;

    public SQLiteOverlayMigrationManager(SQLitePersistence sQLitePersistence) {
        this.f15512a = sQLitePersistence;
    }

    @Override // com.google.firebase.firestore.local.OverlayMigrationManager
    public final void run() {
        this.f15512a.l(new r(this, 0), "build overlays");
    }
}
