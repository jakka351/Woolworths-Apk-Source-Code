package androidx.core.util;

import android.graphics.drawable.Drawable;
import android.support.v4.media.session.a;
import java.util.Objects;

/* loaded from: classes2.dex */
public class Pair<F, S> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2463a;
    public final Object b;

    public Pair(Object obj, Object obj2) {
        this.f2463a = obj;
        this.b = obj2;
    }

    public static Pair a(CharSequence charSequence, Drawable drawable) {
        return new Pair(charSequence, drawable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Objects.equals(pair.f2463a, this.f2463a) && Objects.equals(pair.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.f2463a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(this.f2463a);
        sb.append(" ");
        return a.o(this.b, "}", sb);
    }
}
