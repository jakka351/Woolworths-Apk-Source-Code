package com.google.firebase.encoders.proto;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class ProtobufDataEncoderContext implements ObjectEncoderContext {
    public static final Charset f = Charset.forName("UTF-8");
    public static final FieldDescriptor g;
    public static final FieldDescriptor h;
    public static final a i;

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f15417a;
    public final HashMap b;
    public final HashMap c;
    public final ObjectEncoder d;
    public final ProtobufValueEncoderContext e = new ProtobufValueEncoderContext(this);

    /* renamed from: com.google.firebase.encoders.proto.ProtobufDataEncoderContext$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15418a;

        static {
            int[] iArr = new int[Protobuf.IntEncoding.values().length];
            f15418a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15418a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15418a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        FieldDescriptor.Builder builder = new FieldDescriptor.Builder("key");
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.f15415a = 1;
        g = c.h(atProtobuf, builder);
        FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("value");
        AtProtobuf atProtobuf2 = new AtProtobuf();
        atProtobuf2.f15415a = 2;
        h = c.h(atProtobuf2, builder2);
        i = new a(0);
    }

    public ProtobufDataEncoderContext(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, ObjectEncoder objectEncoder) {
        this.f15417a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
        this.d = objectEncoder;
    }

    public static int f(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.a(Protobuf.class);
        if (protobuf != null) {
            return protobuf.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public final void a(FieldDescriptor fieldDescriptor, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        g((f(fieldDescriptor) << 3) | 1);
        this.f15417a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) {
        d(fieldDescriptor, obj, true);
        return this;
    }

    public final void b(FieldDescriptor fieldDescriptor, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) fieldDescriptor.a(Protobuf.class);
        if (protobuf == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int iOrdinal = protobuf.intEncoding().ordinal();
        if (iOrdinal == 0) {
            g(protobuf.tag() << 3);
            g(i2);
        } else if (iOrdinal == 1) {
            g(protobuf.tag() << 3);
            g((i2 << 1) ^ (i2 >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            g((protobuf.tag() << 3) | 5);
            this.f15417a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
        }
    }

    public final void c(FieldDescriptor fieldDescriptor, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) fieldDescriptor.a(Protobuf.class);
        if (protobuf == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int iOrdinal = protobuf.intEncoding().ordinal();
        if (iOrdinal == 0) {
            g(protobuf.tag() << 3);
            h(j);
        } else if (iOrdinal == 1) {
            g(protobuf.tag() << 3);
            h((j >> 63) ^ (j << 1));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            g((protobuf.tag() << 3) | 1);
            this.f15417a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void d(FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            g((f(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            g(bytes.length);
            this.f15417a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                d(fieldDescriptor, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                e(i, fieldDescriptor, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            a(fieldDescriptor, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            g((f(fieldDescriptor) << 3) | 5);
            this.f15417a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            c(fieldDescriptor, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            b(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            g((f(fieldDescriptor) << 3) | 2);
            g(bArr.length);
            this.f15417a.write(bArr);
            return;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.b.get(obj.getClass());
        if (objectEncoder != null) {
            e(objectEncoder, fieldDescriptor, obj, z);
            return;
        }
        ValueEncoder valueEncoder = (ValueEncoder) this.c.get(obj.getClass());
        if (valueEncoder != null) {
            ProtobufValueEncoderContext protobufValueEncoderContext = this.e;
            protobufValueEncoderContext.f15421a = false;
            protobufValueEncoderContext.c = fieldDescriptor;
            protobufValueEncoderContext.b = z;
            valueEncoder.encode(obj, protobufValueEncoderContext);
            return;
        }
        if (obj instanceof ProtoEnum) {
            b(fieldDescriptor, ((ProtoEnum) obj).g(), true);
        } else if (obj instanceof Enum) {
            b(fieldDescriptor, ((Enum) obj).ordinal(), true);
        } else {
            e(this.d, fieldDescriptor, obj, z);
        }
    }

    public final void e(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) throws IOException {
        LengthCountingOutputStream lengthCountingOutputStream = new LengthCountingOutputStream();
        lengthCountingOutputStream.d = 0L;
        try {
            OutputStream outputStream = this.f15417a;
            this.f15417a = lengthCountingOutputStream;
            try {
                objectEncoder.encode(obj, this);
                this.f15417a = outputStream;
                long j = lengthCountingOutputStream.d;
                lengthCountingOutputStream.close();
                if (z && j == 0) {
                    return;
                }
                g((f(fieldDescriptor) << 3) | 2);
                h(j);
                objectEncoder.encode(obj, this);
            } catch (Throwable th) {
                this.f15417a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                lengthCountingOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void g(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            this.f15417a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.f15417a.write(i2 & 127);
    }

    public final void h(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f15417a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f15417a.write(((int) j) & 127);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d) throws IOException {
        a(fieldDescriptor, d, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i2) {
        b(fieldDescriptor, i2, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j) throws IOException {
        c(fieldDescriptor, j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, boolean z) {
        b(fieldDescriptor, z ? 1 : 0, true);
        return this;
    }
}
