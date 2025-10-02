package com.lexisnexisrisk.threatmetrix.rl.tmxbhs;

import com.behaviosec.rl.android.IBehavioSecChunkConnector;
import com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface;
import com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xlxlxlx;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class xxlxxlx implements IBehavioSecChunkConnector {
    public static int f0066f0066f0066f = 2;
    public static int f0066fff0066f = 1;
    public static int fff0066f0066f = 0;
    public static int fffff0066f = 17;
    private static final String q007100710071q00710071 = xlxlxlx.t0074tt0074t0074(xxlxxlx.class);
    private xlllxlx qqqq007100710071;

    static {
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                fffff0066f = f00660066ff0066f();
                return;
            }
        }
    }

    public xxlxxlx(xlllxlx xlllxlxVar) {
        this.qqqq007100710071 = xlllxlxVar;
    }

    public static int f00660066ff0066f() {
        return 92;
    }

    public static int ff0066ff0066f() {
        return 2;
    }

    public static /* synthetic */ String t0074t0074tt0074() {
        String str = q007100710071q00710071;
        int i = fffff0066f;
        if (((f0066fff0066f + i) * i) % f0066f0066f0066f != fff0066f0066f) {
            fffff0066f = 77;
            fff0066f0066f = f00660066ff0066f();
        }
        return str;
    }

    @Override // com.behaviosec.rl.android.IBehavioSecChunkConnector
    public void sendData(Map<String, String> map) throws Exception {
        if (this.qqqq007100710071 == null || map == null || map.isEmpty()) {
            return;
        }
        String str = this.qqqq007100710071.vv007600760076v0076.get(xlxllxl.r007200720072r0072r("OBQRIPPBMI", (char) (jkkkjjj.rrr007200720072r() ^ 1252464303), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858866), (char) (jjjjkjj.rrrrrr0072() ^ 2074272513)));
        String strT0074007400740074t0074 = xlxxllx.t0074007400740074t0074(map);
        if (strT0074007400740074t0074 == null) {
            String str2 = q007100710071q00710071;
            char cRrrrrr0072 = (char) (jjjjkjj.rrrrrr0072() ^ 2074272522);
            int i = fffff0066f;
            if (((f0066fff0066f + i) * i) % ff0066ff0066f() != 0) {
                fffff0066f = f00660066ff0066f();
                f0066fff0066f = 75;
            }
            xlxlxlx.xxllxlx.e(str2, xlxllxl.r007200720072r0072r("8A;,\u0017\u00041s`~41\u0016\u007f\u0005co1$\u0010xkV|5/\u001e\n.>SD\u000f\u0012vj@@0Z\u0016\tri^G-.thY", cRrrrrr0072, (char) (jjjjkjj.rrrrrr0072() ^ 2074272661), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105816)));
            return;
        }
        String str3 = q007100710071q00710071;
        xlxlxlx.xxllxlx.d(str3, xlxllxl.r007200720072r0072r("SFUVMTT\u0007QM\nT_\r", (char) (jjjjkjj.rrrrrr0072() ^ 2074272684), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105837), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105821)) + str + xlxllxl.r007200720072r0072r("ff\u001f%5n-l._Xj1\u0016", (char) (jjkjkjj.r00720072rrr0072() ^ 1742858920), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105957), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105820)) + strT0074007400740074t0074);
        String strTtt0074t00740074 = xlxxllx.ttt0074t00740074(strT0074007400740074t0074, str);
        if (strTtt0074t00740074 == null) {
            xlxlxlx.xxllxlx.e(str3, xlxllxl.r007200720072r0072r(":TWDxd\t\u001b!,XZ9)*IZ\u007f?-!u3DXr\u000b\b\u001a]\\<\b\u0016lS", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105768), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105879), (char) (jkkkjjj.rrr007200720072r() ^ 1252464215)));
            return;
        }
        HashMap map2 = new HashMap(this.qqqq007100710071.vv007600760076v0076);
        map2.put(xlxllxl.r0072r0072r0072r("/&", (char) (jjkjkjj.r00720072rrr0072() ^ 1742858835), (char) (jkkkjjj.rrr007200720072r() ^ 1252464210)), strTtt0074t00740074);
        byte[] bArrTt0074tt00740074 = xlxxllx.tt0074tt00740074(map2, true);
        if (bArrTt0074tt00740074 == null) {
            return;
        }
        Map<String, String> map3 = this.qqqq007100710071.v0076007600760076v0076;
        map3.put(xlxllxl.r0072r0072r0072r("\u001dv&QT#\u0013\u0015\u0014JER", (char) (jjjjkjj.rrrrrr0072() ^ 2074272662), (char) (jjjjkjj.rrrrrr0072() ^ 2074272524)), xlxllxl.r0072r0072r0072r("cstqoji}szz<\u0007<\b\t\n@z\u0005\t\u0005E\u000f\r\b\u0002\f\u0002\u000f\u0005\u0007\u0007", (char) (jjkjkjj.r00720072rrr0072() ^ 1742858860), (char) (jkkkjjj.rrr007200720072r() ^ 1252464213)));
        map3.put(xlxllxl.r007200720072r0072r("Lwuzjrw/Fnbmaeia", (char) (jkkkjjj.rrr007200720072r() ^ 1252464287), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858950), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858861)), xlxllxl.r0072r0072r0072r("!5%-", (char) (jkkkjjj.rrr007200720072r() ^ 1252464239), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105822)));
        map3.put(xlxllxl.r0072r0072r0072r("j\u0018\u0018\u001f\u0011\u001b\"[{\u0016 \u001a(\u001d", (char) (jjjjkjj.rrrrrr0072() ^ 2074272521), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858859)), Integer.toString(bArrTt0074tt00740074.length));
        xlllxlx xlllxlxVar = this.qqqq007100710071;
        xlllxlxVar.v0076v0076v00760076.httpRequest(TMXProfilingConnectionsInterface.HttpMethod.POST, xlllxlxVar.v0076v00760076v0076, map3, bArrTt0074tt00740074, new TMXProfilingConnectionsInterface.TMXCallback() { // from class: com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xxlxxlx.1
            public static int f00660066f00660066f = 2;
            public static int f0066ff00660066f = 0;
            public static int ff0066f00660066f = 1;
            public static int ffff00660066f = 38;

            public static int fff006600660066f() {
                return 37;
            }

            @Override // com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface.TMXCallback
            public boolean onComplete(@Nonnull TMXProfilingConnectionsInterface.TMXHttpResponseCode tMXHttpResponseCode, @Nullable InputStream inputStream) {
                if (tMXHttpResponseCode.succeeded()) {
                    return true;
                }
                String strT0074t0074tt0074 = xxlxxlx.t0074t0074tt0074();
                StringBuilder sb = new StringBuilder();
                char cRr0072rrr0072 = (char) (jkjjkjj.rr0072rrr0072() ^ 1132105787);
                int i2 = ffff00660066f;
                if (((ff0066f00660066f + i2) * i2) % f00660066f00660066f != f0066ff00660066f) {
                    ffff00660066f = 5;
                    f0066ff00660066f = fff006600660066f();
                }
                sb.append(xlxllxl.r0072r0072r0072r("'CLPJJ\u0007\\X\n^Q[R\u000f2VZTj^eJ]\\\u001adjcmqmbvlss@'", cRr0072rrr0072, (char) (jjkjkjj.r00720072rrr0072() ^ 1742858856)));
                sb.append(tMXHttpResponseCode);
                xlxlxlx.xxllxlx.e(strT0074t0074tt0074, sb.toString());
                return true;
            }
        });
    }
}
