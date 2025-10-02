package com.google.firebase.perf.util;

import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes6.dex */
public class URLWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final URL f15726a;

    public URLWrapper(URL url) {
        this.f15726a = url;
    }

    public final URLConnection a() {
        return this.f15726a.openConnection();
    }

    public final String toString() {
        return this.f15726a.toString();
    }
}
