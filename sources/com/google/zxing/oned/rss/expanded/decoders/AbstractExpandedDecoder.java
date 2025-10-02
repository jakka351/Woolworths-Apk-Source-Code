package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;

/* loaded from: classes6.dex */
public abstract class AbstractExpandedDecoder {

    /* renamed from: a, reason: collision with root package name */
    public final BitArray f16190a;
    public final GeneralAppIdDecoder b;

    public AbstractExpandedDecoder(BitArray bitArray) {
        this.f16190a = bitArray;
        this.b = new GeneralAppIdDecoder(bitArray);
    }

    public static AbstractExpandedDecoder a(BitArray bitArray) {
        if (bitArray.d(1)) {
            return new AI01AndOtherAIs(bitArray);
        }
        if (!bitArray.d(2)) {
            return new AnyAIDecoder(bitArray);
        }
        int iC = GeneralAppIdDecoder.c(1, 4, bitArray);
        if (iC == 4) {
            return new AI013103decoder(bitArray);
        }
        if (iC == 5) {
            return new AI01320xDecoder(bitArray);
        }
        int iC2 = GeneralAppIdDecoder.c(1, 5, bitArray);
        if (iC2 == 12) {
            return new AI01392xDecoder(bitArray);
        }
        if (iC2 == 13) {
            return new AI01393xDecoder(bitArray);
        }
        switch (GeneralAppIdDecoder.c(1, 7, bitArray)) {
            case 56:
                return new AI013x0x1xDecoder(bitArray, "310", "11");
            case 57:
                return new AI013x0x1xDecoder(bitArray, "320", "11");
            case 58:
                return new AI013x0x1xDecoder(bitArray, "310", "13");
            case 59:
                return new AI013x0x1xDecoder(bitArray, "320", "13");
            case 60:
                return new AI013x0x1xDecoder(bitArray, "310", "15");
            case 61:
                return new AI013x0x1xDecoder(bitArray, "320", "15");
            case 62:
                return new AI013x0x1xDecoder(bitArray, "310", "17");
            case 63:
                return new AI013x0x1xDecoder(bitArray, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(bitArray)));
        }
    }

    public abstract String b();
}
