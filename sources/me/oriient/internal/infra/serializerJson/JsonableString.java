package me.oriient.internal.infra.serializerJson;

import androidx.annotation.Keep;
import androidx.compose.ui.platform.i;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0019"}, d2 = {"Lme/oriient/internal/infra/serializerJson/JsonableString;", "Lme/oriient/internal/infra/serializerJson/Jsonable;", "", "value", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "Lkotlinx/serialization/json/JsonElement;", "toJsonElement-impl", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "toJsonElement", "toString-impl", "toString", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "Ljava/lang/String;", "Companion", "me/oriient/internal/infra/serializerJson/f", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes7.dex */
public final class JsonableString implements Jsonable {

    @NotNull
    public static final f Companion = new f();
    private static final long serialVersionUID = 1;

    @NotNull
    private final String value;

    private /* synthetic */ JsonableString(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ JsonableString m385boximpl(String str) {
        return new JsonableString(str);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m386constructorimpl(@NotNull String value) {
        Intrinsics.h(value, "value");
        return value;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m387equalsimpl(String str, Object obj) {
        return (obj instanceof JsonableString) && Intrinsics.c(str, ((JsonableString) obj).getValue());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m388equalsimpl0(String str, String str2) {
        return Intrinsics.c(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m389hashCodeimpl(String str) {
        return str.hashCode();
    }

    @NotNull
    /* renamed from: toJsonElement-impl, reason: not valid java name */
    public static JsonElement m390toJsonElementimpl(String str) {
        return JsonElementKt.b(str);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m391toStringimpl(String str) {
        return i.a(')', "JsonableString(value=", str);
    }

    public boolean equals(Object obj) {
        return m387equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m389hashCodeimpl(this.value);
    }

    @Override // me.oriient.internal.infra.serializerJson.Jsonable
    @NotNull
    public JsonElement toJsonElement() {
        return m390toJsonElementimpl(this.value);
    }

    public String toString() {
        return m391toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ String getValue() {
        return this.value;
    }
}
