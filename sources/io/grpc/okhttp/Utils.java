package io.grpc.okhttp;

import com.google.common.base.Charsets;
import com.google.common.io.BaseEncoding;
import io.grpc.internal.TransportFrameUtil;
import io.grpc.okhttp.internal.framed.Header;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
class Utils {
    static {
        Logger.getLogger(Utils.class.getName());
    }

    public static byte[][] a(ArrayList arrayList) {
        int size = arrayList.size() * 2;
        byte[][] bArr = new byte[size][];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Header header = (Header) it.next();
            int i2 = i + 1;
            bArr[i] = header.f24143a.x();
            i += 2;
            bArr[i2] = header.b.x();
        }
        byte[] bArr2 = TransportFrameUtil.b;
        int i3 = 0;
        while (i3 < size) {
            byte[] bArr3 = bArr[i3];
            int i4 = i3 + 1;
            byte[] bArr4 = bArr[i4];
            if (TransportFrameUtil.a(bArr3, bArr2)) {
                for (byte b : bArr4) {
                    if (b == 44) {
                        ArrayList arrayList2 = new ArrayList(size + 10);
                        for (int i5 = 0; i5 < i3; i5++) {
                            arrayList2.add(bArr[i5]);
                        }
                        while (i3 < size) {
                            byte[] bArr5 = bArr[i3];
                            byte[] bArr6 = bArr[i3 + 1];
                            if (TransportFrameUtil.a(bArr5, bArr2)) {
                                int i6 = 0;
                                for (int i7 = 0; i7 <= bArr6.length; i7++) {
                                    if (i7 == bArr6.length || bArr6[i7] == 44) {
                                        byte[] bArrA = BaseEncoding.f14922a.a(new String(bArr6, i6, i7 - i6, Charsets.f14860a));
                                        arrayList2.add(bArr5);
                                        arrayList2.add(bArrA);
                                        i6 = i7 + 1;
                                    }
                                }
                            } else {
                                arrayList2.add(bArr5);
                                arrayList2.add(bArr6);
                            }
                            i3 += 2;
                        }
                        return (byte[][]) arrayList2.toArray(new byte[0][]);
                    }
                }
                bArr[i4] = BaseEncoding.f14922a.a(new String(bArr4, Charsets.f14860a));
            }
            i3 += 2;
        }
        return bArr;
    }
}
