package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import java.util.HashMap;

/* loaded from: classes6.dex */
public class nnlnnnn {
    public static int s0073007300730073s0073s = 2;
    public static int s0073s00730073s0073s = 40;
    public static int ss007300730073s0073s = 1;
    private final HashMap<String, String> xxxx0078x0078 = new HashMap<>();

    public static int s0073sss00730073s() {
        return 2;
    }

    public static int sssss00730073s() {
        return 82;
    }

    public void o006Fo006F006Foo(String str, String str2) {
        this.xxxx0078x0078.put(str, str2);
    }

    public HashMap<String, String> oo006F006F006Foo() {
        int i = s0073s00730073s0073s;
        if (((ss007300730073s0073s + i) * i) % s0073007300730073s0073s != 0) {
            s0073s00730073s0073s = 52;
            ss007300730073s0073s = sssss00730073s();
        }
        int iSssss00730073s = sssss00730073s();
        if (((ss007300730073s0073s + iSssss00730073s) * iSssss00730073s) % s0073007300730073s0073s != 0) {
            s0073s00730073s0073s = 85;
            ss007300730073s0073s = sssss00730073s();
        }
        return this.xxxx0078x0078;
    }
}
