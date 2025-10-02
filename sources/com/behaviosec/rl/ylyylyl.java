package com.behaviosec.rl;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.SensorManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.behaviosec.rl.android.BehavioButtonTouchListener;
import com.behaviosec.rl.android.LogBridge;
import com.behaviosec.rl.android.NavigationListener;
import com.behaviosec.rl.android.SyncedJSONArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ylyylyl {
    public static int c00630063ccc0063c = 4;
    public static int c0063c0063cc0063c = 1;
    public static int cc00630063cc0063c = 2;
    public static int ccc0063cc0063c = 0;
    private static final AtomicInteger i006900690069i00690069;
    private static final long i00690069ii00690069 = 2199023255552L;
    private static final long i0069iii00690069 = 274877906944L;
    public static final int i0069iiii0069 = 1;
    private static final long ii0069ii00690069 = 1099511627776L;
    public static final int ii0069iii0069 = 2;
    private static final long iiiii00690069 = 68719476736L;
    public static final int iiiiii0069 = 0;
    private final long i0069006900690069i0069;
    private final SensorManager i006900690069ii0069;
    private final yllyyyl i00690069i0069i0069;
    private boolean i00690069iii0069;
    private final ododooo i0069i00690069i0069;
    private final Map<Integer, AtomicInteger> i0069i0069i00690069;
    private final Map<Integer, List<yylyyyy>> i0069i0069ii0069;
    private final ylylyyy i0069ii0069i0069;
    private final int ii006900690069i0069;
    private final Map<Integer, AtomicInteger> ii00690069i00690069;
    private yylylyl ii00690069ii0069;
    private final NavigationListener iii00690069i0069;
    private final Context iii0069ii0069;
    private final ooodooo iiii0069i0069;
    private static final String ii0069006900690069i = uuxuuuu.pppp0070ppp("\u0007!&\u0013\u0017\u0001pv", (char) (yyyllll.rrrr007200720072() ^ 383822055), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051)));
    private static final String i00690069006900690069i = uuxuuuu.pppp0070ppp("511", (char) (yyyllll.rrrr007200720072() ^ 383821910), (char) (yylylll.r0072r0072r00720072() ^ (-1349847045)));
    private static AtomicBoolean ii0069i0069i0069 = new AtomicBoolean(false);
    private static final AtomicInteger iii0069i00690069 = new AtomicInteger(0);

    public class yylylyl {
        public static int c0063006300630063c0063c = 1;
        public static int c0063c00630063c0063c = 51;
        public static int cc006300630063c0063c = 0;
        public static int ccccc00630063c = 2;
        private static final String iiii006900690069;
        private final yylllly i0069ii006900690069;
        private SyncedJSONArray ii0069i006900690069 = new SyncedJSONArray();

        static {
            char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716718));
            int iR0072rrr00720072 = ylyylll.r0072rrr00720072() ^ (-1691741244);
            if ((c0063ccc00630063c() * (c0063ccc00630063c() + c0063006300630063c0063c)) % ccccc00630063c != cc006300630063c0063c) {
                c0063c00630063c0063c = 71;
                cc006300630063c0063c = c0063ccc00630063c();
            }
            iiii006900690069 = uuxuuuu.pp0070p0070ppp("{n7", cR007200720072r00720072, (char) iR0072rrr00720072, (char) (yllylll.r007200720072r00720072() ^ (-1146716787)));
        }

        public yylylyl(yylllly yyllllyVar) {
            this.i0069ii006900690069 = yyllllyVar;
        }

        public static int c00630063cc00630063c() {
            return 2;
        }

        public static int c0063ccc00630063c() {
            return 32;
        }

        public static int cc0063cc00630063c() {
            return 0;
        }

        public static int ccc0063c00630063c() {
            return 1;
        }

        public void clear() {
            SyncedJSONArray syncedJSONArray = this.ii0069i006900690069;
            int i = c0063c00630063c0063c;
            if (((c0063006300630063c0063c + i) * i) % ccccc00630063c != cc006300630063c0063c) {
                c0063c00630063c0063c = 31;
                cc006300630063c0063c = 93;
            }
            syncedJSONArray.clear();
        }

        public void k006B006B006B006Bk006B(long j) {
            boolean zRegisterListener;
            long j2 = j & 68719476736L;
            boolean z = false;
            if (j2 != 68719476736L || ylyylyl.k006Bkkk006B006B(ylyylyl.this).registerListener(this.i0069ii006900690069, ylyylyl.k006Bkkk006B006B(ylyylyl.this).getDefaultSensor(10), 1)) {
                zRegisterListener = false;
            } else {
                zRegisterListener = ylyylyl.k006Bkkk006B006B(ylyylyl.this).registerListener(this.i0069ii006900690069, ylyylyl.k006Bkkk006B006B(ylyylyl.this).getDefaultSensor(1), 1);
                if (zRegisterListener) {
                    yylllly.lll006Cl006C006C.set(true);
                }
            }
            if (!((j & 1099511627776L) == 1099511627776L ? ylyylyl.k006Bkkk006B006B(ylyylyl.this).registerListener(this.i0069ii006900690069, ylyylyl.k006Bkkk006B006B(ylyylyl.this).getDefaultSensor(4), 1) : false)) {
                boolean zRegisterListener2 = (j & 2199023255552L) == 2199023255552L ? ylyylyl.k006Bkkk006B006B(ylyylyl.this).registerListener(this.i0069ii006900690069, ylyylyl.k006Bkkk006B006B(ylyylyl.this).getDefaultSensor(2), 1) : false;
                if (!zRegisterListener && j2 == 68719476736L) {
                    zRegisterListener = ylyylyl.k006Bkkk006B006B(ylyylyl.this).registerListener(this.i0069ii006900690069, ylyylyl.k006Bkkk006B006B(ylyylyl.this).getDefaultSensor(1), 1);
                }
                AtomicBoolean atomicBoolean = yylllly.l006C006Cll006C006C;
                if (zRegisterListener2 && zRegisterListener) {
                    int i = c0063c00630063c0063c;
                    if (((c0063006300630063c0063c + i) * i) % ccccc00630063c != cc006300630063c0063c) {
                        c0063c00630063c0063c = c0063ccc00630063c();
                        cc006300630063c0063c = 48;
                    }
                    z = true;
                }
                atomicBoolean.set(z);
            }
            if ((j & 274877906944L) == 274877906944L) {
                ylyylyl.k006Bkkk006B006B(ylyylyl.this).registerListener(this.i0069ii006900690069, ylyylyl.k006Bkkk006B006B(ylyylyl.this).getDefaultSensor(5), 1);
            }
        }

        public void k006B006Bk006Bk006B(@NonNull MotionEvent motionEvent) {
            for (Map.Entry entry : ylyylyl.this.i0069i0069ii0069.entrySet()) {
                int iIntValue = ((Integer) entry.getKey()).intValue();
                List<yylyyyy> list = (List) entry.getValue();
                if (list != null) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(iIntValue);
                    int i = c0063c00630063c0063c;
                    if (((c0063006300630063c0063c + i) * i) % ccccc00630063c != cc006300630063c0063c) {
                        c0063c00630063c0063c = 35;
                        cc006300630063c0063c = c0063ccc00630063c();
                    }
                    if (iFindPointerIndex != -1) {
                        if (ylyylyl.k006B006Bkk006B006B(ylyylyl.this)) {
                            list.addAll(yylyyyy.ddd00640064dd(motionEvent, iFindPointerIndex));
                        }
                        JSONObject jSONObjectK006B006B006Bkkk = this.i0069ii006900690069.k006B006B006Bkkk(list);
                        if (jSONObjectK006B006B006Bkkk != null && jSONObjectK006B006B006Bkkk.length() > 0) {
                            this.ii0069i006900690069.put(jSONObjectK006B006B006Bkkk);
                        }
                    }
                }
            }
            ylyylyl.this.i0069i0069ii0069.clear();
        }

        public void k006Bk006B006Bk006B(@NonNull MotionEvent motionEvent, int i, int i2) {
            List<yylyyyy> list = (List) ylyylyl.this.i0069i0069ii0069.remove(Integer.valueOf(i));
            if (list != null) {
                if (ylyylyl.k006B006Bkk006B006B(ylyylyl.this)) {
                    if ((c0063ccc00630063c() * (c0063ccc00630063c() + c0063006300630063c0063c)) % c00630063cc00630063c() != cc0063cc00630063c()) {
                        c0063c00630063c0063c = 40;
                        cc006300630063c0063c = 39;
                    }
                    list.addAll(yylyyyy.ddd00640064dd(motionEvent, i2));
                }
                JSONObject jSONObjectK006B006B006Bkkk = this.i0069ii006900690069.k006B006B006Bkkk(list);
                if (jSONObjectK006B006B006Bkkk == null || jSONObjectK006B006B006Bkkk.length() <= 0) {
                    return;
                }
                this.ii0069i006900690069.put(jSONObjectK006B006B006Bkkk);
            }
        }

        public void kk006B006B006Bk006B(@NonNull MotionEvent motionEvent) {
            Map map;
            Integer numValueOf;
            ArrayList arrayList;
            int actionIndex = motionEvent.getActionIndex();
            int actionMasked = motionEvent.getActionMasked();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (actionMasked == 0) {
                int i = c0063c00630063c0063c;
                if (((c0063006300630063c0063c + i) * i) % ccccc00630063c != 0) {
                    c0063c00630063c0063c = c0063ccc00630063c();
                    cc006300630063c0063c = c0063ccc00630063c();
                }
                this.i0069ii006900690069.kk006Bk006Bkk();
                this.i0069ii006900690069.kkk006Bkkk();
                ylyylyl.this.i0069i0069ii0069.clear();
                map = ylyylyl.this.i0069i0069ii0069;
                numValueOf = Integer.valueOf(pointerId);
                arrayList = new ArrayList(yylyyyy.ddd00640064dd(motionEvent, actionIndex));
            } else {
                if (actionMasked != 5) {
                    if (actionMasked == 2 && ylyylyl.k006B006Bkk006B006B(ylyylyl.this)) {
                        kkk006B006Bk006B(motionEvent);
                        return;
                    }
                    if (actionMasked == 1 || actionMasked == 6) {
                        k006Bk006B006Bk006B(motionEvent, pointerId, actionIndex);
                        return;
                    } else {
                        if (actionMasked == 3) {
                            k006B006Bk006Bk006B(motionEvent);
                            return;
                        }
                        return;
                    }
                }
                map = ylyylyl.this.i0069i0069ii0069;
                numValueOf = Integer.valueOf(pointerId);
                arrayList = new ArrayList(yylyyyy.ddd00640064dd(motionEvent, actionIndex));
            }
            map.put(numValueOf, arrayList);
        }

        public void kk006Bk006Bk006B(JSONArray jSONArray) throws JSONException, SecurityException {
            JSONObject jSONObject = new JSONObject();
            ylyylyl.kkk006Bk006B006B(ylyylyl.this, jSONObject, true);
            ylyylyl.kk006B006Bk006B006B(ylyylyl.this, jSONObject, uuxuuuu.pppp0070ppp("`cqgqemc\\k9[gYTfTT", (char) (yylylll.r0072r0072r00720072() ^ (-1349847156)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332))), ylyylyl.k006Bk006Bk006B006B(ylyylyl.this).v0076v0076vvv());
            ylyylyl.kk006B006Bk006B006B(ylyylyl.this, jSONObject, uuxuuuu.pppp0070ppp("\\\n\u001bc", (char) (ylyylll.r0072rrr00720072() ^ (-1691741281)), (char) (yyyllll.rrrr007200720072() ^ 383821864)), this.ii0069i006900690069.getJSONArray());
            JSONArray jSONArray2 = new JSONArray();
            int iRrrr007200720072 = yyyllll.rrrr007200720072();
            if (((ccc0063c00630063c() + c0063c00630063c0063c) * c0063c00630063c0063c) % ccccc00630063c != cc006300630063c0063c) {
                c0063c00630063c0063c = 82;
                cc006300630063c0063c = c0063ccc00630063c();
            }
            jSONArray2.put(uuxuuuu.pppp0070ppp(">>", (char) (iRrrr007200720072 ^ 383821964), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))));
            jSONArray2.put(jSONObject);
            ylyylyl.k006B006B006Bk006B006B(ylyylyl.this, jSONArray2, uuxuuuu.pp0070p0070ppp("=\u0016{", (char) (yllylll.r007200720072r00720072() ^ (-1146716676)), (char) (yyyllll.rrrr007200720072() ^ 383822025), (char) (yyyllll.rrrr007200720072() ^ 383821867)));
            jSONArray.put(jSONArray2);
            if (ylyylyl.kkkk006B006B006B(ylyylyl.this) != null) {
                ylyylyl.kk006B006Bk006B006B(ylyylyl.this, jSONObject, uuxuuuu.pp0070p0070ppp("Ws", (char) (yllylll.r007200720072r00720072() ^ (-1146716803)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741217)), (char) (yyyllll.rrrr007200720072() ^ 383821865)), ylyylyl.kkkk006B006B006B(ylyylyl.this).r0072r00720072r0072());
            }
            if (ylyylyl.k006Bkk006B006B006B(ylyylyl.this) != null) {
                ylyylyl.kk006B006Bk006B006B(ylyylyl.this, jSONObject, uuxuuuu.pppp0070ppp("':", (char) (yylylll.r0072r0072r00720072() ^ (-1349847252)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847046))), ylyylyl.k006Bkk006B006B006B(ylyylyl.this).r0072r00720072r0072());
            }
            ylyylyl.kk006B006Bk006B006B(ylyylyl.this, jSONObject, uuxuuuu.pppp0070ppp("7", (char) (yllylll.r007200720072r00720072() ^ (-1146716875)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))), ylyylyl.kk006Bk006B006B006B(ylyylyl.this).k006Bkk006Bk006B());
        }

        public void kkk006B006Bk006B(@NonNull MotionEvent motionEvent) {
            int iFindPointerIndex;
            for (Map.Entry entry : ylyylyl.this.i0069i0069ii0069.entrySet()) {
                int iIntValue = ((Integer) entry.getKey()).intValue();
                List list = (List) entry.getValue();
                if (list != null && (iFindPointerIndex = motionEvent.findPointerIndex(iIntValue)) != -1 && (list.size() == 1 || ((yylyyyy) list.get(list.size() - 1)).d0064006400640064dd(motionEvent, iFindPointerIndex))) {
                    int i = c0063c00630063c0063c;
                    if (((c0063006300630063c0063c + i) * i) % ccccc00630063c != 0) {
                        c0063c00630063c0063c = 29;
                        cc006300630063c0063c = 10;
                    }
                    list.addAll(yylyyyy.ddd00640064dd(motionEvent, iFindPointerIndex));
                }
            }
        }

        public void kkkkk006B006B() {
            ylyylyl ylyylylVar = ylyylyl.this;
            int i = c0063c00630063c0063c;
            if (((c0063006300630063c0063c + i) * i) % ccccc00630063c != 0) {
                c0063c00630063c0063c = 73;
                cc006300630063c0063c = 91;
            }
            ylyylyl.k006Bkkk006B006B(ylyylylVar).unregisterListener(this.i0069ii006900690069);
        }

        public void setOverlayVg(ViewGroup viewGroup) {
            this.i0069ii006900690069.ll006C006Cl006C006C = viewGroup;
        }
    }

    static {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        int i = c00630063ccc0063c;
        if (((c0063c0063cc0063c + i) * i) % cc00630063cc0063c != 0) {
            c00630063ccc0063c = 10;
            ccc0063cc0063c = 35;
        }
        i006900690069i00690069 = atomicInteger;
    }

    public ylyylyl(@NonNull Context context, @NonNull ViewGroup viewGroup) {
        this(context, viewGroup, false);
    }

    public static int c006300630063cc0063c() {
        return 8;
    }

    public static int c0063cc0063c0063c() {
        return 2;
    }

    public static int ccc00630063c0063c() {
        return 0;
    }

    public static int cccc0063c0063c() {
        return 1;
    }

    public static View findViewAt(ViewGroup viewGroup, int i, int i2) {
        View viewFindViewAt;
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount() - 1;
        ViewGroup viewGroup2 = null;
        while (childCount >= 0) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.isShown() && (viewFindViewAt = findViewAt(arrayList, childAt, i, i2)) != null) {
                if (!(viewFindViewAt instanceof ViewGroup)) {
                    return viewFindViewAt;
                }
                viewGroup2 = (ViewGroup) viewFindViewAt;
            }
            childCount--;
            int i3 = c00630063ccc0063c;
            if (((c0063c0063cc0063c + i3) * i3) % cc00630063cc0063c != ccc0063cc0063c) {
                c00630063ccc0063c = c006300630063cc0063c();
                ccc0063cc0063c = 4;
            }
        }
        if (!arrayList.isEmpty()) {
            return (View) arrayList.get(0);
        }
        if (viewGroup2 != null) {
            return viewGroup2;
        }
        return null;
    }

    public static /* synthetic */ void k006B006B006Bk006B006B(ylyylyl ylyylylVar, JSONArray jSONArray, String str) throws JSONException {
        int i = c00630063ccc0063c;
        if (((c0063c0063cc0063c + i) * i) % cc00630063cc0063c != 0) {
            c00630063ccc0063c = c006300630063cc0063c();
            ccc0063cc0063c = 68;
        }
        ylyylylVar.r0072007200720072rr(jSONArray, str);
    }

    public static /* synthetic */ boolean k006B006Bkk006B006B(ylyylyl ylyylylVar) {
        boolean z = ylyylylVar.i00690069iii0069;
        int i = c00630063ccc0063c;
        if (((c0063c0063cc0063c + i) * i) % cc00630063cc0063c != ccc00630063c0063c()) {
            c00630063ccc0063c = c006300630063cc0063c();
            ccc0063cc0063c = c006300630063cc0063c();
        }
        return z;
    }

    public static /* synthetic */ ododooo k006Bk006Bk006B006B(ylyylyl ylyylylVar) {
        int i = c00630063ccc0063c;
        if (((c0063c0063cc0063c + i) * i) % cc00630063cc0063c != ccc0063cc0063c) {
            c00630063ccc0063c = 83;
            ccc0063cc0063c = 12;
        }
        return ylyylylVar.i0069i00690069i0069;
    }

    public static /* synthetic */ ylylyyy k006Bkk006B006B006B(ylyylyl ylyylylVar) {
        ylylyyy ylylyyyVar = ylyylylVar.i0069ii0069i0069;
        int i = c00630063ccc0063c;
        if (((c0063c0063cc0063c + i) * i) % cc00630063cc0063c != ccc0063cc0063c) {
            c00630063ccc0063c = 34;
            ccc0063cc0063c = 5;
        }
        return ylylyyyVar;
    }

    public static /* synthetic */ SensorManager k006Bkkk006B006B(ylyylyl ylyylylVar) {
        SensorManager sensorManager = ylyylylVar.i006900690069ii0069;
        int i = c00630063ccc0063c;
        if (((c0063c0063cc0063c + i) * i) % cc00630063cc0063c != ccc0063cc0063c) {
            c00630063ccc0063c = 30;
            ccc0063cc0063c = c006300630063cc0063c();
        }
        return sensorManager;
    }

    public static /* synthetic */ void kk006B006Bk006B006B(ylyylyl ylyylylVar, JSONObject jSONObject, String str, Object obj) throws JSONException {
        int i = c00630063ccc0063c;
        if (((c0063c0063cc0063c + i) * i) % cc00630063cc0063c != ccc0063cc0063c) {
            c00630063ccc0063c = 71;
            ccc0063cc0063c = 81;
        }
        ylyylylVar.rr0072r0072rr(jSONObject, str, obj);
    }

    public static /* synthetic */ yllyyyl kk006Bk006B006B006B(ylyylyl ylyylylVar) {
        yllyyyl yllyyylVar = ylyylylVar.i00690069i0069i0069;
        int i = c00630063ccc0063c;
        if (((c0063c0063cc0063c + i) * i) % cc00630063cc0063c != 0) {
            c00630063ccc0063c = c006300630063cc0063c();
            ccc0063cc0063c = 38;
        }
        return yllyyylVar;
    }

    public static /* synthetic */ void kkk006Bk006B006B(ylyylyl ylyylylVar, JSONObject jSONObject, boolean z) throws JSONException, SecurityException {
        ylyylylVar.r0072r00720072rr(jSONObject, z);
        int i = c00630063ccc0063c;
        if (((c0063c0063cc0063c + i) * i) % cc00630063cc0063c != ccc0063cc0063c) {
            c00630063ccc0063c = c006300630063cc0063c();
            ccc0063cc0063c = c006300630063cc0063c();
        }
    }

    public static /* synthetic */ ooodooo kkkk006B006B006B(ylyylyl ylyylylVar) {
        ooodooo ooodoooVar = ylyylylVar.iiii0069i0069;
        int i = c00630063ccc0063c;
        if (((c0063c0063cc0063c + i) * i) % c0063cc0063c0063c() != ccc00630063c0063c()) {
            c00630063ccc0063c = 98;
            ccc0063cc0063c = 5;
        }
        return ooodoooVar;
    }

    private void r0072007200720072rr(JSONArray jSONArray, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        rr0072r0072rr(jSONObject, uuxuuuu.pppp0070ppp("\u0018\u0006\u0012\u0012\u0007\f\n", (char) (ylyylll.r0072rrr00720072() ^ (-1691741411)), (char) (yyyllll.rrrr007200720072() ^ 383821865)), str);
        jSONArray.put(jSONObject);
        if ((c006300630063cc0063c() * (c006300630063cc0063c() + c0063c0063cc0063c)) % cc00630063cc0063c != ccc0063cc0063c) {
            c00630063ccc0063c = c006300630063cc0063c();
            ccc0063cc0063c = 35;
        }
    }

    public static void r007200720072rrr(boolean z) {
        char cR007200720072r00720072;
        char cR0072r0072r00720072;
        char cR0072rrr00720072;
        String str;
        yylllly.llll006C006Cl = z;
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("3OVEK7)1", (char) (yylylll.r0072r0072r00720072() ^ (-1349847295)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053)));
        StringBuilder sb = new StringBuilder();
        char cR007200720072r007200722 = (char) (yllylll.r007200720072r00720072() ^ (-1146716843));
        char cR0072rrr007200722 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741438));
        char cR007200720072r007200723 = (char) (yllylll.r007200720072r00720072() ^ (-1146716786));
        int i = c00630063ccc0063c;
        if (((c0063c0063cc0063c + i) * i) % cc00630063cc0063c != 0) {
            c00630063ccc0063c = 45;
            ccc0063cc0063c = c006300630063cc0063c();
        }
        sb.append(uuxuuuu.pp0070p0070ppp("0\u001a\u0002@W2W\u0017+\tk:P$s\u001bbFW[", cR007200720072r007200722, cR0072rrr007200722, cR007200720072r007200723));
        if (z) {
            cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716759));
            cR0072r0072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716886));
            cR0072rrr00720072 = (char) (yyyllll.rrrr007200720072() ^ 383821866);
            str = "ak_alff";
        } else {
            cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716685));
            cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847239));
            cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741330));
            str = "_\u001cc\u0001?\u0001'g";
        }
        sb.append(uuxuuuu.pp0070p0070ppp(str, cR007200720072r00720072, cR0072r0072r00720072, cR0072rrr00720072));
        LogBridge.d(strPppp0070ppp, sb.toString());
    }

    private void r00720072r0072rr(JSONObject jSONObject) throws JSONException {
        char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847154));
        int iRrrr007200720072 = yyyllll.rrrr007200720072();
        int i = c00630063ccc0063c;
        if (((c0063c0063cc0063c + i) * i) % cc00630063cc0063c != 0) {
            c00630063ccc0063c = 44;
            ccc0063cc0063c = 9;
        }
        rr0072r0072rr(jSONObject, uuxuuuu.pppp0070ppp("X[mcqeqgdsEgwihzll", cR0072r0072r00720072, (char) (iRrrr007200720072 ^ 383821866)), this.i0069i00690069i0069.v0076v0076vvv());
    }

    private void r0072r00720072rr(JSONObject jSONObject, boolean z) throws JSONException, SecurityException {
        Context context = this.iii0069ii0069;
        if (context instanceof Activity) {
            rr0072r0072rr(jSONObject, uuxuuuu.pp0070p0070ppp("#&8.<0<B", (char) (yylylll.r0072r0072r00720072() ^ (-1349847068)), (char) (yyyllll.rrrr007200720072() ^ 383822072), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053))), this.iii0069ii0069.getClass().getCanonicalName());
            return;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService(uuxuuuu.pppp0070ppp("\n\u000b\u001b\u000f\u001b\r\u0017\u001b", (char) (yylylll.r0072r0072r00720072() ^ (-1349847057)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333))));
        if ((c006300630063cc0063c() * (c006300630063cc0063c() + c0063c0063cc0063c)) % cc00630063cc0063c != ccc0063cc0063c) {
            c00630063ccc0063c = c006300630063cc0063c();
            ccc0063cc0063c = c006300630063cc0063c();
        }
        List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
        if (runningTasks.isEmpty()) {
            return;
        }
        rr0072r0072rr(jSONObject, uuxuuuu.pp0070p0070ppp("\u000f\u001d<G\u0018o_d", (char) (yylylll.r0072r0072r00720072() ^ (-1349847077)), (char) (yllylll.r007200720072r00720072() ^ (-1146716725)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741331))), runningTasks.get(0).topActivity.getClassName());
    }

    public static void r0072rrr0072r() {
        iii0069i00690069.set(0);
        AtomicInteger atomicInteger = i006900690069i00690069;
        int i = c00630063ccc0063c;
        if (((c0063c0063cc0063c + i) * i) % c0063cc0063c0063c() != ccc0063cc0063c) {
            c00630063ccc0063c = c006300630063cc0063c();
            ccc0063cc0063c = c006300630063cc0063c();
        }
        atomicInteger.set(0);
    }

    private void rr007200720072rr(JSONObject jSONObject) throws JSONException {
        WindowManager windowManager = (WindowManager) this.iii0069ii0069.getSystemService(uuxuuuu.pppp0070ppp("\u001e\u000f\u0013\b\u0012\u0019", (char) (yllylll.r007200720072r00720072() ^ (-1146716699)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))));
        if (windowManager == null) {
            return;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        rr0072r0072rr(jSONObject, uuxuuuu.pp0070p0070ppp("\u0016\t\u0005\u0016\u000b", (char) (yylylll.r0072r0072r00720072() ^ (-1349847100)), (char) (yllylll.r007200720072r00720072() ^ (-1146716783)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792))), Integer.valueOf(displayMetrics.widthPixels));
        int iR0072rrr00720072 = ylyylll.r0072rrr00720072();
        int i = c00630063ccc0063c;
        if (((c0063c0063cc0063c + i) * i) % cc00630063cc0063c != ccc0063cc0063c) {
            c00630063ccc0063c = 81;
            ccc0063cc0063c = 1;
        }
        rr0072r0072rr(jSONObject, uuxuuuu.pppp0070ppp("\u001c\u0018\u001b\u0018 +", (char) (iR0072rrr00720072 ^ (-1691741350)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))), Integer.valueOf(displayMetrics.heightPixels));
        rr0072r0072rr(jSONObject, uuxuuuu.pppp0070ppp("lYf`", (char) (yllylll.r007200720072r00720072() ^ (-1146716678)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741331))), Float.valueOf(displayMetrics.xdpi));
        rr0072r0072rr(jSONObject, uuxuuuu.pp0070p0070ppp("~hsk", (char) (yyyllll.rrrr007200720072() ^ 383821926), (char) (ylyylll.r0072rrr00720072() ^ (-1691741243)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847052))), Float.valueOf(displayMetrics.ydpi));
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        int i2 = point.y;
        int i3 = point.x;
        int i4 = i2 > i3 ? i2 : i3;
        if (i2 > i3) {
            i2 = i3;
        }
        rr0072r0072rr(jSONObject, uuxuuuu.pppp0070ppp("'", (char) (yllylll.r007200720072r00720072() ^ (-1146716712)), (char) (yyyllll.rrrr007200720072() ^ 383821868)), Float.valueOf(i2 / displayMetrics.xdpi));
        rr0072r0072rr(jSONObject, uuxuuuu.pppp0070ppp("\u0002", (char) (yllylll.r007200720072r00720072() ^ (-1146716813)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))), Float.valueOf(i4 / displayMetrics.ydpi));
    }

    public static void rr00720072rrr(boolean z) {
        ii0069i0069i0069.set(z);
        String strPppp0070ppp = uuxuuuu.pppp0070ppp(",FK8<&\u0016\u001c", (char) (yylylll.r0072r0072r00720072() ^ (-1349847078)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847045)));
        StringBuilder sb = new StringBuilder();
        int iR0072rrr00720072 = ylyylll.r0072rrr00720072();
        int i = c00630063ccc0063c;
        if (((c0063c0063cc0063c + i) * i) % cc00630063cc0063c != ccc0063cc0063c) {
            c00630063ccc0063c = 2;
            ccc0063cc0063c = 8;
        }
        sb.append(uuxuuuu.pp0070p0070ppp("Xc_^VSc/ZNTQ^W\\Y0I\\UURNIBOz", (char) (iR0072rrr00720072 ^ (-1691741302)), (char) (yyyllll.rrrr007200720072() ^ 383822067), (char) (yyyllll.rrrr007200720072() ^ 383821870)));
        sb.append(z ? uuxuuuu.pppp0070ppp(">F88A97", (char) (yylylll.r0072r0072r00720072() ^ (-1349847041)), (char) (yllylll.r007200720072r00720072() ^ (-1146716789))) : uuxuuuu.pp0070p0070ppp("@\r \u0013\u001dkmq", (char) (yyyllll.rrrr007200720072() ^ 383821960), (char) (ylyylll.r0072rrr00720072() ^ (-1691741423)), (char) (yyyllll.rrrr007200720072() ^ 383821867)));
        LogBridge.d(strPppp0070ppp, sb.toString());
    }

    private void rr0072r0072rr(JSONObject jSONObject, String str, Object obj) throws JSONException {
        try {
            jSONObject.put(str, obj);
            int i = c00630063ccc0063c;
            if (((c0063c0063cc0063c + i) * i) % cc00630063cc0063c != 0) {
                c00630063ccc0063c = 2;
                ccc0063cc0063c = 57;
            }
        } catch (JSONException unused) {
        }
    }

    private void rr0072rrrr(JSONArray jSONArray) throws JSONException, SecurityException {
        JSONObject jSONObject = new JSONObject();
        r0072r00720072rr(jSONObject, true);
        int i = c00630063ccc0063c;
        if (((c0063c0063cc0063c + i) * i) % cc00630063cc0063c != ccc00630063c0063c()) {
            c00630063ccc0063c = 91;
            ccc0063cc0063c = c006300630063cc0063c();
        }
        r00720072r0072rr(jSONObject);
        rrr00720072rr(jSONObject);
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(uuxuuuu.pppp0070ppp("\u001c\u001c", (char) (ylyylll.r0072rrr00720072() ^ (-1691741235)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))));
        jSONArray2.put(jSONObject);
        r0072007200720072rr(jSONArray2, uuxuuuu.pp0070p0070ppp("\u0015\u0011\u0015", (char) (yllylll.r007200720072r00720072() ^ (-1146716741)), (char) (yyyllll.rrrr007200720072() ^ 383821957), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))));
        jSONArray.put(jSONArray2);
    }

    private void rrr00720072rr(JSONObject jSONObject) throws JSONException {
        if (this.iiii0069i0069 != null) {
            char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716860));
            int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
            int i = c00630063ccc0063c;
            if (((c0063c0063cc0063c + i) * i) % c0063cc0063c0063c() != 0) {
                c00630063ccc0063c = c006300630063cc0063c();
                ccc0063cc0063c = c006300630063cc0063c();
            }
            rr0072r0072rr(jSONObject, uuxuuuu.pppp0070ppp("~\u000b", cR007200720072r00720072, (char) (iR0072r0072r00720072 ^ (-1349847046))), this.iiii0069i0069.r0072r00720072r0072());
        }
        if (this.i0069ii0069i0069 != null) {
            rr0072r0072rr(jSONObject, uuxuuuu.pp0070p0070ppp(".A", (char) (yllylll.r007200720072r00720072() ^ (-1146716674)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741352)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336))), this.i0069ii0069i0069.r0072r00720072r0072());
        }
        rr0072r0072rr(jSONObject, uuxuuuu.pppp0070ppp("\u000e\n\u0011\u007f\u0006", (char) (ylyylll.r0072rrr00720072() ^ (-1691741199)), (char) (yyyllll.rrrr007200720072() ^ 383821870)), this.i00690069i0069i0069.kkkk006Bk006B(false));
        rr0072r0072rr(jSONObject, uuxuuuu.pppp0070ppp("MGP=E\u001eRB<", (char) (yyyllll.rrrr007200720072() ^ 383821965), (char) (yyyllll.rrrr007200720072() ^ 383821858)), this.i00690069i0069i0069.kkkk006Bk006B(true));
    }

    public void k006B006Bk006B006B006B(@NonNull Map<String, String> map, int i, int i2) {
        JSONArray jSONArrayR0072r00720072r0072 = this.iiii0069i0069.r0072r00720072r0072();
        if (jSONArrayR0072r00720072r0072 == null || jSONArrayR0072r00720072r0072.length() <= 0) {
            return;
        }
        if (!this.i0069i0069i00690069.containsKey(Integer.valueOf(i))) {
            this.i0069i0069i00690069.put(Integer.valueOf(i), new AtomicInteger(0));
        }
        JSONArray jSONArrayPut = new JSONArray().put(new JSONArray().put(i).put(jSONArrayR0072r00720072r0072));
        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("\fwp'/", (char) (ylyylll.r0072rrr00720072() ^ (-1691741376)), (char) (yllylll.r007200720072r00720072() ^ (-1146716739)), (char) (yllylll.r007200720072r00720072() ^ (-1146716789)));
        String string = jSONArrayPut.toString();
        int i3 = c00630063ccc0063c;
        if (((c0063c0063cc0063c + i3) * i3) % cc00630063cc0063c != ccc0063cc0063c) {
            c00630063ccc0063c = c006300630063cc0063c();
            ccc0063cc0063c = c006300630063cc0063c();
        }
        map.put(strPp0070p0070ppp, string);
        map.put(uuxuuuu.pp0070p0070ppp("\f3^o\u001b/]\u0002\f.a", (char) (yylylll.r0072r0072r00720072() ^ (-1349847206)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847149)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051))), String.valueOf((i * i2) + (this.i0069i0069i00690069.get(Integer.valueOf(i)).getAndIncrement() % i2)));
    }

    @NonNull
    public JSONArray k006Bk006B006B006B006B(@NonNull JSONArray jSONArray) throws JSONException, SecurityException {
        yylylyl yylylylVar = this.ii00690069ii0069;
        if (yylylylVar != null) {
            yylylylVar.kk006Bk006Bk006B(jSONArray);
        }
        rr0072rrrr(jSONArray);
        int i = c00630063ccc0063c;
        if (((c0063c0063cc0063c + i) * i) % cc00630063cc0063c != ccc00630063c0063c()) {
            c00630063ccc0063c = 28;
            ccc0063cc0063c = c006300630063cc0063c();
        }
        if (this.iii00690069i0069 != null) {
            jSONArray.put(new JSONArray().put(uuxuuuu.pppp0070ppp("H", (char) (ylyylll.r0072rrr00720072() ^ (-1691741299)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332)))).put(uuxuuuu.pppp0070ppp("4", (char) (yylylll.r0072r0072r00720072() ^ (-1349847228)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051)))).put(new JSONObject()).put(this.iii00690069i0069.bb0062bbbb()));
        }
        return jSONArray;
    }

    public void kk006B006B006B006B006B(@NonNull Map<String, String> map, int i, int i2) {
        JSONArray jSONArrayR0072r00720072r0072 = this.i0069ii0069i0069.r0072r00720072r0072();
        int i3 = c00630063ccc0063c;
        if (((c0063c0063cc0063c + i3) * i3) % cc00630063cc0063c != ccc0063cc0063c) {
            c00630063ccc0063c = 35;
            ccc0063cc0063c = c006300630063cc0063c();
        }
        if (jSONArrayR0072r00720072r0072 == null || jSONArrayR0072r00720072r0072.length() <= 0) {
            return;
        }
        if (!this.ii00690069i00690069.containsKey(Integer.valueOf(i))) {
            this.ii00690069i00690069.put(Integer.valueOf(i), new AtomicInteger(0));
        }
        map.put(uuxuuuu.pppp0070ppp("\f\u0013\u001f\u0014'", (char) (yllylll.r007200720072r00720072() ^ (-1146716768)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))), new JSONArray().put(new JSONArray().put(i).put(jSONArrayR0072r00720072r0072)).toString());
        map.put(uuxuuuu.pp0070p0070ppp("7<F9J/8<11C", (char) (yllylll.r007200720072r00720072() ^ (-1146716817)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847119)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847052))), String.valueOf((i * i2) + (this.ii00690069i00690069.get(Integer.valueOf(i)).getAndIncrement() % i2)));
    }

    public Map<String, String> kkk006B006B006B006B(@NonNull Map<String, String> map, int i, boolean z, int i2) throws JSONException, SecurityException {
        if (z) {
            JSONObject jSONObject = new JSONObject();
            r0072r00720072rr(jSONObject, false);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(uuxuuuu.pppp0070ppp("ik", (char) (yyyllll.rrrr007200720072() ^ 383821993), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))));
            jSONArray.put(jSONObject);
            r0072007200720072rr(jSONArray, uuxuuuu.pp0070p0070ppp("\u0014]n", (char) (yyyllll.rrrr007200720072() ^ 383821876), (char) (yllylll.r007200720072r00720072() ^ (-1146716839)), (char) (yyyllll.rrrr007200720072() ^ 383821867)));
            map.put(uuxuuuu.pppp0070ppp("\u001b[V(n", (char) (yylylll.r0072r0072r00720072() ^ (-1349847094)), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))), new JSONArray().put(new JSONArray().put(i).put(jSONArray)).toString());
            map.put(uuxuuuu.pppp0070ppp("uz\u0005v~u~\u0003\u007f\u007f\u0012", (char) (yyyllll.rrrr007200720072() ^ 383821880), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))), String.valueOf(i));
        }
        JSONArray jSONArrayV0076v0076vvv = this.i0069i00690069i0069.v0076v0076vvv();
        if (jSONArrayV0076v0076vvv != null) {
            int i3 = c00630063ccc0063c;
            if (((c0063c0063cc0063c + i3) * i3) % cc00630063cc0063c != 0) {
                c00630063ccc0063c = 58;
                ccc0063cc0063c = 8;
            }
            if (jSONArrayV0076v0076vvv.length() > 0) {
                map.put(uuxuuuu.pp0070p0070ppp("\u0007\f\u0016\u0003\u0004\u0014", (char) (ylyylll.r0072rrr00720072() ^ (-1691741282)), (char) (yllylll.r007200720072r00720072() ^ (-1146716824)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))), new JSONArray().put(new JSONArray().put(i).put(jSONArrayV0076v0076vvv)).toString());
                map.put(uuxuuuu.pp0070p0070ppp("Y-\u0002M\u0019w\u001csR\u0016`1", (char) (yllylll.r007200720072r00720072() ^ (-1146716800)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847231)), (char) (383821867 ^ yyyllll.rrrr007200720072())), String.valueOf(iii0069i00690069.getAndIncrement()));
            }
        }
        if (this.iiii0069i0069 != null) {
            k006B006Bk006B006B006B(map, i, i2);
        }
        if (this.i0069ii0069i0069 != null) {
            kk006B006B006B006B006B(map, i, i2);
        }
        JSONArray jSONArrayKkkk006Bk006B = this.i00690069i0069i0069.kkkk006Bk006B(false);
        if (jSONArrayKkkk006Bk006B != null && jSONArrayKkkk006Bk006B.length() > 0) {
            r0072rrrrr(map, i, jSONArrayKkkk006Bk006B);
        }
        return map;
    }

    public void r00720072rr0072r(@NonNull ViewGroup viewGroup) {
        yylylyl yylylylVar = this.ii00690069ii0069;
        if (yylylylVar != null) {
            yylylylVar.setOverlayVg(viewGroup);
        }
        this.i00690069i0069i0069.iii0069i0069i = viewGroup;
        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("6A3t`o>&", (char) (yllylll.r007200720072r00720072() ^ (-1146716696)), (char) (yyyllll.rrrr007200720072() ^ 383821843), (char) (yyyllll.rrrr007200720072() ^ 383821865));
        StringBuilder sb = new StringBuilder();
        int iR007200720072r00720072 = yllylll.r007200720072r00720072();
        int i = c00630063ccc0063c;
        if (((cccc0063c0063c() + i) * i) % c0063cc0063c0063c() != 0) {
            c00630063ccc0063c = c006300630063cc0063c();
            ccc0063cc0063c = 40;
        }
        sb.append(uuxuuuu.pp0070p0070ppp("\u001e.Cl\u00127,7G:X|):<L2[^bS\u001b\u0007", (char) (iR007200720072r00720072 ^ (-1146716867)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335))));
        sb.append(this);
        sb.append(uuxuuuu.pppp0070ppp("_R", (char) (yyyllll.rrrr007200720072() ^ 383821837), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))));
        sb.append(viewGroup.toString());
        LogBridge.d(strPp0070p0070ppp, sb.toString());
    }

    public void r00720072rrrr(@NonNull MotionEvent motionEvent) {
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("lBx\u0005\u0010M\u0018m", (char) (yylylll.r0072r0072r00720072() ^ (-1349847062)), (char) (yyyllll.rrrr007200720072() ^ 383821864));
        StringBuilder sb = new StringBuilder();
        int i = c00630063ccc0063c;
        if (((c0063c0063cc0063c + i) * i) % cc00630063cc0063c != ccc0063cc0063c) {
            c00630063ccc0063c = 24;
            ccc0063cc0063c = 94;
        }
        sb.append(uuxuuuu.pppp0070ppp("@BA0JO<@\u001cL:BG\fp", (char) (yylylll.r0072r0072r00720072() ^ (-1349847235)), (char) (yyyllll.rrrr007200720072() ^ 383821867)));
        sb.append(this);
        sb.append(uuxuuuu.pppp0070ppp(",\u001fcsp5", (char) (yyyllll.rrrr007200720072() ^ 383822037), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335))));
        sb.append(motionEvent);
        LogBridge.d(strPppp0070ppp, sb.toString());
        if (this.i00690069iii0069) {
            this.i00690069i0069i0069.k006Bk006Bkk006B(motionEvent);
        }
        if (ii0069i0069i0069.get() && Build.VERSION.SDK_INT >= 29 && motionEvent.getClassification() == 1) {
            r0072r0072rrr(motionEvent);
        }
        yylylyl yylylylVar = this.ii00690069ii0069;
        if (yylylylVar != null) {
            yylylylVar.kk006B006B006Bk006B(motionEvent);
        }
    }

    public void r0072r0072r0072r() {
        LogBridge.d(uuxuuuu.pppp0070ppp("?[bQWC5=", (char) (yllylll.r007200720072r00720072() ^ (-1146716740)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741343))), uuxuuuu.pppp0070ppp("!!\u001b\u001bm\n\u001c\bh\u0014\u0010\u000f\u0007\u0004\u0014\b\r\u000b;", (char) (yylylll.r0072r0072r00720072() ^ (-1349847267)), (char) (yyyllll.rrrr007200720072() ^ 383821865)) + this);
        if ((c006300630063cc0063c() * (c006300630063cc0063c() + c0063c0063cc0063c)) % cc00630063cc0063c != ccc0063cc0063c) {
            c00630063ccc0063c = c006300630063cc0063c();
            ccc0063cc0063c = c006300630063cc0063c();
        }
        if (this.i00690069iii0069) {
            r0072rr0072rr();
        }
    }

    public void r0072r0072rrr(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            View viewCheckIfThisIsACustomKeybEvent = this.i00690069i0069i0069.checkIfThisIsACustomKeybEvent(motionEvent, motionEvent.getActionIndex());
            int i = c00630063ccc0063c;
            if (((c0063c0063cc0063c + i) * i) % cc00630063cc0063c != 0) {
                c00630063ccc0063c = 89;
                ccc0063cc0063c = 64;
            }
            if (viewCheckIfThisIsACustomKeybEvent != null) {
                this.i00690069i0069i0069.onAmbiguousButtonTouch(viewCheckIfThisIsACustomKeybEvent, motionEvent);
                LogBridge.w(uuxuuuu.pppp0070ppp("u\u0010\u0015\u0002\u0006o_e", (char) (yylylll.r0072r0072r00720072() ^ (-1349847249)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051))), uuxuuuu.pppp0070ppp("ithnkxqvs\u001fibunnkgb[\u0015Wb^]URbRP\u000b", (char) (ylyylll.r0072rrr00720072() ^ (-1691741281)), (char) (yllylll.r007200720072r00720072() ^ (-1146716786))) + this);
            }
        }
    }

    public void r0072rr0072rr() {
        if (!this.i00690069iii0069) {
            return;
        }
        this.i00690069iii0069 = false;
        rr00720072r0072r();
        LogBridge.d(uuxuuuu.pp0070p0070ppp("1KP=A+\u001b!", (char) (yllylll.r007200720072r00720072() ^ (-1146716691)), (char) (yllylll.r007200720072r00720072() ^ (-1146716876)), (char) (yllylll.r007200720072r00720072() ^ (-1146716785))), uuxuuuu.pp0070p0070ppp("0TB\u0016/WB\"\u0001>\u0017\u000f^I';j^O4\u0001f~", (char) (ylyylll.r0072rrr00720072() ^ (-1691741190)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741193)), (char) (yyyllll.rrrr007200720072() ^ 383821867)) + this);
        int i = 2;
        while (true) {
            try {
                i /= 0;
            } catch (Exception unused) {
                c00630063ccc0063c = c006300630063cc0063c();
                while (true) {
                    try {
                        i /= 0;
                    } catch (Exception unused2) {
                        c00630063ccc0063c = 9;
                        return;
                    }
                }
            }
        }
    }

    public void r0072rrrrr(@NonNull Map<String, String> map, int i, JSONArray jSONArray) {
        JSONArray jSONArrayPut = new JSONArray().put(new JSONArray().put(i).put(jSONArray));
        int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
        int iC006300630063cc0063c = c006300630063cc0063c();
        if (((c0063c0063cc0063c + iC006300630063cc0063c) * iC006300630063cc0063c) % cc00630063cc0063c != 0) {
            c00630063ccc0063c = c006300630063cc0063c();
            ccc0063cc0063c = 28;
        }
        map.put(uuxuuuu.pppp0070ppp("<AOOAE", (char) (iR0072r0072r00720072 ^ (-1349847084)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847045))), jSONArrayPut.toString());
        map.put(uuxuuuu.pppp0070ppp("\u0012\u0019%'\u0017\u001d\u0015 &\u001d\u001f3", (char) (ylyylll.r0072rrr00720072() ^ (-1691741378)), (char) (yllylll.r007200720072r00720072() ^ (-1146716799))), String.valueOf(i006900690069i00690069.getAndIncrement()));
    }

    public void rr00720072r0072r() {
        yylylyl yylylylVar = this.ii00690069ii0069;
        if (yylylylVar != null) {
            yylylylVar.kkkkk006B006B();
            int i = c00630063ccc0063c;
            if (((c0063c0063cc0063c + i) * i) % cc00630063cc0063c != 0) {
                c00630063ccc0063c = 50;
                ccc0063cc0063c = 40;
            }
        }
        ooodooo ooodoooVar = this.iiii0069i0069;
        if (ooodoooVar != null) {
            ooodoooVar.rr007200720072r0072(this.i006900690069ii0069);
        }
        ylylyyy ylylyyyVar = this.i0069ii0069i0069;
        if (ylylyyyVar != null) {
            ylylyyyVar.rr007200720072r0072(this.i006900690069ii0069);
        }
        NavigationListener navigationListener = this.iii00690069i0069;
        if (navigationListener != null) {
            navigationListener.b00620062bbbb();
        }
        this.i0069i00690069i0069.v007600760076vvv();
    }

    public void rr0072rr0072r(BehavioButtonTouchListener behavioButtonTouchListener) {
        int i = c00630063ccc0063c;
        if (((c0063c0063cc0063c + i) * i) % cc00630063cc0063c != ccc0063cc0063c) {
            c00630063ccc0063c = 38;
            ccc0063cc0063c = c006300630063cc0063c();
        }
        NavigationListener navigationListener = this.iii00690069i0069;
        if (navigationListener != null) {
            navigationListener.setBehavioButtonTouchListener(behavioButtonTouchListener);
        }
        this.i00690069i0069i0069.k006B006B006Bkk006B(behavioButtonTouchListener);
    }

    public void rrr0072r0072r() {
        if (this.i00690069iii0069) {
            return;
        }
        rrrrr0072r();
        this.i00690069iii0069 = true;
        char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716840));
        int i = c00630063ccc0063c;
        if (((c0063c0063cc0063c + i) * i) % c0063cc0063c0063c() != ccc0063cc0063c) {
            c00630063ccc0063c = c006300630063cc0063c();
            ccc0063cc0063c = c006300630063cc0063c();
        }
        LogBridge.d(uuxuuuu.pppp0070ppp("/IN;?)\u0019\u001f", cR007200720072r00720072, (char) (yllylll.r007200720072r00720072() ^ (-1146716791))), uuxuuuu.pppp0070ppp("_5v\u007fF\\X}2\f\fz ,3GEPu\u000bQjW\u000f", (char) (yyyllll.rrrr007200720072() ^ 383822001), (char) (yyyllll.rrrr007200720072() ^ 383821864)) + this);
    }

    public void rrr0072rrr() {
        yylylyl yylylylVar = this.ii00690069ii0069;
        if (yylylylVar != null) {
            yylylylVar.clear();
        }
        ooodooo ooodoooVar = this.iiii0069i0069;
        if (ooodoooVar != null) {
            ooodoooVar.rr0072r0072r0072();
        }
        if (this.i0069ii0069i0069 != null) {
            int i = c00630063ccc0063c;
            if (((c0063c0063cc0063c + i) * i) % cc00630063cc0063c != 0) {
                c00630063ccc0063c = c006300630063cc0063c();
                ccc0063cc0063c = 0;
            }
            this.i0069ii0069i0069.rr0072r0072r0072();
        }
        NavigationListener navigationListener = this.iii00690069i0069;
        if (navigationListener != null) {
            navigationListener.ddd0064006400640064();
        }
        this.i0069i00690069i0069.jj006A006A006A006A006A();
        this.i00690069i0069i0069.kk006B006Bkk006B();
        LogBridge.d(uuxuuuu.pppp0070ppp("wX2\u0007\u0006\u001d\u0018y", (char) (yyyllll.rrrr007200720072() ^ 383821958), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))), uuxuuuu.pppp0070ppp("6\u0010\u000fYmt(.kRE$1", (char) (ylyylll.r0072rrr00720072() ^ (-1691741416)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))) + this);
    }

    public void rrrr0072rr() {
        yylylyl yylylylVar = this.ii00690069ii0069;
        if (yylylylVar != null) {
            yylylylVar.setOverlayVg(null);
        }
        this.i00690069i0069i0069.iii0069i0069i = null;
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("e\u0002\tw}i[c", (char) (yyyllll.rrrr007200720072() ^ 383821956), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053)));
        StringBuilder sb = new StringBuilder();
        char cRrrr007200720072 = (char) (yyyllll.rrrr007200720072() ^ 383822055);
        int iR0072rrr00720072 = ylyylll.r0072rrr00720072() ^ (-1691741330);
        int i = c00630063ccc0063c;
        if (((c0063c0063cc0063c + i) * i) % cc00630063cc0063c != ccc0063cc0063c) {
            c00630063ccc0063c = c006300630063cc0063c();
            ccc0063cc0063c = c006300630063cc0063c();
        }
        sb.append(uuxuuuu.pppp0070ppp("\u0002(\u0016\"\u001b\u000f&K\u0001\u0013\u000e\u001fm\u0018\u0014\u0019\u0013A\u0005\t\u0012\u000b\u0006\u000f\u000e~|7", cRrrr007200720072, (char) iR0072rrr00720072));
        sb.append(this);
        LogBridge.d(strPppp0070ppp, sb.toString());
    }

    public void rrrrr0072r() {
        ooodooo ooodoooVar = this.iiii0069i0069;
        if (ooodoooVar != null) {
            ooodoooVar.r00720072r0072r0072(this.i006900690069ii0069);
        }
        ylylyyy ylylyyyVar = this.i0069ii0069i0069;
        if (ylylyyyVar != null) {
            ylylyyyVar.r00720072r0072r0072(this.i006900690069ii0069);
        }
        NavigationListener navigationListener = this.iii00690069i0069;
        if (navigationListener != null) {
            navigationListener.b0062bbbbb();
        }
        this.i0069i00690069i0069.vv0076vvvv();
        if (this.ii00690069ii0069 != null) {
            int i = c00630063ccc0063c;
            if (((c0063c0063cc0063c + i) * i) % c0063cc0063c0063c() != 0) {
                c00630063ccc0063c = c006300630063cc0063c();
                ccc0063cc0063c = c006300630063cc0063c();
            }
            this.ii00690069ii0069.k006B006B006B006Bk006B(this.i0069006900690069i0069);
        }
    }

    public ylyylyl(@NonNull Context context, @NonNull ViewGroup viewGroup, boolean z) {
        this(context, viewGroup, z, 0);
    }

    public static View findViewAt(List<View> list, View view, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        int i3 = iArr[0];
        rect.left = i3;
        rect.top = iArr[1];
        rect.right = view.getWidth() + i3;
        rect.bottom = view.getHeight() + iArr[1];
        int i4 = c00630063ccc0063c;
        if (((c0063c0063cc0063c + i4) * i4) % cc00630063cc0063c != ccc0063cc0063c) {
            c00630063ccc0063c = 69;
            ccc0063cc0063c = c006300630063cc0063c();
        }
        if (!rect.contains(i, i2)) {
            return null;
        }
        Rect rect2 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
        if (!(view instanceof ViewGroup)) {
            if (!globalVisibleRect || rect2.width() != view.getWidth() || rect2.height() != view.getHeight()) {
                if (globalVisibleRect) {
                    list.add(view);
                }
                return null;
            }
            return view;
        }
        View viewFindViewAt = findViewAt((ViewGroup) view, i, i2);
        if (viewFindViewAt != null && viewFindViewAt.isShown()) {
            Rect rect3 = new Rect();
            viewFindViewAt.getGlobalVisibleRect(rect3);
            if (rect3.width() == viewFindViewAt.getWidth() && rect3.height() == viewFindViewAt.getHeight()) {
                return viewFindViewAt;
            }
            list.add(viewFindViewAt);
            return null;
        }
        return view;
    }

    public ylyylyl(@NonNull Context context, @NonNull ViewGroup viewGroup, boolean z, int i) {
        this(context, viewGroup, z, 0, -1L);
    }

    public ylyylyl(@NonNull Context context, @NonNull ViewGroup viewGroup, boolean z, int i, long j) {
        this.i0069i0069ii0069 = new LinkedHashMap();
        this.i0069i0069i00690069 = new HashMap();
        this.ii00690069i00690069 = new HashMap();
        LogBridge.d(uuxuuuu.pppp0070ppp("!\u0004\u0018-Z\u0003GN", (char) (yyyllll.rrrr007200720072() ^ 383822067), (char) (yllylll.r007200720072r00720072() ^ (-1146716785))), uuxuuuu.pp0070p0070ppp("h\b\u001d6}", (char) (yllylll.r007200720072r00720072() ^ (-1146716915)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741186)), (char) (yyyllll.rrrr007200720072() ^ 383821868)) + this + uuxuuuu.pppp0070ppp("C8|\u000f\u0014V", (char) (yllylll.r007200720072r00720072() ^ (-1146716897)), (char) (yyyllll.rrrr007200720072() ^ 383821871)) + context + uuxuuuu.pppp0070ppp("3(\u007fqE", (char) (yllylll.r007200720072r00720072() ^ (-1146716913)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741331))) + viewGroup);
        this.iii0069ii0069 = context;
        this.i0069006900690069i0069 = j;
        this.i00690069i0069i0069 = new yllyyyl(z ^ true, viewGroup, null);
        this.i006900690069ii0069 = (SensorManager) context.getSystemService(uuxuuuu.pp0070p0070ppp("\u001e\u00175c}\r", (char) (yllylll.r007200720072r00720072() ^ (-1146716701)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847220)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741331))));
        if ((j & 68719476736L) == 68719476736L) {
            this.iiii0069i0069 = new ooodooo();
        } else {
            this.iiii0069i0069 = null;
        }
        if ((j & 1099511627776L) == 1099511627776L) {
            this.i0069ii0069i0069 = new ylylyyy();
        } else {
            this.i0069ii0069i0069 = null;
        }
        if (i == 2) {
            this.iii00690069i0069 = null;
        } else {
            this.iii00690069i0069 = i == 1 ? new NavigationListener(viewGroup, true) : new NavigationListener(viewGroup);
        }
        this.i0069i00690069i0069 = new ododooo(context);
        rrrrr0072r();
        this.i00690069iii0069 = true;
        this.ii006900690069i0069 = context.getApplicationContext().getResources().getConfiguration().orientation;
    }
}
