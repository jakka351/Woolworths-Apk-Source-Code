package androidx.media3.extractor.metadata.flac;

import androidx.camera.core.impl.b;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes2.dex */
public final class PictureFrame implements Metadata.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final int f3284a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public PictureFrame(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f3284a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static PictureFrame d(ParsableByteArray parsableByteArray) {
        int iG = parsableByteArray.g();
        String strM = MimeTypes.m(parsableByteArray.s(parsableByteArray.g(), StandardCharsets.US_ASCII));
        String strS = parsableByteArray.s(parsableByteArray.g(), StandardCharsets.UTF_8);
        int iG2 = parsableByteArray.g();
        int iG3 = parsableByteArray.g();
        int iG4 = parsableByteArray.g();
        int iG5 = parsableByteArray.g();
        int iG6 = parsableByteArray.g();
        byte[] bArr = new byte[iG6];
        parsableByteArray.e(0, iG6, bArr);
        return new PictureFrame(iG, strM, strS, iG2, iG3, iG4, iG5, bArr);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void c(MediaMetadata.Builder builder) {
        builder.a(this.f3284a, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PictureFrame.class == obj.getClass()) {
            PictureFrame pictureFrame = (PictureFrame) obj;
            if (this.f3284a == pictureFrame.f3284a && this.b.equals(pictureFrame.b) && this.c.equals(pictureFrame.c) && this.d == pictureFrame.d && this.e == pictureFrame.e && this.f == pictureFrame.f && this.g == pictureFrame.g && Arrays.equals(this.h, pictureFrame.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((b.c(b.c((527 + this.f3284a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
