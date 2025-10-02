package androidx.compose.ui.text.style;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/style/TextDecoration;", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextDecoration {
    public static final TextDecoration b = new TextDecoration(0);
    public static final TextDecoration c = new TextDecoration(1);
    public static final TextDecoration d = new TextDecoration(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f2157a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/style/TextDecoration$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    public TextDecoration(int i) {
        this.f2157a = i;
    }

    public final boolean a(TextDecoration textDecoration) {
        int i = textDecoration.f2157a;
        int i2 = this.f2157a;
        return (i | i2) == i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextDecoration) {
            return this.f2157a == ((TextDecoration) obj).f2157a;
        }
        return false;
    }

    /* renamed from: hashCode, reason: from getter */
    public final int getF2157a() {
        return this.f2157a;
    }

    public final String toString() {
        int i = this.f2157a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return b.r(new StringBuilder("TextDecoration["), ListUtilsKt.b(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
