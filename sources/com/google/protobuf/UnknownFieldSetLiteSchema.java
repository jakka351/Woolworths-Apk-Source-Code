package com.google.protobuf;

import com.google.protobuf.Writer;
import java.util.Arrays;

@CheckReturnValue
/* loaded from: classes.dex */
class UnknownFieldSetLiteSchema extends UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> {
    @Override // com.google.protobuf.UnknownFieldSchema
    public final void a(int i, int i2, Object obj) {
        ((UnknownFieldSetLite) obj).d((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final void b(Object obj, int i, long j) {
        ((UnknownFieldSetLite) obj).d((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final void c(int i, Object obj, Object obj2) {
        ((UnknownFieldSetLite) obj).d((i << 3) | 3, (UnknownFieldSetLite) obj2);
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final void d(Object obj, int i, ByteString byteString) {
        ((UnknownFieldSetLite) obj).d((i << 3) | 2, byteString);
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final void e(Object obj, int i, long j) {
        ((UnknownFieldSetLite) obj).d(i << 3, Long.valueOf(j));
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite f(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.f) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteC = UnknownFieldSetLite.c();
        generatedMessageLite.unknownFields = unknownFieldSetLiteC;
        return unknownFieldSetLiteC;
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final int h(Object obj) {
        return ((UnknownFieldSetLite) obj).b();
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final int i(Object obj) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i = unknownFieldSetLite.d;
        if (i != -1) {
            return i;
        }
        int iW = 0;
        for (int i2 = 0; i2 < unknownFieldSetLite.f16091a; i2++) {
            int i3 = unknownFieldSetLite.b[i2] >>> 3;
            ByteString byteString = (ByteString) unknownFieldSetLite.c[i2];
            int iW2 = CodedOutputStream.W(i3) + CodedOutputStream.V(2) + (CodedOutputStream.V(1) * 2);
            int iV = CodedOutputStream.V(3);
            int size = byteString.size();
            iW += CodedOutputStream.W(size) + size + iV + iW2;
        }
        unknownFieldSetLite.d = iW;
        return iW;
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final void j(Object obj) {
        UnknownFieldSetLite unknownFieldSetLite = ((GeneratedMessageLite) obj).unknownFields;
        if (unknownFieldSetLite.e) {
            unknownFieldSetLite.e = false;
        }
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite k(Object obj, Object obj2) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        UnknownFieldSetLite unknownFieldSetLite2 = (UnknownFieldSetLite) obj2;
        UnknownFieldSetLite unknownFieldSetLite3 = UnknownFieldSetLite.f;
        if (unknownFieldSetLite3.equals(unknownFieldSetLite2)) {
            return unknownFieldSetLite;
        }
        if (unknownFieldSetLite3.equals(unknownFieldSetLite)) {
            int i = unknownFieldSetLite.f16091a + unknownFieldSetLite2.f16091a;
            int[] iArrCopyOf = Arrays.copyOf(unknownFieldSetLite.b, i);
            System.arraycopy(unknownFieldSetLite2.b, 0, iArrCopyOf, unknownFieldSetLite.f16091a, unknownFieldSetLite2.f16091a);
            Object[] objArrCopyOf = Arrays.copyOf(unknownFieldSetLite.c, i);
            System.arraycopy(unknownFieldSetLite2.c, 0, objArrCopyOf, unknownFieldSetLite.f16091a, unknownFieldSetLite2.f16091a);
            return new UnknownFieldSetLite(i, iArrCopyOf, objArrCopyOf, true);
        }
        unknownFieldSetLite.getClass();
        if (unknownFieldSetLite2.equals(unknownFieldSetLite3)) {
            return unknownFieldSetLite;
        }
        if (!unknownFieldSetLite.e) {
            throw new UnsupportedOperationException();
        }
        int i2 = unknownFieldSetLite.f16091a + unknownFieldSetLite2.f16091a;
        unknownFieldSetLite.a(i2);
        System.arraycopy(unknownFieldSetLite2.b, 0, unknownFieldSetLite.b, unknownFieldSetLite.f16091a, unknownFieldSetLite2.f16091a);
        System.arraycopy(unknownFieldSetLite2.c, 0, unknownFieldSetLite.c, unknownFieldSetLite.f16091a, unknownFieldSetLite2.f16091a);
        unknownFieldSetLite.f16091a = i2;
        return unknownFieldSetLite;
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite m() {
        return UnknownFieldSetLite.c();
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final void n(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (UnknownFieldSetLite) obj2;
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final void o(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (UnknownFieldSetLite) obj2;
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite p(Object obj) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        if (unknownFieldSetLite.e) {
            unknownFieldSetLite.e = false;
        }
        return unknownFieldSetLite;
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final void q(Object obj, Writer writer) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        unknownFieldSetLite.getClass();
        if (writer.B() == Writer.FieldOrder.e) {
            for (int i = unknownFieldSetLite.f16091a - 1; i >= 0; i--) {
                writer.b(unknownFieldSetLite.b[i] >>> 3, unknownFieldSetLite.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < unknownFieldSetLite.f16091a; i2++) {
            writer.b(unknownFieldSetLite.b[i2] >>> 3, unknownFieldSetLite.c[i2]);
        }
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final void r(Object obj, Writer writer) {
        ((UnknownFieldSetLite) obj).f(writer);
    }
}
