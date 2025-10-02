package androidx.media3.extractor.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
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
import java.util.ArrayList;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public final class DvbParser implements SubtitleParser {
    public static final byte[] h = {0, 7, 8, 15};
    public static final byte[] i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f3366a;
    public final Paint b;
    public final Canvas c;
    public final DisplayDefinition d;
    public final ClutDefinition e;
    public final SubtitleService f;
    public Bitmap g;

    public static final class ClutDefinition {

        /* renamed from: a, reason: collision with root package name */
        public final int f3367a;
        public final int[] b;
        public final int[] c;
        public final int[] d;

        public ClutDefinition(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f3367a = i;
            this.b = iArr;
            this.c = iArr2;
            this.d = iArr3;
        }
    }

    public static final class DisplayDefinition {

        /* renamed from: a, reason: collision with root package name */
        public final int f3368a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public DisplayDefinition(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f3368a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    public static final class ObjectData {

        /* renamed from: a, reason: collision with root package name */
        public final int f3369a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;

        public ObjectData(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f3369a = i;
            this.b = z;
            this.c = bArr;
            this.d = bArr2;
        }
    }

    public static final class PageComposition {

        /* renamed from: a, reason: collision with root package name */
        public final int f3370a;
        public final int b;
        public final SparseArray c;

        public PageComposition(int i, int i2, SparseArray sparseArray) {
            this.f3370a = i;
            this.b = i2;
            this.c = sparseArray;
        }
    }

    public static final class PageRegion {

        /* renamed from: a, reason: collision with root package name */
        public final int f3371a;
        public final int b;

        public PageRegion(int i, int i2) {
            this.f3371a = i;
            this.b = i2;
        }
    }

    public static final class RegionComposition {

        /* renamed from: a, reason: collision with root package name */
        public final int f3372a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final SparseArray j;

        public RegionComposition(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, SparseArray sparseArray) {
            this.f3372a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = i8;
            this.j = sparseArray;
        }
    }

    public static final class RegionObject {

        /* renamed from: a, reason: collision with root package name */
        public final int f3373a;
        public final int b;

        public RegionObject(int i, int i2) {
            this.f3373a = i;
            this.b = i2;
        }
    }

    public static final class SubtitleService {

        /* renamed from: a, reason: collision with root package name */
        public final int f3374a;
        public final int b;
        public final SparseArray c = new SparseArray();
        public final SparseArray d = new SparseArray();
        public final SparseArray e = new SparseArray();
        public final SparseArray f = new SparseArray();
        public final SparseArray g = new SparseArray();
        public DisplayDefinition h;
        public PageComposition i;

        public SubtitleService(int i, int i2) {
            this.f3374a = i;
            this.b = i2;
        }
    }

    public DvbParser(List list) {
        ParsableByteArray parsableByteArray = new ParsableByteArray((byte[]) list.get(0));
        int iA = parsableByteArray.A();
        int iA2 = parsableByteArray.A();
        Paint paint = new Paint();
        this.f3366a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new DisplayDefinition(719, 575, 0, 719, 0, 575);
        this.e = new ClutDefinition(0, new int[]{0, -1, -16777216, -8421505}, d(), e());
        this.f = new SubtitleService(iA, iA2);
    }

    public static byte[] c(int i2, int i3, ParsableBitArray parsableBitArray) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) parsableBitArray.g(i3);
        }
        return bArr;
    }

    public static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = f(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = f(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = f(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = f(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = f(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = f(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = f(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int f(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0203 A[LOOP:3: B:87:0x0156->B:119:0x0203, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(byte[] r21, int[] r22, int r23, int r24, int r25, android.graphics.Paint r26, android.graphics.Canvas r27) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.dvb.DvbParser.g(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static ClutDefinition h(ParsableBitArray parsableBitArray, int i2) {
        int iG;
        int i3;
        int iG2;
        int iG3;
        int iG4;
        int i4 = 8;
        int iG5 = parsableBitArray.g(8);
        parsableBitArray.o(8);
        int i5 = 2;
        int i6 = i2 - 2;
        int i7 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrD = d();
        int[] iArrE = e();
        while (i6 > 0) {
            int iG6 = parsableBitArray.g(i4);
            int iG7 = parsableBitArray.g(i4);
            int[] iArr2 = (iG7 & 128) != 0 ? iArr : (iG7 & 64) != 0 ? iArrD : iArrE;
            if ((iG7 & 1) != 0) {
                iG3 = parsableBitArray.g(i4);
                iG4 = parsableBitArray.g(i4);
                iG = parsableBitArray.g(i4);
                iG2 = parsableBitArray.g(i4);
                i3 = i6 - 6;
            } else {
                int iG8 = parsableBitArray.g(6) << i5;
                int iG9 = parsableBitArray.g(4) << 4;
                iG = parsableBitArray.g(4) << 4;
                i3 = i6 - 4;
                iG2 = parsableBitArray.g(i5) << 6;
                iG3 = iG8;
                iG4 = iG9;
            }
            if (iG3 == 0) {
                iG4 = i7;
                iG = iG4;
                iG2 = 255;
            }
            double d = iG3;
            double d2 = iG4 - 128;
            double d3 = iG - 128;
            iArr2[iG6] = f((byte) (255 - (iG2 & 255)), Util.i((int) ((1.402d * d2) + d), 0, 255), Util.i((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), Util.i((int) ((d3 * 1.772d) + d), 0, 255));
            i6 = i3;
            i7 = 0;
            iG5 = iG5;
            iArrE = iArrE;
            i4 = 8;
            i5 = 2;
        }
        return new ClutDefinition(iG5, iArr, iArrD, iArrE);
    }

    public static ObjectData i(ParsableBitArray parsableBitArray) {
        byte[] bArr;
        int iG = parsableBitArray.g(16);
        parsableBitArray.o(4);
        int iG2 = parsableBitArray.g(2);
        boolean zF = parsableBitArray.f();
        parsableBitArray.o(1);
        byte[] bArr2 = Util.c;
        if (iG2 != 1) {
            if (iG2 == 0) {
                int iG3 = parsableBitArray.g(16);
                int iG4 = parsableBitArray.g(16);
                if (iG3 > 0) {
                    bArr2 = new byte[iG3];
                    parsableBitArray.j(iG3, bArr2);
                }
                if (iG4 > 0) {
                    bArr = new byte[iG4];
                    parsableBitArray.j(iG4, bArr);
                }
            }
            return new ObjectData(iG, zF, bArr2, bArr);
        }
        parsableBitArray.o(parsableBitArray.g(8) * 16);
        bArr = bArr2;
        return new ObjectData(iG, zF, bArr2, bArr);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final void a(byte[] bArr, int i2, int i3, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        SubtitleService subtitleService;
        boolean z;
        CuesWithTiming cuesWithTiming;
        char c;
        char c2;
        char c3;
        int i4;
        ArrayList arrayList;
        int i5;
        DisplayDefinition displayDefinition;
        SubtitleService subtitleService2;
        RegionComposition regionComposition;
        int i6;
        int i7;
        int i8;
        int i9;
        RegionComposition regionComposition2;
        int iG;
        int iG2;
        int i10;
        int iG3;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, i2 + i3);
        parsableBitArray.m(i2);
        while (true) {
            int iB = parsableBitArray.b();
            subtitleService = this.f;
            z = true;
            if (iB >= 48 && parsableBitArray.g(8) == 15) {
                int iG4 = parsableBitArray.g(8);
                int iG5 = parsableBitArray.g(16);
                int iG6 = parsableBitArray.g(16);
                int iD = parsableBitArray.d() + iG6;
                if (iG6 * 8 > parsableBitArray.b()) {
                    Log.g("DvbParser", "Data field length exceeds limit");
                    parsableBitArray.o(parsableBitArray.b());
                } else {
                    switch (iG4) {
                        case 16:
                            if (iG5 == subtitleService.f3374a) {
                                PageComposition pageComposition = subtitleService.i;
                                parsableBitArray.g(8);
                                int iG7 = parsableBitArray.g(4);
                                int iG8 = parsableBitArray.g(2);
                                parsableBitArray.o(2);
                                int i11 = iG6 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i11 > 0) {
                                    int iG9 = parsableBitArray.g(8);
                                    parsableBitArray.o(8);
                                    i11 -= 6;
                                    sparseArray.put(iG9, new PageRegion(parsableBitArray.g(16), parsableBitArray.g(16)));
                                }
                                PageComposition pageComposition2 = new PageComposition(iG7, iG8, sparseArray);
                                if (iG8 != 0) {
                                    subtitleService.i = pageComposition2;
                                    subtitleService.c.clear();
                                    subtitleService.d.clear();
                                    subtitleService.e.clear();
                                    break;
                                } else if (pageComposition != null && pageComposition.f3370a != iG7) {
                                    subtitleService.i = pageComposition2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            PageComposition pageComposition3 = subtitleService.i;
                            SparseArray sparseArray2 = subtitleService.c;
                            if (iG5 == subtitleService.f3374a && pageComposition3 != null) {
                                int iG10 = parsableBitArray.g(8);
                                parsableBitArray.o(4);
                                boolean zF = parsableBitArray.f();
                                parsableBitArray.o(3);
                                int iG11 = parsableBitArray.g(16);
                                int iG12 = parsableBitArray.g(16);
                                parsableBitArray.g(3);
                                int iG13 = parsableBitArray.g(3);
                                parsableBitArray.o(2);
                                int iG14 = parsableBitArray.g(8);
                                int iG15 = parsableBitArray.g(8);
                                int iG16 = parsableBitArray.g(4);
                                int iG17 = parsableBitArray.g(2);
                                parsableBitArray.o(2);
                                int i12 = iG6 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i12 > 0) {
                                    int iG18 = parsableBitArray.g(16);
                                    int iG19 = parsableBitArray.g(2);
                                    parsableBitArray.g(2);
                                    int iG20 = parsableBitArray.g(12);
                                    parsableBitArray.o(4);
                                    int iG21 = parsableBitArray.g(12);
                                    int i13 = i12 - 6;
                                    if (iG19 == 1 || iG19 == 2) {
                                        parsableBitArray.g(8);
                                        parsableBitArray.g(8);
                                        i12 -= 8;
                                    } else {
                                        i12 = i13;
                                    }
                                    sparseArray3.put(iG18, new RegionObject(iG20, iG21));
                                }
                                RegionComposition regionComposition3 = new RegionComposition(iG10, zF, iG11, iG12, iG13, iG14, iG15, iG16, iG17, sparseArray3);
                                if (pageComposition3.b == 0 && (regionComposition2 = (RegionComposition) sparseArray2.get(iG10)) != null) {
                                    SparseArray sparseArray4 = regionComposition2.j;
                                    for (int i14 = 0; i14 < sparseArray4.size(); i14++) {
                                        regionComposition3.j.put(sparseArray4.keyAt(i14), (RegionObject) sparseArray4.valueAt(i14));
                                    }
                                }
                                sparseArray2.put(regionComposition3.f3372a, regionComposition3);
                                break;
                            }
                            break;
                        case 18:
                            if (iG5 == subtitleService.f3374a) {
                                ClutDefinition clutDefinitionH = h(parsableBitArray, iG6);
                                subtitleService.d.put(clutDefinitionH.f3367a, clutDefinitionH);
                                break;
                            } else if (iG5 == subtitleService.b) {
                                ClutDefinition clutDefinitionH2 = h(parsableBitArray, iG6);
                                subtitleService.f.put(clutDefinitionH2.f3367a, clutDefinitionH2);
                                break;
                            }
                            break;
                        case 19:
                            if (iG5 == subtitleService.f3374a) {
                                ObjectData objectDataI = i(parsableBitArray);
                                subtitleService.e.put(objectDataI.f3369a, objectDataI);
                                break;
                            } else if (iG5 == subtitleService.b) {
                                ObjectData objectDataI2 = i(parsableBitArray);
                                subtitleService.g.put(objectDataI2.f3369a, objectDataI2);
                                break;
                            }
                            break;
                        case 20:
                            if (iG5 == subtitleService.f3374a) {
                                parsableBitArray.o(4);
                                boolean zF2 = parsableBitArray.f();
                                parsableBitArray.o(3);
                                int iG22 = parsableBitArray.g(16);
                                int iG23 = parsableBitArray.g(16);
                                if (zF2) {
                                    int iG24 = parsableBitArray.g(16);
                                    iG = parsableBitArray.g(16);
                                    iG3 = parsableBitArray.g(16);
                                    iG2 = parsableBitArray.g(16);
                                    i10 = iG24;
                                } else {
                                    iG = iG22;
                                    iG2 = iG23;
                                    i10 = 0;
                                    iG3 = 0;
                                }
                                subtitleService.h = new DisplayDefinition(iG22, iG23, i10, iG, iG3, iG2);
                                break;
                            }
                            break;
                    }
                    parsableBitArray.p(iD - parsableBitArray.d());
                }
            }
        }
        PageComposition pageComposition4 = subtitleService.i;
        if (pageComposition4 == null) {
            cuesWithTiming = new CuesWithTiming(ImmutableList.t(), -9223372036854775807L, -9223372036854775807L);
        } else {
            DisplayDefinition displayDefinition2 = subtitleService.h;
            if (displayDefinition2 == null) {
                displayDefinition2 = this.d;
            }
            Bitmap bitmap = this.g;
            Canvas canvas = this.c;
            if (bitmap == null || displayDefinition2.f3368a + 1 != bitmap.getWidth() || displayDefinition2.b + 1 != this.g.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(displayDefinition2.f3368a + 1, displayDefinition2.b + 1, Bitmap.Config.ARGB_8888);
                this.g = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray5 = pageComposition4.c;
            int i15 = 0;
            while (i15 < sparseArray5.size()) {
                canvas.save();
                PageRegion pageRegion = (PageRegion) sparseArray5.valueAt(i15);
                RegionComposition regionComposition4 = (RegionComposition) subtitleService.c.get(sparseArray5.keyAt(i15));
                int i16 = pageRegion.f3371a + displayDefinition2.c;
                int i17 = pageRegion.b + displayDefinition2.e;
                int i18 = regionComposition4.c;
                int i19 = regionComposition4.f;
                int i20 = regionComposition4.d;
                boolean z2 = z;
                int i21 = i16 + i18;
                int i22 = i17 + i20;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i16, i17, Math.min(i21, displayDefinition2.d), Math.min(i22, displayDefinition2.f));
                ClutDefinition clutDefinition = (ClutDefinition) subtitleService.d.get(i19);
                if (clutDefinition == null && (clutDefinition = (ClutDefinition) subtitleService.f.get(i19)) == null) {
                    clutDefinition = this.e;
                }
                SparseArray sparseArray7 = regionComposition4.j;
                int i23 = i15;
                int i24 = 0;
                while (i24 < sparseArray7.size()) {
                    int iKeyAt = sparseArray7.keyAt(i24);
                    SparseArray sparseArray8 = sparseArray7;
                    RegionObject regionObject = (RegionObject) sparseArray7.valueAt(i24);
                    int i25 = i17;
                    ObjectData objectData = (ObjectData) subtitleService.e.get(iKeyAt);
                    if (objectData == null) {
                        objectData = (ObjectData) subtitleService.g.get(iKeyAt);
                    }
                    ObjectData objectData2 = objectData;
                    if (objectData2 != null) {
                        Paint paint = objectData2.b ? null : this.f3366a;
                        int i26 = i16;
                        int i27 = regionComposition4.e;
                        subtitleService2 = subtitleService;
                        int i28 = i26 + regionObject.f3373a;
                        int i29 = i25 + regionObject.b;
                        int i30 = i20;
                        Paint paint2 = paint;
                        displayDefinition = displayDefinition2;
                        i7 = i18;
                        i6 = i26;
                        arrayList = arrayList2;
                        i5 = i25;
                        RegionComposition regionComposition5 = regionComposition4;
                        int[] iArr = i27 == 3 ? clutDefinition.d : i27 == 2 ? clutDefinition.c : clutDefinition.b;
                        regionComposition = regionComposition5;
                        i8 = i24;
                        i9 = i30;
                        g(objectData2.c, iArr, i27, i28, i29, paint2, canvas);
                        g(objectData2.d, iArr, i27, i28, i29 + 1, paint2, canvas);
                    } else {
                        arrayList = arrayList2;
                        i5 = i25;
                        displayDefinition = displayDefinition2;
                        subtitleService2 = subtitleService;
                        regionComposition = regionComposition4;
                        i6 = i16;
                        i7 = i18;
                        i8 = i24;
                        i9 = i20;
                    }
                    i24 = i8 + 1;
                    i18 = i7;
                    i17 = i5;
                    regionComposition4 = regionComposition;
                    i16 = i6;
                    arrayList2 = arrayList;
                    sparseArray7 = sparseArray8;
                    displayDefinition2 = displayDefinition;
                    subtitleService = subtitleService2;
                    i20 = i9;
                }
                DisplayDefinition displayDefinition3 = displayDefinition2;
                ArrayList arrayList3 = arrayList2;
                SubtitleService subtitleService3 = subtitleService;
                int i31 = i17;
                RegionComposition regionComposition6 = regionComposition4;
                int i32 = i16;
                int i33 = i18;
                int i34 = i20;
                if (regionComposition6.b) {
                    int i35 = regionComposition6.e;
                    if (i35 == 3) {
                        i4 = clutDefinition.d[regionComposition6.g];
                        c3 = 2;
                    } else {
                        c3 = 2;
                        i4 = i35 == 2 ? clutDefinition.c[regionComposition6.h] : clutDefinition.b[regionComposition6.i];
                    }
                    Paint paint3 = this.b;
                    paint3.setColor(i4);
                    c = c3;
                    c2 = 3;
                    canvas.drawRect(i32, i31, i21, i22, paint3);
                } else {
                    c = 2;
                    c2 = 3;
                }
                Cue.Builder builder = new Cue.Builder();
                builder.b = Bitmap.createBitmap(this.g, i32, i31, i33, i34);
                float f = displayDefinition3.f3368a;
                builder.h = i32 / f;
                builder.i = 0;
                float f2 = displayDefinition3.b;
                builder.e = i31 / f2;
                builder.f = 0;
                builder.g = 0;
                builder.l = i33 / f;
                builder.m = i34 / f2;
                arrayList3.add(builder.a());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                z = z2;
                i15 = i23 + 1;
                displayDefinition2 = displayDefinition3;
                arrayList2 = arrayList3;
                subtitleService = subtitleService3;
                sparseArray5 = sparseArray6;
            }
            cuesWithTiming = new CuesWithTiming(arrayList2, -9223372036854775807L, -9223372036854775807L);
        }
        consumer.accept(cuesWithTiming);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final void reset() {
        SubtitleService subtitleService = this.f;
        subtitleService.c.clear();
        subtitleService.d.clear();
        subtitleService.e.clear();
        subtitleService.f.clear();
        subtitleService.g.clear();
        subtitleService.h = null;
        subtitleService.i = null;
    }
}
