package com.behaviosec.rl;

/* loaded from: classes4.dex */
public class yyyyyyl {
    private static final int i00690069iiii = Integer.MAX_VALUE;
    private static double ii0069iiii = 1.5d;
    public static int r00720072rrr00720072 = 1;
    public static int r0072rrrr00720072 = 38;
    public static int rr00720072rr00720072 = 2;
    public static int rr0072rrr00720072;
    private double l006Cll006C006C006C = 0.0d;
    private double ll006Cl006C006C006C = 0.0d;
    private long l006C006Cl006C006C006C = 0;
    private double lll006C006C006C006C = 0.0d;
    private double l006Cl006C006C006C006C = 0.0d;
    private long i0069iiiii = 0;
    private long ll006C006C006C006C006C = 0;

    static {
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                r0072rrrr00720072 = r0072r0072rr00720072();
                return;
            }
        }
    }

    public static int r007200720072rr00720072() {
        return 0;
    }

    public static int r0072r0072rr00720072() {
        return 36;
    }

    public static int rrr0072rr00720072() {
        return 2;
    }

    public double k006B006B006B006Bkk() {
        return this.lll006C006C006C006C;
    }

    public final void k006B006Bk006Bkk(double d) {
        int i = r0072rrrr00720072;
        if (((r00720072rrr00720072 + i) * i) % rr00720072rr00720072 != 0) {
            r0072rrrr00720072 = r0072r0072rr00720072();
            rr0072rrr00720072 = 88;
        }
        kkk006B006Bkk(d, 2147483647L);
    }

    public double k006B006Bkk006Bk() {
        double d = this.ll006Cl006C006C006C;
        int i = r0072rrrr00720072;
        if (((r00720072rrr00720072 + i) * i) % rr00720072rr00720072 != rr0072rrr00720072) {
            r0072rrrr00720072 = r0072r0072rr00720072();
            rr0072rrr00720072 = r0072r0072rr00720072();
        }
        return d;
    }

    public long k006Bk006B006Bkk() {
        int i = r0072rrrr00720072;
        if (((r00720072rrr00720072 + i) * i) % rr00720072rr00720072 != r007200720072rr00720072()) {
            r0072rrrr00720072 = 66;
            rr0072rrr00720072 = 95;
        }
        return this.l006C006Cl006C006C006C;
    }

    public double k006Bkkk006Bk() {
        return this.l006Cl006C006C006C006C;
    }

    public double kk006B006B006Bkk() {
        int i = r0072rrrr00720072;
        if (((r00720072rrr00720072 + i) * i) % rrr0072rr00720072() != rr0072rrr00720072) {
            r0072rrrr00720072 = r0072r0072rr00720072();
            rr0072rrr00720072 = 87;
        }
        return this.l006Cll006C006C006C;
    }

    public long kk006Bkk006Bk() {
        if ((r0072r0072rr00720072() * (r0072r0072rr00720072() + r00720072rrr00720072)) % rr00720072rr00720072 != rr0072rrr00720072) {
            r0072rrrr00720072 = 82;
            rr0072rrr00720072 = 15;
        }
        return this.ll006C006C006C006C006C;
    }

    public void kkk006B006Bkk(double d, long j) {
        long j2;
        double d2 = this.l006Cll006C006C006C;
        double d3 = this.l006C006Cl006C006C006C;
        double d4 = this.ll006Cl006C006C006C;
        if (d3 >= j) {
            long j3 = j - 1;
            d3 = j3;
            this.l006C006Cl006C006C006C = j3;
        }
        double d5 = ((d2 * d3) + d) / (d3 + 1.0d);
        double d6 = 0.0d;
        if (d3 == 0.0d) {
            j2 = 1;
        } else {
            double d7 = (d3 - 1.0d) * d4;
            double d8 = d - d5;
            int i = r0072rrrr00720072;
            j2 = 1;
            if (((i + r00720072rrr00720072) * i) % rr00720072rr00720072 != rr0072rrr00720072) {
                r0072rrrr00720072 = 16;
                rr0072rrr00720072 = r0072r0072rr00720072();
            }
            d6 = (((d - d2) * d8) + d7) / d3;
        }
        if (d3 > 1.0d) {
            if (d > (Math.sqrt(d6) * ii0069iiii) + d5) {
                double d9 = this.lll006C006C006C006C;
                long j4 = this.i0069iiiii;
                this.lll006C006C006C006C = ((d9 * j4) + d) / (j4 + j2);
                this.i0069iiiii = j4 + j2;
            } else if (d < d5 - (Math.sqrt(d6) * ii0069iiii)) {
                double d10 = this.l006Cl006C006C006C006C;
                long j5 = this.ll006C006C006C006C006C;
                this.l006Cl006C006C006C006C = ((d10 * j5) + d) / (j5 + j2);
                this.ll006C006C006C006C006C = j5 + j2;
            }
        }
        this.l006C006Cl006C006C006C += j2;
        this.l006Cll006C006C006C = d5;
        this.ll006Cl006C006C006C = d6;
    }

    public long kkkkk006Bk() {
        long j = this.i0069iiiii;
        if ((r0072r0072rr00720072() * (r0072r0072rr00720072() + r00720072rrr00720072)) % rrr0072rr00720072() != rr0072rrr00720072) {
            r0072rrrr00720072 = 99;
            rr0072rrr00720072 = r0072r0072rr00720072();
        }
        return j;
    }
}
