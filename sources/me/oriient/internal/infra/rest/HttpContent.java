package me.oriient.internal.infra.rest;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lme/oriient/internal/infra/rest/HttpContent;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CONTENT_APPLICATION_JSON", "CONTENT_APPLICATION_JSON_UTF8", "CONTENT_OCTET_STREAM", "CONTENT_NONE", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HttpContent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HttpContent[] $VALUES;

    @NotNull
    private final String value;
    public static final HttpContent CONTENT_APPLICATION_JSON = new HttpContent("CONTENT_APPLICATION_JSON", 0, "application/json");
    public static final HttpContent CONTENT_APPLICATION_JSON_UTF8 = new HttpContent("CONTENT_APPLICATION_JSON_UTF8", 1, "application/json; charset=utf-8");
    public static final HttpContent CONTENT_OCTET_STREAM = new HttpContent("CONTENT_OCTET_STREAM", 2, "application/octet-stream");
    public static final HttpContent CONTENT_NONE = new HttpContent("CONTENT_NONE", 3, "");

    private static final /* synthetic */ HttpContent[] $values() {
        return new HttpContent[]{CONTENT_APPLICATION_JSON, CONTENT_APPLICATION_JSON_UTF8, CONTENT_OCTET_STREAM, CONTENT_NONE};
    }

    static {
        HttpContent[] httpContentArr$values = $values();
        $VALUES = httpContentArr$values;
        $ENTRIES = EnumEntriesKt.a(httpContentArr$values);
    }

    private HttpContent(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<HttpContent> getEntries() {
        return $ENTRIES;
    }

    public static HttpContent valueOf(String str) {
        return (HttpContent) Enum.valueOf(HttpContent.class, str);
    }

    public static HttpContent[] values() {
        return (HttpContent[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
