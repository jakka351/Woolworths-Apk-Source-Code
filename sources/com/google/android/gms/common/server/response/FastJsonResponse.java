package com.google.android.gms.common.server.response;

import YU.a;
import android.os.Parcel;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes5.dex */
public abstract class FastJsonResponse {

    @ShowFirstParty
    public interface FieldConverter<I, O> {
        int zaa();

        int zab();

        @NonNull
        Object zac(@NonNull Object obj);

        @Nullable
        Object zad(@NonNull Object obj);
    }

    @NonNull
    public static final Object zaD(@NonNull Field field, @Nullable Object obj) {
        return field.zaj() != null ? field.zai(obj) : obj;
    }

    private final void zaE(Field field, @Nullable Object obj) {
        int i = field.zac;
        Object objZah = field.zah(obj);
        String str = field.zae;
        switch (i) {
            case 0:
                if (objZah != null) {
                    setIntegerInternal(field, str, ((Integer) objZah).intValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 1:
                zat(field, str, (BigInteger) objZah);
                return;
            case 2:
                if (objZah != null) {
                    setLongInternal(field, str, ((Long) objZah).longValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 3:
            default:
                throw new IllegalStateException(a.n(new StringBuilder(String.valueOf(i).length() + 33), "Unsupported type for conversion: ", i));
            case 4:
                if (objZah != null) {
                    zay(field, str, ((Double) objZah).doubleValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 5:
                zaA(field, str, (BigDecimal) objZah);
                return;
            case 6:
                if (objZah != null) {
                    setBooleanInternal(field, str, ((Boolean) objZah).booleanValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 7:
                setStringInternal(field, str, (String) objZah);
                return;
            case 8:
            case 9:
                if (objZah != null) {
                    setDecodedBytesInternal(field, str, (byte[]) objZah);
                    return;
                } else {
                    zaG(str);
                    return;
                }
        }
    }

    private static final void zaF(StringBuilder sb, Field field, Object obj) {
        int i = field.zaa;
        if (i == 11) {
            Class cls = field.zag;
            Preconditions.checkNotNull(cls);
            sb.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else {
            if (i != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(JsonUtils.escapeString((String) obj));
            sb.append("\"");
        }
    }

    private static final void zaG(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58);
            sb.append("Output field (");
            sb.append(str);
            sb.append(") has a null value, but expected a primitive");
            Log.e("FastJsonResponse", sb.toString());
        }
    }

    @KeepForSdk
    public <T extends FastJsonResponse> void addConcreteTypeArrayInternal(@NonNull Field field, @NonNull String str, @Nullable ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    @KeepForSdk
    public <T extends FastJsonResponse> void addConcreteTypeInternal(@NonNull Field field, @NonNull String str, @NonNull T t) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    @NonNull
    @KeepForSdk
    public abstract Map<String, Field<?, ?>> getFieldMappings();

    @Nullable
    @KeepForSdk
    public Object getFieldValue(@NonNull Field field) {
        String str = field.zae;
        if (field.zag == null) {
            return getValueObject(str);
        }
        Preconditions.checkState(getValueObject(str) == null, "Concrete field shouldn't be value object: %s", str);
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String strSubstring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(upperCase).length() + 3 + String.valueOf(strSubstring).length());
            sb.append("get");
            sb.append(upperCase);
            sb.append(strSubstring);
            return getClass().getMethod(sb.toString(), null).invoke(this, null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Nullable
    @KeepForSdk
    public abstract Object getValueObject(@NonNull String str);

    @KeepForSdk
    public boolean isFieldSet(@NonNull Field field) {
        if (field.zac != 11) {
            return isPrimitiveFieldSet(field.zae);
        }
        if (field.zad) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    @KeepForSdk
    public abstract boolean isPrimitiveFieldSet(@NonNull String str);

    @KeepForSdk
    public void setBooleanInternal(@NonNull Field<?, ?> field, @NonNull String str, boolean z) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    @KeepForSdk
    public void setDecodedBytesInternal(@NonNull Field<?, ?> field, @NonNull String str, @Nullable byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    @KeepForSdk
    public void setIntegerInternal(@NonNull Field<?, ?> field, @NonNull String str, int i) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    @KeepForSdk
    public void setLongInternal(@NonNull Field<?, ?> field, @NonNull String str, long j) {
        throw new UnsupportedOperationException("Long not supported");
    }

    @KeepForSdk
    public void setStringInternal(@NonNull Field<?, ?> field, @NonNull String str, @Nullable String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    @KeepForSdk
    public void setStringMapInternal(@NonNull Field<?, ?> field, @NonNull String str, @Nullable Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    @KeepForSdk
    public void setStringsInternal(@NonNull Field<?, ?> field, @NonNull String str, @Nullable ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    @NonNull
    @KeepForSdk
    public String toString() {
        Map<String, Field<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            Field<?, ?> field = fieldMappings.get(str);
            if (isFieldSet(field)) {
                Object objZaD = zaD(field, getFieldValue(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                androidx.compose.ui.input.pointer.a.w(sb, "\"", str, "\":");
                if (objZaD != null) {
                    switch (field.zac) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64Utils.encode((byte[]) objZaD));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64Utils.encodeUrlSafe((byte[]) objZaD));
                            sb.append("\"");
                            break;
                        case 10:
                            MapUtils.writeStringMapToJson(sb, (HashMap) objZaD);
                            break;
                        default:
                            if (field.zab) {
                                ArrayList arrayList = (ArrayList) objZaD;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        zaF(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            } else {
                                zaF(sb, field, objZaD);
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    public void zaA(@NonNull Field field, @NonNull String str, @Nullable BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public void zaB(@NonNull Field field, @NonNull String str, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public void zaC(@NonNull Field field, @NonNull String str, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zaa(@NonNull Field field, int i) {
        if (field.zaj() != null) {
            zaE(field, Integer.valueOf(i));
        } else {
            setIntegerInternal(field, field.zae, i);
        }
    }

    public final void zab(@NonNull Field field, @Nullable ArrayList arrayList) {
        if (field.zaj() != null) {
            zaE(field, arrayList);
        } else {
            zas(field, field.zae, arrayList);
        }
    }

    public final void zac(@NonNull Field field, @Nullable BigInteger bigInteger) {
        if (field.zaj() != null) {
            zaE(field, bigInteger);
        } else {
            zat(field, field.zae, bigInteger);
        }
    }

    public final void zad(@NonNull Field field, @Nullable ArrayList arrayList) {
        if (field.zaj() != null) {
            zaE(field, arrayList);
        } else {
            zau(field, field.zae, arrayList);
        }
    }

    public final void zae(@NonNull Field field, long j) {
        if (field.zaj() != null) {
            zaE(field, Long.valueOf(j));
        } else {
            setLongInternal(field, field.zae, j);
        }
    }

    public final void zaf(@NonNull Field field, @Nullable ArrayList arrayList) {
        if (field.zaj() != null) {
            zaE(field, arrayList);
        } else {
            zav(field, field.zae, arrayList);
        }
    }

    public final void zag(@NonNull Field field, float f) {
        if (field.zaj() != null) {
            zaE(field, Float.valueOf(f));
        } else {
            zaw(field, field.zae, f);
        }
    }

    public final void zah(@NonNull Field field, @Nullable ArrayList arrayList) {
        if (field.zaj() != null) {
            zaE(field, arrayList);
        } else {
            zax(field, field.zae, arrayList);
        }
    }

    public final void zai(@NonNull Field field, double d) {
        if (field.zaj() != null) {
            zaE(field, Double.valueOf(d));
        } else {
            zay(field, field.zae, d);
        }
    }

    public final void zaj(@NonNull Field field, @Nullable ArrayList arrayList) {
        if (field.zaj() != null) {
            zaE(field, arrayList);
        } else {
            zaz(field, field.zae, arrayList);
        }
    }

    public final void zak(@NonNull Field field, @Nullable BigDecimal bigDecimal) {
        if (field.zaj() != null) {
            zaE(field, bigDecimal);
        } else {
            zaA(field, field.zae, bigDecimal);
        }
    }

    public final void zal(@NonNull Field field, @Nullable ArrayList arrayList) {
        if (field.zaj() != null) {
            zaE(field, arrayList);
        } else {
            zaB(field, field.zae, arrayList);
        }
    }

    public final void zam(@NonNull Field field, boolean z) {
        if (field.zaj() != null) {
            zaE(field, Boolean.valueOf(z));
        } else {
            setBooleanInternal(field, field.zae, z);
        }
    }

    public final void zan(@NonNull Field field, @Nullable ArrayList arrayList) {
        if (field.zaj() != null) {
            zaE(field, arrayList);
        } else {
            zaC(field, field.zae, arrayList);
        }
    }

    public final void zao(@NonNull Field field, @Nullable String str) {
        if (field.zaj() != null) {
            zaE(field, str);
        } else {
            setStringInternal(field, field.zae, str);
        }
    }

    public final void zap(@NonNull Field field, @Nullable ArrayList arrayList) {
        if (field.zaj() != null) {
            zaE(field, arrayList);
        } else {
            setStringsInternal(field, field.zae, arrayList);
        }
    }

    public final void zaq(@NonNull Field field, @Nullable byte[] bArr) {
        if (field.zaj() != null) {
            zaE(field, bArr);
        } else {
            setDecodedBytesInternal(field, field.zae, bArr);
        }
    }

    public final void zar(@NonNull Field field, @Nullable Map map) {
        if (field.zaj() != null) {
            zaE(field, map);
        } else {
            setStringMapInternal(field, field.zae, map);
        }
    }

    public void zas(@NonNull Field field, @NonNull String str, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public void zat(@NonNull Field field, @NonNull String str, @Nullable BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public void zau(@NonNull Field field, @NonNull String str, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public void zav(@NonNull Field field, @NonNull String str, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    public void zaw(@NonNull Field field, @NonNull String str, float f) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public void zax(@NonNull Field field, @NonNull String str, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public void zay(@NonNull Field field, @NonNull String str, double d) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public void zaz(@NonNull Field field, @NonNull String str, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    @SafeParcelable.Class(creator = "FieldCreator")
    @ShowFirstParty
    @KeepForSdk
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zaj CREATOR = new zaj();

        @SafeParcelable.Field(getter = "getTypeIn", id = 2)
        protected final int zaa;

        @SafeParcelable.Field(getter = "isTypeInArray", id = 3)
        protected final boolean zab;

        @SafeParcelable.Field(getter = "getTypeOut", id = 4)
        protected final int zac;

        @SafeParcelable.Field(getter = "isTypeOutArray", id = 5)
        protected final boolean zad;

        @NonNull
        @SafeParcelable.Field(getter = "getOutputFieldName", id = 6)
        protected final String zae;

        @SafeParcelable.Field(getter = "getSafeParcelableFieldId", id = 7)
        protected final int zaf;

        @Nullable
        protected final Class zag;

        @Nullable
        @SafeParcelable.Field(getter = "getConcreteTypeName", id = 8)
        protected final String zah;

        @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
        private final int zai;
        private zan zaj;

        @Nullable
        @SafeParcelable.Field(getter = "getWrappedConverter", id = 9, type = "com.google.android.gms.common.server.converter.ConverterWrapper")
        private final FieldConverter zak;

        @SafeParcelable.Constructor
        public Field(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) int i4, @Nullable @SafeParcelable.Param(id = 8) String str2, @Nullable @SafeParcelable.Param(id = 9) com.google.android.gms.common.server.converter.zaa zaaVar) {
            this.zai = i;
            this.zaa = i2;
            this.zab = z;
            this.zac = i3;
            this.zad = z2;
            this.zae = str;
            this.zaf = i4;
            if (str2 == null) {
                this.zag = null;
                this.zah = null;
            } else {
                this.zag = SafeParcelResponse.class;
                this.zah = str2;
            }
            if (zaaVar == null) {
                this.zak = null;
            } else {
                this.zak = zaaVar.zab();
            }
        }

        @NonNull
        @KeepForSdk
        public static Field<byte[], byte[]> forBase64(@NonNull String str, int i) {
            return new Field<>(8, false, 8, false, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field<Boolean, Boolean> forBoolean(@NonNull String str, int i) {
            return new Field<>(6, false, 6, false, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static <T extends FastJsonResponse> Field<T, T> forConcreteType(@NonNull String str, int i, @NonNull Class<T> cls) {
            return new Field<>(11, false, 11, false, str, i, cls, null);
        }

        @NonNull
        @KeepForSdk
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> forConcreteTypeArray(@NonNull String str, int i, @NonNull Class<T> cls) {
            return new Field<>(11, true, 11, true, str, i, cls, null);
        }

        @NonNull
        @KeepForSdk
        public static Field<Double, Double> forDouble(@NonNull String str, int i) {
            return new Field<>(4, false, 4, false, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field<Float, Float> forFloat(@NonNull String str, int i) {
            return new Field<>(3, false, 3, false, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field<Integer, Integer> forInteger(@NonNull String str, int i) {
            return new Field<>(0, false, 0, false, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field<Long, Long> forLong(@NonNull String str, int i) {
            return new Field<>(2, false, 2, false, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field<String, String> forString(@NonNull String str, int i) {
            return new Field<>(7, false, 7, false, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field<HashMap<String, String>, HashMap<String, String>> forStringMap(@NonNull String str, int i) {
            return new Field<>(10, false, 10, false, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field<ArrayList<String>, ArrayList<String>> forStrings(@NonNull String str, int i) {
            return new Field<>(7, true, 7, true, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field withConverter(@NonNull String str, int i, @NonNull FieldConverter<?, ?> fieldConverter, boolean z) {
            fieldConverter.zaa();
            fieldConverter.zab();
            return new Field(7, z, 0, false, str, i, null, fieldConverter);
        }

        @KeepForSdk
        public int getSafeParcelableFieldId() {
            return this.zaf;
        }

        @NonNull
        public final String toString() {
            Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("versionCode", Integer.valueOf(this.zai)).add("typeIn", Integer.valueOf(this.zaa)).add("typeInArray", Boolean.valueOf(this.zab)).add("typeOut", Integer.valueOf(this.zac)).add("typeOutArray", Boolean.valueOf(this.zad)).add("outputFieldName", this.zae).add("safeParcelFieldId", Integer.valueOf(this.zaf)).add("concreteTypeName", zab());
            Class cls = this.zag;
            if (cls != null) {
                toStringHelperAdd.add("concreteType.class", cls.getCanonicalName());
            }
            FieldConverter fieldConverter = this.zak;
            if (fieldConverter != null) {
                toStringHelperAdd.add("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return toStringHelperAdd.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            int i2 = this.zai;
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, i2);
            SafeParcelWriter.writeInt(parcel, 2, this.zaa);
            SafeParcelWriter.writeBoolean(parcel, 3, this.zab);
            SafeParcelWriter.writeInt(parcel, 4, this.zac);
            SafeParcelWriter.writeBoolean(parcel, 5, this.zad);
            SafeParcelWriter.writeString(parcel, 6, this.zae, false);
            SafeParcelWriter.writeInt(parcel, 7, getSafeParcelableFieldId());
            SafeParcelWriter.writeString(parcel, 8, zab(), false);
            SafeParcelWriter.writeParcelable(parcel, 9, zae(), i, false);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }

        @NonNull
        public final Field zaa() {
            return new Field(this.zai, this.zaa, this.zab, this.zac, this.zad, this.zae, this.zaf, this.zah, zae());
        }

        @Nullable
        public final String zab() {
            String str = this.zah;
            if (str == null) {
                return null;
            }
            return str;
        }

        public final boolean zac() {
            return this.zak != null;
        }

        public final void zad(zan zanVar) {
            this.zaj = zanVar;
        }

        @Nullable
        public final com.google.android.gms.common.server.converter.zaa zae() {
            FieldConverter fieldConverter = this.zak;
            if (fieldConverter == null) {
                return null;
            }
            return com.google.android.gms.common.server.converter.zaa.zaa(fieldConverter);
        }

        @NonNull
        public final FastJsonResponse zaf() throws IllegalAccessException, InstantiationException {
            Class cls = this.zag;
            Preconditions.checkNotNull(cls);
            if (cls != SafeParcelResponse.class) {
                return (FastJsonResponse) cls.newInstance();
            }
            String str = this.zah;
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(this.zaj, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
            return new SafeParcelResponse(this.zaj, str);
        }

        @NonNull
        public final Map zag() {
            String str = this.zah;
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(this.zaj);
            return (Map) Preconditions.checkNotNull(this.zaj.zad(str));
        }

        @NonNull
        public final Object zah(@Nullable Object obj) {
            FieldConverter fieldConverter = this.zak;
            Preconditions.checkNotNull(fieldConverter);
            return Preconditions.checkNotNull(fieldConverter.zad(obj));
        }

        @NonNull
        public final Object zai(@NonNull Object obj) {
            FieldConverter fieldConverter = this.zak;
            Preconditions.checkNotNull(fieldConverter);
            return fieldConverter.zac(obj);
        }

        public final /* synthetic */ FieldConverter zaj() {
            return this.zak;
        }

        public Field(int i, boolean z, int i2, boolean z2, @NonNull String str, int i3, @Nullable Class cls, @Nullable FieldConverter fieldConverter) {
            this.zai = 1;
            this.zaa = i;
            this.zab = z;
            this.zac = i2;
            this.zad = z2;
            this.zae = str;
            this.zaf = i3;
            this.zag = cls;
            if (cls == null) {
                this.zah = null;
            } else {
                this.zah = cls.getCanonicalName();
            }
            this.zak = fieldConverter;
        }
    }
}
