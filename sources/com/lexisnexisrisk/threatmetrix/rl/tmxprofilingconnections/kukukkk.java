package com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nonnull;

/* loaded from: classes6.dex */
public class kukukkk {
    public static int g00670067gg0067g = 78;
    public static int g0067g0067g0067g = 1;
    public static int gg00670067g0067g = 2;
    public static int gggg00670067g = 0;
    private static final int h0068hh0068h0068 = 65535;
    private static final kukukkk hh0068h0068h0068 = new kukukkk();
    private static int hhh00680068h0068;
    private final Map<String, Socket> h00680068h0068h0068 = new ConcurrentHashMap();

    static {
        int i = g00670067gg0067g;
        if (((g0067g0067g0067g + i) * i) % gg00670067g0067g != ggg0067g0067g()) {
            g00670067gg0067g = g006700670067g0067g();
            gggg00670067g = 94;
        }
        hhh00680068h0068 = ModuleDescriptor.MODULE_VERSION;
    }

    private kukukkk() {
    }

    @Nonnull
    public static kukukkk c0063006300630063c0063() {
        kukukkk kukukkkVar = hh0068h0068h0068;
        int i = g00670067gg0067g;
        if (((g0067g0067g0067g + i) * i) % gg00670067g0067g != gggg00670067g) {
            g00670067gg0067g = g006700670067g0067g();
            gggg00670067g = 86;
        }
        return kukukkkVar;
    }

    public static int g006700670067g0067g() {
        return 54;
    }

    public static int g0067g006700670067g() {
        return 1;
    }

    public static int gg0067006700670067g() {
        return 2;
    }

    public static int ggg0067g0067g() {
        return 0;
    }

    public void cc006300630063c0063(String str, int i, Socket socket) {
        Map<String, Socket> map = this.h00680068h0068h0068;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int i2 = g00670067gg0067g;
        if (((g0067g0067g0067g + i2) * i2) % gg00670067g0067g != ggg0067g0067g()) {
            g00670067gg0067g = g006700670067g0067g();
            g0067g0067g0067g = 69;
        }
        sb.append(i);
        map.put(sb.toString(), socket);
    }

    public Socket ccccc00630063(String str, int i) throws IOException {
        Socket socket = this.h00680068h0068h0068.get(str + i);
        if (socket != null) {
            return socket;
        }
        Socket socket2 = new Socket();
        socket2.connect(new InetSocketAddress(str, i), hhh00680068h0068);
        socket2.setSoTimeout(hhh00680068h0068);
        Map<String, Socket> map = this.h00680068h0068h0068;
        StringBuilder sb = new StringBuilder();
        int i2 = g00670067gg0067g;
        if (((g0067g0067g0067g + i2) * i2) % gg00670067g0067g != gggg00670067g) {
            g00670067gg0067g = g006700670067g0067g();
            gggg00670067g = 50;
        }
        sb.append(str);
        sb.append(i);
        map.put(sb.toString(), socket2);
        return socket2;
    }

    public synchronized void closeSocket(String str, int i) {
        Socket socket = this.h00680068h0068h0068.get(str + i);
        if (socket == null) {
            return;
        }
        try {
            try {
                Class.forName(kukuukk.kkk006B006B006Bk("~t\tr>}s\u0002:^ylslz", (char) (kkkkuku.kkkk006Bk006B() ^ 797363529), (char) (kkuukku.kk006Bkkk006B() ^ (-1182535282)), (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121613))).getMethod(kukuukk.kk006Bk006B006Bk("w\u0002\u0006\u000bu", (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121574), (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121609)), null).invoke(socket, null);
                int i2 = g00670067gg0067g;
                if (((g0067g006700670067g() + i2) * i2) % gg0067006700670067g() != 0) {
                    g00670067gg0067g = 75;
                    gggg00670067g = 0;
                }
            } catch (InvocationTargetException e) {
                throw e.getCause();
            }
        } catch (IOException unused) {
        }
        this.h00680068h0068h0068.remove(str + i);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0143 A[Catch: all -> 0x00c0, Exception -> 0x00da, IOException -> 0x0147, UnknownHostException -> 0x014d, IllegalArgumentException -> 0x0153, TRY_LEAVE, TryCatch #5 {Exception -> 0x00da, blocks: (B:3:0x0001, B:6:0x000d, B:13:0x001d, B:15:0x0062, B:17:0x0068, B:20:0x00a5, B:21:0x00a8, B:64:0x0158, B:41:0x00de, B:42:0x00e2, B:53:0x013e, B:54:0x0142, B:55:0x0143, B:58:0x0149), top: B:71:0x0001, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void sendSocketRequest(java.lang.String r10, int r11, byte[] r12, boolean r13, com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface.TMXCallback r14) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kukukkk.sendSocketRequest(java.lang.String, int, byte[], boolean, com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface$TMXCallback):void");
    }
}
