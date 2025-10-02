package me.oriient.internal.infra.rest;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lme/oriient/internal/infra/rest/HttpEncoding;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "GZIP", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HttpEncoding {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HttpEncoding[] $VALUES;
    public static final HttpEncoding GZIP = new HttpEncoding("GZIP", 0, "gzip");

    @NotNull
    private final String value;

    private static final /* synthetic */ HttpEncoding[] $values() {
        return new HttpEncoding[]{GZIP};
    }

    static {
        HttpEncoding[] httpEncodingArr$values = $values();
        $VALUES = httpEncodingArr$values;
        $ENTRIES = EnumEntriesKt.a(httpEncodingArr$values);
    }

    private HttpEncoding(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<HttpEncoding> getEntries() {
        return $ENTRIES;
    }

    public static HttpEncoding valueOf(String str) {
        return (HttpEncoding) Enum.valueOf(HttpEncoding.class, str);
    }

    public static HttpEncoding[] values() {
        return (HttpEncoding[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
