package com.halilibo.richtext.markdown.node;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/markdown/node/AstTableCellAlignment;", "", "richtext-markdown_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AstTableCellAlignment {
    public static final AstTableCellAlignment d;
    public static final AstTableCellAlignment e;
    public static final AstTableCellAlignment f;
    public static final /* synthetic */ AstTableCellAlignment[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        AstTableCellAlignment astTableCellAlignment = new AstTableCellAlignment("LEFT", 0);
        d = astTableCellAlignment;
        AstTableCellAlignment astTableCellAlignment2 = new AstTableCellAlignment("CENTER", 1);
        e = astTableCellAlignment2;
        AstTableCellAlignment astTableCellAlignment3 = new AstTableCellAlignment("RIGHT", 2);
        f = astTableCellAlignment3;
        AstTableCellAlignment[] astTableCellAlignmentArr = {astTableCellAlignment, astTableCellAlignment2, astTableCellAlignment3};
        g = astTableCellAlignmentArr;
        h = EnumEntriesKt.a(astTableCellAlignmentArr);
    }

    public static AstTableCellAlignment valueOf(String str) {
        return (AstTableCellAlignment) Enum.valueOf(AstTableCellAlignment.class, str);
    }

    public static AstTableCellAlignment[] values() {
        return (AstTableCellAlignment[]) g.clone();
    }
}
