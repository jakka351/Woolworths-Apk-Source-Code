package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.WireFormat;
import java.util.List;

/* loaded from: classes.dex */
final class CodedInputStreamReader implements Reader {

    /* renamed from: a, reason: collision with root package name */
    public final CodedInputStream f15085a;
    public int b;
    public int c;
    public int d = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15086a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f15086a = iArr;
            try {
                iArr[WireFormat.FieldType.m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15086a[WireFormat.FieldType.q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15086a[WireFormat.FieldType.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15086a[WireFormat.FieldType.s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15086a[WireFormat.FieldType.l.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15086a[WireFormat.FieldType.k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15086a[WireFormat.FieldType.g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15086a[WireFormat.FieldType.j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15086a[WireFormat.FieldType.h.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15086a[WireFormat.FieldType.p.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15086a[WireFormat.FieldType.t.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15086a[WireFormat.FieldType.u.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f15086a[WireFormat.FieldType.v.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f15086a[WireFormat.FieldType.w.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f15086a[WireFormat.FieldType.n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f15086a[WireFormat.FieldType.r.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f15086a[WireFormat.FieldType.i.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public CodedInputStreamReader(CodedInputStream codedInputStream) {
        Internal.a(codedInputStream, "input");
        this.f15085a = codedInputStream;
        codedInputStream.b = this;
    }

    public static void V(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public static void W(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void A(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final int B() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(0);
        return this.f15085a.t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void C(List list) throws InvalidProtocolBufferException {
        int iD;
        int iD2;
        boolean z = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f15085a;
        if (!z) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(codedInputStream.q()));
                    if (codedInputStream.f()) {
                        return;
                    } else {
                        iD = codedInputStream.D();
                    }
                } while (iD == this.b);
                this.d = iD;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iE = codedInputStream.E();
            W(iE);
            int iE2 = codedInputStream.e() + iE;
            do {
                list.add(Long.valueOf(codedInputStream.q()));
            } while (codedInputStream.e() < iE2);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                longArrayList.d(codedInputStream.q());
                if (codedInputStream.f()) {
                    return;
                } else {
                    iD2 = codedInputStream.D();
                }
            } while (iD2 == this.b);
            this.d = iD2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iE3 = codedInputStream.E();
        W(iE3);
        int iE4 = codedInputStream.e() + iE3;
        do {
            longArrayList.d(codedInputStream.q());
        } while (codedInputStream.e() < iE4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void D(List list) throws InvalidProtocolBufferException {
        int iD;
        int iD2;
        boolean z = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f15085a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.E()));
                    if (codedInputStream.f()) {
                        return;
                    } else {
                        iD = codedInputStream.D();
                    }
                } while (iD == this.b);
                this.d = iD;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iE = codedInputStream.e() + codedInputStream.E();
            do {
                list.add(Integer.valueOf(codedInputStream.E()));
            } while (codedInputStream.e() < iE);
            T(iE);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                intArrayList.W1(codedInputStream.E());
                if (codedInputStream.f()) {
                    return;
                } else {
                    iD2 = codedInputStream.D();
                }
            } while (iD2 == this.b);
            this.d = iD2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iE2 = codedInputStream.e() + codedInputStream.E();
        do {
            intArrayList.W1(codedInputStream.E());
        } while (codedInputStream.e() < iE2);
        T(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final int E() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(5);
        return this.f15085a.p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final long F() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(0);
        return this.f15085a.A();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final String G() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(2);
        return this.f15085a.B();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final int H() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(5);
        return this.f15085a.x();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final String I() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(2);
        return this.f15085a.C();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final Object J(Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(3);
        return Q(schema, extensionRegistryLite);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final Object K(Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(3);
        return Q(Protobuf.c.a(cls), extensionRegistryLite);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void L(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iD;
        int i = this.b;
        if ((i & 7) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(R(schema, extensionRegistryLite));
            CodedInputStream codedInputStream = this.f15085a;
            if (codedInputStream.f() || this.d != 0) {
                return;
            } else {
                iD = codedInputStream.D();
            }
        } while (iD == i);
        this.d = iD;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final Object M(Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(2);
        return R(schema, extensionRegistryLite);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        r7.put(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        return;
     */
    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N(java.util.Map r7, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata r8) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException {
        /*
            r6 = this;
            r0 = 2
            r6.U(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r6.f15085a
            int r2 = r1.E()
            int r2 = r1.k(r2)
            r8.getClass()
        L11:
            int r8 = r6.n()     // Catch: java.lang.Throwable -> L36
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
            if (r8 == r3) goto L47
            boolean r3 = r1.f()     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L22
            goto L47
        L22:
            r3 = 1
            java.lang.String r5 = "Unable to parse map entry."
            if (r8 == r3) goto L39
            if (r8 == r0) goto L38
            boolean r8 = r6.q()     // Catch: java.lang.Throwable -> L36 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L3a
            if (r8 == 0) goto L30
            goto L11
        L30:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r8 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L36 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L3a
            r8.<init>(r5)     // Catch: java.lang.Throwable -> L36 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L3a
            throw r8     // Catch: java.lang.Throwable -> L36 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L3a
        L36:
            r7 = move-exception
            goto L4e
        L38:
            throw r4     // Catch: java.lang.Throwable -> L36
        L39:
            throw r4     // Catch: java.lang.Throwable -> L36 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L3a
        L3a:
            boolean r8 = r6.q()     // Catch: java.lang.Throwable -> L36
            if (r8 == 0) goto L41
            goto L11
        L41:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r7 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L36
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L36
            throw r7     // Catch: java.lang.Throwable -> L36
        L47:
            r7.put(r4, r4)     // Catch: java.lang.Throwable -> L36
            r1.j(r2)
            return
        L4e:
            r1.j(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.N(java.util.Map, com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata):void");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final Object O(Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(2);
        return R(Protobuf.c.a(cls), extensionRegistryLite);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void P(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iD;
        int i = this.b;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Q(schema, extensionRegistryLite));
            CodedInputStream codedInputStream = this.f15085a;
            if (codedInputStream.f() || this.d != 0) {
                return;
            } else {
                iD = codedInputStream.D();
            }
        } while (iD == i);
        this.d = iD;
    }

    public final Object Q(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            Object objNewInstance = schema.newInstance();
            schema.g(objNewInstance, this, extensionRegistryLite);
            schema.c(objNewInstance);
            if (this.b == this.c) {
                return objNewInstance;
            }
            throw InvalidProtocolBufferException.g();
        } finally {
            this.c = i;
        }
    }

    public final Object R(Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStream = this.f15085a;
        int iE = codedInputStream.E();
        if (codedInputStream.f15084a >= 100) {
            throw InvalidProtocolBufferException.h();
        }
        int iK = codedInputStream.k(iE);
        Object objNewInstance = schema.newInstance();
        codedInputStream.f15084a++;
        schema.g(objNewInstance, this, extensionRegistryLite);
        schema.c(objNewInstance);
        codedInputStream.a(0);
        codedInputStream.f15084a--;
        codedInputStream.j(iK);
        return objNewInstance;
    }

    public final void S(List list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iD;
        int iD2;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        boolean z2 = list instanceof LazyStringList;
        CodedInputStream codedInputStream = this.f15085a;
        if (!z2 || z) {
            do {
                list.add(z ? I() : G());
                if (codedInputStream.f()) {
                    return;
                } else {
                    iD = codedInputStream.D();
                }
            } while (iD == this.b);
            this.d = iD;
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        do {
            lazyStringList.P0(h());
            if (codedInputStream.f()) {
                return;
            } else {
                iD2 = codedInputStream.D();
            }
        } while (iD2 == this.b);
        this.d = iD2;
    }

    public final void T(int i) throws InvalidProtocolBufferException {
        if (this.f15085a.e() != i) {
            throw InvalidProtocolBufferException.i();
        }
    }

    public final void U(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.b & 7) != i) {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void a(List list) throws InvalidProtocolBufferException {
        int iD;
        int iD2;
        boolean z = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f15085a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.A()));
                    if (codedInputStream.f()) {
                        return;
                    } else {
                        iD = codedInputStream.D();
                    }
                } while (iD == this.b);
                this.d = iD;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iE = codedInputStream.e() + codedInputStream.E();
            do {
                list.add(Long.valueOf(codedInputStream.A()));
            } while (codedInputStream.e() < iE);
            T(iE);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                longArrayList.d(codedInputStream.A());
                if (codedInputStream.f()) {
                    return;
                } else {
                    iD2 = codedInputStream.D();
                }
            } while (iD2 == this.b);
            this.d = iD2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iE2 = codedInputStream.e() + codedInputStream.E();
        do {
            longArrayList.d(codedInputStream.A());
        } while (codedInputStream.e() < iE2);
        T(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final int b() {
        return this.b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final long c() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(1);
        return this.f15085a.y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final int d() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(0);
        return this.f15085a.E();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final int e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(0);
        return this.f15085a.o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final int f() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(0);
        return this.f15085a.z();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void g(List list) throws InvalidProtocolBufferException {
        int iD;
        int iD2;
        boolean z = list instanceof BooleanArrayList;
        CodedInputStream codedInputStream = this.f15085a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(codedInputStream.l()));
                    if (codedInputStream.f()) {
                        return;
                    } else {
                        iD = codedInputStream.D();
                    }
                } while (iD == this.b);
                this.d = iD;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iE = codedInputStream.e() + codedInputStream.E();
            do {
                list.add(Boolean.valueOf(codedInputStream.l()));
            } while (codedInputStream.e() < iE);
            T(iE);
            return;
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                booleanArrayList.d(codedInputStream.l());
                if (codedInputStream.f()) {
                    return;
                } else {
                    iD2 = codedInputStream.D();
                }
            } while (iD2 == this.b);
            this.d = iD2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iE2 = codedInputStream.e() + codedInputStream.E();
        do {
            booleanArrayList.d(codedInputStream.l());
        } while (codedInputStream.e() < iE2);
        T(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final ByteString h() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(2);
        return this.f15085a.m();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void i(List list) throws InvalidProtocolBufferException {
        int iD;
        int iD2;
        boolean z = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f15085a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.z()));
                    if (codedInputStream.f()) {
                        return;
                    } else {
                        iD = codedInputStream.D();
                    }
                } while (iD == this.b);
                this.d = iD;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iE = codedInputStream.e() + codedInputStream.E();
            do {
                list.add(Integer.valueOf(codedInputStream.z()));
            } while (codedInputStream.e() < iE);
            T(iE);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                intArrayList.W1(codedInputStream.z());
                if (codedInputStream.f()) {
                    return;
                } else {
                    iD2 = codedInputStream.D();
                }
            } while (iD2 == this.b);
            this.d = iD2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iE2 = codedInputStream.e() + codedInputStream.E();
        do {
            intArrayList.W1(codedInputStream.z());
        } while (codedInputStream.e() < iE2);
        T(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final long j() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(0);
        return this.f15085a.F();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void k(List list) throws InvalidProtocolBufferException {
        int iD;
        int iD2;
        boolean z = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f15085a;
        if (!z) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(codedInputStream.y()));
                    if (codedInputStream.f()) {
                        return;
                    } else {
                        iD = codedInputStream.D();
                    }
                } while (iD == this.b);
                this.d = iD;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iE = codedInputStream.E();
            W(iE);
            int iE2 = codedInputStream.e() + iE;
            do {
                list.add(Long.valueOf(codedInputStream.y()));
            } while (codedInputStream.e() < iE2);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                longArrayList.d(codedInputStream.y());
                if (codedInputStream.f()) {
                    return;
                } else {
                    iD2 = codedInputStream.D();
                }
            } while (iD2 == this.b);
            this.d = iD2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iE3 = codedInputStream.E();
        W(iE3);
        int iE4 = codedInputStream.e() + iE3;
        do {
            longArrayList.d(codedInputStream.y());
        } while (codedInputStream.e() < iE4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void l(List list) throws InvalidProtocolBufferException {
        int iD;
        int iD2;
        boolean z = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f15085a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.t()));
                    if (codedInputStream.f()) {
                        return;
                    } else {
                        iD = codedInputStream.D();
                    }
                } while (iD == this.b);
                this.d = iD;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iE = codedInputStream.e() + codedInputStream.E();
            do {
                list.add(Integer.valueOf(codedInputStream.t()));
            } while (codedInputStream.e() < iE);
            T(iE);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                intArrayList.W1(codedInputStream.t());
                if (codedInputStream.f()) {
                    return;
                } else {
                    iD2 = codedInputStream.D();
                }
            } while (iD2 == this.b);
            this.d = iD2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iE2 = codedInputStream.e() + codedInputStream.E();
        do {
            intArrayList.W1(codedInputStream.t());
        } while (codedInputStream.e() < iE2);
        T(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void m(List list) throws InvalidProtocolBufferException {
        int iD;
        int iD2;
        boolean z = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f15085a;
        if (!z) {
            int i = this.b & 7;
            if (i == 2) {
                int iE = codedInputStream.E();
                V(iE);
                int iE2 = codedInputStream.e() + iE;
                do {
                    list.add(Integer.valueOf(codedInputStream.p()));
                } while (codedInputStream.e() < iE2);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.p()));
                if (codedInputStream.f()) {
                    return;
                } else {
                    iD = codedInputStream.D();
                }
            } while (iD == this.b);
            this.d = iD;
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int iE3 = codedInputStream.E();
            V(iE3);
            int iE4 = codedInputStream.e() + iE3;
            do {
                intArrayList.W1(codedInputStream.p());
            } while (codedInputStream.e() < iE4);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            intArrayList.W1(codedInputStream.p());
            if (codedInputStream.f()) {
                return;
            } else {
                iD2 = codedInputStream.D();
            }
        } while (iD2 == this.b);
        this.d = iD2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final int n() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.f15085a.D();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void o(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void p(List list) throws InvalidProtocolBufferException {
        int iD;
        int iD2;
        boolean z = list instanceof FloatArrayList;
        CodedInputStream codedInputStream = this.f15085a;
        if (!z) {
            int i = this.b & 7;
            if (i == 2) {
                int iE = codedInputStream.E();
                V(iE);
                int iE2 = codedInputStream.e() + iE;
                do {
                    list.add(Float.valueOf(codedInputStream.r()));
                } while (codedInputStream.e() < iE2);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Float.valueOf(codedInputStream.r()));
                if (codedInputStream.f()) {
                    return;
                } else {
                    iD = codedInputStream.D();
                }
            } while (iD == this.b);
            this.d = iD;
            return;
        }
        FloatArrayList floatArrayList = (FloatArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int iE3 = codedInputStream.E();
            V(iE3);
            int iE4 = codedInputStream.e() + iE3;
            do {
                floatArrayList.d(codedInputStream.r());
            } while (codedInputStream.e() < iE4);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            floatArrayList.d(codedInputStream.r());
            if (codedInputStream.f()) {
                return;
            } else {
                iD2 = codedInputStream.D();
            }
        } while (iD2 == this.b);
        this.d = iD2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final boolean q() {
        int i;
        CodedInputStream codedInputStream = this.f15085a;
        if (codedInputStream.f() || (i = this.b) == this.c) {
            return false;
        }
        return codedInputStream.G(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void r(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iD;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(h());
            CodedInputStream codedInputStream = this.f15085a;
            if (codedInputStream.f()) {
                return;
            } else {
                iD = codedInputStream.D();
            }
        } while (iD == this.b);
        this.d = iD;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(1);
        return this.f15085a.n();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(5);
        return this.f15085a.r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void s(List list) throws InvalidProtocolBufferException {
        int iD;
        int iD2;
        boolean z = list instanceof DoubleArrayList;
        CodedInputStream codedInputStream = this.f15085a;
        if (!z) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(codedInputStream.n()));
                    if (codedInputStream.f()) {
                        return;
                    } else {
                        iD = codedInputStream.D();
                    }
                } while (iD == this.b);
                this.d = iD;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iE = codedInputStream.E();
            W(iE);
            int iE2 = codedInputStream.e() + iE;
            do {
                list.add(Double.valueOf(codedInputStream.n()));
            } while (codedInputStream.e() < iE2);
            return;
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                doubleArrayList.d(codedInputStream.n());
                if (codedInputStream.f()) {
                    return;
                } else {
                    iD2 = codedInputStream.D();
                }
            } while (iD2 == this.b);
            this.d = iD2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iE3 = codedInputStream.E();
        W(iE3);
        int iE4 = codedInputStream.e() + iE3;
        do {
            doubleArrayList.d(codedInputStream.n());
        } while (codedInputStream.e() < iE4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final long t() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(0);
        return this.f15085a.u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final long u() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(1);
        return this.f15085a.q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void v(List list) throws InvalidProtocolBufferException {
        int iD;
        int iD2;
        boolean z = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f15085a;
        if (!z) {
            int i = this.b & 7;
            if (i == 2) {
                int iE = codedInputStream.E();
                V(iE);
                int iE2 = codedInputStream.e() + iE;
                do {
                    list.add(Integer.valueOf(codedInputStream.x()));
                } while (codedInputStream.e() < iE2);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.x()));
                if (codedInputStream.f()) {
                    return;
                } else {
                    iD = codedInputStream.D();
                }
            } while (iD == this.b);
            this.d = iD;
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int iE3 = codedInputStream.E();
            V(iE3);
            int iE4 = codedInputStream.e() + iE3;
            do {
                intArrayList.W1(codedInputStream.x());
            } while (codedInputStream.e() < iE4);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            intArrayList.W1(codedInputStream.x());
            if (codedInputStream.f()) {
                return;
            } else {
                iD2 = codedInputStream.D();
            }
        } while (iD2 == this.b);
        this.d = iD2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final boolean w() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(0);
        return this.f15085a.l();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void x(List list) throws InvalidProtocolBufferException {
        int iD;
        int iD2;
        boolean z = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f15085a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.F()));
                    if (codedInputStream.f()) {
                        return;
                    } else {
                        iD = codedInputStream.D();
                    }
                } while (iD == this.b);
                this.d = iD;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iE = codedInputStream.e() + codedInputStream.E();
            do {
                list.add(Long.valueOf(codedInputStream.F()));
            } while (codedInputStream.e() < iE);
            T(iE);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                longArrayList.d(codedInputStream.F());
                if (codedInputStream.f()) {
                    return;
                } else {
                    iD2 = codedInputStream.D();
                }
            } while (iD2 == this.b);
            this.d = iD2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iE2 = codedInputStream.e() + codedInputStream.E();
        do {
            longArrayList.d(codedInputStream.F());
        } while (codedInputStream.e() < iE2);
        T(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void y(List list) throws InvalidProtocolBufferException {
        int iD;
        int iD2;
        boolean z = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f15085a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.u()));
                    if (codedInputStream.f()) {
                        return;
                    } else {
                        iD = codedInputStream.D();
                    }
                } while (iD == this.b);
                this.d = iD;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iE = codedInputStream.e() + codedInputStream.E();
            do {
                list.add(Long.valueOf(codedInputStream.u()));
            } while (codedInputStream.e() < iE);
            T(iE);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                longArrayList.d(codedInputStream.u());
                if (codedInputStream.f()) {
                    return;
                } else {
                    iD2 = codedInputStream.D();
                }
            } while (iD2 == this.b);
            this.d = iD2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iE2 = codedInputStream.e() + codedInputStream.E();
        do {
            longArrayList.d(codedInputStream.u());
        } while (codedInputStream.e() < iE2);
        T(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void z(List list) throws InvalidProtocolBufferException {
        int iD;
        int iD2;
        boolean z = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f15085a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.o()));
                    if (codedInputStream.f()) {
                        return;
                    } else {
                        iD = codedInputStream.D();
                    }
                } while (iD == this.b);
                this.d = iD;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iE = codedInputStream.e() + codedInputStream.E();
            do {
                list.add(Integer.valueOf(codedInputStream.o()));
            } while (codedInputStream.e() < iE);
            T(iE);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                intArrayList.W1(codedInputStream.o());
                if (codedInputStream.f()) {
                    return;
                } else {
                    iD2 = codedInputStream.D();
                }
            } while (iD2 == this.b);
            this.d = iD2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iE2 = codedInputStream.e() + codedInputStream.E();
        do {
            intArrayList.W1(codedInputStream.o());
        } while (codedInputStream.e() < iE2);
        T(iE2);
    }
}
