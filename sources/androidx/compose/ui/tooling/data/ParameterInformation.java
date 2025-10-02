package androidx.compose.ui.tooling.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@UiToolingDataApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/tooling/data/ParameterInformation;", "", "ui-tooling-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ParameterInformation {

    /* renamed from: a, reason: collision with root package name */
    public final String f2190a;
    public final Object b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;

    public ParameterInformation(String str, Object obj, boolean z, boolean z2, boolean z3, String str2, boolean z4) {
        this.f2190a = str;
        this.b = obj;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str2;
        this.g = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParameterInformation)) {
            return false;
        }
        ParameterInformation parameterInformation = (ParameterInformation) obj;
        return Intrinsics.c(this.f2190a, parameterInformation.f2190a) && Intrinsics.c(this.b, parameterInformation.b) && this.c == parameterInformation.c && this.d == parameterInformation.d && this.e == parameterInformation.e && Intrinsics.c(this.f, parameterInformation.f) && this.g == parameterInformation.g;
    }

    public final int hashCode() {
        int iHashCode = this.f2190a.hashCode() * 31;
        Object obj = this.b;
        int iE = b.e(b.e(b.e((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return Boolean.hashCode(this.g) + ((iE + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParameterInformation(name=");
        sb.append(this.f2190a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(", fromDefault=");
        sb.append(this.c);
        sb.append(", static=");
        sb.append(this.d);
        sb.append(", compared=");
        sb.append(this.e);
        sb.append(", inlineClass=");
        sb.append(this.f);
        sb.append(", stable=");
        return b.s(sb, this.g, ')');
    }
}
