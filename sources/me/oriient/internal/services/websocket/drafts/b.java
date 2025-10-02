package me.oriient.internal.services.websocket.drafts;

import com.google.android.gms.location.GeofenceStatusCodes;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import me.oriient.internal.services.websocket.exceptions.c;
import me.oriient.internal.services.websocket.exceptions.d;
import me.oriient.internal.services.websocket.framing.f;
import me.oriient.internal.services.websocket.framing.g;
import me.oriient.internal.services.websocket.framing.h;
import me.oriient.internal.services.websocket.framing.i;
import me.oriient.internal.services.websocket.framing.j;
import me.oriient.internal.services.websocket.framing.k;
import me.oriient.internal.services.websocket.handshake.e;

/* loaded from: classes7.dex */
public final class b extends a {
    public static final /* synthetic */ boolean m = true;
    public final ArrayList d;
    public me.oriient.internal.services.websocket.extensions.b e;
    public me.oriient.internal.services.websocket.protocols.a f;
    public final ArrayList g;
    public f h;
    public final ArrayList i;
    public ByteBuffer j;
    public final int l;
    public me.oriient.internal.services.websocket.extensions.b b = new me.oriient.internal.services.websocket.extensions.a();
    public final me.oriient.internal.services.websocket.extensions.a c = new me.oriient.internal.services.websocket.extensions.a();
    public final SecureRandom k = new SecureRandom();

