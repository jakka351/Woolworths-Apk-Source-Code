package okio;

import java.util.ArrayList;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lokio/Options;", "Lkotlin/collections/AbstractList;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Companion", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Options extends AbstractList<ByteString> implements RandomAccess {
    public final ByteString[] d;
    public final int[] e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/Options$Companion;", "", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static void a(long j, Buffer buffer, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
            int i4;
            int i5;
            ArrayList arrayList3;
            long j2;
            int i6;
            int i7 = i;
            ArrayList arrayList4 = arrayList;
            ArrayList arrayList5 = arrayList2;
            if (i2 >= i3) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i8 = i2; i8 < i3; i8++) {
                if (((ByteString) arrayList4.get(i8)).c() < i7) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            ByteString byteString = (ByteString) arrayList.get(i2);
            ByteString byteString2 = (ByteString) arrayList4.get(i3 - 1);
            if (i7 == byteString.c()) {
                int iIntValue = ((Number) arrayList5.get(i2)).intValue();
                int i9 = i2 + 1;
                ByteString byteString3 = (ByteString) arrayList4.get(i9);
                i4 = i9;
                i5 = iIntValue;
                byteString = byteString3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (byteString.m(i7) == byteString2.m(i7)) {
                int iMin = Math.min(byteString.c(), byteString2.c());
                int i10 = 0;
                for (int i11 = i7; i11 < iMin && byteString.m(i11) == byteString2.m(i11); i11++) {
                    i10++;
                }
                long j3 = 4;
                long j4 = (buffer.e / j3) + j + 2 + i10 + 1;
                buffer.i0(-i10);
                buffer.i0(i5);
                int i12 = i7 + i10;
                while (i7 < i12) {
                    buffer.i0(byteString.m(i7) & 255);
                    i7++;
                }
                if (i4 + 1 == i3) {
                    if (i12 != ((ByteString) arrayList4.get(i4)).c()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    buffer.i0(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    Buffer buffer2 = new Buffer();
                    buffer.i0(((int) ((buffer2.e / j3) + j4)) * (-1));
                    a(j4, buffer2, i12, arrayList4, i4, i3, arrayList5);
                    buffer.U(buffer2);
                    return;
                }
            }
            int i13 = 1;
            for (int i14 = i4 + 1; i14 < i3; i14++) {
                if (((ByteString) arrayList4.get(i14 - 1)).m(i7) != ((ByteString) arrayList4.get(i14)).m(i7)) {
                    i13++;
                }
            }
            long j5 = 4;
            long j6 = (buffer.e / j5) + j + 2 + (i13 * 2);
            buffer.i0(i13);
            buffer.i0(i5);
            for (int i15 = i4; i15 < i3; i15++) {
                int iM = ((ByteString) arrayList4.get(i15)).m(i7);
                if (i15 == i4 || iM != ((ByteString) arrayList4.get(i15 - 1)).m(i7)) {
                    buffer.i0(iM & 255);
                }
            }
            Buffer buffer3 = new Buffer();
            int i16 = i4;
            while (i16 < i3) {
                byte bM = ((ByteString) arrayList4.get(i16)).m(i7);
                int i17 = i16 + 1;
                int i18 = i17;
                while (true) {
                    if (i18 >= i3) {
                        i18 = i3;
                        break;
                    } else if (bM != ((ByteString) arrayList4.get(i18)).m(i7)) {
                        break;
                    } else {
                        i18++;
                    }
                }
                if (i17 == i18 && i7 + 1 == ((ByteString) arrayList4.get(i16)).c()) {
                    buffer.i0(((Number) arrayList5.get(i16)).intValue());
                    arrayList3 = arrayList5;
                    j2 = j6;
                    i6 = i18;
                } else {
                    buffer.i0(((int) ((buffer3.e / j5) + j6)) * (-1));
                    arrayList3 = arrayList5;
                    j2 = j6;
                    i6 = i18;
                    a(j2, buffer3, i7 + 1, arrayList, i16, i6, arrayList3);
                    arrayList4 = arrayList;
                }
                j6 = j2;
                i16 = i6;
                arrayList5 = arrayList3;
            }
            buffer.U(buffer3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static okio.Options b(okio.ByteString... r11) {
            /*
                Method dump skipped, instructions count: 251
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.Options.Companion.b(okio.ByteString[]):okio.Options");
        }
    }

    public Options(ByteString[] byteStringArr, int[] iArr) {
        this.d = byteStringArr;
        this.e = iArr;
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: b */
    public final int getG() {
        return this.d.length;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return super.contains((ByteString) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        return this.d[i];
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}
