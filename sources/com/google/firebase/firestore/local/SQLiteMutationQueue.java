package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteStatement;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.proto.WriteBatch;
import com.google.firebase.firestore.remote.WriteStream;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
final class SQLiteMutationQueue implements MutationQueue {

    /* renamed from: a, reason: collision with root package name */
    public final SQLitePersistence f15510a;
    public final LocalSerializer b;
    public final IndexManager c;
    public final String d;
    public int e;
    public ByteString f;

    public static class BlobAccumulator implements Consumer<Cursor> {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f15511a;
        public boolean b;

        public BlobAccumulator(byte[] bArr) {
            ArrayList arrayList = new ArrayList();
            this.f15511a = arrayList;
            this.b = true;
            arrayList.add(ByteString.j(0, bArr.length, bArr));
        }

        @Override // com.google.firebase.firestore.util.Consumer
        public final void accept(Object obj) {
            byte[] blob = ((Cursor) obj).getBlob(0);
            ByteString byteString = ByteString.e;
            this.f15511a.add(ByteString.j(0, blob.length, blob));
            if (blob.length < 1000000) {
                this.b = false;
            }
        }
    }

    public SQLiteMutationQueue(SQLitePersistence sQLitePersistence, LocalSerializer localSerializer, User user, IndexManager indexManager) {
        this.f15510a = sQLitePersistence;
        this.b = localSerializer;
        String str = user.f15436a;
        this.d = str == null ? "" : str;
        this.f = WriteStream.v;
        this.c = indexManager;
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public final void a() {
        SQLitePersistence sQLitePersistence = this.f15510a;
        SQLitePersistence.Query queryP = sQLitePersistence.p("SELECT batch_id FROM mutations WHERE uid = ? LIMIT 1");
        String str = this.d;
        queryP.a(str);
        if (queryP.d()) {
            ArrayList arrayList = new ArrayList();
            SQLitePersistence.Query queryP2 = sQLitePersistence.p("SELECT path FROM document_mutations WHERE uid = ?");
            queryP2.a(str);
            Cursor cursorE = queryP2.e();
            while (cursorE.moveToNext()) {
                try {
                    arrayList.add(EncodedPath.a(cursorE.getString(0)));
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
            Assert.b(arrayList.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty. Dangling keys: %s", arrayList);
        }
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public final MutationBatch b(int i) {
        SQLitePersistence.Query queryP = this.f15510a.p("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id >= ? ORDER BY batch_id ASC LIMIT 1");
        queryP.a(1000000, this.d, Integer.valueOf(i + 1));
        Cursor cursorE = queryP.e();
        try {
            if (!cursorE.moveToFirst()) {
                cursorE.close();
                return null;
            }
            MutationBatch mutationBatchJ = j(cursorE.getInt(0), cursorE.getBlob(1));
            cursorE.close();
            return mutationBatchJ;
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

    @Override // com.google.firebase.firestore.local.MutationQueue
    public final MutationBatch c(int i) {
        SQLitePersistence.Query queryP = this.f15510a.p("SELECT SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id = ?");
        queryP.a(1000000, this.d, Integer.valueOf(i));
        Cursor cursorE = queryP.e();
        try {
            if (!cursorE.moveToFirst()) {
                cursorE.close();
                return null;
            }
            MutationBatch mutationBatchJ = j(i, cursorE.getBlob(0));
            cursorE.close();
            return mutationBatchJ;
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

    @Override // com.google.firebase.firestore.local.MutationQueue
    public final ByteString d() {
        return this.f;
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public final void e(MutationBatch mutationBatch, ByteString byteString) {
        byteString.getClass();
        this.f = byteString;
        k();
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public final ArrayList f(Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(EncodedPath.b(((DocumentKey) it.next()).d));
        }
        SQLitePersistence.LongQuery longQuery = new SQLitePersistence.LongQuery(this.f15510a, "SELECT DISTINCT dm.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path IN (", Arrays.asList(1000000, this.d), arrayList, ") AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id");
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        while (longQuery.f.hasNext()) {
            longQuery.b().c(new q(this, hashSet, arrayList2, 0));
        }
        if (longQuery.e > 1) {
            Collections.sort(arrayList2, new a(4));
        }
        return arrayList2;
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public final void g(MutationBatch mutationBatch) throws SQLException {
        SQLitePersistence sQLitePersistence = this.f15510a;
        SQLiteStatement sQLiteStatementCompileStatement = sQLitePersistence.h.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        SQLiteStatement sQLiteStatementCompileStatement2 = sQLitePersistence.h.compileStatement("DELETE FROM document_mutations WHERE uid = ? AND path = ? AND batch_id = ?");
        int i = mutationBatch.f15544a;
        Integer numValueOf = Integer.valueOf(i);
        String str = this.d;
        sQLiteStatementCompileStatement.clearBindings();
        SQLitePersistence.n(sQLiteStatementCompileStatement, new Object[]{str, numValueOf});
        Assert.b(sQLiteStatementCompileStatement.executeUpdateDelete() != 0, "Mutation batch (%s, %d) did not exist", str, Integer.valueOf(mutationBatch.f15544a));
        Iterator it = mutationBatch.d.iterator();
        while (it.hasNext()) {
            DocumentKey documentKey = ((Mutation) it.next()).f15543a;
            Object[] objArr = {str, EncodedPath.b(documentKey.d), Integer.valueOf(i)};
            sQLiteStatementCompileStatement2.clearBindings();
            SQLitePersistence.n(sQLiteStatementCompileStatement2, objArr);
            sQLiteStatementCompileStatement2.executeUpdateDelete();
            sQLitePersistence.f.p(documentKey);
        }
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public final void h(ByteString byteString) {
        byteString.getClass();
        this.f = byteString;
        k();
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public final List i() {
        ArrayList arrayList = new ArrayList();
        SQLitePersistence.Query queryP = this.f15510a.p("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? ORDER BY batch_id ASC");
        queryP.a(1000000, this.d);
        Cursor cursorE = queryP.e();
        while (cursorE.moveToNext()) {
            try {
                arrayList.add(j(cursorE.getInt(0), cursorE.getBlob(1)));
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
        return arrayList;
    }

    public final MutationBatch j(int i, byte[] bArr) {
        int size;
        try {
            int length = bArr.length;
            LocalSerializer localSerializer = this.b;
            if (length < 1000000) {
                return localSerializer.c(WriteBatch.S(bArr));
            }
            BlobAccumulator blobAccumulator = new BlobAccumulator(bArr);
            ArrayList arrayList = blobAccumulator.f15511a;
            while (blobAccumulator.b) {
                int size2 = (arrayList.size() * 1000000) + 1;
                SQLitePersistence.Query queryP = this.f15510a.p("SELECT SUBSTR(mutations, ?, ?) FROM mutations WHERE uid = ? AND batch_id = ?");
                queryP.a(Integer.valueOf(size2), 1000000, this.d, Integer.valueOf(i));
                queryP.b(blobAccumulator);
            }
            if (arrayList == null) {
                Iterator it = arrayList.iterator();
                size = 0;
                while (it.hasNext()) {
                    it.next();
                    size++;
                }
            } else {
                size = arrayList.size();
            }
            return localSerializer.c(WriteBatch.R(size == 0 ? ByteString.e : ByteString.d(arrayList.iterator(), size)));
        } catch (InvalidProtocolBufferException e) {
            Assert.a("MutationBatch failed to parse: %s", e);
            throw null;
        }
    }

    public final void k() {
        this.f15510a.o("INSERT OR REPLACE INTO mutation_queues (uid, last_acknowledged_batch_id, last_stream_token) VALUES (?, ?, ?)", this.d, -1, this.f.y());
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public final void start() {
        ArrayList arrayList = new ArrayList();
        SQLitePersistence sQLitePersistence = this.f15510a;
        Cursor cursorE = sQLitePersistence.p("SELECT uid FROM mutation_queues").e();
        while (cursorE.moveToNext()) {
            try {
                arrayList.add(cursorE.getString(0));
            } finally {
                if (cursorE != null) {
                    try {
                        cursorE.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
        }
        cursorE.close();
        this.e = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            SQLitePersistence.Query queryP = sQLitePersistence.p("SELECT MAX(batch_id) FROM mutations WHERE uid = ?");
            queryP.a(str);
            cursorE = queryP.e();
            while (cursorE.moveToNext()) {
                try {
                    this.e = Math.max(this.e, cursorE.getInt(0));
                } finally {
                }
            }
            cursorE.close();
        }
        this.e++;
        SQLitePersistence.Query queryP2 = sQLitePersistence.p("SELECT last_stream_token FROM mutation_queues WHERE uid = ?");
        queryP2.a(this.d);
        cursorE = queryP2.e();
        try {
            if (!cursorE.moveToFirst()) {
                cursorE.close();
                k();
            } else {
                byte[] blob = cursorE.getBlob(0);
                ByteString byteString = ByteString.e;
                this.f = ByteString.j(0, blob.length, blob);
                cursorE.close();
            }
        } finally {
        }
    }
}
