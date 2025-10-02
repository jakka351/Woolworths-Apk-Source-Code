package androidx.media3.container;

import androidx.camera.core.impl.b;
import androidx.compose.ui.input.pointer.a;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes2.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final String f2929a;
    public final byte[] b;
    public final int c;
    public final int d;

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        boolean z;
        byte b;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                Assertions.b(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                Assertions.b(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                Assertions.b(z);
                break;
            case "auxiliary.tracks.map":
                Assertions.b(i2 == 0);
                break;
        }
        this.f2929a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    public final ArrayList d() {
        Assertions.e("Metadata is not an auxiliary tracks map", this.f2929a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MdtaMetadataEntry.class == obj.getClass()) {
            MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
            if (this.f2929a.equals(mdtaMetadataEntry.f2929a) && Arrays.equals(this.b, mdtaMetadataEntry.b) && this.c == mdtaMetadataEntry.c && this.d == mdtaMetadataEntry.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((a.d(b.c(527, 31, this.f2929a), 31, this.b) + this.c) * 31) + this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r10 = this;
            java.lang.String r0 = r10.f2929a
            byte[] r1 = r10.b
            int r2 = r10.d
            if (r2 == 0) goto L7d
            r3 = 1
            if (r2 == r3) goto L78
            r4 = 23
            r5 = 3
            r6 = 2
            java.lang.String r7 = "array too small: %s < %s"
            r8 = 4
            r9 = 0
            if (r2 == r4) goto L59
            r4 = 67
            if (r2 == r4) goto L3e
            r3 = 75
            if (r2 == r3) goto L32
            r3 = 78
            if (r2 == r3) goto L23
            goto La6
        L23:
            androidx.media3.common.util.ParsableByteArray r2 = new androidx.media3.common.util.ParsableByteArray
            r2.<init>(r1)
            long r1 = r2.z()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto Laa
        L32:
            r1 = r1[r9]
            int r1 = java.lang.Byte.toUnsignedInt(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto Laa
        L3e:
            int r2 = r1.length
            if (r2 < r8) goto L43
            r2 = r3
            goto L44
        L43:
            r2 = r9
        L44:
            int r4 = r1.length
            com.google.common.base.Preconditions.d(r7, r4, r8, r2)
            r2 = r1[r9]
            r3 = r1[r3]
            r4 = r1[r6]
            r1 = r1[r5]
            int r1 = com.google.common.primitives.Ints.d(r2, r3, r4, r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto Laa
        L59:
            int r2 = r1.length
            if (r2 < r8) goto L5e
            r2 = r3
            goto L5f
        L5e:
            r2 = r9
        L5f:
            int r4 = r1.length
            com.google.common.base.Preconditions.d(r7, r4, r8, r2)
            r2 = r1[r9]
            r3 = r1[r3]
            r4 = r1[r6]
            r1 = r1[r5]
            int r1 = com.google.common.primitives.Ints.d(r2, r3, r4, r1)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto Laa
        L78:
            java.lang.String r1 = androidx.media3.common.util.Util.n(r1)
            goto Laa
        L7d:
            java.lang.String r2 = "auxiliary.tracks.map"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto La6
            java.util.ArrayList r1 = r10.d()
            java.lang.String r2 = "track types = "
            java.lang.StringBuilder r2 = YU.a.s(r2)
            com.google.common.base.Joiner r3 = new com.google.common.base.Joiner
            r4 = 44
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
            r3.b(r2, r1)
            java.lang.String r1 = r2.toString()
            goto Laa
        La6:
            java.lang.String r1 = androidx.media3.common.util.Util.T(r1)
        Laa:
            java.lang.String r2 = "mdta: key="
            java.lang.String r3 = ", value="
            java.lang.String r0 = YU.a.i(r2, r0, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.MdtaMetadataEntry.toString():java.lang.String");
    }
}
