package androidx.compose.ui.autofill;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Deprecated
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/autofill/AutofillType;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AutofillType {
    public static final AutofillType A;
    public static final AutofillType B;
    public static final AutofillType C;
    public static final AutofillType D;
    public static final AutofillType E;
    public static final AutofillType F;
    public static final AutofillType G;
    public static final AutofillType H;
    public static final AutofillType I;
    public static final AutofillType J;
    public static final AutofillType K;
    public static final AutofillType L;
    public static final AutofillType M;
    public static final /* synthetic */ AutofillType[] N;
    public static final /* synthetic */ EnumEntries O;
    public static final AutofillType d;
    public static final AutofillType e;
    public static final AutofillType f;
    public static final AutofillType g;
    public static final AutofillType h;
    public static final AutofillType i;
    public static final AutofillType j;
    public static final AutofillType k;
    public static final AutofillType l;
    public static final AutofillType m;
    public static final AutofillType n;
    public static final AutofillType o;
    public static final AutofillType p;
    public static final AutofillType q;
    public static final AutofillType r;
    public static final AutofillType s;
    public static final AutofillType t;
    public static final AutofillType u;
    public static final AutofillType v;
    public static final AutofillType w;
    public static final AutofillType x;
    public static final AutofillType y;
    public static final AutofillType z;

    static {
        AutofillType autofillType = new AutofillType("EmailAddress", 0);
        d = autofillType;
        AutofillType autofillType2 = new AutofillType("Username", 1);
        e = autofillType2;
        AutofillType autofillType3 = new AutofillType("Password", 2);
        f = autofillType3;
        AutofillType autofillType4 = new AutofillType("NewUsername", 3);
        g = autofillType4;
        AutofillType autofillType5 = new AutofillType("NewPassword", 4);
        h = autofillType5;
        AutofillType autofillType6 = new AutofillType("PostalAddress", 5);
        i = autofillType6;
        AutofillType autofillType7 = new AutofillType("PostalCode", 6);
        j = autofillType7;
        AutofillType autofillType8 = new AutofillType("CreditCardNumber", 7);
        k = autofillType8;
        AutofillType autofillType9 = new AutofillType("CreditCardSecurityCode", 8);
        l = autofillType9;
        AutofillType autofillType10 = new AutofillType("CreditCardExpirationDate", 9);
        m = autofillType10;
        AutofillType autofillType11 = new AutofillType("CreditCardExpirationMonth", 10);
        n = autofillType11;
        AutofillType autofillType12 = new AutofillType("CreditCardExpirationYear", 11);
        o = autofillType12;
        AutofillType autofillType13 = new AutofillType("CreditCardExpirationDay", 12);
        p = autofillType13;
        AutofillType autofillType14 = new AutofillType("AddressCountry", 13);
        q = autofillType14;
        AutofillType autofillType15 = new AutofillType("AddressRegion", 14);
        r = autofillType15;
        AutofillType autofillType16 = new AutofillType("AddressLocality", 15);
        s = autofillType16;
        AutofillType autofillType17 = new AutofillType("AddressStreet", 16);
        t = autofillType17;
        AutofillType autofillType18 = new AutofillType("AddressAuxiliaryDetails", 17);
        u = autofillType18;
        AutofillType autofillType19 = new AutofillType("PostalCodeExtended", 18);
        v = autofillType19;
        AutofillType autofillType20 = new AutofillType("PersonFullName", 19);
        w = autofillType20;
        AutofillType autofillType21 = new AutofillType("PersonFirstName", 20);
        x = autofillType21;
        AutofillType autofillType22 = new AutofillType("PersonLastName", 21);
        y = autofillType22;
        AutofillType autofillType23 = new AutofillType("PersonMiddleName", 22);
        z = autofillType23;
        AutofillType autofillType24 = new AutofillType("PersonMiddleInitial", 23);
        A = autofillType24;
        AutofillType autofillType25 = new AutofillType("PersonNamePrefix", 24);
        B = autofillType25;
        AutofillType autofillType26 = new AutofillType("PersonNameSuffix", 25);
        C = autofillType26;
        AutofillType autofillType27 = new AutofillType("PhoneNumber", 26);
        D = autofillType27;
        AutofillType autofillType28 = new AutofillType("PhoneNumberDevice", 27);
        E = autofillType28;
        AutofillType autofillType29 = new AutofillType("PhoneCountryCode", 28);
        F = autofillType29;
        AutofillType autofillType30 = new AutofillType("PhoneNumberNational", 29);
        G = autofillType30;
        AutofillType autofillType31 = new AutofillType("Gender", 30);
        H = autofillType31;
        AutofillType autofillType32 = new AutofillType("BirthDateFull", 31);
        I = autofillType32;
        AutofillType autofillType33 = new AutofillType("BirthDateDay", 32);
        J = autofillType33;
        AutofillType autofillType34 = new AutofillType("BirthDateMonth", 33);
        K = autofillType34;
        AutofillType autofillType35 = new AutofillType("BirthDateYear", 34);
        L = autofillType35;
        AutofillType autofillType36 = new AutofillType("SmsOtpCode", 35);
        M = autofillType36;
        AutofillType[] autofillTypeArr = {autofillType, autofillType2, autofillType3, autofillType4, autofillType5, autofillType6, autofillType7, autofillType8, autofillType9, autofillType10, autofillType11, autofillType12, autofillType13, autofillType14, autofillType15, autofillType16, autofillType17, autofillType18, autofillType19, autofillType20, autofillType21, autofillType22, autofillType23, autofillType24, autofillType25, autofillType26, autofillType27, autofillType28, autofillType29, autofillType30, autofillType31, autofillType32, autofillType33, autofillType34, autofillType35, autofillType36};
        N = autofillTypeArr;
        O = EnumEntriesKt.a(autofillTypeArr);
    }

    public static AutofillType valueOf(String str) {
        return (AutofillType) Enum.valueOf(AutofillType.class, str);
    }

    public static AutofillType[] values() {
        return (AutofillType[]) N.clone();
    }
}
