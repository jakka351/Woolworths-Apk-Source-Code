package com.bumptech.glide.manager;

import YU.a;
import com.bumptech.glide.request.Request;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class RequestTracker {

    /* renamed from: a, reason: collision with root package name */
    public final Set f13953a = Collections.newSetFromMap(new WeakHashMap());
    public final HashSet b = new HashSet();
    public boolean c;

    public final boolean a(Request request) {
        boolean z = true;
        if (request == null) {
            return true;
        }
        boolean zRemove = this.f13953a.remove(request);
        if (!this.b.remove(request) && !zRemove) {
            z = false;
        }
        if (z) {
            request.clear();
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.f13953a.size());
        sb.append(", isPaused=");
        return a.k("}", sb, this.c);
    }
}
