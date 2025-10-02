package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsActions;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SemanticsActions {
    public static final SemanticsPropertyKey A;
    public static final SemanticsPropertyKey B;

    /* renamed from: a, reason: collision with root package name */
    public static final SemanticsPropertyKey f2016a;
    public static final SemanticsPropertyKey b;
    public static final SemanticsPropertyKey c;
    public static final SemanticsPropertyKey d;
    public static final SemanticsPropertyKey e;
    public static final SemanticsPropertyKey f;
    public static final SemanticsPropertyKey g;
    public static final SemanticsPropertyKey h;
    public static final SemanticsPropertyKey i;
    public static final SemanticsPropertyKey j;
    public static final SemanticsPropertyKey k;
    public static final SemanticsPropertyKey l;
    public static final SemanticsPropertyKey m;
    public static final SemanticsPropertyKey n;
    public static final SemanticsPropertyKey o;
    public static final SemanticsPropertyKey p;
    public static final SemanticsPropertyKey q;
    public static final SemanticsPropertyKey r;
    public static final SemanticsPropertyKey s;
    public static final SemanticsPropertyKey t;
    public static final SemanticsPropertyKey u;
    public static final SemanticsPropertyKey v;
    public static final SemanticsPropertyKey w;
    public static final SemanticsPropertyKey x;
    public static final SemanticsPropertyKey y;
    public static final SemanticsPropertyKey z;

    static {
        SemanticsPropertiesKt$ActionPropertyKey$1 semanticsPropertiesKt$ActionPropertyKey$1 = SemanticsPropertiesKt$ActionPropertyKey$1.h;
        f2016a = SemanticsPropertiesKt.b("GetTextLayoutResult", semanticsPropertiesKt$ActionPropertyKey$1);
        b = SemanticsPropertiesKt.b("OnClick", semanticsPropertiesKt$ActionPropertyKey$1);
        c = SemanticsPropertiesKt.b("OnLongClick", semanticsPropertiesKt$ActionPropertyKey$1);
        d = SemanticsPropertiesKt.b("ScrollBy", semanticsPropertiesKt$ActionPropertyKey$1);
        e = new SemanticsPropertyKey("ScrollByOffset");
        f = SemanticsPropertiesKt.b("ScrollToIndex", semanticsPropertiesKt$ActionPropertyKey$1);
        g = SemanticsPropertiesKt.b("OnAutofillText", semanticsPropertiesKt$ActionPropertyKey$1);
        h = SemanticsPropertiesKt.b("SetProgress", semanticsPropertiesKt$ActionPropertyKey$1);
        i = SemanticsPropertiesKt.b("SetSelection", semanticsPropertiesKt$ActionPropertyKey$1);
        j = SemanticsPropertiesKt.b("SetText", semanticsPropertiesKt$ActionPropertyKey$1);
        k = SemanticsPropertiesKt.b("SetTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$1);
        l = SemanticsPropertiesKt.b("ShowTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$1);
        m = SemanticsPropertiesKt.b("ClearTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$1);
        n = SemanticsPropertiesKt.b("InsertTextAtCursor", semanticsPropertiesKt$ActionPropertyKey$1);
        o = SemanticsPropertiesKt.b("PerformImeAction", semanticsPropertiesKt$ActionPropertyKey$1);
        p = SemanticsPropertiesKt.b("CopyText", semanticsPropertiesKt$ActionPropertyKey$1);
        q = SemanticsPropertiesKt.b("CutText", semanticsPropertiesKt$ActionPropertyKey$1);
        r = SemanticsPropertiesKt.b("PasteText", semanticsPropertiesKt$ActionPropertyKey$1);
        s = SemanticsPropertiesKt.b("Expand", semanticsPropertiesKt$ActionPropertyKey$1);
        t = SemanticsPropertiesKt.b("Collapse", semanticsPropertiesKt$ActionPropertyKey$1);
        u = SemanticsPropertiesKt.b("Dismiss", semanticsPropertiesKt$ActionPropertyKey$1);
        v = SemanticsPropertiesKt.b("RequestFocus", semanticsPropertiesKt$ActionPropertyKey$1);
        w = SemanticsPropertiesKt.a("CustomActions");
        x = SemanticsPropertiesKt.b("PageUp", semanticsPropertiesKt$ActionPropertyKey$1);
        y = SemanticsPropertiesKt.b("PageLeft", semanticsPropertiesKt$ActionPropertyKey$1);
        z = SemanticsPropertiesKt.b("PageDown", semanticsPropertiesKt$ActionPropertyKey$1);
        A = SemanticsPropertiesKt.b("PageRight", semanticsPropertiesKt$ActionPropertyKey$1);
        B = SemanticsPropertiesKt.b("GetScrollViewportLength", semanticsPropertiesKt$ActionPropertyKey$1);
    }
}
