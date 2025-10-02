package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/EverydayExtraPageName;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EverydayExtraPageName {
    public static final Companion e;
    public static final EverydayExtraPageName f;
    public static final EverydayExtraPageName g;
    public static final EverydayExtraPageName h;
    public static final /* synthetic */ EverydayExtraPageName[] i;
    public static final /* synthetic */ EnumEntries j;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/EverydayExtraPageName$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        EverydayExtraPageName everydayExtraPageName = new EverydayExtraPageName("SUMMARY", 0, "SUMMARY");
        f = everydayExtraPageName;
        EverydayExtraPageName everydayExtraPageName2 = new EverydayExtraPageName("CHOOSEPLAN", 1, "CHOOSEPLAN");
        g = everydayExtraPageName2;
        EverydayExtraPageName everydayExtraPageName3 = new EverydayExtraPageName("UNKNOWN__", 2, "UNKNOWN__");
        h = everydayExtraPageName3;
        EverydayExtraPageName[] everydayExtraPageNameArr = {everydayExtraPageName, everydayExtraPageName2, everydayExtraPageName3};
        i = everydayExtraPageNameArr;
        j = EnumEntriesKt.a(everydayExtraPageNameArr);
        e = new Companion();
        CollectionsKt.R("SUMMARY", "CHOOSEPLAN");
    }

    public EverydayExtraPageName(String str, int i2, String str2) {
        this.d = str2;
    }

    public static EverydayExtraPageName valueOf(String str) {
        return (EverydayExtraPageName) Enum.valueOf(EverydayExtraPageName.class, str);
    }

    public static EverydayExtraPageName[] values() {
        return (EverydayExtraPageName[]) i.clone();
    }
}
