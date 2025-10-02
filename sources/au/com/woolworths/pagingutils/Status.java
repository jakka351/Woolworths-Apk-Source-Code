package au.com.woolworths.pagingutils;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/pagingutils/Status;", "", "paging-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Status {
    public static final Status d;
    public static final Status e;
    public static final Status f;
    public static final /* synthetic */ Status[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        Status status = new Status("RUNNING", 0);
        d = status;
        Status status2 = new Status("SUCCESS", 1);
        e = status2;
        Status status3 = new Status("FAILED", 2);
        f = status3;
        Status[] statusArr = {status, status2, status3};
        g = statusArr;
        h = EnumEntriesKt.a(statusArr);
    }

    public static Status valueOf(String str) {
        return (Status) Enum.valueOf(Status.class, str);
    }

    public static Status[] values() {
        return (Status[]) g.clone();
    }
}
