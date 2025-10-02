package com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kuukkkk;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes6.dex */
public class kkkkukk extends SSLSocketFactory {
    public static int g00670067g006700670067 = 46;
    public static int g0067gg006700670067 = 1;
    public static int gg0067g006700670067 = 2;
    public static int gggg006700670067;
    private static final String hhh0068006800680068 = kuukkkk.cc0063ccc0063(kkkkukk.class);
    private SSLSocketFactory h0068h0068006800680068;

    public kkkkukk() throws NoSuchAlgorithmException, KeyManagementException {
        try {
            SSLContext sSLContext = SSLContext.getInstance(kukuukk.kk006Bk006B006Bk("WPX", (char) (kuuukku.k006Bk006Bkk006B() ^ (-910233209)), (char) (kkuukku.kk006Bkkk006B() ^ (-1182535345))));
            sSLContext.init(null, null, null);
            this.h0068h0068006800680068 = sSLContext.getSocketFactory();
        } catch (GeneralSecurityException unused) {
            kuukkkk.kkkukkk.c0063c00630063cc(hhh0068006800680068, kukuukk.kkk006B006B006Bk("~%Jr[Z$\t\u0012\u001c\t\u0004xlP}{", (char) (kkuukku.kk006Bkkk006B() ^ (-1182535327)), (char) (kkuukku.kk006Bkkk006B() ^ (-1182535412)), (char) (kuuukku.k006Bk006Bkk006B() ^ (-910233343))));
        }
    }

    public static int g006700670067g00670067() {
        return 79;
    }

    public static int ggg0067006700670067() {
        return 2;
    }

    @Nullable
    private Socket k006Bkk006Bkk(@Nullable Socket socket) {
        if (socket instanceof SSLSocket) {
            try {
                ((SSLSocket) socket).setEnabledProtocols(new String[]{kukuukk.kkk006B006B006Bk("Yt\u0017e9Y\t", (char) (kkuukku.kk006Bkkk006B() ^ (-1182535218)), (char) (kkkkuku.kkkk006Bk006B() ^ 797363532), (char) (kkkkuku.kkkk006Bk006B() ^ 797363560))});
                int i = g00670067g006700670067;
                if (((g0067gg006700670067 + i) * i) % gg0067g006700670067 != gggg006700670067) {
                    g00670067g006700670067 = 20;
                    gggg006700670067 = g006700670067g00670067();
                    return socket;
                }
            } catch (IllegalArgumentException unused) {
                kuukkkk.kkkukkk.cc0063c00630063c(hhh0068006800680068, kukuukk.kkk006B006B006Bk("E^\u0001%\\DX$q\u0002f\u000f3Vq\u001bT\u00032`bB\u0013+\u0001\u001dV\u0019S)m7?0", (char) (kkkkuku.kkkk006Bk006B() ^ 797363487), (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121572), (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121611)));
            }
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    @Nullable
    public Socket createSocket(String str, int i) throws IOException {
        Socket socketK006Bkk006Bkk = k006Bkk006Bkk(this.h0068h0068006800680068.createSocket(str, i));
        if ((g006700670067g00670067() * (g006700670067g00670067() + g0067gg006700670067)) % gg0067g006700670067 != gggg006700670067) {
            g00670067g006700670067 = g006700670067g00670067();
            gggg006700670067 = 16;
        }
        return socketK006Bkk006Bkk;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.h0068h0068006800680068.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        SSLSocketFactory sSLSocketFactory = this.h0068h0068006800680068;
        if ((g006700670067g00670067() * (g006700670067g00670067() + g0067gg006700670067)) % gg0067g006700670067 != gggg006700670067) {
            gggg006700670067 = 35;
        }
        return sSLSocketFactory.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    @Nullable
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        int i3 = g00670067g006700670067;
        if (((g0067gg006700670067 + i3) * i3) % gg0067g006700670067 != gggg006700670067) {
            g00670067g006700670067 = 69;
            gggg006700670067 = 48;
        }
        return k006Bkk006Bkk(this.h0068h0068006800680068.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    @Nullable
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        int i2 = g00670067g006700670067;
        if (((g0067gg006700670067 + i2) * i2) % gg0067g006700670067 != 0) {
            g00670067g006700670067 = 2;
            gggg006700670067 = g006700670067g00670067();
        }
        return k006Bkk006Bkk(this.h0068h0068006800680068.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    @Nullable
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        SSLSocketFactory sSLSocketFactory = this.h0068h0068006800680068;
        int i3 = g00670067g006700670067;
        if (((g0067gg006700670067 + i3) * i3) % gg0067g006700670067 != 0) {
            g00670067g006700670067 = g006700670067g00670067();
            gggg006700670067 = 36;
        }
        return k006Bkk006Bkk(sSLSocketFactory.createSocket(inetAddress, i, inetAddress2, i2));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @Nullable
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket socketCreateSocket = this.h0068h0068006800680068.createSocket(socket, str, i, z);
        int i2 = g00670067g006700670067;
        if (((g0067gg006700670067 + i2) * i2) % gg0067g006700670067 != gggg006700670067) {
            g00670067g006700670067 = 10;
            gggg006700670067 = g006700670067g00670067();
        }
        return k006Bkk006Bkk(socketCreateSocket);
    }
}
