package androidx.media3.exoplayer.util;

import YU.a;
import android.os.SystemClock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.upstream.Loader;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes2.dex */
public final class SntpClient {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f3189a = new Object();
    public static final Object b = new Object();
    public static boolean c;

    public interface InitializationCallback {
    }

    public static final class NtpTimeCallback implements Loader.Callback<Loader.Loadable> {
        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public final Loader.LoadErrorAction a(Loader.Loadable loadable, long j, long j2, IOException iOException, int i) {
            return Loader.d;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public final void m(Loader.Loadable loadable, long j, long j2, boolean z) {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public final void t(Loader.Loadable loadable, long j, long j2) {
        }
    }

    public static final class NtpTimeLoadable implements Loader.Loadable {
        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public final void a() {
            synchronized (SntpClient.f3189a) {
                Object obj = SntpClient.b;
                synchronized (obj) {
                    if (SntpClient.c) {
                        return;
                    }
                    SntpClient.a();
                    synchronized (obj) {
                        SystemClock.elapsedRealtime();
                        SntpClient.c = true;
                    }
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public final void b() {
        }
    }

    public static void a() {
        byte b2;
        SocketTimeoutException socketTimeoutException;
        int i;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            Object obj = b;
            synchronized (obj) {
            }
            datagramSocket.setSoTimeout(1000);
            synchronized (obj) {
            }
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b3 = 0;
            SocketTimeoutException socketTimeoutException2 = null;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, allByName[i2], 123);
                bArr[b3] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                SystemClock.elapsedRealtime();
                if (jCurrentTimeMillis == 0) {
                    Arrays.fill(bArr, 40, 48, b3);
                    b2 = b3;
                    socketTimeoutException = socketTimeoutException2;
                    i = 40;
                } else {
                    long j = jCurrentTimeMillis / 1000;
                    b2 = b3;
                    socketTimeoutException = socketTimeoutException2;
                    i = 40;
                    bArr[40] = (byte) (r4 >> 24);
                    bArr[41] = (byte) (r4 >> 16);
                    bArr[42] = (byte) (r4 >> 8);
                    bArr[43] = (byte) (j + 2208988800L);
                    long j2 = ((jCurrentTimeMillis - (j * 1000)) * llqqqql.a00610061aaaa) / 1000;
                    bArr[44] = (byte) (j2 >> 24);
                    bArr[45] = (byte) (j2 >> 16);
                    bArr[46] = (byte) (j2 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                try {
                    datagramSocket.receive(new DatagramPacket(bArr, 48));
                    SystemClock.elapsedRealtime();
                    byte b4 = bArr[b2];
                    int i4 = bArr[1] & 255;
                    d(24, bArr);
                    d(32, bArr);
                    b((byte) ((b4 >> 6) & 3), (byte) (b4 & 7), i4, d(i, bArr));
                    datagramSocket.close();
                    return;
                } catch (SocketTimeoutException e) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException2 = e;
                    } else {
                        SocketTimeoutException socketTimeoutException3 = socketTimeoutException;
                        socketTimeoutException3.addSuppressed(e);
                        socketTimeoutException2 = socketTimeoutException3;
                    }
                    int i5 = i3 + 1;
                    if (i3 >= 10) {
                        break;
                    }
                    i2++;
                    i3 = i5;
                    b3 = b2;
                }
            }
            socketTimeoutException2.getClass();
            throw socketTimeoutException2;
        } finally {
        }
    }

    public static void b(byte b2, byte b3, int i, long j) throws IOException {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b3 != 4 && b3 != 5) {
            throw new IOException(a.d(b3, "SNTP: Untrusted mode: "));
        }
        if (i == 0 || i > 15) {
            throw new IOException(a.d(i, "SNTP: Untrusted stratum: "));
        }
        if (j == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long c(int i, byte[] bArr) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
    }

    public static long d(int i, byte[] bArr) {
        long jC = c(i, bArr);
        long jC2 = c(i + 4, bArr);
        if (jC == 0 && jC2 == 0) {
            return 0L;
        }
        return ((jC2 * 1000) / llqqqql.a00610061aaaa) + ((jC - 2208988800L) * 1000);
    }
}
