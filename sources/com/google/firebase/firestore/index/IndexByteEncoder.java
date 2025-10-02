package com.google.firebase.firestore.index;

import com.google.firebase.firestore.model.FieldIndex;
import com.google.protobuf.ByteString;
import java.math.RoundingMode;

/* loaded from: classes6.dex */
public class IndexByteEncoder {

    /* renamed from: a, reason: collision with root package name */
    public final OrderedCodeWriter f15475a;
    public final AscendingIndexByteEncoder b;
    public final DescendingIndexByteEncoder c;

    public class AscendingIndexByteEncoder extends DirectionalIndexByteEncoder {
        public AscendingIndexByteEncoder() {
        }

        @Override // com.google.firebase.firestore.index.DirectionalIndexByteEncoder
        public final void a(ByteString byteString) {
            OrderedCodeWriter orderedCodeWriter = IndexByteEncoder.this.f15475a;
            for (int i = 0; i < byteString.size(); i++) {
                orderedCodeWriter.b(byteString.g(i));
            }
            orderedCodeWriter.d((byte) 0);
            orderedCodeWriter.d((byte) 1);
        }

        @Override // com.google.firebase.firestore.index.DirectionalIndexByteEncoder
        public final void b(double d) {
            OrderedCodeWriter orderedCodeWriter = IndexByteEncoder.this.f15475a;
            long jDoubleToLongBits = Double.doubleToLongBits(d);
            long j = jDoubleToLongBits ^ (jDoubleToLongBits < 0 ? -1L : Long.MIN_VALUE);
            int iNumberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j);
            RoundingMode roundingMode = RoundingMode.UP;
            int iA = IntMath.a(iNumberOfLeadingZeros, 8);
            orderedCodeWriter.a(iA + 1);
            byte[] bArr = orderedCodeWriter.f15479a;
            int i = orderedCodeWriter.b;
            int i2 = i + 1;
            orderedCodeWriter.b = i2;
            bArr[i] = (byte) iA;
            int i3 = i2 + iA;
            while (true) {
                i3--;
                int i4 = orderedCodeWriter.b;
                if (i3 < i4) {
                    orderedCodeWriter.b = i4 + iA;
                    return;
                } else {
                    orderedCodeWriter.f15479a[i3] = (byte) (255 & j);
                    j >>>= 8;
                }
            }
        }

        @Override // com.google.firebase.firestore.index.DirectionalIndexByteEncoder
        public final void c() {
            OrderedCodeWriter orderedCodeWriter = IndexByteEncoder.this.f15475a;
            orderedCodeWriter.d((byte) -1);
            orderedCodeWriter.d((byte) -1);
        }

        @Override // com.google.firebase.firestore.index.DirectionalIndexByteEncoder
        public final void d(long j) {
            IndexByteEncoder.this.f15475a.f(j);
        }

