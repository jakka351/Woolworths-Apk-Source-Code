package au.com.woolworths.android.onesite.network;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/network/GraphQlErrorCode;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GraphQlErrorCode {
    public static final GraphQlErrorCode e;
    public static final GraphQlErrorCode f;
    public static final GraphQlErrorCode g;
    public static final GraphQlErrorCode h;
    public static final /* synthetic */ GraphQlErrorCode[] i;
    public static final /* synthetic */ EnumEntries j;
    public final String d;

    static {
        GraphQlErrorCode graphQlErrorCode = new GraphQlErrorCode("INTERNAL_SERVER_ERROR", 0, "INTERNAL_SERVER_ERROR");
        e = graphQlErrorCode;
        GraphQlErrorCode graphQlErrorCode2 = new GraphQlErrorCode("NOT_FOUND", 1, "NOT_FOUND");
        f = graphQlErrorCode2;
        GraphQlErrorCode graphQlErrorCode3 = new GraphQlErrorCode("RESOURCE_GONE", 2, "RESOURCE_GONE");
        g = graphQlErrorCode3;
        GraphQlErrorCode graphQlErrorCode4 = new GraphQlErrorCode("FORBIDDEN", 3, "FORBIDDEN");
        h = graphQlErrorCode4;
        GraphQlErrorCode[] graphQlErrorCodeArr = {graphQlErrorCode, graphQlErrorCode2, graphQlErrorCode3, graphQlErrorCode4};
        i = graphQlErrorCodeArr;
        j = EnumEntriesKt.a(graphQlErrorCodeArr);
    }

    public GraphQlErrorCode(String str, int i2, String str2) {
        this.d = str2;
    }

    public static GraphQlErrorCode valueOf(String str) {
        return (GraphQlErrorCode) Enum.valueOf(GraphQlErrorCode.class, str);
    }

    public static GraphQlErrorCode[] values() {
        return (GraphQlErrorCode[]) i.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }
}
