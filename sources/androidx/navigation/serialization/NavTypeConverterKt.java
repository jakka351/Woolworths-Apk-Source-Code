package androidx.navigation.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"navigation-common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavTypeConverterKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[InternalType.values().length];
            try {
                iArr[10] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InternalType internalType = InternalType.d;
                iArr[11] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                InternalType internalType2 = InternalType.d;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                InternalType internalType3 = InternalType.d;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                InternalType internalType4 = InternalType.d;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                InternalType internalType5 = InternalType.d;
                iArr[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                InternalType internalType6 = InternalType.d;
                iArr[8] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                InternalType internalType7 = InternalType.d;
                iArr[19] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                InternalType internalType8 = InternalType.d;
                iArr[1] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                InternalType internalType9 = InternalType.d;
                iArr[3] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                InternalType internalType10 = InternalType.d;
                iArr[5] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                InternalType internalType11 = InternalType.d;
                iArr[7] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                InternalType internalType12 = InternalType.d;
                iArr[9] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                InternalType internalType13 = InternalType.d;
                iArr[12] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                InternalType internalType14 = InternalType.d;
                iArr[13] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                InternalType internalType15 = InternalType.d;
                iArr[14] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                InternalType internalType16 = InternalType.d;
                iArr[15] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                InternalType internalType17 = InternalType.d;
                iArr[16] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                InternalType internalType18 = InternalType.d;
                iArr[17] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                InternalType internalType19 = InternalType.d;
                iArr[18] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                InternalType internalType20 = InternalType.d;
                iArr[20] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public static final InternalType a(SerialDescriptor serialDescriptor) {
        String strQ = StringsKt.Q(serialDescriptor.getF24816a(), "?", "", false);
        return Intrinsics.c(serialDescriptor.getB(), SerialKind.ENUM.f24773a) ? serialDescriptor.b() ? InternalType.x : InternalType.w : strQ.equals("kotlin.Int") ? serialDescriptor.b() ? InternalType.e : InternalType.d : strQ.equals("kotlin.Boolean") ? serialDescriptor.b() ? InternalType.g : InternalType.f : strQ.equals("kotlin.Double") ? serialDescriptor.b() ? InternalType.i : InternalType.h : strQ.equals("kotlin.Float") ? serialDescriptor.b() ? InternalType.k : InternalType.j : strQ.equals("kotlin.Long") ? serialDescriptor.b() ? InternalType.m : InternalType.l : strQ.equals("kotlin.String") ? serialDescriptor.b() ? InternalType.o : InternalType.n : strQ.equals("kotlin.IntArray") ? InternalType.p : strQ.equals("kotlin.DoubleArray") ? InternalType.r : strQ.equals("kotlin.BooleanArray") ? InternalType.q : strQ.equals("kotlin.FloatArray") ? InternalType.s : strQ.equals("kotlin.LongArray") ? InternalType.t : strQ.equals("kotlin.Array") ? InternalType.u : StringsKt.W(strQ, "kotlin.collections.ArrayList", false) ? InternalType.v : InternalType.y;
    }
}
