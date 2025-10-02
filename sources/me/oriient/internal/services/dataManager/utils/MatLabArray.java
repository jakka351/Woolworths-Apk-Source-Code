package me.oriient.internal.services.dataManager.utils;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.internal.services.auth.rest.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 **\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0002)*B=\b\u0011\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB!\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\fJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007HÆ\u0003J/\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\r\u0010\u001a\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u001bJ\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J@\u0010\u001e\u001a\u00020\u001f\"\u0004\b\u0001\u0010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H 0\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u0002H 0'HÁ\u0001¢\u0006\u0002\b(R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006+"}, d2 = {"Lme/oriient/internal/services/dataManager/utils/MatLabArray;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/io/Serializable;", "", "seen1", "", "arraySize", "", "arrayData", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/util/List;)V", "getArrayData$annotations", "()V", "getArrayData", "()Ljava/util/List;", "getArraySize$annotations", "getArraySize", "component1", "component2", "copy", "equals", "", "other", "hashCode", "isValid", "isValid$internal_publishRelease", "toString", "", "write$Self", "", "T0", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class MatLabArray<T extends java.io.Serializable> {

    @JvmField
    @NotNull
    private static final SerialDescriptor $cachedDescriptor;

    @NotNull
    private final List<T> arrayData;

    @NotNull
    private final List<Integer> arraySize;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(IntSerializer.f24800a), null};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J0\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0003\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lme/oriient/internal/services/dataManager/utils/MatLabArray$Companion;", "", "T0", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "serializer", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final <T0> KSerializer<MatLabArray<T0>> serializer(@NotNull KSerializer<T0> typeSerial0) {
            Intrinsics.h(typeSerial0, "typeSerial0");
            return new MatLabArray$$serializer(typeSerial0);
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataManager.utils.MatLabArray", null, 2);
        pluginGeneratedSerialDescriptor.k("_ArraySize_", false);
        pluginGeneratedSerialDescriptor.k("_ArrayData_", false);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    @Deprecated
    public /* synthetic */ MatLabArray(int i, @SerialName List list, @SerialName List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, $cachedDescriptor);
            throw null;
        }
        this.arraySize = list;
        this.arrayData = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MatLabArray copy$default(MatLabArray matLabArray, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = matLabArray.arraySize;
        }
        if ((i & 2) != 0) {
            list2 = matLabArray.arrayData;
        }
        return matLabArray.copy(list, list2);
    }

    @SerialName
    public static /* synthetic */ void getArrayData$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getArraySize$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(MatLabArray self, CompositeEncoder output, SerialDescriptor serialDesc, KSerializer typeSerial0) {
        output.F(serialDesc, 0, $childSerializers[0], self.arraySize);
        output.F(serialDesc, 1, new ArrayListSerializer(typeSerial0), self.arrayData);
    }

    @NotNull
    public final List<Integer> component1() {
        return this.arraySize;
    }

    @NotNull
    public final List<T> component2() {
        return this.arrayData;
    }

    @NotNull
    public final MatLabArray<T> copy(@NotNull List<Integer> arraySize, @NotNull List<? extends T> arrayData) {
        Intrinsics.h(arraySize, "arraySize");
        Intrinsics.h(arrayData, "arrayData");
        return new MatLabArray<>(arraySize, arrayData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatLabArray)) {
            return false;
        }
        MatLabArray matLabArray = (MatLabArray) other;
        return Intrinsics.c(this.arraySize, matLabArray.arraySize) && Intrinsics.c(this.arrayData, matLabArray.arrayData);
    }

    @NotNull
    public final List<T> getArrayData() {
        return this.arrayData;
    }

    @NotNull
    public final List<Integer> getArraySize() {
        return this.arraySize;
    }

    public int hashCode() {
        return this.arrayData.hashCode() + (this.arraySize.hashCode() * 31);
    }

    public final boolean isValid$internal_publishRelease() {
        int size = this.arrayData.size();
        Iterator<T> it = this.arraySize.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Integer.valueOf(((Number) next).intValue() * ((Number) it.next()).intValue());
        }
        return size == ((Number) next).intValue();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MatLabArray(arraySize=");
        sb.append(this.arraySize);
        sb.append(", arrayData=");
        return m.a(sb, this.arrayData, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MatLabArray(@NotNull List<Integer> arraySize, @NotNull List<? extends T> arrayData) {
        Intrinsics.h(arraySize, "arraySize");
        Intrinsics.h(arrayData, "arrayData");
        this.arraySize = arraySize;
        this.arrayData = arrayData;
    }
}