    public b(List list, List list2, int i) {
        if (list == null || list2 == null || i < 1) {
            throw new IllegalArgumentException();
        }
        this.d = new ArrayList(list.size());
        this.g = new ArrayList(list2.size());
        this.i = new ArrayList();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (((me.oriient.internal.services.websocket.extensions.b) it.next()).getClass().equals(me.oriient.internal.services.websocket.extensions.a.class)) {
                z = true;
            }
        }
        this.d.addAll(list);
        if (!z) {
            ArrayList arrayList = this.d;
            arrayList.add(arrayList.size(), this.b);
        }
        this.g.addAll(list2);
        this.l = i;
        this.e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final me.oriient.internal.services.websocket.enums.b a(me.oriient.internal.services.websocket.handshake.b bVar, me.oriient.internal.services.websocket.handshake.f fVar) {
        me.oriient.internal.services.websocket.enums.b bVar2;
        e eVar = (e) fVar;
        if (!eVar.a("Upgrade").equalsIgnoreCase("websocket") || !eVar.a("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade")) {
            return me.oriient.internal.services.websocket.enums.b.NOT_MATCHED;
        }
        if (!bVar.f25676a.containsKey("Sec-WebSocket-Key") || !eVar.f25676a.containsKey("Sec-WebSocket-Accept")) {
            return me.oriient.internal.services.websocket.enums.b.NOT_MATCHED;
        }
        try {
            if (!me.oriient.internal.services.websocket.util.a.a(MessageDigest.getInstance("SHA1").digest(YU.a.g(bVar.a("Sec-WebSocket-Key").trim(), "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes())).equals(eVar.a("Sec-WebSocket-Accept"))) {
                return me.oriient.internal.services.websocket.enums.b.NOT_MATCHED;
            }
            me.oriient.internal.services.websocket.enums.b bVar3 = me.oriient.internal.services.websocket.enums.b.NOT_MATCHED;
            eVar.a("Sec-WebSocket-Extensions");
            Iterator it = this.d.iterator();
            if (it.hasNext()) {
                me.oriient.internal.services.websocket.extensions.b bVar4 = (me.oriient.internal.services.websocket.extensions.b) it.next();
                bVar4.getClass();
                this.b = bVar4;
                bVar2 = me.oriient.internal.services.websocket.enums.b.MATCHED;
            } else {
                bVar2 = bVar3;
            }
            me.oriient.internal.services.websocket.enums.b bVarA = a(eVar.a("Sec-WebSocket-Protocol"));
            me.oriient.internal.services.websocket.enums.b bVar5 = me.oriient.internal.services.websocket.enums.b.MATCHED;
            return (bVarA == bVar5 && bVar2 == bVar5) ? bVar5 : bVar3;
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void b() {
        synchronized (this.i) {
            this.i.clear();
        }
    }

    public final void c(ByteBuffer byteBuffer) {
        synchronized (this.i) {
            this.i.add(byteBuffer);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        if (r8.hasRemaining() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        r8.mark();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        r0.add(e(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        r8.reset();
        r1 = r1.f25669a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        if (r1 >= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        r1 = java.nio.ByteBuffer.allocate(r1);
        r7.j = r1;
        r1.put(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
    
        throw new me.oriient.internal.services.websocket.exceptions.c(1002, "Negative count");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List d(java.nio.ByteBuffer r8) throws me.oriient.internal.services.websocket.exceptions.c {
        /*
            r7 = this;
        L0:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.nio.ByteBuffer r1 = r7.j
            java.lang.String r2 = "Negative count"
            r3 = 1002(0x3ea, float:1.404E-42)
            if (r1 == 0) goto L96
            r8.mark()     // Catch: me.oriient.internal.services.websocket.exceptions.a -> L34
            int r1 = r8.remaining()     // Catch: me.oriient.internal.services.websocket.exceptions.a -> L34
            java.nio.ByteBuffer r4 = r7.j     // Catch: me.oriient.internal.services.websocket.exceptions.a -> L34
            int r4 = r4.remaining()     // Catch: me.oriient.internal.services.websocket.exceptions.a -> L34
            if (r4 <= r1) goto L36
            java.nio.ByteBuffer r0 = r7.j     // Catch: me.oriient.internal.services.websocket.exceptions.a -> L34
            byte[] r4 = r8.array()     // Catch: me.oriient.internal.services.websocket.exceptions.a -> L34
            int r5 = r8.position()     // Catch: me.oriient.internal.services.websocket.exceptions.a -> L34
            r0.put(r4, r5, r1)     // Catch: me.oriient.internal.services.websocket.exceptions.a -> L34
            int r0 = r8.position()     // Catch: me.oriient.internal.services.websocket.exceptions.a -> L34
            int r0 = r0 + r1
            r8.position(r0)     // Catch: me.oriient.internal.services.websocket.exceptions.a -> L34
            java.util.List r8 = java.util.Collections.EMPTY_LIST     // Catch: me.oriient.internal.services.websocket.exceptions.a -> L34
            return r8
        L34:
            r0 = move-exception
            goto L63
        L36:
            java.nio.ByteBuffer r1 = r7.j     // Catch: me.oriient.internal.services.websocket.exceptions.a -> L34
            byte[] r5 = r8.array()     // Catch: me.oriient.internal.services.websocket.exceptions.a -> L34
            int r6 = r8.position()     // Catch: me.oriient.internal.services.websocket.exceptions.a -> L34
            r1.put(r5, r6, r4)     // Catch: me.oriient.internal.services.websocket.exceptions.a -> L34
            int r1 = r8.position()     // Catch: me.oriient.internal.services.websocket.exceptions.a -> L34
            int r1 = r1 + r4
            r8.position(r1)     // Catch: me.oriient.internal.services.websocket.exceptions.a -> L34
            java.nio.ByteBuffer r1 = r7.j     // Catch: me.oriient.internal.services.websocket.exceptions.a -> L34
            java.nio.ByteBuffer r1 = r1.duplicate()     // Catch: me.oriient.internal.services.websocket.exceptions.a -> L34
            r4 = 0
            java.nio.Buffer r1 = r1.position(r4)     // Catch: me.oriient.internal.services.websocket.exceptions.a -> L34
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1     // Catch: me.oriient.internal.services.websocket.exceptions.a -> L34
            me.oriient.internal.services.websocket.framing.h r1 = r7.e(r1)     // Catch: me.oriient.internal.services.websocket.exceptions.a -> L34
            r0.add(r1)     // Catch: me.oriient.internal.services.websocket.exceptions.a -> L34
            r1 = 0
            r7.j = r1     // Catch: me.oriient.internal.services.websocket.exceptions.a -> L34
            goto L96
        L63:
            int r0 = r0.f25669a
            if (r0 < 0) goto L90
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            boolean r1 = me.oriient.internal.services.websocket.drafts.b.m
            if (r1 != 0) goto L82
            int r1 = r0.limit()
            java.nio.ByteBuffer r2 = r7.j
            int r2 = r2.limit()
            if (r1 <= r2) goto L7c
            goto L82
        L7c:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L82:
            java.nio.ByteBuffer r1 = r7.j
            r1.rewind()
            java.nio.ByteBuffer r1 = r7.j
            r0.put(r1)
            r7.j = r0
            goto L0
        L90:
            me.oriient.internal.services.websocket.exceptions.c r8 = new me.oriient.internal.services.websocket.exceptions.c
            r8.<init>(r3, r2)
            throw r8
        L96:
            boolean r1 = r8.hasRemaining()
            if (r1 == 0) goto Lbf
            r8.mark()
            me.oriient.internal.services.websocket.framing.h r1 = r7.e(r8)     // Catch: me.oriient.internal.services.websocket.exceptions.a -> La7
            r0.add(r1)     // Catch: me.oriient.internal.services.websocket.exceptions.a -> La7
            goto L96
        La7:
            r1 = move-exception
            r8.reset()
            int r1 = r1.f25669a
            if (r1 < 0) goto Lb9
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r7.j = r1
            r1.put(r8)
            goto Lbf
        Lb9:
            me.oriient.internal.services.websocket.exceptions.c r8 = new me.oriient.internal.services.websocket.exceptions.c
            r8.<init>(r3, r2)
            throw r8
        Lbf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.websocket.drafts.b.d(java.nio.ByteBuffer):java.util.List");
    }

    public final h e(ByteBuffer byteBuffer) throws me.oriient.internal.services.websocket.exceptions.a, c {
        me.oriient.internal.services.websocket.enums.c cVar;
        boolean z;
        boolean z2;
        h iVar;
        if (byteBuffer == null) {
            throw new IllegalArgumentException();
        }
        int iRemaining = byteBuffer.remaining();
        int i = 2;
        if (iRemaining < 2) {
            throw new me.oriient.internal.services.websocket.exceptions.a(2);
        }
        byte b = byteBuffer.get();
        boolean z3 = (b >> 8) != 0;
        boolean z4 = (b & 64) != 0;
        boolean z5 = (b & 32) != 0;
        boolean z6 = (b & 16) != 0;
        byte b2 = byteBuffer.get();
        boolean z7 = (b2 & (-128)) != 0;
        int iIntValue = (byte) (b2 & 127);
        byte b3 = (byte) (b & 15);
        if (b3 == 0) {
            cVar = me.oriient.internal.services.websocket.enums.c.CONTINUOUS;
        } else if (b3 == 1) {
            cVar = me.oriient.internal.services.websocket.enums.c.TEXT;
        } else if (b3 != 2) {
            switch (b3) {
                case 8:
                    cVar = me.oriient.internal.services.websocket.enums.c.CLOSING;
                    break;
                case 9:
                    cVar = me.oriient.internal.services.websocket.enums.c.PING;
                    break;
                case 10:
                    cVar = me.oriient.internal.services.websocket.enums.c.PONG;
                    break;
                default:
                    throw new d("Unknown opcode " + ((int) b3));
            }
        } else {
            cVar = me.oriient.internal.services.websocket.enums.c.BINARY;
        }
        if (iIntValue >= 0 && iIntValue <= 125) {
            z = z4;
            z2 = z7;
        } else {
            if (cVar == me.oriient.internal.services.websocket.enums.c.PING || cVar == me.oriient.internal.services.websocket.enums.c.PONG || cVar == me.oriient.internal.services.websocket.enums.c.CLOSING) {
                throw new d("more than 125 octets");
            }
            if (iIntValue == 126) {
                if (iRemaining < 4) {
                    throw new me.oriient.internal.services.websocket.exceptions.a(4);
                }
                iIntValue = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
                i = 4;
                z = z4;
                z2 = z7;
            } else {
                if (iRemaining < 10) {
                    throw new me.oriient.internal.services.websocket.exceptions.a(10);
                }
                byte[] bArr = new byte[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    bArr[i2] = byteBuffer.get();
                }
                BigInteger bigInteger = new BigInteger(bArr);
                z = z4;
                long jLongValue = bigInteger.longValue();
                if (jLongValue > 2147483647L) {
                    throw new me.oriient.internal.services.websocket.exceptions.f("Payloadsize is to big...");
                }
                z2 = z7;
                if (jLongValue > this.l) {
                    throw new me.oriient.internal.services.websocket.exceptions.f(this.l, 0);
                }
                if (jLongValue < 0) {
                    throw new me.oriient.internal.services.websocket.exceptions.f("Payloadsize is to little...");
                }
                iIntValue = (int) jLongValue;
                i = 10;
            }
        }
        long j = iIntValue;
        if (j > 2147483647L) {
            throw new me.oriient.internal.services.websocket.exceptions.f("Payloadsize is to big...");
        }
        if (j > this.l) {
            throw new me.oriient.internal.services.websocket.exceptions.f(this.l, 0);
        }
        if (j < 0) {
            throw new me.oriient.internal.services.websocket.exceptions.f("Payloadsize is to little...");
        }
        int i3 = i + (z2 ? 4 : 0) + iIntValue;
        if (iRemaining < i3) {
            throw new me.oriient.internal.services.websocket.exceptions.a(i3);
        }
        if (iIntValue < 0) {
            throw new c(1002, "Negative count");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iIntValue);
        if (z2) {
            byte[] bArr2 = new byte[4];
            byteBuffer.get(bArr2);
            for (int i4 = 0; i4 < iIntValue; i4++) {
                byteBufferAllocate.put((byte) (byteBuffer.get() ^ bArr2[i4 % 4]));
            }
        } else {
            byteBufferAllocate.put(byteBuffer.array(), byteBuffer.position(), byteBufferAllocate.limit());
            byteBuffer.position(byteBufferAllocate.limit() + byteBuffer.position());
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Supplied opcode cannot be null");
        }
        switch (g.f25672a[cVar.ordinal()]) {
            case 1:
                iVar = new i();
                break;
            case 2:
                iVar = new j();
                break;
            case 3:
                iVar = new k();
                break;
            case 4:
                iVar = new me.oriient.internal.services.websocket.framing.a();
                break;
            case 5:
                iVar = new me.oriient.internal.services.websocket.framing.b();
                break;
            case 6:
                iVar = new me.oriient.internal.services.websocket.framing.c();
                break;
            default:
                throw new IllegalArgumentException("Supplied opcode is invalid");
        }
        iVar.f25673a = z3;
        iVar.e = z;
        iVar.f = z5;
        iVar.g = z6;
        byteBufferAllocate.flip();
        iVar.a(byteBufferAllocate);
        if (iVar.b != me.oriient.internal.services.websocket.enums.c.CONTINUOUS) {
            if (iVar.e || iVar.f || iVar.g) {
                this.e = this.b;
            } else {
                this.e = this.c;
            }
        }
        if (this.e == null) {
            this.e = this.c;
        }
        ((me.oriient.internal.services.websocket.extensions.a) this.e).getClass();
        if (!iVar.e && !iVar.f && !iVar.g) {
            this.e.getClass();
            iVar.b();
            return iVar;
        }
        throw new d("bad rsv RSV1: " + iVar.e + " RSV2: " + iVar.f + " RSV3: " + iVar.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.l != bVar.l || !this.b.equals(bVar.b)) {
                return false;
            }
            me.oriient.internal.services.websocket.protocols.a aVar = this.f;
            if (aVar != null) {
                return aVar.equals(bVar.f);
            }
            if (bVar.f == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = me.oriient.internal.services.websocket.extensions.a.class.hashCode() * 961;
        int i = this.l;
        return iHashCode + (i ^ (i >>> 32));
    }

    public final String toString() {
        String str;
        me.oriient.internal.services.websocket.protocols.a aVar = this.f;
        if (aVar != null) {
            ((me.oriient.internal.services.websocket.protocols.b) aVar).getClass();
            str = "b extension: a protocol: ";
        } else {
            str = "b extension: a";
        }
        StringBuilder sbT = YU.a.t(str, " max frame size: ");
        sbT.append(this.l);
        return sbT.toString();
    }

    public final ByteBuffer c() {
        ByteBuffer byteBufferAllocate;
        synchronized (this.i) {
            try {
                long jLimit = 0;
                while (this.i.iterator().hasNext()) {
                    jLimit += ((ByteBuffer) r1.next()).limit();
                }
                a();
                byteBufferAllocate = ByteBuffer.allocate((int) jLimit);
                Iterator it = this.i.iterator();
                while (it.hasNext()) {
                    byteBufferAllocate.put((ByteBuffer) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public final me.oriient.internal.services.websocket.enums.b a(String str) {
        Iterator it = this.g.iterator();
        if (it.hasNext()) {
            me.oriient.internal.services.websocket.protocols.a aVar = (me.oriient.internal.services.websocket.protocols.a) it.next();
            ((me.oriient.internal.services.websocket.protocols.b) aVar).getClass();
            this.f = aVar;
            return me.oriient.internal.services.websocket.enums.b.MATCHED;
        }
        return me.oriient.internal.services.websocket.enums.b.NOT_MATCHED;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final me.oriient.internal.services.websocket.enums.b a(me.oriient.internal.services.websocket.handshake.a aVar) throws NumberFormatException {
        int i;
        me.oriient.internal.services.websocket.enums.b bVar;
        e eVar = (e) aVar;
        String strA = eVar.a("Sec-WebSocket-Version");
        if (strA.length() > 0) {
            try {
                i = Integer.parseInt(strA.trim());
            } catch (NumberFormatException unused) {
            }
        } else {
            i = -1;
        }
        if (i != 13) {
            return me.oriient.internal.services.websocket.enums.b.NOT_MATCHED;
        }
        me.oriient.internal.services.websocket.enums.b bVar2 = me.oriient.internal.services.websocket.enums.b.NOT_MATCHED;
        eVar.a("Sec-WebSocket-Extensions");
        Iterator it = this.d.iterator();
        if (it.hasNext()) {
            me.oriient.internal.services.websocket.extensions.b bVar3 = (me.oriient.internal.services.websocket.extensions.b) it.next();
            bVar3.getClass();
            this.b = bVar3;
            bVar = me.oriient.internal.services.websocket.enums.b.MATCHED;
        } else {
            bVar = bVar2;
        }
        me.oriient.internal.services.websocket.enums.b bVarA = a(eVar.a("Sec-WebSocket-Protocol"));
        me.oriient.internal.services.websocket.enums.b bVar4 = me.oriient.internal.services.websocket.enums.b.MATCHED;
        return (bVarA == bVar4 && bVar == bVar4) ? bVar4 : bVar2;
    }

    public final void a(me.oriient.internal.services.websocket.h hVar, f fVar) {
        int i;
        String str;
        h hVar2 = (h) fVar;
        me.oriient.internal.services.websocket.enums.c cVar = hVar2.b;
        if (cVar == me.oriient.internal.services.websocket.enums.c.CLOSING) {
            if (fVar instanceof me.oriient.internal.services.websocket.framing.b) {
                me.oriient.internal.services.websocket.framing.b bVar = (me.oriient.internal.services.websocket.framing.b) fVar;
                i = bVar.h;
                str = bVar.i;
            } else {
                i = GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT;
                str = "";
            }
            if (hVar.d == me.oriient.internal.services.websocket.enums.d.CLOSING) {
                hVar.b(i, str, true);
                return;
            } else {
                me.oriient.internal.services.websocket.enums.a aVar = me.oriient.internal.services.websocket.enums.a.NONE;
                hVar.a(i, str, true);
                return;
            }
        }
        if (cVar == me.oriient.internal.services.websocket.enums.c.PING) {
            hVar.b.getClass();
            hVar.a(Collections.singletonList(new j((i) fVar)));
            return;
        }
        if (cVar == me.oriient.internal.services.websocket.enums.c.PONG) {
            hVar.getClass();
            hVar.l = System.nanoTime();
            hVar.b.getClass();
            return;
        }
        boolean z = hVar2.f25673a;
        if (z && cVar != me.oriient.internal.services.websocket.enums.c.CONTINUOUS) {
            if (this.h == null) {
                if (cVar == me.oriient.internal.services.websocket.enums.c.TEXT) {
                    try {
                        hVar.b.a(me.oriient.internal.services.websocket.util.b.b(fVar.a()));
                        return;
                    } catch (RuntimeException e) {
                        me.oriient.internal.services.websocket.client.c cVar2 = hVar.b;
                        cVar2.getClass();
                        ((me.oriient.internal.services.websocket.c) cVar2).q.a(e);
                        return;
                    }
                }
                if (cVar == me.oriient.internal.services.websocket.enums.c.BINARY) {
                    try {
                        me.oriient.internal.services.websocket.client.c cVar3 = hVar.b;
                        fVar.a();
                        cVar3.getClass();
                        return;
                    } catch (RuntimeException e2) {
                        me.oriient.internal.services.websocket.client.c cVar4 = hVar.b;
                        cVar4.getClass();
                        ((me.oriient.internal.services.websocket.c) cVar4).q.a(e2);
                        return;
                    }
                }
                throw new c(1002, "non control or continious frame expected");
            }
            throw new c(1002, "Continuous frame sequence not completed.");
        }
        if (cVar != me.oriient.internal.services.websocket.enums.c.CONTINUOUS) {
            if (this.h == null) {
                this.h = fVar;
                c(fVar.a());
                a();
            } else {
                throw new c(1002, "Previous continuous frame sequence not completed.");
            }
        } else if (z) {
            if (this.h != null) {
                c(fVar.a());
                a();
                h hVar3 = (h) this.h;
                me.oriient.internal.services.websocket.enums.c cVar5 = hVar3.b;
                if (cVar5 == me.oriient.internal.services.websocket.enums.c.TEXT) {
                    hVar3.a(c());
                    ((h) this.h).b();
                    try {
                        hVar.b.a(me.oriient.internal.services.websocket.util.b.b(this.h.a()));
                    } catch (RuntimeException e3) {
                        me.oriient.internal.services.websocket.client.c cVar6 = hVar.b;
                        cVar6.getClass();
                        ((me.oriient.internal.services.websocket.c) cVar6).q.a(e3);
                    }
                } else if (cVar5 == me.oriient.internal.services.websocket.enums.c.BINARY) {
                    hVar3.a(c());
                    ((h) this.h).b();
                    try {
                        me.oriient.internal.services.websocket.client.c cVar7 = hVar.b;
                        this.h.a();
                        cVar7.getClass();
                    } catch (RuntimeException e4) {
                        me.oriient.internal.services.websocket.client.c cVar8 = hVar.b;
                        cVar8.getClass();
                        ((me.oriient.internal.services.websocket.c) cVar8).q.a(e4);
                    }
                }
                this.h = null;
                b();
            } else {
                throw new c(1002, "Continuous frame sequence was not started.");
            }
        } else if (this.h == null) {
            throw new c(1002, "Continuous frame sequence was not started.");
        }
        if (cVar == me.oriient.internal.services.websocket.enums.c.TEXT && !me.oriient.internal.services.websocket.util.b.a(fVar.a())) {
            throw new c(1007);
        }
        if (cVar != me.oriient.internal.services.websocket.enums.c.CONTINUOUS || this.h == null) {
            return;
        }
        c(fVar.a());
    }

    public final void a() throws me.oriient.internal.services.websocket.exceptions.f {
        long jLimit;
        synchronized (this.i) {
            try {
                jLimit = 0;
                while (this.i.iterator().hasNext()) {
                    jLimit += ((ByteBuffer) r1.next()).limit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jLimit <= this.l) {
            return;
        }
        b();
        throw new me.oriient.internal.services.websocket.exceptions.f(this.l);
    }
}
