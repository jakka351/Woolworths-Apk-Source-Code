package okhttp3.internal.publicsuffix;

import io.jsonwebtoken.JwtParser;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.platform.Platform;
import okio.ByteString;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PublicSuffixDatabase {
    public static final Companion b = new Companion(0);
    public static final ByteString c;
    public static final List d;
    public static final PublicSuffixDatabase e;

    /* renamed from: a, reason: collision with root package name */
    public final AssetPublicSuffixList f26762a;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "<init>", "()V", "Lokio/ByteString;", "WILDCARD_LABEL", "Lokio/ByteString;", "", "", "PREVAILING_RULE", "Ljava/util/List;", "", "EXCEPTION_MARKER", "C", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static final String a(Companion companion, ByteString byteString, ByteString[] byteStringArr, int i) {
            int i2;
            boolean z;
            int i3;
            int i4;
            companion.getClass();
            int iC = byteString.c();
            int i5 = 0;
            while (i5 < iC) {
                int i6 = (i5 + iC) / 2;
                while (i6 > -1 && byteString.m(i6) != 10) {
                    i6--;
                }
                int i7 = i6 + 1;
                int i8 = 1;
                while (true) {
                    i2 = i7 + i8;
                    if (byteString.m(i2) == 10) {
                        break;
                    }
                    i8++;
                }
                int i9 = i2 - i7;
                int i10 = i;
                boolean z2 = false;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (z2) {
                        i3 = 46;
                        z = false;
                    } else {
                        byte bM = byteStringArr[i10].m(i11);
                        byte[] bArr = _UtilCommonKt.f26698a;
                        int i13 = bM & 255;
                        z = z2;
                        i3 = i13;
                    }
                    byte bM2 = byteString.m(i7 + i12);
                    byte[] bArr2 = _UtilCommonKt.f26698a;
                    i4 = i3 - (bM2 & 255);
                    if (i4 != 0) {
                        break;
                    }
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    }
                    if (byteStringArr[i10].c() != i11) {
                        z2 = z;
                    } else {
                        if (i10 == byteStringArr.length - 1) {
                            break;
                        }
                        i10++;
                        i11 = -1;
                        z2 = true;
                    }
                }
                if (i4 >= 0) {
                    if (i4 <= 0) {
                        int i14 = i9 - i12;
                        int iC2 = byteStringArr[i10].c() - i11;
                        int length = byteStringArr.length;
                        for (int i15 = i10 + 1; i15 < length; i15++) {
                            iC2 += byteStringArr[i15].c();
                        }
                        if (iC2 >= i14) {
                            if (iC2 <= i14) {
                                return byteString.t(i7, i9 + i7).s(Charsets.f24671a);
                            }
                        }
                    }
                    i5 = i2 + 1;
                }
                iC = i6;
            }
            return null;
        }

        private Companion() {
        }
    }

    static {
        ByteString byteString = ByteString.g;
        c = ByteString.Companion.c(42);
        d = CollectionsKt.Q("*");
        Intrinsics.h(PublicSuffixList.f26763a, "<this>");
        e = new PublicSuffixDatabase(new AssetPublicSuffixList(0));
    }

    public PublicSuffixDatabase(AssetPublicSuffixList assetPublicSuffixList) {
        this.f26762a = assetPublicSuffixList;
    }

    public static List b(String str) {
        List listU = StringsKt.U(str, new char[]{JwtParser.SEPARATOR_CHAR});
        return Intrinsics.c(CollectionsKt.O(listU), "") ? CollectionsKt.y(listU) : listU;
    }

    public final String a(String str) throws InterruptedException {
        String strA;
        String strA2;
        String strA3;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        Intrinsics.e(unicode);
        List listB = b(unicode);
        List listU = EmptyList.d;
        Companion companion = b;
        AssetPublicSuffixList assetPublicSuffixList = this.f26762a;
        if (assetPublicSuffixList.b.get() || !assetPublicSuffixList.b.compareAndSet(false, true)) {
            try {
                assetPublicSuffixList.c.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        try {
                            assetPublicSuffixList.c();
                            break;
                        } catch (InterruptedIOException unused2) {
                            Thread.interrupted();
                            z = true;
                        }
                    } catch (IOException e2) {
                        Platform.f26752a.getClass();
                        Platform.b.h(5, "Failed to read public suffix list", e2);
                        if (z) {
                        }
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (assetPublicSuffixList.d == null) {
            throw new IllegalStateException(("Unable to load " + ((Object) assetPublicSuffixList.f) + " resource.").toString());
        }
        int size3 = listB.size();
        ByteString[] byteStringArr = new ByteString[size3];
        for (int i = 0; i < size3; i++) {
            ByteString byteString = ByteString.g;
            byteStringArr[i] = ByteString.Companion.b((String) listB.get(i));
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                strA = null;
                break;
            }
            strA = Companion.a(companion, assetPublicSuffixList.a(), byteStringArr, i2);
            if (strA != null) {
                break;
            }
            i2++;
        }
        if (size3 > 1) {
            ByteString[] byteStringArr2 = (ByteString[]) byteStringArr.clone();
            int length = byteStringArr2.length - 1;
            for (int i3 = 0; i3 < length; i3++) {
                byteStringArr2[i3] = c;
                strA2 = Companion.a(companion, assetPublicSuffixList.a(), byteStringArr2, i3);
                if (strA2 != null) {
                    break;
                }
            }
            strA2 = null;
        } else {
            strA2 = null;
        }
        if (strA2 != null) {
            int i4 = size3 - 1;
            for (int i5 = 0; i5 < i4; i5++) {
                ByteString byteString2 = assetPublicSuffixList.e;
                if (byteString2 == null) {
                    Intrinsics.p("exceptionBytes");
                    throw null;
                }
                strA3 = Companion.a(companion, byteString2, byteStringArr, i5);
                if (strA3 != null) {
                    break;
                }
            }
            strA3 = null;
        } else {
            strA3 = null;
        }
        if (strA3 != null) {
            listU = StringsKt.U("!".concat(strA3), new char[]{JwtParser.SEPARATOR_CHAR});
        } else if (strA == null && strA2 == null) {
            listU = d;
        } else {
            List listU2 = strA != null ? StringsKt.U(strA, new char[]{JwtParser.SEPARATOR_CHAR}) : listU;
            if (strA2 != null) {
                listU = StringsKt.U(strA2, new char[]{JwtParser.SEPARATOR_CHAR});
            }
            if (listU2.size() > listU.size()) {
                listU = listU2;
            }
        }
        if (listB.size() == listU.size() && ((String) listU.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listU.get(0)).charAt(0) == '!') {
            size = listB.size();
            size2 = listU.size();
        } else {
            size = listB.size();
            size2 = listU.size() + 1;
        }
        return SequencesKt.p(SequencesKt.e(CollectionsKt.n(b(str)), size - size2), ".", null, 62);
    }
}
