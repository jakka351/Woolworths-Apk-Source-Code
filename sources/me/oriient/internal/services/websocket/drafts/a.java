package me.oriient.internal.services.websocket.drafts;

import java.nio.ByteBuffer;
import me.oriient.internal.services.websocket.enums.e;
import me.oriient.internal.services.websocket.handshake.c;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public e f25667a = null;

    public static String a(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b = 48;
        while (true) {
            if (!byteBuffer.hasRemaining()) {
                byteBuffer.position(byteBuffer.position() - byteBufferAllocate.position());
                byteBufferAllocate = null;
                break;
            }
            byte b2 = byteBuffer.get();
            byteBufferAllocate.put(b2);
            if (b == 13 && b2 == 10) {
                byteBufferAllocate.limit(byteBufferAllocate.position() - 2);
                byteBufferAllocate.position(0);
                break;
            }
            b = b2;
        }
        if (byteBufferAllocate == null) {
            return null;
        }
        return me.oriient.internal.services.websocket.util.b.a(byteBufferAllocate.array(), byteBufferAllocate.limit());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final me.oriient.internal.services.websocket.handshake.e b(ByteBuffer byteBuffer) throws me.oriient.internal.services.websocket.exceptions.e {
        me.oriient.internal.services.websocket.handshake.b bVar;
        e eVar = this.f25667a;
        String strA = a(byteBuffer);
        if (strA == null) {
            throw new me.oriient.internal.services.websocket.exceptions.b(byteBuffer.capacity() + 128);
        }
        String[] strArrSplit = strA.split(" ", 3);
        if (strArrSplit.length != 3) {
            throw new me.oriient.internal.services.websocket.exceptions.e();
        }
        if (eVar == e.CLIENT) {
            if (!"101".equals(strArrSplit[1])) {
                throw new me.oriient.internal.services.websocket.exceptions.e(YU.a.i("Invalid status code received: ", strArrSplit[1], " Status line: ", strA));
            }
            if (!"HTTP/1.1".equalsIgnoreCase(strArrSplit[0])) {
                throw new me.oriient.internal.services.websocket.exceptions.e(YU.a.i("Invalid status line received: ", strArrSplit[0], " Status line: ", strA));
            }
            c cVar = new c();
            cVar.b = Short.parseShort(strArrSplit[1]);
            cVar.c = strArrSplit[2];
            bVar = cVar;
        } else {
            if (!"GET".equalsIgnoreCase(strArrSplit[0])) {
                throw new me.oriient.internal.services.websocket.exceptions.e(YU.a.i("Invalid request method received: ", strArrSplit[0], " Status line: ", strA));
            }
            if (!"HTTP/1.1".equalsIgnoreCase(strArrSplit[2])) {
                throw new me.oriient.internal.services.websocket.exceptions.e(YU.a.i("Invalid status line received: ", strArrSplit[2], " Status line: ", strA));
            }
            me.oriient.internal.services.websocket.handshake.b bVar2 = new me.oriient.internal.services.websocket.handshake.b();
            String str = strArrSplit[1];
            if (str == null) {
                throw new IllegalArgumentException("http resource descriptor must not be null");
            }
            bVar2.b = str;
            bVar = bVar2;
        }
        String strA2 = a(byteBuffer);
        while (strA2 != null && strA2.length() > 0) {
            String[] strArrSplit2 = strA2.split(":", 2);
            if (strArrSplit2.length != 2) {
                throw new me.oriient.internal.services.websocket.exceptions.e("not an http header");
            }
            if (bVar.f25676a.containsKey(strArrSplit2[0])) {
                bVar.f25676a.put(strArrSplit2[0], bVar.a(strArrSplit2[0]) + "; " + strArrSplit2[1].replaceFirst("^ +", ""));
            } else {
                bVar.f25676a.put(strArrSplit2[0], strArrSplit2[1].replaceFirst("^ +", ""));
            }
            strA2 = a(byteBuffer);
        }
        if (strA2 != null) {
            return bVar;
        }
        throw new me.oriient.internal.services.websocket.exceptions.b();
    }
}
