package androidx.constraintlayout.core.dsl;

import YU.a;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class Chain extends Helper {

    public class Anchor {
        public final String toString() {
            return a.h("[", ",0,0", "]");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Style {
        public static final Style d;
        public static final Style e;
        public static final Style f;
        public static final /* synthetic */ Style[] g;

        static {
            Style style = new Style("PACKED", 0);
            d = style;
            Style style2 = new Style("SPREAD", 1);
            e = style2;
            Style style3 = new Style("SPREAD_INSIDE", 2);
            f = style3;
            g = new Style[]{style, style2, style3};
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) g.clone();
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(Style.e, "'spread'");
        map.put(Style.f, "'spread_inside'");
        map.put(Style.d, "'packed'");
    }
}
