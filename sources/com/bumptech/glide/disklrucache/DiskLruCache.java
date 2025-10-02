package com.bumptech.glide.disklrucache;

import android.os.StrictMode;
import io.jsonwebtoken.JwtParser;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class DiskLruCache implements Closeable {
    public final File d;
    public final File e;
    public final File f;
    public final File g;
    public final long i;
    public BufferedWriter l;
    public int n;
    public long k = 0;
    public final LinkedHashMap m = new LinkedHashMap(0, 0.75f, true);
    public long o = 0;
    public final ThreadPoolExecutor p = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DiskLruCacheThreadFactory());
    public final Callable q = new Callable<Void>() { // from class: com.bumptech.glide.disklrucache.DiskLruCache.1
        @Override // java.util.concurrent.Callable
        public final Void call() {
            synchronized (DiskLruCache.this) {
                try {
                    DiskLruCache diskLruCache = DiskLruCache.this;
                    if (diskLruCache.l == null) {
                        return null;
                    }
                    diskLruCache.v();
                    if (DiskLruCache.this.h()) {
                        DiskLruCache.this.p();
                        DiskLruCache.this.n = 0;
                    }
                    return null;
                } finally {
                }
            }
        }
    };
    public final int h = 1;
    public final int j = 1;

    public static final class DiskLruCacheThreadFactory implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class Editor {

        /* renamed from: a, reason: collision with root package name */
        public final Entry f13765a;
        public final boolean[] b;
        public boolean c;

        public Editor(Entry entry) {
            this.f13765a = entry;
            this.b = entry.e ? null : new boolean[DiskLruCache.this.j];
        }

        public final void a() {
            DiskLruCache.a(DiskLruCache.this, this, false);
        }

        public final File b() {
            File file;
            synchronized (DiskLruCache.this) {
                try {
                    Entry entry = this.f13765a;
                    if (entry.f != this) {
                        throw new IllegalStateException();
                    }
                    if (!entry.e) {
                        this.b[0] = true;
                    }
                    file = entry.d[0];
                    DiskLruCache.this.d.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return file;
        }
    }

    public final class Entry {

        /* renamed from: a, reason: collision with root package name */
        public final String f13766a;
        public final long[] b;
        public final File[] c;
        public final File[] d;
        public boolean e;
        public Editor f;

        public Entry(String str) {
            this.f13766a = str;
            int i = DiskLruCache.this.j;
            File file = DiskLruCache.this.d;
            this.b = new long[i];
            this.c = new File[i];
            this.d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append(JwtParser.SEPARATOR_CHAR);
            int length = sb.length();
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(i2);
                this.c[i2] = new File(file, sb.toString());
                sb.append(".tmp");
                this.d[i2] = new File(file, sb.toString());
                sb.setLength(length);
            }
        }

        public final String a() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }
    }

    public final class Value {

        /* renamed from: a, reason: collision with root package name */
        public final File[] f13767a;

        public Value(File[] fileArr) {
            this.f13767a = fileArr;
        }
    }

    public DiskLruCache(File file, long j) {
        this.d = file;
        this.e = new File(file, "journal");
        this.f = new File(file, "journal.tmp");
        this.g = new File(file, "journal.bkp");
        this.i = j;
    }

    public static void a(DiskLruCache diskLruCache, Editor editor, boolean z) {
        synchronized (diskLruCache) {
            Entry entry = editor.f13765a;
            if (entry.f != editor) {
                throw new IllegalStateException();
            }
            if (z && !entry.e) {
                for (int i = 0; i < diskLruCache.j; i++) {
                    if (!editor.b[i]) {
                        editor.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!entry.d[i].exists()) {
                        editor.a();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < diskLruCache.j; i2++) {
                File file = entry.d[i2];
                if (!z) {
                    d(file);
                } else if (file.exists()) {
                    File file2 = entry.c[i2];
                    file.renameTo(file2);
                    long j = entry.b[i2];
                    long length = file2.length();
                    entry.b[i2] = length;
                    diskLruCache.k = (diskLruCache.k - j) + length;
                }
            }
            diskLruCache.n++;
            entry.f = null;
            if (entry.e || z) {
                entry.e = true;
                diskLruCache.l.append((CharSequence) "CLEAN");
                diskLruCache.l.append(' ');
                diskLruCache.l.append((CharSequence) entry.f13766a);
                diskLruCache.l.append((CharSequence) entry.a());
                diskLruCache.l.append('\n');
                if (z) {
                    diskLruCache.o++;
                }
            } else {
                diskLruCache.m.remove(entry.f13766a);
                diskLruCache.l.append((CharSequence) "REMOVE");
                diskLruCache.l.append(' ');
                diskLruCache.l.append((CharSequence) entry.f13766a);
                diskLruCache.l.append('\n');
            }
            f(diskLruCache.l);
            if (diskLruCache.k > diskLruCache.i || diskLruCache.h()) {
                diskLruCache.p.submit(diskLruCache.q);
            }
        }
    }

    public static void b(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void d(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void f(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static DiskLruCache i(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                r(file2, file3, false);
            }
        }
        DiskLruCache diskLruCache = new DiskLruCache(file, j);
        if (diskLruCache.e.exists()) {
            try {
                diskLruCache.k();
                diskLruCache.j();
                return diskLruCache;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                diskLruCache.c();
            }
        }
        file.mkdirs();
        DiskLruCache diskLruCache2 = new DiskLruCache(file, j);
        diskLruCache2.p();
        return diskLruCache2;
    }

    public static void r(File file, File file2, boolean z) throws IOException {
        if (z) {
            d(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final void c() throws IOException {
        close();
        Util.a(this.d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.l == null) {
                return;
            }
            Iterator it = new ArrayList(this.m.values()).iterator();
            while (it.hasNext()) {
                Editor editor = ((Entry) it.next()).f;
                if (editor != null) {
                    editor.a();
                }
            }
            v();
            b(this.l);
            this.l = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Editor e(String str) {
        synchronized (this) {
            try {
                if (this.l == null) {
                    throw new IllegalStateException("cache is closed");
                }
                Entry entry = (Entry) this.m.get(str);
                if (entry == null) {
                    entry = new Entry(str);
                    this.m.put(str, entry);
                } else if (entry.f != null) {
                    return null;
                }
                Editor editor = new Editor(entry);
                entry.f = editor;
                this.l.append((CharSequence) "DIRTY");
                this.l.append(' ');
                this.l.append((CharSequence) str);
                this.l.append('\n');
                f(this.l);
                return editor;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Value g(String str) {
        if (this.l == null) {
            throw new IllegalStateException("cache is closed");
        }
        Entry entry = (Entry) this.m.get(str);
        if (entry == null) {
            return null;
        }
        if (!entry.e) {
            return null;
        }
        for (File file : entry.c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.n++;
        this.l.append((CharSequence) "READ");
        this.l.append(' ');
        this.l.append((CharSequence) str);
        this.l.append('\n');
        if (h()) {
            this.p.submit(this.q);
        }
        return new Value(entry.c);
    }

    public final boolean h() {
        int i = this.n;
        return i >= 2000 && i >= this.m.size();
    }

    public final void j() throws IOException {
        d(this.f);
        Iterator it = this.m.values().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            Editor editor = entry.f;
            int i = this.j;
            int i2 = 0;
            if (editor == null) {
                while (i2 < i) {
                    this.k += entry.b[i2];
                    i2++;
                }
            } else {
                entry.f = null;
                while (i2 < i) {
                    d(entry.c[i2]);
                    d(entry.d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void k() {
        File file = this.e;
        StrictLineReader strictLineReader = new StrictLineReader(new FileInputStream(file), Util.f13768a);
        try {
            String strA = strictLineReader.a();
            String strA2 = strictLineReader.a();
            String strA3 = strictLineReader.a();
            String strA4 = strictLineReader.a();
            String strA5 = strictLineReader.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.h).equals(strA3) || !Integer.toString(this.j).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    l(strictLineReader.a());
                    i++;
                } catch (EOFException unused) {
                    this.n = i - this.m.size();
                    if (strictLineReader.h == -1) {
                        p();
                    } else {
                        this.l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), Util.f13768a));
                    }
                    try {
                        strictLineReader.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                strictLineReader.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void l(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.m;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        Entry entry = (Entry) linkedHashMap.get(strSubstring);
        if (entry == null) {
            entry = new Entry(strSubstring);
            linkedHashMap.put(strSubstring, entry);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                entry.f = new Editor(entry);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        entry.e = true;
        entry.f = null;
        if (strArrSplit.length != DiskLruCache.this.j) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                entry.b[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void p() {
        try {
            BufferedWriter bufferedWriter = this.l;
            if (bufferedWriter != null) {
                b(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f), Util.f13768a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.h));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.j));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (Entry entry : this.m.values()) {
                    if (entry.f != null) {
                        bufferedWriter2.write("DIRTY " + entry.f13766a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + entry.f13766a + entry.a() + '\n');
                    }
                }
                b(bufferedWriter2);
                if (this.e.exists()) {
                    r(this.e, this.g, true);
                }
                r(this.f, this.e, false);
                this.g.delete();
                this.l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.e, true), Util.f13768a));
            } catch (Throwable th) {
                b(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void v() {
        while (this.k > this.i) {
            String str = (String) ((Map.Entry) this.m.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.l == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    Entry entry = (Entry) this.m.get(str);
                    if (entry != null && entry.f == null) {
                        for (int i = 0; i < this.j; i++) {
                            File file = entry.c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.k;
                            long[] jArr = entry.b;
                            this.k = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.n++;
                        this.l.append((CharSequence) "REMOVE");
                        this.l.append(' ');
                        this.l.append((CharSequence) str);
                        this.l.append('\n');
                        this.m.remove(str);
                        if (h()) {
                            this.p.submit(this.q);
                        }
                    }
                } finally {
                }
            }
        }
    }
}
