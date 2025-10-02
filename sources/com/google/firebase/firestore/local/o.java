package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import com.google.firestore.admin.v1.Index;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final /* synthetic */ class o implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15526a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(int i, Object obj, Object obj2) {
        this.f15526a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) throws SQLException {
        switch (this.f15526a) {
            case 0:
                SQLiteIndexManager sQLiteIndexManager = (SQLiteIndexManager) this.b;
                HashMap map = (HashMap) this.c;
                Cursor cursor = (Cursor) obj;
                try {
                    int i = cursor.getInt(0);
                    String string = cursor.getString(1);
                    LocalSerializer localSerializer = sQLiteIndexManager.b;
                    Index indexM = Index.M(cursor.getBlob(2));
                    localSerializer.getClass();
                    sQLiteIndexManager.o(FieldIndex.a(i, string, LocalSerializer.a(indexM), map.containsKey(Integer.valueOf(i)) ? (FieldIndex.IndexState) map.get(Integer.valueOf(i)) : FieldIndex.f15534a));
                    return;
                } catch (InvalidProtocolBufferException e) {
                    Assert.a("Failed to decode index: " + e, new Object[0]);
                    throw null;
                }
            case 1:
                SQLiteSchema sQLiteSchema = (SQLiteSchema) this.b;
                String str = (String) this.c;
                sQLiteSchema.getClass();
                int i2 = ((Cursor) obj).getInt(0);
                SQLiteDatabase sQLiteDatabase = sQLiteSchema.f15518a;
                SQLiteStatement sQLiteStatementCompileStatement = sQLiteDatabase.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
                sQLiteStatementCompileStatement.bindString(1, str);
                sQLiteStatementCompileStatement.bindLong(2, i2);
                Assert.b(sQLiteStatementCompileStatement.executeUpdateDelete() != 0, "Mutation batch (%s, %d) did not exist", str, Integer.valueOf(i2));
                sQLiteDatabase.execSQL("DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?", new Object[]{str, Integer.valueOf(i2)});
                return;
            default:
                boolean[] zArr = (boolean[]) this.b;
                SQLiteStatement sQLiteStatement = (SQLiteStatement) this.c;
                zArr[0] = true;
                String string2 = ((Cursor) obj).getString(0);
                ResourcePath resourcePathA = EncodedPath.a(string2);
                sQLiteStatement.clearBindings();
                sQLiteStatement.bindLong(1, resourcePathA.d.size());
                sQLiteStatement.bindString(2, string2);
                Assert.b(sQLiteStatement.executeUpdateDelete() != -1, "Failed to update document path", new Object[0]);
                return;
        }
    }
}
