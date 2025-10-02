package me.oriient.internal.services.dataManager.linesOfInterest;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.Mapable;

/* loaded from: classes7.dex */
public final class i implements Mapable {

    /* renamed from: a, reason: collision with root package name */
    public final String f25190a;

    public i(String value) {
        Intrinsics.h(value, "value");
        this.f25190a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.c(this.f25190a, ((i) obj).f25190a);
    }

    public final int hashCode() {
        return this.f25190a.hashCode();
    }

    @Override // me.oriient.internal.infra.utils.core.Mapable
    public final Map toMap() {
        return androidx.constraintlayout.core.state.a.s("mapId", this.f25190a);
    }

    public final String toString() {
        return me.oriient.internal.infra.rest.e.a(new StringBuilder("MapId(value="), this.f25190a, ')');
    }
}
