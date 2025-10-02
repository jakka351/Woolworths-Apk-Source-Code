package okio;

import androidx.camera.core.impl.b;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okio.Buffer;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: okio.-SegmentedByteString, reason: invalid class name */
/* loaded from: classes.dex */
public final class SegmentedByteString {

    /* renamed from: a, reason: collision with root package name */
    public static final Buffer.UnsafeCursor f26780a = new Buffer.UnsafeCursor();

    public static final boolean a(int i, int i2, int i3, byte[] a2, byte[] b) {
        Intrinsics.h(a2, "a");
        Intrinsics.h(b, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (a2[i4 + i] != b[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbT = b.t(j, "size=", " offset=");
            sbT.append(j2);
            throw new ArrayIndexOutOfBoundsException(c.m(j3, " byteCount=", sbT));
        }
    }

    public static final int c(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final String d(byte b) {
        char[] cArr = okio.internal.ByteString.f26786a;
        return new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]});
    }

    public static final String e(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = okio.internal.ByteString.f26786a;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        return StringsKt.n(cArr2, i2, 8);
    }
}
