package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.Overlay;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.BackgroundQueue;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.Executors;
import com.google.firestore.v1.Write;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public class SQLiteDocumentOverlayCache implements DocumentOverlayCache {

    /* renamed from: a, reason: collision with root package name */
    public final SQLitePersistence f15507a;
    public final LocalSerializer b;
    public final String c;

    public SQLiteDocumentOverlayCache(SQLitePersistence sQLitePersistence, LocalSerializer localSerializer, User user) {
        this.f15507a = sQLitePersistence;
        this.b = localSerializer;
        String str = user.f15436a;
        this.c = str == null ? "" : str;
    }

    @Override // com.google.firebase.firestore.local.DocumentOverlayCache
    public final HashMap a(TreeSet treeSet) throws InterruptedException {
        Assert.b(treeSet.comparator() == null, "getOverlays() requires natural order", new Object[0]);
        HashMap map = new HashMap();
        BackgroundQueue backgroundQueue = new BackgroundQueue();
        ResourcePath resourcePath = ResourcePath.e;
        ArrayList arrayList = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            DocumentKey documentKey = (DocumentKey) it.next();
            ResourcePath resourcePath2 = documentKey.d;
            ResourcePath resourcePath3 = documentKey.d;
            if (!resourcePath.equals((ResourcePath) resourcePath2.o())) {
                i(map, backgroundQueue, resourcePath, arrayList);
                resourcePath = (ResourcePath) resourcePath3.o();
                arrayList.clear();
            }
            arrayList.add(resourcePath3.e());
        }
        i(map, backgroundQueue, resourcePath, arrayList);
        backgroundQueue.a();
        return map;
    }

    @Override // com.google.firebase.firestore.local.DocumentOverlayCache
    public final HashMap b(ResourcePath resourcePath, int i) throws InterruptedException {
        HashMap map = new HashMap();
        BackgroundQueue backgroundQueue = new BackgroundQueue();
        SQLitePersistence.Query queryP = this.f15507a.p("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND largest_batch_id > ?");
        queryP.a(this.c, EncodedPath.b(resourcePath), Integer.valueOf(i));
        Cursor cursorE = queryP.e();
        while (cursorE.moveToNext()) {
            try {
                h(backgroundQueue, map, cursorE);
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
        backgroundQueue.a();
        return map;
    }

    @Override // com.google.firebase.firestore.local.DocumentOverlayCache
    public final void c(int i) {
        this.f15507a.o("DELETE FROM document_overlays WHERE uid = ? AND largest_batch_id = ?", this.c, Integer.valueOf(i));
    }

    @Override // com.google.firebase.firestore.local.DocumentOverlayCache
    public final HashMap d(int i, int i2, String str) throws InterruptedException {
        final HashMap map = new HashMap();
        final String[] strArr = new String[1];
        final String[] strArr2 = new String[1];
        final int[] iArr = new int[1];
        final BackgroundQueue backgroundQueue = new BackgroundQueue();
        SQLitePersistence sQLitePersistence = this.f15507a;
        SQLitePersistence.Query queryP = sQLitePersistence.p("SELECT overlay_mutation, largest_batch_id, collection_path, document_id  FROM document_overlays WHERE uid = ? AND collection_group = ? AND largest_batch_id > ? ORDER BY largest_batch_id, collection_path, document_id LIMIT ?");
        queryP.a(this.c, str, Integer.valueOf(i), Integer.valueOf(i2));
        queryP.c(new Consumer() { // from class: com.google.firebase.firestore.local.m
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                Cursor cursor = (Cursor) obj;
                iArr[0] = cursor.getInt(1);
                strArr[0] = cursor.getString(2);
                strArr2[0] = cursor.getString(3);
                this.f15524a.h(backgroundQueue, map, cursor);
            }
        });
        if (strArr[0] == null) {
            return map;
        }
        SQLitePersistence.Query queryP2 = sQLitePersistence.p("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_group = ? AND (collection_path > ? OR (collection_path = ? AND document_id > ?)) AND largest_batch_id = ?");
        String str2 = strArr[0];
        queryP2.a(this.c, str, str2, str2, strArr2[0], Integer.valueOf(iArr[0]));
        Cursor cursorE = queryP2.e();
        while (cursorE.moveToNext()) {
            try {
                h(backgroundQueue, map, cursorE);
            } finally {
            }
        }
        cursorE.close();
        backgroundQueue.a();
        return map;
    }

    @Override // com.google.firebase.firestore.local.DocumentOverlayCache
    public final void e(int i, HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            DocumentKey documentKey = (DocumentKey) entry.getKey();
            Mutation mutation = (Mutation) entry.getValue();
            if (mutation == null) {
                Locale locale = Locale.US;
                throw new NullPointerException("null value for key: " + documentKey);
            }
            String strF = documentKey.d.f(r2.d.size() - 2);
            ResourcePath resourcePath = documentKey.d;
            this.f15507a.o("INSERT OR REPLACE INTO document_overlays (uid, collection_group, collection_path, document_id, largest_batch_id, overlay_mutation) VALUES (?, ?, ?, ?, ?, ?)", this.c, strF, EncodedPath.b((ResourcePath) resourcePath.o()), resourcePath.e(), Integer.valueOf(i), this.b.f15485a.i(mutation).toByteArray());
        }
    }

    @Override // com.google.firebase.firestore.local.DocumentOverlayCache
    public final Overlay f(DocumentKey documentKey) {
        ResourcePath resourcePath = documentKey.d;
        String strB = EncodedPath.b((ResourcePath) resourcePath.o());
        String strE = resourcePath.e();
        SQLitePersistence.Query queryP = this.f15507a.p("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id = ?");
        queryP.a(this.c, strB, strE);
        Cursor cursorE = queryP.e();
        try {
            if (!cursorE.moveToFirst()) {
                cursorE.close();
                return null;
            }
            Overlay overlayG = g(cursorE.getInt(1), cursorE.getBlob(0));
            cursorE.close();
            return overlayG;
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

    public final Overlay g(int i, byte[] bArr) {
        try {
            return Overlay.a(i, this.b.f15485a.c(Write.f0(bArr)));
        } catch (InvalidProtocolBufferException e) {
            Assert.a("Overlay failed to parse: %s", e);
            throw null;
        }
    }

    public final void h(BackgroundQueue backgroundQueue, final Map map, Cursor cursor) {
        final byte[] blob = cursor.getBlob(0);
        final int i = cursor.getInt(1);
        Executor executor = backgroundQueue;
        if (cursor.isLast()) {
            executor = Executors.b;
        }
        executor.execute(new Runnable() { // from class: com.google.firebase.firestore.local.l
            @Override // java.lang.Runnable
            public final void run() {
                SQLiteDocumentOverlayCache sQLiteDocumentOverlayCache = this.d;
                byte[] bArr = blob;
                int i2 = i;
                Map map2 = map;
                Overlay overlayG = sQLiteDocumentOverlayCache.g(i2, bArr);
                synchronized (map2) {
                    map2.put(overlayG.c().f15543a, overlayG);
                }
            }
        });
    }

    public final void i(HashMap map, BackgroundQueue backgroundQueue, ResourcePath resourcePath, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        SQLitePersistence.LongQuery longQuery = new SQLitePersistence.LongQuery(this.f15507a, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id IN (", Arrays.asList(this.c, EncodedPath.b(resourcePath)), arrayList, ")");
        while (longQuery.f.hasNext()) {
            Cursor cursorE = longQuery.b().e();
            while (cursorE.moveToNext()) {
                try {
                    h(backgroundQueue, map, cursorE);
                } finally {
                }
            }
            cursorE.close();
        }
    }
}
