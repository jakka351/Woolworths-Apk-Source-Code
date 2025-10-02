package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import io.jsonwebtoken.JwtParser;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Landroidx/navigation/NavType;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Companion", "ParcelableType", "ParcelableArrayType", "SerializableType", "EnumType", "SerializableArrayType", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class NavType<T> {
    public static final IntNavType b = new IntNavType(false);
    public static final NavType$Companion$ReferenceType$1 c = new NavType$Companion$ReferenceType$1(false);
    public static final IntArrayNavType d = new IntArrayNavType(true);
    public static final IntListNavType e = new IntListNavType(true);
    public static final LongNavType f = new LongNavType(false);
    public static final LongArrayNavType g = new LongArrayNavType(true);
    public static final LongListNavType h = new LongListNavType(true);
    public static final FloatNavType i = new FloatNavType(false);
    public static final FloatArrayNavType j = new FloatArrayNavType(true);
    public static final FloatListNavType k = new FloatListNavType(true);
    public static final BoolNavType l = new BoolNavType(false);
    public static final BoolArrayNavType m = new BoolArrayNavType(true);
    public static final BoolListNavType n = new BoolListNavType(true);
    public static final StringNavType o = new StringNavType(true);
    public static final StringArrayNavType p = new StringArrayNavType(true);
    public static final StringListNavType q = new StringListNavType(true);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3489a;

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\"\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0005R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0005R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0005R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\t0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0005R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0005R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001c0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0005R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\t0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0005¨\u0006\u001f"}, d2 = {"Landroidx/navigation/NavType$Companion;", "", "Landroidx/navigation/NavType;", "", "IntType", "Landroidx/navigation/NavType;", "ReferenceType", "", "IntArrayType", "", "IntListType", "", "LongType", "", "LongArrayType", "LongListType", "", "FloatType", "", "FloatArrayType", "FloatListType", "", "BoolType", "", "BoolArrayType", "BoolListType", "", "StringType", "", "StringArrayType", "StringListType", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static NavType a(Class cls, boolean z) {
            if (Parcelable.class.isAssignableFrom(cls)) {
                return z ? new ParcelableArrayType(cls) : new ParcelableType(cls);
            }
            if (Enum.class.isAssignableFrom(cls) && !z) {
                return new EnumType(cls);
            }
            if (Serializable.class.isAssignableFrom(cls)) {
                return z ? new SerializableArrayType(cls) : new SerializableType(cls);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\f\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/NavType$EnumType;", "", "D", "Landroidx/navigation/NavType$SerializableType;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class EnumType<D extends Enum<?>> extends SerializableType<D> {
        public final Class s;

        public EnumType(Class cls) {
            super(cls, 0);
            if (cls.isEnum()) {
                this.s = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        public final String b() {
            return this.s.getName();
        }

        @Override // androidx.navigation.NavType.SerializableType
        /* renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final Enum g(String value) {
            Object obj;
            Intrinsics.h(value, "value");
            Class cls = this.s;
            Object[] enumConstants = cls.getEnumConstants();
            Intrinsics.g(enumConstants, "getEnumConstants(...)");
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    obj = null;
                    break;
                }
                obj = enumConstants[i];
                if (StringsKt.y(((Enum) obj).name(), value, true)) {
                    break;
                }
                i++;
            }
            Enum r4 = (Enum) obj;
            if (r4 != null) {
                return r4;
            }
            StringBuilder sbU = YU.a.u("Enum value ", value, " not found for type ");
            sbU.append(cls.getName());
            sbU.append(JwtParser.SEPARATOR_CHAR);
            throw new IllegalArgumentException(sbU.toString());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003¨\u0006\u0005"}, d2 = {"Landroidx/navigation/NavType$ParcelableArrayType;", "Landroid/os/Parcelable;", "D", "Landroidx/navigation/NavType;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ParcelableArrayType<D extends Parcelable> extends NavType<D[]> {
        public final Class r;

        public ParcelableArrayType(Class cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
            }
            try {
                this.r = Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // androidx.navigation.NavType
        public final Object a(Bundle bundle, String key) {
            Intrinsics.h(bundle, "bundle");
            Intrinsics.h(key, "key");
            return (Parcelable[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public final String b() {
            return this.r.getName();
        }

        @Override // androidx.navigation.NavType
        /* renamed from: d */
        public final Object g(String value) {
            Intrinsics.h(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public final void e(Bundle bundle, String key, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            Intrinsics.h(key, "key");
            this.r.cast(parcelableArr);
            bundle.putParcelableArray(key, parcelableArr);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !ParcelableArrayType.class.equals(obj.getClass())) {
                return false;
            }
            return Intrinsics.c(this.r, ((ParcelableArrayType) obj).r);
        }

        public final int hashCode() {
            return this.r.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/NavType$ParcelableType;", "D", "Landroidx/navigation/NavType;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ParcelableType<D> extends NavType<D> {
        public final Class r;

        public ParcelableType(Class cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.r = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // androidx.navigation.NavType
        public final Object a(Bundle bundle, String key) {
            Intrinsics.h(bundle, "bundle");
            Intrinsics.h(key, "key");
            return bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public final String b() {
            return this.r.getName();
        }

        @Override // androidx.navigation.NavType
        /* renamed from: d */
        public final Object g(String value) {
            Intrinsics.h(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public final void e(Bundle bundle, String key, Object obj) {
            Intrinsics.h(key, "key");
            this.r.cast(obj);
            if (obj == null || (obj instanceof Parcelable)) {
                bundle.putParcelable(key, (Parcelable) obj);
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) obj);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !ParcelableType.class.equals(obj.getClass())) {
                return false;
            }
            return Intrinsics.c(this.r, ((ParcelableType) obj).r);
        }

        public final int hashCode() {
            return this.r.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003¨\u0006\u0005"}, d2 = {"Landroidx/navigation/NavType$SerializableArrayType;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/NavType;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SerializableArrayType<D extends Serializable> extends NavType<D[]> {
        public final Class r;

        public SerializableArrayType(Class cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
            try {
                this.r = Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // androidx.navigation.NavType
        public final Object a(Bundle bundle, String key) {
            Intrinsics.h(bundle, "bundle");
            Intrinsics.h(key, "key");
            return (Serializable[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public final String b() {
            return this.r.getName();
        }

        @Override // androidx.navigation.NavType
        /* renamed from: d */
        public final Object g(String value) {
            Intrinsics.h(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
        @Override // androidx.navigation.NavType
        public final void e(Bundle bundle, String key, Object obj) {
            ?? r4 = (Serializable[]) obj;
            Intrinsics.h(key, "key");
            this.r.cast(r4);
            bundle.putSerializable(key, r4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !SerializableArrayType.class.equals(obj.getClass())) {
                return false;
            }
            return Intrinsics.c(this.r, ((SerializableArrayType) obj).r);
        }

        public final int hashCode() {
            return this.r.hashCode();
        }
    }

    public NavType(boolean z) {
        this.f3489a = z;
    }

    public abstract Object a(Bundle bundle, String str);

    public String b() {
        return "nav_type";
    }

    public Object c(Object obj, String str) {
        return g(str);
    }

    /* renamed from: d */
    public abstract Object g(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public String f(Object obj) {
        return String.valueOf(obj);
    }

    public final String toString() {
        return b();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/NavType$SerializableType;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/NavType;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static class SerializableType<D extends Serializable> extends NavType<D> {
        public final Class r;

        public SerializableType(Class cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
            if (!cls.isEnum()) {
                this.r = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
        }

        @Override // androidx.navigation.NavType
        public final Object a(Bundle bundle, String key) {
            Intrinsics.h(bundle, "bundle");
            Intrinsics.h(key, "key");
            return (Serializable) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public String b() {
            return this.r.getName();
        }

        @Override // androidx.navigation.NavType
        public final void e(Bundle bundle, String key, Object obj) {
            Serializable value = (Serializable) obj;
            Intrinsics.h(key, "key");
            Intrinsics.h(value, "value");
            this.r.cast(value);
            bundle.putSerializable(key, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SerializableType)) {
                return false;
            }
            return Intrinsics.c(this.r, ((SerializableType) obj).r);
        }

        @Override // androidx.navigation.NavType
        public Serializable g(String value) {
            Intrinsics.h(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public final int hashCode() {
            return this.r.hashCode();
        }

        public SerializableType(Class cls, int i) {
            super(false);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.r = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }
}
