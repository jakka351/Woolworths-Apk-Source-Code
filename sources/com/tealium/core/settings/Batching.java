package com.tealium.core.settings;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/settings/Batching;", "", "a", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final /* data */ class Batching {

    /* renamed from: a, reason: collision with root package name */
    public int f19177a = 1;
    public int b = 100;
    public int c = 86400;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tealium/core/settings/Batching$a;", "", "", com.salesforce.marketingcloud.config.a.k, "I", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Batching)) {
            return false;
        }
        Batching batching = (Batching) obj;
        return this.f19177a == batching.f19177a && this.b == batching.b && this.c == batching.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + androidx.camera.core.impl.b.a(this.b, Integer.hashCode(this.f19177a) * 31, 31);
    }

    public final String toString() {
        int i = this.f19177a;
        int i2 = this.b;
        return YU.a.m(YU.a.q(i, i2, "Batching(batchSize=", ", maxQueueSize=", ", expiration="), this.c, ")");
    }
}
