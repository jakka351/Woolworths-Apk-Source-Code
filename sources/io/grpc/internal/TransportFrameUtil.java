package io.grpc.internal;

import com.google.common.base.Charsets;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public final class TransportFrameUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f24112a = Logger.getLogger(TransportFrameUtil.class.getName());
    public static final byte[] b = "-bin".getBytes(Charsets.f14860a);

    public static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }
}
