package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import io.jsonwebtoken.JwtParser;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/serialization/InternalAndroidNavType;", "", "EnumNullableType", "SerializableNullableType", "EnumListType", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InternalAndroidNavType {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0003¨\u0006\u0005"}, d2 = {"Landroidx/navigation/serialization/InternalAndroidNavType$EnumListType;", "", "D", "Landroidx/navigation/CollectionNavType;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class EnumListType<D extends Enum<?>> extends CollectionNavType<List<? extends D>> {
        public final NavType.EnumType r;

        public EnumListType(Class cls) {
            super(true);
            this.r = new NavType.EnumType(cls);
        }

        @Override // androidx.navigation.NavType
        public final Object a(Bundle bundle, String key) {
            Intrinsics.h(bundle, "bundle");
            Intrinsics.h(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof List) {
                return (List) obj;
            }
            return null;
        }

        @Override // androidx.navigation.NavType
        public final String b() {
            return androidx.constraintlayout.core.state.a.f(this.r.s, new StringBuilder("List<"), "}>");
        }

        @Override // androidx.navigation.NavType
        public final Object c(Object obj, String str) {
            List list = (List) obj;
            NavType.EnumType enumType = this.r;
            if (list == null) {
                return CollectionsKt.Q(enumType.d(str));
            }
            return CollectionsKt.c0(CollectionsKt.Q(enumType.d(str)), list);
        }

        @Override // androidx.navigation.NavType
        /* renamed from: d */
        public final Object g(String value) {
            Intrinsics.h(value, "value");
            return CollectionsKt.Q(this.r.d(value));
        }

        @Override // androidx.navigation.NavType
        public final void e(Bundle bundle, String key, Object obj) {
            List list = (List) obj;
            Intrinsics.h(key, "key");
            bundle.putSerializable(key, list != null ? new ArrayList(list) : null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnumListType)) {
                return false;
            }
            return Intrinsics.c(this.r, ((EnumListType) obj).r);
        }

        @Override // androidx.navigation.CollectionNavType
        public final /* bridge */ /* synthetic */ Object g() {
            return EmptyList.d;
        }

        @Override // androidx.navigation.CollectionNavType
        public final List h(Object obj) {
            List list = (List) obj;
            if (list == null) {
                return EmptyList.d;
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Enum) it.next()).toString());
            }
            return arrayList;
        }

        public final int hashCode() {
            return this.r.r.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/serialization/InternalAndroidNavType$EnumNullableType;", "", "D", "Landroidx/navigation/serialization/InternalAndroidNavType$SerializableNullableType;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class EnumNullableType<D extends Enum<?>> extends SerializableNullableType<D> {
        public final Class s;

        public EnumNullableType(Class cls) {
            super(cls);
            if (cls.isEnum()) {
                this.s = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.serialization.InternalAndroidNavType.SerializableNullableType, androidx.navigation.NavType
        public final String b() {
            return this.s.getName();
        }

        @Override // androidx.navigation.serialization.InternalAndroidNavType.SerializableNullableType
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final Enum g(String value) {
            Intrinsics.h(value, "value");
            Object obj = null;
            if (value.equals("null")) {
                return null;
            }
            Class cls = this.s;
            Object[] enumConstants = cls.getEnumConstants();
            Intrinsics.e(enumConstants);
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Object obj2 = enumConstants[i];
                Enum r6 = (Enum) obj2;
                Intrinsics.e(r6);
                if (StringsKt.y(r6.name(), value, true)) {
                    obj = obj2;
                    break;
                }
                i++;
            }
            Enum r1 = (Enum) obj;
            if (r1 != null) {
                return r1;
            }
            StringBuilder sbU = YU.a.u("Enum value ", value, " not found for type ");
            sbU.append(cls.getName());
            sbU.append(JwtParser.SEPARATOR_CHAR);
            throw new IllegalArgumentException(sbU.toString());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/serialization/InternalAndroidNavType$SerializableNullableType;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/NavType;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class SerializableNullableType<D extends Serializable> extends NavType<D> {
        public final Class r;

        public SerializableNullableType(Class cls) {
            super(true);
            this.r = cls;
            if (Serializable.class.isAssignableFrom(cls)) {
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }

        @Override // androidx.navigation.NavType
        public final Object a(Bundle bundle, String key) {
            Intrinsics.h(bundle, "bundle");
            Intrinsics.h(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof Serializable) {
                return (Serializable) obj;
            }
            return null;
        }

        @Override // androidx.navigation.NavType
        public String b() {
            return this.r.getName();
        }

        @Override // androidx.navigation.NavType
        public final void e(Bundle bundle, String key, Object obj) {
            Intrinsics.h(key, "key");
            bundle.putSerializable(key, (Serializable) this.r.cast((Serializable) obj));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SerializableNullableType)) {
                return false;
            }
            return Intrinsics.c(this.r, ((SerializableNullableType) obj).r);
        }

        @Override // androidx.navigation.NavType
        public Serializable g(String value) {
            Intrinsics.h(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public final int hashCode() {
            return this.r.hashCode();
        }
    }
}
