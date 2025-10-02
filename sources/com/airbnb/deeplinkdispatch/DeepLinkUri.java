package com.airbnb.deeplinkdispatch;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import okio.Buffer;

/* loaded from: classes4.dex */
public final class DeepLinkUri {
    public static final char[] f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern g = Pattern.compile("\\{(.*?)\\}");

    /* renamed from: a, reason: collision with root package name */
    public final String f13293a;
    public final String b;
    public final List c;
    public final List d;
    public final String e;

    /* renamed from: com.airbnb.deeplinkdispatch.DeepLinkUri$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13294a;

        static {
            int[] iArr = new int[Builder.ParseResult.values().length];
            f13294a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13294a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13294a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13294a[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13294a[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f13295a;
        public String d;
        public final ArrayList f;
        public ArrayList g;
        public String h;
        public String b = "";
        public String c = "";
        public int e = -1;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ParseResult {
            public static final ParseResult d;
            public static final ParseResult e;
            public static final ParseResult f;
            public static final ParseResult g;
            public static final /* synthetic */ ParseResult[] h;

            static {
                ParseResult parseResult = new ParseResult("SUCCESS", 0);
                d = parseResult;
                ParseResult parseResult2 = new ParseResult("MISSING_SCHEME", 1);
                e = parseResult2;
                ParseResult parseResult3 = new ParseResult("UNSUPPORTED_SCHEME", 2);
                ParseResult parseResult4 = new ParseResult("INVALID_PORT", 3);
                f = parseResult4;
                ParseResult parseResult5 = new ParseResult("INVALID_HOST", 4);
                g = parseResult5;
                h = new ParseResult[]{parseResult, parseResult2, parseResult3, parseResult4, parseResult5};
            }

            public static ParseResult valueOf(String str) {
                return (ParseResult) Enum.valueOf(ParseResult.class, str);
            }

            public static ParseResult[] values() {
                return (ParseResult[]) h.clone();
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x00a1, code lost:
        
            if ((r13 - r11) != 0) goto L55;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0105  */
        /* JADX WARN: Type inference failed for: r0v12, types: [java.net.InetAddress] */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v17 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.String a(int r16, int r17, java.lang.String r18) throws java.net.UnknownHostException {
            /*
                Method dump skipped, instructions count: 536
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.deeplinkdispatch.DeepLinkUri.Builder.a(int, int, java.lang.String):java.lang.String");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f13295a);
            sb.append("://");
            if (!this.b.isEmpty() || !this.c.isEmpty()) {
                sb.append(this.b);
                if (!this.c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            if (this.d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.d);
                sb.append(']');
            } else {
                sb.append(this.d);
            }
            int iC = this.e;
            if (iC == -1) {
                iC = DeepLinkUri.c(this.f13295a);
            }
            if (iC != DeepLinkUri.c(this.f13295a)) {
                sb.append(':');
                sb.append(iC);
            }
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append((String) arrayList.get(i));
            }
            if (this.g != null) {
                sb.append('?');
                ArrayList arrayList2 = this.g;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2 += 2) {
                    String str = (String) arrayList2.get(i2);
                    String str2 = (String) arrayList2.get(i2 + 1);
                    if (i2 > 0) {
                        sb.append('&');
                    }
                    sb.append(str);
                    if (str2 != null) {
                        sb.append('=');
                        sb.append(str2);
                    }
                }
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }
    }

    public DeepLinkUri(Builder builder) {
        this.f13293a = builder.f13295a;
        String str = builder.b;
        f(0, str.length(), str);
        String str2 = builder.c;
        f(0, str2.length(), str2);
        this.b = builder.d;
        if (builder.e == -1) {
            c(builder.f13295a);
        }
        this.c = g(builder.f);
        ArrayList arrayList = builder.g;
        this.d = arrayList != null ? g(arrayList) : null;
        String str3 = builder.h;
        if (str3 != null) {
            f(0, str3.length(), str3);
        }
        this.e = builder.toString();
    }

    public static String a(String str, int i, int i2, String str2, boolean z, boolean z2) {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || str2.indexOf(iCodePointAt) != -1 || ((iCodePointAt == 37 && !z) || (z2 && iCodePointAt == 43))) {
                Buffer buffer = new Buffer();
                buffer.r0(i, iCharCount, str);
                Buffer buffer2 = null;
                while (iCharCount < i2) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (z2 && iCodePointAt2 == 43) {
                            buffer.t0(z ? "%20" : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 >= 127 || str2.indexOf(iCodePointAt2) != -1 || (iCodePointAt2 == 37 && !z)) {
                            if (buffer2 == null) {
                                buffer2 = new Buffer();
                            }
                            buffer2.z0(iCodePointAt2);
                            while (!buffer2.X1()) {
                                try {
                                    byte b = buffer2.readByte();
                                    buffer.Y(37);
                                    char[] cArr = f;
                                    buffer.Y(cArr[((b & 255) >> 4) & 15]);
                                    buffer.Y(cArr[b & 15]);
                                } catch (EOFException unused) {
                                    System.err.println("Unable to canonicalize deeplink url!");
                                }
                            }
                        } else {
                            buffer.z0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return buffer.v();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i, i2);
    }

    public static int b(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    public static int c(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static int d(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.airbnb.deeplinkdispatch.DeepLinkUri e(java.lang.String r20, boolean r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 849
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.deeplinkdispatch.DeepLinkUri.e(java.lang.String, boolean):com.airbnb.deeplinkdispatch.DeepLinkUri");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String f(int r7, int r8, java.lang.String r9) {
        /*
            r0 = r7
        L1:
            if (r0 >= r8) goto L4f
            char r1 = r9.charAt(r0)
            r2 = 37
            if (r1 != r2) goto L4c
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            r1.r0(r7, r0, r9)
        L13:
            if (r0 >= r8) goto L47
            int r7 = r9.codePointAt(r0)
            if (r7 != r2) goto L3e
            int r3 = r0 + 2
            if (r3 >= r8) goto L3e
            int r4 = r0 + 1
            char r4 = r9.charAt(r4)
            int r4 = b(r4)
            char r5 = r9.charAt(r3)
            int r5 = b(r5)
            r6 = -1
            if (r4 == r6) goto L3e
            if (r5 == r6) goto L3e
            int r0 = r4 << 4
            int r0 = r0 + r5
            r1.Y(r0)
            r0 = r3
            goto L41
        L3e:
            r1.z0(r7)
        L41:
            int r7 = java.lang.Character.charCount(r7)
            int r0 = r0 + r7
            goto L13
        L47:
            java.lang.String r7 = r1.v()
            return r7
        L4c:
            int r0 = r0 + 1
            goto L1
        L4f:
            java.lang.String r7 = r9.substring(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.deeplinkdispatch.DeepLinkUri.f(int, int, java.lang.String):java.lang.String");
    }

    public static List g(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            arrayList2.add(str != null ? f(0, str.length(), str) : null);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof DeepLinkUri) && ((DeepLinkUri) obj).e.equals(this.e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return this.e;
    }
}
