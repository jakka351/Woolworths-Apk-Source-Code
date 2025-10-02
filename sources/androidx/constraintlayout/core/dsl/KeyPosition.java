package androidx.constraintlayout.core.dsl;

/* loaded from: classes2.dex */
public class KeyPosition extends Keys {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final /* synthetic */ Type[] d = {new Type("CARTESIAN", 0), new Type("SCREEN", 1), new Type("PATH", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        Type EF5;

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) d.clone();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPositions:{\nframe:0,\n");
        Keys.a(sb, "percentX");
        Keys.a(sb, "percentY");
        Keys.a(sb, "percentWidth");
        Keys.a(sb, "percentHeight");
        sb.append("},\n");
        return sb.toString();
    }
}
