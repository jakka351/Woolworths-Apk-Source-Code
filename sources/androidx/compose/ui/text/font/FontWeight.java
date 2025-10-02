package androidx.compose.ui.text.font;

import YU.a;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight;", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Immutable
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FontWeight implements Comparable<FontWeight> {
    public static final FontWeight e;
    public static final FontWeight f;
    public static final FontWeight g;
    public static final FontWeight h;
    public static final FontWeight i;
    public static final FontWeight j;
    public static final FontWeight k;
    public static final FontWeight l;
    public static final FontWeight m;
    public static final FontWeight n;
    public static final List o;
    public final int d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        FontWeight fontWeight = new FontWeight(100);
        FontWeight fontWeight2 = new FontWeight(200);
        FontWeight fontWeight3 = new FontWeight(nlnlnnn.xxx00780078x0078);
        FontWeight fontWeight4 = new FontWeight(400);
        e = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(500);
        f = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(600);
        g = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(700);
        FontWeight fontWeight8 = new FontWeight(800);
        h = fontWeight8;
        FontWeight fontWeight9 = new FontWeight(900);
        i = fontWeight3;
        j = fontWeight4;
        k = fontWeight5;
        l = fontWeight6;
        m = fontWeight7;
        n = fontWeight8;
        o = CollectionsKt.R(fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9);
    }

    public FontWeight(int i2) {
        this.d = i2;
        boolean z = false;
        if (1 <= i2 && i2 < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        InlineClassHelperKt.a("Font weight can be in range [1, 1000]. Current value: " + i2);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(FontWeight fontWeight) {
        return Intrinsics.j(this.d, fontWeight.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FontWeight) {
            return this.d == ((FontWeight) obj).d;
        }
        return false;
    }

    /* renamed from: hashCode, reason: from getter */
    public final int getD() {
        return this.d;
    }

    public final String toString() {
        return a.l(new StringBuilder("FontWeight(weight="), this.d, ')');
    }
}
