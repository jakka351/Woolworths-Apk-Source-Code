package io.grpc;

import com.google.common.base.Preconditions;
import java.util.concurrent.atomic.AtomicLong;

@Internal
/* loaded from: classes7.dex */
public final class InternalLogId {
    public static final AtomicLong d = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final String f23946a;
    public final String b;
    public final long c;

    public InternalLogId(String str, String str2, long j) {
        Preconditions.j(str, "typeName");
        Preconditions.f("empty type", !str.isEmpty());
        this.f23946a = str;
        this.b = str2;
        this.c = j;
    }

    public static InternalLogId a(Class cls, String str) {
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return new InternalLogId(simpleName, str, d.incrementAndGet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f23946a + "<" + this.c + ">");
        String str = this.b;
        if (str != null) {
            sb.append(": (");
            sb.append(str);
            sb.append(')');
        }
        return sb.toString();
    }
}
