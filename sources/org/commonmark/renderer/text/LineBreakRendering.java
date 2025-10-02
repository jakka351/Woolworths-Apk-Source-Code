package org.commonmark.renderer.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class LineBreakRendering {
    public static final /* synthetic */ LineBreakRendering[] d = {new LineBreakRendering("STRIP", 0), new LineBreakRendering("COMPACT", 1), new LineBreakRendering("SEPARATE_BLOCKS", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    LineBreakRendering EF5;

    public static LineBreakRendering valueOf(String str) {
        return (LineBreakRendering) Enum.valueOf(LineBreakRendering.class, str);
    }

    public static LineBreakRendering[] values() {
        return (LineBreakRendering[]) d.clone();
    }
}
