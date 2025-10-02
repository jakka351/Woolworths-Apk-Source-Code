package me.oriient.internal.services.websocket.framing;

import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public abstract class h implements f {
    public final me.oriient.internal.services.websocket.enums.c b;
    public ByteBuffer c = ByteBuffer.allocate(0);

    /* renamed from: a, reason: collision with root package name */
    public boolean f25673a = true;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;

    public h(me.oriient.internal.services.websocket.enums.c cVar) {
        this.b = cVar;
    }

    @Override // me.oriient.internal.services.websocket.framing.f
    public ByteBuffer a() {
        return this.c;
    }

    public abstract void b();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f25673a != hVar.f25673a || this.d != hVar.d || this.e != hVar.e || this.f != hVar.f || this.g != hVar.g || this.b != hVar.b) {
                return false;
            }
            ByteBuffer byteBuffer = this.c;
            if (byteBuffer != null) {
                return byteBuffer.equals(hVar.c);
            }
            if (hVar.c == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.b.hashCode() + ((this.f25673a ? 1 : 0) * 31)) * 31;
        ByteBuffer byteBuffer = this.c;
        return ((((((((iHashCode + (byteBuffer != null ? byteBuffer.hashCode() : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Framedata{ opcode:");
        sb.append(this.b);
        sb.append(", fin:");
        sb.append(this.f25673a);
        sb.append(", rsv1:");
        sb.append(this.e);
        sb.append(", rsv2:");
        sb.append(this.f);
        sb.append(", rsv3:");
        sb.append(this.g);
        sb.append(", payload length:[pos:");
        sb.append(this.c.position());
        sb.append(", len:");
        sb.append(this.c.remaining());
        sb.append("], payload:");
        return me.oriient.internal.infra.rest.e.a(sb, this.c.remaining() > 1000 ? "(too big to display)" : new String(this.c.array()), '}');
    }

    public void a(ByteBuffer byteBuffer) {
        this.c = byteBuffer;
    }
}
