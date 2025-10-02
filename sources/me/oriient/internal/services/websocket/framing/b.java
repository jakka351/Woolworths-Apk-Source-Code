package me.oriient.internal.services.websocket.framing;

import com.google.android.gms.location.GeofenceStatusCodes;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public final class b extends d {
    public int h;
    public String i;

    public b() {
        super(me.oriient.internal.services.websocket.enums.c.CLOSING);
        this.i = "";
        byte[] bArrB = me.oriient.internal.services.websocket.util.b.b("");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(this.h);
        byteBufferAllocate.position(2);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArrB.length + 2);
        byteBufferAllocate2.put(byteBufferAllocate);
        byteBufferAllocate2.put(bArrB);
        byteBufferAllocate2.rewind();
        this.c = byteBufferAllocate2;
        this.h = 1000;
        byte[] bArrB2 = me.oriient.internal.services.websocket.util.b.b(this.i);
        ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(4);
        byteBufferAllocate3.putInt(this.h);
        byteBufferAllocate3.position(2);
        ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(bArrB2.length + 2);
        byteBufferAllocate4.put(byteBufferAllocate3);
        byteBufferAllocate4.put(bArrB2);
        byteBufferAllocate4.rewind();
        this.c = byteBufferAllocate4;
    }

    @Override // me.oriient.internal.services.websocket.framing.h
    public final void a(ByteBuffer byteBuffer) {
        this.h = GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT;
        this.i = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.h = 1000;
            return;
        }
        if (byteBuffer.remaining() == 1) {
            this.h = 1002;
            return;
        }
        if (byteBuffer.remaining() >= 2) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.position(2);
            byteBufferAllocate.putShort(byteBuffer.getShort());
            byteBufferAllocate.position(0);
            this.h = byteBufferAllocate.getInt();
        }
        byteBuffer.reset();
        try {
            int iPosition = byteBuffer.position();
            try {
                try {
                    byteBuffer.position(byteBuffer.position() + 2);
                    this.i = me.oriient.internal.services.websocket.util.b.b(byteBuffer);
                } catch (IllegalArgumentException unused) {
                    throw new me.oriient.internal.services.websocket.exceptions.c(1007);
                }
            } finally {
                byteBuffer.position(iPosition);
            }
        } catch (me.oriient.internal.services.websocket.exceptions.c unused2) {
            this.h = 1007;
            this.i = null;
        }
    }

    @Override // me.oriient.internal.services.websocket.framing.d, me.oriient.internal.services.websocket.framing.h
    public final void b() throws me.oriient.internal.services.websocket.exceptions.c {
        super.b();
        if (this.h == 1007 && this.i.isEmpty()) {
            throw new me.oriient.internal.services.websocket.exceptions.c(1007, "Received text is no valid utf8 string!");
        }
        if (this.h == 1005 && this.i.length() > 0) {
            throw new me.oriient.internal.services.websocket.exceptions.c(1002, "A close frame must have a closecode if it has a reason");
        }
        int i = this.h;
        if (i > 1015 && i < 3000) {
            throw new me.oriient.internal.services.websocket.exceptions.c(1002, "Trying to send an illegal close code!");
        }
        if (i == 1006 || i == 1015 || i == 1005 || i > 4999 || i < 1000 || i == 1004) {
            throw new me.oriient.internal.services.websocket.exceptions.d("closecode must not be sent over the wire: " + this.h);
        }
    }

    @Override // me.oriient.internal.services.websocket.framing.h
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.h != bVar.h) {
            return false;
        }
        String str = this.i;
        String str2 = bVar.i;
        return str != null ? str.equals(str2) : str2 == null;
    }

    @Override // me.oriient.internal.services.websocket.framing.h
    public final int hashCode() {
        int iHashCode = ((super.hashCode() * 31) + this.h) * 31;
        String str = this.i;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // me.oriient.internal.services.websocket.framing.h
    public final String toString() {
        return super.toString() + "code: " + this.h;
    }

    @Override // me.oriient.internal.services.websocket.framing.h, me.oriient.internal.services.websocket.framing.f
    public final ByteBuffer a() {
        if (this.h == 1005) {
            return ByteBuffer.allocate(0);
        }
        return this.c;
    }
}
