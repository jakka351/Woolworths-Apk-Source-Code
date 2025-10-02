package au.com.woolworths.shop.digipay.models;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/digipay/models/CreditCardType;", "", "Companion", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CreditCardType {
    public static final Companion e;
    public static final LinkedHashMap f;
    public static final CreditCardType g;
    public static final CreditCardType h;
    public static final CreditCardType i;
    public static final CreditCardType j;
    public static final CreditCardType k;
    public static final /* synthetic */ CreditCardType[] l;
    public static final /* synthetic */ EnumEntries m;
    public final String d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/shop/digipay/models/CreditCardType$Companion;", "", "", "", "Lau/com/woolworths/shop/digipay/models/CreditCardType;", "valueMap", "Ljava/util/Map;", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        CreditCardType creditCardType = new CreditCardType("VISA", 0, "visa");
        g = creditCardType;
        CreditCardType creditCardType2 = new CreditCardType("MASTERCARD", 1, "mastercard");
        h = creditCardType2;
        CreditCardType creditCardType3 = new CreditCardType("DINERS", 2, "diners");
        i = creditCardType3;
        CreditCardType creditCardType4 = new CreditCardType("JCB", 3, "jcb");
        j = creditCardType4;
        CreditCardType creditCardType5 = new CreditCardType("AMEX", 4, "amex");
        k = creditCardType5;
        CreditCardType[] creditCardTypeArr = {creditCardType, creditCardType2, creditCardType3, creditCardType4, creditCardType5};
        l = creditCardTypeArr;
        EnumEntries enumEntriesA = EnumEntriesKt.a(creditCardTypeArr);
        m = enumEntriesA;
        e = new Companion();
        int iH = MapsKt.h(CollectionsKt.s(enumEntriesA, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
        Iterator it = ((AbstractList) enumEntriesA).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((CreditCardType) next).d, next);
        }
        f = linkedHashMap;
    }

    public CreditCardType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static CreditCardType valueOf(String str) {
        return (CreditCardType) Enum.valueOf(CreditCardType.class, str);
    }

    public static CreditCardType[] values() {
        return (CreditCardType[]) l.clone();
    }
}
