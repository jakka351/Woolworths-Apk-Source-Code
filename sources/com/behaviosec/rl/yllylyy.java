package com.behaviosec.rl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Looper;
import com.behaviosec.rl.android.LogBridge;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class yllylyy {
    public static int h00680068hh00680068h = 17;
    public static int h0068h0068h00680068h = 1;
    public static int hh00680068h00680068h = 2;
    public static int hhh0068h00680068h;
    private static yllylyy x0078x007800780078x;
    private static final String x0078x0078x0078x;
    private Object x007800780078x0078x;
    private LocationCallback x0078xx00780078x;
    private final Context xx00780078x0078x;
    private Geocoder xx0078x00780078x;
    private LocationRequest xxxx00780078x;
    private boolean x00780078x00780078x = false;
    private final List<JSONObject> xxx007800780078x = new ArrayList();

    static {
        int i = h00680068hh00680068h;
        if (((h0068h0068h00680068h + i) * i) % hh00680068h00680068h != 0) {
            h00680068hh00680068h = 48;
            hhh0068h00680068h = 53;
        }
        x0078x0078x0078x = uuxuuuu.pppp0070ppp("1SFCUINL KGF>;KEG", (char) (yylylll.r0072r0072r00720072() ^ (-1349847105)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335)));
    }

    public yllylyy(Context context) throws Exception {
        this.xx00780078x0078x = context;
        dd00640064dd0064(context);
    }

    public static /* synthetic */ void d00640064006400640064d(yllylyy yllylyyVar, List list) {
        int i = h00680068hh00680068h;
        if (((h0068h0068h00680068h + i) * i) % hh00680068h00680068h != hhh0068h00680068h) {
            h00680068hh00680068h = 18;
            hhh0068h00680068h = 78;
        }
        yllylyyVar.dd0064ddd0064(list);
    }

    public static boolean d006400640064dd0064(Context context) throws Throwable {
        boolean z;
        try {
            PackageManager packageManager = (PackageManager) Class.forName(uuxuuuu.pp0070p0070ppp("JXO^\\WS\u001eDQQXJT[\u0016<iipbvs", (char) (yllylll.r007200720072r00720072() ^ (-1146716770)), (char) (yyyllll.rrrr007200720072() ^ 383821866), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335)))).getMethod(uuxuuuu.pppp0070ppp("lk{Xjmvmts\\q\u007fszy\b", (char) (yllylll.r007200720072r00720072() ^ (-1146716763)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336))), null).invoke(context, null);
            if (packageManager.checkPermission(uuxuuuu.pppp0070ppp("\u0010\u001c\u0011\u001e\u001a\u0013\rU\u0017\u000b\u0017\u0011\f\u0015\u0014\t\u000e\fJ\\]\\]jitWbSccTmY[NK]QVT", (char) (ylyylll.r0072rrr00720072() ^ (-1691741255)), (char) (yyyllll.rrrr007200720072() ^ 383821868)), context.getPackageName()) == 0) {
                int i = h00680068hh00680068h;
                if (((h0068h0068h00680068h + i) * i) % hh00680068h00680068h != 0) {
                    h00680068hh00680068h = 6;
                    hhh0068h00680068h = h006800680068h00680068h();
                }
                z = true;
            } else {
                z = false;
            }
            return z || (packageManager.checkPermission(uuxuuuu.pp0070p0070ppp(" .%42-)s7-;74?@7>>~\u0013\u0016\u0017\u001a)*7\u001f#)!<*.#\"6,33", (char) (yllylll.r007200720072r00720072() ^ (-1146716740)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741215)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741334))), context.getPackageName()) == 0);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0064dddd0064(Location location, JSONObject jSONObject) {
        try {
            if (d006400640064dd0064(this.xx00780078x0078x)) {
                try {
                    List<Address> fromLocation = this.xx0078x00780078x.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
                    if (fromLocation != null && !fromLocation.isEmpty()) {
                        Address address = fromLocation.get(0);
                        jSONObject.put(uuxuuuu.pppp0070ppp("|\b\r\u0005\n\u0007\r", (char) (ylyylll.r0072rrr00720072() ^ (-1691741300)), (char) (yyyllll.rrrr007200720072() ^ 383821868)), address.getCountryName());
                        jSONObject.put(uuxuuuu.pp0070p0070ppp("Ydiafci2]QQ", (char) (yyyllll.rrrr007200720072() ^ 383821869), (char) (yylylll.r0072r0072r00720072() ^ (-1349847159)), (char) (yyyllll.rrrr007200720072() ^ 383821870)), address.getCountryCode());
                        int i = h00680068hh00680068h;
                        if (((h0068h0068h00680068h + i) * i) % hh00680068h00680068h != hhh0068h00680068h) {
                            h00680068hh00680068h = h006800680068h00680068h();
                            hhh0068h00680068h = 89;
                        }
                        jSONObject.put(uuxuuuu.pp0070p0070ppp("9/9H*\"#\n\n", (char) (yylylll.r0072r0072r00720072() ^ (-1349847199)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741382)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741331))), address.getAdminArea() != null ? address.getAdminArea() : address.getSubAdminArea());
                        jSONObject.put(uuxuuuu.pppp0070ppp("IK>;EAKO", (char) (yyyllll.rrrr007200720072() ^ 383821982), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056))), address.getLocality() != null ? address.getLocality() : address.getSubLocality());
                    }
                    this.xxx007800780078x.add(jSONObject);
                } catch (IOException e) {
                    e = e;
                    Throwable th = e;
                    LogBridge.e(uuxuuuu.pppp0070ppp("RtgdvjomAlhg_\\lfh", (char) (yllylll.r007200720072r00720072() ^ (-1146716815)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051))), th.getMessage(), th);
                    this.xxx007800780078x.add(jSONObject);
                } catch (JSONException e2) {
                    e = e2;
                    Throwable th2 = e;
                    LogBridge.e(uuxuuuu.pppp0070ppp("RtgdvjomAlhg_\\lfh", (char) (yllylll.r007200720072r00720072() ^ (-1146716815)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051))), th2.getMessage(), th2);
                    this.xxx007800780078x.add(jSONObject);
                }
            }
        } catch (Throwable th3) {
            this.xxx007800780078x.add(jSONObject);
            throw th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void dd00640064dd0064(android.content.Context r6) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.behaviosec.rl.yllylyy.dd00640064dd0064(android.content.Context):void");
    }

    private void dd0064ddd0064(List<Location> list) {
        if (d006400640064dd0064(this.xx00780078x0078x)) {
            synchronized (this.xxx007800780078x) {
                try {
                    for (final Location location : list) {
                        try {
                            final JSONObject jSONObject = new JSONObject();
                            jSONObject.put(uuxuuuu.pp0070p0070ppp("\u0001Cp", (char) (yylylll.r0072r0072r00720072() ^ (-1349847272)), (char) (yllylll.r007200720072r00720072() ^ (-1146716674)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))), location.getLatitude());
                            jSONObject.put(uuxuuuu.pp0070p0070ppp("P\u000b\u0007", (char) (yllylll.r007200720072r00720072() ^ (-1146716910)), (char) (yllylll.r007200720072r00720072() ^ (-1146716810)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))), location.getLongitude());
                            jSONObject.put(uuxuuuu.pp0070p0070ppp(":DK", (char) (yylylll.r0072r0072r00720072() ^ (-1349847064)), (char) (yllylll.r007200720072r00720072() ^ (-1146716796)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))), location.getAltitude());
                            jSONObject.put(uuxuuuu.pp0070p0070ppp("\u001a}", (char) (yyyllll.rrrr007200720072() ^ 383822066), (char) (yylylll.r0072r0072r00720072() ^ (-1349847073)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))), location.getTime());
                            if (location.isFromMockProvider()) {
                                jSONObject.put(uuxuuuu.pppp0070ppp("69.7", (char) (yllylll.r007200720072r00720072() ^ (-1146716783)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792))), true);
                            }
                            if (Geocoder.isPresent()) {
                                new Thread(new Runnable() { // from class: com.behaviosec.rl.yllylyy.2
                                    public static int h006800680068006800680068h = 1;
                                    public static int h0068h0068006800680068h = 99;
                                    public static int hh00680068006800680068h = 0;
                                    public static int hhhhhhh0068 = 2;

                                    public static int h0068hhhhh0068() {
                                        return 77;
                                    }

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        int i = h0068h0068006800680068h;
                                        if (((h006800680068006800680068h + i) * i) % hhhhhhh0068 != hh00680068006800680068h) {
                                            h0068h0068006800680068h = h0068hhhhh0068();
                                            hh00680068006800680068h = h0068hhhhh0068();
                                        }
                                        yllylyy.this.d0064dddd0064(location, jSONObject);
                                    }
                                }).start();
                            } else {
                                this.xxx007800780078x.add(jSONObject);
                            }
                        } catch (JSONException e) {
                            LogBridge.e(uuxuuuu.pp0070p0070ppp("0\u0003k^'\u0019\u0014\b\u0012+\u001dR@;Aog", (char) ((-1146716910) ^ yllylll.r007200720072r00720072()), (char) (yllylll.r007200720072r00720072() ^ (-1146716802)), (char) ((-1146716791) ^ yllylll.r007200720072r00720072())), e.getMessage(), e);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static synchronized yllylyy ddd0064dd0064(Context context) {
        int i = 5;
        while (true) {
            try {
                i /= 0;
            } catch (Exception unused) {
                try {
                    throw null;
                } catch (Exception unused2) {
                    while (true) {
                        try {
                            int[] iArr = new int[-1];
                        } catch (Exception unused3) {
                            return null;
                        }
                    }
                }
            }
        }
    }

    public static int h006800680068h00680068h() {
        return 70;
    }

    public static int hhhh006800680068h() {
        return 0;
    }

    public void d00640064ddd0064() {
        synchronized (this.xxx007800780078x) {
            this.xxx007800780078x.clear();
        }
    }

    public JSONArray d0064d0064dd0064() {
        if (!this.x00780078x00780078x || !d006400640064dd0064(this.xx00780078x0078x)) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        synchronized (this.xxx007800780078x) {
            try {
                Iterator<JSONObject> it = this.xxx007800780078x.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        jSONArray.put(uuxuuuu.pppp0070ppp("tz", (char) (ylyylll.r0072rrr00720072() ^ (-1691741268)), (char) (yllylll.r007200720072r00720072() ^ (-1146716799))));
        jSONArray.put(uuxuuuu.pp0070p0070ppp("\u001d", (char) (yyyllll.rrrr007200720072() ^ 383821827), (char) (yylylll.r0072r0072r00720072() ^ (-1349847272)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))));
        jSONArray.put(jSONArray2);
        return jSONArray;
    }

    @SuppressLint
    public void d0064dd0064d0064() throws Exception {
        if (this.x00780078x00780078x && d006400640064dd0064(this.xx00780078x0078x)) {
            try {
                try {
                    Class<?> cls = this.x007800780078x0078x.getClass();
                    try {
                        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("5#33'16\n1!#2+-0\u00132\"#2'1", (char) (yyyllll.rrrr007200720072() ^ 383821929), (char) (yyyllll.rrrr007200720072() ^ 383822037), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051)));
                        Class<?>[] clsArr = new Class[3];
                        clsArr[0] = LocationRequest.class;
                        clsArr[1] = LocationCallback.class;
                        clsArr[2] = Looper.class;
                        cls.getMethod(strPp0070p0070ppp, clsArr).invoke(this.x007800780078x0078x, this.xxxx00780078x, this.x0078xx00780078x, Looper.getMainLooper());
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    String strPppp0070ppp = uuxuuuu.pppp0070ppp("5YNMaW^^4a_`ZYkgk", (char) (ylyylll.r0072rrr00720072() ^ (-1691741439)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050)));
                    char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716902));
                    char cR007200720072r007200722 = (char) (yllylll.r007200720072r00720072() ^ (-1146716787));
                    int i = h00680068hh00680068h;
                    if (((h0068h0068h00680068h + i) * i) % hh00680068h00680068h != hhh0068h00680068h) {
                        h00680068hh00680068h = h006800680068h00680068h();
                        hhh0068h00680068h = h006800680068h00680068h();
                    }
                    LogBridge.i(strPppp0070ppp, uuxuuuu.pppp0070ppp("Wv\u0005\u0006\b\u000e:\u0011\u0010\u0003>k\u0010\u0005\u0004\u0018\u000e\u0015\u0015j\u0018\u0016\u0017\u0011\u0010\"\u001e\"", cR007200720072r00720072, cR007200720072r007200722));
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    public void dd0064d0064d0064() throws Exception {
        String strPp0070p0070ppp;
        char cR0072r0072r00720072;
        char cR0072rrr00720072;
        String str;
        if (this.x00780078x00780078x && d006400640064dd0064(this.xx00780078x0078x)) {
            try {
                this.x007800780078x0078x.getClass().getMethod(uuxuuuu.pppp0070ppp("'\u001b$'/\u001f\u0007+ \u001f3)00\u00184)';-<", (char) (yylylll.r0072r0072r00720072() ^ (-1349847098)), (char) (yllylll.r007200720072r00720072() ^ (-1146716787))), LocationCallback.class).invoke(this.x007800780078x0078x, this.x0078xx00780078x);
            } catch (IllegalAccessException unused) {
                strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("`\u0005yx\r\u0003\n\n_\r\u000b\f\u0006\u0005\u0017\u0013\u0017", (char) (yllylll.r007200720072r00720072() ^ (-1146716825)), (char) (yyyllll.rrrr007200720072() ^ 383822065), (char) (yllylll.r007200720072r00720072() ^ (-1146716792)));
                cR0072r0072r00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741256));
                cR0072rrr00720072 = (char) (yyyllll.rrrr007200720072() ^ 383821868);
                str = "p\u000e\u001a\u0019\u0019\u001dG\u001c\u0019\nCn\u0011\u0004\u0001\u0013\u0007\f\n]\t\u0005\u0004{x\t\u0003\u0005";
                LogBridge.i(strPp0070p0070ppp, uuxuuuu.pppp0070ppp(str, cR0072r0072r00720072, cR0072rrr00720072));
            } catch (NoSuchMethodException unused2) {
                LogBridge.i(uuxuuuu.pppp0070ppp("d\u0007}z\u0011\u0005\u000e\fS~~}yv\u000b\u0005z", (char) (ylyylll.r0072rrr00720072() ^ (-1691741297)), (char) (yllylll.r007200720072r00720072() ^ (-1146716800))), uuxuuuu.pp0070p0070ppp("n5`eD\u001d\"q(H\u001f\u0010\u0015n$*9\r3.s2\u0007q$s]\u0004", (char) (yllylll.r007200720072r00720072() ^ (-1146716893)), (char) (yllylll.r007200720072r00720072() ^ (-1146716826)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333))));
                int i = h00680068hh00680068h;
                if (((h0068h0068h00680068h + i) * i) % hh00680068h00680068h != hhh0068h00680068h) {
                    h00680068hh00680068h = 63;
                    hhh0068h00680068h = 61;
                }
            } catch (InvocationTargetException unused3) {
                strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("\\~qn\u0001tywKvrqifvpr", (char) (ylyylll.r0072rrr00720072() ^ (-1691741433)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741417)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049)));
                cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847218));
                cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741334));
                str = "\u0001ON+k\u001c'd\u001c-e4\rz\u0005=Ui xN\u0017A6=n\u000bY";
                LogBridge.i(strPp0070p0070ppp, uuxuuuu.pppp0070ppp(str, cR0072r0072r00720072, cR0072rrr00720072));
            } catch (Exception e) {
                throw e;
            }
        }
    }

    public void dddd0064d0064() {
        synchronized (this.xxx007800780078x) {
            try {
                if (!this.xxx007800780078x.isEmpty() && d006400640064dd0064(this.xx00780078x0078x)) {
                    JSONObject jSONObject = this.xxx007800780078x.get(r1.size() - 1);
                    this.xxx007800780078x.clear();
                    this.xxx007800780078x.add(jSONObject);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
