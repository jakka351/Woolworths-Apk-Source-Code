package au.com.woolworths.android.onesite.network;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/network/AkamaiCustomStatusCode;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AkamaiCustomStatusCode {
    public static final AkamaiCustomStatusCode e;
    public static final AkamaiCustomStatusCode f;
    public static final AkamaiCustomStatusCode g;
    public static final AkamaiCustomStatusCode h;
    public static final AkamaiCustomStatusCode i;
    public static final /* synthetic */ AkamaiCustomStatusCode[] j;
    public static final /* synthetic */ EnumEntries k;
    public final int d;

    static {
        AkamaiCustomStatusCode akamaiCustomStatusCode = new AkamaiCustomStatusCode("RATE_LIMITING", 0, 460);
        e = akamaiCustomStatusCode;
        AkamaiCustomStatusCode akamaiCustomStatusCode2 = new AkamaiCustomStatusCode("BAD_IP_REPUTATION", 1, 461);
        f = akamaiCustomStatusCode2;
        AkamaiCustomStatusCode akamaiCustomStatusCode3 = new AkamaiCustomStatusCode("SCANNING_TOOLS_OR_WEB_ATTACKER", 2, 462);
        g = akamaiCustomStatusCode3;
        AkamaiCustomStatusCode akamaiCustomStatusCode4 = new AkamaiCustomStatusCode("BOTMAN_PROTECTION", 3, 463);
        h = akamaiCustomStatusCode4;
        AkamaiCustomStatusCode akamaiCustomStatusCode5 = new AkamaiCustomStatusCode("CUSTOM_RULES", 4, 464);
        i = akamaiCustomStatusCode5;
        AkamaiCustomStatusCode[] akamaiCustomStatusCodeArr = {akamaiCustomStatusCode, akamaiCustomStatusCode2, akamaiCustomStatusCode3, akamaiCustomStatusCode4, akamaiCustomStatusCode5};
        j = akamaiCustomStatusCodeArr;
        k = EnumEntriesKt.a(akamaiCustomStatusCodeArr);
    }

    public AkamaiCustomStatusCode(String str, int i2, int i3) {
        this.d = i3;
    }

    public static AkamaiCustomStatusCode valueOf(String str) {
        return (AkamaiCustomStatusCode) Enum.valueOf(AkamaiCustomStatusCode.class, str);
    }

    public static AkamaiCustomStatusCode[] values() {
        return (AkamaiCustomStatusCode[]) j.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getD() {
        return this.d;
    }
}
