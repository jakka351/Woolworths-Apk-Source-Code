package me.oriient.internal.infra.serializerJson;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001b"}, d2 = {"Lme/oriient/internal/infra/serializerJson/JsonableNumber;", "Lme/oriient/internal/infra/serializerJson/Jsonable;", "", "value", "constructor-impl", "(Ljava/lang/Number;)Ljava/lang/Number;", "Lkotlinx/serialization/json/JsonElement;", "toJsonElement-impl", "(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonElement;", "toJsonElement", "", "toString-impl", "(Ljava/lang/Number;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/lang/Number;)I", "hashCode", "", "other", "", "equals-impl", "(Ljava/lang/Number;Ljava/lang/Object;)Z", "equals", "Ljava/lang/Number;", "Companion", "me/oriient/internal/infra/serializerJson/e", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes7.dex */
public final class JsonableNumber implements Jsonable {

    @NotNull
    public static final e Companion = new e();
    private static final long serialVersionUID = 1;

    @NotNull
    private final Number value;

    private /* synthetic */ JsonableNumber(Number number) {
        this.value = number;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ JsonableNumber m377boximpl(Number number) {
        return new JsonableNumber(number);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Number m378constructorimpl(@NotNull Number value) {
        Intrinsics.h(value, "value");
        return value;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m379equalsimpl(Number number, Object obj) {
        return (obj instanceof JsonableNumber) && Intrinsics.c(number, ((JsonableNumber) obj).getValue());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m380equalsimpl0(Number number, Number number2) {
        return Intrinsics.c(number, number2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m381hashCodeimpl(Number number) {
        return number.hashCode();
    }

    @NotNull
    /* renamed from: toJsonElement-impl, reason: not valid java name */
    public static JsonElement m382toJsonElementimpl(Number number) {
        return JsonElementKt.a(number);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m383toStringimpl(Number number) {
        return "JsonableNumber(value=" + number + ')';
    }

    public boolean equals(Object obj) {
        return m379equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m381hashCodeimpl(this.value);
    }

    @Override // me.oriient.internal.infra.serializerJson.Jsonable
    @NotNull
    public JsonElement toJsonElement() {
        return m382toJsonElementimpl(this.value);
    }

    public String toString() {
        return m383toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ Number getValue() {
        return this.value;
    }
}
