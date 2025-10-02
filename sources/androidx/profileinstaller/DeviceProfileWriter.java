package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.profileinstaller.ProfileInstaller;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

@RestrictTo
/* loaded from: classes2.dex */
public class DeviceProfileWriter {

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f3637a;
    public final Executor b;
    public final ProfileInstaller.DiagnosticsCallback c;
    public final byte[] d;
    public final File e;
    public final String f;
    public boolean g = false;
    public DexProfileData[] h;
    public byte[] i;

    public DeviceProfileWriter(AssetManager assetManager, Executor executor, ProfileInstaller.DiagnosticsCallback diagnosticsCallback, String str, File file) {
        byte[] bArr;
        this.f3637a = assetManager;
        this.b = executor;
        this.c = diagnosticsCallback;
        this.f = str;
        this.e = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 28:
                case 29:
                case 30:
                    bArr = ProfileVersion.b;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = ProfileVersion.f3644a;
        }
        this.d = bArr;
    }

    public final boolean a() {
        if (this.d == null) {
            d(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        File file = this.e;
        if (!file.exists()) {
            try {
                if (!file.createNewFile()) {
                    d(4, null);
                    return false;
                }
            } catch (IOException unused) {
                d(4, null);
                return false;
            }
        } else if (!file.canWrite()) {
            d(4, null);
            return false;
        }
        this.g = true;
        return true;
    }

    public final FileInputStream b(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.c.b();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.profileinstaller.DeviceProfileWriter c() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.DeviceProfileWriter.c():androidx.profileinstaller.DeviceProfileWriter");
    }

    public final void d(int i, Serializable serializable) {
        this.b.execute(new a(this, i, 1, serializable));
    }

    public final void e() throws IOException {
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        ProfileInstaller.DiagnosticsCallback diagnosticsCallback = this.c;
        DexProfileData[] dexProfileDataArr = this.h;
        if (dexProfileDataArr == null || (bArr = this.d) == null) {
            return;
        }
        if (!this.g) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (IOException e) {
            diagnosticsCallback.a(7, e);
        } catch (IllegalStateException e2) {
            diagnosticsCallback.a(8, e2);
        }
        try {
            byteArrayOutputStream.write(ProfileTranscoder.f3641a);
            byteArrayOutputStream.write(bArr);
            if (ProfileTranscoder.i(byteArrayOutputStream, bArr, dexProfileDataArr)) {
                this.i = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.h = null;
            } else {
                diagnosticsCallback.a(5, null);
                this.h = null;
                byteArrayOutputStream.close();
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean f() {
        byte[] bArr = this.i;
        if (bArr != null) {
            if (!this.g) {
                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
            }
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(this.e);
                        try {
                            FileChannel channel = fileOutputStream.getChannel();
                            try {
                                FileLock fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    try {
                                        if (fileLockTryLock.isValid()) {
                                            byte[] bArr2 = new byte[512];
                                            while (true) {
                                                int i = byteArrayInputStream.read(bArr2);
                                                if (i <= 0) {
                                                    d(1, null);
                                                    fileLockTryLock.close();
                                                    channel.close();
                                                    fileOutputStream.close();
                                                    byteArrayInputStream.close();
                                                    return true;
                                                }
                                                fileOutputStream.write(bArr2, 0, i);
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e) {
                    d(6, e);
                    return false;
                } catch (IOException e2) {
                    d(7, e2);
                    return false;
                }
            } finally {
                this.i = null;
                this.h = null;
            }
        }
        return false;
    }
}
