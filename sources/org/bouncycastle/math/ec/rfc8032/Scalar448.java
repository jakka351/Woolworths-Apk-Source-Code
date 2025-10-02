package org.bouncycastle.math.ec.rfc8032;

import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat448;

/* loaded from: classes8.dex */
abstract class Scalar448 {
    private static final int L4_0 = 43969588;
    private static final int L4_1 = 30366549;
    private static final int L4_2 = 163752818;
    private static final int L4_3 = 258169998;
    private static final int L4_4 = 96434764;
    private static final int L4_5 = 227822194;
    private static final int L4_6 = 149865618;
    private static final int L4_7 = 550336261;
    private static final int L_0 = 78101261;
    private static final int L_1 = 141809365;
    private static final int L_2 = 175155932;
    private static final int L_3 = 64542499;
    private static final int L_4 = 158326419;
    private static final int L_5 = 191173276;
    private static final int L_6 = 104575268;
    private static final int L_7 = 137584065;
    private static final long M26L = 67108863;
    private static final long M28L = 268435455;
    private static final long M32L = 4294967295L;
    private static final int SCALAR_BYTES = 57;
    static final int SIZE = 14;
    private static final int TARGET_LENGTH = 447;
    private static final int[] L = {-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, 1073741823};
    private static final int[] LSq = {463601321, -1045562440, 1239460018, -1189350089, -412821483, 1160071467, -1564970643, 1256291574, -1170454588, -240530412, 2118977290, -1845154869, -1618855054, -1019204973, 1437344377, -1849925303, 1189267370, 280387897, -680846520, -500732508, -1100672524, -1, -1, -1, -1, -1, -1, 268435455};

    public static boolean checkVar(byte[] bArr, int[] iArr) {
        if (bArr[56] != 0) {
            return false;
        }
        decode(bArr, iArr);
        return !Nat.gte(14, iArr, L);
    }

    public static void decode(byte[] bArr, int[] iArr) {
        Codec.decode32(bArr, 0, iArr, 0, 14);
    }

    public static void getOrderWnafVar(int i, byte[] bArr) {
        Wnaf.getSignedVar(L, i, bArr);
    }

    public static void multiply225Var(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[22];
        Nat.mul(iArr2, 0, 8, iArr, 0, 14, iArr4, 0);
        if (iArr2[7] < 0) {
            Nat.addTo(14, L, 0, iArr4, 8);
            Nat.subFrom(14, iArr, 0, iArr4, 8);
        }
        byte[] bArr = new byte[114];
        Codec.encode32(iArr4, 0, 22, bArr, 0);
        decode(reduce(bArr), iArr3);
    }

