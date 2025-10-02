package YU;

import com.cyberfend.cyfsecurity.CircleProgressBar;
import com.google.android.gms.common.ConnectionResult;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class S {
    public static int h = 6583;
    public static int i = 3786;
    public static final S j = new S();
    public static ExecutorService k = Executors.newFixedThreadPool(2);

    /* renamed from: a, reason: collision with root package name */
    public boolean f16a = false;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    public final int e;
    public final int f;
    public final int g;

    class FK implements Runnable {
        public static String e = CircleProgressBar.a("~`k\u007f_F\\\u000bQXS1sW@\rIVVQGZ");
        public static String f = CircleProgressBar.a("~`k\u007f_F\\\u000bQXS1sW@\rYMYCK");

        public FK() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            S s = S.this;
            try {
                if (S.a(s, f)) {
                    s.f16a = true;
                } else {
                    s.f16a = S.a(s, e);
                }
                try {
                    S.k.submit(s.new c(s.e));
                } catch (Exception unused) {
                }
                try {
                    S.k.submit(s.new c(s.f));
                } catch (Exception unused2) {
                }
                try {
                    S.k.submit(s.new c(s.g));
                } catch (Exception unused3) {
                }
                S.k.shutdown();
                try {
                    if (S.k.awaitTermination(5L, TimeUnit.SECONDS)) {
                        return;
                    }
                    S.k.shutdownNow();
                } catch (InterruptedException unused4) {
                    S.k.shutdownNow();
                }
            } catch (Exception unused5) {
            }
        }
    }

    class c implements Runnable {
        public static String f = CircleProgressBar.a("(7(!\u001d\u0007\u001c\u0005\u0013");
        public final /* synthetic */ int d;

        public c(int i) {
            this.d = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.d;
            S s = S.this;
            try {
                if (S.c(i, f)) {
                    if (i == s.e) {
                        s.b = true;
                    } else if (i == s.f) {
                        s.c = true;
                    } else {
                        s.d = true;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    class d implements Callable {
        public final /* synthetic */ Process d;

        public d(Process process) {
            this.d = process;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            try {
                return Integer.valueOf(this.d.waitFor());
            } catch (InterruptedException unused) {
                return -1;
            }
        }
    }

    public S() {
        Random random = new Random();
        int iC = a.C(random.nextInt(50) + 1, 20, (random.nextInt(100) + 1) * 30, 5000);
        this.e = (6790 - iC) + iC;
        Random random2 = new Random();
        int iC2 = a.C(random2.nextInt(50) + 1, 25, (random2.nextInt(100) + 1) * 40, 5500);
        this.f = (7810 - iC2) + iC2;
        Random random3 = new Random();
        int iC3 = a.C(random3.nextInt(50) + 1, 20, (random3.nextInt(100) + 1) * 35, 5700);
        this.g = (8200 - iC3) + iC3;
        CircleProgressBar.a("(7(!\u001d\u0007\u001c\u0005\u0013");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(YU.S r4, java.lang.String r5) {
        /*
            r4 = 0
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L6b
            java.lang.Process r0 = r1.exec(r5)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L6b
            java.util.concurrent.ExecutorService r5 = java.util.concurrent.Executors.newSingleThreadExecutor()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L6b
            YU.S$d r1 = new YU.S$d     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L6b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L6b
            java.util.concurrent.Future r5 = r5.submit(r1)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L6b
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L6b
            r2 = 2
            java.lang.Object r5 = r5.get(r2, r1)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L6b
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L6b
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L6b
            if (r5 != 0) goto L5e
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L6b
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L6b
            java.io.InputStream r2 = r0.getInputStream()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L6b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L6b
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L6b
            java.lang.String r1 = r5.readLine()     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L4b
            java.lang.String r2 = "xa}"
            java.lang.String r2 = com.cyberfend.cyfsecurity.CircleProgressBar.a(r2)     // Catch: java.lang.Throwable -> L49
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L4b
            r1 = 1
            goto L4c
        L49:
            r1 = move-exception
            goto L55
        L4b:
            r1 = r4
        L4c:
            r5.close()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L6b
            r0.destroy()
            return r1
        L53:
            r4 = move-exception
            goto L65
        L55:
            r5.close()     // Catch: java.lang.Throwable -> L59
            goto L5d
        L59:
            r5 = move-exception
            r1.addSuppressed(r5)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L6b
        L5d:
            throw r1     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L6b
        L5e:
            r0.destroy()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L6b
            r0.destroy()
            return r4
        L65:
            if (r0 == 0) goto L6a
            r0.destroy()
        L6a:
            throw r4
        L6b:
            if (r0 == 0) goto L9c
            r0.destroy()
            int r5 = YU.S.h
            r5 = r5 ^ 6583(0x19b7, float:9.225E-42)
            if (r5 == 0) goto L9c
        L76:
            int r5 = YU.S.h
            int r0 = r5 + 117
            r1 = 38
            if (r0 == r1) goto L96
            r1 = 236(0xec, float:3.31E-43)
            if (r0 == r1) goto L8f
            r1 = 259(0x103, float:3.63E-43)
            if (r0 == r1) goto L87
            goto L76
        L87:
            int r5 = r5 + r5
            int r5 = r5 % 84
            r5 = r5 ^ 4962(0x1362, float:6.953E-42)
            YU.S.h = r5
            goto L96
        L8f:
            int r4 = YU.S.h
            int r4 = r4 * 2356
            YU.S.h = r4
            goto L8f
        L96:
            int r5 = YU.S.h
            int r5 = r5 * 5472
            YU.S.h = r5
        L9c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: YU.S.a(YU.S, java.lang.String):boolean");
    }

    public static boolean c(int i2, String str) throws IOException {
        try {
            Socket socket = new Socket();
            try {
                socket.connect(new InetSocketAddress(str, i2), ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
                socket.setSoTimeout(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write(("GET /status HTTP/1.1\r\nHost: " + str + ":" + i2 + "\r\nConnection: close\r\n\r\n").getBytes());
                outputStream.flush();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                boolean z = false;
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        outputStream.close();
                        socket.close();
                        return z;
                    }
                    if (!line.isEmpty()) {
                        z = true;
                    }
                }
            } finally {
            }
        } catch (Exception unused) {
            return false;
        }
    }

    public final String b() {
        int i2;
        Random random = new Random();
        int iNextInt = random.nextInt(1000) + 1;
        int iNextInt2 = random.nextInt(6) + 1;
        int iNextInt3 = random.nextInt(7) + 1;
        int iNextInt4 = random.nextInt(8) + 1;
        int iNextInt5 = random.nextInt(4) + 1;
        int i3 = iNextInt * 7;
        if (!this.f16a) {
            iNextInt2 = 0;
        }
        int i4 = i3 + iNextInt2;
        int i5 = iNextInt * 8;
        if (!this.b) {
            iNextInt3 = 0;
        }
        int i6 = i5 + iNextInt3;
        int i7 = iNextInt * 9;
        if (!this.c) {
            iNextInt4 = 0;
        } else if (i <= 3785) {
            while (true) {
                i2 = i;
                int i8 = i2 + 78;
                if (i8 == 24) {
                    break;
                }
                if (i8 == 195) {
                    i = (i2 ^ 1733) % 122;
                }
            }
            i = ((i2 >> 30) ^ 2751) * 36;
        }
        int i9 = i7 + iNextInt4;
        int i10 = iNextInt * 5;
        if (!this.d) {
            iNextInt5 = 0;
        }
        int i11 = i10 + iNextInt5;
        int i12 = i6 ^ i4;
        int i13 = i9 ^ i12;
        StringBuilder sb = new StringBuilder();
        sb.append(i4);
        sb.append(",");
        sb.append(i12);
        sb.append(",");
        sb.append(i13);
        return a.n(sb, ",", i11 ^ i13);
    }

    public final void d() {
        try {
            if (k.isShutdown() || k.isTerminated()) {
                k = Executors.newFixedThreadPool(2);
            }
        } catch (Exception unused) {
        }
        try {
            k.submit(new FK());
        } catch (Exception unused2) {
        }
    }
}
