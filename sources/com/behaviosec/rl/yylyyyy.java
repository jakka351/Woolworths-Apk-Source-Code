package com.behaviosec.rl;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class yylyyyy {
    private static final int t00740074t0074t0074 = 100;
    private static final int tt0074t0074t0074 = 2;
    public static int v00760076vv007600760076 = 2;
    public static int v0076v0076v007600760076 = 0;
    public static int v0076vvv007600760076 = 54;
    public static int vv0076vv007600760076 = 1;
    public final float t0074007400740074t0074;
    public final long t00740074tt00740074;
    public final float t0074t00740074t0074;
    public final float t0074ttt00740074;
    public final float tt007400740074t0074;
    public final float tt0074tt00740074;
    public final int ttt00740074t0074;
    public final float ttttt00740074;

    public static class yllyyyy {
        public static int v00760076v0076007600760076 = 2;
        public static int v0076vv0076007600760076 = 0;
        public static int vv0076v0076007600760076 = 1;
        public static int vvvv0076007600760076 = 1;
        private List<yylyyyy> t0074t0074t00740074;
        private boolean ttt0074t00740074;

        public yllyyyy(boolean z) {
            this.ttt0074t00740074 = z;
        }

        public static /* synthetic */ List d00640064d0064dd(yllyyyy yllyyyyVar, List list) {
            int i = vvvv0076007600760076;
            if (((vv0076v0076007600760076 + i) * i) % v00760076v0076007600760076 != 0) {
                vvvv0076007600760076 = 93;
                v0076vv0076007600760076 = 37;
            }
            yllyyyyVar.t0074t0074t00740074 = list;
            return list;
        }

        public static int v0076v00760076007600760076() {
            return 0;
        }

        public static int vvv00760076007600760076() {
            return 25;
        }

        public List<yylyyyy> getEvents() {
            int i = vvvv0076007600760076;
            if (((vv0076v0076007600760076 + i) * i) % v00760076v0076007600760076 != v0076v00760076007600760076()) {
                vvvv0076007600760076 = 44;
                v0076vv0076007600760076 = vvv00760076007600760076();
            }
            return this.t0074t0074t00740074;
        }

        public boolean isBsdkTouch() {
            int i = vvvv0076007600760076;
            if (((vv0076v0076007600760076 + i) * i) % v00760076v0076007600760076 != v0076vv0076007600760076) {
                vvvv0076007600760076 = 92;
                v0076vv0076007600760076 = vvv00760076007600760076();
            }
            return this.ttt0074t00740074;
        }
    }

    public yylyyyy(float f, float f2, float f3, float f4, float f5, float f6, long j) {
        this(-1, f, f2, f3, f4, f5, f6, j);
    }

    public static JSONArray d00640064dd0064d(List<yylyyyy> list, int i) throws JSONException {
        if (list.size() <= i) {
            return dd0064dd0064d(list);
        }
        JSONArray jSONArrayDd0064dd0064d = dd0064dd0064d(list.subList(0, i));
        if (((vv00760076v007600760076() + v0076vvv007600760076) * v0076vvv007600760076) % v00760076vv007600760076 != v0076v0076v007600760076) {
            v0076vvv007600760076 = vvv0076v007600760076();
            v0076v0076v007600760076 = 95;
        }
        JSONArray jSONArrayD0064ddd0064d = list.get(list.size() - 1).d0064ddd0064d();
        jSONArrayD0064ddd0064d.put(100);
        jSONArrayDd0064dd0064d.put(jSONArrayD0064ddd0064d);
        return jSONArrayDd0064dd0064d;
    }

    public static yllyyyy d0064d00640064dd(MotionEvent motionEvent, int i, boolean z) {
        yllyyyy yllyyyyVar = new yllyyyy(z);
        if ((vvv0076v007600760076() * (vv00760076v007600760076() + vvv0076v007600760076())) % v00760076vv007600760076 != v0076v0076v007600760076) {
            v0076vvv007600760076 = vvv0076v007600760076();
            v0076v0076v007600760076 = 25;
        }
        yllyyyy.d00640064d0064dd(yllyyyyVar, ddd00640064dd(motionEvent, i));
        return yllyyyyVar;
    }

    public static yylyyyy dd006400640064dd(yylyyyy yylyyyyVar, yylyyyy yylyyyyVar2, long j) {
        int i = v0076vvv007600760076;
        if (((vv0076vv007600760076 + i) * i) % v00760076vv007600760076 != 0) {
            v0076vvv007600760076 = 85;
            v0076v0076v007600760076 = 4;
        }
        float f = yylyyyyVar2.t00740074tt00740074 - yylyyyyVar.t00740074tt00740074;
        float f2 = yylyyyyVar.t0074t00740074t0074;
        float f3 = (((yylyyyyVar2.t0074t00740074t0074 - f2) * (j - r3)) / f) + f2;
        float f4 = yylyyyyVar.tt007400740074t0074;
        float f5 = (((yylyyyyVar2.tt007400740074t0074 - f4) * (j - r3)) / f) + f4;
        float f6 = yylyyyyVar.t0074007400740074t0074;
        float f7 = (((yylyyyyVar2.t0074007400740074t0074 - f6) * (j - r3)) / f) + f6;
        float f8 = yylyyyyVar.ttttt00740074;
        float f9 = (((yylyyyyVar2.ttttt00740074 - f8) * (j - r3)) / f) + f8;
        float f10 = yylyyyyVar.t0074ttt00740074;
        float f11 = yylyyyyVar2.t0074ttt00740074 - f10;
        float f12 = yylyyyyVar.tt0074tt00740074;
        return new yylyyyy(f3, f5, f7, f9, ((f11 * (j - r3)) / f) + f10, (((yylyyyyVar2.tt0074tt00740074 - f12) * (j - r3)) / f) + f12, j);
    }

    private static JSONArray dd0064dd0064d(List<yylyyyy> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<yylyyyy> it = list.iterator();
        while (it.hasNext()) {
            int i = v0076vvv007600760076;
            if (((vv0076vv007600760076 + i) * i) % v00760076vv007600760076 != 0) {
                v0076vvv007600760076 = 35;
                vv0076vv007600760076 = vvv0076v007600760076();
            }
            jSONArray.put(it.next().d0064ddd0064d());
        }
        return jSONArray;
    }

    public static List<yylyyyy> ddd00640064dd(MotionEvent motionEvent, int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < motionEvent.getHistorySize(); i2++) {
            arrayList.add(new yylyyyy(motionEvent.getHistoricalPressure(i, i2), motionEvent.getHistoricalSize(i, i2), motionEvent.getHistoricalTouchMajor(i, i2), motionEvent.getHistoricalTouchMinor(i, i2), motionEvent.getHistoricalX(i, i2), motionEvent.getHistoricalY(i, i2), motionEvent.getHistoricalEventTime(i2)));
        }
        arrayList.add(new yylyyyy(motionEvent.getActionMasked(), motionEvent.getPressure(i), motionEvent.getSize(i), motionEvent.getTouchMajor(i), motionEvent.getTouchMinor(i), motionEvent.getX(i), motionEvent.getY(i), motionEvent.getEventTime()));
        return arrayList;
    }

    private double ddddd0064d(float f) {
        double dPow = f * Math.pow(10.0d, 2.0d);
        int i = v0076vvv007600760076;
        if (((vv0076vv007600760076 + i) * i) % v00760076vv007600760076 != 0) {
            v0076vvv007600760076 = 39;
            v0076v0076v007600760076 = vvv0076v007600760076();
        }
        return Math.round(dPow) / Math.pow(10.0d, 2.0d);
    }

    public static int v007600760076v007600760076() {
        return 0;
    }

    public static int vv00760076v007600760076() {
        return 1;
    }

    public static int vvv0076v007600760076() {
        return 30;
    }

    public boolean d0064006400640064dd(MotionEvent motionEvent, int i) {
        float x = motionEvent.getX(i);
        float y = motionEvent.getY(i);
        if (this.t0074ttt00740074 == x && this.tt0074tt00740074 == y) {
            return false;
        }
        int i2 = v0076vvv007600760076;
        if (((vv0076vv007600760076 + i2) * i2) % v00760076vv007600760076 != v007600760076v007600760076()) {
            v0076vvv007600760076 = vvv0076v007600760076();
            v0076v0076v007600760076 = vvv0076v007600760076();
        }
        return true;
    }

    public JSONArray d0064ddd0064d() throws JSONException {
        try {
            JSONArray jSONArrayPut = new JSONArray().put(this.t00740074tt00740074).put(ddddd0064d(this.t0074ttt00740074)).put(ddddd0064d(this.tt0074tt00740074));
            double dDdddd0064d = ddddd0064d(this.t0074t00740074t0074);
            int i = v0076vvv007600760076;
            if (((vv0076vv007600760076 + i) * i) % v00760076vv007600760076 != v0076v0076v007600760076) {
                v0076vvv007600760076 = 83;
                v0076v0076v007600760076 = 25;
            }
            return jSONArrayPut.put(dDdddd0064d).put(ddddd0064d(this.t0074007400740074t0074)).put(ddddd0064d(this.ttttt00740074)).put(ddddd0064d(this.tt007400740074t0074));
        } catch (JSONException unused) {
            return null;
        }
    }

    public yylyyyy(int i, float f, float f2, float f3, float f4, float f5, float f6, long j) {
        this.ttt00740074t0074 = i;
        this.t0074t00740074t0074 = f;
        this.tt007400740074t0074 = f2;
        this.t0074007400740074t0074 = f3;
        this.ttttt00740074 = f4;
        this.t0074ttt00740074 = f5;
        this.tt0074tt00740074 = f6;
        this.t00740074tt00740074 = j;
    }
}
