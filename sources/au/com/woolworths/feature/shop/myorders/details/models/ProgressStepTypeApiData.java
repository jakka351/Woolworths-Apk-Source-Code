package au.com.woolworths.feature.shop.myorders.details.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/ProgressStepTypeApiData;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProgressStepTypeApiData {
    public static final ProgressStepTypeApiData d;
    public static final ProgressStepTypeApiData e;
    public static final ProgressStepTypeApiData f;
    public static final ProgressStepTypeApiData g;
    public static final ProgressStepTypeApiData h;
    public static final /* synthetic */ ProgressStepTypeApiData[] i;
    public static final /* synthetic */ EnumEntries j;

    static {
        ProgressStepTypeApiData progressStepTypeApiData = new ProgressStepTypeApiData("DONE", 0);
        d = progressStepTypeApiData;
        ProgressStepTypeApiData progressStepTypeApiData2 = new ProgressStepTypeApiData("LOAD", 1);
        e = progressStepTypeApiData2;
        ProgressStepTypeApiData progressStepTypeApiData3 = new ProgressStepTypeApiData("IN_PROGRESS", 2);
        f = progressStepTypeApiData3;
        ProgressStepTypeApiData progressStepTypeApiData4 = new ProgressStepTypeApiData("WARNING", 3);
        g = progressStepTypeApiData4;
        ProgressStepTypeApiData progressStepTypeApiData5 = new ProgressStepTypeApiData("EMPTY", 4);
        h = progressStepTypeApiData5;
        ProgressStepTypeApiData[] progressStepTypeApiDataArr = {progressStepTypeApiData, progressStepTypeApiData2, progressStepTypeApiData3, progressStepTypeApiData4, progressStepTypeApiData5};
        i = progressStepTypeApiDataArr;
        j = EnumEntriesKt.a(progressStepTypeApiDataArr);
    }

    public static ProgressStepTypeApiData valueOf(String str) {
        return (ProgressStepTypeApiData) Enum.valueOf(ProgressStepTypeApiData.class, str);
    }

    public static ProgressStepTypeApiData[] values() {
        return (ProgressStepTypeApiData[]) i.clone();
    }
}
