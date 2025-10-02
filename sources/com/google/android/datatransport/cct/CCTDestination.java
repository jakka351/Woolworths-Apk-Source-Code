package com.google.android.datatransport.cct;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedDestination;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class CCTDestination implements EncodedDestination {
    public static final String c;
    public static final Set d;
    public static final CCTDestination e;
    public static final CCTDestination f;

    /* renamed from: a, reason: collision with root package name */
    public final String f14389a;
    public final String b;

    static {
        String strA = StringMerger.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = strA;
        String strA2 = StringMerger.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strA3 = StringMerger.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Encoding("proto"), new Encoding("json"))));
        e = new CCTDestination(strA, null);
        f = new CCTDestination(strA2, strA3);
    }

    public CCTDestination(String str, String str2) {
        this.f14389a = str;
        this.b = str2;
    }

    public static CCTDestination b(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new CCTDestination(str2, str3);
    }

    @Override // com.google.android.datatransport.runtime.EncodedDestination
    public final Set a() {
        return d;
    }

    @Override // com.google.android.datatransport.runtime.Destination
    public final byte[] getExtras() {
        String str = this.f14389a;
        String str2 = this.b;
        if (str2 == null && str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        return YU.a.i("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
    }
}
