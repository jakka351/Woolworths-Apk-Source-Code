package com.salesforce.marketingcloud.util;

import android.annotation.SuppressLint;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

@SuppressLint
/* loaded from: classes6.dex */
public final class f implements Closeable {
    private static final String A = "READ";
    static final String o = "journal";
    static final String p = "journal.tmp";
    static final String q = "journal.bkp";
    static final String r = "libcore.io.DiskLruCache";
    static final String s = "1";
    static final long t = -1;
    static final String u = "[a-z0-9_-]{1,120}";
    static final Pattern v = Pattern.compile(u);
    static final OutputStream w = new a();
    private static final String x = "CLEAN";
    private static final String y = "DIRTY";
    private static final String z = "REMOVE";
    final File b;
    final int c;
    private final File d;
    private final File e;
    private final File f;
    private final int g;
    Writer i;
    int j;
    private long k;
    private long l;
    private long m;

    /* renamed from: a, reason: collision with root package name */
    final ThreadPoolExecutor f17074a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final LinkedHashMap<String, d> h = new LinkedHashMap<>(0, 0.75f, true);
    private final Callable<Void> n = new b();

    public class a extends OutputStream {
        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }
    }

    public class b implements Callable<Void> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (f.this) {
                try {
                    f fVar = f.this;
                    if (fVar.i == null) {
                        return null;
                    }
                    fVar.l();
                    if (f.this.g()) {
                        f.this.j();
                        f.this.j = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final class c {

        /* renamed from: a, reason: collision with root package name */
        final d f17076a;
        final boolean[] b;
        boolean c;
        private boolean d;

        public class a extends FilterOutputStream {
            public a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) throws IOException {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) throws IOException {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }
        }

        public c(d dVar) {
            this.f17076a = dVar;
            this.b = dVar.c ? null : new boolean[f.this.c];
        }

        public void a() throws IOException {
            f.this.a(this, false);
        }

        public void b() {
            if (this.d) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void c() throws IOException {
            if (this.c) {
                f.this.a(this, false);
                f.this.d(this.f17076a.f17078a);
            } else {
                f.this.a(this, true);
            }
            this.d = true;
        }

        public String a(int i) throws IOException {
            InputStream inputStreamB = b(i);
            if (inputStreamB != null) {
                return f.a(inputStreamB);
            }
            return null;
        }

        public InputStream b(int i) throws IOException {
            synchronized (f.this) {
                d dVar = this.f17076a;
                if (dVar.d != this) {
                    throw new IllegalStateException();
                }
                if (!dVar.c) {
                    return null;
                }
                try {
                    return new FileInputStream(this.f17076a.a(i));
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
        }

        public OutputStream c(int i) throws IOException {
            FileOutputStream fileOutputStream;
            a aVar;
            if (i >= 0) {
                f fVar = f.this;
                if (i < fVar.c) {
                    synchronized (fVar) {
                        try {
                            d dVar = this.f17076a;
                            if (dVar.d != this) {
                                throw new IllegalStateException();
                            }
                            if (!dVar.c) {
                                this.b[i] = true;
                            }
                            File fileB = dVar.b(i);
                            try {
                                fileOutputStream = new FileOutputStream(fileB);
                            } catch (FileNotFoundException unused) {
                                f.this.b.mkdirs();
                                try {
                                    fileOutputStream = new FileOutputStream(fileB);
                                } catch (FileNotFoundException unused2) {
                                    return f.w;
                                }
                            }
                            aVar = new a(fileOutputStream);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return aVar;
                }
            }
            StringBuilder sbR = YU.a.r(i, "Expected index ", " to be greater than 0 and less than the maximum value count of ");
            sbR.append(f.this.c);
            throw new IllegalArgumentException(sbR.toString());
        }

        public void a(int i, String str) throws Throwable {
            OutputStreamWriter outputStreamWriter;
            OutputStreamWriter outputStreamWriter2 = null;
            try {
                outputStreamWriter = new OutputStreamWriter(c(i), g.c);
            } catch (Throwable th) {
                th = th;
            }
            try {
                outputStreamWriter.write(str);
                g.a(outputStreamWriter);
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter2 = outputStreamWriter;
                g.a(outputStreamWriter2);
                throw th;
            }
        }
    }

    public final class d {

        /* renamed from: a, reason: collision with root package name */
        final String f17078a;
        final long[] b;
        boolean c;
        c d;
        long e;

        public d(String str) {
            this.f17078a = str;
            this.b = new long[f.this.c];
        }

        public File a(int i) {
            return new File(f.this.b, this.f17078a + "." + i);
        }

        public File b(int i) {
            return new File(f.this.b, this.f17078a + "." + i + ".tmp");
        }

        public String a() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        public void b(String[] strArr) throws IOException {
            if (strArr.length != f.this.c) {
                throw a(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw a(strArr);
                }
            }
        }

        private IOException a(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }
    }

    public final class e implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final String f17079a;
        private final long b;
        private final InputStream[] c;
        private final long[] d;

        public e(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f17079a = str;
            this.b = j;
            this.c = inputStreamArr;
            this.d = jArr;
        }

        public c a() throws IOException {
            return f.this.a(this.f17079a, this.b);
        }

        public long b(int i) {
            return this.d[i];
        }

        public String c(int i) throws IOException {
            return f.a(a(i));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            for (InputStream inputStream : this.c) {
                g.a((Closeable) inputStream);
            }
        }

        public InputStream a(int i) {
            return this.c[i];
        }
    }

    private f(File file, int i, int i2, long j) {
        this.b = file;
        this.g = i;
        this.d = new File(file, o);
        this.e = new File(file, p);
        this.f = new File(file, q);
        this.c = i2;
        this.k = j;
    }

    private void a() {
        if (this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private void h() throws IOException {
        a(this.e);
        Iterator<d> it = this.h.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i = 0;
            if (next.d == null) {
                while (i < this.c) {
                    this.l += next.b[i];
                    i++;
                }
            } else {
                next.d = null;
                while (i < this.c) {
                    a(next.a(i));
                    a(next.b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    private void i() throws IOException {
        k kVar = new k(new FileInputStream(this.d), g.f17080a);
        try {
            String strD = kVar.d();
            String strD2 = kVar.d();
            String strD3 = kVar.d();
            String strD4 = kVar.d();
            String strD5 = kVar.d();
            if (!r.equals(strD) || !s.equals(strD2) || !Integer.toString(this.g).equals(strD3) || !Integer.toString(this.c).equals(strD4) || !"".equals(strD5)) {
                throw new IOException("unexpected journal header: [" + strD + ", " + strD2 + ", " + strD4 + ", " + strD5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    c(kVar.d());
                    i++;
                } catch (EOFException unused) {
                    this.j = i - this.h.size();
                    if (kVar.b()) {
                        j();
                    } else {
                        this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d, true), g.f17080a));
                    }
                    g.a(kVar);
                    return;
                }
            }
        } catch (Throwable th) {
            g.a(kVar);
            throw th;
        }
    }

    public void b() throws IOException {
        close();
        g.a(this.b);
    }

    public synchronized void c() throws IOException {
        a();
        l();
        this.i.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.i == null) {
                return;
            }
            Iterator it = new ArrayList(this.h.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).d;
                if (cVar != null) {
                    cVar.a();
                }
            }
            l();
            this.i.close();
            this.i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public File d() {
        return this.b;
    }

    public synchronized long e() {
        return this.k;
    }

    public synchronized boolean f() {
        return this.i == null;
    }

    public boolean g() {
        int i = this.j;
        return i >= 2000 && i >= this.h.size();
    }

    public synchronized void j() throws IOException {
        StringBuilder sb;
        try {
            Writer writer = this.i;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.e), g.f17080a));
            try {
                bufferedWriter.write(r);
                bufferedWriter.write("\n");
                bufferedWriter.write(s);
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.g));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.c));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.h.values()) {
                    if (dVar.d != null) {
                        sb = new StringBuilder();
                        sb.append("DIRTY ");
                        sb.append(dVar.f17078a);
                    } else {
                        sb = new StringBuilder();
                        sb.append("CLEAN ");
                        sb.append(dVar.f17078a);
                        sb.append(dVar.a());
                    }
                    sb.append('\n');
                    bufferedWriter.write(sb.toString());
                }
                bufferedWriter.close();
                if (this.d.exists()) {
                    a(this.d, this.f, true);
                }
                a(this.e, this.d, false);
                this.f.delete();
                this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d, true), g.f17080a));
            } catch (Throwable th) {
                bufferedWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long k() {
        return this.l;
    }

    public void l() throws IOException {
        while (this.l > this.k) {
            d(this.h.entrySet().iterator().next().getKey());
        }
    }

    private void c(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith(z)) {
                this.h.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        d dVar = this.h.get(strSubstring);
        if (dVar == null) {
            dVar = new d(strSubstring);
            this.h.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith(x)) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.c = true;
            dVar.d = null;
            dVar.b(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith(y)) {
            dVar.d = new c(dVar);
        } else if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith(A)) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    private void e(String str) {
        if (!v.matcher(str).matches()) {
            throw new IllegalArgumentException(YU.a.h("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public synchronized void a(c cVar, boolean z2) throws IOException {
        d dVar = cVar.f17076a;
        if (dVar.d != cVar) {
            throw new IllegalStateException();
        }
        if (z2 && !dVar.c) {
            for (int i = 0; i < this.c; i++) {
                if (!cVar.b[i]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!dVar.b(i).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            File fileB = dVar.b(i2);
            if (!z2) {
                a(fileB);
            } else if (fileB.exists()) {
                File fileA = dVar.a(i2);
                fileB.renameTo(fileA);
                long j = dVar.b[i2];
                long length = fileA.length();
                dVar.b[i2] = length;
                this.l = (this.l - j) + length;
            }
        }
        this.j++;
        dVar.d = null;
        if (dVar.c || z2) {
            dVar.c = true;
            this.i.write("CLEAN " + dVar.f17078a + dVar.a() + '\n');
            if (z2) {
                long j2 = this.m;
                this.m = 1 + j2;
                dVar.e = j2;
            }
        } else {
            this.h.remove(dVar.f17078a);
            this.i.write("REMOVE " + dVar.f17078a + '\n');
        }
        this.i.flush();
        if (this.l > this.k || g()) {
            this.f17074a.submit(this.n);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(3:43|16|17)|45|14) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        r11 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized com.salesforce.marketingcloud.util.f.e b(java.lang.String r11) throws java.lang.Throwable {
        /*
            r10 = this;
            monitor-enter(r10)
            r10.a()     // Catch: java.lang.Throwable -> L76
            r10.e(r11)     // Catch: java.lang.Throwable -> L76
            java.util.LinkedHashMap<java.lang.String, com.salesforce.marketingcloud.util.f$d> r0 = r10.h     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = r0.get(r11)     // Catch: java.lang.Throwable -> L76
            com.salesforce.marketingcloud.util.f$d r0 = (com.salesforce.marketingcloud.util.f.d) r0     // Catch: java.lang.Throwable -> L76
            r1 = 0
            if (r0 != 0) goto L14
            monitor-exit(r10)
            return r1
        L14:
            boolean r2 = r0.c     // Catch: java.lang.Throwable -> L76
            if (r2 != 0) goto L1a
            monitor-exit(r10)
            return r1
        L1a:
            int r2 = r10.c     // Catch: java.lang.Throwable -> L76
            java.io.InputStream[] r8 = new java.io.InputStream[r2]     // Catch: java.lang.Throwable -> L76
            r2 = 0
            r3 = r2
        L20:
            int r4 = r10.c     // Catch: java.io.FileNotFoundException -> L36 java.lang.Throwable -> L76
            if (r3 >= r4) goto L38
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L32 java.io.FileNotFoundException -> L36
            java.io.File r5 = r0.a(r3)     // Catch: java.lang.Throwable -> L32 java.io.FileNotFoundException -> L36
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L32 java.io.FileNotFoundException -> L36
            r8[r3] = r4     // Catch: java.lang.Throwable -> L32 java.io.FileNotFoundException -> L36
            int r3 = r3 + 1
            goto L20
        L32:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L89
        L36:
            r4 = r10
            goto L79
        L38:
            int r1 = r10.j     // Catch: java.lang.Throwable -> L76
            int r1 = r1 + 1
            r10.j = r1     // Catch: java.lang.Throwable -> L76
            java.io.Writer r1 = r10.i     // Catch: java.lang.Throwable -> L76
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r2.<init>()     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "READ "
            r2.append(r3)     // Catch: java.lang.Throwable -> L76
            r2.append(r11)     // Catch: java.lang.Throwable -> L76
            r3 = 10
            r2.append(r3)     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L76
            r1.append(r2)     // Catch: java.lang.Throwable -> L76
            boolean r1 = r10.g()     // Catch: java.lang.Throwable -> L76
            if (r1 == 0) goto L66
            java.util.concurrent.ThreadPoolExecutor r1 = r10.f17074a     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.Callable<java.lang.Void> r2 = r10.n     // Catch: java.lang.Throwable -> L32
            r1.submit(r2)     // Catch: java.lang.Throwable -> L32
        L66:
            com.salesforce.marketingcloud.util.f$e r3 = new com.salesforce.marketingcloud.util.f$e     // Catch: java.lang.Throwable -> L76
            long r6 = r0.e     // Catch: java.lang.Throwable -> L76
            long[] r9 = r0.b     // Catch: java.lang.Throwable -> L76
            r4 = r10
            r5 = r11
            r3.<init>(r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L73
            monitor-exit(r10)
            return r3
        L73:
            r0 = move-exception
        L74:
            r11 = r0
            goto L89
        L76:
            r0 = move-exception
            r4 = r10
            goto L74
        L79:
            int r11 = r4.c     // Catch: java.lang.Throwable -> L73
            if (r2 >= r11) goto L87
            r11 = r8[r2]     // Catch: java.lang.Throwable -> L73
            if (r11 == 0) goto L87
            com.salesforce.marketingcloud.util.g.a(r11)     // Catch: java.lang.Throwable -> L73
            int r2 = r2 + 1
            goto L79
        L87:
            monitor-exit(r10)
            return r1
        L89:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L73
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.util.f.b(java.lang.String):com.salesforce.marketingcloud.util.f$e");
    }

    public synchronized boolean d(String str) throws IOException {
        try {
            a();
            e(str);
            d dVar = this.h.get(str);
            if (dVar != null && dVar.d == null) {
                for (int i = 0; i < this.c; i++) {
                    File fileA = dVar.a(i);
                    if (fileA.exists() && !fileA.delete()) {
                        throw new IOException("failed to delete " + fileA);
                    }
                    long j = this.l;
                    long[] jArr = dVar.b;
                    this.l = j - jArr[i];
                    jArr[i] = 0;
                }
                this.j++;
                this.i.append((CharSequence) ("REMOVE " + str + '\n'));
                this.h.remove(str);
                if (g()) {
                    this.f17074a.submit(this.n);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    private static void a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public c a(String str) throws IOException {
        return a(str, -1L);
    }

    public synchronized c a(String str, long j) throws IOException {
        a();
        e(str);
        d dVar = this.h.get(str);
        if (j != -1 && (dVar == null || dVar.e != j)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(str);
            this.h.put(str, dVar);
        } else if (dVar.d != null) {
            return null;
        }
        c cVar = new c(dVar);
        dVar.d = cVar;
        this.i.write("DIRTY " + str + '\n');
        this.i.flush();
        return cVar;
    }

    public static String a(InputStream inputStream) throws IOException {
        return g.a((Reader) new InputStreamReader(inputStream, g.c));
    }

    public static f a(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, q);
        if (file2.exists()) {
            File file3 = new File(file, o);
            if (file3.exists()) {
                file2.delete();
            } else {
                a(file2, file3, false);
            }
        }
        f fVar = new f(file, i, i2, j);
        if (fVar.d.exists()) {
            try {
                fVar.i();
                fVar.h();
                return fVar;
            } catch (IOException e2) {
                com.salesforce.marketingcloud.g.b("DiskLruCache", e2, "DiskLruCache %s is corrupt, removing.", file);
                fVar.b();
            }
        }
        file.mkdirs();
        f fVar2 = new f(file, i, i2, j);
        fVar2.j();
        return fVar2;
    }

    private static void a(File file, File file2, boolean z2) throws IOException {
        if (z2) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public synchronized void a(long j) {
        this.k = j;
        this.f17074a.submit(this.n);
    }
}
