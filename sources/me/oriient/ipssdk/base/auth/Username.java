package me.oriient.ipssdk.base.auth;

import androidx.annotation.Keep;
import androidx.compose.ui.platform.i;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0013"}, d2 = {"Lme/oriient/ipssdk/base/auth/Username;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class Username {

    @NotNull
    private final String value;

    private /* synthetic */ Username(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Username m427boximpl(String str) {
        return new Username(str);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m428constructorimpl(@NotNull String value) {
        Intrinsics.h(value, "value");
        return value;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m429equalsimpl(String str, Object obj) {
        return (obj instanceof Username) && Intrinsics.c(str, ((Username) obj).m433unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m430equalsimpl0(String str, String str2) {
        return Intrinsics.c(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m431hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m432toStringimpl(String str) {
        return i.a(')', "Username(value=", str);
    }

    public boolean equals(Object obj) {
        return m429equalsimpl(this.value, obj);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m431hashCodeimpl(this.value);
    }

    public String toString() {
        return m432toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m433unboximpl() {
        return this.value;
    }
}
