package com.swrve.sdk;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

/* loaded from: classes6.dex */
public class SwrveImageScaler {

    public static class BitmapResult {

        /* renamed from: a, reason: collision with root package name */
        public Bitmap f19058a;
        public int b;
        public int c;

        public final Bitmap a() {
            return this.f19058a;
        }
    }

    public static BitmapResult a(int i, int i2, int i3, String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i4 = 1;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i5 = options.outWidth;
            int i6 = options.outHeight;
            if (i6 > i2 || i5 > i) {
                int i7 = i6 / 2;
                int i8 = i5 / 2;
                while (i7 / i4 > i2 && i8 / i4 > i) {
                    i4 *= 2;
                }
            }
            options.inSampleSize = Math.max(i4, i3);
            options.inJustDecodeBounds = false;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
            BitmapResult bitmapResult = new BitmapResult();
            bitmapResult.f19058a = bitmapDecodeFile;
            bitmapResult.b = i5;
            bitmapResult.c = i6;
            return bitmapResult;
        } catch (Exception e) {
            SwrveLogger.d(Log.getStackTraceString(e), new Object[0]);
            return null;
        } catch (OutOfMemoryError e2) {
            SwrveLogger.d(Log.getStackTraceString(e2), new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x001f: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:10:0x001f */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap b(java.io.FilterInputStream r7, int r8, int r9, java.lang.String r10, java.io.File r11) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "Exception closing stream for downloading notification image."
            r1 = 0
            r2 = 0
            java.lang.String r3 = "notification-image"
            java.io.File r11 = java.io.File.createTempFile(r3, r2, r11)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            r3.<init>(r11)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            r4 = 2048(0x800, float:2.87E-42)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L21
        L13:
            int r5 = r7.read(r4)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L21
            r6 = -1
            if (r5 == r6) goto L23
            r3.write(r4, r1, r5)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L21
            goto L13
        L1e:
            r7 = move-exception
            r2 = r3
            goto L58
        L21:
            r7 = move-exception
            goto L42
        L23:
            r3.close()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L21
            java.lang.String r7 = r11.getAbsolutePath()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L21
            r11 = 1
            com.swrve.sdk.SwrveImageScaler$BitmapResult r7 = a(r8, r9, r11, r7)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L21
            if (r7 == 0) goto L33
            android.graphics.Bitmap r2 = r7.f19058a     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L21
        L33:
            r3.close()     // Catch: java.lang.Exception -> L37
            goto L57
        L37:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r1]
            com.swrve.sdk.SwrveLogger.c(r0, r7, r8)
            goto L57
        L3e:
            r7 = move-exception
            goto L58
        L40:
            r7 = move-exception
            r3 = r2
        L42:
            java.lang.String r8 = "Exception downloading notification image:%s"
            java.lang.Object[] r9 = new java.lang.Object[]{r10}     // Catch: java.lang.Throwable -> L1e
            com.swrve.sdk.SwrveLogger.c(r8, r7, r9)     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L57
            r3.close()     // Catch: java.lang.Exception -> L51
            goto L57
        L51:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r1]
            com.swrve.sdk.SwrveLogger.c(r0, r7, r8)
        L57:
            return r2
        L58:
            if (r2 == 0) goto L64
            r2.close()     // Catch: java.lang.Exception -> L5e
            goto L64
        L5e:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r1]
            com.swrve.sdk.SwrveLogger.c(r0, r8, r9)
        L64:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swrve.sdk.SwrveImageScaler.b(java.io.FilterInputStream, int, int, java.lang.String, java.io.File):android.graphics.Bitmap");
    }
}
