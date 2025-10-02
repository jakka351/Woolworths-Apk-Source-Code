package androidx.media3.extractor.mp4;

import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;
import java.util.UUID;

@UnstableApi
/* loaded from: classes2.dex */
public final class PsshAtomUtil {

    public static final class PsshAtom {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f3335a;
        public final int b;
        public final byte[] c;
        public final UUID[] d;

        public PsshAtom(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
            this.f3335a = uuid;
            this.b = i;
            this.c = bArr;
            this.d = uuidArr;
        }
    }

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length = YU.a.C(uuidArr.length, 16, 4, length);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static PsshAtom b(byte[] bArr) {
        UUID[] uuidArr;
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        if (parsableByteArray.c < 32) {
            return null;
        }
        parsableByteArray.G(0);
        int iA = parsableByteArray.a();
        int iG = parsableByteArray.g();
        if (iG != iA) {
            Log.g("PsshAtomUtil", "Advertised atom size (" + iG + ") does not match buffer size: " + iA);
            return null;
        }
        int iG2 = parsableByteArray.g();
        if (iG2 != 1886614376) {
            androidx.compose.ui.input.pointer.a.t(iG2, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int iC = BoxParser.c(parsableByteArray.g());
        if (iC > 1) {
            androidx.compose.ui.input.pointer.a.t(iC, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(parsableByteArray.o(), parsableByteArray.o());
        if (iC == 1) {
            int iY = parsableByteArray.y();
            uuidArr = new UUID[iY];
            for (int i = 0; i < iY; i++) {
                uuidArr[i] = new UUID(parsableByteArray.o(), parsableByteArray.o());
            }
        } else {
            uuidArr = null;
        }
        int iY2 = parsableByteArray.y();
        int iA2 = parsableByteArray.a();
        if (iY2 == iA2) {
            byte[] bArr2 = new byte[iY2];
            parsableByteArray.e(0, iY2, bArr2);
            return new PsshAtom(uuid, iC, bArr2, uuidArr);
        }
        Log.g("PsshAtomUtil", "Atom data size (" + iY2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static byte[] c(UUID uuid, byte[] bArr) {
        PsshAtom psshAtomB = b(bArr);
        if (psshAtomB == null) {
            return null;
        }
        UUID uuid2 = psshAtomB.f3335a;
        if (uuid.equals(uuid2)) {
            return psshAtomB.c;
        }
        Log.g("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }
}
