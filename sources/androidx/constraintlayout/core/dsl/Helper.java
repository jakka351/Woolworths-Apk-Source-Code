package androidx.constraintlayout.core.dsl;

import YU.a;
import androidx.constraintlayout.core.dsl.Constraint;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class Helper {

    public static final class HelperType {
        public final String toString() {
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final Type d;
        public static final Type e;
        public static final Type f;
        public static final Type g;
        public static final Type h;
        public static final /* synthetic */ Type[] i;

        static {
            Type type = new Type("VERTICAL_GUIDELINE", 0);
            d = type;
            Type type2 = new Type("HORIZONTAL_GUIDELINE", 1);
            e = type2;
            Type type3 = new Type("VERTICAL_CHAIN", 2);
            f = type3;
            Type type4 = new Type("HORIZONTAL_CHAIN", 3);
            g = type4;
            Type type5 = new Type("BARRIER", 4);
            h = type5;
            i = new Type[]{type, type2, type3, type4, type5};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) i.clone();
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(Constraint.Side.d, "'left'");
        map.put(Constraint.Side.e, "'right'");
        map.put(Constraint.Side.f, "'top'");
        map.put(Constraint.Side.g, "'bottom'");
        map.put(Constraint.Side.h, "'start'");
        map.put(Constraint.Side.i, "'end'");
        map.put(Constraint.Side.j, "'baseline'");
        HashMap map2 = new HashMap();
        map2.put(Type.d, "vGuideline");
        map2.put(Type.e, "hGuideline");
        map2.put(Type.f, "vChain");
        map2.put(Type.g, "hChain");
        map2.put(Type.h, "barrier");
    }

    public final String toString() {
        return a.A("null:{\n", "},\n");
    }
}
