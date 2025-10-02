package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.util.List;
import java.util.Map;

@CheckReturnValue
/* loaded from: classes2.dex */
abstract class BinaryReader implements Reader {

    /* renamed from: androidx.datastore.preferences.protobuf.BinaryReader$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2596a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f2596a = iArr;
            try {
                iArr[WireFormat.FieldType.m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2596a[WireFormat.FieldType.q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2596a[WireFormat.FieldType.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2596a[WireFormat.FieldType.s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2596a[WireFormat.FieldType.l.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2596a[WireFormat.FieldType.k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2596a[WireFormat.FieldType.g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2596a[WireFormat.FieldType.j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2596a[WireFormat.FieldType.h.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2596a[WireFormat.FieldType.p.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2596a[WireFormat.FieldType.t.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2596a[WireFormat.FieldType.u.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2596a[WireFormat.FieldType.v.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2596a[WireFormat.FieldType.w.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2596a[WireFormat.FieldType.n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2596a[WireFormat.FieldType.r.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2596a[WireFormat.FieldType.i.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static final class SafeHeapReader extends BinaryReader {
        public static void R(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (i != 0) {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void A(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            throw InvalidProtocolBufferException.d();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final int B() throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void C(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (!(list instanceof LongArrayList)) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void D(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof IntArrayList) {
                d();
                throw null;
            }
            d();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final int E() throws InvalidProtocolBufferException {
            R(5);
            Q(4);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final long F() throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final String G() throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final int H() throws InvalidProtocolBufferException {
            R(5);
            Q(4);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final String I() throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final Object J(Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(2);
            Protobuf.c.a(cls).newInstance();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void K(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void L(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            throw InvalidProtocolBufferException.d();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final Object M(Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            R(3);
            Schema schemaA = Protobuf.c.a(cls);
            O(schemaA.newInstance(), schemaA, extensionRegistryLite);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void N(Map map, MapEntryLite.Metadata metadata, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void O(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            schema.g(obj, this, extensionRegistryLite);
            throw InvalidProtocolBufferException.g();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void P(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            throw InvalidProtocolBufferException.d();
        }

        public final void Q(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.h();
            }
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void a(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof LongArrayList) {
                F();
                throw null;
            }
            F();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final int b() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final long c() throws InvalidProtocolBufferException {
            R(1);
            Q(8);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final int d() throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final int e() throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final int f() throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void g(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof BooleanArrayList) {
                w();
                throw null;
            }
            w();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final ByteString h() throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void i(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof IntArrayList) {
                f();
                throw null;
            }
            f();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final long j() throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void k(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (!(list instanceof LongArrayList)) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void l(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof IntArrayList) {
                B();
                throw null;
            }
            B();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void m(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (!(list instanceof IntArrayList)) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final int n() {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void o(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            throw InvalidProtocolBufferException.d();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void p(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (!(list instanceof FloatArrayList)) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final boolean q() {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void r(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            throw InvalidProtocolBufferException.d();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final double readDouble() throws InvalidProtocolBufferException {
            R(1);
            Q(8);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final float readFloat() throws InvalidProtocolBufferException {
            R(5);
            Q(4);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void s(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (!(list instanceof DoubleArrayList)) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final long t() throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final long u() throws InvalidProtocolBufferException {
            R(1);
            Q(8);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void v(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (!(list instanceof IntArrayList)) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final boolean w() throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void x(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof LongArrayList) {
                j();
                throw null;
            }
            j();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void y(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof LongArrayList) {
                t();
                throw null;
            }
            t();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void z(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof IntArrayList) {
                e();
                throw null;
            }
            e();
            throw null;
        }
    }
}
