package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes.dex */
class QueueFileLogStore implements FileLogStore {
    public static final Charset c = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final File f15295a;
    public QueueFile b;

    /* loaded from: classes6.dex */
    public static class LogBytes {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f15297a;
        public final int b;

        public LogBytes(byte[] bArr, int i) {
            this.f15297a = bArr;
            this.b = i;
        }
    }

    public QueueFileLogStore(File file) {
        this.f15295a = file;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public final void a(long j, String str) {
        d();
        if (this.b == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - 16384);
            }
            this.b.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(c));
            while (!this.b.d() && this.b.j() > 65536) {
                this.b.g();
            }
        } catch (IOException e) {
            Logger.f15258a.c(e, "There was a problem writing to the Crashlytics log.");
        }
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public final void b() throws IOException {
        CommonUtils.b(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c() {
        /*
            r7 = this;
            java.io.File r0 = r7.f15295a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r4 = r2
            goto L38
        Lc:
            r7.d()
            com.google.firebase.crashlytics.internal.metadata.QueueFile r0 = r7.b
            if (r0 != 0) goto L14
            goto La
        L14:
            int[] r3 = new int[]{r1}
            int r0 = r0.j()
            byte[] r0 = new byte[r0]
            com.google.firebase.crashlytics.internal.metadata.QueueFile r4 = r7.b     // Catch: java.io.IOException -> L29
            com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore$1 r5 = new com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore$1     // Catch: java.io.IOException -> L29
            r5.<init>()     // Catch: java.io.IOException -> L29
            r4.c(r5)     // Catch: java.io.IOException -> L29
            goto L31
        L29:
            r4 = move-exception
            com.google.firebase.crashlytics.internal.Logger r5 = com.google.firebase.crashlytics.internal.Logger.f15258a
            java.lang.String r6 = "A problem occurred while reading the Crashlytics log file."
            r5.c(r4, r6)
        L31:
            com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore$LogBytes r4 = new com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore$LogBytes
            r3 = r3[r1]
            r4.<init>(r0, r3)
        L38:
            if (r4 != 0) goto L3b
            goto L44
        L3b:
            int r0 = r4.b
            byte[] r2 = new byte[r0]
            byte[] r3 = r4.f15297a
            java.lang.System.arraycopy(r3, r1, r2, r1, r0)
        L44:
            if (r2 == 0) goto L4e
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore.c
            r0.<init>(r2, r1)
            return r0
        L4e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore.c():java.lang.String");
    }

    public final void d() {
        File file = this.f15295a;
        if (this.b == null) {
            try {
                this.b = new QueueFile(file);
            } catch (IOException e) {
                Logger.f15258a.c(e, "Could not open log file: " + file);
            }
        }
    }
}
