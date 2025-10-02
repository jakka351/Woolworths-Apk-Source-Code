package com.tealium.core.persistence;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/persistence/k;", "Lcom/tealium/core/persistence/VisitorStorage;", "a", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class k implements VisitorStorage {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f19174a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tealium/core/persistence/k$a;", "", "", "KEY_CURRENT_IDENTITY", "Ljava/lang/String;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
    }

    public k(h hVar) {
        this.f19174a = new g0(hVar, "visitors", false, null, null);
    }

    public final String a() {
        e0 e0VarB = this.f19174a.b("current_identity");
        if (e0VarB != null) {
            return e0VarB.b;
        }
        return null;
    }

    public final void b(String str, String visitorId) {
        Intrinsics.h(visitorId, "visitorId");
        this.f19174a.c(new e0(str, visitorId, Expiry.b, null, Serialization.STRING));
    }
}
