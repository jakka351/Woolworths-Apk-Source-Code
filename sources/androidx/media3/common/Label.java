package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public class Label {

    /* renamed from: a, reason: collision with root package name */
    public final String f2856a;
    public final String b;

    static {
        Util.E(0);
        Util.E(1);
    }

    public Label(String str, String str2) {
        this.f2856a = Util.J(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Label label = (Label) obj;
            if (Objects.equals(this.f2856a, label.f2856a) && Objects.equals(this.b, label.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.f2856a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
