package androidx.media3.extractor.text.vobsub;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.collect.ImmutableList;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;

@UnstableApi
/* loaded from: classes2.dex */
public final class VobsubParser implements SubtitleParser {

    /* renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f3391a = new ParsableByteArray();
    public final ParsableByteArray b = new ParsableByteArray();
    public final CueBuilder c;
    public Inflater d;

    public static final class CueBuilder {
        public boolean b;
        public boolean c;
        public int[] d;
        public int e;
        public int f;
        public Rect g;

        /* renamed from: a, reason: collision with root package name */
        public final int[] f3392a = new int[4];
        public int h = -1;
        public int i = -1;

        public static final class Run {

            /* renamed from: a, reason: collision with root package name */
            public int f3393a;
            public int b;
        }

        public static int a(int i, int[] iArr) {
            return (i < 0 || i >= iArr.length) ? iArr[0] : iArr[i];
        }

        public static int c(int i, int i2) {
            return (i & 16777215) | ((i2 * 17) << 24);
        }

        public final void b(ParsableBitArray parsableBitArray, boolean z, Rect rect, int[] iArr) {
            int iWidth = rect.width();
            int iHeight = rect.height();
            int i = !z ? 1 : 0;
            int i2 = i * iWidth;
            Run run = new Run();
            while (true) {
                int i3 = 0;
                do {
                    int iG = 0;
                    for (int i4 = 1; iG < i4 && i4 <= 64; i4 <<= 2) {
                        if (parsableBitArray.b() < 4) {
                            run.f3393a = -1;
                            run.b = 0;
                            break;
                        }
                        iG = (iG << 4) | parsableBitArray.g(4);
                    }
                    run.f3393a = iG & 3;
                    run.b = iG < 4 ? iWidth : iG >> 2;
                    int iMin = Math.min(run.b, iWidth - i3);
                    if (iMin > 0) {
                        int i5 = i2 + iMin;
                        Arrays.fill(iArr, i2, i5, this.f3392a[run.f3393a]);
                        i3 += iMin;
                        i2 = i5;
                    }
                } while (i3 < iWidth);
                i += 2;
                if (i >= iHeight) {
                    return;
                }
                i2 = i * iWidth;
                parsableBitArray.c();
            }
        }
    }

    public VobsubParser(List list) throws NumberFormatException {
        int i;
        CueBuilder cueBuilder = new CueBuilder();
        this.c = cueBuilder;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        int i2 = Util.f2928a;
        for (String str : strTrim.split("\\r?\\n", -1)) {
            if (str.startsWith("palette: ")) {
                String[] strArrSplit = str.substring(9).split(",", -1);
                cueBuilder.d = new int[strArrSplit.length];
                for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                    int[] iArr = cueBuilder.d;
                    try {
                        i = Integer.parseInt(strArrSplit[i3].trim(), 16);
                    } catch (RuntimeException unused) {
                        i = 0;
                    }
                    iArr[i3] = i;
                }
            } else if (str.startsWith("size: ")) {
                String[] strArrSplit2 = str.substring(6).trim().split("x", -1);
                if (strArrSplit2.length == 2) {
                    try {
                        cueBuilder.e = Integer.parseInt(strArrSplit2[0]);
                        cueBuilder.f = Integer.parseInt(strArrSplit2[1]);
                        cueBuilder.b = true;
                    } catch (RuntimeException e) {
                        Log.h("VobsubParser", "Parsing IDX failed", e);
                    }
                }
            }
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final void a(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        Rect rect;
        ParsableByteArray parsableByteArray = this.f3391a;
        parsableByteArray.E(i + i2, bArr);
        parsableByteArray.G(i);
        if (this.d == null) {
            this.d = new Inflater();
        }
        Inflater inflater = this.d;
        int i3 = Util.f2928a;
        if (parsableByteArray.a() > 0 && (parsableByteArray.f2922a[parsableByteArray.b] & 255) == 120) {
            ParsableByteArray parsableByteArray2 = this.b;
            if (Util.D(parsableByteArray, parsableByteArray2, inflater)) {
                parsableByteArray.E(parsableByteArray2.c, parsableByteArray2.f2922a);
            }
        }
        CueBuilder cueBuilder = this.c;
        cueBuilder.c = false;
        Cue cueA = null;
        cueBuilder.g = null;
        cueBuilder.h = -1;
        cueBuilder.i = -1;
        int iA = parsableByteArray.a();
        if (iA >= 2 && parsableByteArray.A() == iA) {
            int[] iArr = cueBuilder.d;
            if (iArr != null && cueBuilder.b) {
                parsableByteArray.H(parsableByteArray.A() - 2);
                int iA2 = parsableByteArray.A();
                int[] iArr2 = cueBuilder.f3392a;
                while (parsableByteArray.b < iA2 && parsableByteArray.a() > 0) {
                    switch (parsableByteArray.u()) {
                        case 3:
                            if (parsableByteArray.a() < 2) {
                                break;
                            } else {
                                int iU = parsableByteArray.u();
                                int iU2 = parsableByteArray.u();
                                iArr2[3] = CueBuilder.a(iU >> 4, iArr);
                                iArr2[2] = CueBuilder.a(iU & 15, iArr);
                                iArr2[1] = CueBuilder.a(iU2 >> 4, iArr);
                                iArr2[0] = CueBuilder.a(iU2 & 15, iArr);
                                cueBuilder.c = true;
                            }
                        case 4:
                            if (parsableByteArray.a() < 2 || !cueBuilder.c) {
                                break;
                            } else {
                                int iU3 = parsableByteArray.u();
                                int iU4 = parsableByteArray.u();
                                iArr2[3] = CueBuilder.c(iArr2[3], iU3 >> 4);
                                iArr2[2] = CueBuilder.c(iArr2[2], iU3 & 15);
                                iArr2[1] = CueBuilder.c(iArr2[1], iU4 >> 4);
                                iArr2[0] = CueBuilder.c(iArr2[0], iU4 & 15);
                            }
                            break;
                        case 5:
                            if (parsableByteArray.a() < 6) {
                                break;
                            } else {
                                int iU5 = parsableByteArray.u();
                                int iU6 = parsableByteArray.u();
                                int i4 = (iU5 << 4) | (iU6 >> 4);
                                int iU7 = ((iU6 & 15) << 8) | parsableByteArray.u();
                                int iU8 = parsableByteArray.u();
                                int iU9 = parsableByteArray.u();
                                cueBuilder.g = new Rect(i4, (iU8 << 4) | (iU9 >> 4), iU7 + 1, (((iU9 & 15) << 8) | parsableByteArray.u()) + 1);
                            }
                        case 6:
                            if (parsableByteArray.a() < 4) {
                                break;
                            } else {
                                cueBuilder.h = parsableByteArray.A();
                                cueBuilder.i = parsableByteArray.A();
                            }
                    }
                }
            }
            if (cueBuilder.d != null && cueBuilder.b && cueBuilder.c && (rect = cueBuilder.g) != null && cueBuilder.h != -1 && cueBuilder.i != -1 && rect.width() >= 2 && cueBuilder.g.height() >= 2) {
                Rect rect2 = cueBuilder.g;
                int[] iArr3 = new int[rect2.height() * rect2.width()];
                ParsableBitArray parsableBitArray = new ParsableBitArray();
                parsableByteArray.G(cueBuilder.h);
                parsableBitArray.l(parsableByteArray);
                cueBuilder.b(parsableBitArray, true, rect2, iArr3);
                parsableByteArray.G(cueBuilder.i);
                parsableBitArray.l(parsableByteArray);
                cueBuilder.b(parsableBitArray, false, rect2, iArr3);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr3, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
                Cue.Builder builder = new Cue.Builder();
                builder.b = bitmapCreateBitmap;
                builder.h = rect2.left / cueBuilder.e;
                builder.i = 0;
                builder.e = rect2.top / cueBuilder.f;
                builder.f = 0;
                builder.g = 0;
                builder.l = rect2.width() / cueBuilder.e;
                builder.m = rect2.height() / cueBuilder.f;
                cueA = builder.a();
            }
        }
        consumer.accept(new CuesWithTiming(cueA != null ? ImmutableList.w(cueA) : ImmutableList.t(), -9223372036854775807L, 5000000L));
    }
}
