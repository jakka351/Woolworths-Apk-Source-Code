package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteStatement;
import com.google.firebase.Timestamp;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.proto.Target;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.v1.Target;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.Iterator;

/* loaded from: classes6.dex */
final class SQLiteTargetCache implements TargetCache {

    /* renamed from: a, reason: collision with root package name */
    public final SQLitePersistence f15519a;
    public final LocalSerializer b;
    public int c;
    public long d;
    public SnapshotVersion e = SnapshotVersion.e;
    public long f;

    public static class DocumentKeysHolder {

        /* renamed from: a, reason: collision with root package name */
        public ImmutableSortedSet f15520a;
    }

    public static class TargetDataHolder {

        /* renamed from: a, reason: collision with root package name */
        public TargetData f15521a;
    }

    public SQLiteTargetCache(SQLitePersistence sQLitePersistence, LocalSerializer localSerializer) {
        this.f15519a = sQLitePersistence;
        this.b = localSerializer;
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public final void a(ImmutableSortedSet immutableSortedSet, int i) throws SQLException {
        SQLitePersistence sQLitePersistence = this.f15519a;
        SQLiteStatement sQLiteStatementCompileStatement = sQLitePersistence.h.compileStatement("DELETE FROM target_documents WHERE target_id = ? AND path = ?");
        SQLiteLruReferenceDelegate sQLiteLruReferenceDelegate = sQLitePersistence.f;
        Iterator it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            DocumentKey documentKey = (DocumentKey) it.next();
            Object[] objArr = {Integer.valueOf(i), EncodedPath.b(documentKey.d)};
            sQLiteStatementCompileStatement.clearBindings();
            SQLitePersistence.n(sQLiteStatementCompileStatement, objArr);
            sQLiteStatementCompileStatement.executeUpdateDelete();
            sQLiteLruReferenceDelegate.p(documentKey);
        }
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public final TargetData b(Target target) {
        String strB = target.b();
        TargetDataHolder targetDataHolder = new TargetDataHolder();
        SQLitePersistence.Query queryP = this.f15519a.p("SELECT target_proto FROM targets WHERE canonical_id = ?");
        queryP.a(strB);
        Cursor cursorE = queryP.e();
        while (cursorE.moveToNext()) {
            try {
                TargetData targetDataJ = j(cursorE.getBlob(0));
                if (target.equals(targetDataJ.f15522a)) {
                    targetDataHolder.f15521a = targetDataJ;
                }
            } catch (Throwable th) {
                if (cursorE != null) {
                    try {
                        cursorE.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        cursorE.close();
        return targetDataHolder.f15521a;
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public final int c() {
        return this.c;
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public final void d(ImmutableSortedSet immutableSortedSet, int i) throws SQLException {
        SQLitePersistence sQLitePersistence = this.f15519a;
        SQLiteStatement sQLiteStatementCompileStatement = sQLitePersistence.h.compileStatement("INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)");
        SQLiteLruReferenceDelegate sQLiteLruReferenceDelegate = sQLitePersistence.f;
        Iterator it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            DocumentKey documentKey = (DocumentKey) it.next();
            Object[] objArr = {Integer.valueOf(i), EncodedPath.b(documentKey.d)};
            sQLiteStatementCompileStatement.clearBindings();
            SQLitePersistence.n(sQLiteStatementCompileStatement, objArr);
            sQLiteStatementCompileStatement.executeUpdateDelete();
            sQLiteLruReferenceDelegate.p(documentKey);
        }
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public final void e(TargetData targetData) {
        boolean z;
        k(targetData);
        int i = targetData.b;
        boolean z2 = true;
        if (i > this.c) {
            this.c = i;
            z = true;
        } else {
            z = false;
        }
        long j = targetData.c;
        if (j > this.d) {
            this.d = j;
        } else {
            z2 = z;
        }
        if (z2) {
            l();
        }
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public final void f(SnapshotVersion snapshotVersion) {
        this.e = snapshotVersion;
        l();
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public final void g(TargetData targetData) {
        k(targetData);
        int i = targetData.b;
        if (i > this.c) {
            this.c = i;
        }
        long j = targetData.c;
        if (j > this.d) {
            this.d = j;
        }
        this.f++;
        l();
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public final ImmutableSortedSet h(int i) {
        DocumentKeysHolder documentKeysHolder = new DocumentKeysHolder();
        documentKeysHolder.f15520a = DocumentKey.f;
        SQLitePersistence.Query queryP = this.f15519a.p("SELECT path FROM target_documents WHERE target_id = ?");
        queryP.a(Integer.valueOf(i));
        Cursor cursorE = queryP.e();
        while (cursorE.moveToNext()) {
            try {
                documentKeysHolder.f15520a = documentKeysHolder.f15520a.b(new DocumentKey(EncodedPath.a(cursorE.getString(0))));
            } catch (Throwable th) {
                if (cursorE != null) {
                    try {
                        cursorE.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        cursorE.close();
        return documentKeysHolder.f15520a;
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public final SnapshotVersion i() {
        return this.e;
    }

    public final TargetData j(byte[] bArr) {
        try {
            return this.b.d(com.google.firebase.firestore.proto.Target.c0(bArr));
        } catch (InvalidProtocolBufferException e) {
            Assert.a("TargetData failed to parse: %s", e);
            throw null;
        }
    }

    public final void k(TargetData targetData) {
        int i = targetData.b;
        Target target = targetData.f15522a;
        String strB = target.b();
        SnapshotVersion snapshotVersion = targetData.e;
        Timestamp timestamp = snapshotVersion.d;
        LocalSerializer localSerializer = this.b;
        localSerializer.getClass();
        QueryPurpose queryPurpose = targetData.d;
        QueryPurpose queryPurpose2 = QueryPurpose.d;
        Assert.b(queryPurpose2.equals(queryPurpose), "Only queries with purpose %s may be stored, got %s", queryPurpose2, queryPurpose);
        Target.Builder builderB0 = com.google.firebase.firestore.proto.Target.b0();
        builderB0.p();
        com.google.firebase.firestore.proto.Target.P((com.google.firebase.firestore.proto.Target) builderB0.e, i);
        long j = targetData.c;
        builderB0.p();
        com.google.firebase.firestore.proto.Target.S((com.google.firebase.firestore.proto.Target) builderB0.e, j);
        RemoteSerializer remoteSerializer = localSerializer.f15485a;
        com.google.protobuf.Timestamp timestampL = RemoteSerializer.l(targetData.f.d);
        builderB0.p();
        com.google.firebase.firestore.proto.Target.N((com.google.firebase.firestore.proto.Target) builderB0.e, timestampL);
        com.google.protobuf.Timestamp timestampL2 = RemoteSerializer.l(snapshotVersion.d);
        builderB0.p();
        com.google.firebase.firestore.proto.Target.Q((com.google.firebase.firestore.proto.Target) builderB0.e, timestampL2);
        ByteString byteString = targetData.g;
        builderB0.p();
        com.google.firebase.firestore.proto.Target.R((com.google.firebase.firestore.proto.Target) builderB0.e, byteString);
        if (target.e()) {
            Target.DocumentsTarget.Builder builderP = Target.DocumentsTarget.P();
            String strK = RemoteSerializer.k(remoteSerializer.f15578a, target.d);
            builderP.p();
            Target.DocumentsTarget.L((Target.DocumentsTarget) builderP.e, strK);
            Target.DocumentsTarget documentsTarget = (Target.DocumentsTarget) builderP.m();
            builderB0.p();
            com.google.firebase.firestore.proto.Target.M((com.google.firebase.firestore.proto.Target) builderB0.e, documentsTarget);
        } else {
            Target.QueryTarget queryTargetJ = remoteSerializer.j(target);
            builderB0.p();
            com.google.firebase.firestore.proto.Target.L((com.google.firebase.firestore.proto.Target) builderB0.e, queryTargetJ);
        }
        this.f15519a.o("INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(i), strB, Long.valueOf(timestamp.d), Integer.valueOf(timestamp.e), byteString.y(), Long.valueOf(j), ((com.google.firebase.firestore.proto.Target) builderB0.m()).toByteArray());
    }

    public final void l() {
        this.f15519a.o("UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?", Integer.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e.d.d), Integer.valueOf(this.e.d.e), Long.valueOf(this.f));
    }
}
