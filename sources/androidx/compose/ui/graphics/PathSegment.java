package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/PathSegment;", "", "Type", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PathSegment {

    /* renamed from: a, reason: collision with root package name */
    public final Type f1778a;
    public final float[] b;
    public final float c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/PathSegment$Type;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {
        public static final Type d;
        public static final Type e;
        public static final /* synthetic */ Type[] f;
        public static final /* synthetic */ EnumEntries g;

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
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7};
            f = typeArr;
            g = EnumEntriesKt.a(typeArr);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f.clone();
        }
    }

    public PathSegment(Type type, float[] fArr, float f) {
        this.f1778a = type;
        this.b = fArr;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PathSegment.class == obj.getClass()) {
            PathSegment pathSegment = (PathSegment) obj;
            if (this.f1778a == pathSegment.f1778a && Arrays.equals(this.b, pathSegment.b) && this.c == pathSegment.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ((Arrays.hashCode(this.b) + (this.f1778a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PathSegment(type=");
        sb.append(this.f1778a);
        sb.append(", points=");
        String string = Arrays.toString(this.b);
        Intrinsics.g(string, "toString(...)");
        sb.append(string);
        sb.append(", weight=");
        return android.support.v4.media.session.a.r(sb, this.c, ')');
    }
}
