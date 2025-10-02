package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.Writer;

/* loaded from: classes.dex */
class UnknownFieldSetLiteSchema extends UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> {
    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    public final void a(int i, int i2, Object obj) {
        ((UnknownFieldSetLite) obj).d((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    public final void b(Object obj, int i, long j) {
        ((UnknownFieldSetLite) obj).d((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    public final void c(int i, Object obj, Object obj2) {
        ((UnknownFieldSetLite) obj).d((i << 3) | 3, (UnknownFieldSetLite) obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    public final void d(Object obj, int i, ByteString byteString) {
        ((UnknownFieldSetLite) obj).d((i << 3) | 2, byteString);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    public final void e(Object obj, int i, long j) {
        ((UnknownFieldSetLite) obj).d(i << 3, Long.valueOf(j));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite f(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.f) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLite2 = new UnknownFieldSetLite();
        generatedMessageLite.unknownFields = unknownFieldSetLite2;
        return unknownFieldSetLite2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    public final int h(Object obj) {
        return ((UnknownFieldSetLite) obj).a();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    public final int i(Object obj) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i = unknownFieldSetLite.d;
        if (i != -1) {
            return i;
        }
        int iS = 0;
        for (int i2 = 0; i2 < unknownFieldSetLite.f15119a; i2++) {
            int i3 = unknownFieldSetLite.b[i2] >>> 3;
            iS += CodedOutputStream.S(3, (ByteString) unknownFieldSetLite.c[i2]) + CodedOutputStream.a0(2, i3) + (CodedOutputStream.Z(1) * 2);
        }
        unknownFieldSetLite.d = iS;
        return iS;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    public final void j(Object obj) {
        ((GeneratedMessageLite) obj).unknownFields.e = false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite k(Object obj, Object obj2) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        UnknownFieldSetLite unknownFieldSetLite2 = (UnknownFieldSetLite) obj2;
        return unknownFieldSetLite2.equals(UnknownFieldSetLite.f) ? unknownFieldSetLite : UnknownFieldSetLite.c(unknownFieldSetLite, unknownFieldSetLite2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite m() {
        return new UnknownFieldSetLite();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    public final void n(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (UnknownFieldSetLite) obj2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    public final void o(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (UnknownFieldSetLite) obj2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite p(Object obj) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        unknownFieldSetLite.e = false;
        return unknownFieldSetLite;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    public final void q(Object obj, Writer writer) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        unknownFieldSetLite.getClass();
        if (writer.B() == Writer.FieldOrder.e) {
            for (int i = unknownFieldSetLite.f15119a - 1; i >= 0; i--) {
                writer.b(unknownFieldSetLite.b[i] >>> 3, unknownFieldSetLite.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < unknownFieldSetLite.f15119a; i2++) {
            writer.b(unknownFieldSetLite.b[i2] >>> 3, unknownFieldSetLite.c[i2]);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    public final void r(Object obj, Writer writer) {
        ((UnknownFieldSetLite) obj).f(writer);
    }
}
