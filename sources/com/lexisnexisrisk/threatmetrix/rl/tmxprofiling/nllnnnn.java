package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import YU.a;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class nllnnnn {
    public static int s00730073ss00730073s = 1;
    public static int s0073s0073s00730073s = 0;
    public static int ss0073ss00730073s = 5;
    public static int sss0073s00730073s = 2;
    private final HashMap<String, nnlnnnn> x0078xx0078x0078 = new HashMap<>();

    public static int s007300730073s00730073s() {
        return 2;
    }

    public static int ss00730073s00730073s() {
        return 32;
    }

    public nnlnnnn o006F006F006F006Foo(String str) {
        nnlnnnn nnlnnnnVar = this.x0078xx0078x0078.get(str);
        int i = ss0073ss00730073s;
        int i2 = s00730073ss00730073s;
        int i3 = (i + i2) * i;
        int i4 = sss0073s00730073s;
        if (i3 % i4 != s0073s0073s00730073s) {
            ss0073ss00730073s = 83;
            s0073s0073s00730073s = 19;
            if (a.z(83, i2, 83, i4) != 0) {
                ss0073ss00730073s = ss00730073s00730073s();
                s0073s0073s00730073s = ss00730073s00730073s();
            }
        }
        return nnlnnnnVar;
    }

    public void o006Fooo006Fo(String str, String str2, String str3) {
        if (this.x0078xx0078x0078.containsKey(str)) {
            HashMap<String, nnlnnnn> map = this.x0078xx0078x0078;
            int i = ss0073ss00730073s;
            if (((s00730073ss00730073s + i) * i) % sss0073s00730073s != 0) {
                ss0073ss00730073s = 29;
                s00730073ss00730073s = 18;
            }
            map.get(str).o006Fo006F006Foo(str2, str3);
            return;
        }
        nnlnnnn nnlnnnnVar = new nnlnnnn();
        nnlnnnnVar.o006Fo006F006Foo(str2, str3);
        this.x0078xx0078x0078.put(str, nnlnnnnVar);
        int i2 = ss0073ss00730073s;
        if (((s00730073ss00730073s + i2) * i2) % sss0073s00730073s != s0073s0073s00730073s) {
            ss0073ss00730073s = ss00730073s00730073s();
            s0073s0073s00730073s = ss00730073s00730073s();
        }
    }

    public HashMap<String, nnlnnnn> ooooo006Fo() {
        int i = ss0073ss00730073s;
        if (((s00730073ss00730073s + i) * i) % s007300730073s00730073s() != s0073s0073s00730073s) {
            int i2 = ss0073ss00730073s;
            if (((s00730073ss00730073s + i2) * i2) % sss0073s00730073s != 0) {
                ss0073ss00730073s = ss00730073s00730073s();
                s0073s0073s00730073s = 64;
            }
            ss0073ss00730073s = ss00730073s00730073s();
            s0073s0073s00730073s = ss00730073s00730073s();
        }
        return this.x0078xx0078x0078;
    }
}
