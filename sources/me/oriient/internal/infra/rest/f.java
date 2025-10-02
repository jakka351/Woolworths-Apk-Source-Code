package me.oriient.internal.infra.rest;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f24978a;
    public final String b;
    public final String c;
    public final String d;

    public f(String url, String body, String contentType, String method) {
        Intrinsics.h(url, "url");
        Intrinsics.h(body, "body");
        Intrinsics.h(contentType, "contentType");
        Intrinsics.h(method, "method");
        this.f24978a = url;
        this.b = body;
        this.c = contentType;
        this.d = method;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.c(this.f24978a, fVar.f24978a) && Intrinsics.c(this.b, fVar.b) && Intrinsics.c(this.c, fVar.c) && Intrinsics.c(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a.a(this.c, a.a(this.b, this.f24978a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RestRequest(url=");
        sb.append(this.f24978a);
        sb.append(", body=");
        sb.append(this.b);
        sb.append(", contentType=");
        sb.append(this.c);
        sb.append(", method=");
        return e.a(sb, this.d, ')');
    }
}
