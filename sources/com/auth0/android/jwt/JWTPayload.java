package com.auth0.android.jwt;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
class JWTPayload {

    /* renamed from: a, reason: collision with root package name */
    public final Date f13659a;
    public final Date b;
    public final List c;
    public final Map d;

    public JWTPayload(Date date, Date date2, List list, HashMap map) {
        this.f13659a = date;
        this.b = date2;
        this.c = list;
        this.d = Collections.unmodifiableMap(map);
    }
}
