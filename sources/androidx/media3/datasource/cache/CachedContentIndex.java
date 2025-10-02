package androidx.media3.datasource.cache;

import YU.a;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.AtomicFile;
import androidx.media3.common.util.Util;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.database.StandaloneDatabaseProvider;
import androidx.media3.database.VersionTable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
class CachedContentIndex {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2980a = new HashMap();
    public final SparseArray b = new SparseArray();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final SparseBooleanArray d = new SparseBooleanArray();
    public final Storage e;
    public Storage f;

    public static final class DatabaseStorage implements Storage {
        public static final String[] e = {"id", "key", "metadata"};

        /* renamed from: a, reason: collision with root package name */
        public final StandaloneDatabaseProvider f2981a;
        public final SparseArray b = new SparseArray();
        public String c;
        public String d;

        public DatabaseStorage(StandaloneDatabaseProvider standaloneDatabaseProvider) {
            this.f2981a = standaloneDatabaseProvider;
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public final void a(HashMap map) throws DatabaseIOException {
            try {
                SQLiteDatabase writableDatabase = this.f2981a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    i(writableDatabase);
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        h(writableDatabase, (CachedContent) it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.b.clear();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public final void b(CachedContent cachedContent) {
            this.b.put(cachedContent.f2978a, cachedContent);
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public final boolean c() throws DatabaseIOException {
            try {
                SQLiteDatabase readableDatabase = this.f2981a.getReadableDatabase();
                String str = this.c;
                str.getClass();
                return VersionTable.a(readableDatabase, str, 1) != -1;
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public final void d(HashMap map) throws DatabaseIOException {
            SparseArray sparseArray = this.b;
            if (sparseArray.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f2981a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i = 0; i < sparseArray.size(); i++) {
                    try {
                        CachedContent cachedContent = (CachedContent) sparseArray.valueAt(i);
                        if (cachedContent == null) {
                            int iKeyAt = sparseArray.keyAt(i);
                            String str = this.d;
                            str.getClass();
                            writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                        } else {
                            h(writableDatabase, cachedContent);
                        }
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                sparseArray.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public final void e(CachedContent cachedContent, boolean z) {
            int i = cachedContent.f2978a;
            SparseArray sparseArray = this.b;
            if (z) {
                sparseArray.delete(i);
            } else {
                sparseArray.put(i, null);
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public final void f(HashMap map, SparseArray sparseArray) throws DatabaseIOException {
            StandaloneDatabaseProvider standaloneDatabaseProvider = this.f2981a;
            Assertions.f(this.b.size() == 0);
            try {
                SQLiteDatabase readableDatabase = standaloneDatabaseProvider.getReadableDatabase();
                String str = this.c;
                str.getClass();
                if (VersionTable.a(readableDatabase, str, 1) != 1) {
                    SQLiteDatabase writableDatabase = standaloneDatabaseProvider.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        i(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                SQLiteDatabase readableDatabase2 = standaloneDatabaseProvider.getReadableDatabase();
                String str2 = this.d;
                str2.getClass();
                Cursor cursorQuery = readableDatabase2.query(str2, e, null, null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        int i = cursorQuery.getInt(0);
                        String string = cursorQuery.getString(1);
                        string.getClass();
                        map.put(string, new CachedContent(i, string, CachedContentIndex.a(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                        sparseArray.put(i, string);
                    } finally {
                    }
                }
                cursorQuery.close();
            } catch (SQLiteException e2) {
                map.clear();
                sparseArray.clear();
                throw new DatabaseIOException(e2);
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public final void g() throws DatabaseIOException {
            StandaloneDatabaseProvider standaloneDatabaseProvider = this.f2981a;
            String str = this.c;
            str.getClass();
            try {
                String strConcat = "ExoPlayerCacheIndex".concat(str);
                SQLiteDatabase writableDatabase = standaloneDatabaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    int i = VersionTable.f2953a;
                    try {
                        if (Util.S(writableDatabase, "ExoPlayerVersions")) {
                            writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                        }
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + strConcat);
                        writableDatabase.setTransactionSuccessful();
                    } catch (SQLException e2) {
                        throw new DatabaseIOException(e2);
                    }
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e3) {
                throw new DatabaseIOException(e3);
            }
        }

        public final void h(SQLiteDatabase sQLiteDatabase, CachedContent cachedContent) throws IOException, SQLException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            CachedContentIndex.b(cachedContent.e, new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(cachedContent.f2978a));
            contentValues.put("key", cachedContent.b);
            contentValues.put("metadata", byteArray);
            String str = this.d;
            str.getClass();
            sQLiteDatabase.replaceOrThrow(str, null, contentValues);
        }

        public final void i(SQLiteDatabase sQLiteDatabase) throws DatabaseIOException, SQLException {
            String str = this.c;
            str.getClass();
            VersionTable.b(sQLiteDatabase, str, 1);
            String str2 = this.d;
            str2.getClass();
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public final void initialize(long j) {
            String hexString = Long.toHexString(j);
            this.c = hexString;
            this.d = a.A("ExoPlayerCacheIndex", hexString);
        }
    }

    public static class LegacyStorage implements Storage {

        /* renamed from: a, reason: collision with root package name */
        public final Cipher f2982a = null;
        public final SecretKeySpec b = null;
        public final AtomicFile c;
        public boolean d;
        public ReusableBufferedOutputStream e;

        public LegacyStorage(File file) {
            this.c = new AtomicFile(file);
        }

        public static int h(CachedContent cachedContent, int i) {
            int iHashCode = cachedContent.b.hashCode() + (cachedContent.f2978a * 31);
            if (i < 2) {
                long jB = cachedContent.e.b();
                return (iHashCode * 31) + ((int) (jB ^ (jB >>> 32)));
            }
            return cachedContent.e.hashCode() + (iHashCode * 31);
        }

        public static CachedContent i(int i, DataInputStream dataInputStream) throws IOException {
            DefaultContentMetadata defaultContentMetadataA;
            int i2 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i < 2) {
                long j = dataInputStream.readLong();
                ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
                contentMetadataMutations.a(Long.valueOf(j), "exo_len");
                defaultContentMetadataA = DefaultContentMetadata.c.a(contentMetadataMutations);
            } else {
                defaultContentMetadataA = CachedContentIndex.a(dataInputStream);
            }
            return new CachedContent(i2, utf, defaultContentMetadataA);
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public final void a(HashMap map) throws Throwable {
            AtomicFile atomicFile = this.c;
            DataOutputStream dataOutputStream = null;
            try {
                OutputStream outputStreamA = atomicFile.a();
                ReusableBufferedOutputStream reusableBufferedOutputStream = this.e;
                if (reusableBufferedOutputStream == null) {
                    this.e = new ReusableBufferedOutputStream(outputStreamA);
                } else {
                    reusableBufferedOutputStream.a(outputStreamA);
                }
                DataOutputStream dataOutputStream2 = new DataOutputStream(this.e);
                try {
                    dataOutputStream2.writeInt(2);
                    dataOutputStream2.writeInt(0);
                    dataOutputStream2.writeInt(map.size());
                    int iH = 0;
                    for (CachedContent cachedContent : map.values()) {
                        dataOutputStream2.writeInt(cachedContent.f2978a);
                        dataOutputStream2.writeUTF(cachedContent.b);
                        CachedContentIndex.b(cachedContent.e, dataOutputStream2);
                        iH += h(cachedContent, 2);
                    }
                    dataOutputStream2.writeInt(iH);
                    dataOutputStream2.close();
                    atomicFile.b.delete();
                    int i = Util.f2928a;
                    this.d = false;
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    Util.f(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public final void b(CachedContent cachedContent) {
            this.d = true;
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public final boolean c() {
            AtomicFile atomicFile = this.c;
            return atomicFile.f2903a.exists() || atomicFile.b.exists();
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public final void d(HashMap map) throws Throwable {
            if (this.d) {
                a(map);
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public final void e(CachedContent cachedContent, boolean z) {
            this.d = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0089 A[Catch: all -> 0x0072, IOException -> 0x0075, LOOP:0: B:37:0x0087->B:38:0x0089, LOOP_END, TryCatch #5 {IOException -> 0x0075, all -> 0x0072, blocks: (B:13:0x0039, B:18:0x0043, B:25:0x0055, B:26:0x005f, B:27:0x0066, B:34:0x007a, B:35:0x007f, B:36:0x0080, B:38:0x0089, B:39:0x009f), top: B:60:0x0039 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void f(java.util.HashMap r13, android.util.SparseArray r14) throws java.lang.Throwable {
            /*
                r12 = this;
                boolean r0 = r12.d
                r1 = 1
                r0 = r0 ^ r1
                androidx.media3.common.util.Assertions.f(r0)
                androidx.media3.common.util.AtomicFile r0 = r12.c
                java.io.File r2 = r0.f2903a
                java.io.File r3 = r0.f2903a
                java.io.File r0 = r0.b
                boolean r2 = r2.exists()
                if (r2 != 0) goto L1d
                boolean r2 = r0.exists()
                if (r2 == 0) goto L1c
                goto L1d
            L1c:
                return
            L1d:
                r2 = 0
                java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> Lb5 java.io.IOException -> Lbc
                boolean r5 = r0.exists()     // Catch: java.lang.Throwable -> Lb5 java.io.IOException -> Lbc
                if (r5 == 0) goto L2c
                r3.delete()     // Catch: java.lang.Throwable -> Lb5 java.io.IOException -> Lbc
                r0.renameTo(r3)     // Catch: java.lang.Throwable -> Lb5 java.io.IOException -> Lbc
            L2c:
                java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lb5 java.io.IOException -> Lbc
                r5.<init>(r3)     // Catch: java.lang.Throwable -> Lb5 java.io.IOException -> Lbc
                r4.<init>(r5)     // Catch: java.lang.Throwable -> Lb5 java.io.IOException -> Lbc
                java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> Lb5 java.io.IOException -> Lbc
                r5.<init>(r4)     // Catch: java.lang.Throwable -> Lb5 java.io.IOException -> Lbc
                int r2 = r5.readInt()     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
                if (r2 < 0) goto L4e
                r6 = 2
                if (r2 <= r6) goto L43
                goto L4e
            L43:
                int r7 = r5.readInt()     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
                r7 = r7 & r1
                if (r7 == 0) goto L80
                javax.crypto.Cipher r7 = r12.f2982a
                if (r7 != 0) goto L53
            L4e:
                androidx.media3.common.util.Util.f(r5)
                goto Lc1
            L53:
                r8 = 16
                byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
                r5.readFully(r8)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
                javax.crypto.spec.IvParameterSpec r9 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
                r9.<init>(r8)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
                javax.crypto.spec.SecretKeySpec r8 = r12.b     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75 java.security.InvalidAlgorithmParameterException -> L77 java.security.InvalidKeyException -> L79
                int r10 = androidx.media3.common.util.Util.f2928a     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75 java.security.InvalidAlgorithmParameterException -> L77 java.security.InvalidKeyException -> L79
                r7.init(r6, r8, r9)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75 java.security.InvalidAlgorithmParameterException -> L77 java.security.InvalidKeyException -> L79
                java.io.DataInputStream r6 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
                javax.crypto.CipherInputStream r8 = new javax.crypto.CipherInputStream     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
                r8.<init>(r4, r7)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
                r6.<init>(r8)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
                r5 = r6
                goto L80
            L72:
                r13 = move-exception
                r2 = r5
                goto Lb6
            L75:
                r2 = r5
                goto Lbc
            L77:
                r1 = move-exception
                goto L7a
            L79:
                r1 = move-exception
            L7a:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
                r2.<init>(r1)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
                throw r2     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
            L80:
                int r4 = r5.readInt()     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
                r6 = 0
                r7 = r6
                r8 = r7
            L87:
                if (r7 >= r4) goto L9f
                androidx.media3.datasource.cache.CachedContent r9 = i(r2, r5)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
                java.lang.String r10 = r9.b     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
                r13.put(r10, r9)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
                int r11 = r9.f2978a     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
                r14.put(r11, r10)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
                int r9 = h(r9, r2)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
                int r8 = r8 + r9
                int r7 = r7 + 1
                goto L87
            L9f:
                int r2 = r5.readInt()     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
                int r4 = r5.read()     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
                r7 = -1
                if (r4 != r7) goto Lab
                goto Lac
            Lab:
                r1 = r6
            Lac:
                if (r2 != r8) goto L4e
                if (r1 != 0) goto Lb1
                goto L4e
            Lb1:
                androidx.media3.common.util.Util.f(r5)
                return
            Lb5:
                r13 = move-exception
            Lb6:
                if (r2 == 0) goto Lbb
                androidx.media3.common.util.Util.f(r2)
            Lbb:
                throw r13
            Lbc:
                if (r2 == 0) goto Lc1
                androidx.media3.common.util.Util.f(r2)
            Lc1:
                r13.clear()
                r14.clear()
                r3.delete()
                r0.delete()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.cache.CachedContentIndex.LegacyStorage.f(java.util.HashMap, android.util.SparseArray):void");
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public final void g() {
            AtomicFile atomicFile = this.c;
            atomicFile.f2903a.delete();
            atomicFile.b.delete();
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public final void initialize(long j) {
        }
    }

    public interface Storage {
        void a(HashMap map);

        void b(CachedContent cachedContent);

        boolean c();

        void d(HashMap map);

        void e(CachedContent cachedContent, boolean z);

        void f(HashMap map, SparseArray sparseArray);

        void g();

        void initialize(long j);
    }

    public CachedContentIndex(StandaloneDatabaseProvider standaloneDatabaseProvider, File file) {
        DatabaseStorage databaseStorage = new DatabaseStorage(standaloneDatabaseProvider);
        LegacyStorage legacyStorage = new LegacyStorage(new File(file, "cached_content_index.exi"));
        this.e = databaseStorage;
        this.f = legacyStorage;
    }

    public static DefaultContentMetadata a(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                throw new IOException(a.d(i3, "Invalid value size: "));
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = Util.c;
            int i4 = 0;
            while (i4 != i3) {
                int i5 = i4 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
                dataInputStream.readFully(bArrCopyOf, i4, iMin);
                iMin = Math.min(i3 - i5, 10485760);
                i4 = i5;
            }
            map.put(utf, bArrCopyOf);
        }
        return new DefaultContentMetadata(map);
    }

    public static void b(DefaultContentMetadata defaultContentMetadata, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry> setEntrySet = defaultContentMetadata.b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public final CachedContent c(String str) {
        return (CachedContent) this.f2980a.get(str);
    }

    public final CachedContent d(String str) {
        HashMap map = this.f2980a;
        CachedContent cachedContent = (CachedContent) map.get(str);
        if (cachedContent != null) {
            return cachedContent;
        }
        SparseArray sparseArray = this.b;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        CachedContent cachedContent2 = new CachedContent(iKeyAt, str, DefaultContentMetadata.c);
        map.put(str, cachedContent2);
        sparseArray.put(iKeyAt, str);
        this.d.put(iKeyAt, true);
        this.e.b(cachedContent2);
        return cachedContent2;
    }

    public final void e(long j) {
        Storage storage;
        Storage storage2 = this.e;
        storage2.initialize(j);
        Storage storage3 = this.f;
        if (storage3 != null) {
            storage3.initialize(j);
        }
        boolean zC = storage2.c();
        SparseArray sparseArray = this.b;
        HashMap map = this.f2980a;
        if (zC || (storage = this.f) == null || !storage.c()) {
            storage2.f(map, sparseArray);
        } else {
            this.f.f(map, sparseArray);
            storage2.a(map);
        }
        Storage storage4 = this.f;
        if (storage4 != null) {
            storage4.g();
            this.f = null;
        }
    }

    public final void f(String str) {
        HashMap map = this.f2980a;
        CachedContent cachedContent = (CachedContent) map.get(str);
        if (cachedContent != null && cachedContent.c.isEmpty() && cachedContent.d.isEmpty()) {
            map.remove(str);
            int i = cachedContent.f2978a;
            SparseBooleanArray sparseBooleanArray = this.d;
            boolean z = sparseBooleanArray.get(i);
            this.e.e(cachedContent, z);
            SparseArray sparseArray = this.b;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                this.c.put(i, true);
            }
        }
    }

    public final void g() {
        this.e.d(this.f2980a);
        SparseBooleanArray sparseBooleanArray = this.c;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            this.b.remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        this.d.clear();
    }
}
