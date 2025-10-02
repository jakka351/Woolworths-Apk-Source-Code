package androidx.graphics.path;

import android.graphics.PointF;
import android.support.v4.media.session.a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/graphics/path/PathSegment;", "", "Type", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PathSegment {

    /* renamed from: a, reason: collision with root package name */
    public final Type f2776a;
    public final PointF[] b;
    public final float c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/graphics/path/PathSegment$Type;", "", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Type {
        public static final Type d;
        public static final Type e;
        public static final /* synthetic */ Type[] f;

        /* JADX INFO: Fake field, exist only in values array */
        Type EF0;

        static {
            Type type = new Type("Move", 0);
            Type type2 = new Type("Line", 1);
            Type type3 = new Type("Quadratic", 2);
            Type type4 = new Type("Conic", 3);
            Type type5 = new Type("Cubic", 4);
            Type type6 = new Type("Close", 5);
            d = type6;
            Type type7 = new Type("Done", 6);
            e = type7;
            f = new Type[]{type, type2, type3, type4, type5, type6, type7};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f.clone();
        }
    }

    public PathSegment(Type type, PointF[] pointFArr, float f) {
        this.f2776a = type;
        this.b = pointFArr;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!PathSegment.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type androidx.graphics.path.PathSegment");
        PathSegment pathSegment = (PathSegment) obj;
        return this.f2776a == pathSegment.f2776a && Arrays.equals(this.b, pathSegment.b) && this.c == pathSegment.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (((this.f2776a.hashCode() * 31) + Arrays.hashCode(this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PathSegment(type=");
        sb.append(this.f2776a);
        sb.append(", points=");
        String string = Arrays.toString(this.b);
        Intrinsics.g(string, "toString(this)");
        sb.append(string);
        sb.append(", weight=");
        return a.r(sb, this.c, ')');
    }
}
