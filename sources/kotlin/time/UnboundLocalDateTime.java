package kotlin.time;

import YU.a;
import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/UnboundLocalDateTime;", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ExperimentalTime
/* loaded from: classes7.dex */
final class UnboundLocalDateTime {

    /* renamed from: a, reason: collision with root package name */
    public final int f24685a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/time/UnboundLocalDateTime$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
    }

    public UnboundLocalDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f24685a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnboundLocalDateTime(");
        sb.append(this.f24685a);
        sb.append('-');
        sb.append(this.b);
        sb.append('-');
        sb.append(this.c);
        sb.append(' ');
        sb.append(this.d);
        sb.append(':');
        sb.append(this.e);
        sb.append(':');
        sb.append(this.f);
        sb.append(JwtParser.SEPARATOR_CHAR);
        return a.l(sb, this.g, ')');
    }
}
