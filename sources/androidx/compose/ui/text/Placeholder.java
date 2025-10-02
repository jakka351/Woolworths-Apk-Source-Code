package androidx.compose.ui.text;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/Placeholder;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class Placeholder {

    /* renamed from: a, reason: collision with root package name */
    public final long f2051a;
    public final long b;
    public final int c;

    public Placeholder(long j, long j2, int i) {
        this.f2051a = j;
        this.b = j2;
        this.c = i;
        TextUnitType[] textUnitTypeArr = TextUnit.b;
        if ((j & 1095216660480L) == 0) {
            InlineClassHelperKt.a("width cannot be TextUnit.Unspecified");
        }
        if ((j2 & 1095216660480L) == 0) {
            InlineClassHelperKt.a("height cannot be TextUnit.Unspecified");
        }
    }

    /* renamed from: a, reason: from getter */
    public final long getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final int getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final long getF2051a() {
        return this.f2051a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) obj;
        return TextUnit.a(this.f2051a, placeholder.f2051a) && TextUnit.a(this.b, placeholder.b) && this.c == placeholder.c;
    }

    public final int hashCode() {
        TextUnitType[] textUnitTypeArr = TextUnit.b;
        return Integer.hashCode(this.c) + b.b(Long.hashCode(this.f2051a) * 31, 31, this.b);
    }

    public final String toString() {
        return "Placeholder(width=" + ((Object) TextUnit.e(this.f2051a)) + ", height=" + ((Object) TextUnit.e(this.b)) + ", placeholderVerticalAlign=" + ((Object) PlaceholderVerticalAlign.b(this.c)) + ')';
    }
}
