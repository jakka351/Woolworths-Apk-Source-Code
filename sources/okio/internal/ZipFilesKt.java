package okio.internal;

import com.medallia.digital.mobilesdk.q2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.Path;
import okio.RealBufferedSource;
import org.bouncycastle.crypto.hpke.HPKE;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ZipFilesKt {
    public static final LinkedHashMap a(ArrayList arrayList) {
        String str = Path.e;
        Path pathA = Path.Companion.a(q2.c, false);
        LinkedHashMap linkedHashMapL = MapsKt.l(new Pair(pathA, new ZipEntry(pathA, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (ZipEntry zipEntry : CollectionsKt.u0(new ZipFilesKt$buildIndex$$inlined$sortedBy$1(), arrayList)) {
            if (((ZipEntry) linkedHashMapL.put(zipEntry.f26789a, zipEntry)) == null) {
                while (true) {
                    Path path = zipEntry.f26789a;
                    Path pathC = path.c();
                    if (pathC != null) {
                        ZipEntry zipEntry2 = (ZipEntry) linkedHashMapL.get(pathC);
                        if (zipEntry2 != null) {
                            zipEntry2.q.add(path);
                            break;
                        }
                        ZipEntry zipEntry3 = new ZipEntry(pathC, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        linkedHashMapL.put(pathC, zipEntry3);
                        zipEntry3.q.add(path);
                        zipEntry = zipEntry3;
                    }
                }
            }
        }
        return linkedHashMapL;
    }

    public static final String b(int i) {
        CharsKt.b(16);
        String string = Integer.toString(i, 16);
        Intrinsics.g(string, "toString(...)");
        return "0x".concat(string);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bd, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        if (r13 != (r10.e() & org.bouncycastle.crypto.hpke.HPKE.aead_EXPORT_ONLY)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        if (r0 != 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (r9 != 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        r10.skip(4);
        r17 = r10.e() & org.bouncycastle.crypto.hpke.HPKE.aead_EXPORT_ONLY;
        r12 = new okio.internal.EocdRecord(r13, 4294967295L & r10.c(), r17);
        r10.f(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        r10.close();
        r4 = r4 - 20;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0088, code lost:
    
        if (r4 <= r18) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        r4 = okio.Okio.c(r3.g(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        if (r4.c() != 117853008) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        r5 = r4.c();
        r9 = r4.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        if (r4.c() != 1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        if (r5 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        r5 = okio.Okio.c(r3.g(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        r7 = r5.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bb, code lost:
    
        if (r7 != 101075792) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        r5.skip(12);
        r7 = r5.c();
        r9 = r5.c();
        r21 = r5.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d4, code lost:
    
        if (r21 != r5.d()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d6, code lost:
    
        if (r7 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d8, code lost:
    
        if (r9 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00da, code lost:
    
        r5.skip(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ed, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f8, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0121, code lost:
    
        throw new java.io.IOException("bad zip: expected " + b(101075792) + " but was " + b(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0122, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0128, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0129, code lost:
    
        kotlin.ExceptionsKt.a(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012c, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0131, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0139, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0145, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0146, code lost:
    
        kotlin.ExceptionsKt.a(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0149, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        r0 = r10.e() & org.bouncycastle.crypto.hpke.HPKE.aead_EXPORT_ONLY;
        r9 = r10.e() & org.bouncycastle.crypto.hpke.HPKE.aead_EXPORT_ONLY;
        r13 = r10.e() & org.bouncycastle.crypto.hpke.HPKE.aead_EXPORT_ONLY;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130 A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:19:0x0092, B:21:0x009b, B:24:0x00ac, B:50:0x0130, B:46:0x0129, B:53:0x0134, B:54:0x0139, B:25:0x00b4, B:27:0x00bd, B:31:0x00da, B:36:0x00f3, B:37:0x00f8, B:39:0x00fb, B:40:0x0121, B:43:0x0124), top: B:121:0x0092, outer: #10, inners: #2, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014d A[Catch: all -> 0x014e, TryCatch #10 {all -> 0x014e, blocks: (B:3:0x000f, B:5:0x001d, B:6:0x0026, B:16:0x007e, B:18:0x008a, B:66:0x014d, B:62:0x0146, B:69:0x0152, B:93:0x01a7, B:96:0x01b4, B:90:0x01a1, B:103:0x01c2, B:106:0x01d0, B:107:0x01d7, B:108:0x01d8, B:109:0x01db, B:110:0x01dc, B:111:0x01f1, B:87:0x019c, B:19:0x0092, B:21:0x009b, B:24:0x00ac, B:50:0x0130, B:46:0x0129, B:53:0x0134, B:54:0x0139, B:25:0x00b4, B:27:0x00bd, B:31:0x00da, B:36:0x00f3, B:37:0x00f8, B:39:0x00fb, B:40:0x0121, B:43:0x0124, B:70:0x0161, B:73:0x0167, B:75:0x0173, B:77:0x0181, B:80:0x0188, B:81:0x018d, B:82:0x0194, B:59:0x0141, B:7:0x002e, B:9:0x0037, B:15:0x005e, B:100:0x01b8, B:101:0x01bd), top: B:136:0x000f, inners: #0, #1, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a7 A[Catch: all -> 0x014e, TRY_LEAVE, TryCatch #10 {all -> 0x014e, blocks: (B:3:0x000f, B:5:0x001d, B:6:0x0026, B:16:0x007e, B:18:0x008a, B:66:0x014d, B:62:0x0146, B:69:0x0152, B:93:0x01a7, B:96:0x01b4, B:90:0x01a1, B:103:0x01c2, B:106:0x01d0, B:107:0x01d7, B:108:0x01d8, B:109:0x01db, B:110:0x01dc, B:111:0x01f1, B:87:0x019c, B:19:0x0092, B:21:0x009b, B:24:0x00ac, B:50:0x0130, B:46:0x0129, B:53:0x0134, B:54:0x0139, B:25:0x00b4, B:27:0x00bd, B:31:0x00da, B:36:0x00f3, B:37:0x00f8, B:39:0x00fb, B:40:0x0121, B:43:0x0124, B:70:0x0161, B:73:0x0167, B:75:0x0173, B:77:0x0181, B:80:0x0188, B:81:0x018d, B:82:0x0194, B:59:0x0141, B:7:0x002e, B:9:0x0037, B:15:0x005e, B:100:0x01b8, B:101:0x01bd), top: B:136:0x000f, inners: #0, #1, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b4 A[Catch: all -> 0x014e, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x014e, blocks: (B:3:0x000f, B:5:0x001d, B:6:0x0026, B:16:0x007e, B:18:0x008a, B:66:0x014d, B:62:0x0146, B:69:0x0152, B:93:0x01a7, B:96:0x01b4, B:90:0x01a1, B:103:0x01c2, B:106:0x01d0, B:107:0x01d7, B:108:0x01d8, B:109:0x01db, B:110:0x01dc, B:111:0x01f1, B:87:0x019c, B:19:0x0092, B:21:0x009b, B:24:0x00ac, B:50:0x0130, B:46:0x0129, B:53:0x0134, B:54:0x0139, B:25:0x00b4, B:27:0x00bd, B:31:0x00da, B:36:0x00f3, B:37:0x00f8, B:39:0x00fb, B:40:0x0121, B:43:0x0124, B:70:0x0161, B:73:0x0167, B:75:0x0173, B:77:0x0181, B:80:0x0188, B:81:0x018d, B:82:0x0194, B:59:0x0141, B:7:0x002e, B:9:0x0037, B:15:0x005e, B:100:0x01b8, B:101:0x01bd), top: B:136:0x000f, inners: #0, #1, #4, #5, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final okio.ZipFileSystem c(okio.Path r26, okio.FileSystem r27, kotlin.jvm.functions.Function1 r28) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.ZipFilesKt.c(okio.Path, okio.FileSystem, kotlin.jvm.functions.Function1):okio.ZipFileSystem");
    }

    public static final ZipEntry d(final RealBufferedSource realBufferedSource) throws IOException {
        int iC = realBufferedSource.c();
        if (iC != 33639248) {
            throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(iC));
        }
        realBufferedSource.skip(4L);
        short sE = realBufferedSource.e();
        int i = sE & HPKE.aead_EXPORT_ONLY;
        if ((sE & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i));
        }
        int iE = realBufferedSource.e() & HPKE.aead_EXPORT_ONLY;
        int iE2 = realBufferedSource.e() & HPKE.aead_EXPORT_ONLY;
        int iE3 = realBufferedSource.e() & HPKE.aead_EXPORT_ONLY;
        long jC = realBufferedSource.c() & 4294967295L;
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.d = realBufferedSource.c() & 4294967295L;
        final Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.d = realBufferedSource.c() & 4294967295L;
        int iE4 = realBufferedSource.e() & HPKE.aead_EXPORT_ONLY;
        int iE5 = realBufferedSource.e() & HPKE.aead_EXPORT_ONLY;
        int iE6 = 65535 & realBufferedSource.e();
        realBufferedSource.skip(8L);
        final Ref.LongRef longRef3 = new Ref.LongRef();
        longRef3.d = realBufferedSource.c() & 4294967295L;
        String strF = realBufferedSource.f(iE4);
        if (StringsKt.p(strF, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        final long j = longRef2.d == 4294967295L ? 8 : 0L;
        if (longRef.d == 4294967295L) {
            j += 8;
        }
        if (longRef3.d == 4294967295L) {
            j += 8;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        e(realBufferedSource, iE5, new Function2() { // from class: okio.internal.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                RealBufferedSource realBufferedSource2 = realBufferedSource;
                if (iIntValue == 1) {
                    Ref.BooleanRef booleanRef2 = booleanRef;
                    if (booleanRef2.d) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    booleanRef2.d = true;
                    if (jLongValue < j) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    Ref.LongRef longRef4 = longRef2;
                    long jD = longRef4.d;
                    if (jD == 4294967295L) {
                        jD = realBufferedSource2.d();
                    }
                    longRef4.d = jD;
                    Ref.LongRef longRef5 = longRef;
                    longRef5.d = longRef5.d == 4294967295L ? realBufferedSource2.d() : 0L;
                    Ref.LongRef longRef6 = longRef3;
                    longRef6.d = longRef6.d == 4294967295L ? realBufferedSource2.d() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        throw new IOException("bad zip: NTFS extra too short");
                    }
                    realBufferedSource2.skip(4L);
                    ZipFilesKt.e(realBufferedSource2, (int) (jLongValue - 4), new b(objectRef, realBufferedSource2, objectRef2, objectRef3));
                }
                return Unit.f24250a;
            }
        });
        if (j > 0 && !booleanRef.d) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strF2 = realBufferedSource.f(iE6);
        String str = Path.e;
        return new ZipEntry(Path.Companion.a(q2.c, false).e(strF), StringsKt.v(strF, q2.c, false), strF2, jC, longRef.d, longRef2.d, iE, longRef3.d, iE3, iE2, (Long) objectRef.d, (Long) objectRef2.d, (Long) objectRef3.d, 57344);
    }

    public static final void e(RealBufferedSource realBufferedSource, int i, Function2 function2) throws IOException {
        Buffer buffer = realBufferedSource.e;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iE = realBufferedSource.e() & HPKE.aead_EXPORT_ONLY;
            long jE = realBufferedSource.e() & 65535;
            long j2 = j - 4;
            if (j2 < jE) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            realBufferedSource.I1(jE);
            long j3 = buffer.e;
            function2.invoke(Integer.valueOf(iE), Long.valueOf(jE));
            long j4 = (buffer.e + jE) - j3;
            if (j4 < 0) {
                throw new IOException(YU.a.d(iE, "unsupported zip: too many bytes processed for "));
            }
            if (j4 > 0) {
                buffer.skip(j4);
            }
            j = j2 - jE;
        }
    }

    public static final ZipEntry f(RealBufferedSource realBufferedSource, ZipEntry zipEntry) {
        int iC = realBufferedSource.c();
        if (iC != 67324752) {
            throw new IOException("bad zip: expected " + b(67324752) + " but was " + b(iC));
        }
        realBufferedSource.skip(2L);
        short sE = realBufferedSource.e();
        int i = sE & HPKE.aead_EXPORT_ONLY;
        if ((sE & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i));
        }
        realBufferedSource.skip(18L);
        int iE = realBufferedSource.e() & HPKE.aead_EXPORT_ONLY;
        realBufferedSource.skip(realBufferedSource.e() & 65535);
        if (zipEntry == null) {
            realBufferedSource.skip(iE);
            return null;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        e(realBufferedSource, iE, new b(realBufferedSource, objectRef, objectRef2, objectRef3));
        return new ZipEntry(zipEntry.f26789a, zipEntry.b, zipEntry.c, zipEntry.d, zipEntry.e, zipEntry.f, zipEntry.g, zipEntry.h, zipEntry.i, zipEntry.j, zipEntry.k, zipEntry.l, zipEntry.m, (Integer) objectRef.d, (Integer) objectRef2.d, (Integer) objectRef3.d);
    }
}
