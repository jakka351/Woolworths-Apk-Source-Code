package androidx.datastore.preferences.protobuf;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

@CheckReturnValue
/* loaded from: classes.dex */
final class MessageSchema<T> implements Schema<T> {
    public static final int[] p = new int[0];
    public static final Unsafe q = UnsafeUtil.k();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f2661a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final MessageLite e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final NewInstanceSchema k;
    public final ListFieldSchema l;
    public final UnknownFieldSchema m;
    public final ExtensionSchema n;
    public final MapFieldSchema o;

    /* renamed from: androidx.datastore.preferences.protobuf.MessageSchema$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2662a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f2662a = iArr;
            try {
                iArr[WireFormat.FieldType.m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2662a[WireFormat.FieldType.q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2662a[WireFormat.FieldType.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2662a[WireFormat.FieldType.l.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2662a[WireFormat.FieldType.t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2662a[WireFormat.FieldType.k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2662a[WireFormat.FieldType.u.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2662a[WireFormat.FieldType.g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2662a[WireFormat.FieldType.s.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2662a[WireFormat.FieldType.j.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2662a[WireFormat.FieldType.r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2662a[WireFormat.FieldType.h.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2662a[WireFormat.FieldType.i.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2662a[WireFormat.FieldType.p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2662a[WireFormat.FieldType.v.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2662a[WireFormat.FieldType.w.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2662a[WireFormat.FieldType.n.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public MessageSchema(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, int[] iArr2, int i3, int i4, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        this.f2661a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = messageLite instanceof GeneratedMessageLite;
        this.f = extensionSchema != null && extensionSchema.e(messageLite);
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = newInstanceSchema;
        this.l = listFieldSchema;
        this.m = unknownFieldSchema;
        this.n = extensionSchema;
        this.e = messageLite;
        this.o = mapFieldSchema;
    }

    public static long A(long j, Object obj) {
        return ((Long) UnsafeUtil.c.m(j, obj)).longValue();
    }

    public static java.lang.reflect.Field C(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbU = a.u("Field ", str, " for ");
            androidx.constraintlayout.core.state.a.x(cls, sbU, " not found. Known fields are ");
            sbU.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbU.toString());
        }
    }

    public static int H(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void K(int i, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.d(i, (String) obj);
        } else {
            writer.K(i, (ByteString) obj);
        }
    }

    public static void j(Object obj) {
        if (!q(obj)) {
            throw new IllegalArgumentException(b.m(obj, "Mutating immutable message: "));
        }
    }

    public static boolean q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).n();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x039d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.datastore.preferences.protobuf.MessageSchema x(androidx.datastore.preferences.protobuf.RawMessageInfo r36, androidx.datastore.preferences.protobuf.NewInstanceSchema r37, androidx.datastore.preferences.protobuf.ListFieldSchema r38, androidx.datastore.preferences.protobuf.UnknownFieldSchema r39, androidx.datastore.preferences.protobuf.ExtensionSchema r40, androidx.datastore.preferences.protobuf.MapFieldSchema r41) {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.x(androidx.datastore.preferences.protobuf.RawMessageInfo, androidx.datastore.preferences.protobuf.NewInstanceSchema, androidx.datastore.preferences.protobuf.ListFieldSchema, androidx.datastore.preferences.protobuf.UnknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema, androidx.datastore.preferences.protobuf.MapFieldSchema):androidx.datastore.preferences.protobuf.MessageSchema");
    }

    public static long y(int i) {
        return i & 1048575;
    }

    public static int z(long j, Object obj) {
        return ((Integer) UnsafeUtil.c.m(j, obj)).intValue();
    }

    public final void B(int i, Reader reader, Object obj) {
        if ((536870912 & i) != 0) {
            UnsafeUtil.r(obj, i & 1048575, reader.I());
        } else if (this.g) {
            UnsafeUtil.r(obj, i & 1048575, reader.G());
        } else {
            UnsafeUtil.r(obj, i & 1048575, reader.h());
        }
    }

    public final void D(int i, Object obj) {
        int i2 = this.f2661a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        UnsafeUtil.p(obj, (1 << (i2 >>> 20)) | UnsafeUtil.c.j(j, obj), j);
    }

    public final void E(int i, int i2, Object obj) {
        UnsafeUtil.p(obj, i, this.f2661a[i2 + 2] & 1048575);
    }

    public final void F(int i, Object obj, Object obj2) {
        q.putObject(obj, I(i) & 1048575, obj2);
        D(i, obj);
    }

    public final void G(Object obj, int i, int i2, Object obj2) {
        q.putObject(obj, I(i2) & 1048575, obj2);
        E(i, i2, obj);
    }

    public final int I(int i) {
        return this.f2661a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(java.lang.Object r21, androidx.datastore.preferences.protobuf.Writer r22) {
        /*
            Method dump skipped, instructions count: 1530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.J(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // androidx.datastore.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.a(java.lang.Object, java.lang.Object):void");
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean b(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        loop0: while (true) {
            if (i6 < this.i) {
                int i7 = this.h[i6];
                int[] iArr = this.f2661a;
                int i8 = iArr[i7];
                int I = I(i7);
                int i9 = iArr[i7 + 2];
                int i10 = i9 & 1048575;
                int i11 = 1 << (i9 >>> 20);
                if (i10 != i4) {
                    if (i10 != 1048575) {
                        i5 = q.getInt(obj, i10);
                    }
                    i2 = i7;
                    i3 = i5;
                    i = i10;
                } else {
                    int i12 = i5;
                    i = i4;
                    i2 = i7;
                    i3 = i12;
                }
                if ((268435456 & I) != 0 && !p(obj, i2, i, i3, i11)) {
                    break;
                }
                int iH = H(I);
                if (iH == 9 || iH == 17) {
                    if (p(obj, i2, i, i3, i11)) {
                        if (!n(i2).b(UnsafeUtil.c.m(I & 1048575, obj))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (iH != 27) {
                        if (iH == 60 || iH == 68) {
                            if (r(i8, i2, obj)) {
                                if (!n(i2).b(UnsafeUtil.c.m(I & 1048575, obj))) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        } else if (iH != 49) {
                            if (iH != 50) {
                                continue;
                            } else {
                                Object objM = UnsafeUtil.c.m(I & 1048575, obj);
                                MapFieldSchema mapFieldSchema = this.o;
                                MapFieldLite mapFieldLiteF = mapFieldSchema.f(objM);
                                if (!mapFieldLiteF.isEmpty() && mapFieldSchema.b(m(i2)).b.d == WireFormat.JavaType.MESSAGE) {
                                    Schema schemaA = null;
                                    for (Object obj2 : mapFieldLiteF.values()) {
                                        if (schemaA == null) {
                                            schemaA = Protobuf.c.a(obj2.getClass());
                                        }
                                        if (!schemaA.b(obj2)) {
                                            break loop0;
                                        }
                                    }
                                }
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        }
                    }
                    List list = (List) UnsafeUtil.c.m(I & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        Schema schemaN = n(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (!schemaN.b(list.get(i13))) {
                                break loop0;
                            }
                        }
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                }
            } else if (!this.f || this.n.c(obj).g()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    @Override // androidx.datastore.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = q(r9)
            if (r0 != 0) goto L8
            goto L8f
        L8:
            boolean r0 = r9 instanceof androidx.datastore.preferences.protobuf.GeneratedMessageLite
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r9
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r0 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.f(r2)
            r0.memoizedHashCode = r1
            r0.o()
        L1b:
            int[] r0 = r8.f2661a
            int r2 = r0.length
        L1e:
            if (r1 >= r2) goto L81
            int r3 = r8.I(r1)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r4 = (long) r4
            int r3 = H(r3)
            r6 = 9
            if (r3 == r6) goto L6b
            r6 = 60
            if (r3 == r6) goto L55
            r6 = 68
            if (r3 == r6) goto L55
            switch(r3) {
                case 17: goto L6b;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L7e
        L3d:
            sun.misc.Unsafe r3 = androidx.datastore.preferences.protobuf.MessageSchema.q
            java.lang.Object r6 = r3.getObject(r9, r4)
            if (r6 == 0) goto L7e
            androidx.datastore.preferences.protobuf.MapFieldSchema r7 = r8.o
            java.lang.Object r6 = r7.c(r6)
            r3.putObject(r9, r4, r6)
            goto L7e
        L4f:
            androidx.datastore.preferences.protobuf.ListFieldSchema r3 = r8.l
            r3.c(r4, r9)
            goto L7e
        L55:
            r3 = r0[r1]
            boolean r3 = r8.r(r3, r1, r9)
            if (r3 == 0) goto L7e
            androidx.datastore.preferences.protobuf.Schema r3 = r8.n(r1)
            sun.misc.Unsafe r6 = androidx.datastore.preferences.protobuf.MessageSchema.q
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.c(r4)
            goto L7e
        L6b:
            boolean r3 = r8.o(r1, r9)
            if (r3 == 0) goto L7e
            androidx.datastore.preferences.protobuf.Schema r3 = r8.n(r1)
            sun.misc.Unsafe r6 = androidx.datastore.preferences.protobuf.MessageSchema.q
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.c(r4)
        L7e:
            int r1 = r1 + 3
            goto L1e
        L81:
            androidx.datastore.preferences.protobuf.UnknownFieldSchema r0 = r8.m
            r0.j(r9)
            boolean r0 = r8.f
            if (r0 == 0) goto L8f
            androidx.datastore.preferences.protobuf.ExtensionSchema r0 = r8.n
            r0.f(r9)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.c(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0359  */
    @Override // androidx.datastore.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(androidx.datastore.preferences.protobuf.AbstractMessageLite r18) {
        /*
            Method dump skipped, instructions count: 1946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.d(androidx.datastore.preferences.protobuf.AbstractMessageLite):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    @Override // androidx.datastore.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.Object r13, androidx.datastore.preferences.protobuf.Writer r14) {
        /*
            Method dump skipped, instructions count: 1660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.e(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(androidx.datastore.preferences.protobuf.GeneratedMessageLite r12, androidx.datastore.preferences.protobuf.GeneratedMessageLite r13) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.f(androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.GeneratedMessageLite):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:347|97|(6:102|103|256|291|374|373)|104|331|105|106|107|255|256|291|374|373) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e1, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e8, code lost:
    
        r12 = r1;
        r14 = r4;
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00dc, code lost:
    
        r11.n(r5, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:278:0x07c9 A[Catch: all -> 0x07d0, TryCatch #36 {all -> 0x07d0, blocks: (B:276:0x07c4, B:278:0x07c9, B:282:0x07d3), top: B:327:0x07c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x080d A[LOOP:4: B:300:0x080b->B:301:0x080d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x081c  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x07d9 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.lang.Object r19, androidx.datastore.preferences.protobuf.Reader r20, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.g(java.lang.Object, androidx.datastore.preferences.protobuf.Reader, androidx.datastore.preferences.protobuf.ExtensionRegistryLite):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4 A[PHI: r3
  0x00e4: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:84:0x0219, B:42:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(androidx.datastore.preferences.protobuf.GeneratedMessageLite r12) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.h(androidx.datastore.preferences.protobuf.GeneratedMessageLite):int");
    }

    public final boolean i(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i) {
        return o(i, generatedMessageLite) == o(i, generatedMessageLite2);
    }

    public final Object k(Object obj, int i, Object obj2, UnknownFieldSchema unknownFieldSchema, Object obj3) {
        Internal.EnumVerifier enumVerifierL;
        int i2 = this.f2661a[i];
        Object objM = UnsafeUtil.c.m(I(i) & 1048575, obj);
        if (objM == null || (enumVerifierL = l(i)) == null) {
            return obj2;
        }
        MapFieldSchema mapFieldSchema = this.o;
        MapFieldLite mapFieldLiteE = mapFieldSchema.e(objM);
        MapEntryLite.Metadata metadataB = mapFieldSchema.b(m(i));
        Iterator it = mapFieldLiteE.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!enumVerifierL.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = unknownFieldSchema.f(obj3);
                }
                ByteString.CodedBuilder codedBuilder = new ByteString.CodedBuilder(MapEntryLite.a(metadataB, entry.getKey(), entry.getValue()));
                try {
                    MapEntryLite.b(codedBuilder.b(), metadataB, entry.getKey(), entry.getValue());
                    unknownFieldSchema.d(obj2, i2, codedBuilder.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    public final Internal.EnumVerifier l(int i) {
        return (Internal.EnumVerifier) this.b[androidx.constraintlayout.core.state.a.D(i, 3, 2, 1)];
    }

    public final Object m(int i) {
        return this.b[(i / 3) * 2];
    }

    public final Schema n(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        Schema schema = (Schema) objArr[i2];
        if (schema != null) {
            return schema;
        }
        Schema schemaA = Protobuf.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = schemaA;
        return schemaA;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final Object newInstance() {
        return this.k.newInstance(this.e);
    }

    public final boolean o(int i, Object obj) {
        int i2 = this.f2661a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int I = I(i);
            long j2 = I & 1048575;
            switch (H(I)) {
                case 0:
                    if (Double.doubleToRawLongBits(UnsafeUtil.c.h(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(UnsafeUtil.c.i(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (UnsafeUtil.c.l(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (UnsafeUtil.c.l(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (UnsafeUtil.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (UnsafeUtil.c.l(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (UnsafeUtil.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return UnsafeUtil.c.e(j2, obj);
                case 8:
                    Object objM = UnsafeUtil.c.m(j2, obj);
                    if (objM instanceof String) {
                        return !((String) objM).isEmpty();
                    }
                    if (objM instanceof ByteString) {
                        return !ByteString.e.equals(objM);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (UnsafeUtil.c.m(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !ByteString.e.equals(UnsafeUtil.c.m(j2, obj));
                case 11:
                    if (UnsafeUtil.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (UnsafeUtil.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (UnsafeUtil.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (UnsafeUtil.c.l(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (UnsafeUtil.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (UnsafeUtil.c.l(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (UnsafeUtil.c.m(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & UnsafeUtil.c.j(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean p(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? o(i, obj) : (i3 & i4) != 0;
    }

    public final boolean r(int i, int i2, Object obj) {
        return UnsafeUtil.c.j((long) (this.f2661a[i2 + 2] & 1048575), obj) == i;
    }

    public final void s(Object obj, int i, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) {
        long jI = I(i) & 1048575;
        Object objM = UnsafeUtil.c.m(jI, obj);
        MapFieldSchema mapFieldSchema = this.o;
        if (objM == null) {
            objM = mapFieldSchema.g();
            UnsafeUtil.r(obj, jI, objM);
        } else if (mapFieldSchema.h(objM)) {
            MapFieldLite mapFieldLiteG = mapFieldSchema.g();
            mapFieldSchema.a(mapFieldLiteG, objM);
            UnsafeUtil.r(obj, jI, mapFieldLiteG);
            objM = mapFieldLiteG;
        }
        reader.N(mapFieldSchema.e(objM), mapFieldSchema.b(obj2), extensionRegistryLite);
    }

    public final void t(int i, Object obj, Object obj2) {
        if (o(i, obj2)) {
            long jI = I(i) & 1048575;
            Unsafe unsafe = q;
            Object object = unsafe.getObject(obj2, jI);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f2661a[i] + " is present but null: " + obj2);
            }
            Schema schemaN = n(i);
            if (!o(i, obj)) {
                if (q(object)) {
                    Object objNewInstance = schemaN.newInstance();
                    schemaN.a(objNewInstance, object);
                    unsafe.putObject(obj, jI, objNewInstance);
                } else {
                    unsafe.putObject(obj, jI, object);
                }
                D(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jI);
            if (!q(object2)) {
                Object objNewInstance2 = schemaN.newInstance();
                schemaN.a(objNewInstance2, object2);
                unsafe.putObject(obj, jI, objNewInstance2);
                object2 = objNewInstance2;
            }
            schemaN.a(object2, object);
        }
    }

    public final void u(int i, Object obj, Object obj2) {
        int[] iArr = this.f2661a;
        int i2 = iArr[i];
        if (r(i2, i, obj2)) {
            long jI = I(i) & 1048575;
            Unsafe unsafe = q;
            Object object = unsafe.getObject(obj2, jI);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            Schema schemaN = n(i);
            if (!r(i2, i, obj)) {
                if (q(object)) {
                    Object objNewInstance = schemaN.newInstance();
                    schemaN.a(objNewInstance, object);
                    unsafe.putObject(obj, jI, objNewInstance);
                } else {
                    unsafe.putObject(obj, jI, object);
                }
                E(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jI);
            if (!q(object2)) {
                Object objNewInstance2 = schemaN.newInstance();
                schemaN.a(objNewInstance2, object2);
                unsafe.putObject(obj, jI, objNewInstance2);
                object2 = objNewInstance2;
            }
            schemaN.a(object2, object);
        }
    }

    public final Object v(int i, Object obj) {
        Schema schemaN = n(i);
        long jI = I(i) & 1048575;
        if (!o(i, obj)) {
            return schemaN.newInstance();
        }
        Object object = q.getObject(obj, jI);
        if (q(object)) {
            return object;
        }
        Object objNewInstance = schemaN.newInstance();
        if (object != null) {
            schemaN.a(objNewInstance, object);
        }
        return objNewInstance;
    }

    public final Object w(int i, int i2, Object obj) {
        Schema schemaN = n(i2);
        if (!r(i, i2, obj)) {
            return schemaN.newInstance();
        }
        Object object = q.getObject(obj, I(i2) & 1048575);
        if (q(object)) {
            return object;
        }
        Object objNewInstance = schemaN.newInstance();
        if (object != null) {
            schemaN.a(objNewInstance, object);
        }
        return objNewInstance;
    }
}
