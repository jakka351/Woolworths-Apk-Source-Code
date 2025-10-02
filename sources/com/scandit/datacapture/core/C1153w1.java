package com.scandit.datacapture.core;

import com.scandit.datacapture.core.common.buffer.EncodingRange;
import com.scandit.datacapture.core.internal.module.data.NativeDataDecoding;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.w1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1153w1 extends NativeDataDecoding {
    @Override // com.scandit.datacapture.core.internal.module.data.NativeDataDecoding
    public final String decode(byte[] rawData, ArrayList dataEncoding) {
        Intrinsics.h(rawData, "rawData");
        Intrinsics.h(dataEncoding, "dataEncoding");
        if (rawData.length != 0 && dataEncoding.isEmpty()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        CharBuffer charBufferAllocate = CharBuffer.allocate(rawData.length * 4);
        Iterator it = dataEncoding.iterator();
        while (it.hasNext()) {
            EncodingRange encodingRange = (EncodingRange) it.next();
            try {
                Charset.forName(encodingRange.getIanaName()).newDecoder().decode(ByteBuffer.wrap(rawData, encodingRange.getStartIndex(), encodingRange.getEndIndex() - encodingRange.getStartIndex()), charBufferAllocate, true);
            } catch (Exception unused) {
                return null;
            }
        }
        char[] cArrArray = charBufferAllocate.array();
        Intrinsics.g(cArrArray, "outBuffer.array()");
        return new String(cArrArray, 0, charBufferAllocate.position());
    }
}
