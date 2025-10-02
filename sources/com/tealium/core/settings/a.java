package com.tealium.core.settings;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/settings/a;", "", "a", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class a {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/tealium/core/settings/a$a;", "", "", "ETAG_KEY", "Ljava/lang/String;", "REGEX_SCRIPT", "REGEX_TIME_AMOUNT", "REGEX_TIME_UNIT", "REGEX_VARS", "SUB_STRING_MPS", "SUB_STRING_SRC", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.tealium.core.settings.a$a, reason: collision with other inner class name */
    public static final class C0392a {
        /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int a(java.lang.String r4) throws java.lang.NumberFormatException {
            /*
                java.lang.String r0 = "time"
                kotlin.jvm.internal.Intrinsics.h(r4, r0)
                kotlin.text.Regex r0 = new kotlin.text.Regex
                java.lang.String r1 = "\\d+"
                r0.<init>(r1)
                r1 = 0
                kotlin.text.MatchResult r0 = r0.b(r1, r4)
                if (r0 == 0) goto L72
                kotlin.text.Regex r2 = new kotlin.text.Regex
                java.lang.String r3 = "[hmds]$"
                r2.<init>(r3)
                kotlin.text.MatchResult r4 = r2.b(r1, r4)
                if (r4 == 0) goto L72
                java.lang.String r0 = r0.getValue()
                int r0 = java.lang.Integer.parseInt(r0)
                java.lang.String r4 = r4.getValue()
                int r1 = r4.hashCode()
                r2 = 100
                if (r1 == r2) goto L5e
                r2 = 104(0x68, float:1.46E-43)
                if (r1 == r2) goto L52
                r2 = 109(0x6d, float:1.53E-43)
                if (r1 == r2) goto L4c
                r2 = 115(0x73, float:1.61E-43)
                if (r1 == r2) goto L41
                goto L66
            L41:
                java.lang.String r1 = "s"
                boolean r4 = r4.equals(r1)
                if (r4 != 0) goto L4a
                goto L66
            L4a:
                r4 = 1
                goto L6c
            L4c:
                java.lang.String r1 = "m"
                r4.equals(r1)
                goto L66
            L52:
                java.lang.String r1 = "h"
                boolean r4 = r4.equals(r1)
                if (r4 != 0) goto L5b
                goto L66
            L5b:
                r4 = 3600(0xe10, float:5.045E-42)
                goto L6c
            L5e:
                java.lang.String r1 = "d"
                boolean r4 = r4.equals(r1)
                if (r4 != 0) goto L69
            L66:
                r4 = 60
                goto L6c
            L69:
                r4 = 86400(0x15180, float:1.21072E-40)
            L6c:
                int r0 = r0 * r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
                goto L73
            L72:
                r4 = 0
            L73:
                if (r4 == 0) goto L7a
                int r4 = r4.intValue()
                return r4
            L7a:
                r4 = -1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tealium.core.settings.a.C0392a.a(java.lang.String):int");
        }
    }
}