    public static byte[] reduce(byte[] bArr) {
        long jDecode32 = Codec.decode32(bArr, 0) & M32L;
        long jDecode24 = (Codec.decode24(bArr, 4) << 4) & M32L;
        long jDecode322 = Codec.decode32(bArr, 7) & M32L;
        long jDecode242 = (Codec.decode24(bArr, 11) << 4) & M32L;
        long jDecode323 = Codec.decode32(bArr, 14) & M32L;
        long jDecode243 = (Codec.decode24(bArr, 18) << 4) & M32L;
        long jDecode324 = Codec.decode32(bArr, 21) & M32L;
        long jDecode244 = (Codec.decode24(bArr, 25) << 4) & M32L;
        long jDecode325 = Codec.decode32(bArr, 28) & M32L;
        long jDecode245 = (Codec.decode24(bArr, 32) << 4) & M32L;
        long jDecode326 = Codec.decode32(bArr, 35) & M32L;
        long jDecode246 = (Codec.decode24(bArr, 39) << 4) & M32L;
        long jDecode327 = Codec.decode32(bArr, 42) & M32L;
        long jDecode247 = (Codec.decode24(bArr, 46) << 4) & M32L;
        long jDecode328 = Codec.decode32(bArr, 49) & M32L;
        long jDecode248 = (Codec.decode24(bArr, 53) << 4) & M32L;
        long jDecode329 = Codec.decode32(bArr, 56) & M32L;
        long jDecode249 = (Codec.decode24(bArr, 60) << 4) & M32L;
        long jDecode3210 = Codec.decode32(bArr, 63) & M32L;
        long jDecode2410 = (Codec.decode24(bArr, 67) << 4) & M32L;
        long jDecode3211 = Codec.decode32(bArr, 70) & M32L;
        long jDecode2411 = (Codec.decode24(bArr, 74) << 4) & M32L;
        long jDecode3212 = Codec.decode32(bArr, 77) & M32L;
        long jDecode2412 = (Codec.decode24(bArr, 81) << 4) & M32L;
        long jDecode3213 = Codec.decode32(bArr, 84);
        long j = jDecode3213 & M32L;
        long jDecode2413 = (Codec.decode24(bArr, 88) << 4) & M32L;
        long jDecode3214 = Codec.decode32(bArr, 91);
        long j2 = jDecode3214 & M32L;
        long jDecode2414 = (Codec.decode24(bArr, 95) << 4) & M32L;
        long jDecode3215 = Codec.decode32(bArr, 98);
        long j3 = jDecode3215 & M32L;
        long jDecode2415 = (Codec.decode24(bArr, 102) << 4) & M32L;
        long jDecode3216 = Codec.decode32(bArr, 105);
        long j4 = jDecode3216 & M32L;
        long jDecode2416 = (Codec.decode24(bArr, 109) << 4) & M32L;
        long jDecode16 = Codec.decode16(bArr, 112) & M32L;
        long j5 = jDecode2416 + (j4 >>> 28);
        long j6 = jDecode3216 & M28L;
        long j7 = (j6 * 163752818) + (j5 * 30366549) + (jDecode16 * 43969588) + jDecode329;
        long j8 = (j6 * 258169998) + (j5 * 163752818) + (jDecode16 * 30366549) + jDecode249;
        long j9 = (j6 * 96434764) + (j5 * 258169998) + (jDecode16 * 163752818) + jDecode3210;
        long j10 = (j6 * 227822194) + (j5 * 96434764) + (jDecode16 * 258169998) + jDecode2410;
        long j11 = (j6 * 149865618) + (j5 * 227822194) + (jDecode16 * 96434764) + jDecode3211;
        long j12 = jDecode2415 + (j3 >>> 28);
        long j13 = jDecode3215 & M28L;
        long j14 = (j12 * 43969588) + jDecode247;
        long j15 = (j12 * 30366549) + (j6 * 43969588) + jDecode328;
        long j16 = (j12 * 163752818) + (j6 * 30366549) + (j5 * 43969588) + jDecode248;
        long j17 = (j12 * 258169998) + j7;
        long j18 = (j12 * 96434764) + j8;
        long j19 = (j12 * 227822194) + j9;
        long j20 = (j12 * 149865618) + j10;
        long j21 = (j12 * 550336261) + j11;
        long j22 = (j13 * 43969588) + jDecode327;
        long j23 = (j13 * 30366549) + j14;
        long j24 = (j13 * 163752818) + j15;
        long j25 = (j13 * 258169998) + j16;
        long j26 = (j13 * 96434764) + j17;
        long j27 = (j13 * 227822194) + j18;
        long j28 = (j13 * 149865618) + j19;
        long j29 = (j13 * 550336261) + j20;
        long j30 = jDecode2414 + (j2 >>> 28);
        long j31 = jDecode3214 & M28L;
        long j32 = (j30 * 163752818) + j23;
        long j33 = (j30 * 258169998) + j24;
        long j34 = (j30 * 149865618) + j27;
        long j35 = (j31 * 43969588) + jDecode326;
        long j36 = (j31 * 30366549) + (j30 * 43969588) + jDecode246;
        long j37 = (j31 * 163752818) + (j30 * 30366549) + j22;
        long j38 = (j31 * 258169998) + j32;
        long j39 = (j31 * 96434764) + j33;
        long j40 = (j31 * 227822194) + (j30 * 96434764) + j25;
        long j41 = (j31 * 149865618) + (j30 * 227822194) + j26;
        long j42 = (j31 * 550336261) + j34;
        long j43 = jDecode2413 + (j >>> 28);
        long j44 = jDecode3213 & M28L;
        long j45 = (j43 * 43969588) + jDecode245;
        long j46 = (j43 * 30366549) + j35;
        long j47 = (j43 * 163752818) + j36;
        long j48 = (j43 * 258169998) + j37;
        long j49 = (j43 * 96434764) + j38;
        long j50 = (j43 * 227822194) + j39;
        long j51 = (j43 * 149865618) + j40;
        long j52 = (j43 * 550336261) + j41;
        long j53 = (j6 * 550336261) + (j5 * 149865618) + (jDecode16 * 227822194) + jDecode2411 + (j21 >>> 28);
        long j54 = j21 & M28L;
        long j55 = (j5 * 550336261) + (jDecode16 * 149865618) + jDecode3212 + (j53 >>> 28);
        long j56 = j53 & M28L;
        long j57 = (jDecode16 * 550336261) + jDecode2412 + (j55 >>> 28);
        long j58 = j55 & M28L;
        long j59 = j44 + (j57 >>> 28);
        long j60 = j57 & M28L;
        long j61 = (j59 * 43969588) + jDecode325;
        long j62 = (j59 * 30366549) + j45;
        long j63 = (j59 * 163752818) + j46;
        long j64 = (j59 * 258169998) + j47;
        long j65 = (j59 * 96434764) + j48;
        long j66 = (j59 * 227822194) + j49;
        long j67 = (j59 * 149865618) + j50;
        long j68 = (j59 * 550336261) + j51;
        long j69 = (j60 * 43969588) + jDecode244;
        long j70 = (j60 * 30366549) + j61;
        long j71 = (j60 * 163752818) + j62;
        long j72 = (j60 * 258169998) + j63;
        long j73 = (j60 * 96434764) + j64;
        long j74 = (j60 * 227822194) + j65;
        long j75 = (j60 * 149865618) + j66;
        long j76 = (j60 * 550336261) + j67;
        long j77 = (j58 * 43969588) + jDecode324;
        long j78 = (j58 * 30366549) + j69;
        long j79 = (j58 * 163752818) + j70;
        long j80 = (j58 * 258169998) + j71;
        long j81 = (j58 * 96434764) + j72;
        long j82 = (j58 * 227822194) + j73;
        long j83 = (j58 * 149865618) + j74;
        long j84 = (j58 * 550336261) + j75;
        long j85 = (j30 * 550336261) + j28 + (j42 >>> 28);
        long j86 = j42 & M28L;
        long j87 = j29 + (j85 >>> 28);
        long j88 = j85 & M28L;
        long j89 = j54 + (j87 >>> 28);
        long j90 = j87 & M28L;
        long j91 = j56 + (j89 >>> 28);
        long j92 = j89 & M28L;
        long j93 = (j91 * 43969588) + jDecode243;
        long j94 = (j91 * 30366549) + j77;
        long j95 = (j91 * 163752818) + j78;
        long j96 = (j91 * 258169998) + j79;
        long j97 = (j91 * 96434764) + j80;
        long j98 = (j91 * 227822194) + j81;
        long j99 = (j91 * 149865618) + j82;
        long j100 = (j92 * 43969588) + jDecode323;
        long j101 = (j92 * 30366549) + j93;
        long j102 = (j92 * 163752818) + j94;
        long j103 = (j92 * 258169998) + j95;
        long j104 = (j92 * 96434764) + j96;
        long j105 = (j92 * 227822194) + j97;
        long j106 = (j92 * 149865618) + j98;
        long j107 = (j90 * 43969588) + jDecode242;
        long j108 = (j90 * 30366549) + j100;
        long j109 = (j90 * 163752818) + j101;
        long j110 = (j90 * 258169998) + j102;
        long j111 = (j90 * 96434764) + j103;
        long j112 = (j90 * 227822194) + j104;
        long j113 = (j90 * 149865618) + j105;
        long j114 = (j90 * 550336261) + j106;
        long j115 = j68 + (j76 >>> 28);
        long j116 = j76 & M28L;
        long j117 = j52 + (j115 >>> 28);
        long j118 = j115 & M28L;
        long j119 = j86 + (j117 >>> 28);
        long j120 = j117 & M28L;
        long j121 = j88 + (j119 >>> 28);
        long j122 = j119 & M28L;
        long j123 = (j121 * 43969588) + jDecode322;
        long j124 = (j121 * 30366549) + j107;
        long j125 = (j121 * 163752818) + j108;
        long j126 = (j121 * 258169998) + j109;
        long j127 = (j121 * 96434764) + j110;
        long j128 = (j121 * 227822194) + j111;
        long j129 = (j121 * 149865618) + j112;
        long j130 = (j121 * 550336261) + j113;
        long j131 = (43969588 * j122) + jDecode24;
        long j132 = j115 & M26L;
        long j133 = (j120 * 4) + (j118 >>> 26) + 1;
        long j134 = (78101261 * j133) + jDecode32;
        long j135 = (141809365 * j133) + j131 + (j134 >>> 28);
        long j136 = j134 & M28L;
        long j137 = (175155932 * j133) + (30366549 * j122) + j123 + (j135 >>> 28);
        long j138 = j135 & M28L;
        long j139 = (64542499 * j133) + (163752818 * j122) + j124 + (j137 >>> 28);
        long j140 = j137 & M28L;
        long j141 = (158326419 * j133) + (258169998 * j122) + j125 + (j139 >>> 28);
        long j142 = j139 & M28L;
        long j143 = (191173276 * j133) + (96434764 * j122) + j126 + (j141 >>> 28);
        long j144 = j141 & M28L;
        long j145 = (104575268 * j133) + (227822194 * j122) + j127 + (j143 >>> 28);
        long j146 = j143 & M28L;
        long j147 = (j133 * 137584065) + (149865618 * j122) + j128 + (j145 >>> 28);
        long j148 = j145 & M28L;
        long j149 = (j122 * 550336261) + j129 + (j147 >>> 28);
        long j150 = j147 & M28L;
        long j151 = j130 + (j149 >>> 28);
        long j152 = j149 & M28L;
        long j153 = j114 + (j151 >>> 28);
        long j154 = j151 & M28L;
        long j155 = (j92 * 550336261) + j99 + (j153 >>> 28);
        long j156 = j153 & M28L;
        long j157 = (j91 * 550336261) + j83 + (j155 >>> 28);
        long j158 = j155 & M28L;
        long j159 = j84 + (j157 >>> 28);
        long j160 = j157 & M28L;
        long j161 = j116 + (j159 >>> 28);
        long j162 = j159 & M28L;
        long j163 = j132 + (j161 >>> 28);
        long j164 = j161 & M28L;
        long j165 = j163 & M26L;
        long j166 = (j163 >>> 26) - 1;
        long j167 = j136 - (j166 & 78101261);
        long j168 = (j138 - (j166 & 141809365)) + (j167 >> 28);
        long j169 = j167 & M28L;
        long j170 = (j140 - (j166 & 175155932)) + (j168 >> 28);
        long j171 = j168 & M28L;
        long j172 = (j142 - (j166 & 64542499)) + (j170 >> 28);
        long j173 = j170 & M28L;
        long j174 = (j144 - (j166 & 158326419)) + (j172 >> 28);
        long j175 = j172 & M28L;
        long j176 = (j146 - (j166 & 191173276)) + (j174 >> 28);
        long j177 = j174 & M28L;
        long j178 = (j148 - (j166 & 104575268)) + (j176 >> 28);
        long j179 = j176 & M28L;
        long j180 = (j150 - (j166 & 137584065)) + (j178 >> 28);
        long j181 = j178 & M28L;
        long j182 = j152 + (j180 >> 28);
        long j183 = j180 & M28L;
        long j184 = j154 + (j182 >> 28);
        long j185 = j182 & M28L;
        long j186 = j156 + (j184 >> 28);
        long j187 = j184 & M28L;
        long j188 = j158 + (j186 >> 28);
        long j189 = j186 & M28L;
        long j190 = j160 + (j188 >> 28);
        long j191 = j188 & M28L;
        long j192 = j162 + (j190 >> 28);
        long j193 = j190 & M28L;
        long j194 = j164 + (j192 >> 28);
        long j195 = j192 & M28L;
        long j196 = j165 + (j194 >> 28);
        long j197 = j194 & M28L;
        byte[] bArr2 = new byte[57];
        Codec.encode56(j169 | (j171 << 28), bArr2, 0);
        Codec.encode56(j173 | (j175 << 28), bArr2, 7);
        Codec.encode56((j179 << 28) | j177, bArr2, 14);
        Codec.encode56(j181 | (j183 << 28), bArr2, 21);
        Codec.encode56(j185 | (j187 << 28), bArr2, 28);
        Codec.encode56(j189 | (j191 << 28), bArr2, 35);
        Codec.encode56(j193 | (j195 << 28), bArr2, 42);
        Codec.encode56(j197 | (j196 << 28), bArr2, 49);
        return bArr2;
    }

