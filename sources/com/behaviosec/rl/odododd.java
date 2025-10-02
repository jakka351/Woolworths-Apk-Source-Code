package com.behaviosec.rl;

import org.json.JSONArray;

/* loaded from: classes4.dex */
public class odododd {
    public static int v00760076v0076v0076v = 50;
    public static int v0076v00760076v0076v = 1;
    public static int vv007600760076v0076v = 2;
    public static int vvv0076v00760076v;
    public JSONArray data;
    public String name;
    public String type;

    public odododd(String str, String str2, JSONArray jSONArray) {
        this.type = str;
        this.name = str2;
        this.data = jSONArray;
    }

    public static int v00760076vv00760076v() {
        return 84;
    }

    public static int v0076v0076v00760076v() {
        return 2;
    }

    public static int vvv00760076v0076v() {
        return 0;
    }

    public void s007300730073s0073s(String str) {
        this.name = str;
        int i = v00760076v0076v0076v;
        if (((v0076v00760076v0076v + i) * i) % vv007600760076v0076v != vvv00760076v0076v()) {
            v00760076v0076v0076v = 17;
            v0076v00760076v0076v = 15;
        }
    }

    public JSONArray s00730073ss0073s() {
        if ((v00760076vv00760076v() * (v00760076vv00760076v() + v0076v00760076v0076v)) % vv007600760076v0076v != vvv0076v00760076v) {
            v00760076v0076v0076v = v00760076vv00760076v();
            vvv0076v00760076v = v00760076vv00760076v();
        }
        return this.data;
    }

    public String s0073s0073s0073s() {
        return this.type;
    }

    public void ss00730073s0073s(JSONArray jSONArray) {
        int i = v00760076v0076v0076v;
        if (((v0076v00760076v0076v + i) * i) % v0076v0076v00760076v() != vvv0076v00760076v) {
            v00760076v0076v0076v = 40;
            vvv0076v00760076v = 54;
        }
        this.data = jSONArray;
    }

    public String sss0073s0073s() {
        return this.name;
    }

    public void ssss00730073s(String str) {
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                v00760076v0076v0076v = 65;
                int i = 5;
                while (true) {
                    try {
                        i /= 0;
                    } catch (Exception unused2) {
                        v00760076v0076v0076v = v00760076vv00760076v();
                        this.type = str;
                        return;
                    }
                }
            }
        }
    }
}
