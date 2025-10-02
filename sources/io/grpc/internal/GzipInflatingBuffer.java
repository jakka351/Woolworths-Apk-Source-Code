package io.grpc.internal;

import com.google.common.base.Preconditions;
import java.io.Closeable;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: classes7.dex */
class GzipInflatingBuffer implements Closeable {
    public int d;
    public int e;
    public Inflater f;
    public State g;
    public boolean h;
    public int i;
    public int j;
    public long k;
    public int l;
    public int m;
    public boolean n;

    /* renamed from: io.grpc.internal.GzipInflatingBuffer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24018a;

        static {
            int[] iArr = new int[State.values().length];
            f24018a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24018a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24018a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24018a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24018a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24018a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24018a[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24018a[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24018a[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f24018a[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public class GzipMetadataReader {
        public static void a(GzipMetadataReader gzipMetadataReader, int i) {
            gzipMetadataReader.getClass();
            throw null;
        }

        public final int b() {
            throw null;
        }

        public final int c() {
            return b() | (b() << 8);
        }

        public final int d() {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        public static final State d;
        public static final State e;
        public static final State f;
        public static final State g;
        public static final State h;
        public static final State i;
        public static final State j;
        public static final State k;
        public static final State l;
        public static final State m;
        public static final /* synthetic */ State[] n;

        static {
            State state = new State("HEADER", 0);
            d = state;
            State state2 = new State("HEADER_EXTRA_LEN", 1);
            e = state2;
            State state3 = new State("HEADER_EXTRA", 2);
            f = state3;
            State state4 = new State("HEADER_NAME", 3);
            g = state4;
            State state5 = new State("HEADER_COMMENT", 4);
            h = state5;
            State state6 = new State("HEADER_CRC", 5);
            i = state6;
            State state7 = new State("INITIALIZE_INFLATER", 6);
            j = state7;
            State state8 = new State("INFLATING", 7);
            k = state8;
            State state9 = new State("INFLATER_NEEDS_INPUT", 8);
            l = state9;
            State state10 = new State("TRAILER", 9);
            m = state10;
            n = new State[]{state, state2, state3, state4, state5, state6, state7, state8, state9, state10};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) n.clone();
        }
    }

    public final int a(int i, int i2, byte[] bArr) throws DataFormatException {
        Preconditions.q("GzipInflatingBuffer is closed", !this.h);
        while (true) {
            int i3 = i2 + 0;
            if (i3 <= 0) {
                if (this.g == State.d) {
                    throw null;
                }
                this.n = false;
                return 0;
            }
            switch (this.g.ordinal()) {
                case 0:
                    throw null;
                case 1:
                    if ((this.i & 4) == 4) {
                        throw null;
                    }
                    this.g = State.g;
                    break;
                case 2:
                    throw null;
                case 3:
                    if ((this.i & 8) == 8) {
                        throw null;
                    }
                    this.g = State.h;
                    break;
                case 4:
                    if ((this.i & 16) == 16) {
                        throw null;
                    }
                    this.g = State.i;
                    break;
                case 5:
                    if ((this.i & 2) == 2) {
                        throw null;
                    }
                    this.g = State.j;
                    break;
                case 6:
                    Inflater inflater = this.f;
                    if (inflater == null) {
                        this.f = new Inflater(true);
                    } else {
                        inflater.reset();
                    }
                    throw null;
                case 7:
                    int i4 = i + 0;
                    Preconditions.q("inflater is null", this.f != null);
                    try {
                        int totalIn = this.f.getTotalIn();
                        this.f.inflate(bArr, i4, i3);
                        int totalIn2 = this.f.getTotalIn() - totalIn;
                        this.l += totalIn2;
                        this.m += totalIn2;
                        this.d += totalIn2;
                        throw null;
                    } catch (DataFormatException e) {
                        throw new DataFormatException("Inflater data format exception: " + e.getMessage());
                    }
                case 8:
                    Preconditions.q("inflater is null", this.f != null);
                    Preconditions.q("inflaterInput has unconsumed bytes", this.d == this.e);
                    throw null;
                case 9:
                    this.f.getClass();
                    throw null;
                default:
                    throw new AssertionError("Invalid state: " + this.g);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.h) {
            return;
        }
        this.h = true;
        throw null;
    }
}
