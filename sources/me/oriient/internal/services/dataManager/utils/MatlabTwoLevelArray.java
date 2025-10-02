package me.oriient.internal.services.dataManager.utils;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import me.oriient.internal.services.auth.rest.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 **\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0002)*B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B?\b\u0011\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB\u0019\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0007¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u0014\u001a\u00020\tJ\u0015\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0007HÆ\u0003J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J@\u0010\u001e\u001a\u00020\u001f\"\u0004\b\u0001\u0010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H 0\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u0002H 0'HÁ\u0001¢\u0006\u0002\b(R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006+"}, d2 = {"Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/io/Serializable;", "()V", "seen1", "", "value", "", "isEmpty", "", "size", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;ZILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "()Z", "getSize", "()I", "getValue", "()Ljava/util/List;", "areAllArraysSameSize", "component1", "copy", "equals", "other", "", "flatten", "hashCode", "toString", "", "write$Self", "", "T0", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class MatlabTwoLevelArray<T extends java.io.Serializable> implements java.io.Serializable {

    @JvmField
    @NotNull
    private static final SerialDescriptor $cachedDescriptor;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private static final long serialVersionUID = 1;
    private final boolean isEmpty;
    private final int size;

    @NotNull
    private final List<List<T>> value;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001J0\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0003\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray$Companion;", "", "T0", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;", "serializer", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "", "serialVersionUID", "J", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static MatlabTwoLevelArray a(JsonElement jsonElement, Function1 decodeSingleObject) {
            Intrinsics.h(decodeSingleObject, "decodeSingleObject");
            if (jsonElement instanceof JsonPrimitive ? true : jsonElement instanceof JsonObject) {
                return new MatlabTwoLevelArray(CollectionsKt.Q(CollectionsKt.Q(decodeSingleObject.invoke(jsonElement))));
            }
            if (!(jsonElement instanceof JsonArray)) {
                if (jsonElement == null) {
                    throw new SerializationException("element is null");
                }
                throw new NoWhenBranchMatchedException();
            }
            JsonArray jsonArrayI = JsonElementKt.i(jsonElement);
            List list = jsonArrayI.d;
            if (list.isEmpty()) {
                return new MatlabTwoLevelArray(EmptyList.d);
            }
            JsonElement jsonElement2 = (JsonElement) list.get(0);
            if ((jsonElement2 instanceof JsonArray ? (JsonArray) jsonElement2 : null) == null) {
                ArrayList arrayList = new ArrayList(CollectionsKt.s(jsonArrayI, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(decodeSingleObject.invoke(it.next()));
                }
                return new MatlabTwoLevelArray(CollectionsKt.Q(arrayList));
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(jsonArrayI, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                JsonArray jsonArrayI2 = JsonElementKt.i((JsonElement) it2.next());
                ArrayList arrayList3 = new ArrayList(CollectionsKt.s(jsonArrayI2, 10));
                Iterator it3 = jsonArrayI2.d.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(decodeSingleObject.invoke(it3.next()));
                }
                arrayList2.add(arrayList3);
            }
            return new MatlabTwoLevelArray(arrayList2);
        }

        @NotNull
        public final <T0> KSerializer<MatlabTwoLevelArray<T0>> serializer(@NotNull KSerializer<T0> typeSerial0) {
            Intrinsics.h(typeSerial0, "typeSerial0");
            return new MatlabTwoLevelArray$$serializer(typeSerial0);
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataManager.utils.MatlabTwoLevelArray", null, 3);
        pluginGeneratedSerialDescriptor.k("value", false);
        pluginGeneratedSerialDescriptor.k("isEmpty", true);
        pluginGeneratedSerialDescriptor.k("size", true);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    @Deprecated
    public /* synthetic */ MatlabTwoLevelArray(int i, List list, boolean z, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        boolean z2 = true;
        if (1 != (i & 1)) {
            PluginExceptionsKt.a(i, 1, $cachedDescriptor);
            throw null;
        }
        this.value = list;
        int size = 0;
        if ((i & 2) == 0) {
            if (!list.isEmpty() && (!(list instanceof Collection) || !list.isEmpty())) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (!((List) it.next()).isEmpty()) {
                        z2 = false;
                        break;
                    }
                }
            }
            this.isEmpty = z2;
        } else {
            this.isEmpty = z;
        }
        if ((i & 4) != 0) {
            this.size = i2;
            return;
        }
        Iterator<T> it2 = this.value.iterator();
        while (it2.hasNext()) {
            size += ((List) it2.next()).size();
        }
        this.size = size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MatlabTwoLevelArray copy$default(MatlabTwoLevelArray matlabTwoLevelArray, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = matlabTwoLevelArray.value;
        }
        return matlabTwoLevelArray.copy(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void write$Self$internal_publishRelease(me.oriient.internal.services.dataManager.utils.MatlabTwoLevelArray r4, kotlinx.serialization.encoding.CompositeEncoder r5, kotlinx.serialization.descriptors.SerialDescriptor r6, kotlinx.serialization.KSerializer r7) {
        /*
            kotlinx.serialization.internal.ArrayListSerializer r0 = new kotlinx.serialization.internal.ArrayListSerializer
            kotlinx.serialization.internal.ArrayListSerializer r1 = new kotlinx.serialization.internal.ArrayListSerializer
            r1.<init>(r7)
            r0.<init>(r1)
            java.util.List<java.util.List<T extends java.io.Serializable>> r7 = r4.value
            r1 = 0
            r5.F(r6, r1, r0, r7)
            r7 = 1
            boolean r0 = r5.q(r6, r7)
            if (r0 == 0) goto L18
            goto L4a
        L18:
            boolean r0 = r4.isEmpty
            java.util.List<java.util.List<T extends java.io.Serializable>> r2 = r4.value
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L47
            java.util.List<java.util.List<T extends java.io.Serializable>> r2 = r4.value
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L2f
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L2f
            goto L47
        L2f:
            java.util.Iterator r2 = r2.iterator()
        L33:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L47
            java.lang.Object r3 = r2.next()
            java.util.List r3 = (java.util.List) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L33
            r2 = r1
            goto L48
        L47:
            r2 = r7
        L48:
            if (r0 == r2) goto L4f
        L4a:
            boolean r0 = r4.isEmpty
            r5.o(r6, r7, r0)
        L4f:
            r7 = 2
            boolean r0 = r5.q(r6, r7)
            if (r0 == 0) goto L57
            goto L73
        L57:
            int r0 = r4.size
            java.util.List<java.util.List<T extends java.io.Serializable>> r2 = r4.value
            java.util.Iterator r2 = r2.iterator()
        L5f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L71
            java.lang.Object r3 = r2.next()
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
            int r1 = r1 + r3
            goto L5f
        L71:
            if (r0 == r1) goto L78
        L73:
            int r4 = r4.size
            r5.C(r7, r4, r6)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.utils.MatlabTwoLevelArray.write$Self$internal_publishRelease(me.oriient.internal.services.dataManager.utils.MatlabTwoLevelArray, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor, kotlinx.serialization.KSerializer):void");
    }

    public final boolean areAllArraysSameSize() {
        List list = (List) CollectionsKt.J(0, this.value);
        if (list == null) {
            return false;
        }
        int size = list.size();
        List<List<T>> list2 = this.value;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((List) it.next()).size() != size) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final List<List<T>> component1() {
        return this.value;
    }

    @NotNull
    public final MatlabTwoLevelArray<T> copy(@NotNull List<? extends List<? extends T>> value) {
        Intrinsics.h(value, "value");
        return new MatlabTwoLevelArray<>(value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MatlabTwoLevelArray) && Intrinsics.c(this.value, ((MatlabTwoLevelArray) other).value);
    }

    @NotNull
    public final List<T> flatten() {
        return CollectionsKt.G(this.value);
    }

    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final List<List<T>> getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    /* renamed from: isEmpty, reason: from getter */
    public final boolean getIsEmpty() {
        return this.isEmpty;
    }

    @NotNull
    public String toString() {
        return m.a(new StringBuilder("MatlabTwoLevelArray(value="), this.value, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MatlabTwoLevelArray(@NotNull List<? extends List<? extends T>> value) {
        boolean z;
        Intrinsics.h(value, "value");
        this.value = value;
        int size = 0;
        if (value.isEmpty() || ((value instanceof Collection) && value.isEmpty())) {
            z = true;
        } else {
            Iterator it = value.iterator();
            while (it.hasNext()) {
                if (!((List) it.next()).isEmpty()) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        this.isEmpty = z;
        Iterator<T> it2 = this.value.iterator();
        while (it2.hasNext()) {
            size += ((List) it2.next()).size();
        }
        this.size = size;
    }

    public MatlabTwoLevelArray() {
        this(CollectionsKt.Q(EmptyList.d));
    }
}
