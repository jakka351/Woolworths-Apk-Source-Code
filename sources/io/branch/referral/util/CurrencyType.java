package io.branch.referral.util;

import android.text.TextUtils;

/* loaded from: classes7.dex */
public enum CurrencyType {
    /* JADX INFO: Fake field, exist only in values array */
    AED("AED"),
    /* JADX INFO: Fake field, exist only in values array */
    AFN("AFN"),
    /* JADX INFO: Fake field, exist only in values array */
    ALL("ALL"),
    /* JADX INFO: Fake field, exist only in values array */
    AMD("AMD"),
    /* JADX INFO: Fake field, exist only in values array */
    ANG("ANG"),
    /* JADX INFO: Fake field, exist only in values array */
    AOA("AOA"),
    /* JADX INFO: Fake field, exist only in values array */
    ARS("ARS"),
    /* JADX INFO: Fake field, exist only in values array */
    AUD("AUD"),
    /* JADX INFO: Fake field, exist only in values array */
    AWG("AWG"),
    /* JADX INFO: Fake field, exist only in values array */
    AZN("AZN"),
    /* JADX INFO: Fake field, exist only in values array */
    BAM("BAM"),
    /* JADX INFO: Fake field, exist only in values array */
    BBD("BBD"),
    /* JADX INFO: Fake field, exist only in values array */
    BDT("BDT"),
    /* JADX INFO: Fake field, exist only in values array */
    BGN("BGN"),
    /* JADX INFO: Fake field, exist only in values array */
    BHD("BHD"),
    /* JADX INFO: Fake field, exist only in values array */
    BIF("BIF"),
    /* JADX INFO: Fake field, exist only in values array */
    BMD("BMD"),
    /* JADX INFO: Fake field, exist only in values array */
    BND("BND"),
    /* JADX INFO: Fake field, exist only in values array */
    BOB("BOB"),
    /* JADX INFO: Fake field, exist only in values array */
    BOV("BOV"),
    /* JADX INFO: Fake field, exist only in values array */
    BRL("BRL"),
    /* JADX INFO: Fake field, exist only in values array */
    BSD("BSD"),
    /* JADX INFO: Fake field, exist only in values array */
    BTN("BTN"),
    /* JADX INFO: Fake field, exist only in values array */
    BWP("BWP"),
    /* JADX INFO: Fake field, exist only in values array */
    BYN("BYN"),
    /* JADX INFO: Fake field, exist only in values array */
    BYR("BYR"),
    /* JADX INFO: Fake field, exist only in values array */
    BZD("BZD"),
    /* JADX INFO: Fake field, exist only in values array */
    CAD("CAD"),
    /* JADX INFO: Fake field, exist only in values array */
    CDF("CDF"),
    /* JADX INFO: Fake field, exist only in values array */
    CHE("CHE"),
    /* JADX INFO: Fake field, exist only in values array */
    CHF("CHF"),
    /* JADX INFO: Fake field, exist only in values array */
    CHW("CHW"),
    /* JADX INFO: Fake field, exist only in values array */
    CLF("CLF"),
    /* JADX INFO: Fake field, exist only in values array */
    CLP("CLP"),
    /* JADX INFO: Fake field, exist only in values array */
    CNY("CNY"),
    /* JADX INFO: Fake field, exist only in values array */
    COP("COP"),
    /* JADX INFO: Fake field, exist only in values array */
    COU("COU"),
    /* JADX INFO: Fake field, exist only in values array */
    CRC("CRC"),
    /* JADX INFO: Fake field, exist only in values array */
    CUC("CUC"),
    /* JADX INFO: Fake field, exist only in values array */
    CUP("CUP"),
    /* JADX INFO: Fake field, exist only in values array */
    CVE("CVE"),
    /* JADX INFO: Fake field, exist only in values array */
    CZK("CZK"),
    /* JADX INFO: Fake field, exist only in values array */
    DJF("DJF"),
    /* JADX INFO: Fake field, exist only in values array */
    DKK("DKK"),
    /* JADX INFO: Fake field, exist only in values array */
    DOP("DOP"),
    /* JADX INFO: Fake field, exist only in values array */
    DZD("DZD"),
    /* JADX INFO: Fake field, exist only in values array */
    EGP("EGP"),
    /* JADX INFO: Fake field, exist only in values array */
    ERN("ERN"),
    /* JADX INFO: Fake field, exist only in values array */
    ETB("ETB"),
    /* JADX INFO: Fake field, exist only in values array */
    EUR("EUR"),
    /* JADX INFO: Fake field, exist only in values array */
    FJD("FJD"),
    /* JADX INFO: Fake field, exist only in values array */
    FKP("FKP"),
    /* JADX INFO: Fake field, exist only in values array */
    GBP("GBP"),
    /* JADX INFO: Fake field, exist only in values array */
    GEL("GEL"),
    /* JADX INFO: Fake field, exist only in values array */
    GHS("GHS"),
    /* JADX INFO: Fake field, exist only in values array */
    GIP("GIP"),
    /* JADX INFO: Fake field, exist only in values array */
    GMD("GMD"),
    /* JADX INFO: Fake field, exist only in values array */
    GNF("GNF"),
    /* JADX INFO: Fake field, exist only in values array */
    GTQ("GTQ"),
    /* JADX INFO: Fake field, exist only in values array */
    GYD("GYD"),
    /* JADX INFO: Fake field, exist only in values array */
    HKD("HKD"),
    /* JADX INFO: Fake field, exist only in values array */
    HNL("HNL"),
    /* JADX INFO: Fake field, exist only in values array */
    HRK("HRK"),
    /* JADX INFO: Fake field, exist only in values array */
    HTG("HTG"),
    /* JADX INFO: Fake field, exist only in values array */
    HUF("HUF"),
    /* JADX INFO: Fake field, exist only in values array */
    IDR("IDR"),
    /* JADX INFO: Fake field, exist only in values array */
    ILS("ILS"),
    /* JADX INFO: Fake field, exist only in values array */
    INR("INR"),
    /* JADX INFO: Fake field, exist only in values array */
    IQD("IQD"),
    /* JADX INFO: Fake field, exist only in values array */
    IRR("IRR"),
    /* JADX INFO: Fake field, exist only in values array */
    ISK("ISK"),
    /* JADX INFO: Fake field, exist only in values array */
    JMD("JMD"),
    /* JADX INFO: Fake field, exist only in values array */
    JOD("JOD"),
    /* JADX INFO: Fake field, exist only in values array */
    JPY("JPY"),
    /* JADX INFO: Fake field, exist only in values array */
    KES("KES"),
    /* JADX INFO: Fake field, exist only in values array */
    KGS("KGS"),
    /* JADX INFO: Fake field, exist only in values array */
    KHR("KHR"),
    /* JADX INFO: Fake field, exist only in values array */
    KMF("KMF"),
    /* JADX INFO: Fake field, exist only in values array */
    KPW("KPW"),
    /* JADX INFO: Fake field, exist only in values array */
    KRW("KRW"),
    /* JADX INFO: Fake field, exist only in values array */
    KWD("KWD"),
    /* JADX INFO: Fake field, exist only in values array */
    KYD("KYD"),
    /* JADX INFO: Fake field, exist only in values array */
    KZT("KZT"),
    /* JADX INFO: Fake field, exist only in values array */
    LAK("LAK"),
    /* JADX INFO: Fake field, exist only in values array */
    LBP("LBP"),
    /* JADX INFO: Fake field, exist only in values array */
    LKR("LKR"),
    /* JADX INFO: Fake field, exist only in values array */
    LRD("LRD"),
    /* JADX INFO: Fake field, exist only in values array */
    LSL("LSL"),
    /* JADX INFO: Fake field, exist only in values array */
    LYD("LYD"),
    /* JADX INFO: Fake field, exist only in values array */
    MAD("MAD"),
    /* JADX INFO: Fake field, exist only in values array */
    MDL("MDL"),
    /* JADX INFO: Fake field, exist only in values array */
    MGA("MGA"),
    /* JADX INFO: Fake field, exist only in values array */
    MKD("MKD"),
    /* JADX INFO: Fake field, exist only in values array */
    MMK("MMK"),
    /* JADX INFO: Fake field, exist only in values array */
    MNT("MNT"),
    /* JADX INFO: Fake field, exist only in values array */
    MOP("MOP"),
    /* JADX INFO: Fake field, exist only in values array */
    MRO("MRO"),
    /* JADX INFO: Fake field, exist only in values array */
    MUR("MUR"),
    /* JADX INFO: Fake field, exist only in values array */
    MVR("MVR"),
    /* JADX INFO: Fake field, exist only in values array */
    MWK("MWK"),
    /* JADX INFO: Fake field, exist only in values array */
    MXN("MXN"),
    /* JADX INFO: Fake field, exist only in values array */
    MXV("MXV"),
    /* JADX INFO: Fake field, exist only in values array */
    MYR("MYR"),
    /* JADX INFO: Fake field, exist only in values array */
    MZN("MZN"),
    /* JADX INFO: Fake field, exist only in values array */
    NAD("NAD"),
    /* JADX INFO: Fake field, exist only in values array */
    NGN("NGN"),
    /* JADX INFO: Fake field, exist only in values array */
    NIO("NIO"),
    /* JADX INFO: Fake field, exist only in values array */
    NOK("NOK"),
    /* JADX INFO: Fake field, exist only in values array */
    NPR("NPR"),
    /* JADX INFO: Fake field, exist only in values array */
    NZD("NZD"),
    /* JADX INFO: Fake field, exist only in values array */
    OMR("OMR"),
    /* JADX INFO: Fake field, exist only in values array */
    PAB("PAB"),
    /* JADX INFO: Fake field, exist only in values array */
    PEN("PEN"),
    /* JADX INFO: Fake field, exist only in values array */
    PGK("PGK"),
    /* JADX INFO: Fake field, exist only in values array */
    PHP("PHP"),
    /* JADX INFO: Fake field, exist only in values array */
    PKR("PKR"),
    /* JADX INFO: Fake field, exist only in values array */
    PLN("PLN"),
    /* JADX INFO: Fake field, exist only in values array */
    PYG("PYG"),
    /* JADX INFO: Fake field, exist only in values array */
    QAR("QAR"),
    /* JADX INFO: Fake field, exist only in values array */
    RON("RON"),
    /* JADX INFO: Fake field, exist only in values array */
    RSD("RSD"),
    /* JADX INFO: Fake field, exist only in values array */
    RUB("RUB"),
    /* JADX INFO: Fake field, exist only in values array */
    RWF("RWF"),
    /* JADX INFO: Fake field, exist only in values array */
    SAR("SAR"),
    /* JADX INFO: Fake field, exist only in values array */
    SBD("SBD"),
    /* JADX INFO: Fake field, exist only in values array */
    SCR("SCR"),
    /* JADX INFO: Fake field, exist only in values array */
    SDG("SDG"),
    /* JADX INFO: Fake field, exist only in values array */
    SEK("SEK"),
    /* JADX INFO: Fake field, exist only in values array */
    SGD("SGD"),
    /* JADX INFO: Fake field, exist only in values array */
    SHP("SHP"),
    /* JADX INFO: Fake field, exist only in values array */
    SLL("SLL"),
    /* JADX INFO: Fake field, exist only in values array */
    SOS("SOS"),
    /* JADX INFO: Fake field, exist only in values array */
    SRD("SRD"),
    /* JADX INFO: Fake field, exist only in values array */
    SSP("SSP"),
    /* JADX INFO: Fake field, exist only in values array */
    STD("STD"),
    /* JADX INFO: Fake field, exist only in values array */
    SYP("SYP"),
    /* JADX INFO: Fake field, exist only in values array */
    SZL("SZL"),
    /* JADX INFO: Fake field, exist only in values array */
    THB("THB"),
    /* JADX INFO: Fake field, exist only in values array */
    TJS("TJS"),
    /* JADX INFO: Fake field, exist only in values array */
    TMT("TMT"),
    /* JADX INFO: Fake field, exist only in values array */
    TND("TND"),
    /* JADX INFO: Fake field, exist only in values array */
    TOP("TOP"),
    /* JADX INFO: Fake field, exist only in values array */
    TRY("TRY"),
    /* JADX INFO: Fake field, exist only in values array */
    TTD("TTD"),
    /* JADX INFO: Fake field, exist only in values array */
    TWD("TWD"),
    /* JADX INFO: Fake field, exist only in values array */
    TZS("TZS"),
    /* JADX INFO: Fake field, exist only in values array */
    UAH("UAH"),
    /* JADX INFO: Fake field, exist only in values array */
    UGX("UGX"),
    /* JADX INFO: Fake field, exist only in values array */
    USD("USD"),
    /* JADX INFO: Fake field, exist only in values array */
    USN("USN"),
    /* JADX INFO: Fake field, exist only in values array */
    UYI("UYI"),
    /* JADX INFO: Fake field, exist only in values array */
    UYU("UYU"),
    /* JADX INFO: Fake field, exist only in values array */
    UZS("UZS"),
    /* JADX INFO: Fake field, exist only in values array */
    VEF("VEF"),
    /* JADX INFO: Fake field, exist only in values array */
    VND("VND"),
    /* JADX INFO: Fake field, exist only in values array */
    VUV("VUV"),
    /* JADX INFO: Fake field, exist only in values array */
    WST("WST"),
    /* JADX INFO: Fake field, exist only in values array */
    XAF("XAF"),
    /* JADX INFO: Fake field, exist only in values array */
    XAG("XAG"),
    /* JADX INFO: Fake field, exist only in values array */
    XAU("XAU"),
    /* JADX INFO: Fake field, exist only in values array */
    XBA("XBA"),
    /* JADX INFO: Fake field, exist only in values array */
    XBB("XBB"),
    /* JADX INFO: Fake field, exist only in values array */
    XBC("XBC"),
    /* JADX INFO: Fake field, exist only in values array */
    XBD("XBD"),
    /* JADX INFO: Fake field, exist only in values array */
    XCD("XCD"),
    /* JADX INFO: Fake field, exist only in values array */
    XDR("XDR"),
    /* JADX INFO: Fake field, exist only in values array */
    XFU("XFU"),
    /* JADX INFO: Fake field, exist only in values array */
    XOF("XOF"),
    /* JADX INFO: Fake field, exist only in values array */
    XPD("XPD"),
    /* JADX INFO: Fake field, exist only in values array */
    XPF("XPF"),
    /* JADX INFO: Fake field, exist only in values array */
    XPT("XPT"),
    /* JADX INFO: Fake field, exist only in values array */
    XSU("XSU"),
    /* JADX INFO: Fake field, exist only in values array */
    XTS("XTS"),
    /* JADX INFO: Fake field, exist only in values array */
    XUA("XUA"),
    /* JADX INFO: Fake field, exist only in values array */
    XXX("XXX"),
    /* JADX INFO: Fake field, exist only in values array */
    YER("YER"),
    /* JADX INFO: Fake field, exist only in values array */
    ZAR("ZAR"),
    /* JADX INFO: Fake field, exist only in values array */
    ZMW("ZMW");

    public final String d;

    CurrencyType(String str) {
        this.d = str;
    }

    public static CurrencyType a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (CurrencyType currencyType : values()) {
            if (currencyType.d.equals(str)) {
                return currencyType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.d;
    }
}
