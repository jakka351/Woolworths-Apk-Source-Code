package io.grpc.internal;

import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class InsightBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24022a = new ArrayList();

    public final void a(Object obj, String str) {
        this.f24022a.add(str + "=" + obj);
    }

    public final String toString() {
        return this.f24022a.toString();
    }
}
