package androidx.compose.material3;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/ScaffoldLayoutContent;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScaffoldLayoutContent {
    public static final ScaffoldLayoutContent d;
    public static final ScaffoldLayoutContent e;
    public static final ScaffoldLayoutContent f;
    public static final ScaffoldLayoutContent g;
    public static final ScaffoldLayoutContent h;
    public static final /* synthetic */ ScaffoldLayoutContent[] i;

    static {
        ScaffoldLayoutContent scaffoldLayoutContent = new ScaffoldLayoutContent("TopBar", 0);
        d = scaffoldLayoutContent;
        ScaffoldLayoutContent scaffoldLayoutContent2 = new ScaffoldLayoutContent("MainContent", 1);
        e = scaffoldLayoutContent2;
        ScaffoldLayoutContent scaffoldLayoutContent3 = new ScaffoldLayoutContent("Snackbar", 2);
        f = scaffoldLayoutContent3;
        ScaffoldLayoutContent scaffoldLayoutContent4 = new ScaffoldLayoutContent("Fab", 3);
        g = scaffoldLayoutContent4;
        ScaffoldLayoutContent scaffoldLayoutContent5 = new ScaffoldLayoutContent("BottomBar", 4);
        h = scaffoldLayoutContent5;
        i = new ScaffoldLayoutContent[]{scaffoldLayoutContent, scaffoldLayoutContent2, scaffoldLayoutContent3, scaffoldLayoutContent4, scaffoldLayoutContent5};
    }

    public static ScaffoldLayoutContent valueOf(String str) {
        return (ScaffoldLayoutContent) Enum.valueOf(ScaffoldLayoutContent.class, str);
    }

    public static ScaffoldLayoutContent[] values() {
        return (ScaffoldLayoutContent[]) i.clone();
    }
}
