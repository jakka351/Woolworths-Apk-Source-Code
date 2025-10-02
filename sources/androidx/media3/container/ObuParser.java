package androidx.media3.container;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;
import java.util.ArrayList;

@UnstableApi
/* loaded from: classes2.dex */
public final class ObuParser {

    public static final class FrameHeader {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f2948a;

        public FrameHeader(SequenceHeader sequenceHeader, Obu obu) throws NotYetImplementedException {
            int i = obu.f2949a;
            ByteBuffer byteBuffer = obu.b;
            Assertions.b(i == 6 || i == 3);
            int iMin = Math.min(4, byteBuffer.remaining());
            byte[] bArr = new byte[iMin];
            byteBuffer.asReadOnlyBuffer().get(bArr);
            ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, iMin);
            ObuParser.a(sequenceHeader.f2950a);
            if (parsableBitArray.f()) {
                this.f2948a = false;
                return;
            }
            int iG = parsableBitArray.g(2);
            boolean zF = parsableBitArray.f();
            ObuParser.a(sequenceHeader.b);
            if (!zF) {
                this.f2948a = true;
                return;
            }
            boolean zF2 = (iG == 3 || iG == 0) ? true : parsableBitArray.f();
            parsableBitArray.n();
            ObuParser.a(!sequenceHeader.d);
            if (parsableBitArray.f()) {
                ObuParser.a(!sequenceHeader.e);
                parsableBitArray.n();
            }
            ObuParser.a(sequenceHeader.c);
            if (iG != 3) {
                parsableBitArray.n();
            }
            parsableBitArray.o(sequenceHeader.f);
            if (iG != 2 && iG != 0 && !zF2) {
                parsableBitArray.o(3);
            }
            this.f2948a = ((iG == 3 || iG == 0) ? 255 : parsableBitArray.g(8)) != 0;
        }
    }

    public static class NotYetImplementedException extends Exception {
    }

    public static final class Obu {

        /* renamed from: a, reason: collision with root package name */
        public final int f2949a;
        public final ByteBuffer b;

        public Obu(int i, ByteBuffer byteBuffer) {
            this.f2949a = i;
            this.b = byteBuffer;
        }
    }

    public static final class SequenceHeader {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f2950a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final int f;

        public SequenceHeader(Obu obu) throws NotYetImplementedException {
            int i = obu.f2949a;
            ByteBuffer byteBuffer = obu.b;
            Assertions.b(i == 1);
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.asReadOnlyBuffer().get(bArr);
            ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, iRemaining);
            parsableBitArray.o(4);
            boolean zF = parsableBitArray.f();
            this.f2950a = zF;
            ObuParser.a(zF);
            if (parsableBitArray.f()) {
                parsableBitArray.o(64);
                if (parsableBitArray.f()) {
                    int i2 = 0;
                    while (!parsableBitArray.f()) {
                        i2++;
                    }
                    if (i2 < 32) {
                        parsableBitArray.o(i2);
                    }
                }
                boolean zF2 = parsableBitArray.f();
                this.b = zF2;
                if (zF2) {
                    parsableBitArray.o(47);
                }
            } else {
                this.b = false;
            }
            boolean zF3 = parsableBitArray.f();
            int iG = parsableBitArray.g(5);
            for (int i3 = 0; i3 <= iG; i3++) {
                parsableBitArray.o(12);
                if (parsableBitArray.g(5) > 7) {
                    parsableBitArray.n();
                }
                ObuParser.a(this.b);
                if (zF3 && parsableBitArray.f()) {
                    parsableBitArray.o(4);
                }
            }
            int iG2 = parsableBitArray.g(4);
            int iG3 = parsableBitArray.g(4);
            parsableBitArray.o(iG2 + 1);
            parsableBitArray.o(iG3 + 1);
            boolean zF4 = parsableBitArray.f();
            this.c = zF4;
            ObuParser.a(zF4);
            parsableBitArray.o(3);
            parsableBitArray.o(4);
            boolean zF5 = parsableBitArray.f();
            if (zF5) {
                parsableBitArray.o(2);
            }
            if (parsableBitArray.f()) {
                this.d = true;
            } else {
                this.d = parsableBitArray.f();
            }
            if (!this.d || parsableBitArray.f()) {
                this.e = true;
            } else {
                this.e = parsableBitArray.f();
            }
            if (zF5) {
                this.f = parsableBitArray.g(3) + 1;
            } else {
                this.f = 0;
            }
        }
    }

    public static void a(boolean z) throws NotYetImplementedException {
        if (z) {
            throw new NotYetImplementedException();
        }
    }

    public static ArrayList b(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            byte b = byteBufferAsReadOnlyBuffer.get();
            int i = (b >> 3) & 15;
            if (((b >> 2) & 1) != 0) {
                byteBufferAsReadOnlyBuffer.get();
            }
            if (((b >> 1) & 1) != 0) {
                iRemaining = 0;
                for (int i2 = 0; i2 < 8; i2++) {
                    byte b2 = byteBufferAsReadOnlyBuffer.get();
                    iRemaining |= (b2 & 127) << (i2 * 7);
                    if ((b2 & 128) == 0) {
                        break;
                    }
                }
            } else {
                iRemaining = byteBufferAsReadOnlyBuffer.remaining();
            }
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            arrayList.add(new Obu(i, byteBufferDuplicate));
            byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
        }
        return arrayList;
    }
}
