package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ClassLiteralValue {

    /* renamed from: a, reason: collision with root package name */
    public final ClassId f24538a;
    public final int b;

    public ClassLiteralValue(ClassId classId, int i) {
        this.f24538a = classId;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassLiteralValue)) {
            return false;
        }
        ClassLiteralValue classLiteralValue = (ClassLiteralValue) obj;
        return Intrinsics.c(this.f24538a, classLiteralValue.f24538a) && this.b == classLiteralValue.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f24538a.hashCode() * 31);
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            sb.append("kotlin/Array<");
            i2++;
        }
        sb.append(this.f24538a);
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(">");
        }
        return sb.toString();
    }
}
