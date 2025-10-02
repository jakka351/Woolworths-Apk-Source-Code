package me.oriient.internal.infra.serializerJson;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonLiteral;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087@\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001a"}, d2 = {"Lme/oriient/internal/infra/serializerJson/JsonableBoolean;", "Lme/oriient/internal/infra/serializerJson/Jsonable;", "", "value", "constructor-impl", "(Z)Z", "Lkotlinx/serialization/json/JsonElement;", "toJsonElement-impl", "(Z)Lkotlinx/serialization/json/JsonElement;", "toJsonElement", "", "toString-impl", "(Z)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Z)I", "hashCode", "", "other", "equals-impl", "(ZLjava/lang/Object;)Z", "equals", "Z", "Companion", "me/oriient/internal/infra/serializerJson/c", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes7.dex */
public final class JsonableBoolean implements Jsonable {

    @NotNull
    public static final c Companion = new c();
    private static final long serialVersionUID = 1;
    private final boolean value;

    private /* synthetic */ JsonableBoolean(boolean z) {
        this.value = z;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ JsonableBoolean m369boximpl(boolean z) {
        return new JsonableBoolean(z);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static boolean m370constructorimpl(boolean z) {
        return z;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m371equalsimpl(boolean z, Object obj) {
        return (obj instanceof JsonableBoolean) && z == ((JsonableBoolean) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m372equalsimpl0(boolean z, boolean z2) {
        return z == z2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m373hashCodeimpl(boolean z) {
        return Boolean.hashCode(z);
    }

    @NotNull
    /* renamed from: toJsonElement-impl, reason: not valid java name */
    public static JsonElement m374toJsonElementimpl(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        InlineClassDescriptor inlineClassDescriptor = JsonElementKt.f24841a;
        return new JsonLiteral(boolValueOf, false, null);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m375toStringimpl(boolean z) {
        return "JsonableBoolean(value=" + z + ')';
    }

    public boolean equals(Object obj) {
        return m371equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m373hashCodeimpl(this.value);
    }

    @Override // me.oriient.internal.infra.serializerJson.Jsonable
    @NotNull
    public JsonElement toJsonElement() {
        return m374toJsonElementimpl(this.value);
    }

    public String toString() {
        return m375toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ boolean getValue() {
        return this.value;
    }
}
