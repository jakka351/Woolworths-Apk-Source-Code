package coil.disk;

import androidx.compose.ui.platform.i;
import coil.util.FileSystems;
import coil.util.Utils;
import io.jsonwebtoken.JwtParser;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSink;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcoil/disk/DiskLruCache;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Ljava/io/Flushable;", "Companion", "Editor", "Entry", "Snapshot", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class DiskLruCache implements Closeable, Flushable {
    public static final Regex t = new Regex("[a-z0-9_-]{1,120}");
    public final Path d;
    public final long e;
    public final Path f;
    public final Path g;
    public final Path h;
    public final LinkedHashMap i;
    public final ContextScope j;
    public long k;
    public int l;
    public RealBufferedSink m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final DiskLruCache$fileSystem$1 s;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcoil/disk/DiskLruCache$Companion;", "", "", "CLEAN", "Ljava/lang/String;", "DIRTY", "Lkotlin/text/Regex;", "LEGAL_KEY_PATTERN", "Lkotlin/text/Regex;", "READ", "REMOVE", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/disk/DiskLruCache$Editor;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public final class Editor {

        /* renamed from: a, reason: collision with root package name */
        public final Entry f12981a;
        public boolean b;
        public final boolean[] c = new boolean[2];

        public Editor(Entry entry) {
            this.f12981a = entry;
        }

        public final void a(boolean z) {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                try {
                    if (this.b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (Intrinsics.c(this.f12981a.g, this)) {
                        DiskLruCache.a(diskLruCache, this, z);
                    }
                    this.b = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final Path b(int i) {
            Path path;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (this.b) {
                    throw new IllegalStateException("editor is closed");
                }
                this.c[i] = true;
                Object obj = this.f12981a.d.get(i);
                DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = diskLruCache.s;
                Path path2 = (Path) obj;
                if (!diskLruCache$fileSystem$1.g(path2)) {
                    Utils.a(diskLruCache$fileSystem$1.r(path2, false));
                }
                path = (Path) obj;
            }
            return path;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/disk/DiskLruCache$Entry;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public final class Entry {

        /* renamed from: a, reason: collision with root package name */
        public final String f12982a;
        public final long[] b = new long[2];
        public final ArrayList c = new ArrayList(2);
        public final ArrayList d = new ArrayList(2);
        public boolean e;
        public boolean f;
        public Editor g;
        public int h;

        public Entry(String str) {
            this.f12982a = str;
            StringBuilder sb = new StringBuilder(str);
            sb.append(JwtParser.SEPARATOR_CHAR);
            int length = sb.length();
            for (int i = 0; i < 2; i++) {
                sb.append(i);
                this.c.add(DiskLruCache.this.d.e(sb.toString()));
                sb.append(".tmp");
                this.d.add(DiskLruCache.this.d.e(sb.toString()));
                sb.setLength(length);
            }
        }

        public final Snapshot a() {
            if (!this.e || this.g != null || this.f) {
                return null;
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                DiskLruCache diskLruCache = DiskLruCache.this;
                if (i >= size) {
                    this.h++;
                    return diskLruCache.new Snapshot(this);
                }
                if (!diskLruCache.s.g((Path) arrayList.get(i))) {
                    try {
                        diskLruCache.i(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
                i++;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcoil/disk/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "Lokio/Closeable;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public final class Snapshot implements Closeable {
        public final Entry d;
        public boolean e;

        public Snapshot(Entry entry) {
            this.d = entry;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.e) {
                return;
            }
            this.e = true;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                Entry entry = this.d;
                int i = entry.h - 1;
                entry.h = i;
                if (i == 0 && entry.f) {
                    Regex regex = DiskLruCache.t;
                    diskLruCache.i(entry);
                }
            }
        }
    }

    public DiskLruCache(long j, CoroutineDispatcher coroutineDispatcher, FileSystem fileSystem, Path path) {
        this.d = path;
        this.e = j;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f = path.e("journal");
        this.g = path.e("journal.tmp");
        this.h = path.e("journal.bkp");
        this.i = new LinkedHashMap(0, 0.75f, true);
        this.j = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) SupervisorKt.b(), coroutineDispatcher.A(1)));
        this.s = new DiskLruCache$fileSystem$1(fileSystem);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0115 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000f, B:11:0x0016, B:13:0x001c, B:15:0x002c, B:23:0x003a, B:25:0x0052, B:29:0x006f, B:31:0x007d, B:33:0x0084, B:26:0x0058, B:28:0x0068, B:37:0x00a4, B:39:0x00ab, B:42:0x00b0, B:44:0x00c1, B:47:0x00c6, B:52:0x0101, B:54:0x010c, B:58:0x0115, B:48:0x00de, B:50:0x00f3, B:51:0x00fe, B:36:0x0094, B:61:0x011a, B:62:0x0121), top: B:65:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(coil.disk.DiskLruCache r9, coil.disk.DiskLruCache.Editor r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.disk.DiskLruCache.a(coil.disk.DiskLruCache, coil.disk.DiskLruCache$Editor, boolean):void");
    }

    public static void k(String str) {
        if (!t.f(str)) {
            throw new IllegalArgumentException(i.a('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    public final synchronized Editor b(String str) {
        if (this.p) {
            throw new IllegalStateException("cache is closed");
        }
        k(str);
        d();
        Entry entry = (Entry) this.i.get(str);
        if ((entry != null ? entry.g : null) != null) {
            return null;
        }
        if (entry != null && entry.h != 0) {
            return null;
        }
        if (!this.q && !this.r) {
            RealBufferedSink realBufferedSink = this.m;
            Intrinsics.e(realBufferedSink);
            realBufferedSink.r1("DIRTY");
            realBufferedSink.writeByte(32);
            realBufferedSink.r1(str);
            realBufferedSink.writeByte(10);
            realBufferedSink.flush();
            if (this.n) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(str);
                this.i.put(str, entry);
            }
            Editor editor = new Editor(entry);
            entry.g = editor;
            return editor;
        }
        e();
        return null;
    }

    public final synchronized Snapshot c(String str) {
        Snapshot snapshotA;
        if (this.p) {
            throw new IllegalStateException("cache is closed");
        }
        k(str);
        d();
        Entry entry = (Entry) this.i.get(str);
        if (entry != null && (snapshotA = entry.a()) != null) {
            boolean z = true;
            this.l++;
            RealBufferedSink realBufferedSink = this.m;
            Intrinsics.e(realBufferedSink);
            realBufferedSink.r1("READ");
            realBufferedSink.writeByte(32);
            realBufferedSink.r1(str);
            realBufferedSink.writeByte(10);
            if (this.l < 2000) {
                z = false;
            }
            if (z) {
                e();
            }
            return snapshotA;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.o && !this.p) {
                for (Entry entry : (Entry[]) this.i.values().toArray(new Entry[0])) {
                    Editor editor = entry.g;
                    if (editor != null) {
                        Entry entry2 = editor.f12981a;
                        if (Intrinsics.c(entry2.g, editor)) {
                            entry2.f = true;
                        }
                    }
                }
                j();
                CoroutineScopeKt.b(this.j, null);
                RealBufferedSink realBufferedSink = this.m;
                Intrinsics.e(realBufferedSink);
                realBufferedSink.close();
                this.m = null;
                this.p = true;
                return;
            }
            this.p = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        try {
            if (this.o) {
                return;
            }
            this.s.f(this.g);
            if (this.s.g(this.h)) {
                if (this.s.g(this.f)) {
                    this.s.f(this.h);
                } else {
                    this.s.b(this.h, this.f);
                }
            }
            if (this.s.g(this.f)) {
                try {
                    g();
                    f();
                    this.o = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        FileSystems.a(this.s, this.d);
                        this.p = false;
                    } catch (Throwable th) {
                        this.p = false;
                        throw th;
                    }
                }
            }
            l();
            this.o = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void e() {
        BuildersKt.c(this.j, null, null, new DiskLruCache$launchCleanup$1(this, null), 3);
    }

    public final void f() {
        Iterator it = this.i.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            int i = 0;
            if (entry.g == null) {
                while (i < 2) {
                    j += entry.b[i];
                    i++;
                }
            } else {
                entry.g = null;
                while (i < 2) {
                    Path path = (Path) entry.c.get(i);
                    DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = this.s;
                    diskLruCache$fileSystem$1.f(path);
                    diskLruCache$fileSystem$1.f((Path) entry.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.k = j;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.o) {
            if (this.p) {
                throw new IllegalStateException("cache is closed");
            }
            j();
            RealBufferedSink realBufferedSink = this.m;
            Intrinsics.e(realBufferedSink);
            realBufferedSink.flush();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() throws java.lang.Throwable {
        /*
            r15 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            coil.disk.DiskLruCache$fileSystem$1 r2 = r15.s
            okio.Path r3 = r15.f
            okio.Source r4 = r2.v(r3)
            okio.RealBufferedSource r4 = okio.Okio.c(r4)
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 0
            java.lang.String r8 = r4.n1(r5)     // Catch: java.lang.Throwable -> L61
            java.lang.String r9 = r4.n1(r5)     // Catch: java.lang.Throwable -> L61
            java.lang.String r10 = r4.n1(r5)     // Catch: java.lang.Throwable -> L61
            java.lang.String r11 = r4.n1(r5)     // Catch: java.lang.Throwable -> L61
            java.lang.String r12 = r4.n1(r5)     // Catch: java.lang.Throwable -> L61
            java.lang.String r13 = "libcore.io.DiskLruCache"
            boolean r13 = r13.equals(r8)     // Catch: java.lang.Throwable -> L61
            if (r13 == 0) goto L9a
            java.lang.String r13 = "1"
            boolean r13 = r13.equals(r9)     // Catch: java.lang.Throwable -> L61
            if (r13 == 0) goto L9a
            r13 = 1
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch: java.lang.Throwable -> L61
            boolean r13 = kotlin.jvm.internal.Intrinsics.c(r13, r10)     // Catch: java.lang.Throwable -> L61
            if (r13 == 0) goto L9a
            r13 = 2
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch: java.lang.Throwable -> L61
            boolean r13 = kotlin.jvm.internal.Intrinsics.c(r13, r11)     // Catch: java.lang.Throwable -> L61
            if (r13 == 0) goto L9a
            int r13 = r12.length()     // Catch: java.lang.Throwable -> L61
            if (r13 > 0) goto L9a
            r0 = 0
        L57:
            java.lang.String r1 = r4.n1(r5)     // Catch: java.lang.Throwable -> L61 java.io.EOFException -> L63
            r15.h(r1)     // Catch: java.lang.Throwable -> L61 java.io.EOFException -> L63
            int r0 = r0 + 1
            goto L57
        L61:
            r0 = move-exception
            goto Lc9
        L63:
            java.util.LinkedHashMap r1 = r15.i     // Catch: java.lang.Throwable -> L61
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L61
            int r0 = r0 - r1
            r15.l = r0     // Catch: java.lang.Throwable -> L61
            boolean r0 = r4.X1()     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L76
            r15.l()     // Catch: java.lang.Throwable -> L61
            goto L92
        L76:
            r2.getClass()     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.h(r3, r0)     // Catch: java.lang.Throwable -> L61
            okio.Sink r0 = r2.a(r3)     // Catch: java.lang.Throwable -> L61
            coil.disk.FaultHidingSink r1 = new coil.disk.FaultHidingSink     // Catch: java.lang.Throwable -> L61
            coil.disk.DiskLruCache$newJournalWriter$faultHidingSink$1 r2 = new coil.disk.DiskLruCache$newJournalWriter$faultHidingSink$1     // Catch: java.lang.Throwable -> L61
            r2.<init>(r15)     // Catch: java.lang.Throwable -> L61
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L61
            okio.RealBufferedSink r0 = okio.Okio.b(r1)     // Catch: java.lang.Throwable -> L61
            r15.m = r0     // Catch: java.lang.Throwable -> L61
        L92:
            kotlin.Unit r0 = kotlin.Unit.f24250a     // Catch: java.lang.Throwable -> L61
            r4.close()     // Catch: java.lang.Throwable -> L98
            goto Ld4
        L98:
            r7 = move-exception
            goto Ld4
        L9a:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L61
            r3.append(r8)     // Catch: java.lang.Throwable -> L61
            r3.append(r0)     // Catch: java.lang.Throwable -> L61
            r3.append(r9)     // Catch: java.lang.Throwable -> L61
            r3.append(r0)     // Catch: java.lang.Throwable -> L61
            r3.append(r10)     // Catch: java.lang.Throwable -> L61
            r3.append(r0)     // Catch: java.lang.Throwable -> L61
            r3.append(r11)     // Catch: java.lang.Throwable -> L61
            r3.append(r0)     // Catch: java.lang.Throwable -> L61
            r3.append(r12)     // Catch: java.lang.Throwable -> L61
            r0 = 93
            r3.append(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L61
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L61
            throw r2     // Catch: java.lang.Throwable -> L61
        Lc9:
            r4.close()     // Catch: java.lang.Throwable -> Lcd
            goto Ld1
        Lcd:
            r1 = move-exception
            kotlin.ExceptionsKt.a(r0, r1)
        Ld1:
            r14 = r7
            r7 = r0
            r0 = r14
        Ld4:
            if (r7 != 0) goto Lda
            kotlin.jvm.internal.Intrinsics.e(r0)
            return
        Lda:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.disk.DiskLruCache.g():void");
    }

    public final void h(String str) throws IOException {
        String strSubstring;
        int iB = StringsKt.B(str, ' ', 0, 6);
        if (iB == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iB + 1;
        int iB2 = StringsKt.B(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.i;
        if (iB2 == -1) {
            strSubstring = str.substring(i);
            Intrinsics.g(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (iB == 6 && StringsKt.W(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iB2);
            Intrinsics.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        Object entry = linkedHashMap.get(strSubstring);
        if (entry == null) {
            entry = new Entry(strSubstring);
            linkedHashMap.put(strSubstring, entry);
        }
        Entry entry2 = (Entry) entry;
        if (iB2 == -1 || iB != 5 || !StringsKt.W(str, "CLEAN", false)) {
            if (iB2 == -1 && iB == 5 && StringsKt.W(str, "DIRTY", false)) {
                entry2.g = new Editor(entry2);
                return;
            } else {
                if (iB2 != -1 || iB != 4 || !StringsKt.W(str, "READ", false)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String strSubstring2 = str.substring(iB2 + 1);
        Intrinsics.g(strSubstring2, "this as java.lang.String).substring(startIndex)");
        List listU = StringsKt.U(strSubstring2, new char[]{' '});
        entry2.e = true;
        entry2.g = null;
        if (listU.size() != 2) {
            throw new IOException("unexpected journal line: " + listU);
        }
        try {
            int size = listU.size();
            for (int i2 = 0; i2 < size; i2++) {
                entry2.b[i2] = Long.parseLong((String) listU.get(i2));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listU);
        }
    }

    public final void i(Entry entry) {
        RealBufferedSink realBufferedSink;
        int i = entry.h;
        String str = entry.f12982a;
        if (i > 0 && (realBufferedSink = this.m) != null) {
            realBufferedSink.r1("DIRTY");
            realBufferedSink.writeByte(32);
            realBufferedSink.r1(str);
            realBufferedSink.writeByte(10);
            realBufferedSink.flush();
        }
        if (entry.h > 0 || entry.g != null) {
            entry.f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.s.f((Path) entry.c.get(i2));
            long j = this.k;
            long[] jArr = entry.b;
            this.k = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.l++;
        RealBufferedSink realBufferedSink2 = this.m;
        if (realBufferedSink2 != null) {
            realBufferedSink2.r1("REMOVE");
            realBufferedSink2.writeByte(32);
            realBufferedSink2.r1(str);
            realBufferedSink2.writeByte(10);
        }
        this.i.remove(str);
        if (this.l >= 2000) {
            e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        i(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r4 = this;
        L0:
            long r0 = r4.k
            long r2 = r4.e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.i
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            coil.disk.DiskLruCache$Entry r1 = (coil.disk.DiskLruCache.Entry) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.i(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.disk.DiskLruCache.j():void");
    }

    public final synchronized void l() {
        Unit unit;
        try {
            RealBufferedSink realBufferedSink = this.m;
            if (realBufferedSink != null) {
                realBufferedSink.close();
            }
            RealBufferedSink realBufferedSinkB = Okio.b(this.s.r(this.g, false));
            Throwable th = null;
            try {
                realBufferedSinkB.r1("libcore.io.DiskLruCache");
                realBufferedSinkB.writeByte(10);
                realBufferedSinkB.r1("1");
                realBufferedSinkB.writeByte(10);
                realBufferedSinkB.n0(1);
                realBufferedSinkB.writeByte(10);
                realBufferedSinkB.n0(2);
                realBufferedSinkB.writeByte(10);
                realBufferedSinkB.writeByte(10);
                for (Entry entry : this.i.values()) {
                    if (entry.g != null) {
                        realBufferedSinkB.r1("DIRTY");
                        realBufferedSinkB.writeByte(32);
                        realBufferedSinkB.r1(entry.f12982a);
                        realBufferedSinkB.writeByte(10);
                    } else {
                        realBufferedSinkB.r1("CLEAN");
                        realBufferedSinkB.writeByte(32);
                        realBufferedSinkB.r1(entry.f12982a);
                        for (long j : entry.b) {
                            realBufferedSinkB.writeByte(32);
                            realBufferedSinkB.n0(j);
                        }
                        realBufferedSinkB.writeByte(10);
                    }
                }
                unit = Unit.f24250a;
                try {
                    realBufferedSinkB.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    realBufferedSinkB.close();
                } catch (Throwable th4) {
                    ExceptionsKt.a(th3, th4);
                }
                unit = null;
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            Intrinsics.e(unit);
            if (this.s.g(this.f)) {
                this.s.b(this.f, this.h);
                this.s.b(this.g, this.f);
                this.s.f(this.h);
            } else {
                this.s.b(this.g, this.f);
            }
            DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = this.s;
            Path file = this.f;
            diskLruCache$fileSystem$1.getClass();
            Intrinsics.h(file, "file");
            this.m = Okio.b(new FaultHidingSink(diskLruCache$fileSystem$1.a(file), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
            this.l = 0;
            this.n = false;
            this.r = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }
}
