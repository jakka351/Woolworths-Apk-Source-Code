package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Entity
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/model/Dependency;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes.dex */
public final class Dependency {

    /* renamed from: a, reason: collision with root package name */
    public final String f3979a;
    public final String b;

    public Dependency(String str, String prerequisiteId) {
        Intrinsics.h(prerequisiteId, "prerequisiteId");
        this.f3979a = str;
        this.b = prerequisiteId;
    }
}
