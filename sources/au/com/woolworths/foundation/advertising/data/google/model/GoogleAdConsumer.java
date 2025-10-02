package au.com.woolworths.foundation.advertising.data.google.model;

import com.salesforce.marketingcloud.messages.iam.j;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/advertising/data/google/model/GoogleAdConsumer;", "", "advertising-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GoogleAdConsumer {
    public static final GoogleAdConsumer e;
    public static final GoogleAdConsumer f;
    public static final GoogleAdConsumer g;
    public static final GoogleAdConsumer h;
    public static final GoogleAdConsumer i;
    public static final GoogleAdConsumer j;
    public static final /* synthetic */ GoogleAdConsumer[] k;
    public static final /* synthetic */ EnumEntries l;
    public final String d;

    static {
        GoogleAdConsumer googleAdConsumer = new GoogleAdConsumer("PRODUCT_LIST", 0, "product_list");
        e = googleAdConsumer;
        GoogleAdConsumer googleAdConsumer2 = new GoogleAdConsumer("RECIPE", 1, "recipe");
        f = googleAdConsumer2;
        GoogleAdConsumer googleAdConsumer3 = new GoogleAdConsumer("HOME_PAGE", 2, "home_page");
        g = googleAdConsumer3;
        GoogleAdConsumer googleAdConsumer4 = new GoogleAdConsumer("ORDER_CONFIRMATION", 3, "order_confirmation");
        h = googleAdConsumer4;
        GoogleAdConsumer googleAdConsumer5 = new GoogleAdConsumer("CONTENT_PAGE", 4, "content_page");
        i = googleAdConsumer5;
        GoogleAdConsumer googleAdConsumer6 = new GoogleAdConsumer("UNKNOWN", 5, j.h);
        j = googleAdConsumer6;
        GoogleAdConsumer[] googleAdConsumerArr = {googleAdConsumer, googleAdConsumer2, googleAdConsumer3, googleAdConsumer4, googleAdConsumer5, googleAdConsumer6};
        k = googleAdConsumerArr;
        l = EnumEntriesKt.a(googleAdConsumerArr);
    }

    public GoogleAdConsumer(String str, int i2, String str2) {
        this.d = str2;
    }

    public static GoogleAdConsumer valueOf(String str) {
        return (GoogleAdConsumer) Enum.valueOf(GoogleAdConsumer.class, str);
    }

    public static GoogleAdConsumer[] values() {
        return (GoogleAdConsumer[]) k.clone();
    }
}
