package androidx.media3.extractor.flv;

import androidx.media3.common.util.ParsableByteArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes2.dex */
final class ScriptTagPayloadReader extends TagPayloadReader {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable a(int i, ParsableByteArray parsableByteArray) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(parsableByteArray.o()));
        }
        if (i == 1) {
            return Boolean.valueOf(parsableByteArray.u() == 1);
        }
        if (i == 2) {
            return c(parsableByteArray);
        }
        if (i != 3) {
            if (i == 8) {
                return b(parsableByteArray);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(parsableByteArray.o()));
                parsableByteArray.H(2);
                return date;
            }
            int iY = parsableByteArray.y();
            ArrayList arrayList = new ArrayList(iY);
            for (int i2 = 0; i2 < iY; i2++) {
                Serializable serializableA = a(parsableByteArray.u(), parsableByteArray);
                if (serializableA != null) {
                    arrayList.add(serializableA);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strC = c(parsableByteArray);
            int iU = parsableByteArray.u();
            if (iU == 9) {
                return map;
            }
            Serializable serializableA2 = a(iU, parsableByteArray);
            if (serializableA2 != null) {
                map.put(strC, serializableA2);
            }
        }
    }

    public static HashMap b(ParsableByteArray parsableByteArray) {
        int iY = parsableByteArray.y();
        HashMap map = new HashMap(iY);
        for (int i = 0; i < iY; i++) {
            String strC = c(parsableByteArray);
            Serializable serializableA = a(parsableByteArray.u(), parsableByteArray);
            if (serializableA != null) {
                map.put(strC, serializableA);
            }
        }
        return map;
    }

    public static String c(ParsableByteArray parsableByteArray) {
        int iA = parsableByteArray.A();
        int i = parsableByteArray.b;
        parsableByteArray.H(iA);
        return new String(parsableByteArray.f2922a, i, iA);
    }
}
