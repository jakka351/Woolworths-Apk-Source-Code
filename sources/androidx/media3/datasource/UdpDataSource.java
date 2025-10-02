package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

@UnstableApi
/* loaded from: classes2.dex */
public final class UdpDataSource extends BaseDataSource {
    public final int e;
    public final byte[] f;
    public final DatagramPacket g;
    public Uri h;
    public DatagramSocket i;
    public MulticastSocket j;
    public InetAddress k;
    public boolean l;
    public int m;

    public static final class UdpDataSourceException extends DataSourceException {
    }

    public UdpDataSource() {
        super(true);
        this.e = 8000;
        byte[] bArr = new byte[2000];
        this.f = bArr;
        this.g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // androidx.media3.datasource.DataSource
    public final long a(DataSpec dataSpec) throws IOException {
        Uri uri = dataSpec.f2957a;
        this.h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.h.getPort();
        o(dataSpec);
        try {
            this.k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.k, port);
            if (this.k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.j = multicastSocket;
                multicastSocket.joinGroup(this.k);
                this.i = this.j;
            } else {
                this.i = new DatagramSocket(inetSocketAddress);
            }
            this.i.setSoTimeout(this.e);
            this.l = true;
            p(dataSpec);
            return -1L;
        } catch (IOException e) {
            throw new UdpDataSourceException(e, 2001);
        } catch (SecurityException e2) {
            throw new UdpDataSourceException(e2, 2006);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() throws IOException {
        this.h = null;
        MulticastSocket multicastSocket = this.j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.j = null;
        }
        DatagramSocket datagramSocket = this.i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.i = null;
        }
        this.k = null;
        this.m = 0;
        if (this.l) {
            this.l = false;
            n();
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.h;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.m;
        DatagramPacket datagramPacket = this.g;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.m = length;
                m(length);
            } catch (SocketTimeoutException e) {
                throw new UdpDataSourceException(e, 2002);
            } catch (IOException e2) {
                throw new UdpDataSourceException(e2, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.m;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.f, length2 - i4, bArr, i, iMin);
        this.m -= iMin;
        return iMin;
    }
}
