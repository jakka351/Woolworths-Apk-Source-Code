package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.util.SparseArray;
import com.google.firebase.firestore.util.Consumer;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes6.dex */
public final /* synthetic */ class q implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15528a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Cloneable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q(Object obj, Cloneable cloneable, Object obj2, int i) {
        this.f15528a = i;
        this.b = obj;
        this.c = cloneable;
        this.d = obj2;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) {
        switch (this.f15528a) {
            case 0:
                SQLiteMutationQueue sQLiteMutationQueue = (SQLiteMutationQueue) this.b;
                HashSet hashSet = (HashSet) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                Cursor cursor = (Cursor) obj;
                int i = cursor.getInt(0);
                if (!hashSet.contains(Integer.valueOf(i))) {
                    hashSet.add(Integer.valueOf(i));
                    arrayList.add(sQLiteMutationQueue.j(i, cursor.getBlob(1)));
                    break;
                }
                break;
            default:
                SQLiteTargetCache sQLiteTargetCache = (SQLiteTargetCache) this.b;
                SparseArray sparseArray = (SparseArray) this.c;
                int[] iArr = (int[]) this.d;
                sQLiteTargetCache.getClass();
                int i2 = ((Cursor) obj).getInt(0);
                if (sparseArray.get(i2) == null) {
                    SQLitePersistence sQLitePersistence = sQLiteTargetCache.f15519a;
                    sQLitePersistence.o("DELETE FROM target_documents WHERE target_id = ?", Integer.valueOf(i2));
                    sQLitePersistence.o("DELETE FROM targets WHERE target_id = ?", Integer.valueOf(i2));
                    sQLiteTargetCache.f--;
                    iArr[0] = iArr[0] + 1;
                    break;
                }
                break;
        }
    }
}
