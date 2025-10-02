package androidx.work;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/Data;", "", "Builder", "Companion", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Data {
    public static final Data b = new Builder().a();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3896a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/Data$Builder;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f3897a = new LinkedHashMap();

        public final Data a() throws IOException {
            Data data = new Data(this.f3897a);
            Companion.b(data);
            return data;
        }

        public final void b(String key, Object obj) {
            Intrinsics.h(key, "key");
            if (obj == null) {
                obj = null;
            } else {
                Class<?> cls = obj.getClass();
                ReflectionFactory reflectionFactory = Reflection.f24268a;
                KClass kClassB = reflectionFactory.b(cls);
                if (!(kClassB.equals(reflectionFactory.b(Boolean.TYPE)) ? true : kClassB.equals(reflectionFactory.b(Byte.TYPE)) ? true : kClassB.equals(reflectionFactory.b(Integer.TYPE)) ? true : kClassB.equals(reflectionFactory.b(Long.TYPE)) ? true : kClassB.equals(reflectionFactory.b(Float.TYPE)) ? true : kClassB.equals(reflectionFactory.b(Double.TYPE)) ? true : kClassB.equals(reflectionFactory.b(String.class)) ? true : kClassB.equals(reflectionFactory.b(Boolean[].class)) ? true : kClassB.equals(reflectionFactory.b(Byte[].class)) ? true : kClassB.equals(reflectionFactory.b(Integer[].class)) ? true : kClassB.equals(reflectionFactory.b(Long[].class)) ? true : kClassB.equals(reflectionFactory.b(Float[].class)) ? true : kClassB.equals(reflectionFactory.b(Double[].class)) ? true : kClassB.equals(reflectionFactory.b(String[].class)))) {
                    if (kClassB.equals(reflectionFactory.b(boolean[].class))) {
                        obj = Data_Kt.a((boolean[]) obj);
                    } else if (kClassB.equals(reflectionFactory.b(byte[].class))) {
                        obj = Data_Kt.b((byte[]) obj);
                    } else if (kClassB.equals(reflectionFactory.b(int[].class))) {
                        obj = Data_Kt.e((int[]) obj);
                    } else if (kClassB.equals(reflectionFactory.b(long[].class))) {
                        obj = Data_Kt.f((long[]) obj);
                    } else if (kClassB.equals(reflectionFactory.b(float[].class))) {
                        obj = Data_Kt.d((float[]) obj);
                    } else {
                        if (!kClassB.equals(reflectionFactory.b(double[].class))) {
                            throw new IllegalArgumentException("Key " + key + " has invalid type " + kClassB);
                        }
                        obj = Data_Kt.c((double[]) obj);
                    }
                }
            }
            this.f3897a.put(key, obj);
        }

        public final void c(HashMap values) {
            Intrinsics.h(values, "values");
            for (Map.Entry entry : values.entrySet()) {
                b((String) entry.getKey(), entry.getValue());
            }
        }

        public final void d(String key, String str) {
            Intrinsics.h(key, "key");
            this.f3897a.put(key, str);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011R\u0014\u0010\u001f\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011¨\u0006 "}, d2 = {"Landroidx/work/Data$Companion;", "", "Landroidx/work/Data;", "EMPTY", "Landroidx/work/Data;", "", "MAX_DATA_BYTES", "I", "", "NULL_STRING_V1", "Ljava/lang/String;", "", "STREAM_MAGIC", "S", "STREAM_VERSION", "", "TYPE_BOOLEAN", "B", "TYPE_BOOLEAN_ARRAY", "TYPE_BYTE", "TYPE_BYTE_ARRAY", "TYPE_DOUBLE", "TYPE_DOUBLE_ARRAY", "TYPE_FLOAT", "TYPE_FLOAT_ARRAY", "TYPE_INTEGER", "TYPE_INTEGER_ARRAY", "TYPE_LONG", "TYPE_LONG_ARRAY", "TYPE_NULL", "TYPE_STRING", "TYPE_STRING_ARRAY", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Double[]] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Float[]] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Long[]] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Integer[]] */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Byte[]] */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, java.lang.Boolean[]] */
        /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
        public static final Serializable a(DataInputStream dataInputStream, byte b) throws IOException {
            if (b == 0) {
                return null;
            }
            if (b == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b == 7) {
                return dataInputStream.readUTF();
            }
            int i = 0;
            if (b == 8) {
                int i2 = dataInputStream.readInt();
                ?? r0 = new Boolean[i2];
                while (i < i2) {
                    r0[i] = Boolean.valueOf(dataInputStream.readBoolean());
                    i++;
                }
                return r0;
            }
            if (b == 9) {
                int i3 = dataInputStream.readInt();
                ?? r02 = new Byte[i3];
                while (i < i3) {
                    r02[i] = Byte.valueOf(dataInputStream.readByte());
                    i++;
                }
                return r02;
            }
            if (b == 10) {
                int i4 = dataInputStream.readInt();
                ?? r03 = new Integer[i4];
                while (i < i4) {
                    r03[i] = Integer.valueOf(dataInputStream.readInt());
                    i++;
                }
                return r03;
            }
            if (b == 11) {
                int i5 = dataInputStream.readInt();
                ?? r04 = new Long[i5];
                while (i < i5) {
                    r04[i] = Long.valueOf(dataInputStream.readLong());
                    i++;
                }
                return r04;
            }
            if (b == 12) {
                int i6 = dataInputStream.readInt();
                ?? r05 = new Float[i6];
                while (i < i6) {
                    r05[i] = Float.valueOf(dataInputStream.readFloat());
                    i++;
                }
                return r05;
            }
            if (b == 13) {
                int i7 = dataInputStream.readInt();
                ?? r06 = new Double[i7];
                while (i < i7) {
                    r06[i] = Double.valueOf(dataInputStream.readDouble());
                    i++;
                }
                return r06;
            }
            if (b != 14) {
                throw new IllegalStateException(YU.a.d(b, "Unsupported type "));
            }
            int i8 = dataInputStream.readInt();
            ?? r1 = new String[i8];
            while (i < i8) {
                String utf = dataInputStream.readUTF();
                if (Intrinsics.c(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    utf = null;
                }
                r1[i] = utf;
                i++;
            }
            return r1;
        }

        public static byte[] b(Data data) throws IOException {
            Intrinsics.h(data, "data");
            HashMap map = data.f3896a;
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    dataOutputStream.writeShort(-21521);
                    dataOutputStream.writeShort(1);
                    dataOutputStream.writeInt(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        c(dataOutputStream, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream.flush();
                    if (dataOutputStream.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    dataOutputStream.close();
                    Intrinsics.g(byteArray, "{\n                ByteAr…          }\n            }");
                    return byteArray;
                } finally {
                }
            } catch (IOException e) {
                Logger.e().d(Data_Kt.f3898a, "Error in Data#toByteArray: ", e);
                return new byte[0];
            }
        }

        public static final void c(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
            int i;
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalArgumentException("Unsupported value type " + Reflection.f24268a.b(obj.getClass()).B());
                }
                Object[] objArr = (Object[]) obj;
                Class<?> cls = objArr.getClass();
                ReflectionFactory reflectionFactory = Reflection.f24268a;
                KClass kClassB = reflectionFactory.b(cls);
                if (kClassB.equals(reflectionFactory.b(Boolean[].class))) {
                    i = 8;
                } else if (kClassB.equals(reflectionFactory.b(Byte[].class))) {
                    i = 9;
                } else if (kClassB.equals(reflectionFactory.b(Integer[].class))) {
                    i = 10;
                } else if (kClassB.equals(reflectionFactory.b(Long[].class))) {
                    i = 11;
                } else if (kClassB.equals(reflectionFactory.b(Float[].class))) {
                    i = 12;
                } else if (kClassB.equals(reflectionFactory.b(Double[].class))) {
                    i = 13;
                } else {
                    if (!kClassB.equals(reflectionFactory.b(String[].class))) {
                        throw new IllegalArgumentException("Unsupported value type " + reflectionFactory.b(objArr.getClass()).x());
                    }
                    i = 14;
                }
                dataOutputStream.writeByte(i);
                dataOutputStream.writeInt(objArr.length);
                for (Object obj2 : objArr) {
                    if (i == 8) {
                        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                        dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                    } else if (i == 9) {
                        Byte b = obj2 instanceof Byte ? (Byte) obj2 : null;
                        dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                    } else if (i == 10) {
                        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                        dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                    } else if (i == 11) {
                        Long l = obj2 instanceof Long ? (Long) obj2 : null;
                        dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                    } else if (i == 12) {
                        Float f = obj2 instanceof Float ? (Float) obj2 : null;
                        dataOutputStream.writeFloat(f != null ? f.floatValue() : BitmapDescriptorFactory.HUE_RED);
                    } else if (i == 13) {
                        Double d = obj2 instanceof Double ? (Double) obj2 : null;
                        dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                    } else if (i == 14) {
                        String str2 = obj2 instanceof String ? (String) obj2 : null;
                        if (str2 == null) {
                            str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                        }
                        dataOutputStream.writeUTF(str2);
                    }
                }
            }
            dataOutputStream.writeUTF(str);
        }
    }

    public Data(Data other) {
        Intrinsics.h(other, "other");
        this.f3896a = new HashMap(other.f3896a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.work.Data a(byte[] r7) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.Data.a(byte[]):androidx.work.Data");
    }

    public final String b(String str) {
        Object obj = this.f3896a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean c(String str) {
        Object obj = this.f3896a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L5
            goto L66
        L5:
            r1 = 0
            if (r9 == 0) goto L67
            java.lang.Class<androidx.work.Data> r2 = androidx.work.Data.class
            java.lang.Class r3 = r9.getClass()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L15
            goto L67
        L15:
            androidx.work.Data r9 = (androidx.work.Data) r9
            java.util.HashMap r9 = r9.f3896a
            java.util.HashMap r2 = r8.f3896a
            java.util.Set r3 = r2.keySet()
            java.util.Set r4 = r9.keySet()
            boolean r4 = kotlin.jvm.internal.Intrinsics.c(r3, r4)
            if (r4 != 0) goto L2a
            goto L67
        L2a:
            java.util.Iterator r3 = r3.iterator()
        L2e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L66
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.get(r4)
            java.lang.Object r4 = r9.get(r4)
            if (r5 == 0) goto L5e
            if (r4 != 0) goto L47
            goto L5e
        L47:
            boolean r6 = r5 instanceof java.lang.Object[]
            if (r6 == 0) goto L59
            r6 = r5
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            boolean r7 = r4 instanceof java.lang.Object[]
            if (r7 == 0) goto L59
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            boolean r4 = kotlin.collections.ArraysKt.n(r6, r4)
            goto L63
        L59:
            boolean r4 = r5.equals(r4)
            goto L63
        L5e:
            if (r5 != r4) goto L62
            r4 = r0
            goto L63
        L62:
            r4 = r1
        L63:
            if (r4 != 0) goto L2e
            goto L67
        L66:
            return r0
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.Data.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f3896a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        String str = "Data {" + CollectionsKt.M(this.f3896a.entrySet(), null, null, null, Data$toString$1$content$1.h, 31) + "}";
        Intrinsics.g(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    public Data(LinkedHashMap values) {
        Intrinsics.h(values, "values");
        this.f3896a = new HashMap(values);
    }
}
