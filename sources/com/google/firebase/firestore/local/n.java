package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final /* synthetic */ class n implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15525a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i) {
        this.f15525a = i;
        this.b = obj;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) {
        switch (this.f15525a) {
            case 0:
                Cursor cursor = (Cursor) obj;
                ((HashMap) this.b).put(Integer.valueOf(cursor.getInt(0)), FieldIndex.IndexState.b(cursor.getLong(1), new SnapshotVersion(new Timestamp(cursor.getLong(2), cursor.getInt(3))), new DocumentKey(EncodedPath.a(cursor.getString(4))), cursor.getInt(5)));
                return;
            case 1:
                SQLiteTargetCache sQLiteTargetCache = (SQLiteTargetCache) this.b;
                Cursor cursor2 = (Cursor) obj;
                sQLiteTargetCache.getClass();
                sQLiteTargetCache.c = cursor2.getInt(0);
                sQLiteTargetCache.d = cursor2.getInt(1);
                sQLiteTargetCache.e = new SnapshotVersion(new Timestamp(cursor2.getLong(2), cursor2.getInt(3)));
                sQLiteTargetCache.f = cursor2.getLong(4);
                return;
            default:
                Boolean[] boolArr = (Boolean[]) this.b;
                try {
                    if ("BUILD_OVERLAYS".equals(((Cursor) obj).getString(0))) {
                        boolArr[0] = Boolean.TRUE;
                        return;
                    }
                    return;
                } catch (IllegalArgumentException e) {
                    Assert.a("SQLitePersistence.DataMigration failed to parse: %s", e);
                    throw null;
                }
        }
    }
}
