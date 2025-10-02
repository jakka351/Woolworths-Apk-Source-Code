package me.oriient.internal.services.eventManager.model;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final PublishMessage f25463a;
    public final Function2 b;
    public final Function3 c;

    public c(PublishMessage messageRequest, Function2 onSuccess, Function3 onFailure) {
        Intrinsics.h(messageRequest, "messageRequest");
        Intrinsics.h(onSuccess, "onSuccess");
        Intrinsics.h(onFailure, "onFailure");
        this.f25463a = messageRequest;
        this.b = onSuccess;
        this.c = onFailure;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.c(this.f25463a, cVar.f25463a) && Intrinsics.c(this.b, cVar.b) && Intrinsics.c(this.c, cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f25463a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MessageRequestWrapper(messageRequest=" + this.f25463a + ", onSuccess=" + this.b + ", onFailure=" + this.c + ')';
    }
}
