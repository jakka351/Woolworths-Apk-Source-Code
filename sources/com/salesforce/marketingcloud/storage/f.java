package com.salesforce.marketingcloud.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: classes6.dex */
public class f {
    private final Context c;
    private final SharedPreferences d;
    final File e;
    private final String f;
    private final com.salesforce.marketingcloud.internal.l g;

    @GuardedBy
    private String h;

    /* renamed from: a, reason: collision with root package name */
    final Object f17063a = new Object();
    private final Object b = new Object();

    @GuardedBy
    private boolean i = false;

    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws Throwable {
            f.this.b();
        }
    }

    public class b extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, String str2) {
            super(str, objArr);
            this.b = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            FileOutputStream fileOutputStream;
            Throwable th;
            synchronized (f.this.f17063a) {
                FileOutputStream fileOutputStream2 = null;
                FileOutputStream fileOutputStream3 = null;
                try {
                    try {
                        try {
                            fileOutputStream = new FileOutputStream(f.this.e);
                            try {
                                String str = this.b;
                                fileOutputStream.write(str != null ? str.getBytes(com.salesforce.marketingcloud.util.l.b) : new byte[0]);
                                String str2 = e.c;
                                com.salesforce.marketingcloud.g.d(str2, "Gdpr mode [%s] written to file.", this.b);
                                fileOutputStream2 = str2;
                            } catch (Exception unused) {
                                fileOutputStream3 = fileOutputStream;
                                com.salesforce.marketingcloud.g.b(e.c, "Failed to write gdpr mode to file: ", f.this.e.getAbsolutePath());
                                fileOutputStream = fileOutputStream3;
                                fileOutputStream2 = fileOutputStream3;
                                com.salesforce.marketingcloud.util.g.a(fileOutputStream);
                            } catch (Throwable th2) {
                                th = th2;
                                com.salesforce.marketingcloud.util.g.a(fileOutputStream);
                                throw th;
                            }
                        } catch (Exception unused2) {
                        }
                        com.salesforce.marketingcloud.util.g.a(fileOutputStream);
                    } finally {
                    }
                } catch (Throwable th3) {
                    fileOutputStream = fileOutputStream2;
                    th = th3;
                }
            }
        }
    }

    public f(Context context, SharedPreferences sharedPreferences, String str, com.salesforce.marketingcloud.internal.l lVar) {
        this.c = context;
        this.d = sharedPreferences;
        this.g = lVar;
        String strG = YU.a.g(str, "_SFMC_PrivacyMode");
        this.f = strG;
        this.e = new File(context.getNoBackupFilesDir(), strG);
        c();
    }

    private void a() throws InterruptedException {
        while (!this.i) {
            try {
                this.b.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    private void c() {
        synchronized (this.b) {
            this.i = false;
        }
        new a("gdpr_file_load").start();
    }

    public void b() throws Throwable {
        synchronized (this.b) {
            try {
                if (this.i) {
                    return;
                }
                String string = null;
                if (this.e.exists()) {
                    String strA = a(this.e);
                    if (!TextUtils.isEmpty(strA)) {
                        string = strA;
                    }
                } else {
                    String str = e.c;
                    com.salesforce.marketingcloud.g.a(str, "Checking SharedPreferences for gdpr mode", new Object[0]);
                    string = this.d.getString("cc_state", null);
                    if (string != null) {
                        this.d.edit().remove("cc_state").apply();
                    } else {
                        com.salesforce.marketingcloud.g.a(str, "Checking pre-lollipop location for gdpr mode", new Object[0]);
                        File file = new File(this.c.getFilesDir(), this.f);
                        if (file.exists()) {
                            string = a(file);
                            com.salesforce.marketingcloud.util.g.b(file);
                        }
                    }
                    c(string);
                }
                synchronized (this.b) {
                    this.h = string;
                    this.i = true;
                    this.b.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public String a(@Nullable String str) {
        synchronized (this.b) {
            a();
            String str2 = this.h;
            if (str2 != null) {
                str = str2;
            }
        }
        return str;
    }

    public void b(@Nullable String str) {
        synchronized (this.b) {
            com.salesforce.marketingcloud.g.d(e.c, "Updating gdpr mode: %s", str);
            this.h = str;
            c(str);
        }
    }

    @GuardedBy
    public void c(@Nullable String str) {
        this.g.b().execute(new b("storing_gdpr", new Object[0], str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.FileInputStream, java.io.InputStream] */
    private static String a(@NonNull File file) throws Throwable {
        ?? fileInputStream;
        Closeable closeable;
        String line = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Exception unused) {
            fileInputStream = 0;
        } catch (Throwable th) {
            th = th;
            fileInputStream = line;
            com.salesforce.marketingcloud.util.g.a((Closeable) fileInputStream);
            throw th;
        }
        try {
            line = new BufferedReader(new InputStreamReader((InputStream) fileInputStream, com.salesforce.marketingcloud.util.l.b)).readLine();
            closeable = fileInputStream;
        } catch (Exception unused2) {
            try {
                com.salesforce.marketingcloud.g.b(e.c, "Failed to read gdpr mode from file: ", file.getAbsolutePath());
                closeable = fileInputStream;
                com.salesforce.marketingcloud.util.g.a(closeable);
                return line;
            } catch (Throwable th2) {
                th = th2;
                line = fileInputStream;
                fileInputStream = line;
                com.salesforce.marketingcloud.util.g.a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            com.salesforce.marketingcloud.util.g.a((Closeable) fileInputStream);
            throw th;
        }
        com.salesforce.marketingcloud.util.g.a(closeable);
        return line;
    }
}
