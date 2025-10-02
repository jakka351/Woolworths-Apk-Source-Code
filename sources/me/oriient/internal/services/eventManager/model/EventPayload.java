package me.oriient.internal.services.eventManager.model;

import androidx.annotation.Keep;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import me.oriient.internal.infra.serializerJson.Jsonable;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000  *\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002:\u0002\u001f B-\b\u0011\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0002\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016JZ\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0002\u0010\u0014\"\u0004\b\u0003\u0010\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00140\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00150\u001cHÁ\u0001¢\u0006\u0002\b\u001eR\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\r¨\u0006!"}, d2 = {"Lme/oriient/internal/services/eventManager/model/EventPayload;", "Data", "Lme/oriient/internal/infra/serializerJson/Jsonable;", "Parameters", "seen1", "", "data", "parameters", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/internal/infra/serializerJson/Jsonable;Lme/oriient/internal/infra/serializerJson/Jsonable;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/internal/infra/serializerJson/Jsonable;Lme/oriient/internal/infra/serializerJson/Jsonable;)V", "getData", "()Lme/oriient/internal/infra/serializerJson/Jsonable;", "Lme/oriient/internal/infra/serializerJson/Jsonable;", "getParameters", "toJsonElement", "Lkotlinx/serialization/json/JsonElement;", "write$Self", "", "T0", "T1", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "typeSerial1", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final class EventPayload<Data extends Jsonable, Parameters extends Jsonable> implements Jsonable {

    @JvmField
    @NotNull
    private static final SerialDescriptor $cachedDescriptor;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final Data data;

    @NotNull
    private final Parameters parameters;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001JJ\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00070\u0004\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00030\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lme/oriient/internal/services/eventManager/model/EventPayload$Companion;", "", "T0", "T1", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "typeSerial1", "Lme/oriient/internal/services/eventManager/model/EventPayload;", "serializer", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final <T0, T1> KSerializer<EventPayload<T0, T1>> serializer(@NotNull KSerializer<T0> typeSerial0, @NotNull KSerializer<T1> typeSerial1) {
            Intrinsics.h(typeSerial0, "typeSerial0");
            Intrinsics.h(typeSerial1, "typeSerial1");
            return new EventPayload$$serializer(typeSerial0, typeSerial1);
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.eventManager.model.EventPayload", null, 2);
        pluginGeneratedSerialDescriptor.k("data", false);
        pluginGeneratedSerialDescriptor.k("parameters", false);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public /* synthetic */ EventPayload(int i, Jsonable jsonable, Jsonable jsonable2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, $cachedDescriptor);
            throw null;
        }
        this.data = jsonable;
        this.parameters = jsonable2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(EventPayload self, CompositeEncoder output, SerialDescriptor serialDesc, KSerializer typeSerial0, KSerializer typeSerial1) {
        output.F(serialDesc, 0, typeSerial0, self.data);
        output.F(serialDesc, 1, typeSerial1, self.parameters);
    }

    @NotNull
    public final Data getData() {
        return this.data;
    }

    @NotNull
    public final Parameters getParameters() {
        return this.parameters;
    }

    @Override // me.oriient.internal.infra.serializerJson.Jsonable
    @NotNull
    public JsonElement toJsonElement() {
        return new JsonObject(MapsKt.j(new Pair("data", this.data.toJsonElement()), new Pair("parameters", this.parameters.toJsonElement())));
    }

    public EventPayload(@NotNull Data data, @NotNull Parameters parameters) {
        Intrinsics.h(data, "data");
        Intrinsics.h(parameters, "parameters");
        this.data = data;
        this.parameters = parameters;
    }
}
