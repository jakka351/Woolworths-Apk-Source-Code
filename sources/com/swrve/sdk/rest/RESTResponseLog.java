package com.swrve.sdk.rest;

import java.util.Map;

/* loaded from: classes6.dex */
public class RESTResponseLog {

    /* renamed from: a, reason: collision with root package name */
    public final int f19108a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final long f;

    public RESTResponseLog(int i, int i2, int i3, long j, String str, Map map) {
        this.f19108a = i;
        this.b = i2;
        this.c = i3;
        this.f = j;
        if (str == null || str.length() <= 250) {
            this.d = str;
        } else {
            this.d = str.substring(0, 250);
        }
        if (map == null || map.toString().length() <= 250) {
            this.e = map.toString();
        } else {
            this.e = map.toString().substring(0, 250);
        }
    }
}
