package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class DeserializedContainerAbiStability {
    public static final DeserializedContainerAbiStability d;
    public static final DeserializedContainerAbiStability e;
    public static final /* synthetic */ DeserializedContainerAbiStability[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        DeserializedContainerAbiStability deserializedContainerAbiStability = new DeserializedContainerAbiStability("STABLE", 0);
        d = deserializedContainerAbiStability;
        DeserializedContainerAbiStability deserializedContainerAbiStability2 = new DeserializedContainerAbiStability("UNSTABLE", 1);
        e = deserializedContainerAbiStability2;
        DeserializedContainerAbiStability[] deserializedContainerAbiStabilityArr = {deserializedContainerAbiStability, deserializedContainerAbiStability2};
        f = deserializedContainerAbiStabilityArr;
        g = EnumEntriesKt.a(deserializedContainerAbiStabilityArr);
    }

    public static DeserializedContainerAbiStability valueOf(String str) {
        return (DeserializedContainerAbiStability) Enum.valueOf(DeserializedContainerAbiStability.class, str);
    }

    public static DeserializedContainerAbiStability[] values() {
        return (DeserializedContainerAbiStability[]) f.clone();
    }
}