    public static void reduceBasisVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[28];
        System.arraycopy(LSq, 0, iArr4, 0, 28);
        int[] iArr5 = new int[28];
        Nat448.square(iArr, iArr5);
        iArr5[0] = iArr5[0] + 1;
        int[] iArr6 = new int[28];
        int[] iArr7 = L;
        Nat448.mul(iArr7, iArr, iArr6);
        int[] iArr8 = new int[8];
        System.arraycopy(iArr7, 0, iArr8, 0, 8);
        int[] iArr9 = new int[8];
        System.arraycopy(iArr, 0, iArr9, 0, 8);
        int[] iArr10 = new int[8];
        iArr10[0] = 1;
        int i = 27;
        int bitLengthPositive = ScalarUtil.getBitLengthPositive(27, iArr5);
        int[] iArr11 = iArr10;
        int[] iArr12 = new int[8];
        int[] iArr13 = iArr8;
        int[] iArr14 = iArr9;
        while (bitLengthPositive > TARGET_LENGTH) {
            int bitLength = ScalarUtil.getBitLength(i, iArr6) - bitLengthPositive;
            int i2 = bitLength & (~(bitLength >> 31));
            if (iArr6[i] < 0) {
                ScalarUtil.addShifted_NP(i, i2, iArr4, iArr5, iArr6);
                ScalarUtil.addShifted_UV(7, i2, iArr13, iArr12, iArr14, iArr11);
            } else {
                ScalarUtil.subShifted_NP(i, i2, iArr4, iArr5, iArr6);
                ScalarUtil.subShifted_UV(7, i2, iArr13, iArr12, iArr14, iArr11);
            }
            int[] iArr15 = iArr11;
            if (ScalarUtil.lessThan(i, iArr4, iArr5)) {
                int i3 = bitLengthPositive >>> 5;
                int bitLengthPositive2 = ScalarUtil.getBitLengthPositive(i3, iArr4);
                int[] iArr16 = iArr5;
                iArr5 = iArr4;
                iArr4 = iArr16;
                int[] iArr17 = iArr14;
                iArr14 = iArr13;
                iArr13 = iArr17;
                bitLengthPositive = bitLengthPositive2;
                iArr11 = iArr12;
                iArr12 = iArr15;
                i = i3;
            } else {
                iArr11 = iArr15;
            }
        }
        System.arraycopy(iArr14, 0, iArr2, 0, 8);
        System.arraycopy(iArr11, 0, iArr3, 0, 8);
    }

    public static void toSignedDigits(int i, int[] iArr, int[] iArr2) {
        iArr2[14] = Nat.cadd(14, 1 & (~iArr[0]), iArr, L, iArr2) + (1 << (i - 448));
        Nat.shiftDownBit(15, iArr2, 0);
    }
}
