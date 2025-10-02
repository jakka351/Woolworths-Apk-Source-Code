package com.google.zxing.aztec.encoder;

/* loaded from: classes6.dex */
final class State {
    public static final State e = new State(Token.b, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f16140a;
    public final Token b;
    public final int c;
    public final int d;

    public State(Token token, int i, int i2, int i3) {
        this.b = token;
        this.f16140a = i;
        this.c = i2;
        this.d = i3;
    }

    public final State a(int i) {
        Token simpleToken = this.b;
        int i2 = this.f16140a;
        int i3 = this.d;
        if (i2 == 4 || i2 == 2) {
            int[] iArr = HighLevelEncoder.b[i2];
            i2 = 0;
            int i4 = iArr[0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            simpleToken.getClass();
            i3 += i6;
            simpleToken = new SimpleToken(simpleToken, i5, i6);
        }
        int i7 = this.c;
        int i8 = (i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8;
        int i9 = i7 + 1;
        State state = new State(simpleToken, i2, i9, i3 + i8);
        return i9 == 2078 ? state.b(i + 1) : state;
    }

    public final State b(int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return this;
        }
        Token token = this.b;
        token.getClass();
        return new State(new BinaryShiftToken(token, i - i2, i2), this.f16140a, 0, this.d);
    }

    public final boolean c(State state) {
        int i = this.d + (HighLevelEncoder.b[this.f16140a][state.f16140a] >> 16);
        int i2 = state.c;
        int i3 = this.c;
        if (i3 < i2) {
            int i4 = 20;
            int i5 = i2 > 62 ? 21 : i2 > 31 ? 20 : i2 > 0 ? 10 : 0;
            if (i3 > 62) {
                i4 = 21;
            } else if (i3 <= 31) {
                i4 = i3 > 0 ? 10 : 0;
            }
            i += i5 - i4;
        } else if (i3 > i2 && i2 > 0) {
            i += 10;
        }
        return i <= state.d;
    }

    public final State d(int i, int i2) {
        int i3 = this.d;
        Token simpleToken = this.b;
        int i4 = this.f16140a;
        if (i != i4) {
            int i5 = HighLevelEncoder.b[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            simpleToken.getClass();
            i3 += i7;
            simpleToken = new SimpleToken(simpleToken, i6, i7);
        }
        int i8 = i == 2 ? 4 : 5;
        simpleToken.getClass();
        return new State(new SimpleToken(simpleToken, i2, i8), i, 0, i3 + i8);
    }

    public final State e(int i, int i2) {
        int i3 = this.f16140a;
        int i4 = i3 == 2 ? 4 : 5;
        int i5 = HighLevelEncoder.d[i3][i];
        Token token = this.b;
        token.getClass();
        return new State(new SimpleToken(new SimpleToken(token, i5, i4), i2, 5), i3, 0, this.d + i4 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", HighLevelEncoder.f16139a[this.f16140a], Integer.valueOf(this.d), Integer.valueOf(this.c));
    }
}
