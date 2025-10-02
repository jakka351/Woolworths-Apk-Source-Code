package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.util.List;

@CheckReturnValue
/* loaded from: classes.dex */
final class CodedInputStreamReader implements Reader {

    /* renamed from: a, reason: collision with root package name */
    public final CodedInputStream f2603a;
    public int b;
    public int c;
    public int d = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.CodedInputStreamReader$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2604a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f2604a = iArr;
            try {
                iArr[WireFormat.FieldType.m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2604a[WireFormat.FieldType.q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2604a[WireFormat.FieldType.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2604a[WireFormat.FieldType.s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2604a[WireFormat.FieldType.l.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2604a[WireFormat.FieldType.k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2604a[WireFormat.FieldType.g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2604a[WireFormat.FieldType.j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2604a[WireFormat.FieldType.h.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2604a[WireFormat.FieldType.p.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2604a[WireFormat.FieldType.t.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2604a[WireFormat.FieldType.u.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2604a[WireFormat.FieldType.v.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2604a[WireFormat.FieldType.w.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2604a[WireFormat.FieldType.n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2604a[WireFormat.FieldType.r.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2604a[WireFormat.FieldType.i.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public CodedInputStreamReader(CodedInputStream codedInputStream) {
        Internal.a(codedInputStream, "input");
        this.f2603a = codedInputStream;
        codedInputStream.b = this;
    }

    public static void W(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public static void X(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void A(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int B() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f2603a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void C(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f2603a;
        if (!z) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(codedInputStream.o()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.b);
                this.d = iY;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iZ = codedInputStream.z();
            X(iZ);
            int iD = codedInputStream.d() + iZ;
            do {
                list.add(Long.valueOf(codedInputStream.o()));
            } while (codedInputStream.d() < iD);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                longArrayList.d(codedInputStream.o());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.b);
            this.d = iY2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iZ2 = codedInputStream.z();
        X(iZ2);
        int iD2 = codedInputStream.d() + iZ2;
        do {
            longArrayList.d(codedInputStream.o());
        } while (codedInputStream.d() < iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void D(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f2603a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.z()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.b);
                this.d = iY;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = codedInputStream.d() + codedInputStream.z();
            do {
                list.add(Integer.valueOf(codedInputStream.z()));
            } while (codedInputStream.d() < iD);
            U(iD);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                intArrayList.W1(codedInputStream.z());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.b);
            this.d = iY2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = codedInputStream.d() + codedInputStream.z();
        do {
            intArrayList.W1(codedInputStream.z());
        } while (codedInputStream.d() < iD2);
        U(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int E() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(5);
        return this.f2603a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long F() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f2603a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final String G() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(2);
        return this.f2603a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int H() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(5);
        return this.f2603a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final String I() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(2);
        return this.f2603a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final Object J(Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        V(2);
        Schema schemaA = Protobuf.c.a(cls);
        Object objNewInstance = schemaA.newInstance();
        R(objNewInstance, schemaA, extensionRegistryLite);
        schemaA.c(objNewInstance);
        return objNewInstance;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void K(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        V(2);
        R(obj, schema, extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void L(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        int iY;
        int i = this.b;
        if ((i & 7) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            Object objNewInstance = schema.newInstance();
            R(objNewInstance, schema, extensionRegistryLite);
            schema.c(objNewInstance);
            list.add(objNewInstance);
            CodedInputStream codedInputStream = this.f2603a;
            if (codedInputStream.e() || this.d != 0) {
                return;
            } else {
                iY = codedInputStream.y();
            }
        } while (iY == i);
        this.d = iY;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final Object M(Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(3);
        Schema schemaA = Protobuf.c.a(cls);
        Object objNewInstance = schemaA.newInstance();
        Q(objNewInstance, schemaA, extensionRegistryLite);
        schemaA.c(objNewInstance);
        return objNewInstance;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r10.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r1.h(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N(java.util.Map r10, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata r11, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r12) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException {
        /*
            r9 = this;
            r0 = 2
            r9.V(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r9.f2603a
            int r2 = r1.z()
            int r2 = r1.i(r2)
            r11.getClass()
            java.lang.Object r3 = r11.c
            java.lang.String r4 = ""
            r5 = r3
        L16:
            int r6 = r9.n()     // Catch: java.lang.Throwable -> L3a
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L5c
            boolean r7 = r1.e()     // Catch: java.lang.Throwable -> L3a
            if (r7 == 0) goto L26
            goto L5c
        L26:
            r7 = 1
            java.lang.String r8 = "Unable to parse map entry."
            if (r6 == r7) goto L47
            if (r6 == r0) goto L3c
            boolean r6 = r9.q()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            if (r6 == 0) goto L34
            goto L16
        L34:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r6 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            throw r6     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
        L3a:
            r10 = move-exception
            goto L63
        L3c:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r6 = r11.b     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            java.lang.Class r7 = r3.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            java.lang.Object r5 = r9.S(r6, r7, r12)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            goto L16
        L47:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r6 = r11.f2658a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            r7 = 0
            java.lang.Object r4 = r9.S(r6, r7, r7)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            goto L16
        L4f:
            boolean r6 = r9.q()     // Catch: java.lang.Throwable -> L3a
            if (r6 == 0) goto L56
            goto L16
        L56:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r10 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L3a
            throw r10     // Catch: java.lang.Throwable -> L3a
        L5c:
            r10.put(r4, r5)     // Catch: java.lang.Throwable -> L3a
            r1.h(r2)
            return
        L63:
            r1.h(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.CodedInputStreamReader.N(java.util.Map, androidx.datastore.preferences.protobuf.MapEntryLite$Metadata, androidx.datastore.preferences.protobuf.ExtensionRegistryLite):void");
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void O(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(3);
        Q(obj, schema, extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void P(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iY;
        int i = this.b;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            Object objNewInstance = schema.newInstance();
            Q(objNewInstance, schema, extensionRegistryLite);
            schema.c(objNewInstance);
            list.add(objNewInstance);
            CodedInputStream codedInputStream = this.f2603a;
            if (codedInputStream.e() || this.d != 0) {
                return;
            } else {
                iY = codedInputStream.y();
            }
        } while (iY == i);
        this.d = iY;
    }

    public final void Q(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            schema.g(obj, this, extensionRegistryLite);
            if (this.b == this.c) {
            } else {
                throw InvalidProtocolBufferException.g();
            }
        } finally {
            this.c = i;
        }
    }

    public final void R(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStream = this.f2603a;
        int iZ = codedInputStream.z();
        if (codedInputStream.f2602a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i = codedInputStream.i(iZ);
        codedInputStream.f2602a++;
        schema.g(obj, this, extensionRegistryLite);
        codedInputStream.a(0);
        codedInputStream.f2602a--;
        codedInputStream.h(i);
    }

    public final Object S(WireFormat.FieldType fieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) {
        switch (fieldType.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(t());
            case 3:
                return Long.valueOf(j());
            case 4:
                return Integer.valueOf(B());
            case 5:
                return Long.valueOf(u());
            case 6:
                return Integer.valueOf(E());
            case 7:
                return Boolean.valueOf(w());
            case 8:
                return I();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                return J(cls, extensionRegistryLite);
            case 11:
                return h();
            case 12:
                return Integer.valueOf(d());
            case 13:
                return Integer.valueOf(e());
            case 14:
                return Integer.valueOf(H());
            case 15:
                return Long.valueOf(c());
            case 16:
                return Integer.valueOf(f());
            case 17:
                return Long.valueOf(F());
        }
    }

    public final void T(List list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iY;
        int iY2;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        boolean z2 = list instanceof LazyStringList;
        CodedInputStream codedInputStream = this.f2603a;
        if (!z2 || z) {
            do {
                list.add(z ? I() : G());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY = codedInputStream.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        do {
            lazyStringList.B0(h());
            if (codedInputStream.e()) {
                return;
            } else {
                iY2 = codedInputStream.y();
            }
        } while (iY2 == this.b);
        this.d = iY2;
    }

    public final void U(int i) throws InvalidProtocolBufferException {
        if (this.f2603a.d() != i) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public final void V(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.b & 7) != i) {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void a(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f2603a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.v()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.b);
                this.d = iY;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = codedInputStream.d() + codedInputStream.z();
            do {
                list.add(Long.valueOf(codedInputStream.v()));
            } while (codedInputStream.d() < iD);
            U(iD);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                longArrayList.d(codedInputStream.v());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.b);
            this.d = iY2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = codedInputStream.d() + codedInputStream.z();
        do {
            longArrayList.d(codedInputStream.v());
        } while (codedInputStream.d() < iD2);
        U(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int b() {
        return this.b;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long c() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(1);
        return this.f2603a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int d() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f2603a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f2603a.m();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int f() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f2603a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void g(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z = list instanceof BooleanArrayList;
        CodedInputStream codedInputStream = this.f2603a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(codedInputStream.j()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.b);
                this.d = iY;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = codedInputStream.d() + codedInputStream.z();
            do {
                list.add(Boolean.valueOf(codedInputStream.j()));
            } while (codedInputStream.d() < iD);
            U(iD);
            return;
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                booleanArrayList.d(codedInputStream.j());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.b);
            this.d = iY2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = codedInputStream.d() + codedInputStream.z();
        do {
            booleanArrayList.d(codedInputStream.j());
        } while (codedInputStream.d() < iD2);
        U(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final ByteString h() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(2);
        return this.f2603a.k();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void i(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f2603a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.u()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.b);
                this.d = iY;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = codedInputStream.d() + codedInputStream.z();
            do {
                list.add(Integer.valueOf(codedInputStream.u()));
            } while (codedInputStream.d() < iD);
            U(iD);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                intArrayList.W1(codedInputStream.u());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.b);
            this.d = iY2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = codedInputStream.d() + codedInputStream.z();
        do {
            intArrayList.W1(codedInputStream.u());
        } while (codedInputStream.d() < iD2);
        U(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long j() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f2603a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void k(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f2603a;
        if (!z) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(codedInputStream.t()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.b);
                this.d = iY;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iZ = codedInputStream.z();
            X(iZ);
            int iD = codedInputStream.d() + iZ;
            do {
                list.add(Long.valueOf(codedInputStream.t()));
            } while (codedInputStream.d() < iD);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                longArrayList.d(codedInputStream.t());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.b);
            this.d = iY2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iZ2 = codedInputStream.z();
        X(iZ2);
        int iD2 = codedInputStream.d() + iZ2;
        do {
            longArrayList.d(codedInputStream.t());
        } while (codedInputStream.d() < iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void l(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f2603a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.q()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.b);
                this.d = iY;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = codedInputStream.d() + codedInputStream.z();
            do {
                list.add(Integer.valueOf(codedInputStream.q()));
            } while (codedInputStream.d() < iD);
            U(iD);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                intArrayList.W1(codedInputStream.q());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.b);
            this.d = iY2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = codedInputStream.d() + codedInputStream.z();
        do {
            intArrayList.W1(codedInputStream.q());
        } while (codedInputStream.d() < iD2);
        U(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void m(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f2603a;
        if (!z) {
            int i = this.b & 7;
            if (i == 2) {
                int iZ = codedInputStream.z();
                W(iZ);
                int iD = codedInputStream.d() + iZ;
                do {
                    list.add(Integer.valueOf(codedInputStream.n()));
                } while (codedInputStream.d() < iD);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.n()));
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY = codedInputStream.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int iZ2 = codedInputStream.z();
            W(iZ2);
            int iD2 = codedInputStream.d() + iZ2;
            do {
                intArrayList.W1(codedInputStream.n());
            } while (codedInputStream.d() < iD2);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            intArrayList.W1(codedInputStream.n());
            if (codedInputStream.e()) {
                return;
            } else {
                iY2 = codedInputStream.y();
            }
        } while (iY2 == this.b);
        this.d = iY2;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int n() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.f2603a.y();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void o(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void p(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z = list instanceof FloatArrayList;
        CodedInputStream codedInputStream = this.f2603a;
        if (!z) {
            int i = this.b & 7;
            if (i == 2) {
                int iZ = codedInputStream.z();
                W(iZ);
                int iD = codedInputStream.d() + iZ;
                do {
                    list.add(Float.valueOf(codedInputStream.p()));
                } while (codedInputStream.d() < iD);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Float.valueOf(codedInputStream.p()));
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY = codedInputStream.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        FloatArrayList floatArrayList = (FloatArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int iZ2 = codedInputStream.z();
            W(iZ2);
            int iD2 = codedInputStream.d() + iZ2;
            do {
                floatArrayList.d(codedInputStream.p());
            } while (codedInputStream.d() < iD2);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            floatArrayList.d(codedInputStream.p());
            if (codedInputStream.e()) {
                return;
            } else {
                iY2 = codedInputStream.y();
            }
        } while (iY2 == this.b);
        this.d = iY2;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final boolean q() {
        int i;
        CodedInputStream codedInputStream = this.f2603a;
        if (codedInputStream.e() || (i = this.b) == this.c) {
            return false;
        }
        return codedInputStream.B(i);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void r(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iY;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(h());
            CodedInputStream codedInputStream = this.f2603a;
            if (codedInputStream.e()) {
                return;
            } else {
                iY = codedInputStream.y();
            }
        } while (iY == this.b);
        this.d = iY;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(1);
        return this.f2603a.l();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(5);
        return this.f2603a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void s(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z = list instanceof DoubleArrayList;
        CodedInputStream codedInputStream = this.f2603a;
        if (!z) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(codedInputStream.l()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.b);
                this.d = iY;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iZ = codedInputStream.z();
            X(iZ);
            int iD = codedInputStream.d() + iZ;
            do {
                list.add(Double.valueOf(codedInputStream.l()));
            } while (codedInputStream.d() < iD);
            return;
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                doubleArrayList.d(codedInputStream.l());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.b);
            this.d = iY2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iZ2 = codedInputStream.z();
        X(iZ2);
        int iD2 = codedInputStream.d() + iZ2;
        do {
            doubleArrayList.d(codedInputStream.l());
        } while (codedInputStream.d() < iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long t() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f2603a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long u() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(1);
        return this.f2603a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void v(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f2603a;
        if (!z) {
            int i = this.b & 7;
            if (i == 2) {
                int iZ = codedInputStream.z();
                W(iZ);
                int iD = codedInputStream.d() + iZ;
                do {
                    list.add(Integer.valueOf(codedInputStream.s()));
                } while (codedInputStream.d() < iD);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.s()));
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY = codedInputStream.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int iZ2 = codedInputStream.z();
            W(iZ2);
            int iD2 = codedInputStream.d() + iZ2;
            do {
                intArrayList.W1(codedInputStream.s());
            } while (codedInputStream.d() < iD2);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            intArrayList.W1(codedInputStream.s());
            if (codedInputStream.e()) {
                return;
            } else {
                iY2 = codedInputStream.y();
            }
        } while (iY2 == this.b);
        this.d = iY2;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final boolean w() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f2603a.j();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void x(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f2603a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.A()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.b);
                this.d = iY;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = codedInputStream.d() + codedInputStream.z();
            do {
                list.add(Long.valueOf(codedInputStream.A()));
            } while (codedInputStream.d() < iD);
            U(iD);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                longArrayList.d(codedInputStream.A());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.b);
            this.d = iY2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = codedInputStream.d() + codedInputStream.z();
        do {
            longArrayList.d(codedInputStream.A());
        } while (codedInputStream.d() < iD2);
        U(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void y(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f2603a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.r()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.b);
                this.d = iY;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = codedInputStream.d() + codedInputStream.z();
            do {
                list.add(Long.valueOf(codedInputStream.r()));
            } while (codedInputStream.d() < iD);
            U(iD);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                longArrayList.d(codedInputStream.r());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.b);
            this.d = iY2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = codedInputStream.d() + codedInputStream.z();
        do {
            longArrayList.d(codedInputStream.r());
        } while (codedInputStream.d() < iD2);
        U(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void z(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f2603a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.m()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.b);
                this.d = iY;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = codedInputStream.d() + codedInputStream.z();
            do {
                list.add(Integer.valueOf(codedInputStream.m()));
            } while (codedInputStream.d() < iD);
            U(iD);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                intArrayList.W1(codedInputStream.m());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.b);
            this.d = iY2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = codedInputStream.d() + codedInputStream.z();
        do {
            intArrayList.W1(codedInputStream.m());
        } while (codedInputStream.d() < iD2);
        U(iD2);
    }
}
