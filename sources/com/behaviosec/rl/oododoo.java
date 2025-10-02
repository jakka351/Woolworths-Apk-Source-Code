package com.behaviosec.rl;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.behaviosec.rl.android.SyncedJSONArray;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class oododoo {
    public static final String EVENT_BLUR;
    public static final String EVENT_FOCUS;
    public static int p007000700070p0070p0070 = 81;
    private static final AtomicInteger p00700070p007000700070;
    private static final String p0070pp007000700070;
    public static int p0070pp00700070p0070 = 1;
    private static final String pp0070p007000700070;
    public static int pp0070p00700070p0070 = 2;
    private static final String pppp007000700070 = uuxuuuu.pp0070p0070ppp(RequestConfiguration.MAX_AD_CONTENT_RATING_T, (char) (ylyylll.r0072rrr00720072() ^ (-1691741204)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847149)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335)));
    public static int pppp00700070p0070;
    private SyncedJSONArray p007000700070p00700070 = new SyncedJSONArray();
    private long pp00700070p00700070;

    static {
        int i = p007000700070p0070p0070;
        if (((p0070pp00700070p0070 + i) * i) % pp0070007000700070p0070() != 0) {
            p007000700070p0070p0070 = 54;
            pppp00700070p0070 = p00700070p00700070p0070();
        }
        EVENT_BLUR = uuxuuuu.pppp0070ppp("\u001a", (char) (yllylll.r007200720072r00720072() ^ (-1146716843)), (char) (yllylll.r007200720072r00720072() ^ (-1146716785)));
        EVENT_FOCUS = uuxuuuu.pp0070p0070ppp("{", (char) (yylylll.r0072r0072r00720072() ^ (-1349847170)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741387)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333)));
        p0070pp007000700070 = uuxuuuu.pp0070p0070ppp("e", (char) (yylylll.r0072r0072r00720072() ^ (-1349847170)), (char) (yllylll.r007200720072r00720072() ^ (-1146716684)), (char) (yyyllll.rrrr007200720072() ^ 383821867));
        pp0070p007000700070 = uuxuuuu.pp0070p0070ppp("n", (char) (yllylll.r007200720072r00720072() ^ (-1146716846)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847192)), (char) (yllylll.r007200720072r00720072() ^ (-1146716790)));
        p00700070p007000700070 = new AtomicInteger(0);
    }

    public oododoo() {
        clearData();
    }

    public static int p00700070p00700070p0070() {
        return 24;
    }

    public static int p0070p007000700070p0070() {
        return 0;
    }

    public static int pp0070007000700070p0070() {
        return 2;
    }

    public static int ppp007000700070p0070() {
        return 1;
    }

    public static void resetCounters() {
        p00700070p007000700070.set(0);
        int i = p007000700070p0070p0070;
        if (((p0070pp00700070p0070 + i) * i) % pp0070p00700070p0070 != p0070p007000700070p0070()) {
            p007000700070p0070p0070 = p00700070p00700070p0070();
            pppp00700070p0070 = p00700070p00700070p0070();
        }
    }

    private JSONArray v00760076v0076vv() {
        JSONArray jSONArray = this.p007000700070p00700070.getJSONArray();
        int i = p007000700070p0070p0070;
        if (((ppp007000700070p0070() + i) * i) % pp0070p00700070p0070 != 0) {
            p007000700070p0070p0070 = 77;
            pppp00700070p0070 = 79;
        }
        return jSONArray;
    }

    private void v0076vv0076vv(@NonNull String str, long j, @NonNull String str2) {
        SyncedJSONArray syncedJSONArray = this.p007000700070p00700070;
        JSONArray jSONArray = new JSONArray();
        int i = p007000700070p0070p0070;
        if (((p0070pp00700070p0070 + i) * i) % pp0070p00700070p0070 != pppp00700070p0070) {
            p007000700070p0070p0070 = 48;
            pppp00700070p0070 = p00700070p00700070p0070();
        }
        syncedJSONArray.put(jSONArray.put(str).put(j).put(str2));
    }

    @NonNull
    private String vv0076v0076vv(@NonNull String str) {
        int iIndexOf = str.indexOf(uuxuuuu.pppp0070ppp("d\u0001f", (char) (yyyllll.rrrr007200720072() ^ 383821930), (char) (yyyllll.rrrr007200720072() ^ 383821870)));
        return iIndexOf != -1 ? str.substring(0, iIndexOf) : str;
    }

    private void vvvv0076vv(@NonNull String str, long j, long j2) {
        SyncedJSONArray syncedJSONArray = this.p007000700070p00700070;
        int i = p007000700070p0070p0070;
        if (((p0070pp00700070p0070 + i) * i) % pp0070p00700070p0070 != pppp00700070p0070) {
            p007000700070p0070p0070 = 49;
            pppp00700070p0070 = p00700070p00700070p0070();
        }
        syncedJSONArray.put(new JSONArray().put(str).put(j).put(j2));
    }

    public void addBKEvent(@NonNull String str, int i) {
        SyncedJSONArray syncedJSONArray = this.p007000700070p00700070;
        JSONArray jSONArrayPut = new JSONArray().put(str).put(SystemClock.uptimeMillis() - this.pp00700070p00700070);
        int i2 = p007000700070p0070p0070;
        if (((p0070pp00700070p0070 + i2) * i2) % pp0070p00700070p0070 != 0) {
            p007000700070p0070p0070 = p00700070p00700070p0070();
            pppp00700070p0070 = p00700070p00700070p0070();
        }
        syncedJSONArray.put(jSONArrayPut.put(i));
    }

    public Map<String, String> addChunkData(Map<String, String> map, int i) {
        if ((p00700070p00700070p0070() * (p00700070p00700070p0070() + p0070pp00700070p0070)) % pp0070007000700070p0070() != pppp00700070p0070) {
            p007000700070p0070p0070 = p00700070p00700070p0070();
            pppp00700070p0070 = p00700070p00700070p0070();
        }
        SyncedJSONArray syncedJSONArray = this.p007000700070p00700070;
        if (syncedJSONArray != null && syncedJSONArray.length() > 0) {
            map.put(uuxuuuu.pppp0070ppp("QXdT^", (char) (yylylll.r0072r0072r00720072() ^ (-1349847107)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336))), new JSONArray().put(new JSONArray().put(i).put(this.p007000700070p00700070.getJSONArray())).toString());
            map.put(uuxuuuu.pppp0070ppp(":AM=G<GMDFZ", (char) (yylylll.r0072r0072r00720072() ^ (-1349847143)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847046))), String.valueOf(p00700070p007000700070.getAndIncrement()));
        }
        return map;
    }

    public void clearChunk() {
        this.p007000700070p00700070.clear();
    }

    public void clearData() {
        this.p007000700070p00700070.clear();
        this.pp00700070p00700070 = SystemClock.uptimeMillis();
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("8", (char) (ylyylll.r0072rrr00720072() ^ (-1691741320)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791)));
        long j = this.pp00700070p00700070;
        int i = p007000700070p0070p0070;
        if (((p0070pp00700070p0070 + i) * i) % pp0070p00700070p0070 != 0) {
            p007000700070p0070p0070 = 30;
            pppp00700070p0070 = 33;
        }
        vvvv0076vv(strPppp0070ppp, 0L, j);
    }

    public JSONArray getChunkData() {
        SyncedJSONArray syncedJSONArray = this.p007000700070p00700070;
        if (syncedJSONArray == null || syncedJSONArray.length() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
        int i = p007000700070p0070p0070;
        if (((p0070pp00700070p0070 + i) * i) % pp0070p00700070p0070 != 0) {
            p007000700070p0070p0070 = 80;
            pppp00700070p0070 = p00700070p00700070p0070();
        }
        return jSONArray.put(uuxuuuu.pppp0070ppp("\u001f", (char) (iR0072r0072r00720072 ^ (-1349847119)), (char) (yyyllll.rrrr007200720072() ^ 383821858))).put(uuxuuuu.pp0070p0070ppp("j", (char) (yylylll.r0072r0072r00720072() ^ (-1349847281)), (char) (yllylll.r007200720072r00720072() ^ (-1146716810)), (char) (yllylll.r007200720072r00720072() ^ (-1146716789)))).put(new JSONObject()).put(v00760076v0076vv());
    }

    public JSONArray getData() {
        return new JSONArray().put(uuxuuuu.pppp0070ppp("\u000f", (char) (yllylll.r007200720072r00720072() ^ (-1146716894)), (char) (yllylll.r007200720072r00720072() ^ (-1146716790)))).put(uuxuuuu.pp0070p0070ppp("<", (char) (ylyylll.r0072rrr00720072() ^ (-1691741274)), (char) (yyyllll.rrrr007200720072() ^ 383821996), (char) (yyyllll.rrrr007200720072() ^ 383821865))).put(new JSONObject()).put(v00760076v0076vv());
    }

    public void onPause() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        char cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741233));
        char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716787));
        int i = p007000700070p0070p0070;
        if (((ppp007000700070p0070() + i) * i) % pp0070p00700070p0070 != 0) {
            p007000700070p0070p0070 = 86;
            pppp00700070p0070 = p00700070p00700070p0070();
        }
        vvvv0076vv(uuxuuuu.pppp0070ppp("\u001a", cR0072rrr00720072, cR007200720072r00720072), jUptimeMillis - this.pp00700070p00700070, jUptimeMillis);
    }

    public void onResume() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("[", (char) (yylylll.r0072r0072r00720072() ^ (-1349847164)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792)));
        long j = jUptimeMillis - this.pp00700070p00700070;
        int i = p007000700070p0070p0070;
        if (((p0070pp00700070p0070 + i) * i) % pp0070p00700070p0070 != p0070p007000700070p0070()) {
            p007000700070p0070p0070 = p00700070p00700070p0070();
            pppp00700070p0070 = 62;
        }
        vvvv0076vv(strPppp0070ppp, j, jUptimeMillis);
    }

    public void addBKEvent(@NonNull String str, @NonNull String str2) {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.pp00700070p00700070;
        int i = p007000700070p0070p0070;
        if (((p0070pp00700070p0070 + i) * i) % pp0070p00700070p0070 != pppp00700070p0070) {
            p007000700070p0070p0070 = p00700070p00700070p0070();
            pppp00700070p0070 = p00700070p00700070p0070();
        }
        v0076vv0076vv(str, jUptimeMillis, vv0076v0076vv(str2));
    }
}
