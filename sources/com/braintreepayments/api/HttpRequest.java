package com.braintreepayments.api;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;

/* loaded from: classes4.dex */
class HttpRequest {

    /* renamed from: a, reason: collision with root package name */
    public String f13726a;
    public byte[] c;
    public String d;
    public HashMap g = null;
    public final HashMap h = new HashMap();
    public String b = "";
    public final int e = 30000;
    public final int f = 30000;

    public final void a(String str, String str2) {
        this.h.put(str, str2);
    }

    public final URL b() throws URISyntaxException {
        if (this.f13726a.startsWith("http")) {
            return new URL(this.f13726a);
        }
        URI uri = new URL(this.b).toURI();
        String path = uri.getPath();
        return uri.resolve(new File(new File(path), this.f13726a).getPath()).normalize().toURL();
    }
}
