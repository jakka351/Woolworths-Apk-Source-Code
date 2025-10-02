package io.grpc.okhttp.internal.framed;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class HeadersMode {
    public static final /* synthetic */ HeadersMode[] d = {new HeadersMode("SPDY_SYN_STREAM", 0), new HeadersMode("SPDY_REPLY", 1), new HeadersMode("SPDY_HEADERS", 2), new HeadersMode("HTTP_20_HEADERS", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    HeadersMode EF5;

    public static HeadersMode valueOf(String str) {
        return (HeadersMode) Enum.valueOf(HeadersMode.class, str);
    }

    public static HeadersMode[] values() {
        return (HeadersMode[]) d.clone();
    }
}
