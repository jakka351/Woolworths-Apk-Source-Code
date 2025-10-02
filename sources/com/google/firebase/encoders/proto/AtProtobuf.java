package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes.dex */
public final class AtProtobuf {

    /* renamed from: a, reason: collision with root package name */
    public int f15415a;

    public static final class ProtobufImpl implements Protobuf {

        /* renamed from: a, reason: collision with root package name */
        public final int f15416a;

        public ProtobufImpl(int i) {
            this.f15416a = i;
        }

        @Override // java.lang.annotation.Annotation
        public final Class annotationType() {
            return Protobuf.class;
        }

        @Override // java.lang.annotation.Annotation
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Protobuf)) {
                return false;
            }
            Protobuf protobuf = (Protobuf) obj;
            return this.f15416a == protobuf.tag() && Protobuf.IntEncoding.d.equals(protobuf.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public final int hashCode() {
            return (14552422 ^ this.f15416a) + (Protobuf.IntEncoding.d.hashCode() ^ 2041407134);
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public final Protobuf.IntEncoding intEncoding() {
            return Protobuf.IntEncoding.d;
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public final int tag() {
            return this.f15416a;
        }

        @Override // java.lang.annotation.Annotation
        public final String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f15416a + "intEncoding=" + Protobuf.IntEncoding.d + ')';
        }
    }

    public final Protobuf a() {
        return new ProtobufImpl(this.f15415a);
    }
}
