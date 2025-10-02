package coil3.disk;

import androidx.compose.ui.platform.i;
import au.com.woolworths.feature.shared.instore.wifi.ui.d;
import coil3.util.FileSystemsKt;
import io.jsonwebtoken.JwtParser;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSink;
import okio.RealBufferedSource;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcoil3/disk/DiskLruCache;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Snapshot", "Editor", "Entry", "Companion", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DiskLruCache implements AutoCloseable {
    public static final Regex u = new Regex("[a-z0-9_-]{1,120}");
    public final Path d;
    public final long e;
    public final Path f;
    public final Path g;
    public final Path h;
    public final LinkedHashMap i;
    public final ContextScope j;
    public final Object k;
    public long l;
    public int m;
    public RealBufferedSink n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final DiskLruCache$fileSystem$1 t;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcoil3/disk/DiskLruCache$Companion;", "", "", "CLEAN", "Ljava/lang/String;", "DIRTY", "REMOVE", "READ", "Lkotlin/text/Regex;", "LEGAL_KEY_PATTERN", "Lkotlin/text/Regex;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/disk/DiskLruCache$Editor;", "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public final class Editor {

        /* renamed from: a, reason: collision with root package name */
        public final Entry f13085a;
        public boolean b;
        public final boolean[] c = new boolean[2];

        public Editor(Entry entry) {
            this.f13085a = entry;
        }

        public final void a(boolean z) {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache.k) {
                try {
                    if (this.b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (Intrinsics.c(this.f13085a.g, this)) {
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
            synchronized (diskLruCache.k) {
                if (this.b) {
                    throw new IllegalStateException("editor is closed");
                }
                this.c[i] = true;
                Object obj = this.f13085a.d.get(i);
                FileSystemsKt.a(diskLruCache.t, (Path) obj);
                path = (Path) obj;
            }
            return path;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/disk/DiskLruCache$Entry;", "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public final class Entry {

        /* renamed from: a, reason: collision with root package name */
        public final String f13086a;
        public final long[] b = new long[2];
        public final ArrayList c = new ArrayList(2);
        public final ArrayList d = new ArrayList(2);
        public boolean e;
        public boolean f;
        public Editor g;
        public int h;

        public Entry(String str) {
            this.f13086a = str;
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
                if (!diskLruCache.t.g((Path) arrayList.get(i))) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/disk/DiskLruCache$Snapshot;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public final class Snapshot implements AutoCloseable {
        public final Entry d;
        public boolean e;

        public Snapshot(Entry entry) {
            this.d = entry;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            if (this.e) {
                return;
            }
            this.e = true;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache.k) {
                Entry entry = this.d;
                int i = entry.h - 1;
                entry.h = i;
                if (i == 0 && entry.f) {
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
        Job jobB = SupervisorKt.b();
        CoroutineDispatcher.Key key = CoroutineDispatcher.e;
        this.j = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, coroutineDispatcher.A(1)));
        this.k = new Object();
        this.t = new DiskLruCache$fileSystem$1(fileSystem);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x010d A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0011, B:12:0x0018, B:14:0x001e, B:16:0x002e, B:24:0x003c, B:26:0x0054, B:28:0x0067, B:30:0x0075, B:32:0x007c, B:27:0x005a, B:36:0x009c, B:38:0x00a3, B:41:0x00a8, B:43:0x00b9, B:46:0x00be, B:51:0x00f9, B:53:0x0104, B:57:0x010d, B:47:0x00d6, B:49:0x00eb, B:50:0x00f6, B:35:0x008c, B:60:0x0112, B:61:0x0119), top: B:64:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(coil3.disk.DiskLruCache r10, coil3.disk.DiskLruCache.Editor r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.disk.DiskLruCache.a(coil3.disk.DiskLruCache, coil3.disk.DiskLruCache$Editor, boolean):void");
    }

    public static void k(String str) {
        if (!u.f(str)) {
            throw new IllegalArgumentException(i.a('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    public final Editor b(String str) {
        synchronized (this.k) {
            if (this.q) {
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
            if (!this.r && !this.s) {
                RealBufferedSink realBufferedSink = this.n;
                Intrinsics.e(realBufferedSink);
                realBufferedSink.r1("DIRTY");
                realBufferedSink.writeByte(32);
                realBufferedSink.r1(str);
                realBufferedSink.writeByte(10);
                realBufferedSink.flush();
                if (this.o) {
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
    }

    public final Snapshot c(String str) {
        Snapshot snapshotA;
        synchronized (this.k) {
            if (this.q) {
                throw new IllegalStateException("cache is closed");
            }
            k(str);
            d();
            Entry entry = (Entry) this.i.get(str);
            if (entry != null && (snapshotA = entry.a()) != null) {
                boolean z = true;
                this.m++;
                RealBufferedSink realBufferedSink = this.n;
                Intrinsics.e(realBufferedSink);
                realBufferedSink.r1("READ");
                realBufferedSink.writeByte(32);
                realBufferedSink.r1(str);
                realBufferedSink.writeByte(10);
                realBufferedSink.flush();
                if (this.m < 2000) {
                    z = false;
                }
                if (z) {
                    e();
                }
                return snapshotA;
            }
            return null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.k) {
            try {
                if (this.p && !this.q) {
                    for (Entry entry : (Entry[]) this.i.values().toArray(new Entry[0])) {
                        Editor editor = entry.g;
                        if (editor != null) {
                            Entry entry2 = editor.f13085a;
                            if (Intrinsics.c(entry2.g, editor)) {
                                entry2.f = true;
                            }
                        }
                    }
                    j();
                    CoroutineScopeKt.b(this.j, null);
                    RealBufferedSink realBufferedSink = this.n;
                    Intrinsics.e(realBufferedSink);
                    realBufferedSink.close();
                    this.n = null;
                    this.q = true;
                    return;
                }
                this.q = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.k) {
            try {
                if (this.p) {
                    return;
                }
                this.t.f(this.g);
                if (this.t.g(this.h)) {
                    if (this.t.g(this.f)) {
                        this.t.f(this.h);
                    } else {
                        this.t.b(this.h, this.f);
                    }
                }
                if (this.t.g(this.f)) {
                    try {
                        g();
                        f();
                        this.p = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            FileSystemsKt.b(this.t, this.d);
                            this.q = false;
                        } catch (Throwable th) {
                            this.q = false;
                            throw th;
                        }
                    }
                }
                l();
                this.p = true;
            } catch (Throwable th2) {
                throw th2;
            }
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
                    DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = this.t;
                    diskLruCache$fileSystem$1.f(path);
                    diskLruCache$fileSystem$1.f((Path) entry.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.l = j;
    }

    public final void g() throws Throwable {
        DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = this.t;
        Path file = this.f;
        RealBufferedSource realBufferedSourceC = Okio.c(diskLruCache$fileSystem$1.v(file));
        try {
            String strN1 = realBufferedSourceC.n1(Long.MAX_VALUE);
            String strN12 = realBufferedSourceC.n1(Long.MAX_VALUE);
            String strN13 = realBufferedSourceC.n1(Long.MAX_VALUE);
            String strN14 = realBufferedSourceC.n1(Long.MAX_VALUE);
            String strN15 = realBufferedSourceC.n1(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strN1) || !"1".equals(strN12) || !Intrinsics.c(String.valueOf(3), strN13) || !Intrinsics.c(String.valueOf(2), strN14) || strN15.length() > 0) {
                throw new IOException("unexpected journal header: [" + strN1 + ", " + strN12 + ", " + strN13 + ", " + strN14 + ", " + strN15 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    h(realBufferedSourceC.n1(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.m = i - this.i.size();
                    if (realBufferedSourceC.X1()) {
                        diskLruCache$fileSystem$1.getClass();
                        Intrinsics.h(file, "file");
                        this.n = Okio.b(new FaultHidingSink(diskLruCache$fileSystem$1.a(file), new d(this, 4)));
                    } else {
                        l();
                    }
                    try {
                        realBufferedSourceC.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (th != null) {
                        throw th;
                    }
                    return;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                realBufferedSourceC.close();
            } catch (Throwable th3) {
                ExceptionsKt.a(th, th3);
            }
        }
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
            Intrinsics.g(strSubstring, "substring(...)");
            if (iB == 6 && StringsKt.W(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iB2);
            Intrinsics.g(strSubstring, "substring(...)");
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
        Intrinsics.g(strSubstring2, "substring(...)");
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
        String str = entry.f13086a;
        if (i > 0 && (realBufferedSink = this.n) != null) {
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
            this.t.f((Path) entry.c.get(i2));
            long j = this.l;
            long[] jArr = entry.b;
            this.l = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.m++;
        RealBufferedSink realBufferedSink2 = this.n;
        if (realBufferedSink2 != null) {
            realBufferedSink2.r1("REMOVE");
            realBufferedSink2.writeByte(32);
            realBufferedSink2.r1(str);
            realBufferedSink2.writeByte(10);
            realBufferedSink2.flush();
        }
        this.i.remove(str);
        if (this.m >= 2000) {
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
            long r0 = r4.l
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
            coil3.disk.DiskLruCache$Entry r1 = (coil3.disk.DiskLruCache.Entry) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.i(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.disk.DiskLruCache.j():void");
    }

    public final void l() {
        Throwable th;
        synchronized (this.k) {
            try {
                RealBufferedSink realBufferedSink = this.n;
                if (realBufferedSink != null) {
                    realBufferedSink.close();
                }
                RealBufferedSink realBufferedSinkB = Okio.b(this.t.r(this.g, false));
                try {
                    realBufferedSinkB.r1("libcore.io.DiskLruCache");
                    realBufferedSinkB.writeByte(10);
                    realBufferedSinkB.r1("1");
                    realBufferedSinkB.writeByte(10);
                    realBufferedSinkB.n0(3);
                    realBufferedSinkB.writeByte(10);
                    realBufferedSinkB.n0(2);
                    realBufferedSinkB.writeByte(10);
                    realBufferedSinkB.writeByte(10);
                    for (Entry entry : this.i.values()) {
                        if (entry.g != null) {
                            realBufferedSinkB.r1("DIRTY");
                            realBufferedSinkB.writeByte(32);
                            realBufferedSinkB.r1(entry.f13086a);
                            realBufferedSinkB.writeByte(10);
                        } else {
                            realBufferedSinkB.r1("CLEAN");
                            realBufferedSinkB.writeByte(32);
                            realBufferedSinkB.r1(entry.f13086a);
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
                if (this.t.g(this.f)) {
                    this.t.b(this.f, this.h);
                    this.t.b(this.g, this.f);
                    this.t.f(this.h);
                } else {
                    this.t.b(this.g, this.f);
                }
                DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = this.t;
                Path file = this.f;
                diskLruCache$fileSystem$1.getClass();
                Intrinsics.h(file, "file");
                this.n = Okio.b(new FaultHidingSink(diskLruCache$fileSystem$1.a(file), new d(this, 4)));
                this.m = 0;
                this.o = false;
                this.s = false;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }
}
