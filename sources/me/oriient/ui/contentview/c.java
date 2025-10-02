package me.oriient.ui.contentview;

/* loaded from: classes8.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f26589a;
    private final float b;
    private final float c;

    public c(int i, float f, float f2) {
        this.f26589a = i;
        this.b = f;
        this.c = f2;
    }

    public final int a() {
        return this.f26589a;
    }

    public final float b() {
        return this.b;
    }

    public final float c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f26589a == cVar.f26589a && Float.compare(this.b, cVar.b) == 0 && Float.compare(this.c, cVar.c) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.c) + android.support.v4.media.session.a.b(this.b, Integer.hashCode(this.f26589a) * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DecelerationData(count=");
        sb.append(this.f26589a);
        sb.append(", velocityX=");
        sb.append(this.b);
        sb.append(", velocityY=");
        return android.support.v4.media.session.a.r(sb, this.c, ')');
    }
}