        @Override // com.google.firebase.firestore.index.DirectionalIndexByteEncoder
        public final void e(String str) {
            OrderedCodeWriter orderedCodeWriter = IndexByteEncoder.this.f15475a;
            int length = str.length();
            int i = 0;
            while (i < length) {
                char cCharAt = str.charAt(i);
                if (cCharAt < 128) {
                    orderedCodeWriter.b((byte) cCharAt);
                } else if (cCharAt < 2048) {
                    orderedCodeWriter.b((byte) ((cCharAt >>> 6) | 960));
                    orderedCodeWriter.b((byte) ((cCharAt & '?') | 128));
                } else if (cCharAt < 55296 || 57343 < cCharAt) {
                    orderedCodeWriter.b((byte) ((cCharAt >>> '\f') | 480));
                    orderedCodeWriter.b((byte) (((cCharAt >>> 6) & 63) | 128));
                    orderedCodeWriter.b((byte) ((cCharAt & '?') | 128));
                } else {
                    int iCodePointAt = Character.codePointAt(str, i);
                    i++;
                    orderedCodeWriter.b((byte) ((iCodePointAt >>> 18) | 240));
                    orderedCodeWriter.b((byte) (((iCodePointAt >>> 12) & 63) | 128));
                    orderedCodeWriter.b((byte) (((iCodePointAt >>> 6) & 63) | 128));
                    orderedCodeWriter.b((byte) ((iCodePointAt & 63) | 128));
                }
                i++;
            }
            orderedCodeWriter.d((byte) 0);
            orderedCodeWriter.d((byte) 1);
        }
    }

    public class DescendingIndexByteEncoder extends DirectionalIndexByteEncoder {
        public DescendingIndexByteEncoder() {
        }

        @Override // com.google.firebase.firestore.index.DirectionalIndexByteEncoder
        public final void a(ByteString byteString) {
            OrderedCodeWriter orderedCodeWriter = IndexByteEncoder.this.f15475a;
            for (int i = 0; i < byteString.size(); i++) {
                orderedCodeWriter.c(byteString.g(i));
            }
            orderedCodeWriter.e((byte) 0);
            orderedCodeWriter.e((byte) 1);
        }

        @Override // com.google.firebase.firestore.index.DirectionalIndexByteEncoder
        public final void b(double d) {
            OrderedCodeWriter orderedCodeWriter = IndexByteEncoder.this.f15475a;
            long jDoubleToLongBits = Double.doubleToLongBits(d);
            long j = jDoubleToLongBits ^ (jDoubleToLongBits < 0 ? -1L : Long.MIN_VALUE);
            int iNumberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j);
            RoundingMode roundingMode = RoundingMode.UP;
            int iA = IntMath.a(iNumberOfLeadingZeros, 8);
            orderedCodeWriter.a(iA + 1);
            byte[] bArr = orderedCodeWriter.f15479a;
            int i = orderedCodeWriter.b;
            int i2 = i + 1;
            orderedCodeWriter.b = i2;
            bArr[i] = (byte) (~iA);
            int i3 = i2 + iA;
            while (true) {
                i3--;
                int i4 = orderedCodeWriter.b;
                if (i3 < i4) {
                    orderedCodeWriter.b = i4 + iA;
                    return;
                } else {
                    orderedCodeWriter.f15479a[i3] = (byte) (~(255 & j));
                    j >>>= 8;
                }
            }
        }

        @Override // com.google.firebase.firestore.index.DirectionalIndexByteEncoder
        public final void c() {
            OrderedCodeWriter orderedCodeWriter = IndexByteEncoder.this.f15475a;
            orderedCodeWriter.e((byte) -1);
            orderedCodeWriter.e((byte) -1);
        }

        @Override // com.google.firebase.firestore.index.DirectionalIndexByteEncoder
        public final void d(long j) {
            IndexByteEncoder.this.f15475a.f(~j);
        }

        @Override // com.google.firebase.firestore.index.DirectionalIndexByteEncoder
        public final void e(String str) {
            OrderedCodeWriter orderedCodeWriter = IndexByteEncoder.this.f15475a;
            int length = str.length();
            int i = 0;
            while (i < length) {
                char cCharAt = str.charAt(i);
                if (cCharAt < 128) {
                    orderedCodeWriter.c((byte) cCharAt);
                } else if (cCharAt < 2048) {
                    orderedCodeWriter.c((byte) ((cCharAt >>> 6) | 960));
                    orderedCodeWriter.c((byte) ((cCharAt & '?') | 128));
                } else if (cCharAt < 55296 || 57343 < cCharAt) {
                    orderedCodeWriter.c((byte) ((cCharAt >>> '\f') | 480));
                    orderedCodeWriter.c((byte) (((cCharAt >>> 6) & 63) | 128));
                    orderedCodeWriter.c((byte) ((cCharAt & '?') | 128));
                } else {
                    int iCodePointAt = Character.codePointAt(str, i);
                    i++;
                    orderedCodeWriter.c((byte) ((iCodePointAt >>> 18) | 240));
                    orderedCodeWriter.c((byte) (((iCodePointAt >>> 12) & 63) | 128));
                    orderedCodeWriter.c((byte) (((iCodePointAt >>> 6) & 63) | 128));
                    orderedCodeWriter.c((byte) ((iCodePointAt & 63) | 128));
                }
                i++;
            }
            orderedCodeWriter.e((byte) 0);
            orderedCodeWriter.e((byte) 1);
        }
    }

    public IndexByteEncoder() {
        OrderedCodeWriter orderedCodeWriter = new OrderedCodeWriter();
        orderedCodeWriter.b = 0;
        orderedCodeWriter.f15479a = new byte[1024];
        this.f15475a = orderedCodeWriter;
        this.b = new AscendingIndexByteEncoder();
        this.c = new DescendingIndexByteEncoder();
    }

    public final DirectionalIndexByteEncoder a(FieldIndex.Segment.Kind kind) {
        return kind.equals(FieldIndex.Segment.Kind.e) ? this.c : this.b;
    }
}
