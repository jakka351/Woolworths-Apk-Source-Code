package androidx.compose.ui.tooling.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@UiToolingDataApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/tooling/data/SourceLocation;", "", "ui-tooling-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SourceLocation {

    /* renamed from: a, reason: collision with root package name */
    public final int f2193a;
    public final int b;
    public final int c;
    public final String d;
    public final int e;

    public SourceLocation(String str, int i, int i2, int i3, int i4) {
        this.f2193a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceLocation)) {
            return false;
        }
        SourceLocation sourceLocation = (SourceLocation) obj;
        return this.f2193a == sourceLocation.f2193a && this.b == sourceLocation.b && this.c == sourceLocation.c && Intrinsics.c(this.d, sourceLocation.d) && this.e == sourceLocation.e;
    }

    public final int hashCode() {
        int iA = b.a(this.c, b.a(this.b, Integer.hashCode(this.f2193a) * 31, 31), 31);
        String str = this.d;
        return Integer.hashCode(this.e) + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SourceLocation(lineNumber=");
        sb.append(this.f2193a);
        sb.append(", offset=");
        sb.append(this.b);
        sb.append(", length=");
        sb.append(this.c);
        sb.append(", sourceFile=");
        sb.append(this.d);
        sb.append(", packageHash=");
        return a.l(sb, this.e, ')');
    }
}
