package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.LocalizedMessage;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/Charsets;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Charsets {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f24671a;
    public static final Charset b;
    public static final Charset c;
    public static final Charset d;
    public static volatile Charset e;
    public static volatile Charset f;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.g(charsetForName, "forName(...)");
        f24671a = charsetForName;
        Intrinsics.g(Charset.forName("UTF-16"), "forName(...)");
        Charset charsetForName2 = Charset.forName("UTF-16BE");
        Intrinsics.g(charsetForName2, "forName(...)");
        b = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16LE");
        Intrinsics.g(charsetForName3, "forName(...)");
        c = charsetForName3;
        Intrinsics.g(Charset.forName("US-ASCII"), "forName(...)");
        Charset charsetForName4 = Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
        Intrinsics.g(charsetForName4, "forName(...)");
        d = charsetForName4;
    }
}
