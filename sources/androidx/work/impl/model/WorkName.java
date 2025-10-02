package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Entity
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/model/WorkName;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes.dex */
public final class WorkName {

    /* renamed from: a, reason: collision with root package name */
    public final String f3986a;
    public final String b;

    public WorkName(String name, String str) {
        Intrinsics.h(name, "name");
        this.f3986a = name;
        this.b = str;
    }
}
