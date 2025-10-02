package org.commonmark.ext.gfm.tables;

import org.commonmark.node.CustomNode;

/* loaded from: classes8.dex */
public class TableCell extends CustomNode {
    public boolean g;
    public Alignment h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Alignment {
        public static final Alignment d;
        public static final Alignment e;
        public static final Alignment f;
        public static final /* synthetic */ Alignment[] g;

        static {
            Alignment alignment = new Alignment("LEFT", 0);
            d = alignment;
            Alignment alignment2 = new Alignment("CENTER", 1);
            e = alignment2;
            Alignment alignment3 = new Alignment("RIGHT", 2);
            f = alignment3;
            g = new Alignment[]{alignment, alignment2, alignment3};
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) g.clone();
        }
    }
}
