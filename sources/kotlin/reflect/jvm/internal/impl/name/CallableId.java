package kotlin.reflect.jvm.internal.impl.name;

import com.medallia.digital.mobilesdk.q2;
import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CallableId {

    /* renamed from: a, reason: collision with root package name */
    public final FqName f24498a;
    public final Name b;

    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        Name name = SpecialNames.f;
        FqName fqName = FqName.c;
        FqName.Companion.a(name);
    }

    public CallableId(FqName packageName, Name name) {
        Intrinsics.h(packageName, "packageName");
        this.f24498a = packageName;
        this.b = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallableId)) {
            return false;
        }
        CallableId callableId = (CallableId) obj;
        return Intrinsics.c(this.f24498a, callableId.f24498a) && this.b.equals(callableId.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f24498a.hashCode() + 527) * 961);
    }

    public final String toString() {
        return StringsKt.R(this.f24498a.f24500a.f24501a, JwtParser.SEPARATOR_CHAR, '/') + q2.c + this.b;
    }
}
