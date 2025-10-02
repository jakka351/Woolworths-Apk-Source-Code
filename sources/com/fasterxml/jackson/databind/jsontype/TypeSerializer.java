package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.BeanProperty;

/* loaded from: classes4.dex */
public abstract class TypeSerializer {

    /* renamed from: com.fasterxml.jackson.databind.jsontype.TypeSerializer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14292a;

        static {
            int[] iArr = new int[JsonTypeInfo.As.values().length];
            f14292a = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14292a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14292a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14292a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14292a[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public abstract TypeSerializer a(BeanProperty beanProperty);

    public abstract String b();

    public abstract JsonTypeInfo.As c();

    public final WritableTypeId d(JsonToken jsonToken, Object obj) {
        WritableTypeId writableTypeId = new WritableTypeId(jsonToken, obj);
        int iOrdinal = c().ordinal();
        if (iOrdinal == 0) {
            writableTypeId.e = WritableTypeId.Inclusion.f;
            writableTypeId.d = b();
            return writableTypeId;
        }
        if (iOrdinal == 1) {
            writableTypeId.e = WritableTypeId.Inclusion.e;
            return writableTypeId;
        }
        if (iOrdinal == 2) {
            writableTypeId.e = WritableTypeId.Inclusion.d;
            return writableTypeId;
        }
        if (iOrdinal == 3) {
            writableTypeId.e = WritableTypeId.Inclusion.h;
            writableTypeId.d = b();
            return writableTypeId;
        }
        if (iOrdinal != 4) {
            VersionUtil.c();
            throw null;
        }
        writableTypeId.e = WritableTypeId.Inclusion.g;
        writableTypeId.d = b();
        return writableTypeId;
    }

    public abstract WritableTypeId e(JsonGenerator jsonGenerator, WritableTypeId writableTypeId);

    public abstract WritableTypeId f(JsonGenerator jsonGenerator, WritableTypeId writableTypeId);
}
