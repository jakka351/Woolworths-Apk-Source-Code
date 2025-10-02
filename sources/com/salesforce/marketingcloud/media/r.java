package com.salesforce.marketingcloud.media;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.salesforce.marketingcloud.util.f;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public class r {
    private static final int d = 20971520;

    /* renamed from: a, reason: collision with root package name */
    private final File f16977a;
    private final Object b = new Object();
    private com.salesforce.marketingcloud.util.f c;

    public r(File file) {
        this.f16977a = file;
    }

    private void b() throws IOException {
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    this.c = com.salesforce.marketingcloud.util.f.a(this.f16977a, 0, 1, 20971520L);
                    this.b.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static String c(String str) {
        return com.salesforce.marketingcloud.util.l.g(str);
    }

    @WorkerThread
    public void a() throws IOException {
        b();
        this.c.c();
    }

    @Nullable
    @WorkerThread
    public InputStream a(String str) throws IOException {
        InputStream inputStreamA;
        b();
        String strC = c(str);
        synchronized (this.b) {
            try {
                f.e eVarB = this.c.b(strC);
                inputStreamA = eVarB != null ? eVarB.a(0) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return inputStreamA;
    }

    @WorkerThread
    public void b(String str) throws IOException {
        b();
        this.c.d(c(str));
    }

    @WorkerThread
    public void a(String str, InputStream inputStream) throws IOException {
        b();
        String strC = c(str);
        synchronized (this.b) {
            try {
                f.c cVarA = this.c.a(strC);
                try {
                    com.salesforce.marketingcloud.util.g.a(inputStream, cVarA.c(0));
                    cVarA.c();
                } finally {
                    com.salesforce.marketingcloud.util.g.a((Closeable) inputStream);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
