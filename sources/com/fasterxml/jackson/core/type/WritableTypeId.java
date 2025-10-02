package com.fasterxml.jackson.core.type;

import com.fasterxml.jackson.core.JsonToken;

/* loaded from: classes4.dex */
public class WritableTypeId {

    /* renamed from: a, reason: collision with root package name */
    public Object f14217a;
    public Class b;
    public Object c = null;
    public String d;
    public Inclusion e;
    public final JsonToken f;
    public boolean g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Inclusion {
        public static final Inclusion d;
        public static final Inclusion e;
        public static final Inclusion f;
        public static final Inclusion g;
        public static final Inclusion h;
        public static final /* synthetic */ Inclusion[] i;

        static {
            Inclusion inclusion = new Inclusion("WRAPPER_ARRAY", 0);
            d = inclusion;
            Inclusion inclusion2 = new Inclusion("WRAPPER_OBJECT", 1);
            e = inclusion2;
            Inclusion inclusion3 = new Inclusion("METADATA_PROPERTY", 2);
            f = inclusion3;
            Inclusion inclusion4 = new Inclusion("PAYLOAD_PROPERTY", 3);
            g = inclusion4;
            Inclusion inclusion5 = new Inclusion("PARENT_PROPERTY", 4);
            h = inclusion5;
            i = new Inclusion[]{inclusion, inclusion2, inclusion3, inclusion4, inclusion5};
        }

        public static Inclusion valueOf(String str) {
            return (Inclusion) Enum.valueOf(Inclusion.class, str);
        }

        public static Inclusion[] values() {
            return (Inclusion[]) i.clone();
        }
    }

    public WritableTypeId(JsonToken jsonToken, Object obj) {
        this.f14217a = obj;
        this.f = jsonToken;
    }
}
