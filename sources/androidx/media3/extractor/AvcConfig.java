package androidx.media3.extractor;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.NalUnitUtil;
import java.util.ArrayList;

@UnstableApi
/* loaded from: classes2.dex */
public final class AvcConfig {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3222a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public AvcConfig(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.f3222a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static AvcConfig a(ParsableByteArray parsableByteArray) throws ParserException {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            parsableByteArray.H(4);
            int iU = (parsableByteArray.u() & 3) + 1;
            if (iU == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iU2 = parsableByteArray.u() & 31;
            for (int i9 = 0; i9 < iU2; i9++) {
                int iA = parsableByteArray.A();
                int i10 = parsableByteArray.b;
                parsableByteArray.H(iA);
                byte[] bArr = parsableByteArray.f2922a;
                byte[] bArr2 = new byte[iA + 4];
                System.arraycopy(CodecSpecificDataUtil.f2907a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i10, bArr2, 4, iA);
                arrayList.add(bArr2);
            }
            int iU3 = parsableByteArray.u();
            for (int i11 = 0; i11 < iU3; i11++) {
                int iA2 = parsableByteArray.A();
                int i12 = parsableByteArray.b;
                parsableByteArray.H(iA2);
                byte[] bArr3 = parsableByteArray.f2922a;
                byte[] bArr4 = new byte[iA2 + 4];
                System.arraycopy(CodecSpecificDataUtil.f2907a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i12, bArr4, 4, iA2);
                arrayList.add(bArr4);
            }
            if (iU2 > 0) {
                NalUnitUtil.SpsData spsDataJ = NalUnitUtil.j(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i13 = spsDataJ.e;
                int i14 = spsDataJ.f;
                int i15 = spsDataJ.h + 8;
                int i16 = spsDataJ.i + 8;
                int i17 = spsDataJ.p;
                int i18 = spsDataJ.q;
                int i19 = spsDataJ.r;
                int i20 = spsDataJ.s;
                float f2 = spsDataJ.g;
                int i21 = spsDataJ.f2947a;
                int i22 = spsDataJ.b;
                int i23 = spsDataJ.c;
                byte[] bArr5 = CodecSpecificDataUtil.f2907a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23));
                i4 = i18;
                i5 = i19;
                i6 = i20;
                f = f2;
                i2 = i14;
                i3 = i15;
                i7 = i16;
                i8 = i17;
                i = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new AvcConfig(arrayList, iU, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing AVC config");
        }
    }
}
