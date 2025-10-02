package okhttp3.internal.cache;

import YU.a;
import androidx.compose.ui.platform.i;
import com.woolworths.scanlibrary.ui.splash.d;
import io.jsonwebtoken.JwtParser;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okio.FileSystem;
import okio.ForwardingSource;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSink;
import okio.Sink;
import okio.Source;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lokhttp3/internal/concurrent/Lockable;", "Snapshot", "Editor", "Entry", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DiskLruCache implements Closeable, Flushable, Lockable {
    public static final String A;
    public static final long B;
    public static final Regex C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final Path d;
    public final DiskLruCache$fileSystem$1 e;
    public final long f;
    public final Path g;
    public final Path h;
    public final Path i;
    public long j;
    public RealBufferedSink k;
    public final LinkedHashMap l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public long t;
    public final TaskQueue u;
    public final DiskLruCache$cleanupTask$1 v;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000b8\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Companion;", "", "<init>", "()V", "JOURNAL_FILE", "", "JOURNAL_FILE_TEMP", "JOURNAL_FILE_BACKUP", "MAGIC", "VERSION_1", "ANY_SEQUENCE_NUMBER", "", "LEGAL_KEY_PATTERN", "Lkotlin/text/Regex;", "CLEAN", "DIRTY", "REMOVE", "READ", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public final class Editor {

        /* renamed from: a, reason: collision with root package name */
        public final Entry f26704a;
        public final boolean[] b;
        public boolean c;

        public Editor(Entry entry) {
            boolean[] zArr;
            this.f26704a = entry;
            if (entry.e) {
                zArr = null;
            } else {
                DiskLruCache.this.getClass();
                zArr = new boolean[2];
            }
            this.b = zArr;
        }

        public final void a() {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                try {
                    if (this.c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.c(this.f26704a.g, this)) {
                        diskLruCache.b(this, false);
                    }
                    this.c = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                try {
                    if (this.c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.c(this.f26704a.g, this)) {
                        diskLruCache.b(this, true);
                    }
                    this.c = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            Entry entry = this.f26704a;
            if (Intrinsics.c(entry.g, this)) {
                DiskLruCache diskLruCache = DiskLruCache.this;
                if (diskLruCache.o) {
                    diskLruCache.b(this, false);
                } else {
                    entry.f = true;
                }
            }
        }

        /* renamed from: d, reason: from getter */
        public final Entry getF26704a() {
            return this.f26704a;
        }

        /* renamed from: e, reason: from getter */
        public final boolean[] getB() {
            return this.b;
        }

        public final Sink f(int i) {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (this.c) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!Intrinsics.c(this.f26704a.g, this)) {
                    return Okio.a();
                }
                if (!this.f26704a.e) {
                    boolean[] zArr = this.b;
                    Intrinsics.e(zArr);
                    zArr[i] = true;
                }
                Path file = (Path) this.f26704a.d.get(i);
                try {
                    DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = diskLruCache.e;
                    diskLruCache$fileSystem$1.getClass();
                    Intrinsics.h(file, "file");
                    return new FaultHidingSink(diskLruCache$fileSystem$1.r(file, false), new d(3, diskLruCache, this));
                } catch (FileNotFoundException unused) {
                    return Okio.a();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public final class Entry {

        /* renamed from: a, reason: collision with root package name */
        public final String f26705a;
        public final long[] b;
        public final ArrayList c;
        public final ArrayList d;
        public boolean e;
        public boolean f;
        public Editor g;
        public int h;
        public long i;
        public final /* synthetic */ DiskLruCache j;

        public Entry(DiskLruCache diskLruCache, String key) {
            Intrinsics.h(key, "key");
            this.j = diskLruCache;
            this.f26705a = key;
            diskLruCache.getClass();
            this.b = new long[2];
            this.c = new ArrayList();
            this.d = new ArrayList();
            StringBuilder sb = new StringBuilder(key);
            sb.append(JwtParser.SEPARATOR_CHAR);
            int length = sb.length();
            for (int i = 0; i < 2; i++) {
                sb.append(i);
                ArrayList arrayList = this.c;
                Path path = this.j.d;
                String string = sb.toString();
                Intrinsics.g(string, "toString(...)");
                arrayList.add(path.e(string));
                sb.append(".tmp");
                ArrayList arrayList2 = this.d;
                Path path2 = this.j.d;
                String string2 = sb.toString();
                Intrinsics.g(string2, "toString(...)");
                arrayList2.add(path2.e(string2));
                sb.setLength(length);
            }
        }

        public final Snapshot a() {
            TimeZone timeZone = _UtilJvmKt.f26699a;
            if (!this.e) {
                return null;
            }
            final DiskLruCache diskLruCache = this.j;
            if (!diskLruCache.o && (this.g != null || this.f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.b.clone();
            for (int i = 0; i < 2; i++) {
                try {
                    final Source sourceV = diskLruCache.e.v((Path) this.c.get(i));
                    if (!diskLruCache.o) {
                        this.h++;
                        sourceV = new ForwardingSource(sourceV) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                            public boolean e;

                            @Override // okio.ForwardingSource, java.io.Closeable, java.lang.AutoCloseable
                            public final void close() {
                                super.close();
                                if (this.e) {
                                    return;
                                }
                                this.e = true;
                                DiskLruCache diskLruCache2 = diskLruCache;
                                DiskLruCache.Entry entry = this;
                                synchronized (diskLruCache2) {
                                    int i2 = entry.h - 1;
                                    entry.h = i2;
                                    if (i2 == 0 && entry.f) {
                                        diskLruCache2.k(entry);
                                    }
                                }
                            }
                        };
                    }
                    arrayList.add(sourceV);
                } catch (FileNotFoundException unused) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        _UtilCommonKt.b((Source) it.next());
                    }
                    try {
                        diskLruCache.k(this);
                        return null;
                    } catch (IOException unused2) {
                        return null;
                    }
                }
            }
            return new Snapshot(this.j, this.f26705a, this.i, arrayList, jArr);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public final class Snapshot implements Closeable {
        public final String d;
        public final long e;
        public final ArrayList f;
        public final /* synthetic */ DiskLruCache g;

        public Snapshot(DiskLruCache diskLruCache, String key, long j, ArrayList arrayList, long[] lengths) {
            Intrinsics.h(key, "key");
            Intrinsics.h(lengths, "lengths");
            this.g = diskLruCache;
            this.d = key;
            this.e = j;
            this.f = arrayList;
        }

        public final Editor a() {
            String str = this.d;
            return this.g.c(this.e, str);
        }

        public final Source b(int i) {
            return (Source) this.f.get(i);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                _UtilCommonKt.b((Source) it.next());
            }
        }
    }

    static {
        new Companion(0);
        w = "journal";
        x = "journal.tmp";
        y = "journal.bkp";
        z = "libcore.io.DiskLruCache";
        A = "1";
        B = -1L;
        C = new Regex("[a-z0-9_-]{1,120}");
        D = "CLEAN";
        E = "DIRTY";
        F = "REMOVE";
        G = "READ";
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(FileSystem fileSystem, Path path, TaskRunner taskRunner) {
        Intrinsics.h(fileSystem, "fileSystem");
        Intrinsics.h(taskRunner, "taskRunner");
        this.d = path;
        this.e = new DiskLruCache$fileSystem$1(fileSystem);
        this.f = 10485760L;
        this.l = new LinkedHashMap(0, 0.75f, true);
        this.u = taskRunner.d();
        final String strO = a.o(new StringBuilder(), _UtilJvmKt.b, " Cache");
        this.v = new Task(strO) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() {
                DiskLruCache diskLruCache = this.e;
                synchronized (diskLruCache) {
                    if (!diskLruCache.p || diskLruCache.q) {
                        return -1L;
                    }
                    try {
                        diskLruCache.l();
                    } catch (IOException unused) {
                        diskLruCache.r = true;
                    }
                    try {
                        if (diskLruCache.f()) {
                            diskLruCache.j();
                            diskLruCache.m = 0;
                        }
                    } catch (IOException unused2) {
                        diskLruCache.s = true;
                        RealBufferedSink realBufferedSink = diskLruCache.k;
                        if (realBufferedSink != null) {
                            _UtilCommonKt.b(realBufferedSink);
                        }
                        diskLruCache.k = Okio.b(Okio.a());
                    }
                    return -1L;
                }
            }
        };
        this.g = path.e(w);
        this.h = path.e(x);
        this.i = path.e(y);
    }

    public static void p(String str) {
        if (!C.f(str)) {
            throw new IllegalArgumentException(i.a('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    public final synchronized void a() {
        if (this.q) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void b(Editor editor, boolean z2) {
        Entry f26704a = editor.getF26704a();
        if (!Intrinsics.c(f26704a.g, editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z2 && !f26704a.e) {
            for (int i = 0; i < 2; i++) {
                boolean[] b = editor.getB();
                Intrinsics.e(b);
                if (!b[i]) {
                    editor.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.e.g((Path) f26704a.d.get(i))) {
                    editor.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            Path path = (Path) f26704a.d.get(i2);
            if (!z2 || f26704a.f) {
                _UtilCommonKt.d(this.e, path);
            } else if (this.e.g(path)) {
                Path path2 = (Path) f26704a.c.get(i2);
                this.e.b(path, path2);
                long j = f26704a.b[i2];
                Long l = this.e.j(path2).d;
                long jLongValue = l != null ? l.longValue() : 0L;
                f26704a.b[i2] = jLongValue;
                this.j = (this.j - j) + jLongValue;
            }
        }
        f26704a.g = null;
        if (f26704a.f) {
            k(f26704a);
            return;
        }
        this.m++;
        RealBufferedSink realBufferedSink = this.k;
        Intrinsics.e(realBufferedSink);
        if (f26704a.e || z2) {
            f26704a.e = true;
            realBufferedSink.r1(D);
            realBufferedSink.writeByte(32);
            realBufferedSink.r1(f26704a.f26705a);
            for (long j2 : f26704a.b) {
                realBufferedSink.writeByte(32);
                realBufferedSink.n0(j2);
            }
            realBufferedSink.writeByte(10);
            if (z2) {
                long j3 = this.t;
                this.t = 1 + j3;
                f26704a.i = j3;
            }
        } else {
            this.l.remove(f26704a.f26705a);
            realBufferedSink.r1(F);
            realBufferedSink.writeByte(32);
            realBufferedSink.r1(f26704a.f26705a);
            realBufferedSink.writeByte(10);
        }
        realBufferedSink.flush();
        if (this.j > this.f || f()) {
            this.u.c(this.v, 0L);
        }
    }

    public final synchronized Editor c(long j, String key) {
        Intrinsics.h(key, "key");
        e();
        a();
        p(key);
        Entry entry = (Entry) this.l.get(key);
        if (j != B && (entry == null || entry.i != j)) {
            return null;
        }
        if ((entry != null ? entry.g : null) != null) {
            return null;
        }
        if (entry != null && entry.h != 0) {
            return null;
        }
        if (!this.r && !this.s) {
            RealBufferedSink realBufferedSink = this.k;
            Intrinsics.e(realBufferedSink);
            realBufferedSink.r1(E);
            realBufferedSink.writeByte(32);
            realBufferedSink.r1(key);
            realBufferedSink.writeByte(10);
            realBufferedSink.flush();
            if (this.n) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(this, key);
                this.l.put(key, entry);
            }
            Editor editor = new Editor(entry);
            entry.g = editor;
            return editor;
        }
        this.u.c(this.v, 0L);
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.p && !this.q) {
                Collection collectionValues = this.l.values();
                Intrinsics.g(collectionValues, "<get-values>(...)");
                for (Entry entry : (Entry[]) collectionValues.toArray(new Entry[0])) {
                    Intrinsics.e(entry);
                    Editor editor = entry.g;
                    if (editor != null) {
                        editor.c();
                    }
                }
                l();
                RealBufferedSink realBufferedSink = this.k;
                if (realBufferedSink != null) {
                    _UtilCommonKt.b(realBufferedSink);
                }
                this.k = null;
                this.q = true;
                return;
            }
            this.q = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Snapshot d(String key) {
        Intrinsics.h(key, "key");
        e();
        a();
        p(key);
        Entry entry = (Entry) this.l.get(key);
        if (entry == null) {
            return null;
        }
        Snapshot snapshotA = entry.a();
        if (snapshotA == null) {
            return null;
        }
        this.m++;
        RealBufferedSink realBufferedSink = this.k;
        Intrinsics.e(realBufferedSink);
        realBufferedSink.r1(G);
        realBufferedSink.writeByte(32);
        realBufferedSink.r1(key);
        realBufferedSink.writeByte(10);
        if (f()) {
            this.u.c(this.v, 0L);
        }
        return snapshotA;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006c A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #4 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:12:0x001f, B:15:0x002a, B:16:0x0033, B:37:0x0070, B:39:0x007c, B:49:0x00c2, B:43:0x0087, B:45:0x00bb, B:47:0x00bf, B:48:0x00c1, B:36:0x006c, B:52:0x00c9, B:27:0x005b, B:24:0x0056, B:44:0x00b1, B:18:0x0049), top: B:62:0x0003, inners: #3, #5, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #4 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:12:0x001f, B:15:0x002a, B:16:0x0033, B:37:0x0070, B:39:0x007c, B:49:0x00c2, B:43:0x0087, B:45:0x00bb, B:47:0x00bf, B:48:0x00c1, B:36:0x006c, B:52:0x00c9, B:27:0x005b, B:24:0x0056, B:44:0x00b1, B:18:0x0049), top: B:62:0x0003, inners: #3, #5, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void e() {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.e():void");
    }

    public final boolean f() {
        int i = this.m;
        return i >= 2000 && i >= this.l.size();
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.p) {
            a();
            l();
            RealBufferedSink realBufferedSink = this.k;
            Intrinsics.e(realBufferedSink);
            realBufferedSink.flush();
        }
    }

    public final void g() {
        Path path = this.h;
        DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = this.e;
        _UtilCommonKt.d(diskLruCache$fileSystem$1, path);
        Iterator it = this.l.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.g(next, "next(...)");
            Entry entry = (Entry) next;
            int i = 0;
            if (entry.g == null) {
                while (i < 2) {
                    this.j += entry.b[i];
                    i++;
                }
            } else {
                entry.g = null;
                while (i < 2) {
                    _UtilCommonKt.d(diskLruCache$fileSystem$1, (Path) entry.c.get(i));
                    _UtilCommonKt.d(diskLruCache$fileSystem$1, (Path) entry.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            okhttp3.internal.cache.DiskLruCache$fileSystem$1 r2 = r13.e
            okio.Path r3 = r13.g
            okio.Source r4 = r2.v(r3)
            okio.RealBufferedSource r4 = okio.Okio.c(r4)
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r7 = r4.n1(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r8 = r4.n1(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r9 = r4.n1(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r10 = r4.n1(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r11 = r4.n1(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r12 = okhttp3.internal.cache.DiskLruCache.z     // Catch: java.lang.Throwable -> L62
            boolean r12 = kotlin.jvm.internal.Intrinsics.c(r12, r7)     // Catch: java.lang.Throwable -> L62
            if (r12 == 0) goto La3
            java.lang.String r12 = okhttp3.internal.cache.DiskLruCache.A     // Catch: java.lang.Throwable -> L62
            boolean r12 = kotlin.jvm.internal.Intrinsics.c(r12, r8)     // Catch: java.lang.Throwable -> L62
            if (r12 == 0) goto La3
            r12 = 201105(0x31191, float:2.81808E-40)
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L62
            boolean r9 = kotlin.jvm.internal.Intrinsics.c(r12, r9)     // Catch: java.lang.Throwable -> L62
            if (r9 == 0) goto La3
            r9 = 2
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L62
            boolean r9 = kotlin.jvm.internal.Intrinsics.c(r9, r10)     // Catch: java.lang.Throwable -> L62
            if (r9 == 0) goto La3
            int r9 = r11.length()     // Catch: java.lang.Throwable -> L62
            if (r9 > 0) goto La3
            r0 = 0
        L58:
            java.lang.String r1 = r4.n1(r5)     // Catch: java.lang.Throwable -> L62 java.io.EOFException -> L64
            r13.i(r1)     // Catch: java.lang.Throwable -> L62 java.io.EOFException -> L64
            int r0 = r0 + 1
            goto L58
        L62:
            r0 = move-exception
            goto Lcc
        L64:
            java.util.LinkedHashMap r1 = r13.l     // Catch: java.lang.Throwable -> L62
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L62
            int r0 = r0 - r1
            r13.m = r0     // Catch: java.lang.Throwable -> L62
            boolean r0 = r4.X1()     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L77
            r13.j()     // Catch: java.lang.Throwable -> L62
            goto L9c
        L77:
            okio.RealBufferedSink r0 = r13.k     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L7e
            okhttp3.internal._UtilCommonKt.b(r0)     // Catch: java.lang.Throwable -> L62
        L7e:
            r2.getClass()     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.h(r3, r0)     // Catch: java.lang.Throwable -> L62
            okio.Sink r0 = r2.a(r3)     // Catch: java.lang.Throwable -> L62
            okhttp3.internal.cache.FaultHidingSink r1 = new okhttp3.internal.cache.FaultHidingSink     // Catch: java.lang.Throwable -> L62
            au.com.woolworths.feature.shared.instore.wifi.ui.d r2 = new au.com.woolworths.feature.shared.instore.wifi.ui.d     // Catch: java.lang.Throwable -> L62
            r3 = 9
            r2.<init>(r13, r3)     // Catch: java.lang.Throwable -> L62
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L62
            okio.RealBufferedSink r0 = okio.Okio.b(r1)     // Catch: java.lang.Throwable -> L62
            r13.k = r0     // Catch: java.lang.Throwable -> L62
        L9c:
            r4.close()     // Catch: java.lang.Throwable -> La1
            r0 = 0
            goto Ld4
        La1:
            r0 = move-exception
            goto Ld4
        La3:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L62
            r3.append(r7)     // Catch: java.lang.Throwable -> L62
            r3.append(r0)     // Catch: java.lang.Throwable -> L62
            r3.append(r8)     // Catch: java.lang.Throwable -> L62
            r3.append(r0)     // Catch: java.lang.Throwable -> L62
            r3.append(r10)     // Catch: java.lang.Throwable -> L62
            r3.append(r0)     // Catch: java.lang.Throwable -> L62
            r3.append(r11)     // Catch: java.lang.Throwable -> L62
            r0 = 93
            r3.append(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L62
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L62
            throw r2     // Catch: java.lang.Throwable -> L62
        Lcc:
            r4.close()     // Catch: java.lang.Throwable -> Ld0
            goto Ld4
        Ld0:
            r1 = move-exception
            kotlin.ExceptionsKt.a(r0, r1)
        Ld4:
            if (r0 != 0) goto Ld7
            return
        Ld7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.h():void");
    }

    public final void i(String str) throws IOException {
        String strSubstring;
        int iB = StringsKt.B(str, ' ', 0, 6);
        if (iB == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iB + 1;
        int iB2 = StringsKt.B(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.l;
        if (iB2 == -1) {
            strSubstring = str.substring(i);
            Intrinsics.g(strSubstring, "substring(...)");
            String str2 = F;
            if (iB == str2.length() && StringsKt.W(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iB2);
            Intrinsics.g(strSubstring, "substring(...)");
        }
        Entry entry = (Entry) linkedHashMap.get(strSubstring);
        if (entry == null) {
            entry = new Entry(this, strSubstring);
            linkedHashMap.put(strSubstring, entry);
        }
        if (iB2 != -1) {
            String str3 = D;
            if (iB == str3.length() && StringsKt.W(str, str3, false)) {
                String strSubstring2 = str.substring(iB2 + 1);
                Intrinsics.g(strSubstring2, "substring(...)");
                List listU = StringsKt.U(strSubstring2, new char[]{' '});
                entry.e = true;
                entry.g = null;
                int size = listU.size();
                entry.j.getClass();
                if (size != 2) {
                    throw new IOException("unexpected journal line: " + listU);
                }
                try {
                    int size2 = listU.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        entry.b[i2] = Long.parseLong((String) listU.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + listU);
                }
            }
        }
        if (iB2 == -1) {
            String str4 = E;
            if (iB == str4.length() && StringsKt.W(str, str4, false)) {
                entry.g = new Editor(entry);
                return;
            }
        }
        if (iB2 == -1) {
            String str5 = G;
            if (iB == str5.length() && StringsKt.W(str, str5, false)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void j() {
        Throwable th;
        try {
            RealBufferedSink realBufferedSink = this.k;
            if (realBufferedSink != null) {
                realBufferedSink.close();
            }
            RealBufferedSink realBufferedSinkB = Okio.b(this.e.r(this.h, false));
            try {
                realBufferedSinkB.r1(z);
                realBufferedSinkB.writeByte(10);
                realBufferedSinkB.r1(A);
                realBufferedSinkB.writeByte(10);
                realBufferedSinkB.n0(201105);
                realBufferedSinkB.writeByte(10);
                realBufferedSinkB.n0(2);
                realBufferedSinkB.writeByte(10);
                realBufferedSinkB.writeByte(10);
                for (Object obj : this.l.values()) {
                    Intrinsics.g(obj, "next(...)");
                    Entry entry = (Entry) obj;
                    if (entry.g != null) {
                        realBufferedSinkB.r1(E);
                        realBufferedSinkB.writeByte(32);
                        realBufferedSinkB.r1(entry.f26705a);
                        realBufferedSinkB.writeByte(10);
                    } else {
                        realBufferedSinkB.r1(D);
                        realBufferedSinkB.writeByte(32);
                        realBufferedSinkB.r1(entry.f26705a);
                        for (long j : entry.b) {
                            realBufferedSinkB.writeByte(32);
                            realBufferedSinkB.n0(j);
                        }
                        realBufferedSinkB.writeByte(10);
                    }
                }
                try {
                    realBufferedSinkB.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    realBufferedSinkB.close();
                } catch (Throwable th4) {
                    ExceptionsKt.a(th3, th4);
                }
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            if (this.e.g(this.g)) {
                this.e.b(this.g, this.i);
                this.e.b(this.h, this.g);
                _UtilCommonKt.d(this.e, this.i);
            } else {
                this.e.b(this.h, this.g);
            }
            RealBufferedSink realBufferedSink2 = this.k;
            if (realBufferedSink2 != null) {
                _UtilCommonKt.b(realBufferedSink2);
            }
            DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = this.e;
            Path file = this.g;
            diskLruCache$fileSystem$1.getClass();
            Intrinsics.h(file, "file");
            this.k = Okio.b(new FaultHidingSink(diskLruCache$fileSystem$1.a(file), new au.com.woolworths.feature.shared.instore.wifi.ui.d(this, 9)));
            this.n = false;
            this.s = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final void k(Entry entry) {
        RealBufferedSink realBufferedSink;
        String str = entry.f26705a;
        if (!this.o) {
            if (entry.h > 0 && (realBufferedSink = this.k) != null) {
                realBufferedSink.r1(E);
                realBufferedSink.writeByte(32);
                realBufferedSink.r1(str);
                realBufferedSink.writeByte(10);
                realBufferedSink.flush();
            }
            if (entry.h > 0 || entry.g != null) {
                entry.f = true;
                return;
            }
        }
        Editor editor = entry.g;
        if (editor != null) {
            editor.c();
        }
        for (int i = 0; i < 2; i++) {
            _UtilCommonKt.d(this.e, (Path) entry.c.get(i));
            long j = this.j;
            long[] jArr = entry.b;
            this.j = j - jArr[i];
            jArr[i] = 0;
        }
        this.m++;
        RealBufferedSink realBufferedSink2 = this.k;
        if (realBufferedSink2 != null) {
            realBufferedSink2.r1(F);
            realBufferedSink2.writeByte(32);
            realBufferedSink2.r1(str);
            realBufferedSink2.writeByte(10);
        }
        this.l.remove(str);
        if (f()) {
            this.u.c(this.v, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        k(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            r4 = this;
        L0:
            long r0 = r4.j
            long r2 = r4.f
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L2c
            java.util.LinkedHashMap r0 = r4.l
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            java.lang.String r2 = "next(...)"
            kotlin.jvm.internal.Intrinsics.g(r1, r2)
            okhttp3.internal.cache.DiskLruCache$Entry r1 = (okhttp3.internal.cache.DiskLruCache.Entry) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.k(r1)
            goto L0
        L2b:
            return
        L2c:
            r0 = 0
            r4.r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.l():void");
    }
}
