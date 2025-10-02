package androidx.os.serialization.serializers;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import androidx.os.serialization.serializers.SparseArraySerializer;
import com.google.android.gms.ads.RequestConfiguration;
import com.salesforce.marketingcloud.storage.db.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/serialization/KSerializer;", "Landroid/util/SparseArray;", "SparseArraySurrogate", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SparseArraySerializer<T> implements KSerializer<SparseArray<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final KSerializer f3752a;
    public final SerialDescriptor b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u0003*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u0004\u0003¨\u0006\u0005"}, d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Companion", "$serializer", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    @SuppressLint
    public static final class SparseArraySurrogate<T> {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] c = {LazyKt.a(LazyThreadSafetyMode.d, new a()), null};
        public static final PluginGeneratedSerialDescriptor d;

        /* renamed from: a, reason: collision with root package name */
        public final List f3754a;
        public final List b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J-\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\u0003\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate$Companion;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/serialization/KSerializer;", "typeSerial0", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "serializer", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final <T> KSerializer<SparseArraySurrogate<T>> serializer(@NotNull final KSerializer<T> typeSerial0) {
                Intrinsics.h(typeSerial0, "typeSerial0");
                return new GeneratedSerializer<SparseArraySurrogate<T>>() { // from class: androidx.savedstate.serialization.serializers.SparseArraySerializer$SparseArraySurrogate$$serializer

                    @NotNull
                    private final SerialDescriptor descriptor;

                    {
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
                        pluginGeneratedSerialDescriptor.k(i.a.n, false);
                        pluginGeneratedSerialDescriptor.k("values", false);
                        this.descriptor = pluginGeneratedSerialDescriptor;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlinx.serialization.internal.GeneratedSerializer
                    public final KSerializer[] childSerializers() {
                        return new KSerializer[]{SparseArraySerializer.SparseArraySurrogate.c[0].getD(), new ArrayListSerializer(typeSerial0)};
                    }

                    @Override // kotlinx.serialization.DeserializationStrategy
                    public final Object deserialize(Decoder decoder) {
                        SerialDescriptor serialDescriptor = this.descriptor;
                        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
                        Lazy[] lazyArr = SparseArraySerializer.SparseArraySurrogate.c;
                        List list = null;
                        boolean z = true;
                        int i = 0;
                        List list2 = null;
                        while (z) {
                            int iU = compositeDecoderB.u(serialDescriptor);
                            if (iU == -1) {
                                z = false;
                            } else if (iU == 0) {
                                list = (List) compositeDecoderB.o(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getD(), list);
                                i |= 1;
                            } else {
                                if (iU != 1) {
                                    throw new UnknownFieldException(iU);
                                }
                                list2 = (List) compositeDecoderB.o(serialDescriptor, 1, new ArrayListSerializer(typeSerial0), list2);
                                i |= 2;
                            }
                        }
                        compositeDecoderB.c(serialDescriptor);
                        return new SparseArraySerializer.SparseArraySurrogate(list, list2, i);
                    }

                    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
                    public final SerialDescriptor getDescriptor() {
                        return this.descriptor;
                    }

                    @Override // kotlinx.serialization.SerializationStrategy
                    public final void serialize(Encoder encoder, Object obj) {
                        SparseArraySerializer.SparseArraySurrogate value = (SparseArraySerializer.SparseArraySurrogate) obj;
                        Intrinsics.h(value, "value");
                        SerialDescriptor serialDescriptor = this.descriptor;
                        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
                        compositeEncoderB.F(serialDescriptor, 0, (SerializationStrategy) SparseArraySerializer.SparseArraySurrogate.c[0].getD(), value.f3754a);
                        compositeEncoderB.F(serialDescriptor, 1, new ArrayListSerializer(typeSerial0), value.b);
                        compositeEncoderB.c(serialDescriptor);
                    }

                    @Override // kotlinx.serialization.internal.GeneratedSerializer
                    public final KSerializer[] typeParametersSerializers() {
                        return new KSerializer[]{typeSerial0};
                    }
                };
            }
        }

        static {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
            pluginGeneratedSerialDescriptor.k(i.a.n, false);
            pluginGeneratedSerialDescriptor.k("values", false);
            d = pluginGeneratedSerialDescriptor;
        }

        public /* synthetic */ SparseArraySurrogate(List list, List list2, int i) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.a(i, 3, d);
                throw null;
            }
            this.f3754a = list;
            this.b = list2;
        }

        public SparseArraySurrogate(ArrayList arrayList, ArrayList arrayList2) {
            this.f3754a = arrayList;
            this.b = arrayList2;
        }
    }

    public SparseArraySerializer(KSerializer elementSerializer) {
        Intrinsics.h(elementSerializer, "elementSerializer");
        KSerializer<SparseArraySurrogate<T>> kSerializerSerializer = SparseArraySurrogate.INSTANCE.serializer(elementSerializer);
        this.f3752a = kSerializerSerializer;
        this.b = kSerializerSerializer.getDescriptor();
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SparseArraySurrogate sparseArraySurrogate = (SparseArraySurrogate) decoder.E(this.f3752a);
        List list = sparseArraySurrogate.f3754a;
        int size = list.size();
        List list2 = sparseArraySurrogate.b;
        if (size != list2.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SparseArray sparseArray = new SparseArray(list.size());
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            sparseArray.append(((Number) list.get(i)).intValue(), list2.get(i));
        }
        return sparseArray;
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SparseArray value = (SparseArray) obj;
        Intrinsics.h(value, "value");
        int size = value.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(value.keyAt(i)));
        }
        int size2 = value.size();
        ArrayList arrayList2 = new ArrayList(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList2.add(value.valueAt(i2));
        }
        encoder.e(this.f3752a, new SparseArraySurrogate(arrayList, arrayList2));
    }
}
